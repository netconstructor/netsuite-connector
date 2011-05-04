/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.expression.date;

import org.mule.module.netsuite.api.util.XmlGregorianCalendarFactory;

import com.netsuite.webservices.platform.core_2010_2.SearchDateField;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;

import java.util.Date;

import org.apache.commons.lang.Validate;

/**
 * An implementation of {@link DateExpression} that creates {@link SearchDateField}
 * using given Date's and operator
 * 
 * @author flbulgarelli
 */
public final class SimpleDateExpression implements DateExpression
{
    private final Date date, date2;
    private final SearchDateFieldOperator operator;

    public SimpleDateExpression(Date date, Date date2, SearchDateFieldOperator operator)
    {
        Validate.notNull(date);
        Validate.notNull(operator);
        this.date = date;
        this.date2 = date2;
        this.operator = operator;
    }

    public SearchDateField createSearchDateField(XmlGregorianCalendarFactory calendarFactory)
    {
        SearchDateField searchDateField = new SearchDateField();
        searchDateField.setOperator(operator);
        searchDateField.setSearchValue(calendarFactory.toXmlCalendar(date));
        searchDateField.setSearchValue2(calendarFactory.nullSafeToXmlCalendar(date2));
        return searchDateField;
    }
}
