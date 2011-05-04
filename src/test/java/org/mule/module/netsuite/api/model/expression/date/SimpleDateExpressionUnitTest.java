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

import static org.junit.Assert.assertThat;

import org.mule.module.netsuite.api.util.XmlGregorianCalendarFactory;

import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;

import java.util.GregorianCalendar;

import org.junit.Test;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;

/**
 * Test for {@link SimpleDateExpression}
 * @author flbulgarelli
 */
public class SimpleDateExpressionUnitTest
{
    @Test
    public void test() throws Exception
    {
        XmlGregorianCalendarFactory factory = XmlGregorianCalendarFactory.newInstance();
        GregorianCalendar calendar = new GregorianCalendar(2010, GregorianCalendar.JANUARY, 10);
        assertThat(
            new SimpleDateExpression(calendar.getTime(), null, SearchDateFieldOperator.BEFORE).createSearchDateField(factory),
            new ReflectionEquals(DateExpressionParser.parse("before(isoDate(2010-1-10))", factory)));
    }
}
