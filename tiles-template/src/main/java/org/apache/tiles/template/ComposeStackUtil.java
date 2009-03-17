/*
 * $Id$
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.tiles.template;

import java.util.Stack;

/**
 * Utilities to work with compose stacks.
 * 
 * @version $Rev$ $Date$
 * @since 2.2.0
 */
public class ComposeStackUtil {

    /**
     * Private constructor to avoid instantiation.
     */
    private ComposeStackUtil() {
        
    }

    /**
     * Finds the first ancestor in the stack, that is assignable to the given class.
     * 
     * @param composeStack The compose stack to evaluate.
     * @param clazz The class to check.
     * @return The first ancestor that is assignable to the class, or null if not found.
     * @since 2.2.0
     */
    public static Object findAncestorWithClass(Stack<Object> composeStack, Class<?> clazz) {
        Object retValue = null;
        for (int i = composeStack.size() - 1; i >= 0 && retValue == null; i--) {
            Object obj = composeStack.get(i);
            if (clazz.isAssignableFrom(obj.getClass())) {
                retValue = obj;
            }
        }
        
        return retValue;
    }
}
