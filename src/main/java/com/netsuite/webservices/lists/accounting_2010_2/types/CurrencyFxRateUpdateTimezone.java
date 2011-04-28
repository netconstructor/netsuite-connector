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
 * <p>Java class for CurrencyFxRateUpdateTimezone.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyFxRateUpdateTimezone">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_americaNewYork"/>
 *     &lt;enumeration value="_asiaMagadan"/>
 *     &lt;enumeration value="_asiaTokyo"/>
 *     &lt;enumeration value="_europeParis"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyFxRateUpdateTimezone", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CurrencyFxRateUpdateTimezone {

    @XmlEnumValue("_americaNewYork")
    AMERICA_NEW_YORK("_americaNewYork"),
    @XmlEnumValue("_asiaMagadan")
    ASIA_MAGADAN("_asiaMagadan"),
    @XmlEnumValue("_asiaTokyo")
    ASIA_TOKYO("_asiaTokyo"),
    @XmlEnumValue("_europeParis")
    EUROPE_PARIS("_europeParis");
    private final String value;

    CurrencyFxRateUpdateTimezone(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyFxRateUpdateTimezone fromValue(String v) {
        for (CurrencyFxRateUpdateTimezone c: CurrencyFxRateUpdateTimezone.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
