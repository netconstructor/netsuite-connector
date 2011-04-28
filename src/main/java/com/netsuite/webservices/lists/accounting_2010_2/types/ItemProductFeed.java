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
 * <p>Java class for ItemProductFeed.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemProductFeed">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_googleBase"/>
 *     &lt;enumeration value="_nexTag"/>
 *     &lt;enumeration value="_shoppingCom"/>
 *     &lt;enumeration value="_shopzilla"/>
 *     &lt;enumeration value="_yahooShopping"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemProductFeed", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemProductFeed {

    @XmlEnumValue("_googleBase")
    GOOGLE_BASE("_googleBase"),
    @XmlEnumValue("_nexTag")
    NEX_TAG("_nexTag"),
    @XmlEnumValue("_shoppingCom")
    SHOPPING_COM("_shoppingCom"),
    @XmlEnumValue("_shopzilla")
    SHOPZILLA("_shopzilla"),
    @XmlEnumValue("_yahooShopping")
    YAHOO_SHOPPING("_yahooShopping");
    private final String value;

    ItemProductFeed(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemProductFeed fromValue(String v) {
        for (ItemProductFeed c: ItemProductFeed.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
