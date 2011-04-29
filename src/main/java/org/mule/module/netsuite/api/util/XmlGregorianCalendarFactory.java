/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.util;

import org.mule.transformer.types.DataTypeFactory;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang.UnhandledException;

/**
 *  Wrapper over a {@link DataTypeFactory} that simplifies date to calendar conversion
 *  @author flbulgarelli
 */
public class XmlGregorianCalendarFactory
{
    private final DatatypeFactory dataTypeFactory;

    public XmlGregorianCalendarFactory(DatatypeFactory dataTypeFactory)
    {
        this.dataTypeFactory = dataTypeFactory;
    }

    public XMLGregorianCalendar toXmlCalendar(Date date)
    {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        return dataTypeFactory.newXMLGregorianCalendar(calendar);
    }

    public XMLGregorianCalendar nullSafeToXmlCalendar(Date date)
    {
        if (date == null)
        {
            return null;
        }
        return toXmlCalendar(date);
    }

    public static XmlGregorianCalendarFactory newInstance()
    {
        try
        {
            return new XmlGregorianCalendarFactory(DatatypeFactory.newInstance());
        }
        catch (DatatypeConfigurationException e)
        {
            throw new UnhandledException(e);
        }
    }

}
