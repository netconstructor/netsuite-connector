/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.accounting_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_forPurchase"/>
 *     &lt;enumeration value="_forResale"/>
 *     &lt;enumeration value="_forSale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemSubType", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemSubType {

    @XmlEnumValue("_forPurchase")
    FOR_PURCHASE("_forPurchase"),
    @XmlEnumValue("_forResale")
    FOR_RESALE("_forResale"),
    @XmlEnumValue("_forSale")
    FOR_SALE("_forSale");
    private final String value;

    ItemSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemSubType fromValue(String v) {
        for (ItemSubType c: ItemSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
