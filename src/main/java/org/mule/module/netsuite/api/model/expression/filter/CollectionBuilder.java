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

import org.mule.module.netsuite.api.model.expression.Quotes;

import com.netsuite.webservices.platform.core_2010_2.RecordRef;

import java.util.ArrayList;
import java.util.List;

public class CollectionBuilder
{
    private List<Object> list = new ArrayList<Object>();

    public CollectionBuilder()
    {
    }

    public List<Object> build()
    {
        return list;
    }

    public void addEnumElement(String image)
    {
        list.add(image);
    }

    public void addInternalIdElement(String image)
    {
        list.add(new RecordRef(null, Quotes.removeQuotes(image), null));
    }

    public void addExternalIdElement(String image)
    {
        list.add(new RecordRef(null, null, Quotes.removeQuotes(image)));
    }
}
