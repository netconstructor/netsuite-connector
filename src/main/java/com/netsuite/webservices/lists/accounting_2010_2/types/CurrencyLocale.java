
package com.netsuite.webservices.lists.accounting_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurrencyLocale.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CurrencyLocale">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_albaniaAlbanian"/>
 *     &lt;enumeration value="_algeriaArabic"/>
 *     &lt;enumeration value="_argentinaSpanish"/>
 *     &lt;enumeration value="_australiaEnglish"/>
 *     &lt;enumeration value="_austriaGerman"/>
 *     &lt;enumeration value="_bahrainArabic"/>
 *     &lt;enumeration value="_belarusByelorussian"/>
 *     &lt;enumeration value="_belgiumDutch"/>
 *     &lt;enumeration value="_belgiumFrench"/>
 *     &lt;enumeration value="_boliviaSpanish"/>
 *     &lt;enumeration value="_bengali"/>
 *     &lt;enumeration value="_brazilPortuguese"/>
 *     &lt;enumeration value="_bulgariaBulgarian"/>
 *     &lt;enumeration value="_canadaEnglish"/>
 *     &lt;enumeration value="_canadaFrench"/>
 *     &lt;enumeration value="_chileSpanish"/>
 *     &lt;enumeration value="_chinaChinese"/>
 *     &lt;enumeration value="_colombiaSpanish"/>
 *     &lt;enumeration value="_costaRicaSpanish"/>
 *     &lt;enumeration value="_croatiaCroatian"/>
 *     &lt;enumeration value="_czechRepublicCzech"/>
 *     &lt;enumeration value="_denmarkDanish"/>
 *     &lt;enumeration value="_dominicanRepublicSpanish"/>
 *     &lt;enumeration value="_ecuadorSpanish"/>
 *     &lt;enumeration value="_egyptArabic"/>
 *     &lt;enumeration value="_elSalvadorSpanish"/>
 *     &lt;enumeration value="_estoniaEstonian"/>
 *     &lt;enumeration value="_finlandFinnish"/>
 *     &lt;enumeration value="_franceFrench"/>
 *     &lt;enumeration value="_germanyGerman"/>
 *     &lt;enumeration value="_greeceGreek"/>
 *     &lt;enumeration value="_guatemalaSpanish"/>
 *     &lt;enumeration value="_haitian"/>
 *     &lt;enumeration value="_hondurasSpanish"/>
 *     &lt;enumeration value="_hongKongChinese"/>
 *     &lt;enumeration value="_hungaryHungarian"/>
 *     &lt;enumeration value="_icelandIcelandic"/>
 *     &lt;enumeration value="_indiaEnglish"/>
 *     &lt;enumeration value="_indonesiaIndonesian"/>
 *     &lt;enumeration value="_iraqArabic"/>
 *     &lt;enumeration value="_irelandEnglish"/>
 *     &lt;enumeration value="_israelHebrew"/>
 *     &lt;enumeration value="_italyItalian"/>
 *     &lt;enumeration value="_japanJapanese"/>
 *     &lt;enumeration value="_jordanArabic"/>
 *     &lt;enumeration value="_kuwaitArabic"/>
 *     &lt;enumeration value="_latviaLatvianLettish"/>
 *     &lt;enumeration value="_lebanonArabic"/>
 *     &lt;enumeration value="_libyaArabic"/>
 *     &lt;enumeration value="_lithuaniaLithuanian"/>
 *     &lt;enumeration value="_luxembourgFrench"/>
 *     &lt;enumeration value="_luxembourgGerman"/>
 *     &lt;enumeration value="_macedoniaMacedonian"/>
 *     &lt;enumeration value="_malaysiaMalay"/>
 *     &lt;enumeration value="_mexicoSpanish"/>
 *     &lt;enumeration value="_moroccoArabic"/>
 *     &lt;enumeration value="_netherlandsDutch"/>
 *     &lt;enumeration value="_newZealandEnglish"/>
 *     &lt;enumeration value="_nicaraguaSpanish"/>
 *     &lt;enumeration value="_nigeriaEnglish"/>
 *     &lt;enumeration value="_norwayNorwegian"/>
 *     &lt;enumeration value="_omanArabic"/>
 *     &lt;enumeration value="_panamaSpanish"/>
 *     &lt;enumeration value="_paraguaySpanish"/>
 *     &lt;enumeration value="_peruSpanish"/>
 *     &lt;enumeration value="_philippinesEnglish"/>
 *     &lt;enumeration value="_philippinesTagalog"/>
 *     &lt;enumeration value="_polandPolish"/>
 *     &lt;enumeration value="_portugalPortuguese"/>
 *     &lt;enumeration value="_puertoRicoSpanish"/>
 *     &lt;enumeration value="_qatarArabic"/>
 *     &lt;enumeration value="_romaniaRomanian"/>
 *     &lt;enumeration value="_russiaRussian"/>
 *     &lt;enumeration value="_saudiArabiaArabic"/>
 *     &lt;enumeration value="_singaporeEnglish"/>
 *     &lt;enumeration value="_slovakiaSlovak"/>
 *     &lt;enumeration value="_sloveniaSlovenian"/>
 *     &lt;enumeration value="_southAfricaEnglish"/>
 *     &lt;enumeration value="_southKoreaKorean"/>
 *     &lt;enumeration value="_spainCatalan"/>
 *     &lt;enumeration value="_spainSpanish"/>
 *     &lt;enumeration value="_sudanArabic"/>
 *     &lt;enumeration value="_swedenSwedish"/>
 *     &lt;enumeration value="_switzerlandFrench"/>
 *     &lt;enumeration value="_switzerlandGerman"/>
 *     &lt;enumeration value="_switzerlandItalian"/>
 *     &lt;enumeration value="_syriaArabic"/>
 *     &lt;enumeration value="_taiwanChinese"/>
 *     &lt;enumeration value="_thailandThai"/>
 *     &lt;enumeration value="_tunisiaArabic"/>
 *     &lt;enumeration value="_turkeyTurkish"/>
 *     &lt;enumeration value="_ukraineUkrainian"/>
 *     &lt;enumeration value="_unitedArabEmiratesArabic"/>
 *     &lt;enumeration value="_unitedKingdomEnglish"/>
 *     &lt;enumeration value="_unitedStatesEnglish"/>
 *     &lt;enumeration value="_uruguaySpanish"/>
 *     &lt;enumeration value="_venezuelaSpanish"/>
 *     &lt;enumeration value="_yemenArabic"/>
 *     &lt;enumeration value="_yugoslaviaSerbian"/>
 *     &lt;enumeration value="_yugoslaviaSerboCroatian"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CurrencyLocale", namespace = "urn:types.accounting_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum CurrencyLocale {

    @XmlEnumValue("_albaniaAlbanian")
    ALBANIA_ALBANIAN("_albaniaAlbanian"),
    @XmlEnumValue("_algeriaArabic")
    ALGERIA_ARABIC("_algeriaArabic"),
    @XmlEnumValue("_argentinaSpanish")
    ARGENTINA_SPANISH("_argentinaSpanish"),
    @XmlEnumValue("_australiaEnglish")
    AUSTRALIA_ENGLISH("_australiaEnglish"),
    @XmlEnumValue("_austriaGerman")
    AUSTRIA_GERMAN("_austriaGerman"),
    @XmlEnumValue("_bahrainArabic")
    BAHRAIN_ARABIC("_bahrainArabic"),
    @XmlEnumValue("_belarusByelorussian")
    BELARUS_BYELORUSSIAN("_belarusByelorussian"),
    @XmlEnumValue("_belgiumDutch")
    BELGIUM_DUTCH("_belgiumDutch"),
    @XmlEnumValue("_belgiumFrench")
    BELGIUM_FRENCH("_belgiumFrench"),
    @XmlEnumValue("_boliviaSpanish")
    BOLIVIA_SPANISH("_boliviaSpanish"),
    @XmlEnumValue("_bengali")
    BENGALI("_bengali"),
    @XmlEnumValue("_brazilPortuguese")
    BRAZIL_PORTUGUESE("_brazilPortuguese"),
    @XmlEnumValue("_bulgariaBulgarian")
    BULGARIA_BULGARIAN("_bulgariaBulgarian"),
    @XmlEnumValue("_canadaEnglish")
    CANADA_ENGLISH("_canadaEnglish"),
    @XmlEnumValue("_canadaFrench")
    CANADA_FRENCH("_canadaFrench"),
    @XmlEnumValue("_chileSpanish")
    CHILE_SPANISH("_chileSpanish"),
    @XmlEnumValue("_chinaChinese")
    CHINA_CHINESE("_chinaChinese"),
    @XmlEnumValue("_colombiaSpanish")
    COLOMBIA_SPANISH("_colombiaSpanish"),
    @XmlEnumValue("_costaRicaSpanish")
    COSTA_RICA_SPANISH("_costaRicaSpanish"),
    @XmlEnumValue("_croatiaCroatian")
    CROATIA_CROATIAN("_croatiaCroatian"),
    @XmlEnumValue("_czechRepublicCzech")
    CZECH_REPUBLIC_CZECH("_czechRepublicCzech"),
    @XmlEnumValue("_denmarkDanish")
    DENMARK_DANISH("_denmarkDanish"),
    @XmlEnumValue("_dominicanRepublicSpanish")
    DOMINICAN_REPUBLIC_SPANISH("_dominicanRepublicSpanish"),
    @XmlEnumValue("_ecuadorSpanish")
    ECUADOR_SPANISH("_ecuadorSpanish"),
    @XmlEnumValue("_egyptArabic")
    EGYPT_ARABIC("_egyptArabic"),
    @XmlEnumValue("_elSalvadorSpanish")
    EL_SALVADOR_SPANISH("_elSalvadorSpanish"),
    @XmlEnumValue("_estoniaEstonian")
    ESTONIA_ESTONIAN("_estoniaEstonian"),
    @XmlEnumValue("_finlandFinnish")
    FINLAND_FINNISH("_finlandFinnish"),
    @XmlEnumValue("_franceFrench")
    FRANCE_FRENCH("_franceFrench"),
    @XmlEnumValue("_germanyGerman")
    GERMANY_GERMAN("_germanyGerman"),
    @XmlEnumValue("_greeceGreek")
    GREECE_GREEK("_greeceGreek"),
    @XmlEnumValue("_guatemalaSpanish")
    GUATEMALA_SPANISH("_guatemalaSpanish"),
    @XmlEnumValue("_haitian")
    HAITIAN("_haitian"),
    @XmlEnumValue("_hondurasSpanish")
    HONDURAS_SPANISH("_hondurasSpanish"),
    @XmlEnumValue("_hongKongChinese")
    HONG_KONG_CHINESE("_hongKongChinese"),
    @XmlEnumValue("_hungaryHungarian")
    HUNGARY_HUNGARIAN("_hungaryHungarian"),
    @XmlEnumValue("_icelandIcelandic")
    ICELAND_ICELANDIC("_icelandIcelandic"),
    @XmlEnumValue("_indiaEnglish")
    INDIA_ENGLISH("_indiaEnglish"),
    @XmlEnumValue("_indonesiaIndonesian")
    INDONESIA_INDONESIAN("_indonesiaIndonesian"),
    @XmlEnumValue("_iraqArabic")
    IRAQ_ARABIC("_iraqArabic"),
    @XmlEnumValue("_irelandEnglish")
    IRELAND_ENGLISH("_irelandEnglish"),
    @XmlEnumValue("_israelHebrew")
    ISRAEL_HEBREW("_israelHebrew"),
    @XmlEnumValue("_italyItalian")
    ITALY_ITALIAN("_italyItalian"),
    @XmlEnumValue("_japanJapanese")
    JAPAN_JAPANESE("_japanJapanese"),
    @XmlEnumValue("_jordanArabic")
    JORDAN_ARABIC("_jordanArabic"),
    @XmlEnumValue("_kuwaitArabic")
    KUWAIT_ARABIC("_kuwaitArabic"),
    @XmlEnumValue("_latviaLatvianLettish")
    LATVIA_LATVIAN_LETTISH("_latviaLatvianLettish"),
    @XmlEnumValue("_lebanonArabic")
    LEBANON_ARABIC("_lebanonArabic"),
    @XmlEnumValue("_libyaArabic")
    LIBYA_ARABIC("_libyaArabic"),
    @XmlEnumValue("_lithuaniaLithuanian")
    LITHUANIA_LITHUANIAN("_lithuaniaLithuanian"),
    @XmlEnumValue("_luxembourgFrench")
    LUXEMBOURG_FRENCH("_luxembourgFrench"),
    @XmlEnumValue("_luxembourgGerman")
    LUXEMBOURG_GERMAN("_luxembourgGerman"),
    @XmlEnumValue("_macedoniaMacedonian")
    MACEDONIA_MACEDONIAN("_macedoniaMacedonian"),
    @XmlEnumValue("_malaysiaMalay")
    MALAYSIA_MALAY("_malaysiaMalay"),
    @XmlEnumValue("_mexicoSpanish")
    MEXICO_SPANISH("_mexicoSpanish"),
    @XmlEnumValue("_moroccoArabic")
    MOROCCO_ARABIC("_moroccoArabic"),
    @XmlEnumValue("_netherlandsDutch")
    NETHERLANDS_DUTCH("_netherlandsDutch"),
    @XmlEnumValue("_newZealandEnglish")
    NEW_ZEALAND_ENGLISH("_newZealandEnglish"),
    @XmlEnumValue("_nicaraguaSpanish")
    NICARAGUA_SPANISH("_nicaraguaSpanish"),
    @XmlEnumValue("_nigeriaEnglish")
    NIGERIA_ENGLISH("_nigeriaEnglish"),
    @XmlEnumValue("_norwayNorwegian")
    NORWAY_NORWEGIAN("_norwayNorwegian"),
    @XmlEnumValue("_omanArabic")
    OMAN_ARABIC("_omanArabic"),
    @XmlEnumValue("_panamaSpanish")
    PANAMA_SPANISH("_panamaSpanish"),
    @XmlEnumValue("_paraguaySpanish")
    PARAGUAY_SPANISH("_paraguaySpanish"),
    @XmlEnumValue("_peruSpanish")
    PERU_SPANISH("_peruSpanish"),
    @XmlEnumValue("_philippinesEnglish")
    PHILIPPINES_ENGLISH("_philippinesEnglish"),
    @XmlEnumValue("_philippinesTagalog")
    PHILIPPINES_TAGALOG("_philippinesTagalog"),
    @XmlEnumValue("_polandPolish")
    POLAND_POLISH("_polandPolish"),
    @XmlEnumValue("_portugalPortuguese")
    PORTUGAL_PORTUGUESE("_portugalPortuguese"),
    @XmlEnumValue("_puertoRicoSpanish")
    PUERTO_RICO_SPANISH("_puertoRicoSpanish"),
    @XmlEnumValue("_qatarArabic")
    QATAR_ARABIC("_qatarArabic"),
    @XmlEnumValue("_romaniaRomanian")
    ROMANIA_ROMANIAN("_romaniaRomanian"),
    @XmlEnumValue("_russiaRussian")
    RUSSIA_RUSSIAN("_russiaRussian"),
    @XmlEnumValue("_saudiArabiaArabic")
    SAUDI_ARABIA_ARABIC("_saudiArabiaArabic"),
    @XmlEnumValue("_singaporeEnglish")
    SINGAPORE_ENGLISH("_singaporeEnglish"),
    @XmlEnumValue("_slovakiaSlovak")
    SLOVAKIA_SLOVAK("_slovakiaSlovak"),
    @XmlEnumValue("_sloveniaSlovenian")
    SLOVENIA_SLOVENIAN("_sloveniaSlovenian"),
    @XmlEnumValue("_southAfricaEnglish")
    SOUTH_AFRICA_ENGLISH("_southAfricaEnglish"),
    @XmlEnumValue("_southKoreaKorean")
    SOUTH_KOREA_KOREAN("_southKoreaKorean"),
    @XmlEnumValue("_spainCatalan")
    SPAIN_CATALAN("_spainCatalan"),
    @XmlEnumValue("_spainSpanish")
    SPAIN_SPANISH("_spainSpanish"),
    @XmlEnumValue("_sudanArabic")
    SUDAN_ARABIC("_sudanArabic"),
    @XmlEnumValue("_swedenSwedish")
    SWEDEN_SWEDISH("_swedenSwedish"),
    @XmlEnumValue("_switzerlandFrench")
    SWITZERLAND_FRENCH("_switzerlandFrench"),
    @XmlEnumValue("_switzerlandGerman")
    SWITZERLAND_GERMAN("_switzerlandGerman"),
    @XmlEnumValue("_switzerlandItalian")
    SWITZERLAND_ITALIAN("_switzerlandItalian"),
    @XmlEnumValue("_syriaArabic")
    SYRIA_ARABIC("_syriaArabic"),
    @XmlEnumValue("_taiwanChinese")
    TAIWAN_CHINESE("_taiwanChinese"),
    @XmlEnumValue("_thailandThai")
    THAILAND_THAI("_thailandThai"),
    @XmlEnumValue("_tunisiaArabic")
    TUNISIA_ARABIC("_tunisiaArabic"),
    @XmlEnumValue("_turkeyTurkish")
    TURKEY_TURKISH("_turkeyTurkish"),
    @XmlEnumValue("_ukraineUkrainian")
    UKRAINE_UKRAINIAN("_ukraineUkrainian"),
    @XmlEnumValue("_unitedArabEmiratesArabic")
    UNITED_ARAB_EMIRATES_ARABIC("_unitedArabEmiratesArabic"),
    @XmlEnumValue("_unitedKingdomEnglish")
    UNITED_KINGDOM_ENGLISH("_unitedKingdomEnglish"),
    @XmlEnumValue("_unitedStatesEnglish")
    UNITED_STATES_ENGLISH("_unitedStatesEnglish"),
    @XmlEnumValue("_uruguaySpanish")
    URUGUAY_SPANISH("_uruguaySpanish"),
    @XmlEnumValue("_venezuelaSpanish")
    VENEZUELA_SPANISH("_venezuelaSpanish"),
    @XmlEnumValue("_yemenArabic")
    YEMEN_ARABIC("_yemenArabic"),
    @XmlEnumValue("_yugoslaviaSerbian")
    YUGOSLAVIA_SERBIAN("_yugoslaviaSerbian"),
    @XmlEnumValue("_yugoslaviaSerboCroatian")
    YUGOSLAVIA_SERBO_CROATIAN("_yugoslaviaSerboCroatian");
    private final String value;

    CurrencyLocale(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurrencyLocale fromValue(String v) {
        for (CurrencyLocale c: CurrencyLocale.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
