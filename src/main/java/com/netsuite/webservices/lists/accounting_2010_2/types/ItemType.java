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
 * <p>Java class for ItemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_assembly"/>
 *     &lt;enumeration value="_description"/>
 *     &lt;enumeration value="_discount"/>
 *     &lt;enumeration value="_downloadItem"/>
 *     &lt;enumeration value="_giftCertificateItem"/>
 *     &lt;enumeration value="_inventoryItem"/>
 *     &lt;enumeration value="_itemGroup"/>
 *     &lt;enumeration value="_kit"/>
 *     &lt;enumeration value="_markup"/>
 *     &lt;enumeration value="_nonInventoryItem"/>
 *     &lt;enumeration value="_otherCharge"/>
 *     &lt;enumeration value="_payment"/>
 *     &lt;enumeration value="_service"/>
 *     &lt;enumeration value="_subtotal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemType", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum ItemType {

    @XmlEnumValue("_assembly")
    ASSEMBLY("_assembly"),
    @XmlEnumValue("_description")
    DESCRIPTION("_description"),
    @XmlEnumValue("_discount")
    DISCOUNT("_discount"),
    @XmlEnumValue("_downloadItem")
    DOWNLOAD_ITEM("_downloadItem"),
    @XmlEnumValue("_giftCertificateItem")
    GIFT_CERTIFICATE_ITEM("_giftCertificateItem"),
    @XmlEnumValue("_inventoryItem")
    INVENTORY_ITEM("_inventoryItem"),
    @XmlEnumValue("_itemGroup")
    ITEM_GROUP("_itemGroup"),
    @XmlEnumValue("_kit")
    KIT("_kit"),
    @XmlEnumValue("_markup")
    MARKUP("_markup"),
    @XmlEnumValue("_nonInventoryItem")
    NON_INVENTORY_ITEM("_nonInventoryItem"),
    @XmlEnumValue("_otherCharge")
    OTHER_CHARGE("_otherCharge"),
    @XmlEnumValue("_payment")
    PAYMENT("_payment"),
    @XmlEnumValue("_service")
    SERVICE("_service"),
    @XmlEnumValue("_subtotal")
    SUBTOTAL("_subtotal");
    private final String value;

    ItemType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemType fromValue(String v) {
        for (ItemType c: ItemType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
