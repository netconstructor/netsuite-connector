/**
 * PartnerSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PartnerSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField address;

    private org.mule.module.netsuite.api.internal.SearchStringField addressee;

    private org.mule.module.netsuite.api.internal.SearchStringField addressLabel;

    private org.mule.module.netsuite.api.internal.SearchStringField addressPhone;

    private org.mule.module.netsuite.api.internal.SearchBooleanField assignTasks;

    private org.mule.module.netsuite.api.internal.SearchStringField attention;

    private org.mule.module.netsuite.api.internal.SearchStringField billAddress;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField category;

    private org.mule.module.netsuite.api.internal.SearchStringField city;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField _class;

    private org.mule.module.netsuite.api.internal.SearchStringField comments;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField commissionPlan;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country;

    private org.mule.module.netsuite.api.internal.SearchStringField county;

    private org.mule.module.netsuite.api.internal.SearchDateField dateCreated;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField department;

    private org.mule.module.netsuite.api.internal.SearchBooleanField eligibleForCommission;

    private org.mule.module.netsuite.api.internal.SearchStringField email;

    private org.mule.module.netsuite.api.internal.SearchStringField entityId;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchStringField fax;

    private org.mule.module.netsuite.api.internal.SearchStringField firstName;

    private org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField group;

    private org.mule.module.netsuite.api.internal.SearchBooleanField hasDuplicates;

    private org.mule.module.netsuite.api.internal.SearchStringField image;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isPerson;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchStringField lastName;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField location;

    private org.mule.module.netsuite.api.internal.SearchStringField middleName;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField otherRelationships;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parent;

    private org.mule.module.netsuite.api.internal.SearchStringField partnerCode;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission;

    private org.mule.module.netsuite.api.internal.SearchStringField phone;

    private org.mule.module.netsuite.api.internal.SearchStringField phoneticName;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode;

    private org.mule.module.netsuite.api.internal.SearchStringField salutation;

    private org.mule.module.netsuite.api.internal.SearchStringField shipAddress;

    private org.mule.module.netsuite.api.internal.SearchStringField state;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchStringField URL;

    private org.mule.module.netsuite.api.internal.SearchStringField zipCode;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public PartnerSearchBasic() {
    }

    public PartnerSearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField address,
           org.mule.module.netsuite.api.internal.SearchStringField addressee,
           org.mule.module.netsuite.api.internal.SearchStringField addressLabel,
           org.mule.module.netsuite.api.internal.SearchStringField addressPhone,
           org.mule.module.netsuite.api.internal.SearchBooleanField assignTasks,
           org.mule.module.netsuite.api.internal.SearchStringField attention,
           org.mule.module.netsuite.api.internal.SearchStringField billAddress,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField category,
           org.mule.module.netsuite.api.internal.SearchStringField city,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField _class,
           org.mule.module.netsuite.api.internal.SearchStringField comments,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField commissionPlan,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country,
           org.mule.module.netsuite.api.internal.SearchStringField county,
           org.mule.module.netsuite.api.internal.SearchDateField dateCreated,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField department,
           org.mule.module.netsuite.api.internal.SearchBooleanField eligibleForCommission,
           org.mule.module.netsuite.api.internal.SearchStringField email,
           org.mule.module.netsuite.api.internal.SearchStringField entityId,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchStringField fax,
           org.mule.module.netsuite.api.internal.SearchStringField firstName,
           org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField group,
           org.mule.module.netsuite.api.internal.SearchBooleanField hasDuplicates,
           org.mule.module.netsuite.api.internal.SearchStringField image,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isPerson,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchStringField lastName,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField location,
           org.mule.module.netsuite.api.internal.SearchStringField middleName,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField otherRelationships,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parent,
           org.mule.module.netsuite.api.internal.SearchStringField partnerCode,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission,
           org.mule.module.netsuite.api.internal.SearchStringField phone,
           org.mule.module.netsuite.api.internal.SearchStringField phoneticName,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode,
           org.mule.module.netsuite.api.internal.SearchStringField salutation,
           org.mule.module.netsuite.api.internal.SearchStringField shipAddress,
           org.mule.module.netsuite.api.internal.SearchStringField state,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchStringField URL,
           org.mule.module.netsuite.api.internal.SearchStringField zipCode,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.assignTasks = assignTasks;
        this.attention = attention;
        this.billAddress = billAddress;
        this.category = category;
        this.city = city;
        this._class = _class;
        this.comments = comments;
        this.commissionPlan = commissionPlan;
        this.country = country;
        this.county = county;
        this.dateCreated = dateCreated;
        this.department = department;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.entityId = entityId;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.firstName = firstName;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.hasDuplicates = hasDuplicates;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
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
        this.otherRelationships = otherRelationships;
        this.parent = parent;
        this.partnerCode = partnerCode;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.promoCode = promoCode;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.state = state;
        this.subsidiary = subsidiary;
        this.title = title;
        this.URL = URL;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this PartnerSearchBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this PartnerSearchBasic.
     * 
     * @param address
     */
    public void setAddress(org.mule.module.netsuite.api.internal.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this PartnerSearchBasic.
     * 
     * @return addressee
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this PartnerSearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(org.mule.module.netsuite.api.internal.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this PartnerSearchBasic.
     * 
     * @return addressLabel
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this PartnerSearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(org.mule.module.netsuite.api.internal.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this PartnerSearchBasic.
     * 
     * @return addressPhone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this PartnerSearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(org.mule.module.netsuite.api.internal.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the assignTasks value for this PartnerSearchBasic.
     * 
     * @return assignTasks
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAssignTasks() {
        return assignTasks;
    }


    /**
     * Sets the assignTasks value for this PartnerSearchBasic.
     * 
     * @param assignTasks
     */
    public void setAssignTasks(org.mule.module.netsuite.api.internal.SearchBooleanField assignTasks) {
        this.assignTasks = assignTasks;
    }


    /**
     * Gets the attention value for this PartnerSearchBasic.
     * 
     * @return attention
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this PartnerSearchBasic.
     * 
     * @param attention
     */
    public void setAttention(org.mule.module.netsuite.api.internal.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the billAddress value for this PartnerSearchBasic.
     * 
     * @return billAddress
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this PartnerSearchBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(org.mule.module.netsuite.api.internal.SearchStringField billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the category value for this PartnerSearchBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this PartnerSearchBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the city value for this PartnerSearchBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this PartnerSearchBasic.
     * 
     * @param city
     */
    public void setCity(org.mule.module.netsuite.api.internal.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the _class value for this PartnerSearchBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this PartnerSearchBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the comments value for this PartnerSearchBasic.
     * 
     * @return comments
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this PartnerSearchBasic.
     * 
     * @param comments
     */
    public void setComments(org.mule.module.netsuite.api.internal.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the commissionPlan value for this PartnerSearchBasic.
     * 
     * @return commissionPlan
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCommissionPlan() {
        return commissionPlan;
    }


    /**
     * Sets the commissionPlan value for this PartnerSearchBasic.
     * 
     * @param commissionPlan
     */
    public void setCommissionPlan(org.mule.module.netsuite.api.internal.SearchMultiSelectField commissionPlan) {
        this.commissionPlan = commissionPlan;
    }


    /**
     * Gets the country value for this PartnerSearchBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this PartnerSearchBasic.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this PartnerSearchBasic.
     * 
     * @return county
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this PartnerSearchBasic.
     * 
     * @param county
     */
    public void setCounty(org.mule.module.netsuite.api.internal.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the dateCreated value for this PartnerSearchBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this PartnerSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this PartnerSearchBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this PartnerSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the eligibleForCommission value for this PartnerSearchBasic.
     * 
     * @return eligibleForCommission
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this PartnerSearchBasic.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(org.mule.module.netsuite.api.internal.SearchBooleanField eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }


    /**
     * Gets the email value for this PartnerSearchBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PartnerSearchBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the entityId value for this PartnerSearchBasic.
     * 
     * @return entityId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this PartnerSearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(org.mule.module.netsuite.api.internal.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the externalId value for this PartnerSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this PartnerSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this PartnerSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this PartnerSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this PartnerSearchBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this PartnerSearchBasic.
     * 
     * @param fax
     */
    public void setFax(org.mule.module.netsuite.api.internal.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the firstName value for this PartnerSearchBasic.
     * 
     * @return firstName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this PartnerSearchBasic.
     * 
     * @param firstName
     */
    public void setFirstName(org.mule.module.netsuite.api.internal.SearchStringField firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the giveAccess value for this PartnerSearchBasic.
     * 
     * @return giveAccess
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this PartnerSearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this PartnerSearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this PartnerSearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the group value for this PartnerSearchBasic.
     * 
     * @return group
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getGroup() {
        return group;
    }


    /**
     * Sets the group value for this PartnerSearchBasic.
     * 
     * @param group
     */
    public void setGroup(org.mule.module.netsuite.api.internal.SearchMultiSelectField group) {
        this.group = group;
    }


    /**
     * Gets the hasDuplicates value for this PartnerSearchBasic.
     * 
     * @return hasDuplicates
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this PartnerSearchBasic.
     * 
     * @param hasDuplicates
     */
    public void setHasDuplicates(org.mule.module.netsuite.api.internal.SearchBooleanField hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }


    /**
     * Gets the image value for this PartnerSearchBasic.
     * 
     * @return image
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this PartnerSearchBasic.
     * 
     * @param image
     */
    public void setImage(org.mule.module.netsuite.api.internal.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the internalId value for this PartnerSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this PartnerSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this PartnerSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this PartnerSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefaultBilling value for this PartnerSearchBasic.
     * 
     * @return isDefaultBilling
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this PartnerSearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this PartnerSearchBasic.
     * 
     * @return isDefaultShipping
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this PartnerSearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isInactive value for this PartnerSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this PartnerSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isPerson value for this PartnerSearchBasic.
     * 
     * @return isPerson
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this PartnerSearchBasic.
     * 
     * @param isPerson
     */
    public void setIsPerson(org.mule.module.netsuite.api.internal.SearchBooleanField isPerson) {
        this.isPerson = isPerson;
    }


    /**
     * Gets the language value for this PartnerSearchBasic.
     * 
     * @return language
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this PartnerSearchBasic.
     * 
     * @param language
     */
    public void setLanguage(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedDate value for this PartnerSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this PartnerSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this PartnerSearchBasic.
     * 
     * @return lastName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this PartnerSearchBasic.
     * 
     * @param lastName
     */
    public void setLastName(org.mule.module.netsuite.api.internal.SearchStringField lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the level value for this PartnerSearchBasic.
     * 
     * @return level
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLevel() {
        return level;
    }


    /**
     * Sets the level value for this PartnerSearchBasic.
     * 
     * @param level
     */
    public void setLevel(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level) {
        this.level = level;
    }


    /**
     * Gets the location value for this PartnerSearchBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this PartnerSearchBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the middleName value for this PartnerSearchBasic.
     * 
     * @return middleName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this PartnerSearchBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(org.mule.module.netsuite.api.internal.SearchStringField middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the otherRelationships value for this PartnerSearchBasic.
     * 
     * @return otherRelationships
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getOtherRelationships() {
        return otherRelationships;
    }


    /**
     * Sets the otherRelationships value for this PartnerSearchBasic.
     * 
     * @param otherRelationships
     */
    public void setOtherRelationships(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField otherRelationships) {
        this.otherRelationships = otherRelationships;
    }


    /**
     * Gets the parent value for this PartnerSearchBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this PartnerSearchBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the partnerCode value for this PartnerSearchBasic.
     * 
     * @return partnerCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPartnerCode() {
        return partnerCode;
    }


    /**
     * Sets the partnerCode value for this PartnerSearchBasic.
     * 
     * @param partnerCode
     */
    public void setPartnerCode(org.mule.module.netsuite.api.internal.SearchStringField partnerCode) {
        this.partnerCode = partnerCode;
    }


    /**
     * Gets the permission value for this PartnerSearchBasic.
     * 
     * @return permission
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this PartnerSearchBasic.
     * 
     * @param permission
     */
    public void setPermission(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }


    /**
     * Gets the phone value for this PartnerSearchBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this PartnerSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(org.mule.module.netsuite.api.internal.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this PartnerSearchBasic.
     * 
     * @return phoneticName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this PartnerSearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(org.mule.module.netsuite.api.internal.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the promoCode value for this PartnerSearchBasic.
     * 
     * @return promoCode
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this PartnerSearchBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the salutation value for this PartnerSearchBasic.
     * 
     * @return salutation
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this PartnerSearchBasic.
     * 
     * @param salutation
     */
    public void setSalutation(org.mule.module.netsuite.api.internal.SearchStringField salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the shipAddress value for this PartnerSearchBasic.
     * 
     * @return shipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this PartnerSearchBasic.
     * 
     * @param shipAddress
     */
    public void setShipAddress(org.mule.module.netsuite.api.internal.SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the state value for this PartnerSearchBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this PartnerSearchBasic.
     * 
     * @param state
     */
    public void setState(org.mule.module.netsuite.api.internal.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this PartnerSearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this PartnerSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the title value for this PartnerSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this PartnerSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the URL value for this PartnerSearchBasic.
     * 
     * @return URL
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this PartnerSearchBasic.
     * 
     * @param URL
     */
    public void setURL(org.mule.module.netsuite.api.internal.SearchStringField URL) {
        this.URL = URL;
    }


    /**
     * Gets the zipCode value for this PartnerSearchBasic.
     * 
     * @return zipCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this PartnerSearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(org.mule.module.netsuite.api.internal.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this PartnerSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this PartnerSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PartnerSearchBasic)) return false;
        PartnerSearchBasic other = (PartnerSearchBasic) obj;
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
            ((this.assignTasks==null && other.getAssignTasks()==null) || 
             (this.assignTasks!=null &&
              this.assignTasks.equals(other.getAssignTasks()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.commissionPlan==null && other.getCommissionPlan()==null) || 
             (this.commissionPlan!=null &&
              this.commissionPlan.equals(other.getCommissionPlan()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              this.eligibleForCommission.equals(other.getEligibleForCommission()))) &&
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
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              this.hasDuplicates.equals(other.getHasDuplicates()))) &&
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
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              this.isPerson.equals(other.getIsPerson()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.otherRelationships==null && other.getOtherRelationships()==null) || 
             (this.otherRelationships!=null &&
              this.otherRelationships.equals(other.getOtherRelationships()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.partnerCode==null && other.getPartnerCode()==null) || 
             (this.partnerCode!=null &&
              this.partnerCode.equals(other.getPartnerCode()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL()))) &&
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
        if (getAssignTasks() != null) {
            _hashCode += getAssignTasks().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getCommissionPlan() != null) {
            _hashCode += getCommissionPlan().hashCode();
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
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getEligibleForCommission() != null) {
            _hashCode += getEligibleForCommission().hashCode();
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getGiveAccess() != null) {
            _hashCode += getGiveAccess().hashCode();
        }
        if (getGlobalSubscriptionStatus() != null) {
            _hashCode += getGlobalSubscriptionStatus().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getHasDuplicates() != null) {
            _hashCode += getHasDuplicates().hashCode();
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
        if (getIsPerson() != null) {
            _hashCode += getIsPerson().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getOtherRelationships() != null) {
            _hashCode += getOtherRelationships().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPartnerCode() != null) {
            _hashCode += getPartnerCode().hashCode();
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
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
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
        new org.apache.axis.description.TypeDesc(PartnerSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PartnerSearchBasic"));
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
        elemField.setFieldName("assignTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assignTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("commissionPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "commissionPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "firstName"));
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
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isPerson"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRelationships");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "otherRelationships"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddress"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "URL"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
