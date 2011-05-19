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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class PaginatedIterable<T, Page> extends AbstractCollection<T> implements Iterable<T>
{
    private static Logger logger = LoggerFactory.getLogger(PaginatedIterable.class);

    @Override
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
        warnEagerMessage("toArray");
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
        warnEagerMessage("size");
        int i = 0;
        for (@SuppressWarnings("unused")
        Object o : this)
        {
            i++;
        }
        return i;
    }
    
    /**
     * Same impl that those found in Object, in order to avoid eager elements consumption
     */
    @Override
    public String toString()
    {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    /**
     * Warns that sending the given message implied processing all the elements, which is not efficient at all, 
     * and most times is a bad idea, as lazy iterables should be traversed only once and in a lazy manner. 
     * @param message
     */
    private static void warnEagerMessage(String message)
    {
        if (logger.isWarnEnabled())
        {
            logger.warn(
                "Method {} needs to consume all the element. It is inefficient and thus should be used with care",
                message);
        }
    }
}
