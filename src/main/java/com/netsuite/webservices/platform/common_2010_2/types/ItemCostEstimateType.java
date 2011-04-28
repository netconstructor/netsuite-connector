/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemCostEstimateType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemCostEstimateType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_averageCost"/>
 *     &lt;enumeration value="_custom"/>
 *     &lt;enumeration value="_derivedFromMemberItems"/>
 *     &lt;enumeration value="_itemDefinedCost"/>
 *     &lt;enumeration value="_lastPurchasePrice"/>
 *     &lt;enumeration value="_preferredVendorRate"/>
 *     &lt;enumeration value="_purchaseOrderRate"/>
 *     &lt;enumeration value="_purchasePrice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemCostEstimateType", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum ItemCostEstimateType {

    @XmlEnumValue("_averageCost")
    AVERAGE_COST("_averageCost"),
    @XmlEnumValue("_custom")
    CUSTOM("_custom"),
    @XmlEnumValue("_derivedFromMemberItems")
    DERIVED_FROM_MEMBER_ITEMS("_derivedFromMemberItems"),
    @XmlEnumValue("_itemDefinedCost")
    ITEM_DEFINED_COST("_itemDefinedCost"),
    @XmlEnumValue("_lastPurchasePrice")
    LAST_PURCHASE_PRICE("_lastPurchasePrice"),
    @XmlEnumValue("_preferredVendorRate")
    PREFERRED_VENDOR_RATE("_preferredVendorRate"),
    @XmlEnumValue("_purchaseOrderRate")
    PURCHASE_ORDER_RATE("_purchaseOrderRate"),
    @XmlEnumValue("_purchasePrice")
    PURCHASE_PRICE("_purchasePrice");
    private final String value;

    ItemCostEstimateType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemCostEstimateType fromValue(String v) {
        for (ItemCostEstimateType c: ItemCostEstimateType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
