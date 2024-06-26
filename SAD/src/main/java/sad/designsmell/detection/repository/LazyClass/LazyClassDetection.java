/*******************************************************************************
 * Copyright (c) 2001-2014 Yann-Ga�l Gu�h�neuc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     Yann-Ga�l Gu�h�neuc and others, see in file; API and its implementation
 ******************************************************************************/
package sad.designsmell.detection.repository.LazyClass;

/**
 * This class implements the detection algorithms 
 * of the design smell LazyClass.
 * 
 * @author Autogenerated files
 * 
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import padl.kernel.IAbstractLevelModel;
import sad.codesmell.detection.repository.LazyClass.*;
import sad.kernel.ICodeSmell;
import sad.codesmell.detection.ICodeSmellDetection;
import sad.designsmell.detection.IDesignSmellDetection;
import sad.designsmell.detection.repository.AbstractDesignSmellDetection;
import sad.kernel.impl.DesignSmell;
import sad.util.OperatorsCodeSmells;
import sad.util.Relationships;
import util.io.Files;

public class LazyClassDetection extends AbstractDesignSmellDetection implements IDesignSmellDetection {
	private final OperatorsCodeSmells operators;
	private final Relationships relations;

	public LazyClassDetection() {
		super();

		this.operators = OperatorsCodeSmells.getInstance();
		this.relations = Relationships.getInstance();
	}
	
	public String getName() {
		return "LazyClass";
	}

	public String getRuleCardFile() {
		return "../SAD Rules Creator/src/main/resources/LazyClass.rules";
	}

	
public void detect(final IAbstractLevelModel anAbstractLevelModel) {
final Set candidateDesignSmells = new HashSet();

final ICodeSmellDetection csFewMethods = new FewMethodsDetection();
csFewMethods.detect(anAbstractLevelModel);
final Set setFewMethods = ((FewMethodsDetection) csFewMethods).getCodeSmells();

final ICodeSmellDetection csNotComplexClass = new NotComplexClassDetection();
csNotComplexClass.detect(anAbstractLevelModel);
final Set setNotComplexClass = ((NotComplexClassDetection) csNotComplexClass).getCodeSmells();

final Set setLazyClass = 
this.operators.intersection(setNotComplexClass,setFewMethods);

final Iterator iterSet = setLazyClass.iterator();
while(iterSet.hasNext()) {
final ICodeSmell aCodeSmell = (ICodeSmell) iterSet.next();
final DesignSmell designSmell = new DesignSmell(aCodeSmell);
designSmell.setName("LazyClass");
final String definition = "To defined";
designSmell.setDefinition(definition);
candidateDesignSmells.add(designSmell);
}
this.setSetOfDesignSmells(candidateDesignSmells);
}
}
