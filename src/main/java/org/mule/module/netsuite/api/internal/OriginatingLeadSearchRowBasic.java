/**
 * OriginatingLeadSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class OriginatingLeadSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] altContact;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] balance;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingReason;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingTimeFrame;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccCustomerCode;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] ccDefault;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] ccExpDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccHolderName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] ccType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] companyName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] contact;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contribution;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contributionPrimary;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] conversionDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] creditHoldOverride;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] creditLimit;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateClosed;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOverdue;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] depositBalance;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] emailTransactions;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedBudget;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] explicitConversion;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] faxTransactions;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] firstName;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] firstOrderDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] firstSaleDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] giveAccess;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] groupPricingLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] hasDuplicates;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] homePhone;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBudgetApproved;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPerson;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isShipAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemPricingLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] itemPricingUnitPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobEndDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobProjectedEnd;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobStartDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] lastName;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] leadDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] leadSource;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] manualCreditHold;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] middleName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] mobilePhone;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] onCreditHold;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] overdueBalance;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partner;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] partnerContribution;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] partnerRole;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerTeamMember;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] pec;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] prefCCProcessor;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priceLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] pricingGroup;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] pricingItem;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] printTransactions;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] prospectDate;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] reminderDays;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] resaleNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] role;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesReadiness;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRep;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamMember;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamRole;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] salutation;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipComplete;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shippingItem;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] stage;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] taxable;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxItem;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] terms;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] territory;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unbilledOrders;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] url;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] vatRegNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] webLead;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public OriginatingLeadSearchRowBasic() {
    }

    public OriginatingLeadSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountNumber,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] altContact,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] balance,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingReason,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingTimeFrame,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccCustomerCode,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] ccDefault,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] ccExpDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccHolderName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccNumber,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] ccType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] companyName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] contact,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contribution,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contributionPrimary,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] conversionDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] creditHoldOverride,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] creditLimit,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateClosed,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOverdue,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] depositBalance,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] emailTransactions,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedBudget,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] explicitConversion,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] faxTransactions,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] firstName,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] firstOrderDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] firstSaleDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] giveAccess,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] groupPricingLevel,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] hasDuplicates,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] homePhone,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBudgetApproved,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isPerson,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isShipAddress,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemPricingLevel,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] itemPricingUnitPrice,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobEndDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobProjectedEnd,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobStartDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] lastName,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] leadDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] leadSource,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] manualCreditHold,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] middleName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] mobilePhone,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] onCreditHold,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] overdueBalance,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partner,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] partnerContribution,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] partnerRole,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerTeamMember,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] pec,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] prefCCProcessor,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priceLevel,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] pricingGroup,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] pricingItem,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] printTransactions,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] prospectDate,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] reminderDays,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] resaleNumber,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] role,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesReadiness,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRep,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamMember,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamRole,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] salutation,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipComplete,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shippingItem,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] stage,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] taxable,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxItem,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] terms,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] territory,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unbilledOrders,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] url,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] vatRegNumber,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] webLead,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.accountNumber = accountNumber;
           this.altContact = altContact;
           this.availableOffline = availableOffline;
           this.balance = balance;
           this.billAddress = billAddress;
           this.buyingReason = buyingReason;
           this.buyingTimeFrame = buyingTimeFrame;
           this.category = category;
           this.ccCustomerCode = ccCustomerCode;
           this.ccDefault = ccDefault;
           this.ccExpDate = ccExpDate;
           this.ccHolderName = ccHolderName;
           this.ccNumber = ccNumber;
           this.ccType = ccType;
           this.companyName = companyName;
           this.contact = contact;
           this.contribution = contribution;
           this.contributionPrimary = contributionPrimary;
           this.conversionDate = conversionDate;
           this.creditHoldOverride = creditHoldOverride;
           this.creditLimit = creditLimit;
           this.currency = currency;
           this.dateClosed = dateClosed;
           this.daysOverdue = daysOverdue;
           this.depositBalance = depositBalance;
           this.emailTransactions = emailTransactions;
           this.endDate = endDate;
           this.entityStatus = entityStatus;
           this.estimatedBudget = estimatedBudget;
           this.explicitConversion = explicitConversion;
           this.faxTransactions = faxTransactions;
           this.firstName = firstName;
           this.firstOrderDate = firstOrderDate;
           this.firstSaleDate = firstSaleDate;
           this.giveAccess = giveAccess;
           this.groupPricingLevel = groupPricingLevel;
           this.hasDuplicates = hasDuplicates;
           this.homePhone = homePhone;
           this.isBudgetApproved = isBudgetApproved;
           this.isPerson = isPerson;
           this.isShipAddress = isShipAddress;
           this.itemPricingLevel = itemPricingLevel;
           this.itemPricingUnitPrice = itemPricingUnitPrice;
           this.jobEndDate = jobEndDate;
           this.jobProjectedEnd = jobProjectedEnd;
           this.jobStartDate = jobStartDate;
           this.jobType = jobType;
           this.lastName = lastName;
           this.leadDate = leadDate;
           this.leadSource = leadSource;
           this.manualCreditHold = manualCreditHold;
           this.middleName = middleName;
           this.mobilePhone = mobilePhone;
           this.onCreditHold = onCreditHold;
           this.overdueBalance = overdueBalance;
           this.parent = parent;
           this.partner = partner;
           this.partnerContribution = partnerContribution;
           this.partnerRole = partnerRole;
           this.partnerTeamMember = partnerTeamMember;
           this.pec = pec;
           this.prefCCProcessor = prefCCProcessor;
           this.priceLevel = priceLevel;
           this.pricingGroup = pricingGroup;
           this.pricingItem = pricingItem;
           this.printTransactions = printTransactions;
           this.prospectDate = prospectDate;
           this.reminderDays = reminderDays;
           this.resaleNumber = resaleNumber;
           this.role = role;
           this.salesReadiness = salesReadiness;
           this.salesRep = salesRep;
           this.salesTeamMember = salesTeamMember;
           this.salesTeamRole = salesTeamRole;
           this.salutation = salutation;
           this.shipAddress = shipAddress;
           this.shipComplete = shipComplete;
           this.shippingItem = shippingItem;
           this.stage = stage;
           this.startDate = startDate;
           this.taxable = taxable;
           this.taxItem = taxItem;
           this.terms = terms;
           this.territory = territory;
           this.title = title;
           this.unbilledOrders = unbilledOrders;
           this.url = url;
           this.vatRegNumber = vatRegNumber;
           this.webLead = webLead;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the accountNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return accountNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this OriginatingLeadSearchRowBasic.
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
     * Gets the altContact value for this OriginatingLeadSearchRowBasic.
     * 
     * @return altContact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAltContact() {
        return altContact;
    }


    /**
     * Sets the altContact value for this OriginatingLeadSearchRowBasic.
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
     * Gets the availableOffline value for this OriginatingLeadSearchRowBasic.
     * 
     * @return availableOffline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this OriginatingLeadSearchRowBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }


    /**
     * Gets the balance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return balance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param balance
     */
    public void setBalance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] balance) {
        this.balance = balance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.balance[i] = _value;
    }


    /**
     * Gets the billAddress value for this OriginatingLeadSearchRowBasic.
     * 
     * @return billAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this OriginatingLeadSearchRowBasic.
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
     * Gets the buyingReason value for this OriginatingLeadSearchRowBasic.
     * 
     * @return buyingReason
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this OriginatingLeadSearchRowBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingReason) {
        this.buyingReason = buyingReason;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBuyingReason(int i) {
        return this.buyingReason[i];
    }

    public void setBuyingReason(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.buyingReason[i] = _value;
    }


    /**
     * Gets the buyingTimeFrame value for this OriginatingLeadSearchRowBasic.
     * 
     * @return buyingTimeFrame
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this OriginatingLeadSearchRowBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(org.mule.module.netsuite.api.internal.SearchColumnStringField[] buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBuyingTimeFrame(int i) {
        return this.buyingTimeFrame[i];
    }

    public void setBuyingTimeFrame(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.buyingTimeFrame[i] = _value;
    }


    /**
     * Gets the category value for this OriginatingLeadSearchRowBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this OriginatingLeadSearchRowBasic.
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
     * Gets the ccCustomerCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccCustomerCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccCustomerCode
     */
    public void setCcCustomerCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCcCustomerCode(int i) {
        return this.ccCustomerCode[i];
    }

    public void setCcCustomerCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.ccCustomerCode[i] = _value;
    }


    /**
     * Gets the ccDefault value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccDefault
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getCcDefault() {
        return ccDefault;
    }


    /**
     * Sets the ccDefault value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccDefault
     */
    public void setCcDefault(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] ccDefault) {
        this.ccDefault = ccDefault;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getCcDefault(int i) {
        return this.ccDefault[i];
    }

    public void setCcDefault(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.ccDefault[i] = _value;
    }


    /**
     * Gets the ccExpDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccExpDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCcExpDate() {
        return ccExpDate;
    }


    /**
     * Sets the ccExpDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccExpDate
     */
    public void setCcExpDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] ccExpDate) {
        this.ccExpDate = ccExpDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCcExpDate(int i) {
        return this.ccExpDate[i];
    }

    public void setCcExpDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.ccExpDate[i] = _value;
    }


    /**
     * Gets the ccHolderName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccHolderName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcHolderName() {
        return ccHolderName;
    }


    /**
     * Sets the ccHolderName value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccHolderName
     */
    public void setCcHolderName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccHolderName) {
        this.ccHolderName = ccHolderName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCcHolderName(int i) {
        return this.ccHolderName[i];
    }

    public void setCcHolderName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.ccHolderName[i] = _value;
    }


    /**
     * Gets the ccNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccNumber
     */
    public void setCcNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccNumber) {
        this.ccNumber = ccNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCcNumber(int i) {
        return this.ccNumber[i];
    }

    public void setCcNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.ccNumber[i] = _value;
    }


    /**
     * Gets the ccType value for this OriginatingLeadSearchRowBasic.
     * 
     * @return ccType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCcType() {
        return ccType;
    }


    /**
     * Sets the ccType value for this OriginatingLeadSearchRowBasic.
     * 
     * @param ccType
     */
    public void setCcType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] ccType) {
        this.ccType = ccType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCcType(int i) {
        return this.ccType[i];
    }

    public void setCcType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.ccType[i] = _value;
    }


    /**
     * Gets the companyName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return companyName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this OriginatingLeadSearchRowBasic.
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
     * Gets the contact value for this OriginatingLeadSearchRowBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this OriginatingLeadSearchRowBasic.
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
     * Gets the contribution value for this OriginatingLeadSearchRowBasic.
     * 
     * @return contribution
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this OriginatingLeadSearchRowBasic.
     * 
     * @param contribution
     */
    public void setContribution(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contribution) {
        this.contribution = contribution;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getContribution(int i) {
        return this.contribution[i];
    }

    public void setContribution(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.contribution[i] = _value;
    }


    /**
     * Gets the contributionPrimary value for this OriginatingLeadSearchRowBasic.
     * 
     * @return contributionPrimary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getContributionPrimary() {
        return contributionPrimary;
    }


    /**
     * Sets the contributionPrimary value for this OriginatingLeadSearchRowBasic.
     * 
     * @param contributionPrimary
     */
    public void setContributionPrimary(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contributionPrimary) {
        this.contributionPrimary = contributionPrimary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getContributionPrimary(int i) {
        return this.contributionPrimary[i];
    }

    public void setContributionPrimary(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.contributionPrimary[i] = _value;
    }


    /**
     * Gets the conversionDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return conversionDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getConversionDate() {
        return conversionDate;
    }


    /**
     * Sets the conversionDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param conversionDate
     */
    public void setConversionDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] conversionDate) {
        this.conversionDate = conversionDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getConversionDate(int i) {
        return this.conversionDate[i];
    }

    public void setConversionDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.conversionDate[i] = _value;
    }


    /**
     * Gets the creditHoldOverride value for this OriginatingLeadSearchRowBasic.
     * 
     * @return creditHoldOverride
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getCreditHoldOverride() {
        return creditHoldOverride;
    }


    /**
     * Sets the creditHoldOverride value for this OriginatingLeadSearchRowBasic.
     * 
     * @param creditHoldOverride
     */
    public void setCreditHoldOverride(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getCreditHoldOverride(int i) {
        return this.creditHoldOverride[i];
    }

    public void setCreditHoldOverride(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.creditHoldOverride[i] = _value;
    }


    /**
     * Gets the creditLimit value for this OriginatingLeadSearchRowBasic.
     * 
     * @return creditLimit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this OriginatingLeadSearchRowBasic.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] creditLimit) {
        this.creditLimit = creditLimit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCreditLimit(int i) {
        return this.creditLimit[i];
    }

    public void setCreditLimit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.creditLimit[i] = _value;
    }


    /**
     * Gets the currency value for this OriginatingLeadSearchRowBasic.
     * 
     * @return currency
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OriginatingLeadSearchRowBasic.
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
     * Gets the dateClosed value for this OriginatingLeadSearchRowBasic.
     * 
     * @return dateClosed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateClosed() {
        return dateClosed;
    }


    /**
     * Sets the dateClosed value for this OriginatingLeadSearchRowBasic.
     * 
     * @param dateClosed
     */
    public void setDateClosed(org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateClosed) {
        this.dateClosed = dateClosed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDateClosed(int i) {
        return this.dateClosed[i];
    }

    public void setDateClosed(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.dateClosed[i] = _value;
    }


    /**
     * Gets the daysOverdue value for this OriginatingLeadSearchRowBasic.
     * 
     * @return daysOverdue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this OriginatingLeadSearchRowBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDaysOverdue(int i) {
        return this.daysOverdue[i];
    }

    public void setDaysOverdue(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.daysOverdue[i] = _value;
    }


    /**
     * Gets the depositBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return depositBalance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDepositBalance() {
        return depositBalance;
    }


    /**
     * Sets the depositBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param depositBalance
     */
    public void setDepositBalance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] depositBalance) {
        this.depositBalance = depositBalance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDepositBalance(int i) {
        return this.depositBalance[i];
    }

    public void setDepositBalance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.depositBalance[i] = _value;
    }


    /**
     * Gets the emailTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @return emailTransactions
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @param emailTransactions
     */
    public void setEmailTransactions(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] emailTransactions) {
        this.emailTransactions = emailTransactions;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getEmailTransactions(int i) {
        return this.emailTransactions[i];
    }

    public void setEmailTransactions(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.emailTransactions[i] = _value;
    }


    /**
     * Gets the endDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this OriginatingLeadSearchRowBasic.
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
     * Gets the entityStatus value for this OriginatingLeadSearchRowBasic.
     * 
     * @return entityStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this OriginatingLeadSearchRowBasic.
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
     * Gets the estimatedBudget value for this OriginatingLeadSearchRowBasic.
     * 
     * @return estimatedBudget
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this OriginatingLeadSearchRowBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedBudget(int i) {
        return this.estimatedBudget[i];
    }

    public void setEstimatedBudget(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedBudget[i] = _value;
    }


    /**
     * Gets the explicitConversion value for this OriginatingLeadSearchRowBasic.
     * 
     * @return explicitConversion
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getExplicitConversion() {
        return explicitConversion;
    }


    /**
     * Sets the explicitConversion value for this OriginatingLeadSearchRowBasic.
     * 
     * @param explicitConversion
     */
    public void setExplicitConversion(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] explicitConversion) {
        this.explicitConversion = explicitConversion;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getExplicitConversion(int i) {
        return this.explicitConversion[i];
    }

    public void setExplicitConversion(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.explicitConversion[i] = _value;
    }


    /**
     * Gets the faxTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @return faxTransactions
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @param faxTransactions
     */
    public void setFaxTransactions(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] faxTransactions) {
        this.faxTransactions = faxTransactions;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getFaxTransactions(int i) {
        return this.faxTransactions[i];
    }

    public void setFaxTransactions(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.faxTransactions[i] = _value;
    }


    /**
     * Gets the firstName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return firstName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this OriginatingLeadSearchRowBasic.
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
     * Gets the firstOrderDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return firstOrderDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getFirstOrderDate() {
        return firstOrderDate;
    }


    /**
     * Sets the firstOrderDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param firstOrderDate
     */
    public void setFirstOrderDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getFirstOrderDate(int i) {
        return this.firstOrderDate[i];
    }

    public void setFirstOrderDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.firstOrderDate[i] = _value;
    }


    /**
     * Gets the firstSaleDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return firstSaleDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getFirstSaleDate() {
        return firstSaleDate;
    }


    /**
     * Sets the firstSaleDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param firstSaleDate
     */
    public void setFirstSaleDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] firstSaleDate) {
        this.firstSaleDate = firstSaleDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getFirstSaleDate(int i) {
        return this.firstSaleDate[i];
    }

    public void setFirstSaleDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.firstSaleDate[i] = _value;
    }


    /**
     * Gets the giveAccess value for this OriginatingLeadSearchRowBasic.
     * 
     * @return giveAccess
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getGiveAccess() {
        return giveAccess;
    }


    /**
     * Sets the giveAccess value for this OriginatingLeadSearchRowBasic.
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
     * Gets the groupPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @return groupPricingLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGroupPricingLevel() {
        return groupPricingLevel;
    }


    /**
     * Sets the groupPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @param groupPricingLevel
     */
    public void setGroupPricingLevel(org.mule.module.netsuite.api.internal.SearchColumnStringField[] groupPricingLevel) {
        this.groupPricingLevel = groupPricingLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGroupPricingLevel(int i) {
        return this.groupPricingLevel[i];
    }

    public void setGroupPricingLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.groupPricingLevel[i] = _value;
    }


    /**
     * Gets the hasDuplicates value for this OriginatingLeadSearchRowBasic.
     * 
     * @return hasDuplicates
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this OriginatingLeadSearchRowBasic.
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
     * Gets the homePhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return homePhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getHomePhone() {
        return homePhone;
    }


    /**
     * Sets the homePhone value for this OriginatingLeadSearchRowBasic.
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
     * Gets the isBudgetApproved value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isBudgetApproved
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this OriginatingLeadSearchRowBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsBudgetApproved(int i) {
        return this.isBudgetApproved[i];
    }

    public void setIsBudgetApproved(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isBudgetApproved[i] = _value;
    }


    /**
     * Gets the isPerson value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isPerson
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this OriginatingLeadSearchRowBasic.
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
     * Gets the isShipAddress value for this OriginatingLeadSearchRowBasic.
     * 
     * @return isShipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this OriginatingLeadSearchRowBasic.
     * 
     * @param isShipAddress
     */
    public void setIsShipAddress(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isShipAddress) {
        this.isShipAddress = isShipAddress;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsShipAddress(int i) {
        return this.isShipAddress[i];
    }

    public void setIsShipAddress(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isShipAddress[i] = _value;
    }


    /**
     * Gets the itemPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @return itemPricingLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getItemPricingLevel() {
        return itemPricingLevel;
    }


    /**
     * Sets the itemPricingLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @param itemPricingLevel
     */
    public void setItemPricingLevel(org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemPricingLevel) {
        this.itemPricingLevel = itemPricingLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getItemPricingLevel(int i) {
        return this.itemPricingLevel[i];
    }

    public void setItemPricingLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.itemPricingLevel[i] = _value;
    }


    /**
     * Gets the itemPricingUnitPrice value for this OriginatingLeadSearchRowBasic.
     * 
     * @return itemPricingUnitPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getItemPricingUnitPrice() {
        return itemPricingUnitPrice;
    }


    /**
     * Sets the itemPricingUnitPrice value for this OriginatingLeadSearchRowBasic.
     * 
     * @param itemPricingUnitPrice
     */
    public void setItemPricingUnitPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] itemPricingUnitPrice) {
        this.itemPricingUnitPrice = itemPricingUnitPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getItemPricingUnitPrice(int i) {
        return this.itemPricingUnitPrice[i];
    }

    public void setItemPricingUnitPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.itemPricingUnitPrice[i] = _value;
    }


    /**
     * Gets the jobEndDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobEndDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getJobEndDate() {
        return jobEndDate;
    }


    /**
     * Sets the jobEndDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobEndDate
     */
    public void setJobEndDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getJobEndDate(int i) {
        return this.jobEndDate[i];
    }

    public void setJobEndDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.jobEndDate[i] = _value;
    }


    /**
     * Gets the jobProjectedEnd value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobProjectedEnd
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getJobProjectedEnd() {
        return jobProjectedEnd;
    }


    /**
     * Sets the jobProjectedEnd value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobProjectedEnd
     */
    public void setJobProjectedEnd(org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobProjectedEnd) {
        this.jobProjectedEnd = jobProjectedEnd;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getJobProjectedEnd(int i) {
        return this.jobProjectedEnd[i];
    }

    public void setJobProjectedEnd(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.jobProjectedEnd[i] = _value;
    }


    /**
     * Gets the jobStartDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobStartDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getJobStartDate() {
        return jobStartDate;
    }


    /**
     * Sets the jobStartDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobStartDate
     */
    public void setJobStartDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getJobStartDate(int i) {
        return this.jobStartDate[i];
    }

    public void setJobStartDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.jobStartDate[i] = _value;
    }


    /**
     * Gets the jobType value for this OriginatingLeadSearchRowBasic.
     * 
     * @return jobType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getJobType() {
        return jobType;
    }


    /**
     * Sets the jobType value for this OriginatingLeadSearchRowBasic.
     * 
     * @param jobType
     */
    public void setJobType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] jobType) {
        this.jobType = jobType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getJobType(int i) {
        return this.jobType[i];
    }

    public void setJobType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.jobType[i] = _value;
    }


    /**
     * Gets the lastName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return lastName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this OriginatingLeadSearchRowBasic.
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
     * Gets the leadDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return leadDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLeadDate() {
        return leadDate;
    }


    /**
     * Sets the leadDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param leadDate
     */
    public void setLeadDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] leadDate) {
        this.leadDate = leadDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLeadDate(int i) {
        return this.leadDate[i];
    }

    public void setLeadDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.leadDate[i] = _value;
    }


    /**
     * Gets the leadSource value for this OriginatingLeadSearchRowBasic.
     * 
     * @return leadSource
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this OriginatingLeadSearchRowBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] leadSource) {
        this.leadSource = leadSource;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getLeadSource(int i) {
        return this.leadSource[i];
    }

    public void setLeadSource(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.leadSource[i] = _value;
    }


    /**
     * Gets the manualCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @return manualCreditHold
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getManualCreditHold() {
        return manualCreditHold;
    }


    /**
     * Sets the manualCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @param manualCreditHold
     */
    public void setManualCreditHold(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] manualCreditHold) {
        this.manualCreditHold = manualCreditHold;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getManualCreditHold(int i) {
        return this.manualCreditHold[i];
    }

    public void setManualCreditHold(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.manualCreditHold[i] = _value;
    }


    /**
     * Gets the middleName value for this OriginatingLeadSearchRowBasic.
     * 
     * @return middleName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this OriginatingLeadSearchRowBasic.
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
     * Gets the mobilePhone value for this OriginatingLeadSearchRowBasic.
     * 
     * @return mobilePhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMobilePhone() {
        return mobilePhone;
    }


    /**
     * Sets the mobilePhone value for this OriginatingLeadSearchRowBasic.
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
     * Gets the onCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @return onCreditHold
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getOnCreditHold() {
        return onCreditHold;
    }


    /**
     * Sets the onCreditHold value for this OriginatingLeadSearchRowBasic.
     * 
     * @param onCreditHold
     */
    public void setOnCreditHold(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] onCreditHold) {
        this.onCreditHold = onCreditHold;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getOnCreditHold(int i) {
        return this.onCreditHold[i];
    }

    public void setOnCreditHold(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.onCreditHold[i] = _value;
    }


    /**
     * Gets the overdueBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @return overdueBalance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getOverdueBalance() {
        return overdueBalance;
    }


    /**
     * Sets the overdueBalance value for this OriginatingLeadSearchRowBasic.
     * 
     * @param overdueBalance
     */
    public void setOverdueBalance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] overdueBalance) {
        this.overdueBalance = overdueBalance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getOverdueBalance(int i) {
        return this.overdueBalance[i];
    }

    public void setOverdueBalance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.overdueBalance[i] = _value;
    }


    /**
     * Gets the parent value for this OriginatingLeadSearchRowBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this OriginatingLeadSearchRowBasic.
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
     * Gets the partner value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this OriginatingLeadSearchRowBasic.
     * 
     * @param partner
     */
    public void setPartner(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partner) {
        this.partner = partner;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPartner(int i) {
        return this.partner[i];
    }

    public void setPartner(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.partner[i] = _value;
    }


    /**
     * Gets the partnerContribution value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partnerContribution
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this OriginatingLeadSearchRowBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPartnerContribution(int i) {
        return this.partnerContribution[i];
    }

    public void setPartnerContribution(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.partnerContribution[i] = _value;
    }


    /**
     * Gets the partnerRole value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partnerRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this OriginatingLeadSearchRowBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(org.mule.module.netsuite.api.internal.SearchColumnStringField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.partnerRole[i] = _value;
    }


    /**
     * Gets the partnerTeamMember value for this OriginatingLeadSearchRowBasic.
     * 
     * @return partnerTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this OriginatingLeadSearchRowBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPartnerTeamMember(int i) {
        return this.partnerTeamMember[i];
    }

    public void setPartnerTeamMember(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.partnerTeamMember[i] = _value;
    }


    /**
     * Gets the pec value for this OriginatingLeadSearchRowBasic.
     * 
     * @return pec
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPec() {
        return pec;
    }


    /**
     * Sets the pec value for this OriginatingLeadSearchRowBasic.
     * 
     * @param pec
     */
    public void setPec(org.mule.module.netsuite.api.internal.SearchColumnStringField[] pec) {
        this.pec = pec;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPec(int i) {
        return this.pec[i];
    }

    public void setPec(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.pec[i] = _value;
    }


    /**
     * Gets the prefCCProcessor value for this OriginatingLeadSearchRowBasic.
     * 
     * @return prefCCProcessor
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPrefCCProcessor() {
        return prefCCProcessor;
    }


    /**
     * Sets the prefCCProcessor value for this OriginatingLeadSearchRowBasic.
     * 
     * @param prefCCProcessor
     */
    public void setPrefCCProcessor(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] prefCCProcessor) {
        this.prefCCProcessor = prefCCProcessor;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPrefCCProcessor(int i) {
        return this.prefCCProcessor[i];
    }

    public void setPrefCCProcessor(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.prefCCProcessor[i] = _value;
    }


    /**
     * Gets the priceLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @return priceLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this OriginatingLeadSearchRowBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priceLevel) {
        this.priceLevel = priceLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPriceLevel(int i) {
        return this.priceLevel[i];
    }

    public void setPriceLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.priceLevel[i] = _value;
    }


    /**
     * Gets the pricingGroup value for this OriginatingLeadSearchRowBasic.
     * 
     * @return pricingGroup
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this OriginatingLeadSearchRowBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(org.mule.module.netsuite.api.internal.SearchColumnStringField[] pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPricingGroup(int i) {
        return this.pricingGroup[i];
    }

    public void setPricingGroup(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.pricingGroup[i] = _value;
    }


    /**
     * Gets the pricingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @return pricingItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPricingItem() {
        return pricingItem;
    }


    /**
     * Sets the pricingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @param pricingItem
     */
    public void setPricingItem(org.mule.module.netsuite.api.internal.SearchColumnStringField[] pricingItem) {
        this.pricingItem = pricingItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPricingItem(int i) {
        return this.pricingItem[i];
    }

    public void setPricingItem(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.pricingItem[i] = _value;
    }


    /**
     * Gets the printTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @return printTransactions
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this OriginatingLeadSearchRowBasic.
     * 
     * @param printTransactions
     */
    public void setPrintTransactions(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] printTransactions) {
        this.printTransactions = printTransactions;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getPrintTransactions(int i) {
        return this.printTransactions[i];
    }

    public void setPrintTransactions(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.printTransactions[i] = _value;
    }


    /**
     * Gets the prospectDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return prospectDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getProspectDate() {
        return prospectDate;
    }


    /**
     * Sets the prospectDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @param prospectDate
     */
    public void setProspectDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] prospectDate) {
        this.prospectDate = prospectDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getProspectDate(int i) {
        return this.prospectDate[i];
    }

    public void setProspectDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.prospectDate[i] = _value;
    }


    /**
     * Gets the reminderDays value for this OriginatingLeadSearchRowBasic.
     * 
     * @return reminderDays
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getReminderDays() {
        return reminderDays;
    }


    /**
     * Sets the reminderDays value for this OriginatingLeadSearchRowBasic.
     * 
     * @param reminderDays
     */
    public void setReminderDays(org.mule.module.netsuite.api.internal.SearchColumnLongField[] reminderDays) {
        this.reminderDays = reminderDays;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getReminderDays(int i) {
        return this.reminderDays[i];
    }

    public void setReminderDays(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.reminderDays[i] = _value;
    }


    /**
     * Gets the resaleNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return resaleNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getResaleNumber() {
        return resaleNumber;
    }


    /**
     * Sets the resaleNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @param resaleNumber
     */
    public void setResaleNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] resaleNumber) {
        this.resaleNumber = resaleNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getResaleNumber(int i) {
        return this.resaleNumber[i];
    }

    public void setResaleNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.resaleNumber[i] = _value;
    }


    /**
     * Gets the role value for this OriginatingLeadSearchRowBasic.
     * 
     * @return role
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getRole() {
        return role;
    }


    /**
     * Sets the role value for this OriginatingLeadSearchRowBasic.
     * 
     * @param role
     */
    public void setRole(org.mule.module.netsuite.api.internal.SearchColumnStringField[] role) {
        this.role = role;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.role[i] = _value;
    }


    /**
     * Gets the salesReadiness value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesReadiness
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this OriginatingLeadSearchRowBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSalesReadiness(int i) {
        return this.salesReadiness[i];
    }

    public void setSalesReadiness(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.salesReadiness[i] = _value;
    }


    /**
     * Gets the salesRep value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this OriginatingLeadSearchRowBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRep) {
        this.salesRep = salesRep;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesRep(int i) {
        return this.salesRep[i];
    }

    public void setSalesRep(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesRep[i] = _value;
    }


    /**
     * Gets the salesTeamMember value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this OriginatingLeadSearchRowBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesTeamMember(int i) {
        return this.salesTeamMember[i];
    }

    public void setSalesTeamMember(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesTeamMember[i] = _value;
    }


    /**
     * Gets the salesTeamRole value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salesTeamRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this OriginatingLeadSearchRowBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesTeamRole(int i) {
        return this.salesTeamRole[i];
    }

    public void setSalesTeamRole(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesTeamRole[i] = _value;
    }


    /**
     * Gets the salutation value for this OriginatingLeadSearchRowBasic.
     * 
     * @return salutation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipAddress value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this OriginatingLeadSearchRowBasic.
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
     * Gets the shipComplete value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shipComplete
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this OriginatingLeadSearchRowBasic.
     * 
     * @param shipComplete
     */
    public void setShipComplete(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipComplete) {
        this.shipComplete = shipComplete;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getShipComplete(int i) {
        return this.shipComplete[i];
    }

    public void setShipComplete(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.shipComplete[i] = _value;
    }


    /**
     * Gets the shippingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @return shippingItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getShippingItem() {
        return shippingItem;
    }


    /**
     * Sets the shippingItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @param shippingItem
     */
    public void setShippingItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shippingItem) {
        this.shippingItem = shippingItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getShippingItem(int i) {
        return this.shippingItem[i];
    }

    public void setShippingItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.shippingItem[i] = _value;
    }


    /**
     * Gets the stage value for this OriginatingLeadSearchRowBasic.
     * 
     * @return stage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this OriginatingLeadSearchRowBasic.
     * 
     * @param stage
     */
    public void setStage(org.mule.module.netsuite.api.internal.SearchColumnStringField[] stage) {
        this.stage = stage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.stage[i] = _value;
    }


    /**
     * Gets the startDate value for this OriginatingLeadSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this OriginatingLeadSearchRowBasic.
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
     * Gets the taxable value for this OriginatingLeadSearchRowBasic.
     * 
     * @return taxable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this OriginatingLeadSearchRowBasic.
     * 
     * @param taxable
     */
    public void setTaxable(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] taxable) {
        this.taxable = taxable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getTaxable(int i) {
        return this.taxable[i];
    }

    public void setTaxable(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.taxable[i] = _value;
    }


    /**
     * Gets the taxItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @return taxItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this OriginatingLeadSearchRowBasic.
     * 
     * @param taxItem
     */
    public void setTaxItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxItem) {
        this.taxItem = taxItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTaxItem(int i) {
        return this.taxItem[i];
    }

    public void setTaxItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.taxItem[i] = _value;
    }


    /**
     * Gets the terms value for this OriginatingLeadSearchRowBasic.
     * 
     * @return terms
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this OriginatingLeadSearchRowBasic.
     * 
     * @param terms
     */
    public void setTerms(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] terms) {
        this.terms = terms;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTerms(int i) {
        return this.terms[i];
    }

    public void setTerms(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.terms[i] = _value;
    }


    /**
     * Gets the territory value for this OriginatingLeadSearchRowBasic.
     * 
     * @return territory
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTerritory() {
        return territory;
    }


    /**
     * Sets the territory value for this OriginatingLeadSearchRowBasic.
     * 
     * @param territory
     */
    public void setTerritory(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] territory) {
        this.territory = territory;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTerritory(int i) {
        return this.territory[i];
    }

    public void setTerritory(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.territory[i] = _value;
    }


    /**
     * Gets the title value for this OriginatingLeadSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OriginatingLeadSearchRowBasic.
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
     * Gets the unbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @return unbilledOrders
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this OriginatingLeadSearchRowBasic.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getUnbilledOrders(int i) {
        return this.unbilledOrders[i];
    }

    public void setUnbilledOrders(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.unbilledOrders[i] = _value;
    }


    /**
     * Gets the url value for this OriginatingLeadSearchRowBasic.
     * 
     * @return url
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getUrl() {
        return url;
    }


    /**
     * Sets the url value for this OriginatingLeadSearchRowBasic.
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
     * Gets the vatRegNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @return vatRegNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this OriginatingLeadSearchRowBasic.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getVatRegNumber(int i) {
        return this.vatRegNumber[i];
    }

    public void setVatRegNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.vatRegNumber[i] = _value;
    }


    /**
     * Gets the webLead value for this OriginatingLeadSearchRowBasic.
     * 
     * @return webLead
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getWebLead() {
        return webLead;
    }


    /**
     * Sets the webLead value for this OriginatingLeadSearchRowBasic.
     * 
     * @param webLead
     */
    public void setWebLead(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] webLead) {
        this.webLead = webLead;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getWebLead(int i) {
        return this.webLead[i];
    }

    public void setWebLead(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.webLead[i] = _value;
    }


    /**
     * Gets the customFieldList value for this OriginatingLeadSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this OriginatingLeadSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginatingLeadSearchRowBasic)) return false;
        OriginatingLeadSearchRowBasic other = (OriginatingLeadSearchRowBasic) obj;
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
            ((this.altContact==null && other.getAltContact()==null) || 
             (this.altContact!=null &&
              java.util.Arrays.equals(this.altContact, other.getAltContact()))) &&
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              java.util.Arrays.equals(this.availableOffline, other.getAvailableOffline()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              java.util.Arrays.equals(this.balance, other.getBalance()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              java.util.Arrays.equals(this.billAddress, other.getBillAddress()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              java.util.Arrays.equals(this.buyingReason, other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              java.util.Arrays.equals(this.buyingTimeFrame, other.getBuyingTimeFrame()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              java.util.Arrays.equals(this.ccCustomerCode, other.getCcCustomerCode()))) &&
            ((this.ccDefault==null && other.getCcDefault()==null) || 
             (this.ccDefault!=null &&
              java.util.Arrays.equals(this.ccDefault, other.getCcDefault()))) &&
            ((this.ccExpDate==null && other.getCcExpDate()==null) || 
             (this.ccExpDate!=null &&
              java.util.Arrays.equals(this.ccExpDate, other.getCcExpDate()))) &&
            ((this.ccHolderName==null && other.getCcHolderName()==null) || 
             (this.ccHolderName!=null &&
              java.util.Arrays.equals(this.ccHolderName, other.getCcHolderName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              java.util.Arrays.equals(this.ccNumber, other.getCcNumber()))) &&
            ((this.ccType==null && other.getCcType()==null) || 
             (this.ccType!=null &&
              java.util.Arrays.equals(this.ccType, other.getCcType()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              java.util.Arrays.equals(this.companyName, other.getCompanyName()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              java.util.Arrays.equals(this.contribution, other.getContribution()))) &&
            ((this.contributionPrimary==null && other.getContributionPrimary()==null) || 
             (this.contributionPrimary!=null &&
              java.util.Arrays.equals(this.contributionPrimary, other.getContributionPrimary()))) &&
            ((this.conversionDate==null && other.getConversionDate()==null) || 
             (this.conversionDate!=null &&
              java.util.Arrays.equals(this.conversionDate, other.getConversionDate()))) &&
            ((this.creditHoldOverride==null && other.getCreditHoldOverride()==null) || 
             (this.creditHoldOverride!=null &&
              java.util.Arrays.equals(this.creditHoldOverride, other.getCreditHoldOverride()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              java.util.Arrays.equals(this.creditLimit, other.getCreditLimit()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.dateClosed==null && other.getDateClosed()==null) || 
             (this.dateClosed!=null &&
              java.util.Arrays.equals(this.dateClosed, other.getDateClosed()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              java.util.Arrays.equals(this.daysOverdue, other.getDaysOverdue()))) &&
            ((this.depositBalance==null && other.getDepositBalance()==null) || 
             (this.depositBalance!=null &&
              java.util.Arrays.equals(this.depositBalance, other.getDepositBalance()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              java.util.Arrays.equals(this.emailTransactions, other.getEmailTransactions()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              java.util.Arrays.equals(this.estimatedBudget, other.getEstimatedBudget()))) &&
            ((this.explicitConversion==null && other.getExplicitConversion()==null) || 
             (this.explicitConversion!=null &&
              java.util.Arrays.equals(this.explicitConversion, other.getExplicitConversion()))) &&
            ((this.faxTransactions==null && other.getFaxTransactions()==null) || 
             (this.faxTransactions!=null &&
              java.util.Arrays.equals(this.faxTransactions, other.getFaxTransactions()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              java.util.Arrays.equals(this.firstName, other.getFirstName()))) &&
            ((this.firstOrderDate==null && other.getFirstOrderDate()==null) || 
             (this.firstOrderDate!=null &&
              java.util.Arrays.equals(this.firstOrderDate, other.getFirstOrderDate()))) &&
            ((this.firstSaleDate==null && other.getFirstSaleDate()==null) || 
             (this.firstSaleDate!=null &&
              java.util.Arrays.equals(this.firstSaleDate, other.getFirstSaleDate()))) &&
            ((this.giveAccess==null && other.getGiveAccess()==null) || 
             (this.giveAccess!=null &&
              java.util.Arrays.equals(this.giveAccess, other.getGiveAccess()))) &&
            ((this.groupPricingLevel==null && other.getGroupPricingLevel()==null) || 
             (this.groupPricingLevel!=null &&
              java.util.Arrays.equals(this.groupPricingLevel, other.getGroupPricingLevel()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              java.util.Arrays.equals(this.hasDuplicates, other.getHasDuplicates()))) &&
            ((this.homePhone==null && other.getHomePhone()==null) || 
             (this.homePhone!=null &&
              java.util.Arrays.equals(this.homePhone, other.getHomePhone()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              java.util.Arrays.equals(this.isBudgetApproved, other.getIsBudgetApproved()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              java.util.Arrays.equals(this.isPerson, other.getIsPerson()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              java.util.Arrays.equals(this.isShipAddress, other.getIsShipAddress()))) &&
            ((this.itemPricingLevel==null && other.getItemPricingLevel()==null) || 
             (this.itemPricingLevel!=null &&
              java.util.Arrays.equals(this.itemPricingLevel, other.getItemPricingLevel()))) &&
            ((this.itemPricingUnitPrice==null && other.getItemPricingUnitPrice()==null) || 
             (this.itemPricingUnitPrice!=null &&
              java.util.Arrays.equals(this.itemPricingUnitPrice, other.getItemPricingUnitPrice()))) &&
            ((this.jobEndDate==null && other.getJobEndDate()==null) || 
             (this.jobEndDate!=null &&
              java.util.Arrays.equals(this.jobEndDate, other.getJobEndDate()))) &&
            ((this.jobProjectedEnd==null && other.getJobProjectedEnd()==null) || 
             (this.jobProjectedEnd!=null &&
              java.util.Arrays.equals(this.jobProjectedEnd, other.getJobProjectedEnd()))) &&
            ((this.jobStartDate==null && other.getJobStartDate()==null) || 
             (this.jobStartDate!=null &&
              java.util.Arrays.equals(this.jobStartDate, other.getJobStartDate()))) &&
            ((this.jobType==null && other.getJobType()==null) || 
             (this.jobType!=null &&
              java.util.Arrays.equals(this.jobType, other.getJobType()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              java.util.Arrays.equals(this.lastName, other.getLastName()))) &&
            ((this.leadDate==null && other.getLeadDate()==null) || 
             (this.leadDate!=null &&
              java.util.Arrays.equals(this.leadDate, other.getLeadDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              java.util.Arrays.equals(this.leadSource, other.getLeadSource()))) &&
            ((this.manualCreditHold==null && other.getManualCreditHold()==null) || 
             (this.manualCreditHold!=null &&
              java.util.Arrays.equals(this.manualCreditHold, other.getManualCreditHold()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              java.util.Arrays.equals(this.middleName, other.getMiddleName()))) &&
            ((this.mobilePhone==null && other.getMobilePhone()==null) || 
             (this.mobilePhone!=null &&
              java.util.Arrays.equals(this.mobilePhone, other.getMobilePhone()))) &&
            ((this.onCreditHold==null && other.getOnCreditHold()==null) || 
             (this.onCreditHold!=null &&
              java.util.Arrays.equals(this.onCreditHold, other.getOnCreditHold()))) &&
            ((this.overdueBalance==null && other.getOverdueBalance()==null) || 
             (this.overdueBalance!=null &&
              java.util.Arrays.equals(this.overdueBalance, other.getOverdueBalance()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              java.util.Arrays.equals(this.partner, other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              java.util.Arrays.equals(this.partnerContribution, other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              java.util.Arrays.equals(this.partnerRole, other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              java.util.Arrays.equals(this.partnerTeamMember, other.getPartnerTeamMember()))) &&
            ((this.pec==null && other.getPec()==null) || 
             (this.pec!=null &&
              java.util.Arrays.equals(this.pec, other.getPec()))) &&
            ((this.prefCCProcessor==null && other.getPrefCCProcessor()==null) || 
             (this.prefCCProcessor!=null &&
              java.util.Arrays.equals(this.prefCCProcessor, other.getPrefCCProcessor()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              java.util.Arrays.equals(this.priceLevel, other.getPriceLevel()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              java.util.Arrays.equals(this.pricingGroup, other.getPricingGroup()))) &&
            ((this.pricingItem==null && other.getPricingItem()==null) || 
             (this.pricingItem!=null &&
              java.util.Arrays.equals(this.pricingItem, other.getPricingItem()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              java.util.Arrays.equals(this.printTransactions, other.getPrintTransactions()))) &&
            ((this.prospectDate==null && other.getProspectDate()==null) || 
             (this.prospectDate!=null &&
              java.util.Arrays.equals(this.prospectDate, other.getProspectDate()))) &&
            ((this.reminderDays==null && other.getReminderDays()==null) || 
             (this.reminderDays!=null &&
              java.util.Arrays.equals(this.reminderDays, other.getReminderDays()))) &&
            ((this.resaleNumber==null && other.getResaleNumber()==null) || 
             (this.resaleNumber!=null &&
              java.util.Arrays.equals(this.resaleNumber, other.getResaleNumber()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              java.util.Arrays.equals(this.role, other.getRole()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              java.util.Arrays.equals(this.salesReadiness, other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              java.util.Arrays.equals(this.salesRep, other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              java.util.Arrays.equals(this.salesTeamMember, other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              java.util.Arrays.equals(this.salesTeamRole, other.getSalesTeamRole()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              java.util.Arrays.equals(this.salutation, other.getSalutation()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              java.util.Arrays.equals(this.shipAddress, other.getShipAddress()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              java.util.Arrays.equals(this.shipComplete, other.getShipComplete()))) &&
            ((this.shippingItem==null && other.getShippingItem()==null) || 
             (this.shippingItem!=null &&
              java.util.Arrays.equals(this.shippingItem, other.getShippingItem()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              java.util.Arrays.equals(this.stage, other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              java.util.Arrays.equals(this.taxable, other.getTaxable()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              java.util.Arrays.equals(this.taxItem, other.getTaxItem()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              java.util.Arrays.equals(this.terms, other.getTerms()))) &&
            ((this.territory==null && other.getTerritory()==null) || 
             (this.territory!=null &&
              java.util.Arrays.equals(this.territory, other.getTerritory()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              java.util.Arrays.equals(this.unbilledOrders, other.getUnbilledOrders()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              java.util.Arrays.equals(this.url, other.getUrl()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              java.util.Arrays.equals(this.vatRegNumber, other.getVatRegNumber()))) &&
            ((this.webLead==null && other.getWebLead()==null) || 
             (this.webLead!=null &&
              java.util.Arrays.equals(this.webLead, other.getWebLead()))) &&
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
        if (getAvailableOffline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableOffline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableOffline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBalance(), i);
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
        if (getBuyingReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyingTimeFrame() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyingTimeFrame());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyingTimeFrame(), i);
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
        if (getCcCustomerCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcCustomerCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcCustomerCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcDefault() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcDefault());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcDefault(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcExpDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcExpDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcExpDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcHolderName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcHolderName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcHolderName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcType(), i);
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
        if (getContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContributionPrimary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContributionPrimary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContributionPrimary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConversionDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConversionDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConversionDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditHoldOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditHoldOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditHoldOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditLimit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditLimit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditLimit(), i);
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
        if (getDateClosed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateClosed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateClosed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysOverdue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOverdue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOverdue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositBalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailTransactions(), i);
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
        if (getEstimatedBudget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedBudget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedBudget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExplicitConversion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExplicitConversion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExplicitConversion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFaxTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaxTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaxTransactions(), i);
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
        if (getFirstOrderDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstOrderDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstOrderDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFirstSaleDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFirstSaleDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFirstSaleDate(), i);
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
        if (getGroupPricingLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupPricingLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupPricingLevel(), i);
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
        if (getIsBudgetApproved() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsBudgetApproved());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsBudgetApproved(), i);
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
        if (getIsShipAddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsShipAddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsShipAddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPricingLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPricingLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPricingLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemPricingUnitPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemPricingUnitPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemPricingUnitPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobProjectedEnd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobProjectedEnd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobProjectedEnd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getJobType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getJobType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getJobType(), i);
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
        if (getLeadDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeadSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadSource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManualCreditHold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManualCreditHold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManualCreditHold(), i);
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
        if (getOnCreditHold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnCreditHold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnCreditHold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverdueBalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverdueBalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverdueBalance(), i);
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
        if (getPartner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerContribution() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerContribution());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerContribution(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerRole(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPartnerTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartnerTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartnerTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPec(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrefCCProcessor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrefCCProcessor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrefCCProcessor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrintTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrintTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrintTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProspectDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProspectDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProspectDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReminderDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReminderDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReminderDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResaleNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResaleNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResaleNumber(), i);
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
        if (getSalesReadiness() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesReadiness());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesReadiness(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesRep() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesRep());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesRep(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamMember() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamMember());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamMember(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTeamRole() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTeamRole());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTeamRole(), i);
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
        if (getShipComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipComplete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStage(), i);
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
        if (getTaxable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerms() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerms());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerms(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTerritory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTerritory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTerritory(), i);
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
        if (getUnbilledOrders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnbilledOrders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnbilledOrders(), i);
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
        if (getVatRegNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVatRegNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVatRegNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebLead() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebLead());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebLead(), i);
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
        new org.apache.axis.description.TypeDesc(OriginatingLeadSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contributionPrimary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contributionPrimary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "conversionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("dateClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explicitConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "explicitConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("firstOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "firstOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstSaleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "firstSaleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("groupPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "groupPricingLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isBudgetApproved"));
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
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemPricingLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricingUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemPricingUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobProjectedEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobProjectedEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "jobType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("leadDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manualCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefCCProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "prefCCProcessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pricingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prospectDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "prospectDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reminderDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamRole"));
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
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stage"));
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
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "territory"));
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
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
