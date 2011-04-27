
package com.netsuite.webservices.platform.faults_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for StatusDetailType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusDetailType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="WARN"/>
 *     &lt;enumeration value="INFO"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusDetailType", namespace = "urn:types.faults_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum StatusDetailType {

    ERROR,
    WARN,
    INFO;

    public String value() {
        return name();
    }

    public static StatusDetailType fromValue(String v) {
        return valueOf(v);
    }

}
