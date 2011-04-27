
package com.netsuite.webservices.general.communication_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageMessageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageMessageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_email"/>
 *     &lt;enumeration value="_emailedReport"/>
 *     &lt;enumeration value="_fax"/>
 *     &lt;enumeration value="_pdf"/>
 *     &lt;enumeration value="_print"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageMessageType", namespace = "urn:types.communication_2010_2.general.webservices.netsuite.com")
@XmlEnum
public enum MessageMessageType {

    @XmlEnumValue("_email")
    EMAIL("_email"),
    @XmlEnumValue("_emailedReport")
    EMAILED_REPORT("_emailedReport"),
    @XmlEnumValue("_fax")
    FAX("_fax"),
    @XmlEnumValue("_pdf")
    PDF("_pdf"),
    @XmlEnumValue("_print")
    PRINT("_print");
    private final String value;

    MessageMessageType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageMessageType fromValue(String v) {
        for (MessageMessageType c: MessageMessageType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
