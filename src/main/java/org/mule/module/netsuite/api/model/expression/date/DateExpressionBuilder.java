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
import static org.mule.module.netsuite.api.model.expression.Quotes.removeQuotes;

import org.mule.module.netsuite.api.util.XmlGregorianCalendarFactory;

import com.netsuite.webservices.platform.core_2010_2.SearchDateField;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDate;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

public class DateExpressionBuilder
{
    private static final String ISO_DATE_FORMAT = "yyyy-MM-dd";
    private SearchDateField searchDateField = new SearchDateField();
    private XmlGregorianCalendarFactory xmlGregorianCalendarFactory;

    public DateExpressionBuilder(XmlGregorianCalendarFactory xmlGregorianCalendarFactory)
    {
        this.xmlGregorianCalendarFactory = xmlGregorianCalendarFactory;
    }

    public void setOperation(String opertion)
    {
        searchDateField.setOperator(SearchDateFieldOperator.fromValue(opertion));
    }

    public void setPredefinedSearchValue(String predefinedSearchValue)
    {
        searchDateField.setPredefinedSearchValue(SearchDate.fromValue(predefinedSearchValue));
    }

    // DATE

    public void setDateSearchValue(String date)
    {
        setDateSearchValueInternal(date, ISO_DATE_FORMAT);
    }

    public void setDateSearchValue(String date, String format)
    {
        setDateSearchValueInternal(removeQuotes(date), removeQuotes(format));
    }

    public void setDateSearchValueInternal(String date, String format)
    {
        try
        {
            searchDateField.setSearchValue(toXmlCalendar(new SimpleDateFormat(format).parse(date)));
        }
        catch (ParseException e)
        {
            throw soften(e);
        }
    }

    // DATE RANGE

    public void setRangeSearchValue(String minDate, String maxDate)
    {
        setRangeSearchValueInternal(minDate, maxDate, ISO_DATE_FORMAT);
    }

    public void setRangeSearchValue(String minDate, String maxDate, String format)
    {
        setRangeSearchValueInternal(removeQuotes(minDate), removeQuotes(maxDate), removeQuotes(format));
    }

    public void setRangeSearchValueInternal(String minDate, String maxDate, String format)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try
        {
            searchDateField.setSearchValue(toXmlCalendar(dateFormat.parse(minDate)));
            searchDateField.setSearchValue2(toXmlCalendar(dateFormat.parse(maxDate)));
        }
        catch (ParseException e)
        {
            throw soften(e);
        }
    }

    public SearchDateField build()
    {
        return searchDateField;
    }

    private IllegalArgumentException soften(ParseException e)
    {
        return new IllegalArgumentException(e.getMessage());
    }

    public XMLGregorianCalendar toXmlCalendar(Date parse)
    {
        return xmlGregorianCalendarFactory.toXmlCalendar(parse);
    }

}
