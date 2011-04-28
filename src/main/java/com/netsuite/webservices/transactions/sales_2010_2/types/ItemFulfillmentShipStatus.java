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
 * <p>Java class for ItemFulfillmentShipStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentShipStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_packed"/>
 *     &lt;enumeration value="_picked"/>
 *     &lt;enumeration value="_shipped"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentShipStatus", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentShipStatus {

    @XmlEnumValue("_packed")
    PACKED("_packed"),
    @XmlEnumValue("_picked")
    PICKED("_picked"),
    @XmlEnumValue("_shipped")
    SHIPPED("_shipped");
    private final String value;

    ItemFulfillmentShipStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentShipStatus fromValue(String v) {
        for (ItemFulfillmentShipStatus c: ItemFulfillmentShipStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
