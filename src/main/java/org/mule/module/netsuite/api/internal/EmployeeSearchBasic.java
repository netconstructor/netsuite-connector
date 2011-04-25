/**
 * EmployeeSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeeSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField address;

    private org.mule.module.netsuite.api.internal.SearchStringField addressee;

    private org.mule.module.netsuite.api.internal.SearchStringField addressLabel;

    private org.mule.module.netsuite.api.internal.SearchStringField addressPhone;

    private org.mule.module.netsuite.api.internal.SearchStringField alienNumber;

    private org.mule.module.netsuite.api.internal.SearchDateField anniversary;

    private org.mule.module.netsuite.api.internal.SearchDoubleField approvalLimit;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField approver;

    private org.mule.module.netsuite.api.internal.SearchStringField attention;

    private org.mule.module.netsuite.api.internal.SearchDateField authworkDate;

    private org.mule.module.netsuite.api.internal.SearchStringField billAddress;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField billingClass;

    private org.mule.module.netsuite.api.internal.SearchDateField birthDate;

    private org.mule.module.netsuite.api.internal.SearchDateField birthDay;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField cContribution;

    private org.mule.module.netsuite.api.internal.SearchStringField city;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField _class;

    private org.mule.module.netsuite.api.internal.SearchStringField comments;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField commissionPlan;

    private org.mule.module.netsuite.api.internal.SearchBooleanField concurrentWebServicesUser;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country;

    private org.mule.module.netsuite.api.internal.SearchStringField county;

    private org.mule.module.netsuite.api.internal.SearchDateField dateCreated;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField deduction;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField department;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField earning;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField education;

    private org.mule.module.netsuite.api.internal.SearchBooleanField eligibleForCommission;

    private org.mule.module.netsuite.api.internal.SearchStringField email;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeStatus;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeType;

    private org.mule.module.netsuite.api.internal.SearchBooleanField employeeTypeKpi;

    private org.mule.module.netsuite.api.internal.SearchStringField entityId;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField ethnicity;

    private org.mule.module.netsuite.api.internal.SearchDoubleField expenseLimit;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchStringField fax;

    private org.mule.module.netsuite.api.internal.SearchStringField firstName;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gender;

    private org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField group;

    private org.mule.module.netsuite.api.internal.SearchDateField hireDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField i9Verified;

    private org.mule.module.netsuite.api.internal.SearchStringField image;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isJobResource;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isTemplate;

    private org.mule.module.netsuite.api.internal.SearchStringField jobDescription;

    private org.mule.module.netsuite.api.internal.SearchDoubleField laborCost;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchStringField lastName;

    private org.mule.module.netsuite.api.internal.SearchDateField lastPaidDate;

    private org.mule.module.netsuite.api.internal.SearchDateField lastReviewDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField location;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField maritalStatus;

    private org.mule.module.netsuite.api.internal.SearchStringField middleName;

    private org.mule.module.netsuite.api.internal.SearchDateField nextReviewDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField offlineAccess;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField payFrequency;

    private org.mule.module.netsuite.api.internal.SearchDateField permChangeDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permissionChange;

    private org.mule.module.netsuite.api.internal.SearchStringField phone;

    private org.mule.module.netsuite.api.internal.SearchStringField phoneticName;

    private org.mule.module.netsuite.api.internal.SearchDoubleField primaryEarningAmount;

    private org.mule.module.netsuite.api.internal.SearchStringField primaryEarningItem;

    private org.mule.module.netsuite.api.internal.SearchStringField primaryEarningType;

    private org.mule.module.netsuite.api.internal.SearchDoubleField purchaseOrderApprovalLimit;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseOrderApprover;

    private org.mule.module.netsuite.api.internal.SearchDoubleField purchaseOrderLimit;

    private org.mule.module.netsuite.api.internal.SearchDateField releaseDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField residentStatus;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField role;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField roleChange;

    private org.mule.module.netsuite.api.internal.SearchDateField roleChangeDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField salesRep;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRole;

    private org.mule.module.netsuite.api.internal.SearchStringField salutation;

    private org.mule.module.netsuite.api.internal.SearchStringField socialSecurityNumber;

    private org.mule.module.netsuite.api.internal.SearchStringField state;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField supervisor;

    private org.mule.module.netsuite.api.internal.SearchBooleanField supportRep;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField timeApprover;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchBooleanField usePerquest;

    private org.mule.module.netsuite.api.internal.SearchBooleanField useTimeData;

    private org.mule.module.netsuite.api.internal.SearchDateField visaExpDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField visaType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField withholding;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField workCalendar;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField workplace;

    private org.mule.module.netsuite.api.internal.SearchStringField zipCode;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public EmployeeSearchBasic() {
    }

    public EmployeeSearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField address,
           org.mule.module.netsuite.api.internal.SearchStringField addressee,
           org.mule.module.netsuite.api.internal.SearchStringField addressLabel,
           org.mule.module.netsuite.api.internal.SearchStringField addressPhone,
           org.mule.module.netsuite.api.internal.SearchStringField alienNumber,
           org.mule.module.netsuite.api.internal.SearchDateField anniversary,
           org.mule.module.netsuite.api.internal.SearchDoubleField approvalLimit,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField approver,
           org.mule.module.netsuite.api.internal.SearchStringField attention,
           org.mule.module.netsuite.api.internal.SearchDateField authworkDate,
           org.mule.module.netsuite.api.internal.SearchStringField billAddress,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField billingClass,
           org.mule.module.netsuite.api.internal.SearchDateField birthDate,
           org.mule.module.netsuite.api.internal.SearchDateField birthDay,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField cContribution,
           org.mule.module.netsuite.api.internal.SearchStringField city,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField _class,
           org.mule.module.netsuite.api.internal.SearchStringField comments,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField commissionPlan,
           org.mule.module.netsuite.api.internal.SearchBooleanField concurrentWebServicesUser,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country,
           org.mule.module.netsuite.api.internal.SearchStringField county,
           org.mule.module.netsuite.api.internal.SearchDateField dateCreated,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField deduction,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField department,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField earning,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField education,
           org.mule.module.netsuite.api.internal.SearchBooleanField eligibleForCommission,
           org.mule.module.netsuite.api.internal.SearchStringField email,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeStatus,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeType,
           org.mule.module.netsuite.api.internal.SearchBooleanField employeeTypeKpi,
           org.mule.module.netsuite.api.internal.SearchStringField entityId,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField ethnicity,
           org.mule.module.netsuite.api.internal.SearchDoubleField expenseLimit,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchStringField fax,
           org.mule.module.netsuite.api.internal.SearchStringField firstName,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gender,
           org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField group,
           org.mule.module.netsuite.api.internal.SearchDateField hireDate,
           org.mule.module.netsuite.api.internal.SearchBooleanField i9Verified,
           org.mule.module.netsuite.api.internal.SearchStringField image,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isJobResource,
           org.mule.module.netsuite.api.internal.SearchBooleanField isTemplate,
           org.mule.module.netsuite.api.internal.SearchStringField jobDescription,
           org.mule.module.netsuite.api.internal.SearchDoubleField laborCost,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchStringField lastName,
           org.mule.module.netsuite.api.internal.SearchDateField lastPaidDate,
           org.mule.module.netsuite.api.internal.SearchDateField lastReviewDate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField location,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField maritalStatus,
           org.mule.module.netsuite.api.internal.SearchStringField middleName,
           org.mule.module.netsuite.api.internal.SearchDateField nextReviewDate,
           org.mule.module.netsuite.api.internal.SearchBooleanField offlineAccess,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField payFrequency,
           org.mule.module.netsuite.api.internal.SearchDateField permChangeDate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permissionChange,
           org.mule.module.netsuite.api.internal.SearchStringField phone,
           org.mule.module.netsuite.api.internal.SearchStringField phoneticName,
           org.mule.module.netsuite.api.internal.SearchDoubleField primaryEarningAmount,
           org.mule.module.netsuite.api.internal.SearchStringField primaryEarningItem,
           org.mule.module.netsuite.api.internal.SearchStringField primaryEarningType,
           org.mule.module.netsuite.api.internal.SearchDoubleField purchaseOrderApprovalLimit,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseOrderApprover,
           org.mule.module.netsuite.api.internal.SearchDoubleField purchaseOrderLimit,
           org.mule.module.netsuite.api.internal.SearchDateField releaseDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField residentStatus,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField role,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField roleChange,
           org.mule.module.netsuite.api.internal.SearchDateField roleChangeDate,
           org.mule.module.netsuite.api.internal.SearchBooleanField salesRep,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRole,
           org.mule.module.netsuite.api.internal.SearchStringField salutation,
           org.mule.module.netsuite.api.internal.SearchStringField socialSecurityNumber,
           org.mule.module.netsuite.api.internal.SearchStringField state,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField supervisor,
           org.mule.module.netsuite.api.internal.SearchBooleanField supportRep,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField timeApprover,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchBooleanField usePerquest,
           org.mule.module.netsuite.api.internal.SearchBooleanField useTimeData,
           org.mule.module.netsuite.api.internal.SearchDateField visaExpDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField visaType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField withholding,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField workCalendar,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField workplace,
           org.mule.module.netsuite.api.internal.SearchStringField zipCode,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.alienNumber = alienNumber;
        this.anniversary = anniversary;
        this.approvalLimit = approvalLimit;
        this.approver = approver;
        this.attention = attention;
        this.authworkDate = authworkDate;
        this.billAddress = billAddress;
        this.billingClass = billingClass;
        this.birthDate = birthDate;
        this.birthDay = birthDay;
        this.cContribution = cContribution;
        this.city = city;
        this._class = _class;
        this.comments = comments;
        this.commissionPlan = commissionPlan;
        this.concurrentWebServicesUser = concurrentWebServicesUser;
        this.country = country;
        this.county = county;
        this.dateCreated = dateCreated;
        this.deduction = deduction;
        this.department = department;
        this.earning = earning;
        this.education = education;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.employeeStatus = employeeStatus;
        this.employeeType = employeeType;
        this.employeeTypeKpi = employeeTypeKpi;
        this.entityId = entityId;
        this.ethnicity = ethnicity;
        this.expenseLimit = expenseLimit;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.firstName = firstName;
        this.gender = gender;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.hireDate = hireDate;
        this.i9Verified = i9Verified;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isJobResource = isJobResource;
        this.isTemplate = isTemplate;
        this.jobDescription = jobDescription;
        this.laborCost = laborCost;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastPaidDate = lastPaidDate;
        this.lastReviewDate = lastReviewDate;
        this.level = level;
        this.location = location;
        this.maritalStatus = maritalStatus;
        this.middleName = middleName;
        this.nextReviewDate = nextReviewDate;
        this.offlineAccess = offlineAccess;
        this.payFrequency = payFrequency;
        this.permChangeDate = permChangeDate;
        this.permission = permission;
        this.permissionChange = permissionChange;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.primaryEarningAmount = primaryEarningAmount;
        this.primaryEarningItem = primaryEarningItem;
        this.primaryEarningType = primaryEarningType;
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
        this.purchaseOrderApprover = purchaseOrderApprover;
        this.purchaseOrderLimit = purchaseOrderLimit;
        this.releaseDate = releaseDate;
        this.residentStatus = residentStatus;
        this.role = role;
        this.roleChange = roleChange;
        this.roleChangeDate = roleChangeDate;
        this.salesRep = salesRep;
        this.salesRole = salesRole;
        this.salutation = salutation;
        this.socialSecurityNumber = socialSecurityNumber;
        this.state = state;
        this.subsidiary = subsidiary;
        this.supervisor = supervisor;
        this.supportRep = supportRep;
        this.timeApprover = timeApprover;
        this.title = title;
        this.usePerquest = usePerquest;
        this.useTimeData = useTimeData;
        this.visaExpDate = visaExpDate;
        this.visaType = visaType;
        this.withholding = withholding;
        this.workCalendar = workCalendar;
        this.workplace = workplace;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the address value for this EmployeeSearchBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddress() {
        return address;
    }


    /**
     * Sets the address value for this EmployeeSearchBasic.
     * 
     * @param address
     */
    public void setAddress(org.mule.module.netsuite.api.internal.SearchStringField address) {
        this.address = address;
    }


    /**
     * Gets the addressee value for this EmployeeSearchBasic.
     * 
     * @return addressee
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this EmployeeSearchBasic.
     * 
     * @param addressee
     */
    public void setAddressee(org.mule.module.netsuite.api.internal.SearchStringField addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the addressLabel value for this EmployeeSearchBasic.
     * 
     * @return addressLabel
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this EmployeeSearchBasic.
     * 
     * @param addressLabel
     */
    public void setAddressLabel(org.mule.module.netsuite.api.internal.SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }


    /**
     * Gets the addressPhone value for this EmployeeSearchBasic.
     * 
     * @return addressPhone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this EmployeeSearchBasic.
     * 
     * @param addressPhone
     */
    public void setAddressPhone(org.mule.module.netsuite.api.internal.SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }


    /**
     * Gets the alienNumber value for this EmployeeSearchBasic.
     * 
     * @return alienNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAlienNumber() {
        return alienNumber;
    }


    /**
     * Sets the alienNumber value for this EmployeeSearchBasic.
     * 
     * @param alienNumber
     */
    public void setAlienNumber(org.mule.module.netsuite.api.internal.SearchStringField alienNumber) {
        this.alienNumber = alienNumber;
    }


    /**
     * Gets the anniversary value for this EmployeeSearchBasic.
     * 
     * @return anniversary
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getAnniversary() {
        return anniversary;
    }


    /**
     * Sets the anniversary value for this EmployeeSearchBasic.
     * 
     * @param anniversary
     */
    public void setAnniversary(org.mule.module.netsuite.api.internal.SearchDateField anniversary) {
        this.anniversary = anniversary;
    }


    /**
     * Gets the approvalLimit value for this EmployeeSearchBasic.
     * 
     * @return approvalLimit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getApprovalLimit() {
        return approvalLimit;
    }


    /**
     * Sets the approvalLimit value for this EmployeeSearchBasic.
     * 
     * @param approvalLimit
     */
    public void setApprovalLimit(org.mule.module.netsuite.api.internal.SearchDoubleField approvalLimit) {
        this.approvalLimit = approvalLimit;
    }


    /**
     * Gets the approver value for this EmployeeSearchBasic.
     * 
     * @return approver
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getApprover() {
        return approver;
    }


    /**
     * Sets the approver value for this EmployeeSearchBasic.
     * 
     * @param approver
     */
    public void setApprover(org.mule.module.netsuite.api.internal.SearchMultiSelectField approver) {
        this.approver = approver;
    }


    /**
     * Gets the attention value for this EmployeeSearchBasic.
     * 
     * @return attention
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this EmployeeSearchBasic.
     * 
     * @param attention
     */
    public void setAttention(org.mule.module.netsuite.api.internal.SearchStringField attention) {
        this.attention = attention;
    }


    /**
     * Gets the authworkDate value for this EmployeeSearchBasic.
     * 
     * @return authworkDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getAuthworkDate() {
        return authworkDate;
    }


    /**
     * Sets the authworkDate value for this EmployeeSearchBasic.
     * 
     * @param authworkDate
     */
    public void setAuthworkDate(org.mule.module.netsuite.api.internal.SearchDateField authworkDate) {
        this.authworkDate = authworkDate;
    }


    /**
     * Gets the billAddress value for this EmployeeSearchBasic.
     * 
     * @return billAddress
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this EmployeeSearchBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(org.mule.module.netsuite.api.internal.SearchStringField billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the billingClass value for this EmployeeSearchBasic.
     * 
     * @return billingClass
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBillingClass() {
        return billingClass;
    }


    /**
     * Sets the billingClass value for this EmployeeSearchBasic.
     * 
     * @param billingClass
     */
    public void setBillingClass(org.mule.module.netsuite.api.internal.SearchMultiSelectField billingClass) {
        this.billingClass = billingClass;
    }


    /**
     * Gets the birthDate value for this EmployeeSearchBasic.
     * 
     * @return birthDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this EmployeeSearchBasic.
     * 
     * @param birthDate
     */
    public void setBirthDate(org.mule.module.netsuite.api.internal.SearchDateField birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the birthDay value for this EmployeeSearchBasic.
     * 
     * @return birthDay
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getBirthDay() {
        return birthDay;
    }


    /**
     * Sets the birthDay value for this EmployeeSearchBasic.
     * 
     * @param birthDay
     */
    public void setBirthDay(org.mule.module.netsuite.api.internal.SearchDateField birthDay) {
        this.birthDay = birthDay;
    }


    /**
     * Gets the cContribution value for this EmployeeSearchBasic.
     * 
     * @return cContribution
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCContribution() {
        return cContribution;
    }


    /**
     * Sets the cContribution value for this EmployeeSearchBasic.
     * 
     * @param cContribution
     */
    public void setCContribution(org.mule.module.netsuite.api.internal.SearchMultiSelectField cContribution) {
        this.cContribution = cContribution;
    }


    /**
     * Gets the city value for this EmployeeSearchBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCity() {
        return city;
    }


    /**
     * Sets the city value for this EmployeeSearchBasic.
     * 
     * @param city
     */
    public void setCity(org.mule.module.netsuite.api.internal.SearchStringField city) {
        this.city = city;
    }


    /**
     * Gets the _class value for this EmployeeSearchBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this EmployeeSearchBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the comments value for this EmployeeSearchBasic.
     * 
     * @return comments
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EmployeeSearchBasic.
     * 
     * @param comments
     */
    public void setComments(org.mule.module.netsuite.api.internal.SearchStringField comments) {
        this.comments = comments;
    }


    /**
     * Gets the commissionPlan value for this EmployeeSearchBasic.
     * 
     * @return commissionPlan
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCommissionPlan() {
        return commissionPlan;
    }


    /**
     * Sets the commissionPlan value for this EmployeeSearchBasic.
     * 
     * @param commissionPlan
     */
    public void setCommissionPlan(org.mule.module.netsuite.api.internal.SearchMultiSelectField commissionPlan) {
        this.commissionPlan = commissionPlan;
    }


    /**
     * Gets the concurrentWebServicesUser value for this EmployeeSearchBasic.
     * 
     * @return concurrentWebServicesUser
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getConcurrentWebServicesUser() {
        return concurrentWebServicesUser;
    }


    /**
     * Sets the concurrentWebServicesUser value for this EmployeeSearchBasic.
     * 
     * @param concurrentWebServicesUser
     */
    public void setConcurrentWebServicesUser(org.mule.module.netsuite.api.internal.SearchBooleanField concurrentWebServicesUser) {
        this.concurrentWebServicesUser = concurrentWebServicesUser;
    }


    /**
     * Gets the country value for this EmployeeSearchBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCountry() {
        return country;
    }


    /**
     * Sets the country value for this EmployeeSearchBasic.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField country) {
        this.country = country;
    }


    /**
     * Gets the county value for this EmployeeSearchBasic.
     * 
     * @return county
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCounty() {
        return county;
    }


    /**
     * Sets the county value for this EmployeeSearchBasic.
     * 
     * @param county
     */
    public void setCounty(org.mule.module.netsuite.api.internal.SearchStringField county) {
        this.county = county;
    }


    /**
     * Gets the dateCreated value for this EmployeeSearchBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this EmployeeSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the deduction value for this EmployeeSearchBasic.
     * 
     * @return deduction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDeduction() {
        return deduction;
    }


    /**
     * Sets the deduction value for this EmployeeSearchBasic.
     * 
     * @param deduction
     */
    public void setDeduction(org.mule.module.netsuite.api.internal.SearchMultiSelectField deduction) {
        this.deduction = deduction;
    }


    /**
     * Gets the department value for this EmployeeSearchBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this EmployeeSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the earning value for this EmployeeSearchBasic.
     * 
     * @return earning
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEarning() {
        return earning;
    }


    /**
     * Sets the earning value for this EmployeeSearchBasic.
     * 
     * @param earning
     */
    public void setEarning(org.mule.module.netsuite.api.internal.SearchMultiSelectField earning) {
        this.earning = earning;
    }


    /**
     * Gets the education value for this EmployeeSearchBasic.
     * 
     * @return education
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEducation() {
        return education;
    }


    /**
     * Sets the education value for this EmployeeSearchBasic.
     * 
     * @param education
     */
    public void setEducation(org.mule.module.netsuite.api.internal.SearchMultiSelectField education) {
        this.education = education;
    }


    /**
     * Gets the eligibleForCommission value for this EmployeeSearchBasic.
     * 
     * @return eligibleForCommission
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this EmployeeSearchBasic.
     * 
     * @param eligibleForCommission
     */
    public void setEligibleForCommission(org.mule.module.netsuite.api.internal.SearchBooleanField eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }


    /**
     * Gets the email value for this EmployeeSearchBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EmployeeSearchBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the employeeStatus value for this EmployeeSearchBasic.
     * 
     * @return employeeStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEmployeeStatus() {
        return employeeStatus;
    }


    /**
     * Sets the employeeStatus value for this EmployeeSearchBasic.
     * 
     * @param employeeStatus
     */
    public void setEmployeeStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeStatus) {
        this.employeeStatus = employeeStatus;
    }


    /**
     * Gets the employeeType value for this EmployeeSearchBasic.
     * 
     * @return employeeType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEmployeeType() {
        return employeeType;
    }


    /**
     * Sets the employeeType value for this EmployeeSearchBasic.
     * 
     * @param employeeType
     */
    public void setEmployeeType(org.mule.module.netsuite.api.internal.SearchMultiSelectField employeeType) {
        this.employeeType = employeeType;
    }


    /**
     * Gets the employeeTypeKpi value for this EmployeeSearchBasic.
     * 
     * @return employeeTypeKpi
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getEmployeeTypeKpi() {
        return employeeTypeKpi;
    }


    /**
     * Sets the employeeTypeKpi value for this EmployeeSearchBasic.
     * 
     * @param employeeTypeKpi
     */
    public void setEmployeeTypeKpi(org.mule.module.netsuite.api.internal.SearchBooleanField employeeTypeKpi) {
        this.employeeTypeKpi = employeeTypeKpi;
    }


    /**
     * Gets the entityId value for this EmployeeSearchBasic.
     * 
     * @return entityId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this EmployeeSearchBasic.
     * 
     * @param entityId
     */
    public void setEntityId(org.mule.module.netsuite.api.internal.SearchStringField entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the ethnicity value for this EmployeeSearchBasic.
     * 
     * @return ethnicity
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEthnicity() {
        return ethnicity;
    }


    /**
     * Sets the ethnicity value for this EmployeeSearchBasic.
     * 
     * @param ethnicity
     */
    public void setEthnicity(org.mule.module.netsuite.api.internal.SearchMultiSelectField ethnicity) {
        this.ethnicity = ethnicity;
    }


    /**
     * Gets the expenseLimit value for this EmployeeSearchBasic.
     * 
     * @return expenseLimit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getExpenseLimit() {
        return expenseLimit;
    }


    /**
     * Sets the expenseLimit value for this EmployeeSearchBasic.
     * 
     * @param expenseLimit
     */
    public void setExpenseLimit(org.mule.module.netsuite.api.internal.SearchDoubleField expenseLimit) {
        this.expenseLimit = expenseLimit;
    }


    /**
     * Gets the externalId value for this EmployeeSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this EmployeeSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this EmployeeSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this EmployeeSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the fax value for this EmployeeSearchBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this EmployeeSearchBasic.
     * 
     * @param fax
     */
    public void setFax(org.mule.module.netsuite.api.internal.SearchStringField fax) {
        this.fax = fax;
    }


    /**
     * Gets the firstName value for this EmployeeSearchBasic.
     * 
     * @return firstName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this EmployeeSearchBasic.
     * 
     * @param firstName
     */
    public void setFirstName(org.mule.module.netsuite.api.internal.SearchStringField firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the gender value for this EmployeeSearchBasic.
     * 
     * @return gender
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this EmployeeSearchBasic.
     * 
     * @param gender
     */
    public void setGender(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gender) {
        this.gender = gender;
    }


    /**
     * Gets the giveAccess value for this EmployeeSearchBasic.
     * 
     * @return giveAccess
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this EmployeeSearchBasic.
     * 
     * @param giveAccess
     */
    public void setGiveAccess(org.mule.module.netsuite.api.internal.SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }


    /**
     * Gets the globalSubscriptionStatus value for this EmployeeSearchBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this EmployeeSearchBasic.
     * 
     * @param globalSubscriptionStatus
     */
    public void setGlobalSubscriptionStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }


    /**
     * Gets the group value for this EmployeeSearchBasic.
     * 
     * @return group
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getGroup() {
        return group;
    }


    /**
     * Sets the group value for this EmployeeSearchBasic.
     * 
     * @param group
     */
    public void setGroup(org.mule.module.netsuite.api.internal.SearchMultiSelectField group) {
        this.group = group;
    }


    /**
     * Gets the hireDate value for this EmployeeSearchBasic.
     * 
     * @return hireDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getHireDate() {
        return hireDate;
    }


    /**
     * Sets the hireDate value for this EmployeeSearchBasic.
     * 
     * @param hireDate
     */
    public void setHireDate(org.mule.module.netsuite.api.internal.SearchDateField hireDate) {
        this.hireDate = hireDate;
    }


    /**
     * Gets the i9Verified value for this EmployeeSearchBasic.
     * 
     * @return i9Verified
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getI9Verified() {
        return i9Verified;
    }


    /**
     * Sets the i9Verified value for this EmployeeSearchBasic.
     * 
     * @param i9Verified
     */
    public void setI9Verified(org.mule.module.netsuite.api.internal.SearchBooleanField i9Verified) {
        this.i9Verified = i9Verified;
    }


    /**
     * Gets the image value for this EmployeeSearchBasic.
     * 
     * @return image
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getImage() {
        return image;
    }


    /**
     * Sets the image value for this EmployeeSearchBasic.
     * 
     * @param image
     */
    public void setImage(org.mule.module.netsuite.api.internal.SearchStringField image) {
        this.image = image;
    }


    /**
     * Gets the internalId value for this EmployeeSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EmployeeSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this EmployeeSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this EmployeeSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isDefaultBilling value for this EmployeeSearchBasic.
     * 
     * @return isDefaultBilling
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this EmployeeSearchBasic.
     * 
     * @param isDefaultBilling
     */
    public void setIsDefaultBilling(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }


    /**
     * Gets the isDefaultShipping value for this EmployeeSearchBasic.
     * 
     * @return isDefaultShipping
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this EmployeeSearchBasic.
     * 
     * @param isDefaultShipping
     */
    public void setIsDefaultShipping(org.mule.module.netsuite.api.internal.SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }


    /**
     * Gets the isInactive value for this EmployeeSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this EmployeeSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isJobResource value for this EmployeeSearchBasic.
     * 
     * @return isJobResource
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsJobResource() {
        return isJobResource;
    }


    /**
     * Sets the isJobResource value for this EmployeeSearchBasic.
     * 
     * @param isJobResource
     */
    public void setIsJobResource(org.mule.module.netsuite.api.internal.SearchBooleanField isJobResource) {
        this.isJobResource = isJobResource;
    }


    /**
     * Gets the isTemplate value for this EmployeeSearchBasic.
     * 
     * @return isTemplate
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsTemplate() {
        return isTemplate;
    }


    /**
     * Sets the isTemplate value for this EmployeeSearchBasic.
     * 
     * @param isTemplate
     */
    public void setIsTemplate(org.mule.module.netsuite.api.internal.SearchBooleanField isTemplate) {
        this.isTemplate = isTemplate;
    }


    /**
     * Gets the jobDescription value for this EmployeeSearchBasic.
     * 
     * @return jobDescription
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getJobDescription() {
        return jobDescription;
    }


    /**
     * Sets the jobDescription value for this EmployeeSearchBasic.
     * 
     * @param jobDescription
     */
    public void setJobDescription(org.mule.module.netsuite.api.internal.SearchStringField jobDescription) {
        this.jobDescription = jobDescription;
    }


    /**
     * Gets the laborCost value for this EmployeeSearchBasic.
     * 
     * @return laborCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLaborCost() {
        return laborCost;
    }


    /**
     * Sets the laborCost value for this EmployeeSearchBasic.
     * 
     * @param laborCost
     */
    public void setLaborCost(org.mule.module.netsuite.api.internal.SearchDoubleField laborCost) {
        this.laborCost = laborCost;
    }


    /**
     * Gets the language value for this EmployeeSearchBasic.
     * 
     * @return language
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this EmployeeSearchBasic.
     * 
     * @param language
     */
    public void setLanguage(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField language) {
        this.language = language;
    }


    /**
     * Gets the lastModifiedDate value for this EmployeeSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EmployeeSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastName value for this EmployeeSearchBasic.
     * 
     * @return lastName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this EmployeeSearchBasic.
     * 
     * @param lastName
     */
    public void setLastName(org.mule.module.netsuite.api.internal.SearchStringField lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the lastPaidDate value for this EmployeeSearchBasic.
     * 
     * @return lastPaidDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastPaidDate() {
        return lastPaidDate;
    }


    /**
     * Sets the lastPaidDate value for this EmployeeSearchBasic.
     * 
     * @param lastPaidDate
     */
    public void setLastPaidDate(org.mule.module.netsuite.api.internal.SearchDateField lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }


    /**
     * Gets the lastReviewDate value for this EmployeeSearchBasic.
     * 
     * @return lastReviewDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastReviewDate() {
        return lastReviewDate;
    }


    /**
     * Sets the lastReviewDate value for this EmployeeSearchBasic.
     * 
     * @param lastReviewDate
     */
    public void setLastReviewDate(org.mule.module.netsuite.api.internal.SearchDateField lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }


    /**
     * Gets the level value for this EmployeeSearchBasic.
     * 
     * @return level
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getLevel() {
        return level;
    }


    /**
     * Sets the level value for this EmployeeSearchBasic.
     * 
     * @param level
     */
    public void setLevel(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField level) {
        this.level = level;
    }


    /**
     * Gets the location value for this EmployeeSearchBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this EmployeeSearchBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the maritalStatus value for this EmployeeSearchBasic.
     * 
     * @return maritalStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this EmployeeSearchBasic.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the middleName value for this EmployeeSearchBasic.
     * 
     * @return middleName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this EmployeeSearchBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(org.mule.module.netsuite.api.internal.SearchStringField middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the nextReviewDate value for this EmployeeSearchBasic.
     * 
     * @return nextReviewDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getNextReviewDate() {
        return nextReviewDate;
    }


    /**
     * Sets the nextReviewDate value for this EmployeeSearchBasic.
     * 
     * @param nextReviewDate
     */
    public void setNextReviewDate(org.mule.module.netsuite.api.internal.SearchDateField nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }


    /**
     * Gets the offlineAccess value for this EmployeeSearchBasic.
     * 
     * @return offlineAccess
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getOfflineAccess() {
        return offlineAccess;
    }


    /**
     * Sets the offlineAccess value for this EmployeeSearchBasic.
     * 
     * @param offlineAccess
     */
    public void setOfflineAccess(org.mule.module.netsuite.api.internal.SearchBooleanField offlineAccess) {
        this.offlineAccess = offlineAccess;
    }


    /**
     * Gets the payFrequency value for this EmployeeSearchBasic.
     * 
     * @return payFrequency
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPayFrequency() {
        return payFrequency;
    }


    /**
     * Sets the payFrequency value for this EmployeeSearchBasic.
     * 
     * @param payFrequency
     */
    public void setPayFrequency(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField payFrequency) {
        this.payFrequency = payFrequency;
    }


    /**
     * Gets the permChangeDate value for this EmployeeSearchBasic.
     * 
     * @return permChangeDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getPermChangeDate() {
        return permChangeDate;
    }


    /**
     * Sets the permChangeDate value for this EmployeeSearchBasic.
     * 
     * @param permChangeDate
     */
    public void setPermChangeDate(org.mule.module.netsuite.api.internal.SearchDateField permChangeDate) {
        this.permChangeDate = permChangeDate;
    }


    /**
     * Gets the permission value for this EmployeeSearchBasic.
     * 
     * @return permission
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this EmployeeSearchBasic.
     * 
     * @param permission
     */
    public void setPermission(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }


    /**
     * Gets the permissionChange value for this EmployeeSearchBasic.
     * 
     * @return permissionChange
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPermissionChange() {
        return permissionChange;
    }


    /**
     * Sets the permissionChange value for this EmployeeSearchBasic.
     * 
     * @param permissionChange
     */
    public void setPermissionChange(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField permissionChange) {
        this.permissionChange = permissionChange;
    }


    /**
     * Gets the phone value for this EmployeeSearchBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this EmployeeSearchBasic.
     * 
     * @param phone
     */
    public void setPhone(org.mule.module.netsuite.api.internal.SearchStringField phone) {
        this.phone = phone;
    }


    /**
     * Gets the phoneticName value for this EmployeeSearchBasic.
     * 
     * @return phoneticName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this EmployeeSearchBasic.
     * 
     * @param phoneticName
     */
    public void setPhoneticName(org.mule.module.netsuite.api.internal.SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }


    /**
     * Gets the primaryEarningAmount value for this EmployeeSearchBasic.
     * 
     * @return primaryEarningAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getPrimaryEarningAmount() {
        return primaryEarningAmount;
    }


    /**
     * Sets the primaryEarningAmount value for this EmployeeSearchBasic.
     * 
     * @param primaryEarningAmount
     */
    public void setPrimaryEarningAmount(org.mule.module.netsuite.api.internal.SearchDoubleField primaryEarningAmount) {
        this.primaryEarningAmount = primaryEarningAmount;
    }


    /**
     * Gets the primaryEarningItem value for this EmployeeSearchBasic.
     * 
     * @return primaryEarningItem
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPrimaryEarningItem() {
        return primaryEarningItem;
    }


    /**
     * Sets the primaryEarningItem value for this EmployeeSearchBasic.
     * 
     * @param primaryEarningItem
     */
    public void setPrimaryEarningItem(org.mule.module.netsuite.api.internal.SearchStringField primaryEarningItem) {
        this.primaryEarningItem = primaryEarningItem;
    }


    /**
     * Gets the primaryEarningType value for this EmployeeSearchBasic.
     * 
     * @return primaryEarningType
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPrimaryEarningType() {
        return primaryEarningType;
    }


    /**
     * Sets the primaryEarningType value for this EmployeeSearchBasic.
     * 
     * @param primaryEarningType
     */
    public void setPrimaryEarningType(org.mule.module.netsuite.api.internal.SearchStringField primaryEarningType) {
        this.primaryEarningType = primaryEarningType;
    }


    /**
     * Gets the purchaseOrderApprovalLimit value for this EmployeeSearchBasic.
     * 
     * @return purchaseOrderApprovalLimit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getPurchaseOrderApprovalLimit() {
        return purchaseOrderApprovalLimit;
    }


    /**
     * Sets the purchaseOrderApprovalLimit value for this EmployeeSearchBasic.
     * 
     * @param purchaseOrderApprovalLimit
     */
    public void setPurchaseOrderApprovalLimit(org.mule.module.netsuite.api.internal.SearchDoubleField purchaseOrderApprovalLimit) {
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
    }


    /**
     * Gets the purchaseOrderApprover value for this EmployeeSearchBasic.
     * 
     * @return purchaseOrderApprover
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPurchaseOrderApprover() {
        return purchaseOrderApprover;
    }


    /**
     * Sets the purchaseOrderApprover value for this EmployeeSearchBasic.
     * 
     * @param purchaseOrderApprover
     */
    public void setPurchaseOrderApprover(org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseOrderApprover) {
        this.purchaseOrderApprover = purchaseOrderApprover;
    }


    /**
     * Gets the purchaseOrderLimit value for this EmployeeSearchBasic.
     * 
     * @return purchaseOrderLimit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getPurchaseOrderLimit() {
        return purchaseOrderLimit;
    }


    /**
     * Sets the purchaseOrderLimit value for this EmployeeSearchBasic.
     * 
     * @param purchaseOrderLimit
     */
    public void setPurchaseOrderLimit(org.mule.module.netsuite.api.internal.SearchDoubleField purchaseOrderLimit) {
        this.purchaseOrderLimit = purchaseOrderLimit;
    }


    /**
     * Gets the releaseDate value for this EmployeeSearchBasic.
     * 
     * @return releaseDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this EmployeeSearchBasic.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(org.mule.module.netsuite.api.internal.SearchDateField releaseDate) {
        this.releaseDate = releaseDate;
    }


    /**
     * Gets the residentStatus value for this EmployeeSearchBasic.
     * 
     * @return residentStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getResidentStatus() {
        return residentStatus;
    }


    /**
     * Sets the residentStatus value for this EmployeeSearchBasic.
     * 
     * @param residentStatus
     */
    public void setResidentStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField residentStatus) {
        this.residentStatus = residentStatus;
    }


    /**
     * Gets the role value for this EmployeeSearchBasic.
     * 
     * @return role
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getRole() {
        return role;
    }


    /**
     * Sets the role value for this EmployeeSearchBasic.
     * 
     * @param role
     */
    public void setRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField role) {
        this.role = role;
    }


    /**
     * Gets the roleChange value for this EmployeeSearchBasic.
     * 
     * @return roleChange
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getRoleChange() {
        return roleChange;
    }


    /**
     * Sets the roleChange value for this EmployeeSearchBasic.
     * 
     * @param roleChange
     */
    public void setRoleChange(org.mule.module.netsuite.api.internal.SearchMultiSelectField roleChange) {
        this.roleChange = roleChange;
    }


    /**
     * Gets the roleChangeDate value for this EmployeeSearchBasic.
     * 
     * @return roleChangeDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getRoleChangeDate() {
        return roleChangeDate;
    }


    /**
     * Sets the roleChangeDate value for this EmployeeSearchBasic.
     * 
     * @param roleChangeDate
     */
    public void setRoleChangeDate(org.mule.module.netsuite.api.internal.SearchDateField roleChangeDate) {
        this.roleChangeDate = roleChangeDate;
    }


    /**
     * Gets the salesRep value for this EmployeeSearchBasic.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this EmployeeSearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(org.mule.module.netsuite.api.internal.SearchBooleanField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesRole value for this EmployeeSearchBasic.
     * 
     * @return salesRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesRole() {
        return salesRole;
    }


    /**
     * Sets the salesRole value for this EmployeeSearchBasic.
     * 
     * @param salesRole
     */
    public void setSalesRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRole) {
        this.salesRole = salesRole;
    }


    /**
     * Gets the salutation value for this EmployeeSearchBasic.
     * 
     * @return salutation
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this EmployeeSearchBasic.
     * 
     * @param salutation
     */
    public void setSalutation(org.mule.module.netsuite.api.internal.SearchStringField salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the socialSecurityNumber value for this EmployeeSearchBasic.
     * 
     * @return socialSecurityNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this EmployeeSearchBasic.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(org.mule.module.netsuite.api.internal.SearchStringField socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


    /**
     * Gets the state value for this EmployeeSearchBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getState() {
        return state;
    }


    /**
     * Sets the state value for this EmployeeSearchBasic.
     * 
     * @param state
     */
    public void setState(org.mule.module.netsuite.api.internal.SearchStringField state) {
        this.state = state;
    }


    /**
     * Gets the subsidiary value for this EmployeeSearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EmployeeSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the supervisor value for this EmployeeSearchBasic.
     * 
     * @return supervisor
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this EmployeeSearchBasic.
     * 
     * @param supervisor
     */
    public void setSupervisor(org.mule.module.netsuite.api.internal.SearchMultiSelectField supervisor) {
        this.supervisor = supervisor;
    }


    /**
     * Gets the supportRep value for this EmployeeSearchBasic.
     * 
     * @return supportRep
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getSupportRep() {
        return supportRep;
    }


    /**
     * Sets the supportRep value for this EmployeeSearchBasic.
     * 
     * @param supportRep
     */
    public void setSupportRep(org.mule.module.netsuite.api.internal.SearchBooleanField supportRep) {
        this.supportRep = supportRep;
    }


    /**
     * Gets the timeApprover value for this EmployeeSearchBasic.
     * 
     * @return timeApprover
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTimeApprover() {
        return timeApprover;
    }


    /**
     * Sets the timeApprover value for this EmployeeSearchBasic.
     * 
     * @param timeApprover
     */
    public void setTimeApprover(org.mule.module.netsuite.api.internal.SearchMultiSelectField timeApprover) {
        this.timeApprover = timeApprover;
    }


    /**
     * Gets the title value for this EmployeeSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this EmployeeSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the usePerquest value for this EmployeeSearchBasic.
     * 
     * @return usePerquest
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getUsePerquest() {
        return usePerquest;
    }


    /**
     * Sets the usePerquest value for this EmployeeSearchBasic.
     * 
     * @param usePerquest
     */
    public void setUsePerquest(org.mule.module.netsuite.api.internal.SearchBooleanField usePerquest) {
        this.usePerquest = usePerquest;
    }


    /**
     * Gets the useTimeData value for this EmployeeSearchBasic.
     * 
     * @return useTimeData
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getUseTimeData() {
        return useTimeData;
    }


    /**
     * Sets the useTimeData value for this EmployeeSearchBasic.
     * 
     * @param useTimeData
     */
    public void setUseTimeData(org.mule.module.netsuite.api.internal.SearchBooleanField useTimeData) {
        this.useTimeData = useTimeData;
    }


    /**
     * Gets the visaExpDate value for this EmployeeSearchBasic.
     * 
     * @return visaExpDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getVisaExpDate() {
        return visaExpDate;
    }


    /**
     * Sets the visaExpDate value for this EmployeeSearchBasic.
     * 
     * @param visaExpDate
     */
    public void setVisaExpDate(org.mule.module.netsuite.api.internal.SearchDateField visaExpDate) {
        this.visaExpDate = visaExpDate;
    }


    /**
     * Gets the visaType value for this EmployeeSearchBasic.
     * 
     * @return visaType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getVisaType() {
        return visaType;
    }


    /**
     * Sets the visaType value for this EmployeeSearchBasic.
     * 
     * @param visaType
     */
    public void setVisaType(org.mule.module.netsuite.api.internal.SearchMultiSelectField visaType) {
        this.visaType = visaType;
    }


    /**
     * Gets the withholding value for this EmployeeSearchBasic.
     * 
     * @return withholding
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getWithholding() {
        return withholding;
    }


    /**
     * Sets the withholding value for this EmployeeSearchBasic.
     * 
     * @param withholding
     */
    public void setWithholding(org.mule.module.netsuite.api.internal.SearchMultiSelectField withholding) {
        this.withholding = withholding;
    }


    /**
     * Gets the workCalendar value for this EmployeeSearchBasic.
     * 
     * @return workCalendar
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this EmployeeSearchBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(org.mule.module.netsuite.api.internal.SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }


    /**
     * Gets the workplace value for this EmployeeSearchBasic.
     * 
     * @return workplace
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getWorkplace() {
        return workplace;
    }


    /**
     * Sets the workplace value for this EmployeeSearchBasic.
     * 
     * @param workplace
     */
    public void setWorkplace(org.mule.module.netsuite.api.internal.SearchMultiSelectField workplace) {
        this.workplace = workplace;
    }


    /**
     * Gets the zipCode value for this EmployeeSearchBasic.
     * 
     * @return zipCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this EmployeeSearchBasic.
     * 
     * @param zipCode
     */
    public void setZipCode(org.mule.module.netsuite.api.internal.SearchStringField zipCode) {
        this.zipCode = zipCode;
    }


    /**
     * Gets the customFieldList value for this EmployeeSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this EmployeeSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeSearchBasic)) return false;
        EmployeeSearchBasic other = (EmployeeSearchBasic) obj;
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
            ((this.alienNumber==null && other.getAlienNumber()==null) || 
             (this.alienNumber!=null &&
              this.alienNumber.equals(other.getAlienNumber()))) &&
            ((this.anniversary==null && other.getAnniversary()==null) || 
             (this.anniversary!=null &&
              this.anniversary.equals(other.getAnniversary()))) &&
            ((this.approvalLimit==null && other.getApprovalLimit()==null) || 
             (this.approvalLimit!=null &&
              this.approvalLimit.equals(other.getApprovalLimit()))) &&
            ((this.approver==null && other.getApprover()==null) || 
             (this.approver!=null &&
              this.approver.equals(other.getApprover()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.authworkDate==null && other.getAuthworkDate()==null) || 
             (this.authworkDate!=null &&
              this.authworkDate.equals(other.getAuthworkDate()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.billingClass==null && other.getBillingClass()==null) || 
             (this.billingClass!=null &&
              this.billingClass.equals(other.getBillingClass()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.birthDay==null && other.getBirthDay()==null) || 
             (this.birthDay!=null &&
              this.birthDay.equals(other.getBirthDay()))) &&
            ((this.cContribution==null && other.getCContribution()==null) || 
             (this.cContribution!=null &&
              this.cContribution.equals(other.getCContribution()))) &&
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
            ((this.concurrentWebServicesUser==null && other.getConcurrentWebServicesUser()==null) || 
             (this.concurrentWebServicesUser!=null &&
              this.concurrentWebServicesUser.equals(other.getConcurrentWebServicesUser()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.county==null && other.getCounty()==null) || 
             (this.county!=null &&
              this.county.equals(other.getCounty()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.deduction==null && other.getDeduction()==null) || 
             (this.deduction!=null &&
              this.deduction.equals(other.getDeduction()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.earning==null && other.getEarning()==null) || 
             (this.earning!=null &&
              this.earning.equals(other.getEarning()))) &&
            ((this.education==null && other.getEducation()==null) || 
             (this.education!=null &&
              this.education.equals(other.getEducation()))) &&
            ((this.eligibleForCommission==null && other.getEligibleForCommission()==null) || 
             (this.eligibleForCommission!=null &&
              this.eligibleForCommission.equals(other.getEligibleForCommission()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.employeeStatus==null && other.getEmployeeStatus()==null) || 
             (this.employeeStatus!=null &&
              this.employeeStatus.equals(other.getEmployeeStatus()))) &&
            ((this.employeeType==null && other.getEmployeeType()==null) || 
             (this.employeeType!=null &&
              this.employeeType.equals(other.getEmployeeType()))) &&
            ((this.employeeTypeKpi==null && other.getEmployeeTypeKpi()==null) || 
             (this.employeeTypeKpi!=null &&
              this.employeeTypeKpi.equals(other.getEmployeeTypeKpi()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              this.entityId.equals(other.getEntityId()))) &&
            ((this.ethnicity==null && other.getEthnicity()==null) || 
             (this.ethnicity!=null &&
              this.ethnicity.equals(other.getEthnicity()))) &&
            ((this.expenseLimit==null && other.getExpenseLimit()==null) || 
             (this.expenseLimit!=null &&
              this.expenseLimit.equals(other.getExpenseLimit()))) &&
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
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              this.giveAccess.equals(other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.hireDate==null && other.getHireDate()==null) || 
             (this.hireDate!=null &&
              this.hireDate.equals(other.getHireDate()))) &&
            ((this.i9Verified==null && other.getI9Verified()==null) || 
             (this.i9Verified!=null &&
              this.i9Verified.equals(other.getI9Verified()))) &&
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
            ((this.isJobResource==null && other.getIsJobResource()==null) || 
             (this.isJobResource!=null &&
              this.isJobResource.equals(other.getIsJobResource()))) &&
            ((this.isTemplate==null && other.getIsTemplate()==null) || 
             (this.isTemplate!=null &&
              this.isTemplate.equals(other.getIsTemplate()))) &&
            ((this.jobDescription==null && other.getJobDescription()==null) || 
             (this.jobDescription!=null &&
              this.jobDescription.equals(other.getJobDescription()))) &&
            ((this.laborCost==null && other.getLaborCost()==null) || 
             (this.laborCost!=null &&
              this.laborCost.equals(other.getLaborCost()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              this.language.equals(other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.lastPaidDate==null && other.getLastPaidDate()==null) || 
             (this.lastPaidDate!=null &&
              this.lastPaidDate.equals(other.getLastPaidDate()))) &&
            ((this.lastReviewDate==null && other.getLastReviewDate()==null) || 
             (this.lastReviewDate!=null &&
              this.lastReviewDate.equals(other.getLastReviewDate()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              this.level.equals(other.getLevel()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.nextReviewDate==null && other.getNextReviewDate()==null) || 
             (this.nextReviewDate!=null &&
              this.nextReviewDate.equals(other.getNextReviewDate()))) &&
            ((this.offlineAccess==null && other.getOfflineAccess()==null) || 
             (this.offlineAccess!=null &&
              this.offlineAccess.equals(other.getOfflineAccess()))) &&
            ((this.payFrequency==null && other.getPayFrequency()==null) || 
             (this.payFrequency!=null &&
              this.payFrequency.equals(other.getPayFrequency()))) &&
            ((this.permChangeDate==null && other.getPermChangeDate()==null) || 
             (this.permChangeDate!=null &&
              this.permChangeDate.equals(other.getPermChangeDate()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              this.permission.equals(other.getPermission()))) &&
            ((this.permissionChange==null && other.getPermissionChange()==null) || 
             (this.permissionChange!=null &&
              this.permissionChange.equals(other.getPermissionChange()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              this.phoneticName.equals(other.getPhoneticName()))) &&
            ((this.primaryEarningAmount==null && other.getPrimaryEarningAmount()==null) || 
             (this.primaryEarningAmount!=null &&
              this.primaryEarningAmount.equals(other.getPrimaryEarningAmount()))) &&
            ((this.primaryEarningItem==null && other.getPrimaryEarningItem()==null) || 
             (this.primaryEarningItem!=null &&
              this.primaryEarningItem.equals(other.getPrimaryEarningItem()))) &&
            ((this.primaryEarningType==null && other.getPrimaryEarningType()==null) || 
             (this.primaryEarningType!=null &&
              this.primaryEarningType.equals(other.getPrimaryEarningType()))) &&
            ((this.purchaseOrderApprovalLimit==null && other.getPurchaseOrderApprovalLimit()==null) || 
             (this.purchaseOrderApprovalLimit!=null &&
              this.purchaseOrderApprovalLimit.equals(other.getPurchaseOrderApprovalLimit()))) &&
            ((this.purchaseOrderApprover==null && other.getPurchaseOrderApprover()==null) || 
             (this.purchaseOrderApprover!=null &&
              this.purchaseOrderApprover.equals(other.getPurchaseOrderApprover()))) &&
            ((this.purchaseOrderLimit==null && other.getPurchaseOrderLimit()==null) || 
             (this.purchaseOrderLimit!=null &&
              this.purchaseOrderLimit.equals(other.getPurchaseOrderLimit()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              this.releaseDate.equals(other.getReleaseDate()))) &&
            ((this.residentStatus==null && other.getResidentStatus()==null) || 
             (this.residentStatus!=null &&
              this.residentStatus.equals(other.getResidentStatus()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.roleChange==null && other.getRoleChange()==null) || 
             (this.roleChange!=null &&
              this.roleChange.equals(other.getRoleChange()))) &&
            ((this.roleChangeDate==null && other.getRoleChangeDate()==null) || 
             (this.roleChangeDate!=null &&
              this.roleChangeDate.equals(other.getRoleChangeDate()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesRole==null && other.getSalesRole()==null) || 
             (this.salesRole!=null &&
              this.salesRole.equals(other.getSalesRole()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              this.socialSecurityNumber.equals(other.getSocialSecurityNumber()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              this.supervisor.equals(other.getSupervisor()))) &&
            ((this.supportRep==null && other.getSupportRep()==null) || 
             (this.supportRep!=null &&
              this.supportRep.equals(other.getSupportRep()))) &&
            ((this.timeApprover==null && other.getTimeApprover()==null) || 
             (this.timeApprover!=null &&
              this.timeApprover.equals(other.getTimeApprover()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.usePerquest==null && other.getUsePerquest()==null) || 
             (this.usePerquest!=null &&
              this.usePerquest.equals(other.getUsePerquest()))) &&
            ((this.useTimeData==null && other.getUseTimeData()==null) || 
             (this.useTimeData!=null &&
              this.useTimeData.equals(other.getUseTimeData()))) &&
            ((this.visaExpDate==null && other.getVisaExpDate()==null) || 
             (this.visaExpDate!=null &&
              this.visaExpDate.equals(other.getVisaExpDate()))) &&
            ((this.visaType==null && other.getVisaType()==null) || 
             (this.visaType!=null &&
              this.visaType.equals(other.getVisaType()))) &&
            ((this.withholding==null && other.getWithholding()==null) || 
             (this.withholding!=null &&
              this.withholding.equals(other.getWithholding()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              this.workCalendar.equals(other.getWorkCalendar()))) &&
            ((this.workplace==null && other.getWorkplace()==null) || 
             (this.workplace!=null &&
              this.workplace.equals(other.getWorkplace()))) &&
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
        if (getAlienNumber() != null) {
            _hashCode += getAlienNumber().hashCode();
        }
        if (getAnniversary() != null) {
            _hashCode += getAnniversary().hashCode();
        }
        if (getApprovalLimit() != null) {
            _hashCode += getApprovalLimit().hashCode();
        }
        if (getApprover() != null) {
            _hashCode += getApprover().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getAuthworkDate() != null) {
            _hashCode += getAuthworkDate().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getBillingClass() != null) {
            _hashCode += getBillingClass().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getBirthDay() != null) {
            _hashCode += getBirthDay().hashCode();
        }
        if (getCContribution() != null) {
            _hashCode += getCContribution().hashCode();
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
        if (getConcurrentWebServicesUser() != null) {
            _hashCode += getConcurrentWebServicesUser().hashCode();
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
        if (getDeduction() != null) {
            _hashCode += getDeduction().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getEarning() != null) {
            _hashCode += getEarning().hashCode();
        }
        if (getEducation() != null) {
            _hashCode += getEducation().hashCode();
        }
        if (getEligibleForCommission() != null) {
            _hashCode += getEligibleForCommission().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmployeeStatus() != null) {
            _hashCode += getEmployeeStatus().hashCode();
        }
        if (getEmployeeType() != null) {
            _hashCode += getEmployeeType().hashCode();
        }
        if (getEmployeeTypeKpi() != null) {
            _hashCode += getEmployeeTypeKpi().hashCode();
        }
        if (getEntityId() != null) {
            _hashCode += getEntityId().hashCode();
        }
        if (getEthnicity() != null) {
            _hashCode += getEthnicity().hashCode();
        }
        if (getExpenseLimit() != null) {
            _hashCode += getExpenseLimit().hashCode();
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
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
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
        if (getHireDate() != null) {
            _hashCode += getHireDate().hashCode();
        }
        if (getI9Verified() != null) {
            _hashCode += getI9Verified().hashCode();
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
        if (getIsJobResource() != null) {
            _hashCode += getIsJobResource().hashCode();
        }
        if (getIsTemplate() != null) {
            _hashCode += getIsTemplate().hashCode();
        }
        if (getJobDescription() != null) {
            _hashCode += getJobDescription().hashCode();
        }
        if (getLaborCost() != null) {
            _hashCode += getLaborCost().hashCode();
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
        if (getLastPaidDate() != null) {
            _hashCode += getLastPaidDate().hashCode();
        }
        if (getLastReviewDate() != null) {
            _hashCode += getLastReviewDate().hashCode();
        }
        if (getLevel() != null) {
            _hashCode += getLevel().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getNextReviewDate() != null) {
            _hashCode += getNextReviewDate().hashCode();
        }
        if (getOfflineAccess() != null) {
            _hashCode += getOfflineAccess().hashCode();
        }
        if (getPayFrequency() != null) {
            _hashCode += getPayFrequency().hashCode();
        }
        if (getPermChangeDate() != null) {
            _hashCode += getPermChangeDate().hashCode();
        }
        if (getPermission() != null) {
            _hashCode += getPermission().hashCode();
        }
        if (getPermissionChange() != null) {
            _hashCode += getPermissionChange().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getPhoneticName() != null) {
            _hashCode += getPhoneticName().hashCode();
        }
        if (getPrimaryEarningAmount() != null) {
            _hashCode += getPrimaryEarningAmount().hashCode();
        }
        if (getPrimaryEarningItem() != null) {
            _hashCode += getPrimaryEarningItem().hashCode();
        }
        if (getPrimaryEarningType() != null) {
            _hashCode += getPrimaryEarningType().hashCode();
        }
        if (getPurchaseOrderApprovalLimit() != null) {
            _hashCode += getPurchaseOrderApprovalLimit().hashCode();
        }
        if (getPurchaseOrderApprover() != null) {
            _hashCode += getPurchaseOrderApprover().hashCode();
        }
        if (getPurchaseOrderLimit() != null) {
            _hashCode += getPurchaseOrderLimit().hashCode();
        }
        if (getReleaseDate() != null) {
            _hashCode += getReleaseDate().hashCode();
        }
        if (getResidentStatus() != null) {
            _hashCode += getResidentStatus().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getRoleChange() != null) {
            _hashCode += getRoleChange().hashCode();
        }
        if (getRoleChangeDate() != null) {
            _hashCode += getRoleChangeDate().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getSalesRole() != null) {
            _hashCode += getSalesRole().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getSocialSecurityNumber() != null) {
            _hashCode += getSocialSecurityNumber().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getSupervisor() != null) {
            _hashCode += getSupervisor().hashCode();
        }
        if (getSupportRep() != null) {
            _hashCode += getSupportRep().hashCode();
        }
        if (getTimeApprover() != null) {
            _hashCode += getTimeApprover().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUsePerquest() != null) {
            _hashCode += getUsePerquest().hashCode();
        }
        if (getUseTimeData() != null) {
            _hashCode += getUseTimeData().hashCode();
        }
        if (getVisaExpDate() != null) {
            _hashCode += getVisaExpDate().hashCode();
        }
        if (getVisaType() != null) {
            _hashCode += getVisaType().hashCode();
        }
        if (getWithholding() != null) {
            _hashCode += getWithholding().hashCode();
        }
        if (getWorkCalendar() != null) {
            _hashCode += getWorkCalendar().hashCode();
        }
        if (getWorkplace() != null) {
            _hashCode += getWorkplace().hashCode();
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
        new org.apache.axis.description.TypeDesc(EmployeeSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
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
        elemField.setFieldName("alienNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "alienNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anniversary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "anniversary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "approvalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("authworkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "authworkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "birthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cContribution"));
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
        elemField.setFieldName("concurrentWebServicesUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "concurrentWebServicesUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("deduction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deduction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("earning");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "earning"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("education");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "education"));
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
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employeeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employeeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeTypeKpi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employeeTypeKpi"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ethnicity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expenseLimit"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "hireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("i9Verified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "I9Verified"));
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
        elemField.setFieldName("isJobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isJobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("lastPaidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastPaidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastReviewDate"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "maritalStatus"));
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
        elemField.setFieldName("nextReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nextReviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "offlineAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "permChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("permissionChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "permissionChange"));
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
        elemField.setFieldName("primaryEarningAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryEarningAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarningItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryEarningItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarningType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryEarningType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprovalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrderApprovalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrderApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrderLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "residentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "roleChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "roleChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesRole"));
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
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "socialSecurityNumber"));
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
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "supportRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "timeApprover"));
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
        elemField.setFieldName("usePerquest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "usePerquest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTimeData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "useTimeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "visaExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "visaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withholding");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "withholding"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "workplace"));
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
