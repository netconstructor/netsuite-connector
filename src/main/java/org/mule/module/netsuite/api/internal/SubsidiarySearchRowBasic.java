/**
 * SubsidiarySearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SubsidiarySearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] city;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] email;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isElimination;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] legalName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] name;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] nameNoHierarchy;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] state;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] taxIdNum;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranPrefix;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] url;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] zip;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public SubsidiarySearchRowBasic() {
    }

    public SubsidiarySearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] city,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] email,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isElimination,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] legalName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] name,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] nameNoHierarchy,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] state,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] taxIdNum,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranPrefix,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] url,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] zip,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.city = city;
           this.country = country;
           this.currency = currency;
           this.email = email;
           this.externalId = externalId;
           this.fax = fax;
           this.internalId = internalId;
           this.isElimination = isElimination;
           this.isInactive = isInactive;
           this.legalName = legalName;
           this.name = name;
           this.nameNoHierarchy = nameNoHierarchy;
           this.phone = phone;
           this.state = state;
           this.taxIdNum = taxIdNum;
           this.tranPrefix = tranPrefix;
           this.url = url;
           this.zip = zip;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the address1 value for this SubsidiarySearchRowBasic.
     * 
     * @return address1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this SubsidiarySearchRowBasic.
     * 
     * @param address1
     */
    public void setAddress1(org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1) {
        this.address1 = address1;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddress1(int i) {
        return this.address1[i];
    }

    public void setAddress1(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.address1[i] = _value;
    }


    /**
     * Gets the address2 value for this SubsidiarySearchRowBasic.
     * 
     * @return address2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this SubsidiarySearchRowBasic.
     * 
     * @param address2
     */
    public void setAddress2(org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2) {
        this.address2 = address2;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddress2(int i) {
        return this.address2[i];
    }

    public void setAddress2(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.address2[i] = _value;
    }


    /**
     * Gets the address3 value for this SubsidiarySearchRowBasic.
     * 
     * @return address3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this SubsidiarySearchRowBasic.
     * 
     * @param address3
     */
    public void setAddress3(org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3) {
        this.address3 = address3;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddress3(int i) {
        return this.address3[i];
    }

    public void setAddress3(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.address3[i] = _value;
    }


    /**
     * Gets the city value for this SubsidiarySearchRowBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this SubsidiarySearchRowBasic.
     * 
     * @param city
     */
    public void setCity(org.mule.module.netsuite.api.internal.SearchColumnStringField[] city) {
        this.city = city;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.city[i] = _value;
    }


    /**
     * Gets the country value for this SubsidiarySearchRowBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this SubsidiarySearchRowBasic.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }


    /**
     * Gets the currency value for this SubsidiarySearchRowBasic.
     * 
     * @return currency
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this SubsidiarySearchRowBasic.
     * 
     * @param currency
     */
    public void setCurrency(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }


    /**
     * Gets the email value for this SubsidiarySearchRowBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SubsidiarySearchRowBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchColumnStringField[] email) {
        this.email = email;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the externalId value for this SubsidiarySearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SubsidiarySearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId) {
        this.externalId = externalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the fax value for this SubsidiarySearchRowBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this SubsidiarySearchRowBasic.
     * 
     * @param fax
     */
    public void setFax(org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax) {
        this.fax = fax;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getFax(int i) {
        return this.fax[i];
    }

    public void setFax(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.fax[i] = _value;
    }


    /**
     * Gets the internalId value for this SubsidiarySearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SubsidiarySearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the isElimination value for this SubsidiarySearchRowBasic.
     * 
     * @return isElimination
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsElimination() {
        return isElimination;
    }


    /**
     * Sets the isElimination value for this SubsidiarySearchRowBasic.
     * 
     * @param isElimination
     */
    public void setIsElimination(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isElimination) {
        this.isElimination = isElimination;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsElimination(int i) {
        return this.isElimination[i];
    }

    public void setIsElimination(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isElimination[i] = _value;
    }


    /**
     * Gets the isInactive value for this SubsidiarySearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SubsidiarySearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the legalName value for this SubsidiarySearchRowBasic.
     * 
     * @return legalName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getLegalName() {
        return legalName;
    }


    /**
     * Sets the legalName value for this SubsidiarySearchRowBasic.
     * 
     * @param legalName
     */
    public void setLegalName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] legalName) {
        this.legalName = legalName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getLegalName(int i) {
        return this.legalName[i];
    }

    public void setLegalName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.legalName[i] = _value;
    }


    /**
     * Gets the name value for this SubsidiarySearchRowBasic.
     * 
     * @return name
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getName() {
        return name;
    }


    /**
     * Sets the name value for this SubsidiarySearchRowBasic.
     * 
     * @param name
     */
    public void setName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] name) {
        this.name = name;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.name[i] = _value;
    }


    /**
     * Gets the nameNoHierarchy value for this SubsidiarySearchRowBasic.
     * 
     * @return nameNoHierarchy
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNameNoHierarchy() {
        return nameNoHierarchy;
    }


    /**
     * Sets the nameNoHierarchy value for this SubsidiarySearchRowBasic.
     * 
     * @param nameNoHierarchy
     */
    public void setNameNoHierarchy(org.mule.module.netsuite.api.internal.SearchColumnStringField[] nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNameNoHierarchy(int i) {
        return this.nameNoHierarchy[i];
    }

    public void setNameNoHierarchy(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.nameNoHierarchy[i] = _value;
    }


    /**
     * Gets the phone value for this SubsidiarySearchRowBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this SubsidiarySearchRowBasic.
     * 
     * @param phone
     */
    public void setPhone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone) {
        this.phone = phone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.phone[i] = _value;
    }


    /**
     * Gets the state value for this SubsidiarySearchRowBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this SubsidiarySearchRowBasic.
     * 
     * @param state
     */
    public void setState(org.mule.module.netsuite.api.internal.SearchColumnStringField[] state) {
        this.state = state;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the taxIdNum value for this SubsidiarySearchRowBasic.
     * 
     * @return taxIdNum
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTaxIdNum() {
        return taxIdNum;
    }


    /**
     * Sets the taxIdNum value for this SubsidiarySearchRowBasic.
     * 
     * @param taxIdNum
     */
    public void setTaxIdNum(org.mule.module.netsuite.api.internal.SearchColumnStringField[] taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTaxIdNum(int i) {
        return this.taxIdNum[i];
    }

    public void setTaxIdNum(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.taxIdNum[i] = _value;
    }


    /**
     * Gets the tranPrefix value for this SubsidiarySearchRowBasic.
     * 
     * @return tranPrefix
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTranPrefix() {
        return tranPrefix;
    }


    /**
     * Sets the tranPrefix value for this SubsidiarySearchRowBasic.
     * 
     * @param tranPrefix
     */
    public void setTranPrefix(org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranPrefix) {
        this.tranPrefix = tranPrefix;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTranPrefix(int i) {
        return this.tranPrefix[i];
    }

    public void setTranPrefix(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.tranPrefix[i] = _value;
    }


    /**
     * Gets the url value for this SubsidiarySearchRowBasic.
     * 
     * @return url
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this SubsidiarySearchRowBasic.
     * 
     * @param url
     */
    public void setUrl(org.mule.module.netsuite.api.internal.SearchColumnStringField[] url) {
        this.url = url;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.url[i] = _value;
    }


    /**
     * Gets the zip value for this SubsidiarySearchRowBasic.
     * 
     * @return zip
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this SubsidiarySearchRowBasic.
     * 
     * @param zip
     */
    public void setZip(org.mule.module.netsuite.api.internal.SearchColumnStringField[] zip) {
        this.zip = zip;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getZip(int i) {
        return this.zip[i];
    }

    public void setZip(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.zip[i] = _value;
    }


    /**
     * Gets the customFieldList value for this SubsidiarySearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SubsidiarySearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubsidiarySearchRowBasic)) return false;
        SubsidiarySearchRowBasic other = (SubsidiarySearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              java.util.Arrays.equals(this.address1, other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              java.util.Arrays.equals(this.address2, other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              java.util.Arrays.equals(this.address3, other.getAddress3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              java.util.Arrays.equals(this.fax, other.getFax()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isElimination==null && other.getIsElimination()==null) || 
             (this.isElimination!=null &&
              java.util.Arrays.equals(this.isElimination, other.getIsElimination()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.legalName==null && other.getLegalName()==null) || 
             (this.legalName!=null &&
              java.util.Arrays.equals(this.legalName, other.getLegalName()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.nameNoHierarchy==null && other.getNameNoHierarchy()==null) || 
             (this.nameNoHierarchy!=null &&
              java.util.Arrays.equals(this.nameNoHierarchy, other.getNameNoHierarchy()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.taxIdNum==null && other.getTaxIdNum()==null) || 
             (this.taxIdNum!=null &&
              java.util.Arrays.equals(this.taxIdNum, other.getTaxIdNum()))) &&
            ((this.tranPrefix==null && other.getTranPrefix()==null) || 
             (this.tranPrefix!=null &&
              java.util.Arrays.equals(this.tranPrefix, other.getTranPrefix()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              java.util.Arrays.equals(this.url, other.getUrl()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              java.util.Arrays.equals(this.zip, other.getZip()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsElimination() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsElimination());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsElimination(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLegalName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLegalName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLegalName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNameNoHierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameNoHierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameNoHierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxIdNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxIdNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxIdNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranPrefix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranPrefix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranPrefix(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubsidiarySearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isElimination");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isElimination"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
