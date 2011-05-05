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

import org.mule.module.netsuite.api.CxfPortProvider;
import org.mule.module.netsuite.api.NetSuiteGenericException;
import org.mule.module.netsuite.api.ResultStatuses;

import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.SearchResult;
import com.netsuite.webservices.platform.messages_2010_2.SearchMoreWithIdRequest;

import java.util.Iterator;

/**
 * @author flbulgarelli
 */
public abstract class AbstractRecordSearchIterable extends PaginatedIterable<Record, SearchResult>
{
    private final CxfPortProvider portProvider;

    public AbstractRecordSearchIterable(CxfPortProvider portProvider)
    {
        this.portProvider = portProvider;
    }

    public CxfPortProvider getPortProvider()
    {
        return portProvider;
    }

    protected SearchResult firstPage()
    {
        try
        {
            return ResultStatuses.checkStatus(doSearch());
        }
        catch (Exception e)
        {
            throw NetSuiteGenericException.soften(e);
        }
    }

    protected abstract SearchResult doSearch() throws Exception;

    @Override
    protected boolean hasNextPage(SearchResult result)
    {
        ResultStatuses.checkStatus(result);
        return result.getPageSize() != null && result.getPageIndex() != null
               && result.getTotalRecords() > result.getPageSize() * result.getPageIndex();
    }

    @Override
    protected SearchResult nextPage(SearchResult currentPage)
    {
        try
        {
            return getPortProvider().getAuthenticatedPort()
                .searchMoreWithId(
                    new SearchMoreWithIdRequest(currentPage.getSearchId(), currentPage.getPageIndex() + 1))
                .getSearchResult();
        }
        catch (Exception e)
        {
            throw NetSuiteGenericException.soften(e);
        }
    }

    @Override
    protected Iterator<Record> pageIterator(SearchResult page)
    {
        return page.getRecordList().getRecord().iterator();
    }
}
