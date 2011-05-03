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

import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

import java.util.Date;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.BeanUtilsBean;
import org.apache.commons.beanutils.LazyDynaMap;

/**
 * Map to Record converter
 * 
 * @author flbulgarelli
 */
public class MapToRecordConverter
{
    private final XmlGregorianCalendarFactory xmlGregorianCalendarFactory;
    @SuppressWarnings("unchecked")
    private final BeanUtilsBean beanUtils = new BeanUtilsBean()
    {
        @Override
        public Object convert(Object value, Class targetType)
        {
            if (value instanceof Date && XMLGregorianCalendar.class.isAssignableFrom(targetType))
            {
                return xmlGregorianCalendarFactory.toXmlCalendar((Date) value);
            }
            return super.convert(value, targetType);
        };
    };

    public MapToRecordConverter(XmlGregorianCalendarFactory xmlGregorianCalendarFactory)
    {
        this.xmlGregorianCalendarFactory = xmlGregorianCalendarFactory;
    }

    public Record toRecord(RecordType recordType, Map<String, Object> recordAttributes) throws Exception
    {
        Record record = recordType.getRecordClass().newInstance();
        beanUtils.copyProperties(record, new LazyDynaMap(recordAttributes));
        return record;
    }

}
