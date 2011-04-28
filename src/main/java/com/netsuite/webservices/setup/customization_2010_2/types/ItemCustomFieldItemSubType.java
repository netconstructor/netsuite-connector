/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.setup.customization_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCustomFieldItemSubType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCustomFieldItemSubType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_both"/>
 *     &lt;enumeration value="_purchase"/>
 *     &lt;enumeration value="_sale"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemCustomFieldItemSubType", namespace = "urn:types.customization_2010_2.setup.webservices.netsuite.com")
@XmlEnum
public enum ItemCustomFieldItemSubType {

    @XmlEnumValue("_both")
    BOTH("_both"),
    @XmlEnumValue("_purchase")
    PURCHASE("_purchase"),
    @XmlEnumValue("_sale")
    SALE("_sale");
    private final String value;

    ItemCustomFieldItemSubType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCustomFieldItemSubType fromValue(String v) {
        for (ItemCustomFieldItemSubType c: ItemCustomFieldItemSubType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
