/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package org.mule.module.netsuite.api.paging;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Warning: this class is not a proper collection, just it implements it in order to
 * be compatible with some mule's collection splitting
 * 
 * @author flbulgarelli
 */
public abstract class PaginatedIterable<T, Page> extends AbstractCollection<T> implements Iterable<T>
{

    public Iterator<T> iterator()
    {
        final Page initialPageInfo = firstPage();
        return new Iterator<T>()
        {
            private Page currentList = initialPageInfo;
            private Iterator<T> currentIter = pageIterator(initialPageInfo);

            public boolean hasNext()
            {
                updateIter();
                return currentIter.hasNext();
            }

            public T next()
            {
                updateIter();
                return currentIter.next();
            }

            public void remove()
            {
                throw new UnsupportedOperationException();
            }

            private void updateIter()
            {
                if (!currentIter.hasNext() && hasNextPage(currentList))
                {
                    currentList = nextPage(currentList);
                    currentIter = pageIterator(currentList);
                }
            }
        };
    }

    /**
     * Answers the first page of the paginated result
     */
    protected abstract Page firstPage();

    /**
     * Given a page, answers the next page
     * 
     * @param currentPage
     * @return the next page
     */
    protected abstract Page nextPage(Page currentPage);

    /**
     * Answers if the given page is not the last one
     * 
     * @param page
     * @return if current page is the last one or not
     */
    protected abstract boolean hasNextPage(Page page);

    /**
     * Answers an iterator for the current page
     * 
     * @param page
     * @return the givne page iterator
     */
    protected abstract Iterator<T> pageIterator(Page page);

    /**
     * Hack for enabling collection splitter to work, which forces evaluation of
     * whole iterable. This will not work with huge lists, but there is no better
     * solution
     */
    @Override
    public Object[] toArray()
    {
        LinkedList<Object> l = new LinkedList<Object>();
        for (Object o : this)
        {
            l.add(o);
        }
        return l.toArray();
    }

    @Override
    public int size()
    {
        throw new UnsupportedOperationException();
    }
}
