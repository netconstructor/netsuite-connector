/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.expression.filter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.netsuite.webservices.lists.employees_2010_2.EmployeeSearch;
import com.netsuite.webservices.lists.relationships_2010_2.CustomerSearch;
import com.netsuite.webservices.platform.core_2010_2.types.SearchLongFieldOperator;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

import org.junit.Test;

/**
 * Test for {@link FilterExpressionParser}
 * 
 * @author flbulgarelli
 */
public class FilterExpressionParserUnitTest
{
    @Test
    public void testBasicSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "greaterThan(consolDaysOverdue, 25)");
    }

    @Test
    public void testJoinedSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "equalTo(job.internalIdNumber, 136904)");
    }

    @Test
    public void testStringSyntaxQuotes() throws Exception
    {
        EmployeeSearch searchRecord = (EmployeeSearch) FilterExpressionParser.parse(
            SearchRecordType.EMPLOYEE, "is(email, 'john.doe@foobar.com')");
        assertEquals("john.doe@foobar.com", searchRecord.getBasic().getEmail().getSearchValue());
    }

    @Test
    public void testStringSyntaxDoubleQuotes() throws Exception
    {
        EmployeeSearch searchRecord = (EmployeeSearch) FilterExpressionParser.parse(
            SearchRecordType.EMPLOYEE, "is(email, \"john.doe@foobar.com\")");
        assertEquals("john.doe@foobar.com", searchRecord.getBasic().getEmail().getSearchValue());
    }

    @Test
    public void testBooleanSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "isTrue(job.giveAccess)");
    }

    @Test
    public void testAndSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER,
            "greaterThan(job.internalIdNumber, 136904), equalTo(consolDaysOverdue, 25) ");

    }

    @Test
    public void testTernarySyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "between(consolDaysOverdue, 10, 62)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadAttribute() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "between(consolOverdue, 10, 62)");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadSyntax() throws Exception
    {
        FilterExpressionParser.parse(SearchRecordType.CUSTOMER, "foobar");
    }

    @Test
    public void testParse() throws Exception
    {
        CustomerSearch searchRecord = (CustomerSearch) FilterExpressionParser.parse(
            SearchRecordType.CUSTOMER,
            "greaterThan(job.internalIdNumber, 136904), between(consolDaysOverdue, 10, 62), isTrue(job.giveAccess)");

        assertNotNull(searchRecord.getBasic());
        assertNotNull(searchRecord.getBasic().getConsolDaysOverdue());
        assertSame(SearchLongFieldOperator.BETWEEN, searchRecord.getBasic()
            .getConsolDaysOverdue()
            .getOperator());
        assertEquals((Long) 10L, searchRecord.getBasic().getConsolDaysOverdue().getSearchValue());
        assertEquals((Long) 62L, searchRecord.getBasic().getConsolDaysOverdue().getSearchValue2());

        assertNotNull(searchRecord.getJobJoin());
        assertEquals((Long) 136904L, searchRecord.getJobJoin().getInternalIdNumber().getSearchValue());
        assertSame(SearchLongFieldOperator.GREATER_THAN, searchRecord.getJobJoin()
            .getInternalIdNumber()
            .getOperator());
        assertNull(searchRecord.getJobJoin().getInternalIdNumber().getSearchValue2());

        assertNotNull(searchRecord.getJobJoin().getGiveAccess());
        assertTrue(searchRecord.getJobJoin().getGiveAccess().isSearchValue());
    }

}
