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
package ptidej.example.composite2.corrected;

public class Main {
	public static void main(final String[] args) {
		final Document document = new Document();
		document.addElement(new Title());
		document.addElement(new Paragraph());
		document.addElement(new Title());
		document.addElement(new ParaIndent());
		document.addElement(new ParaIndent());

		document.printAll();
	}
}