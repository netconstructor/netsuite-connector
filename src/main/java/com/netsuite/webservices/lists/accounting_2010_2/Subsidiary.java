/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.accounting_2010_2;

import com.netsuite.webservices.platform.common_2010_2.types.Country;
import com.netsuite.webservices.platform.core_2010_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Subsidiary complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Subsidiary">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="showSubsidiaryName" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="url" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="logo" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="tranPrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pageLogo" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="attention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="addrText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="override" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnAddr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="returnCountry" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="returnZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="legalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isElimination" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="allowPayroll" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="federalIdNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addrLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nonConsol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="consol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipAddress1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipAddress2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipCountry" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="shipZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state1TaxNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ssnOrTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interCoAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="nexusList" type="{urn:accounting_2010_2.lists.webservices.netsuite.com}SubsidiaryNexusList" minOccurs="0"/>
 *         &lt;element name="checkLayout" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="classTranslationList" type="{urn:accounting_2010_2.lists.webservices.netsuite.com}ClassTranslationList" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subsidiary", propOrder = {
    "name",
    "parent",
    "isInactive",
    "showSubsidiaryName",
    "url",
    "logo",
    "tranPrefix",
    "pageLogo",
    "attention",
    "addressee",
    "addrPhone",
    "addr1",
    "addr2",
    "addr3",
    "city",
    "state",
    "zip",
    "country",
    "addrText",
    "override",
    "shipAddr",
    "returnAddr",
    "returnAddress1",
    "returnAddress2",
    "returnCity",
    "returnState",
    "returnCountry",
    "returnZip",
    "legalName",
    "isElimination",
    "allowPayroll",
    "email",
    "currency",
    "fax",
    "edition",
    "federalIdNumber",
    "addrLanguage",
    "nonConsol",
    "consol",
    "shipAddress1",
    "shipAddress2",
    "shipCity",
    "shipState",
    "shipCountry",
    "shipZip",
    "state1TaxNumber",
    "ssnOrTin",
    "interCoAccount",
    "nexusList",
    "checkLayout",
    "classTranslationList",
    "customFieldList"
})
public class Subsidiary
    extends Record
{

    protected String name;
    protected RecordRef parent;
    protected Boolean isInactive;
    protected Boolean showSubsidiaryName;
    protected String url;
    protected RecordRef logo;
    protected String tranPrefix;
    protected RecordRef pageLogo;
    protected String attention;
    protected String addressee;
    protected String addrPhone;
    protected String addr1;
    protected String addr2;
    protected String addr3;
    protected String city;
    protected String state;
    protected String zip;
    protected Country country;
    protected String addrText;
    protected Boolean override;
    protected String shipAddr;
    protected String returnAddr;
    protected String returnAddress1;
    protected String returnAddress2;
    protected String returnCity;
    protected String returnState;
    protected Country returnCountry;
    protected String returnZip;
    protected String legalName;
    protected Boolean isElimination;
    protected Boolean allowPayroll;
    protected String email;
    protected RecordRef currency;
    protected String fax;
    protected String edition;
    protected String federalIdNumber;
    protected String addrLanguage;
    protected String nonConsol;
    protected String consol;
    protected String shipAddress1;
    protected String shipAddress2;
    protected String shipCity;
    protected String shipState;
    protected Country shipCountry;
    protected String shipZip;
    protected String state1TaxNumber;
    protected String ssnOrTin;
    protected RecordRef interCoAccount;
    protected SubsidiaryNexusList nexusList;
    protected RecordRef checkLayout;
    protected ClassTranslationList classTranslationList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setParent(RecordRef value) {
        this.parent = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the showSubsidiaryName property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowSubsidiaryName() {
        return showSubsidiaryName;
    }

    /**
     * Sets the value of the showSubsidiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowSubsidiaryName(Boolean value) {
        this.showSubsidiaryName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setLogo(RecordRef value) {
        this.logo = value;
    }

    /**
     * Gets the value of the tranPrefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranPrefix() {
        return tranPrefix;
    }

    /**
     * Sets the value of the tranPrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranPrefix(String value) {
        this.tranPrefix = value;
    }

    /**
     * Gets the value of the pageLogo property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPageLogo() {
        return pageLogo;
    }

    /**
     * Sets the value of the pageLogo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPageLogo(RecordRef value) {
        this.pageLogo = value;
    }

    /**
     * Gets the value of the attention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttention() {
        return attention;
    }

    /**
     * Sets the value of the attention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttention(String value) {
        this.attention = value;
    }

    /**
     * Gets the value of the addressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressee() {
        return addressee;
    }

    /**
     * Sets the value of the addressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressee(String value) {
        this.addressee = value;
    }

    /**
     * Gets the value of the addrPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrPhone() {
        return addrPhone;
    }

    /**
     * Sets the value of the addrPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrPhone(String value) {
        this.addrPhone = value;
    }

    /**
     * Gets the value of the addr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr1() {
        return addr1;
    }

    /**
     * Sets the value of the addr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr1(String value) {
        this.addr1 = value;
    }

    /**
     * Gets the value of the addr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr2() {
        return addr2;
    }

    /**
     * Sets the value of the addr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr2(String value) {
        this.addr2 = value;
    }

    /**
     * Gets the value of the addr3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddr3() {
        return addr3;
    }

    /**
     * Sets the value of the addr3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddr3(String value) {
        this.addr3 = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the addrText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrText() {
        return addrText;
    }

    /**
     * Sets the value of the addrText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrText(String value) {
        this.addrText = value;
    }

    /**
     * Gets the value of the override property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOverride() {
        return override;
    }

    /**
     * Sets the value of the override property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOverride(Boolean value) {
        this.override = value;
    }

    /**
     * Gets the value of the shipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddr() {
        return shipAddr;
    }

    /**
     * Sets the value of the shipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddr(String value) {
        this.shipAddr = value;
    }

    /**
     * Gets the value of the returnAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddr() {
        return returnAddr;
    }

    /**
     * Sets the value of the returnAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddr(String value) {
        this.returnAddr = value;
    }

    /**
     * Gets the value of the returnAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress1() {
        return returnAddress1;
    }

    /**
     * Sets the value of the returnAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress1(String value) {
        this.returnAddress1 = value;
    }

    /**
     * Gets the value of the returnAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnAddress2() {
        return returnAddress2;
    }

    /**
     * Sets the value of the returnAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnAddress2(String value) {
        this.returnAddress2 = value;
    }

    /**
     * Gets the value of the returnCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnCity() {
        return returnCity;
    }

    /**
     * Sets the value of the returnCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnCity(String value) {
        this.returnCity = value;
    }

    /**
     * Gets the value of the returnState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnState() {
        return returnState;
    }

    /**
     * Sets the value of the returnState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnState(String value) {
        this.returnState = value;
    }

    /**
     * Gets the value of the returnCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getReturnCountry() {
        return returnCountry;
    }

    /**
     * Sets the value of the returnCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setReturnCountry(Country value) {
        this.returnCountry = value;
    }

    /**
     * Gets the value of the returnZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnZip() {
        return returnZip;
    }

    /**
     * Sets the value of the returnZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnZip(String value) {
        this.returnZip = value;
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    /**
     * Gets the value of the isElimination property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsElimination() {
        return isElimination;
    }

    /**
     * Sets the value of the isElimination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsElimination(Boolean value) {
        this.isElimination = value;
    }

    /**
     * Gets the value of the allowPayroll property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllowPayroll() {
        return allowPayroll;
    }

    /**
     * Sets the value of the allowPayroll property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllowPayroll(Boolean value) {
        this.allowPayroll = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCurrency(RecordRef value) {
        this.currency = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the edition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdition() {
        return edition;
    }

    /**
     * Sets the value of the edition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdition(String value) {
        this.edition = value;
    }

    /**
     * Gets the value of the federalIdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFederalIdNumber() {
        return federalIdNumber;
    }

    /**
     * Sets the value of the federalIdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFederalIdNumber(String value) {
        this.federalIdNumber = value;
    }

    /**
     * Gets the value of the addrLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddrLanguage() {
        return addrLanguage;
    }

    /**
     * Sets the value of the addrLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddrLanguage(String value) {
        this.addrLanguage = value;
    }

    /**
     * Gets the value of the nonConsol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonConsol() {
        return nonConsol;
    }

    /**
     * Sets the value of the nonConsol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonConsol(String value) {
        this.nonConsol = value;
    }

    /**
     * Gets the value of the consol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsol() {
        return consol;
    }

    /**
     * Sets the value of the consol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsol(String value) {
        this.consol = value;
    }

    /**
     * Gets the value of the shipAddress1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddress1() {
        return shipAddress1;
    }

    /**
     * Sets the value of the shipAddress1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddress1(String value) {
        this.shipAddress1 = value;
    }

    /**
     * Gets the value of the shipAddress2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddress2() {
        return shipAddress2;
    }

    /**
     * Sets the value of the shipAddress2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddress2(String value) {
        this.shipAddress2 = value;
    }

    /**
     * Gets the value of the shipCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCity() {
        return shipCity;
    }

    /**
     * Sets the value of the shipCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCity(String value) {
        this.shipCity = value;
    }

    /**
     * Gets the value of the shipState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipState() {
        return shipState;
    }

    /**
     * Sets the value of the shipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipState(String value) {
        this.shipState = value;
    }

    /**
     * Gets the value of the shipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getShipCountry() {
        return shipCountry;
    }

    /**
     * Sets the value of the shipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setShipCountry(Country value) {
        this.shipCountry = value;
    }

    /**
     * Gets the value of the shipZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipZip() {
        return shipZip;
    }

    /**
     * Sets the value of the shipZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipZip(String value) {
        this.shipZip = value;
    }

    /**
     * Gets the value of the state1TaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState1TaxNumber() {
        return state1TaxNumber;
    }

    /**
     * Sets the value of the state1TaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState1TaxNumber(String value) {
        this.state1TaxNumber = value;
    }

    /**
     * Gets the value of the ssnOrTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSsnOrTin() {
        return ssnOrTin;
    }

    /**
     * Sets the value of the ssnOrTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSsnOrTin(String value) {
        this.ssnOrTin = value;
    }

    /**
     * Gets the value of the interCoAccount property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getInterCoAccount() {
        return interCoAccount;
    }

    /**
     * Sets the value of the interCoAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setInterCoAccount(RecordRef value) {
        this.interCoAccount = value;
    }

    /**
     * Gets the value of the nexusList property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiaryNexusList }
     *     
     */
    public SubsidiaryNexusList getNexusList() {
        return nexusList;
    }

    /**
     * Sets the value of the nexusList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiaryNexusList }
     *     
     */
    public void setNexusList(SubsidiaryNexusList value) {
        this.nexusList = value;
    }

    /**
     * Gets the value of the checkLayout property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCheckLayout() {
        return checkLayout;
    }

    /**
     * Sets the value of the checkLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCheckLayout(RecordRef value) {
        this.checkLayout = value;
    }

    /**
     * Gets the value of the classTranslationList property.
     * 
     * @return
     *     possible object is
     *     {@link ClassTranslationList }
     *     
     */
    public ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }

    /**
     * Sets the value of the classTranslationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassTranslationList }
     *     
     */
    public void setClassTranslationList(ClassTranslationList value) {
        this.classTranslationList = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
