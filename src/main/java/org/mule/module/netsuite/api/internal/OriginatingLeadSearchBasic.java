/**
 * OriginatingLeadSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class OriginatingLeadSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchStringField accountNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField availableOffline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField balance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField boughtAmount;

    private org.mule.module.netsuite.api.internal.SearchDateField boughtDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingReason;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingTimeFrame;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField category;

    private org.mule.module.netsuite.api.internal.SearchStringField ccCustomerCode;

    private org.mule.module.netsuite.api.internal.SearchBooleanField ccDefault;

    private org.mule.module.netsuite.api.internal.SearchDateField ccExpDate;

    private org.mule.module.netsuite.api.internal.SearchStringField ccHolderName;

    private org.mule.module.netsuite.api.internal.SearchStringField ccNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField ccType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField classBought;

    private org.mule.module.netsuite.api.internal.SearchStringField companyName;

    private org.mule.module.netsuite.api.internal.SearchStringField contact;

    private org.mule.module.netsuite.api.internal.SearchLongField contribution;

    private org.mule.module.netsuite.api.internal.SearchDateField conversionDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField creditHoldOverride;

    private org.mule.module.netsuite.api.internal.SearchDoubleField creditLimit;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField currency;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField custStage;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField custStatus;

    private org.mule.module.netsuite.api.internal.SearchDateField dateClosed;

    private org.mule.module.netsuite.api.internal.SearchLongField daysOverdue;

    private org.mule.module.netsuite.api.internal.SearchDoubleField depositBalance;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField deptBought;

    private org.mule.module.netsuite.api.internal.SearchBooleanField emailTransactions;

    private org.mule.module.netsuite.api.internal.SearchDateField endDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedBudget;

    private org.mule.module.netsuite.api.internal.SearchBooleanField explicitConversion;

    private org.mule.module.netsuite.api.internal.SearchBooleanField faxTransactions;

    private org.mule.module.netsuite.api.internal.SearchStringField firstName;

    private org.mule.module.netsuite.api.internal.SearchDateField firstOrderDate;

    private org.mule.module.netsuite.api.internal.SearchDateField firstSaleDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField group;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField groupPricingLevel;

    private org.mule.module.netsuite.api.internal.SearchBooleanField hasDuplicates;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isBudgetApproved;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isPerson;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isReportedLead;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isShipAddress;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField itemPricingLevel;

    private org.mule.module.netsuite.api.internal.SearchDoubleField itemPricingUnitPrice;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField itemsBought;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField itemsOrdered;

    private org.mule.module.netsuite.api.internal.SearchStringField lastName;

    private org.mule.module.netsuite.api.internal.SearchDateField leadDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField locationBought;

    private org.mule.module.netsuite.api.internal.SearchBooleanField manualCreditHold;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField merchantAccount;

    private org.mule.module.netsuite.api.internal.SearchStringField middleName;

    private org.mule.module.netsuite.api.internal.SearchBooleanField onCreditHold;

    private org.mule.module.netsuite.api.internal.SearchDoubleField orderedAmount;

    private org.mule.module.netsuite.api.internal.SearchDateField orderedDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField otherRelationships;

    private org.mule.module.netsuite.api.internal.SearchDoubleField overdueBalance;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parent;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parentItemsBought;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parentItemsOrdered;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partner;

    private org.mule.module.netsuite.api.internal.SearchLongField partnerContribution;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember;

    private org.mule.module.netsuite.api.internal.SearchStringField pec;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField priceLevel;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingGroup;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingItem;

    private org.mule.module.netsuite.api.internal.SearchBooleanField printTransactions;

    private org.mule.module.netsuite.api.internal.SearchDateField prospectDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField pstExempt;

    private org.mule.module.netsuite.api.internal.SearchDateField reminderDate;

    private org.mule.module.netsuite.api.internal.SearchStringField resaleNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField role;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesReadiness;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole;

    private org.mule.module.netsuite.api.internal.SearchStringField salutation;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shipComplete;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField shippingItem;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField stage;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidBought;

    private org.mule.module.netsuite.api.internal.SearchBooleanField taxable;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField terms;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField territory;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchDoubleField unbilledOrders;

    private org.mule.module.netsuite.api.internal.SearchStringField url;

    private org.mule.module.netsuite.api.internal.SearchStringField vatRegNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField webLead;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public OriginatingLeadSearchBasic() {
    }

    public OriginatingLeadSearchBasic(
           org.mule.module.netsuite.api.internal.SearchStringField accountNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField availableOffline,
           org.mule.module.netsuite.api.internal.SearchDoubleField balance,
           org.mule.module.netsuite.api.internal.SearchDoubleField boughtAmount,
           org.mule.module.netsuite.api.internal.SearchDateField boughtDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingReason,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingTimeFrame,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField category,
           org.mule.module.netsuite.api.internal.SearchStringField ccCustomerCode,
           org.mule.module.netsuite.api.internal.SearchBooleanField ccDefault,
           org.mule.module.netsuite.api.internal.SearchDateField ccExpDate,
           org.mule.module.netsuite.api.internal.SearchStringField ccHolderName,
           org.mule.module.netsuite.api.internal.SearchStringField ccNumber,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField ccType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField classBought,
           org.mule.module.netsuite.api.internal.SearchStringField companyName,
           org.mule.module.netsuite.api.internal.SearchStringField contact,
           org.mule.module.netsuite.api.internal.SearchLongField contribution,
           org.mule.module.netsuite.api.internal.SearchDateField conversionDate,
           org.mule.module.netsuite.api.internal.SearchBooleanField creditHoldOverride,
           org.mule.module.netsuite.api.internal.SearchDoubleField creditLimit,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField currency,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField custStage,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField custStatus,
           org.mule.module.netsuite.api.internal.SearchDateField dateClosed,
           org.mule.module.netsuite.api.internal.SearchLongField daysOverdue,
           org.mule.module.netsuite.api.internal.SearchDoubleField depositBalance,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField deptBought,
           org.mule.module.netsuite.api.internal.SearchBooleanField emailTransactions,
           org.mule.module.netsuite.api.internal.SearchDateField endDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedBudget,
           org.mule.module.netsuite.api.internal.SearchBooleanField explicitConversion,
           org.mule.module.netsuite.api.internal.SearchBooleanField faxTransactions,
           org.mule.module.netsuite.api.internal.SearchStringField firstName,
           org.mule.module.netsuite.api.internal.SearchDateField firstOrderDate,
           org.mule.module.netsuite.api.internal.SearchDateField firstSaleDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField group,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField groupPricingLevel,
           org.mule.module.netsuite.api.internal.SearchBooleanField hasDuplicates,
           org.mule.module.netsuite.api.internal.SearchBooleanField isBudgetApproved,
           org.mule.module.netsuite.api.internal.SearchBooleanField isPerson,
           org.mule.module.netsuite.api.internal.SearchBooleanField isReportedLead,
           org.mule.module.netsuite.api.internal.SearchBooleanField isShipAddress,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField itemPricingLevel,
           org.mule.module.netsuite.api.internal.SearchDoubleField itemPricingUnitPrice,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField itemsBought,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField itemsOrdered,
           org.mule.module.netsuite.api.internal.SearchStringField lastName,
           org.mule.module.netsuite.api.internal.SearchDateField leadDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField locationBought,
           org.mule.module.netsuite.api.internal.SearchBooleanField manualCreditHold,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField merchantAccount,
           org.mule.module.netsuite.api.internal.SearchStringField middleName,
           org.mule.module.netsuite.api.internal.SearchBooleanField onCreditHold,
           org.mule.module.netsuite.api.internal.SearchDoubleField orderedAmount,
           org.mule.module.netsuite.api.internal.SearchDateField orderedDate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField otherRelationships,
           org.mule.module.netsuite.api.internal.SearchDoubleField overdueBalance,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parent,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parentItemsBought,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parentItemsOrdered,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField partner,
           org.mule.module.netsuite.api.internal.SearchLongField partnerContribution,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember,
           org.mule.module.netsuite.api.internal.SearchStringField pec,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField priceLevel,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingGroup,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingItem,
           org.mule.module.netsuite.api.internal.SearchBooleanField printTransactions,
           org.mule.module.netsuite.api.internal.SearchDateField prospectDate,
           org.mule.module.netsuite.api.internal.SearchBooleanField pstExempt,
           org.mule.module.netsuite.api.internal.SearchDateField reminderDate,
           org.mule.module.netsuite.api.internal.SearchStringField resaleNumber,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField role,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesReadiness,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole,
           org.mule.module.netsuite.api.internal.SearchStringField salutation,
           org.mule.module.netsuite.api.internal.SearchBooleanField shipComplete,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField shippingItem,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField stage,
           org.mule.module.netsuite.api.internal.SearchDateField startDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidBought,
           org.mule.module.netsuite.api.internal.SearchBooleanField taxable,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField terms,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField territory,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchDoubleField unbilledOrders,
           org.mule.module.netsuite.api.internal.SearchStringField url,
           org.mule.module.netsuite.api.internal.SearchStringField vatRegNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField webLead,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.availableOffline = availableOffline;
        this.balance = balance;
        this.boughtAmount = boughtAmount;
        this.boughtDate = boughtDate;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this.category = category;
        this.ccCustomerCode = ccCustomerCode;
        this.ccDefault = ccDefault;
        this.ccExpDate = ccExpDate;
        this.ccHolderName = ccHolderName;
        this.ccNumber = ccNumber;
        this.ccType = ccType;
        this.classBought = classBought;
        this.companyName = companyName;
        this.contact = contact;
        this.contribution = contribution;
        this.conversionDate = conversionDate;
        this.creditHoldOverride = creditHoldOverride;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.custStage = custStage;
        this.custStatus = custStatus;
        this.dateClosed = dateClosed;
        this.daysOverdue = daysOverdue;
        this.depositBalance = depositBalance;
        this.deptBought = deptBought;
        this.emailTransactions = emailTransactions;
        this.endDate = endDate;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.explicitConversion = explicitConversion;
        this.faxTransactions = faxTransactions;
        this.firstName = firstName;
        this.firstOrderDate = firstOrderDate;
        this.firstSaleDate = firstSaleDate;
        this.group = group;
        this.groupPricingLevel = groupPricingLevel;
        this.hasDuplicates = hasDuplicates;
        this.isBudgetApproved = isBudgetApproved;
        this.isPerson = isPerson;
        this.isReportedLead = isReportedLead;
        this.isShipAddress = isShipAddress;
        this.itemPricingLevel = itemPricingLevel;
        this.itemPricingUnitPrice = itemPricingUnitPrice;
        this.itemsBought = itemsBought;
        this.itemsOrdered = itemsOrdered;
        this.lastName = lastName;
        this.leadDate = leadDate;
        this.leadSource = leadSource;
        this.locationBought = locationBought;
        this.manualCreditHold = manualCreditHold;
        this.merchantAccount = merchantAccount;
        this.middleName = middleName;
        this.onCreditHold = onCreditHold;
        this.orderedAmount = orderedAmount;
        this.orderedDate = orderedDate;
        this.otherRelationships = otherRelationships;
        this.overdueBalance = overdueBalance;
        this.parent = parent;
        this.parentItemsBought = parentItemsBought;
        this.parentItemsOrdered = parentItemsOrdered;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.pec = pec;
        this.priceLevel = priceLevel;
        this.pricingGroup = pricingGroup;
        this.pricingItem = pricingItem;
        this.printTransactions = printTransactions;
        this.prospectDate = prospectDate;
        this.pstExempt = pstExempt;
        this.reminderDate = reminderDate;
        this.resaleNumber = resaleNumber;
        this.role = role;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.salutation = salutation;
        this.shipComplete = shipComplete;
        this.shippingItem = shippingItem;
        this.stage = stage;
        this.startDate = startDate;
        this.subsidBought = subsidBought;
        this.taxable = taxable;
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
     * Gets the accountNumber value for this OriginatingLeadSearchBasic.
     * 
     * @return accountNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this OriginatingLeadSearchBasic.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(org.mule.module.netsuite.api.internal.SearchStringField accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the availableOffline value for this OriginatingLeadSearchBasic.
     * 
     * @return availableOffline
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAvailableOffline() {
        return availableOffline;
    }


    /**
     * Sets the availableOffline value for this OriginatingLeadSearchBasic.
     * 
     * @param availableOffline
     */
    public void setAvailableOffline(org.mule.module.netsuite.api.internal.SearchBooleanField availableOffline) {
        this.availableOffline = availableOffline;
    }


    /**
     * Gets the balance value for this OriginatingLeadSearchBasic.
     * 
     * @return balance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this OriginatingLeadSearchBasic.
     * 
     * @param balance
     */
    public void setBalance(org.mule.module.netsuite.api.internal.SearchDoubleField balance) {
        this.balance = balance;
    }


    /**
     * Gets the boughtAmount value for this OriginatingLeadSearchBasic.
     * 
     * @return boughtAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBoughtAmount() {
        return boughtAmount;
    }


    /**
     * Sets the boughtAmount value for this OriginatingLeadSearchBasic.
     * 
     * @param boughtAmount
     */
    public void setBoughtAmount(org.mule.module.netsuite.api.internal.SearchDoubleField boughtAmount) {
        this.boughtAmount = boughtAmount;
    }


    /**
     * Gets the boughtDate value for this OriginatingLeadSearchBasic.
     * 
     * @return boughtDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getBoughtDate() {
        return boughtDate;
    }


    /**
     * Sets the boughtDate value for this OriginatingLeadSearchBasic.
     * 
     * @param boughtDate
     */
    public void setBoughtDate(org.mule.module.netsuite.api.internal.SearchDateField boughtDate) {
        this.boughtDate = boughtDate;
    }


    /**
     * Gets the buyingReason value for this OriginatingLeadSearchBasic.
     * 
     * @return buyingReason
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBuyingReason() {
        return buyingReason;
    }


    /**
     * Sets the buyingReason value for this OriginatingLeadSearchBasic.
     * 
     * @param buyingReason
     */
    public void setBuyingReason(org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingReason) {
        this.buyingReason = buyingReason;
    }


    /**
     * Gets the buyingTimeFrame value for this OriginatingLeadSearchBasic.
     * 
     * @return buyingTimeFrame
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBuyingTimeFrame() {
        return buyingTimeFrame;
    }


    /**
     * Sets the buyingTimeFrame value for this OriginatingLeadSearchBasic.
     * 
     * @param buyingTimeFrame
     */
    public void setBuyingTimeFrame(org.mule.module.netsuite.api.internal.SearchMultiSelectField buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }


    /**
     * Gets the category value for this OriginatingLeadSearchBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this OriginatingLeadSearchBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the ccCustomerCode value for this OriginatingLeadSearchBasic.
     * 
     * @return ccCustomerCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this OriginatingLeadSearchBasic.
     * 
     * @param ccCustomerCode
     */
    public void setCcCustomerCode(org.mule.module.netsuite.api.internal.SearchStringField ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }


    /**
     * Gets the ccDefault value for this OriginatingLeadSearchBasic.
     * 
     * @return ccDefault
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getCcDefault() {
        return ccDefault;
    }


    /**
     * Sets the ccDefault value for this OriginatingLeadSearchBasic.
     * 
     * @param ccDefault
     */
    public void setCcDefault(org.mule.module.netsuite.api.internal.SearchBooleanField ccDefault) {
        this.ccDefault = ccDefault;
    }


    /**
     * Gets the ccExpDate value for this OriginatingLeadSearchBasic.
     * 
     * @return ccExpDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCcExpDate() {
        return ccExpDate;
    }


    /**
     * Sets the ccExpDate value for this OriginatingLeadSearchBasic.
     * 
     * @param ccExpDate
     */
    public void setCcExpDate(org.mule.module.netsuite.api.internal.SearchDateField ccExpDate) {
        this.ccExpDate = ccExpDate;
    }


    /**
     * Gets the ccHolderName value for this OriginatingLeadSearchBasic.
     * 
     * @return ccHolderName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCcHolderName() {
        return ccHolderName;
    }


    /**
     * Sets the ccHolderName value for this OriginatingLeadSearchBasic.
     * 
     * @param ccHolderName
     */
    public void setCcHolderName(org.mule.module.netsuite.api.internal.SearchStringField ccHolderName) {
        this.ccHolderName = ccHolderName;
    }


    /**
     * Gets the ccNumber value for this OriginatingLeadSearchBasic.
     * 
     * @return ccNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this OriginatingLeadSearchBasic.
     * 
     * @param ccNumber
     */
    public void setCcNumber(org.mule.module.netsuite.api.internal.SearchStringField ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccType value for this OriginatingLeadSearchBasic.
     * 
     * @return ccType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCcType() {
        return ccType;
    }


    /**
     * Sets the ccType value for this OriginatingLeadSearchBasic.
     * 
     * @param ccType
     */
    public void setCcType(org.mule.module.netsuite.api.internal.SearchMultiSelectField ccType) {
        this.ccType = ccType;
    }


    /**
     * Gets the classBought value for this OriginatingLeadSearchBasic.
     * 
     * @return classBought
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getClassBought() {
        return classBought;
    }


    /**
     * Sets the classBought value for this OriginatingLeadSearchBasic.
     * 
     * @param classBought
     */
    public void setClassBought(org.mule.module.netsuite.api.internal.SearchMultiSelectField classBought) {
        this.classBought = classBought;
    }


    /**
     * Gets the companyName value for this OriginatingLeadSearchBasic.
     * 
     * @return companyName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this OriginatingLeadSearchBasic.
     * 
     * @param companyName
     */
    public void setCompanyName(org.mule.module.netsuite.api.internal.SearchStringField companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the contact value for this OriginatingLeadSearchBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this OriginatingLeadSearchBasic.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.SearchStringField contact) {
        this.contact = contact;
    }


    /**
     * Gets the contribution value for this OriginatingLeadSearchBasic.
     * 
     * @return contribution
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this OriginatingLeadSearchBasic.
     * 
     * @param contribution
     */
    public void setContribution(org.mule.module.netsuite.api.internal.SearchLongField contribution) {
        this.contribution = contribution;
    }


    /**
     * Gets the conversionDate value for this OriginatingLeadSearchBasic.
     * 
     * @return conversionDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getConversionDate() {
        return conversionDate;
    }


    /**
     * Sets the conversionDate value for this OriginatingLeadSearchBasic.
     * 
     * @param conversionDate
     */
    public void setConversionDate(org.mule.module.netsuite.api.internal.SearchDateField conversionDate) {
        this.conversionDate = conversionDate;
    }


    /**
     * Gets the creditHoldOverride value for this OriginatingLeadSearchBasic.
     * 
     * @return creditHoldOverride
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getCreditHoldOverride() {
        return creditHoldOverride;
    }


    /**
     * Sets the creditHoldOverride value for this OriginatingLeadSearchBasic.
     * 
     * @param creditHoldOverride
     */
    public void setCreditHoldOverride(org.mule.module.netsuite.api.internal.SearchBooleanField creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
    }


    /**
     * Gets the creditLimit value for this OriginatingLeadSearchBasic.
     * 
     * @return creditLimit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this OriginatingLeadSearchBasic.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(org.mule.module.netsuite.api.internal.SearchDoubleField creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the currency value for this OriginatingLeadSearchBasic.
     * 
     * @return currency
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OriginatingLeadSearchBasic.
     * 
     * @param currency
     */
    public void setCurrency(org.mule.module.netsuite.api.internal.SearchMultiSelectField currency) {
        this.currency = currency;
    }


    /**
     * Gets the custStage value for this OriginatingLeadSearchBasic.
     * 
     * @return custStage
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustStage() {
        return custStage;
    }


    /**
     * Sets the custStage value for this OriginatingLeadSearchBasic.
     * 
     * @param custStage
     */
    public void setCustStage(org.mule.module.netsuite.api.internal.SearchMultiSelectField custStage) {
        this.custStage = custStage;
    }


    /**
     * Gets the custStatus value for this OriginatingLeadSearchBasic.
     * 
     * @return custStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustStatus() {
        return custStatus;
    }


    /**
     * Sets the custStatus value for this OriginatingLeadSearchBasic.
     * 
     * @param custStatus
     */
    public void setCustStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField custStatus) {
        this.custStatus = custStatus;
    }


    /**
     * Gets the dateClosed value for this OriginatingLeadSearchBasic.
     * 
     * @return dateClosed
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateClosed() {
        return dateClosed;
    }


    /**
     * Sets the dateClosed value for this OriginatingLeadSearchBasic.
     * 
     * @param dateClosed
     */
    public void setDateClosed(org.mule.module.netsuite.api.internal.SearchDateField dateClosed) {
        this.dateClosed = dateClosed;
    }


    /**
     * Gets the daysOverdue value for this OriginatingLeadSearchBasic.
     * 
     * @return daysOverdue
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this OriginatingLeadSearchBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(org.mule.module.netsuite.api.internal.SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }


    /**
     * Gets the depositBalance value for this OriginatingLeadSearchBasic.
     * 
     * @return depositBalance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDepositBalance() {
        return depositBalance;
    }


    /**
     * Sets the depositBalance value for this OriginatingLeadSearchBasic.
     * 
     * @param depositBalance
     */
    public void setDepositBalance(org.mule.module.netsuite.api.internal.SearchDoubleField depositBalance) {
        this.depositBalance = depositBalance;
    }


    /**
     * Gets the deptBought value for this OriginatingLeadSearchBasic.
     * 
     * @return deptBought
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDeptBought() {
        return deptBought;
    }


    /**
     * Sets the deptBought value for this OriginatingLeadSearchBasic.
     * 
     * @param deptBought
     */
    public void setDeptBought(org.mule.module.netsuite.api.internal.SearchMultiSelectField deptBought) {
        this.deptBought = deptBought;
    }


    /**
     * Gets the emailTransactions value for this OriginatingLeadSearchBasic.
     * 
     * @return emailTransactions
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getEmailTransactions() {
        return emailTransactions;
    }


    /**
     * Sets the emailTransactions value for this OriginatingLeadSearchBasic.
     * 
     * @param emailTransactions
     */
    public void setEmailTransactions(org.mule.module.netsuite.api.internal.SearchBooleanField emailTransactions) {
        this.emailTransactions = emailTransactions;
    }


    /**
     * Gets the endDate value for this OriginatingLeadSearchBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this OriginatingLeadSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the entityStatus value for this OriginatingLeadSearchBasic.
     * 
     * @return entityStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this OriginatingLeadSearchBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the estimatedBudget value for this OriginatingLeadSearchBasic.
     * 
     * @return estimatedBudget
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedBudget() {
        return estimatedBudget;
    }


    /**
     * Sets the estimatedBudget value for this OriginatingLeadSearchBasic.
     * 
     * @param estimatedBudget
     */
    public void setEstimatedBudget(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }


    /**
     * Gets the explicitConversion value for this OriginatingLeadSearchBasic.
     * 
     * @return explicitConversion
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getExplicitConversion() {
        return explicitConversion;
    }


    /**
     * Sets the explicitConversion value for this OriginatingLeadSearchBasic.
     * 
     * @param explicitConversion
     */
    public void setExplicitConversion(org.mule.module.netsuite.api.internal.SearchBooleanField explicitConversion) {
        this.explicitConversion = explicitConversion;
    }


    /**
     * Gets the faxTransactions value for this OriginatingLeadSearchBasic.
     * 
     * @return faxTransactions
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getFaxTransactions() {
        return faxTransactions;
    }


    /**
     * Sets the faxTransactions value for this OriginatingLeadSearchBasic.
     * 
     * @param faxTransactions
     */
    public void setFaxTransactions(org.mule.module.netsuite.api.internal.SearchBooleanField faxTransactions) {
        this.faxTransactions = faxTransactions;
    }


    /**
     * Gets the firstName value for this OriginatingLeadSearchBasic.
     * 
     * @return firstName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this OriginatingLeadSearchBasic.
     * 
     * @param firstName
     */
    public void setFirstName(org.mule.module.netsuite.api.internal.SearchStringField firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the firstOrderDate value for this OriginatingLeadSearchBasic.
     * 
     * @return firstOrderDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getFirstOrderDate() {
        return firstOrderDate;
    }


    /**
     * Sets the firstOrderDate value for this OriginatingLeadSearchBasic.
     * 
     * @param firstOrderDate
     */
    public void setFirstOrderDate(org.mule.module.netsuite.api.internal.SearchDateField firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }


    /**
     * Gets the firstSaleDate value for this OriginatingLeadSearchBasic.
     * 
     * @return firstSaleDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getFirstSaleDate() {
        return firstSaleDate;
    }


    /**
     * Sets the firstSaleDate value for this OriginatingLeadSearchBasic.
     * 
     * @param firstSaleDate
     */
    public void setFirstSaleDate(org.mule.module.netsuite.api.internal.SearchDateField firstSaleDate) {
        this.firstSaleDate = firstSaleDate;
    }


    /**
     * Gets the group value for this OriginatingLeadSearchBasic.
     * 
     * @return group
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getGroup() {
        return group;
    }


    /**
     * Sets the group value for this OriginatingLeadSearchBasic.
     * 
     * @param group
     */
    public void setGroup(org.mule.module.netsuite.api.internal.SearchMultiSelectField group) {
        this.group = group;
    }


    /**
     * Gets the groupPricingLevel value for this OriginatingLeadSearchBasic.
     * 
     * @return groupPricingLevel
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getGroupPricingLevel() {
        return groupPricingLevel;
    }


    /**
     * Sets the groupPricingLevel value for this OriginatingLeadSearchBasic.
     * 
     * @param groupPricingLevel
     */
    public void setGroupPricingLevel(org.mule.module.netsuite.api.internal.SearchMultiSelectField groupPricingLevel) {
        this.groupPricingLevel = groupPricingLevel;
    }


    /**
     * Gets the hasDuplicates value for this OriginatingLeadSearchBasic.
     * 
     * @return hasDuplicates
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getHasDuplicates() {
        return hasDuplicates;
    }


    /**
     * Sets the hasDuplicates value for this OriginatingLeadSearchBasic.
     * 
     * @param hasDuplicates
     */
    public void setHasDuplicates(org.mule.module.netsuite.api.internal.SearchBooleanField hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }


    /**
     * Gets the isBudgetApproved value for this OriginatingLeadSearchBasic.
     * 
     * @return isBudgetApproved
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsBudgetApproved() {
        return isBudgetApproved;
    }


    /**
     * Sets the isBudgetApproved value for this OriginatingLeadSearchBasic.
     * 
     * @param isBudgetApproved
     */
    public void setIsBudgetApproved(org.mule.module.netsuite.api.internal.SearchBooleanField isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }


    /**
     * Gets the isPerson value for this OriginatingLeadSearchBasic.
     * 
     * @return isPerson
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsPerson() {
        return isPerson;
    }


    /**
     * Sets the isPerson value for this OriginatingLeadSearchBasic.
     * 
     * @param isPerson
     */
    public void setIsPerson(org.mule.module.netsuite.api.internal.SearchBooleanField isPerson) {
        this.isPerson = isPerson;
    }


    /**
     * Gets the isReportedLead value for this OriginatingLeadSearchBasic.
     * 
     * @return isReportedLead
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsReportedLead() {
        return isReportedLead;
    }


    /**
     * Sets the isReportedLead value for this OriginatingLeadSearchBasic.
     * 
     * @param isReportedLead
     */
    public void setIsReportedLead(org.mule.module.netsuite.api.internal.SearchBooleanField isReportedLead) {
        this.isReportedLead = isReportedLead;
    }


    /**
     * Gets the isShipAddress value for this OriginatingLeadSearchBasic.
     * 
     * @return isShipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this OriginatingLeadSearchBasic.
     * 
     * @param isShipAddress
     */
    public void setIsShipAddress(org.mule.module.netsuite.api.internal.SearchBooleanField isShipAddress) {
        this.isShipAddress = isShipAddress;
    }


    /**
     * Gets the itemPricingLevel value for this OriginatingLeadSearchBasic.
     * 
     * @return itemPricingLevel
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItemPricingLevel() {
        return itemPricingLevel;
    }


    /**
     * Sets the itemPricingLevel value for this OriginatingLeadSearchBasic.
     * 
     * @param itemPricingLevel
     */
    public void setItemPricingLevel(org.mule.module.netsuite.api.internal.SearchMultiSelectField itemPricingLevel) {
        this.itemPricingLevel = itemPricingLevel;
    }


    /**
     * Gets the itemPricingUnitPrice value for this OriginatingLeadSearchBasic.
     * 
     * @return itemPricingUnitPrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getItemPricingUnitPrice() {
        return itemPricingUnitPrice;
    }


    /**
     * Sets the itemPricingUnitPrice value for this OriginatingLeadSearchBasic.
     * 
     * @param itemPricingUnitPrice
     */
    public void setItemPricingUnitPrice(org.mule.module.netsuite.api.internal.SearchDoubleField itemPricingUnitPrice) {
        this.itemPricingUnitPrice = itemPricingUnitPrice;
    }


    /**
     * Gets the itemsBought value for this OriginatingLeadSearchBasic.
     * 
     * @return itemsBought
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItemsBought() {
        return itemsBought;
    }


    /**
     * Sets the itemsBought value for this OriginatingLeadSearchBasic.
     * 
     * @param itemsBought
     */
    public void setItemsBought(org.mule.module.netsuite.api.internal.SearchMultiSelectField itemsBought) {
        this.itemsBought = itemsBought;
    }


    /**
     * Gets the itemsOrdered value for this OriginatingLeadSearchBasic.
     * 
     * @return itemsOrdered
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItemsOrdered() {
        return itemsOrdered;
    }


    /**
     * Sets the itemsOrdered value for this OriginatingLeadSearchBasic.
     * 
     * @param itemsOrdered
     */
    public void setItemsOrdered(org.mule.module.netsuite.api.internal.SearchMultiSelectField itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
    }


    /**
     * Gets the lastName value for this OriginatingLeadSearchBasic.
     * 
     * @return lastName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this OriginatingLeadSearchBasic.
     * 
     * @param lastName
     */
    public void setLastName(org.mule.module.netsuite.api.internal.SearchStringField lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the leadDate value for this OriginatingLeadSearchBasic.
     * 
     * @return leadDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLeadDate() {
        return leadDate;
    }


    /**
     * Sets the leadDate value for this OriginatingLeadSearchBasic.
     * 
     * @param leadDate
     */
    public void setLeadDate(org.mule.module.netsuite.api.internal.SearchDateField leadDate) {
        this.leadDate = leadDate;
    }


    /**
     * Gets the leadSource value for this OriginatingLeadSearchBasic.
     * 
     * @return leadSource
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this OriginatingLeadSearchBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the locationBought value for this OriginatingLeadSearchBasic.
     * 
     * @return locationBought
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLocationBought() {
        return locationBought;
    }


    /**
     * Sets the locationBought value for this OriginatingLeadSearchBasic.
     * 
     * @param locationBought
     */
    public void setLocationBought(org.mule.module.netsuite.api.internal.SearchMultiSelectField locationBought) {
        this.locationBought = locationBought;
    }


    /**
     * Gets the manualCreditHold value for this OriginatingLeadSearchBasic.
     * 
     * @return manualCreditHold
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getManualCreditHold() {
        return manualCreditHold;
    }


    /**
     * Sets the manualCreditHold value for this OriginatingLeadSearchBasic.
     * 
     * @param manualCreditHold
     */
    public void setManualCreditHold(org.mule.module.netsuite.api.internal.SearchBooleanField manualCreditHold) {
        this.manualCreditHold = manualCreditHold;
    }


    /**
     * Gets the merchantAccount value for this OriginatingLeadSearchBasic.
     * 
     * @return merchantAccount
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this OriginatingLeadSearchBasic.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(org.mule.module.netsuite.api.internal.SearchMultiSelectField merchantAccount) {
        this.merchantAccount = merchantAccount;
    }


    /**
     * Gets the middleName value for this OriginatingLeadSearchBasic.
     * 
     * @return middleName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this OriginatingLeadSearchBasic.
     * 
     * @param middleName
     */
    public void setMiddleName(org.mule.module.netsuite.api.internal.SearchStringField middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the onCreditHold value for this OriginatingLeadSearchBasic.
     * 
     * @return onCreditHold
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getOnCreditHold() {
        return onCreditHold;
    }


    /**
     * Sets the onCreditHold value for this OriginatingLeadSearchBasic.
     * 
     * @param onCreditHold
     */
    public void setOnCreditHold(org.mule.module.netsuite.api.internal.SearchBooleanField onCreditHold) {
        this.onCreditHold = onCreditHold;
    }


    /**
     * Gets the orderedAmount value for this OriginatingLeadSearchBasic.
     * 
     * @return orderedAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getOrderedAmount() {
        return orderedAmount;
    }


    /**
     * Sets the orderedAmount value for this OriginatingLeadSearchBasic.
     * 
     * @param orderedAmount
     */
    public void setOrderedAmount(org.mule.module.netsuite.api.internal.SearchDoubleField orderedAmount) {
        this.orderedAmount = orderedAmount;
    }


    /**
     * Gets the orderedDate value for this OriginatingLeadSearchBasic.
     * 
     * @return orderedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getOrderedDate() {
        return orderedDate;
    }


    /**
     * Sets the orderedDate value for this OriginatingLeadSearchBasic.
     * 
     * @param orderedDate
     */
    public void setOrderedDate(org.mule.module.netsuite.api.internal.SearchDateField orderedDate) {
        this.orderedDate = orderedDate;
    }


    /**
     * Gets the otherRelationships value for this OriginatingLeadSearchBasic.
     * 
     * @return otherRelationships
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getOtherRelationships() {
        return otherRelationships;
    }


    /**
     * Sets the otherRelationships value for this OriginatingLeadSearchBasic.
     * 
     * @param otherRelationships
     */
    public void setOtherRelationships(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField otherRelationships) {
        this.otherRelationships = otherRelationships;
    }


    /**
     * Gets the overdueBalance value for this OriginatingLeadSearchBasic.
     * 
     * @return overdueBalance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getOverdueBalance() {
        return overdueBalance;
    }


    /**
     * Sets the overdueBalance value for this OriginatingLeadSearchBasic.
     * 
     * @param overdueBalance
     */
    public void setOverdueBalance(org.mule.module.netsuite.api.internal.SearchDoubleField overdueBalance) {
        this.overdueBalance = overdueBalance;
    }


    /**
     * Gets the parent value for this OriginatingLeadSearchBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this OriginatingLeadSearchBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the parentItemsBought value for this OriginatingLeadSearchBasic.
     * 
     * @return parentItemsBought
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParentItemsBought() {
        return parentItemsBought;
    }


    /**
     * Sets the parentItemsBought value for this OriginatingLeadSearchBasic.
     * 
     * @param parentItemsBought
     */
    public void setParentItemsBought(org.mule.module.netsuite.api.internal.SearchMultiSelectField parentItemsBought) {
        this.parentItemsBought = parentItemsBought;
    }


    /**
     * Gets the parentItemsOrdered value for this OriginatingLeadSearchBasic.
     * 
     * @return parentItemsOrdered
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParentItemsOrdered() {
        return parentItemsOrdered;
    }


    /**
     * Sets the parentItemsOrdered value for this OriginatingLeadSearchBasic.
     * 
     * @param parentItemsOrdered
     */
    public void setParentItemsOrdered(org.mule.module.netsuite.api.internal.SearchMultiSelectField parentItemsOrdered) {
        this.parentItemsOrdered = parentItemsOrdered;
    }


    /**
     * Gets the partner value for this OriginatingLeadSearchBasic.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this OriginatingLeadSearchBasic.
     * 
     * @param partner
     */
    public void setPartner(org.mule.module.netsuite.api.internal.SearchMultiSelectField partner) {
        this.partner = partner;
    }


    /**
     * Gets the partnerContribution value for this OriginatingLeadSearchBasic.
     * 
     * @return partnerContribution
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this OriginatingLeadSearchBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(org.mule.module.netsuite.api.internal.SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }


    /**
     * Gets the partnerRole value for this OriginatingLeadSearchBasic.
     * 
     * @return partnerRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this OriginatingLeadSearchBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }


    /**
     * Gets the partnerTeamMember value for this OriginatingLeadSearchBasic.
     * 
     * @return partnerTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this OriginatingLeadSearchBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }


    /**
     * Gets the pec value for this OriginatingLeadSearchBasic.
     * 
     * @return pec
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPec() {
        return pec;
    }


    /**
     * Sets the pec value for this OriginatingLeadSearchBasic.
     * 
     * @param pec
     */
    public void setPec(org.mule.module.netsuite.api.internal.SearchStringField pec) {
        this.pec = pec;
    }


    /**
     * Gets the priceLevel value for this OriginatingLeadSearchBasic.
     * 
     * @return priceLevel
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this OriginatingLeadSearchBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(org.mule.module.netsuite.api.internal.SearchMultiSelectField priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the pricingGroup value for this OriginatingLeadSearchBasic.
     * 
     * @return pricingGroup
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this OriginatingLeadSearchBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the pricingItem value for this OriginatingLeadSearchBasic.
     * 
     * @return pricingItem
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPricingItem() {
        return pricingItem;
    }


    /**
     * Sets the pricingItem value for this OriginatingLeadSearchBasic.
     * 
     * @param pricingItem
     */
    public void setPricingItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingItem) {
        this.pricingItem = pricingItem;
    }


    /**
     * Gets the printTransactions value for this OriginatingLeadSearchBasic.
     * 
     * @return printTransactions
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPrintTransactions() {
        return printTransactions;
    }


    /**
     * Sets the printTransactions value for this OriginatingLeadSearchBasic.
     * 
     * @param printTransactions
     */
    public void setPrintTransactions(org.mule.module.netsuite.api.internal.SearchBooleanField printTransactions) {
        this.printTransactions = printTransactions;
    }


    /**
     * Gets the prospectDate value for this OriginatingLeadSearchBasic.
     * 
     * @return prospectDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getProspectDate() {
        return prospectDate;
    }


    /**
     * Sets the prospectDate value for this OriginatingLeadSearchBasic.
     * 
     * @param prospectDate
     */
    public void setProspectDate(org.mule.module.netsuite.api.internal.SearchDateField prospectDate) {
        this.prospectDate = prospectDate;
    }


    /**
     * Gets the pstExempt value for this OriginatingLeadSearchBasic.
     * 
     * @return pstExempt
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPstExempt() {
        return pstExempt;
    }


    /**
     * Sets the pstExempt value for this OriginatingLeadSearchBasic.
     * 
     * @param pstExempt
     */
    public void setPstExempt(org.mule.module.netsuite.api.internal.SearchBooleanField pstExempt) {
        this.pstExempt = pstExempt;
    }


    /**
     * Gets the reminderDate value for this OriginatingLeadSearchBasic.
     * 
     * @return reminderDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getReminderDate() {
        return reminderDate;
    }


    /**
     * Sets the reminderDate value for this OriginatingLeadSearchBasic.
     * 
     * @param reminderDate
     */
    public void setReminderDate(org.mule.module.netsuite.api.internal.SearchDateField reminderDate) {
        this.reminderDate = reminderDate;
    }


    /**
     * Gets the resaleNumber value for this OriginatingLeadSearchBasic.
     * 
     * @return resaleNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getResaleNumber() {
        return resaleNumber;
    }


    /**
     * Sets the resaleNumber value for this OriginatingLeadSearchBasic.
     * 
     * @param resaleNumber
     */
    public void setResaleNumber(org.mule.module.netsuite.api.internal.SearchStringField resaleNumber) {
        this.resaleNumber = resaleNumber;
    }


    /**
     * Gets the role value for this OriginatingLeadSearchBasic.
     * 
     * @return role
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getRole() {
        return role;
    }


    /**
     * Sets the role value for this OriginatingLeadSearchBasic.
     * 
     * @param role
     */
    public void setRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField role) {
        this.role = role;
    }


    /**
     * Gets the salesReadiness value for this OriginatingLeadSearchBasic.
     * 
     * @return salesReadiness
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesReadiness() {
        return salesReadiness;
    }


    /**
     * Sets the salesReadiness value for this OriginatingLeadSearchBasic.
     * 
     * @param salesReadiness
     */
    public void setSalesReadiness(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesReadiness) {
        this.salesReadiness = salesReadiness;
    }


    /**
     * Gets the salesRep value for this OriginatingLeadSearchBasic.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this OriginatingLeadSearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesTeamMember value for this OriginatingLeadSearchBasic.
     * 
     * @return salesTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this OriginatingLeadSearchBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }


    /**
     * Gets the salesTeamRole value for this OriginatingLeadSearchBasic.
     * 
     * @return salesTeamRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this OriginatingLeadSearchBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }


    /**
     * Gets the salutation value for this OriginatingLeadSearchBasic.
     * 
     * @return salutation
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSalutation() {
        return salutation;
    }


    /**
     * Sets the salutation value for this OriginatingLeadSearchBasic.
     * 
     * @param salutation
     */
    public void setSalutation(org.mule.module.netsuite.api.internal.SearchStringField salutation) {
        this.salutation = salutation;
    }


    /**
     * Gets the shipComplete value for this OriginatingLeadSearchBasic.
     * 
     * @return shipComplete
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this OriginatingLeadSearchBasic.
     * 
     * @param shipComplete
     */
    public void setShipComplete(org.mule.module.netsuite.api.internal.SearchBooleanField shipComplete) {
        this.shipComplete = shipComplete;
    }


    /**
     * Gets the shippingItem value for this OriginatingLeadSearchBasic.
     * 
     * @return shippingItem
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getShippingItem() {
        return shippingItem;
    }


    /**
     * Sets the shippingItem value for this OriginatingLeadSearchBasic.
     * 
     * @param shippingItem
     */
    public void setShippingItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField shippingItem) {
        this.shippingItem = shippingItem;
    }


    /**
     * Gets the stage value for this OriginatingLeadSearchBasic.
     * 
     * @return stage
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this OriginatingLeadSearchBasic.
     * 
     * @param stage
     */
    public void setStage(org.mule.module.netsuite.api.internal.SearchMultiSelectField stage) {
        this.stage = stage;
    }


    /**
     * Gets the startDate value for this OriginatingLeadSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this OriginatingLeadSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the subsidBought value for this OriginatingLeadSearchBasic.
     * 
     * @return subsidBought
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidBought() {
        return subsidBought;
    }


    /**
     * Sets the subsidBought value for this OriginatingLeadSearchBasic.
     * 
     * @param subsidBought
     */
    public void setSubsidBought(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidBought) {
        this.subsidBought = subsidBought;
    }


    /**
     * Gets the taxable value for this OriginatingLeadSearchBasic.
     * 
     * @return taxable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getTaxable() {
        return taxable;
    }


    /**
     * Sets the taxable value for this OriginatingLeadSearchBasic.
     * 
     * @param taxable
     */
    public void setTaxable(org.mule.module.netsuite.api.internal.SearchBooleanField taxable) {
        this.taxable = taxable;
    }


    /**
     * Gets the terms value for this OriginatingLeadSearchBasic.
     * 
     * @return terms
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this OriginatingLeadSearchBasic.
     * 
     * @param terms
     */
    public void setTerms(org.mule.module.netsuite.api.internal.SearchMultiSelectField terms) {
        this.terms = terms;
    }


    /**
     * Gets the territory value for this OriginatingLeadSearchBasic.
     * 
     * @return territory
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTerritory() {
        return territory;
    }


    /**
     * Sets the territory value for this OriginatingLeadSearchBasic.
     * 
     * @param territory
     */
    public void setTerritory(org.mule.module.netsuite.api.internal.SearchMultiSelectField territory) {
        this.territory = territory;
    }


    /**
     * Gets the title value for this OriginatingLeadSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this OriginatingLeadSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the unbilledOrders value for this OriginatingLeadSearchBasic.
     * 
     * @return unbilledOrders
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getUnbilledOrders() {
        return unbilledOrders;
    }


    /**
     * Sets the unbilledOrders value for this OriginatingLeadSearchBasic.
     * 
     * @param unbilledOrders
     */
    public void setUnbilledOrders(org.mule.module.netsuite.api.internal.SearchDoubleField unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }


    /**
     * Gets the url value for this OriginatingLeadSearchBasic.
     * 
     * @return url
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getUrl() {
        return url;
    }


    /**
     * Sets the url value for this OriginatingLeadSearchBasic.
     * 
     * @param url
     */
    public void setUrl(org.mule.module.netsuite.api.internal.SearchStringField url) {
        this.url = url;
    }


    /**
     * Gets the vatRegNumber value for this OriginatingLeadSearchBasic.
     * 
     * @return vatRegNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getVatRegNumber() {
        return vatRegNumber;
    }


    /**
     * Sets the vatRegNumber value for this OriginatingLeadSearchBasic.
     * 
     * @param vatRegNumber
     */
    public void setVatRegNumber(org.mule.module.netsuite.api.internal.SearchStringField vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }


    /**
     * Gets the webLead value for this OriginatingLeadSearchBasic.
     * 
     * @return webLead
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getWebLead() {
        return webLead;
    }


    /**
     * Sets the webLead value for this OriginatingLeadSearchBasic.
     * 
     * @param webLead
     */
    public void setWebLead(org.mule.module.netsuite.api.internal.SearchBooleanField webLead) {
        this.webLead = webLead;
    }


    /**
     * Gets the customFieldList value for this OriginatingLeadSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this OriginatingLeadSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OriginatingLeadSearchBasic)) return false;
        OriginatingLeadSearchBasic other = (OriginatingLeadSearchBasic) obj;
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
            ((this.availableOffline==null && other.getAvailableOffline()==null) || 
             (this.availableOffline!=null &&
              this.availableOffline.equals(other.getAvailableOffline()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.boughtAmount==null && other.getBoughtAmount()==null) || 
             (this.boughtAmount!=null &&
              this.boughtAmount.equals(other.getBoughtAmount()))) &&
            ((this.boughtDate==null && other.getBoughtDate()==null) || 
             (this.boughtDate!=null &&
              this.boughtDate.equals(other.getBoughtDate()))) &&
            ((this.buyingReason==null && other.getBuyingReason()==null) || 
             (this.buyingReason!=null &&
              this.buyingReason.equals(other.getBuyingReason()))) &&
            ((this.buyingTimeFrame==null && other.getBuyingTimeFrame()==null) || 
             (this.buyingTimeFrame!=null &&
              this.buyingTimeFrame.equals(other.getBuyingTimeFrame()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              this.ccCustomerCode.equals(other.getCcCustomerCode()))) &&
            ((this.ccDefault==null && other.getCcDefault()==null) || 
             (this.ccDefault!=null &&
              this.ccDefault.equals(other.getCcDefault()))) &&
            ((this.ccExpDate==null && other.getCcExpDate()==null) || 
             (this.ccExpDate!=null &&
              this.ccExpDate.equals(other.getCcExpDate()))) &&
            ((this.ccHolderName==null && other.getCcHolderName()==null) || 
             (this.ccHolderName!=null &&
              this.ccHolderName.equals(other.getCcHolderName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.ccType==null && other.getCcType()==null) || 
             (this.ccType!=null &&
              this.ccType.equals(other.getCcType()))) &&
            ((this.classBought==null && other.getClassBought()==null) || 
             (this.classBought!=null &&
              this.classBought.equals(other.getClassBought()))) &&
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution()))) &&
            ((this.conversionDate==null && other.getConversionDate()==null) || 
             (this.conversionDate!=null &&
              this.conversionDate.equals(other.getConversionDate()))) &&
            ((this.creditHoldOverride==null && other.getCreditHoldOverride()==null) || 
             (this.creditHoldOverride!=null &&
              this.creditHoldOverride.equals(other.getCreditHoldOverride()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.custStage==null && other.getCustStage()==null) || 
             (this.custStage!=null &&
              this.custStage.equals(other.getCustStage()))) &&
            ((this.custStatus==null && other.getCustStatus()==null) || 
             (this.custStatus!=null &&
              this.custStatus.equals(other.getCustStatus()))) &&
            ((this.dateClosed==null && other.getDateClosed()==null) || 
             (this.dateClosed!=null &&
              this.dateClosed.equals(other.getDateClosed()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              this.daysOverdue.equals(other.getDaysOverdue()))) &&
            ((this.depositBalance==null && other.getDepositBalance()==null) || 
             (this.depositBalance!=null &&
              this.depositBalance.equals(other.getDepositBalance()))) &&
            ((this.deptBought==null && other.getDeptBought()==null) || 
             (this.deptBought!=null &&
              this.deptBought.equals(other.getDeptBought()))) &&
            ((this.emailTransactions==null && other.getEmailTransactions()==null) || 
             (this.emailTransactions!=null &&
              this.emailTransactions.equals(other.getEmailTransactions()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.estimatedBudget==null && other.getEstimatedBudget()==null) || 
             (this.estimatedBudget!=null &&
              this.estimatedBudget.equals(other.getEstimatedBudget()))) &&
            ((this.explicitConversion==null && other.getExplicitConversion()==null) || 
             (this.explicitConversion!=null &&
              this.explicitConversion.equals(other.getExplicitConversion()))) &&
            ((this.faxTransactions==null && other.getFaxTransactions()==null) || 
             (this.faxTransactions!=null &&
              this.faxTransactions.equals(other.getFaxTransactions()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.firstOrderDate==null && other.getFirstOrderDate()==null) || 
             (this.firstOrderDate!=null &&
              this.firstOrderDate.equals(other.getFirstOrderDate()))) &&
            ((this.firstSaleDate==null && other.getFirstSaleDate()==null) || 
             (this.firstSaleDate!=null &&
              this.firstSaleDate.equals(other.getFirstSaleDate()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.groupPricingLevel==null && other.getGroupPricingLevel()==null) || 
             (this.groupPricingLevel!=null &&
              this.groupPricingLevel.equals(other.getGroupPricingLevel()))) &&
            ((this.hasDuplicates==null && other.getHasDuplicates()==null) || 
             (this.hasDuplicates!=null &&
              this.hasDuplicates.equals(other.getHasDuplicates()))) &&
            ((this.isBudgetApproved==null && other.getIsBudgetApproved()==null) || 
             (this.isBudgetApproved!=null &&
              this.isBudgetApproved.equals(other.getIsBudgetApproved()))) &&
            ((this.isPerson==null && other.getIsPerson()==null) || 
             (this.isPerson!=null &&
              this.isPerson.equals(other.getIsPerson()))) &&
            ((this.isReportedLead==null && other.getIsReportedLead()==null) || 
             (this.isReportedLead!=null &&
              this.isReportedLead.equals(other.getIsReportedLead()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              this.isShipAddress.equals(other.getIsShipAddress()))) &&
            ((this.itemPricingLevel==null && other.getItemPricingLevel()==null) || 
             (this.itemPricingLevel!=null &&
              this.itemPricingLevel.equals(other.getItemPricingLevel()))) &&
            ((this.itemPricingUnitPrice==null && other.getItemPricingUnitPrice()==null) || 
             (this.itemPricingUnitPrice!=null &&
              this.itemPricingUnitPrice.equals(other.getItemPricingUnitPrice()))) &&
            ((this.itemsBought==null && other.getItemsBought()==null) || 
             (this.itemsBought!=null &&
              this.itemsBought.equals(other.getItemsBought()))) &&
            ((this.itemsOrdered==null && other.getItemsOrdered()==null) || 
             (this.itemsOrdered!=null &&
              this.itemsOrdered.equals(other.getItemsOrdered()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.leadDate==null && other.getLeadDate()==null) || 
             (this.leadDate!=null &&
              this.leadDate.equals(other.getLeadDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.locationBought==null && other.getLocationBought()==null) || 
             (this.locationBought!=null &&
              this.locationBought.equals(other.getLocationBought()))) &&
            ((this.manualCreditHold==null && other.getManualCreditHold()==null) || 
             (this.manualCreditHold!=null &&
              this.manualCreditHold.equals(other.getManualCreditHold()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              this.merchantAccount.equals(other.getMerchantAccount()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.onCreditHold==null && other.getOnCreditHold()==null) || 
             (this.onCreditHold!=null &&
              this.onCreditHold.equals(other.getOnCreditHold()))) &&
            ((this.orderedAmount==null && other.getOrderedAmount()==null) || 
             (this.orderedAmount!=null &&
              this.orderedAmount.equals(other.getOrderedAmount()))) &&
            ((this.orderedDate==null && other.getOrderedDate()==null) || 
             (this.orderedDate!=null &&
              this.orderedDate.equals(other.getOrderedDate()))) &&
            ((this.otherRelationships==null && other.getOtherRelationships()==null) || 
             (this.otherRelationships!=null &&
              this.otherRelationships.equals(other.getOtherRelationships()))) &&
            ((this.overdueBalance==null && other.getOverdueBalance()==null) || 
             (this.overdueBalance!=null &&
              this.overdueBalance.equals(other.getOverdueBalance()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.parentItemsBought==null && other.getParentItemsBought()==null) || 
             (this.parentItemsBought!=null &&
              this.parentItemsBought.equals(other.getParentItemsBought()))) &&
            ((this.parentItemsOrdered==null && other.getParentItemsOrdered()==null) || 
             (this.parentItemsOrdered!=null &&
              this.parentItemsOrdered.equals(other.getParentItemsOrdered()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.partnerContribution==null && other.getPartnerContribution()==null) || 
             (this.partnerContribution!=null &&
              this.partnerContribution.equals(other.getPartnerContribution()))) &&
            ((this.partnerRole==null && other.getPartnerRole()==null) || 
             (this.partnerRole!=null &&
              this.partnerRole.equals(other.getPartnerRole()))) &&
            ((this.partnerTeamMember==null && other.getPartnerTeamMember()==null) || 
             (this.partnerTeamMember!=null &&
              this.partnerTeamMember.equals(other.getPartnerTeamMember()))) &&
            ((this.pec==null && other.getPec()==null) || 
             (this.pec!=null &&
              this.pec.equals(other.getPec()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              this.priceLevel.equals(other.getPriceLevel()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              this.pricingGroup.equals(other.getPricingGroup()))) &&
            ((this.pricingItem==null && other.getPricingItem()==null) || 
             (this.pricingItem!=null &&
              this.pricingItem.equals(other.getPricingItem()))) &&
            ((this.printTransactions==null && other.getPrintTransactions()==null) || 
             (this.printTransactions!=null &&
              this.printTransactions.equals(other.getPrintTransactions()))) &&
            ((this.prospectDate==null && other.getProspectDate()==null) || 
             (this.prospectDate!=null &&
              this.prospectDate.equals(other.getProspectDate()))) &&
            ((this.pstExempt==null && other.getPstExempt()==null) || 
             (this.pstExempt!=null &&
              this.pstExempt.equals(other.getPstExempt()))) &&
            ((this.reminderDate==null && other.getReminderDate()==null) || 
             (this.reminderDate!=null &&
              this.reminderDate.equals(other.getReminderDate()))) &&
            ((this.resaleNumber==null && other.getResaleNumber()==null) || 
             (this.resaleNumber!=null &&
              this.resaleNumber.equals(other.getResaleNumber()))) &&
            ((this.role==null && other.getRole()==null) || 
             (this.role!=null &&
              this.role.equals(other.getRole()))) &&
            ((this.salesReadiness==null && other.getSalesReadiness()==null) || 
             (this.salesReadiness!=null &&
              this.salesReadiness.equals(other.getSalesReadiness()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              this.salesTeamMember.equals(other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              this.salesTeamRole.equals(other.getSalesTeamRole()))) &&
            ((this.salutation==null && other.getSalutation()==null) || 
             (this.salutation!=null &&
              this.salutation.equals(other.getSalutation()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              this.shipComplete.equals(other.getShipComplete()))) &&
            ((this.shippingItem==null && other.getShippingItem()==null) || 
             (this.shippingItem!=null &&
              this.shippingItem.equals(other.getShippingItem()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.subsidBought==null && other.getSubsidBought()==null) || 
             (this.subsidBought!=null &&
              this.subsidBought.equals(other.getSubsidBought()))) &&
            ((this.taxable==null && other.getTaxable()==null) || 
             (this.taxable!=null &&
              this.taxable.equals(other.getTaxable()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.territory==null && other.getTerritory()==null) || 
             (this.territory!=null &&
              this.territory.equals(other.getTerritory()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.unbilledOrders==null && other.getUnbilledOrders()==null) || 
             (this.unbilledOrders!=null &&
              this.unbilledOrders.equals(other.getUnbilledOrders()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.vatRegNumber==null && other.getVatRegNumber()==null) || 
             (this.vatRegNumber!=null &&
              this.vatRegNumber.equals(other.getVatRegNumber()))) &&
            ((this.webLead==null && other.getWebLead()==null) || 
             (this.webLead!=null &&
              this.webLead.equals(other.getWebLead()))) &&
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
        if (getAvailableOffline() != null) {
            _hashCode += getAvailableOffline().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getBoughtAmount() != null) {
            _hashCode += getBoughtAmount().hashCode();
        }
        if (getBoughtDate() != null) {
            _hashCode += getBoughtDate().hashCode();
        }
        if (getBuyingReason() != null) {
            _hashCode += getBuyingReason().hashCode();
        }
        if (getBuyingTimeFrame() != null) {
            _hashCode += getBuyingTimeFrame().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getCcCustomerCode() != null) {
            _hashCode += getCcCustomerCode().hashCode();
        }
        if (getCcDefault() != null) {
            _hashCode += getCcDefault().hashCode();
        }
        if (getCcExpDate() != null) {
            _hashCode += getCcExpDate().hashCode();
        }
        if (getCcHolderName() != null) {
            _hashCode += getCcHolderName().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getCcType() != null) {
            _hashCode += getCcType().hashCode();
        }
        if (getClassBought() != null) {
            _hashCode += getClassBought().hashCode();
        }
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        if (getConversionDate() != null) {
            _hashCode += getConversionDate().hashCode();
        }
        if (getCreditHoldOverride() != null) {
            _hashCode += getCreditHoldOverride().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getCustStage() != null) {
            _hashCode += getCustStage().hashCode();
        }
        if (getCustStatus() != null) {
            _hashCode += getCustStatus().hashCode();
        }
        if (getDateClosed() != null) {
            _hashCode += getDateClosed().hashCode();
        }
        if (getDaysOverdue() != null) {
            _hashCode += getDaysOverdue().hashCode();
        }
        if (getDepositBalance() != null) {
            _hashCode += getDepositBalance().hashCode();
        }
        if (getDeptBought() != null) {
            _hashCode += getDeptBought().hashCode();
        }
        if (getEmailTransactions() != null) {
            _hashCode += getEmailTransactions().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getEstimatedBudget() != null) {
            _hashCode += getEstimatedBudget().hashCode();
        }
        if (getExplicitConversion() != null) {
            _hashCode += getExplicitConversion().hashCode();
        }
        if (getFaxTransactions() != null) {
            _hashCode += getFaxTransactions().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getFirstOrderDate() != null) {
            _hashCode += getFirstOrderDate().hashCode();
        }
        if (getFirstSaleDate() != null) {
            _hashCode += getFirstSaleDate().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getGroupPricingLevel() != null) {
            _hashCode += getGroupPricingLevel().hashCode();
        }
        if (getHasDuplicates() != null) {
            _hashCode += getHasDuplicates().hashCode();
        }
        if (getIsBudgetApproved() != null) {
            _hashCode += getIsBudgetApproved().hashCode();
        }
        if (getIsPerson() != null) {
            _hashCode += getIsPerson().hashCode();
        }
        if (getIsReportedLead() != null) {
            _hashCode += getIsReportedLead().hashCode();
        }
        if (getIsShipAddress() != null) {
            _hashCode += getIsShipAddress().hashCode();
        }
        if (getItemPricingLevel() != null) {
            _hashCode += getItemPricingLevel().hashCode();
        }
        if (getItemPricingUnitPrice() != null) {
            _hashCode += getItemPricingUnitPrice().hashCode();
        }
        if (getItemsBought() != null) {
            _hashCode += getItemsBought().hashCode();
        }
        if (getItemsOrdered() != null) {
            _hashCode += getItemsOrdered().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getLeadDate() != null) {
            _hashCode += getLeadDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLocationBought() != null) {
            _hashCode += getLocationBought().hashCode();
        }
        if (getManualCreditHold() != null) {
            _hashCode += getManualCreditHold().hashCode();
        }
        if (getMerchantAccount() != null) {
            _hashCode += getMerchantAccount().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getOnCreditHold() != null) {
            _hashCode += getOnCreditHold().hashCode();
        }
        if (getOrderedAmount() != null) {
            _hashCode += getOrderedAmount().hashCode();
        }
        if (getOrderedDate() != null) {
            _hashCode += getOrderedDate().hashCode();
        }
        if (getOtherRelationships() != null) {
            _hashCode += getOtherRelationships().hashCode();
        }
        if (getOverdueBalance() != null) {
            _hashCode += getOverdueBalance().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getParentItemsBought() != null) {
            _hashCode += getParentItemsBought().hashCode();
        }
        if (getParentItemsOrdered() != null) {
            _hashCode += getParentItemsOrdered().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getPartnerContribution() != null) {
            _hashCode += getPartnerContribution().hashCode();
        }
        if (getPartnerRole() != null) {
            _hashCode += getPartnerRole().hashCode();
        }
        if (getPartnerTeamMember() != null) {
            _hashCode += getPartnerTeamMember().hashCode();
        }
        if (getPec() != null) {
            _hashCode += getPec().hashCode();
        }
        if (getPriceLevel() != null) {
            _hashCode += getPriceLevel().hashCode();
        }
        if (getPricingGroup() != null) {
            _hashCode += getPricingGroup().hashCode();
        }
        if (getPricingItem() != null) {
            _hashCode += getPricingItem().hashCode();
        }
        if (getPrintTransactions() != null) {
            _hashCode += getPrintTransactions().hashCode();
        }
        if (getProspectDate() != null) {
            _hashCode += getProspectDate().hashCode();
        }
        if (getPstExempt() != null) {
            _hashCode += getPstExempt().hashCode();
        }
        if (getReminderDate() != null) {
            _hashCode += getReminderDate().hashCode();
        }
        if (getResaleNumber() != null) {
            _hashCode += getResaleNumber().hashCode();
        }
        if (getRole() != null) {
            _hashCode += getRole().hashCode();
        }
        if (getSalesReadiness() != null) {
            _hashCode += getSalesReadiness().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getSalesTeamMember() != null) {
            _hashCode += getSalesTeamMember().hashCode();
        }
        if (getSalesTeamRole() != null) {
            _hashCode += getSalesTeamRole().hashCode();
        }
        if (getSalutation() != null) {
            _hashCode += getSalutation().hashCode();
        }
        if (getShipComplete() != null) {
            _hashCode += getShipComplete().hashCode();
        }
        if (getShippingItem() != null) {
            _hashCode += getShippingItem().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getSubsidBought() != null) {
            _hashCode += getSubsidBought().hashCode();
        }
        if (getTaxable() != null) {
            _hashCode += getTaxable().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getTerritory() != null) {
            _hashCode += getTerritory().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUnbilledOrders() != null) {
            _hashCode += getUnbilledOrders().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getVatRegNumber() != null) {
            _hashCode += getVatRegNumber().hashCode();
        }
        if (getWebLead() != null) {
            _hashCode += getWebLead().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OriginatingLeadSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boughtAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "boughtAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boughtDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "boughtDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccHolderName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccHolderName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "classBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "companyName"));
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
        elemField.setFieldName("contribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "conversionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custStage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "custStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "custStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deptBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deptBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("explicitConversion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "explicitConversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("firstOrderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "firstOrderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstSaleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "firstSaleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("groupPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "groupPricingLevel"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isBudgetApproved"));
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
        elemField.setFieldName("isReportedLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isReportedLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricingLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemPricingLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPricingUnitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemPricingUnitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemsOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("leadDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manualCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "merchantAccount"));
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
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "orderedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "orderedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("parentItemsBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parentItemsBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentItemsOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parentItemsOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pricingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prospectDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "prospectDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pstExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pstExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reminderDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reminderDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTeamRole"));
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
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("subsidBought");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidBought"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("territory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "territory"));
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
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webLead");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
