/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.core_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalendarEventAttendeeResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CalendarEventAttendeeResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_accepted"/>
 *     &lt;enumeration value="_declined"/>
 *     &lt;enumeration value="_noResponse"/>
 *     &lt;enumeration value="_tentative"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CalendarEventAttendeeResponse", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum CalendarEventAttendeeResponse {

    @XmlEnumValue("_accepted")
    ACCEPTED("_accepted"),
    @XmlEnumValue("_declined")
    DECLINED("_declined"),
    @XmlEnumValue("_noResponse")
    NO_RESPONSE("_noResponse"),
    @XmlEnumValue("_tentative")
    TENTATIVE("_tentative");
    private final String value;

    CalendarEventAttendeeResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CalendarEventAttendeeResponse fromValue(String v) {
        for (CalendarEventAttendeeResponse c: CalendarEventAttendeeResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
