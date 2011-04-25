/**
 * Subsidiary.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Subsidiary  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.lang.String name;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean showSubsidiaryName;

    private java.lang.String url;

    private org.mule.module.netsuite.api.internal.RecordRef logo;

    private java.lang.String tranPrefix;

    private org.mule.module.netsuite.api.internal.RecordRef pageLogo;

    private java.lang.String attention;

    private java.lang.String addressee;

    private java.lang.String addrPhone;

    private java.lang.String addr1;

    private java.lang.String addr2;

    private java.lang.String addr3;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private org.mule.module.netsuite.api.internal.Country country;

    private java.lang.String addrText;

    private java.lang.Boolean override;

    private java.lang.String shipAddr;

    private java.lang.String returnAddr;

    private java.lang.String returnAddress1;

    private java.lang.String returnAddress2;

    private java.lang.String returnCity;

    private java.lang.String returnState;

    private org.mule.module.netsuite.api.internal.Country returnCountry;

    private java.lang.String returnZip;

    private java.lang.String legalName;

    private java.lang.Boolean isElimination;

    private java.lang.Boolean allowPayroll;

    private java.lang.String email;

    private org.mule.module.netsuite.api.internal.RecordRef currency;

    private java.lang.String fax;

    private java.lang.String edition;

    private java.lang.String federalIdNumber;

    private java.lang.String addrLanguage;

    private java.lang.String nonConsol;

    private java.lang.String consol;

    private java.lang.String shipAddress1;

    private java.lang.String shipAddress2;

    private java.lang.String shipCity;

    private java.lang.String shipState;

    private org.mule.module.netsuite.api.internal.Country shipCountry;

    private java.lang.String shipZip;

    private java.lang.String state1TaxNumber;

    private java.lang.String ssnOrTin;

    private org.mule.module.netsuite.api.internal.RecordRef interCoAccount;

    private org.mule.module.netsuite.api.internal.SubsidiaryNexusList nexusList;

    private org.mule.module.netsuite.api.internal.RecordRef checkLayout;

    private org.mule.module.netsuite.api.internal.ClassTranslationList classTranslationList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Subsidiary() {
    }

    public Subsidiary(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.lang.String name,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           java.lang.Boolean isInactive,
           java.lang.Boolean showSubsidiaryName,
           java.lang.String url,
           org.mule.module.netsuite.api.internal.RecordRef logo,
           java.lang.String tranPrefix,
           org.mule.module.netsuite.api.internal.RecordRef pageLogo,
           java.lang.String attention,
           java.lang.String addressee,
           java.lang.String addrPhone,
           java.lang.String addr1,
           java.lang.String addr2,
           java.lang.String addr3,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           org.mule.module.netsuite.api.internal.Country country,
           java.lang.String addrText,
           java.lang.Boolean override,
           java.lang.String shipAddr,
           java.lang.String returnAddr,
           java.lang.String returnAddress1,
           java.lang.String returnAddress2,
           java.lang.String returnCity,
           java.lang.String returnState,
           org.mule.module.netsuite.api.internal.Country returnCountry,
           java.lang.String returnZip,
           java.lang.String legalName,
           java.lang.Boolean isElimination,
           java.lang.Boolean allowPayroll,
           java.lang.String email,
           org.mule.module.netsuite.api.internal.RecordRef currency,
           java.lang.String fax,
           java.lang.String edition,
           java.lang.String federalIdNumber,
           java.lang.String addrLanguage,
           java.lang.String nonConsol,
           java.lang.String consol,
           java.lang.String shipAddress1,
           java.lang.String shipAddress2,
           java.lang.String shipCity,
           java.lang.String shipState,
           org.mule.module.netsuite.api.internal.Country shipCountry,
           java.lang.String shipZip,
           java.lang.String state1TaxNumber,
           java.lang.String ssnOrTin,
           org.mule.module.netsuite.api.internal.RecordRef interCoAccount,
           org.mule.module.netsuite.api.internal.SubsidiaryNexusList nexusList,
           org.mule.module.netsuite.api.internal.RecordRef checkLayout,
           org.mule.module.netsuite.api.internal.ClassTranslationList classTranslationList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.parent = parent;
        this.isInactive = isInactive;
        this.showSubsidiaryName = showSubsidiaryName;
        this.url = url;
        this.logo = logo;
        this.tranPrefix = tranPrefix;
        this.pageLogo = pageLogo;
        this.attention = attention;
        this.addressee = addressee;
        this.addrPhone = addrPhone;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.addr3 = addr3;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.addrText = addrText;
        this.override = override;
        this.shipAddr = shipAddr;
        this.returnAddr = returnAddr;
        this.returnAddress1 = returnAddress1;
        this.returnAddress2 = returnAddress2;
        this.returnCity = returnCity;
        this.returnState = returnState;
        this.returnCountry = returnCountry;
        this.returnZip = returnZip;
        this.legalName = legalName;
        this.isElimination = isElimination;
        this.allowPayroll = allowPayroll;
        this.email = email;
        this.currency = currency;
        this.fax = fax;
        this.edition = edition;
        this.federalIdNumber = federalIdNumber;
        this.addrLanguage = addrLanguage;
        this.nonConsol = nonConsol;
        this.consol = consol;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipCity = shipCity;
        this.shipState = shipState;
        this.shipCountry = shipCountry;
        this.shipZip = shipZip;
        this.state1TaxNumber = state1TaxNumber;
        this.ssnOrTin = ssnOrTin;
        this.interCoAccount = interCoAccount;
        this.nexusList = nexusList;
        this.checkLayout = checkLayout;
        this.classTranslationList = classTranslationList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the name value for this Subsidiary.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Subsidiary.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parent value for this Subsidiary.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this Subsidiary.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isInactive value for this Subsidiary.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Subsidiary.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the showSubsidiaryName value for this Subsidiary.
     * 
     * @return showSubsidiaryName
     */
    public java.lang.Boolean getShowSubsidiaryName() {
        return showSubsidiaryName;
    }


    /**
     * Sets the showSubsidiaryName value for this Subsidiary.
     * 
     * @param showSubsidiaryName
     */
    public void setShowSubsidiaryName(java.lang.Boolean showSubsidiaryName) {
        this.showSubsidiaryName = showSubsidiaryName;
    }


    /**
     * Gets the url value for this Subsidiary.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Subsidiary.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the logo value for this Subsidiary.
     * 
     * @return logo
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLogo() {
        return logo;
    }


    /**
     * Sets the logo value for this Subsidiary.
     * 
     * @param logo
     */
    public void setLogo(org.mule.module.netsuite.api.internal.RecordRef logo) {
        this.logo = logo;
    }


    /**
     * Gets the tranPrefix value for this Subsidiary.
     * 
     * @return tranPrefix
     */
    public java.lang.String getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this Subsidiary.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(java.lang.String tranPrefix) {
        this.tranPrefix = tranPrefix;
    }


    /**
     * Gets the pageLogo value for this Subsidiary.
     * 
     * @return pageLogo
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPageLogo() {
        return pageLogo;
    }


    /**
     * Sets the pageLogo value for this Subsidiary.
     * 
     * @param pageLogo
     */
    public void setPageLogo(org.mule.module.netsuite.api.internal.RecordRef pageLogo) {
        this.pageLogo = pageLogo;
    }


    /**
     * Gets the attention value for this Subsidiary.
     * 
     * @return attention
     */
    public java.lang.String getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this Subsidiary.
     * 
     * @param attention
     */
    public void setAttention(java.lang.String attention) {
        this.attention = attention;
    }


    /**
     * Gets the addressee value for this Subsidiary.
     * 
     * @return addressee
     */
    public java.lang.String getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this Subsidiary.
     * 
     * @param addressee
     */
    public void setAddressee(java.lang.String addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addrPhone value for this Subsidiary.
     * 
     * @return addrPhone
     */
    public java.lang.String getAddrPhone() {
        return addrPhone;
    }


    /**
     * Sets the addrPhone value for this Subsidiary.
     * 
     * @param addrPhone
     */
    public void setAddrPhone(java.lang.String addrPhone) {
        this.addrPhone = addrPhone;
    }


    /**
     * Gets the addr1 value for this Subsidiary.
     * 
     * @return addr1
     */
    public java.lang.String getAddr1() {
        return addr1;
    }


    /**
     * Sets the addr1 value for this Subsidiary.
     * 
     * @param addr1
     */
    public void setAddr1(java.lang.String addr1) {
        this.addr1 = addr1;
    }


    /**
     * Gets the addr2 value for this Subsidiary.
     * 
     * @return addr2
     */
    public java.lang.String getAddr2() {
        return addr2;
    }


    /**
     * Sets the addr2 value for this Subsidiary.
     * 
     * @param addr2
     */
    public void setAddr2(java.lang.String addr2) {
        this.addr2 = addr2;
    }


    /**
     * Gets the addr3 value for this Subsidiary.
     * 
     * @return addr3
     */
    public java.lang.String getAddr3() {
        return addr3;
    }


    /**
     * Sets the addr3 value for this Subsidiary.
     * 
     * @param addr3
     */
    public void setAddr3(java.lang.String addr3) {
        this.addr3 = addr3;
    }


    /**
     * Gets the city value for this Subsidiary.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Subsidiary.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this Subsidiary.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Subsidiary.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this Subsidiary.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this Subsidiary.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the country value for this Subsidiary.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Subsidiary.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.Country country) {
        this.country = country;
    }


    /**
     * Gets the addrText value for this Subsidiary.
     * 
     * @return addrText
     */
    public java.lang.String getAddrText() {
        return addrText;
    }


    /**
     * Sets the addrText value for this Subsidiary.
     * 
     * @param addrText
     */
    public void setAddrText(java.lang.String addrText) {
        this.addrText = addrText;
    }


    /**
     * Gets the override value for this Subsidiary.
     * 
     * @return override
     */
    public java.lang.Boolean getOverride() {
        return override;
    }


    /**
     * Sets the override value for this Subsidiary.
     * 
     * @param override
     */
    public void setOverride(java.lang.Boolean override) {
        this.override = override;
    }


    /**
     * Gets the shipAddr value for this Subsidiary.
     * 
     * @return shipAddr
     */
    public java.lang.String getShipAddr() {
        return shipAddr;
    }


    /**
     * Sets the shipAddr value for this Subsidiary.
     * 
     * @param shipAddr
     */
    public void setShipAddr(java.lang.String shipAddr) {
        this.shipAddr = shipAddr;
    }


    /**
     * Gets the returnAddr value for this Subsidiary.
     * 
     * @return returnAddr
     */
    public java.lang.String getReturnAddr() {
        return returnAddr;
    }


    /**
     * Sets the returnAddr value for this Subsidiary.
     * 
     * @param returnAddr
     */
    public void setReturnAddr(java.lang.String returnAddr) {
        this.returnAddr = returnAddr;
    }


    /**
     * Gets the returnAddress1 value for this Subsidiary.
     * 
     * @return returnAddress1
     */
    public java.lang.String getReturnAddress1() {
        return returnAddress1;
    }


    /**
     * Sets the returnAddress1 value for this Subsidiary.
     * 
     * @param returnAddress1
     */
    public void setReturnAddress1(java.lang.String returnAddress1) {
        this.returnAddress1 = returnAddress1;
    }


    /**
     * Gets the returnAddress2 value for this Subsidiary.
     * 
     * @return returnAddress2
     */
    public java.lang.String getReturnAddress2() {
        return returnAddress2;
    }


    /**
     * Sets the returnAddress2 value for this Subsidiary.
     * 
     * @param returnAddress2
     */
    public void setReturnAddress2(java.lang.String returnAddress2) {
        this.returnAddress2 = returnAddress2;
    }


    /**
     * Gets the returnCity value for this Subsidiary.
     * 
     * @return returnCity
     */
    public java.lang.String getReturnCity() {
        return returnCity;
    }


    /**
     * Sets the returnCity value for this Subsidiary.
     * 
     * @param returnCity
     */
    public void setReturnCity(java.lang.String returnCity) {
        this.returnCity = returnCity;
    }


    /**
     * Gets the returnState value for this Subsidiary.
     * 
     * @return returnState
     */
    public java.lang.String getReturnState() {
        return returnState;
    }


    /**
     * Sets the returnState value for this Subsidiary.
     * 
     * @param returnState
     */
    public void setReturnState(java.lang.String returnState) {
        this.returnState = returnState;
    }


    /**
     * Gets the returnCountry value for this Subsidiary.
     * 
     * @return returnCountry
     */
    public org.mule.module.netsuite.api.internal.Country getReturnCountry() {
        return returnCountry;
    }


    /**
     * Sets the returnCountry value for this Subsidiary.
     * 
     * @param returnCountry
     */
    public void setReturnCountry(org.mule.module.netsuite.api.internal.Country returnCountry) {
        this.returnCountry = returnCountry;
    }


    /**
     * Gets the returnZip value for this Subsidiary.
     * 
     * @return returnZip
     */
    public java.lang.String getReturnZip() {
        return returnZip;
    }


    /**
     * Sets the returnZip value for this Subsidiary.
     * 
     * @param returnZip
     */
    public void setReturnZip(java.lang.String returnZip) {
        this.returnZip = returnZip;
    }


    /**
     * Gets the legalName value for this Subsidiary.
     * 
     * @return legalName
     */
    public java.lang.String getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this Subsidiary.
     * 
     * @param legalName
     */
    public void setLegalName(java.lang.String legalName) {
        this.legalName = legalName;
    }


    /**
     * Gets the isElimination value for this Subsidiary.
     * 
     * @return isElimination
     */
    public java.lang.Boolean getIsElimination() {
        return isElimination;
    }


    /**
     * Sets the isElimination value for this Subsidiary.
     * 
     * @param isElimination
     */
    public void setIsElimination(java.lang.Boolean isElimination) {
        this.isElimination = isElimination;
    }


    /**
     * Gets the allowPayroll value for this Subsidiary.
     * 
     * @return allowPayroll
     */
    public java.lang.Boolean getAllowPayroll() {
        return allowPayroll;
    }


    /**
     * Sets the allowPayroll value for this Subsidiary.
     * 
     * @param allowPayroll
     */
    public void setAllowPayroll(java.lang.Boolean allowPayroll) {
        this.allowPayroll = allowPayroll;
    }


    /**
     * Gets the email value for this Subsidiary.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Subsidiary.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the currency value for this Subsidiary.
     * 
     * @return currency
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Subsidiary.
     * 
     * @param currency
     */
    public void setCurrency(org.mule.module.netsuite.api.internal.RecordRef currency) {
        this.currency = currency;
    }


    /**
     * Gets the fax value for this Subsidiary.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this Subsidiary.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the edition value for this Subsidiary.
     * 
     * @return edition
     */
    public java.lang.String getEdition() {
        return edition;
    }


    /**
     * Sets the edition value for this Subsidiary.
     * 
     * @param edition
     */
    public void setEdition(java.lang.String edition) {
        this.edition = edition;
    }


    /**
     * Gets the federalIdNumber value for this Subsidiary.
     * 
     * @return federalIdNumber
     */
    public java.lang.String getFederalIdNumber() {
        return federalIdNumber;
    }


    /**
     * Sets the federalIdNumber value for this Subsidiary.
     * 
     * @param federalIdNumber
     */
    public void setFederalIdNumber(java.lang.String federalIdNumber) {
        this.federalIdNumber = federalIdNumber;
    }


    /**
     * Gets the addrLanguage value for this Subsidiary.
     * 
     * @return addrLanguage
     */
    public java.lang.String getAddrLanguage() {
        return addrLanguage;
    }


    /**
     * Sets the addrLanguage value for this Subsidiary.
     * 
     * @param addrLanguage
     */
    public void setAddrLanguage(java.lang.String addrLanguage) {
        this.addrLanguage = addrLanguage;
    }


    /**
     * Gets the nonConsol value for this Subsidiary.
     * 
     * @return nonConsol
     */
    public java.lang.String getNonConsol() {
        return nonConsol;
    }


    /**
     * Sets the nonConsol value for this Subsidiary.
     * 
     * @param nonConsol
     */
    public void setNonConsol(java.lang.String nonConsol) {
        this.nonConsol = nonConsol;
    }


    /**
     * Gets the consol value for this Subsidiary.
     * 
     * @return consol
     */
    public java.lang.String getConsol() {
        return consol;
    }


    /**
     * Sets the consol value for this Subsidiary.
     * 
     * @param consol
     */
    public void setConsol(java.lang.String consol) {
        this.consol = consol;
    }


    /**
     * Gets the shipAddress1 value for this Subsidiary.
     * 
     * @return shipAddress1
     */
    public java.lang.String getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this Subsidiary.
     * 
     * @param shipAddress1
     */
    public void setShipAddress1(java.lang.String shipAddress1) {
        this.shipAddress1 = shipAddress1;
    }


    /**
     * Gets the shipAddress2 value for this Subsidiary.
     * 
     * @return shipAddress2
     */
    public java.lang.String getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this Subsidiary.
     * 
     * @param shipAddress2
     */
    public void setShipAddress2(java.lang.String shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }


    /**
     * Gets the shipCity value for this Subsidiary.
     * 
     * @return shipCity
     */
    public java.lang.String getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this Subsidiary.
     * 
     * @param shipCity
     */
    public void setShipCity(java.lang.String shipCity) {
        this.shipCity = shipCity;
    }


    /**
     * Gets the shipState value for this Subsidiary.
     * 
     * @return shipState
     */
    public java.lang.String getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this Subsidiary.
     * 
     * @param shipState
     */
    public void setShipState(java.lang.String shipState) {
        this.shipState = shipState;
    }


    /**
     * Gets the shipCountry value for this Subsidiary.
     * 
     * @return shipCountry
     */
    public org.mule.module.netsuite.api.internal.Country getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this Subsidiary.
     * 
     * @param shipCountry
     */
    public void setShipCountry(org.mule.module.netsuite.api.internal.Country shipCountry) {
        this.shipCountry = shipCountry;
    }


    /**
     * Gets the shipZip value for this Subsidiary.
     * 
     * @return shipZip
     */
    public java.lang.String getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this Subsidiary.
     * 
     * @param shipZip
     */
    public void setShipZip(java.lang.String shipZip) {
        this.shipZip = shipZip;
    }


    /**
     * Gets the state1TaxNumber value for this Subsidiary.
     * 
     * @return state1TaxNumber
     */
    public java.lang.String getState1TaxNumber() {
        return state1TaxNumber;
    }


    /**
     * Sets the state1TaxNumber value for this Subsidiary.
     * 
     * @param state1TaxNumber
     */
    public void setState1TaxNumber(java.lang.String state1TaxNumber) {
        this.state1TaxNumber = state1TaxNumber;
    }


    /**
     * Gets the ssnOrTin value for this Subsidiary.
     * 
     * @return ssnOrTin
     */
    public java.lang.String getSsnOrTin() {
        return ssnOrTin;
    }


    /**
     * Sets the ssnOrTin value for this Subsidiary.
     * 
     * @param ssnOrTin
     */
    public void setSsnOrTin(java.lang.String ssnOrTin) {
        this.ssnOrTin = ssnOrTin;
    }


    /**
     * Gets the interCoAccount value for this Subsidiary.
     * 
     * @return interCoAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getInterCoAccount() {
        return interCoAccount;
    }


    /**
     * Sets the interCoAccount value for this Subsidiary.
     * 
     * @param interCoAccount
     */
    public void setInterCoAccount(org.mule.module.netsuite.api.internal.RecordRef interCoAccount) {
        this.interCoAccount = interCoAccount;
    }


    /**
     * Gets the nexusList value for this Subsidiary.
     * 
     * @return nexusList
     */
    public org.mule.module.netsuite.api.internal.SubsidiaryNexusList getNexusList() {
        return nexusList;
    }


    /**
     * Sets the nexusList value for this Subsidiary.
     * 
     * @param nexusList
     */
    public void setNexusList(org.mule.module.netsuite.api.internal.SubsidiaryNexusList nexusList) {
        this.nexusList = nexusList;
    }


    /**
     * Gets the checkLayout value for this Subsidiary.
     * 
     * @return checkLayout
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCheckLayout() {
        return checkLayout;
    }


    /**
     * Sets the checkLayout value for this Subsidiary.
     * 
     * @param checkLayout
     */
    public void setCheckLayout(org.mule.module.netsuite.api.internal.RecordRef checkLayout) {
        this.checkLayout = checkLayout;
    }


    /**
     * Gets the classTranslationList value for this Subsidiary.
     * 
     * @return classTranslationList
     */
    public org.mule.module.netsuite.api.internal.ClassTranslationList getClassTranslationList() {
        return classTranslationList;
    }


    /**
     * Sets the classTranslationList value for this Subsidiary.
     * 
     * @param classTranslationList
     */
    public void setClassTranslationList(org.mule.module.netsuite.api.internal.ClassTranslationList classTranslationList) {
        this.classTranslationList = classTranslationList;
    }


    /**
     * Gets the customFieldList value for this Subsidiary.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Subsidiary.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Subsidiary.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Subsidiary.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Subsidiary.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Subsidiary.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Subsidiary)) return false;
        Subsidiary other = (Subsidiary) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.showSubsidiaryName==null && other.getShowSubsidiaryName()==null) || 
             (this.showSubsidiaryName!=null &&
              this.showSubsidiaryName.equals(other.getShowSubsidiaryName()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.logo==null && other.getLogo()==null) || 
             (this.logo!=null &&
              this.logo.equals(other.getLogo()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              this.tranPrefix.equals(other.getTranPrefix()))) &&
            ((this.pageLogo==null && other.getPageLogo()==null) || 
             (this.pageLogo!=null &&
              this.pageLogo.equals(other.getPageLogo()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.addrPhone==null && other.getAddrPhone()==null) || 
             (this.addrPhone!=null &&
              this.addrPhone.equals(other.getAddrPhone()))) &&
            ((this.addr1==null && other.getAddr1()==null) || 
             (this.addr1!=null &&
              this.addr1.equals(other.getAddr1()))) &&
            ((this.addr2==null && other.getAddr2()==null) || 
             (this.addr2!=null &&
              this.addr2.equals(other.getAddr2()))) &&
            ((this.addr3==null && other.getAddr3()==null) || 
             (this.addr3!=null &&
              this.addr3.equals(other.getAddr3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.addrText==null && other.getAddrText()==null) || 
             (this.addrText!=null &&
              this.addrText.equals(other.getAddrText()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              this.override.equals(other.getOverride()))) &&
            ((this.shipAddr==null && other.getShipAddr()==null) || 
             (this.shipAddr!=null &&
              this.shipAddr.equals(other.getShipAddr()))) &&
            ((this.returnAddr==null && other.getReturnAddr()==null) || 
             (this.returnAddr!=null &&
              this.returnAddr.equals(other.getReturnAddr()))) &&
            ((this.returnAddress1==null && other.getReturnAddress1()==null) || 
             (this.returnAddress1!=null &&
              this.returnAddress1.equals(other.getReturnAddress1()))) &&
            ((this.returnAddress2==null && other.getReturnAddress2()==null) || 
             (this.returnAddress2!=null &&
              this.returnAddress2.equals(other.getReturnAddress2()))) &&
            ((this.returnCity==null && other.getReturnCity()==null) || 
             (this.returnCity!=null &&
              this.returnCity.equals(other.getReturnCity()))) &&
            ((this.returnState==null && other.getReturnState()==null) || 
             (this.returnState!=null &&
              this.returnState.equals(other.getReturnState()))) &&
            ((this.returnCountry==null && other.getReturnCountry()==null) || 
             (this.returnCountry!=null &&
              this.returnCountry.equals(other.getReturnCountry()))) &&
            ((this.returnZip==null && other.getReturnZip()==null) || 
             (this.returnZip!=null &&
              this.returnZip.equals(other.getReturnZip()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              this.legalName.equals(other.getLegalName()))) &&
            ((this.isElimination==null && other.getIsElimination()==null) || 
             (this.isElimination!=null &&
              this.isElimination.equals(other.getIsElimination()))) &&
            ((this.allowPayroll==null && other.getAllowPayroll()==null) || 
             (this.allowPayroll!=null &&
              this.allowPayroll.equals(other.getAllowPayroll()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.edition==null && other.getEdition()==null) || 
             (this.edition!=null &&
              this.edition.equals(other.getEdition()))) &&
            ((this.federalIdNumber==null && other.getFederalIdNumber()==null) || 
             (this.federalIdNumber!=null &&
              this.federalIdNumber.equals(other.getFederalIdNumber()))) &&
            ((this.addrLanguage==null && other.getAddrLanguage()==null) || 
             (this.addrLanguage!=null &&
              this.addrLanguage.equals(other.getAddrLanguage()))) &&
            ((this.nonConsol==null && other.getNonConsol()==null) || 
             (this.nonConsol!=null &&
              this.nonConsol.equals(other.getNonConsol()))) &&
            ((this.consol==null && other.getConsol()==null) || 
             (this.consol!=null &&
              this.consol.equals(other.getConsol()))) &&
            ((this.shipAddress1==null && other.getShipAddress1()==null) || 
             (this.shipAddress1!=null &&
              this.shipAddress1.equals(other.getShipAddress1()))) &&
            ((this.shipAddress2==null && other.getShipAddress2()==null) || 
             (this.shipAddress2!=null &&
              this.shipAddress2.equals(other.getShipAddress2()))) &&
            ((this.shipCity==null && other.getShipCity()==null) || 
             (this.shipCity!=null &&
              this.shipCity.equals(other.getShipCity()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              this.shipState.equals(other.getShipState()))) &&
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              this.shipCountry.equals(other.getShipCountry()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              this.shipZip.equals(other.getShipZip()))) &&
            ((this.state1TaxNumber==null && other.getState1TaxNumber()==null) || 
             (this.state1TaxNumber!=null &&
              this.state1TaxNumber.equals(other.getState1TaxNumber()))) &&
            ((this.ssnOrTin==null && other.getSsnOrTin()==null) || 
             (this.ssnOrTin!=null &&
              this.ssnOrTin.equals(other.getSsnOrTin()))) &&
            ((this.interCoAccount==null && other.getInterCoAccount()==null) || 
             (this.interCoAccount!=null &&
              this.interCoAccount.equals(other.getInterCoAccount()))) &&
            ((this.nexusList==null && other.getNexusList()==null) || 
             (this.nexusList!=null &&
              this.nexusList.equals(other.getNexusList()))) &&
            ((this.checkLayout==null && other.getCheckLayout()==null) || 
             (this.checkLayout!=null &&
              this.checkLayout.equals(other.getCheckLayout()))) &&
            ((this.classTranslationList==null && other.getClassTranslationList()==null) || 
             (this.classTranslationList!=null &&
              this.classTranslationList.equals(other.getClassTranslationList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getShowSubsidiaryName() != null) {
            _hashCode += getShowSubsidiaryName().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getLogo() != null) {
            _hashCode += getLogo().hashCode();
        }
        if (getTranPrefix() != null) {
            _hashCode += getTranPrefix().hashCode();
        }
        if (getPageLogo() != null) {
            _hashCode += getPageLogo().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getAddrPhone() != null) {
            _hashCode += getAddrPhone().hashCode();
        }
        if (getAddr1() != null) {
            _hashCode += getAddr1().hashCode();
        }
        if (getAddr2() != null) {
            _hashCode += getAddr2().hashCode();
        }
        if (getAddr3() != null) {
            _hashCode += getAddr3().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getAddrText() != null) {
            _hashCode += getAddrText().hashCode();
        }
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        if (getShipAddr() != null) {
            _hashCode += getShipAddr().hashCode();
        }
        if (getReturnAddr() != null) {
            _hashCode += getReturnAddr().hashCode();
        }
        if (getReturnAddress1() != null) {
            _hashCode += getReturnAddress1().hashCode();
        }
        if (getReturnAddress2() != null) {
            _hashCode += getReturnAddress2().hashCode();
        }
        if (getReturnCity() != null) {
            _hashCode += getReturnCity().hashCode();
        }
        if (getReturnState() != null) {
            _hashCode += getReturnState().hashCode();
        }
        if (getReturnCountry() != null) {
            _hashCode += getReturnCountry().hashCode();
        }
        if (getReturnZip() != null) {
            _hashCode += getReturnZip().hashCode();
        }
        if (getLegalName() != null) {
            _hashCode += getLegalName().hashCode();
        }
        if (getIsElimination() != null) {
            _hashCode += getIsElimination().hashCode();
        }
        if (getAllowPayroll() != null) {
            _hashCode += getAllowPayroll().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getEdition() != null) {
            _hashCode += getEdition().hashCode();
        }
        if (getFederalIdNumber() != null) {
            _hashCode += getFederalIdNumber().hashCode();
        }
        if (getAddrLanguage() != null) {
            _hashCode += getAddrLanguage().hashCode();
        }
        if (getNonConsol() != null) {
            _hashCode += getNonConsol().hashCode();
        }
        if (getConsol() != null) {
            _hashCode += getConsol().hashCode();
        }
        if (getShipAddress1() != null) {
            _hashCode += getShipAddress1().hashCode();
        }
        if (getShipAddress2() != null) {
            _hashCode += getShipAddress2().hashCode();
        }
        if (getShipCity() != null) {
            _hashCode += getShipCity().hashCode();
        }
        if (getShipState() != null) {
            _hashCode += getShipState().hashCode();
        }
        if (getShipCountry() != null) {
            _hashCode += getShipCountry().hashCode();
        }
        if (getShipZip() != null) {
            _hashCode += getShipZip().hashCode();
        }
        if (getState1TaxNumber() != null) {
            _hashCode += getState1TaxNumber().hashCode();
        }
        if (getSsnOrTin() != null) {
            _hashCode += getSsnOrTin().hashCode();
        }
        if (getInterCoAccount() != null) {
            _hashCode += getInterCoAccount().hashCode();
        }
        if (getNexusList() != null) {
            _hashCode += getNexusList().hashCode();
        }
        if (getCheckLayout() != null) {
            _hashCode += getCheckLayout().hashCode();
        }
        if (getClassTranslationList() != null) {
            _hashCode += getClassTranslationList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Subsidiary.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "Subsidiary"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showSubsidiaryName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "showSubsidiaryName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "logo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageLogo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pageLogo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addrPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addr3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addrText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "returnAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "returnAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "returnAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "returnCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "returnState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "returnCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "returnZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isElimination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isElimination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "allowPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edition");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "edition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("federalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "federalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrLanguage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "addrLanguage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonConsol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "nonConsol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consol");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "consol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state1TaxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "state1TaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssnOrTin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ssnOrTin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interCoAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "interCoAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexusList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "nexusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SubsidiaryNexusList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("checkLayout");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "checkLayout"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classTranslationList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "classTranslationList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ClassTranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
