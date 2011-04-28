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
 * <p>Java class for LandedCostSource.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LandedCostSource">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_manual"/>
 *     &lt;enumeration value="_otherTransaction"/>
 *     &lt;enumeration value="_otherTransactionExcludeTax"/>
 *     &lt;enumeration value="_thisTransaction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LandedCostSource", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum LandedCostSource {

    @XmlEnumValue("_manual")
    MANUAL("_manual"),
    @XmlEnumValue("_otherTransaction")
    OTHER_TRANSACTION("_otherTransaction"),
    @XmlEnumValue("_otherTransactionExcludeTax")
    OTHER_TRANSACTION_EXCLUDE_TAX("_otherTransactionExcludeTax"),
    @XmlEnumValue("_thisTransaction")
    THIS_TRANSACTION("_thisTransaction");
    private final String value;

    LandedCostSource(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LandedCostSource fromValue(String v) {
        for (LandedCostSource c: LandedCostSource.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
