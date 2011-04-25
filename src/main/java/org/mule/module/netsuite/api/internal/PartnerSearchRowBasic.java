/**
 * PartnerSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PartnerSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressInternalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressLabel;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altEmail;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] assignTasks;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] attention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZipCode;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] category;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] city;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] comments;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] companyName;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] countryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] eligibleForCommission;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] email;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] entityId;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] entityNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] firstName;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] giveAccess;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] globalSubscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] hasDuplicates;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] homePhone;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] image;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultBilling;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultShipping;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPerson;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] language;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] lastName;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] level;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] middleName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] mobilePhone;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] partnerCode;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permission;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] phoneticName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] promoCode;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] salutation;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAttention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCity;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] shipCountry;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCountryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipState;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipZip;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] state;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subscription;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] subscriptionDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] subscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] url;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] zipCode;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public PartnerSearchRowBasic() {
    }

    public PartnerSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressee,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressInternalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressLabel,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressPhone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altEmail,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altPhone,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] assignTasks,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] attention,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZipCode,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] category,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] city,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] comments,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] companyName,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] countryCode,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] eligibleForCommission,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] email,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] entityId,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] entityNumber,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] firstName,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] giveAccess,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] globalSubscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] hasDuplicates,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] homePhone,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] image,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultBilling,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultShipping,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPerson,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] language,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] lastName,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] level,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] middleName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] mobilePhone,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] partnerCode,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permission,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] phoneticName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] promoCode,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] salutation,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddressee,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAttention,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCity,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] shipCountry,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCountryCode,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipPhone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipState,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipZip,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] state,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subscription,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] subscriptionDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] subscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] url,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] zipCode,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.address = address;
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.addressee = addressee;
           this.addressInternalId = addressInternalId;
           this.addressLabel = addressLabel;
           this.addressPhone = addressPhone;
           this.altEmail = altEmail;
           this.altName = altName;
           this.altPhone = altPhone;
           this.assignTasks = assignTasks;
           this.attention = attention;
           this.billAddress = billAddress;
           this.billAddress1 = billAddress1;
           this.billAddress2 = billAddress2;
           this.billAddress3 = billAddress3;
           this.billAddressee = billAddressee;
           this.billAttention = billAttention;
           this.billCity = billCity;
           this.billCountry = billCountry;
           this.billCountryCode = billCountryCode;
           this.billPhone = billPhone;
           this.billState = billState;
           this.billZipCode = billZipCode;
           this.category = category;
           this.city = city;
           this._class = _class;
           this.comments = comments;
           this.companyName = companyName;
           this.country = country;
           this.countryCode = countryCode;
           this.dateCreated = dateCreated;
           this.department = department;
           this.eligibleForCommission = eligibleForCommission;
           this.email = email;
           this.entityId = entityId;
           this.entityNumber = entityNumber;
           this.externalId = externalId;
           this.fax = fax;
           this.firstName = firstName;
           this.giveAccess = giveAccess;
           this.globalSubscriptionStatus = globalSubscriptionStatus;
           this.hasDuplicates = hasDuplicates;
           this.homePhone = homePhone;
           this.image = image;
           this.internalId = internalId;
           this.isDefaultBilling = isDefaultBilling;
           this.isDefaultShipping = isDefaultShipping;
           this.isInactive = isInactive;
           this.isPerson = isPerson;
           this.language = language;
           this.lastModifiedDate = lastModifiedDate;
           this.lastName = lastName;
           this.level = level;
           this.location = location;
           this.middleName = middleName;
           this.mobilePhone = mobilePhone;
           this.parent = parent;
           this.partnerCode = partnerCode;
           this.permission = permission;
           this.phone = phone;
           this.phoneticName = phoneticName;
           this.promoCode = promoCode;
           this.salutation = salutation;
           this.shipAddress = shipAddress;
           this.shipAddress1 = shipAddress1;
           this.shipAddress2 = shipAddress2;
           this.shipAddress3 = shipAddress3;
           this.shipAddressee = shipAddressee;
           this.shipAttention = shipAttention;
           this.shipCity = shipCity;
           this.shipCountry = shipCountry;
           this.shipCountryCode = shipCountryCode;
           this.shipPhone = shipPhone;
           this.shipState = shipState;
           this.shipZip = shipZip;
           this.state = state;
           this.subscription = subscription;
           this.subscriptionDate = subscriptionDate;
           this.subscriptionStatus = subscriptionStatus;
           this.subsidiary = subsidiary;
           this.title = title;
           this.url = url;
           this.zipCode = zipCode;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this PartnerSearchRowBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PartnerSearchRowBasic.
     * 
     * @param address
     */
    public void setAddress(org.mule.module.netsuite.api.internal.SearchColumnStringField[] address) {
        this.address = address;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.address[i] = _value;
    }


    /**
     * Gets the address1 value for this PartnerSearchRowBasic.
     * 
     * @return address1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this PartnerSearchRowBasic.
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
     * Gets the address2 value for this PartnerSearchRowBasic.
     * 
     * @return address2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this PartnerSearchRowBasic.
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
     * Gets the address3 value for this PartnerSearchRowBasic.
     * 
     * @return address3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this PartnerSearchRowBasic.
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
     * Gets the addressee value for this PartnerSearchRowBasic.
     * 
     * @return addressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this PartnerSearchRowBasic.
     * 
     * @param addressee
     */
    public void setAddressee(org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressee) {
        this.addressee = addressee;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddressee(int i) {
        return this.addressee[i];
    }

    public void setAddressee(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.addressee[i] = _value;
    }


    /**
     * Gets the addressInternalId value for this PartnerSearchRowBasic.
     * 
     * @return addressInternalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressInternalId() {
        return addressInternalId;
    }


    /**
     * Sets the addressInternalId value for this PartnerSearchRowBasic.
     * 
     * @param addressInternalId
     */
    public void setAddressInternalId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressInternalId) {
        this.addressInternalId = addressInternalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddressInternalId(int i) {
        return this.addressInternalId[i];
    }

    public void setAddressInternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.addressInternalId[i] = _value;
    }


    /**
     * Gets the addressLabel value for this PartnerSearchRowBasic.
     * 
     * @return addressLabel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this PartnerSearchRowBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressLabel) {
        this.addressLabel = addressLabel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddressLabel(int i) {
        return this.addressLabel[i];
    }

    public void setAddressLabel(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.addressLabel[i] = _value;
    }


    /**
     * Gets the addressPhone value for this PartnerSearchRowBasic.
     * 
     * @return addressPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this PartnerSearchRowBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressPhone) {
        this.addressPhone = addressPhone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAddressPhone(int i) {
        return this.addressPhone[i];
    }

    public void setAddressPhone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.addressPhone[i] = _value;
    }


    /**
     * Gets the altEmail value for this PartnerSearchRowBasic.
     * 
     * @return altEmail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this PartnerSearchRowBasic.
     * 
     * @param altEmail
     */
    public void setAltEmail(org.mule.module.netsuite.api.internal.SearchColumnStringField[] altEmail) {
        this.altEmail = altEmail;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAltEmail(int i) {
        return this.altEmail[i];
    }

    public void setAltEmail(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.altEmail[i] = _value;
    }


    /**
     * Gets the altName value for this PartnerSearchRowBasic.
     * 
     * @return altName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this PartnerSearchRowBasic.
     * 
     * @param altName
     */
    public void setAltName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName) {
        this.altName = altName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAltName(int i) {
        return this.altName[i];
    }

    public void setAltName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.altName[i] = _value;
    }


    /**
     * Gets the altPhone value for this PartnerSearchRowBasic.
     * 
     * @return altPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this PartnerSearchRowBasic.
     * 
     * @param altPhone
     */
    public void setAltPhone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] altPhone) {
        this.altPhone = altPhone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAltPhone(int i) {
        return this.altPhone[i];
    }

    public void setAltPhone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.altPhone[i] = _value;
    }


    /**
     * Gets the assignTasks value for this PartnerSearchRowBasic.
     * 
     * @return assignTasks
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAssignTasks() {
        return assignTasks;
    }


    /**
     * Sets the assignTasks value for this PartnerSearchRowBasic.
     * 
     * @param assignTasks
     */
    public void setAssignTasks(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] assignTasks) {
        this.assignTasks = assignTasks;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAssignTasks(int i) {
        return this.assignTasks[i];
    }

    public void setAssignTasks(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.assignTasks[i] = _value;
    }


    /**
     * Gets the attention value for this PartnerSearchRowBasic.
     * 
     * @return attention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this PartnerSearchRowBasic.
     * 
     * @param attention
     */
    public void setAttention(org.mule.module.netsuite.api.internal.SearchColumnStringField[] attention) {
        this.attention = attention;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAttention(int i) {
        return this.attention[i];
    }

    public void setAttention(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.attention[i] = _value;
    }


    /**
     * Gets the billAddress value for this PartnerSearchRowBasic.
     * 
     * @return billAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this PartnerSearchRowBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress) {
        this.billAddress = billAddress;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillAddress(int i) {
        return this.billAddress[i];
    }

    public void setBillAddress(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billAddress[i] = _value;
    }


    /**
     * Gets the billAddress1 value for this PartnerSearchRowBasic.
     * 
     * @return billAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress1() {
        return billAddress1;
    }


    /**
     * Sets the billAddress1 value for this PartnerSearchRowBasic.
     * 
     * @param billAddress1
     */
    public void setBillAddress1(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1) {
        this.billAddress1 = billAddress1;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillAddress1(int i) {
        return this.billAddress1[i];
    }

    public void setBillAddress1(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billAddress1[i] = _value;
    }


    /**
     * Gets the billAddress2 value for this PartnerSearchRowBasic.
     * 
     * @return billAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress2() {
        return billAddress2;
    }


    /**
     * Sets the billAddress2 value for this PartnerSearchRowBasic.
     * 
     * @param billAddress2
     */
    public void setBillAddress2(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2) {
        this.billAddress2 = billAddress2;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillAddress2(int i) {
        return this.billAddress2[i];
    }

    public void setBillAddress2(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billAddress2[i] = _value;
    }


    /**
     * Gets the billAddress3 value for this PartnerSearchRowBasic.
     * 
     * @return billAddress3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress3() {
        return billAddress3;
    }


    /**
     * Sets the billAddress3 value for this PartnerSearchRowBasic.
     * 
     * @param billAddress3
     */
    public void setBillAddress3(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress3) {
        this.billAddress3 = billAddress3;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillAddress3(int i) {
        return this.billAddress3[i];
    }

    public void setBillAddress3(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billAddress3[i] = _value;
    }


    /**
     * Gets the billAddressee value for this PartnerSearchRowBasic.
     * 
     * @return billAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this PartnerSearchRowBasic.
     * 
     * @param billAddressee
     */
    public void setBillAddressee(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee) {
        this.billAddressee = billAddressee;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillAddressee(int i) {
        return this.billAddressee[i];
    }

    public void setBillAddressee(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billAddressee[i] = _value;
    }


    /**
     * Gets the billAttention value for this PartnerSearchRowBasic.
     * 
     * @return billAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this PartnerSearchRowBasic.
     * 
     * @param billAttention
     */
    public void setBillAttention(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention) {
        this.billAttention = billAttention;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillAttention(int i) {
        return this.billAttention[i];
    }

    public void setBillAttention(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billAttention[i] = _value;
    }


    /**
     * Gets the billCity value for this PartnerSearchRowBasic.
     * 
     * @return billCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this PartnerSearchRowBasic.
     * 
     * @param billCity
     */
    public void setBillCity(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity) {
        this.billCity = billCity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillCity(int i) {
        return this.billCity[i];
    }

    public void setBillCity(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billCity[i] = _value;
    }


    /**
     * Gets the billCountry value for this PartnerSearchRowBasic.
     * 
     * @return billCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this PartnerSearchRowBasic.
     * 
     * @param billCountry
     */
    public void setBillCountry(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry) {
        this.billCountry = billCountry;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getBillCountry(int i) {
        return this.billCountry[i];
    }

    public void setBillCountry(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.billCountry[i] = _value;
    }


    /**
     * Gets the billCountryCode value for this PartnerSearchRowBasic.
     * 
     * @return billCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCountryCode() {
        return billCountryCode;
    }


    /**
     * Sets the billCountryCode value for this PartnerSearchRowBasic.
     * 
     * @param billCountryCode
     */
    public void setBillCountryCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode) {
        this.billCountryCode = billCountryCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillCountryCode(int i) {
        return this.billCountryCode[i];
    }

    public void setBillCountryCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billCountryCode[i] = _value;
    }


    /**
     * Gets the billPhone value for this PartnerSearchRowBasic.
     * 
     * @return billPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this PartnerSearchRowBasic.
     * 
     * @param billPhone
     */
    public void setBillPhone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone) {
        this.billPhone = billPhone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillPhone(int i) {
        return this.billPhone[i];
    }

    public void setBillPhone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billPhone[i] = _value;
    }


    /**
     * Gets the billState value for this PartnerSearchRowBasic.
     * 
     * @return billState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this PartnerSearchRowBasic.
     * 
     * @param billState
     */
    public void setBillState(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState) {
        this.billState = billState;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillState(int i) {
        return this.billState[i];
    }

    public void setBillState(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billState[i] = _value;
    }


    /**
     * Gets the billZipCode value for this PartnerSearchRowBasic.
     * 
     * @return billZipCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillZipCode() {
        return billZipCode;
    }


    /**
     * Sets the billZipCode value for this PartnerSearchRowBasic.
     * 
     * @param billZipCode
     */
    public void setBillZipCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZipCode) {
        this.billZipCode = billZipCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillZipCode(int i) {
        return this.billZipCode[i];
    }

    public void setBillZipCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billZipCode[i] = _value;
    }


    /**
     * Gets the category value for this PartnerSearchRowBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this PartnerSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchColumnStringField[] category) {
        this.category = category;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the city value for this PartnerSearchRowBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this PartnerSearchRowBasic.
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
     * Gets the _class value for this PartnerSearchRowBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PartnerSearchRowBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the comments value for this PartnerSearchRowBasic.
     * 
     * @return comments
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this PartnerSearchRowBasic.
     * 
     * @param comments
     */
    public void setComments(org.mule.module.netsuite.api.internal.SearchColumnStringField[] comments) {
        this.comments = comments;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.comments[i] = _value;
    }


    /**
     * Gets the companyName value for this PartnerSearchRowBasic.
     * 
     * @return companyName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this PartnerSearchRowBasic.
     * 
     * @param companyName
     */
    public void setCompanyName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] companyName) {
        this.companyName = companyName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCompanyName(int i) {
        return this.companyName[i];
    }

    public void setCompanyName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.companyName[i] = _value;
    }


    /**
     * Gets the country value for this PartnerSearchRowBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PartnerSearchRowBasic.
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
     * Gets the countryCode value for this PartnerSearchRowBasic.
     * 
     * @return countryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this PartnerSearchRowBasic.
     * 
     * @param countryCode
     */
    public void setCountryCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] countryCode) {
        this.countryCode = countryCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCountryCode(int i) {
        return this.countryCode[i];
    }

    public void setCountryCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.countryCode[i] = _value;
    }


    /**
     * Gets the dateCreated value for this PartnerSearchRowBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this PartnerSearchRowBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }


    /**
     * Gets the department value for this PartnerSearchRowBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PartnerSearchRowBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department) {
        this.department = department;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.department[i] = _value;
    }


    /**
     * Gets the eligibleForCommission value for this PartnerSearchRowBasic.
     * 
     * @return eligibleForCommission
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this PartnerSearchRowBasic.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getEligibleForCommission(int i) {
        return this.eligibleForCommission[i];
    }

    public void setEligibleForCommission(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.eligibleForCommission[i] = _value;
    }


    /**
     * Gets the email value for this PartnerSearchRowBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PartnerSearchRowBasic.
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
     * Gets the entityId value for this PartnerSearchRowBasic.
     * 
     * @return entityId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this PartnerSearchRowBasic.
     * 
     * @param entityId
     */
    public void setEntityId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] entityId) {
        this.entityId = entityId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getEntityId(int i) {
        return this.entityId[i];
    }

    public void setEntityId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.entityId[i] = _value;
    }


    /**
     * Gets the entityNumber value for this PartnerSearchRowBasic.
     * 
     * @return entityNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getEntityNumber() {
        return entityNumber;
    }


    /**
     * Sets the entityNumber value for this PartnerSearchRowBasic.
     * 
     * @param entityNumber
     */
    public void setEntityNumber(org.mule.module.netsuite.api.internal.SearchColumnLongField[] entityNumber) {
        this.entityNumber = entityNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getEntityNumber(int i) {
        return this.entityNumber[i];
    }

    public void setEntityNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.entityNumber[i] = _value;
    }


    /**
     * Gets the externalId value for this PartnerSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PartnerSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the fax value for this PartnerSearchRowBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this PartnerSearchRowBasic.
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
     * Gets the firstName value for this PartnerSearchRowBasic.
     * 
     * @return firstName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this PartnerSearchRowBasic.
     * 
     * @param firstName
     */
    public void setFirstName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] firstName) {
        this.firstName = firstName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getFirstName(int i) {
        return this.firstName[i];
    }

    public void setFirstName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.firstName[i] = _value;
    }


    /**
     * Gets the giveAccess value for this PartnerSearchRowBasic.
     * 
     * @return giveAccess
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this PartnerSearchRowBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] giveAccess) {
        this.giveAccess = giveAccess;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getGiveAccess(int i) {
        return this.giveAccess[i];
    }

    public void setGiveAccess(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.giveAccess[i] = _value;
    }


    /**
     * Gets the globalSubscriptionStatus value for this PartnerSearchRowBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this PartnerSearchRowBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getGlobalSubscriptionStatus(int i) {
        return this.globalSubscriptionStatus[i];
    }

    public void setGlobalSubscriptionStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.globalSubscriptionStatus[i] = _value;
    }


    /**
     * Gets the hasDuplicates value for this PartnerSearchRowBasic.
     * 
     * @return hasDuplicates
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this PartnerSearchRowBasic.
     * 
     * @param hasDuplicates
     */
    public void setHasDuplicates(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getHasDuplicates(int i) {
        return this.hasDuplicates[i];
    }

    public void setHasDuplicates(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.hasDuplicates[i] = _value;
    }


    /**
     * Gets the homePhone value for this PartnerSearchRowBasic.
     * 
     * @return homePhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this PartnerSearchRowBasic.
     * 
     * @param homePhone
     */
    public void setHomePhone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] homePhone) {
        this.homePhone = homePhone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getHomePhone(int i) {
        return this.homePhone[i];
    }

    public void setHomePhone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.homePhone[i] = _value;
    }


    /**
     * Gets the image value for this PartnerSearchRowBasic.
     * 
     * @return image
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this PartnerSearchRowBasic.
     * 
     * @param image
     */
    public void setImage(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] image) {
        this.image = image;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getImage(int i) {
        return this.image[i];
    }

    public void setImage(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.image[i] = _value;
    }


    /**
     * Gets the internalId value for this PartnerSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PartnerSearchRowBasic.
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
     * Gets the isDefaultBilling value for this PartnerSearchRowBasic.
     * 
     * @return isDefaultBilling
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this PartnerSearchRowBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsDefaultBilling(int i) {
        return this.isDefaultBilling[i];
    }

    public void setIsDefaultBilling(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isDefaultBilling[i] = _value;
    }


    /**
     * Gets the isDefaultShipping value for this PartnerSearchRowBasic.
     * 
     * @return isDefaultShipping
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this PartnerSearchRowBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsDefaultShipping(int i) {
        return this.isDefaultShipping[i];
    }

    public void setIsDefaultShipping(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isDefaultShipping[i] = _value;
    }


    /**
     * Gets the isInactive value for this PartnerSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PartnerSearchRowBasic.
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
     * Gets the isPerson value for this PartnerSearchRowBasic.
     * 
     * @return isPerson
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this PartnerSearchRowBasic.
     * 
     * @param isPerson
     */
    public void setIsPerson(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPerson) {
        this.isPerson = isPerson;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsPerson(int i) {
        return this.isPerson[i];
    }

    public void setIsPerson(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isPerson[i] = _value;
    }


    /**
     * Gets the language value for this PartnerSearchRowBasic.
     * 
     * @return language
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this PartnerSearchRowBasic.
     * 
     * @param language
     */
    public void setLanguage(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] language) {
        this.language = language;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.language[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this PartnerSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PartnerSearchRowBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }


    /**
     * Gets the lastName value for this PartnerSearchRowBasic.
     * 
     * @return lastName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this PartnerSearchRowBasic.
     * 
     * @param lastName
     */
    public void setLastName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] lastName) {
        this.lastName = lastName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getLastName(int i) {
        return this.lastName[i];
    }

    public void setLastName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.lastName[i] = _value;
    }


    /**
     * Gets the level value for this PartnerSearchRowBasic.
     * 
     * @return level
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getLevel() {
        return level;
    }


    /**
     * Sets the level value for this PartnerSearchRowBasic.
     * 
     * @param level
     */
    public void setLevel(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] level) {
        this.level = level;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getLevel(int i) {
        return this.level[i];
    }

    public void setLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.level[i] = _value;
    }


    /**
     * Gets the location value for this PartnerSearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PartnerSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the middleName value for this PartnerSearchRowBasic.
     * 
     * @return middleName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this PartnerSearchRowBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] middleName) {
        this.middleName = middleName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMiddleName(int i) {
        return this.middleName[i];
    }

    public void setMiddleName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.middleName[i] = _value;
    }


    /**
     * Gets the mobilePhone value for this PartnerSearchRowBasic.
     * 
     * @return mobilePhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this PartnerSearchRowBasic.
     * 
     * @param mobilePhone
     */
    public void setMobilePhone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMobilePhone(int i) {
        return this.mobilePhone[i];
    }

    public void setMobilePhone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.mobilePhone[i] = _value;
    }


    /**
     * Gets the parent value for this PartnerSearchRowBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this PartnerSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the partnerCode value for this PartnerSearchRowBasic.
     * 
     * @return partnerCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPartnerCode() {
        return partnerCode;
    }


    /**
     * Sets the partnerCode value for this PartnerSearchRowBasic.
     * 
     * @param partnerCode
     */
    public void setPartnerCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] partnerCode) {
        this.partnerCode = partnerCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPartnerCode(int i) {
        return this.partnerCode[i];
    }

    public void setPartnerCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.partnerCode[i] = _value;
    }


    /**
     * Gets the permission value for this PartnerSearchRowBasic.
     * 
     * @return permission
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this PartnerSearchRowBasic.
     * 
     * @param permission
     */
    public void setPermission(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permission) {
        this.permission = permission;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getPermission(int i) {
        return this.permission[i];
    }

    public void setPermission(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.permission[i] = _value;
    }


    /**
     * Gets the phone value for this PartnerSearchRowBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PartnerSearchRowBasic.
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
     * Gets the phoneticName value for this PartnerSearchRowBasic.
     * 
     * @return phoneticName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this PartnerSearchRowBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] phoneticName) {
        this.phoneticName = phoneticName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPhoneticName(int i) {
        return this.phoneticName[i];
    }

    public void setPhoneticName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.phoneticName[i] = _value;
    }


    /**
     * Gets the promoCode value for this PartnerSearchRowBasic.
     * 
     * @return promoCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this PartnerSearchRowBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] promoCode) {
        this.promoCode = promoCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPromoCode(int i) {
        return this.promoCode[i];
    }

    public void setPromoCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.promoCode[i] = _value;
    }


    /**
     * Gets the salutation value for this PartnerSearchRowBasic.
     * 
     * @return salutation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this PartnerSearchRowBasic.
     * 
     * @param salutation
     */
    public void setSalutation(org.mule.module.netsuite.api.internal.SearchColumnStringField[] salutation) {
        this.salutation = salutation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSalutation(int i) {
        return this.salutation[i];
    }

    public void setSalutation(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.salutation[i] = _value;
    }


    /**
     * Gets the shipAddress value for this PartnerSearchRowBasic.
     * 
     * @return shipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this PartnerSearchRowBasic.
     * 
     * @param shipAddress
     */
    public void setShipAddress(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress) {
        this.shipAddress = shipAddress;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipAddress(int i) {
        return this.shipAddress[i];
    }

    public void setShipAddress(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipAddress[i] = _value;
    }


    /**
     * Gets the shipAddress1 value for this PartnerSearchRowBasic.
     * 
     * @return shipAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this PartnerSearchRowBasic.
     * 
     * @param shipAddress1
     */
    public void setShipAddress1(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress1) {
        this.shipAddress1 = shipAddress1;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipAddress1(int i) {
        return this.shipAddress1[i];
    }

    public void setShipAddress1(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipAddress1[i] = _value;
    }


    /**
     * Gets the shipAddress2 value for this PartnerSearchRowBasic.
     * 
     * @return shipAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this PartnerSearchRowBasic.
     * 
     * @param shipAddress2
     */
    public void setShipAddress2(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipAddress2(int i) {
        return this.shipAddress2[i];
    }

    public void setShipAddress2(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipAddress2[i] = _value;
    }


    /**
     * Gets the shipAddress3 value for this PartnerSearchRowBasic.
     * 
     * @return shipAddress3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress3() {
        return shipAddress3;
    }


    /**
     * Sets the shipAddress3 value for this PartnerSearchRowBasic.
     * 
     * @param shipAddress3
     */
    public void setShipAddress3(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress3) {
        this.shipAddress3 = shipAddress3;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipAddress3(int i) {
        return this.shipAddress3[i];
    }

    public void setShipAddress3(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipAddress3[i] = _value;
    }


    /**
     * Gets the shipAddressee value for this PartnerSearchRowBasic.
     * 
     * @return shipAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this PartnerSearchRowBasic.
     * 
     * @param shipAddressee
     */
    public void setShipAddressee(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipAddressee(int i) {
        return this.shipAddressee[i];
    }

    public void setShipAddressee(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipAddressee[i] = _value;
    }


    /**
     * Gets the shipAttention value for this PartnerSearchRowBasic.
     * 
     * @return shipAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this PartnerSearchRowBasic.
     * 
     * @param shipAttention
     */
    public void setShipAttention(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAttention) {
        this.shipAttention = shipAttention;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipAttention(int i) {
        return this.shipAttention[i];
    }

    public void setShipAttention(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipAttention[i] = _value;
    }


    /**
     * Gets the shipCity value for this PartnerSearchRowBasic.
     * 
     * @return shipCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this PartnerSearchRowBasic.
     * 
     * @param shipCity
     */
    public void setShipCity(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCity) {
        this.shipCity = shipCity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipCity(int i) {
        return this.shipCity[i];
    }

    public void setShipCity(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipCity[i] = _value;
    }


    /**
     * Gets the shipCountry value for this PartnerSearchRowBasic.
     * 
     * @return shipCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this PartnerSearchRowBasic.
     * 
     * @param shipCountry
     */
    public void setShipCountry(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] shipCountry) {
        this.shipCountry = shipCountry;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getShipCountry(int i) {
        return this.shipCountry[i];
    }

    public void setShipCountry(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.shipCountry[i] = _value;
    }


    /**
     * Gets the shipCountryCode value for this PartnerSearchRowBasic.
     * 
     * @return shipCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCountryCode() {
        return shipCountryCode;
    }


    /**
     * Sets the shipCountryCode value for this PartnerSearchRowBasic.
     * 
     * @param shipCountryCode
     */
    public void setShipCountryCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipCountryCode(int i) {
        return this.shipCountryCode[i];
    }

    public void setShipCountryCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipCountryCode[i] = _value;
    }


    /**
     * Gets the shipPhone value for this PartnerSearchRowBasic.
     * 
     * @return shipPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this PartnerSearchRowBasic.
     * 
     * @param shipPhone
     */
    public void setShipPhone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipPhone) {
        this.shipPhone = shipPhone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipPhone(int i) {
        return this.shipPhone[i];
    }

    public void setShipPhone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipPhone[i] = _value;
    }


    /**
     * Gets the shipState value for this PartnerSearchRowBasic.
     * 
     * @return shipState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this PartnerSearchRowBasic.
     * 
     * @param shipState
     */
    public void setShipState(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipState) {
        this.shipState = shipState;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipState(int i) {
        return this.shipState[i];
    }

    public void setShipState(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipState[i] = _value;
    }


    /**
     * Gets the shipZip value for this PartnerSearchRowBasic.
     * 
     * @return shipZip
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this PartnerSearchRowBasic.
     * 
     * @param shipZip
     */
    public void setShipZip(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipZip) {
        this.shipZip = shipZip;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShipZip(int i) {
        return this.shipZip[i];
    }

    public void setShipZip(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shipZip[i] = _value;
    }


    /**
     * Gets the state value for this PartnerSearchRowBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this PartnerSearchRowBasic.
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
     * Gets the subscription value for this PartnerSearchRowBasic.
     * 
     * @return subscription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this PartnerSearchRowBasic.
     * 
     * @param subscription
     */
    public void setSubscription(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subscription) {
        this.subscription = subscription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSubscription(int i) {
        return this.subscription[i];
    }

    public void setSubscription(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.subscription[i] = _value;
    }


    /**
     * Gets the subscriptionDate value for this PartnerSearchRowBasic.
     * 
     * @return subscriptionDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getSubscriptionDate() {
        return subscriptionDate;
    }


    /**
     * Sets the subscriptionDate value for this PartnerSearchRowBasic.
     * 
     * @param subscriptionDate
     */
    public void setSubscriptionDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getSubscriptionDate(int i) {
        return this.subscriptionDate[i];
    }

    public void setSubscriptionDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.subscriptionDate[i] = _value;
    }


    /**
     * Gets the subscriptionStatus value for this PartnerSearchRowBasic.
     * 
     * @return subscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getSubscriptionStatus() {
        return subscriptionStatus;
    }


    /**
     * Sets the subscriptionStatus value for this PartnerSearchRowBasic.
     * 
     * @param subscriptionStatus
     */
    public void setSubscriptionStatus(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getSubscriptionStatus(int i) {
        return this.subscriptionStatus[i];
    }

    public void setSubscriptionStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.subscriptionStatus[i] = _value;
    }


    /**
     * Gets the subsidiary value for this PartnerSearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PartnerSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the title value for this PartnerSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PartnerSearchRowBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchColumnStringField[] title) {
        this.title = title;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.title[i] = _value;
    }


    /**
     * Gets the url value for this PartnerSearchRowBasic.
     * 
     * @return url
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this PartnerSearchRowBasic.
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
     * Gets the zipCode value for this PartnerSearchRowBasic.
     * 
     * @return zipCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this PartnerSearchRowBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] zipCode) {
        this.zipCode = zipCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getZipCode(int i) {
        return this.zipCode[i];
    }

    public void setZipCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.zipCode[i] = _value;
    }


    /**
     * Gets the customFieldList value for this PartnerSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PartnerSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartnerSearchRowBasic)) return false;
        PartnerSearchRowBasic other = (PartnerSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              java.util.Arrays.equals(this.address, other.getAddress()))) &&
            ((this.address1==null && other.getAddress1()==null) || 
             (this.address1!=null &&
              java.util.Arrays.equals(this.address1, other.getAddress1()))) &&
            ((this.address2==null && other.getAddress2()==null) || 
             (this.address2!=null &&
              java.util.Arrays.equals(this.address2, other.getAddress2()))) &&
            ((this.address3==null && other.getAddress3()==null) || 
             (this.address3!=null &&
              java.util.Arrays.equals(this.address3, other.getAddress3()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              java.util.Arrays.equals(this.addressee, other.getAddressee()))) &&
            ((this.addressInternalId==null && other.getAddressInternalId()==null) || 
             (this.addressInternalId!=null &&
              java.util.Arrays.equals(this.addressInternalId, other.getAddressInternalId()))) &&
            ((this.addressLabel==null && other.getAddressLabel()==null) || 
             (this.addressLabel!=null &&
              java.util.Arrays.equals(this.addressLabel, other.getAddressLabel()))) &&
            ((this.addressPhone==null && other.getAddressPhone()==null) || 
             (this.addressPhone!=null &&
              java.util.Arrays.equals(this.addressPhone, other.getAddressPhone()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              java.util.Arrays.equals(this.altEmail, other.getAltEmail()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              java.util.Arrays.equals(this.altName, other.getAltName()))) &&
            ((this.altPhone==null && other.getAltPhone()==null) || 
             (this.altPhone!=null &&
              java.util.Arrays.equals(this.altPhone, other.getAltPhone()))) &&
            ((this.assignTasks==null && other.getAssignTasks()==null) || 
             (this.assignTasks!=null &&
              java.util.Arrays.equals(this.assignTasks, other.getAssignTasks()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              java.util.Arrays.equals(this.attention, other.getAttention()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              java.util.Arrays.equals(this.billAddress, other.getBillAddress()))) &&
            ((this.billAddress1==null && other.getBillAddress1()==null) || 
             (this.billAddress1!=null &&
              java.util.Arrays.equals(this.billAddress1, other.getBillAddress1()))) &&
            ((this.billAddress2==null && other.getBillAddress2()==null) || 
             (this.billAddress2!=null &&
              java.util.Arrays.equals(this.billAddress2, other.getBillAddress2()))) &&
            ((this.billAddress3==null && other.getBillAddress3()==null) || 
             (this.billAddress3!=null &&
              java.util.Arrays.equals(this.billAddress3, other.getBillAddress3()))) &&
            ((this.billAddressee==null && other.getBillAddressee()==null) || 
             (this.billAddressee!=null &&
              java.util.Arrays.equals(this.billAddressee, other.getBillAddressee()))) &&
            ((this.billAttention==null && other.getBillAttention()==null) || 
             (this.billAttention!=null &&
              java.util.Arrays.equals(this.billAttention, other.getBillAttention()))) &&
            ((this.billCity==null && other.getBillCity()==null) || 
             (this.billCity!=null &&
              java.util.Arrays.equals(this.billCity, other.getBillCity()))) &&
            ((this.billCountry==null && other.getBillCountry()==null) || 
             (this.billCountry!=null &&
              java.util.Arrays.equals(this.billCountry, other.getBillCountry()))) &&
            ((this.billCountryCode==null && other.getBillCountryCode()==null) || 
             (this.billCountryCode!=null &&
              java.util.Arrays.equals(this.billCountryCode, other.getBillCountryCode()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              java.util.Arrays.equals(this.billPhone, other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              java.util.Arrays.equals(this.billState, other.getBillState()))) &&
            ((this.billZipCode==null && other.getBillZipCode()==null) || 
             (this.billZipCode!=null &&
              java.util.Arrays.equals(this.billZipCode, other.getBillZipCode()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              java.util.Arrays.equals(this.companyName, other.getCompanyName()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              java.util.Arrays.equals(this.countryCode, other.getCountryCode()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              java.util.Arrays.equals(this.eligibleForCommission, other.getEligibleForCommission()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              java.util.Arrays.equals(this.entityId, other.getEntityId()))) &&
            ((this.entityNumber==null && other.getEntityNumber()==null) || 
             (this.entityNumber!=null &&
              java.util.Arrays.equals(this.entityNumber, other.getEntityNumber()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              java.util.Arrays.equals(this.fax, other.getFax()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              java.util.Arrays.equals(this.firstName, other.getFirstName()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              java.util.Arrays.equals(this.giveAccess, other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              java.util.Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              java.util.Arrays.equals(this.hasDuplicates, other.getHasDuplicates()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              java.util.Arrays.equals(this.homePhone, other.getHomePhone()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              java.util.Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              java.util.Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              java.util.Arrays.equals(this.isPerson, other.getIsPerson()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              java.util.Arrays.equals(this.lastName, other.getLastName()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              java.util.Arrays.equals(this.level, other.getLevel()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              java.util.Arrays.equals(this.middleName, other.getMiddleName()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              java.util.Arrays.equals(this.mobilePhone, other.getMobilePhone()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.partnerCode==null && other.getPartnerCode()==null) || 
             (this.partnerCode!=null &&
              java.util.Arrays.equals(this.partnerCode, other.getPartnerCode()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              java.util.Arrays.equals(this.permission, other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              java.util.Arrays.equals(this.phoneticName, other.getPhoneticName()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              java.util.Arrays.equals(this.promoCode, other.getPromoCode()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              java.util.Arrays.equals(this.salutation, other.getSalutation()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              java.util.Arrays.equals(this.shipAddress, other.getShipAddress()))) &&
            ((this.shipAddress1==null && other.getShipAddress1()==null) || 
             (this.shipAddress1!=null &&
              java.util.Arrays.equals(this.shipAddress1, other.getShipAddress1()))) &&
            ((this.shipAddress2==null && other.getShipAddress2()==null) || 
             (this.shipAddress2!=null &&
              java.util.Arrays.equals(this.shipAddress2, other.getShipAddress2()))) &&
            ((this.shipAddress3==null && other.getShipAddress3()==null) || 
             (this.shipAddress3!=null &&
              java.util.Arrays.equals(this.shipAddress3, other.getShipAddress3()))) &&
            ((this.shipAddressee==null && other.getShipAddressee()==null) || 
             (this.shipAddressee!=null &&
              java.util.Arrays.equals(this.shipAddressee, other.getShipAddressee()))) &&
            ((this.shipAttention==null && other.getShipAttention()==null) || 
             (this.shipAttention!=null &&
              java.util.Arrays.equals(this.shipAttention, other.getShipAttention()))) &&
            ((this.shipCity==null && other.getShipCity()==null) || 
             (this.shipCity!=null &&
              java.util.Arrays.equals(this.shipCity, other.getShipCity()))) &&
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              java.util.Arrays.equals(this.shipCountry, other.getShipCountry()))) &&
            ((this.shipCountryCode==null && other.getShipCountryCode()==null) || 
             (this.shipCountryCode!=null &&
              java.util.Arrays.equals(this.shipCountryCode, other.getShipCountryCode()))) &&
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              java.util.Arrays.equals(this.shipPhone, other.getShipPhone()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              java.util.Arrays.equals(this.shipState, other.getShipState()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              java.util.Arrays.equals(this.shipZip, other.getShipZip()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              java.util.Arrays.equals(this.subscription, other.getSubscription()))) &&
            ((this.subscriptionDate==null && other.getSubscriptionDate()==null) || 
             (this.subscriptionDate!=null &&
              java.util.Arrays.equals(this.subscriptionDate, other.getSubscriptionDate()))) &&
            ((this.subscriptionStatus==null && other.getSubscriptionStatus()==null) || 
             (this.subscriptionStatus!=null &&
              java.util.Arrays.equals(this.subscriptionStatus, other.getSubscriptionStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              java.util.Arrays.equals(this.url, other.getUrl()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              java.util.Arrays.equals(this.zipCode, other.getZipCode()))) &&
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
        if (getAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getAddressee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressLabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressLabel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressLabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddressPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddressPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddressPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssignTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignTasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAttention() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttention());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttention(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAddressee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAddressee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAddressee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillAttention() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillAttention());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillAttention(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillCountryCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillCountryCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillZipCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillZipCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillZipCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
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
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCompanyName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompanyName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompanyName(), i);
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
        if (getCountryCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEligibleForCommission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEligibleForCommission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEligibleForCommission(), i);
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
        if (getEntityId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEntityNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityNumber(), i);
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
        if (getFirstName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiveAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiveAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiveAccess(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGlobalSubscriptionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGlobalSubscriptionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGlobalSubscriptionStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHasDuplicates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHasDuplicates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHasDuplicates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHomePhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHomePhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHomePhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImage(), i);
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
        if (getIsDefaultBilling() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDefaultBilling());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDefaultBilling(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsDefaultShipping() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDefaultShipping());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDefaultShipping(), i);
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
        if (getIsPerson() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsPerson());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsPerson(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLanguage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLanguage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLanguage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastModifiedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModifiedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModifiedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMiddleName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMiddleName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMiddleName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMobilePhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMobilePhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMobilePhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPermission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermission(), i);
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
        if (getPhoneticName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPhoneticName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPhoneticName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromoCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPromoCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPromoCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalutation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalutation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalutation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddress3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddress3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddress3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAddressee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAddressee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAddressee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipAttention() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipAttention());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipAttention(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipCountry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipCountry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipCountry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipCountryCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipCountryCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipCountryCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipPhone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipPhone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipPhone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipZip(), i);
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
        if (getSubscription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriptionDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptionDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptionDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriptionStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubscriptionStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubscriptionStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTitle(), i);
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
        if (getZipCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZipCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZipCode(), i);
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
        new org.apache.axis.description.TypeDesc(PartnerSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressInternalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "addressInternalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assignTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "companyName"));
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
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isDefaultShipping"));
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
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddress1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddress3"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCountryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCountryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipZip"));
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
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subscriptionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
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
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "zipCode"));
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
