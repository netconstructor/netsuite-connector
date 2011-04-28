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
 * <p>Java class for GlobalSubscriptionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="GlobalSubscriptionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_confirmedOptIn"/>
 *     &lt;enumeration value="_confirmedOptOut"/>
 *     &lt;enumeration value="_softOptIn"/>
 *     &lt;enumeration value="_softOptOut"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GlobalSubscriptionStatus", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum GlobalSubscriptionStatus {

    @XmlEnumValue("_confirmedOptIn")
    CONFIRMED_OPT_IN("_confirmedOptIn"),
    @XmlEnumValue("_confirmedOptOut")
    CONFIRMED_OPT_OUT("_confirmedOptOut"),
    @XmlEnumValue("_softOptIn")
    SOFT_OPT_IN("_softOptIn"),
    @XmlEnumValue("_softOptOut")
    SOFT_OPT_OUT("_softOptOut");
    private final String value;

    GlobalSubscriptionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GlobalSubscriptionStatus fromValue(String v) {
        for (GlobalSubscriptionStatus c: GlobalSubscriptionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
