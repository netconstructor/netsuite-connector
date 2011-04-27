
package com.netsuite.webservices.platform.common_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Country.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Country">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_afghanistan"/>
 *     &lt;enumeration value="_albania"/>
 *     &lt;enumeration value="_algeria"/>
 *     &lt;enumeration value="_americanSamoa"/>
 *     &lt;enumeration value="_andorra"/>
 *     &lt;enumeration value="_angola"/>
 *     &lt;enumeration value="_anguilla"/>
 *     &lt;enumeration value="_antarctica"/>
 *     &lt;enumeration value="_antiguaAndBarbuda"/>
 *     &lt;enumeration value="_argentina"/>
 *     &lt;enumeration value="_armenia"/>
 *     &lt;enumeration value="_aruba"/>
 *     &lt;enumeration value="_australia"/>
 *     &lt;enumeration value="_austria"/>
 *     &lt;enumeration value="_azerbaijan"/>
 *     &lt;enumeration value="_bahamas"/>
 *     &lt;enumeration value="_bahrain"/>
 *     &lt;enumeration value="_bangladesh"/>
 *     &lt;enumeration value="_barbados"/>
 *     &lt;enumeration value="_belarus"/>
 *     &lt;enumeration value="_belgium"/>
 *     &lt;enumeration value="_belize"/>
 *     &lt;enumeration value="_benin"/>
 *     &lt;enumeration value="_bermuda"/>
 *     &lt;enumeration value="_bhutan"/>
 *     &lt;enumeration value="_bolivia"/>
 *     &lt;enumeration value="_bosniaAndHerzegovina"/>
 *     &lt;enumeration value="_botswana"/>
 *     &lt;enumeration value="_bouvetIsland"/>
 *     &lt;enumeration value="_brazil"/>
 *     &lt;enumeration value="_britishIndianOceanTerritory"/>
 *     &lt;enumeration value="_bruneiDarussalam"/>
 *     &lt;enumeration value="_bulgaria"/>
 *     &lt;enumeration value="_burkinaFaso"/>
 *     &lt;enumeration value="_burundi"/>
 *     &lt;enumeration value="_cambodia"/>
 *     &lt;enumeration value="_cameroon"/>
 *     &lt;enumeration value="_canada"/>
 *     &lt;enumeration value="_capVerde"/>
 *     &lt;enumeration value="_caymanIslands"/>
 *     &lt;enumeration value="_centralAfricanRepublic"/>
 *     &lt;enumeration value="_chad"/>
 *     &lt;enumeration value="_chile"/>
 *     &lt;enumeration value="_china"/>
 *     &lt;enumeration value="_christmasIsland"/>
 *     &lt;enumeration value="_cocosKeelingIslands"/>
 *     &lt;enumeration value="_colombia"/>
 *     &lt;enumeration value="_comoros"/>
 *     &lt;enumeration value="_congoDemocraticPeoplesRepublic"/>
 *     &lt;enumeration value="_congoRepublicOf"/>
 *     &lt;enumeration value="_cookIslands"/>
 *     &lt;enumeration value="_costaRica"/>
 *     &lt;enumeration value="_coteDIvoire"/>
 *     &lt;enumeration value="_croatiaHrvatska"/>
 *     &lt;enumeration value="_cuba"/>
 *     &lt;enumeration value="_cyprus"/>
 *     &lt;enumeration value="_czechRepublic"/>
 *     &lt;enumeration value="_denmark"/>
 *     &lt;enumeration value="_djibouti"/>
 *     &lt;enumeration value="_dominica"/>
 *     &lt;enumeration value="_dominicanRepublic"/>
 *     &lt;enumeration value="_eastTimor"/>
 *     &lt;enumeration value="_ecuador"/>
 *     &lt;enumeration value="_egypt"/>
 *     &lt;enumeration value="_elSalvador"/>
 *     &lt;enumeration value="_equatorialGuinea"/>
 *     &lt;enumeration value="_eritrea"/>
 *     &lt;enumeration value="_estonia"/>
 *     &lt;enumeration value="_ethiopia"/>
 *     &lt;enumeration value="_falklandIslandsMalvina"/>
 *     &lt;enumeration value="_faroeIslands"/>
 *     &lt;enumeration value="_fiji"/>
 *     &lt;enumeration value="_finland"/>
 *     &lt;enumeration value="_france"/>
 *     &lt;enumeration value="_frenchGuiana"/>
 *     &lt;enumeration value="_frenchPolynesia"/>
 *     &lt;enumeration value="_frenchSouthernTerritories"/>
 *     &lt;enumeration value="_gabon"/>
 *     &lt;enumeration value="_gambia"/>
 *     &lt;enumeration value="_georgia"/>
 *     &lt;enumeration value="_germany"/>
 *     &lt;enumeration value="_ghana"/>
 *     &lt;enumeration value="_gibraltar"/>
 *     &lt;enumeration value="_greece"/>
 *     &lt;enumeration value="_greenland"/>
 *     &lt;enumeration value="_grenada"/>
 *     &lt;enumeration value="_guadeloupe"/>
 *     &lt;enumeration value="_guam"/>
 *     &lt;enumeration value="_guatemala"/>
 *     &lt;enumeration value="_guernsey"/>
 *     &lt;enumeration value="_guinea"/>
 *     &lt;enumeration value="_guineaBissau"/>
 *     &lt;enumeration value="_guyana"/>
 *     &lt;enumeration value="_haiti"/>
 *     &lt;enumeration value="_heardAndMcDonaldIslands"/>
 *     &lt;enumeration value="_holySeeCityVaticanState"/>
 *     &lt;enumeration value="_honduras"/>
 *     &lt;enumeration value="_hongKong"/>
 *     &lt;enumeration value="_hungary"/>
 *     &lt;enumeration value="_iceland"/>
 *     &lt;enumeration value="_india"/>
 *     &lt;enumeration value="_indonesia"/>
 *     &lt;enumeration value="_iranIslamicRepublicOf"/>
 *     &lt;enumeration value="_iraq"/>
 *     &lt;enumeration value="_ireland"/>
 *     &lt;enumeration value="_isleOfMan"/>
 *     &lt;enumeration value="_israel"/>
 *     &lt;enumeration value="_italy"/>
 *     &lt;enumeration value="_jamaica"/>
 *     &lt;enumeration value="_japan"/>
 *     &lt;enumeration value="_jersey"/>
 *     &lt;enumeration value="_jordan"/>
 *     &lt;enumeration value="_kazakhstan"/>
 *     &lt;enumeration value="_kenya"/>
 *     &lt;enumeration value="_kiribati"/>
 *     &lt;enumeration value="_koreaDemocraticPeoplesRepublic"/>
 *     &lt;enumeration value="_koreaRepublicOf"/>
 *     &lt;enumeration value="_kuwait"/>
 *     &lt;enumeration value="_kyrgyzstan"/>
 *     &lt;enumeration value="_laoPeoplesDemocraticRepublic"/>
 *     &lt;enumeration value="_latvia"/>
 *     &lt;enumeration value="_lebanon"/>
 *     &lt;enumeration value="_lesotho"/>
 *     &lt;enumeration value="_liberia"/>
 *     &lt;enumeration value="_libyanArabJamahiriya"/>
 *     &lt;enumeration value="_liechtenstein"/>
 *     &lt;enumeration value="_lithuania"/>
 *     &lt;enumeration value="_luxembourg"/>
 *     &lt;enumeration value="_macau"/>
 *     &lt;enumeration value="_macedonia"/>
 *     &lt;enumeration value="_madagascar"/>
 *     &lt;enumeration value="_malawi"/>
 *     &lt;enumeration value="_malaysia"/>
 *     &lt;enumeration value="_maldives"/>
 *     &lt;enumeration value="_mali"/>
 *     &lt;enumeration value="_malta"/>
 *     &lt;enumeration value="_marshallIslands"/>
 *     &lt;enumeration value="_martinique"/>
 *     &lt;enumeration value="_mauritania"/>
 *     &lt;enumeration value="_mauritius"/>
 *     &lt;enumeration value="_mayotte"/>
 *     &lt;enumeration value="_mexico"/>
 *     &lt;enumeration value="_micronesiaFederalStateOf"/>
 *     &lt;enumeration value="_moldovaRepublicOf"/>
 *     &lt;enumeration value="_monaco"/>
 *     &lt;enumeration value="_mongolia"/>
 *     &lt;enumeration value="_montenegro"/>
 *     &lt;enumeration value="_montserrat"/>
 *     &lt;enumeration value="_morocco"/>
 *     &lt;enumeration value="_mozambique"/>
 *     &lt;enumeration value="_myanmar"/>
 *     &lt;enumeration value="_namibia"/>
 *     &lt;enumeration value="_nauru"/>
 *     &lt;enumeration value="_nepal"/>
 *     &lt;enumeration value="_netherlands"/>
 *     &lt;enumeration value="_netherlandsAntilles"/>
 *     &lt;enumeration value="_newCaledonia"/>
 *     &lt;enumeration value="_newZealand"/>
 *     &lt;enumeration value="_nicaragua"/>
 *     &lt;enumeration value="_niger"/>
 *     &lt;enumeration value="_nigeria"/>
 *     &lt;enumeration value="_niue"/>
 *     &lt;enumeration value="_norfolkIsland"/>
 *     &lt;enumeration value="_northernMarianaIslands"/>
 *     &lt;enumeration value="_norway"/>
 *     &lt;enumeration value="_oman"/>
 *     &lt;enumeration value="_pakistan"/>
 *     &lt;enumeration value="_palau"/>
 *     &lt;enumeration value="_palestinianTerritories"/>
 *     &lt;enumeration value="_panama"/>
 *     &lt;enumeration value="_papuaNewGuinea"/>
 *     &lt;enumeration value="_paraguay"/>
 *     &lt;enumeration value="_peru"/>
 *     &lt;enumeration value="_philippines"/>
 *     &lt;enumeration value="_pitcairnIsland"/>
 *     &lt;enumeration value="_poland"/>
 *     &lt;enumeration value="_portugal"/>
 *     &lt;enumeration value="_puertoRico"/>
 *     &lt;enumeration value="_qatar"/>
 *     &lt;enumeration value="_reunionIsland"/>
 *     &lt;enumeration value="_romania"/>
 *     &lt;enumeration value="_russianFederation"/>
 *     &lt;enumeration value="_rwanda"/>
 *     &lt;enumeration value="_saintKittsAndNevis"/>
 *     &lt;enumeration value="_saintLucia"/>
 *     &lt;enumeration value="_saintVincentAndTheGrenadines"/>
 *     &lt;enumeration value="_sanMarino"/>
 *     &lt;enumeration value="_saoTomeAndPrincipe"/>
 *     &lt;enumeration value="_saudiArabia"/>
 *     &lt;enumeration value="_senegal"/>
 *     &lt;enumeration value="_serbia"/>
 *     &lt;enumeration value="_seychelles"/>
 *     &lt;enumeration value="_sierraLeone"/>
 *     &lt;enumeration value="_singapore"/>
 *     &lt;enumeration value="_slovakRepublic"/>
 *     &lt;enumeration value="_slovenia"/>
 *     &lt;enumeration value="_solomonIslands"/>
 *     &lt;enumeration value="_somalia"/>
 *     &lt;enumeration value="_southAfrica"/>
 *     &lt;enumeration value="_southGeorgia"/>
 *     &lt;enumeration value="_spain"/>
 *     &lt;enumeration value="_sriLanka"/>
 *     &lt;enumeration value="_stHelena"/>
 *     &lt;enumeration value="_stPierreAndMiquelon"/>
 *     &lt;enumeration value="_sudan"/>
 *     &lt;enumeration value="_suriname"/>
 *     &lt;enumeration value="_svalbardAndJanMayenIslands"/>
 *     &lt;enumeration value="_swaziland"/>
 *     &lt;enumeration value="_sweden"/>
 *     &lt;enumeration value="_switzerland"/>
 *     &lt;enumeration value="_syrianArabRepublic"/>
 *     &lt;enumeration value="_taiwan"/>
 *     &lt;enumeration value="_tajikistan"/>
 *     &lt;enumeration value="_tanzania"/>
 *     &lt;enumeration value="_thailand"/>
 *     &lt;enumeration value="_togo"/>
 *     &lt;enumeration value="_tokelau"/>
 *     &lt;enumeration value="_tonga"/>
 *     &lt;enumeration value="_trinidadAndTobago"/>
 *     &lt;enumeration value="_tunisia"/>
 *     &lt;enumeration value="_turkey"/>
 *     &lt;enumeration value="_turkmenistan"/>
 *     &lt;enumeration value="_turksAndCaicosIslands"/>
 *     &lt;enumeration value="_tuvalu"/>
 *     &lt;enumeration value="_uganda"/>
 *     &lt;enumeration value="_ukraine"/>
 *     &lt;enumeration value="_unitedArabEmirates"/>
 *     &lt;enumeration value="_unitedKingdomGB"/>
 *     &lt;enumeration value="_unitedStates"/>
 *     &lt;enumeration value="_uruguay"/>
 *     &lt;enumeration value="_uSMinorOutlyingIslands"/>
 *     &lt;enumeration value="_uzbekistan"/>
 *     &lt;enumeration value="_vanuatu"/>
 *     &lt;enumeration value="_venezuela"/>
 *     &lt;enumeration value="_vietnam"/>
 *     &lt;enumeration value="_virginIslandsBritish"/>
 *     &lt;enumeration value="_virginIslandsUSA"/>
 *     &lt;enumeration value="_wallisAndFutunaIslands"/>
 *     &lt;enumeration value="_westernSahara"/>
 *     &lt;enumeration value="_westernSamoa"/>
 *     &lt;enumeration value="_yemen"/>
 *     &lt;enumeration value="_yugoslavia"/>
 *     &lt;enumeration value="_zambia"/>
 *     &lt;enumeration value="_zimbabwe"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Country", namespace = "urn:types.common_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum Country {

    @XmlEnumValue("_afghanistan")
    AFGHANISTAN("_afghanistan"),
    @XmlEnumValue("_albania")
    ALBANIA("_albania"),
    @XmlEnumValue("_algeria")
    ALGERIA("_algeria"),
    @XmlEnumValue("_americanSamoa")
    AMERICAN_SAMOA("_americanSamoa"),
    @XmlEnumValue("_andorra")
    ANDORRA("_andorra"),
    @XmlEnumValue("_angola")
    ANGOLA("_angola"),
    @XmlEnumValue("_anguilla")
    ANGUILLA("_anguilla"),
    @XmlEnumValue("_antarctica")
    ANTARCTICA("_antarctica"),
    @XmlEnumValue("_antiguaAndBarbuda")
    ANTIGUA_AND_BARBUDA("_antiguaAndBarbuda"),
    @XmlEnumValue("_argentina")
    ARGENTINA("_argentina"),
    @XmlEnumValue("_armenia")
    ARMENIA("_armenia"),
    @XmlEnumValue("_aruba")
    ARUBA("_aruba"),
    @XmlEnumValue("_australia")
    AUSTRALIA("_australia"),
    @XmlEnumValue("_austria")
    AUSTRIA("_austria"),
    @XmlEnumValue("_azerbaijan")
    AZERBAIJAN("_azerbaijan"),
    @XmlEnumValue("_bahamas")
    BAHAMAS("_bahamas"),
    @XmlEnumValue("_bahrain")
    BAHRAIN("_bahrain"),
    @XmlEnumValue("_bangladesh")
    BANGLADESH("_bangladesh"),
    @XmlEnumValue("_barbados")
    BARBADOS("_barbados"),
    @XmlEnumValue("_belarus")
    BELARUS("_belarus"),
    @XmlEnumValue("_belgium")
    BELGIUM("_belgium"),
    @XmlEnumValue("_belize")
    BELIZE("_belize"),
    @XmlEnumValue("_benin")
    BENIN("_benin"),
    @XmlEnumValue("_bermuda")
    BERMUDA("_bermuda"),
    @XmlEnumValue("_bhutan")
    BHUTAN("_bhutan"),
    @XmlEnumValue("_bolivia")
    BOLIVIA("_bolivia"),
    @XmlEnumValue("_bosniaAndHerzegovina")
    BOSNIA_AND_HERZEGOVINA("_bosniaAndHerzegovina"),
    @XmlEnumValue("_botswana")
    BOTSWANA("_botswana"),
    @XmlEnumValue("_bouvetIsland")
    BOUVET_ISLAND("_bouvetIsland"),
    @XmlEnumValue("_brazil")
    BRAZIL("_brazil"),
    @XmlEnumValue("_britishIndianOceanTerritory")
    BRITISH_INDIAN_OCEAN_TERRITORY("_britishIndianOceanTerritory"),
    @XmlEnumValue("_bruneiDarussalam")
    BRUNEI_DARUSSALAM("_bruneiDarussalam"),
    @XmlEnumValue("_bulgaria")
    BULGARIA("_bulgaria"),
    @XmlEnumValue("_burkinaFaso")
    BURKINA_FASO("_burkinaFaso"),
    @XmlEnumValue("_burundi")
    BURUNDI("_burundi"),
    @XmlEnumValue("_cambodia")
    CAMBODIA("_cambodia"),
    @XmlEnumValue("_cameroon")
    CAMEROON("_cameroon"),
    @XmlEnumValue("_canada")
    CANADA("_canada"),
    @XmlEnumValue("_capVerde")
    CAP_VERDE("_capVerde"),
    @XmlEnumValue("_caymanIslands")
    CAYMAN_ISLANDS("_caymanIslands"),
    @XmlEnumValue("_centralAfricanRepublic")
    CENTRAL_AFRICAN_REPUBLIC("_centralAfricanRepublic"),
    @XmlEnumValue("_chad")
    CHAD("_chad"),
    @XmlEnumValue("_chile")
    CHILE("_chile"),
    @XmlEnumValue("_china")
    CHINA("_china"),
    @XmlEnumValue("_christmasIsland")
    CHRISTMAS_ISLAND("_christmasIsland"),
    @XmlEnumValue("_cocosKeelingIslands")
    COCOS_KEELING_ISLANDS("_cocosKeelingIslands"),
    @XmlEnumValue("_colombia")
    COLOMBIA("_colombia"),
    @XmlEnumValue("_comoros")
    COMOROS("_comoros"),
    @XmlEnumValue("_congoDemocraticPeoplesRepublic")
    CONGO_DEMOCRATIC_PEOPLES_REPUBLIC("_congoDemocraticPeoplesRepublic"),
    @XmlEnumValue("_congoRepublicOf")
    CONGO_REPUBLIC_OF("_congoRepublicOf"),
    @XmlEnumValue("_cookIslands")
    COOK_ISLANDS("_cookIslands"),
    @XmlEnumValue("_costaRica")
    COSTA_RICA("_costaRica"),
    @XmlEnumValue("_coteDIvoire")
    COTE_D_IVOIRE("_coteDIvoire"),
    @XmlEnumValue("_croatiaHrvatska")
    CROATIA_HRVATSKA("_croatiaHrvatska"),
    @XmlEnumValue("_cuba")
    CUBA("_cuba"),
    @XmlEnumValue("_cyprus")
    CYPRUS("_cyprus"),
    @XmlEnumValue("_czechRepublic")
    CZECH_REPUBLIC("_czechRepublic"),
    @XmlEnumValue("_denmark")
    DENMARK("_denmark"),
    @XmlEnumValue("_djibouti")
    DJIBOUTI("_djibouti"),
    @XmlEnumValue("_dominica")
    DOMINICA("_dominica"),
    @XmlEnumValue("_dominicanRepublic")
    DOMINICAN_REPUBLIC("_dominicanRepublic"),
    @XmlEnumValue("_eastTimor")
    EAST_TIMOR("_eastTimor"),
    @XmlEnumValue("_ecuador")
    ECUADOR("_ecuador"),
    @XmlEnumValue("_egypt")
    EGYPT("_egypt"),
    @XmlEnumValue("_elSalvador")
    EL_SALVADOR("_elSalvador"),
    @XmlEnumValue("_equatorialGuinea")
    EQUATORIAL_GUINEA("_equatorialGuinea"),
    @XmlEnumValue("_eritrea")
    ERITREA("_eritrea"),
    @XmlEnumValue("_estonia")
    ESTONIA("_estonia"),
    @XmlEnumValue("_ethiopia")
    ETHIOPIA("_ethiopia"),
    @XmlEnumValue("_falklandIslandsMalvina")
    FALKLAND_ISLANDS_MALVINA("_falklandIslandsMalvina"),
    @XmlEnumValue("_faroeIslands")
    FAROE_ISLANDS("_faroeIslands"),
    @XmlEnumValue("_fiji")
    FIJI("_fiji"),
    @XmlEnumValue("_finland")
    FINLAND("_finland"),
    @XmlEnumValue("_france")
    FRANCE("_france"),
    @XmlEnumValue("_frenchGuiana")
    FRENCH_GUIANA("_frenchGuiana"),
    @XmlEnumValue("_frenchPolynesia")
    FRENCH_POLYNESIA("_frenchPolynesia"),
    @XmlEnumValue("_frenchSouthernTerritories")
    FRENCH_SOUTHERN_TERRITORIES("_frenchSouthernTerritories"),
    @XmlEnumValue("_gabon")
    GABON("_gabon"),
    @XmlEnumValue("_gambia")
    GAMBIA("_gambia"),
    @XmlEnumValue("_georgia")
    GEORGIA("_georgia"),
    @XmlEnumValue("_germany")
    GERMANY("_germany"),
    @XmlEnumValue("_ghana")
    GHANA("_ghana"),
    @XmlEnumValue("_gibraltar")
    GIBRALTAR("_gibraltar"),
    @XmlEnumValue("_greece")
    GREECE("_greece"),
    @XmlEnumValue("_greenland")
    GREENLAND("_greenland"),
    @XmlEnumValue("_grenada")
    GRENADA("_grenada"),
    @XmlEnumValue("_guadeloupe")
    GUADELOUPE("_guadeloupe"),
    @XmlEnumValue("_guam")
    GUAM("_guam"),
    @XmlEnumValue("_guatemala")
    GUATEMALA("_guatemala"),
    @XmlEnumValue("_guernsey")
    GUERNSEY("_guernsey"),
    @XmlEnumValue("_guinea")
    GUINEA("_guinea"),
    @XmlEnumValue("_guineaBissau")
    GUINEA_BISSAU("_guineaBissau"),
    @XmlEnumValue("_guyana")
    GUYANA("_guyana"),
    @XmlEnumValue("_haiti")
    HAITI("_haiti"),
    @XmlEnumValue("_heardAndMcDonaldIslands")
    HEARD_AND_MC_DONALD_ISLANDS("_heardAndMcDonaldIslands"),
    @XmlEnumValue("_holySeeCityVaticanState")
    HOLY_SEE_CITY_VATICAN_STATE("_holySeeCityVaticanState"),
    @XmlEnumValue("_honduras")
    HONDURAS("_honduras"),
    @XmlEnumValue("_hongKong")
    HONG_KONG("_hongKong"),
    @XmlEnumValue("_hungary")
    HUNGARY("_hungary"),
    @XmlEnumValue("_iceland")
    ICELAND("_iceland"),
    @XmlEnumValue("_india")
    INDIA("_india"),
    @XmlEnumValue("_indonesia")
    INDONESIA("_indonesia"),
    @XmlEnumValue("_iranIslamicRepublicOf")
    IRAN_ISLAMIC_REPUBLIC_OF("_iranIslamicRepublicOf"),
    @XmlEnumValue("_iraq")
    IRAQ("_iraq"),
    @XmlEnumValue("_ireland")
    IRELAND("_ireland"),
    @XmlEnumValue("_isleOfMan")
    ISLE_OF_MAN("_isleOfMan"),
    @XmlEnumValue("_israel")
    ISRAEL("_israel"),
    @XmlEnumValue("_italy")
    ITALY("_italy"),
    @XmlEnumValue("_jamaica")
    JAMAICA("_jamaica"),
    @XmlEnumValue("_japan")
    JAPAN("_japan"),
    @XmlEnumValue("_jersey")
    JERSEY("_jersey"),
    @XmlEnumValue("_jordan")
    JORDAN("_jordan"),
    @XmlEnumValue("_kazakhstan")
    KAZAKHSTAN("_kazakhstan"),
    @XmlEnumValue("_kenya")
    KENYA("_kenya"),
    @XmlEnumValue("_kiribati")
    KIRIBATI("_kiribati"),
    @XmlEnumValue("_koreaDemocraticPeoplesRepublic")
    KOREA_DEMOCRATIC_PEOPLES_REPUBLIC("_koreaDemocraticPeoplesRepublic"),
    @XmlEnumValue("_koreaRepublicOf")
    KOREA_REPUBLIC_OF("_koreaRepublicOf"),
    @XmlEnumValue("_kuwait")
    KUWAIT("_kuwait"),
    @XmlEnumValue("_kyrgyzstan")
    KYRGYZSTAN("_kyrgyzstan"),
    @XmlEnumValue("_laoPeoplesDemocraticRepublic")
    LAO_PEOPLES_DEMOCRATIC_REPUBLIC("_laoPeoplesDemocraticRepublic"),
    @XmlEnumValue("_latvia")
    LATVIA("_latvia"),
    @XmlEnumValue("_lebanon")
    LEBANON("_lebanon"),
    @XmlEnumValue("_lesotho")
    LESOTHO("_lesotho"),
    @XmlEnumValue("_liberia")
    LIBERIA("_liberia"),
    @XmlEnumValue("_libyanArabJamahiriya")
    LIBYAN_ARAB_JAMAHIRIYA("_libyanArabJamahiriya"),
    @XmlEnumValue("_liechtenstein")
    LIECHTENSTEIN("_liechtenstein"),
    @XmlEnumValue("_lithuania")
    LITHUANIA("_lithuania"),
    @XmlEnumValue("_luxembourg")
    LUXEMBOURG("_luxembourg"),
    @XmlEnumValue("_macau")
    MACAU("_macau"),
    @XmlEnumValue("_macedonia")
    MACEDONIA("_macedonia"),
    @XmlEnumValue("_madagascar")
    MADAGASCAR("_madagascar"),
    @XmlEnumValue("_malawi")
    MALAWI("_malawi"),
    @XmlEnumValue("_malaysia")
    MALAYSIA("_malaysia"),
    @XmlEnumValue("_maldives")
    MALDIVES("_maldives"),
    @XmlEnumValue("_mali")
    MALI("_mali"),
    @XmlEnumValue("_malta")
    MALTA("_malta"),
    @XmlEnumValue("_marshallIslands")
    MARSHALL_ISLANDS("_marshallIslands"),
    @XmlEnumValue("_martinique")
    MARTINIQUE("_martinique"),
    @XmlEnumValue("_mauritania")
    MAURITANIA("_mauritania"),
    @XmlEnumValue("_mauritius")
    MAURITIUS("_mauritius"),
    @XmlEnumValue("_mayotte")
    MAYOTTE("_mayotte"),
    @XmlEnumValue("_mexico")
    MEXICO("_mexico"),
    @XmlEnumValue("_micronesiaFederalStateOf")
    MICRONESIA_FEDERAL_STATE_OF("_micronesiaFederalStateOf"),
    @XmlEnumValue("_moldovaRepublicOf")
    MOLDOVA_REPUBLIC_OF("_moldovaRepublicOf"),
    @XmlEnumValue("_monaco")
    MONACO("_monaco"),
    @XmlEnumValue("_mongolia")
    MONGOLIA("_mongolia"),
    @XmlEnumValue("_montenegro")
    MONTENEGRO("_montenegro"),
    @XmlEnumValue("_montserrat")
    MONTSERRAT("_montserrat"),
    @XmlEnumValue("_morocco")
    MOROCCO("_morocco"),
    @XmlEnumValue("_mozambique")
    MOZAMBIQUE("_mozambique"),
    @XmlEnumValue("_myanmar")
    MYANMAR("_myanmar"),
    @XmlEnumValue("_namibia")
    NAMIBIA("_namibia"),
    @XmlEnumValue("_nauru")
    NAURU("_nauru"),
    @XmlEnumValue("_nepal")
    NEPAL("_nepal"),
    @XmlEnumValue("_netherlands")
    NETHERLANDS("_netherlands"),
    @XmlEnumValue("_netherlandsAntilles")
    NETHERLANDS_ANTILLES("_netherlandsAntilles"),
    @XmlEnumValue("_newCaledonia")
    NEW_CALEDONIA("_newCaledonia"),
    @XmlEnumValue("_newZealand")
    NEW_ZEALAND("_newZealand"),
    @XmlEnumValue("_nicaragua")
    NICARAGUA("_nicaragua"),
    @XmlEnumValue("_niger")
    NIGER("_niger"),
    @XmlEnumValue("_nigeria")
    NIGERIA("_nigeria"),
    @XmlEnumValue("_niue")
    NIUE("_niue"),
    @XmlEnumValue("_norfolkIsland")
    NORFOLK_ISLAND("_norfolkIsland"),
    @XmlEnumValue("_northernMarianaIslands")
    NORTHERN_MARIANA_ISLANDS("_northernMarianaIslands"),
    @XmlEnumValue("_norway")
    NORWAY("_norway"),
    @XmlEnumValue("_oman")
    OMAN("_oman"),
    @XmlEnumValue("_pakistan")
    PAKISTAN("_pakistan"),
    @XmlEnumValue("_palau")
    PALAU("_palau"),
    @XmlEnumValue("_palestinianTerritories")
    PALESTINIAN_TERRITORIES("_palestinianTerritories"),
    @XmlEnumValue("_panama")
    PANAMA("_panama"),
    @XmlEnumValue("_papuaNewGuinea")
    PAPUA_NEW_GUINEA("_papuaNewGuinea"),
    @XmlEnumValue("_paraguay")
    PARAGUAY("_paraguay"),
    @XmlEnumValue("_peru")
    PERU("_peru"),
    @XmlEnumValue("_philippines")
    PHILIPPINES("_philippines"),
    @XmlEnumValue("_pitcairnIsland")
    PITCAIRN_ISLAND("_pitcairnIsland"),
    @XmlEnumValue("_poland")
    POLAND("_poland"),
    @XmlEnumValue("_portugal")
    PORTUGAL("_portugal"),
    @XmlEnumValue("_puertoRico")
    PUERTO_RICO("_puertoRico"),
    @XmlEnumValue("_qatar")
    QATAR("_qatar"),
    @XmlEnumValue("_reunionIsland")
    REUNION_ISLAND("_reunionIsland"),
    @XmlEnumValue("_romania")
    ROMANIA("_romania"),
    @XmlEnumValue("_russianFederation")
    RUSSIAN_FEDERATION("_russianFederation"),
    @XmlEnumValue("_rwanda")
    RWANDA("_rwanda"),
    @XmlEnumValue("_saintKittsAndNevis")
    SAINT_KITTS_AND_NEVIS("_saintKittsAndNevis"),
    @XmlEnumValue("_saintLucia")
    SAINT_LUCIA("_saintLucia"),
    @XmlEnumValue("_saintVincentAndTheGrenadines")
    SAINT_VINCENT_AND_THE_GRENADINES("_saintVincentAndTheGrenadines"),
    @XmlEnumValue("_sanMarino")
    SAN_MARINO("_sanMarino"),
    @XmlEnumValue("_saoTomeAndPrincipe")
    SAO_TOME_AND_PRINCIPE("_saoTomeAndPrincipe"),
    @XmlEnumValue("_saudiArabia")
    SAUDI_ARABIA("_saudiArabia"),
    @XmlEnumValue("_senegal")
    SENEGAL("_senegal"),
    @XmlEnumValue("_serbia")
    SERBIA("_serbia"),
    @XmlEnumValue("_seychelles")
    SEYCHELLES("_seychelles"),
    @XmlEnumValue("_sierraLeone")
    SIERRA_LEONE("_sierraLeone"),
    @XmlEnumValue("_singapore")
    SINGAPORE("_singapore"),
    @XmlEnumValue("_slovakRepublic")
    SLOVAK_REPUBLIC("_slovakRepublic"),
    @XmlEnumValue("_slovenia")
    SLOVENIA("_slovenia"),
    @XmlEnumValue("_solomonIslands")
    SOLOMON_ISLANDS("_solomonIslands"),
    @XmlEnumValue("_somalia")
    SOMALIA("_somalia"),
    @XmlEnumValue("_southAfrica")
    SOUTH_AFRICA("_southAfrica"),
    @XmlEnumValue("_southGeorgia")
    SOUTH_GEORGIA("_southGeorgia"),
    @XmlEnumValue("_spain")
    SPAIN("_spain"),
    @XmlEnumValue("_sriLanka")
    SRI_LANKA("_sriLanka"),
    @XmlEnumValue("_stHelena")
    ST_HELENA("_stHelena"),
    @XmlEnumValue("_stPierreAndMiquelon")
    ST_PIERRE_AND_MIQUELON("_stPierreAndMiquelon"),
    @XmlEnumValue("_sudan")
    SUDAN("_sudan"),
    @XmlEnumValue("_suriname")
    SURINAME("_suriname"),
    @XmlEnumValue("_svalbardAndJanMayenIslands")
    SVALBARD_AND_JAN_MAYEN_ISLANDS("_svalbardAndJanMayenIslands"),
    @XmlEnumValue("_swaziland")
    SWAZILAND("_swaziland"),
    @XmlEnumValue("_sweden")
    SWEDEN("_sweden"),
    @XmlEnumValue("_switzerland")
    SWITZERLAND("_switzerland"),
    @XmlEnumValue("_syrianArabRepublic")
    SYRIAN_ARAB_REPUBLIC("_syrianArabRepublic"),
    @XmlEnumValue("_taiwan")
    TAIWAN("_taiwan"),
    @XmlEnumValue("_tajikistan")
    TAJIKISTAN("_tajikistan"),
    @XmlEnumValue("_tanzania")
    TANZANIA("_tanzania"),
    @XmlEnumValue("_thailand")
    THAILAND("_thailand"),
    @XmlEnumValue("_togo")
    TOGO("_togo"),
    @XmlEnumValue("_tokelau")
    TOKELAU("_tokelau"),
    @XmlEnumValue("_tonga")
    TONGA("_tonga"),
    @XmlEnumValue("_trinidadAndTobago")
    TRINIDAD_AND_TOBAGO("_trinidadAndTobago"),
    @XmlEnumValue("_tunisia")
    TUNISIA("_tunisia"),
    @XmlEnumValue("_turkey")
    TURKEY("_turkey"),
    @XmlEnumValue("_turkmenistan")
    TURKMENISTAN("_turkmenistan"),
    @XmlEnumValue("_turksAndCaicosIslands")
    TURKS_AND_CAICOS_ISLANDS("_turksAndCaicosIslands"),
    @XmlEnumValue("_tuvalu")
    TUVALU("_tuvalu"),
    @XmlEnumValue("_uganda")
    UGANDA("_uganda"),
    @XmlEnumValue("_ukraine")
    UKRAINE("_ukraine"),
    @XmlEnumValue("_unitedArabEmirates")
    UNITED_ARAB_EMIRATES("_unitedArabEmirates"),
    @XmlEnumValue("_unitedKingdomGB")
    UNITED_KINGDOM_GB("_unitedKingdomGB"),
    @XmlEnumValue("_unitedStates")
    UNITED_STATES("_unitedStates"),
    @XmlEnumValue("_uruguay")
    URUGUAY("_uruguay"),
    @XmlEnumValue("_uSMinorOutlyingIslands")
    U_S_MINOR_OUTLYING_ISLANDS("_uSMinorOutlyingIslands"),
    @XmlEnumValue("_uzbekistan")
    UZBEKISTAN("_uzbekistan"),
    @XmlEnumValue("_vanuatu")
    VANUATU("_vanuatu"),
    @XmlEnumValue("_venezuela")
    VENEZUELA("_venezuela"),
    @XmlEnumValue("_vietnam")
    VIETNAM("_vietnam"),
    @XmlEnumValue("_virginIslandsBritish")
    VIRGIN_ISLANDS_BRITISH("_virginIslandsBritish"),
    @XmlEnumValue("_virginIslandsUSA")
    VIRGIN_ISLANDS_USA("_virginIslandsUSA"),
    @XmlEnumValue("_wallisAndFutunaIslands")
    WALLIS_AND_FUTUNA_ISLANDS("_wallisAndFutunaIslands"),
    @XmlEnumValue("_westernSahara")
    WESTERN_SAHARA("_westernSahara"),
    @XmlEnumValue("_westernSamoa")
    WESTERN_SAMOA("_westernSamoa"),
    @XmlEnumValue("_yemen")
    YEMEN("_yemen"),
    @XmlEnumValue("_yugoslavia")
    YUGOSLAVIA("_yugoslavia"),
    @XmlEnumValue("_zambia")
    ZAMBIA("_zambia"),
    @XmlEnumValue("_zimbabwe")
    ZIMBABWE("_zimbabwe");
    private final String value;

    Country(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Country fromValue(String v) {
        for (Country c: Country.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
