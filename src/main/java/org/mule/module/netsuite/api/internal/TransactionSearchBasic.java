/**
 * TransactionSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchMultiSelectField account;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField accountType;

    private org.mule.module.netsuite.api.internal.SearchDateField actualShipDate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField altSalesAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField altSalesNetAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField amount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField amountPaid;

    private org.mule.module.netsuite.api.internal.SearchDoubleField amountRemaining;

    private org.mule.module.netsuite.api.internal.SearchDoubleField amountUnbilled;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField anyLineItem;

    private org.mule.module.netsuite.api.internal.SearchDoubleField appliedToForeignAmount;

    private org.mule.module.netsuite.api.internal.SearchBooleanField appliedToIsFxVariance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField appliedToLinkAmount;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField appliedToLinkType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField appliedToTransaction;

    private org.mule.module.netsuite.api.internal.SearchDoubleField applyingForeignAmount;

    private org.mule.module.netsuite.api.internal.SearchBooleanField applyingIsFxVariance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField applyingLinkAmount;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField applyingLinkType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField applyingTransaction;

    private org.mule.module.netsuite.api.internal.SearchStringField authCode;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField avsStreetMatch;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField avsZipMatch;

    private org.mule.module.netsuite.api.internal.SearchBooleanField billable;

    private org.mule.module.netsuite.api.internal.SearchStringField billAddress;

    private org.mule.module.netsuite.api.internal.SearchStringField billAddressee;

    private org.mule.module.netsuite.api.internal.SearchStringField billAttention;

    private org.mule.module.netsuite.api.internal.SearchStringField billCity;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField billCountry;

    private org.mule.module.netsuite.api.internal.SearchStringField billCounty;

    private org.mule.module.netsuite.api.internal.SearchDateField billedDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField billingSchedule;

    private org.mule.module.netsuite.api.internal.SearchBooleanField billingStatus;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField billingTransaction;

    private org.mule.module.netsuite.api.internal.SearchStringField billPhone;

    private org.mule.module.netsuite.api.internal.SearchStringField billState;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField billVarianceStatus;

    private org.mule.module.netsuite.api.internal.SearchStringField billZip;

    private org.mule.module.netsuite.api.internal.SearchStringField binNumber;

    private org.mule.module.netsuite.api.internal.SearchDoubleField binNumberQuantity;

    private org.mule.module.netsuite.api.internal.SearchBooleanField buildEntireAssembly;

    private org.mule.module.netsuite.api.internal.SearchDoubleField buildVariance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField built;

    private org.mule.module.netsuite.api.internal.SearchStringField ccCustomerCode;

    private org.mule.module.netsuite.api.internal.SearchDateField ccExpireDate;

    private org.mule.module.netsuite.api.internal.SearchStringField ccName;

    private org.mule.module.netsuite.api.internal.SearchStringField ccNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField _class;

    private org.mule.module.netsuite.api.internal.SearchBooleanField cleared;

    private org.mule.module.netsuite.api.internal.SearchBooleanField closed;

    private org.mule.module.netsuite.api.internal.SearchDateField closeDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField cogs;

    private org.mule.module.netsuite.api.internal.SearchDateField commissionEffectiveDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField commit;

    private org.mule.module.netsuite.api.internal.SearchStringField confirmationNumber;

    private org.mule.module.netsuite.api.internal.SearchLongField contribution;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costEstimate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costEstimateRate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costEstimateType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField createdBy;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField createdFrom;

    private org.mule.module.netsuite.api.internal.SearchDoubleField creditAmount;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField cscMatch;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField currencyName;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField customerSubOf;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField customForm;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField custType;

    private org.mule.module.netsuite.api.internal.SearchDateField dateCreated;

    private org.mule.module.netsuite.api.internal.SearchLongField daysOpen;

    private org.mule.module.netsuite.api.internal.SearchLongField daysOverdue;

    private org.mule.module.netsuite.api.internal.SearchDoubleField debitAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField deferredRevenue;

    private org.mule.module.netsuite.api.internal.SearchBooleanField deferRevRec;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField department;

    private org.mule.module.netsuite.api.internal.SearchDateField depositDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField depositTransaction;

    private org.mule.module.netsuite.api.internal.SearchDateField dueDate;

    private org.mule.module.netsuite.api.internal.SearchStringField email;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField employee;

    private org.mule.module.netsuite.api.internal.SearchDateField endDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField entity;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estGrossProfitPct;

    private org.mule.module.netsuite.api.internal.SearchDoubleField exchangeRate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField excludeCommission;

    private org.mule.module.netsuite.api.internal.SearchDateField expectedCloseDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField expenseCategory;

    private org.mule.module.netsuite.api.internal.SearchDateField expenseDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchBooleanField finChrg;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField forecastType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField fulfillingTransaction;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxCostEstimateRate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxTranCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxVsoeAllocation;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxVsoeAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxVsoePrice;

    private org.mule.module.netsuite.api.internal.SearchBooleanField gcoAvailabelToCharge;

    private org.mule.module.netsuite.api.internal.SearchBooleanField gcoAvailableToRefund;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gcoAvsStreetMatch;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gcoAvsZipMatch;

    private org.mule.module.netsuite.api.internal.SearchLongField gcoBuyerAccountAge;

    private org.mule.module.netsuite.api.internal.SearchStringField gcoBuyerIp;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoChargeAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoChargebackAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoConfirmedChargedTotal;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoConfirmedRefundedTotal;

    private org.mule.module.netsuite.api.internal.SearchStringField gcoCreditcardNumber;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gcoCscMatch;

    private org.mule.module.netsuite.api.internal.SearchStringField gcoFinancialState;

    private org.mule.module.netsuite.api.internal.SearchStringField gcoFulfillmentState;

    private org.mule.module.netsuite.api.internal.SearchStringField gcoOrderId;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoOrderTotal;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoPromotionAmount;

    private org.mule.module.netsuite.api.internal.SearchStringField gcoPromotionName;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoRefundAmount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField gcoShippingTotal;

    private org.mule.module.netsuite.api.internal.SearchStringField gcoStateChangedDetail;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertificate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField grossAmount;

    private org.mule.module.netsuite.api.internal.SearchBooleanField includeInForecast;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField inVsoeBundle;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isAllocation;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isGcoChargeback;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isGcoChargeConfirmed;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isGcoPaymentGuaranteed;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isGcoRefundConfirmed;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isIntercompanyAdjustment;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isPayPalMeth;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isReversal;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isRevRecTransaction;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isShipAddress;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isTransferPriceCosting;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isVsoeAlloc;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField item;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField itemSubOf;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField location;

    private org.mule.module.netsuite.api.internal.SearchBooleanField mainLine;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField mainName;

    private org.mule.module.netsuite.api.internal.SearchBooleanField matchBillToReceipt;

    private org.mule.module.netsuite.api.internal.SearchStringField memo;

    private org.mule.module.netsuite.api.internal.SearchStringField memoMain;

    private org.mule.module.netsuite.api.internal.SearchBooleanField memorized;

    private org.mule.module.netsuite.api.internal.SearchStringField merchantAccount;

    private org.mule.module.netsuite.api.internal.SearchStringField message;

    private org.mule.module.netsuite.api.internal.SearchBooleanField multiSubsidiary;

    private org.mule.module.netsuite.api.internal.SearchStringField nameText;

    private org.mule.module.netsuite.api.internal.SearchDoubleField netAmount;

    private org.mule.module.netsuite.api.internal.SearchDateField nextBillDate;

    private org.mule.module.netsuite.api.internal.SearchLongField number;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField opportunity;

    private org.mule.module.netsuite.api.internal.SearchTextNumberField otherRefNum;

    private org.mule.module.netsuite.api.internal.SearchTextNumberField otherRefNumNonDeposit;

    private org.mule.module.netsuite.api.internal.SearchLongField packageCount;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField paidTransaction;

    private org.mule.module.netsuite.api.internal.SearchLongField parent;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partner;

    private org.mule.module.netsuite.api.internal.SearchLongField partnerContribution;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField payingTransaction;

    private org.mule.module.netsuite.api.internal.SearchDateField paymentEventDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField paymentEventHoldReason;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField paymentEventResult;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField paymentEventType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField paymentMethod;

    private org.mule.module.netsuite.api.internal.SearchBooleanField payPalPending;

    private org.mule.module.netsuite.api.internal.SearchStringField payPalStatus;

    private org.mule.module.netsuite.api.internal.SearchStringField payPalTranId;

    private org.mule.module.netsuite.api.internal.SearchStringField pnRefNum;

    private org.mule.module.netsuite.api.internal.SearchStringField poAsText;

    private org.mule.module.netsuite.api.internal.SearchBooleanField posting;

    private org.mule.module.netsuite.api.internal.RecordRef postingPeriod;

    private org.mule.module.netsuite.api.internal.PostingPeriodDate postingPeriodRelative;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField priceLevel;

    private org.mule.module.netsuite.api.internal.SearchBooleanField printedPickingTicket;

    private org.mule.module.netsuite.api.internal.SearchLongField probability;

    private org.mule.module.netsuite.api.internal.SearchDoubleField projectedAmount;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseOrder;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantity;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityBilled;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityPacked;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityPicked;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityRevCommitted;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityShipRecv;

    private org.mule.module.netsuite.api.internal.SearchDoubleField recognizedRevenue;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField revCommitStatus;

    private org.mule.module.netsuite.api.internal.SearchBooleanField revCommittingStatus;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField revCommittingTransaction;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField revenueStatus;

    private org.mule.module.netsuite.api.internal.SearchDateField reversalDate;

    private org.mule.module.netsuite.api.internal.SearchStringField reversalNumber;

    private org.mule.module.netsuite.api.internal.SearchDateField revRecEndDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField revRecOnRevCommitment;

    private org.mule.module.netsuite.api.internal.SearchDateField revRecStartDate;

    private org.mule.module.netsuite.api.internal.SearchLongField revRecTermInMonths;

    private org.mule.module.netsuite.api.internal.SearchDateField salesEffectiveDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole;

    private org.mule.module.netsuite.api.internal.SearchStringField serialNumber;

    private org.mule.module.netsuite.api.internal.SearchDoubleField serialNumberQuantity;

    private org.mule.module.netsuite.api.internal.SearchStringField serialNumbers;

    private org.mule.module.netsuite.api.internal.SearchStringField shipAddress;

    private org.mule.module.netsuite.api.internal.SearchStringField shipAddressee;

    private org.mule.module.netsuite.api.internal.SearchStringField shipAttention;

    private org.mule.module.netsuite.api.internal.SearchStringField shipCity;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shipComplete;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField shipCountry;

    private org.mule.module.netsuite.api.internal.SearchStringField shipCounty;

    private org.mule.module.netsuite.api.internal.SearchDateField shipDate;

    private org.mule.module.netsuite.api.internal.SearchLongField shipGroup;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField shipMethod;

    private org.mule.module.netsuite.api.internal.SearchStringField shipPhone;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shipping;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shipRecvStatus;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shipRecvStatusLine;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField shipState;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField shipTo;

    private org.mule.module.netsuite.api.internal.SearchStringField shipZip;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField source;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField taxItem;

    private org.mule.module.netsuite.api.internal.SearchBooleanField taxLine;

    private org.mule.module.netsuite.api.internal.RecordRef taxPeriod;

    private org.mule.module.netsuite.api.internal.PostingPeriodDate taxPeriodRelative;

    private org.mule.module.netsuite.api.internal.SearchDoubleField taxRate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField terms;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchBooleanField toBeEmailed;

    private org.mule.module.netsuite.api.internal.SearchBooleanField toBePrinted;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField toSubsidiary;

    private org.mule.module.netsuite.api.internal.SearchDoubleField totalAmount;

    private org.mule.module.netsuite.api.internal.SearchStringField trackingNumbers;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchDateField tranDate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfitPct;

    private org.mule.module.netsuite.api.internal.SearchDoubleField tranFxEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchStringField tranId;

    private org.mule.module.netsuite.api.internal.SearchBooleanField tranIsVsoeBundle;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField transactionLineType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField transferLocation;

    private org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityPacked;

    private org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityPicked;

    private org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityReceived;

    private org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityShipped;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField unit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField unitCostOverride;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField vendType;

    private org.mule.module.netsuite.api.internal.SearchBooleanField visibleToCustomer;

    private org.mule.module.netsuite.api.internal.SearchBooleanField voided;

    private org.mule.module.netsuite.api.internal.SearchDoubleField vsoeAllocation;

    private org.mule.module.netsuite.api.internal.SearchDoubleField vsoeAmount;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoeDeferral;

    private org.mule.module.netsuite.api.internal.SearchBooleanField vsoeDelivered;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoePermitDiscount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField vsoePrice;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField webSite;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public TransactionSearchBasic() {
    }

    /**
     * Gets the account value for this TransactionSearchBasic.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TransactionSearchBasic.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.SearchMultiSelectField account) {
        this.account = account;
    }


    /**
     * Gets the accountType value for this TransactionSearchBasic.
     * 
     * @return accountType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this TransactionSearchBasic.
     * 
     * @param accountType
     */
    public void setAccountType(org.mule.module.netsuite.api.internal.SearchMultiSelectField accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the actualShipDate value for this TransactionSearchBasic.
     * 
     * @return actualShipDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getActualShipDate() {
        return actualShipDate;
    }


    /**
     * Sets the actualShipDate value for this TransactionSearchBasic.
     * 
     * @param actualShipDate
     */
    public void setActualShipDate(org.mule.module.netsuite.api.internal.SearchDateField actualShipDate) {
        this.actualShipDate = actualShipDate;
    }


    /**
     * Gets the altSalesAmount value for this TransactionSearchBasic.
     * 
     * @return altSalesAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAltSalesAmount() {
        return altSalesAmount;
    }


    /**
     * Sets the altSalesAmount value for this TransactionSearchBasic.
     * 
     * @param altSalesAmount
     */
    public void setAltSalesAmount(org.mule.module.netsuite.api.internal.SearchDoubleField altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }


    /**
     * Gets the altSalesNetAmount value for this TransactionSearchBasic.
     * 
     * @return altSalesNetAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAltSalesNetAmount() {
        return altSalesNetAmount;
    }


    /**
     * Sets the altSalesNetAmount value for this TransactionSearchBasic.
     * 
     * @param altSalesNetAmount
     */
    public void setAltSalesNetAmount(org.mule.module.netsuite.api.internal.SearchDoubleField altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }


    /**
     * Gets the amount value for this TransactionSearchBasic.
     * 
     * @return amount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionSearchBasic.
     * 
     * @param amount
     */
    public void setAmount(org.mule.module.netsuite.api.internal.SearchDoubleField amount) {
        this.amount = amount;
    }


    /**
     * Gets the amountPaid value for this TransactionSearchBasic.
     * 
     * @return amountPaid
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this TransactionSearchBasic.
     * 
     * @param amountPaid
     */
    public void setAmountPaid(org.mule.module.netsuite.api.internal.SearchDoubleField amountPaid) {
        this.amountPaid = amountPaid;
    }


    /**
     * Gets the amountRemaining value for this TransactionSearchBasic.
     * 
     * @return amountRemaining
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this TransactionSearchBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(org.mule.module.netsuite.api.internal.SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }


    /**
     * Gets the amountUnbilled value for this TransactionSearchBasic.
     * 
     * @return amountUnbilled
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAmountUnbilled() {
        return amountUnbilled;
    }


    /**
     * Sets the amountUnbilled value for this TransactionSearchBasic.
     * 
     * @param amountUnbilled
     */
    public void setAmountUnbilled(org.mule.module.netsuite.api.internal.SearchDoubleField amountUnbilled) {
        this.amountUnbilled = amountUnbilled;
    }


    /**
     * Gets the anyLineItem value for this TransactionSearchBasic.
     * 
     * @return anyLineItem
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAnyLineItem() {
        return anyLineItem;
    }


    /**
     * Sets the anyLineItem value for this TransactionSearchBasic.
     * 
     * @param anyLineItem
     */
    public void setAnyLineItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField anyLineItem) {
        this.anyLineItem = anyLineItem;
    }


    /**
     * Gets the appliedToForeignAmount value for this TransactionSearchBasic.
     * 
     * @return appliedToForeignAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAppliedToForeignAmount() {
        return appliedToForeignAmount;
    }


    /**
     * Sets the appliedToForeignAmount value for this TransactionSearchBasic.
     * 
     * @param appliedToForeignAmount
     */
    public void setAppliedToForeignAmount(org.mule.module.netsuite.api.internal.SearchDoubleField appliedToForeignAmount) {
        this.appliedToForeignAmount = appliedToForeignAmount;
    }


    /**
     * Gets the appliedToIsFxVariance value for this TransactionSearchBasic.
     * 
     * @return appliedToIsFxVariance
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAppliedToIsFxVariance() {
        return appliedToIsFxVariance;
    }


    /**
     * Sets the appliedToIsFxVariance value for this TransactionSearchBasic.
     * 
     * @param appliedToIsFxVariance
     */
    public void setAppliedToIsFxVariance(org.mule.module.netsuite.api.internal.SearchBooleanField appliedToIsFxVariance) {
        this.appliedToIsFxVariance = appliedToIsFxVariance;
    }


    /**
     * Gets the appliedToLinkAmount value for this TransactionSearchBasic.
     * 
     * @return appliedToLinkAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAppliedToLinkAmount() {
        return appliedToLinkAmount;
    }


    /**
     * Sets the appliedToLinkAmount value for this TransactionSearchBasic.
     * 
     * @param appliedToLinkAmount
     */
    public void setAppliedToLinkAmount(org.mule.module.netsuite.api.internal.SearchDoubleField appliedToLinkAmount) {
        this.appliedToLinkAmount = appliedToLinkAmount;
    }


    /**
     * Gets the appliedToLinkType value for this TransactionSearchBasic.
     * 
     * @return appliedToLinkType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getAppliedToLinkType() {
        return appliedToLinkType;
    }


    /**
     * Sets the appliedToLinkType value for this TransactionSearchBasic.
     * 
     * @param appliedToLinkType
     */
    public void setAppliedToLinkType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField appliedToLinkType) {
        this.appliedToLinkType = appliedToLinkType;
    }


    /**
     * Gets the appliedToTransaction value for this TransactionSearchBasic.
     * 
     * @return appliedToTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAppliedToTransaction() {
        return appliedToTransaction;
    }


    /**
     * Sets the appliedToTransaction value for this TransactionSearchBasic.
     * 
     * @param appliedToTransaction
     */
    public void setAppliedToTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField appliedToTransaction) {
        this.appliedToTransaction = appliedToTransaction;
    }


    /**
     * Gets the applyingForeignAmount value for this TransactionSearchBasic.
     * 
     * @return applyingForeignAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getApplyingForeignAmount() {
        return applyingForeignAmount;
    }


    /**
     * Sets the applyingForeignAmount value for this TransactionSearchBasic.
     * 
     * @param applyingForeignAmount
     */
    public void setApplyingForeignAmount(org.mule.module.netsuite.api.internal.SearchDoubleField applyingForeignAmount) {
        this.applyingForeignAmount = applyingForeignAmount;
    }


    /**
     * Gets the applyingIsFxVariance value for this TransactionSearchBasic.
     * 
     * @return applyingIsFxVariance
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getApplyingIsFxVariance() {
        return applyingIsFxVariance;
    }


    /**
     * Sets the applyingIsFxVariance value for this TransactionSearchBasic.
     * 
     * @param applyingIsFxVariance
     */
    public void setApplyingIsFxVariance(org.mule.module.netsuite.api.internal.SearchBooleanField applyingIsFxVariance) {
        this.applyingIsFxVariance = applyingIsFxVariance;
    }


    /**
     * Gets the applyingLinkAmount value for this TransactionSearchBasic.
     * 
     * @return applyingLinkAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getApplyingLinkAmount() {
        return applyingLinkAmount;
    }


    /**
     * Sets the applyingLinkAmount value for this TransactionSearchBasic.
     * 
     * @param applyingLinkAmount
     */
    public void setApplyingLinkAmount(org.mule.module.netsuite.api.internal.SearchDoubleField applyingLinkAmount) {
        this.applyingLinkAmount = applyingLinkAmount;
    }


    /**
     * Gets the applyingLinkType value for this TransactionSearchBasic.
     * 
     * @return applyingLinkType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getApplyingLinkType() {
        return applyingLinkType;
    }


    /**
     * Sets the applyingLinkType value for this TransactionSearchBasic.
     * 
     * @param applyingLinkType
     */
    public void setApplyingLinkType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField applyingLinkType) {
        this.applyingLinkType = applyingLinkType;
    }


    /**
     * Gets the applyingTransaction value for this TransactionSearchBasic.
     * 
     * @return applyingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getApplyingTransaction() {
        return applyingTransaction;
    }


    /**
     * Sets the applyingTransaction value for this TransactionSearchBasic.
     * 
     * @param applyingTransaction
     */
    public void setApplyingTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }


    /**
     * Gets the authCode value for this TransactionSearchBasic.
     * 
     * @return authCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this TransactionSearchBasic.
     * 
     * @param authCode
     */
    public void setAuthCode(org.mule.module.netsuite.api.internal.SearchStringField authCode) {
        this.authCode = authCode;
    }


    /**
     * Gets the avsStreetMatch value for this TransactionSearchBasic.
     * 
     * @return avsStreetMatch
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getAvsStreetMatch() {
        return avsStreetMatch;
    }


    /**
     * Sets the avsStreetMatch value for this TransactionSearchBasic.
     * 
     * @param avsStreetMatch
     */
    public void setAvsStreetMatch(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField avsStreetMatch) {
        this.avsStreetMatch = avsStreetMatch;
    }


    /**
     * Gets the avsZipMatch value for this TransactionSearchBasic.
     * 
     * @return avsZipMatch
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getAvsZipMatch() {
        return avsZipMatch;
    }


    /**
     * Sets the avsZipMatch value for this TransactionSearchBasic.
     * 
     * @param avsZipMatch
     */
    public void setAvsZipMatch(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField avsZipMatch) {
        this.avsZipMatch = avsZipMatch;
    }


    /**
     * Gets the billable value for this TransactionSearchBasic.
     * 
     * @return billable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TransactionSearchBasic.
     * 
     * @param billable
     */
    public void setBillable(org.mule.module.netsuite.api.internal.SearchBooleanField billable) {
        this.billable = billable;
    }


    /**
     * Gets the billAddress value for this TransactionSearchBasic.
     * 
     * @return billAddress
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this TransactionSearchBasic.
     * 
     * @param billAddress
     */
    public void setBillAddress(org.mule.module.netsuite.api.internal.SearchStringField billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the billAddressee value for this TransactionSearchBasic.
     * 
     * @return billAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this TransactionSearchBasic.
     * 
     * @param billAddressee
     */
    public void setBillAddressee(org.mule.module.netsuite.api.internal.SearchStringField billAddressee) {
        this.billAddressee = billAddressee;
    }


    /**
     * Gets the billAttention value for this TransactionSearchBasic.
     * 
     * @return billAttention
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this TransactionSearchBasic.
     * 
     * @param billAttention
     */
    public void setBillAttention(org.mule.module.netsuite.api.internal.SearchStringField billAttention) {
        this.billAttention = billAttention;
    }


    /**
     * Gets the billCity value for this TransactionSearchBasic.
     * 
     * @return billCity
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this TransactionSearchBasic.
     * 
     * @param billCity
     */
    public void setBillCity(org.mule.module.netsuite.api.internal.SearchStringField billCity) {
        this.billCity = billCity;
    }


    /**
     * Gets the billCountry value for this TransactionSearchBasic.
     * 
     * @return billCountry
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this TransactionSearchBasic.
     * 
     * @param billCountry
     */
    public void setBillCountry(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField billCountry) {
        this.billCountry = billCountry;
    }


    /**
     * Gets the billCounty value for this TransactionSearchBasic.
     * 
     * @return billCounty
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillCounty() {
        return billCounty;
    }


    /**
     * Sets the billCounty value for this TransactionSearchBasic.
     * 
     * @param billCounty
     */
    public void setBillCounty(org.mule.module.netsuite.api.internal.SearchStringField billCounty) {
        this.billCounty = billCounty;
    }


    /**
     * Gets the billedDate value for this TransactionSearchBasic.
     * 
     * @return billedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getBilledDate() {
        return billedDate;
    }


    /**
     * Sets the billedDate value for this TransactionSearchBasic.
     * 
     * @param billedDate
     */
    public void setBilledDate(org.mule.module.netsuite.api.internal.SearchDateField billedDate) {
        this.billedDate = billedDate;
    }


    /**
     * Gets the billingSchedule value for this TransactionSearchBasic.
     * 
     * @return billingSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this TransactionSearchBasic.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(org.mule.module.netsuite.api.internal.SearchMultiSelectField billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the billingStatus value for this TransactionSearchBasic.
     * 
     * @return billingStatus
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getBillingStatus() {
        return billingStatus;
    }


    /**
     * Sets the billingStatus value for this TransactionSearchBasic.
     * 
     * @param billingStatus
     */
    public void setBillingStatus(org.mule.module.netsuite.api.internal.SearchBooleanField billingStatus) {
        this.billingStatus = billingStatus;
    }


    /**
     * Gets the billingTransaction value for this TransactionSearchBasic.
     * 
     * @return billingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getBillingTransaction() {
        return billingTransaction;
    }


    /**
     * Sets the billingTransaction value for this TransactionSearchBasic.
     * 
     * @param billingTransaction
     */
    public void setBillingTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField billingTransaction) {
        this.billingTransaction = billingTransaction;
    }


    /**
     * Gets the billPhone value for this TransactionSearchBasic.
     * 
     * @return billPhone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this TransactionSearchBasic.
     * 
     * @param billPhone
     */
    public void setBillPhone(org.mule.module.netsuite.api.internal.SearchStringField billPhone) {
        this.billPhone = billPhone;
    }


    /**
     * Gets the billState value for this TransactionSearchBasic.
     * 
     * @return billState
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this TransactionSearchBasic.
     * 
     * @param billState
     */
    public void setBillState(org.mule.module.netsuite.api.internal.SearchStringField billState) {
        this.billState = billState;
    }


    /**
     * Gets the billVarianceStatus value for this TransactionSearchBasic.
     * 
     * @return billVarianceStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getBillVarianceStatus() {
        return billVarianceStatus;
    }


    /**
     * Sets the billVarianceStatus value for this TransactionSearchBasic.
     * 
     * @param billVarianceStatus
     */
    public void setBillVarianceStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }


    /**
     * Gets the billZip value for this TransactionSearchBasic.
     * 
     * @return billZip
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBillZip() {
        return billZip;
    }


    /**
     * Sets the billZip value for this TransactionSearchBasic.
     * 
     * @param billZip
     */
    public void setBillZip(org.mule.module.netsuite.api.internal.SearchStringField billZip) {
        this.billZip = billZip;
    }


    /**
     * Gets the binNumber value for this TransactionSearchBasic.
     * 
     * @return binNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this TransactionSearchBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(org.mule.module.netsuite.api.internal.SearchStringField binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the binNumberQuantity value for this TransactionSearchBasic.
     * 
     * @return binNumberQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBinNumberQuantity() {
        return binNumberQuantity;
    }


    /**
     * Sets the binNumberQuantity value for this TransactionSearchBasic.
     * 
     * @param binNumberQuantity
     */
    public void setBinNumberQuantity(org.mule.module.netsuite.api.internal.SearchDoubleField binNumberQuantity) {
        this.binNumberQuantity = binNumberQuantity;
    }


    /**
     * Gets the buildEntireAssembly value for this TransactionSearchBasic.
     * 
     * @return buildEntireAssembly
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this TransactionSearchBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(org.mule.module.netsuite.api.internal.SearchBooleanField buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }


    /**
     * Gets the buildVariance value for this TransactionSearchBasic.
     * 
     * @return buildVariance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBuildVariance() {
        return buildVariance;
    }


    /**
     * Sets the buildVariance value for this TransactionSearchBasic.
     * 
     * @param buildVariance
     */
    public void setBuildVariance(org.mule.module.netsuite.api.internal.SearchDoubleField buildVariance) {
        this.buildVariance = buildVariance;
    }


    /**
     * Gets the built value for this TransactionSearchBasic.
     * 
     * @return built
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBuilt() {
        return built;
    }


    /**
     * Sets the built value for this TransactionSearchBasic.
     * 
     * @param built
     */
    public void setBuilt(org.mule.module.netsuite.api.internal.SearchDoubleField built) {
        this.built = built;
    }


    /**
     * Gets the ccCustomerCode value for this TransactionSearchBasic.
     * 
     * @return ccCustomerCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this TransactionSearchBasic.
     * 
     * @param ccCustomerCode
     */
    public void setCcCustomerCode(org.mule.module.netsuite.api.internal.SearchStringField ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }


    /**
     * Gets the ccExpireDate value for this TransactionSearchBasic.
     * 
     * @return ccExpireDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this TransactionSearchBasic.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(org.mule.module.netsuite.api.internal.SearchDateField ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this TransactionSearchBasic.
     * 
     * @return ccName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this TransactionSearchBasic.
     * 
     * @param ccName
     */
    public void setCcName(org.mule.module.netsuite.api.internal.SearchStringField ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccNumber value for this TransactionSearchBasic.
     * 
     * @return ccNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this TransactionSearchBasic.
     * 
     * @param ccNumber
     */
    public void setCcNumber(org.mule.module.netsuite.api.internal.SearchStringField ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the _class value for this TransactionSearchBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TransactionSearchBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the cleared value for this TransactionSearchBasic.
     * 
     * @return cleared
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getCleared() {
        return cleared;
    }


    /**
     * Sets the cleared value for this TransactionSearchBasic.
     * 
     * @param cleared
     */
    public void setCleared(org.mule.module.netsuite.api.internal.SearchBooleanField cleared) {
        this.cleared = cleared;
    }


    /**
     * Gets the closed value for this TransactionSearchBasic.
     * 
     * @return closed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this TransactionSearchBasic.
     * 
     * @param closed
     */
    public void setClosed(org.mule.module.netsuite.api.internal.SearchBooleanField closed) {
        this.closed = closed;
    }


    /**
     * Gets the closeDate value for this TransactionSearchBasic.
     * 
     * @return closeDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this TransactionSearchBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(org.mule.module.netsuite.api.internal.SearchDateField closeDate) {
        this.closeDate = closeDate;
    }


    /**
     * Gets the cogs value for this TransactionSearchBasic.
     * 
     * @return cogs
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getCogs() {
        return cogs;
    }


    /**
     * Sets the cogs value for this TransactionSearchBasic.
     * 
     * @param cogs
     */
    public void setCogs(org.mule.module.netsuite.api.internal.SearchBooleanField cogs) {
        this.cogs = cogs;
    }


    /**
     * Gets the commissionEffectiveDate value for this TransactionSearchBasic.
     * 
     * @return commissionEffectiveDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCommissionEffectiveDate() {
        return commissionEffectiveDate;
    }


    /**
     * Sets the commissionEffectiveDate value for this TransactionSearchBasic.
     * 
     * @param commissionEffectiveDate
     */
    public void setCommissionEffectiveDate(org.mule.module.netsuite.api.internal.SearchDateField commissionEffectiveDate) {
        this.commissionEffectiveDate = commissionEffectiveDate;
    }


    /**
     * Gets the commit value for this TransactionSearchBasic.
     * 
     * @return commit
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCommit() {
        return commit;
    }


    /**
     * Sets the commit value for this TransactionSearchBasic.
     * 
     * @param commit
     */
    public void setCommit(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField commit) {
        this.commit = commit;
    }


    /**
     * Gets the confirmationNumber value for this TransactionSearchBasic.
     * 
     * @return confirmationNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this TransactionSearchBasic.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(org.mule.module.netsuite.api.internal.SearchStringField confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }


    /**
     * Gets the contribution value for this TransactionSearchBasic.
     * 
     * @return contribution
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this TransactionSearchBasic.
     * 
     * @param contribution
     */
    public void setContribution(org.mule.module.netsuite.api.internal.SearchLongField contribution) {
        this.contribution = contribution;
    }


    /**
     * Gets the costEstimate value for this TransactionSearchBasic.
     * 
     * @return costEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this TransactionSearchBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(org.mule.module.netsuite.api.internal.SearchDoubleField costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the costEstimateRate value for this TransactionSearchBasic.
     * 
     * @return costEstimateRate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostEstimateRate() {
        return costEstimateRate;
    }


    /**
     * Sets the costEstimateRate value for this TransactionSearchBasic.
     * 
     * @param costEstimateRate
     */
    public void setCostEstimateRate(org.mule.module.netsuite.api.internal.SearchDoubleField costEstimateRate) {
        this.costEstimateRate = costEstimateRate;
    }


    /**
     * Gets the costEstimateType value for this TransactionSearchBasic.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this TransactionSearchBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the createdBy value for this TransactionSearchBasic.
     * 
     * @return createdBy
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this TransactionSearchBasic.
     * 
     * @param createdBy
     */
    public void setCreatedBy(org.mule.module.netsuite.api.internal.SearchMultiSelectField createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the createdFrom value for this TransactionSearchBasic.
     * 
     * @return createdFrom
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this TransactionSearchBasic.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(org.mule.module.netsuite.api.internal.SearchMultiSelectField createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the creditAmount value for this TransactionSearchBasic.
     * 
     * @return creditAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this TransactionSearchBasic.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(org.mule.module.netsuite.api.internal.SearchDoubleField creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the cscMatch value for this TransactionSearchBasic.
     * 
     * @return cscMatch
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCscMatch() {
        return cscMatch;
    }


    /**
     * Sets the cscMatch value for this TransactionSearchBasic.
     * 
     * @param cscMatch
     */
    public void setCscMatch(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField cscMatch) {
        this.cscMatch = cscMatch;
    }


    /**
     * Gets the currencyName value for this TransactionSearchBasic.
     * 
     * @return currencyName
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this TransactionSearchBasic.
     * 
     * @param currencyName
     */
    public void setCurrencyName(org.mule.module.netsuite.api.internal.SearchMultiSelectField currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the customerSubOf value for this TransactionSearchBasic.
     * 
     * @return customerSubOf
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustomerSubOf() {
        return customerSubOf;
    }


    /**
     * Sets the customerSubOf value for this TransactionSearchBasic.
     * 
     * @param customerSubOf
     */
    public void setCustomerSubOf(org.mule.module.netsuite.api.internal.SearchMultiSelectField customerSubOf) {
        this.customerSubOf = customerSubOf;
    }


    /**
     * Gets the customForm value for this TransactionSearchBasic.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this TransactionSearchBasic.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.SearchMultiSelectField customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the custType value for this TransactionSearchBasic.
     * 
     * @return custType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this TransactionSearchBasic.
     * 
     * @param custType
     */
    public void setCustType(org.mule.module.netsuite.api.internal.SearchMultiSelectField custType) {
        this.custType = custType;
    }


    /**
     * Gets the dateCreated value for this TransactionSearchBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TransactionSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the daysOpen value for this TransactionSearchBasic.
     * 
     * @return daysOpen
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this TransactionSearchBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(org.mule.module.netsuite.api.internal.SearchLongField daysOpen) {
        this.daysOpen = daysOpen;
    }


    /**
     * Gets the daysOverdue value for this TransactionSearchBasic.
     * 
     * @return daysOverdue
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this TransactionSearchBasic.
     * 
     * @param daysOverdue
     */
    public void setDaysOverdue(org.mule.module.netsuite.api.internal.SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }


    /**
     * Gets the debitAmount value for this TransactionSearchBasic.
     * 
     * @return debitAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this TransactionSearchBasic.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(org.mule.module.netsuite.api.internal.SearchDoubleField debitAmount) {
        this.debitAmount = debitAmount;
    }


    /**
     * Gets the deferredRevenue value for this TransactionSearchBasic.
     * 
     * @return deferredRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this TransactionSearchBasic.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(org.mule.module.netsuite.api.internal.SearchDoubleField deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }


    /**
     * Gets the deferRevRec value for this TransactionSearchBasic.
     * 
     * @return deferRevRec
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this TransactionSearchBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(org.mule.module.netsuite.api.internal.SearchBooleanField deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the department value for this TransactionSearchBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TransactionSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the depositDate value for this TransactionSearchBasic.
     * 
     * @return depositDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDepositDate() {
        return depositDate;
    }


    /**
     * Sets the depositDate value for this TransactionSearchBasic.
     * 
     * @param depositDate
     */
    public void setDepositDate(org.mule.module.netsuite.api.internal.SearchDateField depositDate) {
        this.depositDate = depositDate;
    }


    /**
     * Gets the depositTransaction value for this TransactionSearchBasic.
     * 
     * @return depositTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDepositTransaction() {
        return depositTransaction;
    }


    /**
     * Sets the depositTransaction value for this TransactionSearchBasic.
     * 
     * @param depositTransaction
     */
    public void setDepositTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField depositTransaction) {
        this.depositTransaction = depositTransaction;
    }


    /**
     * Gets the dueDate value for this TransactionSearchBasic.
     * 
     * @return dueDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this TransactionSearchBasic.
     * 
     * @param dueDate
     */
    public void setDueDate(org.mule.module.netsuite.api.internal.SearchDateField dueDate) {
        this.dueDate = dueDate;
    }


    /**
     * Gets the email value for this TransactionSearchBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this TransactionSearchBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the employee value for this TransactionSearchBasic.
     * 
     * @return employee
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TransactionSearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(org.mule.module.netsuite.api.internal.SearchMultiSelectField employee) {
        this.employee = employee;
    }


    /**
     * Gets the endDate value for this TransactionSearchBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TransactionSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the entity value for this TransactionSearchBasic.
     * 
     * @return entity
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this TransactionSearchBasic.
     * 
     * @param entity
     */
    public void setEntity(org.mule.module.netsuite.api.internal.SearchMultiSelectField entity) {
        this.entity = entity;
    }


    /**
     * Gets the entityStatus value for this TransactionSearchBasic.
     * 
     * @return entityStatus
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this TransactionSearchBasic.
     * 
     * @param entityStatus
     */
    public void setEntityStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }


    /**
     * Gets the estGrossProfit value for this TransactionSearchBasic.
     * 
     * @return estGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this TransactionSearchBasic.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(org.mule.module.netsuite.api.internal.SearchDoubleField estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the estGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @return estGrossProfitPct
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstGrossProfitPct() {
        return estGrossProfitPct;
    }


    /**
     * Sets the estGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @param estGrossProfitPct
     */
    public void setEstGrossProfitPct(org.mule.module.netsuite.api.internal.SearchDoubleField estGrossProfitPct) {
        this.estGrossProfitPct = estGrossProfitPct;
    }


    /**
     * Gets the exchangeRate value for this TransactionSearchBasic.
     * 
     * @return exchangeRate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this TransactionSearchBasic.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(org.mule.module.netsuite.api.internal.SearchDoubleField exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the excludeCommission value for this TransactionSearchBasic.
     * 
     * @return excludeCommission
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this TransactionSearchBasic.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(org.mule.module.netsuite.api.internal.SearchBooleanField excludeCommission) {
        this.excludeCommission = excludeCommission;
    }


    /**
     * Gets the expectedCloseDate value for this TransactionSearchBasic.
     * 
     * @return expectedCloseDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this TransactionSearchBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(org.mule.module.netsuite.api.internal.SearchDateField expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }


    /**
     * Gets the expenseCategory value for this TransactionSearchBasic.
     * 
     * @return expenseCategory
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExpenseCategory() {
        return expenseCategory;
    }


    /**
     * Sets the expenseCategory value for this TransactionSearchBasic.
     * 
     * @param expenseCategory
     */
    public void setExpenseCategory(org.mule.module.netsuite.api.internal.SearchMultiSelectField expenseCategory) {
        this.expenseCategory = expenseCategory;
    }


    /**
     * Gets the expenseDate value for this TransactionSearchBasic.
     * 
     * @return expenseDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getExpenseDate() {
        return expenseDate;
    }


    /**
     * Sets the expenseDate value for this TransactionSearchBasic.
     * 
     * @param expenseDate
     */
    public void setExpenseDate(org.mule.module.netsuite.api.internal.SearchDateField expenseDate) {
        this.expenseDate = expenseDate;
    }


    /**
     * Gets the externalId value for this TransactionSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TransactionSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TransactionSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TransactionSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the finChrg value for this TransactionSearchBasic.
     * 
     * @return finChrg
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getFinChrg() {
        return finChrg;
    }


    /**
     * Sets the finChrg value for this TransactionSearchBasic.
     * 
     * @param finChrg
     */
    public void setFinChrg(org.mule.module.netsuite.api.internal.SearchBooleanField finChrg) {
        this.finChrg = finChrg;
    }


    /**
     * Gets the forecastType value for this TransactionSearchBasic.
     * 
     * @return forecastType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this TransactionSearchBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField forecastType) {
        this.forecastType = forecastType;
    }


    /**
     * Gets the fulfillingTransaction value for this TransactionSearchBasic.
     * 
     * @return fulfillingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getFulfillingTransaction() {
        return fulfillingTransaction;
    }


    /**
     * Sets the fulfillingTransaction value for this TransactionSearchBasic.
     * 
     * @param fulfillingTransaction
     */
    public void setFulfillingTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField fulfillingTransaction) {
        this.fulfillingTransaction = fulfillingTransaction;
    }


    /**
     * Gets the fxAmount value for this TransactionSearchBasic.
     * 
     * @return fxAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxAmount() {
        return fxAmount;
    }


    /**
     * Sets the fxAmount value for this TransactionSearchBasic.
     * 
     * @param fxAmount
     */
    public void setFxAmount(org.mule.module.netsuite.api.internal.SearchDoubleField fxAmount) {
        this.fxAmount = fxAmount;
    }


    /**
     * Gets the fxCostEstimate value for this TransactionSearchBasic.
     * 
     * @return fxCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxCostEstimate() {
        return fxCostEstimate;
    }


    /**
     * Sets the fxCostEstimate value for this TransactionSearchBasic.
     * 
     * @param fxCostEstimate
     */
    public void setFxCostEstimate(org.mule.module.netsuite.api.internal.SearchDoubleField fxCostEstimate) {
        this.fxCostEstimate = fxCostEstimate;
    }


    /**
     * Gets the fxCostEstimateRate value for this TransactionSearchBasic.
     * 
     * @return fxCostEstimateRate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxCostEstimateRate() {
        return fxCostEstimateRate;
    }


    /**
     * Sets the fxCostEstimateRate value for this TransactionSearchBasic.
     * 
     * @param fxCostEstimateRate
     */
    public void setFxCostEstimateRate(org.mule.module.netsuite.api.internal.SearchDoubleField fxCostEstimateRate) {
        this.fxCostEstimateRate = fxCostEstimateRate;
    }


    /**
     * Gets the fxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @return fxEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxEstGrossProfit() {
        return fxEstGrossProfit;
    }


    /**
     * Sets the fxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @param fxEstGrossProfit
     */
    public void setFxEstGrossProfit(org.mule.module.netsuite.api.internal.SearchDoubleField fxEstGrossProfit) {
        this.fxEstGrossProfit = fxEstGrossProfit;
    }


    /**
     * Gets the fxTranCostEstimate value for this TransactionSearchBasic.
     * 
     * @return fxTranCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this TransactionSearchBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(org.mule.module.netsuite.api.internal.SearchDoubleField fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }


    /**
     * Gets the fxVsoeAllocation value for this TransactionSearchBasic.
     * 
     * @return fxVsoeAllocation
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxVsoeAllocation() {
        return fxVsoeAllocation;
    }


    /**
     * Sets the fxVsoeAllocation value for this TransactionSearchBasic.
     * 
     * @param fxVsoeAllocation
     */
    public void setFxVsoeAllocation(org.mule.module.netsuite.api.internal.SearchDoubleField fxVsoeAllocation) {
        this.fxVsoeAllocation = fxVsoeAllocation;
    }


    /**
     * Gets the fxVsoeAmount value for this TransactionSearchBasic.
     * 
     * @return fxVsoeAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxVsoeAmount() {
        return fxVsoeAmount;
    }


    /**
     * Sets the fxVsoeAmount value for this TransactionSearchBasic.
     * 
     * @param fxVsoeAmount
     */
    public void setFxVsoeAmount(org.mule.module.netsuite.api.internal.SearchDoubleField fxVsoeAmount) {
        this.fxVsoeAmount = fxVsoeAmount;
    }


    /**
     * Gets the fxVsoePrice value for this TransactionSearchBasic.
     * 
     * @return fxVsoePrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxVsoePrice() {
        return fxVsoePrice;
    }


    /**
     * Sets the fxVsoePrice value for this TransactionSearchBasic.
     * 
     * @param fxVsoePrice
     */
    public void setFxVsoePrice(org.mule.module.netsuite.api.internal.SearchDoubleField fxVsoePrice) {
        this.fxVsoePrice = fxVsoePrice;
    }


    /**
     * Gets the gcoAvailabelToCharge value for this TransactionSearchBasic.
     * 
     * @return gcoAvailabelToCharge
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getGcoAvailabelToCharge() {
        return gcoAvailabelToCharge;
    }


    /**
     * Sets the gcoAvailabelToCharge value for this TransactionSearchBasic.
     * 
     * @param gcoAvailabelToCharge
     */
    public void setGcoAvailabelToCharge(org.mule.module.netsuite.api.internal.SearchBooleanField gcoAvailabelToCharge) {
        this.gcoAvailabelToCharge = gcoAvailabelToCharge;
    }


    /**
     * Gets the gcoAvailableToRefund value for this TransactionSearchBasic.
     * 
     * @return gcoAvailableToRefund
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getGcoAvailableToRefund() {
        return gcoAvailableToRefund;
    }


    /**
     * Sets the gcoAvailableToRefund value for this TransactionSearchBasic.
     * 
     * @param gcoAvailableToRefund
     */
    public void setGcoAvailableToRefund(org.mule.module.netsuite.api.internal.SearchBooleanField gcoAvailableToRefund) {
        this.gcoAvailableToRefund = gcoAvailableToRefund;
    }


    /**
     * Gets the gcoAvsStreetMatch value for this TransactionSearchBasic.
     * 
     * @return gcoAvsStreetMatch
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGcoAvsStreetMatch() {
        return gcoAvsStreetMatch;
    }


    /**
     * Sets the gcoAvsStreetMatch value for this TransactionSearchBasic.
     * 
     * @param gcoAvsStreetMatch
     */
    public void setGcoAvsStreetMatch(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gcoAvsStreetMatch) {
        this.gcoAvsStreetMatch = gcoAvsStreetMatch;
    }


    /**
     * Gets the gcoAvsZipMatch value for this TransactionSearchBasic.
     * 
     * @return gcoAvsZipMatch
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGcoAvsZipMatch() {
        return gcoAvsZipMatch;
    }


    /**
     * Sets the gcoAvsZipMatch value for this TransactionSearchBasic.
     * 
     * @param gcoAvsZipMatch
     */
    public void setGcoAvsZipMatch(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gcoAvsZipMatch) {
        this.gcoAvsZipMatch = gcoAvsZipMatch;
    }


    /**
     * Gets the gcoBuyerAccountAge value for this TransactionSearchBasic.
     * 
     * @return gcoBuyerAccountAge
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getGcoBuyerAccountAge() {
        return gcoBuyerAccountAge;
    }


    /**
     * Sets the gcoBuyerAccountAge value for this TransactionSearchBasic.
     * 
     * @param gcoBuyerAccountAge
     */
    public void setGcoBuyerAccountAge(org.mule.module.netsuite.api.internal.SearchLongField gcoBuyerAccountAge) {
        this.gcoBuyerAccountAge = gcoBuyerAccountAge;
    }


    /**
     * Gets the gcoBuyerIp value for this TransactionSearchBasic.
     * 
     * @return gcoBuyerIp
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGcoBuyerIp() {
        return gcoBuyerIp;
    }


    /**
     * Sets the gcoBuyerIp value for this TransactionSearchBasic.
     * 
     * @param gcoBuyerIp
     */
    public void setGcoBuyerIp(org.mule.module.netsuite.api.internal.SearchStringField gcoBuyerIp) {
        this.gcoBuyerIp = gcoBuyerIp;
    }


    /**
     * Gets the gcoChargeAmount value for this TransactionSearchBasic.
     * 
     * @return gcoChargeAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoChargeAmount() {
        return gcoChargeAmount;
    }


    /**
     * Sets the gcoChargeAmount value for this TransactionSearchBasic.
     * 
     * @param gcoChargeAmount
     */
    public void setGcoChargeAmount(org.mule.module.netsuite.api.internal.SearchDoubleField gcoChargeAmount) {
        this.gcoChargeAmount = gcoChargeAmount;
    }


    /**
     * Gets the gcoChargebackAmount value for this TransactionSearchBasic.
     * 
     * @return gcoChargebackAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoChargebackAmount() {
        return gcoChargebackAmount;
    }


    /**
     * Sets the gcoChargebackAmount value for this TransactionSearchBasic.
     * 
     * @param gcoChargebackAmount
     */
    public void setGcoChargebackAmount(org.mule.module.netsuite.api.internal.SearchDoubleField gcoChargebackAmount) {
        this.gcoChargebackAmount = gcoChargebackAmount;
    }


    /**
     * Gets the gcoConfirmedChargedTotal value for this TransactionSearchBasic.
     * 
     * @return gcoConfirmedChargedTotal
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoConfirmedChargedTotal() {
        return gcoConfirmedChargedTotal;
    }


    /**
     * Sets the gcoConfirmedChargedTotal value for this TransactionSearchBasic.
     * 
     * @param gcoConfirmedChargedTotal
     */
    public void setGcoConfirmedChargedTotal(org.mule.module.netsuite.api.internal.SearchDoubleField gcoConfirmedChargedTotal) {
        this.gcoConfirmedChargedTotal = gcoConfirmedChargedTotal;
    }


    /**
     * Gets the gcoConfirmedRefundedTotal value for this TransactionSearchBasic.
     * 
     * @return gcoConfirmedRefundedTotal
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoConfirmedRefundedTotal() {
        return gcoConfirmedRefundedTotal;
    }


    /**
     * Sets the gcoConfirmedRefundedTotal value for this TransactionSearchBasic.
     * 
     * @param gcoConfirmedRefundedTotal
     */
    public void setGcoConfirmedRefundedTotal(org.mule.module.netsuite.api.internal.SearchDoubleField gcoConfirmedRefundedTotal) {
        this.gcoConfirmedRefundedTotal = gcoConfirmedRefundedTotal;
    }


    /**
     * Gets the gcoCreditcardNumber value for this TransactionSearchBasic.
     * 
     * @return gcoCreditcardNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGcoCreditcardNumber() {
        return gcoCreditcardNumber;
    }


    /**
     * Sets the gcoCreditcardNumber value for this TransactionSearchBasic.
     * 
     * @param gcoCreditcardNumber
     */
    public void setGcoCreditcardNumber(org.mule.module.netsuite.api.internal.SearchStringField gcoCreditcardNumber) {
        this.gcoCreditcardNumber = gcoCreditcardNumber;
    }


    /**
     * Gets the gcoCscMatch value for this TransactionSearchBasic.
     * 
     * @return gcoCscMatch
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getGcoCscMatch() {
        return gcoCscMatch;
    }


    /**
     * Sets the gcoCscMatch value for this TransactionSearchBasic.
     * 
     * @param gcoCscMatch
     */
    public void setGcoCscMatch(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField gcoCscMatch) {
        this.gcoCscMatch = gcoCscMatch;
    }


    /**
     * Gets the gcoFinancialState value for this TransactionSearchBasic.
     * 
     * @return gcoFinancialState
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGcoFinancialState() {
        return gcoFinancialState;
    }


    /**
     * Sets the gcoFinancialState value for this TransactionSearchBasic.
     * 
     * @param gcoFinancialState
     */
    public void setGcoFinancialState(org.mule.module.netsuite.api.internal.SearchStringField gcoFinancialState) {
        this.gcoFinancialState = gcoFinancialState;
    }


    /**
     * Gets the gcoFulfillmentState value for this TransactionSearchBasic.
     * 
     * @return gcoFulfillmentState
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGcoFulfillmentState() {
        return gcoFulfillmentState;
    }


    /**
     * Sets the gcoFulfillmentState value for this TransactionSearchBasic.
     * 
     * @param gcoFulfillmentState
     */
    public void setGcoFulfillmentState(org.mule.module.netsuite.api.internal.SearchStringField gcoFulfillmentState) {
        this.gcoFulfillmentState = gcoFulfillmentState;
    }


    /**
     * Gets the gcoOrderId value for this TransactionSearchBasic.
     * 
     * @return gcoOrderId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGcoOrderId() {
        return gcoOrderId;
    }


    /**
     * Sets the gcoOrderId value for this TransactionSearchBasic.
     * 
     * @param gcoOrderId
     */
    public void setGcoOrderId(org.mule.module.netsuite.api.internal.SearchStringField gcoOrderId) {
        this.gcoOrderId = gcoOrderId;
    }


    /**
     * Gets the gcoOrderTotal value for this TransactionSearchBasic.
     * 
     * @return gcoOrderTotal
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoOrderTotal() {
        return gcoOrderTotal;
    }


    /**
     * Sets the gcoOrderTotal value for this TransactionSearchBasic.
     * 
     * @param gcoOrderTotal
     */
    public void setGcoOrderTotal(org.mule.module.netsuite.api.internal.SearchDoubleField gcoOrderTotal) {
        this.gcoOrderTotal = gcoOrderTotal;
    }


    /**
     * Gets the gcoPromotionAmount value for this TransactionSearchBasic.
     * 
     * @return gcoPromotionAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoPromotionAmount() {
        return gcoPromotionAmount;
    }


    /**
     * Sets the gcoPromotionAmount value for this TransactionSearchBasic.
     * 
     * @param gcoPromotionAmount
     */
    public void setGcoPromotionAmount(org.mule.module.netsuite.api.internal.SearchDoubleField gcoPromotionAmount) {
        this.gcoPromotionAmount = gcoPromotionAmount;
    }


    /**
     * Gets the gcoPromotionName value for this TransactionSearchBasic.
     * 
     * @return gcoPromotionName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGcoPromotionName() {
        return gcoPromotionName;
    }


    /**
     * Sets the gcoPromotionName value for this TransactionSearchBasic.
     * 
     * @param gcoPromotionName
     */
    public void setGcoPromotionName(org.mule.module.netsuite.api.internal.SearchStringField gcoPromotionName) {
        this.gcoPromotionName = gcoPromotionName;
    }


    /**
     * Gets the gcoRefundAmount value for this TransactionSearchBasic.
     * 
     * @return gcoRefundAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoRefundAmount() {
        return gcoRefundAmount;
    }


    /**
     * Sets the gcoRefundAmount value for this TransactionSearchBasic.
     * 
     * @param gcoRefundAmount
     */
    public void setGcoRefundAmount(org.mule.module.netsuite.api.internal.SearchDoubleField gcoRefundAmount) {
        this.gcoRefundAmount = gcoRefundAmount;
    }


    /**
     * Gets the gcoShippingTotal value for this TransactionSearchBasic.
     * 
     * @return gcoShippingTotal
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGcoShippingTotal() {
        return gcoShippingTotal;
    }


    /**
     * Sets the gcoShippingTotal value for this TransactionSearchBasic.
     * 
     * @param gcoShippingTotal
     */
    public void setGcoShippingTotal(org.mule.module.netsuite.api.internal.SearchDoubleField gcoShippingTotal) {
        this.gcoShippingTotal = gcoShippingTotal;
    }


    /**
     * Gets the gcoStateChangedDetail value for this TransactionSearchBasic.
     * 
     * @return gcoStateChangedDetail
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGcoStateChangedDetail() {
        return gcoStateChangedDetail;
    }


    /**
     * Sets the gcoStateChangedDetail value for this TransactionSearchBasic.
     * 
     * @param gcoStateChangedDetail
     */
    public void setGcoStateChangedDetail(org.mule.module.netsuite.api.internal.SearchStringField gcoStateChangedDetail) {
        this.gcoStateChangedDetail = gcoStateChangedDetail;
    }


    /**
     * Gets the giftCertificate value for this TransactionSearchBasic.
     * 
     * @return giftCertificate
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertificate() {
        return giftCertificate;
    }


    /**
     * Sets the giftCertificate value for this TransactionSearchBasic.
     * 
     * @param giftCertificate
     */
    public void setGiftCertificate(org.mule.module.netsuite.api.internal.SearchStringField giftCertificate) {
        this.giftCertificate = giftCertificate;
    }


    /**
     * Gets the grossAmount value for this TransactionSearchBasic.
     * 
     * @return grossAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this TransactionSearchBasic.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(org.mule.module.netsuite.api.internal.SearchDoubleField grossAmount) {
        this.grossAmount = grossAmount;
    }


    /**
     * Gets the includeInForecast value for this TransactionSearchBasic.
     * 
     * @return includeInForecast
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIncludeInForecast() {
        return includeInForecast;
    }


    /**
     * Sets the includeInForecast value for this TransactionSearchBasic.
     * 
     * @param includeInForecast
     */
    public void setIncludeInForecast(org.mule.module.netsuite.api.internal.SearchBooleanField includeInForecast) {
        this.includeInForecast = includeInForecast;
    }


    /**
     * Gets the internalId value for this TransactionSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TransactionSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TransactionSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TransactionSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the inVsoeBundle value for this TransactionSearchBasic.
     * 
     * @return inVsoeBundle
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getInVsoeBundle() {
        return inVsoeBundle;
    }


    /**
     * Sets the inVsoeBundle value for this TransactionSearchBasic.
     * 
     * @param inVsoeBundle
     */
    public void setInVsoeBundle(org.mule.module.netsuite.api.internal.SearchBooleanField inVsoeBundle) {
        this.inVsoeBundle = inVsoeBundle;
    }


    /**
     * Gets the isAllocation value for this TransactionSearchBasic.
     * 
     * @return isAllocation
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsAllocation() {
        return isAllocation;
    }


    /**
     * Sets the isAllocation value for this TransactionSearchBasic.
     * 
     * @param isAllocation
     */
    public void setIsAllocation(org.mule.module.netsuite.api.internal.SearchBooleanField isAllocation) {
        this.isAllocation = isAllocation;
    }


    /**
     * Gets the isGcoChargeback value for this TransactionSearchBasic.
     * 
     * @return isGcoChargeback
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsGcoChargeback() {
        return isGcoChargeback;
    }


    /**
     * Sets the isGcoChargeback value for this TransactionSearchBasic.
     * 
     * @param isGcoChargeback
     */
    public void setIsGcoChargeback(org.mule.module.netsuite.api.internal.SearchBooleanField isGcoChargeback) {
        this.isGcoChargeback = isGcoChargeback;
    }


    /**
     * Gets the isGcoChargeConfirmed value for this TransactionSearchBasic.
     * 
     * @return isGcoChargeConfirmed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsGcoChargeConfirmed() {
        return isGcoChargeConfirmed;
    }


    /**
     * Sets the isGcoChargeConfirmed value for this TransactionSearchBasic.
     * 
     * @param isGcoChargeConfirmed
     */
    public void setIsGcoChargeConfirmed(org.mule.module.netsuite.api.internal.SearchBooleanField isGcoChargeConfirmed) {
        this.isGcoChargeConfirmed = isGcoChargeConfirmed;
    }


    /**
     * Gets the isGcoPaymentGuaranteed value for this TransactionSearchBasic.
     * 
     * @return isGcoPaymentGuaranteed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsGcoPaymentGuaranteed() {
        return isGcoPaymentGuaranteed;
    }


    /**
     * Sets the isGcoPaymentGuaranteed value for this TransactionSearchBasic.
     * 
     * @param isGcoPaymentGuaranteed
     */
    public void setIsGcoPaymentGuaranteed(org.mule.module.netsuite.api.internal.SearchBooleanField isGcoPaymentGuaranteed) {
        this.isGcoPaymentGuaranteed = isGcoPaymentGuaranteed;
    }


    /**
     * Gets the isGcoRefundConfirmed value for this TransactionSearchBasic.
     * 
     * @return isGcoRefundConfirmed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsGcoRefundConfirmed() {
        return isGcoRefundConfirmed;
    }


    /**
     * Sets the isGcoRefundConfirmed value for this TransactionSearchBasic.
     * 
     * @param isGcoRefundConfirmed
     */
    public void setIsGcoRefundConfirmed(org.mule.module.netsuite.api.internal.SearchBooleanField isGcoRefundConfirmed) {
        this.isGcoRefundConfirmed = isGcoRefundConfirmed;
    }


    /**
     * Gets the isIntercompanyAdjustment value for this TransactionSearchBasic.
     * 
     * @return isIntercompanyAdjustment
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsIntercompanyAdjustment() {
        return isIntercompanyAdjustment;
    }


    /**
     * Sets the isIntercompanyAdjustment value for this TransactionSearchBasic.
     * 
     * @param isIntercompanyAdjustment
     */
    public void setIsIntercompanyAdjustment(org.mule.module.netsuite.api.internal.SearchBooleanField isIntercompanyAdjustment) {
        this.isIntercompanyAdjustment = isIntercompanyAdjustment;
    }


    /**
     * Gets the isPayPalMeth value for this TransactionSearchBasic.
     * 
     * @return isPayPalMeth
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsPayPalMeth() {
        return isPayPalMeth;
    }


    /**
     * Sets the isPayPalMeth value for this TransactionSearchBasic.
     * 
     * @param isPayPalMeth
     */
    public void setIsPayPalMeth(org.mule.module.netsuite.api.internal.SearchBooleanField isPayPalMeth) {
        this.isPayPalMeth = isPayPalMeth;
    }


    /**
     * Gets the isReversal value for this TransactionSearchBasic.
     * 
     * @return isReversal
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsReversal() {
        return isReversal;
    }


    /**
     * Sets the isReversal value for this TransactionSearchBasic.
     * 
     * @param isReversal
     */
    public void setIsReversal(org.mule.module.netsuite.api.internal.SearchBooleanField isReversal) {
        this.isReversal = isReversal;
    }


    /**
     * Gets the isRevRecTransaction value for this TransactionSearchBasic.
     * 
     * @return isRevRecTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsRevRecTransaction() {
        return isRevRecTransaction;
    }


    /**
     * Sets the isRevRecTransaction value for this TransactionSearchBasic.
     * 
     * @param isRevRecTransaction
     */
    public void setIsRevRecTransaction(org.mule.module.netsuite.api.internal.SearchBooleanField isRevRecTransaction) {
        this.isRevRecTransaction = isRevRecTransaction;
    }


    /**
     * Gets the isShipAddress value for this TransactionSearchBasic.
     * 
     * @return isShipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this TransactionSearchBasic.
     * 
     * @param isShipAddress
     */
    public void setIsShipAddress(org.mule.module.netsuite.api.internal.SearchBooleanField isShipAddress) {
        this.isShipAddress = isShipAddress;
    }


    /**
     * Gets the isTransferPriceCosting value for this TransactionSearchBasic.
     * 
     * @return isTransferPriceCosting
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsTransferPriceCosting() {
        return isTransferPriceCosting;
    }


    /**
     * Sets the isTransferPriceCosting value for this TransactionSearchBasic.
     * 
     * @param isTransferPriceCosting
     */
    public void setIsTransferPriceCosting(org.mule.module.netsuite.api.internal.SearchBooleanField isTransferPriceCosting) {
        this.isTransferPriceCosting = isTransferPriceCosting;
    }


    /**
     * Gets the isVsoeAlloc value for this TransactionSearchBasic.
     * 
     * @return isVsoeAlloc
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsVsoeAlloc() {
        return isVsoeAlloc;
    }


    /**
     * Sets the isVsoeAlloc value for this TransactionSearchBasic.
     * 
     * @param isVsoeAlloc
     */
    public void setIsVsoeAlloc(org.mule.module.netsuite.api.internal.SearchBooleanField isVsoeAlloc) {
        this.isVsoeAlloc = isVsoeAlloc;
    }


    /**
     * Gets the item value for this TransactionSearchBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this TransactionSearchBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the itemSubOf value for this TransactionSearchBasic.
     * 
     * @return itemSubOf
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItemSubOf() {
        return itemSubOf;
    }


    /**
     * Sets the itemSubOf value for this TransactionSearchBasic.
     * 
     * @param itemSubOf
     */
    public void setItemSubOf(org.mule.module.netsuite.api.internal.SearchMultiSelectField itemSubOf) {
        this.itemSubOf = itemSubOf;
    }


    /**
     * Gets the lastModifiedDate value for this TransactionSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this TransactionSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the leadSource value for this TransactionSearchBasic.
     * 
     * @return leadSource
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this TransactionSearchBasic.
     * 
     * @param leadSource
     */
    public void setLeadSource(org.mule.module.netsuite.api.internal.SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the location value for this TransactionSearchBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TransactionSearchBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the mainLine value for this TransactionSearchBasic.
     * 
     * @return mainLine
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMainLine() {
        return mainLine;
    }


    /**
     * Sets the mainLine value for this TransactionSearchBasic.
     * 
     * @param mainLine
     */
    public void setMainLine(org.mule.module.netsuite.api.internal.SearchBooleanField mainLine) {
        this.mainLine = mainLine;
    }


    /**
     * Gets the mainName value for this TransactionSearchBasic.
     * 
     * @return mainName
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getMainName() {
        return mainName;
    }


    /**
     * Sets the mainName value for this TransactionSearchBasic.
     * 
     * @param mainName
     */
    public void setMainName(org.mule.module.netsuite.api.internal.SearchMultiSelectField mainName) {
        this.mainName = mainName;
    }


    /**
     * Gets the matchBillToReceipt value for this TransactionSearchBasic.
     * 
     * @return matchBillToReceipt
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this TransactionSearchBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(org.mule.module.netsuite.api.internal.SearchBooleanField matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }


    /**
     * Gets the memo value for this TransactionSearchBasic.
     * 
     * @return memo
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TransactionSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(org.mule.module.netsuite.api.internal.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the memoMain value for this TransactionSearchBasic.
     * 
     * @return memoMain
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMemoMain() {
        return memoMain;
    }


    /**
     * Sets the memoMain value for this TransactionSearchBasic.
     * 
     * @param memoMain
     */
    public void setMemoMain(org.mule.module.netsuite.api.internal.SearchStringField memoMain) {
        this.memoMain = memoMain;
    }


    /**
     * Gets the memorized value for this TransactionSearchBasic.
     * 
     * @return memorized
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMemorized() {
        return memorized;
    }


    /**
     * Sets the memorized value for this TransactionSearchBasic.
     * 
     * @param memorized
     */
    public void setMemorized(org.mule.module.netsuite.api.internal.SearchBooleanField memorized) {
        this.memorized = memorized;
    }


    /**
     * Gets the merchantAccount value for this TransactionSearchBasic.
     * 
     * @return merchantAccount
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this TransactionSearchBasic.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(org.mule.module.netsuite.api.internal.SearchStringField merchantAccount) {
        this.merchantAccount = merchantAccount;
    }


    /**
     * Gets the message value for this TransactionSearchBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TransactionSearchBasic.
     * 
     * @param message
     */
    public void setMessage(org.mule.module.netsuite.api.internal.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the multiSubsidiary value for this TransactionSearchBasic.
     * 
     * @return multiSubsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMultiSubsidiary() {
        return multiSubsidiary;
    }


    /**
     * Sets the multiSubsidiary value for this TransactionSearchBasic.
     * 
     * @param multiSubsidiary
     */
    public void setMultiSubsidiary(org.mule.module.netsuite.api.internal.SearchBooleanField multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }


    /**
     * Gets the nameText value for this TransactionSearchBasic.
     * 
     * @return nameText
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getNameText() {
        return nameText;
    }


    /**
     * Sets the nameText value for this TransactionSearchBasic.
     * 
     * @param nameText
     */
    public void setNameText(org.mule.module.netsuite.api.internal.SearchStringField nameText) {
        this.nameText = nameText;
    }


    /**
     * Gets the netAmount value for this TransactionSearchBasic.
     * 
     * @return netAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this TransactionSearchBasic.
     * 
     * @param netAmount
     */
    public void setNetAmount(org.mule.module.netsuite.api.internal.SearchDoubleField netAmount) {
        this.netAmount = netAmount;
    }


    /**
     * Gets the nextBillDate value for this TransactionSearchBasic.
     * 
     * @return nextBillDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this TransactionSearchBasic.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(org.mule.module.netsuite.api.internal.SearchDateField nextBillDate) {
        this.nextBillDate = nextBillDate;
    }


    /**
     * Gets the number value for this TransactionSearchBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this TransactionSearchBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the opportunity value for this TransactionSearchBasic.
     * 
     * @return opportunity
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this TransactionSearchBasic.
     * 
     * @param opportunity
     */
    public void setOpportunity(org.mule.module.netsuite.api.internal.SearchMultiSelectField opportunity) {
        this.opportunity = opportunity;
    }


    /**
     * Gets the otherRefNum value for this TransactionSearchBasic.
     * 
     * @return otherRefNum
     */
    public org.mule.module.netsuite.api.internal.SearchTextNumberField getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this TransactionSearchBasic.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(org.mule.module.netsuite.api.internal.SearchTextNumberField otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the otherRefNumNonDeposit value for this TransactionSearchBasic.
     * 
     * @return otherRefNumNonDeposit
     */
    public org.mule.module.netsuite.api.internal.SearchTextNumberField getOtherRefNumNonDeposit() {
        return otherRefNumNonDeposit;
    }


    /**
     * Sets the otherRefNumNonDeposit value for this TransactionSearchBasic.
     * 
     * @param otherRefNumNonDeposit
     */
    public void setOtherRefNumNonDeposit(org.mule.module.netsuite.api.internal.SearchTextNumberField otherRefNumNonDeposit) {
        this.otherRefNumNonDeposit = otherRefNumNonDeposit;
    }


    /**
     * Gets the packageCount value for this TransactionSearchBasic.
     * 
     * @return packageCount
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this TransactionSearchBasic.
     * 
     * @param packageCount
     */
    public void setPackageCount(org.mule.module.netsuite.api.internal.SearchLongField packageCount) {
        this.packageCount = packageCount;
    }


    /**
     * Gets the paidTransaction value for this TransactionSearchBasic.
     * 
     * @return paidTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPaidTransaction() {
        return paidTransaction;
    }


    /**
     * Sets the paidTransaction value for this TransactionSearchBasic.
     * 
     * @param paidTransaction
     */
    public void setPaidTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField paidTransaction) {
        this.paidTransaction = paidTransaction;
    }


    /**
     * Gets the parent value for this TransactionSearchBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this TransactionSearchBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchLongField parent) {
        this.parent = parent;
    }


    /**
     * Gets the partner value for this TransactionSearchBasic.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this TransactionSearchBasic.
     * 
     * @param partner
     */
    public void setPartner(org.mule.module.netsuite.api.internal.SearchMultiSelectField partner) {
        this.partner = partner;
    }


    /**
     * Gets the partnerContribution value for this TransactionSearchBasic.
     * 
     * @return partnerContribution
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this TransactionSearchBasic.
     * 
     * @param partnerContribution
     */
    public void setPartnerContribution(org.mule.module.netsuite.api.internal.SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }


    /**
     * Gets the partnerRole value for this TransactionSearchBasic.
     * 
     * @return partnerRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this TransactionSearchBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }


    /**
     * Gets the partnerTeamMember value for this TransactionSearchBasic.
     * 
     * @return partnerTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this TransactionSearchBasic.
     * 
     * @param partnerTeamMember
     */
    public void setPartnerTeamMember(org.mule.module.netsuite.api.internal.SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }


    /**
     * Gets the payingTransaction value for this TransactionSearchBasic.
     * 
     * @return payingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPayingTransaction() {
        return payingTransaction;
    }


    /**
     * Sets the payingTransaction value for this TransactionSearchBasic.
     * 
     * @param payingTransaction
     */
    public void setPayingTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField payingTransaction) {
        this.payingTransaction = payingTransaction;
    }


    /**
     * Gets the paymentEventDate value for this TransactionSearchBasic.
     * 
     * @return paymentEventDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getPaymentEventDate() {
        return paymentEventDate;
    }


    /**
     * Sets the paymentEventDate value for this TransactionSearchBasic.
     * 
     * @param paymentEventDate
     */
    public void setPaymentEventDate(org.mule.module.netsuite.api.internal.SearchDateField paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }


    /**
     * Gets the paymentEventHoldReason value for this TransactionSearchBasic.
     * 
     * @return paymentEventHoldReason
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPaymentEventHoldReason() {
        return paymentEventHoldReason;
    }


    /**
     * Sets the paymentEventHoldReason value for this TransactionSearchBasic.
     * 
     * @param paymentEventHoldReason
     */
    public void setPaymentEventHoldReason(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }


    /**
     * Gets the paymentEventResult value for this TransactionSearchBasic.
     * 
     * @return paymentEventResult
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPaymentEventResult() {
        return paymentEventResult;
    }


    /**
     * Sets the paymentEventResult value for this TransactionSearchBasic.
     * 
     * @param paymentEventResult
     */
    public void setPaymentEventResult(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }


    /**
     * Gets the paymentEventType value for this TransactionSearchBasic.
     * 
     * @return paymentEventType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPaymentEventType() {
        return paymentEventType;
    }


    /**
     * Sets the paymentEventType value for this TransactionSearchBasic.
     * 
     * @param paymentEventType
     */
    public void setPaymentEventType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField paymentEventType) {
        this.paymentEventType = paymentEventType;
    }


    /**
     * Gets the paymentMethod value for this TransactionSearchBasic.
     * 
     * @return paymentMethod
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this TransactionSearchBasic.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(org.mule.module.netsuite.api.internal.SearchMultiSelectField paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the payPalPending value for this TransactionSearchBasic.
     * 
     * @return payPalPending
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPayPalPending() {
        return payPalPending;
    }


    /**
     * Sets the payPalPending value for this TransactionSearchBasic.
     * 
     * @param payPalPending
     */
    public void setPayPalPending(org.mule.module.netsuite.api.internal.SearchBooleanField payPalPending) {
        this.payPalPending = payPalPending;
    }


    /**
     * Gets the payPalStatus value for this TransactionSearchBasic.
     * 
     * @return payPalStatus
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPayPalStatus() {
        return payPalStatus;
    }


    /**
     * Sets the payPalStatus value for this TransactionSearchBasic.
     * 
     * @param payPalStatus
     */
    public void setPayPalStatus(org.mule.module.netsuite.api.internal.SearchStringField payPalStatus) {
        this.payPalStatus = payPalStatus;
    }


    /**
     * Gets the payPalTranId value for this TransactionSearchBasic.
     * 
     * @return payPalTranId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPayPalTranId() {
        return payPalTranId;
    }


    /**
     * Sets the payPalTranId value for this TransactionSearchBasic.
     * 
     * @param payPalTranId
     */
    public void setPayPalTranId(org.mule.module.netsuite.api.internal.SearchStringField payPalTranId) {
        this.payPalTranId = payPalTranId;
    }


    /**
     * Gets the pnRefNum value for this TransactionSearchBasic.
     * 
     * @return pnRefNum
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this TransactionSearchBasic.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(org.mule.module.netsuite.api.internal.SearchStringField pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the poAsText value for this TransactionSearchBasic.
     * 
     * @return poAsText
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPoAsText() {
        return poAsText;
    }


    /**
     * Sets the poAsText value for this TransactionSearchBasic.
     * 
     * @param poAsText
     */
    public void setPoAsText(org.mule.module.netsuite.api.internal.SearchStringField poAsText) {
        this.poAsText = poAsText;
    }


    /**
     * Gets the posting value for this TransactionSearchBasic.
     * 
     * @return posting
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPosting() {
        return posting;
    }


    /**
     * Sets the posting value for this TransactionSearchBasic.
     * 
     * @param posting
     */
    public void setPosting(org.mule.module.netsuite.api.internal.SearchBooleanField posting) {
        this.posting = posting;
    }


    /**
     * Gets the postingPeriod value for this TransactionSearchBasic.
     * 
     * @return postingPeriod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this TransactionSearchBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(org.mule.module.netsuite.api.internal.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the postingPeriodRelative value for this TransactionSearchBasic.
     * 
     * @return postingPeriodRelative
     */
    public org.mule.module.netsuite.api.internal.PostingPeriodDate getPostingPeriodRelative() {
        return postingPeriodRelative;
    }


    /**
     * Sets the postingPeriodRelative value for this TransactionSearchBasic.
     * 
     * @param postingPeriodRelative
     */
    public void setPostingPeriodRelative(org.mule.module.netsuite.api.internal.PostingPeriodDate postingPeriodRelative) {
        this.postingPeriodRelative = postingPeriodRelative;
    }


    /**
     * Gets the priceLevel value for this TransactionSearchBasic.
     * 
     * @return priceLevel
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this TransactionSearchBasic.
     * 
     * @param priceLevel
     */
    public void setPriceLevel(org.mule.module.netsuite.api.internal.SearchMultiSelectField priceLevel) {
        this.priceLevel = priceLevel;
    }


    /**
     * Gets the printedPickingTicket value for this TransactionSearchBasic.
     * 
     * @return printedPickingTicket
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPrintedPickingTicket() {
        return printedPickingTicket;
    }


    /**
     * Sets the printedPickingTicket value for this TransactionSearchBasic.
     * 
     * @param printedPickingTicket
     */
    public void setPrintedPickingTicket(org.mule.module.netsuite.api.internal.SearchBooleanField printedPickingTicket) {
        this.printedPickingTicket = printedPickingTicket;
    }


    /**
     * Gets the probability value for this TransactionSearchBasic.
     * 
     * @return probability
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this TransactionSearchBasic.
     * 
     * @param probability
     */
    public void setProbability(org.mule.module.netsuite.api.internal.SearchLongField probability) {
        this.probability = probability;
    }


    /**
     * Gets the projectedAmount value for this TransactionSearchBasic.
     * 
     * @return projectedAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getProjectedAmount() {
        return projectedAmount;
    }


    /**
     * Sets the projectedAmount value for this TransactionSearchBasic.
     * 
     * @param projectedAmount
     */
    public void setProjectedAmount(org.mule.module.netsuite.api.internal.SearchDoubleField projectedAmount) {
        this.projectedAmount = projectedAmount;
    }


    /**
     * Gets the promoCode value for this TransactionSearchBasic.
     * 
     * @return promoCode
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this TransactionSearchBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the purchaseOrder value for this TransactionSearchBasic.
     * 
     * @return purchaseOrder
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPurchaseOrder() {
        return purchaseOrder;
    }


    /**
     * Sets the purchaseOrder value for this TransactionSearchBasic.
     * 
     * @param purchaseOrder
     */
    public void setPurchaseOrder(org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }


    /**
     * Gets the quantity value for this TransactionSearchBasic.
     * 
     * @return quantity
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TransactionSearchBasic.
     * 
     * @param quantity
     */
    public void setQuantity(org.mule.module.netsuite.api.internal.SearchDoubleField quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the quantityBilled value for this TransactionSearchBasic.
     * 
     * @return quantityBilled
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this TransactionSearchBasic.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(org.mule.module.netsuite.api.internal.SearchDoubleField quantityBilled) {
        this.quantityBilled = quantityBilled;
    }


    /**
     * Gets the quantityCommitted value for this TransactionSearchBasic.
     * 
     * @return quantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this TransactionSearchBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(org.mule.module.netsuite.api.internal.SearchDoubleField quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityPacked value for this TransactionSearchBasic.
     * 
     * @return quantityPacked
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityPacked() {
        return quantityPacked;
    }


    /**
     * Sets the quantityPacked value for this TransactionSearchBasic.
     * 
     * @param quantityPacked
     */
    public void setQuantityPacked(org.mule.module.netsuite.api.internal.SearchDoubleField quantityPacked) {
        this.quantityPacked = quantityPacked;
    }


    /**
     * Gets the quantityPicked value for this TransactionSearchBasic.
     * 
     * @return quantityPicked
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityPicked() {
        return quantityPicked;
    }


    /**
     * Sets the quantityPicked value for this TransactionSearchBasic.
     * 
     * @param quantityPicked
     */
    public void setQuantityPicked(org.mule.module.netsuite.api.internal.SearchDoubleField quantityPicked) {
        this.quantityPicked = quantityPicked;
    }


    /**
     * Gets the quantityRevCommitted value for this TransactionSearchBasic.
     * 
     * @return quantityRevCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityRevCommitted() {
        return quantityRevCommitted;
    }


    /**
     * Sets the quantityRevCommitted value for this TransactionSearchBasic.
     * 
     * @param quantityRevCommitted
     */
    public void setQuantityRevCommitted(org.mule.module.netsuite.api.internal.SearchDoubleField quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }


    /**
     * Gets the quantityShipRecv value for this TransactionSearchBasic.
     * 
     * @return quantityShipRecv
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityShipRecv() {
        return quantityShipRecv;
    }


    /**
     * Sets the quantityShipRecv value for this TransactionSearchBasic.
     * 
     * @param quantityShipRecv
     */
    public void setQuantityShipRecv(org.mule.module.netsuite.api.internal.SearchDoubleField quantityShipRecv) {
        this.quantityShipRecv = quantityShipRecv;
    }


    /**
     * Gets the recognizedRevenue value for this TransactionSearchBasic.
     * 
     * @return recognizedRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this TransactionSearchBasic.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(org.mule.module.netsuite.api.internal.SearchDoubleField recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }


    /**
     * Gets the revCommitStatus value for this TransactionSearchBasic.
     * 
     * @return revCommitStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this TransactionSearchBasic.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }


    /**
     * Gets the revCommittingStatus value for this TransactionSearchBasic.
     * 
     * @return revCommittingStatus
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getRevCommittingStatus() {
        return revCommittingStatus;
    }


    /**
     * Sets the revCommittingStatus value for this TransactionSearchBasic.
     * 
     * @param revCommittingStatus
     */
    public void setRevCommittingStatus(org.mule.module.netsuite.api.internal.SearchBooleanField revCommittingStatus) {
        this.revCommittingStatus = revCommittingStatus;
    }


    /**
     * Gets the revCommittingTransaction value for this TransactionSearchBasic.
     * 
     * @return revCommittingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getRevCommittingTransaction() {
        return revCommittingTransaction;
    }


    /**
     * Sets the revCommittingTransaction value for this TransactionSearchBasic.
     * 
     * @param revCommittingTransaction
     */
    public void setRevCommittingTransaction(org.mule.module.netsuite.api.internal.SearchMultiSelectField revCommittingTransaction) {
        this.revCommittingTransaction = revCommittingTransaction;
    }


    /**
     * Gets the revenueStatus value for this TransactionSearchBasic.
     * 
     * @return revenueStatus
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this TransactionSearchBasic.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField revenueStatus) {
        this.revenueStatus = revenueStatus;
    }


    /**
     * Gets the reversalDate value for this TransactionSearchBasic.
     * 
     * @return reversalDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getReversalDate() {
        return reversalDate;
    }


    /**
     * Sets the reversalDate value for this TransactionSearchBasic.
     * 
     * @param reversalDate
     */
    public void setReversalDate(org.mule.module.netsuite.api.internal.SearchDateField reversalDate) {
        this.reversalDate = reversalDate;
    }


    /**
     * Gets the reversalNumber value for this TransactionSearchBasic.
     * 
     * @return reversalNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getReversalNumber() {
        return reversalNumber;
    }


    /**
     * Sets the reversalNumber value for this TransactionSearchBasic.
     * 
     * @param reversalNumber
     */
    public void setReversalNumber(org.mule.module.netsuite.api.internal.SearchStringField reversalNumber) {
        this.reversalNumber = reversalNumber;
    }


    /**
     * Gets the revRecEndDate value for this TransactionSearchBasic.
     * 
     * @return revRecEndDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this TransactionSearchBasic.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(org.mule.module.netsuite.api.internal.SearchDateField revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the revRecOnRevCommitment value for this TransactionSearchBasic.
     * 
     * @return revRecOnRevCommitment
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this TransactionSearchBasic.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(org.mule.module.netsuite.api.internal.SearchBooleanField revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }


    /**
     * Gets the revRecStartDate value for this TransactionSearchBasic.
     * 
     * @return revRecStartDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this TransactionSearchBasic.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(org.mule.module.netsuite.api.internal.SearchDateField revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecTermInMonths value for this TransactionSearchBasic.
     * 
     * @return revRecTermInMonths
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getRevRecTermInMonths() {
        return revRecTermInMonths;
    }


    /**
     * Sets the revRecTermInMonths value for this TransactionSearchBasic.
     * 
     * @param revRecTermInMonths
     */
    public void setRevRecTermInMonths(org.mule.module.netsuite.api.internal.SearchLongField revRecTermInMonths) {
        this.revRecTermInMonths = revRecTermInMonths;
    }


    /**
     * Gets the salesEffectiveDate value for this TransactionSearchBasic.
     * 
     * @return salesEffectiveDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this TransactionSearchBasic.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(org.mule.module.netsuite.api.internal.SearchDateField salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }


    /**
     * Gets the salesRep value for this TransactionSearchBasic.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this TransactionSearchBasic.
     * 
     * @param salesRep
     */
    public void setSalesRep(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the salesTeamMember value for this TransactionSearchBasic.
     * 
     * @return salesTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this TransactionSearchBasic.
     * 
     * @param salesTeamMember
     */
    public void setSalesTeamMember(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }


    /**
     * Gets the salesTeamRole value for this TransactionSearchBasic.
     * 
     * @return salesTeamRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this TransactionSearchBasic.
     * 
     * @param salesTeamRole
     */
    public void setSalesTeamRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }


    /**
     * Gets the serialNumber value for this TransactionSearchBasic.
     * 
     * @return serialNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this TransactionSearchBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(org.mule.module.netsuite.api.internal.SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the serialNumberQuantity value for this TransactionSearchBasic.
     * 
     * @return serialNumberQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getSerialNumberQuantity() {
        return serialNumberQuantity;
    }


    /**
     * Sets the serialNumberQuantity value for this TransactionSearchBasic.
     * 
     * @param serialNumberQuantity
     */
    public void setSerialNumberQuantity(org.mule.module.netsuite.api.internal.SearchDoubleField serialNumberQuantity) {
        this.serialNumberQuantity = serialNumberQuantity;
    }


    /**
     * Gets the serialNumbers value for this TransactionSearchBasic.
     * 
     * @return serialNumbers
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this TransactionSearchBasic.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(org.mule.module.netsuite.api.internal.SearchStringField serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the shipAddress value for this TransactionSearchBasic.
     * 
     * @return shipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this TransactionSearchBasic.
     * 
     * @param shipAddress
     */
    public void setShipAddress(org.mule.module.netsuite.api.internal.SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the shipAddressee value for this TransactionSearchBasic.
     * 
     * @return shipAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this TransactionSearchBasic.
     * 
     * @param shipAddressee
     */
    public void setShipAddressee(org.mule.module.netsuite.api.internal.SearchStringField shipAddressee) {
        this.shipAddressee = shipAddressee;
    }


    /**
     * Gets the shipAttention value for this TransactionSearchBasic.
     * 
     * @return shipAttention
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this TransactionSearchBasic.
     * 
     * @param shipAttention
     */
    public void setShipAttention(org.mule.module.netsuite.api.internal.SearchStringField shipAttention) {
        this.shipAttention = shipAttention;
    }


    /**
     * Gets the shipCity value for this TransactionSearchBasic.
     * 
     * @return shipCity
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this TransactionSearchBasic.
     * 
     * @param shipCity
     */
    public void setShipCity(org.mule.module.netsuite.api.internal.SearchStringField shipCity) {
        this.shipCity = shipCity;
    }


    /**
     * Gets the shipComplete value for this TransactionSearchBasic.
     * 
     * @return shipComplete
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this TransactionSearchBasic.
     * 
     * @param shipComplete
     */
    public void setShipComplete(org.mule.module.netsuite.api.internal.SearchBooleanField shipComplete) {
        this.shipComplete = shipComplete;
    }


    /**
     * Gets the shipCountry value for this TransactionSearchBasic.
     * 
     * @return shipCountry
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this TransactionSearchBasic.
     * 
     * @param shipCountry
     */
    public void setShipCountry(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField shipCountry) {
        this.shipCountry = shipCountry;
    }


    /**
     * Gets the shipCounty value for this TransactionSearchBasic.
     * 
     * @return shipCounty
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipCounty() {
        return shipCounty;
    }


    /**
     * Sets the shipCounty value for this TransactionSearchBasic.
     * 
     * @param shipCounty
     */
    public void setShipCounty(org.mule.module.netsuite.api.internal.SearchStringField shipCounty) {
        this.shipCounty = shipCounty;
    }


    /**
     * Gets the shipDate value for this TransactionSearchBasic.
     * 
     * @return shipDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this TransactionSearchBasic.
     * 
     * @param shipDate
     */
    public void setShipDate(org.mule.module.netsuite.api.internal.SearchDateField shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the shipGroup value for this TransactionSearchBasic.
     * 
     * @return shipGroup
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this TransactionSearchBasic.
     * 
     * @param shipGroup
     */
    public void setShipGroup(org.mule.module.netsuite.api.internal.SearchLongField shipGroup) {
        this.shipGroup = shipGroup;
    }


    /**
     * Gets the shipMethod value for this TransactionSearchBasic.
     * 
     * @return shipMethod
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this TransactionSearchBasic.
     * 
     * @param shipMethod
     */
    public void setShipMethod(org.mule.module.netsuite.api.internal.SearchMultiSelectField shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the shipPhone value for this TransactionSearchBasic.
     * 
     * @return shipPhone
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this TransactionSearchBasic.
     * 
     * @param shipPhone
     */
    public void setShipPhone(org.mule.module.netsuite.api.internal.SearchStringField shipPhone) {
        this.shipPhone = shipPhone;
    }


    /**
     * Gets the shipping value for this TransactionSearchBasic.
     * 
     * @return shipping
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShipping() {
        return shipping;
    }


    /**
     * Sets the shipping value for this TransactionSearchBasic.
     * 
     * @param shipping
     */
    public void setShipping(org.mule.module.netsuite.api.internal.SearchBooleanField shipping) {
        this.shipping = shipping;
    }


    /**
     * Gets the shipRecvStatus value for this TransactionSearchBasic.
     * 
     * @return shipRecvStatus
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShipRecvStatus() {
        return shipRecvStatus;
    }


    /**
     * Sets the shipRecvStatus value for this TransactionSearchBasic.
     * 
     * @param shipRecvStatus
     */
    public void setShipRecvStatus(org.mule.module.netsuite.api.internal.SearchBooleanField shipRecvStatus) {
        this.shipRecvStatus = shipRecvStatus;
    }


    /**
     * Gets the shipRecvStatusLine value for this TransactionSearchBasic.
     * 
     * @return shipRecvStatusLine
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShipRecvStatusLine() {
        return shipRecvStatusLine;
    }


    /**
     * Sets the shipRecvStatusLine value for this TransactionSearchBasic.
     * 
     * @param shipRecvStatusLine
     */
    public void setShipRecvStatusLine(org.mule.module.netsuite.api.internal.SearchBooleanField shipRecvStatusLine) {
        this.shipRecvStatusLine = shipRecvStatusLine;
    }


    /**
     * Gets the shipState value for this TransactionSearchBasic.
     * 
     * @return shipState
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this TransactionSearchBasic.
     * 
     * @param shipState
     */
    public void setShipState(org.mule.module.netsuite.api.internal.SearchMultiSelectField shipState) {
        this.shipState = shipState;
    }


    /**
     * Gets the shipTo value for this TransactionSearchBasic.
     * 
     * @return shipTo
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this TransactionSearchBasic.
     * 
     * @param shipTo
     */
    public void setShipTo(org.mule.module.netsuite.api.internal.SearchMultiSelectField shipTo) {
        this.shipTo = shipTo;
    }


    /**
     * Gets the shipZip value for this TransactionSearchBasic.
     * 
     * @return shipZip
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this TransactionSearchBasic.
     * 
     * @param shipZip
     */
    public void setShipZip(org.mule.module.netsuite.api.internal.SearchStringField shipZip) {
        this.shipZip = shipZip;
    }


    /**
     * Gets the source value for this TransactionSearchBasic.
     * 
     * @return source
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getSource() {
        return source;
    }


    /**
     * Sets the source value for this TransactionSearchBasic.
     * 
     * @param source
     */
    public void setSource(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField source) {
        this.source = source;
    }


    /**
     * Gets the startDate value for this TransactionSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TransactionSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this TransactionSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransactionSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this TransactionSearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TransactionSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the taxItem value for this TransactionSearchBasic.
     * 
     * @return taxItem
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this TransactionSearchBasic.
     * 
     * @param taxItem
     */
    public void setTaxItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the taxLine value for this TransactionSearchBasic.
     * 
     * @return taxLine
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getTaxLine() {
        return taxLine;
    }


    /**
     * Sets the taxLine value for this TransactionSearchBasic.
     * 
     * @param taxLine
     */
    public void setTaxLine(org.mule.module.netsuite.api.internal.SearchBooleanField taxLine) {
        this.taxLine = taxLine;
    }


    /**
     * Gets the taxPeriod value for this TransactionSearchBasic.
     * 
     * @return taxPeriod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this TransactionSearchBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(org.mule.module.netsuite.api.internal.RecordRef taxPeriod) {
        this.taxPeriod = taxPeriod;
    }


    /**
     * Gets the taxPeriodRelative value for this TransactionSearchBasic.
     * 
     * @return taxPeriodRelative
     */
    public org.mule.module.netsuite.api.internal.PostingPeriodDate getTaxPeriodRelative() {
        return taxPeriodRelative;
    }


    /**
     * Sets the taxPeriodRelative value for this TransactionSearchBasic.
     * 
     * @param taxPeriodRelative
     */
    public void setTaxPeriodRelative(org.mule.module.netsuite.api.internal.PostingPeriodDate taxPeriodRelative) {
        this.taxPeriodRelative = taxPeriodRelative;
    }


    /**
     * Gets the taxRate value for this TransactionSearchBasic.
     * 
     * @return taxRate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this TransactionSearchBasic.
     * 
     * @param taxRate
     */
    public void setTaxRate(org.mule.module.netsuite.api.internal.SearchDoubleField taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the terms value for this TransactionSearchBasic.
     * 
     * @return terms
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this TransactionSearchBasic.
     * 
     * @param terms
     */
    public void setTerms(org.mule.module.netsuite.api.internal.SearchMultiSelectField terms) {
        this.terms = terms;
    }


    /**
     * Gets the title value for this TransactionSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TransactionSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the toBeEmailed value for this TransactionSearchBasic.
     * 
     * @return toBeEmailed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this TransactionSearchBasic.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(org.mule.module.netsuite.api.internal.SearchBooleanField toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the toBePrinted value for this TransactionSearchBasic.
     * 
     * @return toBePrinted
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this TransactionSearchBasic.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(org.mule.module.netsuite.api.internal.SearchBooleanField toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toSubsidiary value for this TransactionSearchBasic.
     * 
     * @return toSubsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this TransactionSearchBasic.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the totalAmount value for this TransactionSearchBasic.
     * 
     * @return totalAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTotalAmount() {
        return totalAmount;
    }


    /**
     * Sets the totalAmount value for this TransactionSearchBasic.
     * 
     * @param totalAmount
     */
    public void setTotalAmount(org.mule.module.netsuite.api.internal.SearchDoubleField totalAmount) {
        this.totalAmount = totalAmount;
    }


    /**
     * Gets the trackingNumbers value for this TransactionSearchBasic.
     * 
     * @return trackingNumbers
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this TransactionSearchBasic.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(org.mule.module.netsuite.api.internal.SearchStringField trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }


    /**
     * Gets the tranCostEstimate value for this TransactionSearchBasic.
     * 
     * @return tranCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranCostEstimate() {
        return tranCostEstimate;
    }


    /**
     * Sets the tranCostEstimate value for this TransactionSearchBasic.
     * 
     * @param tranCostEstimate
     */
    public void setTranCostEstimate(org.mule.module.netsuite.api.internal.SearchDoubleField tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }


    /**
     * Gets the tranDate value for this TransactionSearchBasic.
     * 
     * @return tranDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this TransactionSearchBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(org.mule.module.netsuite.api.internal.SearchDateField tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @return tranEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }


    /**
     * Gets the tranEstGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @return tranEstGrossProfitPct
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranEstGrossProfitPct() {
        return tranEstGrossProfitPct;
    }


    /**
     * Sets the tranEstGrossProfitPct value for this TransactionSearchBasic.
     * 
     * @param tranEstGrossProfitPct
     */
    public void setTranEstGrossProfitPct(org.mule.module.netsuite.api.internal.SearchDoubleField tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this TransactionSearchBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(org.mule.module.netsuite.api.internal.SearchDoubleField tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }


    /**
     * Gets the tranId value for this TransactionSearchBasic.
     * 
     * @return tranId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this TransactionSearchBasic.
     * 
     * @param tranId
     */
    public void setTranId(org.mule.module.netsuite.api.internal.SearchStringField tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the tranIsVsoeBundle value for this TransactionSearchBasic.
     * 
     * @return tranIsVsoeBundle
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this TransactionSearchBasic.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(org.mule.module.netsuite.api.internal.SearchBooleanField tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }


    /**
     * Gets the transactionLineType value for this TransactionSearchBasic.
     * 
     * @return transactionLineType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getTransactionLineType() {
        return transactionLineType;
    }


    /**
     * Sets the transactionLineType value for this TransactionSearchBasic.
     * 
     * @param transactionLineType
     */
    public void setTransactionLineType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField transactionLineType) {
        this.transactionLineType = transactionLineType;
    }


    /**
     * Gets the transferLocation value for this TransactionSearchBasic.
     * 
     * @return transferLocation
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTransferLocation() {
        return transferLocation;
    }


    /**
     * Sets the transferLocation value for this TransactionSearchBasic.
     * 
     * @param transferLocation
     */
    public void setTransferLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField transferLocation) {
        this.transferLocation = transferLocation;
    }


    /**
     * Gets the transferOrderQuantityCommitted value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTransferOrderQuantityCommitted() {
        return transferOrderQuantityCommitted;
    }


    /**
     * Sets the transferOrderQuantityCommitted value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityCommitted
     */
    public void setTransferOrderQuantityCommitted(org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityCommitted) {
        this.transferOrderQuantityCommitted = transferOrderQuantityCommitted;
    }


    /**
     * Gets the transferOrderQuantityPacked value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityPacked
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTransferOrderQuantityPacked() {
        return transferOrderQuantityPacked;
    }


    /**
     * Sets the transferOrderQuantityPacked value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityPacked
     */
    public void setTransferOrderQuantityPacked(org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityPacked) {
        this.transferOrderQuantityPacked = transferOrderQuantityPacked;
    }


    /**
     * Gets the transferOrderQuantityPicked value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityPicked
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTransferOrderQuantityPicked() {
        return transferOrderQuantityPicked;
    }


    /**
     * Sets the transferOrderQuantityPicked value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityPicked
     */
    public void setTransferOrderQuantityPicked(org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityPicked) {
        this.transferOrderQuantityPicked = transferOrderQuantityPicked;
    }


    /**
     * Gets the transferOrderQuantityReceived value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityReceived
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTransferOrderQuantityReceived() {
        return transferOrderQuantityReceived;
    }


    /**
     * Sets the transferOrderQuantityReceived value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityReceived
     */
    public void setTransferOrderQuantityReceived(org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityReceived) {
        this.transferOrderQuantityReceived = transferOrderQuantityReceived;
    }


    /**
     * Gets the transferOrderQuantityShipped value for this TransactionSearchBasic.
     * 
     * @return transferOrderQuantityShipped
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTransferOrderQuantityShipped() {
        return transferOrderQuantityShipped;
    }


    /**
     * Sets the transferOrderQuantityShipped value for this TransactionSearchBasic.
     * 
     * @param transferOrderQuantityShipped
     */
    public void setTransferOrderQuantityShipped(org.mule.module.netsuite.api.internal.SearchDoubleField transferOrderQuantityShipped) {
        this.transferOrderQuantityShipped = transferOrderQuantityShipped;
    }


    /**
     * Gets the type value for this TransactionSearchBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this TransactionSearchBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the unit value for this TransactionSearchBasic.
     * 
     * @return unit
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this TransactionSearchBasic.
     * 
     * @param unit
     */
    public void setUnit(org.mule.module.netsuite.api.internal.SearchMultiSelectField unit) {
        this.unit = unit;
    }


    /**
     * Gets the unitCostOverride value for this TransactionSearchBasic.
     * 
     * @return unitCostOverride
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getUnitCostOverride() {
        return unitCostOverride;
    }


    /**
     * Sets the unitCostOverride value for this TransactionSearchBasic.
     * 
     * @param unitCostOverride
     */
    public void setUnitCostOverride(org.mule.module.netsuite.api.internal.SearchDoubleField unitCostOverride) {
        this.unitCostOverride = unitCostOverride;
    }


    /**
     * Gets the vendType value for this TransactionSearchBasic.
     * 
     * @return vendType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getVendType() {
        return vendType;
    }


    /**
     * Sets the vendType value for this TransactionSearchBasic.
     * 
     * @param vendType
     */
    public void setVendType(org.mule.module.netsuite.api.internal.SearchMultiSelectField vendType) {
        this.vendType = vendType;
    }


    /**
     * Gets the visibleToCustomer value for this TransactionSearchBasic.
     * 
     * @return visibleToCustomer
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getVisibleToCustomer() {
        return visibleToCustomer;
    }


    /**
     * Sets the visibleToCustomer value for this TransactionSearchBasic.
     * 
     * @param visibleToCustomer
     */
    public void setVisibleToCustomer(org.mule.module.netsuite.api.internal.SearchBooleanField visibleToCustomer) {
        this.visibleToCustomer = visibleToCustomer;
    }


    /**
     * Gets the voided value for this TransactionSearchBasic.
     * 
     * @return voided
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getVoided() {
        return voided;
    }


    /**
     * Sets the voided value for this TransactionSearchBasic.
     * 
     * @param voided
     */
    public void setVoided(org.mule.module.netsuite.api.internal.SearchBooleanField voided) {
        this.voided = voided;
    }


    /**
     * Gets the vsoeAllocation value for this TransactionSearchBasic.
     * 
     * @return vsoeAllocation
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this TransactionSearchBasic.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(org.mule.module.netsuite.api.internal.SearchDoubleField vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }


    /**
     * Gets the vsoeAmount value for this TransactionSearchBasic.
     * 
     * @return vsoeAmount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getVsoeAmount() {
        return vsoeAmount;
    }


    /**
     * Sets the vsoeAmount value for this TransactionSearchBasic.
     * 
     * @param vsoeAmount
     */
    public void setVsoeAmount(org.mule.module.netsuite.api.internal.SearchDoubleField vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }


    /**
     * Gets the vsoeDeferral value for this TransactionSearchBasic.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this TransactionSearchBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoeDelivered value for this TransactionSearchBasic.
     * 
     * @return vsoeDelivered
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this TransactionSearchBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(org.mule.module.netsuite.api.internal.SearchBooleanField vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the vsoePermitDiscount value for this TransactionSearchBasic.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this TransactionSearchBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoePrice value for this TransactionSearchBasic.
     * 
     * @return vsoePrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this TransactionSearchBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(org.mule.module.netsuite.api.internal.SearchDoubleField vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the webSite value for this TransactionSearchBasic.
     * 
     * @return webSite
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this TransactionSearchBasic.
     * 
     * @param webSite
     */
    public void setWebSite(org.mule.module.netsuite.api.internal.SearchMultiSelectField webSite) {
        this.webSite = webSite;
    }


    /**
     * Gets the customFieldList value for this TransactionSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TransactionSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchBasic)) return false;
        TransactionSearchBasic other = (TransactionSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.actualShipDate==null && other.getActualShipDate()==null) || 
             (this.actualShipDate!=null &&
              this.actualShipDate.equals(other.getActualShipDate()))) &&
            ((this.altSalesAmount==null && other.getAltSalesAmount()==null) || 
             (this.altSalesAmount!=null &&
              this.altSalesAmount.equals(other.getAltSalesAmount()))) &&
            ((this.altSalesNetAmount==null && other.getAltSalesNetAmount()==null) || 
             (this.altSalesNetAmount!=null &&
              this.altSalesNetAmount.equals(other.getAltSalesNetAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              this.amountPaid.equals(other.getAmountPaid()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              this.amountRemaining.equals(other.getAmountRemaining()))) &&
            ((this.amountUnbilled==null && other.getAmountUnbilled()==null) || 
             (this.amountUnbilled!=null &&
              this.amountUnbilled.equals(other.getAmountUnbilled()))) &&
            ((this.anyLineItem==null && other.getAnyLineItem()==null) || 
             (this.anyLineItem!=null &&
              this.anyLineItem.equals(other.getAnyLineItem()))) &&
            ((this.appliedToForeignAmount==null && other.getAppliedToForeignAmount()==null) || 
             (this.appliedToForeignAmount!=null &&
              this.appliedToForeignAmount.equals(other.getAppliedToForeignAmount()))) &&
            ((this.appliedToIsFxVariance==null && other.getAppliedToIsFxVariance()==null) || 
             (this.appliedToIsFxVariance!=null &&
              this.appliedToIsFxVariance.equals(other.getAppliedToIsFxVariance()))) &&
            ((this.appliedToLinkAmount==null && other.getAppliedToLinkAmount()==null) || 
             (this.appliedToLinkAmount!=null &&
              this.appliedToLinkAmount.equals(other.getAppliedToLinkAmount()))) &&
            ((this.appliedToLinkType==null && other.getAppliedToLinkType()==null) || 
             (this.appliedToLinkType!=null &&
              this.appliedToLinkType.equals(other.getAppliedToLinkType()))) &&
            ((this.appliedToTransaction==null && other.getAppliedToTransaction()==null) || 
             (this.appliedToTransaction!=null &&
              this.appliedToTransaction.equals(other.getAppliedToTransaction()))) &&
            ((this.applyingForeignAmount==null && other.getApplyingForeignAmount()==null) || 
             (this.applyingForeignAmount!=null &&
              this.applyingForeignAmount.equals(other.getApplyingForeignAmount()))) &&
            ((this.applyingIsFxVariance==null && other.getApplyingIsFxVariance()==null) || 
             (this.applyingIsFxVariance!=null &&
              this.applyingIsFxVariance.equals(other.getApplyingIsFxVariance()))) &&
            ((this.applyingLinkAmount==null && other.getApplyingLinkAmount()==null) || 
             (this.applyingLinkAmount!=null &&
              this.applyingLinkAmount.equals(other.getApplyingLinkAmount()))) &&
            ((this.applyingLinkType==null && other.getApplyingLinkType()==null) || 
             (this.applyingLinkType!=null &&
              this.applyingLinkType.equals(other.getApplyingLinkType()))) &&
            ((this.applyingTransaction==null && other.getApplyingTransaction()==null) || 
             (this.applyingTransaction!=null &&
              this.applyingTransaction.equals(other.getApplyingTransaction()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              this.authCode.equals(other.getAuthCode()))) &&
            ((this.avsStreetMatch==null && other.getAvsStreetMatch()==null) || 
             (this.avsStreetMatch!=null &&
              this.avsStreetMatch.equals(other.getAvsStreetMatch()))) &&
            ((this.avsZipMatch==null && other.getAvsZipMatch()==null) || 
             (this.avsZipMatch!=null &&
              this.avsZipMatch.equals(other.getAvsZipMatch()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.billAddressee==null && other.getBillAddressee()==null) || 
             (this.billAddressee!=null &&
              this.billAddressee.equals(other.getBillAddressee()))) &&
            ((this.billAttention==null && other.getBillAttention()==null) || 
             (this.billAttention!=null &&
              this.billAttention.equals(other.getBillAttention()))) &&
            ((this.billCity==null && other.getBillCity()==null) || 
             (this.billCity!=null &&
              this.billCity.equals(other.getBillCity()))) &&
            ((this.billCountry==null && other.getBillCountry()==null) || 
             (this.billCountry!=null &&
              this.billCountry.equals(other.getBillCountry()))) &&
            ((this.billCounty==null && other.getBillCounty()==null) || 
             (this.billCounty!=null &&
              this.billCounty.equals(other.getBillCounty()))) &&
            ((this.billedDate==null && other.getBilledDate()==null) || 
             (this.billedDate!=null &&
              this.billedDate.equals(other.getBilledDate()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.billingStatus==null && other.getBillingStatus()==null) || 
             (this.billingStatus!=null &&
              this.billingStatus.equals(other.getBillingStatus()))) &&
            ((this.billingTransaction==null && other.getBillingTransaction()==null) || 
             (this.billingTransaction!=null &&
              this.billingTransaction.equals(other.getBillingTransaction()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              this.billPhone.equals(other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              this.billState.equals(other.getBillState()))) &&
            ((this.billVarianceStatus==null && other.getBillVarianceStatus()==null) || 
             (this.billVarianceStatus!=null &&
              this.billVarianceStatus.equals(other.getBillVarianceStatus()))) &&
            ((this.billZip==null && other.getBillZip()==null) || 
             (this.billZip!=null &&
              this.billZip.equals(other.getBillZip()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.binNumberQuantity==null && other.getBinNumberQuantity()==null) || 
             (this.binNumberQuantity!=null &&
              this.binNumberQuantity.equals(other.getBinNumberQuantity()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              this.buildEntireAssembly.equals(other.getBuildEntireAssembly()))) &&
            ((this.buildVariance==null && other.getBuildVariance()==null) || 
             (this.buildVariance!=null &&
              this.buildVariance.equals(other.getBuildVariance()))) &&
            ((this.built==null && other.getBuilt()==null) || 
             (this.built!=null &&
              this.built.equals(other.getBuilt()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              this.ccCustomerCode.equals(other.getCcCustomerCode()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.cleared==null && other.getCleared()==null) || 
             (this.cleared!=null &&
              this.cleared.equals(other.getCleared()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              this.closed.equals(other.getClosed()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              this.closeDate.equals(other.getCloseDate()))) &&
            ((this.cogs==null && other.getCogs()==null) || 
             (this.cogs!=null &&
              this.cogs.equals(other.getCogs()))) &&
            ((this.commissionEffectiveDate==null && other.getCommissionEffectiveDate()==null) || 
             (this.commissionEffectiveDate!=null &&
              this.commissionEffectiveDate.equals(other.getCommissionEffectiveDate()))) &&
            ((this.commit==null && other.getCommit()==null) || 
             (this.commit!=null &&
              this.commit.equals(other.getCommit()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              this.confirmationNumber.equals(other.getConfirmationNumber()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              this.contribution.equals(other.getContribution()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.costEstimateRate==null && other.getCostEstimateRate()==null) || 
             (this.costEstimateRate!=null &&
              this.costEstimateRate.equals(other.getCostEstimateRate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              this.creditAmount.equals(other.getCreditAmount()))) &&
            ((this.cscMatch==null && other.getCscMatch()==null) || 
             (this.cscMatch!=null &&
              this.cscMatch.equals(other.getCscMatch()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.customerSubOf==null && other.getCustomerSubOf()==null) || 
             (this.customerSubOf!=null &&
              this.customerSubOf.equals(other.getCustomerSubOf()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              this.custType.equals(other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              this.daysOpen.equals(other.getDaysOpen()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              this.daysOverdue.equals(other.getDaysOverdue()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              this.debitAmount.equals(other.getDebitAmount()))) &&
            ((this.deferredRevenue==null && other.getDeferredRevenue()==null) || 
             (this.deferredRevenue!=null &&
              this.deferredRevenue.equals(other.getDeferredRevenue()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.depositDate==null && other.getDepositDate()==null) || 
             (this.depositDate!=null &&
              this.depositDate.equals(other.getDepositDate()))) &&
            ((this.depositTransaction==null && other.getDepositTransaction()==null) || 
             (this.depositTransaction!=null &&
              this.depositTransaction.equals(other.getDepositTransaction()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              this.dueDate.equals(other.getDueDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              this.entityStatus.equals(other.getEntityStatus()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              this.estGrossProfit.equals(other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPct==null && other.getEstGrossProfitPct()==null) || 
             (this.estGrossProfitPct!=null &&
              this.estGrossProfitPct.equals(other.getEstGrossProfitPct()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.excludeCommission==null && other.getExcludeCommission()==null) || 
             (this.excludeCommission!=null &&
              this.excludeCommission.equals(other.getExcludeCommission()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              this.expectedCloseDate.equals(other.getExpectedCloseDate()))) &&
            ((this.expenseCategory==null && other.getExpenseCategory()==null) || 
             (this.expenseCategory!=null &&
              this.expenseCategory.equals(other.getExpenseCategory()))) &&
            ((this.expenseDate==null && other.getExpenseDate()==null) || 
             (this.expenseDate!=null &&
              this.expenseDate.equals(other.getExpenseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.finChrg==null && other.getFinChrg()==null) || 
             (this.finChrg!=null &&
              this.finChrg.equals(other.getFinChrg()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              this.forecastType.equals(other.getForecastType()))) &&
            ((this.fulfillingTransaction==null && other.getFulfillingTransaction()==null) || 
             (this.fulfillingTransaction!=null &&
              this.fulfillingTransaction.equals(other.getFulfillingTransaction()))) &&
            ((this.fxAmount==null && other.getFxAmount()==null) || 
             (this.fxAmount!=null &&
              this.fxAmount.equals(other.getFxAmount()))) &&
            ((this.fxCostEstimate==null && other.getFxCostEstimate()==null) || 
             (this.fxCostEstimate!=null &&
              this.fxCostEstimate.equals(other.getFxCostEstimate()))) &&
            ((this.fxCostEstimateRate==null && other.getFxCostEstimateRate()==null) || 
             (this.fxCostEstimateRate!=null &&
              this.fxCostEstimateRate.equals(other.getFxCostEstimateRate()))) &&
            ((this.fxEstGrossProfit==null && other.getFxEstGrossProfit()==null) || 
             (this.fxEstGrossProfit!=null &&
              this.fxEstGrossProfit.equals(other.getFxEstGrossProfit()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              this.fxTranCostEstimate.equals(other.getFxTranCostEstimate()))) &&
            ((this.fxVsoeAllocation==null && other.getFxVsoeAllocation()==null) || 
             (this.fxVsoeAllocation!=null &&
              this.fxVsoeAllocation.equals(other.getFxVsoeAllocation()))) &&
            ((this.fxVsoeAmount==null && other.getFxVsoeAmount()==null) || 
             (this.fxVsoeAmount!=null &&
              this.fxVsoeAmount.equals(other.getFxVsoeAmount()))) &&
            ((this.fxVsoePrice==null && other.getFxVsoePrice()==null) || 
             (this.fxVsoePrice!=null &&
              this.fxVsoePrice.equals(other.getFxVsoePrice()))) &&
            ((this.gcoAvailabelToCharge==null && other.getGcoAvailabelToCharge()==null) || 
             (this.gcoAvailabelToCharge!=null &&
              this.gcoAvailabelToCharge.equals(other.getGcoAvailabelToCharge()))) &&
            ((this.gcoAvailableToRefund==null && other.getGcoAvailableToRefund()==null) || 
             (this.gcoAvailableToRefund!=null &&
              this.gcoAvailableToRefund.equals(other.getGcoAvailableToRefund()))) &&
            ((this.gcoAvsStreetMatch==null && other.getGcoAvsStreetMatch()==null) || 
             (this.gcoAvsStreetMatch!=null &&
              this.gcoAvsStreetMatch.equals(other.getGcoAvsStreetMatch()))) &&
            ((this.gcoAvsZipMatch==null && other.getGcoAvsZipMatch()==null) || 
             (this.gcoAvsZipMatch!=null &&
              this.gcoAvsZipMatch.equals(other.getGcoAvsZipMatch()))) &&
            ((this.gcoBuyerAccountAge==null && other.getGcoBuyerAccountAge()==null) || 
             (this.gcoBuyerAccountAge!=null &&
              this.gcoBuyerAccountAge.equals(other.getGcoBuyerAccountAge()))) &&
            ((this.gcoBuyerIp==null && other.getGcoBuyerIp()==null) || 
             (this.gcoBuyerIp!=null &&
              this.gcoBuyerIp.equals(other.getGcoBuyerIp()))) &&
            ((this.gcoChargeAmount==null && other.getGcoChargeAmount()==null) || 
             (this.gcoChargeAmount!=null &&
              this.gcoChargeAmount.equals(other.getGcoChargeAmount()))) &&
            ((this.gcoChargebackAmount==null && other.getGcoChargebackAmount()==null) || 
             (this.gcoChargebackAmount!=null &&
              this.gcoChargebackAmount.equals(other.getGcoChargebackAmount()))) &&
            ((this.gcoConfirmedChargedTotal==null && other.getGcoConfirmedChargedTotal()==null) || 
             (this.gcoConfirmedChargedTotal!=null &&
              this.gcoConfirmedChargedTotal.equals(other.getGcoConfirmedChargedTotal()))) &&
            ((this.gcoConfirmedRefundedTotal==null && other.getGcoConfirmedRefundedTotal()==null) || 
             (this.gcoConfirmedRefundedTotal!=null &&
              this.gcoConfirmedRefundedTotal.equals(other.getGcoConfirmedRefundedTotal()))) &&
            ((this.gcoCreditcardNumber==null && other.getGcoCreditcardNumber()==null) || 
             (this.gcoCreditcardNumber!=null &&
              this.gcoCreditcardNumber.equals(other.getGcoCreditcardNumber()))) &&
            ((this.gcoCscMatch==null && other.getGcoCscMatch()==null) || 
             (this.gcoCscMatch!=null &&
              this.gcoCscMatch.equals(other.getGcoCscMatch()))) &&
            ((this.gcoFinancialState==null && other.getGcoFinancialState()==null) || 
             (this.gcoFinancialState!=null &&
              this.gcoFinancialState.equals(other.getGcoFinancialState()))) &&
            ((this.gcoFulfillmentState==null && other.getGcoFulfillmentState()==null) || 
             (this.gcoFulfillmentState!=null &&
              this.gcoFulfillmentState.equals(other.getGcoFulfillmentState()))) &&
            ((this.gcoOrderId==null && other.getGcoOrderId()==null) || 
             (this.gcoOrderId!=null &&
              this.gcoOrderId.equals(other.getGcoOrderId()))) &&
            ((this.gcoOrderTotal==null && other.getGcoOrderTotal()==null) || 
             (this.gcoOrderTotal!=null &&
              this.gcoOrderTotal.equals(other.getGcoOrderTotal()))) &&
            ((this.gcoPromotionAmount==null && other.getGcoPromotionAmount()==null) || 
             (this.gcoPromotionAmount!=null &&
              this.gcoPromotionAmount.equals(other.getGcoPromotionAmount()))) &&
            ((this.gcoPromotionName==null && other.getGcoPromotionName()==null) || 
             (this.gcoPromotionName!=null &&
              this.gcoPromotionName.equals(other.getGcoPromotionName()))) &&
            ((this.gcoRefundAmount==null && other.getGcoRefundAmount()==null) || 
             (this.gcoRefundAmount!=null &&
              this.gcoRefundAmount.equals(other.getGcoRefundAmount()))) &&
            ((this.gcoShippingTotal==null && other.getGcoShippingTotal()==null) || 
             (this.gcoShippingTotal!=null &&
              this.gcoShippingTotal.equals(other.getGcoShippingTotal()))) &&
            ((this.gcoStateChangedDetail==null && other.getGcoStateChangedDetail()==null) || 
             (this.gcoStateChangedDetail!=null &&
              this.gcoStateChangedDetail.equals(other.getGcoStateChangedDetail()))) &&
            ((this.giftCertificate==null && other.getGiftCertificate()==null) || 
             (this.giftCertificate!=null &&
              this.giftCertificate.equals(other.getGiftCertificate()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              this.grossAmount.equals(other.getGrossAmount()))) &&
            ((this.includeInForecast==null && other.getIncludeInForecast()==null) || 
             (this.includeInForecast!=null &&
              this.includeInForecast.equals(other.getIncludeInForecast()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.inVsoeBundle==null && other.getInVsoeBundle()==null) || 
             (this.inVsoeBundle!=null &&
              this.inVsoeBundle.equals(other.getInVsoeBundle()))) &&
            ((this.isAllocation==null && other.getIsAllocation()==null) || 
             (this.isAllocation!=null &&
              this.isAllocation.equals(other.getIsAllocation()))) &&
            ((this.isGcoChargeback==null && other.getIsGcoChargeback()==null) || 
             (this.isGcoChargeback!=null &&
              this.isGcoChargeback.equals(other.getIsGcoChargeback()))) &&
            ((this.isGcoChargeConfirmed==null && other.getIsGcoChargeConfirmed()==null) || 
             (this.isGcoChargeConfirmed!=null &&
              this.isGcoChargeConfirmed.equals(other.getIsGcoChargeConfirmed()))) &&
            ((this.isGcoPaymentGuaranteed==null && other.getIsGcoPaymentGuaranteed()==null) || 
             (this.isGcoPaymentGuaranteed!=null &&
              this.isGcoPaymentGuaranteed.equals(other.getIsGcoPaymentGuaranteed()))) &&
            ((this.isGcoRefundConfirmed==null && other.getIsGcoRefundConfirmed()==null) || 
             (this.isGcoRefundConfirmed!=null &&
              this.isGcoRefundConfirmed.equals(other.getIsGcoRefundConfirmed()))) &&
            ((this.isIntercompanyAdjustment==null && other.getIsIntercompanyAdjustment()==null) || 
             (this.isIntercompanyAdjustment!=null &&
              this.isIntercompanyAdjustment.equals(other.getIsIntercompanyAdjustment()))) &&
            ((this.isPayPalMeth==null && other.getIsPayPalMeth()==null) || 
             (this.isPayPalMeth!=null &&
              this.isPayPalMeth.equals(other.getIsPayPalMeth()))) &&
            ((this.isReversal==null && other.getIsReversal()==null) || 
             (this.isReversal!=null &&
              this.isReversal.equals(other.getIsReversal()))) &&
            ((this.isRevRecTransaction==null && other.getIsRevRecTransaction()==null) || 
             (this.isRevRecTransaction!=null &&
              this.isRevRecTransaction.equals(other.getIsRevRecTransaction()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              this.isShipAddress.equals(other.getIsShipAddress()))) &&
            ((this.isTransferPriceCosting==null && other.getIsTransferPriceCosting()==null) || 
             (this.isTransferPriceCosting!=null &&
              this.isTransferPriceCosting.equals(other.getIsTransferPriceCosting()))) &&
            ((this.isVsoeAlloc==null && other.getIsVsoeAlloc()==null) || 
             (this.isVsoeAlloc!=null &&
              this.isVsoeAlloc.equals(other.getIsVsoeAlloc()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.itemSubOf==null && other.getItemSubOf()==null) || 
             (this.itemSubOf!=null &&
              this.itemSubOf.equals(other.getItemSubOf()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.mainLine==null && other.getMainLine()==null) || 
             (this.mainLine!=null &&
              this.mainLine.equals(other.getMainLine()))) &&
            ((this.mainName==null && other.getMainName()==null) || 
             (this.mainName!=null &&
              this.mainName.equals(other.getMainName()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              this.matchBillToReceipt.equals(other.getMatchBillToReceipt()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.memoMain==null && other.getMemoMain()==null) || 
             (this.memoMain!=null &&
              this.memoMain.equals(other.getMemoMain()))) &&
            ((this.memorized==null && other.getMemorized()==null) || 
             (this.memorized!=null &&
              this.memorized.equals(other.getMemorized()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              this.merchantAccount.equals(other.getMerchantAccount()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.multiSubsidiary==null && other.getMultiSubsidiary()==null) || 
             (this.multiSubsidiary!=null &&
              this.multiSubsidiary.equals(other.getMultiSubsidiary()))) &&
            ((this.nameText==null && other.getNameText()==null) || 
             (this.nameText!=null &&
              this.nameText.equals(other.getNameText()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              this.netAmount.equals(other.getNetAmount()))) &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              this.nextBillDate.equals(other.getNextBillDate()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              this.opportunity.equals(other.getOpportunity()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              this.otherRefNum.equals(other.getOtherRefNum()))) &&
            ((this.otherRefNumNonDeposit==null && other.getOtherRefNumNonDeposit()==null) || 
             (this.otherRefNumNonDeposit!=null &&
              this.otherRefNumNonDeposit.equals(other.getOtherRefNumNonDeposit()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              this.packageCount.equals(other.getPackageCount()))) &&
            ((this.paidTransaction==null && other.getPaidTransaction()==null) || 
             (this.paidTransaction!=null &&
              this.paidTransaction.equals(other.getPaidTransaction()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
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
            ((this.payingTransaction==null && other.getPayingTransaction()==null) || 
             (this.payingTransaction!=null &&
              this.payingTransaction.equals(other.getPayingTransaction()))) &&
            ((this.paymentEventDate==null && other.getPaymentEventDate()==null) || 
             (this.paymentEventDate!=null &&
              this.paymentEventDate.equals(other.getPaymentEventDate()))) &&
            ((this.paymentEventHoldReason==null && other.getPaymentEventHoldReason()==null) || 
             (this.paymentEventHoldReason!=null &&
              this.paymentEventHoldReason.equals(other.getPaymentEventHoldReason()))) &&
            ((this.paymentEventResult==null && other.getPaymentEventResult()==null) || 
             (this.paymentEventResult!=null &&
              this.paymentEventResult.equals(other.getPaymentEventResult()))) &&
            ((this.paymentEventType==null && other.getPaymentEventType()==null) || 
             (this.paymentEventType!=null &&
              this.paymentEventType.equals(other.getPaymentEventType()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.payPalPending==null && other.getPayPalPending()==null) || 
             (this.payPalPending!=null &&
              this.payPalPending.equals(other.getPayPalPending()))) &&
            ((this.payPalStatus==null && other.getPayPalStatus()==null) || 
             (this.payPalStatus!=null &&
              this.payPalStatus.equals(other.getPayPalStatus()))) &&
            ((this.payPalTranId==null && other.getPayPalTranId()==null) || 
             (this.payPalTranId!=null &&
              this.payPalTranId.equals(other.getPayPalTranId()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.poAsText==null && other.getPoAsText()==null) || 
             (this.poAsText!=null &&
              this.poAsText.equals(other.getPoAsText()))) &&
            ((this.posting==null && other.getPosting()==null) || 
             (this.posting!=null &&
              this.posting.equals(other.getPosting()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.postingPeriodRelative==null && other.getPostingPeriodRelative()==null) || 
             (this.postingPeriodRelative!=null &&
              this.postingPeriodRelative.equals(other.getPostingPeriodRelative()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              this.priceLevel.equals(other.getPriceLevel()))) &&
            ((this.printedPickingTicket==null && other.getPrintedPickingTicket()==null) || 
             (this.printedPickingTicket!=null &&
              this.printedPickingTicket.equals(other.getPrintedPickingTicket()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              this.probability.equals(other.getProbability()))) &&
            ((this.projectedAmount==null && other.getProjectedAmount()==null) || 
             (this.projectedAmount!=null &&
              this.projectedAmount.equals(other.getProjectedAmount()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.purchaseOrder==null && other.getPurchaseOrder()==null) || 
             (this.purchaseOrder!=null &&
              this.purchaseOrder.equals(other.getPurchaseOrder()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              this.quantityBilled.equals(other.getQuantityBilled()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityPacked==null && other.getQuantityPacked()==null) || 
             (this.quantityPacked!=null &&
              this.quantityPacked.equals(other.getQuantityPacked()))) &&
            ((this.quantityPicked==null && other.getQuantityPicked()==null) || 
             (this.quantityPicked!=null &&
              this.quantityPicked.equals(other.getQuantityPicked()))) &&
            ((this.quantityRevCommitted==null && other.getQuantityRevCommitted()==null) || 
             (this.quantityRevCommitted!=null &&
              this.quantityRevCommitted.equals(other.getQuantityRevCommitted()))) &&
            ((this.quantityShipRecv==null && other.getQuantityShipRecv()==null) || 
             (this.quantityShipRecv!=null &&
              this.quantityShipRecv.equals(other.getQuantityShipRecv()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              this.recognizedRevenue.equals(other.getRecognizedRevenue()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              this.revCommitStatus.equals(other.getRevCommitStatus()))) &&
            ((this.revCommittingStatus==null && other.getRevCommittingStatus()==null) || 
             (this.revCommittingStatus!=null &&
              this.revCommittingStatus.equals(other.getRevCommittingStatus()))) &&
            ((this.revCommittingTransaction==null && other.getRevCommittingTransaction()==null) || 
             (this.revCommittingTransaction!=null &&
              this.revCommittingTransaction.equals(other.getRevCommittingTransaction()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              this.revenueStatus.equals(other.getRevenueStatus()))) &&
            ((this.reversalDate==null && other.getReversalDate()==null) || 
             (this.reversalDate!=null &&
              this.reversalDate.equals(other.getReversalDate()))) &&
            ((this.reversalNumber==null && other.getReversalNumber()==null) || 
             (this.reversalNumber!=null &&
              this.reversalNumber.equals(other.getReversalNumber()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecTermInMonths==null && other.getRevRecTermInMonths()==null) || 
             (this.revRecTermInMonths!=null &&
              this.revRecTermInMonths.equals(other.getRevRecTermInMonths()))) &&
            ((this.salesEffectiveDate==null && other.getSalesEffectiveDate()==null) || 
             (this.salesEffectiveDate!=null &&
              this.salesEffectiveDate.equals(other.getSalesEffectiveDate()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              this.salesTeamMember.equals(other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              this.salesTeamRole.equals(other.getSalesTeamRole()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.serialNumberQuantity==null && other.getSerialNumberQuantity()==null) || 
             (this.serialNumberQuantity!=null &&
              this.serialNumberQuantity.equals(other.getSerialNumberQuantity()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.shipAddressee==null && other.getShipAddressee()==null) || 
             (this.shipAddressee!=null &&
              this.shipAddressee.equals(other.getShipAddressee()))) &&
            ((this.shipAttention==null && other.getShipAttention()==null) || 
             (this.shipAttention!=null &&
              this.shipAttention.equals(other.getShipAttention()))) &&
            ((this.shipCity==null && other.getShipCity()==null) || 
             (this.shipCity!=null &&
              this.shipCity.equals(other.getShipCity()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              this.shipComplete.equals(other.getShipComplete()))) &&
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              this.shipCountry.equals(other.getShipCountry()))) &&
            ((this.shipCounty==null && other.getShipCounty()==null) || 
             (this.shipCounty!=null &&
              this.shipCounty.equals(other.getShipCounty()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              this.shipGroup.equals(other.getShipGroup()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              this.shipPhone.equals(other.getShipPhone()))) &&
            ((this.shipping==null && other.getShipping()==null) || 
             (this.shipping!=null &&
              this.shipping.equals(other.getShipping()))) &&
            ((this.shipRecvStatus==null && other.getShipRecvStatus()==null) || 
             (this.shipRecvStatus!=null &&
              this.shipRecvStatus.equals(other.getShipRecvStatus()))) &&
            ((this.shipRecvStatusLine==null && other.getShipRecvStatusLine()==null) || 
             (this.shipRecvStatusLine!=null &&
              this.shipRecvStatusLine.equals(other.getShipRecvStatusLine()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              this.shipState.equals(other.getShipState()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              this.shipTo.equals(other.getShipTo()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              this.shipZip.equals(other.getShipZip()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.taxLine==null && other.getTaxLine()==null) || 
             (this.taxLine!=null &&
              this.taxLine.equals(other.getTaxLine()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              this.taxPeriod.equals(other.getTaxPeriod()))) &&
            ((this.taxPeriodRelative==null && other.getTaxPeriodRelative()==null) || 
             (this.taxPeriodRelative!=null &&
              this.taxPeriodRelative.equals(other.getTaxPeriodRelative()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              this.terms.equals(other.getTerms()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              this.toBeEmailed.equals(other.getToBeEmailed()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              this.toBePrinted.equals(other.getToBePrinted()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              this.toSubsidiary.equals(other.getToSubsidiary()))) &&
            ((this.totalAmount==null && other.getTotalAmount()==null) || 
             (this.totalAmount!=null &&
              this.totalAmount.equals(other.getTotalAmount()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              this.trackingNumbers.equals(other.getTrackingNumbers()))) &&
            ((this.tranCostEstimate==null && other.getTranCostEstimate()==null) || 
             (this.tranCostEstimate!=null &&
              this.tranCostEstimate.equals(other.getTranCostEstimate()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              this.tranEstGrossProfit.equals(other.getTranEstGrossProfit()))) &&
            ((this.tranEstGrossProfitPct==null && other.getTranEstGrossProfitPct()==null) || 
             (this.tranEstGrossProfitPct!=null &&
              this.tranEstGrossProfitPct.equals(other.getTranEstGrossProfitPct()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              this.tranFxEstGrossProfit.equals(other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle()))) &&
            ((this.transactionLineType==null && other.getTransactionLineType()==null) || 
             (this.transactionLineType!=null &&
              this.transactionLineType.equals(other.getTransactionLineType()))) &&
            ((this.transferLocation==null && other.getTransferLocation()==null) || 
             (this.transferLocation!=null &&
              this.transferLocation.equals(other.getTransferLocation()))) &&
            ((this.transferOrderQuantityCommitted==null && other.getTransferOrderQuantityCommitted()==null) || 
             (this.transferOrderQuantityCommitted!=null &&
              this.transferOrderQuantityCommitted.equals(other.getTransferOrderQuantityCommitted()))) &&
            ((this.transferOrderQuantityPacked==null && other.getTransferOrderQuantityPacked()==null) || 
             (this.transferOrderQuantityPacked!=null &&
              this.transferOrderQuantityPacked.equals(other.getTransferOrderQuantityPacked()))) &&
            ((this.transferOrderQuantityPicked==null && other.getTransferOrderQuantityPicked()==null) || 
             (this.transferOrderQuantityPicked!=null &&
              this.transferOrderQuantityPicked.equals(other.getTransferOrderQuantityPicked()))) &&
            ((this.transferOrderQuantityReceived==null && other.getTransferOrderQuantityReceived()==null) || 
             (this.transferOrderQuantityReceived!=null &&
              this.transferOrderQuantityReceived.equals(other.getTransferOrderQuantityReceived()))) &&
            ((this.transferOrderQuantityShipped==null && other.getTransferOrderQuantityShipped()==null) || 
             (this.transferOrderQuantityShipped!=null &&
              this.transferOrderQuantityShipped.equals(other.getTransferOrderQuantityShipped()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.unitCostOverride==null && other.getUnitCostOverride()==null) || 
             (this.unitCostOverride!=null &&
              this.unitCostOverride.equals(other.getUnitCostOverride()))) &&
            ((this.vendType==null && other.getVendType()==null) || 
             (this.vendType!=null &&
              this.vendType.equals(other.getVendType()))) &&
            ((this.visibleToCustomer==null && other.getVisibleToCustomer()==null) || 
             (this.visibleToCustomer!=null &&
              this.visibleToCustomer.equals(other.getVisibleToCustomer()))) &&
            ((this.voided==null && other.getVoided()==null) || 
             (this.voided!=null &&
              this.voided.equals(other.getVoided()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              this.vsoeAllocation.equals(other.getVsoeAllocation()))) &&
            ((this.vsoeAmount==null && other.getVsoeAmount()==null) || 
             (this.vsoeAmount!=null &&
              this.vsoeAmount.equals(other.getVsoeAmount()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              this.webSite.equals(other.getWebSite()))) &&
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
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getActualShipDate() != null) {
            _hashCode += getActualShipDate().hashCode();
        }
        if (getAltSalesAmount() != null) {
            _hashCode += getAltSalesAmount().hashCode();
        }
        if (getAltSalesNetAmount() != null) {
            _hashCode += getAltSalesNetAmount().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getAmountPaid() != null) {
            _hashCode += getAmountPaid().hashCode();
        }
        if (getAmountRemaining() != null) {
            _hashCode += getAmountRemaining().hashCode();
        }
        if (getAmountUnbilled() != null) {
            _hashCode += getAmountUnbilled().hashCode();
        }
        if (getAnyLineItem() != null) {
            _hashCode += getAnyLineItem().hashCode();
        }
        if (getAppliedToForeignAmount() != null) {
            _hashCode += getAppliedToForeignAmount().hashCode();
        }
        if (getAppliedToIsFxVariance() != null) {
            _hashCode += getAppliedToIsFxVariance().hashCode();
        }
        if (getAppliedToLinkAmount() != null) {
            _hashCode += getAppliedToLinkAmount().hashCode();
        }
        if (getAppliedToLinkType() != null) {
            _hashCode += getAppliedToLinkType().hashCode();
        }
        if (getAppliedToTransaction() != null) {
            _hashCode += getAppliedToTransaction().hashCode();
        }
        if (getApplyingForeignAmount() != null) {
            _hashCode += getApplyingForeignAmount().hashCode();
        }
        if (getApplyingIsFxVariance() != null) {
            _hashCode += getApplyingIsFxVariance().hashCode();
        }
        if (getApplyingLinkAmount() != null) {
            _hashCode += getApplyingLinkAmount().hashCode();
        }
        if (getApplyingLinkType() != null) {
            _hashCode += getApplyingLinkType().hashCode();
        }
        if (getApplyingTransaction() != null) {
            _hashCode += getApplyingTransaction().hashCode();
        }
        if (getAuthCode() != null) {
            _hashCode += getAuthCode().hashCode();
        }
        if (getAvsStreetMatch() != null) {
            _hashCode += getAvsStreetMatch().hashCode();
        }
        if (getAvsZipMatch() != null) {
            _hashCode += getAvsZipMatch().hashCode();
        }
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getBillAddressee() != null) {
            _hashCode += getBillAddressee().hashCode();
        }
        if (getBillAttention() != null) {
            _hashCode += getBillAttention().hashCode();
        }
        if (getBillCity() != null) {
            _hashCode += getBillCity().hashCode();
        }
        if (getBillCountry() != null) {
            _hashCode += getBillCountry().hashCode();
        }
        if (getBillCounty() != null) {
            _hashCode += getBillCounty().hashCode();
        }
        if (getBilledDate() != null) {
            _hashCode += getBilledDate().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getBillingStatus() != null) {
            _hashCode += getBillingStatus().hashCode();
        }
        if (getBillingTransaction() != null) {
            _hashCode += getBillingTransaction().hashCode();
        }
        if (getBillPhone() != null) {
            _hashCode += getBillPhone().hashCode();
        }
        if (getBillState() != null) {
            _hashCode += getBillState().hashCode();
        }
        if (getBillVarianceStatus() != null) {
            _hashCode += getBillVarianceStatus().hashCode();
        }
        if (getBillZip() != null) {
            _hashCode += getBillZip().hashCode();
        }
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getBinNumberQuantity() != null) {
            _hashCode += getBinNumberQuantity().hashCode();
        }
        if (getBuildEntireAssembly() != null) {
            _hashCode += getBuildEntireAssembly().hashCode();
        }
        if (getBuildVariance() != null) {
            _hashCode += getBuildVariance().hashCode();
        }
        if (getBuilt() != null) {
            _hashCode += getBuilt().hashCode();
        }
        if (getCcCustomerCode() != null) {
            _hashCode += getCcCustomerCode().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
        }
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCleared() != null) {
            _hashCode += getCleared().hashCode();
        }
        if (getClosed() != null) {
            _hashCode += getClosed().hashCode();
        }
        if (getCloseDate() != null) {
            _hashCode += getCloseDate().hashCode();
        }
        if (getCogs() != null) {
            _hashCode += getCogs().hashCode();
        }
        if (getCommissionEffectiveDate() != null) {
            _hashCode += getCommissionEffectiveDate().hashCode();
        }
        if (getCommit() != null) {
            _hashCode += getCommit().hashCode();
        }
        if (getConfirmationNumber() != null) {
            _hashCode += getConfirmationNumber().hashCode();
        }
        if (getContribution() != null) {
            _hashCode += getContribution().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getCostEstimateRate() != null) {
            _hashCode += getCostEstimateRate().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getCreditAmount() != null) {
            _hashCode += getCreditAmount().hashCode();
        }
        if (getCscMatch() != null) {
            _hashCode += getCscMatch().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getCustomerSubOf() != null) {
            _hashCode += getCustomerSubOf().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getCustType() != null) {
            _hashCode += getCustType().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDaysOpen() != null) {
            _hashCode += getDaysOpen().hashCode();
        }
        if (getDaysOverdue() != null) {
            _hashCode += getDaysOverdue().hashCode();
        }
        if (getDebitAmount() != null) {
            _hashCode += getDebitAmount().hashCode();
        }
        if (getDeferredRevenue() != null) {
            _hashCode += getDeferredRevenue().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDepositDate() != null) {
            _hashCode += getDepositDate().hashCode();
        }
        if (getDepositTransaction() != null) {
            _hashCode += getDepositTransaction().hashCode();
        }
        if (getDueDate() != null) {
            _hashCode += getDueDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getEntityStatus() != null) {
            _hashCode += getEntityStatus().hashCode();
        }
        if (getEstGrossProfit() != null) {
            _hashCode += getEstGrossProfit().hashCode();
        }
        if (getEstGrossProfitPct() != null) {
            _hashCode += getEstGrossProfitPct().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getExcludeCommission() != null) {
            _hashCode += getExcludeCommission().hashCode();
        }
        if (getExpectedCloseDate() != null) {
            _hashCode += getExpectedCloseDate().hashCode();
        }
        if (getExpenseCategory() != null) {
            _hashCode += getExpenseCategory().hashCode();
        }
        if (getExpenseDate() != null) {
            _hashCode += getExpenseDate().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFinChrg() != null) {
            _hashCode += getFinChrg().hashCode();
        }
        if (getForecastType() != null) {
            _hashCode += getForecastType().hashCode();
        }
        if (getFulfillingTransaction() != null) {
            _hashCode += getFulfillingTransaction().hashCode();
        }
        if (getFxAmount() != null) {
            _hashCode += getFxAmount().hashCode();
        }
        if (getFxCostEstimate() != null) {
            _hashCode += getFxCostEstimate().hashCode();
        }
        if (getFxCostEstimateRate() != null) {
            _hashCode += getFxCostEstimateRate().hashCode();
        }
        if (getFxEstGrossProfit() != null) {
            _hashCode += getFxEstGrossProfit().hashCode();
        }
        if (getFxTranCostEstimate() != null) {
            _hashCode += getFxTranCostEstimate().hashCode();
        }
        if (getFxVsoeAllocation() != null) {
            _hashCode += getFxVsoeAllocation().hashCode();
        }
        if (getFxVsoeAmount() != null) {
            _hashCode += getFxVsoeAmount().hashCode();
        }
        if (getFxVsoePrice() != null) {
            _hashCode += getFxVsoePrice().hashCode();
        }
        if (getGcoAvailabelToCharge() != null) {
            _hashCode += getGcoAvailabelToCharge().hashCode();
        }
        if (getGcoAvailableToRefund() != null) {
            _hashCode += getGcoAvailableToRefund().hashCode();
        }
        if (getGcoAvsStreetMatch() != null) {
            _hashCode += getGcoAvsStreetMatch().hashCode();
        }
        if (getGcoAvsZipMatch() != null) {
            _hashCode += getGcoAvsZipMatch().hashCode();
        }
        if (getGcoBuyerAccountAge() != null) {
            _hashCode += getGcoBuyerAccountAge().hashCode();
        }
        if (getGcoBuyerIp() != null) {
            _hashCode += getGcoBuyerIp().hashCode();
        }
        if (getGcoChargeAmount() != null) {
            _hashCode += getGcoChargeAmount().hashCode();
        }
        if (getGcoChargebackAmount() != null) {
            _hashCode += getGcoChargebackAmount().hashCode();
        }
        if (getGcoConfirmedChargedTotal() != null) {
            _hashCode += getGcoConfirmedChargedTotal().hashCode();
        }
        if (getGcoConfirmedRefundedTotal() != null) {
            _hashCode += getGcoConfirmedRefundedTotal().hashCode();
        }
        if (getGcoCreditcardNumber() != null) {
            _hashCode += getGcoCreditcardNumber().hashCode();
        }
        if (getGcoCscMatch() != null) {
            _hashCode += getGcoCscMatch().hashCode();
        }
        if (getGcoFinancialState() != null) {
            _hashCode += getGcoFinancialState().hashCode();
        }
        if (getGcoFulfillmentState() != null) {
            _hashCode += getGcoFulfillmentState().hashCode();
        }
        if (getGcoOrderId() != null) {
            _hashCode += getGcoOrderId().hashCode();
        }
        if (getGcoOrderTotal() != null) {
            _hashCode += getGcoOrderTotal().hashCode();
        }
        if (getGcoPromotionAmount() != null) {
            _hashCode += getGcoPromotionAmount().hashCode();
        }
        if (getGcoPromotionName() != null) {
            _hashCode += getGcoPromotionName().hashCode();
        }
        if (getGcoRefundAmount() != null) {
            _hashCode += getGcoRefundAmount().hashCode();
        }
        if (getGcoShippingTotal() != null) {
            _hashCode += getGcoShippingTotal().hashCode();
        }
        if (getGcoStateChangedDetail() != null) {
            _hashCode += getGcoStateChangedDetail().hashCode();
        }
        if (getGiftCertificate() != null) {
            _hashCode += getGiftCertificate().hashCode();
        }
        if (getGrossAmount() != null) {
            _hashCode += getGrossAmount().hashCode();
        }
        if (getIncludeInForecast() != null) {
            _hashCode += getIncludeInForecast().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getInVsoeBundle() != null) {
            _hashCode += getInVsoeBundle().hashCode();
        }
        if (getIsAllocation() != null) {
            _hashCode += getIsAllocation().hashCode();
        }
        if (getIsGcoChargeback() != null) {
            _hashCode += getIsGcoChargeback().hashCode();
        }
        if (getIsGcoChargeConfirmed() != null) {
            _hashCode += getIsGcoChargeConfirmed().hashCode();
        }
        if (getIsGcoPaymentGuaranteed() != null) {
            _hashCode += getIsGcoPaymentGuaranteed().hashCode();
        }
        if (getIsGcoRefundConfirmed() != null) {
            _hashCode += getIsGcoRefundConfirmed().hashCode();
        }
        if (getIsIntercompanyAdjustment() != null) {
            _hashCode += getIsIntercompanyAdjustment().hashCode();
        }
        if (getIsPayPalMeth() != null) {
            _hashCode += getIsPayPalMeth().hashCode();
        }
        if (getIsReversal() != null) {
            _hashCode += getIsReversal().hashCode();
        }
        if (getIsRevRecTransaction() != null) {
            _hashCode += getIsRevRecTransaction().hashCode();
        }
        if (getIsShipAddress() != null) {
            _hashCode += getIsShipAddress().hashCode();
        }
        if (getIsTransferPriceCosting() != null) {
            _hashCode += getIsTransferPriceCosting().hashCode();
        }
        if (getIsVsoeAlloc() != null) {
            _hashCode += getIsVsoeAlloc().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getItemSubOf() != null) {
            _hashCode += getItemSubOf().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMainLine() != null) {
            _hashCode += getMainLine().hashCode();
        }
        if (getMainName() != null) {
            _hashCode += getMainName().hashCode();
        }
        if (getMatchBillToReceipt() != null) {
            _hashCode += getMatchBillToReceipt().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getMemoMain() != null) {
            _hashCode += getMemoMain().hashCode();
        }
        if (getMemorized() != null) {
            _hashCode += getMemorized().hashCode();
        }
        if (getMerchantAccount() != null) {
            _hashCode += getMerchantAccount().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMultiSubsidiary() != null) {
            _hashCode += getMultiSubsidiary().hashCode();
        }
        if (getNameText() != null) {
            _hashCode += getNameText().hashCode();
        }
        if (getNetAmount() != null) {
            _hashCode += getNetAmount().hashCode();
        }
        if (getNextBillDate() != null) {
            _hashCode += getNextBillDate().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOpportunity() != null) {
            _hashCode += getOpportunity().hashCode();
        }
        if (getOtherRefNum() != null) {
            _hashCode += getOtherRefNum().hashCode();
        }
        if (getOtherRefNumNonDeposit() != null) {
            _hashCode += getOtherRefNumNonDeposit().hashCode();
        }
        if (getPackageCount() != null) {
            _hashCode += getPackageCount().hashCode();
        }
        if (getPaidTransaction() != null) {
            _hashCode += getPaidTransaction().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
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
        if (getPayingTransaction() != null) {
            _hashCode += getPayingTransaction().hashCode();
        }
        if (getPaymentEventDate() != null) {
            _hashCode += getPaymentEventDate().hashCode();
        }
        if (getPaymentEventHoldReason() != null) {
            _hashCode += getPaymentEventHoldReason().hashCode();
        }
        if (getPaymentEventResult() != null) {
            _hashCode += getPaymentEventResult().hashCode();
        }
        if (getPaymentEventType() != null) {
            _hashCode += getPaymentEventType().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getPayPalPending() != null) {
            _hashCode += getPayPalPending().hashCode();
        }
        if (getPayPalStatus() != null) {
            _hashCode += getPayPalStatus().hashCode();
        }
        if (getPayPalTranId() != null) {
            _hashCode += getPayPalTranId().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getPoAsText() != null) {
            _hashCode += getPoAsText().hashCode();
        }
        if (getPosting() != null) {
            _hashCode += getPosting().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getPostingPeriodRelative() != null) {
            _hashCode += getPostingPeriodRelative().hashCode();
        }
        if (getPriceLevel() != null) {
            _hashCode += getPriceLevel().hashCode();
        }
        if (getPrintedPickingTicket() != null) {
            _hashCode += getPrintedPickingTicket().hashCode();
        }
        if (getProbability() != null) {
            _hashCode += getProbability().hashCode();
        }
        if (getProjectedAmount() != null) {
            _hashCode += getProjectedAmount().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getPurchaseOrder() != null) {
            _hashCode += getPurchaseOrder().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getQuantityBilled() != null) {
            _hashCode += getQuantityBilled().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityPacked() != null) {
            _hashCode += getQuantityPacked().hashCode();
        }
        if (getQuantityPicked() != null) {
            _hashCode += getQuantityPicked().hashCode();
        }
        if (getQuantityRevCommitted() != null) {
            _hashCode += getQuantityRevCommitted().hashCode();
        }
        if (getQuantityShipRecv() != null) {
            _hashCode += getQuantityShipRecv().hashCode();
        }
        if (getRecognizedRevenue() != null) {
            _hashCode += getRecognizedRevenue().hashCode();
        }
        if (getRevCommitStatus() != null) {
            _hashCode += getRevCommitStatus().hashCode();
        }
        if (getRevCommittingStatus() != null) {
            _hashCode += getRevCommittingStatus().hashCode();
        }
        if (getRevCommittingTransaction() != null) {
            _hashCode += getRevCommittingTransaction().hashCode();
        }
        if (getRevenueStatus() != null) {
            _hashCode += getRevenueStatus().hashCode();
        }
        if (getReversalDate() != null) {
            _hashCode += getReversalDate().hashCode();
        }
        if (getReversalNumber() != null) {
            _hashCode += getReversalNumber().hashCode();
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getRevRecOnRevCommitment() != null) {
            _hashCode += getRevRecOnRevCommitment().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecTermInMonths() != null) {
            _hashCode += getRevRecTermInMonths().hashCode();
        }
        if (getSalesEffectiveDate() != null) {
            _hashCode += getSalesEffectiveDate().hashCode();
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
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSerialNumberQuantity() != null) {
            _hashCode += getSerialNumberQuantity().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getShipAddressee() != null) {
            _hashCode += getShipAddressee().hashCode();
        }
        if (getShipAttention() != null) {
            _hashCode += getShipAttention().hashCode();
        }
        if (getShipCity() != null) {
            _hashCode += getShipCity().hashCode();
        }
        if (getShipComplete() != null) {
            _hashCode += getShipComplete().hashCode();
        }
        if (getShipCountry() != null) {
            _hashCode += getShipCountry().hashCode();
        }
        if (getShipCounty() != null) {
            _hashCode += getShipCounty().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getShipGroup() != null) {
            _hashCode += getShipGroup().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getShipPhone() != null) {
            _hashCode += getShipPhone().hashCode();
        }
        if (getShipping() != null) {
            _hashCode += getShipping().hashCode();
        }
        if (getShipRecvStatus() != null) {
            _hashCode += getShipRecvStatus().hashCode();
        }
        if (getShipRecvStatusLine() != null) {
            _hashCode += getShipRecvStatusLine().hashCode();
        }
        if (getShipState() != null) {
            _hashCode += getShipState().hashCode();
        }
        if (getShipTo() != null) {
            _hashCode += getShipTo().hashCode();
        }
        if (getShipZip() != null) {
            _hashCode += getShipZip().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getTaxLine() != null) {
            _hashCode += getTaxLine().hashCode();
        }
        if (getTaxPeriod() != null) {
            _hashCode += getTaxPeriod().hashCode();
        }
        if (getTaxPeriodRelative() != null) {
            _hashCode += getTaxPeriodRelative().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getTerms() != null) {
            _hashCode += getTerms().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getToBeEmailed() != null) {
            _hashCode += getToBeEmailed().hashCode();
        }
        if (getToBePrinted() != null) {
            _hashCode += getToBePrinted().hashCode();
        }
        if (getToSubsidiary() != null) {
            _hashCode += getToSubsidiary().hashCode();
        }
        if (getTotalAmount() != null) {
            _hashCode += getTotalAmount().hashCode();
        }
        if (getTrackingNumbers() != null) {
            _hashCode += getTrackingNumbers().hashCode();
        }
        if (getTranCostEstimate() != null) {
            _hashCode += getTranCostEstimate().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranEstGrossProfit() != null) {
            _hashCode += getTranEstGrossProfit().hashCode();
        }
        if (getTranEstGrossProfitPct() != null) {
            _hashCode += getTranEstGrossProfitPct().hashCode();
        }
        if (getTranFxEstGrossProfit() != null) {
            _hashCode += getTranFxEstGrossProfit().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getTranIsVsoeBundle() != null) {
            _hashCode += getTranIsVsoeBundle().hashCode();
        }
        if (getTransactionLineType() != null) {
            _hashCode += getTransactionLineType().hashCode();
        }
        if (getTransferLocation() != null) {
            _hashCode += getTransferLocation().hashCode();
        }
        if (getTransferOrderQuantityCommitted() != null) {
            _hashCode += getTransferOrderQuantityCommitted().hashCode();
        }
        if (getTransferOrderQuantityPacked() != null) {
            _hashCode += getTransferOrderQuantityPacked().hashCode();
        }
        if (getTransferOrderQuantityPicked() != null) {
            _hashCode += getTransferOrderQuantityPicked().hashCode();
        }
        if (getTransferOrderQuantityReceived() != null) {
            _hashCode += getTransferOrderQuantityReceived().hashCode();
        }
        if (getTransferOrderQuantityShipped() != null) {
            _hashCode += getTransferOrderQuantityShipped().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getUnitCostOverride() != null) {
            _hashCode += getUnitCostOverride().hashCode();
        }
        if (getVendType() != null) {
            _hashCode += getVendType().hashCode();
        }
        if (getVisibleToCustomer() != null) {
            _hashCode += getVisibleToCustomer().hashCode();
        }
        if (getVoided() != null) {
            _hashCode += getVoided().hashCode();
        }
        if (getVsoeAllocation() != null) {
            _hashCode += getVsoeAllocation().hashCode();
        }
        if (getVsoeAmount() != null) {
            _hashCode += getVsoeAmount().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getWebSite() != null) {
            _hashCode += getWebSite().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountUnbilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountUnbilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyLineItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "anyLineItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "avsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "avsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "built"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccName"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleared");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cleared"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogs");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cogs"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "commissionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "confirmationNumber"));
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
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerSubOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customerSubOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "custType"));
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
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "depositDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "depositTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dueDate"));
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
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expenseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expenseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("finChrg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "finChrg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fulfillingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxCostEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxVsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxVsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxVsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailabelToCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvailabelToCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailableToRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvailableToRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerAccountAge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoBuyerAccountAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoBuyerIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargebackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoChargebackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedChargedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoConfirmedChargedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedRefundedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoConfirmedRefundedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCreditcardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoCreditcardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoCscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFinancialState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoFinancialState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFulfillmentState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoFulfillmentState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoOrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoPromotionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoPromotionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoRefundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoRefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoShippingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoShippingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoStateChangedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoStateChangedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertificate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertificate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInForecast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "includeInForecast"));
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
        elemField.setFieldName("inVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "inVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoChargeback"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoChargeConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoPaymentGuaranteed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoPaymentGuaranteed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoRefundConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoRefundConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIntercompanyAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isIntercompanyAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPayPalMeth");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isPayPalMeth"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReversal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isReversal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRevRecTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isRevRecTransaction"));
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
        elemField.setFieldName("isTransferPriceCosting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isTransferPriceCosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVsoeAlloc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isVsoeAlloc"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemSubOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemSubOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "mainLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "mainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoMain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memoMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "merchantAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nameText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nextBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNumNonDeposit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "otherRefNumNonDeposit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "packageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paidTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("payingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payPalPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poAsText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "poAsText"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "postingPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PostingPeriodDate"));
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
        elemField.setFieldName("printedPickingTicket");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "printedPickingTicket"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projectedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityShipRecv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityShipRecv"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revCommittingStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revCommittingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reversalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reversalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecTermInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecTermInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumbers"));
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
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCity"));
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
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCounty");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCounty"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipRecvStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipRecvStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipRecvStatusLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipRecvStatusLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriodRelative");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxPeriodRelative"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "totalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transactionLineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityShipped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityShipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCostOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitCostOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleToCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "visibleToCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voided");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "voided"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
