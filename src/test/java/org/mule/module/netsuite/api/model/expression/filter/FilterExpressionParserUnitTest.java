package org.mule.module.netsuite.api.model.expression.filter;

import org.junit.Test;

public class FilterExpressionParserUnitTest
{
    @Test
    public void testBasicSyntax() throws Exception
    {
        FilterExpressionParser.parse("greaterThan(customer.consolDaysOverdue, 25)");
    }
}
