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
 * <p>Java class for ItemFulfillmentPackageFedExCodFreightTypeFedEx.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageFedExCodFreightTypeFedEx">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_cODCharge"/>
 *     &lt;enumeration value="_noneSelected"/>
 *     &lt;enumeration value="_orderChargeNet"/>
 *     &lt;enumeration value="_orderChargeTotal"/>
 *     &lt;enumeration value="_shippingCharge"/>
 *     &lt;enumeration value="_totalCharge"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageFedExCodFreightTypeFedEx", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageFedExCodFreightTypeFedEx {

    @XmlEnumValue("_cODCharge")
    C_OD_CHARGE("_cODCharge"),
    @XmlEnumValue("_noneSelected")
    NONE_SELECTED("_noneSelected"),
    @XmlEnumValue("_orderChargeNet")
    ORDER_CHARGE_NET("_orderChargeNet"),
    @XmlEnumValue("_orderChargeTotal")
    ORDER_CHARGE_TOTAL("_orderChargeTotal"),
    @XmlEnumValue("_shippingCharge")
    SHIPPING_CHARGE("_shippingCharge"),
    @XmlEnumValue("_totalCharge")
    TOTAL_CHARGE("_totalCharge");
    private final String value;

    ItemFulfillmentPackageFedExCodFreightTypeFedEx(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageFedExCodFreightTypeFedEx fromValue(String v) {
        for (ItemFulfillmentPackageFedExCodFreightTypeFedEx c: ItemFulfillmentPackageFedExCodFreightTypeFedEx.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
