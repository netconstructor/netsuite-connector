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

/**
 * A date filtering expression, capable of creating {@link SearchDateField}s
 */
public interface DateExpression
{
    SearchDateField createSearchDateField(XmlGregorianCalendarFactory calendarFactory);
}
