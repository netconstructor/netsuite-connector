/**
 * EmployeeSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeeSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressInternalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressLabel;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] alienNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altEmail;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] approvalLimit;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] approver;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] attention;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] authWorkDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress3;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingClass;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZipCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] birthDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] birthDay;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] city;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] comments;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] concurrentWebServicesUser;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] countryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] eligibleForCommission;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] email;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] entityId;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] entityNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] ethnicity;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] expenseLimit;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] firstName;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gender;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] giveAccess;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] globalSubscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] hireDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] homePhone;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] i9Verified;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] image;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultBilling;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultShipping;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobResource;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSalesRep;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSupportRep;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTemplate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] laborCost;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] language;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] lastName;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastPaidDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastReviewDate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] level;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] maritalStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] middleName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] mobilePhone;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] nextReviewDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] offlineAccess;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] payFrequency;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] permChangeDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] permChangeLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permission;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permissionChange;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] phoneticName;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] primaryEarningAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryEarningItem;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryEarningType;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] purchaseOrderApprovalLimit;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseOrderApprover;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] purchaseOrderLimit;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] releaseDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] residentStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] role;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] roleChange;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] roleChangeAction;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] roleChangeDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRole;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] salutation;

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

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] socialSecurityNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] state;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subscription;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] subscriptionDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] subscriptionStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] supervisor;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] timeApprover;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] usePerquest;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useTimeData;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] visaExpDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] visaType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] workCalendar;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] workplace;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] zipCode;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public EmployeeSearchRowBasic() {
    }

    public EmployeeSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountNumber,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] address3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressee,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressInternalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressLabel,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] addressPhone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] alienNumber,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altEmail,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altPhone,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] approvalLimit,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] approver,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] attention,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] authWorkDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress3,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingClass,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZipCode,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] birthDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] birthDay,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] city,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] comments,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] concurrentWebServicesUser,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] country,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] countryCode,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] eligibleForCommission,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] email,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeStatus,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] entityId,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] entityNumber,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] ethnicity,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] expenseLimit,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] fax,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] firstName,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gender,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] giveAccess,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] globalSubscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] hireDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] homePhone,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] i9Verified,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] image,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultBilling,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDefaultShipping,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobResource,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSalesRep,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSupportRep,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTemplate,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] laborCost,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] language,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] lastName,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastPaidDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastReviewDate,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] level,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] maritalStatus,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] middleName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] mobilePhone,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] nextReviewDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] offlineAccess,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] payFrequency,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] permChangeDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] permChangeLevel,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permission,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permissionChange,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] phone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] phoneticName,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] primaryEarningAmount,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryEarningItem,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryEarningType,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] purchaseOrderApprovalLimit,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseOrderApprover,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] purchaseOrderLimit,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] releaseDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] residentStatus,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] role,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] roleChange,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] roleChangeAction,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] roleChangeDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRole,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] salutation,
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
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] socialSecurityNumber,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] state,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subscription,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] subscriptionDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] subscriptionStatus,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] supervisor,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] timeApprover,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] usePerquest,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useTimeData,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] visaExpDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] visaType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] workCalendar,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] workplace,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] zipCode,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.accountNumber = accountNumber;
           this.address = address;
           this.address1 = address1;
           this.address2 = address2;
           this.address3 = address3;
           this.addressee = addressee;
           this.addressInternalId = addressInternalId;
           this.addressLabel = addressLabel;
           this.addressPhone = addressPhone;
           this.alienNumber = alienNumber;
           this.altEmail = altEmail;
           this.altName = altName;
           this.altPhone = altPhone;
           this.approvalLimit = approvalLimit;
           this.approver = approver;
           this.attention = attention;
           this.authWorkDate = authWorkDate;
           this.billAddress = billAddress;
           this.billAddress1 = billAddress1;
           this.billAddress2 = billAddress2;
           this.billAddress3 = billAddress3;
           this.billAddressee = billAddressee;
           this.billAttention = billAttention;
           this.billCity = billCity;
           this.billCountry = billCountry;
           this.billCountryCode = billCountryCode;
           this.billingClass = billingClass;
           this.billPhone = billPhone;
           this.billState = billState;
           this.billZipCode = billZipCode;
           this.birthDate = birthDate;
           this.birthDay = birthDay;
           this.city = city;
           this._class = _class;
           this.comments = comments;
           this.concurrentWebServicesUser = concurrentWebServicesUser;
           this.country = country;
           this.countryCode = countryCode;
           this.dateCreated = dateCreated;
           this.department = department;
           this.eligibleForCommission = eligibleForCommission;
           this.email = email;
           this.employeeStatus = employeeStatus;
           this.employeeType = employeeType;
           this.entityId = entityId;
           this.entityNumber = entityNumber;
           this.ethnicity = ethnicity;
           this.expenseLimit = expenseLimit;
           this.externalId = externalId;
           this.fax = fax;
           this.firstName = firstName;
           this.gender = gender;
           this.giveAccess = giveAccess;
           this.globalSubscriptionStatus = globalSubscriptionStatus;
           this.hireDate = hireDate;
           this.homePhone = homePhone;
           this.i9Verified = i9Verified;
           this.image = image;
           this.internalId = internalId;
           this.isDefaultBilling = isDefaultBilling;
           this.isDefaultShipping = isDefaultShipping;
           this.isInactive = isInactive;
           this.isJobResource = isJobResource;
           this.isSalesRep = isSalesRep;
           this.isSupportRep = isSupportRep;
           this.isTemplate = isTemplate;
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
           this.mobilePhone = mobilePhone;
           this.nextReviewDate = nextReviewDate;
           this.offlineAccess = offlineAccess;
           this.payFrequency = payFrequency;
           this.permChangeDate = permChangeDate;
           this.permChangeLevel = permChangeLevel;
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
           this.roleChangeAction = roleChangeAction;
           this.roleChangeDate = roleChangeDate;
           this.salesRole = salesRole;
           this.salutation = salutation;
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
           this.socialSecurityNumber = socialSecurityNumber;
           this.state = state;
           this.subscription = subscription;
           this.subscriptionDate = subscriptionDate;
           this.subscriptionStatus = subscriptionStatus;
           this.subsidiary = subsidiary;
           this.supervisor = supervisor;
           this.timeApprover = timeApprover;
           this.title = title;
           this.usePerquest = usePerquest;
           this.useTimeData = useTimeData;
           this.visaExpDate = visaExpDate;
           this.visaType = visaType;
           this.workCalendar = workCalendar;
           this.workplace = workplace;
           this.zipCode = zipCode;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this EmployeeSearchRowBasic.
     * 
     * @return accountNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this EmployeeSearchRowBasic.
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
     * Gets the address value for this EmployeeSearchRowBasic.
     * 
     * @return address
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress() {
        return address;
    }


    /**
     * Sets the address value for this EmployeeSearchRowBasic.
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
     * Gets the address1 value for this EmployeeSearchRowBasic.
     * 
     * @return address1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress1() {
        return address1;
    }


    /**
     * Sets the address1 value for this EmployeeSearchRowBasic.
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
     * Gets the address2 value for this EmployeeSearchRowBasic.
     * 
     * @return address2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress2() {
        return address2;
    }


    /**
     * Sets the address2 value for this EmployeeSearchRowBasic.
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
     * Gets the address3 value for this EmployeeSearchRowBasic.
     * 
     * @return address3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddress3() {
        return address3;
    }


    /**
     * Sets the address3 value for this EmployeeSearchRowBasic.
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
     * Gets the addressee value for this EmployeeSearchRowBasic.
     * 
     * @return addressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this EmployeeSearchRowBasic.
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
     * Gets the addressInternalId value for this EmployeeSearchRowBasic.
     * 
     * @return addressInternalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressInternalId() {
        return addressInternalId;
    }


    /**
     * Sets the addressInternalId value for this EmployeeSearchRowBasic.
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
     * Gets the addressLabel value for this EmployeeSearchRowBasic.
     * 
     * @return addressLabel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressLabel() {
        return addressLabel;
    }


    /**
     * Sets the addressLabel value for this EmployeeSearchRowBasic.
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
     * Gets the addressPhone value for this EmployeeSearchRowBasic.
     * 
     * @return addressPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAddressPhone() {
        return addressPhone;
    }


    /**
     * Sets the addressPhone value for this EmployeeSearchRowBasic.
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
     * Gets the alienNumber value for this EmployeeSearchRowBasic.
     * 
     * @return alienNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAlienNumber() {
        return alienNumber;
    }


    /**
     * Sets the alienNumber value for this EmployeeSearchRowBasic.
     * 
     * @param alienNumber
     */
    public void setAlienNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] alienNumber) {
        this.alienNumber = alienNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAlienNumber(int i) {
        return this.alienNumber[i];
    }

    public void setAlienNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.alienNumber[i] = _value;
    }


    /**
     * Gets the altEmail value for this EmployeeSearchRowBasic.
     * 
     * @return altEmail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltEmail() {
        return altEmail;
    }


    /**
     * Sets the altEmail value for this EmployeeSearchRowBasic.
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
     * Gets the altName value for this EmployeeSearchRowBasic.
     * 
     * @return altName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltName() {
        return altName;
    }


    /**
     * Sets the altName value for this EmployeeSearchRowBasic.
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
     * Gets the altPhone value for this EmployeeSearchRowBasic.
     * 
     * @return altPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltPhone() {
        return altPhone;
    }


    /**
     * Sets the altPhone value for this EmployeeSearchRowBasic.
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
     * Gets the approvalLimit value for this EmployeeSearchRowBasic.
     * 
     * @return approvalLimit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getApprovalLimit() {
        return approvalLimit;
    }


    /**
     * Sets the approvalLimit value for this EmployeeSearchRowBasic.
     * 
     * @param approvalLimit
     */
    public void setApprovalLimit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getApprovalLimit(int i) {
        return this.approvalLimit[i];
    }

    public void setApprovalLimit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.approvalLimit[i] = _value;
    }


    /**
     * Gets the approver value for this EmployeeSearchRowBasic.
     * 
     * @return approver
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getApprover() {
        return approver;
    }


    /**
     * Sets the approver value for this EmployeeSearchRowBasic.
     * 
     * @param approver
     */
    public void setApprover(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] approver) {
        this.approver = approver;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getApprover(int i) {
        return this.approver[i];
    }

    public void setApprover(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.approver[i] = _value;
    }


    /**
     * Gets the attention value for this EmployeeSearchRowBasic.
     * 
     * @return attention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this EmployeeSearchRowBasic.
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
     * Gets the authWorkDate value for this EmployeeSearchRowBasic.
     * 
     * @return authWorkDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getAuthWorkDate() {
        return authWorkDate;
    }


    /**
     * Sets the authWorkDate value for this EmployeeSearchRowBasic.
     * 
     * @param authWorkDate
     */
    public void setAuthWorkDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] authWorkDate) {
        this.authWorkDate = authWorkDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getAuthWorkDate(int i) {
        return this.authWorkDate[i];
    }

    public void setAuthWorkDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.authWorkDate[i] = _value;
    }


    /**
     * Gets the billAddress value for this EmployeeSearchRowBasic.
     * 
     * @return billAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this EmployeeSearchRowBasic.
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
     * Gets the billAddress1 value for this EmployeeSearchRowBasic.
     * 
     * @return billAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress1() {
        return billAddress1;
    }


    /**
     * Sets the billAddress1 value for this EmployeeSearchRowBasic.
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
     * Gets the billAddress2 value for this EmployeeSearchRowBasic.
     * 
     * @return billAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress2() {
        return billAddress2;
    }


    /**
     * Sets the billAddress2 value for this EmployeeSearchRowBasic.
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
     * Gets the billAddress3 value for this EmployeeSearchRowBasic.
     * 
     * @return billAddress3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress3() {
        return billAddress3;
    }


    /**
     * Sets the billAddress3 value for this EmployeeSearchRowBasic.
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
     * Gets the billAddressee value for this EmployeeSearchRowBasic.
     * 
     * @return billAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this EmployeeSearchRowBasic.
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
     * Gets the billAttention value for this EmployeeSearchRowBasic.
     * 
     * @return billAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this EmployeeSearchRowBasic.
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
     * Gets the billCity value for this EmployeeSearchRowBasic.
     * 
     * @return billCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this EmployeeSearchRowBasic.
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
     * Gets the billCountry value for this EmployeeSearchRowBasic.
     * 
     * @return billCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this EmployeeSearchRowBasic.
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
     * Gets the billCountryCode value for this EmployeeSearchRowBasic.
     * 
     * @return billCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCountryCode() {
        return billCountryCode;
    }


    /**
     * Sets the billCountryCode value for this EmployeeSearchRowBasic.
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
     * Gets the billingClass value for this EmployeeSearchRowBasic.
     * 
     * @return billingClass
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBillingClass() {
        return billingClass;
    }


    /**
     * Sets the billingClass value for this EmployeeSearchRowBasic.
     * 
     * @param billingClass
     */
    public void setBillingClass(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingClass) {
        this.billingClass = billingClass;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBillingClass(int i) {
        return this.billingClass[i];
    }

    public void setBillingClass(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.billingClass[i] = _value;
    }


    /**
     * Gets the billPhone value for this EmployeeSearchRowBasic.
     * 
     * @return billPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this EmployeeSearchRowBasic.
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
     * Gets the billState value for this EmployeeSearchRowBasic.
     * 
     * @return billState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this EmployeeSearchRowBasic.
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
     * Gets the billZipCode value for this EmployeeSearchRowBasic.
     * 
     * @return billZipCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillZipCode() {
        return billZipCode;
    }


    /**
     * Sets the billZipCode value for this EmployeeSearchRowBasic.
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
     * Gets the birthDate value for this EmployeeSearchRowBasic.
     * 
     * @return birthDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this EmployeeSearchRowBasic.
     * 
     * @param birthDate
     */
    public void setBirthDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] birthDate) {
        this.birthDate = birthDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getBirthDate(int i) {
        return this.birthDate[i];
    }

    public void setBirthDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.birthDate[i] = _value;
    }


    /**
     * Gets the birthDay value for this EmployeeSearchRowBasic.
     * 
     * @return birthDay
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getBirthDay() {
        return birthDay;
    }


    /**
     * Sets the birthDay value for this EmployeeSearchRowBasic.
     * 
     * @param birthDay
     */
    public void setBirthDay(org.mule.module.netsuite.api.internal.SearchColumnDateField[] birthDay) {
        this.birthDay = birthDay;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getBirthDay(int i) {
        return this.birthDay[i];
    }

    public void setBirthDay(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.birthDay[i] = _value;
    }


    /**
     * Gets the city value for this EmployeeSearchRowBasic.
     * 
     * @return city
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCity() {
        return city;
    }


    /**
     * Sets the city value for this EmployeeSearchRowBasic.
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
     * Gets the _class value for this EmployeeSearchRowBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this EmployeeSearchRowBasic.
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
     * Gets the comments value for this EmployeeSearchRowBasic.
     * 
     * @return comments
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this EmployeeSearchRowBasic.
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
     * Gets the concurrentWebServicesUser value for this EmployeeSearchRowBasic.
     * 
     * @return concurrentWebServicesUser
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getConcurrentWebServicesUser() {
        return concurrentWebServicesUser;
    }


    /**
     * Sets the concurrentWebServicesUser value for this EmployeeSearchRowBasic.
     * 
     * @param concurrentWebServicesUser
     */
    public void setConcurrentWebServicesUser(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] concurrentWebServicesUser) {
        this.concurrentWebServicesUser = concurrentWebServicesUser;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getConcurrentWebServicesUser(int i) {
        return this.concurrentWebServicesUser[i];
    }

    public void setConcurrentWebServicesUser(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.concurrentWebServicesUser[i] = _value;
    }


    /**
     * Gets the country value for this EmployeeSearchRowBasic.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCountry() {
        return country;
    }


    /**
     * Sets the country value for this EmployeeSearchRowBasic.
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
     * Gets the countryCode value for this EmployeeSearchRowBasic.
     * 
     * @return countryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this EmployeeSearchRowBasic.
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
     * Gets the dateCreated value for this EmployeeSearchRowBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this EmployeeSearchRowBasic.
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
     * Gets the department value for this EmployeeSearchRowBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this EmployeeSearchRowBasic.
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
     * Gets the eligibleForCommission value for this EmployeeSearchRowBasic.
     * 
     * @return eligibleForCommission
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getEligibleForCommission() {
        return eligibleForCommission;
    }


    /**
     * Sets the eligibleForCommission value for this EmployeeSearchRowBasic.
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
     * Gets the email value for this EmployeeSearchRowBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EmployeeSearchRowBasic.
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
     * Gets the employeeStatus value for this EmployeeSearchRowBasic.
     * 
     * @return employeeStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEmployeeStatus() {
        return employeeStatus;
    }


    /**
     * Sets the employeeStatus value for this EmployeeSearchRowBasic.
     * 
     * @param employeeStatus
     */
    public void setEmployeeStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEmployeeStatus(int i) {
        return this.employeeStatus[i];
    }

    public void setEmployeeStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.employeeStatus[i] = _value;
    }


    /**
     * Gets the employeeType value for this EmployeeSearchRowBasic.
     * 
     * @return employeeType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEmployeeType() {
        return employeeType;
    }


    /**
     * Sets the employeeType value for this EmployeeSearchRowBasic.
     * 
     * @param employeeType
     */
    public void setEmployeeType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employeeType) {
        this.employeeType = employeeType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEmployeeType(int i) {
        return this.employeeType[i];
    }

    public void setEmployeeType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.employeeType[i] = _value;
    }


    /**
     * Gets the entityId value for this EmployeeSearchRowBasic.
     * 
     * @return entityId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this EmployeeSearchRowBasic.
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
     * Gets the entityNumber value for this EmployeeSearchRowBasic.
     * 
     * @return entityNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getEntityNumber() {
        return entityNumber;
    }


    /**
     * Sets the entityNumber value for this EmployeeSearchRowBasic.
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
     * Gets the ethnicity value for this EmployeeSearchRowBasic.
     * 
     * @return ethnicity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEthnicity() {
        return ethnicity;
    }


    /**
     * Sets the ethnicity value for this EmployeeSearchRowBasic.
     * 
     * @param ethnicity
     */
    public void setEthnicity(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] ethnicity) {
        this.ethnicity = ethnicity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEthnicity(int i) {
        return this.ethnicity[i];
    }

    public void setEthnicity(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.ethnicity[i] = _value;
    }


    /**
     * Gets the expenseLimit value for this EmployeeSearchRowBasic.
     * 
     * @return expenseLimit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getExpenseLimit() {
        return expenseLimit;
    }


    /**
     * Sets the expenseLimit value for this EmployeeSearchRowBasic.
     * 
     * @param expenseLimit
     */
    public void setExpenseLimit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] expenseLimit) {
        this.expenseLimit = expenseLimit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getExpenseLimit(int i) {
        return this.expenseLimit[i];
    }

    public void setExpenseLimit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.expenseLimit[i] = _value;
    }


    /**
     * Gets the externalId value for this EmployeeSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this EmployeeSearchRowBasic.
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
     * Gets the fax value for this EmployeeSearchRowBasic.
     * 
     * @return fax
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this EmployeeSearchRowBasic.
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
     * Gets the firstName value for this EmployeeSearchRowBasic.
     * 
     * @return firstName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this EmployeeSearchRowBasic.
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
     * Gets the gender value for this EmployeeSearchRowBasic.
     * 
     * @return gender
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this EmployeeSearchRowBasic.
     * 
     * @param gender
     */
    public void setGender(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gender) {
        this.gender = gender;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getGender(int i) {
        return this.gender[i];
    }

    public void setGender(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.gender[i] = _value;
    }


    /**
     * Gets the giveAccess value for this EmployeeSearchRowBasic.
     * 
     * @return giveAccess
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this EmployeeSearchRowBasic.
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
     * Gets the globalSubscriptionStatus value for this EmployeeSearchRowBasic.
     * 
     * @return globalSubscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGlobalSubscriptionStatus() {
        return globalSubscriptionStatus;
    }


    /**
     * Sets the globalSubscriptionStatus value for this EmployeeSearchRowBasic.
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
     * Gets the hireDate value for this EmployeeSearchRowBasic.
     * 
     * @return hireDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getHireDate() {
        return hireDate;
    }


    /**
     * Sets the hireDate value for this EmployeeSearchRowBasic.
     * 
     * @param hireDate
     */
    public void setHireDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] hireDate) {
        this.hireDate = hireDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getHireDate(int i) {
        return this.hireDate[i];
    }

    public void setHireDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.hireDate[i] = _value;
    }


    /**
     * Gets the homePhone value for this EmployeeSearchRowBasic.
     * 
     * @return homePhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this EmployeeSearchRowBasic.
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
     * Gets the i9Verified value for this EmployeeSearchRowBasic.
     * 
     * @return i9Verified
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getI9Verified() {
        return i9Verified;
    }


    /**
     * Sets the i9Verified value for this EmployeeSearchRowBasic.
     * 
     * @param i9Verified
     */
    public void setI9Verified(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] i9Verified) {
        this.i9Verified = i9Verified;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getI9Verified(int i) {
        return this.i9Verified[i];
    }

    public void setI9Verified(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.i9Verified[i] = _value;
    }


    /**
     * Gets the image value for this EmployeeSearchRowBasic.
     * 
     * @return image
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getImage() {
        return image;
    }


    /**
     * Sets the image value for this EmployeeSearchRowBasic.
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
     * Gets the internalId value for this EmployeeSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EmployeeSearchRowBasic.
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
     * Gets the isDefaultBilling value for this EmployeeSearchRowBasic.
     * 
     * @return isDefaultBilling
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDefaultBilling() {
        return isDefaultBilling;
    }


    /**
     * Sets the isDefaultBilling value for this EmployeeSearchRowBasic.
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
     * Gets the isDefaultShipping value for this EmployeeSearchRowBasic.
     * 
     * @return isDefaultShipping
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDefaultShipping() {
        return isDefaultShipping;
    }


    /**
     * Sets the isDefaultShipping value for this EmployeeSearchRowBasic.
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
     * Gets the isInactive value for this EmployeeSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this EmployeeSearchRowBasic.
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
     * Gets the isJobResource value for this EmployeeSearchRowBasic.
     * 
     * @return isJobResource
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsJobResource() {
        return isJobResource;
    }


    /**
     * Sets the isJobResource value for this EmployeeSearchRowBasic.
     * 
     * @param isJobResource
     */
    public void setIsJobResource(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobResource) {
        this.isJobResource = isJobResource;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsJobResource(int i) {
        return this.isJobResource[i];
    }

    public void setIsJobResource(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isJobResource[i] = _value;
    }


    /**
     * Gets the isSalesRep value for this EmployeeSearchRowBasic.
     * 
     * @return isSalesRep
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsSalesRep() {
        return isSalesRep;
    }


    /**
     * Sets the isSalesRep value for this EmployeeSearchRowBasic.
     * 
     * @param isSalesRep
     */
    public void setIsSalesRep(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSalesRep) {
        this.isSalesRep = isSalesRep;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsSalesRep(int i) {
        return this.isSalesRep[i];
    }

    public void setIsSalesRep(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isSalesRep[i] = _value;
    }


    /**
     * Gets the isSupportRep value for this EmployeeSearchRowBasic.
     * 
     * @return isSupportRep
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsSupportRep() {
        return isSupportRep;
    }


    /**
     * Sets the isSupportRep value for this EmployeeSearchRowBasic.
     * 
     * @param isSupportRep
     */
    public void setIsSupportRep(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSupportRep) {
        this.isSupportRep = isSupportRep;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsSupportRep(int i) {
        return this.isSupportRep[i];
    }

    public void setIsSupportRep(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isSupportRep[i] = _value;
    }


    /**
     * Gets the isTemplate value for this EmployeeSearchRowBasic.
     * 
     * @return isTemplate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsTemplate() {
        return isTemplate;
    }


    /**
     * Sets the isTemplate value for this EmployeeSearchRowBasic.
     * 
     * @param isTemplate
     */
    public void setIsTemplate(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTemplate) {
        this.isTemplate = isTemplate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsTemplate(int i) {
        return this.isTemplate[i];
    }

    public void setIsTemplate(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isTemplate[i] = _value;
    }


    /**
     * Gets the laborCost value for this EmployeeSearchRowBasic.
     * 
     * @return laborCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLaborCost() {
        return laborCost;
    }


    /**
     * Sets the laborCost value for this EmployeeSearchRowBasic.
     * 
     * @param laborCost
     */
    public void setLaborCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] laborCost) {
        this.laborCost = laborCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLaborCost(int i) {
        return this.laborCost[i];
    }

    public void setLaborCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.laborCost[i] = _value;
    }


    /**
     * Gets the language value for this EmployeeSearchRowBasic.
     * 
     * @return language
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getLanguage() {
        return language;
    }


    /**
     * Sets the language value for this EmployeeSearchRowBasic.
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
     * Gets the lastModifiedDate value for this EmployeeSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this EmployeeSearchRowBasic.
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
     * Gets the lastName value for this EmployeeSearchRowBasic.
     * 
     * @return lastName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this EmployeeSearchRowBasic.
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
     * Gets the lastPaidDate value for this EmployeeSearchRowBasic.
     * 
     * @return lastPaidDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastPaidDate() {
        return lastPaidDate;
    }


    /**
     * Sets the lastPaidDate value for this EmployeeSearchRowBasic.
     * 
     * @param lastPaidDate
     */
    public void setLastPaidDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastPaidDate(int i) {
        return this.lastPaidDate[i];
    }

    public void setLastPaidDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastPaidDate[i] = _value;
    }


    /**
     * Gets the lastReviewDate value for this EmployeeSearchRowBasic.
     * 
     * @return lastReviewDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastReviewDate() {
        return lastReviewDate;
    }


    /**
     * Sets the lastReviewDate value for this EmployeeSearchRowBasic.
     * 
     * @param lastReviewDate
     */
    public void setLastReviewDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastReviewDate(int i) {
        return this.lastReviewDate[i];
    }

    public void setLastReviewDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastReviewDate[i] = _value;
    }


    /**
     * Gets the level value for this EmployeeSearchRowBasic.
     * 
     * @return level
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getLevel() {
        return level;
    }


    /**
     * Sets the level value for this EmployeeSearchRowBasic.
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
     * Gets the location value for this EmployeeSearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this EmployeeSearchRowBasic.
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
     * Gets the maritalStatus value for this EmployeeSearchRowBasic.
     * 
     * @return maritalStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this EmployeeSearchRowBasic.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getMaritalStatus(int i) {
        return this.maritalStatus[i];
    }

    public void setMaritalStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.maritalStatus[i] = _value;
    }


    /**
     * Gets the middleName value for this EmployeeSearchRowBasic.
     * 
     * @return middleName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this EmployeeSearchRowBasic.
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
     * Gets the mobilePhone value for this EmployeeSearchRowBasic.
     * 
     * @return mobilePhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this EmployeeSearchRowBasic.
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
     * Gets the nextReviewDate value for this EmployeeSearchRowBasic.
     * 
     * @return nextReviewDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getNextReviewDate() {
        return nextReviewDate;
    }


    /**
     * Sets the nextReviewDate value for this EmployeeSearchRowBasic.
     * 
     * @param nextReviewDate
     */
    public void setNextReviewDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getNextReviewDate(int i) {
        return this.nextReviewDate[i];
    }

    public void setNextReviewDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.nextReviewDate[i] = _value;
    }


    /**
     * Gets the offlineAccess value for this EmployeeSearchRowBasic.
     * 
     * @return offlineAccess
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getOfflineAccess() {
        return offlineAccess;
    }


    /**
     * Sets the offlineAccess value for this EmployeeSearchRowBasic.
     * 
     * @param offlineAccess
     */
    public void setOfflineAccess(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] offlineAccess) {
        this.offlineAccess = offlineAccess;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getOfflineAccess(int i) {
        return this.offlineAccess[i];
    }

    public void setOfflineAccess(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.offlineAccess[i] = _value;
    }


    /**
     * Gets the payFrequency value for this EmployeeSearchRowBasic.
     * 
     * @return payFrequency
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPayFrequency() {
        return payFrequency;
    }


    /**
     * Sets the payFrequency value for this EmployeeSearchRowBasic.
     * 
     * @param payFrequency
     */
    public void setPayFrequency(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] payFrequency) {
        this.payFrequency = payFrequency;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getPayFrequency(int i) {
        return this.payFrequency[i];
    }

    public void setPayFrequency(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.payFrequency[i] = _value;
    }


    /**
     * Gets the permChangeDate value for this EmployeeSearchRowBasic.
     * 
     * @return permChangeDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getPermChangeDate() {
        return permChangeDate;
    }


    /**
     * Sets the permChangeDate value for this EmployeeSearchRowBasic.
     * 
     * @param permChangeDate
     */
    public void setPermChangeDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] permChangeDate) {
        this.permChangeDate = permChangeDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getPermChangeDate(int i) {
        return this.permChangeDate[i];
    }

    public void setPermChangeDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.permChangeDate[i] = _value;
    }


    /**
     * Gets the permChangeLevel value for this EmployeeSearchRowBasic.
     * 
     * @return permChangeLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPermChangeLevel() {
        return permChangeLevel;
    }


    /**
     * Sets the permChangeLevel value for this EmployeeSearchRowBasic.
     * 
     * @param permChangeLevel
     */
    public void setPermChangeLevel(org.mule.module.netsuite.api.internal.SearchColumnStringField[] permChangeLevel) {
        this.permChangeLevel = permChangeLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPermChangeLevel(int i) {
        return this.permChangeLevel[i];
    }

    public void setPermChangeLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.permChangeLevel[i] = _value;
    }


    /**
     * Gets the permission value for this EmployeeSearchRowBasic.
     * 
     * @return permission
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPermission() {
        return permission;
    }


    /**
     * Sets the permission value for this EmployeeSearchRowBasic.
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
     * Gets the permissionChange value for this EmployeeSearchRowBasic.
     * 
     * @return permissionChange
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPermissionChange() {
        return permissionChange;
    }


    /**
     * Sets the permissionChange value for this EmployeeSearchRowBasic.
     * 
     * @param permissionChange
     */
    public void setPermissionChange(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] permissionChange) {
        this.permissionChange = permissionChange;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getPermissionChange(int i) {
        return this.permissionChange[i];
    }

    public void setPermissionChange(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.permissionChange[i] = _value;
    }


    /**
     * Gets the phone value for this EmployeeSearchRowBasic.
     * 
     * @return phone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this EmployeeSearchRowBasic.
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
     * Gets the phoneticName value for this EmployeeSearchRowBasic.
     * 
     * @return phoneticName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPhoneticName() {
        return phoneticName;
    }


    /**
     * Sets the phoneticName value for this EmployeeSearchRowBasic.
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
     * Gets the primaryEarningAmount value for this EmployeeSearchRowBasic.
     * 
     * @return primaryEarningAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPrimaryEarningAmount() {
        return primaryEarningAmount;
    }


    /**
     * Sets the primaryEarningAmount value for this EmployeeSearchRowBasic.
     * 
     * @param primaryEarningAmount
     */
    public void setPrimaryEarningAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] primaryEarningAmount) {
        this.primaryEarningAmount = primaryEarningAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPrimaryEarningAmount(int i) {
        return this.primaryEarningAmount[i];
    }

    public void setPrimaryEarningAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.primaryEarningAmount[i] = _value;
    }


    /**
     * Gets the primaryEarningItem value for this EmployeeSearchRowBasic.
     * 
     * @return primaryEarningItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPrimaryEarningItem() {
        return primaryEarningItem;
    }


    /**
     * Sets the primaryEarningItem value for this EmployeeSearchRowBasic.
     * 
     * @param primaryEarningItem
     */
    public void setPrimaryEarningItem(org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryEarningItem) {
        this.primaryEarningItem = primaryEarningItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPrimaryEarningItem(int i) {
        return this.primaryEarningItem[i];
    }

    public void setPrimaryEarningItem(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.primaryEarningItem[i] = _value;
    }


    /**
     * Gets the primaryEarningType value for this EmployeeSearchRowBasic.
     * 
     * @return primaryEarningType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPrimaryEarningType() {
        return primaryEarningType;
    }


    /**
     * Sets the primaryEarningType value for this EmployeeSearchRowBasic.
     * 
     * @param primaryEarningType
     */
    public void setPrimaryEarningType(org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryEarningType) {
        this.primaryEarningType = primaryEarningType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPrimaryEarningType(int i) {
        return this.primaryEarningType[i];
    }

    public void setPrimaryEarningType(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.primaryEarningType[i] = _value;
    }


    /**
     * Gets the purchaseOrderApprovalLimit value for this EmployeeSearchRowBasic.
     * 
     * @return purchaseOrderApprovalLimit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPurchaseOrderApprovalLimit() {
        return purchaseOrderApprovalLimit;
    }


    /**
     * Sets the purchaseOrderApprovalLimit value for this EmployeeSearchRowBasic.
     * 
     * @param purchaseOrderApprovalLimit
     */
    public void setPurchaseOrderApprovalLimit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] purchaseOrderApprovalLimit) {
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPurchaseOrderApprovalLimit(int i) {
        return this.purchaseOrderApprovalLimit[i];
    }

    public void setPurchaseOrderApprovalLimit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.purchaseOrderApprovalLimit[i] = _value;
    }


    /**
     * Gets the purchaseOrderApprover value for this EmployeeSearchRowBasic.
     * 
     * @return purchaseOrderApprover
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPurchaseOrderApprover() {
        return purchaseOrderApprover;
    }


    /**
     * Sets the purchaseOrderApprover value for this EmployeeSearchRowBasic.
     * 
     * @param purchaseOrderApprover
     */
    public void setPurchaseOrderApprover(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseOrderApprover) {
        this.purchaseOrderApprover = purchaseOrderApprover;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPurchaseOrderApprover(int i) {
        return this.purchaseOrderApprover[i];
    }

    public void setPurchaseOrderApprover(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.purchaseOrderApprover[i] = _value;
    }


    /**
     * Gets the purchaseOrderLimit value for this EmployeeSearchRowBasic.
     * 
     * @return purchaseOrderLimit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPurchaseOrderLimit() {
        return purchaseOrderLimit;
    }


    /**
     * Sets the purchaseOrderLimit value for this EmployeeSearchRowBasic.
     * 
     * @param purchaseOrderLimit
     */
    public void setPurchaseOrderLimit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] purchaseOrderLimit) {
        this.purchaseOrderLimit = purchaseOrderLimit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPurchaseOrderLimit(int i) {
        return this.purchaseOrderLimit[i];
    }

    public void setPurchaseOrderLimit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.purchaseOrderLimit[i] = _value;
    }


    /**
     * Gets the releaseDate value for this EmployeeSearchRowBasic.
     * 
     * @return releaseDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getReleaseDate() {
        return releaseDate;
    }


    /**
     * Sets the releaseDate value for this EmployeeSearchRowBasic.
     * 
     * @param releaseDate
     */
    public void setReleaseDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] releaseDate) {
        this.releaseDate = releaseDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getReleaseDate(int i) {
        return this.releaseDate[i];
    }

    public void setReleaseDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.releaseDate[i] = _value;
    }


    /**
     * Gets the residentStatus value for this EmployeeSearchRowBasic.
     * 
     * @return residentStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getResidentStatus() {
        return residentStatus;
    }


    /**
     * Sets the residentStatus value for this EmployeeSearchRowBasic.
     * 
     * @param residentStatus
     */
    public void setResidentStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] residentStatus) {
        this.residentStatus = residentStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getResidentStatus(int i) {
        return this.residentStatus[i];
    }

    public void setResidentStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.residentStatus[i] = _value;
    }


    /**
     * Gets the role value for this EmployeeSearchRowBasic.
     * 
     * @return role
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getRole() {
        return role;
    }


    /**
     * Sets the role value for this EmployeeSearchRowBasic.
     * 
     * @param role
     */
    public void setRole(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] role) {
        this.role = role;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.role[i] = _value;
    }


    /**
     * Gets the roleChange value for this EmployeeSearchRowBasic.
     * 
     * @return roleChange
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getRoleChange() {
        return roleChange;
    }


    /**
     * Sets the roleChange value for this EmployeeSearchRowBasic.
     * 
     * @param roleChange
     */
    public void setRoleChange(org.mule.module.netsuite.api.internal.SearchColumnStringField[] roleChange) {
        this.roleChange = roleChange;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getRoleChange(int i) {
        return this.roleChange[i];
    }

    public void setRoleChange(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.roleChange[i] = _value;
    }


    /**
     * Gets the roleChangeAction value for this EmployeeSearchRowBasic.
     * 
     * @return roleChangeAction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getRoleChangeAction() {
        return roleChangeAction;
    }


    /**
     * Sets the roleChangeAction value for this EmployeeSearchRowBasic.
     * 
     * @param roleChangeAction
     */
    public void setRoleChangeAction(org.mule.module.netsuite.api.internal.SearchColumnStringField[] roleChangeAction) {
        this.roleChangeAction = roleChangeAction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getRoleChangeAction(int i) {
        return this.roleChangeAction[i];
    }

    public void setRoleChangeAction(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.roleChangeAction[i] = _value;
    }


    /**
     * Gets the roleChangeDate value for this EmployeeSearchRowBasic.
     * 
     * @return roleChangeDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getRoleChangeDate() {
        return roleChangeDate;
    }


    /**
     * Sets the roleChangeDate value for this EmployeeSearchRowBasic.
     * 
     * @param roleChangeDate
     */
    public void setRoleChangeDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] roleChangeDate) {
        this.roleChangeDate = roleChangeDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getRoleChangeDate(int i) {
        return this.roleChangeDate[i];
    }

    public void setRoleChangeDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.roleChangeDate[i] = _value;
    }


    /**
     * Gets the salesRole value for this EmployeeSearchRowBasic.
     * 
     * @return salesRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesRole() {
        return salesRole;
    }


    /**
     * Sets the salesRole value for this EmployeeSearchRowBasic.
     * 
     * @param salesRole
     */
    public void setSalesRole(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRole) {
        this.salesRole = salesRole;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesRole(int i) {
        return this.salesRole[i];
    }

    public void setSalesRole(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesRole[i] = _value;
    }


    /**
     * Gets the salutation value for this EmployeeSearchRowBasic.
     * 
     * @return salutation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this EmployeeSearchRowBasic.
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
     * Gets the shipAddress1 value for this EmployeeSearchRowBasic.
     * 
     * @return shipAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this EmployeeSearchRowBasic.
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
     * Gets the shipAddress2 value for this EmployeeSearchRowBasic.
     * 
     * @return shipAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this EmployeeSearchRowBasic.
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
     * Gets the shipAddress3 value for this EmployeeSearchRowBasic.
     * 
     * @return shipAddress3
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress3() {
        return shipAddress3;
    }


    /**
     * Sets the shipAddress3 value for this EmployeeSearchRowBasic.
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
     * Gets the shipAddressee value for this EmployeeSearchRowBasic.
     * 
     * @return shipAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this EmployeeSearchRowBasic.
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
     * Gets the shipAttention value for this EmployeeSearchRowBasic.
     * 
     * @return shipAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this EmployeeSearchRowBasic.
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
     * Gets the shipCity value for this EmployeeSearchRowBasic.
     * 
     * @return shipCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this EmployeeSearchRowBasic.
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
     * Gets the shipCountry value for this EmployeeSearchRowBasic.
     * 
     * @return shipCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this EmployeeSearchRowBasic.
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
     * Gets the shipCountryCode value for this EmployeeSearchRowBasic.
     * 
     * @return shipCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCountryCode() {
        return shipCountryCode;
    }


    /**
     * Sets the shipCountryCode value for this EmployeeSearchRowBasic.
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
     * Gets the shipPhone value for this EmployeeSearchRowBasic.
     * 
     * @return shipPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this EmployeeSearchRowBasic.
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
     * Gets the shipState value for this EmployeeSearchRowBasic.
     * 
     * @return shipState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this EmployeeSearchRowBasic.
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
     * Gets the shipZip value for this EmployeeSearchRowBasic.
     * 
     * @return shipZip
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this EmployeeSearchRowBasic.
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
     * Gets the socialSecurityNumber value for this EmployeeSearchRowBasic.
     * 
     * @return socialSecurityNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSocialSecurityNumber() {
        return socialSecurityNumber;
    }


    /**
     * Sets the socialSecurityNumber value for this EmployeeSearchRowBasic.
     * 
     * @param socialSecurityNumber
     */
    public void setSocialSecurityNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSocialSecurityNumber(int i) {
        return this.socialSecurityNumber[i];
    }

    public void setSocialSecurityNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.socialSecurityNumber[i] = _value;
    }


    /**
     * Gets the state value for this EmployeeSearchRowBasic.
     * 
     * @return state
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getState() {
        return state;
    }


    /**
     * Sets the state value for this EmployeeSearchRowBasic.
     * 
     * @param state
     */
    public void setState(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] state) {
        this.state = state;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.state[i] = _value;
    }


    /**
     * Gets the subscription value for this EmployeeSearchRowBasic.
     * 
     * @return subscription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this EmployeeSearchRowBasic.
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
     * Gets the subscriptionDate value for this EmployeeSearchRowBasic.
     * 
     * @return subscriptionDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getSubscriptionDate() {
        return subscriptionDate;
    }


    /**
     * Sets the subscriptionDate value for this EmployeeSearchRowBasic.
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
     * Gets the subscriptionStatus value for this EmployeeSearchRowBasic.
     * 
     * @return subscriptionStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getSubscriptionStatus() {
        return subscriptionStatus;
    }


    /**
     * Sets the subscriptionStatus value for this EmployeeSearchRowBasic.
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
     * Gets the subsidiary value for this EmployeeSearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this EmployeeSearchRowBasic.
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
     * Gets the supervisor value for this EmployeeSearchRowBasic.
     * 
     * @return supervisor
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this EmployeeSearchRowBasic.
     * 
     * @param supervisor
     */
    public void setSupervisor(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] supervisor) {
        this.supervisor = supervisor;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSupervisor(int i) {
        return this.supervisor[i];
    }

    public void setSupervisor(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.supervisor[i] = _value;
    }


    /**
     * Gets the timeApprover value for this EmployeeSearchRowBasic.
     * 
     * @return timeApprover
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTimeApprover() {
        return timeApprover;
    }


    /**
     * Sets the timeApprover value for this EmployeeSearchRowBasic.
     * 
     * @param timeApprover
     */
    public void setTimeApprover(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] timeApprover) {
        this.timeApprover = timeApprover;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTimeApprover(int i) {
        return this.timeApprover[i];
    }

    public void setTimeApprover(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.timeApprover[i] = _value;
    }


    /**
     * Gets the title value for this EmployeeSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this EmployeeSearchRowBasic.
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
     * Gets the usePerquest value for this EmployeeSearchRowBasic.
     * 
     * @return usePerquest
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getUsePerquest() {
        return usePerquest;
    }


    /**
     * Sets the usePerquest value for this EmployeeSearchRowBasic.
     * 
     * @param usePerquest
     */
    public void setUsePerquest(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] usePerquest) {
        this.usePerquest = usePerquest;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getUsePerquest(int i) {
        return this.usePerquest[i];
    }

    public void setUsePerquest(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.usePerquest[i] = _value;
    }


    /**
     * Gets the useTimeData value for this EmployeeSearchRowBasic.
     * 
     * @return useTimeData
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getUseTimeData() {
        return useTimeData;
    }


    /**
     * Sets the useTimeData value for this EmployeeSearchRowBasic.
     * 
     * @param useTimeData
     */
    public void setUseTimeData(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useTimeData) {
        this.useTimeData = useTimeData;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getUseTimeData(int i) {
        return this.useTimeData[i];
    }

    public void setUseTimeData(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.useTimeData[i] = _value;
    }


    /**
     * Gets the visaExpDate value for this EmployeeSearchRowBasic.
     * 
     * @return visaExpDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getVisaExpDate() {
        return visaExpDate;
    }


    /**
     * Sets the visaExpDate value for this EmployeeSearchRowBasic.
     * 
     * @param visaExpDate
     */
    public void setVisaExpDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] visaExpDate) {
        this.visaExpDate = visaExpDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getVisaExpDate(int i) {
        return this.visaExpDate[i];
    }

    public void setVisaExpDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.visaExpDate[i] = _value;
    }


    /**
     * Gets the visaType value for this EmployeeSearchRowBasic.
     * 
     * @return visaType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getVisaType() {
        return visaType;
    }


    /**
     * Sets the visaType value for this EmployeeSearchRowBasic.
     * 
     * @param visaType
     */
    public void setVisaType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] visaType) {
        this.visaType = visaType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getVisaType(int i) {
        return this.visaType[i];
    }

    public void setVisaType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.visaType[i] = _value;
    }


    /**
     * Gets the workCalendar value for this EmployeeSearchRowBasic.
     * 
     * @return workCalendar
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this EmployeeSearchRowBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(org.mule.module.netsuite.api.internal.SearchColumnStringField[] workCalendar) {
        this.workCalendar = workCalendar;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getWorkCalendar(int i) {
        return this.workCalendar[i];
    }

    public void setWorkCalendar(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.workCalendar[i] = _value;
    }


    /**
     * Gets the workplace value for this EmployeeSearchRowBasic.
     * 
     * @return workplace
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getWorkplace() {
        return workplace;
    }


    /**
     * Sets the workplace value for this EmployeeSearchRowBasic.
     * 
     * @param workplace
     */
    public void setWorkplace(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] workplace) {
        this.workplace = workplace;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getWorkplace(int i) {
        return this.workplace[i];
    }

    public void setWorkplace(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.workplace[i] = _value;
    }


    /**
     * Gets the zipCode value for this EmployeeSearchRowBasic.
     * 
     * @return zipCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getZipCode() {
        return zipCode;
    }


    /**
     * Sets the zipCode value for this EmployeeSearchRowBasic.
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
     * Gets the customFieldList value for this EmployeeSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this EmployeeSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeSearchRowBasic)) return false;
        EmployeeSearchRowBasic other = (EmployeeSearchRowBasic) obj;
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
            ((this.alienNumber==null && other.getAlienNumber()==null) || 
             (this.alienNumber!=null &&
              java.util.Arrays.equals(this.alienNumber, other.getAlienNumber()))) &&
            ((this.altEmail==null && other.getAltEmail()==null) || 
             (this.altEmail!=null &&
              java.util.Arrays.equals(this.altEmail, other.getAltEmail()))) &&
            ((this.altName==null && other.getAltName()==null) || 
             (this.altName!=null &&
              java.util.Arrays.equals(this.altName, other.getAltName()))) &&
            ((this.altPhone==null && other.getAltPhone()==null) || 
             (this.altPhone!=null &&
              java.util.Arrays.equals(this.altPhone, other.getAltPhone()))) &&
            ((this.approvalLimit==null && other.getApprovalLimit()==null) || 
             (this.approvalLimit!=null &&
              java.util.Arrays.equals(this.approvalLimit, other.getApprovalLimit()))) &&
            ((this.approver==null && other.getApprover()==null) || 
             (this.approver!=null &&
              java.util.Arrays.equals(this.approver, other.getApprover()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              java.util.Arrays.equals(this.attention, other.getAttention()))) &&
            ((this.authWorkDate==null && other.getAuthWorkDate()==null) || 
             (this.authWorkDate!=null &&
              java.util.Arrays.equals(this.authWorkDate, other.getAuthWorkDate()))) &&
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
            ((this.billingClass==null && other.getBillingClass()==null) || 
             (this.billingClass!=null &&
              java.util.Arrays.equals(this.billingClass, other.getBillingClass()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              java.util.Arrays.equals(this.billPhone, other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              java.util.Arrays.equals(this.billState, other.getBillState()))) &&
            ((this.billZipCode==null && other.getBillZipCode()==null) || 
             (this.billZipCode!=null &&
              java.util.Arrays.equals(this.billZipCode, other.getBillZipCode()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              java.util.Arrays.equals(this.birthDate, other.getBirthDate()))) &&
            ((this.birthDay==null && other.getBirthDay()==null) || 
             (this.birthDay!=null &&
              java.util.Arrays.equals(this.birthDay, other.getBirthDay()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              java.util.Arrays.equals(this.city, other.getCity()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              java.util.Arrays.equals(this.comments, other.getComments()))) &&
            ((this.concurrentWebServicesUser==null && other.getConcurrentWebServicesUser()==null) || 
             (this.concurrentWebServicesUser!=null &&
              java.util.Arrays.equals(this.concurrentWebServicesUser, other.getConcurrentWebServicesUser()))) &&
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
            ((this.employeeStatus==null && other.getEmployeeStatus()==null) || 
             (this.employeeStatus!=null &&
              java.util.Arrays.equals(this.employeeStatus, other.getEmployeeStatus()))) &&
            ((this.employeeType==null && other.getEmployeeType()==null) || 
             (this.employeeType!=null &&
              java.util.Arrays.equals(this.employeeType, other.getEmployeeType()))) &&
            ((this.entityId==null && other.getEntityId()==null) || 
             (this.entityId!=null &&
              java.util.Arrays.equals(this.entityId, other.getEntityId()))) &&
            ((this.entityNumber==null && other.getEntityNumber()==null) || 
             (this.entityNumber!=null &&
              java.util.Arrays.equals(this.entityNumber, other.getEntityNumber()))) &&
            ((this.ethnicity==null && other.getEthnicity()==null) || 
             (this.ethnicity!=null &&
              java.util.Arrays.equals(this.ethnicity, other.getEthnicity()))) &&
            ((this.expenseLimit==null && other.getExpenseLimit()==null) || 
             (this.expenseLimit!=null &&
              java.util.Arrays.equals(this.expenseLimit, other.getExpenseLimit()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              java.util.Arrays.equals(this.fax, other.getFax()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              java.util.Arrays.equals(this.firstName, other.getFirstName()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              java.util.Arrays.equals(this.gender, other.getGender()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              java.util.Arrays.equals(this.giveAccess, other.getGiveAccess()))) &&
            ((this.globalSubscriptionStatus==null && other.getGlobalSubscriptionStatus()==null) || 
             (this.globalSubscriptionStatus!=null &&
              java.util.Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus()))) &&
            ((this.hireDate==null && other.getHireDate()==null) || 
             (this.hireDate!=null &&
              java.util.Arrays.equals(this.hireDate, other.getHireDate()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              java.util.Arrays.equals(this.homePhone, other.getHomePhone()))) &&
            ((this.i9Verified==null && other.getI9Verified()==null) || 
             (this.i9Verified!=null &&
              java.util.Arrays.equals(this.i9Verified, other.getI9Verified()))) &&
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
            ((this.isJobResource==null && other.getIsJobResource()==null) || 
             (this.isJobResource!=null &&
              java.util.Arrays.equals(this.isJobResource, other.getIsJobResource()))) &&
            ((this.isSalesRep==null && other.getIsSalesRep()==null) || 
             (this.isSalesRep!=null &&
              java.util.Arrays.equals(this.isSalesRep, other.getIsSalesRep()))) &&
            ((this.isSupportRep==null && other.getIsSupportRep()==null) || 
             (this.isSupportRep!=null &&
              java.util.Arrays.equals(this.isSupportRep, other.getIsSupportRep()))) &&
            ((this.isTemplate==null && other.getIsTemplate()==null) || 
             (this.isTemplate!=null &&
              java.util.Arrays.equals(this.isTemplate, other.getIsTemplate()))) &&
            ((this.laborCost==null && other.getLaborCost()==null) || 
             (this.laborCost!=null &&
              java.util.Arrays.equals(this.laborCost, other.getLaborCost()))) &&
            ((this.language==null && other.getLanguage()==null) || 
             (this.language!=null &&
              java.util.Arrays.equals(this.language, other.getLanguage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              java.util.Arrays.equals(this.lastName, other.getLastName()))) &&
            ((this.lastPaidDate==null && other.getLastPaidDate()==null) || 
             (this.lastPaidDate!=null &&
              java.util.Arrays.equals(this.lastPaidDate, other.getLastPaidDate()))) &&
            ((this.lastReviewDate==null && other.getLastReviewDate()==null) || 
             (this.lastReviewDate!=null &&
              java.util.Arrays.equals(this.lastReviewDate, other.getLastReviewDate()))) &&
            ((this.level==null && other.getLevel()==null) || 
             (this.level!=null &&
              java.util.Arrays.equals(this.level, other.getLevel()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              java.util.Arrays.equals(this.maritalStatus, other.getMaritalStatus()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              java.util.Arrays.equals(this.middleName, other.getMiddleName()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              java.util.Arrays.equals(this.mobilePhone, other.getMobilePhone()))) &&
            ((this.nextReviewDate==null && other.getNextReviewDate()==null) || 
             (this.nextReviewDate!=null &&
              java.util.Arrays.equals(this.nextReviewDate, other.getNextReviewDate()))) &&
            ((this.offlineAccess==null && other.getOfflineAccess()==null) || 
             (this.offlineAccess!=null &&
              java.util.Arrays.equals(this.offlineAccess, other.getOfflineAccess()))) &&
            ((this.payFrequency==null && other.getPayFrequency()==null) || 
             (this.payFrequency!=null &&
              java.util.Arrays.equals(this.payFrequency, other.getPayFrequency()))) &&
            ((this.permChangeDate==null && other.getPermChangeDate()==null) || 
             (this.permChangeDate!=null &&
              java.util.Arrays.equals(this.permChangeDate, other.getPermChangeDate()))) &&
            ((this.permChangeLevel==null && other.getPermChangeLevel()==null) || 
             (this.permChangeLevel!=null &&
              java.util.Arrays.equals(this.permChangeLevel, other.getPermChangeLevel()))) &&
            ((this.permission==null && other.getPermission()==null) || 
             (this.permission!=null &&
              java.util.Arrays.equals(this.permission, other.getPermission()))) &&
            ((this.permissionChange==null && other.getPermissionChange()==null) || 
             (this.permissionChange!=null &&
              java.util.Arrays.equals(this.permissionChange, other.getPermissionChange()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              java.util.Arrays.equals(this.phone, other.getPhone()))) &&
            ((this.phoneticName==null && other.getPhoneticName()==null) || 
             (this.phoneticName!=null &&
              java.util.Arrays.equals(this.phoneticName, other.getPhoneticName()))) &&
            ((this.primaryEarningAmount==null && other.getPrimaryEarningAmount()==null) || 
             (this.primaryEarningAmount!=null &&
              java.util.Arrays.equals(this.primaryEarningAmount, other.getPrimaryEarningAmount()))) &&
            ((this.primaryEarningItem==null && other.getPrimaryEarningItem()==null) || 
             (this.primaryEarningItem!=null &&
              java.util.Arrays.equals(this.primaryEarningItem, other.getPrimaryEarningItem()))) &&
            ((this.primaryEarningType==null && other.getPrimaryEarningType()==null) || 
             (this.primaryEarningType!=null &&
              java.util.Arrays.equals(this.primaryEarningType, other.getPrimaryEarningType()))) &&
            ((this.purchaseOrderApprovalLimit==null && other.getPurchaseOrderApprovalLimit()==null) || 
             (this.purchaseOrderApprovalLimit!=null &&
              java.util.Arrays.equals(this.purchaseOrderApprovalLimit, other.getPurchaseOrderApprovalLimit()))) &&
            ((this.purchaseOrderApprover==null && other.getPurchaseOrderApprover()==null) || 
             (this.purchaseOrderApprover!=null &&
              java.util.Arrays.equals(this.purchaseOrderApprover, other.getPurchaseOrderApprover()))) &&
            ((this.purchaseOrderLimit==null && other.getPurchaseOrderLimit()==null) || 
             (this.purchaseOrderLimit!=null &&
              java.util.Arrays.equals(this.purchaseOrderLimit, other.getPurchaseOrderLimit()))) &&
            ((this.releaseDate==null && other.getReleaseDate()==null) || 
             (this.releaseDate!=null &&
              java.util.Arrays.equals(this.releaseDate, other.getReleaseDate()))) &&
            ((this.residentStatus==null && other.getResidentStatus()==null) || 
             (this.residentStatus!=null &&
              java.util.Arrays.equals(this.residentStatus, other.getResidentStatus()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              java.util.Arrays.equals(this.role, other.getRole()))) &&
            ((this.roleChange==null && other.getRoleChange()==null) || 
             (this.roleChange!=null &&
              java.util.Arrays.equals(this.roleChange, other.getRoleChange()))) &&
            ((this.roleChangeAction==null && other.getRoleChangeAction()==null) || 
             (this.roleChangeAction!=null &&
              java.util.Arrays.equals(this.roleChangeAction, other.getRoleChangeAction()))) &&
            ((this.roleChangeDate==null && other.getRoleChangeDate()==null) || 
             (this.roleChangeDate!=null &&
              java.util.Arrays.equals(this.roleChangeDate, other.getRoleChangeDate()))) &&
            ((this.salesRole==null && other.getSalesRole()==null) || 
             (this.salesRole!=null &&
              java.util.Arrays.equals(this.salesRole, other.getSalesRole()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              java.util.Arrays.equals(this.salutation, other.getSalutation()))) &&
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
            ((this.socialSecurityNumber==null && other.getSocialSecurityNumber()==null) || 
             (this.socialSecurityNumber!=null &&
              java.util.Arrays.equals(this.socialSecurityNumber, other.getSocialSecurityNumber()))) &&
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
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              java.util.Arrays.equals(this.supervisor, other.getSupervisor()))) &&
            ((this.timeApprover==null && other.getTimeApprover()==null) || 
             (this.timeApprover!=null &&
              java.util.Arrays.equals(this.timeApprover, other.getTimeApprover()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.usePerquest==null && other.getUsePerquest()==null) || 
             (this.usePerquest!=null &&
              java.util.Arrays.equals(this.usePerquest, other.getUsePerquest()))) &&
            ((this.useTimeData==null && other.getUseTimeData()==null) || 
             (this.useTimeData!=null &&
              java.util.Arrays.equals(this.useTimeData, other.getUseTimeData()))) &&
            ((this.visaExpDate==null && other.getVisaExpDate()==null) || 
             (this.visaExpDate!=null &&
              java.util.Arrays.equals(this.visaExpDate, other.getVisaExpDate()))) &&
            ((this.visaType==null && other.getVisaType()==null) || 
             (this.visaType!=null &&
              java.util.Arrays.equals(this.visaType, other.getVisaType()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              java.util.Arrays.equals(this.workCalendar, other.getWorkCalendar()))) &&
            ((this.workplace==null && other.getWorkplace()==null) || 
             (this.workplace!=null &&
              java.util.Arrays.equals(this.workplace, other.getWorkplace()))) &&
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
        if (getAlienNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAlienNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAlienNumber(), i);
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
        if (getApprovalLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprovalLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprovalLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApprover(), i);
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
        if (getAuthWorkDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthWorkDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthWorkDate(), i);
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
        if (getBillingClass() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingClass());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingClass(), i);
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
        if (getBirthDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBirthDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBirthDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBirthDay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBirthDay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBirthDay(), i);
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
        if (getConcurrentWebServicesUser() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConcurrentWebServicesUser());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConcurrentWebServicesUser(), i);
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
        if (getEmployeeStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployeeType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployeeType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployeeType(), i);
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
        if (getEthnicity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEthnicity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEthnicity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseLimit(), i);
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
        if (getGender() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGender());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGender(), i);
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
        if (getHireDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHireDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHireDate(), i);
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
        if (getI9Verified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getI9Verified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getI9Verified(), i);
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
        if (getIsJobResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsJobResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsJobResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSalesRep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSalesRep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSalesRep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSupportRep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSupportRep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSupportRep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsTemplate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsTemplate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsTemplate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLaborCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLaborCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLaborCost(), i);
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
        if (getLastPaidDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastPaidDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastPaidDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastReviewDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastReviewDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastReviewDate(), i);
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
        if (getMaritalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaritalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaritalStatus(), i);
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
        if (getNextReviewDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextReviewDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextReviewDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfflineAccess() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfflineAccess());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfflineAccess(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayFrequency() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayFrequency());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayFrequency(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPermChangeDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermChangeDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermChangeDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPermChangeLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermChangeLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermChangeLevel(), i);
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
        if (getPermissionChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPermissionChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPermissionChange(), i);
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
        if (getPrimaryEarningAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryEarningAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryEarningAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryEarningItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryEarningItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryEarningItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryEarningType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryEarningType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryEarningType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderApprovalLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderApprovalLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderApprovalLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderApprover(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseOrderLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrderLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrderLimit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReleaseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReleaseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReleaseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResidentStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResidentStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResidentStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleChange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleChangeAction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleChangeAction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleChangeAction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoleChangeDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoleChangeDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoleChangeDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesRole(), i);
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
        if (getSocialSecurityNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSocialSecurityNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSocialSecurityNumber(), i);
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
        if (getSupervisor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupervisor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupervisor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTimeApprover() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeApprover());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeApprover(), i);
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
        if (getUsePerquest() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsePerquest());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsePerquest(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseTimeData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseTimeData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseTimeData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVisaExpDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisaExpDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisaExpDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVisaType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisaType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisaType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkCalendar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkCalendar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkCalendar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkplace() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkplace());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkplace(), i);
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
        new org.apache.axis.description.TypeDesc(EmployeeSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("alienNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "alienNumber"));
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
        elemField.setFieldName("approvalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "approvalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "approver"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("authWorkDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "authWorkDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingClass"));
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
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "birthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "birthDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("concurrentWebServicesUser");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "concurrentWebServicesUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employeeStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employeeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ethnicity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expenseLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "hireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("i9Verified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "i9Verified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("isJobResource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isJobResource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSalesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSupportRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSupportRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("lastPaidDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastPaidDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastReviewDate"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "maritalStatus"));
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
        elemField.setFieldName("nextReviewDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nextReviewDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offlineAccess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "offlineAccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "permChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permChangeLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "permChangeLevel"));
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
        elemField.setFieldName("permissionChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "permissionChange"));
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
        elemField.setFieldName("primaryEarningAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryEarningAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarningItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryEarningItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryEarningType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryEarningType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprovalLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrderApprovalLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrderApprover"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrderLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "releaseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("residentStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "residentStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "roleChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleChangeAction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "roleChangeAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roleChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "roleChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "socialSecurityNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "timeApprover"));
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
        elemField.setFieldName("usePerquest");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "usePerquest"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useTimeData");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "useTimeData"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "visaExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "visaType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
