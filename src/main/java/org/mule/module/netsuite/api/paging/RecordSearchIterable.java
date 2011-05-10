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
import org.mule.module.netsuite.api.model.expression.filter.FilterExpressionParser;

import com.netsuite.webservices.platform.core_2010_2.SearchResult;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;
import com.netsuite.webservices.platform.messages_2010_2.SearchRequest;

public final class RecordSearchIterable extends AbstractRecordSearchIterable
{

    private final SearchRecordType recordType;
    private final String expression;

    public RecordSearchIterable(CxfPortProvider portProvider, SearchRecordType recordType, String expression)
    {
        super(portProvider);
        this.recordType = recordType;
        this.expression = expression;
    }

    @Override
    protected SearchResult doSearch() throws Exception
    {
        return getPortProvider().getAuthenticatedPort().search(
            new SearchRequest(FilterExpressionParser.parse(recordType, expression))).getSearchResult();
    }
}
