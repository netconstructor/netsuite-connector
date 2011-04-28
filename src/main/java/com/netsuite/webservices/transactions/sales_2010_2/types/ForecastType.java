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
 * <p>Java class for ForecastType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ForecastType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_omitted"/>
 *     &lt;enumeration value="_worstCase"/>
 *     &lt;enumeration value="_mostLikely"/>
 *     &lt;enumeration value="_upside"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ForecastType", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum ForecastType {

    @XmlEnumValue("_omitted")
    OMITTED("_omitted"),
    @XmlEnumValue("_worstCase")
    WORST_CASE("_worstCase"),
    @XmlEnumValue("_mostLikely")
    MOST_LIKELY("_mostLikely"),
    @XmlEnumValue("_upside")
    UPSIDE("_upside");
    private final String value;

    ForecastType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ForecastType fromValue(String v) {
        for (ForecastType c: ForecastType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
