/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.expression;

import org.apache.commons.lang.StringUtils;

public final class Quotes
{

    private Quotes()
    {
    }

    public static String removeQuotesIfPresent(String string)
    {
        if (isQuoted(string))
        {
            return removeQuotes(string);
        }
        return string;
    }

    private static boolean isQuoted(String string)
    {
        char firstChar = string.charAt(0);
        return firstChar == string.charAt(string.length() - 1)
                && (firstChar == '"' || firstChar == '\'');
    }

    public static String removeQuotes(String quotedString)
    {
        return StringUtils
                .substring(quotedString, 1, quotedString.length() - 1);
    }
}
