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
 * <p>Java class for CostingMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CostingMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_average"/>
 *     &lt;enumeration value="_fifo"/>
 *     &lt;enumeration value="_lifo"/>
 *     &lt;enumeration value="_lotNumbered"/>
 *     &lt;enumeration value="_serialized"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostingMethod", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum CostingMethod {

    @XmlEnumValue("_average")
    AVERAGE("_average"),
    @XmlEnumValue("_fifo")
    FIFO("_fifo"),
    @XmlEnumValue("_lifo")
    LIFO("_lifo"),
    @XmlEnumValue("_lotNumbered")
    LOT_NUMBERED("_lotNumbered"),
    @XmlEnumValue("_serialized")
    SERIALIZED("_serialized");
    private final String value;

    CostingMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CostingMethod fromValue(String v) {
        for (CostingMethod c: CostingMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
