/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.documents.filecabinet_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileAttachFrom.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileAttachFrom">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_computer"/>
 *     &lt;enumeration value="_web"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileAttachFrom", namespace = "urn:types.filecabinet_2010_2.documents.webservices.netsuite.com")
@XmlEnum
public enum FileAttachFrom {

    @XmlEnumValue("_computer")
    COMPUTER("_computer"),
    @XmlEnumValue("_web")
    WEB("_web");
    private final String value;

    FileAttachFrom(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileAttachFrom fromValue(String v) {
        for (FileAttachFrom c: FileAttachFrom.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
