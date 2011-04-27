
package com.netsuite.webservices.documents.filecabinet_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileEncoding.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileEncoding">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_autoDetect"/>
 *     &lt;enumeration value="_shiftJis"/>
 *     &lt;enumeration value="_utf8"/>
 *     &lt;enumeration value="_windows1252"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileEncoding", namespace = "urn:types.filecabinet_2010_2.documents.webservices.netsuite.com")
@XmlEnum
public enum FileEncoding {

    @XmlEnumValue("_autoDetect")
    AUTO_DETECT("_autoDetect"),
    @XmlEnumValue("_shiftJis")
    SHIFT_JIS("_shiftJis"),
    @XmlEnumValue("_utf8")
    UTF_8("_utf8"),
    @XmlEnumValue("_windows1252")
    WINDOWS_1252("_windows1252");
    private final String value;

    FileEncoding(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileEncoding fromValue(String v) {
        for (FileEncoding c: FileEncoding.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
