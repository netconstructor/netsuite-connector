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
 * <p>Java class for CampaignCampaignEventType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignCampaignEventType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_default"/>
 *     &lt;enumeration value="_directMail"/>
 *     &lt;enumeration value="_email"/>
 *     &lt;enumeration value="_integration"/>
 *     &lt;enumeration value="_leadNurturingEmail"/>
 *     &lt;enumeration value="_other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignCampaignEventType", namespace = "urn:types.marketing_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignCampaignEventType {

    @XmlEnumValue("_default")
    DEFAULT("_default"),
    @XmlEnumValue("_directMail")
    DIRECT_MAIL("_directMail"),
    @XmlEnumValue("_email")
    EMAIL("_email"),
    @XmlEnumValue("_integration")
    INTEGRATION("_integration"),
    @XmlEnumValue("_leadNurturingEmail")
    LEAD_NURTURING_EMAIL("_leadNurturingEmail"),
    @XmlEnumValue("_other")
    OTHER("_other");
    private final String value;

    CampaignCampaignEventType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignCampaignEventType fromValue(String v) {
        for (CampaignCampaignEventType c: CampaignCampaignEventType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
