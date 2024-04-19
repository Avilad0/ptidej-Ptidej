package padl.kernel.impl;

import com.ibm.toad.cfparse.utils.Access;
import padl.kernel.*;
import padl.visitor.IGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PlantUMLVisitor implements IGenerator {
    private final String START_UML = "@startuml \n";
    private final String END_UML = "@enduml";
    private final String CLASS = "class ";
    private final String INTERFACE = "interface ";
    private final String ABSTRACT = "abstract ";
    private final String GHOST = " << Ghost Class >> ";

    private final String EXTENSION = " <|-- ";
    private final String COMPOSITION = " *-- ";
    private final String AGGREGATION = " o-- ";


    private final List<IFirstClassEntity> stackOfOpenClasses;
    private StringBuffer umlDescriptionBufferForClasses;
    private StringBuffer umlDescriptionBufferForInterfaces;
    private StringBuffer umlDescriptionBufferForGhosts;

    private StringBuffer umlDescriptionBufferForRelationships;

    public PlantUMLVisitor() {

        this.umlDescriptionBufferForInterfaces = new StringBuffer();
        this.umlDescriptionBufferForClasses = new StringBuffer();
        this.umlDescriptionBufferForGhosts = new StringBuffer();
        this.umlDescriptionBufferForRelationships = new StringBuffer();

        this.stackOfOpenClasses = new ArrayList<IFirstClassEntity>();
    }

    @Override
    public String getCode() {
        return START_UML
                + this.umlDescriptionBufferForInterfaces.toString()
                + this.umlDescriptionBufferForClasses.toString()
                + this.umlDescriptionBufferForGhosts.toString()
                + this.umlDescriptionBufferForRelationships.toString()
                + END_UML;
    }

    @Override
    public void open(IGhost aGhost) {
        this.stackOfOpenClasses.add(aGhost);
        this.umlDescriptionBufferForGhosts.append(CLASS)
                .append(aGhost.getDisplayName())
                .append(GHOST)
                .append("\n");
    }

    @Override
    public void open(IInterface anInterface) {
        this.stackOfOpenClasses.add(anInterface);
        this.umlDescriptionBufferForInterfaces.append(INTERFACE)
                .append(anInterface.getDisplayName())
                .append("\n");


        final Iterator inheritedEntities =
                anInterface.getIteratorOnInheritedEntities();
        while (inheritedEntities.hasNext()) {
            this.umlDescriptionBufferForRelationships.append(((IConstituent)inheritedEntities.next()).getDisplayName())
                    .append(EXTENSION)
                    .append(anInterface.getDisplayName())
                    .append("\n");
        }
    }

    @Override
    public void open(IClass aClass) {
        this.stackOfOpenClasses.add(aClass);

        if (Access.isAbstract(aClass.getVisibility())){
            this.umlDescriptionBufferForClasses.append(ABSTRACT);
        }

        this.umlDescriptionBufferForClasses.append(CLASS)
                .append(aClass.getDisplayName())
                .append("\n");

        final Iterator inheritedEntities =
                aClass.getIteratorOnInheritedEntities();
        while (inheritedEntities.hasNext()) {
            this.umlDescriptionBufferForRelationships.append(((IConstituent)inheritedEntities.next()).getDisplayName())
                    .append(EXTENSION)
                    .append(aClass.getDisplayName())
                    .append("\n");
        }

        final Iterator implementedEntities =
                aClass.getIteratorOnImplementedInterfaces();
        while (implementedEntities.hasNext()) {
            this.umlDescriptionBufferForRelationships.append(((IConstituent)implementedEntities.next()).getDisplayName())
                    .append(EXTENSION)
                    .append(aClass.getDisplayName())
                    .append("\n");
        }

    }

    @Override
    public void close(IGhost aGhost) {
        this.stackOfOpenClasses.remove(this.stackOfOpenClasses.size()-1);
    }

    @Override
    public void close(IInterface anInterface) {
        this.stackOfOpenClasses.remove(this.stackOfOpenClasses.size()-1);
    }

    @Override
    public void close(IClass aClass) {
        this.stackOfOpenClasses.remove(this.stackOfOpenClasses.size()-1);
    }

    private void visitRelationship(IRelationship relationship, String linkSymbol){
        this.umlDescriptionBufferForRelationships.append(this.stackOfOpenClasses.get(this.stackOfOpenClasses.size()-1).getDisplayName())
                .append(linkSymbol)
                .append(relationship.getTargetEntity().getDisplayName())
                .append("\n");
    }

    @Override
    public void visit(IAggregation anAggregation) {
        visitRelationship(anAggregation, AGGREGATION);
    }

    @Override
    public void visit(IComposition aComposition) {
        visitRelationship(aComposition, COMPOSITION);
    }

    @Override
    public void visit(IAssociation anAssociation) {
    }


    @Override
    public void close(IAbstractModel anAbstractModel) {
    }

    @Override
    public void close(IConstructor aConstructor) {

    }

    @Override
    public void close(IDelegatingMethod aDelegatingMethod) {

    }

    @Override
    public void close(IGetter aGetter) {

    }

    @Override
    public void close(IMemberClass aMemberClass) {

    }

    @Override
    public void close(IMemberGhost aMemberGhost) {

    }

    @Override
    public void close(IMemberInterface aMemberInterface) {

    }

    @Override
    public void close(IMethod aMethod) {

    }

    @Override
    public void close(IPackage aPackage) {

    }

    @Override
    public void close(IPackageDefault aPackage) {

    }

    @Override
    public void close(ISetter aSetter) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void open(IAbstractModel anAbstractModel) {
    }

    @Override
    public void open(IConstructor aConstructor) {

    }

    @Override
    public void open(IDelegatingMethod aDelegatingMethod) {

    }

    @Override
    public void open(IGetter aGetter) {

    }

    @Override
    public void open(IMemberClass aMemberClass) {

    }

    @Override
    public void open(IMemberGhost aMemberGhost) {

    }

    @Override
    public void open(IMemberInterface aMemberInterface) {

    }

    @Override
    public void open(IMethod aMethod) {

    }

    @Override
    public void open(IPackage aPackage) {

    }

    @Override
    public void open(IPackageDefault aPackage) {

    }

    @Override
    public void open(ISetter aSetter) {

    }

    @Override
    public void reset() {

    }

    @Override
    public void unknownConstituentHandler(String aCalledMethodName, IConstituent aConstituent) {

    }

    @Override
    public void visit(IContainerAggregation aContainerAggregation) {
    }

    @Override
    public void visit(IContainerComposition aContainerComposition) {
    }

    @Override
    public void visit(ICreation aCreation) {
    }

    @Override
    public void visit(IField aField) {
    }

    @Override
    public void visit(IMethodInvocation aMethodInvocation) {
    }

    @Override
    public void visit(IParameter aParameter) {
    }

    @Override
    public void visit(IPrimitiveEntity aPrimitiveEntity) {

    }

    @Override
    public void visit(IUseRelationship aUse) {
    }
}

