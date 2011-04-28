/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemFulfillmentPackageFedExSignatureOptionsFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExSignatureOptionsFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_adult"/>
 *     &lt;enumeration value="_direct"/>
 *     &lt;enumeration value="_indirect"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExSignatureOptionsFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExSignatureOptionsFedEx {

    @XmlEnumValue("_adult")
    ADULT("_adult"),
    @XmlEnumValue("_direct")
    DIRECT("_direct"),
    @XmlEnumValue("_indirect")
    INDIRECT("_indirect");
    private final String value;

    ItemFulfillmentPackageFedExSignatureOptionsFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExSignatureOptionsFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExSignatureOptionsFedEx c: ItemFulfillmentPackageFedExSignatureOptionsFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
