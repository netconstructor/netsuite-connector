/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.relationships_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PartnerOtherRelationships.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PartnerOtherRelationships">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_customer"/>
 *     &lt;enumeration value="_otherName"/>
 *     &lt;enumeration value="_vendor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PartnerOtherRelationships", namespace = "urn:types.relationships_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PartnerOtherRelationships {

    @XmlEnumValue("_customer")
    CUSTOMER("_customer"),
    @XmlEnumValue("_otherName")
    OTHER_NAME("_otherName"),
    @XmlEnumValue("_vendor")
    VENDOR("_vendor");
    private final String value;

    PartnerOtherRelationships(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PartnerOtherRelationships fromValue(String v) {
        for (PartnerOtherRelationships c: PartnerOtherRelationships.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
