/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.relationships_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityGroupDefView.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EntityGroupDefView">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_daily"/>
 *     &lt;enumeration value="_weekly"/>
 *     &lt;enumeration value="_monthly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EntityGroupDefView", namespace = "urn:types.relationships_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EntityGroupDefView {

    @XmlEnumValue("_daily")
    DAILY("_daily"),
    @XmlEnumValue("_weekly")
    WEEKLY("_weekly"),
    @XmlEnumValue("_monthly")
    MONTHLY("_monthly");
    private final String value;

    EntityGroupDefView(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EntityGroupDefView fromValue(String v) {
        for (EntityGroupDefView c: EntityGroupDefView.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
