/**
 * JobSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class JobSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualTime;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressInternalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressLabel;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allocatePayrollExpenses;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowAllResourcesForTasks;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowExpenses;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowTime;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altContact;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altEmail;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] attention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingSchedule;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZipCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] calculatedEndDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] calculatedEndDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] city;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] comments;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] companyName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] contact;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] countryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customer;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] email;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] entityId;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] entityNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedCost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedGrossProfitPercent;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborCost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborCostBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborRevenue;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedRevenue;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTime;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverride;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverrideBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] globalSubscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] image;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] includeCrmTasksInTotals;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultBilling;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultShipping;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isExemptTime;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isProductiveTime;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isUtilizedTime;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] jobBillingType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobItem;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] jobPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobResource;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobResourceRole;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] language;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastBaselineDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] level;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] limitTimeToAssignees;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] materializeTime;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentComplete;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentTimeComplete;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permission;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] phoneticName;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] projectedEndDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] projectedEndDateBaseline;

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

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] state;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subscription;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] subscriptionDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] subscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] timeRemaining;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] zipCode;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public JobSearchRowBasic() {
    }

    public JobSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountNumber,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualTime,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressee,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressInternalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressLabel,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressPhone,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allocatePayrollExpenses,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowAllResourcesForTasks,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowExpenses,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowTime,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altContact,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altEmail,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altPhone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] attention,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingSchedule,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZipCode,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] calculatedEndDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] calculatedEndDateBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] city,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] comments,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] companyName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] contact,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] countryCode,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customer,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] email,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] entityId,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] entityNumber,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedCost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedGrossProfit,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedGrossProfitPercent,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborCost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborCostBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborRevenue,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedRevenue,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTime,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverride,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverrideBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] globalSubscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] image,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] includeCrmTasksInTotals,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultBilling,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultShipping,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isExemptTime,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isProductiveTime,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isUtilizedTime,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] jobBillingType,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobItem,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] jobPrice,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobResource,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobResourceRole,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] language,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastBaselineDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] level,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] limitTimeToAssignees,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] materializeTime,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentComplete,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentTimeComplete,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permission,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] phoneticName,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] projectedEndDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] projectedEndDateBaseline,
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
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDateBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] state,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subscription,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] subscriptionDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] subscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] timeRemaining,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] zipCode,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.accountNumber = accountNumber;
           this.actualTime = actualTime;
           this.address = address;
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.addressee = addressee;
           this.addressInternalId = addressInternalId;
           this.addressLabel = addressLabel;
           this.addressPhone = addressPhone;
           this.allocatePayrollExpenses = allocatePayrollExpenses;
           this.allowAllResourcesForTasks = allowAllResourcesForTasks;
           this.allowExpenses = allowExpenses;
           this.allowTime = allowTime;
           this.altContact = altContact;
           this.altEmail = altEmail;
           this.altName = altName;
           this.altPhone = altPhone;
           this.attention = attention;
           this.billAddress1 = billAddress1;
           this.billAddress2 = billAddress2;
           this.billAddress3 = billAddress3;
           this.billAddressee = billAddressee;
           this.billAttention = billAttention;
           this.billCity = billCity;
           this.billCountry = billCountry;
           this.billCountryCode = billCountryCode;
           this.billingSchedule = billingSchedule;
           this.billPhone = billPhone;
           this.billState = billState;
           this.billZipCode = billZipCode;
           this.calculatedEndDate = calculatedEndDate;
           this.calculatedEndDateBaseline = calculatedEndDateBaseline;
           this.category = category;
           this.city = city;
           this.comments = comments;
           this.companyName = companyName;
           this.contact = contact;
           this.country = country;
           this.countryCode = countryCode;
           this.customer = customer;
           this.dateCreated = dateCreated;
           this.email = email;
           this.endDate = endDate;
           this.entityId = entityId;
           this.entityNumber = entityNumber;
           this.entityStatus = entityStatus;
           this.estimatedCost = estimatedCost;
           this.estimatedGrossProfit = estimatedGrossProfit;
           this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
           this.estimatedLaborCost = estimatedLaborCost;
           this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
           this.estimatedLaborRevenue = estimatedLaborRevenue;
           this.estimatedRevenue = estimatedRevenue;
           this.estimatedTime = estimatedTime;
           this.estimatedTimeOverride = estimatedTimeOverride;
           this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
           this.externalId = externalId;
           this.fax = fax;
           this.globalSubscriptionStatus = globalSubscriptionStatus;
           this.image = image;
           this.includeCrmTasksInTotals = includeCrmTasksInTotals;
           this.internalId = internalId;
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
           this.percentComplete = percentComplete;
           this.percentTimeComplete = percentTimeComplete;
           this.permission = permission;
           this.phone = phone;
           this.phoneticName = phoneticName;
           this.projectedEndDate = projectedEndDate;
           this.projectedEndDateBaseline = projectedEndDateBaseline;
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
           this.startDate = startDate;
           this.startDateBaseline = startDateBaseline;
           this.state = state;
           this.subscription = subscription;
           this.subscriptionDate = subscriptionDate;
           this.subscriptionStatus = subscriptionStatus;
           this.subsidiary = subsidiary;
           this.timeRemaining = timeRemaining;
           this.zipCode = zipCode;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this JobSearchRowBasic.
     * 
     * @return accountNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this JobSearchRowBasic.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountNumber) {
        this.accountNumber = accountNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAccountNumber(int i) {
        return this.accountNumber[i];
    }

    public void setAccountNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.accountNumber[i] = _value;
    }


    /**
     * Gets the actualTime value for this JobSearchRowBasic.
     * 
     * @return actualTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getActualTime() {
        return actualTime;
    }


    /**
     * Sets the actualTime value for this JobSearchRowBasic.
     * 
     * @param actualTime
     */
    public void setActualTime(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualTime) {
        this.actualTime = actualTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getActualTime(int i) {
        return this.actualTime[i];
    }

    public void setActualTime(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.actualTime[i] = _value;
    }


    /**
     * Gets the address value for this JobSearchRowBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this JobSearchRowBasic.
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
     * Gets the address1 value for this JobSearchRowBasic.
     * 
     * @return address1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this JobSearchRowBasic.
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
     * Gets the address2 value for this JobSearchRowBasic.
     * 
     * @return address2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this JobSearchRowBasic.
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
     * Gets the address3 value for this JobSearchRowBasic.
     * 
     * @return address3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this JobSearchRowBasic.
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
     * Gets the addressee value for this JobSearchRowBasic.
     * 
     * @return addressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this JobSearchRowBasic.
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
     * Gets the addressInternalId value for this JobSearchRowBasic.
     * 
     * @return addressInternalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressInternalId() {
        return addressInternalId;
    }


    /**
     * Sets the addressInternalId value for this JobSearchRowBasic.
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
     * Gets the addressLabel value for this JobSearchRowBasic.
     * 
     * @return addressLabel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this JobSearchRowBasic.
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
     * Gets the addressPhone value for this JobSearchRowBasic.
     * 
     * @return addressPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this JobSearchRowBasic.
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
     * Gets the allocatePayrollExpenses value for this JobSearchRowBasic.
     * 
     * @return allocatePayrollExpenses
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAllocatePayrollExpenses() {
        return allocatePayrollExpenses;
    }


    /**
     * Sets the allocatePayrollExpenses value for this JobSearchRowBasic.
     * 
     * @param allocatePayrollExpenses
     */
    public void setAllocatePayrollExpenses(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allocatePayrollExpenses) {
        this.allocatePayrollExpenses = allocatePayrollExpenses;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAllocatePayrollExpenses(int i) {
        return this.allocatePayrollExpenses[i];
    }

    public void setAllocatePayrollExpenses(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.allocatePayrollExpenses[i] = _value;
    }


    /**
     * Gets the allowAllResourcesForTasks value for this JobSearchRowBasic.
     * 
     * @return allowAllResourcesForTasks
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAllowAllResourcesForTasks() {
        return allowAllResourcesForTasks;
    }


    /**
     * Sets the allowAllResourcesForTasks value for this JobSearchRowBasic.
     * 
     * @param allowAllResourcesForTasks
     */
    public void setAllowAllResourcesForTasks(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowAllResourcesForTasks) {
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAllowAllResourcesForTasks(int i) {
        return this.allowAllResourcesForTasks[i];
    }

    public void setAllowAllResourcesForTasks(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.allowAllResourcesForTasks[i] = _value;
    }


    /**
     * Gets the allowExpenses value for this JobSearchRowBasic.
     * 
     * @return allowExpenses
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAllowExpenses() {
        return allowExpenses;
    }


    /**
     * Sets the allowExpenses value for this JobSearchRowBasic.
     * 
     * @param allowExpenses
     */
    public void setAllowExpenses(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowExpenses) {
        this.allowExpenses = allowExpenses;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAllowExpenses(int i) {
        return this.allowExpenses[i];
    }

    public void setAllowExpenses(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.allowExpenses[i] = _value;
    }


    /**
     * Gets the allowTime value for this JobSearchRowBasic.
     * 
     * @return allowTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAllowTime() {
        return allowTime;
    }


    /**
     * Sets the allowTime value for this JobSearchRowBasic.
     * 
     * @param allowTime
     */
    public void setAllowTime(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] allowTime) {
        this.allowTime = allowTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAllowTime(int i) {
        return this.allowTime[i];
    }

    public void setAllowTime(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.allowTime[i] = _value;
    }


    /**
     * Gets the altContact value for this JobSearchRowBasic.
     * 
     * @return altContact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltContact() {
        return altContact;
    }


    /**
     * Sets the altContact value for this JobSearchRowBasic.
     * 
     * @param altContact
     */
    public void setAltContact(org.mule.module.netsuite.api.internal.SearchColumnStringField[] altContact) {
        this.altContact = altContact;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAltContact(int i) {
        return this.altContact[i];
    }

    public void setAltContact(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.altContact[i] = _value;
    }


    /**
     * Gets the altEmail value for this JobSearchRowBasic.
     * 
     * @return altEmail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this JobSearchRowBasic.
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
     * Gets the altName value for this JobSearchRowBasic.
     * 
     * @return altName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this JobSearchRowBasic.
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
     * Gets the altPhone value for this JobSearchRowBasic.
     * 
     * @return altPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this JobSearchRowBasic.
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
     * Gets the attention value for this JobSearchRowBasic.
     * 
     * @return attention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this JobSearchRowBasic.
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
     * Gets the billAddress1 value for this JobSearchRowBasic.
     * 
     * @return billAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress1() {
        return billAddress1;
    }


    /**
     * Sets the billAddress1 value for this JobSearchRowBasic.
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
     * Gets the billAddress2 value for this JobSearchRowBasic.
     * 
     * @return billAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress2() {
        return billAddress2;
    }


    /**
     * Sets the billAddress2 value for this JobSearchRowBasic.
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
     * Gets the billAddress3 value for this JobSearchRowBasic.
     * 
     * @return billAddress3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress3() {
        return billAddress3;
    }


    /**
     * Sets the billAddress3 value for this JobSearchRowBasic.
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
     * Gets the billAddressee value for this JobSearchRowBasic.
     * 
     * @return billAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this JobSearchRowBasic.
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
     * Gets the billAttention value for this JobSearchRowBasic.
     * 
     * @return billAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this JobSearchRowBasic.
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
     * Gets the billCity value for this JobSearchRowBasic.
     * 
     * @return billCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this JobSearchRowBasic.
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
     * Gets the billCountry value for this JobSearchRowBasic.
     * 
     * @return billCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this JobSearchRowBasic.
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
     * Gets the billCountryCode value for this JobSearchRowBasic.
     * 
     * @return billCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCountryCode() {
        return billCountryCode;
    }


    /**
     * Sets the billCountryCode value for this JobSearchRowBasic.
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
     * Gets the billingSchedule value for this JobSearchRowBasic.
     * 
     * @return billingSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this JobSearchRowBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBillingSchedule(int i) {
        return this.billingSchedule[i];
    }

    public void setBillingSchedule(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.billingSchedule[i] = _value;
    }


    /**
     * Gets the billPhone value for this JobSearchRowBasic.
     * 
     * @return billPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this JobSearchRowBasic.
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
     * Gets the billState value for this JobSearchRowBasic.
     * 
     * @return billState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this JobSearchRowBasic.
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
     * Gets the billZipCode value for this JobSearchRowBasic.
     * 
     * @return billZipCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillZipCode() {
        return billZipCode;
    }


    /**
     * Sets the billZipCode value for this JobSearchRowBasic.
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
     * Gets the calculatedEndDate value for this JobSearchRowBasic.
     * 
     * @return calculatedEndDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCalculatedEndDate() {
        return calculatedEndDate;
    }


    /**
     * Sets the calculatedEndDate value for this JobSearchRowBasic.
     * 
     * @param calculatedEndDate
     */
    public void setCalculatedEndDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] calculatedEndDate) {
        this.calculatedEndDate = calculatedEndDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCalculatedEndDate(int i) {
        return this.calculatedEndDate[i];
    }

    public void setCalculatedEndDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.calculatedEndDate[i] = _value;
    }


    /**
     * Gets the calculatedEndDateBaseline value for this JobSearchRowBasic.
     * 
     * @return calculatedEndDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCalculatedEndDateBaseline() {
        return calculatedEndDateBaseline;
    }


    /**
     * Sets the calculatedEndDateBaseline value for this JobSearchRowBasic.
     * 
     * @param calculatedEndDateBaseline
     */
    public void setCalculatedEndDateBaseline(org.mule.module.netsuite.api.internal.SearchColumnDateField[] calculatedEndDateBaseline) {
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCalculatedEndDateBaseline(int i) {
        return this.calculatedEndDateBaseline[i];
    }

    public void setCalculatedEndDateBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.calculatedEndDateBaseline[i] = _value;
    }


    /**
     * Gets the category value for this JobSearchRowBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this JobSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category) {
        this.category = category;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the city value for this JobSearchRowBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this JobSearchRowBasic.
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
     * Gets the comments value for this JobSearchRowBasic.
     * 
     * @return comments
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this JobSearchRowBasic.
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
     * Gets the companyName value for this JobSearchRowBasic.
     * 
     * @return companyName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this JobSearchRowBasic.
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
     * Gets the contact value for this JobSearchRowBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this JobSearchRowBasic.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.SearchColumnStringField[] contact) {
        this.contact = contact;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.contact[i] = _value;
    }


    /**
     * Gets the country value for this JobSearchRowBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this JobSearchRowBasic.
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
     * Gets the countryCode value for this JobSearchRowBasic.
     * 
     * @return countryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this JobSearchRowBasic.
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
     * Gets the customer value for this JobSearchRowBasic.
     * 
     * @return customer
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this JobSearchRowBasic.
     * 
     * @param customer
     */
    public void setCustomer(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.customer[i] = _value;
    }


    /**
     * Gets the dateCreated value for this JobSearchRowBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this JobSearchRowBasic.
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
     * Gets the email value for this JobSearchRowBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this JobSearchRowBasic.
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
     * Gets the endDate value for this JobSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this JobSearchRowBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }


    /**
     * Gets the entityId value for this JobSearchRowBasic.
     * 
     * @return entityId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this JobSearchRowBasic.
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
     * Gets the entityNumber value for this JobSearchRowBasic.
     * 
     * @return entityNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getEntityNumber() {
        return entityNumber;
    }


    /**
     * Sets the entityNumber value for this JobSearchRowBasic.
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
     * Gets the entityStatus value for this JobSearchRowBasic.
     * 
     * @return entityStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this JobSearchRowBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus) {
        this.entityStatus = entityStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEntityStatus(int i) {
        return this.entityStatus[i];
    }

    public void setEntityStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.entityStatus[i] = _value;
    }


    /**
     * Gets the estimatedCost value for this JobSearchRowBasic.
     * 
     * @return estimatedCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedCost() {
        return estimatedCost;
    }


    /**
     * Sets the estimatedCost value for this JobSearchRowBasic.
     * 
     * @param estimatedCost
     */
    public void setEstimatedCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedCost(int i) {
        return this.estimatedCost[i];
    }

    public void setEstimatedCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedCost[i] = _value;
    }


    /**
     * Gets the estimatedGrossProfit value for this JobSearchRowBasic.
     * 
     * @return estimatedGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedGrossProfit() {
        return estimatedGrossProfit;
    }


    /**
     * Sets the estimatedGrossProfit value for this JobSearchRowBasic.
     * 
     * @param estimatedGrossProfit
     */
    public void setEstimatedGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedGrossProfit) {
        this.estimatedGrossProfit = estimatedGrossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedGrossProfit(int i) {
        return this.estimatedGrossProfit[i];
    }

    public void setEstimatedGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedGrossProfit[i] = _value;
    }


    /**
     * Gets the estimatedGrossProfitPercent value for this JobSearchRowBasic.
     * 
     * @return estimatedGrossProfitPercent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedGrossProfitPercent() {
        return estimatedGrossProfitPercent;
    }


    /**
     * Sets the estimatedGrossProfitPercent value for this JobSearchRowBasic.
     * 
     * @param estimatedGrossProfitPercent
     */
    public void setEstimatedGrossProfitPercent(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedGrossProfitPercent) {
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedGrossProfitPercent(int i) {
        return this.estimatedGrossProfitPercent[i];
    }

    public void setEstimatedGrossProfitPercent(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedGrossProfitPercent[i] = _value;
    }


    /**
     * Gets the estimatedLaborCost value for this JobSearchRowBasic.
     * 
     * @return estimatedLaborCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedLaborCost() {
        return estimatedLaborCost;
    }


    /**
     * Sets the estimatedLaborCost value for this JobSearchRowBasic.
     * 
     * @param estimatedLaborCost
     */
    public void setEstimatedLaborCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborCost) {
        this.estimatedLaborCost = estimatedLaborCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedLaborCost(int i) {
        return this.estimatedLaborCost[i];
    }

    public void setEstimatedLaborCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedLaborCost[i] = _value;
    }


    /**
     * Gets the estimatedLaborCostBaseline value for this JobSearchRowBasic.
     * 
     * @return estimatedLaborCostBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedLaborCostBaseline() {
        return estimatedLaborCostBaseline;
    }


    /**
     * Sets the estimatedLaborCostBaseline value for this JobSearchRowBasic.
     * 
     * @param estimatedLaborCostBaseline
     */
    public void setEstimatedLaborCostBaseline(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborCostBaseline) {
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedLaborCostBaseline(int i) {
        return this.estimatedLaborCostBaseline[i];
    }

    public void setEstimatedLaborCostBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedLaborCostBaseline[i] = _value;
    }


    /**
     * Gets the estimatedLaborRevenue value for this JobSearchRowBasic.
     * 
     * @return estimatedLaborRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedLaborRevenue() {
        return estimatedLaborRevenue;
    }


    /**
     * Sets the estimatedLaborRevenue value for this JobSearchRowBasic.
     * 
     * @param estimatedLaborRevenue
     */
    public void setEstimatedLaborRevenue(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedLaborRevenue) {
        this.estimatedLaborRevenue = estimatedLaborRevenue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedLaborRevenue(int i) {
        return this.estimatedLaborRevenue[i];
    }

    public void setEstimatedLaborRevenue(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedLaborRevenue[i] = _value;
    }


    /**
     * Gets the estimatedRevenue value for this JobSearchRowBasic.
     * 
     * @return estimatedRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedRevenue() {
        return estimatedRevenue;
    }


    /**
     * Sets the estimatedRevenue value for this JobSearchRowBasic.
     * 
     * @param estimatedRevenue
     */
    public void setEstimatedRevenue(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedRevenue) {
        this.estimatedRevenue = estimatedRevenue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedRevenue(int i) {
        return this.estimatedRevenue[i];
    }

    public void setEstimatedRevenue(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedRevenue[i] = _value;
    }


    /**
     * Gets the estimatedTime value for this JobSearchRowBasic.
     * 
     * @return estimatedTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this JobSearchRowBasic.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedTime(int i) {
        return this.estimatedTime[i];
    }

    public void setEstimatedTime(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedTime[i] = _value;
    }


    /**
     * Gets the estimatedTimeOverride value for this JobSearchRowBasic.
     * 
     * @return estimatedTimeOverride
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }


    /**
     * Sets the estimatedTimeOverride value for this JobSearchRowBasic.
     * 
     * @param estimatedTimeOverride
     */
    public void setEstimatedTimeOverride(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedTimeOverride(int i) {
        return this.estimatedTimeOverride[i];
    }

    public void setEstimatedTimeOverride(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedTimeOverride[i] = _value;
    }


    /**
     * Gets the estimatedTimeOverrideBaseline value for this JobSearchRowBasic.
     * 
     * @return estimatedTimeOverrideBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedTimeOverrideBaseline() {
        return estimatedTimeOverrideBaseline;
    }


    /**
     * Sets the estimatedTimeOverrideBaseline value for this JobSearchRowBasic.
     * 
     * @param estimatedTimeOverrideBaseline
     */
    public void setEstimatedTimeOverrideBaseline(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverrideBaseline) {
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedTimeOverrideBaseline(int i) {
        return this.estimatedTimeOverrideBaseline[i];
    }

    public void setEstimatedTimeOverrideBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedTimeOverrideBaseline[i] = _value;
    }


    /**
     * Gets the externalId value for this JobSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this JobSearchRowBasic.
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
     * Gets the fax value for this JobSearchRowBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this JobSearchRowBasic.
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
     * Gets the globalSubscriptionStatus value for this JobSearchRowBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this JobSearchRowBasic.
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
     * Gets the image value for this JobSearchRowBasic.
     * 
     * @return image
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this JobSearchRowBasic.
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
     * Gets the includeCrmTasksInTotals value for this JobSearchRowBasic.
     * 
     * @return includeCrmTasksInTotals
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIncludeCrmTasksInTotals() {
        return includeCrmTasksInTotals;
    }


    /**
     * Sets the includeCrmTasksInTotals value for this JobSearchRowBasic.
     * 
     * @param includeCrmTasksInTotals
     */
    public void setIncludeCrmTasksInTotals(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] includeCrmTasksInTotals) {
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIncludeCrmTasksInTotals(int i) {
        return this.includeCrmTasksInTotals[i];
    }

    public void setIncludeCrmTasksInTotals(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.includeCrmTasksInTotals[i] = _value;
    }


    /**
     * Gets the internalId value for this JobSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this JobSearchRowBasic.
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
     * Gets the isDefaultBilling value for this JobSearchRowBasic.
     * 
     * @return isDefaultBilling
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this JobSearchRowBasic.
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
     * Gets the isDefaultShipping value for this JobSearchRowBasic.
     * 
     * @return isDefaultShipping
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this JobSearchRowBasic.
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
     * Gets the isExemptTime value for this JobSearchRowBasic.
     * 
     * @return isExemptTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsExemptTime() {
        return isExemptTime;
    }


    /**
     * Sets the isExemptTime value for this JobSearchRowBasic.
     * 
     * @param isExemptTime
     */
    public void setIsExemptTime(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isExemptTime) {
        this.isExemptTime = isExemptTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsExemptTime(int i) {
        return this.isExemptTime[i];
    }

    public void setIsExemptTime(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isExemptTime[i] = _value;
    }


    /**
     * Gets the isInactive value for this JobSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this JobSearchRowBasic.
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
     * Gets the isProductiveTime value for this JobSearchRowBasic.
     * 
     * @return isProductiveTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsProductiveTime() {
        return isProductiveTime;
    }


    /**
     * Sets the isProductiveTime value for this JobSearchRowBasic.
     * 
     * @param isProductiveTime
     */
    public void setIsProductiveTime(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isProductiveTime) {
        this.isProductiveTime = isProductiveTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsProductiveTime(int i) {
        return this.isProductiveTime[i];
    }

    public void setIsProductiveTime(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isProductiveTime[i] = _value;
    }


    /**
     * Gets the isUtilizedTime value for this JobSearchRowBasic.
     * 
     * @return isUtilizedTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsUtilizedTime() {
        return isUtilizedTime;
    }


    /**
     * Sets the isUtilizedTime value for this JobSearchRowBasic.
     * 
     * @param isUtilizedTime
     */
    public void setIsUtilizedTime(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isUtilizedTime) {
        this.isUtilizedTime = isUtilizedTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsUtilizedTime(int i) {
        return this.isUtilizedTime[i];
    }

    public void setIsUtilizedTime(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isUtilizedTime[i] = _value;
    }


    /**
     * Gets the jobBillingType value for this JobSearchRowBasic.
     * 
     * @return jobBillingType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getJobBillingType() {
        return jobBillingType;
    }


    /**
     * Sets the jobBillingType value for this JobSearchRowBasic.
     * 
     * @param jobBillingType
     */
    public void setJobBillingType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] jobBillingType) {
        this.jobBillingType = jobBillingType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getJobBillingType(int i) {
        return this.jobBillingType[i];
    }

    public void setJobBillingType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.jobBillingType[i] = _value;
    }


    /**
     * Gets the jobItem value for this JobSearchRowBasic.
     * 
     * @return jobItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getJobItem() {
        return jobItem;
    }


    /**
     * Sets the jobItem value for this JobSearchRowBasic.
     * 
     * @param jobItem
     */
    public void setJobItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobItem) {
        this.jobItem = jobItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getJobItem(int i) {
        return this.jobItem[i];
    }

    public void setJobItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.jobItem[i] = _value;
    }


    /**
     * Gets the jobPrice value for this JobSearchRowBasic.
     * 
     * @return jobPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getJobPrice() {
        return jobPrice;
    }


    /**
     * Sets the jobPrice value for this JobSearchRowBasic.
     * 
     * @param jobPrice
     */
    public void setJobPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] jobPrice) {
        this.jobPrice = jobPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getJobPrice(int i) {
        return this.jobPrice[i];
    }

    public void setJobPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.jobPrice[i] = _value;
    }


    /**
     * Gets the jobResource value for this JobSearchRowBasic.
     * 
     * @return jobResource
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getJobResource() {
        return jobResource;
    }


    /**
     * Sets the jobResource value for this JobSearchRowBasic.
     * 
     * @param jobResource
     */
    public void setJobResource(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobResource) {
        this.jobResource = jobResource;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getJobResource(int i) {
        return this.jobResource[i];
    }

    public void setJobResource(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.jobResource[i] = _value;
    }


    /**
     * Gets the jobResourceRole value for this JobSearchRowBasic.
     * 
     * @return jobResourceRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getJobResourceRole() {
        return jobResourceRole;
    }


    /**
     * Sets the jobResourceRole value for this JobSearchRowBasic.
     * 
     * @param jobResourceRole
     */
    public void setJobResourceRole(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobResourceRole) {
        this.jobResourceRole = jobResourceRole;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getJobResourceRole(int i) {
        return this.jobResourceRole[i];
    }

    public void setJobResourceRole(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.jobResourceRole[i] = _value;
    }


    /**
     * Gets the language value for this JobSearchRowBasic.
     * 
     * @return language
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this JobSearchRowBasic.
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
     * Gets the lastBaselineDate value for this JobSearchRowBasic.
     * 
     * @return lastBaselineDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastBaselineDate() {
        return lastBaselineDate;
    }


    /**
     * Sets the lastBaselineDate value for this JobSearchRowBasic.
     * 
     * @param lastBaselineDate
     */
    public void setLastBaselineDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastBaselineDate) {
        this.lastBaselineDate = lastBaselineDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastBaselineDate(int i) {
        return this.lastBaselineDate[i];
    }

    public void setLastBaselineDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastBaselineDate[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this JobSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this JobSearchRowBasic.
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
     * Gets the level value for this JobSearchRowBasic.
     * 
     * @return level
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getLevel() {
        return level;
    }


    /**
     * Sets the level value for this JobSearchRowBasic.
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
     * Gets the limitTimeToAssignees value for this JobSearchRowBasic.
     * 
     * @return limitTimeToAssignees
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getLimitTimeToAssignees() {
        return limitTimeToAssignees;
    }


    /**
     * Sets the limitTimeToAssignees value for this JobSearchRowBasic.
     * 
     * @param limitTimeToAssignees
     */
    public void setLimitTimeToAssignees(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] limitTimeToAssignees) {
        this.limitTimeToAssignees = limitTimeToAssignees;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getLimitTimeToAssignees(int i) {
        return this.limitTimeToAssignees[i];
    }

    public void setLimitTimeToAssignees(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.limitTimeToAssignees[i] = _value;
    }


    /**
     * Gets the materializeTime value for this JobSearchRowBasic.
     * 
     * @return materializeTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getMaterializeTime() {
        return materializeTime;
    }


    /**
     * Sets the materializeTime value for this JobSearchRowBasic.
     * 
     * @param materializeTime
     */
    public void setMaterializeTime(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] materializeTime) {
        this.materializeTime = materializeTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getMaterializeTime(int i) {
        return this.materializeTime[i];
    }

    public void setMaterializeTime(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.materializeTime[i] = _value;
    }


    /**
     * Gets the percentComplete value for this JobSearchRowBasic.
     * 
     * @return percentComplete
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this JobSearchRowBasic.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentComplete) {
        this.percentComplete = percentComplete;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPercentComplete(int i) {
        return this.percentComplete[i];
    }

    public void setPercentComplete(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.percentComplete[i] = _value;
    }


    /**
     * Gets the percentTimeComplete value for this JobSearchRowBasic.
     * 
     * @return percentTimeComplete
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this JobSearchRowBasic.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPercentTimeComplete(int i) {
        return this.percentTimeComplete[i];
    }

    public void setPercentTimeComplete(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.percentTimeComplete[i] = _value;
    }


    /**
     * Gets the permission value for this JobSearchRowBasic.
     * 
     * @return permission
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this JobSearchRowBasic.
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
     * Gets the phone value for this JobSearchRowBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this JobSearchRowBasic.
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
     * Gets the phoneticName value for this JobSearchRowBasic.
     * 
     * @return phoneticName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this JobSearchRowBasic.
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
     * Gets the projectedEndDate value for this JobSearchRowBasic.
     * 
     * @return projectedEndDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getProjectedEndDate() {
        return projectedEndDate;
    }


    /**
     * Sets the projectedEndDate value for this JobSearchRowBasic.
     * 
     * @param projectedEndDate
     */
    public void setProjectedEndDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] projectedEndDate) {
        this.projectedEndDate = projectedEndDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getProjectedEndDate(int i) {
        return this.projectedEndDate[i];
    }

    public void setProjectedEndDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.projectedEndDate[i] = _value;
    }


    /**
     * Gets the projectedEndDateBaseline value for this JobSearchRowBasic.
     * 
     * @return projectedEndDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getProjectedEndDateBaseline() {
        return projectedEndDateBaseline;
    }


    /**
     * Sets the projectedEndDateBaseline value for this JobSearchRowBasic.
     * 
     * @param projectedEndDateBaseline
     */
    public void setProjectedEndDateBaseline(org.mule.module.netsuite.api.internal.SearchColumnDateField[] projectedEndDateBaseline) {
        this.projectedEndDateBaseline = projectedEndDateBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getProjectedEndDateBaseline(int i) {
        return this.projectedEndDateBaseline[i];
    }

    public void setProjectedEndDateBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.projectedEndDateBaseline[i] = _value;
    }


    /**
     * Gets the shipAddress1 value for this JobSearchRowBasic.
     * 
     * @return shipAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this JobSearchRowBasic.
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
     * Gets the shipAddress2 value for this JobSearchRowBasic.
     * 
     * @return shipAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this JobSearchRowBasic.
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
     * Gets the shipAddress3 value for this JobSearchRowBasic.
     * 
     * @return shipAddress3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress3() {
        return shipAddress3;
    }


    /**
     * Sets the shipAddress3 value for this JobSearchRowBasic.
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
     * Gets the shipAddressee value for this JobSearchRowBasic.
     * 
     * @return shipAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this JobSearchRowBasic.
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
     * Gets the shipAttention value for this JobSearchRowBasic.
     * 
     * @return shipAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this JobSearchRowBasic.
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
     * Gets the shipCity value for this JobSearchRowBasic.
     * 
     * @return shipCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this JobSearchRowBasic.
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
     * Gets the shipCountry value for this JobSearchRowBasic.
     * 
     * @return shipCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this JobSearchRowBasic.
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
     * Gets the shipCountryCode value for this JobSearchRowBasic.
     * 
     * @return shipCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCountryCode() {
        return shipCountryCode;
    }


    /**
     * Sets the shipCountryCode value for this JobSearchRowBasic.
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
     * Gets the shipPhone value for this JobSearchRowBasic.
     * 
     * @return shipPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this JobSearchRowBasic.
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
     * Gets the shipState value for this JobSearchRowBasic.
     * 
     * @return shipState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this JobSearchRowBasic.
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
     * Gets the shipZip value for this JobSearchRowBasic.
     * 
     * @return shipZip
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this JobSearchRowBasic.
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
     * Gets the startDate value for this JobSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this JobSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the startDateBaseline value for this JobSearchRowBasic.
     * 
     * @return startDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this JobSearchRowBasic.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getStartDateBaseline(int i) {
        return this.startDateBaseline[i];
    }

    public void setStartDateBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.startDateBaseline[i] = _value;
    }


    /**
     * Gets the state value for this JobSearchRowBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this JobSearchRowBasic.
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
     * Gets the subscription value for this JobSearchRowBasic.
     * 
     * @return subscription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this JobSearchRowBasic.
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
     * Gets the subscriptionDate value for this JobSearchRowBasic.
     * 
     * @return subscriptionDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getSubscriptionDate() {
        return subscriptionDate;
    }


    /**
     * Sets the subscriptionDate value for this JobSearchRowBasic.
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
     * Gets the subscriptionStatus value for this JobSearchRowBasic.
     * 
     * @return subscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getSubscriptionStatus() {
        return subscriptionStatus;
    }


    /**
     * Sets the subscriptionStatus value for this JobSearchRowBasic.
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
     * Gets the subsidiary value for this JobSearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this JobSearchRowBasic.
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
     * Gets the timeRemaining value for this JobSearchRowBasic.
     * 
     * @return timeRemaining
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTimeRemaining() {
        return timeRemaining;
    }


    /**
     * Sets the timeRemaining value for this JobSearchRowBasic.
     * 
     * @param timeRemaining
     */
    public void setTimeRemaining(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTimeRemaining(int i) {
        return this.timeRemaining[i];
    }

    public void setTimeRemaining(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.timeRemaining[i] = _value;
    }


    /**
     * Gets the zipCode value for this JobSearchRowBasic.
     * 
     * @return zipCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this JobSearchRowBasic.
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
     * Gets the customFieldList value for this JobSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this JobSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof JobSearchRowBasic)) return false;
        JobSearchRowBasic other = (JobSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              java.util.Arrays.equals(this.accountNumber, other.getAccountNumber()))) &&
            ((this.actualTime==null && other.getActualTime()==null) || 
             (this.actualTime!=null &&
              java.util.Arrays.equals(this.actualTime, other.getActualTime()))) &&
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
            ((this.allocatePayrollExpenses==null && other.getAllocatePayrollExpenses()==null) || 
             (this.allocatePayrollExpenses!=null &&
              java.util.Arrays.equals(this.allocatePayrollExpenses, other.getAllocatePayrollExpenses()))) &&
            ((this.allowAllResourcesForTasks==null && other.getAllowAllResourcesForTasks()==null) || 
             (this.allowAllResourcesForTasks!=null &&
              java.util.Arrays.equals(this.allowAllResourcesForTasks, other.getAllowAllResourcesForTasks()))) &&
            ((this.allowExpenses==null && other.getAllowExpenses()==null) || 
             (this.allowExpenses!=null &&
              java.util.Arrays.equals(this.allowExpenses, other.getAllowExpenses()))) &&
            ((this.allowTime==null && other.getAllowTime()==null) || 
             (this.allowTime!=null &&
              java.util.Arrays.equals(this.allowTime, other.getAllowTime()))) &&
            ((this.altContact==null && other.getAltContact()==null) || 
             (this.altContact!=null &&
              java.util.Arrays.equals(this.altContact, other.getAltContact()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              java.util.Arrays.equals(this.altEmail, other.getAltEmail()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              java.util.Arrays.equals(this.altName, other.getAltName()))) &&
            ((this.altPhone==null && other.getAltPhone()==null) || 
             (this.altPhone!=null &&
              java.util.Arrays.equals(this.altPhone, other.getAltPhone()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              java.util.Arrays.equals(this.attention, other.getAttention()))) &&
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
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              java.util.Arrays.equals(this.billingSchedule, other.getBillingSchedule()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              java.util.Arrays.equals(this.billPhone, other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              java.util.Arrays.equals(this.billState, other.getBillState()))) &&
            ((this.billZipCode==null && other.getBillZipCode()==null) || 
             (this.billZipCode!=null &&
              java.util.Arrays.equals(this.billZipCode, other.getBillZipCode()))) &&
            ((this.calculatedEndDate==null && other.getCalculatedEndDate()==null) || 
             (this.calculatedEndDate!=null &&
              java.util.Arrays.equals(this.calculatedEndDate, other.getCalculatedEndDate()))) &&
            ((this.calculatedEndDateBaseline==null && other.getCalculatedEndDateBaseline()==null) || 
             (this.calculatedEndDateBaseline!=null &&
              java.util.Arrays.equals(this.calculatedEndDateBaseline, other.getCalculatedEndDateBaseline()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              java.util.Arrays.equals(this.companyName, other.getCompanyName()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              java.util.Arrays.equals(this.country, other.getCountry()))) &&
            ((this.countryCode==null && other.getCountryCode()==null) || 
             (this.countryCode!=null &&
              java.util.Arrays.equals(this.countryCode, other.getCountryCode()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              java.util.Arrays.equals(this.entityId, other.getEntityId()))) &&
            ((this.entityNumber==null && other.getEntityNumber()==null) || 
             (this.entityNumber!=null &&
              java.util.Arrays.equals(this.entityNumber, other.getEntityNumber()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.estimatedCost==null && other.getEstimatedCost()==null) || 
             (this.estimatedCost!=null &&
              java.util.Arrays.equals(this.estimatedCost, other.getEstimatedCost()))) &&
            ((this.estimatedGrossProfit==null && other.getEstimatedGrossProfit()==null) || 
             (this.estimatedGrossProfit!=null &&
              java.util.Arrays.equals(this.estimatedGrossProfit, other.getEstimatedGrossProfit()))) &&
            ((this.estimatedGrossProfitPercent==null && other.getEstimatedGrossProfitPercent()==null) || 
             (this.estimatedGrossProfitPercent!=null &&
              java.util.Arrays.equals(this.estimatedGrossProfitPercent, other.getEstimatedGrossProfitPercent()))) &&
            ((this.estimatedLaborCost==null && other.getEstimatedLaborCost()==null) || 
             (this.estimatedLaborCost!=null &&
              java.util.Arrays.equals(this.estimatedLaborCost, other.getEstimatedLaborCost()))) &&
            ((this.estimatedLaborCostBaseline==null && other.getEstimatedLaborCostBaseline()==null) || 
             (this.estimatedLaborCostBaseline!=null &&
              java.util.Arrays.equals(this.estimatedLaborCostBaseline, other.getEstimatedLaborCostBaseline()))) &&
            ((this.estimatedLaborRevenue==null && other.getEstimatedLaborRevenue()==null) || 
             (this.estimatedLaborRevenue!=null &&
              java.util.Arrays.equals(this.estimatedLaborRevenue, other.getEstimatedLaborRevenue()))) &&
            ((this.estimatedRevenue==null && other.getEstimatedRevenue()==null) || 
             (this.estimatedRevenue!=null &&
              java.util.Arrays.equals(this.estimatedRevenue, other.getEstimatedRevenue()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              java.util.Arrays.equals(this.estimatedTime, other.getEstimatedTime()))) &&
            ((this.estimatedTimeOverride==null && other.getEstimatedTimeOverride()==null) || 
             (this.estimatedTimeOverride!=null &&
              java.util.Arrays.equals(this.estimatedTimeOverride, other.getEstimatedTimeOverride()))) &&
            ((this.estimatedTimeOverrideBaseline==null && other.getEstimatedTimeOverrideBaseline()==null) || 
             (this.estimatedTimeOverrideBaseline!=null &&
              java.util.Arrays.equals(this.estimatedTimeOverrideBaseline, other.getEstimatedTimeOverrideBaseline()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              java.util.Arrays.equals(this.fax, other.getFax()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              java.util.Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus()))) &&
            ((this.image==null && other.getImage()==null) || 
             (this.image!=null &&
              java.util.Arrays.equals(this.image, other.getImage()))) &&
            ((this.includeCrmTasksInTotals==null && other.getIncludeCrmTasksInTotals()==null) || 
             (this.includeCrmTasksInTotals!=null &&
              java.util.Arrays.equals(this.includeCrmTasksInTotals, other.getIncludeCrmTasksInTotals()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isDefaultBilling==null && other.getIsDefaultBilling()==null) || 
             (this.isDefaultBilling!=null &&
              java.util.Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling()))) &&
            ((this.isDefaultShipping==null && other.getIsDefaultShipping()==null) || 
             (this.isDefaultShipping!=null &&
              java.util.Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping()))) &&
            ((this.isExemptTime==null && other.getIsExemptTime()==null) || 
             (this.isExemptTime!=null &&
              java.util.Arrays.equals(this.isExemptTime, other.getIsExemptTime()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isProductiveTime==null && other.getIsProductiveTime()==null) || 
             (this.isProductiveTime!=null &&
              java.util.Arrays.equals(this.isProductiveTime, other.getIsProductiveTime()))) &&
            ((this.isUtilizedTime==null && other.getIsUtilizedTime()==null) || 
             (this.isUtilizedTime!=null &&
              java.util.Arrays.equals(this.isUtilizedTime, other.getIsUtilizedTime()))) &&
            ((this.jobBillingType==null && other.getJobBillingType()==null) || 
             (this.jobBillingType!=null &&
              java.util.Arrays.equals(this.jobBillingType, other.getJobBillingType()))) &&
            ((this.jobItem==null && other.getJobItem()==null) || 
             (this.jobItem!=null &&
              java.util.Arrays.equals(this.jobItem, other.getJobItem()))) &&
            ((this.jobPrice==null && other.getJobPrice()==null) || 
             (this.jobPrice!=null &&
              java.util.Arrays.equals(this.jobPrice, other.getJobPrice()))) &&
            ((this.jobResource==null && other.getJobResource()==null) || 
             (this.jobResource!=null &&
              java.util.Arrays.equals(this.jobResource, other.getJobResource()))) &&
            ((this.jobResourceRole==null && other.getJobResourceRole()==null) || 
             (this.jobResourceRole!=null &&
              java.util.Arrays.equals(this.jobResourceRole, other.getJobResourceRole()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.lastBaselineDate==null && other.getLastBaselineDate()==null) || 
             (this.lastBaselineDate!=null &&
              java.util.Arrays.equals(this.lastBaselineDate, other.getLastBaselineDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              java.util.Arrays.equals(this.level, other.getLevel()))) &&
            ((this.limitTimeToAssignees==null && other.getLimitTimeToAssignees()==null) || 
             (this.limitTimeToAssignees!=null &&
              java.util.Arrays.equals(this.limitTimeToAssignees, other.getLimitTimeToAssignees()))) &&
            ((this.materializeTime==null && other.getMaterializeTime()==null) || 
             (this.materializeTime!=null &&
              java.util.Arrays.equals(this.materializeTime, other.getMaterializeTime()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              java.util.Arrays.equals(this.percentComplete, other.getPercentComplete()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              java.util.Arrays.equals(this.percentTimeComplete, other.getPercentTimeComplete()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              java.util.Arrays.equals(this.permission, other.getPermission()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              java.util.Arrays.equals(this.phoneticName, other.getPhoneticName()))) &&
            ((this.projectedEndDate==null && other.getProjectedEndDate()==null) || 
             (this.projectedEndDate!=null &&
              java.util.Arrays.equals(this.projectedEndDate, other.getProjectedEndDate()))) &&
            ((this.projectedEndDateBaseline==null && other.getProjectedEndDateBaseline()==null) || 
             (this.projectedEndDateBaseline!=null &&
              java.util.Arrays.equals(this.projectedEndDateBaseline, other.getProjectedEndDateBaseline()))) &&
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
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              java.util.Arrays.equals(this.startDateBaseline, other.getStartDateBaseline()))) &&
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
            ((this.timeRemaining==null && other.getTimeRemaining()==null) || 
             (this.timeRemaining!=null &&
              java.util.Arrays.equals(this.timeRemaining, other.getTimeRemaining()))) &&
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
        if (getAccountNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
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
        if (getAllocatePayrollExpenses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllocatePayrollExpenses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllocatePayrollExpenses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowAllResourcesForTasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowAllResourcesForTasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowAllResourcesForTasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowExpenses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowExpenses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowExpenses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAllowTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAllowTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAllowTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltContact(), i);
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
        if (getBillingSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingSchedule(), i);
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
        if (getCalculatedEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalculatedEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalculatedEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCalculatedEndDateBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalculatedEndDateBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalculatedEndDateBaseline(), i);
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
        if (getContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContact(), i);
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
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
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
        if (getEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDate(), i);
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
        if (getEntityStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntityStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntityStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedGrossProfitPercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedGrossProfitPercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedGrossProfitPercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedLaborCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedLaborCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedLaborCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedLaborCostBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedLaborCostBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedLaborCostBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedLaborRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedLaborRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedLaborRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedTimeOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedTimeOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedTimeOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedTimeOverrideBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedTimeOverrideBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedTimeOverrideBaseline(), i);
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
        if (getIncludeCrmTasksInTotals() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeCrmTasksInTotals());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeCrmTasksInTotals(), i);
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
        if (getIsExemptTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsExemptTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsExemptTime(), i);
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
        if (getIsProductiveTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsProductiveTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsProductiveTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsUtilizedTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsUtilizedTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsUtilizedTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobBillingType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobBillingType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobBillingType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobResourceRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobResourceRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobResourceRole(), i);
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
        if (getLastBaselineDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastBaselineDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastBaselineDate(), i);
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
        if (getLimitTimeToAssignees() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitTimeToAssignees());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitTimeToAssignees(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaterializeTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaterializeTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaterializeTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPercentComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentComplete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPercentTimeComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentTimeComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentTimeComplete(), i);
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
        if (getProjectedEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectedEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectedEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectedEndDateBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectedEndDateBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectedEndDateBaseline(), i);
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
        if (getStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDateBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDateBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDateBaseline(), i);
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
        if (getTimeRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeRemaining(), i);
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
        new org.apache.axis.description.TypeDesc(JobSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("allocatePayrollExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allocatePayrollExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowAllResourcesForTasks");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowAllResourcesForTasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowExpenses");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowExpenses"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "allowTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altContact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altContact"));
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
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "attention"));
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
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("calculatedEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "calculatedEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculatedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "calculatedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contact"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedLaborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborCostBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedLaborCostBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedLaborRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedLaborRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverrideBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTimeOverrideBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("includeCrmTasksInTotals");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "includeCrmTasksInTotals"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("isExemptTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isExemptTime"));
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
        elemField.setFieldName("isProductiveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isProductiveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUtilizedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isUtilizedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobBillingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobBillingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobResourceRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobResourceRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("lastBaselineDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastBaselineDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("level");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitTimeToAssignees");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "limitTimeToAssignees"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("materializeTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "materializeTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("projectedEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projectedEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedEndDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projectedEndDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
