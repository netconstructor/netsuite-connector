/**
 * TransactionSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] abbrev;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] account;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountType;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] actualShipDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] altSalesAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] altSalesNetAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amountPaid;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amountRemaining;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amountUnbilled;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] appliedToForeignAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] appliedToIsFxVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] appliedToLinkAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] appliedToLinkType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] appliedToTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] applyingForeignAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] applyingIsFxVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] applyingLinkAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] applyingLinkType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] applyingTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] authCode;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] avsStreetMatch;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] avsZipMatch;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] billable;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddress2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAddressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billAttention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCity;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billCountry;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billCountryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] billedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] billingAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingSchedule;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billState;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billVarianceStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZip;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binNumberQuantity;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] buildEntireAssembly;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] buildVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] built;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccCustomerCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] ccExpDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccHolderName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccStreet;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccZipCode;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] cleared;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] closed;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] closeDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cogsAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] commissionEffectiveDate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] commit;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] confirmationNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contribution;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] contributionPrimary;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costEstimate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costEstimateRate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costEstimateType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] createdBy;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] createdFrom;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] creditAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] cscMatch;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] currency;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customForm;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] custType;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOpen;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOverdue;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] debitAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] deferredRevenue;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] deferRevRec;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] depositDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] depositTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dueDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] effectiveRate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] email;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entity;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entityStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estGrossProfitPct;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estGrossProfitPercent;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] exchangeRate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] excludeCommission;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] expectedCloseDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] expenseCategory;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] expenseDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] forecastType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] fulfillingTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxCostEstimateRate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxTranCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxVsoeAllocation;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxVsoeAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxVsoePrice;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] gcoAvailabelToCharge;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] gcoAvailableToRefund;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gcoAvsStreetMatch;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gcoAvsZipMatch;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] gcoBuyerAccountAge;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoBuyerIp;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoChargeAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoChargebackAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoConfirmedChargedTotal;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoConfirmedRefundedTotal;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoCreditcardNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gcoCscMatch;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoFinancialState;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoFulfillmentState;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoOrderId;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoOrderTotal;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoPromotionAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoPromotionName;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoRefundAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoShippingTotal;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoStateChangedDetail;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCert;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] includeInForecast;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] inVsoeBundle;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAllocation;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoChargeback;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoChargeConfirmed;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoPaymentGuaranteed;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoRefundConfirmed;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isIntercompanyAdjustment;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isReversal;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isRevRecTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isShipAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTransferPriceCosting;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] leadSource;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] line;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] mainLine;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] mainName;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] matchBillToReceipt;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] memoMain;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] memorized;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] merchantAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] message;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] multiSubsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] netAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] netAmountNoTax;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] nextBillDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] opportunity;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] options;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] originator;

    private org.mule.module.netsuite.api.internal.SearchColumnTextNumberField[] otherRefNum;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] packageCount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] paidAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] paidTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partner;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] partnerContribution;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerRole;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerTeamMember;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] payingAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] payingTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] paymentEventDate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] paymentEventHoldReason;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] paymentEventResult;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] paymentEventType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] paymentMethod;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] payPalPending;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] payPalStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] payPalTranId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] payrollBatch;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] pnRefNum;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] poRate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] posting;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] postingPeriod;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priceLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] print;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] probability;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projectedAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] promoCode;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseOrder;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantity;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityBilled;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityPacked;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityPicked;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityRevCommitted;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityShipRecv;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityUom;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] realizedGainPostingTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] recognizedRevenue;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] revCommitStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] revCommittingTransaction;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] revenueStatus;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] reversalDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] reversalNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] revRecEndDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] revRecOnRevCommitment;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] revRecStartDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] rgAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rgAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] salesEffectiveDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesRep;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamMember;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTeamRole;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] serialNumberQuantity;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumbers;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddress2;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAddressee;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipAttention;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCity;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipComplete;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] shipCountry;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipCountryCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] shipDate;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] shipGroup;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shipMethod;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipPhone;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] shippingAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipRecvStatusLine;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipState;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shipTo;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shipZip;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] signedAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] source;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] taxAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxCode;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] taxLine;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxPeriod;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] taxTotal;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] termInMonths;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] terms;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] toBeEmailed;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] toBePrinted;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] toSubsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] total;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] totalCostEstimate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] trackingNumbers;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] tranDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranFxEstGrossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] tranIsVsoeBundle;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] transactionLineType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] transferLocation;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] transferOrderItemLine;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityPacked;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityPicked;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityReceived;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityShipped;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] unit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCostOverride;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendType;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] visibleToCustomer;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoeAllocation;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoeAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoeDeferral;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] vsoeDelivered;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoePermitDiscount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoePrice;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] webSite;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public TransactionSearchRowBasic() {
    }

    /**
     * Gets the abbrev value for this TransactionSearchRowBasic.
     * 
     * @return abbrev
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAbbrev() {
        return abbrev;
    }


    /**
     * Sets the abbrev value for this TransactionSearchRowBasic.
     * 
     * @param abbrev
     */
    public void setAbbrev(org.mule.module.netsuite.api.internal.SearchColumnStringField[] abbrev) {
        this.abbrev = abbrev;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAbbrev(int i) {
        return this.abbrev[i];
    }

    public void setAbbrev(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.abbrev[i] = _value;
    }


    /**
     * Gets the account value for this TransactionSearchRowBasic.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAccount() {
        return account;
    }


    /**
     * Sets the account value for this TransactionSearchRowBasic.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] account) {
        this.account = account;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.account[i] = _value;
    }


    /**
     * Gets the accountType value for this TransactionSearchRowBasic.
     * 
     * @return accountType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this TransactionSearchRowBasic.
     * 
     * @param accountType
     */
    public void setAccountType(org.mule.module.netsuite.api.internal.SearchColumnStringField[] accountType) {
        this.accountType = accountType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAccountType(int i) {
        return this.accountType[i];
    }

    public void setAccountType(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.accountType[i] = _value;
    }


    /**
     * Gets the actualShipDate value for this TransactionSearchRowBasic.
     * 
     * @return actualShipDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getActualShipDate() {
        return actualShipDate;
    }


    /**
     * Sets the actualShipDate value for this TransactionSearchRowBasic.
     * 
     * @param actualShipDate
     */
    public void setActualShipDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] actualShipDate) {
        this.actualShipDate = actualShipDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getActualShipDate(int i) {
        return this.actualShipDate[i];
    }

    public void setActualShipDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.actualShipDate[i] = _value;
    }


    /**
     * Gets the altSalesAmount value for this TransactionSearchRowBasic.
     * 
     * @return altSalesAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAltSalesAmount() {
        return altSalesAmount;
    }


    /**
     * Sets the altSalesAmount value for this TransactionSearchRowBasic.
     * 
     * @param altSalesAmount
     */
    public void setAltSalesAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAltSalesAmount(int i) {
        return this.altSalesAmount[i];
    }

    public void setAltSalesAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.altSalesAmount[i] = _value;
    }


    /**
     * Gets the altSalesNetAmount value for this TransactionSearchRowBasic.
     * 
     * @return altSalesNetAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAltSalesNetAmount() {
        return altSalesNetAmount;
    }


    /**
     * Sets the altSalesNetAmount value for this TransactionSearchRowBasic.
     * 
     * @param altSalesNetAmount
     */
    public void setAltSalesNetAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAltSalesNetAmount(int i) {
        return this.altSalesNetAmount[i];
    }

    public void setAltSalesNetAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.altSalesNetAmount[i] = _value;
    }


    /**
     * Gets the amount value for this TransactionSearchRowBasic.
     * 
     * @return amount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransactionSearchRowBasic.
     * 
     * @param amount
     */
    public void setAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }


    /**
     * Gets the amountPaid value for this TransactionSearchRowBasic.
     * 
     * @return amountPaid
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAmountPaid() {
        return amountPaid;
    }


    /**
     * Sets the amountPaid value for this TransactionSearchRowBasic.
     * 
     * @param amountPaid
     */
    public void setAmountPaid(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amountPaid) {
        this.amountPaid = amountPaid;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAmountPaid(int i) {
        return this.amountPaid[i];
    }

    public void setAmountPaid(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.amountPaid[i] = _value;
    }


    /**
     * Gets the amountRemaining value for this TransactionSearchRowBasic.
     * 
     * @return amountRemaining
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAmountRemaining() {
        return amountRemaining;
    }


    /**
     * Sets the amountRemaining value for this TransactionSearchRowBasic.
     * 
     * @param amountRemaining
     */
    public void setAmountRemaining(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAmountRemaining(int i) {
        return this.amountRemaining[i];
    }

    public void setAmountRemaining(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.amountRemaining[i] = _value;
    }


    /**
     * Gets the amountUnbilled value for this TransactionSearchRowBasic.
     * 
     * @return amountUnbilled
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAmountUnbilled() {
        return amountUnbilled;
    }


    /**
     * Sets the amountUnbilled value for this TransactionSearchRowBasic.
     * 
     * @param amountUnbilled
     */
    public void setAmountUnbilled(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] amountUnbilled) {
        this.amountUnbilled = amountUnbilled;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAmountUnbilled(int i) {
        return this.amountUnbilled[i];
    }

    public void setAmountUnbilled(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.amountUnbilled[i] = _value;
    }


    /**
     * Gets the appliedToForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @return appliedToForeignAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAppliedToForeignAmount() {
        return appliedToForeignAmount;
    }


    /**
     * Sets the appliedToForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @param appliedToForeignAmount
     */
    public void setAppliedToForeignAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] appliedToForeignAmount) {
        this.appliedToForeignAmount = appliedToForeignAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAppliedToForeignAmount(int i) {
        return this.appliedToForeignAmount[i];
    }

    public void setAppliedToForeignAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.appliedToForeignAmount[i] = _value;
    }


    /**
     * Gets the appliedToIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @return appliedToIsFxVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAppliedToIsFxVariance() {
        return appliedToIsFxVariance;
    }


    /**
     * Sets the appliedToIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @param appliedToIsFxVariance
     */
    public void setAppliedToIsFxVariance(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] appliedToIsFxVariance) {
        this.appliedToIsFxVariance = appliedToIsFxVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAppliedToIsFxVariance(int i) {
        return this.appliedToIsFxVariance[i];
    }

    public void setAppliedToIsFxVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.appliedToIsFxVariance[i] = _value;
    }


    /**
     * Gets the appliedToLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @return appliedToLinkAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAppliedToLinkAmount() {
        return appliedToLinkAmount;
    }


    /**
     * Sets the appliedToLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @param appliedToLinkAmount
     */
    public void setAppliedToLinkAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] appliedToLinkAmount) {
        this.appliedToLinkAmount = appliedToLinkAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAppliedToLinkAmount(int i) {
        return this.appliedToLinkAmount[i];
    }

    public void setAppliedToLinkAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.appliedToLinkAmount[i] = _value;
    }


    /**
     * Gets the appliedToLinkType value for this TransactionSearchRowBasic.
     * 
     * @return appliedToLinkType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAppliedToLinkType() {
        return appliedToLinkType;
    }


    /**
     * Sets the appliedToLinkType value for this TransactionSearchRowBasic.
     * 
     * @param appliedToLinkType
     */
    public void setAppliedToLinkType(org.mule.module.netsuite.api.internal.SearchColumnStringField[] appliedToLinkType) {
        this.appliedToLinkType = appliedToLinkType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAppliedToLinkType(int i) {
        return this.appliedToLinkType[i];
    }

    public void setAppliedToLinkType(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.appliedToLinkType[i] = _value;
    }


    /**
     * Gets the appliedToTransaction value for this TransactionSearchRowBasic.
     * 
     * @return appliedToTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAppliedToTransaction() {
        return appliedToTransaction;
    }


    /**
     * Sets the appliedToTransaction value for this TransactionSearchRowBasic.
     * 
     * @param appliedToTransaction
     */
    public void setAppliedToTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] appliedToTransaction) {
        this.appliedToTransaction = appliedToTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAppliedToTransaction(int i) {
        return this.appliedToTransaction[i];
    }

    public void setAppliedToTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.appliedToTransaction[i] = _value;
    }


    /**
     * Gets the applyingForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @return applyingForeignAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getApplyingForeignAmount() {
        return applyingForeignAmount;
    }


    /**
     * Sets the applyingForeignAmount value for this TransactionSearchRowBasic.
     * 
     * @param applyingForeignAmount
     */
    public void setApplyingForeignAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] applyingForeignAmount) {
        this.applyingForeignAmount = applyingForeignAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getApplyingForeignAmount(int i) {
        return this.applyingForeignAmount[i];
    }

    public void setApplyingForeignAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.applyingForeignAmount[i] = _value;
    }


    /**
     * Gets the applyingIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @return applyingIsFxVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getApplyingIsFxVariance() {
        return applyingIsFxVariance;
    }


    /**
     * Sets the applyingIsFxVariance value for this TransactionSearchRowBasic.
     * 
     * @param applyingIsFxVariance
     */
    public void setApplyingIsFxVariance(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] applyingIsFxVariance) {
        this.applyingIsFxVariance = applyingIsFxVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getApplyingIsFxVariance(int i) {
        return this.applyingIsFxVariance[i];
    }

    public void setApplyingIsFxVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.applyingIsFxVariance[i] = _value;
    }


    /**
     * Gets the applyingLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @return applyingLinkAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getApplyingLinkAmount() {
        return applyingLinkAmount;
    }


    /**
     * Sets the applyingLinkAmount value for this TransactionSearchRowBasic.
     * 
     * @param applyingLinkAmount
     */
    public void setApplyingLinkAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] applyingLinkAmount) {
        this.applyingLinkAmount = applyingLinkAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getApplyingLinkAmount(int i) {
        return this.applyingLinkAmount[i];
    }

    public void setApplyingLinkAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.applyingLinkAmount[i] = _value;
    }


    /**
     * Gets the applyingLinkType value for this TransactionSearchRowBasic.
     * 
     * @return applyingLinkType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getApplyingLinkType() {
        return applyingLinkType;
    }


    /**
     * Sets the applyingLinkType value for this TransactionSearchRowBasic.
     * 
     * @param applyingLinkType
     */
    public void setApplyingLinkType(org.mule.module.netsuite.api.internal.SearchColumnStringField[] applyingLinkType) {
        this.applyingLinkType = applyingLinkType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getApplyingLinkType(int i) {
        return this.applyingLinkType[i];
    }

    public void setApplyingLinkType(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.applyingLinkType[i] = _value;
    }


    /**
     * Gets the applyingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return applyingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getApplyingTransaction() {
        return applyingTransaction;
    }


    /**
     * Sets the applyingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param applyingTransaction
     */
    public void setApplyingTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getApplyingTransaction(int i) {
        return this.applyingTransaction[i];
    }

    public void setApplyingTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.applyingTransaction[i] = _value;
    }


    /**
     * Gets the authCode value for this TransactionSearchRowBasic.
     * 
     * @return authCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAuthCode() {
        return authCode;
    }


    /**
     * Sets the authCode value for this TransactionSearchRowBasic.
     * 
     * @param authCode
     */
    public void setAuthCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] authCode) {
        this.authCode = authCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAuthCode(int i) {
        return this.authCode[i];
    }

    public void setAuthCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.authCode[i] = _value;
    }


    /**
     * Gets the avsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @return avsStreetMatch
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getAvsStreetMatch() {
        return avsStreetMatch;
    }


    /**
     * Sets the avsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @param avsStreetMatch
     */
    public void setAvsStreetMatch(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] avsStreetMatch) {
        this.avsStreetMatch = avsStreetMatch;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getAvsStreetMatch(int i) {
        return this.avsStreetMatch[i];
    }

    public void setAvsStreetMatch(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.avsStreetMatch[i] = _value;
    }


    /**
     * Gets the avsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @return avsZipMatch
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getAvsZipMatch() {
        return avsZipMatch;
    }


    /**
     * Sets the avsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @param avsZipMatch
     */
    public void setAvsZipMatch(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] avsZipMatch) {
        this.avsZipMatch = avsZipMatch;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getAvsZipMatch(int i) {
        return this.avsZipMatch[i];
    }

    public void setAvsZipMatch(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.avsZipMatch[i] = _value;
    }


    /**
     * Gets the billable value for this TransactionSearchRowBasic.
     * 
     * @return billable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TransactionSearchRowBasic.
     * 
     * @param billable
     */
    public void setBillable(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] billable) {
        this.billable = billable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getBillable(int i) {
        return this.billable[i];
    }

    public void setBillable(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.billable[i] = _value;
    }


    /**
     * Gets the billAddress value for this TransactionSearchRowBasic.
     * 
     * @return billAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this TransactionSearchRowBasic.
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
     * Gets the billAddress1 value for this TransactionSearchRowBasic.
     * 
     * @return billAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress1() {
        return billAddress1;
    }


    /**
     * Sets the billAddress1 value for this TransactionSearchRowBasic.
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
     * Gets the billAddress2 value for this TransactionSearchRowBasic.
     * 
     * @return billAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddress2() {
        return billAddress2;
    }


    /**
     * Sets the billAddress2 value for this TransactionSearchRowBasic.
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
     * Gets the billAddressee value for this TransactionSearchRowBasic.
     * 
     * @return billAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this TransactionSearchRowBasic.
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
     * Gets the billAttention value for this TransactionSearchRowBasic.
     * 
     * @return billAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this TransactionSearchRowBasic.
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
     * Gets the billCity value for this TransactionSearchRowBasic.
     * 
     * @return billCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this TransactionSearchRowBasic.
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
     * Gets the billCountry value for this TransactionSearchRowBasic.
     * 
     * @return billCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this TransactionSearchRowBasic.
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
     * Gets the billCountryCode value for this TransactionSearchRowBasic.
     * 
     * @return billCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillCountryCode() {
        return billCountryCode;
    }


    /**
     * Sets the billCountryCode value for this TransactionSearchRowBasic.
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
     * Gets the billedDate value for this TransactionSearchRowBasic.
     * 
     * @return billedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getBilledDate() {
        return billedDate;
    }


    /**
     * Sets the billedDate value for this TransactionSearchRowBasic.
     * 
     * @param billedDate
     */
    public void setBilledDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] billedDate) {
        this.billedDate = billedDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getBilledDate(int i) {
        return this.billedDate[i];
    }

    public void setBilledDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.billedDate[i] = _value;
    }


    /**
     * Gets the billingAmount value for this TransactionSearchRowBasic.
     * 
     * @return billingAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBillingAmount() {
        return billingAmount;
    }


    /**
     * Sets the billingAmount value for this TransactionSearchRowBasic.
     * 
     * @param billingAmount
     */
    public void setBillingAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] billingAmount) {
        this.billingAmount = billingAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBillingAmount(int i) {
        return this.billingAmount[i];
    }

    public void setBillingAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.billingAmount[i] = _value;
    }


    /**
     * Gets the billingSchedule value for this TransactionSearchRowBasic.
     * 
     * @return billingSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this TransactionSearchRowBasic.
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
     * Gets the billingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return billingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBillingTransaction() {
        return billingTransaction;
    }


    /**
     * Sets the billingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param billingTransaction
     */
    public void setBillingTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billingTransaction) {
        this.billingTransaction = billingTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBillingTransaction(int i) {
        return this.billingTransaction[i];
    }

    public void setBillingTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.billingTransaction[i] = _value;
    }


    /**
     * Gets the billPhone value for this TransactionSearchRowBasic.
     * 
     * @return billPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this TransactionSearchRowBasic.
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
     * Gets the billState value for this TransactionSearchRowBasic.
     * 
     * @return billState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this TransactionSearchRowBasic.
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
     * Gets the billVarianceStatus value for this TransactionSearchRowBasic.
     * 
     * @return billVarianceStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getBillVarianceStatus() {
        return billVarianceStatus;
    }


    /**
     * Sets the billVarianceStatus value for this TransactionSearchRowBasic.
     * 
     * @param billVarianceStatus
     */
    public void setBillVarianceStatus(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getBillVarianceStatus(int i) {
        return this.billVarianceStatus[i];
    }

    public void setBillVarianceStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.billVarianceStatus[i] = _value;
    }


    /**
     * Gets the billZip value for this TransactionSearchRowBasic.
     * 
     * @return billZip
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBillZip() {
        return billZip;
    }


    /**
     * Sets the billZip value for this TransactionSearchRowBasic.
     * 
     * @param billZip
     */
    public void setBillZip(org.mule.module.netsuite.api.internal.SearchColumnStringField[] billZip) {
        this.billZip = billZip;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBillZip(int i) {
        return this.billZip[i];
    }

    public void setBillZip(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.billZip[i] = _value;
    }


    /**
     * Gets the binNumber value for this TransactionSearchRowBasic.
     * 
     * @return binNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this TransactionSearchRowBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber) {
        this.binNumber = binNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.binNumber[i] = _value;
    }


    /**
     * Gets the binNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @return binNumberQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBinNumberQuantity() {
        return binNumberQuantity;
    }


    /**
     * Sets the binNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @param binNumberQuantity
     */
    public void setBinNumberQuantity(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binNumberQuantity) {
        this.binNumberQuantity = binNumberQuantity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBinNumberQuantity(int i) {
        return this.binNumberQuantity[i];
    }

    public void setBinNumberQuantity(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.binNumberQuantity[i] = _value;
    }


    /**
     * Gets the buildEntireAssembly value for this TransactionSearchRowBasic.
     * 
     * @return buildEntireAssembly
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this TransactionSearchRowBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getBuildEntireAssembly(int i) {
        return this.buildEntireAssembly[i];
    }

    public void setBuildEntireAssembly(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.buildEntireAssembly[i] = _value;
    }


    /**
     * Gets the buildVariance value for this TransactionSearchRowBasic.
     * 
     * @return buildVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBuildVariance() {
        return buildVariance;
    }


    /**
     * Sets the buildVariance value for this TransactionSearchRowBasic.
     * 
     * @param buildVariance
     */
    public void setBuildVariance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] buildVariance) {
        this.buildVariance = buildVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBuildVariance(int i) {
        return this.buildVariance[i];
    }

    public void setBuildVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.buildVariance[i] = _value;
    }


    /**
     * Gets the built value for this TransactionSearchRowBasic.
     * 
     * @return built
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBuilt() {
        return built;
    }


    /**
     * Sets the built value for this TransactionSearchRowBasic.
     * 
     * @param built
     */
    public void setBuilt(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] built) {
        this.built = built;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBuilt(int i) {
        return this.built[i];
    }

    public void setBuilt(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.built[i] = _value;
    }


    /**
     * Gets the ccCustomerCode value for this TransactionSearchRowBasic.
     * 
     * @return ccCustomerCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcCustomerCode() {
        return ccCustomerCode;
    }


    /**
     * Sets the ccCustomerCode value for this TransactionSearchRowBasic.
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
     * Gets the ccExpDate value for this TransactionSearchRowBasic.
     * 
     * @return ccExpDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCcExpDate() {
        return ccExpDate;
    }


    /**
     * Sets the ccExpDate value for this TransactionSearchRowBasic.
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
     * Gets the ccHolderName value for this TransactionSearchRowBasic.
     * 
     * @return ccHolderName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcHolderName() {
        return ccHolderName;
    }


    /**
     * Sets the ccHolderName value for this TransactionSearchRowBasic.
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
     * Gets the ccNumber value for this TransactionSearchRowBasic.
     * 
     * @return ccNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this TransactionSearchRowBasic.
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
     * Gets the ccStreet value for this TransactionSearchRowBasic.
     * 
     * @return ccStreet
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this TransactionSearchRowBasic.
     * 
     * @param ccStreet
     */
    public void setCcStreet(org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccStreet) {
        this.ccStreet = ccStreet;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCcStreet(int i) {
        return this.ccStreet[i];
    }

    public void setCcStreet(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.ccStreet[i] = _value;
    }


    /**
     * Gets the ccZipCode value for this TransactionSearchRowBasic.
     * 
     * @return ccZipCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this TransactionSearchRowBasic.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] ccZipCode) {
        this.ccZipCode = ccZipCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCcZipCode(int i) {
        return this.ccZipCode[i];
    }

    public void setCcZipCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.ccZipCode[i] = _value;
    }


    /**
     * Gets the _class value for this TransactionSearchRowBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TransactionSearchRowBasic.
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
     * Gets the cleared value for this TransactionSearchRowBasic.
     * 
     * @return cleared
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getCleared() {
        return cleared;
    }


    /**
     * Sets the cleared value for this TransactionSearchRowBasic.
     * 
     * @param cleared
     */
    public void setCleared(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] cleared) {
        this.cleared = cleared;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getCleared(int i) {
        return this.cleared[i];
    }

    public void setCleared(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.cleared[i] = _value;
    }


    /**
     * Gets the closed value for this TransactionSearchRowBasic.
     * 
     * @return closed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getClosed() {
        return closed;
    }


    /**
     * Sets the closed value for this TransactionSearchRowBasic.
     * 
     * @param closed
     */
    public void setClosed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] closed) {
        this.closed = closed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getClosed(int i) {
        return this.closed[i];
    }

    public void setClosed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.closed[i] = _value;
    }


    /**
     * Gets the closeDate value for this TransactionSearchRowBasic.
     * 
     * @return closeDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCloseDate() {
        return closeDate;
    }


    /**
     * Sets the closeDate value for this TransactionSearchRowBasic.
     * 
     * @param closeDate
     */
    public void setCloseDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] closeDate) {
        this.closeDate = closeDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCloseDate(int i) {
        return this.closeDate[i];
    }

    public void setCloseDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.closeDate[i] = _value;
    }


    /**
     * Gets the cogsAmount value for this TransactionSearchRowBasic.
     * 
     * @return cogsAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCogsAmount() {
        return cogsAmount;
    }


    /**
     * Sets the cogsAmount value for this TransactionSearchRowBasic.
     * 
     * @param cogsAmount
     */
    public void setCogsAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cogsAmount) {
        this.cogsAmount = cogsAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCogsAmount(int i) {
        return this.cogsAmount[i];
    }

    public void setCogsAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.cogsAmount[i] = _value;
    }


    /**
     * Gets the commissionEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @return commissionEffectiveDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCommissionEffectiveDate() {
        return commissionEffectiveDate;
    }


    /**
     * Sets the commissionEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @param commissionEffectiveDate
     */
    public void setCommissionEffectiveDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] commissionEffectiveDate) {
        this.commissionEffectiveDate = commissionEffectiveDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCommissionEffectiveDate(int i) {
        return this.commissionEffectiveDate[i];
    }

    public void setCommissionEffectiveDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.commissionEffectiveDate[i] = _value;
    }


    /**
     * Gets the commit value for this TransactionSearchRowBasic.
     * 
     * @return commit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCommit() {
        return commit;
    }


    /**
     * Sets the commit value for this TransactionSearchRowBasic.
     * 
     * @param commit
     */
    public void setCommit(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] commit) {
        this.commit = commit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCommit(int i) {
        return this.commit[i];
    }

    public void setCommit(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.commit[i] = _value;
    }


    /**
     * Gets the confirmationNumber value for this TransactionSearchRowBasic.
     * 
     * @return confirmationNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getConfirmationNumber() {
        return confirmationNumber;
    }


    /**
     * Sets the confirmationNumber value for this TransactionSearchRowBasic.
     * 
     * @param confirmationNumber
     */
    public void setConfirmationNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getConfirmationNumber(int i) {
        return this.confirmationNumber[i];
    }

    public void setConfirmationNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.confirmationNumber[i] = _value;
    }


    /**
     * Gets the contribution value for this TransactionSearchRowBasic.
     * 
     * @return contribution
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getContribution() {
        return contribution;
    }


    /**
     * Sets the contribution value for this TransactionSearchRowBasic.
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
     * Gets the contributionPrimary value for this TransactionSearchRowBasic.
     * 
     * @return contributionPrimary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getContributionPrimary() {
        return contributionPrimary;
    }


    /**
     * Sets the contributionPrimary value for this TransactionSearchRowBasic.
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
     * Gets the costEstimate value for this TransactionSearchRowBasic.
     * 
     * @return costEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this TransactionSearchRowBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costEstimate) {
        this.costEstimate = costEstimate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostEstimate(int i) {
        return this.costEstimate[i];
    }

    public void setCostEstimate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costEstimate[i] = _value;
    }


    /**
     * Gets the costEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @return costEstimateRate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostEstimateRate() {
        return costEstimateRate;
    }


    /**
     * Sets the costEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @param costEstimateRate
     */
    public void setCostEstimateRate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costEstimateRate) {
        this.costEstimateRate = costEstimateRate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostEstimateRate(int i) {
        return this.costEstimateRate[i];
    }

    public void setCostEstimateRate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costEstimateRate[i] = _value;
    }


    /**
     * Gets the costEstimateType value for this TransactionSearchRowBasic.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this TransactionSearchRowBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCostEstimateType(int i) {
        return this.costEstimateType[i];
    }

    public void setCostEstimateType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.costEstimateType[i] = _value;
    }


    /**
     * Gets the createdBy value for this TransactionSearchRowBasic.
     * 
     * @return createdBy
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this TransactionSearchRowBasic.
     * 
     * @param createdBy
     */
    public void setCreatedBy(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] createdBy) {
        this.createdBy = createdBy;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCreatedBy(int i) {
        return this.createdBy[i];
    }

    public void setCreatedBy(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.createdBy[i] = _value;
    }


    /**
     * Gets the createdFrom value for this TransactionSearchRowBasic.
     * 
     * @return createdFrom
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this TransactionSearchRowBasic.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] createdFrom) {
        this.createdFrom = createdFrom;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCreatedFrom(int i) {
        return this.createdFrom[i];
    }

    public void setCreatedFrom(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.createdFrom[i] = _value;
    }


    /**
     * Gets the creditAmount value for this TransactionSearchRowBasic.
     * 
     * @return creditAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this TransactionSearchRowBasic.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] creditAmount) {
        this.creditAmount = creditAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCreditAmount(int i) {
        return this.creditAmount[i];
    }

    public void setCreditAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.creditAmount[i] = _value;
    }


    /**
     * Gets the cscMatch value for this TransactionSearchRowBasic.
     * 
     * @return cscMatch
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCscMatch() {
        return cscMatch;
    }


    /**
     * Sets the cscMatch value for this TransactionSearchRowBasic.
     * 
     * @param cscMatch
     */
    public void setCscMatch(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] cscMatch) {
        this.cscMatch = cscMatch;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCscMatch(int i) {
        return this.cscMatch[i];
    }

    public void setCscMatch(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.cscMatch[i] = _value;
    }


    /**
     * Gets the currency value for this TransactionSearchRowBasic.
     * 
     * @return currency
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this TransactionSearchRowBasic.
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
     * Gets the customForm value for this TransactionSearchRowBasic.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this TransactionSearchRowBasic.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customForm) {
        this.customForm = customForm;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCustomForm(int i) {
        return this.customForm[i];
    }

    public void setCustomForm(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.customForm[i] = _value;
    }


    /**
     * Gets the custType value for this TransactionSearchRowBasic.
     * 
     * @return custType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCustType() {
        return custType;
    }


    /**
     * Sets the custType value for this TransactionSearchRowBasic.
     * 
     * @param custType
     */
    public void setCustType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] custType) {
        this.custType = custType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCustType(int i) {
        return this.custType[i];
    }

    public void setCustType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.custType[i] = _value;
    }


    /**
     * Gets the dateCreated value for this TransactionSearchRowBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TransactionSearchRowBasic.
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
     * Gets the daysOpen value for this TransactionSearchRowBasic.
     * 
     * @return daysOpen
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDaysOpen() {
        return daysOpen;
    }


    /**
     * Sets the daysOpen value for this TransactionSearchRowBasic.
     * 
     * @param daysOpen
     */
    public void setDaysOpen(org.mule.module.netsuite.api.internal.SearchColumnLongField[] daysOpen) {
        this.daysOpen = daysOpen;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getDaysOpen(int i) {
        return this.daysOpen[i];
    }

    public void setDaysOpen(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.daysOpen[i] = _value;
    }


    /**
     * Gets the daysOverdue value for this TransactionSearchRowBasic.
     * 
     * @return daysOverdue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getDaysOverdue() {
        return daysOverdue;
    }


    /**
     * Sets the daysOverdue value for this TransactionSearchRowBasic.
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
     * Gets the debitAmount value for this TransactionSearchRowBasic.
     * 
     * @return debitAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDebitAmount() {
        return debitAmount;
    }


    /**
     * Sets the debitAmount value for this TransactionSearchRowBasic.
     * 
     * @param debitAmount
     */
    public void setDebitAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] debitAmount) {
        this.debitAmount = debitAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDebitAmount(int i) {
        return this.debitAmount[i];
    }

    public void setDebitAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.debitAmount[i] = _value;
    }


    /**
     * Gets the deferredRevenue value for this TransactionSearchRowBasic.
     * 
     * @return deferredRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this TransactionSearchRowBasic.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDeferredRevenue(int i) {
        return this.deferredRevenue[i];
    }

    public void setDeferredRevenue(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.deferredRevenue[i] = _value;
    }


    /**
     * Gets the deferRevRec value for this TransactionSearchRowBasic.
     * 
     * @return deferRevRec
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this TransactionSearchRowBasic.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getDeferRevRec(int i) {
        return this.deferRevRec[i];
    }

    public void setDeferRevRec(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.deferRevRec[i] = _value;
    }


    /**
     * Gets the department value for this TransactionSearchRowBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TransactionSearchRowBasic.
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
     * Gets the depositDate value for this TransactionSearchRowBasic.
     * 
     * @return depositDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDepositDate() {
        return depositDate;
    }


    /**
     * Sets the depositDate value for this TransactionSearchRowBasic.
     * 
     * @param depositDate
     */
    public void setDepositDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] depositDate) {
        this.depositDate = depositDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDepositDate(int i) {
        return this.depositDate[i];
    }

    public void setDepositDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.depositDate[i] = _value;
    }


    /**
     * Gets the depositTransaction value for this TransactionSearchRowBasic.
     * 
     * @return depositTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepositTransaction() {
        return depositTransaction;
    }


    /**
     * Sets the depositTransaction value for this TransactionSearchRowBasic.
     * 
     * @param depositTransaction
     */
    public void setDepositTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] depositTransaction) {
        this.depositTransaction = depositTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDepositTransaction(int i) {
        return this.depositTransaction[i];
    }

    public void setDepositTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.depositTransaction[i] = _value;
    }


    /**
     * Gets the discountAmount value for this TransactionSearchRowBasic.
     * 
     * @return discountAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDiscountAmount() {
        return discountAmount;
    }


    /**
     * Sets the discountAmount value for this TransactionSearchRowBasic.
     * 
     * @param discountAmount
     */
    public void setDiscountAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] discountAmount) {
        this.discountAmount = discountAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDiscountAmount(int i) {
        return this.discountAmount[i];
    }

    public void setDiscountAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.discountAmount[i] = _value;
    }


    /**
     * Gets the dueDate value for this TransactionSearchRowBasic.
     * 
     * @return dueDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this TransactionSearchRowBasic.
     * 
     * @param dueDate
     */
    public void setDueDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] dueDate) {
        this.dueDate = dueDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDueDate(int i) {
        return this.dueDate[i];
    }

    public void setDueDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.dueDate[i] = _value;
    }


    /**
     * Gets the effectiveRate value for this TransactionSearchRowBasic.
     * 
     * @return effectiveRate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEffectiveRate() {
        return effectiveRate;
    }


    /**
     * Sets the effectiveRate value for this TransactionSearchRowBasic.
     * 
     * @param effectiveRate
     */
    public void setEffectiveRate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] effectiveRate) {
        this.effectiveRate = effectiveRate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEffectiveRate(int i) {
        return this.effectiveRate[i];
    }

    public void setEffectiveRate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.effectiveRate[i] = _value;
    }


    /**
     * Gets the email value for this TransactionSearchRowBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this TransactionSearchRowBasic.
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
     * Gets the endDate value for this TransactionSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this TransactionSearchRowBasic.
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
     * Gets the entity value for this TransactionSearchRowBasic.
     * 
     * @return entity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this TransactionSearchRowBasic.
     * 
     * @param entity
     */
    public void setEntity(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }


    /**
     * Gets the entityStatus value for this TransactionSearchRowBasic.
     * 
     * @return entityStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEntityStatus() {
        return entityStatus;
    }


    /**
     * Sets the entityStatus value for this TransactionSearchRowBasic.
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
     * Gets the estGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return estGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstGrossProfit(int i) {
        return this.estGrossProfit[i];
    }

    public void setEstGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estGrossProfit[i] = _value;
    }


    /**
     * Gets the estGrossProfitPct value for this TransactionSearchRowBasic.
     * 
     * @return estGrossProfitPct
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstGrossProfitPct() {
        return estGrossProfitPct;
    }


    /**
     * Sets the estGrossProfitPct value for this TransactionSearchRowBasic.
     * 
     * @param estGrossProfitPct
     */
    public void setEstGrossProfitPct(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estGrossProfitPct) {
        this.estGrossProfitPct = estGrossProfitPct;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstGrossProfitPct(int i) {
        return this.estGrossProfitPct[i];
    }

    public void setEstGrossProfitPct(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estGrossProfitPct[i] = _value;
    }


    /**
     * Gets the estGrossProfitPercent value for this TransactionSearchRowBasic.
     * 
     * @return estGrossProfitPercent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this TransactionSearchRowBasic.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstGrossProfitPercent(int i) {
        return this.estGrossProfitPercent[i];
    }

    public void setEstGrossProfitPercent(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estGrossProfitPercent[i] = _value;
    }


    /**
     * Gets the exchangeRate value for this TransactionSearchRowBasic.
     * 
     * @return exchangeRate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this TransactionSearchRowBasic.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getExchangeRate(int i) {
        return this.exchangeRate[i];
    }

    public void setExchangeRate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.exchangeRate[i] = _value;
    }


    /**
     * Gets the excludeCommission value for this TransactionSearchRowBasic.
     * 
     * @return excludeCommission
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this TransactionSearchRowBasic.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] excludeCommission) {
        this.excludeCommission = excludeCommission;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getExcludeCommission(int i) {
        return this.excludeCommission[i];
    }

    public void setExcludeCommission(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.excludeCommission[i] = _value;
    }


    /**
     * Gets the expectedCloseDate value for this TransactionSearchRowBasic.
     * 
     * @return expectedCloseDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getExpectedCloseDate() {
        return expectedCloseDate;
    }


    /**
     * Sets the expectedCloseDate value for this TransactionSearchRowBasic.
     * 
     * @param expectedCloseDate
     */
    public void setExpectedCloseDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getExpectedCloseDate(int i) {
        return this.expectedCloseDate[i];
    }

    public void setExpectedCloseDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.expectedCloseDate[i] = _value;
    }


    /**
     * Gets the expenseCategory value for this TransactionSearchRowBasic.
     * 
     * @return expenseCategory
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExpenseCategory() {
        return expenseCategory;
    }


    /**
     * Sets the expenseCategory value for this TransactionSearchRowBasic.
     * 
     * @param expenseCategory
     */
    public void setExpenseCategory(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getExpenseCategory(int i) {
        return this.expenseCategory[i];
    }

    public void setExpenseCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.expenseCategory[i] = _value;
    }


    /**
     * Gets the expenseDate value for this TransactionSearchRowBasic.
     * 
     * @return expenseDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getExpenseDate() {
        return expenseDate;
    }


    /**
     * Sets the expenseDate value for this TransactionSearchRowBasic.
     * 
     * @param expenseDate
     */
    public void setExpenseDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] expenseDate) {
        this.expenseDate = expenseDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getExpenseDate(int i) {
        return this.expenseDate[i];
    }

    public void setExpenseDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.expenseDate[i] = _value;
    }


    /**
     * Gets the externalId value for this TransactionSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TransactionSearchRowBasic.
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
     * Gets the forecastType value for this TransactionSearchRowBasic.
     * 
     * @return forecastType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getForecastType() {
        return forecastType;
    }


    /**
     * Sets the forecastType value for this TransactionSearchRowBasic.
     * 
     * @param forecastType
     */
    public void setForecastType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] forecastType) {
        this.forecastType = forecastType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getForecastType(int i) {
        return this.forecastType[i];
    }

    public void setForecastType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.forecastType[i] = _value;
    }


    /**
     * Gets the fulfillingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return fulfillingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getFulfillingTransaction() {
        return fulfillingTransaction;
    }


    /**
     * Sets the fulfillingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param fulfillingTransaction
     */
    public void setFulfillingTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] fulfillingTransaction) {
        this.fulfillingTransaction = fulfillingTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getFulfillingTransaction(int i) {
        return this.fulfillingTransaction[i];
    }

    public void setFulfillingTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.fulfillingTransaction[i] = _value;
    }


    /**
     * Gets the fxAmount value for this TransactionSearchRowBasic.
     * 
     * @return fxAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxAmount() {
        return fxAmount;
    }


    /**
     * Sets the fxAmount value for this TransactionSearchRowBasic.
     * 
     * @param fxAmount
     */
    public void setFxAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxAmount) {
        this.fxAmount = fxAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxAmount(int i) {
        return this.fxAmount[i];
    }

    public void setFxAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxAmount[i] = _value;
    }


    /**
     * Gets the fxCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @return fxCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxCostEstimate() {
        return fxCostEstimate;
    }


    /**
     * Sets the fxCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @param fxCostEstimate
     */
    public void setFxCostEstimate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxCostEstimate) {
        this.fxCostEstimate = fxCostEstimate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxCostEstimate(int i) {
        return this.fxCostEstimate[i];
    }

    public void setFxCostEstimate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxCostEstimate[i] = _value;
    }


    /**
     * Gets the fxCostEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @return fxCostEstimateRate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxCostEstimateRate() {
        return fxCostEstimateRate;
    }


    /**
     * Sets the fxCostEstimateRate value for this TransactionSearchRowBasic.
     * 
     * @param fxCostEstimateRate
     */
    public void setFxCostEstimateRate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxCostEstimateRate) {
        this.fxCostEstimateRate = fxCostEstimateRate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxCostEstimateRate(int i) {
        return this.fxCostEstimateRate[i];
    }

    public void setFxCostEstimateRate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxCostEstimateRate[i] = _value;
    }


    /**
     * Gets the fxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return fxEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxEstGrossProfit() {
        return fxEstGrossProfit;
    }


    /**
     * Sets the fxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param fxEstGrossProfit
     */
    public void setFxEstGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxEstGrossProfit) {
        this.fxEstGrossProfit = fxEstGrossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxEstGrossProfit(int i) {
        return this.fxEstGrossProfit[i];
    }

    public void setFxEstGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxEstGrossProfit[i] = _value;
    }


    /**
     * Gets the fxTranCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @return fxTranCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxTranCostEstimate() {
        return fxTranCostEstimate;
    }


    /**
     * Sets the fxTranCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @param fxTranCostEstimate
     */
    public void setFxTranCostEstimate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxTranCostEstimate(int i) {
        return this.fxTranCostEstimate[i];
    }

    public void setFxTranCostEstimate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxTranCostEstimate[i] = _value;
    }


    /**
     * Gets the fxVsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @return fxVsoeAllocation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxVsoeAllocation() {
        return fxVsoeAllocation;
    }


    /**
     * Sets the fxVsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @param fxVsoeAllocation
     */
    public void setFxVsoeAllocation(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxVsoeAllocation) {
        this.fxVsoeAllocation = fxVsoeAllocation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxVsoeAllocation(int i) {
        return this.fxVsoeAllocation[i];
    }

    public void setFxVsoeAllocation(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxVsoeAllocation[i] = _value;
    }


    /**
     * Gets the fxVsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @return fxVsoeAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxVsoeAmount() {
        return fxVsoeAmount;
    }


    /**
     * Sets the fxVsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @param fxVsoeAmount
     */
    public void setFxVsoeAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxVsoeAmount) {
        this.fxVsoeAmount = fxVsoeAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxVsoeAmount(int i) {
        return this.fxVsoeAmount[i];
    }

    public void setFxVsoeAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxVsoeAmount[i] = _value;
    }


    /**
     * Gets the fxVsoePrice value for this TransactionSearchRowBasic.
     * 
     * @return fxVsoePrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxVsoePrice() {
        return fxVsoePrice;
    }


    /**
     * Sets the fxVsoePrice value for this TransactionSearchRowBasic.
     * 
     * @param fxVsoePrice
     */
    public void setFxVsoePrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxVsoePrice) {
        this.fxVsoePrice = fxVsoePrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxVsoePrice(int i) {
        return this.fxVsoePrice[i];
    }

    public void setFxVsoePrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxVsoePrice[i] = _value;
    }


    /**
     * Gets the gcoAvailabelToCharge value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvailabelToCharge
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getGcoAvailabelToCharge() {
        return gcoAvailabelToCharge;
    }


    /**
     * Sets the gcoAvailabelToCharge value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvailabelToCharge
     */
    public void setGcoAvailabelToCharge(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] gcoAvailabelToCharge) {
        this.gcoAvailabelToCharge = gcoAvailabelToCharge;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getGcoAvailabelToCharge(int i) {
        return this.gcoAvailabelToCharge[i];
    }

    public void setGcoAvailabelToCharge(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.gcoAvailabelToCharge[i] = _value;
    }


    /**
     * Gets the gcoAvailableToRefund value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvailableToRefund
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getGcoAvailableToRefund() {
        return gcoAvailableToRefund;
    }


    /**
     * Sets the gcoAvailableToRefund value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvailableToRefund
     */
    public void setGcoAvailableToRefund(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] gcoAvailableToRefund) {
        this.gcoAvailableToRefund = gcoAvailableToRefund;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getGcoAvailableToRefund(int i) {
        return this.gcoAvailableToRefund[i];
    }

    public void setGcoAvailableToRefund(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.gcoAvailableToRefund[i] = _value;
    }


    /**
     * Gets the gcoAvsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvsStreetMatch
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGcoAvsStreetMatch() {
        return gcoAvsStreetMatch;
    }


    /**
     * Sets the gcoAvsStreetMatch value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvsStreetMatch
     */
    public void setGcoAvsStreetMatch(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gcoAvsStreetMatch) {
        this.gcoAvsStreetMatch = gcoAvsStreetMatch;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getGcoAvsStreetMatch(int i) {
        return this.gcoAvsStreetMatch[i];
    }

    public void setGcoAvsStreetMatch(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.gcoAvsStreetMatch[i] = _value;
    }


    /**
     * Gets the gcoAvsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @return gcoAvsZipMatch
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGcoAvsZipMatch() {
        return gcoAvsZipMatch;
    }


    /**
     * Sets the gcoAvsZipMatch value for this TransactionSearchRowBasic.
     * 
     * @param gcoAvsZipMatch
     */
    public void setGcoAvsZipMatch(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gcoAvsZipMatch) {
        this.gcoAvsZipMatch = gcoAvsZipMatch;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getGcoAvsZipMatch(int i) {
        return this.gcoAvsZipMatch[i];
    }

    public void setGcoAvsZipMatch(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.gcoAvsZipMatch[i] = _value;
    }


    /**
     * Gets the gcoBuyerAccountAge value for this TransactionSearchRowBasic.
     * 
     * @return gcoBuyerAccountAge
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getGcoBuyerAccountAge() {
        return gcoBuyerAccountAge;
    }


    /**
     * Sets the gcoBuyerAccountAge value for this TransactionSearchRowBasic.
     * 
     * @param gcoBuyerAccountAge
     */
    public void setGcoBuyerAccountAge(org.mule.module.netsuite.api.internal.SearchColumnLongField[] gcoBuyerAccountAge) {
        this.gcoBuyerAccountAge = gcoBuyerAccountAge;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getGcoBuyerAccountAge(int i) {
        return this.gcoBuyerAccountAge[i];
    }

    public void setGcoBuyerAccountAge(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.gcoBuyerAccountAge[i] = _value;
    }


    /**
     * Gets the gcoBuyerIp value for this TransactionSearchRowBasic.
     * 
     * @return gcoBuyerIp
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGcoBuyerIp() {
        return gcoBuyerIp;
    }


    /**
     * Sets the gcoBuyerIp value for this TransactionSearchRowBasic.
     * 
     * @param gcoBuyerIp
     */
    public void setGcoBuyerIp(org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoBuyerIp) {
        this.gcoBuyerIp = gcoBuyerIp;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGcoBuyerIp(int i) {
        return this.gcoBuyerIp[i];
    }

    public void setGcoBuyerIp(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.gcoBuyerIp[i] = _value;
    }


    /**
     * Gets the gcoChargeAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoChargeAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoChargeAmount() {
        return gcoChargeAmount;
    }


    /**
     * Sets the gcoChargeAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoChargeAmount
     */
    public void setGcoChargeAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoChargeAmount) {
        this.gcoChargeAmount = gcoChargeAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoChargeAmount(int i) {
        return this.gcoChargeAmount[i];
    }

    public void setGcoChargeAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoChargeAmount[i] = _value;
    }


    /**
     * Gets the gcoChargebackAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoChargebackAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoChargebackAmount() {
        return gcoChargebackAmount;
    }


    /**
     * Sets the gcoChargebackAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoChargebackAmount
     */
    public void setGcoChargebackAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoChargebackAmount) {
        this.gcoChargebackAmount = gcoChargebackAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoChargebackAmount(int i) {
        return this.gcoChargebackAmount[i];
    }

    public void setGcoChargebackAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoChargebackAmount[i] = _value;
    }


    /**
     * Gets the gcoConfirmedChargedTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoConfirmedChargedTotal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoConfirmedChargedTotal() {
        return gcoConfirmedChargedTotal;
    }


    /**
     * Sets the gcoConfirmedChargedTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoConfirmedChargedTotal
     */
    public void setGcoConfirmedChargedTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoConfirmedChargedTotal) {
        this.gcoConfirmedChargedTotal = gcoConfirmedChargedTotal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoConfirmedChargedTotal(int i) {
        return this.gcoConfirmedChargedTotal[i];
    }

    public void setGcoConfirmedChargedTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoConfirmedChargedTotal[i] = _value;
    }


    /**
     * Gets the gcoConfirmedRefundedTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoConfirmedRefundedTotal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoConfirmedRefundedTotal() {
        return gcoConfirmedRefundedTotal;
    }


    /**
     * Sets the gcoConfirmedRefundedTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoConfirmedRefundedTotal
     */
    public void setGcoConfirmedRefundedTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoConfirmedRefundedTotal) {
        this.gcoConfirmedRefundedTotal = gcoConfirmedRefundedTotal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoConfirmedRefundedTotal(int i) {
        return this.gcoConfirmedRefundedTotal[i];
    }

    public void setGcoConfirmedRefundedTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoConfirmedRefundedTotal[i] = _value;
    }


    /**
     * Gets the gcoCreditcardNumber value for this TransactionSearchRowBasic.
     * 
     * @return gcoCreditcardNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGcoCreditcardNumber() {
        return gcoCreditcardNumber;
    }


    /**
     * Sets the gcoCreditcardNumber value for this TransactionSearchRowBasic.
     * 
     * @param gcoCreditcardNumber
     */
    public void setGcoCreditcardNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoCreditcardNumber) {
        this.gcoCreditcardNumber = gcoCreditcardNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGcoCreditcardNumber(int i) {
        return this.gcoCreditcardNumber[i];
    }

    public void setGcoCreditcardNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.gcoCreditcardNumber[i] = _value;
    }


    /**
     * Gets the gcoCscMatch value for this TransactionSearchRowBasic.
     * 
     * @return gcoCscMatch
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getGcoCscMatch() {
        return gcoCscMatch;
    }


    /**
     * Sets the gcoCscMatch value for this TransactionSearchRowBasic.
     * 
     * @param gcoCscMatch
     */
    public void setGcoCscMatch(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] gcoCscMatch) {
        this.gcoCscMatch = gcoCscMatch;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getGcoCscMatch(int i) {
        return this.gcoCscMatch[i];
    }

    public void setGcoCscMatch(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.gcoCscMatch[i] = _value;
    }


    /**
     * Gets the gcoFinancialState value for this TransactionSearchRowBasic.
     * 
     * @return gcoFinancialState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGcoFinancialState() {
        return gcoFinancialState;
    }


    /**
     * Sets the gcoFinancialState value for this TransactionSearchRowBasic.
     * 
     * @param gcoFinancialState
     */
    public void setGcoFinancialState(org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoFinancialState) {
        this.gcoFinancialState = gcoFinancialState;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGcoFinancialState(int i) {
        return this.gcoFinancialState[i];
    }

    public void setGcoFinancialState(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.gcoFinancialState[i] = _value;
    }


    /**
     * Gets the gcoFulfillmentState value for this TransactionSearchRowBasic.
     * 
     * @return gcoFulfillmentState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGcoFulfillmentState() {
        return gcoFulfillmentState;
    }


    /**
     * Sets the gcoFulfillmentState value for this TransactionSearchRowBasic.
     * 
     * @param gcoFulfillmentState
     */
    public void setGcoFulfillmentState(org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoFulfillmentState) {
        this.gcoFulfillmentState = gcoFulfillmentState;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGcoFulfillmentState(int i) {
        return this.gcoFulfillmentState[i];
    }

    public void setGcoFulfillmentState(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.gcoFulfillmentState[i] = _value;
    }


    /**
     * Gets the gcoOrderId value for this TransactionSearchRowBasic.
     * 
     * @return gcoOrderId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGcoOrderId() {
        return gcoOrderId;
    }


    /**
     * Sets the gcoOrderId value for this TransactionSearchRowBasic.
     * 
     * @param gcoOrderId
     */
    public void setGcoOrderId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoOrderId) {
        this.gcoOrderId = gcoOrderId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGcoOrderId(int i) {
        return this.gcoOrderId[i];
    }

    public void setGcoOrderId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.gcoOrderId[i] = _value;
    }


    /**
     * Gets the gcoOrderTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoOrderTotal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoOrderTotal() {
        return gcoOrderTotal;
    }


    /**
     * Sets the gcoOrderTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoOrderTotal
     */
    public void setGcoOrderTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoOrderTotal) {
        this.gcoOrderTotal = gcoOrderTotal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoOrderTotal(int i) {
        return this.gcoOrderTotal[i];
    }

    public void setGcoOrderTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoOrderTotal[i] = _value;
    }


    /**
     * Gets the gcoPromotionAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoPromotionAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoPromotionAmount() {
        return gcoPromotionAmount;
    }


    /**
     * Sets the gcoPromotionAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoPromotionAmount
     */
    public void setGcoPromotionAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoPromotionAmount) {
        this.gcoPromotionAmount = gcoPromotionAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoPromotionAmount(int i) {
        return this.gcoPromotionAmount[i];
    }

    public void setGcoPromotionAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoPromotionAmount[i] = _value;
    }


    /**
     * Gets the gcoPromotionName value for this TransactionSearchRowBasic.
     * 
     * @return gcoPromotionName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGcoPromotionName() {
        return gcoPromotionName;
    }


    /**
     * Sets the gcoPromotionName value for this TransactionSearchRowBasic.
     * 
     * @param gcoPromotionName
     */
    public void setGcoPromotionName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoPromotionName) {
        this.gcoPromotionName = gcoPromotionName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGcoPromotionName(int i) {
        return this.gcoPromotionName[i];
    }

    public void setGcoPromotionName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.gcoPromotionName[i] = _value;
    }


    /**
     * Gets the gcoRefundAmount value for this TransactionSearchRowBasic.
     * 
     * @return gcoRefundAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoRefundAmount() {
        return gcoRefundAmount;
    }


    /**
     * Sets the gcoRefundAmount value for this TransactionSearchRowBasic.
     * 
     * @param gcoRefundAmount
     */
    public void setGcoRefundAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoRefundAmount) {
        this.gcoRefundAmount = gcoRefundAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoRefundAmount(int i) {
        return this.gcoRefundAmount[i];
    }

    public void setGcoRefundAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoRefundAmount[i] = _value;
    }


    /**
     * Gets the gcoShippingTotal value for this TransactionSearchRowBasic.
     * 
     * @return gcoShippingTotal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGcoShippingTotal() {
        return gcoShippingTotal;
    }


    /**
     * Sets the gcoShippingTotal value for this TransactionSearchRowBasic.
     * 
     * @param gcoShippingTotal
     */
    public void setGcoShippingTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] gcoShippingTotal) {
        this.gcoShippingTotal = gcoShippingTotal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGcoShippingTotal(int i) {
        return this.gcoShippingTotal[i];
    }

    public void setGcoShippingTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.gcoShippingTotal[i] = _value;
    }


    /**
     * Gets the gcoStateChangedDetail value for this TransactionSearchRowBasic.
     * 
     * @return gcoStateChangedDetail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGcoStateChangedDetail() {
        return gcoStateChangedDetail;
    }


    /**
     * Sets the gcoStateChangedDetail value for this TransactionSearchRowBasic.
     * 
     * @param gcoStateChangedDetail
     */
    public void setGcoStateChangedDetail(org.mule.module.netsuite.api.internal.SearchColumnStringField[] gcoStateChangedDetail) {
        this.gcoStateChangedDetail = gcoStateChangedDetail;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGcoStateChangedDetail(int i) {
        return this.gcoStateChangedDetail[i];
    }

    public void setGcoStateChangedDetail(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.gcoStateChangedDetail[i] = _value;
    }


    /**
     * Gets the giftCert value for this TransactionSearchRowBasic.
     * 
     * @return giftCert
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCert() {
        return giftCert;
    }


    /**
     * Sets the giftCert value for this TransactionSearchRowBasic.
     * 
     * @param giftCert
     */
    public void setGiftCert(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCert) {
        this.giftCert = giftCert;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCert(int i) {
        return this.giftCert[i];
    }

    public void setGiftCert(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCert[i] = _value;
    }


    /**
     * Gets the grossAmount value for this TransactionSearchRowBasic.
     * 
     * @return grossAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGrossAmount() {
        return grossAmount;
    }


    /**
     * Sets the grossAmount value for this TransactionSearchRowBasic.
     * 
     * @param grossAmount
     */
    public void setGrossAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossAmount) {
        this.grossAmount = grossAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGrossAmount(int i) {
        return this.grossAmount[i];
    }

    public void setGrossAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.grossAmount[i] = _value;
    }


    /**
     * Gets the includeInForecast value for this TransactionSearchRowBasic.
     * 
     * @return includeInForecast
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIncludeInForecast() {
        return includeInForecast;
    }


    /**
     * Sets the includeInForecast value for this TransactionSearchRowBasic.
     * 
     * @param includeInForecast
     */
    public void setIncludeInForecast(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] includeInForecast) {
        this.includeInForecast = includeInForecast;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIncludeInForecast(int i) {
        return this.includeInForecast[i];
    }

    public void setIncludeInForecast(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.includeInForecast[i] = _value;
    }


    /**
     * Gets the internalId value for this TransactionSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TransactionSearchRowBasic.
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
     * Gets the inVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @return inVsoeBundle
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getInVsoeBundle() {
        return inVsoeBundle;
    }


    /**
     * Sets the inVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @param inVsoeBundle
     */
    public void setInVsoeBundle(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] inVsoeBundle) {
        this.inVsoeBundle = inVsoeBundle;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getInVsoeBundle(int i) {
        return this.inVsoeBundle[i];
    }

    public void setInVsoeBundle(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.inVsoeBundle[i] = _value;
    }


    /**
     * Gets the isAllocation value for this TransactionSearchRowBasic.
     * 
     * @return isAllocation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsAllocation() {
        return isAllocation;
    }


    /**
     * Sets the isAllocation value for this TransactionSearchRowBasic.
     * 
     * @param isAllocation
     */
    public void setIsAllocation(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAllocation) {
        this.isAllocation = isAllocation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsAllocation(int i) {
        return this.isAllocation[i];
    }

    public void setIsAllocation(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isAllocation[i] = _value;
    }


    /**
     * Gets the isGcoChargeback value for this TransactionSearchRowBasic.
     * 
     * @return isGcoChargeback
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsGcoChargeback() {
        return isGcoChargeback;
    }


    /**
     * Sets the isGcoChargeback value for this TransactionSearchRowBasic.
     * 
     * @param isGcoChargeback
     */
    public void setIsGcoChargeback(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoChargeback) {
        this.isGcoChargeback = isGcoChargeback;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsGcoChargeback(int i) {
        return this.isGcoChargeback[i];
    }

    public void setIsGcoChargeback(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isGcoChargeback[i] = _value;
    }


    /**
     * Gets the isGcoChargeConfirmed value for this TransactionSearchRowBasic.
     * 
     * @return isGcoChargeConfirmed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsGcoChargeConfirmed() {
        return isGcoChargeConfirmed;
    }


    /**
     * Sets the isGcoChargeConfirmed value for this TransactionSearchRowBasic.
     * 
     * @param isGcoChargeConfirmed
     */
    public void setIsGcoChargeConfirmed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoChargeConfirmed) {
        this.isGcoChargeConfirmed = isGcoChargeConfirmed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsGcoChargeConfirmed(int i) {
        return this.isGcoChargeConfirmed[i];
    }

    public void setIsGcoChargeConfirmed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isGcoChargeConfirmed[i] = _value;
    }


    /**
     * Gets the isGcoPaymentGuaranteed value for this TransactionSearchRowBasic.
     * 
     * @return isGcoPaymentGuaranteed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsGcoPaymentGuaranteed() {
        return isGcoPaymentGuaranteed;
    }


    /**
     * Sets the isGcoPaymentGuaranteed value for this TransactionSearchRowBasic.
     * 
     * @param isGcoPaymentGuaranteed
     */
    public void setIsGcoPaymentGuaranteed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoPaymentGuaranteed) {
        this.isGcoPaymentGuaranteed = isGcoPaymentGuaranteed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsGcoPaymentGuaranteed(int i) {
        return this.isGcoPaymentGuaranteed[i];
    }

    public void setIsGcoPaymentGuaranteed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isGcoPaymentGuaranteed[i] = _value;
    }


    /**
     * Gets the isGcoRefundConfirmed value for this TransactionSearchRowBasic.
     * 
     * @return isGcoRefundConfirmed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsGcoRefundConfirmed() {
        return isGcoRefundConfirmed;
    }


    /**
     * Sets the isGcoRefundConfirmed value for this TransactionSearchRowBasic.
     * 
     * @param isGcoRefundConfirmed
     */
    public void setIsGcoRefundConfirmed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoRefundConfirmed) {
        this.isGcoRefundConfirmed = isGcoRefundConfirmed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsGcoRefundConfirmed(int i) {
        return this.isGcoRefundConfirmed[i];
    }

    public void setIsGcoRefundConfirmed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isGcoRefundConfirmed[i] = _value;
    }


    /**
     * Gets the isIntercompanyAdjustment value for this TransactionSearchRowBasic.
     * 
     * @return isIntercompanyAdjustment
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsIntercompanyAdjustment() {
        return isIntercompanyAdjustment;
    }


    /**
     * Sets the isIntercompanyAdjustment value for this TransactionSearchRowBasic.
     * 
     * @param isIntercompanyAdjustment
     */
    public void setIsIntercompanyAdjustment(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isIntercompanyAdjustment) {
        this.isIntercompanyAdjustment = isIntercompanyAdjustment;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsIntercompanyAdjustment(int i) {
        return this.isIntercompanyAdjustment[i];
    }

    public void setIsIntercompanyAdjustment(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isIntercompanyAdjustment[i] = _value;
    }


    /**
     * Gets the isReversal value for this TransactionSearchRowBasic.
     * 
     * @return isReversal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsReversal() {
        return isReversal;
    }


    /**
     * Sets the isReversal value for this TransactionSearchRowBasic.
     * 
     * @param isReversal
     */
    public void setIsReversal(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isReversal) {
        this.isReversal = isReversal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsReversal(int i) {
        return this.isReversal[i];
    }

    public void setIsReversal(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isReversal[i] = _value;
    }


    /**
     * Gets the isRevRecTransaction value for this TransactionSearchRowBasic.
     * 
     * @return isRevRecTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsRevRecTransaction() {
        return isRevRecTransaction;
    }


    /**
     * Sets the isRevRecTransaction value for this TransactionSearchRowBasic.
     * 
     * @param isRevRecTransaction
     */
    public void setIsRevRecTransaction(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isRevRecTransaction) {
        this.isRevRecTransaction = isRevRecTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsRevRecTransaction(int i) {
        return this.isRevRecTransaction[i];
    }

    public void setIsRevRecTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isRevRecTransaction[i] = _value;
    }


    /**
     * Gets the isShipAddress value for this TransactionSearchRowBasic.
     * 
     * @return isShipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsShipAddress() {
        return isShipAddress;
    }


    /**
     * Sets the isShipAddress value for this TransactionSearchRowBasic.
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
     * Gets the isTransferPriceCosting value for this TransactionSearchRowBasic.
     * 
     * @return isTransferPriceCosting
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsTransferPriceCosting() {
        return isTransferPriceCosting;
    }


    /**
     * Sets the isTransferPriceCosting value for this TransactionSearchRowBasic.
     * 
     * @param isTransferPriceCosting
     */
    public void setIsTransferPriceCosting(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTransferPriceCosting) {
        this.isTransferPriceCosting = isTransferPriceCosting;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsTransferPriceCosting(int i) {
        return this.isTransferPriceCosting[i];
    }

    public void setIsTransferPriceCosting(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isTransferPriceCosting[i] = _value;
    }


    /**
     * Gets the item value for this TransactionSearchRowBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this TransactionSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this TransactionSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this TransactionSearchRowBasic.
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
     * Gets the leadSource value for this TransactionSearchRowBasic.
     * 
     * @return leadSource
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this TransactionSearchRowBasic.
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
     * Gets the line value for this TransactionSearchRowBasic.
     * 
     * @return line
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getLine() {
        return line;
    }


    /**
     * Sets the line value for this TransactionSearchRowBasic.
     * 
     * @param line
     */
    public void setLine(org.mule.module.netsuite.api.internal.SearchColumnLongField[] line) {
        this.line = line;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getLine(int i) {
        return this.line[i];
    }

    public void setLine(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.line[i] = _value;
    }


    /**
     * Gets the location value for this TransactionSearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TransactionSearchRowBasic.
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
     * Gets the mainLine value for this TransactionSearchRowBasic.
     * 
     * @return mainLine
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getMainLine() {
        return mainLine;
    }


    /**
     * Sets the mainLine value for this TransactionSearchRowBasic.
     * 
     * @param mainLine
     */
    public void setMainLine(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] mainLine) {
        this.mainLine = mainLine;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getMainLine(int i) {
        return this.mainLine[i];
    }

    public void setMainLine(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.mainLine[i] = _value;
    }


    /**
     * Gets the mainName value for this TransactionSearchRowBasic.
     * 
     * @return mainName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMainName() {
        return mainName;
    }


    /**
     * Sets the mainName value for this TransactionSearchRowBasic.
     * 
     * @param mainName
     */
    public void setMainName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] mainName) {
        this.mainName = mainName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMainName(int i) {
        return this.mainName[i];
    }

    public void setMainName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.mainName[i] = _value;
    }


    /**
     * Gets the matchBillToReceipt value for this TransactionSearchRowBasic.
     * 
     * @return matchBillToReceipt
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this TransactionSearchRowBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getMatchBillToReceipt(int i) {
        return this.matchBillToReceipt[i];
    }

    public void setMatchBillToReceipt(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.matchBillToReceipt[i] = _value;
    }


    /**
     * Gets the memo value for this TransactionSearchRowBasic.
     * 
     * @return memo
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TransactionSearchRowBasic.
     * 
     * @param memo
     */
    public void setMemo(org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.memo[i] = _value;
    }


    /**
     * Gets the memoMain value for this TransactionSearchRowBasic.
     * 
     * @return memoMain
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMemoMain() {
        return memoMain;
    }


    /**
     * Sets the memoMain value for this TransactionSearchRowBasic.
     * 
     * @param memoMain
     */
    public void setMemoMain(org.mule.module.netsuite.api.internal.SearchColumnStringField[] memoMain) {
        this.memoMain = memoMain;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMemoMain(int i) {
        return this.memoMain[i];
    }

    public void setMemoMain(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.memoMain[i] = _value;
    }


    /**
     * Gets the memorized value for this TransactionSearchRowBasic.
     * 
     * @return memorized
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getMemorized() {
        return memorized;
    }


    /**
     * Sets the memorized value for this TransactionSearchRowBasic.
     * 
     * @param memorized
     */
    public void setMemorized(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] memorized) {
        this.memorized = memorized;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getMemorized(int i) {
        return this.memorized[i];
    }

    public void setMemorized(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.memorized[i] = _value;
    }


    /**
     * Gets the merchantAccount value for this TransactionSearchRowBasic.
     * 
     * @return merchantAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getMerchantAccount() {
        return merchantAccount;
    }


    /**
     * Sets the merchantAccount value for this TransactionSearchRowBasic.
     * 
     * @param merchantAccount
     */
    public void setMerchantAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getMerchantAccount(int i) {
        return this.merchantAccount[i];
    }

    public void setMerchantAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.merchantAccount[i] = _value;
    }


    /**
     * Gets the message value for this TransactionSearchRowBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TransactionSearchRowBasic.
     * 
     * @param message
     */
    public void setMessage(org.mule.module.netsuite.api.internal.SearchColumnStringField[] message) {
        this.message = message;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.message[i] = _value;
    }


    /**
     * Gets the multiSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @return multiSubsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getMultiSubsidiary() {
        return multiSubsidiary;
    }


    /**
     * Sets the multiSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @param multiSubsidiary
     */
    public void setMultiSubsidiary(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getMultiSubsidiary(int i) {
        return this.multiSubsidiary[i];
    }

    public void setMultiSubsidiary(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.multiSubsidiary[i] = _value;
    }


    /**
     * Gets the netAmount value for this TransactionSearchRowBasic.
     * 
     * @return netAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getNetAmount() {
        return netAmount;
    }


    /**
     * Sets the netAmount value for this TransactionSearchRowBasic.
     * 
     * @param netAmount
     */
    public void setNetAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] netAmount) {
        this.netAmount = netAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getNetAmount(int i) {
        return this.netAmount[i];
    }

    public void setNetAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.netAmount[i] = _value;
    }


    /**
     * Gets the netAmountNoTax value for this TransactionSearchRowBasic.
     * 
     * @return netAmountNoTax
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getNetAmountNoTax() {
        return netAmountNoTax;
    }


    /**
     * Sets the netAmountNoTax value for this TransactionSearchRowBasic.
     * 
     * @param netAmountNoTax
     */
    public void setNetAmountNoTax(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] netAmountNoTax) {
        this.netAmountNoTax = netAmountNoTax;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getNetAmountNoTax(int i) {
        return this.netAmountNoTax[i];
    }

    public void setNetAmountNoTax(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.netAmountNoTax[i] = _value;
    }


    /**
     * Gets the nextBillDate value for this TransactionSearchRowBasic.
     * 
     * @return nextBillDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getNextBillDate() {
        return nextBillDate;
    }


    /**
     * Sets the nextBillDate value for this TransactionSearchRowBasic.
     * 
     * @param nextBillDate
     */
    public void setNextBillDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getNextBillDate(int i) {
        return this.nextBillDate[i];
    }

    public void setNextBillDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.nextBillDate[i] = _value;
    }


    /**
     * Gets the opportunity value for this TransactionSearchRowBasic.
     * 
     * @return opportunity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOpportunity() {
        return opportunity;
    }


    /**
     * Sets the opportunity value for this TransactionSearchRowBasic.
     * 
     * @param opportunity
     */
    public void setOpportunity(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] opportunity) {
        this.opportunity = opportunity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getOpportunity(int i) {
        return this.opportunity[i];
    }

    public void setOpportunity(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.opportunity[i] = _value;
    }


    /**
     * Gets the options value for this TransactionSearchRowBasic.
     * 
     * @return options
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this TransactionSearchRowBasic.
     * 
     * @param options
     */
    public void setOptions(org.mule.module.netsuite.api.internal.SearchColumnStringField[] options) {
        this.options = options;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the originator value for this TransactionSearchRowBasic.
     * 
     * @return originator
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getOriginator() {
        return originator;
    }


    /**
     * Sets the originator value for this TransactionSearchRowBasic.
     * 
     * @param originator
     */
    public void setOriginator(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] originator) {
        this.originator = originator;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getOriginator(int i) {
        return this.originator[i];
    }

    public void setOriginator(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.originator[i] = _value;
    }


    /**
     * Gets the otherRefNum value for this TransactionSearchRowBasic.
     * 
     * @return otherRefNum
     */
    public org.mule.module.netsuite.api.internal.SearchColumnTextNumberField[] getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this TransactionSearchRowBasic.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(org.mule.module.netsuite.api.internal.SearchColumnTextNumberField[] otherRefNum) {
        this.otherRefNum = otherRefNum;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnTextNumberField getOtherRefNum(int i) {
        return this.otherRefNum[i];
    }

    public void setOtherRefNum(int i, org.mule.module.netsuite.api.internal.SearchColumnTextNumberField _value) {
        this.otherRefNum[i] = _value;
    }


    /**
     * Gets the packageCount value for this TransactionSearchRowBasic.
     * 
     * @return packageCount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getPackageCount() {
        return packageCount;
    }


    /**
     * Sets the packageCount value for this TransactionSearchRowBasic.
     * 
     * @param packageCount
     */
    public void setPackageCount(org.mule.module.netsuite.api.internal.SearchColumnLongField[] packageCount) {
        this.packageCount = packageCount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getPackageCount(int i) {
        return this.packageCount[i];
    }

    public void setPackageCount(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.packageCount[i] = _value;
    }


    /**
     * Gets the paidAmount value for this TransactionSearchRowBasic.
     * 
     * @return paidAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPaidAmount() {
        return paidAmount;
    }


    /**
     * Sets the paidAmount value for this TransactionSearchRowBasic.
     * 
     * @param paidAmount
     */
    public void setPaidAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] paidAmount) {
        this.paidAmount = paidAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPaidAmount(int i) {
        return this.paidAmount[i];
    }

    public void setPaidAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.paidAmount[i] = _value;
    }


    /**
     * Gets the paidTransaction value for this TransactionSearchRowBasic.
     * 
     * @return paidTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPaidTransaction() {
        return paidTransaction;
    }


    /**
     * Sets the paidTransaction value for this TransactionSearchRowBasic.
     * 
     * @param paidTransaction
     */
    public void setPaidTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] paidTransaction) {
        this.paidTransaction = paidTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPaidTransaction(int i) {
        return this.paidTransaction[i];
    }

    public void setPaidTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.paidTransaction[i] = _value;
    }


    /**
     * Gets the partner value for this TransactionSearchRowBasic.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this TransactionSearchRowBasic.
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
     * Gets the partnerContribution value for this TransactionSearchRowBasic.
     * 
     * @return partnerContribution
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPartnerContribution() {
        return partnerContribution;
    }


    /**
     * Sets the partnerContribution value for this TransactionSearchRowBasic.
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
     * Gets the partnerRole value for this TransactionSearchRowBasic.
     * 
     * @return partnerRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartnerRole() {
        return partnerRole;
    }


    /**
     * Sets the partnerRole value for this TransactionSearchRowBasic.
     * 
     * @param partnerRole
     */
    public void setPartnerRole(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.partnerRole[i] = _value;
    }


    /**
     * Gets the partnerTeamMember value for this TransactionSearchRowBasic.
     * 
     * @return partnerTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPartnerTeamMember() {
        return partnerTeamMember;
    }


    /**
     * Sets the partnerTeamMember value for this TransactionSearchRowBasic.
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
     * Gets the payingAmount value for this TransactionSearchRowBasic.
     * 
     * @return payingAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPayingAmount() {
        return payingAmount;
    }


    /**
     * Sets the payingAmount value for this TransactionSearchRowBasic.
     * 
     * @param payingAmount
     */
    public void setPayingAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] payingAmount) {
        this.payingAmount = payingAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPayingAmount(int i) {
        return this.payingAmount[i];
    }

    public void setPayingAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.payingAmount[i] = _value;
    }


    /**
     * Gets the payingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return payingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPayingTransaction() {
        return payingTransaction;
    }


    /**
     * Sets the payingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param payingTransaction
     */
    public void setPayingTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] payingTransaction) {
        this.payingTransaction = payingTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPayingTransaction(int i) {
        return this.payingTransaction[i];
    }

    public void setPayingTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.payingTransaction[i] = _value;
    }


    /**
     * Gets the paymentEventDate value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getPaymentEventDate() {
        return paymentEventDate;
    }


    /**
     * Sets the paymentEventDate value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventDate
     */
    public void setPaymentEventDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getPaymentEventDate(int i) {
        return this.paymentEventDate[i];
    }

    public void setPaymentEventDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.paymentEventDate[i] = _value;
    }


    /**
     * Gets the paymentEventHoldReason value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventHoldReason
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPaymentEventHoldReason() {
        return paymentEventHoldReason;
    }


    /**
     * Sets the paymentEventHoldReason value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventHoldReason
     */
    public void setPaymentEventHoldReason(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getPaymentEventHoldReason(int i) {
        return this.paymentEventHoldReason[i];
    }

    public void setPaymentEventHoldReason(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.paymentEventHoldReason[i] = _value;
    }


    /**
     * Gets the paymentEventResult value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventResult
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPaymentEventResult() {
        return paymentEventResult;
    }


    /**
     * Sets the paymentEventResult value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventResult
     */
    public void setPaymentEventResult(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getPaymentEventResult(int i) {
        return this.paymentEventResult[i];
    }

    public void setPaymentEventResult(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.paymentEventResult[i] = _value;
    }


    /**
     * Gets the paymentEventType value for this TransactionSearchRowBasic.
     * 
     * @return paymentEventType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPaymentEventType() {
        return paymentEventType;
    }


    /**
     * Sets the paymentEventType value for this TransactionSearchRowBasic.
     * 
     * @param paymentEventType
     */
    public void setPaymentEventType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] paymentEventType) {
        this.paymentEventType = paymentEventType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getPaymentEventType(int i) {
        return this.paymentEventType[i];
    }

    public void setPaymentEventType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.paymentEventType[i] = _value;
    }


    /**
     * Gets the paymentMethod value for this TransactionSearchRowBasic.
     * 
     * @return paymentMethod
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this TransactionSearchRowBasic.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.paymentMethod[i] = _value;
    }


    /**
     * Gets the payPalPending value for this TransactionSearchRowBasic.
     * 
     * @return payPalPending
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getPayPalPending() {
        return payPalPending;
    }


    /**
     * Sets the payPalPending value for this TransactionSearchRowBasic.
     * 
     * @param payPalPending
     */
    public void setPayPalPending(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] payPalPending) {
        this.payPalPending = payPalPending;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getPayPalPending(int i) {
        return this.payPalPending[i];
    }

    public void setPayPalPending(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.payPalPending[i] = _value;
    }


    /**
     * Gets the payPalStatus value for this TransactionSearchRowBasic.
     * 
     * @return payPalStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPayPalStatus() {
        return payPalStatus;
    }


    /**
     * Sets the payPalStatus value for this TransactionSearchRowBasic.
     * 
     * @param payPalStatus
     */
    public void setPayPalStatus(org.mule.module.netsuite.api.internal.SearchColumnStringField[] payPalStatus) {
        this.payPalStatus = payPalStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPayPalStatus(int i) {
        return this.payPalStatus[i];
    }

    public void setPayPalStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.payPalStatus[i] = _value;
    }


    /**
     * Gets the payPalTranId value for this TransactionSearchRowBasic.
     * 
     * @return payPalTranId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPayPalTranId() {
        return payPalTranId;
    }


    /**
     * Sets the payPalTranId value for this TransactionSearchRowBasic.
     * 
     * @param payPalTranId
     */
    public void setPayPalTranId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] payPalTranId) {
        this.payPalTranId = payPalTranId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPayPalTranId(int i) {
        return this.payPalTranId[i];
    }

    public void setPayPalTranId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.payPalTranId[i] = _value;
    }


    /**
     * Gets the payrollBatch value for this TransactionSearchRowBasic.
     * 
     * @return payrollBatch
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPayrollBatch() {
        return payrollBatch;
    }


    /**
     * Sets the payrollBatch value for this TransactionSearchRowBasic.
     * 
     * @param payrollBatch
     */
    public void setPayrollBatch(org.mule.module.netsuite.api.internal.SearchColumnStringField[] payrollBatch) {
        this.payrollBatch = payrollBatch;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPayrollBatch(int i) {
        return this.payrollBatch[i];
    }

    public void setPayrollBatch(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.payrollBatch[i] = _value;
    }


    /**
     * Gets the pnRefNum value for this TransactionSearchRowBasic.
     * 
     * @return pnRefNum
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this TransactionSearchRowBasic.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(org.mule.module.netsuite.api.internal.SearchColumnStringField[] pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPnRefNum(int i) {
        return this.pnRefNum[i];
    }

    public void setPnRefNum(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.pnRefNum[i] = _value;
    }


    /**
     * Gets the poRate value for this TransactionSearchRowBasic.
     * 
     * @return poRate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPoRate() {
        return poRate;
    }


    /**
     * Sets the poRate value for this TransactionSearchRowBasic.
     * 
     * @param poRate
     */
    public void setPoRate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] poRate) {
        this.poRate = poRate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPoRate(int i) {
        return this.poRate[i];
    }

    public void setPoRate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.poRate[i] = _value;
    }


    /**
     * Gets the posting value for this TransactionSearchRowBasic.
     * 
     * @return posting
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getPosting() {
        return posting;
    }


    /**
     * Sets the posting value for this TransactionSearchRowBasic.
     * 
     * @param posting
     */
    public void setPosting(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] posting) {
        this.posting = posting;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getPosting(int i) {
        return this.posting[i];
    }

    public void setPosting(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.posting[i] = _value;
    }


    /**
     * Gets the postingPeriod value for this TransactionSearchRowBasic.
     * 
     * @return postingPeriod
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this TransactionSearchRowBasic.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPostingPeriod(int i) {
        return this.postingPeriod[i];
    }

    public void setPostingPeriod(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.postingPeriod[i] = _value;
    }


    /**
     * Gets the priceLevel value for this TransactionSearchRowBasic.
     * 
     * @return priceLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPriceLevel() {
        return priceLevel;
    }


    /**
     * Sets the priceLevel value for this TransactionSearchRowBasic.
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
     * Gets the print value for this TransactionSearchRowBasic.
     * 
     * @return print
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPrint() {
        return print;
    }


    /**
     * Sets the print value for this TransactionSearchRowBasic.
     * 
     * @param print
     */
    public void setPrint(org.mule.module.netsuite.api.internal.SearchColumnStringField[] print) {
        this.print = print;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPrint(int i) {
        return this.print[i];
    }

    public void setPrint(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.print[i] = _value;
    }


    /**
     * Gets the probability value for this TransactionSearchRowBasic.
     * 
     * @return probability
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getProbability() {
        return probability;
    }


    /**
     * Sets the probability value for this TransactionSearchRowBasic.
     * 
     * @param probability
     */
    public void setProbability(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] probability) {
        this.probability = probability;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getProbability(int i) {
        return this.probability[i];
    }

    public void setProbability(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.probability[i] = _value;
    }


    /**
     * Gets the projectedAmount value for this TransactionSearchRowBasic.
     * 
     * @return projectedAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getProjectedAmount() {
        return projectedAmount;
    }


    /**
     * Sets the projectedAmount value for this TransactionSearchRowBasic.
     * 
     * @param projectedAmount
     */
    public void setProjectedAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] projectedAmount) {
        this.projectedAmount = projectedAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getProjectedAmount(int i) {
        return this.projectedAmount[i];
    }

    public void setProjectedAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.projectedAmount[i] = _value;
    }


    /**
     * Gets the promoCode value for this TransactionSearchRowBasic.
     * 
     * @return promoCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this TransactionSearchRowBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] promoCode) {
        this.promoCode = promoCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPromoCode(int i) {
        return this.promoCode[i];
    }

    public void setPromoCode(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.promoCode[i] = _value;
    }


    /**
     * Gets the purchaseOrder value for this TransactionSearchRowBasic.
     * 
     * @return purchaseOrder
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPurchaseOrder() {
        return purchaseOrder;
    }


    /**
     * Sets the purchaseOrder value for this TransactionSearchRowBasic.
     * 
     * @param purchaseOrder
     */
    public void setPurchaseOrder(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPurchaseOrder(int i) {
        return this.purchaseOrder[i];
    }

    public void setPurchaseOrder(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.purchaseOrder[i] = _value;
    }


    /**
     * Gets the quantity value for this TransactionSearchRowBasic.
     * 
     * @return quantity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this TransactionSearchRowBasic.
     * 
     * @param quantity
     */
    public void setQuantity(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }


    /**
     * Gets the quantityBilled value for this TransactionSearchRowBasic.
     * 
     * @return quantityBilled
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this TransactionSearchRowBasic.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityBilled(int i) {
        return this.quantityBilled[i];
    }

    public void setQuantityBilled(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityBilled[i] = _value;
    }


    /**
     * Gets the quantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @return quantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityCommitted(int i) {
        return this.quantityCommitted[i];
    }

    public void setQuantityCommitted(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityCommitted[i] = _value;
    }


    /**
     * Gets the quantityPacked value for this TransactionSearchRowBasic.
     * 
     * @return quantityPacked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityPacked() {
        return quantityPacked;
    }


    /**
     * Sets the quantityPacked value for this TransactionSearchRowBasic.
     * 
     * @param quantityPacked
     */
    public void setQuantityPacked(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityPacked) {
        this.quantityPacked = quantityPacked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityPacked(int i) {
        return this.quantityPacked[i];
    }

    public void setQuantityPacked(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityPacked[i] = _value;
    }


    /**
     * Gets the quantityPicked value for this TransactionSearchRowBasic.
     * 
     * @return quantityPicked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityPicked() {
        return quantityPicked;
    }


    /**
     * Sets the quantityPicked value for this TransactionSearchRowBasic.
     * 
     * @param quantityPicked
     */
    public void setQuantityPicked(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityPicked) {
        this.quantityPicked = quantityPicked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityPicked(int i) {
        return this.quantityPicked[i];
    }

    public void setQuantityPicked(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityPicked[i] = _value;
    }


    /**
     * Gets the quantityRevCommitted value for this TransactionSearchRowBasic.
     * 
     * @return quantityRevCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityRevCommitted() {
        return quantityRevCommitted;
    }


    /**
     * Sets the quantityRevCommitted value for this TransactionSearchRowBasic.
     * 
     * @param quantityRevCommitted
     */
    public void setQuantityRevCommitted(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityRevCommitted(int i) {
        return this.quantityRevCommitted[i];
    }

    public void setQuantityRevCommitted(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityRevCommitted[i] = _value;
    }


    /**
     * Gets the quantityShipRecv value for this TransactionSearchRowBasic.
     * 
     * @return quantityShipRecv
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityShipRecv() {
        return quantityShipRecv;
    }


    /**
     * Sets the quantityShipRecv value for this TransactionSearchRowBasic.
     * 
     * @param quantityShipRecv
     */
    public void setQuantityShipRecv(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityShipRecv) {
        this.quantityShipRecv = quantityShipRecv;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityShipRecv(int i) {
        return this.quantityShipRecv[i];
    }

    public void setQuantityShipRecv(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityShipRecv[i] = _value;
    }


    /**
     * Gets the quantityUom value for this TransactionSearchRowBasic.
     * 
     * @return quantityUom
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityUom() {
        return quantityUom;
    }


    /**
     * Sets the quantityUom value for this TransactionSearchRowBasic.
     * 
     * @param quantityUom
     */
    public void setQuantityUom(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityUom) {
        this.quantityUom = quantityUom;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityUom(int i) {
        return this.quantityUom[i];
    }

    public void setQuantityUom(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityUom[i] = _value;
    }


    /**
     * Gets the rate value for this TransactionSearchRowBasic.
     * 
     * @return rate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TransactionSearchRowBasic.
     * 
     * @param rate
     */
    public void setRate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rate) {
        this.rate = rate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.rate[i] = _value;
    }


    /**
     * Gets the realizedGainPostingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return realizedGainPostingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getRealizedGainPostingTransaction() {
        return realizedGainPostingTransaction;
    }


    /**
     * Sets the realizedGainPostingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param realizedGainPostingTransaction
     */
    public void setRealizedGainPostingTransaction(org.mule.module.netsuite.api.internal.SearchColumnStringField[] realizedGainPostingTransaction) {
        this.realizedGainPostingTransaction = realizedGainPostingTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getRealizedGainPostingTransaction(int i) {
        return this.realizedGainPostingTransaction[i];
    }

    public void setRealizedGainPostingTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.realizedGainPostingTransaction[i] = _value;
    }


    /**
     * Gets the recognizedRevenue value for this TransactionSearchRowBasic.
     * 
     * @return recognizedRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this TransactionSearchRowBasic.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getRecognizedRevenue(int i) {
        return this.recognizedRevenue[i];
    }

    public void setRecognizedRevenue(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.recognizedRevenue[i] = _value;
    }


    /**
     * Gets the revCommitStatus value for this TransactionSearchRowBasic.
     * 
     * @return revCommitStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getRevCommitStatus() {
        return revCommitStatus;
    }


    /**
     * Sets the revCommitStatus value for this TransactionSearchRowBasic.
     * 
     * @param revCommitStatus
     */
    public void setRevCommitStatus(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getRevCommitStatus(int i) {
        return this.revCommitStatus[i];
    }

    public void setRevCommitStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.revCommitStatus[i] = _value;
    }


    /**
     * Gets the revCommittingTransaction value for this TransactionSearchRowBasic.
     * 
     * @return revCommittingTransaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getRevCommittingTransaction() {
        return revCommittingTransaction;
    }


    /**
     * Sets the revCommittingTransaction value for this TransactionSearchRowBasic.
     * 
     * @param revCommittingTransaction
     */
    public void setRevCommittingTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] revCommittingTransaction) {
        this.revCommittingTransaction = revCommittingTransaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getRevCommittingTransaction(int i) {
        return this.revCommittingTransaction[i];
    }

    public void setRevCommittingTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.revCommittingTransaction[i] = _value;
    }


    /**
     * Gets the revenueStatus value for this TransactionSearchRowBasic.
     * 
     * @return revenueStatus
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this TransactionSearchRowBasic.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getRevenueStatus(int i) {
        return this.revenueStatus[i];
    }

    public void setRevenueStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.revenueStatus[i] = _value;
    }


    /**
     * Gets the reversalDate value for this TransactionSearchRowBasic.
     * 
     * @return reversalDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getReversalDate() {
        return reversalDate;
    }


    /**
     * Sets the reversalDate value for this TransactionSearchRowBasic.
     * 
     * @param reversalDate
     */
    public void setReversalDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] reversalDate) {
        this.reversalDate = reversalDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getReversalDate(int i) {
        return this.reversalDate[i];
    }

    public void setReversalDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.reversalDate[i] = _value;
    }


    /**
     * Gets the reversalNumber value for this TransactionSearchRowBasic.
     * 
     * @return reversalNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getReversalNumber() {
        return reversalNumber;
    }


    /**
     * Sets the reversalNumber value for this TransactionSearchRowBasic.
     * 
     * @param reversalNumber
     */
    public void setReversalNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] reversalNumber) {
        this.reversalNumber = reversalNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getReversalNumber(int i) {
        return this.reversalNumber[i];
    }

    public void setReversalNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.reversalNumber[i] = _value;
    }


    /**
     * Gets the revRecEndDate value for this TransactionSearchRowBasic.
     * 
     * @return revRecEndDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this TransactionSearchRowBasic.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getRevRecEndDate(int i) {
        return this.revRecEndDate[i];
    }

    public void setRevRecEndDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.revRecEndDate[i] = _value;
    }


    /**
     * Gets the revRecOnRevCommitment value for this TransactionSearchRowBasic.
     * 
     * @return revRecOnRevCommitment
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this TransactionSearchRowBasic.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getRevRecOnRevCommitment(int i) {
        return this.revRecOnRevCommitment[i];
    }

    public void setRevRecOnRevCommitment(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.revRecOnRevCommitment[i] = _value;
    }


    /**
     * Gets the revRecStartDate value for this TransactionSearchRowBasic.
     * 
     * @return revRecStartDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this TransactionSearchRowBasic.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getRevRecStartDate(int i) {
        return this.revRecStartDate[i];
    }

    public void setRevRecStartDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.revRecStartDate[i] = _value;
    }


    /**
     * Gets the rgAccount value for this TransactionSearchRowBasic.
     * 
     * @return rgAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getRgAccount() {
        return rgAccount;
    }


    /**
     * Sets the rgAccount value for this TransactionSearchRowBasic.
     * 
     * @param rgAccount
     */
    public void setRgAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] rgAccount) {
        this.rgAccount = rgAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getRgAccount(int i) {
        return this.rgAccount[i];
    }

    public void setRgAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.rgAccount[i] = _value;
    }


    /**
     * Gets the rgAmount value for this TransactionSearchRowBasic.
     * 
     * @return rgAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getRgAmount() {
        return rgAmount;
    }


    /**
     * Sets the rgAmount value for this TransactionSearchRowBasic.
     * 
     * @param rgAmount
     */
    public void setRgAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rgAmount) {
        this.rgAmount = rgAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getRgAmount(int i) {
        return this.rgAmount[i];
    }

    public void setRgAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.rgAmount[i] = _value;
    }


    /**
     * Gets the salesEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @return salesEffectiveDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this TransactionSearchRowBasic.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getSalesEffectiveDate(int i) {
        return this.salesEffectiveDate[i];
    }

    public void setSalesEffectiveDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.salesEffectiveDate[i] = _value;
    }


    /**
     * Gets the salesRep value for this TransactionSearchRowBasic.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this TransactionSearchRowBasic.
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
     * Gets the salesTeamMember value for this TransactionSearchRowBasic.
     * 
     * @return salesTeamMember
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesTeamMember() {
        return salesTeamMember;
    }


    /**
     * Sets the salesTeamMember value for this TransactionSearchRowBasic.
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
     * Gets the salesTeamRole value for this TransactionSearchRowBasic.
     * 
     * @return salesTeamRole
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesTeamRole() {
        return salesTeamRole;
    }


    /**
     * Sets the salesTeamRole value for this TransactionSearchRowBasic.
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
     * Gets the serialNumber value for this TransactionSearchRowBasic.
     * 
     * @return serialNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this TransactionSearchRowBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }


    /**
     * Gets the serialNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @return serialNumberQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getSerialNumberQuantity() {
        return serialNumberQuantity;
    }


    /**
     * Sets the serialNumberQuantity value for this TransactionSearchRowBasic.
     * 
     * @param serialNumberQuantity
     */
    public void setSerialNumberQuantity(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] serialNumberQuantity) {
        this.serialNumberQuantity = serialNumberQuantity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getSerialNumberQuantity(int i) {
        return this.serialNumberQuantity[i];
    }

    public void setSerialNumberQuantity(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.serialNumberQuantity[i] = _value;
    }


    /**
     * Gets the serialNumbers value for this TransactionSearchRowBasic.
     * 
     * @return serialNumbers
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this TransactionSearchRowBasic.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSerialNumbers(int i) {
        return this.serialNumbers[i];
    }

    public void setSerialNumbers(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.serialNumbers[i] = _value;
    }


    /**
     * Gets the shipAddress value for this TransactionSearchRowBasic.
     * 
     * @return shipAddress
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this TransactionSearchRowBasic.
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
     * Gets the shipAddress1 value for this TransactionSearchRowBasic.
     * 
     * @return shipAddress1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress1() {
        return shipAddress1;
    }


    /**
     * Sets the shipAddress1 value for this TransactionSearchRowBasic.
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
     * Gets the shipAddress2 value for this TransactionSearchRowBasic.
     * 
     * @return shipAddress2
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddress2() {
        return shipAddress2;
    }


    /**
     * Sets the shipAddress2 value for this TransactionSearchRowBasic.
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
     * Gets the shipAddressee value for this TransactionSearchRowBasic.
     * 
     * @return shipAddressee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this TransactionSearchRowBasic.
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
     * Gets the shipAttention value for this TransactionSearchRowBasic.
     * 
     * @return shipAttention
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this TransactionSearchRowBasic.
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
     * Gets the shipCity value for this TransactionSearchRowBasic.
     * 
     * @return shipCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this TransactionSearchRowBasic.
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
     * Gets the shipComplete value for this TransactionSearchRowBasic.
     * 
     * @return shipComplete
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this TransactionSearchRowBasic.
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
     * Gets the shipCountry value for this TransactionSearchRowBasic.
     * 
     * @return shipCountry
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this TransactionSearchRowBasic.
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
     * Gets the shipCountryCode value for this TransactionSearchRowBasic.
     * 
     * @return shipCountryCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipCountryCode() {
        return shipCountryCode;
    }


    /**
     * Sets the shipCountryCode value for this TransactionSearchRowBasic.
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
     * Gets the shipDate value for this TransactionSearchRowBasic.
     * 
     * @return shipDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this TransactionSearchRowBasic.
     * 
     * @param shipDate
     */
    public void setShipDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] shipDate) {
        this.shipDate = shipDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getShipDate(int i) {
        return this.shipDate[i];
    }

    public void setShipDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.shipDate[i] = _value;
    }


    /**
     * Gets the shipGroup value for this TransactionSearchRowBasic.
     * 
     * @return shipGroup
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this TransactionSearchRowBasic.
     * 
     * @param shipGroup
     */
    public void setShipGroup(org.mule.module.netsuite.api.internal.SearchColumnLongField[] shipGroup) {
        this.shipGroup = shipGroup;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getShipGroup(int i) {
        return this.shipGroup[i];
    }

    public void setShipGroup(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.shipGroup[i] = _value;
    }


    /**
     * Gets the shipMethod value for this TransactionSearchRowBasic.
     * 
     * @return shipMethod
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this TransactionSearchRowBasic.
     * 
     * @param shipMethod
     */
    public void setShipMethod(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shipMethod) {
        this.shipMethod = shipMethod;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getShipMethod(int i) {
        return this.shipMethod[i];
    }

    public void setShipMethod(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.shipMethod[i] = _value;
    }


    /**
     * Gets the shipPhone value for this TransactionSearchRowBasic.
     * 
     * @return shipPhone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this TransactionSearchRowBasic.
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
     * Gets the shippingAmount value for this TransactionSearchRowBasic.
     * 
     * @return shippingAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getShippingAmount() {
        return shippingAmount;
    }


    /**
     * Sets the shippingAmount value for this TransactionSearchRowBasic.
     * 
     * @param shippingAmount
     */
    public void setShippingAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getShippingAmount(int i) {
        return this.shippingAmount[i];
    }

    public void setShippingAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.shippingAmount[i] = _value;
    }


    /**
     * Gets the shipRecvStatusLine value for this TransactionSearchRowBasic.
     * 
     * @return shipRecvStatusLine
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getShipRecvStatusLine() {
        return shipRecvStatusLine;
    }


    /**
     * Sets the shipRecvStatusLine value for this TransactionSearchRowBasic.
     * 
     * @param shipRecvStatusLine
     */
    public void setShipRecvStatusLine(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipRecvStatusLine) {
        this.shipRecvStatusLine = shipRecvStatusLine;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getShipRecvStatusLine(int i) {
        return this.shipRecvStatusLine[i];
    }

    public void setShipRecvStatusLine(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.shipRecvStatusLine[i] = _value;
    }


    /**
     * Gets the shipState value for this TransactionSearchRowBasic.
     * 
     * @return shipState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this TransactionSearchRowBasic.
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
     * Gets the shipTo value for this TransactionSearchRowBasic.
     * 
     * @return shipTo
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getShipTo() {
        return shipTo;
    }


    /**
     * Sets the shipTo value for this TransactionSearchRowBasic.
     * 
     * @param shipTo
     */
    public void setShipTo(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shipTo) {
        this.shipTo = shipTo;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getShipTo(int i) {
        return this.shipTo[i];
    }

    public void setShipTo(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.shipTo[i] = _value;
    }


    /**
     * Gets the shipZip value for this TransactionSearchRowBasic.
     * 
     * @return shipZip
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this TransactionSearchRowBasic.
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
     * Gets the signedAmount value for this TransactionSearchRowBasic.
     * 
     * @return signedAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getSignedAmount() {
        return signedAmount;
    }


    /**
     * Sets the signedAmount value for this TransactionSearchRowBasic.
     * 
     * @param signedAmount
     */
    public void setSignedAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] signedAmount) {
        this.signedAmount = signedAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getSignedAmount(int i) {
        return this.signedAmount[i];
    }

    public void setSignedAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.signedAmount[i] = _value;
    }


    /**
     * Gets the source value for this TransactionSearchRowBasic.
     * 
     * @return source
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSource() {
        return source;
    }


    /**
     * Sets the source value for this TransactionSearchRowBasic.
     * 
     * @param source
     */
    public void setSource(org.mule.module.netsuite.api.internal.SearchColumnStringField[] source) {
        this.source = source;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.source[i] = _value;
    }


    /**
     * Gets the startDate value for this TransactionSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TransactionSearchRowBasic.
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
     * Gets the status value for this TransactionSearchRowBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TransactionSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status) {
        this.status = status;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the subsidiary value for this TransactionSearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TransactionSearchRowBasic.
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
     * Gets the taxAmount value for this TransactionSearchRowBasic.
     * 
     * @return taxAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TransactionSearchRowBasic.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] taxAmount) {
        this.taxAmount = taxAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTaxAmount(int i) {
        return this.taxAmount[i];
    }

    public void setTaxAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.taxAmount[i] = _value;
    }


    /**
     * Gets the taxCode value for this TransactionSearchRowBasic.
     * 
     * @return taxCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this TransactionSearchRowBasic.
     * 
     * @param taxCode
     */
    public void setTaxCode(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxCode) {
        this.taxCode = taxCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTaxCode(int i) {
        return this.taxCode[i];
    }

    public void setTaxCode(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.taxCode[i] = _value;
    }


    /**
     * Gets the taxLine value for this TransactionSearchRowBasic.
     * 
     * @return taxLine
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getTaxLine() {
        return taxLine;
    }


    /**
     * Sets the taxLine value for this TransactionSearchRowBasic.
     * 
     * @param taxLine
     */
    public void setTaxLine(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] taxLine) {
        this.taxLine = taxLine;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getTaxLine(int i) {
        return this.taxLine[i];
    }

    public void setTaxLine(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.taxLine[i] = _value;
    }


    /**
     * Gets the taxPeriod value for this TransactionSearchRowBasic.
     * 
     * @return taxPeriod
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTaxPeriod() {
        return taxPeriod;
    }


    /**
     * Sets the taxPeriod value for this TransactionSearchRowBasic.
     * 
     * @param taxPeriod
     */
    public void setTaxPeriod(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTaxPeriod(int i) {
        return this.taxPeriod[i];
    }

    public void setTaxPeriod(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.taxPeriod[i] = _value;
    }


    /**
     * Gets the taxTotal value for this TransactionSearchRowBasic.
     * 
     * @return taxTotal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this TransactionSearchRowBasic.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] taxTotal) {
        this.taxTotal = taxTotal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTaxTotal(int i) {
        return this.taxTotal[i];
    }

    public void setTaxTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.taxTotal[i] = _value;
    }


    /**
     * Gets the termInMonths value for this TransactionSearchRowBasic.
     * 
     * @return termInMonths
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getTermInMonths() {
        return termInMonths;
    }


    /**
     * Sets the termInMonths value for this TransactionSearchRowBasic.
     * 
     * @param termInMonths
     */
    public void setTermInMonths(org.mule.module.netsuite.api.internal.SearchColumnLongField[] termInMonths) {
        this.termInMonths = termInMonths;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getTermInMonths(int i) {
        return this.termInMonths[i];
    }

    public void setTermInMonths(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.termInMonths[i] = _value;
    }


    /**
     * Gets the terms value for this TransactionSearchRowBasic.
     * 
     * @return terms
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTerms() {
        return terms;
    }


    /**
     * Sets the terms value for this TransactionSearchRowBasic.
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
     * Gets the title value for this TransactionSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TransactionSearchRowBasic.
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
     * Gets the toBeEmailed value for this TransactionSearchRowBasic.
     * 
     * @return toBeEmailed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this TransactionSearchRowBasic.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getToBeEmailed(int i) {
        return this.toBeEmailed[i];
    }

    public void setToBeEmailed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.toBeEmailed[i] = _value;
    }


    /**
     * Gets the toBePrinted value for this TransactionSearchRowBasic.
     * 
     * @return toBePrinted
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this TransactionSearchRowBasic.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] toBePrinted) {
        this.toBePrinted = toBePrinted;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getToBePrinted(int i) {
        return this.toBePrinted[i];
    }

    public void setToBePrinted(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.toBePrinted[i] = _value;
    }


    /**
     * Gets the toSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @return toSubsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this TransactionSearchRowBasic.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getToSubsidiary(int i) {
        return this.toSubsidiary[i];
    }

    public void setToSubsidiary(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.toSubsidiary[i] = _value;
    }


    /**
     * Gets the total value for this TransactionSearchRowBasic.
     * 
     * @return total
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTotal() {
        return total;
    }


    /**
     * Sets the total value for this TransactionSearchRowBasic.
     * 
     * @param total
     */
    public void setTotal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] total) {
        this.total = total;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTotal(int i) {
        return this.total[i];
    }

    public void setTotal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.total[i] = _value;
    }


    /**
     * Gets the totalCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @return totalCostEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this TransactionSearchRowBasic.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTotalCostEstimate(int i) {
        return this.totalCostEstimate[i];
    }

    public void setTotalCostEstimate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.totalCostEstimate[i] = _value;
    }


    /**
     * Gets the trackingNumbers value for this TransactionSearchRowBasic.
     * 
     * @return trackingNumbers
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this TransactionSearchRowBasic.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(org.mule.module.netsuite.api.internal.SearchColumnStringField[] trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTrackingNumbers(int i) {
        return this.trackingNumbers[i];
    }

    public void setTrackingNumbers(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.trackingNumbers[i] = _value;
    }


    /**
     * Gets the tranDate value for this TransactionSearchRowBasic.
     * 
     * @return tranDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this TransactionSearchRowBasic.
     * 
     * @param tranDate
     */
    public void setTranDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] tranDate) {
        this.tranDate = tranDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getTranDate(int i) {
        return this.tranDate[i];
    }

    public void setTranDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.tranDate[i] = _value;
    }


    /**
     * Gets the tranEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return tranEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTranEstGrossProfit() {
        return tranEstGrossProfit;
    }


    /**
     * Sets the tranEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param tranEstGrossProfit
     */
    public void setTranEstGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTranEstGrossProfit(int i) {
        return this.tranEstGrossProfit[i];
    }

    public void setTranEstGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.tranEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranFxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @return tranFxEstGrossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTranFxEstGrossProfit() {
        return tranFxEstGrossProfit;
    }


    /**
     * Sets the tranFxEstGrossProfit value for this TransactionSearchRowBasic.
     * 
     * @param tranFxEstGrossProfit
     */
    public void setTranFxEstGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTranFxEstGrossProfit(int i) {
        return this.tranFxEstGrossProfit[i];
    }

    public void setTranFxEstGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.tranFxEstGrossProfit[i] = _value;
    }


    /**
     * Gets the tranId value for this TransactionSearchRowBasic.
     * 
     * @return tranId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this TransactionSearchRowBasic.
     * 
     * @param tranId
     */
    public void setTranId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] tranId) {
        this.tranId = tranId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTranId(int i) {
        return this.tranId[i];
    }

    public void setTranId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.tranId[i] = _value;
    }


    /**
     * Gets the tranIsVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @return tranIsVsoeBundle
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this TransactionSearchRowBasic.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getTranIsVsoeBundle(int i) {
        return this.tranIsVsoeBundle[i];
    }

    public void setTranIsVsoeBundle(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.tranIsVsoeBundle[i] = _value;
    }


    /**
     * Gets the transactionLineType value for this TransactionSearchRowBasic.
     * 
     * @return transactionLineType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getTransactionLineType() {
        return transactionLineType;
    }


    /**
     * Sets the transactionLineType value for this TransactionSearchRowBasic.
     * 
     * @param transactionLineType
     */
    public void setTransactionLineType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] transactionLineType) {
        this.transactionLineType = transactionLineType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getTransactionLineType(int i) {
        return this.transactionLineType[i];
    }

    public void setTransactionLineType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.transactionLineType[i] = _value;
    }


    /**
     * Gets the transferLocation value for this TransactionSearchRowBasic.
     * 
     * @return transferLocation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTransferLocation() {
        return transferLocation;
    }


    /**
     * Sets the transferLocation value for this TransactionSearchRowBasic.
     * 
     * @param transferLocation
     */
    public void setTransferLocation(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] transferLocation) {
        this.transferLocation = transferLocation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTransferLocation(int i) {
        return this.transferLocation[i];
    }

    public void setTransferLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.transferLocation[i] = _value;
    }


    /**
     * Gets the transferOrderItemLine value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderItemLine
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTransferOrderItemLine() {
        return transferOrderItemLine;
    }


    /**
     * Sets the transferOrderItemLine value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderItemLine
     */
    public void setTransferOrderItemLine(org.mule.module.netsuite.api.internal.SearchColumnStringField[] transferOrderItemLine) {
        this.transferOrderItemLine = transferOrderItemLine;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTransferOrderItemLine(int i) {
        return this.transferOrderItemLine[i];
    }

    public void setTransferOrderItemLine(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.transferOrderItemLine[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTransferOrderQuantityCommitted() {
        return transferOrderQuantityCommitted;
    }


    /**
     * Sets the transferOrderQuantityCommitted value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityCommitted
     */
    public void setTransferOrderQuantityCommitted(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityCommitted) {
        this.transferOrderQuantityCommitted = transferOrderQuantityCommitted;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTransferOrderQuantityCommitted(int i) {
        return this.transferOrderQuantityCommitted[i];
    }

    public void setTransferOrderQuantityCommitted(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.transferOrderQuantityCommitted[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityPacked value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityPacked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTransferOrderQuantityPacked() {
        return transferOrderQuantityPacked;
    }


    /**
     * Sets the transferOrderQuantityPacked value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityPacked
     */
    public void setTransferOrderQuantityPacked(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityPacked) {
        this.transferOrderQuantityPacked = transferOrderQuantityPacked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTransferOrderQuantityPacked(int i) {
        return this.transferOrderQuantityPacked[i];
    }

    public void setTransferOrderQuantityPacked(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.transferOrderQuantityPacked[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityPicked value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityPicked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTransferOrderQuantityPicked() {
        return transferOrderQuantityPicked;
    }


    /**
     * Sets the transferOrderQuantityPicked value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityPicked
     */
    public void setTransferOrderQuantityPicked(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityPicked) {
        this.transferOrderQuantityPicked = transferOrderQuantityPicked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTransferOrderQuantityPicked(int i) {
        return this.transferOrderQuantityPicked[i];
    }

    public void setTransferOrderQuantityPicked(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.transferOrderQuantityPicked[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityReceived value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityReceived
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTransferOrderQuantityReceived() {
        return transferOrderQuantityReceived;
    }


    /**
     * Sets the transferOrderQuantityReceived value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityReceived
     */
    public void setTransferOrderQuantityReceived(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityReceived) {
        this.transferOrderQuantityReceived = transferOrderQuantityReceived;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTransferOrderQuantityReceived(int i) {
        return this.transferOrderQuantityReceived[i];
    }

    public void setTransferOrderQuantityReceived(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.transferOrderQuantityReceived[i] = _value;
    }


    /**
     * Gets the transferOrderQuantityShipped value for this TransactionSearchRowBasic.
     * 
     * @return transferOrderQuantityShipped
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTransferOrderQuantityShipped() {
        return transferOrderQuantityShipped;
    }


    /**
     * Sets the transferOrderQuantityShipped value for this TransactionSearchRowBasic.
     * 
     * @param transferOrderQuantityShipped
     */
    public void setTransferOrderQuantityShipped(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferOrderQuantityShipped) {
        this.transferOrderQuantityShipped = transferOrderQuantityShipped;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTransferOrderQuantityShipped(int i) {
        return this.transferOrderQuantityShipped[i];
    }

    public void setTransferOrderQuantityShipped(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.transferOrderQuantityShipped[i] = _value;
    }


    /**
     * Gets the type value for this TransactionSearchRowBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this TransactionSearchRowBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the unit value for this TransactionSearchRowBasic.
     * 
     * @return unit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this TransactionSearchRowBasic.
     * 
     * @param unit
     */
    public void setUnit(org.mule.module.netsuite.api.internal.SearchColumnStringField[] unit) {
        this.unit = unit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getUnit(int i) {
        return this.unit[i];
    }

    public void setUnit(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.unit[i] = _value;
    }


    /**
     * Gets the unitCostOverride value for this TransactionSearchRowBasic.
     * 
     * @return unitCostOverride
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getUnitCostOverride() {
        return unitCostOverride;
    }


    /**
     * Sets the unitCostOverride value for this TransactionSearchRowBasic.
     * 
     * @param unitCostOverride
     */
    public void setUnitCostOverride(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCostOverride) {
        this.unitCostOverride = unitCostOverride;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getUnitCostOverride(int i) {
        return this.unitCostOverride[i];
    }

    public void setUnitCostOverride(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.unitCostOverride[i] = _value;
    }


    /**
     * Gets the vendType value for this TransactionSearchRowBasic.
     * 
     * @return vendType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getVendType() {
        return vendType;
    }


    /**
     * Sets the vendType value for this TransactionSearchRowBasic.
     * 
     * @param vendType
     */
    public void setVendType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendType) {
        this.vendType = vendType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getVendType(int i) {
        return this.vendType[i];
    }

    public void setVendType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.vendType[i] = _value;
    }


    /**
     * Gets the visibleToCustomer value for this TransactionSearchRowBasic.
     * 
     * @return visibleToCustomer
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getVisibleToCustomer() {
        return visibleToCustomer;
    }


    /**
     * Sets the visibleToCustomer value for this TransactionSearchRowBasic.
     * 
     * @param visibleToCustomer
     */
    public void setVisibleToCustomer(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] visibleToCustomer) {
        this.visibleToCustomer = visibleToCustomer;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getVisibleToCustomer(int i) {
        return this.visibleToCustomer[i];
    }

    public void setVisibleToCustomer(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.visibleToCustomer[i] = _value;
    }


    /**
     * Gets the vsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @return vsoeAllocation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this TransactionSearchRowBasic.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getVsoeAllocation(int i) {
        return this.vsoeAllocation[i];
    }

    public void setVsoeAllocation(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.vsoeAllocation[i] = _value;
    }


    /**
     * Gets the vsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @return vsoeAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getVsoeAmount() {
        return vsoeAmount;
    }


    /**
     * Sets the vsoeAmount value for this TransactionSearchRowBasic.
     * 
     * @param vsoeAmount
     */
    public void setVsoeAmount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getVsoeAmount(int i) {
        return this.vsoeAmount[i];
    }

    public void setVsoeAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.vsoeAmount[i] = _value;
    }


    /**
     * Gets the vsoeDeferral value for this TransactionSearchRowBasic.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this TransactionSearchRowBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getVsoeDeferral(int i) {
        return this.vsoeDeferral[i];
    }

    public void setVsoeDeferral(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.vsoeDeferral[i] = _value;
    }


    /**
     * Gets the vsoeDelivered value for this TransactionSearchRowBasic.
     * 
     * @return vsoeDelivered
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this TransactionSearchRowBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getVsoeDelivered(int i) {
        return this.vsoeDelivered[i];
    }

    public void setVsoeDelivered(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.vsoeDelivered[i] = _value;
    }


    /**
     * Gets the vsoePermitDiscount value for this TransactionSearchRowBasic.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this TransactionSearchRowBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getVsoePermitDiscount(int i) {
        return this.vsoePermitDiscount[i];
    }

    public void setVsoePermitDiscount(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.vsoePermitDiscount[i] = _value;
    }


    /**
     * Gets the vsoePrice value for this TransactionSearchRowBasic.
     * 
     * @return vsoePrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this TransactionSearchRowBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getVsoePrice(int i) {
        return this.vsoePrice[i];
    }

    public void setVsoePrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.vsoePrice[i] = _value;
    }


    /**
     * Gets the webSite value for this TransactionSearchRowBasic.
     * 
     * @return webSite
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this TransactionSearchRowBasic.
     * 
     * @param webSite
     */
    public void setWebSite(org.mule.module.netsuite.api.internal.SearchColumnStringField[] webSite) {
        this.webSite = webSite;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getWebSite(int i) {
        return this.webSite[i];
    }

    public void setWebSite(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.webSite[i] = _value;
    }


    /**
     * Gets the customFieldList value for this TransactionSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TransactionSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchRowBasic)) return false;
        TransactionSearchRowBasic other = (TransactionSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abbrev==null && other.getAbbrev()==null) || 
             (this.abbrev!=null &&
              java.util.Arrays.equals(this.abbrev, other.getAbbrev()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              java.util.Arrays.equals(this.account, other.getAccount()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              java.util.Arrays.equals(this.accountType, other.getAccountType()))) &&
            ((this.actualShipDate==null && other.getActualShipDate()==null) || 
             (this.actualShipDate!=null &&
              java.util.Arrays.equals(this.actualShipDate, other.getActualShipDate()))) &&
            ((this.altSalesAmount==null && other.getAltSalesAmount()==null) || 
             (this.altSalesAmount!=null &&
              java.util.Arrays.equals(this.altSalesAmount, other.getAltSalesAmount()))) &&
            ((this.altSalesNetAmount==null && other.getAltSalesNetAmount()==null) || 
             (this.altSalesNetAmount!=null &&
              java.util.Arrays.equals(this.altSalesNetAmount, other.getAltSalesNetAmount()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              java.util.Arrays.equals(this.amount, other.getAmount()))) &&
            ((this.amountPaid==null && other.getAmountPaid()==null) || 
             (this.amountPaid!=null &&
              java.util.Arrays.equals(this.amountPaid, other.getAmountPaid()))) &&
            ((this.amountRemaining==null && other.getAmountRemaining()==null) || 
             (this.amountRemaining!=null &&
              java.util.Arrays.equals(this.amountRemaining, other.getAmountRemaining()))) &&
            ((this.amountUnbilled==null && other.getAmountUnbilled()==null) || 
             (this.amountUnbilled!=null &&
              java.util.Arrays.equals(this.amountUnbilled, other.getAmountUnbilled()))) &&
            ((this.appliedToForeignAmount==null && other.getAppliedToForeignAmount()==null) || 
             (this.appliedToForeignAmount!=null &&
              java.util.Arrays.equals(this.appliedToForeignAmount, other.getAppliedToForeignAmount()))) &&
            ((this.appliedToIsFxVariance==null && other.getAppliedToIsFxVariance()==null) || 
             (this.appliedToIsFxVariance!=null &&
              java.util.Arrays.equals(this.appliedToIsFxVariance, other.getAppliedToIsFxVariance()))) &&
            ((this.appliedToLinkAmount==null && other.getAppliedToLinkAmount()==null) || 
             (this.appliedToLinkAmount!=null &&
              java.util.Arrays.equals(this.appliedToLinkAmount, other.getAppliedToLinkAmount()))) &&
            ((this.appliedToLinkType==null && other.getAppliedToLinkType()==null) || 
             (this.appliedToLinkType!=null &&
              java.util.Arrays.equals(this.appliedToLinkType, other.getAppliedToLinkType()))) &&
            ((this.appliedToTransaction==null && other.getAppliedToTransaction()==null) || 
             (this.appliedToTransaction!=null &&
              java.util.Arrays.equals(this.appliedToTransaction, other.getAppliedToTransaction()))) &&
            ((this.applyingForeignAmount==null && other.getApplyingForeignAmount()==null) || 
             (this.applyingForeignAmount!=null &&
              java.util.Arrays.equals(this.applyingForeignAmount, other.getApplyingForeignAmount()))) &&
            ((this.applyingIsFxVariance==null && other.getApplyingIsFxVariance()==null) || 
             (this.applyingIsFxVariance!=null &&
              java.util.Arrays.equals(this.applyingIsFxVariance, other.getApplyingIsFxVariance()))) &&
            ((this.applyingLinkAmount==null && other.getApplyingLinkAmount()==null) || 
             (this.applyingLinkAmount!=null &&
              java.util.Arrays.equals(this.applyingLinkAmount, other.getApplyingLinkAmount()))) &&
            ((this.applyingLinkType==null && other.getApplyingLinkType()==null) || 
             (this.applyingLinkType!=null &&
              java.util.Arrays.equals(this.applyingLinkType, other.getApplyingLinkType()))) &&
            ((this.applyingTransaction==null && other.getApplyingTransaction()==null) || 
             (this.applyingTransaction!=null &&
              java.util.Arrays.equals(this.applyingTransaction, other.getApplyingTransaction()))) &&
            ((this.authCode==null && other.getAuthCode()==null) || 
             (this.authCode!=null &&
              java.util.Arrays.equals(this.authCode, other.getAuthCode()))) &&
            ((this.avsStreetMatch==null && other.getAvsStreetMatch()==null) || 
             (this.avsStreetMatch!=null &&
              java.util.Arrays.equals(this.avsStreetMatch, other.getAvsStreetMatch()))) &&
            ((this.avsZipMatch==null && other.getAvsZipMatch()==null) || 
             (this.avsZipMatch!=null &&
              java.util.Arrays.equals(this.avsZipMatch, other.getAvsZipMatch()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              java.util.Arrays.equals(this.billable, other.getBillable()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              java.util.Arrays.equals(this.billAddress, other.getBillAddress()))) &&
            ((this.billAddress1==null && other.getBillAddress1()==null) || 
             (this.billAddress1!=null &&
              java.util.Arrays.equals(this.billAddress1, other.getBillAddress1()))) &&
            ((this.billAddress2==null && other.getBillAddress2()==null) || 
             (this.billAddress2!=null &&
              java.util.Arrays.equals(this.billAddress2, other.getBillAddress2()))) &&
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
            ((this.billedDate==null && other.getBilledDate()==null) || 
             (this.billedDate!=null &&
              java.util.Arrays.equals(this.billedDate, other.getBilledDate()))) &&
            ((this.billingAmount==null && other.getBillingAmount()==null) || 
             (this.billingAmount!=null &&
              java.util.Arrays.equals(this.billingAmount, other.getBillingAmount()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              java.util.Arrays.equals(this.billingSchedule, other.getBillingSchedule()))) &&
            ((this.billingTransaction==null && other.getBillingTransaction()==null) || 
             (this.billingTransaction!=null &&
              java.util.Arrays.equals(this.billingTransaction, other.getBillingTransaction()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              java.util.Arrays.equals(this.billPhone, other.getBillPhone()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              java.util.Arrays.equals(this.billState, other.getBillState()))) &&
            ((this.billVarianceStatus==null && other.getBillVarianceStatus()==null) || 
             (this.billVarianceStatus!=null &&
              java.util.Arrays.equals(this.billVarianceStatus, other.getBillVarianceStatus()))) &&
            ((this.billZip==null && other.getBillZip()==null) || 
             (this.billZip!=null &&
              java.util.Arrays.equals(this.billZip, other.getBillZip()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              java.util.Arrays.equals(this.binNumber, other.getBinNumber()))) &&
            ((this.binNumberQuantity==null && other.getBinNumberQuantity()==null) || 
             (this.binNumberQuantity!=null &&
              java.util.Arrays.equals(this.binNumberQuantity, other.getBinNumberQuantity()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              java.util.Arrays.equals(this.buildEntireAssembly, other.getBuildEntireAssembly()))) &&
            ((this.buildVariance==null && other.getBuildVariance()==null) || 
             (this.buildVariance!=null &&
              java.util.Arrays.equals(this.buildVariance, other.getBuildVariance()))) &&
            ((this.built==null && other.getBuilt()==null) || 
             (this.built!=null &&
              java.util.Arrays.equals(this.built, other.getBuilt()))) &&
            ((this.ccCustomerCode==null && other.getCcCustomerCode()==null) || 
             (this.ccCustomerCode!=null &&
              java.util.Arrays.equals(this.ccCustomerCode, other.getCcCustomerCode()))) &&
            ((this.ccExpDate==null && other.getCcExpDate()==null) || 
             (this.ccExpDate!=null &&
              java.util.Arrays.equals(this.ccExpDate, other.getCcExpDate()))) &&
            ((this.ccHolderName==null && other.getCcHolderName()==null) || 
             (this.ccHolderName!=null &&
              java.util.Arrays.equals(this.ccHolderName, other.getCcHolderName()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              java.util.Arrays.equals(this.ccNumber, other.getCcNumber()))) &&
            ((this.ccStreet==null && other.getCcStreet()==null) || 
             (this.ccStreet!=null &&
              java.util.Arrays.equals(this.ccStreet, other.getCcStreet()))) &&
            ((this.ccZipCode==null && other.getCcZipCode()==null) || 
             (this.ccZipCode!=null &&
              java.util.Arrays.equals(this.ccZipCode, other.getCcZipCode()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.cleared==null && other.getCleared()==null) || 
             (this.cleared!=null &&
              java.util.Arrays.equals(this.cleared, other.getCleared()))) &&
            ((this.closed==null && other.getClosed()==null) || 
             (this.closed!=null &&
              java.util.Arrays.equals(this.closed, other.getClosed()))) &&
            ((this.closeDate==null && other.getCloseDate()==null) || 
             (this.closeDate!=null &&
              java.util.Arrays.equals(this.closeDate, other.getCloseDate()))) &&
            ((this.cogsAmount==null && other.getCogsAmount()==null) || 
             (this.cogsAmount!=null &&
              java.util.Arrays.equals(this.cogsAmount, other.getCogsAmount()))) &&
            ((this.commissionEffectiveDate==null && other.getCommissionEffectiveDate()==null) || 
             (this.commissionEffectiveDate!=null &&
              java.util.Arrays.equals(this.commissionEffectiveDate, other.getCommissionEffectiveDate()))) &&
            ((this.commit==null && other.getCommit()==null) || 
             (this.commit!=null &&
              java.util.Arrays.equals(this.commit, other.getCommit()))) &&
            ((this.confirmationNumber==null && other.getConfirmationNumber()==null) || 
             (this.confirmationNumber!=null &&
              java.util.Arrays.equals(this.confirmationNumber, other.getConfirmationNumber()))) &&
            ((this.contribution==null && other.getContribution()==null) || 
             (this.contribution!=null &&
              java.util.Arrays.equals(this.contribution, other.getContribution()))) &&
            ((this.contributionPrimary==null && other.getContributionPrimary()==null) || 
             (this.contributionPrimary!=null &&
              java.util.Arrays.equals(this.contributionPrimary, other.getContributionPrimary()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              java.util.Arrays.equals(this.costEstimate, other.getCostEstimate()))) &&
            ((this.costEstimateRate==null && other.getCostEstimateRate()==null) || 
             (this.costEstimateRate!=null &&
              java.util.Arrays.equals(this.costEstimateRate, other.getCostEstimateRate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              java.util.Arrays.equals(this.costEstimateType, other.getCostEstimateType()))) &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              java.util.Arrays.equals(this.createdBy, other.getCreatedBy()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              java.util.Arrays.equals(this.createdFrom, other.getCreatedFrom()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              java.util.Arrays.equals(this.creditAmount, other.getCreditAmount()))) &&
            ((this.cscMatch==null && other.getCscMatch()==null) || 
             (this.cscMatch!=null &&
              java.util.Arrays.equals(this.cscMatch, other.getCscMatch()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              java.util.Arrays.equals(this.currency, other.getCurrency()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              java.util.Arrays.equals(this.customForm, other.getCustomForm()))) &&
            ((this.custType==null && other.getCustType()==null) || 
             (this.custType!=null &&
              java.util.Arrays.equals(this.custType, other.getCustType()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.daysOpen==null && other.getDaysOpen()==null) || 
             (this.daysOpen!=null &&
              java.util.Arrays.equals(this.daysOpen, other.getDaysOpen()))) &&
            ((this.daysOverdue==null && other.getDaysOverdue()==null) || 
             (this.daysOverdue!=null &&
              java.util.Arrays.equals(this.daysOverdue, other.getDaysOverdue()))) &&
            ((this.debitAmount==null && other.getDebitAmount()==null) || 
             (this.debitAmount!=null &&
              java.util.Arrays.equals(this.debitAmount, other.getDebitAmount()))) &&
            ((this.deferredRevenue==null && other.getDeferredRevenue()==null) || 
             (this.deferredRevenue!=null &&
              java.util.Arrays.equals(this.deferredRevenue, other.getDeferredRevenue()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              java.util.Arrays.equals(this.deferRevRec, other.getDeferRevRec()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.depositDate==null && other.getDepositDate()==null) || 
             (this.depositDate!=null &&
              java.util.Arrays.equals(this.depositDate, other.getDepositDate()))) &&
            ((this.depositTransaction==null && other.getDepositTransaction()==null) || 
             (this.depositTransaction!=null &&
              java.util.Arrays.equals(this.depositTransaction, other.getDepositTransaction()))) &&
            ((this.discountAmount==null && other.getDiscountAmount()==null) || 
             (this.discountAmount!=null &&
              java.util.Arrays.equals(this.discountAmount, other.getDiscountAmount()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              java.util.Arrays.equals(this.dueDate, other.getDueDate()))) &&
            ((this.effectiveRate==null && other.getEffectiveRate()==null) || 
             (this.effectiveRate!=null &&
              java.util.Arrays.equals(this.effectiveRate, other.getEffectiveRate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              java.util.Arrays.equals(this.entity, other.getEntity()))) &&
            ((this.entityStatus==null && other.getEntityStatus()==null) || 
             (this.entityStatus!=null &&
              java.util.Arrays.equals(this.entityStatus, other.getEntityStatus()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              java.util.Arrays.equals(this.estGrossProfit, other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPct==null && other.getEstGrossProfitPct()==null) || 
             (this.estGrossProfitPct!=null &&
              java.util.Arrays.equals(this.estGrossProfitPct, other.getEstGrossProfitPct()))) &&
            ((this.estGrossProfitPercent==null && other.getEstGrossProfitPercent()==null) || 
             (this.estGrossProfitPercent!=null &&
              java.util.Arrays.equals(this.estGrossProfitPercent, other.getEstGrossProfitPercent()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              java.util.Arrays.equals(this.exchangeRate, other.getExchangeRate()))) &&
            ((this.excludeCommission==null && other.getExcludeCommission()==null) || 
             (this.excludeCommission!=null &&
              java.util.Arrays.equals(this.excludeCommission, other.getExcludeCommission()))) &&
            ((this.expectedCloseDate==null && other.getExpectedCloseDate()==null) || 
             (this.expectedCloseDate!=null &&
              java.util.Arrays.equals(this.expectedCloseDate, other.getExpectedCloseDate()))) &&
            ((this.expenseCategory==null && other.getExpenseCategory()==null) || 
             (this.expenseCategory!=null &&
              java.util.Arrays.equals(this.expenseCategory, other.getExpenseCategory()))) &&
            ((this.expenseDate==null && other.getExpenseDate()==null) || 
             (this.expenseDate!=null &&
              java.util.Arrays.equals(this.expenseDate, other.getExpenseDate()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.forecastType==null && other.getForecastType()==null) || 
             (this.forecastType!=null &&
              java.util.Arrays.equals(this.forecastType, other.getForecastType()))) &&
            ((this.fulfillingTransaction==null && other.getFulfillingTransaction()==null) || 
             (this.fulfillingTransaction!=null &&
              java.util.Arrays.equals(this.fulfillingTransaction, other.getFulfillingTransaction()))) &&
            ((this.fxAmount==null && other.getFxAmount()==null) || 
             (this.fxAmount!=null &&
              java.util.Arrays.equals(this.fxAmount, other.getFxAmount()))) &&
            ((this.fxCostEstimate==null && other.getFxCostEstimate()==null) || 
             (this.fxCostEstimate!=null &&
              java.util.Arrays.equals(this.fxCostEstimate, other.getFxCostEstimate()))) &&
            ((this.fxCostEstimateRate==null && other.getFxCostEstimateRate()==null) || 
             (this.fxCostEstimateRate!=null &&
              java.util.Arrays.equals(this.fxCostEstimateRate, other.getFxCostEstimateRate()))) &&
            ((this.fxEstGrossProfit==null && other.getFxEstGrossProfit()==null) || 
             (this.fxEstGrossProfit!=null &&
              java.util.Arrays.equals(this.fxEstGrossProfit, other.getFxEstGrossProfit()))) &&
            ((this.fxTranCostEstimate==null && other.getFxTranCostEstimate()==null) || 
             (this.fxTranCostEstimate!=null &&
              java.util.Arrays.equals(this.fxTranCostEstimate, other.getFxTranCostEstimate()))) &&
            ((this.fxVsoeAllocation==null && other.getFxVsoeAllocation()==null) || 
             (this.fxVsoeAllocation!=null &&
              java.util.Arrays.equals(this.fxVsoeAllocation, other.getFxVsoeAllocation()))) &&
            ((this.fxVsoeAmount==null && other.getFxVsoeAmount()==null) || 
             (this.fxVsoeAmount!=null &&
              java.util.Arrays.equals(this.fxVsoeAmount, other.getFxVsoeAmount()))) &&
            ((this.fxVsoePrice==null && other.getFxVsoePrice()==null) || 
             (this.fxVsoePrice!=null &&
              java.util.Arrays.equals(this.fxVsoePrice, other.getFxVsoePrice()))) &&
            ((this.gcoAvailabelToCharge==null && other.getGcoAvailabelToCharge()==null) || 
             (this.gcoAvailabelToCharge!=null &&
              java.util.Arrays.equals(this.gcoAvailabelToCharge, other.getGcoAvailabelToCharge()))) &&
            ((this.gcoAvailableToRefund==null && other.getGcoAvailableToRefund()==null) || 
             (this.gcoAvailableToRefund!=null &&
              java.util.Arrays.equals(this.gcoAvailableToRefund, other.getGcoAvailableToRefund()))) &&
            ((this.gcoAvsStreetMatch==null && other.getGcoAvsStreetMatch()==null) || 
             (this.gcoAvsStreetMatch!=null &&
              java.util.Arrays.equals(this.gcoAvsStreetMatch, other.getGcoAvsStreetMatch()))) &&
            ((this.gcoAvsZipMatch==null && other.getGcoAvsZipMatch()==null) || 
             (this.gcoAvsZipMatch!=null &&
              java.util.Arrays.equals(this.gcoAvsZipMatch, other.getGcoAvsZipMatch()))) &&
            ((this.gcoBuyerAccountAge==null && other.getGcoBuyerAccountAge()==null) || 
             (this.gcoBuyerAccountAge!=null &&
              java.util.Arrays.equals(this.gcoBuyerAccountAge, other.getGcoBuyerAccountAge()))) &&
            ((this.gcoBuyerIp==null && other.getGcoBuyerIp()==null) || 
             (this.gcoBuyerIp!=null &&
              java.util.Arrays.equals(this.gcoBuyerIp, other.getGcoBuyerIp()))) &&
            ((this.gcoChargeAmount==null && other.getGcoChargeAmount()==null) || 
             (this.gcoChargeAmount!=null &&
              java.util.Arrays.equals(this.gcoChargeAmount, other.getGcoChargeAmount()))) &&
            ((this.gcoChargebackAmount==null && other.getGcoChargebackAmount()==null) || 
             (this.gcoChargebackAmount!=null &&
              java.util.Arrays.equals(this.gcoChargebackAmount, other.getGcoChargebackAmount()))) &&
            ((this.gcoConfirmedChargedTotal==null && other.getGcoConfirmedChargedTotal()==null) || 
             (this.gcoConfirmedChargedTotal!=null &&
              java.util.Arrays.equals(this.gcoConfirmedChargedTotal, other.getGcoConfirmedChargedTotal()))) &&
            ((this.gcoConfirmedRefundedTotal==null && other.getGcoConfirmedRefundedTotal()==null) || 
             (this.gcoConfirmedRefundedTotal!=null &&
              java.util.Arrays.equals(this.gcoConfirmedRefundedTotal, other.getGcoConfirmedRefundedTotal()))) &&
            ((this.gcoCreditcardNumber==null && other.getGcoCreditcardNumber()==null) || 
             (this.gcoCreditcardNumber!=null &&
              java.util.Arrays.equals(this.gcoCreditcardNumber, other.getGcoCreditcardNumber()))) &&
            ((this.gcoCscMatch==null && other.getGcoCscMatch()==null) || 
             (this.gcoCscMatch!=null &&
              java.util.Arrays.equals(this.gcoCscMatch, other.getGcoCscMatch()))) &&
            ((this.gcoFinancialState==null && other.getGcoFinancialState()==null) || 
             (this.gcoFinancialState!=null &&
              java.util.Arrays.equals(this.gcoFinancialState, other.getGcoFinancialState()))) &&
            ((this.gcoFulfillmentState==null && other.getGcoFulfillmentState()==null) || 
             (this.gcoFulfillmentState!=null &&
              java.util.Arrays.equals(this.gcoFulfillmentState, other.getGcoFulfillmentState()))) &&
            ((this.gcoOrderId==null && other.getGcoOrderId()==null) || 
             (this.gcoOrderId!=null &&
              java.util.Arrays.equals(this.gcoOrderId, other.getGcoOrderId()))) &&
            ((this.gcoOrderTotal==null && other.getGcoOrderTotal()==null) || 
             (this.gcoOrderTotal!=null &&
              java.util.Arrays.equals(this.gcoOrderTotal, other.getGcoOrderTotal()))) &&
            ((this.gcoPromotionAmount==null && other.getGcoPromotionAmount()==null) || 
             (this.gcoPromotionAmount!=null &&
              java.util.Arrays.equals(this.gcoPromotionAmount, other.getGcoPromotionAmount()))) &&
            ((this.gcoPromotionName==null && other.getGcoPromotionName()==null) || 
             (this.gcoPromotionName!=null &&
              java.util.Arrays.equals(this.gcoPromotionName, other.getGcoPromotionName()))) &&
            ((this.gcoRefundAmount==null && other.getGcoRefundAmount()==null) || 
             (this.gcoRefundAmount!=null &&
              java.util.Arrays.equals(this.gcoRefundAmount, other.getGcoRefundAmount()))) &&
            ((this.gcoShippingTotal==null && other.getGcoShippingTotal()==null) || 
             (this.gcoShippingTotal!=null &&
              java.util.Arrays.equals(this.gcoShippingTotal, other.getGcoShippingTotal()))) &&
            ((this.gcoStateChangedDetail==null && other.getGcoStateChangedDetail()==null) || 
             (this.gcoStateChangedDetail!=null &&
              java.util.Arrays.equals(this.gcoStateChangedDetail, other.getGcoStateChangedDetail()))) &&
            ((this.giftCert==null && other.getGiftCert()==null) || 
             (this.giftCert!=null &&
              java.util.Arrays.equals(this.giftCert, other.getGiftCert()))) &&
            ((this.grossAmount==null && other.getGrossAmount()==null) || 
             (this.grossAmount!=null &&
              java.util.Arrays.equals(this.grossAmount, other.getGrossAmount()))) &&
            ((this.includeInForecast==null && other.getIncludeInForecast()==null) || 
             (this.includeInForecast!=null &&
              java.util.Arrays.equals(this.includeInForecast, other.getIncludeInForecast()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.inVsoeBundle==null && other.getInVsoeBundle()==null) || 
             (this.inVsoeBundle!=null &&
              java.util.Arrays.equals(this.inVsoeBundle, other.getInVsoeBundle()))) &&
            ((this.isAllocation==null && other.getIsAllocation()==null) || 
             (this.isAllocation!=null &&
              java.util.Arrays.equals(this.isAllocation, other.getIsAllocation()))) &&
            ((this.isGcoChargeback==null && other.getIsGcoChargeback()==null) || 
             (this.isGcoChargeback!=null &&
              java.util.Arrays.equals(this.isGcoChargeback, other.getIsGcoChargeback()))) &&
            ((this.isGcoChargeConfirmed==null && other.getIsGcoChargeConfirmed()==null) || 
             (this.isGcoChargeConfirmed!=null &&
              java.util.Arrays.equals(this.isGcoChargeConfirmed, other.getIsGcoChargeConfirmed()))) &&
            ((this.isGcoPaymentGuaranteed==null && other.getIsGcoPaymentGuaranteed()==null) || 
             (this.isGcoPaymentGuaranteed!=null &&
              java.util.Arrays.equals(this.isGcoPaymentGuaranteed, other.getIsGcoPaymentGuaranteed()))) &&
            ((this.isGcoRefundConfirmed==null && other.getIsGcoRefundConfirmed()==null) || 
             (this.isGcoRefundConfirmed!=null &&
              java.util.Arrays.equals(this.isGcoRefundConfirmed, other.getIsGcoRefundConfirmed()))) &&
            ((this.isIntercompanyAdjustment==null && other.getIsIntercompanyAdjustment()==null) || 
             (this.isIntercompanyAdjustment!=null &&
              java.util.Arrays.equals(this.isIntercompanyAdjustment, other.getIsIntercompanyAdjustment()))) &&
            ((this.isReversal==null && other.getIsReversal()==null) || 
             (this.isReversal!=null &&
              java.util.Arrays.equals(this.isReversal, other.getIsReversal()))) &&
            ((this.isRevRecTransaction==null && other.getIsRevRecTransaction()==null) || 
             (this.isRevRecTransaction!=null &&
              java.util.Arrays.equals(this.isRevRecTransaction, other.getIsRevRecTransaction()))) &&
            ((this.isShipAddress==null && other.getIsShipAddress()==null) || 
             (this.isShipAddress!=null &&
              java.util.Arrays.equals(this.isShipAddress, other.getIsShipAddress()))) &&
            ((this.isTransferPriceCosting==null && other.getIsTransferPriceCosting()==null) || 
             (this.isTransferPriceCosting!=null &&
              java.util.Arrays.equals(this.isTransferPriceCosting, other.getIsTransferPriceCosting()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              java.util.Arrays.equals(this.leadSource, other.getLeadSource()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              java.util.Arrays.equals(this.line, other.getLine()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.mainLine==null && other.getMainLine()==null) || 
             (this.mainLine!=null &&
              java.util.Arrays.equals(this.mainLine, other.getMainLine()))) &&
            ((this.mainName==null && other.getMainName()==null) || 
             (this.mainName!=null &&
              java.util.Arrays.equals(this.mainName, other.getMainName()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              java.util.Arrays.equals(this.matchBillToReceipt, other.getMatchBillToReceipt()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.memoMain==null && other.getMemoMain()==null) || 
             (this.memoMain!=null &&
              java.util.Arrays.equals(this.memoMain, other.getMemoMain()))) &&
            ((this.memorized==null && other.getMemorized()==null) || 
             (this.memorized!=null &&
              java.util.Arrays.equals(this.memorized, other.getMemorized()))) &&
            ((this.merchantAccount==null && other.getMerchantAccount()==null) || 
             (this.merchantAccount!=null &&
              java.util.Arrays.equals(this.merchantAccount, other.getMerchantAccount()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.multiSubsidiary==null && other.getMultiSubsidiary()==null) || 
             (this.multiSubsidiary!=null &&
              java.util.Arrays.equals(this.multiSubsidiary, other.getMultiSubsidiary()))) &&
            ((this.netAmount==null && other.getNetAmount()==null) || 
             (this.netAmount!=null &&
              java.util.Arrays.equals(this.netAmount, other.getNetAmount()))) &&
            ((this.netAmountNoTax==null && other.getNetAmountNoTax()==null) || 
             (this.netAmountNoTax!=null &&
              java.util.Arrays.equals(this.netAmountNoTax, other.getNetAmountNoTax()))) &&
            ((this.nextBillDate==null && other.getNextBillDate()==null) || 
             (this.nextBillDate!=null &&
              java.util.Arrays.equals(this.nextBillDate, other.getNextBillDate()))) &&
            ((this.opportunity==null && other.getOpportunity()==null) || 
             (this.opportunity!=null &&
              java.util.Arrays.equals(this.opportunity, other.getOpportunity()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            ((this.originator==null && other.getOriginator()==null) || 
             (this.originator!=null &&
              java.util.Arrays.equals(this.originator, other.getOriginator()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              java.util.Arrays.equals(this.otherRefNum, other.getOtherRefNum()))) &&
            ((this.packageCount==null && other.getPackageCount()==null) || 
             (this.packageCount!=null &&
              java.util.Arrays.equals(this.packageCount, other.getPackageCount()))) &&
            ((this.paidAmount==null && other.getPaidAmount()==null) || 
             (this.paidAmount!=null &&
              java.util.Arrays.equals(this.paidAmount, other.getPaidAmount()))) &&
            ((this.paidTransaction==null && other.getPaidTransaction()==null) || 
             (this.paidTransaction!=null &&
              java.util.Arrays.equals(this.paidTransaction, other.getPaidTransaction()))) &&
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
            ((this.payingAmount==null && other.getPayingAmount()==null) || 
             (this.payingAmount!=null &&
              java.util.Arrays.equals(this.payingAmount, other.getPayingAmount()))) &&
            ((this.payingTransaction==null && other.getPayingTransaction()==null) || 
             (this.payingTransaction!=null &&
              java.util.Arrays.equals(this.payingTransaction, other.getPayingTransaction()))) &&
            ((this.paymentEventDate==null && other.getPaymentEventDate()==null) || 
             (this.paymentEventDate!=null &&
              java.util.Arrays.equals(this.paymentEventDate, other.getPaymentEventDate()))) &&
            ((this.paymentEventHoldReason==null && other.getPaymentEventHoldReason()==null) || 
             (this.paymentEventHoldReason!=null &&
              java.util.Arrays.equals(this.paymentEventHoldReason, other.getPaymentEventHoldReason()))) &&
            ((this.paymentEventResult==null && other.getPaymentEventResult()==null) || 
             (this.paymentEventResult!=null &&
              java.util.Arrays.equals(this.paymentEventResult, other.getPaymentEventResult()))) &&
            ((this.paymentEventType==null && other.getPaymentEventType()==null) || 
             (this.paymentEventType!=null &&
              java.util.Arrays.equals(this.paymentEventType, other.getPaymentEventType()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              java.util.Arrays.equals(this.paymentMethod, other.getPaymentMethod()))) &&
            ((this.payPalPending==null && other.getPayPalPending()==null) || 
             (this.payPalPending!=null &&
              java.util.Arrays.equals(this.payPalPending, other.getPayPalPending()))) &&
            ((this.payPalStatus==null && other.getPayPalStatus()==null) || 
             (this.payPalStatus!=null &&
              java.util.Arrays.equals(this.payPalStatus, other.getPayPalStatus()))) &&
            ((this.payPalTranId==null && other.getPayPalTranId()==null) || 
             (this.payPalTranId!=null &&
              java.util.Arrays.equals(this.payPalTranId, other.getPayPalTranId()))) &&
            ((this.payrollBatch==null && other.getPayrollBatch()==null) || 
             (this.payrollBatch!=null &&
              java.util.Arrays.equals(this.payrollBatch, other.getPayrollBatch()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              java.util.Arrays.equals(this.pnRefNum, other.getPnRefNum()))) &&
            ((this.poRate==null && other.getPoRate()==null) || 
             (this.poRate!=null &&
              java.util.Arrays.equals(this.poRate, other.getPoRate()))) &&
            ((this.posting==null && other.getPosting()==null) || 
             (this.posting!=null &&
              java.util.Arrays.equals(this.posting, other.getPosting()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              java.util.Arrays.equals(this.postingPeriod, other.getPostingPeriod()))) &&
            ((this.priceLevel==null && other.getPriceLevel()==null) || 
             (this.priceLevel!=null &&
              java.util.Arrays.equals(this.priceLevel, other.getPriceLevel()))) &&
            ((this.print==null && other.getPrint()==null) || 
             (this.print!=null &&
              java.util.Arrays.equals(this.print, other.getPrint()))) &&
            ((this.probability==null && other.getProbability()==null) || 
             (this.probability!=null &&
              java.util.Arrays.equals(this.probability, other.getProbability()))) &&
            ((this.projectedAmount==null && other.getProjectedAmount()==null) || 
             (this.projectedAmount!=null &&
              java.util.Arrays.equals(this.projectedAmount, other.getProjectedAmount()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              java.util.Arrays.equals(this.promoCode, other.getPromoCode()))) &&
            ((this.purchaseOrder==null && other.getPurchaseOrder()==null) || 
             (this.purchaseOrder!=null &&
              java.util.Arrays.equals(this.purchaseOrder, other.getPurchaseOrder()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              java.util.Arrays.equals(this.quantity, other.getQuantity()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              java.util.Arrays.equals(this.quantityBilled, other.getQuantityBilled()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              java.util.Arrays.equals(this.quantityCommitted, other.getQuantityCommitted()))) &&
            ((this.quantityPacked==null && other.getQuantityPacked()==null) || 
             (this.quantityPacked!=null &&
              java.util.Arrays.equals(this.quantityPacked, other.getQuantityPacked()))) &&
            ((this.quantityPicked==null && other.getQuantityPicked()==null) || 
             (this.quantityPicked!=null &&
              java.util.Arrays.equals(this.quantityPicked, other.getQuantityPicked()))) &&
            ((this.quantityRevCommitted==null && other.getQuantityRevCommitted()==null) || 
             (this.quantityRevCommitted!=null &&
              java.util.Arrays.equals(this.quantityRevCommitted, other.getQuantityRevCommitted()))) &&
            ((this.quantityShipRecv==null && other.getQuantityShipRecv()==null) || 
             (this.quantityShipRecv!=null &&
              java.util.Arrays.equals(this.quantityShipRecv, other.getQuantityShipRecv()))) &&
            ((this.quantityUom==null && other.getQuantityUom()==null) || 
             (this.quantityUom!=null &&
              java.util.Arrays.equals(this.quantityUom, other.getQuantityUom()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              java.util.Arrays.equals(this.rate, other.getRate()))) &&
            ((this.realizedGainPostingTransaction==null && other.getRealizedGainPostingTransaction()==null) || 
             (this.realizedGainPostingTransaction!=null &&
              java.util.Arrays.equals(this.realizedGainPostingTransaction, other.getRealizedGainPostingTransaction()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              java.util.Arrays.equals(this.recognizedRevenue, other.getRecognizedRevenue()))) &&
            ((this.revCommitStatus==null && other.getRevCommitStatus()==null) || 
             (this.revCommitStatus!=null &&
              java.util.Arrays.equals(this.revCommitStatus, other.getRevCommitStatus()))) &&
            ((this.revCommittingTransaction==null && other.getRevCommittingTransaction()==null) || 
             (this.revCommittingTransaction!=null &&
              java.util.Arrays.equals(this.revCommittingTransaction, other.getRevCommittingTransaction()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              java.util.Arrays.equals(this.revenueStatus, other.getRevenueStatus()))) &&
            ((this.reversalDate==null && other.getReversalDate()==null) || 
             (this.reversalDate!=null &&
              java.util.Arrays.equals(this.reversalDate, other.getReversalDate()))) &&
            ((this.reversalNumber==null && other.getReversalNumber()==null) || 
             (this.reversalNumber!=null &&
              java.util.Arrays.equals(this.reversalNumber, other.getReversalNumber()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              java.util.Arrays.equals(this.revRecEndDate, other.getRevRecEndDate()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              java.util.Arrays.equals(this.revRecOnRevCommitment, other.getRevRecOnRevCommitment()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              java.util.Arrays.equals(this.revRecStartDate, other.getRevRecStartDate()))) &&
            ((this.rgAccount==null && other.getRgAccount()==null) || 
             (this.rgAccount!=null &&
              java.util.Arrays.equals(this.rgAccount, other.getRgAccount()))) &&
            ((this.rgAmount==null && other.getRgAmount()==null) || 
             (this.rgAmount!=null &&
              java.util.Arrays.equals(this.rgAmount, other.getRgAmount()))) &&
            ((this.salesEffectiveDate==null && other.getSalesEffectiveDate()==null) || 
             (this.salesEffectiveDate!=null &&
              java.util.Arrays.equals(this.salesEffectiveDate, other.getSalesEffectiveDate()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              java.util.Arrays.equals(this.salesRep, other.getSalesRep()))) &&
            ((this.salesTeamMember==null && other.getSalesTeamMember()==null) || 
             (this.salesTeamMember!=null &&
              java.util.Arrays.equals(this.salesTeamMember, other.getSalesTeamMember()))) &&
            ((this.salesTeamRole==null && other.getSalesTeamRole()==null) || 
             (this.salesTeamRole!=null &&
              java.util.Arrays.equals(this.salesTeamRole, other.getSalesTeamRole()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              java.util.Arrays.equals(this.serialNumber, other.getSerialNumber()))) &&
            ((this.serialNumberQuantity==null && other.getSerialNumberQuantity()==null) || 
             (this.serialNumberQuantity!=null &&
              java.util.Arrays.equals(this.serialNumberQuantity, other.getSerialNumberQuantity()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              java.util.Arrays.equals(this.serialNumbers, other.getSerialNumbers()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              java.util.Arrays.equals(this.shipAddress, other.getShipAddress()))) &&
            ((this.shipAddress1==null && other.getShipAddress1()==null) || 
             (this.shipAddress1!=null &&
              java.util.Arrays.equals(this.shipAddress1, other.getShipAddress1()))) &&
            ((this.shipAddress2==null && other.getShipAddress2()==null) || 
             (this.shipAddress2!=null &&
              java.util.Arrays.equals(this.shipAddress2, other.getShipAddress2()))) &&
            ((this.shipAddressee==null && other.getShipAddressee()==null) || 
             (this.shipAddressee!=null &&
              java.util.Arrays.equals(this.shipAddressee, other.getShipAddressee()))) &&
            ((this.shipAttention==null && other.getShipAttention()==null) || 
             (this.shipAttention!=null &&
              java.util.Arrays.equals(this.shipAttention, other.getShipAttention()))) &&
            ((this.shipCity==null && other.getShipCity()==null) || 
             (this.shipCity!=null &&
              java.util.Arrays.equals(this.shipCity, other.getShipCity()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              java.util.Arrays.equals(this.shipComplete, other.getShipComplete()))) &&
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              java.util.Arrays.equals(this.shipCountry, other.getShipCountry()))) &&
            ((this.shipCountryCode==null && other.getShipCountryCode()==null) || 
             (this.shipCountryCode!=null &&
              java.util.Arrays.equals(this.shipCountryCode, other.getShipCountryCode()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              java.util.Arrays.equals(this.shipDate, other.getShipDate()))) &&
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              java.util.Arrays.equals(this.shipGroup, other.getShipGroup()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              java.util.Arrays.equals(this.shipMethod, other.getShipMethod()))) &&
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              java.util.Arrays.equals(this.shipPhone, other.getShipPhone()))) &&
            ((this.shippingAmount==null && other.getShippingAmount()==null) || 
             (this.shippingAmount!=null &&
              java.util.Arrays.equals(this.shippingAmount, other.getShippingAmount()))) &&
            ((this.shipRecvStatusLine==null && other.getShipRecvStatusLine()==null) || 
             (this.shipRecvStatusLine!=null &&
              java.util.Arrays.equals(this.shipRecvStatusLine, other.getShipRecvStatusLine()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              java.util.Arrays.equals(this.shipState, other.getShipState()))) &&
            ((this.shipTo==null && other.getShipTo()==null) || 
             (this.shipTo!=null &&
              java.util.Arrays.equals(this.shipTo, other.getShipTo()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              java.util.Arrays.equals(this.shipZip, other.getShipZip()))) &&
            ((this.signedAmount==null && other.getSignedAmount()==null) || 
             (this.signedAmount!=null &&
              java.util.Arrays.equals(this.signedAmount, other.getSignedAmount()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              java.util.Arrays.equals(this.source, other.getSource()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              java.util.Arrays.equals(this.taxAmount, other.getTaxAmount()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              java.util.Arrays.equals(this.taxCode, other.getTaxCode()))) &&
            ((this.taxLine==null && other.getTaxLine()==null) || 
             (this.taxLine!=null &&
              java.util.Arrays.equals(this.taxLine, other.getTaxLine()))) &&
            ((this.taxPeriod==null && other.getTaxPeriod()==null) || 
             (this.taxPeriod!=null &&
              java.util.Arrays.equals(this.taxPeriod, other.getTaxPeriod()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              java.util.Arrays.equals(this.taxTotal, other.getTaxTotal()))) &&
            ((this.termInMonths==null && other.getTermInMonths()==null) || 
             (this.termInMonths!=null &&
              java.util.Arrays.equals(this.termInMonths, other.getTermInMonths()))) &&
            ((this.terms==null && other.getTerms()==null) || 
             (this.terms!=null &&
              java.util.Arrays.equals(this.terms, other.getTerms()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              java.util.Arrays.equals(this.toBeEmailed, other.getToBeEmailed()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              java.util.Arrays.equals(this.toBePrinted, other.getToBePrinted()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              java.util.Arrays.equals(this.toSubsidiary, other.getToSubsidiary()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              java.util.Arrays.equals(this.total, other.getTotal()))) &&
            ((this.totalCostEstimate==null && other.getTotalCostEstimate()==null) || 
             (this.totalCostEstimate!=null &&
              java.util.Arrays.equals(this.totalCostEstimate, other.getTotalCostEstimate()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              java.util.Arrays.equals(this.trackingNumbers, other.getTrackingNumbers()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              java.util.Arrays.equals(this.tranDate, other.getTranDate()))) &&
            ((this.tranEstGrossProfit==null && other.getTranEstGrossProfit()==null) || 
             (this.tranEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranEstGrossProfit, other.getTranEstGrossProfit()))) &&
            ((this.tranFxEstGrossProfit==null && other.getTranFxEstGrossProfit()==null) || 
             (this.tranFxEstGrossProfit!=null &&
              java.util.Arrays.equals(this.tranFxEstGrossProfit, other.getTranFxEstGrossProfit()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              java.util.Arrays.equals(this.tranId, other.getTranId()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              java.util.Arrays.equals(this.tranIsVsoeBundle, other.getTranIsVsoeBundle()))) &&
            ((this.transactionLineType==null && other.getTransactionLineType()==null) || 
             (this.transactionLineType!=null &&
              java.util.Arrays.equals(this.transactionLineType, other.getTransactionLineType()))) &&
            ((this.transferLocation==null && other.getTransferLocation()==null) || 
             (this.transferLocation!=null &&
              java.util.Arrays.equals(this.transferLocation, other.getTransferLocation()))) &&
            ((this.transferOrderItemLine==null && other.getTransferOrderItemLine()==null) || 
             (this.transferOrderItemLine!=null &&
              java.util.Arrays.equals(this.transferOrderItemLine, other.getTransferOrderItemLine()))) &&
            ((this.transferOrderQuantityCommitted==null && other.getTransferOrderQuantityCommitted()==null) || 
             (this.transferOrderQuantityCommitted!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityCommitted, other.getTransferOrderQuantityCommitted()))) &&
            ((this.transferOrderQuantityPacked==null && other.getTransferOrderQuantityPacked()==null) || 
             (this.transferOrderQuantityPacked!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityPacked, other.getTransferOrderQuantityPacked()))) &&
            ((this.transferOrderQuantityPicked==null && other.getTransferOrderQuantityPicked()==null) || 
             (this.transferOrderQuantityPicked!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityPicked, other.getTransferOrderQuantityPicked()))) &&
            ((this.transferOrderQuantityReceived==null && other.getTransferOrderQuantityReceived()==null) || 
             (this.transferOrderQuantityReceived!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityReceived, other.getTransferOrderQuantityReceived()))) &&
            ((this.transferOrderQuantityShipped==null && other.getTransferOrderQuantityShipped()==null) || 
             (this.transferOrderQuantityShipped!=null &&
              java.util.Arrays.equals(this.transferOrderQuantityShipped, other.getTransferOrderQuantityShipped()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              java.util.Arrays.equals(this.unit, other.getUnit()))) &&
            ((this.unitCostOverride==null && other.getUnitCostOverride()==null) || 
             (this.unitCostOverride!=null &&
              java.util.Arrays.equals(this.unitCostOverride, other.getUnitCostOverride()))) &&
            ((this.vendType==null && other.getVendType()==null) || 
             (this.vendType!=null &&
              java.util.Arrays.equals(this.vendType, other.getVendType()))) &&
            ((this.visibleToCustomer==null && other.getVisibleToCustomer()==null) || 
             (this.visibleToCustomer!=null &&
              java.util.Arrays.equals(this.visibleToCustomer, other.getVisibleToCustomer()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              java.util.Arrays.equals(this.vsoeAllocation, other.getVsoeAllocation()))) &&
            ((this.vsoeAmount==null && other.getVsoeAmount()==null) || 
             (this.vsoeAmount!=null &&
              java.util.Arrays.equals(this.vsoeAmount, other.getVsoeAmount()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              java.util.Arrays.equals(this.vsoeDeferral, other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              java.util.Arrays.equals(this.vsoeDelivered, other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              java.util.Arrays.equals(this.vsoePermitDiscount, other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              java.util.Arrays.equals(this.vsoePrice, other.getVsoePrice()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              java.util.Arrays.equals(this.webSite, other.getWebSite()))) &&
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
        if (getAbbrev() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbbrev());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbbrev(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualShipDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualShipDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualShipDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltSalesAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltSalesAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltSalesAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAltSalesNetAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAltSalesNetAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAltSalesNetAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountPaid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountPaid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountPaid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountRemaining(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAmountUnbilled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAmountUnbilled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAmountUnbilled(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToForeignAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToForeignAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToForeignAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToIsFxVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToIsFxVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToIsFxVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToLinkAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToLinkAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToLinkAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToLinkType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToLinkType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToLinkType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppliedToTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppliedToTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppliedToTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingForeignAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingForeignAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingForeignAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingIsFxVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingIsFxVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingIsFxVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingLinkAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingLinkAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingLinkAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingLinkType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingLinkType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingLinkType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplyingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplyingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplyingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvsStreetMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvsStreetMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvsStreetMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvsZipMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvsZipMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvsZipMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillable(), i);
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
        if (getBilledDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBilledDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBilledDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillingAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingAmount(), i);
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
        if (getBillingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingTransaction(), i);
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
        if (getBillVarianceStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillVarianceStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillVarianceStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillZip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinNumberQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumberQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumberQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildEntireAssembly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildEntireAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildEntireAssembly(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuilt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuilt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuilt(), i);
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
        if (getCcStreet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcStreet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcStreet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCcZipCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCcZipCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCcZipCode(), i);
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
        if (getCleared() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCleared());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCleared(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClosed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClosed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClosed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCloseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCogsAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCogsAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCogsAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommissionEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommissionEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommissionEffectiveDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCommit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCommit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCommit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfirmationNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfirmationNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfirmationNumber(), i);
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
        if (getCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimateRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimateRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimateRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedBy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedBy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedBy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedFrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedFrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedFrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreditAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreditAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreditAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCscMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCscMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCscMatch(), i);
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
        if (getCustomForm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomForm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomForm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustType(), i);
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
        if (getDaysOpen() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysOpen());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysOpen(), i);
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
        if (getDebitAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDebitAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDebitAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferredRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferredRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferredRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferRevRec() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferRevRec());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferRevRec(), i);
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
        if (getDepositDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepositTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepositTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepositTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDiscountAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDiscountAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDiscountAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDueDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDueDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDueDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectiveRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectiveRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectiveRate(), i);
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
        if (getEntity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEntity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEntity(), i);
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
        if (getEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstGrossProfitPct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstGrossProfitPct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstGrossProfitPct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstGrossProfitPercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstGrossProfitPercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstGrossProfitPercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExchangeRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExchangeRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExchangeRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeCommission() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeCommission());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeCommission(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpectedCloseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpectedCloseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpectedCloseDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseDate(), i);
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
        if (getForecastType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getForecastType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getForecastType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFulfillingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFulfillingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFulfillingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxCostEstimateRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxCostEstimateRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxCostEstimateRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxTranCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxTranCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxTranCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxVsoeAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxVsoeAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxVsoeAllocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxVsoeAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxVsoeAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxVsoeAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxVsoePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxVsoePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxVsoePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvailabelToCharge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvailabelToCharge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvailabelToCharge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvailableToRefund() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvailableToRefund());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvailableToRefund(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvsStreetMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvsStreetMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvsStreetMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoAvsZipMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoAvsZipMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoAvsZipMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoBuyerAccountAge() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoBuyerAccountAge());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoBuyerAccountAge(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoBuyerIp() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoBuyerIp());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoBuyerIp(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoChargeAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoChargeAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoChargeAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoChargebackAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoChargebackAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoChargebackAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoConfirmedChargedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoConfirmedChargedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoConfirmedChargedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoConfirmedRefundedTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoConfirmedRefundedTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoConfirmedRefundedTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoCreditcardNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoCreditcardNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoCreditcardNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoCscMatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoCscMatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoCscMatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoFinancialState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoFinancialState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoFinancialState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoFulfillmentState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoFulfillmentState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoFulfillmentState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoOrderId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoOrderId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoOrderId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoOrderTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoOrderTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoOrderTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoPromotionAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoPromotionAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoPromotionAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoPromotionName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoPromotionName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoPromotionName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoRefundAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoRefundAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoRefundAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoShippingTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoShippingTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoShippingTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGcoStateChangedDetail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGcoStateChangedDetail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGcoStateChangedDetail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrossAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncludeInForecast() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncludeInForecast());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncludeInForecast(), i);
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
        if (getInVsoeBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInVsoeBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInVsoeBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsAllocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoChargeback() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoChargeback());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoChargeback(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoChargeConfirmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoChargeConfirmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoChargeConfirmed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoPaymentGuaranteed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoPaymentGuaranteed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoPaymentGuaranteed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoRefundConfirmed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoRefundConfirmed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoRefundConfirmed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsIntercompanyAdjustment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsIntercompanyAdjustment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsIntercompanyAdjustment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsReversal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsReversal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsReversal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsRevRecTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsRevRecTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsRevRecTransaction(), i);
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
        if (getIsTransferPriceCosting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsTransferPriceCosting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsTransferPriceCosting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItem(), i);
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
        if (getLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLine(), i);
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
        if (getMainLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMainLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMainLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMainName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMainName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMainName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatchBillToReceipt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchBillToReceipt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchBillToReceipt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemoMain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemoMain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemoMain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemorized() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemorized());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemorized(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMerchantAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMerchantAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMerchantAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultiSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultiSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultiSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetAmountNoTax() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetAmountNoTax());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetAmountNoTax(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextBillDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextBillDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextBillDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOpportunity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOpportunity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOpportunity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOriginator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOriginator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherRefNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherRefNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherRefNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPackageCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPackageCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPackageCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaidAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaidAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaidAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaidTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaidTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaidTransaction(), i);
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
        if (getPayingAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayingAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayingAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventHoldReason() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventHoldReason());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventHoldReason(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentEventType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentEventType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentEventType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaymentMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaymentMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaymentMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalPending() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayPalPending());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayPalPending(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayPalStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayPalStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayPalTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayPalTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayPalTranId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollBatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollBatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollBatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPnRefNum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPnRefNum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPnRefNum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPoRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPoRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPoRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPosting() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosting());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosting(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPostingPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostingPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostingPeriod(), i);
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
        if (getPrint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProbability() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProbability());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProbability(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProjectedAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProjectedAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProjectedAmount(), i);
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
        if (getPurchaseOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityBilled() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityBilled());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityBilled(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityPacked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityPacked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityPacked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityPicked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityPicked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityPicked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityRevCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityRevCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityRevCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityShipRecv() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityShipRecv());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityShipRecv(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityUom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityUom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityUom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRealizedGainPostingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRealizedGainPostingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRealizedGainPostingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecognizedRevenue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecognizedRevenue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecognizedRevenue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevCommitStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevCommitStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevCommitStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevCommittingTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevCommittingTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevCommittingTransaction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevenueStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevenueStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevenueStatus(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReversalDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReversalDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReversalDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReversalNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReversalNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReversalNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecEndDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecEndDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecEndDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecOnRevCommitment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecOnRevCommitment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecOnRevCommitment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecStartDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecStartDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecStartDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRgAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRgAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRgAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRgAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRgAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRgAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesEffectiveDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesEffectiveDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesEffectiveDate(), i);
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
        if (getSerialNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumberQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumberQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumberQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumbers(), i);
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
        if (getShipDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipMethod(), i);
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
        if (getShippingAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipRecvStatusLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipRecvStatusLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipRecvStatusLine(), i);
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
        if (getShipTo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipTo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipTo(), i);
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
        if (getSignedAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSignedAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSignedAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSource(), i);
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
        if (getStatus() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatus());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatus(), i);
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
        if (getTaxAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxPeriod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxPeriod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxPeriod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTermInMonths() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTermInMonths());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTermInMonths(), i);
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
        if (getToBeEmailed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToBeEmailed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToBeEmailed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToBePrinted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToBePrinted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToBePrinted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getToSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getToSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getToSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackingNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackingNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackingNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranFxEstGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranFxEstGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranFxEstGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranIsVsoeBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranIsVsoeBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranIsVsoeBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransactionLineType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactionLineType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactionLineType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderItemLine() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderItemLine());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderItemLine(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityPacked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityPacked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityPacked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityPicked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityPicked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityPicked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityReceived() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityReceived());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityReceived(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferOrderQuantityShipped() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferOrderQuantityShipped());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferOrderQuantityShipped(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitCostOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitCostOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitCostOverride(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVisibleToCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVisibleToCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVisibleToCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeAllocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeAllocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeAllocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDeferral() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDeferral());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDeferral(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDelivered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDelivered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDelivered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePermitDiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePermitDiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePermitDiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebSite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebSite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebSite(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbrev");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "abbrev"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountUnbilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "amountUnbilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "appliedToTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingForeignAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingForeignAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingIsFxVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingIsFxVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingLinkAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingLinkType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingLinkType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "applyingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "avsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "avsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("billedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("billingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billingTransaction"));
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
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "built"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ccZipCode"));
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
        elemField.setFieldName("cleared");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cleared"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogsAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cogsAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commissionEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "commissionEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "confirmationNumber"));
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
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "custType"));
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
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "depositDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "depositTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "discountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectiveRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "effectiveRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estGrossProfitPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expenseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expenseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fulfillingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCostEstimateRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxCostEstimateRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxVsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxVsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxVsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxVsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailabelToCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvailabelToCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvailableToRefund");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvailableToRefund"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsStreetMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvsStreetMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoAvsZipMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoAvsZipMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerAccountAge");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoBuyerAccountAge"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoBuyerIp");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoBuyerIp"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoChargeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoChargebackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoChargebackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedChargedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoConfirmedChargedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoConfirmedRefundedTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoConfirmedRefundedTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCreditcardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoCreditcardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoCscMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoCscMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFinancialState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoFinancialState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoFulfillmentState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoFulfillmentState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoOrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoOrderTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoOrderTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoPromotionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoPromotionName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoPromotionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoRefundAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoRefundAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoShippingTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoShippingTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gcoStateChangedDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gcoStateChangedDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeInForecast");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "includeInForecast"));
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
        elemField.setFieldName("inVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "inVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeback");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoChargeback"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoChargeConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoChargeConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoPaymentGuaranteed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoPaymentGuaranteed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoRefundConfirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoRefundConfirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isIntercompanyAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isIntercompanyAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReversal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isReversal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRevRecTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isRevRecTransaction"));
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
        elemField.setFieldName("isTransferPriceCosting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isTransferPriceCosting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "mainLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mainName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "mainName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memoMain");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memoMain"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memorized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memorized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "merchantAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netAmountNoTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "netAmountNoTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextBillDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nextBillDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originator");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "originator"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "packageCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paidAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paidTransaction"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("payingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalPending");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payPalPending"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payrollBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "postingPeriod"));
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
        elemField.setFieldName("print");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "print"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "projectedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityShipRecv");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityShipRecv"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityUom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityUom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realizedGainPostingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "realizedGainPostingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingTransaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revCommittingTransaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reversalDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reversalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reversalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rgAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rgAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rgAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "rgAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumbers"));
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
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shippingAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipRecvStatusLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipRecvStatusLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("signedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "signedAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "source"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "termInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionLineType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transactionLineType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderItemLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderItemLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPacked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityPacked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityPicked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityPicked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferOrderQuantityShipped");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferOrderQuantityShipped"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCostOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitCostOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visibleToCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "visibleToCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "webSite"));
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
