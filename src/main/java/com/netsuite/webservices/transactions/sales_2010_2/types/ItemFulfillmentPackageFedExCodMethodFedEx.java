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
 * <p>Java class for ItemFulfillmentPackageFedExCodMethodFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExCodMethodFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_any"/>
 *     &lt;enumeration value="_cash"/>
 *     &lt;enumeration value="_guaranteedFunds"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExCodMethodFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExCodMethodFedEx {

    @XmlEnumValue("_any")
    ANY("_any"),
    @XmlEnumValue("_cash")
    CASH("_cash"),
    @XmlEnumValue("_guaranteedFunds")
    GUARANTEED_FUNDS("_guaranteedFunds");
    private final String value;

    ItemFulfillmentPackageFedExCodMethodFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExCodMethodFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExCodMethodFedEx c: ItemFulfillmentPackageFedExCodMethodFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
