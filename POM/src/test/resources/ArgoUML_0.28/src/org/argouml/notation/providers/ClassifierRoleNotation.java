// $Id: ClassifierRoleNotation.java 14492 2008-04-27 20:33:56Z mvw $
// Copyright (c) 2006-2008 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.notation.providers;

import java.beans.PropertyChangeListener;
import java.util.Collection;

import org.argouml.model.Model;
import org.argouml.notation.NotationProvider;

/**
 * This abstract class forms the basis of all Notation providers
 * for the text shown in the Fig that represents the ClassifierRole.
 * Subclass this for all languages.
 * 
 * @author Michiel
 */
public abstract class ClassifierRoleNotation extends NotationProvider {
    
    /**
     * The Constructor. 
     *
     * @param classifierRole the UML element
     */
    public ClassifierRoleNotation(Object classifierRole) {
        if (!Model.getFacade().isAClassifierRole(classifierRole)) {
            throw new IllegalArgumentException("This is not a ClassifierRole.");
        }
    }

    @Override
    public void initialiseListener(PropertyChangeListener listener, 
            Object modelElement) {
        super.initialiseListener(listener, modelElement);
        Collection classifiers = Model.getFacade().getBases(modelElement);
        for (Object c : classifiers) {
            addElementListener(listener, c, "name");
        }
    }

}