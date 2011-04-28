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
 * <p>Java class for ItemFulfillmentExportTypeUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentExportTypeUps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_domesticExports"/>
 *     &lt;enumeration value="_foreignExports"/>
 *     &lt;enumeration value="_foreignMilitarySales"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentExportTypeUps", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentExportTypeUps {

    @XmlEnumValue("_domesticExports")
    DOMESTIC_EXPORTS("_domesticExports"),
    @XmlEnumValue("_foreignExports")
    FOREIGN_EXPORTS("_foreignExports"),
    @XmlEnumValue("_foreignMilitarySales")
    FOREIGN_MILITARY_SALES("_foreignMilitarySales");
    private final String value;

    ItemFulfillmentExportTypeUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentExportTypeUps fromValue(String v) {
        for (ItemFulfillmentExportTypeUps c: ItemFulfillmentExportTypeUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
