/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.activities.scheduling_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventDowim.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventDowim">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_first"/>
 *     &lt;enumeration value="_second"/>
 *     &lt;enumeration value="_third"/>
 *     &lt;enumeration value="_fourth"/>
 *     &lt;enumeration value="_last"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventDowim", namespace = "urn:types.scheduling_2010_2.activities.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventDowim {

    @XmlEnumValue("_first")
    FIRST("_first"),
    @XmlEnumValue("_second")
    SECOND("_second"),
    @XmlEnumValue("_third")
    THIRD("_third"),
    @XmlEnumValue("_fourth")
    FOURTH("_fourth"),
    @XmlEnumValue("_last")
    LAST("_last");
    private final String value;

    CalendarEventDowim(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventDowim fromValue(String v) {
        for (CalendarEventDowim c: CalendarEventDowim.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
