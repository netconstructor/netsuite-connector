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
 * <p>Java class for ItemFulfillmentLicenseExceptionUps.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ItemFulfillmentLicenseExceptionUps">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_agr"/>
 *     &lt;enumeration value="_apr"/>
 *     &lt;enumeration value="_avs"/>
 *     &lt;enumeration value="_bag"/>
 *     &lt;enumeration value="_civ"/>
 *     &lt;enumeration value="_ctp"/>
 *     &lt;enumeration value="_enc"/>
 *     &lt;enumeration value="_gbs"/>
 *     &lt;enumeration value="_gft"/>
 *     &lt;enumeration value="_gov"/>
 *     &lt;enumeration value="_kmi"/>
 *     &lt;enumeration value="_lvs"/>
 *     &lt;enumeration value="_nlr"/>
 *     &lt;enumeration value="_rpl"/>
 *     &lt;enumeration value="_tmp"/>
 *     &lt;enumeration value="_tspa"/>
 *     &lt;enumeration value="_tsr"/>
 *     &lt;enumeration value="_tsu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ItemFulfillmentLicenseExceptionUps", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ItemFulfillmentLicenseExceptionUps {

    @XmlEnumValue("_agr")
    AGR("_agr"),
    @XmlEnumValue("_apr")
    APR("_apr"),
    @XmlEnumValue("_avs")
    AVS("_avs"),
    @XmlEnumValue("_bag")
    BAG("_bag"),
    @XmlEnumValue("_civ")
    CIV("_civ"),
    @XmlEnumValue("_ctp")
    CTP("_ctp"),
    @XmlEnumValue("_enc")
    ENC("_enc"),
    @XmlEnumValue("_gbs")
    GBS("_gbs"),
    @XmlEnumValue("_gft")
    GFT("_gft"),
    @XmlEnumValue("_gov")
    GOV("_gov"),
    @XmlEnumValue("_kmi")
    KMI("_kmi"),
    @XmlEnumValue("_lvs")
    LVS("_lvs"),
    @XmlEnumValue("_nlr")
    NLR("_nlr"),
    @XmlEnumValue("_rpl")
    RPL("_rpl"),
    @XmlEnumValue("_tmp")
    TMP("_tmp"),
    @XmlEnumValue("_tspa")
    TSPA("_tspa"),
    @XmlEnumValue("_tsr")
    TSR("_tsr"),
    @XmlEnumValue("_tsu")
    TSU("_tsu");
    private final String value;

    ItemFulfillmentLicenseExceptionUps(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ItemFulfillmentLicenseExceptionUps fromValue(String v) {
        for (ItemFulfillmentLicenseExceptionUps c: ItemFulfillmentLicenseExceptionUps.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
