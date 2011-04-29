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
 * <p>Java class for CustomerCreditHoldOverride.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerCreditHoldOverride">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_auto"/>
 *     &lt;enumeration value="_on"/>
 *     &lt;enumeration value="_off"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerCreditHoldOverride", namespace = "urn:types.relationships_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CustomerCreditHoldOverride {

    @XmlEnumValue("_auto")
    AUTO("_auto"),
    @XmlEnumValue("_on")
    ON("_on"),
    @XmlEnumValue("_off")
    OFF("_off");
    private final String value;

    CustomerCreditHoldOverride(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerCreditHoldOverride fromValue(String v) {
        for (CustomerCreditHoldOverride c: CustomerCreditHoldOverride.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
