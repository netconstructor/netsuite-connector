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

import com.netsuite.webservices.platform.core_2010_2.SearchResult;
import com.netsuite.webservices.platform.messages_2010_2.AsyncSearchResult;
import com.netsuite.webservices.platform.messages_2010_2.GetAsyncResultRequest;

/**
 * @author flbulgarelli
 */
public final class RecordAsyncSearchIterable extends AbstractRecordSearchIterable
{

    private final String jobId;

    public RecordAsyncSearchIterable(CxfPortProvider portProvider, String jobId)
    {
        super(portProvider);
        this.jobId = jobId;
    }

    @Override
    protected SearchResult doSearch() throws Exception
    {
        return ((AsyncSearchResult) getPortProvider().getAuthenticatedPort().getAsyncResult(
            new GetAsyncResultRequest(jobId, 1)).getAsyncResult()).getSearchResult();
    }
}
