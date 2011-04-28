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
 * <p>Java class for ItemFulfillmentPackageUpsPackagingUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentPackageUpsPackagingUps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_upsExpressBox"/>
 *     &lt;enumeration value="_upsLetter"/>
 *     &lt;enumeration value="_upsPak"/>
 *     &lt;enumeration value="_upsTube"/>
 *     &lt;enumeration value="_yourPackaging"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentPackageUpsPackagingUps", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentPackageUpsPackagingUps {

    @XmlEnumValue("_upsExpressBox")
    UPS_EXPRESS_BOX("_upsExpressBox"),
    @XmlEnumValue("_upsLetter")
    UPS_LETTER("_upsLetter"),
    @XmlEnumValue("_upsPak")
    UPS_PAK("_upsPak"),
    @XmlEnumValue("_upsTube")
    UPS_TUBE("_upsTube"),
    @XmlEnumValue("_yourPackaging")
    YOUR_PACKAGING("_yourPackaging");
    private final String value;

    ItemFulfillmentPackageUpsPackagingUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentPackageUpsPackagingUps fromValue(String v) {
        for (ItemFulfillmentPackageUpsPackagingUps c: ItemFulfillmentPackageUpsPackagingUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
