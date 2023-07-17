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
package ptidej.example.composite6.refactored;

public class Title extends Element {
	private static int titleNumber = 0;

	public Title(final String aText) {
		super(aText);
	}
	public void print() {
		System.out.print(Title.titleNumber++);
		System.out.print(": ");
		System.out.println(this.getText());
	}
}
