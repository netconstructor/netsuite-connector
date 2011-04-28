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
 * <p>Java class for CampaignResponseResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignResponseResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_bounced"/>
 *     &lt;enumeration value="_clickedThru"/>
 *     &lt;enumeration value="_purchased"/>
 *     &lt;enumeration value="_received"/>
 *     &lt;enumeration value="_responded"/>
 *     &lt;enumeration value="_sent"/>
 *     &lt;enumeration value="_subscribed"/>
 *     &lt;enumeration value="_unsubscribed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignResponseResponse", namespace = "urn:types.marketing_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignResponseResponse {

    @XmlEnumValue("_bounced")
    BOUNCED("_bounced"),
    @XmlEnumValue("_clickedThru")
    CLICKED_THRU("_clickedThru"),
    @XmlEnumValue("_purchased")
    PURCHASED("_purchased"),
    @XmlEnumValue("_received")
    RECEIVED("_received"),
    @XmlEnumValue("_responded")
    RESPONDED("_responded"),
    @XmlEnumValue("_sent")
    SENT("_sent"),
    @XmlEnumValue("_subscribed")
    SUBSCRIBED("_subscribed"),
    @XmlEnumValue("_unsubscribed")
    UNSUBSCRIBED("_unsubscribed");
    private final String value;

    CampaignResponseResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignResponseResponse fromValue(String v) {
        for (CampaignResponseResponse c: CampaignResponseResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
