/**
 * JobSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class JobSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField accountNumber;

    private org.mule.module.netsuite.api.internal.SearchDoubleField actualTime;

    private org.mule.module.netsuite.api.internal.SearchStringField address;

    private org.mule.module.netsuite.api.internal.SearchStringField addressee;

    private org.mule.module.netsuite.api.internal.SearchStringField addressLabel;

    private org.mule.module.netsuite.api.internal.SearchStringField addressPhone;

    private org.mule.module.netsuite.api.internal.SearchBooleanField allocatePayrollExpenses;

    private org.mule.module.netsuite.api.internal.SearchBooleanField allowAllResourcesForTasks;

    private org.mule.module.netsuite.api.internal.SearchBooleanField allowExpenses;

    private org.mule.module.netsuite.api.internal.SearchBooleanField allowTime;

    private org.mule.module.netsuite.api.internal.SearchStringField attention;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField billingSchedule;

    private org.mule.module.netsuite.api.internal.SearchDateField calculatedEndDate;

    private org.mule.module.netsuite.api.internal.SearchDateField calculatedEndDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField category;

    private org.mule.module.netsuite.api.internal.SearchStringField city;

    private org.mule.module.netsuite.api.internal.SearchStringField comments;

    private org.mule.module.netsuite.api.internal.SearchStringField contact;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country;

    private org.mule.module.netsuite.api.internal.SearchStringField county;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField customer;

    private org.mule.module.netsuite.api.internal.SearchDateField dateCreated;

    private org.mule.module.netsuite.api.internal.SearchStringField email;

    private org.mule.module.netsuite.api.internal.SearchDateField endDate;

    private org.mule.module.netsuite.api.internal.SearchStringField entityId;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estCost;

    private org.mule.module.netsuite.api.internal.SearchDateField estEndDate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedGrossProfitPercent;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborCost;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborCostBaseline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborRevenue;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTime;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTimeOverride;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTimeOverrideBaseline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estRevenue;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchStringField fax;

    private org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchStringField image;

    private org.mule.module.netsuite.api.internal.SearchBooleanField includeCrmTasksInTotals;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isExemptTime;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isProductiveTime;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isUtilizedTime;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField jobBillingType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField jobItem;

    private org.mule.module.netsuite.api.internal.SearchDoubleField jobPrice;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField jobResource;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField jobResourceRole;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language;

    private org.mule.module.netsuite.api.internal.SearchDateField lastBaselineDate;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level;

    private org.mule.module.netsuite.api.internal.SearchBooleanField limitTimeToAssignees;

    private org.mule.module.netsuite.api.internal.SearchBooleanField materializeTime;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parent;

    private org.mule.module.netsuite.api.internal.SearchLongField pctComplete;

    private org.mule.module.netsuite.api.internal.SearchLongField percentTimeComplete;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission;

    private org.mule.module.netsuite.api.internal.SearchStringField phone;

    private org.mule.module.netsuite.api.internal.SearchStringField phoneticName;

    private org.mule.module.netsuite.api.internal.SearchDateField projectedEndDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    private org.mule.module.netsuite.api.internal.SearchDateField startDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchStringField state;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchDoubleField timeRemaining;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField type;

    private org.mule.module.netsuite.api.internal.SearchStringField zipCode;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public JobSearchBasic() {
    }

    public JobSearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField accountNumber,
           org.mule.module.netsuite.api.internal.SearchDoubleField actualTime,
           org.mule.module.netsuite.api.internal.SearchStringField address,
           org.mule.module.netsuite.api.internal.SearchStringField addressee,
           org.mule.module.netsuite.api.internal.SearchStringField addressLabel,
           org.mule.module.netsuite.api.internal.SearchStringField addressPhone,
           org.mule.module.netsuite.api.internal.SearchBooleanField allocatePayrollExpenses,
           org.mule.module.netsuite.api.internal.SearchBooleanField allowAllResourcesForTasks,
           org.mule.module.netsuite.api.internal.SearchBooleanField allowExpenses,
           org.mule.module.netsuite.api.internal.SearchBooleanField allowTime,
           org.mule.module.netsuite.api.internal.SearchStringField attention,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField billingSchedule,
           org.mule.module.netsuite.api.internal.SearchDateField calculatedEndDate,
           org.mule.module.netsuite.api.internal.SearchDateField calculatedEndDateBaseline,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField category,
           org.mule.module.netsuite.api.internal.SearchStringField city,
           org.mule.module.netsuite.api.internal.SearchStringField comments,
           org.mule.module.netsuite.api.internal.SearchStringField contact,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country,
           org.mule.module.netsuite.api.internal.SearchStringField county,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField customer,
           org.mule.module.netsuite.api.internal.SearchDateField dateCreated,
           org.mule.module.netsuite.api.internal.SearchStringField email,
           org.mule.module.netsuite.api.internal.SearchDateField endDate,
           org.mule.module.netsuite.api.internal.SearchStringField entityId,
           org.mule.module.netsuite.api.internal.SearchDoubleField estCost,
           org.mule.module.netsuite.api.internal.SearchDateField estEndDate,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedGrossProfit,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedGrossProfitPercent,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborCost,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborCostBaseline,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborRevenue,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTime,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTimeOverride,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTimeOverrideBaseline,
           org.mule.module.netsuite.api.internal.SearchDoubleField estRevenue,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchStringField fax,
           org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchStringField image,
           org.mule.module.netsuite.api.internal.SearchBooleanField includeCrmTasksInTotals,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping,
           org.mule.module.netsuite.api.internal.SearchBooleanField isExemptTime,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isProductiveTime,
           org.mule.module.netsuite.api.internal.SearchBooleanField isUtilizedTime,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField jobBillingType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField jobItem,
           org.mule.module.netsuite.api.internal.SearchDoubleField jobPrice,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField jobResource,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField jobResourceRole,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language,
           org.mule.module.netsuite.api.internal.SearchDateField lastBaselineDate,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level,
           org.mule.module.netsuite.api.internal.SearchBooleanField limitTimeToAssignees,
           org.mule.module.netsuite.api.internal.SearchBooleanField materializeTime,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parent,
           org.mule.module.netsuite.api.internal.SearchLongField pctComplete,
           org.mule.module.netsuite.api.internal.SearchLongField percentTimeComplete,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission,
           org.mule.module.netsuite.api.internal.SearchStringField phone,
           org.mule.module.netsuite.api.internal.SearchStringField phoneticName,
           org.mule.module.netsuite.api.internal.SearchDateField projectedEndDateBaseline,
           org.mule.module.netsuite.api.internal.SearchDateField startDate,
           org.mule.module.netsuite.api.internal.SearchDateField startDateBaseline,
           org.mule.module.netsuite.api.internal.SearchStringField state,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.SearchDoubleField timeRemaining,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField type,
           org.mule.module.netsuite.api.internal.SearchStringField zipCode,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.actualTime = actualTime;
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.allocatePayrollExpenses = allocatePayrollExpenses;
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
        this.allowExpenses = allowExpenses;
        this.allowTime = allowTime;
        this.attention = attention;
        this.billingSchedule = billingSchedule;
        this.calculatedEndDate = calculatedEndDate;
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.contact = contact;
        this.country = country;
        this.county = county;
        this.customer = customer;
        this.dateCreated = dateCreated;
        this.email = email;
        this.endDate = endDate;
        this.entityId = entityId;
        this.estCost = estCost;
        this.estEndDate = estEndDate;
        this.estimatedGrossProfit = estimatedGrossProfit;
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
        this.estimatedLaborCost = estimatedLaborCost;
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
        this.estimatedLaborRevenue = estimatedLaborRevenue;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
        this.estRevenue = estRevenue;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isExemptTime = isExemptTime;
        this.isInactive = isInactive;
        this.isProductiveTime = isProductiveTime;
        this.isUtilizedTime = isUtilizedTime;
        this.jobBillingType = jobBillingType;
        this.jobItem = jobItem;
        this.jobPrice = jobPrice;
        this.jobResource = jobResource;
        this.jobResourceRole = jobResourceRole;
        this.language = language;
        this.lastBaselineDate = lastBaselineDate;
        this.lastModifiedDate = lastModifiedDate;
        this.level = level;
        this.limitTimeToAssignees = limitTimeToAssignees;
        this.materializeTime = materializeTime;
        this.parent = parent;
        this.pctComplete = pctComplete;
        this.percentTimeComplete = percentTimeComplete;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.projectedEndDateBaseline = projectedEndDateBaseline;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.state = state;
        this.status = status;
        this.subsidiary = subsidiary;
        this.timeRemaining = timeRemaining;
        this.type = type;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this JobSearchBasic.
     * 
     * @return accountNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this JobSearchBasic.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(org.mule.module.netsuite.api.internal.SearchStringField accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the actualTime value for this JobSearchBasic.
     * 
     * @return actualTime
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getActualTime() {
        return actualTime;
    }


    /**
     * Sets the actualTime value for this JobSearchBasic.
     * 
     * @param actualTime
     */
    public void setActualTime(org.mule.module.netsuite.api.internal.SearchDoubleField actualTime) {
        this.actualTime = actualTime;
    }


    /**
     * Gets the address value for this JobSearchBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this JobSearchBasic.
     * 
     * @param address
     */
    public void setAddress(org.mule.module.netsuite.api.internal.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this JobSearchBasic.
     * 
     * @return addressee
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this JobSearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(org.mule.module.netsuite.api.internal.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this JobSearchBasic.
     * 
     * @return addressLabel
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this JobSearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(org.mule.module.netsuite.api.internal.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this JobSearchBasic.
     * 
     * @return addressPhone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this JobSearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(org.mule.module.netsuite.api.internal.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the allocatePayrollExpenses value for this JobSearchBasic.
     * 
     * @return allocatePayrollExpenses
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAllocatePayrollExpenses() {
        return allocatePayrollExpenses;
    }


    /**
     * Sets the allocatePayrollExpenses value for this JobSearchBasic.
     * 
     * @param allocatePayrollExpenses
     */
    public void setAllocatePayrollExpenses(org.mule.module.netsuite.api.internal.SearchBooleanField allocatePayrollExpenses) {
        this.allocatePayrollExpenses = allocatePayrollExpenses;
    }


    /**
     * Gets the allowAllResourcesForTasks value for this JobSearchBasic.
     * 
     * @return allowAllResourcesForTasks
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAllowAllResourcesForTasks() {
        return allowAllResourcesForTasks;
    }


    /**
     * Sets the allowAllResourcesForTasks value for this JobSearchBasic.
     * 
     * @param allowAllResourcesForTasks
     */
    public void setAllowAllResourcesForTasks(org.mule.module.netsuite.api.internal.SearchBooleanField allowAllResourcesForTasks) {
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
    }


    /**
     * Gets the allowExpenses value for this JobSearchBasic.
     * 
     * @return allowExpenses
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAllowExpenses() {
        return allowExpenses;
    }


    /**
     * Sets the allowExpenses value for this JobSearchBasic.
     * 
     * @param allowExpenses
     */
    public void setAllowExpenses(org.mule.module.netsuite.api.internal.SearchBooleanField allowExpenses) {
        this.allowExpenses = allowExpenses;
    }


    /**
     * Gets the allowTime value for this JobSearchBasic.
     * 
     * @return allowTime
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAllowTime() {
        return allowTime;
    }


    /**
     * Sets the allowTime value for this JobSearchBasic.
     * 
     * @param allowTime
     */
    public void setAllowTime(org.mule.module.netsuite.api.internal.SearchBooleanField allowTime) {
        this.allowTime = allowTime;
    }


    /**
     * Gets the attention value for this JobSearchBasic.
     * 
     * @return attention
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this JobSearchBasic.
     * 
     * @param attention
     */
    public void setAttention(org.mule.module.netsuite.api.internal.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the billingSchedule value for this JobSearchBasic.
     * 
     * @return billingSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this JobSearchBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(org.mule.module.netsuite.api.internal.SearchMultiSelectField billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the calculatedEndDate value for this JobSearchBasic.
     * 
     * @return calculatedEndDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCalculatedEndDate() {
        return calculatedEndDate;
    }


    /**
     * Sets the calculatedEndDate value for this JobSearchBasic.
     * 
     * @param calculatedEndDate
     */
    public void setCalculatedEndDate(org.mule.module.netsuite.api.internal.SearchDateField calculatedEndDate) {
        this.calculatedEndDate = calculatedEndDate;
    }


    /**
     * Gets the calculatedEndDateBaseline value for this JobSearchBasic.
     * 
     * @return calculatedEndDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCalculatedEndDateBaseline() {
        return calculatedEndDateBaseline;
    }


    /**
     * Sets the calculatedEndDateBaseline value for this JobSearchBasic.
     * 
     * @param calculatedEndDateBaseline
     */
    public void setCalculatedEndDateBaseline(org.mule.module.netsuite.api.internal.SearchDateField calculatedEndDateBaseline) {
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
    }


    /**
     * Gets the category value for this JobSearchBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this JobSearchBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the city value for this JobSearchBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this JobSearchBasic.
     * 
     * @param city
     */
    public void setCity(org.mule.module.netsuite.api.internal.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the comments value for this JobSearchBasic.
     * 
     * @return comments
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this JobSearchBasic.
     * 
     * @param comments
     */
    public void setComments(org.mule.module.netsuite.api.internal.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the contact value for this JobSearchBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this JobSearchBasic.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.SearchStringField contact) {
        this.contact = contact;
    }


    /**
     * Gets the country value for this JobSearchBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this JobSearchBasic.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this JobSearchBasic.
     * 
     * @return county
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this JobSearchBasic.
     * 
     * @param county
     */
    public void setCounty(org.mule.module.netsuite.api.internal.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the customer value for this JobSearchBasic.
     * 
     * @return customer
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this JobSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(org.mule.module.netsuite.api.internal.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the dateCreated value for this JobSearchBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this JobSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the email value for this JobSearchBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this JobSearchBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the endDate value for this JobSearchBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this JobSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the entityId value for this JobSearchBasic.
     * 
     * @return entityId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this JobSearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(org.mule.module.netsuite.api.internal.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the estCost value for this JobSearchBasic.
     * 
     * @return estCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstCost() {
        return estCost;
    }


    /**
     * Sets the estCost value for this JobSearchBasic.
     * 
     * @param estCost
     */
    public void setEstCost(org.mule.module.netsuite.api.internal.SearchDoubleField estCost) {
        this.estCost = estCost;
    }


    /**
     * Gets the estEndDate value for this JobSearchBasic.
     * 
     * @return estEndDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEstEndDate() {
        return estEndDate;
    }


    /**
     * Sets the estEndDate value for this JobSearchBasic.
     * 
     * @param estEndDate
     */
    public void setEstEndDate(org.mule.module.netsuite.api.internal.SearchDateField estEndDate) {
        this.estEndDate = estEndDate;
    }


    /**
     * Gets the estimatedGrossProfit value for this JobSearchBasic.
     * 
     * @return estimatedGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedGrossProfit() {
        return estimatedGrossProfit;
    }


    /**
     * Sets the estimatedGrossProfit value for this JobSearchBasic.
     * 
     * @param estimatedGrossProfit
     */
    public void setEstimatedGrossProfit(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedGrossProfit) {
        this.estimatedGrossProfit = estimatedGrossProfit;
    }


    /**
     * Gets the estimatedGrossProfitPercent value for this JobSearchBasic.
     * 
     * @return estimatedGrossProfitPercent
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedGrossProfitPercent() {
        return estimatedGrossProfitPercent;
    }


    /**
     * Sets the estimatedGrossProfitPercent value for this JobSearchBasic.
     * 
     * @param estimatedGrossProfitPercent
     */
    public void setEstimatedGrossProfitPercent(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedGrossProfitPercent) {
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
    }


    /**
     * Gets the estimatedLaborCost value for this JobSearchBasic.
     * 
     * @return estimatedLaborCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedLaborCost() {
        return estimatedLaborCost;
    }


    /**
     * Sets the estimatedLaborCost value for this JobSearchBasic.
     * 
     * @param estimatedLaborCost
     */
    public void setEstimatedLaborCost(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborCost) {
        this.estimatedLaborCost = estimatedLaborCost;
    }


    /**
     * Gets the estimatedLaborCostBaseline value for this JobSearchBasic.
     * 
     * @return estimatedLaborCostBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedLaborCostBaseline() {
        return estimatedLaborCostBaseline;
    }


    /**
     * Sets the estimatedLaborCostBaseline value for this JobSearchBasic.
     * 
     * @param estimatedLaborCostBaseline
     */
    public void setEstimatedLaborCostBaseline(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborCostBaseline) {
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
    }


    /**
     * Gets the estimatedLaborRevenue value for this JobSearchBasic.
     * 
     * @return estimatedLaborRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedLaborRevenue() {
        return estimatedLaborRevenue;
    }


    /**
     * Sets the estimatedLaborRevenue value for this JobSearchBasic.
     * 
     * @param estimatedLaborRevenue
     */
    public void setEstimatedLaborRevenue(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedLaborRevenue) {
        this.estimatedLaborRevenue = estimatedLaborRevenue;
    }


    /**
     * Gets the estimatedTime value for this JobSearchBasic.
     * 
     * @return estimatedTime
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this JobSearchBasic.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTime) {
        this.estimatedTime = estimatedTime;
    }


    /**
     * Gets the estimatedTimeOverride value for this JobSearchBasic.
     * 
     * @return estimatedTimeOverride
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }


    /**
     * Sets the estimatedTimeOverride value for this JobSearchBasic.
     * 
     * @param estimatedTimeOverride
     */
    public void setEstimatedTimeOverride(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }


    /**
     * Gets the estimatedTimeOverrideBaseline value for this JobSearchBasic.
     * 
     * @return estimatedTimeOverrideBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedTimeOverrideBaseline() {
        return estimatedTimeOverrideBaseline;
    }


    /**
     * Sets the estimatedTimeOverrideBaseline value for this JobSearchBasic.
     * 
     * @param estimatedTimeOverrideBaseline
     */
    public void setEstimatedTimeOverrideBaseline(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedTimeOverrideBaseline) {
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
    }


    /**
     * Gets the estRevenue value for this JobSearchBasic.
     * 
     * @return estRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstRevenue() {
        return estRevenue;
    }


    /**
     * Sets the estRevenue value for this JobSearchBasic.
     * 
     * @param estRevenue
     */
    public void setEstRevenue(org.mule.module.netsuite.api.internal.SearchDoubleField estRevenue) {
        this.estRevenue = estRevenue;
    }


    /**
     * Gets the externalId value for this JobSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this JobSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this JobSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this JobSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this JobSearchBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this JobSearchBasic.
     * 
     * @param fax
     */
    public void setFax(org.mule.module.netsuite.api.internal.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the giveAccess value for this JobSearchBasic.
     * 
     * @return giveAccess
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this JobSearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this JobSearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this JobSearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the image value for this JobSearchBasic.
     * 
     * @return image
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this JobSearchBasic.
     * 
     * @param image
     */
    public void setImage(org.mule.module.netsuite.api.internal.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the includeCrmTasksInTotals value for this JobSearchBasic.
     * 
     * @return includeCrmTasksInTotals
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIncludeCrmTasksInTotals() {
        return includeCrmTasksInTotals;
    }


    /**
     * Sets the includeCrmTasksInTotals value for this JobSearchBasic.
     * 
     * @param includeCrmTasksInTotals
     */
    public void setIncludeCrmTasksInTotals(org.mule.module.netsuite.api.internal.SearchBooleanField includeCrmTasksInTotals) {
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
    }


    /**
     * Gets the internalId value for this JobSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this JobSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this JobSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this JobSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefaultBilling value for this JobSearchBasic.
     * 
     * @return isDefaultBilling
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this JobSearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this JobSearchBasic.
     * 
     * @return isDefaultShipping
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this JobSearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isExemptTime value for this JobSearchBasic.
     * 
     * @return isExemptTime
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsExemptTime() {
        return isExemptTime;
    }


    /**
     * Sets the isExemptTime value for this JobSearchBasic.
     * 
     * @param isExemptTime
     */
    public void setIsExemptTime(org.mule.module.netsuite.api.internal.SearchBooleanField isExemptTime) {
        this.isExemptTime = isExemptTime;
    }


    /**
     * Gets the isInactive value for this JobSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this JobSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isProductiveTime value for this JobSearchBasic.
     * 
     * @return isProductiveTime
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsProductiveTime() {
        return isProductiveTime;
    }


    /**
     * Sets the isProductiveTime value for this JobSearchBasic.
     * 
     * @param isProductiveTime
     */
    public void setIsProductiveTime(org.mule.module.netsuite.api.internal.SearchBooleanField isProductiveTime) {
        this.isProductiveTime = isProductiveTime;
    }


    /**
     * Gets the isUtilizedTime value for this JobSearchBasic.
     * 
     * @return isUtilizedTime
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsUtilizedTime() {
        return isUtilizedTime;
    }


    /**
     * Sets the isUtilizedTime value for this JobSearchBasic.
     * 
     * @param isUtilizedTime
     */
    public void setIsUtilizedTime(org.mule.module.netsuite.api.internal.SearchBooleanField isUtilizedTime) {
        this.isUtilizedTime = isUtilizedTime;
    }


    /**
     * Gets the jobBillingType value for this JobSearchBasic.
     * 
     * @return jobBillingType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getJobBillingType() {
        return jobBillingType;
    }


    /**
     * Sets the jobBillingType value for this JobSearchBasic.
     * 
     * @param jobBillingType
     */
    public void setJobBillingType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField jobBillingType) {
        this.jobBillingType = jobBillingType;
    }


    /**
     * Gets the jobItem value for this JobSearchBasic.
     * 
     * @return jobItem
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getJobItem() {
        return jobItem;
    }


    /**
     * Sets the jobItem value for this JobSearchBasic.
     * 
     * @param jobItem
     */
    public void setJobItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField jobItem) {
        this.jobItem = jobItem;
    }


    /**
     * Gets the jobPrice value for this JobSearchBasic.
     * 
     * @return jobPrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getJobPrice() {
        return jobPrice;
    }


    /**
     * Sets the jobPrice value for this JobSearchBasic.
     * 
     * @param jobPrice
     */
    public void setJobPrice(org.mule.module.netsuite.api.internal.SearchDoubleField jobPrice) {
        this.jobPrice = jobPrice;
    }


    /**
     * Gets the jobResource value for this JobSearchBasic.
     * 
     * @return jobResource
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getJobResource() {
        return jobResource;
    }


    /**
     * Sets the jobResource value for this JobSearchBasic.
     * 
     * @param jobResource
     */
    public void setJobResource(org.mule.module.netsuite.api.internal.SearchMultiSelectField jobResource) {
        this.jobResource = jobResource;
    }


    /**
     * Gets the jobResourceRole value for this JobSearchBasic.
     * 
     * @return jobResourceRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getJobResourceRole() {
        return jobResourceRole;
    }


    /**
     * Sets the jobResourceRole value for this JobSearchBasic.
     * 
     * @param jobResourceRole
     */
    public void setJobResourceRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField jobResourceRole) {
        this.jobResourceRole = jobResourceRole;
    }


    /**
     * Gets the language value for this JobSearchBasic.
     * 
     * @return language
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this JobSearchBasic.
     * 
     * @param language
     */
    public void setLanguage(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language) {
        this.language = language;
    }


    /**
     * Gets the lastBaselineDate value for this JobSearchBasic.
     * 
     * @return lastBaselineDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastBaselineDate() {
        return lastBaselineDate;
    }


    /**
     * Sets the lastBaselineDate value for this JobSearchBasic.
     * 
     * @param lastBaselineDate
     */
    public void setLastBaselineDate(org.mule.module.netsuite.api.internal.SearchDateField lastBaselineDate) {
        this.lastBaselineDate = lastBaselineDate;
    }


    /**
     * Gets the lastModifiedDate value for this JobSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this JobSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the level value for this JobSearchBasic.
     * 
     * @return level
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLevel() {
        return level;
    }


    /**
     * Sets the level value for this JobSearchBasic.
     * 
     * @param level
     */
    public void setLevel(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level) {
        this.level = level;
    }


    /**
     * Gets the limitTimeToAssignees value for this JobSearchBasic.
     * 
     * @return limitTimeToAssignees
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getLimitTimeToAssignees() {
        return limitTimeToAssignees;
    }


    /**
     * Sets the limitTimeToAssignees value for this JobSearchBasic.
     * 
     * @param limitTimeToAssignees
     */
    public void setLimitTimeToAssignees(org.mule.module.netsuite.api.internal.SearchBooleanField limitTimeToAssignees) {
        this.limitTimeToAssignees = limitTimeToAssignees;
    }


    /**
     * Gets the materializeTime value for this JobSearchBasic.
     * 
     * @return materializeTime
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMaterializeTime() {
        return materializeTime;
    }


    /**
     * Sets the materializeTime value for this JobSearchBasic.
     * 
     * @param materializeTime
     */
    public void setMaterializeTime(org.mule.module.netsuite.api.internal.SearchBooleanField materializeTime) {
        this.materializeTime = materializeTime;
    }


    /**
     * Gets the parent value for this JobSearchBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this JobSearchBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the pctComplete value for this JobSearchBasic.
     * 
     * @return pctComplete
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPctComplete() {
        return pctComplete;
    }


    /**
     * Sets the pctComplete value for this JobSearchBasic.
     * 
     * @param pctComplete
     */
    public void setPctComplete(org.mule.module.netsuite.api.internal.SearchLongField pctComplete) {
        this.pctComplete = pctComplete;
    }


    /**
     * Gets the percentTimeComplete value for this JobSearchBasic.
     * 
     * @return percentTimeComplete
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this JobSearchBasic.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(org.mule.module.netsuite.api.internal.SearchLongField percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }


    /**
     * Gets the permission value for this JobSearchBasic.
     * 
     * @return permission
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this JobSearchBasic.
     * 
     * @param permission
     */
    public void setPermission(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }


    /**
     * Gets the phone value for this JobSearchBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this JobSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(org.mule.module.netsuite.api.internal.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this JobSearchBasic.
     * 
     * @return phoneticName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this JobSearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(org.mule.module.netsuite.api.internal.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the projectedEndDateBaseline value for this JobSearchBasic.
     * 
     * @return projectedEndDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getProjectedEndDateBaseline() {
        return projectedEndDateBaseline;
    }


    /**
     * Sets the projectedEndDateBaseline value for this JobSearchBasic.
     * 
     * @param projectedEndDateBaseline
     */
    public void setProjectedEndDateBaseline(org.mule.module.netsuite.api.internal.SearchDateField projectedEndDateBaseline) {
        this.projectedEndDateBaseline = projectedEndDateBaseline;
    }


    /**
     * Gets the startDate value for this JobSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this JobSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateBaseline value for this JobSearchBasic.
     * 
     * @return startDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this JobSearchBasic.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(org.mule.module.netsuite.api.internal.SearchDateField startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }


    /**
     * Gets the state value for this JobSearchBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this JobSearchBasic.
     * 
     * @param state
     */
    public void setState(org.mule.module.netsuite.api.internal.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the status value for this JobSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this JobSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this JobSearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this JobSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the timeRemaining value for this JobSearchBasic.
     * 
     * @return timeRemaining
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTimeRemaining() {
        return timeRemaining;
    }


    /**
     * Sets the timeRemaining value for this JobSearchBasic.
     * 
     * @param timeRemaining
     */
    public void setTimeRemaining(org.mule.module.netsuite.api.internal.SearchDoubleField timeRemaining) {
        this.timeRemaining = timeRemaining;
    }


    /**
     * Gets the type value for this JobSearchBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this JobSearchBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the zipCode value for this JobSearchBasic.
     * 
     * @return zipCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this JobSearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(org.mule.module.netsuite.api.internal.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this JobSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this JobSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobSearchBasic)) return false;
        JobSearchBasic other = (JobSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.actualTime==null && other.getActualTime()==null) || 
             (this.actualTime!=null &&
              this.actualTime.equals(other.getActualTime()))) &&
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
            ((this.allocatePayrollExpenses==null && other.getAllocatePayrollExpenses()==null) || 
             (this.allocatePayrollExpenses!=null &&
              this.allocatePayrollExpenses.equals(other.getAllocatePayrollExpenses()))) &&
            ((this.allowAllResourcesForTasks==null && other.getAllowAllResourcesForTasks()==null) || 
             (this.allowAllResourcesForTasks!=null &&
              this.allowAllResourcesForTasks.equals(other.getAllowAllResourcesForTasks()))) &&
            ((this.allowExpenses==null && other.getAllowExpenses()==null) || 
             (this.allowExpenses!=null &&
              this.allowExpenses.equals(other.getAllowExpenses()))) &&
            ((this.allowTime==null && other.getAllowTime()==null) || 
             (this.allowTime!=null &&
              this.allowTime.equals(other.getAllowTime()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.calculatedEndDate==null && other.getCalculatedEndDate()==null) || 
             (this.calculatedEndDate!=null &&
              this.calculatedEndDate.equals(other.getCalculatedEndDate()))) &&
            ((this.calculatedEndDateBaseline==null && other.getCalculatedEndDateBaseline()==null) || 
             (this.calculatedEndDateBaseline!=null &&
              this.calculatedEndDateBaseline.equals(other.getCalculatedEndDateBaseline()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.estCost==null && other.getEstCost()==null) || 
             (this.estCost!=null &&
              this.estCost.equals(other.getEstCost()))) &&
            ((this.estEndDate==null && other.getEstEndDate()==null) || 
             (this.estEndDate!=null &&
              this.estEndDate.equals(other.getEstEndDate()))) &&
            ((this.estimatedGrossProfit==null && other.getEstimatedGrossProfit()==null) || 
             (this.estimatedGrossProfit!=null &&
              this.estimatedGrossProfit.equals(other.getEstimatedGrossProfit()))) &&
            ((this.estimatedGrossProfitPercent==null && other.getEstimatedGrossProfitPercent()==null) || 
             (this.estimatedGrossProfitPercent!=null &&
              this.estimatedGrossProfitPercent.equals(other.getEstimatedGrossProfitPercent()))) &&
            ((this.estimatedLaborCost==null && other.getEstimatedLaborCost()==null) || 
             (this.estimatedLaborCost!=null &&
              this.estimatedLaborCost.equals(other.getEstimatedLaborCost()))) &&
            ((this.estimatedLaborCostBaseline==null && other.getEstimatedLaborCostBaseline()==null) || 
             (this.estimatedLaborCostBaseline!=null &&
              this.estimatedLaborCostBaseline.equals(other.getEstimatedLaborCostBaseline()))) &&
            ((this.estimatedLaborRevenue==null && other.getEstimatedLaborRevenue()==null) || 
             (this.estimatedLaborRevenue!=null &&
              this.estimatedLaborRevenue.equals(other.getEstimatedLaborRevenue()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              this.estimatedTime.equals(other.getEstimatedTime()))) &&
            ((this.estimatedTimeOverride==null && other.getEstimatedTimeOverride()==null) || 
             (this.estimatedTimeOverride!=null &&
              this.estimatedTimeOverride.equals(other.getEstimatedTimeOverride()))) &&
            ((this.estimatedTimeOverrideBaseline==null && other.getEstimatedTimeOverrideBaseline()==null) || 
             (this.estimatedTimeOverrideBaseline!=null &&
              this.estimatedTimeOverrideBaseline.equals(other.getEstimatedTimeOverrideBaseline()))) &&
            ((this.estRevenue==null && other.getEstRevenue()==null) || 
             (this.estRevenue!=null &&
              this.estRevenue.equals(other.getEstRevenue()))) &&
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
            ((this.includeCrmTasksInTotals==null && other.getIncludeCrmTasksInTotals()==null) || 
             (this.includeCrmTasksInTotals!=null &&
              this.includeCrmTasksInTotals.equals(other.getIncludeCrmTasksInTotals()))) &&
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
            ((this.isExemptTime==null && other.getIsExemptTime()==null) || 
             (this.isExemptTime!=null &&
              this.isExemptTime.equals(other.getIsExemptTime()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isProductiveTime==null && other.getIsProductiveTime()==null) || 
             (this.isProductiveTime!=null &&
              this.isProductiveTime.equals(other.getIsProductiveTime()))) &&
            ((this.isUtilizedTime==null && other.getIsUtilizedTime()==null) || 
             (this.isUtilizedTime!=null &&
              this.isUtilizedTime.equals(other.getIsUtilizedTime()))) &&
            ((this.jobBillingType==null && other.getJobBillingType()==null) || 
             (this.jobBillingType!=null &&
              this.jobBillingType.equals(other.getJobBillingType()))) &&
            ((this.jobItem==null && other.getJobItem()==null) || 
             (this.jobItem!=null &&
              this.jobItem.equals(other.getJobItem()))) &&
            ((this.jobPrice==null && other.getJobPrice()==null) || 
             (this.jobPrice!=null &&
              this.jobPrice.equals(other.getJobPrice()))) &&
            ((this.jobResource==null && other.getJobResource()==null) || 
             (this.jobResource!=null &&
              this.jobResource.equals(other.getJobResource()))) &&
            ((this.jobResourceRole==null && other.getJobResourceRole()==null) || 
             (this.jobResourceRole!=null &&
              this.jobResourceRole.equals(other.getJobResourceRole()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastBaselineDate==null && other.getLastBaselineDate()==null) || 
             (this.lastBaselineDate!=null &&
              this.lastBaselineDate.equals(other.getLastBaselineDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.limitTimeToAssignees==null && other.getLimitTimeToAssignees()==null) || 
             (this.limitTimeToAssignees!=null &&
              this.limitTimeToAssignees.equals(other.getLimitTimeToAssignees()))) &&
            ((this.materializeTime==null && other.getMaterializeTime()==null) || 
             (this.materializeTime!=null &&
              this.materializeTime.equals(other.getMaterializeTime()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.pctComplete==null && other.getPctComplete()==null) || 
             (this.pctComplete!=null &&
              this.pctComplete.equals(other.getPctComplete()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              this.percentTimeComplete.equals(other.getPercentTimeComplete()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.projectedEndDateBaseline==null && other.getProjectedEndDateBaseline()==null) || 
             (this.projectedEndDateBaseline!=null &&
              this.projectedEndDateBaseline.equals(other.getProjectedEndDateBaseline()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              this.startDateBaseline.equals(other.getStartDateBaseline()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.timeRemaining==null && other.getTimeRemaining()==null) || 
             (this.timeRemaining!=null &&
              this.timeRemaining.equals(other.getTimeRemaining()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getActualTime() != null) {
            _hashCode += getActualTime().hashCode();
        }
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
        if (getAllocatePayrollExpenses() != null) {
            _hashCode += getAllocatePayrollExpenses().hashCode();
        }
        if (getAllowAllResourcesForTasks() != null) {
            _hashCode += getAllowAllResourcesForTasks().hashCode();
        }
        if (getAllowExpenses() != null) {
            _hashCode += getAllowExpenses().hashCode();
        }
        if (getAllowTime() != null) {
            _hashCode += getAllowTime().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getCalculatedEndDate() != null) {
            _hashCode += getCalculatedEndDate().hashCode();
        }
        if (getCalculatedEndDateBaseline() != null) {
            _hashCode += getCalculatedEndDateBaseline().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getCounty() != null) {
            _hashCode += getCounty().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEstCost() != null) {
            _hashCode += getEstCost().hashCode();
        }
        if (getEstEndDate() != null) {
            _hashCode += getEstEndDate().hashCode();
        }
        if (getEstimatedGrossProfit() != null) {
            _hashCode += getEstimatedGrossProfit().hashCode();
        }
        if (getEstimatedGrossProfitPercent() != null) {
            _hashCode += getEstimatedGrossProfitPercent().hashCode();
        }
        if (getEstimatedLaborCost() != null) {
            _hashCode += getEstimatedLaborCost().hashCode();
        }
        if (getEstimatedLaborCostBaseline() != null) {
            _hashCode += getEstimatedLaborCostBaseline().hashCode();
        }
        if (getEstimatedLaborRevenue() != null) {
            _hashCode += getEstimatedLaborRevenue().hashCode();
        }
        if (getEstimatedTime() != null) {
            _hashCode += getEstimatedTime().hashCode();
        }
        if (getEstimatedTimeOverride() != null) {
            _hashCode += getEstimatedTimeOverride().hashCode();
        }
        if (getEstimatedTimeOverrideBaseline() != null) {
            _hashCode += getEstimatedTimeOverrideBaseline().hashCode();
        }
        if (getEstRevenue() != null) {
            _hashCode += getEstRevenue().hashCode();
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
        if (getIncludeCrmTasksInTotals() != null) {
            _hashCode += getIncludeCrmTasksInTotals().hashCode();
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
        if (getIsExemptTime() != null) {
            _hashCode += getIsExemptTime().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsProductiveTime() != null) {
            _hashCode += getIsProductiveTime().hashCode();
        }
        if (getIsUtilizedTime() != null) {
            _hashCode += getIsUtilizedTime().hashCode();
        }
        if (getJobBillingType() != null) {
            _hashCode += getJobBillingType().hashCode();
        }
        if (getJobItem() != null) {
            _hashCode += getJobItem().hashCode();
        }
        if (getJobPrice() != null) {
            _hashCode += getJobPrice().hashCode();
        }
        if (getJobResource() != null) {
            _hashCode += getJobResource().hashCode();
        }
        if (getJobResourceRole() != null) {
            _hashCode += getJobResourceRole().hashCode();
        }
        if (getLanguage() != null) {
            _hashCode += getLanguage().hashCode();
        }
        if (getLastBaselineDate() != null) {
            _hashCode += getLastBaselineDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getLimitTimeToAssignees() != null) {
            _hashCode += getLimitTimeToAssignees().hashCode();
        }
        if (getMaterializeTime() != null) {
            _hashCode += getMaterializeTime().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPctComplete() != null) {
            _hashCode += getPctComplete().hashCode();
        }
        if (getPercentTimeComplete() != null) {
            _hashCode += getPercentTimeComplete().hashCode();
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
        if (getProjectedEndDateBaseline() != null) {
            _hashCode += getProjectedEndDateBaseline().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartDateBaseline() != null) {
            _hashCode += getStartDateBaseline().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTimeRemaining() != null) {
            _hashCode += getTimeRemaining().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
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
        new org.apache.axis.description.TypeDesc(JobSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("allocatePayrollExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allocatePayrollExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAllResourcesForTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowAllResourcesForTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowTime"));
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
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "calculatedEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "calculatedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contact"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("estCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedLaborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCostBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedLaborCostBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedLaborRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverrideBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTimeOverrideBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("includeCrmTasksInTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "includeCrmTasksInTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isExemptTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isExemptTime"));
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
        elemField.setFieldName("isProductiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isProductiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUtilizedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isUtilizedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobBillingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobBillingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResourceRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobResourceRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("lastBaselineDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastBaselineDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("limitTimeToAssignees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "limitTimeToAssignees"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materializeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "materializeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("projectedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projectedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
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
