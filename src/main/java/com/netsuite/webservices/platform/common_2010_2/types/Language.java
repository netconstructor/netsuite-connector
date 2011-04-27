
package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Language.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Language">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_arabic"/>
 *     &lt;enumeration value="_australian"/>
 *     &lt;enumeration value="_bengali"/>
 *     &lt;enumeration value="_bulgarian"/>
 *     &lt;enumeration value="_catalan"/>
 *     &lt;enumeration value="_chineseSimplified"/>
 *     &lt;enumeration value="_chineseTraditional"/>
 *     &lt;enumeration value="_croatian"/>
 *     &lt;enumeration value="_czech"/>
 *     &lt;enumeration value="_danish"/>
 *     &lt;enumeration value="_dutch"/>
 *     &lt;enumeration value="_english"/>
 *     &lt;enumeration value="_estonian"/>
 *     &lt;enumeration value="_finnish"/>
 *     &lt;enumeration value="_frenchCanada"/>
 *     &lt;enumeration value="_frenchFrance"/>
 *     &lt;enumeration value="_german"/>
 *     &lt;enumeration value="_greek"/>
 *     &lt;enumeration value="_haitian"/>
 *     &lt;enumeration value="_hebrew"/>
 *     &lt;enumeration value="_hungarian"/>
 *     &lt;enumeration value="_icelandic"/>
 *     &lt;enumeration value="_indonesian"/>
 *     &lt;enumeration value="_italian"/>
 *     &lt;enumeration value="_japanese"/>
 *     &lt;enumeration value="_korean"/>
 *     &lt;enumeration value="_latvian"/>
 *     &lt;enumeration value="_lithuanian"/>
 *     &lt;enumeration value="_norwegian"/>
 *     &lt;enumeration value="_polish"/>
 *     &lt;enumeration value="_portugueseBrazil"/>
 *     &lt;enumeration value="_portuguesePortugal"/>
 *     &lt;enumeration value="_romanian"/>
 *     &lt;enumeration value="_russian"/>
 *     &lt;enumeration value="_slovak"/>
 *     &lt;enumeration value="_slovenian"/>
 *     &lt;enumeration value="_spanish"/>
 *     &lt;enumeration value="_swedish"/>
 *     &lt;enumeration value="_thai"/>
 *     &lt;enumeration value="_turkish"/>
 *     &lt;enumeration value="_usEnglish"/>
 *     &lt;enumeration value="_vietnamese"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Language", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum Language {

    @XmlEnumValue("_arabic")
    ARABIC("_arabic"),
    @XmlEnumValue("_australian")
    AUSTRALIAN("_australian"),
    @XmlEnumValue("_bengali")
    BENGALI("_bengali"),
    @XmlEnumValue("_bulgarian")
    BULGARIAN("_bulgarian"),
    @XmlEnumValue("_catalan")
    CATALAN("_catalan"),
    @XmlEnumValue("_chineseSimplified")
    CHINESE_SIMPLIFIED("_chineseSimplified"),
    @XmlEnumValue("_chineseTraditional")
    CHINESE_TRADITIONAL("_chineseTraditional"),
    @XmlEnumValue("_croatian")
    CROATIAN("_croatian"),
    @XmlEnumValue("_czech")
    CZECH("_czech"),
    @XmlEnumValue("_danish")
    DANISH("_danish"),
    @XmlEnumValue("_dutch")
    DUTCH("_dutch"),
    @XmlEnumValue("_english")
    ENGLISH("_english"),
    @XmlEnumValue("_estonian")
    ESTONIAN("_estonian"),
    @XmlEnumValue("_finnish")
    FINNISH("_finnish"),
    @XmlEnumValue("_frenchCanada")
    FRENCH_CANADA("_frenchCanada"),
    @XmlEnumValue("_frenchFrance")
    FRENCH_FRANCE("_frenchFrance"),
    @XmlEnumValue("_german")
    GERMAN("_german"),
    @XmlEnumValue("_greek")
    GREEK("_greek"),
    @XmlEnumValue("_haitian")
    HAITIAN("_haitian"),
    @XmlEnumValue("_hebrew")
    HEBREW("_hebrew"),
    @XmlEnumValue("_hungarian")
    HUNGARIAN("_hungarian"),
    @XmlEnumValue("_icelandic")
    ICELANDIC("_icelandic"),
    @XmlEnumValue("_indonesian")
    INDONESIAN("_indonesian"),
    @XmlEnumValue("_italian")
    ITALIAN("_italian"),
    @XmlEnumValue("_japanese")
    JAPANESE("_japanese"),
    @XmlEnumValue("_korean")
    KOREAN("_korean"),
    @XmlEnumValue("_latvian")
    LATVIAN("_latvian"),
    @XmlEnumValue("_lithuanian")
    LITHUANIAN("_lithuanian"),
    @XmlEnumValue("_norwegian")
    NORWEGIAN("_norwegian"),
    @XmlEnumValue("_polish")
    POLISH("_polish"),
    @XmlEnumValue("_portugueseBrazil")
    PORTUGUESE_BRAZIL("_portugueseBrazil"),
    @XmlEnumValue("_portuguesePortugal")
    PORTUGUESE_PORTUGAL("_portuguesePortugal"),
    @XmlEnumValue("_romanian")
    ROMANIAN("_romanian"),
    @XmlEnumValue("_russian")
    RUSSIAN("_russian"),
    @XmlEnumValue("_slovak")
    SLOVAK("_slovak"),
    @XmlEnumValue("_slovenian")
    SLOVENIAN("_slovenian"),
    @XmlEnumValue("_spanish")
    SPANISH("_spanish"),
    @XmlEnumValue("_swedish")
    SWEDISH("_swedish"),
    @XmlEnumValue("_thai")
    THAI("_thai"),
    @XmlEnumValue("_turkish")
    TURKISH("_turkish"),
    @XmlEnumValue("_usEnglish")
    US_ENGLISH("_usEnglish"),
    @XmlEnumValue("_vietnamese")
    VIETNAMESE("_vietnamese");
    private final String value;

    Language(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Language fromValue(String v) {
        for (Language c: Language.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
