
package com.netsuite.webservices.lists.marketing_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignResponseCategory.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignResponseCategory">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_bounced"/>
 *     &lt;enumeration value="_clickedThrough"/>
 *     &lt;enumeration value="_purchased"/>
 *     &lt;enumeration value="_queued"/>
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
@XmlType(name = "CampaignResponseCategory", namespace = "urn:types.marketing_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignResponseCategory {

    @XmlEnumValue("_bounced")
    BOUNCED("_bounced"),
    @XmlEnumValue("_clickedThrough")
    CLICKED_THROUGH("_clickedThrough"),
    @XmlEnumValue("_purchased")
    PURCHASED("_purchased"),
    @XmlEnumValue("_queued")
    QUEUED("_queued"),
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

    CampaignResponseCategory(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignResponseCategory fromValue(String v) {
        for (CampaignResponseCategory c: CampaignResponseCategory.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
