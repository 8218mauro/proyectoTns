/*
 Copyright (C) 2002-2004 MySQL AB

 This program is free software; you can redistribute it and/or modify
 it under the terms of version 2 of the GNU General Public License as
 published by the Free Software Foundation.
 

 There are special exceptions to the terms and conditions of the GPL 
 as it is applied to this software. View the full text of the 
 exception exception in file EXCEPTIONS-CONNECTOR-J in the directory of this 
 software distribution.
 
 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA

 */
package com.mysql.jdbc;


/**
 * Assertions for empty code paths that should never be
 * executed.
 *
 * @author Mark Matthews
 *
 * @version $Id: AssertionFailedException.java,v 1.1.2.5 2004/08/09 22:15:11 mmatthew Exp $
 */
public class AssertionFailedException extends RuntimeException {
    /**
     * Creates an AssertionFailedException for the given exception
     * that should never have been thrown.
     *
     * @param ex the exception that should never have been thrown.
     */
    public AssertionFailedException(Exception ex) {
        super("ASSERT FAILS: Exception " + ex.toString()
            + " that should not be thrown, was thrown");
    }

    /**
     * Convenience method.
     *
     * @param ex the exception that should never have been thrown.
     * @throws AssertionFailedException for the exception ex.
     */
    public static void shouldNotHappen(Exception ex)
        throws AssertionFailedException {
        throw new AssertionFailedException(ex);
    }
}
