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
 * <p>Java class for InitializeAuxRefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitializeAuxRefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="shippingGroup"/>
 *     &lt;enumeration value="arAccount"/>
 *     &lt;enumeration value="apAccount"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InitializeAuxRefType", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum InitializeAuxRefType {

    @XmlEnumValue("shippingGroup")
    SHIPPING_GROUP("shippingGroup"),
    @XmlEnumValue("arAccount")
    AR_ACCOUNT("arAccount"),
    @XmlEnumValue("apAccount")
    AP_ACCOUNT("apAccount");
    private final String value;

    InitializeAuxRefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitializeAuxRefType fromValue(String v) {
        for (InitializeAuxRefType c: InitializeAuxRefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
