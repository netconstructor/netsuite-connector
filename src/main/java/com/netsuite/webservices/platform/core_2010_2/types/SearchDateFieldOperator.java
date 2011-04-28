/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.core_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchDateFieldOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SearchDateFieldOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="after"/>
 *     &lt;enumeration value="before"/>
 *     &lt;enumeration value="empty"/>
 *     &lt;enumeration value="notAfter"/>
 *     &lt;enumeration value="notBefore"/>
 *     &lt;enumeration value="notEmpty"/>
 *     &lt;enumeration value="notOn"/>
 *     &lt;enumeration value="notOnOrAfter"/>
 *     &lt;enumeration value="notOnOrBefore"/>
 *     &lt;enumeration value="notWithin"/>
 *     &lt;enumeration value="on"/>
 *     &lt;enumeration value="onOrAfter"/>
 *     &lt;enumeration value="onOrBefore"/>
 *     &lt;enumeration value="within"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SearchDateFieldOperator", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum SearchDateFieldOperator {

    @XmlEnumValue("after")
    AFTER("after"),
    @XmlEnumValue("before")
    BEFORE("before"),
    @XmlEnumValue("empty")
    EMPTY("empty"),
    @XmlEnumValue("notAfter")
    NOT_AFTER("notAfter"),
    @XmlEnumValue("notBefore")
    NOT_BEFORE("notBefore"),
    @XmlEnumValue("notEmpty")
    NOT_EMPTY("notEmpty"),
    @XmlEnumValue("notOn")
    NOT_ON("notOn"),
    @XmlEnumValue("notOnOrAfter")
    NOT_ON_OR_AFTER("notOnOrAfter"),
    @XmlEnumValue("notOnOrBefore")
    NOT_ON_OR_BEFORE("notOnOrBefore"),
    @XmlEnumValue("notWithin")
    NOT_WITHIN("notWithin"),
    @XmlEnumValue("on")
    ON("on"),
    @XmlEnumValue("onOrAfter")
    ON_OR_AFTER("onOrAfter"),
    @XmlEnumValue("onOrBefore")
    ON_OR_BEFORE("onOrBefore"),
    @XmlEnumValue("within")
    WITHIN("within");
    private final String value;

    SearchDateFieldOperator(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SearchDateFieldOperator fromValue(String v) {
        for (SearchDateFieldOperator c: SearchDateFieldOperator.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
