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

import static org.junit.Assert.*;

import com.netsuite.webservices.platform.core_2010_2.SearchDateField;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDate;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;

import org.junit.Test;

/**
 * Test for {@link DateExpressionParser}
 * 
 * @author flbulgarelli
 */
public class DateExpressionParserUnitTest
{
    @Test
    public void testParsePredefinedCanParse()
    {
        DateExpressionParser.parse("within(thisBusinessWeek)");
        DateExpressionParser.parse("onOrAfter(today)");
        DateExpressionParser.parse("notAfter(tomorrow)");
        DateExpressionParser.parse("before(nextMonth)");
        DateExpressionParser.parse("notBefore(lastWeek)");
    }
    
    @Test
    public void testParsePredefined()
    {
        SearchDateField field = DateExpressionParser.parse("notAfter(tomorrow)");
        assertSame(SearchDateFieldOperator.NOT_AFTER, field.getOperator());
        assertNull(field.getSearchValue2());
        assertNull(field.getSearchValue());
        assertSame(SearchDate.TOMORROW, field.getPredefinedSearchValue());
    }


    @Test
    public void testParseIsoDate()
    {
        SearchDateField field = DateExpressionParser.parse("after(isoDate(2005-5-9))");
        assertSame(SearchDateFieldOperator.AFTER, field.getOperator());
        assertNull(field.getSearchValue2());
        assertNull(field.getPredefinedSearchValue());
        assertEquals(9, field.getSearchValue().getDay());
        assertEquals(5, field.getSearchValue().getMonth());
        assertEquals(2005, field.getSearchValue().getYear());
    }

    @Test
    public void testParseDateTimeWithFormatCanParse()
    {
        DateExpressionParser.parse("after(dateTime('15:14:10', 'HH:mm:ss'))");
    }

    @Test
    public void testParseIsoDateRangeCanParse()
    {
        DateExpressionParser.parse("within(isoDateRange(2005-5-9, 2009-20-6))");
    }
    
    @Test
    public void testParseDateTimeRangeCanParse()
    {
        DateExpressionParser.parse("within(dateTimeRange('15:14:10', '19:14:10', 'HH:mm:ss'))");
    }

}
