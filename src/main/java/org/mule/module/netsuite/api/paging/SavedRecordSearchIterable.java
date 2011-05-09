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

import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.SearchResult;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;
import com.netsuite.webservices.platform.messages_2010_2.SearchRequest;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang.UnhandledException;

public final class SavedRecordSearchIterable extends AbstractRecordSearchIterable
{

    private final SearchRecordType recordType;
    private final String savedSearchId;

    public SavedRecordSearchIterable(CxfPortProvider portProvider,
                                     SearchRecordType recordType,
                                     String searchId)
    {
        super(portProvider);
        this.recordType = recordType;
        this.savedSearchId = searchId;
    }

    @Override
    protected SearchResult doSearch() throws Exception
    {
        return getPortProvider().getAuthenticatedPort()
            .search(new SearchRequest(createAdvancedSearch()))
            .getSearchResult();
    }

    private SearchRecord createAdvancedSearch()
    {
        SearchRecord search = recordType.newAdvancedSearchInstance();
        try
        {
            PropertyUtils.setProperty(search, "savedSearchId", savedSearchId);
        }
        catch (Exception e)
        {
            throw new UnhandledException(e);
        }
        return search;
    }
}
