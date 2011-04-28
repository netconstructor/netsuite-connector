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
 * <p>Java class for MediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MediaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_AUTOCAD"/>
 *     &lt;enumeration value="_BMPIMAGE"/>
 *     &lt;enumeration value="_CSV"/>
 *     &lt;enumeration value="_EXCEL"/>
 *     &lt;enumeration value="_FLASH"/>
 *     &lt;enumeration value="_GIFIMAGE"/>
 *     &lt;enumeration value="_GZIP"/>
 *     &lt;enumeration value="_HTMLDOC"/>
 *     &lt;enumeration value="_ICON"/>
 *     &lt;enumeration value="_IMAGE"/>
 *     &lt;enumeration value="_JAVASCRIPT"/>
 *     &lt;enumeration value="_JPGIMAGE"/>
 *     &lt;enumeration value="_MESSAGERFC"/>
 *     &lt;enumeration value="_MISCBINARY"/>
 *     &lt;enumeration value="_MISCTEXT"/>
 *     &lt;enumeration value="_MP3"/>
 *     &lt;enumeration value="_MPEGMOVIE"/>
 *     &lt;enumeration value="_MSPROJECT"/>
 *     &lt;enumeration value="_PDF"/>
 *     &lt;enumeration value="_PJPGIMAGE"/>
 *     &lt;enumeration value="_PLAINTEXT"/>
 *     &lt;enumeration value="_PNGIMAGE"/>
 *     &lt;enumeration value="_POSTSCRIPT"/>
 *     &lt;enumeration value="_POWERPOINT"/>
 *     &lt;enumeration value="_QUICKTIME"/>
 *     &lt;enumeration value="_RTF"/>
 *     &lt;enumeration value="_SMS"/>
 *     &lt;enumeration value="_STYLESHEET"/>
 *     &lt;enumeration value="_TIFFIMAGE"/>
 *     &lt;enumeration value="_VISIO"/>
 *     &lt;enumeration value="_WORD"/>
 *     &lt;enumeration value="_XMLDOC"/>
 *     &lt;enumeration value="_ZIP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MediaType", namespace = "urn:types.filecabinet_2010_2.documents.webservices.netsuite.com")
@XmlEnum
public enum MediaType {

    @XmlEnumValue("_AUTOCAD")
    AUTOCAD("_AUTOCAD"),
    @XmlEnumValue("_BMPIMAGE")
    BMPIMAGE("_BMPIMAGE"),
    @XmlEnumValue("_CSV")
    CSV("_CSV"),
    @XmlEnumValue("_EXCEL")
    EXCEL("_EXCEL"),
    @XmlEnumValue("_FLASH")
    FLASH("_FLASH"),
    @XmlEnumValue("_GIFIMAGE")
    GIFIMAGE("_GIFIMAGE"),
    @XmlEnumValue("_GZIP")
    GZIP("_GZIP"),
    @XmlEnumValue("_HTMLDOC")
    HTMLDOC("_HTMLDOC"),
    @XmlEnumValue("_ICON")
    ICON("_ICON"),
    @XmlEnumValue("_IMAGE")
    IMAGE("_IMAGE"),
    @XmlEnumValue("_JAVASCRIPT")
    JAVASCRIPT("_JAVASCRIPT"),
    @XmlEnumValue("_JPGIMAGE")
    JPGIMAGE("_JPGIMAGE"),
    @XmlEnumValue("_MESSAGERFC")
    MESSAGERFC("_MESSAGERFC"),
    @XmlEnumValue("_MISCBINARY")
    MISCBINARY("_MISCBINARY"),
    @XmlEnumValue("_MISCTEXT")
    MISCTEXT("_MISCTEXT"),
    @XmlEnumValue("_MP3")
    MP_3("_MP3"),
    @XmlEnumValue("_MPEGMOVIE")
    MPEGMOVIE("_MPEGMOVIE"),
    @XmlEnumValue("_MSPROJECT")
    MSPROJECT("_MSPROJECT"),
    @XmlEnumValue("_PDF")
    PDF("_PDF"),
    @XmlEnumValue("_PJPGIMAGE")
    PJPGIMAGE("_PJPGIMAGE"),
    @XmlEnumValue("_PLAINTEXT")
    PLAINTEXT("_PLAINTEXT"),
    @XmlEnumValue("_PNGIMAGE")
    PNGIMAGE("_PNGIMAGE"),
    @XmlEnumValue("_POSTSCRIPT")
    POSTSCRIPT("_POSTSCRIPT"),
    @XmlEnumValue("_POWERPOINT")
    POWERPOINT("_POWERPOINT"),
    @XmlEnumValue("_QUICKTIME")
    QUICKTIME("_QUICKTIME"),
    @XmlEnumValue("_RTF")
    RTF("_RTF"),
    @XmlEnumValue("_SMS")
    SMS("_SMS"),
    @XmlEnumValue("_STYLESHEET")
    STYLESHEET("_STYLESHEET"),
    @XmlEnumValue("_TIFFIMAGE")
    TIFFIMAGE("_TIFFIMAGE"),
    @XmlEnumValue("_VISIO")
    VISIO("_VISIO"),
    @XmlEnumValue("_WORD")
    WORD("_WORD"),
    @XmlEnumValue("_XMLDOC")
    XMLDOC("_XMLDOC"),
    @XmlEnumValue("_ZIP")
    ZIP("_ZIP");
    private final String value;

    MediaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MediaType fromValue(String v) {
        for (MediaType c: MediaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
