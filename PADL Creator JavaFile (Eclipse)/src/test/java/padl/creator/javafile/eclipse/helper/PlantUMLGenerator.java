package padl.creator.javafile.eclipse.helper;

import padl.analysis.UnsupportedSourceModelException;
import padl.analysis.repository.AACRelationshipsAnalysis;
import padl.creator.javafile.eclipse.CompleteJavaFileCreator;
import padl.kernel.ICodeLevelModel;
import padl.kernel.IIdiomLevelModel;
import padl.kernel.exception.CreationException;
import padl.kernel.impl.Factory;
import padl.kernel.impl.PlantUMLVisitor;
import java.io.FileWriter;
import java.io.IOException;

public class PlantUMLGenerator {
	public static void main(final String[] args) throws CreationException, UnsupportedSourceModelException, IOException {

		//provide source path of code which you want to generate the uml description for
		final String sourcePathEntry = "Z:\\MEng\\SEM1\\Software Design Methodologies\\Project\\Ptidej\\PADL\\src\\main\\java\\padl\\kernel";

		//provide below the file path where you want to store the output UML description
		final String umlOutputFilePath = "Z:\\MEng\\SEM1\\Software Design Methodologies\\Project\\UMLDescription.txt";


		final ICodeLevelModel padlModelFromJavaFiles = Factory.getInstance().createCodeLevelModel("");

		final String classPathEntry = "";
		padlModelFromJavaFiles.create(new CompleteJavaFileCreator(sourcePathEntry, classPathEntry));

		final AACRelationshipsAnalysis analysis = new AACRelationshipsAnalysis();

		final IIdiomLevelModel idiomLevelModel = (IIdiomLevelModel) analysis.invoke(padlModelFromJavaFiles);

		PlantUMLVisitor plantUMLVisitor = new PlantUMLVisitor();
		idiomLevelModel.generate(plantUMLVisitor);
		String plantUMLDescription = plantUMLVisitor.getCode();

		System.out.println(plantUMLDescription);

		try(FileWriter fw = new FileWriter(umlOutputFilePath,false )){
			fw.write(plantUMLDescription);
		}
	}
}
