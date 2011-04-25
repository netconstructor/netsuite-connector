/**
 * EntitySearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EntitySearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField address;

    private org.mule.module.netsuite.api.internal.SearchStringField addressee;

    private org.mule.module.netsuite.api.internal.SearchStringField addressLabel;

    private org.mule.module.netsuite.api.internal.SearchStringField addressPhone;

    private org.mule.module.netsuite.api.internal.SearchStringField attention;

    private org.mule.module.netsuite.api.internal.SearchStringField city;

    private org.mule.module.netsuite.api.internal.SearchStringField comments;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country;

    private org.mule.module.netsuite.api.internal.SearchStringField county;

    private org.mule.module.netsuite.api.internal.SearchDateField dateCreated;

    private org.mule.module.netsuite.api.internal.SearchStringField email;

    private org.mule.module.netsuite.api.internal.SearchStringField entityId;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchStringField fax;

    private org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchStringField image;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission;

    private org.mule.module.netsuite.api.internal.SearchStringField phone;

    private org.mule.module.netsuite.api.internal.SearchStringField phoneticName;

    private org.mule.module.netsuite.api.internal.SearchStringField state;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchStringField zipCode;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public EntitySearchBasic() {
    }

    public EntitySearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField address,
           org.mule.module.netsuite.api.internal.SearchStringField addressee,
           org.mule.module.netsuite.api.internal.SearchStringField addressLabel,
           org.mule.module.netsuite.api.internal.SearchStringField addressPhone,
           org.mule.module.netsuite.api.internal.SearchStringField attention,
           org.mule.module.netsuite.api.internal.SearchStringField city,
           org.mule.module.netsuite.api.internal.SearchStringField comments,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country,
           org.mule.module.netsuite.api.internal.SearchStringField county,
           org.mule.module.netsuite.api.internal.SearchDateField dateCreated,
           org.mule.module.netsuite.api.internal.SearchStringField email,
           org.mule.module.netsuite.api.internal.SearchStringField entityId,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchStringField fax,
           org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchStringField image,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission,
           org.mule.module.netsuite.api.internal.SearchStringField phone,
           org.mule.module.netsuite.api.internal.SearchStringField phoneticName,
           org.mule.module.netsuite.api.internal.SearchStringField state,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.SearchStringField zipCode,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.attention = attention;
        this.city = city;
        this.comments = comments;
        this.country = country;
        this.county = county;
        this.dateCreated = dateCreated;
        this.email = email;
        this.entityId = entityId;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.level = level;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.state = state;
        this.subsidiary = subsidiary;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this EntitySearchBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this EntitySearchBasic.
     * 
     * @param address
     */
    public void setAddress(org.mule.module.netsuite.api.internal.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this EntitySearchBasic.
     * 
     * @return addressee
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this EntitySearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(org.mule.module.netsuite.api.internal.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this EntitySearchBasic.
     * 
     * @return addressLabel
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this EntitySearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(org.mule.module.netsuite.api.internal.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this EntitySearchBasic.
     * 
     * @return addressPhone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this EntitySearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(org.mule.module.netsuite.api.internal.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the attention value for this EntitySearchBasic.
     * 
     * @return attention
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this EntitySearchBasic.
     * 
     * @param attention
     */
    public void setAttention(org.mule.module.netsuite.api.internal.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the city value for this EntitySearchBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this EntitySearchBasic.
     * 
     * @param city
     */
    public void setCity(org.mule.module.netsuite.api.internal.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the comments value for this EntitySearchBasic.
     * 
     * @return comments
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EntitySearchBasic.
     * 
     * @param comments
     */
    public void setComments(org.mule.module.netsuite.api.internal.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the country value for this EntitySearchBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this EntitySearchBasic.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this EntitySearchBasic.
     * 
     * @return county
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this EntitySearchBasic.
     * 
     * @param county
     */
    public void setCounty(org.mule.module.netsuite.api.internal.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the dateCreated value for this EntitySearchBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this EntitySearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the email value for this EntitySearchBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EntitySearchBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the entityId value for this EntitySearchBasic.
     * 
     * @return entityId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this EntitySearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(org.mule.module.netsuite.api.internal.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the externalId value for this EntitySearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this EntitySearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this EntitySearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this EntitySearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this EntitySearchBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this EntitySearchBasic.
     * 
     * @param fax
     */
    public void setFax(org.mule.module.netsuite.api.internal.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the giveAccess value for this EntitySearchBasic.
     * 
     * @return giveAccess
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this EntitySearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this EntitySearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this EntitySearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the image value for this EntitySearchBasic.
     * 
     * @return image
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this EntitySearchBasic.
     * 
     * @param image
     */
    public void setImage(org.mule.module.netsuite.api.internal.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the internalId value for this EntitySearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EntitySearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this EntitySearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this EntitySearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefaultBilling value for this EntitySearchBasic.
     * 
     * @return isDefaultBilling
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this EntitySearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this EntitySearchBasic.
     * 
     * @return isDefaultShipping
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this EntitySearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isInactive value for this EntitySearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this EntitySearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the language value for this EntitySearchBasic.
     * 
     * @return language
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this EntitySearchBasic.
     * 
     * @param language
     */
    public void setLanguage(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedDate value for this EntitySearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EntitySearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the level value for this EntitySearchBasic.
     * 
     * @return level
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLevel() {
        return level;
    }


    /**
     * Sets the level value for this EntitySearchBasic.
     * 
     * @param level
     */
    public void setLevel(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level) {
        this.level = level;
    }


    /**
     * Gets the permission value for this EntitySearchBasic.
     * 
     * @return permission
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this EntitySearchBasic.
     * 
     * @param permission
     */
    public void setPermission(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }


    /**
     * Gets the phone value for this EntitySearchBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this EntitySearchBasic.
     * 
     * @param phone
     */
    public void setPhone(org.mule.module.netsuite.api.internal.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this EntitySearchBasic.
     * 
     * @return phoneticName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this EntitySearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(org.mule.module.netsuite.api.internal.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the state value for this EntitySearchBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this EntitySearchBasic.
     * 
     * @param state
     */
    public void setState(org.mule.module.netsuite.api.internal.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this EntitySearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EntitySearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the zipCode value for this EntitySearchBasic.
     * 
     * @return zipCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this EntitySearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(org.mule.module.netsuite.api.internal.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this EntitySearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this EntitySearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EntitySearchBasic)) return false;
        EntitySearchBasic other = (EntitySearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.addressLabel==null && other.getAddressLabel()==null) || 
             (this.addressLabel!=null &&
              this.addressLabel.equals(other.getAddressLabel()))) &&
            ((this.addressPhone==null && other.getAddressPhone()==null) || 
             (this.addressPhone!=null &&
              this.addressPhone.equals(other.getAddressPhone()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              this.image.equals(other.getImage()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              this.isDefaultBilling.equals(other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              this.isDefaultShipping.equals(other.getIsDefaultShipping()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.zipCode==null && other.getZipCode()==null) || 
             (this.zipCode!=null &&
              this.zipCode.equals(other.getZipCode()))) &&
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
        int _hashCode = super.hashCode();
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getAddressLabel() != null) {
            _hashCode += getAddressLabel().hashCode();
        }
        if (getAddressPhone() != null) {
            _hashCode += getAddressPhone().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getImage() != null) {
            _hashCode += getImage().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsDefaultBilling() != null) {
            _hashCode += getIsDefaultBilling().hashCode();
        }
        if (getIsDefaultShipping() != null) {
            _hashCode += getIsDefaultShipping().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getPermission() != null) {
            _hashCode += getPermission().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getZipCode() != null) {
            _hashCode += getZipCode().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EntitySearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EntitySearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isDefaultShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "zipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchCustomFieldList"));
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
