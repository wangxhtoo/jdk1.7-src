/*
 * Copyright (c) 2007, 2015, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Copyright 2003,2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sun.org.apache.xerces.internal.xs;

import java.util.List;

/**
 *  The <code>ShortList</code> is an immutable ordered collection of
 * <code>unsigned short</code>.
 */
public interface ShortList extends List {
    /**
     *  The number of <code>unsigned short</code>s in the list. The range of
     * valid child object indices is 0 to <code>length-1</code> inclusive.
     */
    public int getLength();

    /**
     *  Checks if the <code>unsigned short</code> <code>item</code> is a
     * member of this list.
     * @param item  <code>unsigned short</code> whose presence in this list
     *   is to be tested.
     * @return  True if this list contains the <code>unsigned short</code>
     *   <code>item</code>.
     */
    public boolean contains(short item);

    /**
     *  Returns the <code>index</code>th item in the collection. The index
     * starts at 0.
     * @param index  index into the collection.
     * @return  The <code>unsigned short</code> at the <code>index</code>th
     *   position in the <code>ShortList</code>.
     * @exception XSException
     *   INDEX_SIZE_ERR: if <code>index</code> is greater than or equal to the
     *   number of objects in the list.
     */
    public short item(int index)
                      throws XSException;

}
