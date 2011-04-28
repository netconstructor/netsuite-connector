/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.support_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IssueTrackCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IssueTrackCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_never"/>
 *     &lt;enumeration value="_onAnyChange"/>
 *     &lt;enumeration value="_whenBaseStatusIsClosed"/>
 *     &lt;enumeration value="_whenBaseStatusIsOnHold"/>
 *     &lt;enumeration value="_whenBaseStatusIsOpen"/>
 *     &lt;enumeration value="_whenBaseStatusIsResolved"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "IssueTrackCode", namespace = "urn:types.support_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum IssueTrackCode {

    @XmlEnumValue("_never")
    NEVER("_never"),
    @XmlEnumValue("_onAnyChange")
    ON_ANY_CHANGE("_onAnyChange"),
    @XmlEnumValue("_whenBaseStatusIsClosed")
    WHEN_BASE_STATUS_IS_CLOSED("_whenBaseStatusIsClosed"),
    @XmlEnumValue("_whenBaseStatusIsOnHold")
    WHEN_BASE_STATUS_IS_ON_HOLD("_whenBaseStatusIsOnHold"),
    @XmlEnumValue("_whenBaseStatusIsOpen")
    WHEN_BASE_STATUS_IS_OPEN("_whenBaseStatusIsOpen"),
    @XmlEnumValue("_whenBaseStatusIsResolved")
    WHEN_BASE_STATUS_IS_RESOLVED("_whenBaseStatusIsResolved");
    private final String value;

    IssueTrackCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IssueTrackCode fromValue(String v) {
        for (IssueTrackCode c: IssueTrackCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
