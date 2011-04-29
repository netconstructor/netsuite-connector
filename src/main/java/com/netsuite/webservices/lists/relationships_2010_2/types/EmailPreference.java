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
 * <p>Java class for EmailPreference.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmailPreference">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_default"/>
 *     &lt;enumeration value="_hTML"/>
 *     &lt;enumeration value="_pDF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmailPreference", namespace = "urn:types.relationships_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum EmailPreference {

    @XmlEnumValue("_default")
    DEFAULT("_default"),
    @XmlEnumValue("_hTML")
    H_TML("_hTML"),
    @XmlEnumValue("_pDF")
    P_DF("_pDF");
    private final String value;

    EmailPreference(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmailPreference fromValue(String v) {
        for (EmailPreference c: EmailPreference.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
