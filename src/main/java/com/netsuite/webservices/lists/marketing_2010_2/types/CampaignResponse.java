
package com.netsuite.webservices.lists.marketing_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CampaignResponse.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CampaignResponse">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_bouncedOther"/>
 *     &lt;enumeration value="_clickedThrough"/>
 *     &lt;enumeration value="_failedDeliveryFailure"/>
 *     &lt;enumeration value="_failedSpam"/>
 *     &lt;enumeration value="_invalidAddress"/>
 *     &lt;enumeration value="_invalidSenderAddress"/>
 *     &lt;enumeration value="_mailboxDisabled"/>
 *     &lt;enumeration value="_mailboxIsFull"/>
 *     &lt;enumeration value="_mailboxNotAcceptingMessages"/>
 *     &lt;enumeration value="_mailProtocolIssues"/>
 *     &lt;enumeration value="_mediaError"/>
 *     &lt;enumeration value="_messageExceedsSizeLengthLimits"/>
 *     &lt;enumeration value="_networkServerIssues"/>
 *     &lt;enumeration value="_opened"/>
 *     &lt;enumeration value="_purchased"/>
 *     &lt;enumeration value="_queued"/>
 *     &lt;enumeration value="_received"/>
 *     &lt;enumeration value="_responded"/>
 *     &lt;enumeration value="_securityIssues"/>
 *     &lt;enumeration value="_sent"/>
 *     &lt;enumeration value="_subscribed"/>
 *     &lt;enumeration value="_tooManyRecipients"/>
 *     &lt;enumeration value="_unsubscribed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CampaignResponse", namespace = "urn:types.marketing_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CampaignResponse {

    @XmlEnumValue("_bouncedOther")
    BOUNCED_OTHER("_bouncedOther"),
    @XmlEnumValue("_clickedThrough")
    CLICKED_THROUGH("_clickedThrough"),
    @XmlEnumValue("_failedDeliveryFailure")
    FAILED_DELIVERY_FAILURE("_failedDeliveryFailure"),
    @XmlEnumValue("_failedSpam")
    FAILED_SPAM("_failedSpam"),
    @XmlEnumValue("_invalidAddress")
    INVALID_ADDRESS("_invalidAddress"),
    @XmlEnumValue("_invalidSenderAddress")
    INVALID_SENDER_ADDRESS("_invalidSenderAddress"),
    @XmlEnumValue("_mailboxDisabled")
    MAILBOX_DISABLED("_mailboxDisabled"),
    @XmlEnumValue("_mailboxIsFull")
    MAILBOX_IS_FULL("_mailboxIsFull"),
    @XmlEnumValue("_mailboxNotAcceptingMessages")
    MAILBOX_NOT_ACCEPTING_MESSAGES("_mailboxNotAcceptingMessages"),
    @XmlEnumValue("_mailProtocolIssues")
    MAIL_PROTOCOL_ISSUES("_mailProtocolIssues"),
    @XmlEnumValue("_mediaError")
    MEDIA_ERROR("_mediaError"),
    @XmlEnumValue("_messageExceedsSizeLengthLimits")
    MESSAGE_EXCEEDS_SIZE_LENGTH_LIMITS("_messageExceedsSizeLengthLimits"),
    @XmlEnumValue("_networkServerIssues")
    NETWORK_SERVER_ISSUES("_networkServerIssues"),
    @XmlEnumValue("_opened")
    OPENED("_opened"),
    @XmlEnumValue("_purchased")
    PURCHASED("_purchased"),
    @XmlEnumValue("_queued")
    QUEUED("_queued"),
    @XmlEnumValue("_received")
    RECEIVED("_received"),
    @XmlEnumValue("_responded")
    RESPONDED("_responded"),
    @XmlEnumValue("_securityIssues")
    SECURITY_ISSUES("_securityIssues"),
    @XmlEnumValue("_sent")
    SENT("_sent"),
    @XmlEnumValue("_subscribed")
    SUBSCRIBED("_subscribed"),
    @XmlEnumValue("_tooManyRecipients")
    TOO_MANY_RECIPIENTS("_tooManyRecipients"),
    @XmlEnumValue("_unsubscribed")
    UNSUBSCRIBED("_unsubscribed");
    private final String value;

    CampaignResponse(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CampaignResponse fromValue(String v) {
        for (CampaignResponse c: CampaignResponse.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
