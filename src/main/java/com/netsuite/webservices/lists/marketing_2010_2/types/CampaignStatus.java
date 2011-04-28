/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.marketing_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_closed"/>
 *     &lt;enumeration value="_completed"/>
 *     &lt;enumeration value="_execute"/>
 *     &lt;enumeration value="_inProgress"/>
 *     &lt;enumeration value="_scheduled"/>
 *     &lt;enumeration value="_sent"/>
 *     &lt;enumeration value="_toPrint"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignStatus", namespace = "urn:types.marketing_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignStatus {

    @XmlEnumValue("_closed")
    CLOSED("_closed"),
    @XmlEnumValue("_completed")
    COMPLETED("_completed"),
    @XmlEnumValue("_execute")
    EXECUTE("_execute"),
    @XmlEnumValue("_inProgress")
    IN_PROGRESS("_inProgress"),
    @XmlEnumValue("_scheduled")
    SCHEDULED("_scheduled"),
    @XmlEnumValue("_sent")
    SENT("_sent"),
    @XmlEnumValue("_toPrint")
    TO_PRINT("_toPrint");
    private final String value;

    CampaignStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignStatus fromValue(String v) {
        for (CampaignStatus c: CampaignStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
