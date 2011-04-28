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
 * <p>Java class for ItemCostingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCostingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_average"/>
 *     &lt;enumeration value="_fifo"/>
 *     &lt;enumeration value="_lifo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemCostingMethod", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemCostingMethod {

    @XmlEnumValue("_average")
    AVERAGE("_average"),
    @XmlEnumValue("_fifo")
    FIFO("_fifo"),
    @XmlEnumValue("_lifo")
    LIFO("_lifo");
    private final String value;

    ItemCostingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCostingMethod fromValue(String v) {
        for (ItemCostingMethod c: ItemCostingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
