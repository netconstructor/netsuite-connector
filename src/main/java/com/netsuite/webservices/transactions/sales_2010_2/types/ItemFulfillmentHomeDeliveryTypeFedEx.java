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
 * <p>Java class for ItemFulfillmentHomeDeliveryTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentHomeDeliveryTypeFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_appointment"/>
 *     &lt;enumeration value="_dateCertain"/>
 *     &lt;enumeration value="_evening"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentHomeDeliveryTypeFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentHomeDeliveryTypeFedEx {

    @XmlEnumValue("_appointment")
    APPOINTMENT("_appointment"),
    @XmlEnumValue("_dateCertain")
    DATE_CERTAIN("_dateCertain"),
    @XmlEnumValue("_evening")
    EVENING("_evening");
    private final String value;

    ItemFulfillmentHomeDeliveryTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentHomeDeliveryTypeFedEx fromValue(String v) {
        for (ItemFulfillmentHomeDeliveryTypeFedEx c: ItemFulfillmentHomeDeliveryTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
