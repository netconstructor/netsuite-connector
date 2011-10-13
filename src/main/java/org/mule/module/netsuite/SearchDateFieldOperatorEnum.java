/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite;

import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;

public enum SearchDateFieldOperatorEnum
{
    AFTER(SearchDateFieldOperator.AFTER),
    BEFORE(SearchDateFieldOperator.BEFORE),
    EMPTY(SearchDateFieldOperator.EMPTY),
    NOT_AFTER(SearchDateFieldOperator.NOT_AFTER),
    NOT_BEFORE(SearchDateFieldOperator.NOT_BEFORE),
    NOT_EMPTY(SearchDateFieldOperator.NOT_EMPTY),
    NOT_ON(SearchDateFieldOperator.NOT_ON),
    NOT_ON_OR_AFTER(SearchDateFieldOperator.NOT_ON_OR_AFTER),
    NOT_ON_OR_BEFORE(SearchDateFieldOperator.NOT_ON_OR_BEFORE),
    NOT_WITHIN(SearchDateFieldOperator.NOT_WITHIN),
    ON(SearchDateFieldOperator.ON),
    ON_OR_AFTER(SearchDateFieldOperator.ON_OR_AFTER),
    ON_OR_BEFORE(SearchDateFieldOperator.ON_OR_BEFORE),
    WITHIN(SearchDateFieldOperator.WITHIN);
    
    private final SearchDateFieldOperator value;

    private SearchDateFieldOperatorEnum(SearchDateFieldOperator value)
    {
        this.value = value;
    }

    public SearchDateFieldOperator toSearchDateFieldOperator()
    {
        return value;
    }

}


