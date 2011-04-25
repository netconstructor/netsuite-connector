/**
 * CashRefund.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CashRefund  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private org.mule.module.netsuite.api.internal.RecordRef entity;

    private java.lang.String vatRegNum;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private java.lang.String source;

    private org.mule.module.netsuite.api.internal.RecordRef createdFrom;

    private org.mule.module.netsuite.api.internal.RecordRef postingPeriod;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRef leadSource;

    private org.mule.module.netsuite.api.internal.RecordRef subsidiary;

    private org.mule.module.netsuite.api.internal.RecordRef salesRep;

    private org.mule.module.netsuite.api.internal.RecordRef partner;

    private java.lang.String contribPct;

    private java.lang.String otherRefNum;

    private java.lang.String memo;

    private java.util.Calendar salesEffectiveDate;

    private java.lang.Boolean refundCheck;

    private java.lang.Boolean toPrint2;

    private java.lang.Boolean excludeCommission;

    private java.lang.Double totalCostEstimate;

    private java.lang.Double estGrossProfit;

    private java.lang.Double estGrossProfitPercent;

    private org.mule.module.netsuite.api.internal.RecordRef account;

    private java.lang.Double exchangeRate;

    private java.lang.String currencyName;

    private org.mule.module.netsuite.api.internal.RecordRef promoCode;

    private org.mule.module.netsuite.api.internal.RecordRef discountItem;

    private java.lang.String discountRate;

    private java.lang.Boolean isTaxable;

    private org.mule.module.netsuite.api.internal.RecordRef taxItem;

    private java.lang.Double taxRate;

    private java.lang.Boolean toBePrinted;

    private java.lang.Boolean toBeEmailed;

    private java.lang.String email;

    private java.lang.Boolean toBeFaxed;

    private java.lang.String fax;

    private org.mule.module.netsuite.api.internal.RecordRef messageSel;

    private java.lang.String message;

    private org.mule.module.netsuite.api.internal.BillAddress transactionBillAddress;

    private org.mule.module.netsuite.api.internal.RecordRef billAddressList;

    private java.lang.String billAddress;

    private org.mule.module.netsuite.api.internal.RecordRef shipMethod;

    private org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode;

    private java.lang.Double shippingTax1Rate;

    private java.lang.String shippingTax2Rate;

    private java.lang.Double shippingCost;

    private org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode;

    private java.lang.Double handlingTax1Rate;

    private java.lang.String handlingTax2Rate;

    private java.lang.Double handlingCost;

    private org.mule.module.netsuite.api.internal.RecordRef salesGroup;

    private java.lang.Boolean syncSalesTeams;

    private org.mule.module.netsuite.api.internal.RecordRef paymentMethod;

    private org.mule.module.netsuite.api.internal.RevenueStatus revenueStatus;

    private java.lang.Double recognizedRevenue;

    private java.lang.Double deferredRevenue;

    private java.lang.Boolean revRecOnRevCommitment;

    private org.mule.module.netsuite.api.internal.RecordRef creditCard;

    private java.lang.Boolean chargeIt;

    private java.lang.String ccNumber;

    private java.util.Calendar ccExpireDate;

    private java.lang.String ccName;

    private java.lang.String ccStreet;

    private java.lang.String ccZipCode;

    private java.lang.Boolean ccApproved;

    private org.mule.module.netsuite.api.internal.RecordRef creditCardProcessor;

    private java.lang.String debitCardIssueNo;

    private java.lang.String pnRefNum;

    private java.util.Calendar validFrom;

    private java.lang.String payPalTranId;

    private java.lang.Double subTotal;

    private java.lang.Double discountTotal;

    private java.lang.Double taxTotal;

    private java.lang.Double tax2Total;

    private java.lang.Double altShippingCost;

    private java.lang.String payPalStatus;

    private java.lang.Double altHandlingCost;

    private java.lang.Double total;

    private java.lang.String payPalAuthId;

    private java.lang.String status;

    private org.mule.module.netsuite.api.internal.RecordRef job;

    private org.mule.module.netsuite.api.internal.RecordRef giftCert;

    private java.lang.Double giftCertTotal;

    private java.lang.Double giftCertApplied;

    private java.lang.Double giftCertAvailable;

    private java.lang.Boolean tranIsVsoeBundle;

    private java.lang.Boolean payPalProcess;

    private java.lang.Boolean vsoeAutoCalc;

    private java.lang.Boolean syncPartnerTeams;

    private org.mule.module.netsuite.api.internal.CashRefundItemList itemList;

    private org.mule.module.netsuite.api.internal.CashRefundSalesTeamList salesTeamList;

    private org.mule.module.netsuite.api.internal.CashRefundPartnersList partnersList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public CashRefund() {
    }

    public CashRefund(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           org.mule.module.netsuite.api.internal.RecordRef entity,
           java.lang.String vatRegNum,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           java.lang.String source,
           org.mule.module.netsuite.api.internal.RecordRef createdFrom,
           org.mule.module.netsuite.api.internal.RecordRef postingPeriod,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRef leadSource,
           org.mule.module.netsuite.api.internal.RecordRef subsidiary,
           org.mule.module.netsuite.api.internal.RecordRef salesRep,
           org.mule.module.netsuite.api.internal.RecordRef partner,
           java.lang.String contribPct,
           java.lang.String otherRefNum,
           java.lang.String memo,
           java.util.Calendar salesEffectiveDate,
           java.lang.Boolean refundCheck,
           java.lang.Boolean toPrint2,
           java.lang.Boolean excludeCommission,
           java.lang.Double totalCostEstimate,
           java.lang.Double estGrossProfit,
           java.lang.Double estGrossProfitPercent,
           org.mule.module.netsuite.api.internal.RecordRef account,
           java.lang.Double exchangeRate,
           java.lang.String currencyName,
           org.mule.module.netsuite.api.internal.RecordRef promoCode,
           org.mule.module.netsuite.api.internal.RecordRef discountItem,
           java.lang.String discountRate,
           java.lang.Boolean isTaxable,
           org.mule.module.netsuite.api.internal.RecordRef taxItem,
           java.lang.Double taxRate,
           java.lang.Boolean toBePrinted,
           java.lang.Boolean toBeEmailed,
           java.lang.String email,
           java.lang.Boolean toBeFaxed,
           java.lang.String fax,
           org.mule.module.netsuite.api.internal.RecordRef messageSel,
           java.lang.String message,
           org.mule.module.netsuite.api.internal.BillAddress transactionBillAddress,
           org.mule.module.netsuite.api.internal.RecordRef billAddressList,
           java.lang.String billAddress,
           org.mule.module.netsuite.api.internal.RecordRef shipMethod,
           org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode,
           java.lang.Double shippingTax1Rate,
           java.lang.String shippingTax2Rate,
           java.lang.Double shippingCost,
           org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode,
           java.lang.Double handlingTax1Rate,
           java.lang.String handlingTax2Rate,
           java.lang.Double handlingCost,
           org.mule.module.netsuite.api.internal.RecordRef salesGroup,
           java.lang.Boolean syncSalesTeams,
           org.mule.module.netsuite.api.internal.RecordRef paymentMethod,
           org.mule.module.netsuite.api.internal.RevenueStatus revenueStatus,
           java.lang.Double recognizedRevenue,
           java.lang.Double deferredRevenue,
           java.lang.Boolean revRecOnRevCommitment,
           org.mule.module.netsuite.api.internal.RecordRef creditCard,
           java.lang.Boolean chargeIt,
           java.lang.String ccNumber,
           java.util.Calendar ccExpireDate,
           java.lang.String ccName,
           java.lang.String ccStreet,
           java.lang.String ccZipCode,
           java.lang.Boolean ccApproved,
           org.mule.module.netsuite.api.internal.RecordRef creditCardProcessor,
           java.lang.String debitCardIssueNo,
           java.lang.String pnRefNum,
           java.util.Calendar validFrom,
           java.lang.String payPalTranId,
           java.lang.Double subTotal,
           java.lang.Double discountTotal,
           java.lang.Double taxTotal,
           java.lang.Double tax2Total,
           java.lang.Double altShippingCost,
           java.lang.String payPalStatus,
           java.lang.Double altHandlingCost,
           java.lang.Double total,
           java.lang.String payPalAuthId,
           java.lang.String status,
           org.mule.module.netsuite.api.internal.RecordRef job,
           org.mule.module.netsuite.api.internal.RecordRef giftCert,
           java.lang.Double giftCertTotal,
           java.lang.Double giftCertApplied,
           java.lang.Double giftCertAvailable,
           java.lang.Boolean tranIsVsoeBundle,
           java.lang.Boolean payPalProcess,
           java.lang.Boolean vsoeAutoCalc,
           java.lang.Boolean syncPartnerTeams,
           org.mule.module.netsuite.api.internal.CashRefundItemList itemList,
           org.mule.module.netsuite.api.internal.CashRefundSalesTeamList salesTeamList,
           org.mule.module.netsuite.api.internal.CashRefundPartnersList partnersList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.entity = entity;
        this.vatRegNum = vatRegNum;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.source = source;
        this.createdFrom = createdFrom;
        this.postingPeriod = postingPeriod;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.leadSource = leadSource;
        this.subsidiary = subsidiary;
        this.salesRep = salesRep;
        this.partner = partner;
        this.contribPct = contribPct;
        this.otherRefNum = otherRefNum;
        this.memo = memo;
        this.salesEffectiveDate = salesEffectiveDate;
        this.refundCheck = refundCheck;
        this.toPrint2 = toPrint2;
        this.excludeCommission = excludeCommission;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.account = account;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
        this.promoCode = promoCode;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.isTaxable = isTaxable;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.email = email;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.messageSel = messageSel;
        this.message = message;
        this.transactionBillAddress = transactionBillAddress;
        this.billAddressList = billAddressList;
        this.billAddress = billAddress;
        this.shipMethod = shipMethod;
        this.shippingTaxCode = shippingTaxCode;
        this.shippingTax1Rate = shippingTax1Rate;
        this.shippingTax2Rate = shippingTax2Rate;
        this.shippingCost = shippingCost;
        this.handlingTaxCode = handlingTaxCode;
        this.handlingTax1Rate = handlingTax1Rate;
        this.handlingTax2Rate = handlingTax2Rate;
        this.handlingCost = handlingCost;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.paymentMethod = paymentMethod;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.creditCard = creditCard;
        this.chargeIt = chargeIt;
        this.ccNumber = ccNumber;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.ccApproved = ccApproved;
        this.creditCardProcessor = creditCardProcessor;
        this.debitCardIssueNo = debitCardIssueNo;
        this.pnRefNum = pnRefNum;
        this.validFrom = validFrom;
        this.payPalTranId = payPalTranId;
        this.subTotal = subTotal;
        this.discountTotal = discountTotal;
        this.taxTotal = taxTotal;
        this.tax2Total = tax2Total;
        this.altShippingCost = altShippingCost;
        this.payPalStatus = payPalStatus;
        this.altHandlingCost = altHandlingCost;
        this.total = total;
        this.payPalAuthId = payPalAuthId;
        this.status = status;
        this.job = job;
        this.giftCert = giftCert;
        this.giftCertTotal = giftCertTotal;
        this.giftCertApplied = giftCertApplied;
        this.giftCertAvailable = giftCertAvailable;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.payPalProcess = payPalProcess;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.itemList = itemList;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this CashRefund.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CashRefund.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this CashRefund.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CashRefund.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this CashRefund.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this CashRefund.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the entity value for this CashRefund.
     * 
     * @return entity
     */
    public org.mule.module.netsuite.api.internal.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this CashRefund.
     * 
     * @param entity
     */
    public void setEntity(org.mule.module.netsuite.api.internal.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the vatRegNum value for this CashRefund.
     * 
     * @return vatRegNum
     */
    public java.lang.String getVatRegNum() {
        return vatRegNum;
    }


    /**
     * Sets the vatRegNum value for this CashRefund.
     * 
     * @param vatRegNum
     */
    public void setVatRegNum(java.lang.String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }


    /**
     * Gets the tranDate value for this CashRefund.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this CashRefund.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this CashRefund.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this CashRefund.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the source value for this CashRefund.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this CashRefund.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the createdFrom value for this CashRefund.
     * 
     * @return createdFrom
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this CashRefund.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(org.mule.module.netsuite.api.internal.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the postingPeriod value for this CashRefund.
     * 
     * @return postingPeriod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this CashRefund.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(org.mule.module.netsuite.api.internal.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the department value for this CashRefund.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CashRefund.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this CashRefund.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CashRefund.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this CashRefund.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CashRefund.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the leadSource value for this CashRefund.
     * 
     * @return leadSource
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLeadSource() {
        return leadSource;
    }


    /**
     * Sets the leadSource value for this CashRefund.
     * 
     * @param leadSource
     */
    public void setLeadSource(org.mule.module.netsuite.api.internal.RecordRef leadSource) {
        this.leadSource = leadSource;
    }


    /**
     * Gets the subsidiary value for this CashRefund.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this CashRefund.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the salesRep value for this CashRefund.
     * 
     * @return salesRep
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSalesRep() {
        return salesRep;
    }


    /**
     * Sets the salesRep value for this CashRefund.
     * 
     * @param salesRep
     */
    public void setSalesRep(org.mule.module.netsuite.api.internal.RecordRef salesRep) {
        this.salesRep = salesRep;
    }


    /**
     * Gets the partner value for this CashRefund.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this CashRefund.
     * 
     * @param partner
     */
    public void setPartner(org.mule.module.netsuite.api.internal.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the contribPct value for this CashRefund.
     * 
     * @return contribPct
     */
    public java.lang.String getContribPct() {
        return contribPct;
    }


    /**
     * Sets the contribPct value for this CashRefund.
     * 
     * @param contribPct
     */
    public void setContribPct(java.lang.String contribPct) {
        this.contribPct = contribPct;
    }


    /**
     * Gets the otherRefNum value for this CashRefund.
     * 
     * @return otherRefNum
     */
    public java.lang.String getOtherRefNum() {
        return otherRefNum;
    }


    /**
     * Sets the otherRefNum value for this CashRefund.
     * 
     * @param otherRefNum
     */
    public void setOtherRefNum(java.lang.String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }


    /**
     * Gets the memo value for this CashRefund.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this CashRefund.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the salesEffectiveDate value for this CashRefund.
     * 
     * @return salesEffectiveDate
     */
    public java.util.Calendar getSalesEffectiveDate() {
        return salesEffectiveDate;
    }


    /**
     * Sets the salesEffectiveDate value for this CashRefund.
     * 
     * @param salesEffectiveDate
     */
    public void setSalesEffectiveDate(java.util.Calendar salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }


    /**
     * Gets the refundCheck value for this CashRefund.
     * 
     * @return refundCheck
     */
    public java.lang.Boolean getRefundCheck() {
        return refundCheck;
    }


    /**
     * Sets the refundCheck value for this CashRefund.
     * 
     * @param refundCheck
     */
    public void setRefundCheck(java.lang.Boolean refundCheck) {
        this.refundCheck = refundCheck;
    }


    /**
     * Gets the toPrint2 value for this CashRefund.
     * 
     * @return toPrint2
     */
    public java.lang.Boolean getToPrint2() {
        return toPrint2;
    }


    /**
     * Sets the toPrint2 value for this CashRefund.
     * 
     * @param toPrint2
     */
    public void setToPrint2(java.lang.Boolean toPrint2) {
        this.toPrint2 = toPrint2;
    }


    /**
     * Gets the excludeCommission value for this CashRefund.
     * 
     * @return excludeCommission
     */
    public java.lang.Boolean getExcludeCommission() {
        return excludeCommission;
    }


    /**
     * Sets the excludeCommission value for this CashRefund.
     * 
     * @param excludeCommission
     */
    public void setExcludeCommission(java.lang.Boolean excludeCommission) {
        this.excludeCommission = excludeCommission;
    }


    /**
     * Gets the totalCostEstimate value for this CashRefund.
     * 
     * @return totalCostEstimate
     */
    public java.lang.Double getTotalCostEstimate() {
        return totalCostEstimate;
    }


    /**
     * Sets the totalCostEstimate value for this CashRefund.
     * 
     * @param totalCostEstimate
     */
    public void setTotalCostEstimate(java.lang.Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }


    /**
     * Gets the estGrossProfit value for this CashRefund.
     * 
     * @return estGrossProfit
     */
    public java.lang.Double getEstGrossProfit() {
        return estGrossProfit;
    }


    /**
     * Sets the estGrossProfit value for this CashRefund.
     * 
     * @param estGrossProfit
     */
    public void setEstGrossProfit(java.lang.Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }


    /**
     * Gets the estGrossProfitPercent value for this CashRefund.
     * 
     * @return estGrossProfitPercent
     */
    public java.lang.Double getEstGrossProfitPercent() {
        return estGrossProfitPercent;
    }


    /**
     * Sets the estGrossProfitPercent value for this CashRefund.
     * 
     * @param estGrossProfitPercent
     */
    public void setEstGrossProfitPercent(java.lang.Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }


    /**
     * Gets the account value for this CashRefund.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAccount() {
        return account;
    }


    /**
     * Sets the account value for this CashRefund.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.RecordRef account) {
        this.account = account;
    }


    /**
     * Gets the exchangeRate value for this CashRefund.
     * 
     * @return exchangeRate
     */
    public java.lang.Double getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this CashRefund.
     * 
     * @param exchangeRate
     */
    public void setExchangeRate(java.lang.Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }


    /**
     * Gets the currencyName value for this CashRefund.
     * 
     * @return currencyName
     */
    public java.lang.String getCurrencyName() {
        return currencyName;
    }


    /**
     * Sets the currencyName value for this CashRefund.
     * 
     * @param currencyName
     */
    public void setCurrencyName(java.lang.String currencyName) {
        this.currencyName = currencyName;
    }


    /**
     * Gets the promoCode value for this CashRefund.
     * 
     * @return promoCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this CashRefund.
     * 
     * @param promoCode
     */
    public void setPromoCode(org.mule.module.netsuite.api.internal.RecordRef promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the discountItem value for this CashRefund.
     * 
     * @return discountItem
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDiscountItem() {
        return discountItem;
    }


    /**
     * Sets the discountItem value for this CashRefund.
     * 
     * @param discountItem
     */
    public void setDiscountItem(org.mule.module.netsuite.api.internal.RecordRef discountItem) {
        this.discountItem = discountItem;
    }


    /**
     * Gets the discountRate value for this CashRefund.
     * 
     * @return discountRate
     */
    public java.lang.String getDiscountRate() {
        return discountRate;
    }


    /**
     * Sets the discountRate value for this CashRefund.
     * 
     * @param discountRate
     */
    public void setDiscountRate(java.lang.String discountRate) {
        this.discountRate = discountRate;
    }


    /**
     * Gets the isTaxable value for this CashRefund.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this CashRefund.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the taxItem value for this CashRefund.
     * 
     * @return taxItem
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxItem() {
        return taxItem;
    }


    /**
     * Sets the taxItem value for this CashRefund.
     * 
     * @param taxItem
     */
    public void setTaxItem(org.mule.module.netsuite.api.internal.RecordRef taxItem) {
        this.taxItem = taxItem;
    }


    /**
     * Gets the taxRate value for this CashRefund.
     * 
     * @return taxRate
     */
    public java.lang.Double getTaxRate() {
        return taxRate;
    }


    /**
     * Sets the taxRate value for this CashRefund.
     * 
     * @param taxRate
     */
    public void setTaxRate(java.lang.Double taxRate) {
        this.taxRate = taxRate;
    }


    /**
     * Gets the toBePrinted value for this CashRefund.
     * 
     * @return toBePrinted
     */
    public java.lang.Boolean getToBePrinted() {
        return toBePrinted;
    }


    /**
     * Sets the toBePrinted value for this CashRefund.
     * 
     * @param toBePrinted
     */
    public void setToBePrinted(java.lang.Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }


    /**
     * Gets the toBeEmailed value for this CashRefund.
     * 
     * @return toBeEmailed
     */
    public java.lang.Boolean getToBeEmailed() {
        return toBeEmailed;
    }


    /**
     * Sets the toBeEmailed value for this CashRefund.
     * 
     * @param toBeEmailed
     */
    public void setToBeEmailed(java.lang.Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }


    /**
     * Gets the email value for this CashRefund.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this CashRefund.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the toBeFaxed value for this CashRefund.
     * 
     * @return toBeFaxed
     */
    public java.lang.Boolean getToBeFaxed() {
        return toBeFaxed;
    }


    /**
     * Sets the toBeFaxed value for this CashRefund.
     * 
     * @param toBeFaxed
     */
    public void setToBeFaxed(java.lang.Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }


    /**
     * Gets the fax value for this CashRefund.
     * 
     * @return fax
     */
    public java.lang.String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this CashRefund.
     * 
     * @param fax
     */
    public void setFax(java.lang.String fax) {
        this.fax = fax;
    }


    /**
     * Gets the messageSel value for this CashRefund.
     * 
     * @return messageSel
     */
    public org.mule.module.netsuite.api.internal.RecordRef getMessageSel() {
        return messageSel;
    }


    /**
     * Sets the messageSel value for this CashRefund.
     * 
     * @param messageSel
     */
    public void setMessageSel(org.mule.module.netsuite.api.internal.RecordRef messageSel) {
        this.messageSel = messageSel;
    }


    /**
     * Gets the message value for this CashRefund.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CashRefund.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the transactionBillAddress value for this CashRefund.
     * 
     * @return transactionBillAddress
     */
    public org.mule.module.netsuite.api.internal.BillAddress getTransactionBillAddress() {
        return transactionBillAddress;
    }


    /**
     * Sets the transactionBillAddress value for this CashRefund.
     * 
     * @param transactionBillAddress
     */
    public void setTransactionBillAddress(org.mule.module.netsuite.api.internal.BillAddress transactionBillAddress) {
        this.transactionBillAddress = transactionBillAddress;
    }


    /**
     * Gets the billAddressList value for this CashRefund.
     * 
     * @return billAddressList
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBillAddressList() {
        return billAddressList;
    }


    /**
     * Sets the billAddressList value for this CashRefund.
     * 
     * @param billAddressList
     */
    public void setBillAddressList(org.mule.module.netsuite.api.internal.RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }


    /**
     * Gets the billAddress value for this CashRefund.
     * 
     * @return billAddress
     */
    public java.lang.String getBillAddress() {
        return billAddress;
    }


    /**
     * Sets the billAddress value for this CashRefund.
     * 
     * @param billAddress
     */
    public void setBillAddress(java.lang.String billAddress) {
        this.billAddress = billAddress;
    }


    /**
     * Gets the shipMethod value for this CashRefund.
     * 
     * @return shipMethod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this CashRefund.
     * 
     * @param shipMethod
     */
    public void setShipMethod(org.mule.module.netsuite.api.internal.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the shippingTaxCode value for this CashRefund.
     * 
     * @return shippingTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }


    /**
     * Sets the shippingTaxCode value for this CashRefund.
     * 
     * @param shippingTaxCode
     */
    public void setShippingTaxCode(org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }


    /**
     * Gets the shippingTax1Rate value for this CashRefund.
     * 
     * @return shippingTax1Rate
     */
    public java.lang.Double getShippingTax1Rate() {
        return shippingTax1Rate;
    }


    /**
     * Sets the shippingTax1Rate value for this CashRefund.
     * 
     * @param shippingTax1Rate
     */
    public void setShippingTax1Rate(java.lang.Double shippingTax1Rate) {
        this.shippingTax1Rate = shippingTax1Rate;
    }


    /**
     * Gets the shippingTax2Rate value for this CashRefund.
     * 
     * @return shippingTax2Rate
     */
    public java.lang.String getShippingTax2Rate() {
        return shippingTax2Rate;
    }


    /**
     * Sets the shippingTax2Rate value for this CashRefund.
     * 
     * @param shippingTax2Rate
     */
    public void setShippingTax2Rate(java.lang.String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }


    /**
     * Gets the shippingCost value for this CashRefund.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this CashRefund.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the handlingTaxCode value for this CashRefund.
     * 
     * @return handlingTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }


    /**
     * Sets the handlingTaxCode value for this CashRefund.
     * 
     * @param handlingTaxCode
     */
    public void setHandlingTaxCode(org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }


    /**
     * Gets the handlingTax1Rate value for this CashRefund.
     * 
     * @return handlingTax1Rate
     */
    public java.lang.Double getHandlingTax1Rate() {
        return handlingTax1Rate;
    }


    /**
     * Sets the handlingTax1Rate value for this CashRefund.
     * 
     * @param handlingTax1Rate
     */
    public void setHandlingTax1Rate(java.lang.Double handlingTax1Rate) {
        this.handlingTax1Rate = handlingTax1Rate;
    }


    /**
     * Gets the handlingTax2Rate value for this CashRefund.
     * 
     * @return handlingTax2Rate
     */
    public java.lang.String getHandlingTax2Rate() {
        return handlingTax2Rate;
    }


    /**
     * Sets the handlingTax2Rate value for this CashRefund.
     * 
     * @param handlingTax2Rate
     */
    public void setHandlingTax2Rate(java.lang.String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }


    /**
     * Gets the handlingCost value for this CashRefund.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this CashRefund.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the salesGroup value for this CashRefund.
     * 
     * @return salesGroup
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSalesGroup() {
        return salesGroup;
    }


    /**
     * Sets the salesGroup value for this CashRefund.
     * 
     * @param salesGroup
     */
    public void setSalesGroup(org.mule.module.netsuite.api.internal.RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }


    /**
     * Gets the syncSalesTeams value for this CashRefund.
     * 
     * @return syncSalesTeams
     */
    public java.lang.Boolean getSyncSalesTeams() {
        return syncSalesTeams;
    }


    /**
     * Sets the syncSalesTeams value for this CashRefund.
     * 
     * @param syncSalesTeams
     */
    public void setSyncSalesTeams(java.lang.Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }


    /**
     * Gets the paymentMethod value for this CashRefund.
     * 
     * @return paymentMethod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPaymentMethod() {
        return paymentMethod;
    }


    /**
     * Sets the paymentMethod value for this CashRefund.
     * 
     * @param paymentMethod
     */
    public void setPaymentMethod(org.mule.module.netsuite.api.internal.RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }


    /**
     * Gets the revenueStatus value for this CashRefund.
     * 
     * @return revenueStatus
     */
    public org.mule.module.netsuite.api.internal.RevenueStatus getRevenueStatus() {
        return revenueStatus;
    }


    /**
     * Sets the revenueStatus value for this CashRefund.
     * 
     * @param revenueStatus
     */
    public void setRevenueStatus(org.mule.module.netsuite.api.internal.RevenueStatus revenueStatus) {
        this.revenueStatus = revenueStatus;
    }


    /**
     * Gets the recognizedRevenue value for this CashRefund.
     * 
     * @return recognizedRevenue
     */
    public java.lang.Double getRecognizedRevenue() {
        return recognizedRevenue;
    }


    /**
     * Sets the recognizedRevenue value for this CashRefund.
     * 
     * @param recognizedRevenue
     */
    public void setRecognizedRevenue(java.lang.Double recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }


    /**
     * Gets the deferredRevenue value for this CashRefund.
     * 
     * @return deferredRevenue
     */
    public java.lang.Double getDeferredRevenue() {
        return deferredRevenue;
    }


    /**
     * Sets the deferredRevenue value for this CashRefund.
     * 
     * @param deferredRevenue
     */
    public void setDeferredRevenue(java.lang.Double deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }


    /**
     * Gets the revRecOnRevCommitment value for this CashRefund.
     * 
     * @return revRecOnRevCommitment
     */
    public java.lang.Boolean getRevRecOnRevCommitment() {
        return revRecOnRevCommitment;
    }


    /**
     * Sets the revRecOnRevCommitment value for this CashRefund.
     * 
     * @param revRecOnRevCommitment
     */
    public void setRevRecOnRevCommitment(java.lang.Boolean revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }


    /**
     * Gets the creditCard value for this CashRefund.
     * 
     * @return creditCard
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCreditCard() {
        return creditCard;
    }


    /**
     * Sets the creditCard value for this CashRefund.
     * 
     * @param creditCard
     */
    public void setCreditCard(org.mule.module.netsuite.api.internal.RecordRef creditCard) {
        this.creditCard = creditCard;
    }


    /**
     * Gets the chargeIt value for this CashRefund.
     * 
     * @return chargeIt
     */
    public java.lang.Boolean getChargeIt() {
        return chargeIt;
    }


    /**
     * Sets the chargeIt value for this CashRefund.
     * 
     * @param chargeIt
     */
    public void setChargeIt(java.lang.Boolean chargeIt) {
        this.chargeIt = chargeIt;
    }


    /**
     * Gets the ccNumber value for this CashRefund.
     * 
     * @return ccNumber
     */
    public java.lang.String getCcNumber() {
        return ccNumber;
    }


    /**
     * Sets the ccNumber value for this CashRefund.
     * 
     * @param ccNumber
     */
    public void setCcNumber(java.lang.String ccNumber) {
        this.ccNumber = ccNumber;
    }


    /**
     * Gets the ccExpireDate value for this CashRefund.
     * 
     * @return ccExpireDate
     */
    public java.util.Calendar getCcExpireDate() {
        return ccExpireDate;
    }


    /**
     * Sets the ccExpireDate value for this CashRefund.
     * 
     * @param ccExpireDate
     */
    public void setCcExpireDate(java.util.Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }


    /**
     * Gets the ccName value for this CashRefund.
     * 
     * @return ccName
     */
    public java.lang.String getCcName() {
        return ccName;
    }


    /**
     * Sets the ccName value for this CashRefund.
     * 
     * @param ccName
     */
    public void setCcName(java.lang.String ccName) {
        this.ccName = ccName;
    }


    /**
     * Gets the ccStreet value for this CashRefund.
     * 
     * @return ccStreet
     */
    public java.lang.String getCcStreet() {
        return ccStreet;
    }


    /**
     * Sets the ccStreet value for this CashRefund.
     * 
     * @param ccStreet
     */
    public void setCcStreet(java.lang.String ccStreet) {
        this.ccStreet = ccStreet;
    }


    /**
     * Gets the ccZipCode value for this CashRefund.
     * 
     * @return ccZipCode
     */
    public java.lang.String getCcZipCode() {
        return ccZipCode;
    }


    /**
     * Sets the ccZipCode value for this CashRefund.
     * 
     * @param ccZipCode
     */
    public void setCcZipCode(java.lang.String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }


    /**
     * Gets the ccApproved value for this CashRefund.
     * 
     * @return ccApproved
     */
    public java.lang.Boolean getCcApproved() {
        return ccApproved;
    }


    /**
     * Sets the ccApproved value for this CashRefund.
     * 
     * @param ccApproved
     */
    public void setCcApproved(java.lang.Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }


    /**
     * Gets the creditCardProcessor value for this CashRefund.
     * 
     * @return creditCardProcessor
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCreditCardProcessor() {
        return creditCardProcessor;
    }


    /**
     * Sets the creditCardProcessor value for this CashRefund.
     * 
     * @param creditCardProcessor
     */
    public void setCreditCardProcessor(org.mule.module.netsuite.api.internal.RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }


    /**
     * Gets the debitCardIssueNo value for this CashRefund.
     * 
     * @return debitCardIssueNo
     */
    public java.lang.String getDebitCardIssueNo() {
        return debitCardIssueNo;
    }


    /**
     * Sets the debitCardIssueNo value for this CashRefund.
     * 
     * @param debitCardIssueNo
     */
    public void setDebitCardIssueNo(java.lang.String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }


    /**
     * Gets the pnRefNum value for this CashRefund.
     * 
     * @return pnRefNum
     */
    public java.lang.String getPnRefNum() {
        return pnRefNum;
    }


    /**
     * Sets the pnRefNum value for this CashRefund.
     * 
     * @param pnRefNum
     */
    public void setPnRefNum(java.lang.String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }


    /**
     * Gets the validFrom value for this CashRefund.
     * 
     * @return validFrom
     */
    public java.util.Calendar getValidFrom() {
        return validFrom;
    }


    /**
     * Sets the validFrom value for this CashRefund.
     * 
     * @param validFrom
     */
    public void setValidFrom(java.util.Calendar validFrom) {
        this.validFrom = validFrom;
    }


    /**
     * Gets the payPalTranId value for this CashRefund.
     * 
     * @return payPalTranId
     */
    public java.lang.String getPayPalTranId() {
        return payPalTranId;
    }


    /**
     * Sets the payPalTranId value for this CashRefund.
     * 
     * @param payPalTranId
     */
    public void setPayPalTranId(java.lang.String payPalTranId) {
        this.payPalTranId = payPalTranId;
    }


    /**
     * Gets the subTotal value for this CashRefund.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this CashRefund.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the discountTotal value for this CashRefund.
     * 
     * @return discountTotal
     */
    public java.lang.Double getDiscountTotal() {
        return discountTotal;
    }


    /**
     * Sets the discountTotal value for this CashRefund.
     * 
     * @param discountTotal
     */
    public void setDiscountTotal(java.lang.Double discountTotal) {
        this.discountTotal = discountTotal;
    }


    /**
     * Gets the taxTotal value for this CashRefund.
     * 
     * @return taxTotal
     */
    public java.lang.Double getTaxTotal() {
        return taxTotal;
    }


    /**
     * Sets the taxTotal value for this CashRefund.
     * 
     * @param taxTotal
     */
    public void setTaxTotal(java.lang.Double taxTotal) {
        this.taxTotal = taxTotal;
    }


    /**
     * Gets the tax2Total value for this CashRefund.
     * 
     * @return tax2Total
     */
    public java.lang.Double getTax2Total() {
        return tax2Total;
    }


    /**
     * Sets the tax2Total value for this CashRefund.
     * 
     * @param tax2Total
     */
    public void setTax2Total(java.lang.Double tax2Total) {
        this.tax2Total = tax2Total;
    }


    /**
     * Gets the altShippingCost value for this CashRefund.
     * 
     * @return altShippingCost
     */
    public java.lang.Double getAltShippingCost() {
        return altShippingCost;
    }


    /**
     * Sets the altShippingCost value for this CashRefund.
     * 
     * @param altShippingCost
     */
    public void setAltShippingCost(java.lang.Double altShippingCost) {
        this.altShippingCost = altShippingCost;
    }


    /**
     * Gets the payPalStatus value for this CashRefund.
     * 
     * @return payPalStatus
     */
    public java.lang.String getPayPalStatus() {
        return payPalStatus;
    }


    /**
     * Sets the payPalStatus value for this CashRefund.
     * 
     * @param payPalStatus
     */
    public void setPayPalStatus(java.lang.String payPalStatus) {
        this.payPalStatus = payPalStatus;
    }


    /**
     * Gets the altHandlingCost value for this CashRefund.
     * 
     * @return altHandlingCost
     */
    public java.lang.Double getAltHandlingCost() {
        return altHandlingCost;
    }


    /**
     * Sets the altHandlingCost value for this CashRefund.
     * 
     * @param altHandlingCost
     */
    public void setAltHandlingCost(java.lang.Double altHandlingCost) {
        this.altHandlingCost = altHandlingCost;
    }


    /**
     * Gets the total value for this CashRefund.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this CashRefund.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the payPalAuthId value for this CashRefund.
     * 
     * @return payPalAuthId
     */
    public java.lang.String getPayPalAuthId() {
        return payPalAuthId;
    }


    /**
     * Sets the payPalAuthId value for this CashRefund.
     * 
     * @param payPalAuthId
     */
    public void setPayPalAuthId(java.lang.String payPalAuthId) {
        this.payPalAuthId = payPalAuthId;
    }


    /**
     * Gets the status value for this CashRefund.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CashRefund.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the job value for this CashRefund.
     * 
     * @return job
     */
    public org.mule.module.netsuite.api.internal.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this CashRefund.
     * 
     * @param job
     */
    public void setJob(org.mule.module.netsuite.api.internal.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the giftCert value for this CashRefund.
     * 
     * @return giftCert
     */
    public org.mule.module.netsuite.api.internal.RecordRef getGiftCert() {
        return giftCert;
    }


    /**
     * Sets the giftCert value for this CashRefund.
     * 
     * @param giftCert
     */
    public void setGiftCert(org.mule.module.netsuite.api.internal.RecordRef giftCert) {
        this.giftCert = giftCert;
    }


    /**
     * Gets the giftCertTotal value for this CashRefund.
     * 
     * @return giftCertTotal
     */
    public java.lang.Double getGiftCertTotal() {
        return giftCertTotal;
    }


    /**
     * Sets the giftCertTotal value for this CashRefund.
     * 
     * @param giftCertTotal
     */
    public void setGiftCertTotal(java.lang.Double giftCertTotal) {
        this.giftCertTotal = giftCertTotal;
    }


    /**
     * Gets the giftCertApplied value for this CashRefund.
     * 
     * @return giftCertApplied
     */
    public java.lang.Double getGiftCertApplied() {
        return giftCertApplied;
    }


    /**
     * Sets the giftCertApplied value for this CashRefund.
     * 
     * @param giftCertApplied
     */
    public void setGiftCertApplied(java.lang.Double giftCertApplied) {
        this.giftCertApplied = giftCertApplied;
    }


    /**
     * Gets the giftCertAvailable value for this CashRefund.
     * 
     * @return giftCertAvailable
     */
    public java.lang.Double getGiftCertAvailable() {
        return giftCertAvailable;
    }


    /**
     * Sets the giftCertAvailable value for this CashRefund.
     * 
     * @param giftCertAvailable
     */
    public void setGiftCertAvailable(java.lang.Double giftCertAvailable) {
        this.giftCertAvailable = giftCertAvailable;
    }


    /**
     * Gets the tranIsVsoeBundle value for this CashRefund.
     * 
     * @return tranIsVsoeBundle
     */
    public java.lang.Boolean getTranIsVsoeBundle() {
        return tranIsVsoeBundle;
    }


    /**
     * Sets the tranIsVsoeBundle value for this CashRefund.
     * 
     * @param tranIsVsoeBundle
     */
    public void setTranIsVsoeBundle(java.lang.Boolean tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }


    /**
     * Gets the payPalProcess value for this CashRefund.
     * 
     * @return payPalProcess
     */
    public java.lang.Boolean getPayPalProcess() {
        return payPalProcess;
    }


    /**
     * Sets the payPalProcess value for this CashRefund.
     * 
     * @param payPalProcess
     */
    public void setPayPalProcess(java.lang.Boolean payPalProcess) {
        this.payPalProcess = payPalProcess;
    }


    /**
     * Gets the vsoeAutoCalc value for this CashRefund.
     * 
     * @return vsoeAutoCalc
     */
    public java.lang.Boolean getVsoeAutoCalc() {
        return vsoeAutoCalc;
    }


    /**
     * Sets the vsoeAutoCalc value for this CashRefund.
     * 
     * @param vsoeAutoCalc
     */
    public void setVsoeAutoCalc(java.lang.Boolean vsoeAutoCalc) {
        this.vsoeAutoCalc = vsoeAutoCalc;
    }


    /**
     * Gets the syncPartnerTeams value for this CashRefund.
     * 
     * @return syncPartnerTeams
     */
    public java.lang.Boolean getSyncPartnerTeams() {
        return syncPartnerTeams;
    }


    /**
     * Sets the syncPartnerTeams value for this CashRefund.
     * 
     * @param syncPartnerTeams
     */
    public void setSyncPartnerTeams(java.lang.Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }


    /**
     * Gets the itemList value for this CashRefund.
     * 
     * @return itemList
     */
    public org.mule.module.netsuite.api.internal.CashRefundItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this CashRefund.
     * 
     * @param itemList
     */
    public void setItemList(org.mule.module.netsuite.api.internal.CashRefundItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the salesTeamList value for this CashRefund.
     * 
     * @return salesTeamList
     */
    public org.mule.module.netsuite.api.internal.CashRefundSalesTeamList getSalesTeamList() {
        return salesTeamList;
    }


    /**
     * Sets the salesTeamList value for this CashRefund.
     * 
     * @param salesTeamList
     */
    public void setSalesTeamList(org.mule.module.netsuite.api.internal.CashRefundSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }


    /**
     * Gets the partnersList value for this CashRefund.
     * 
     * @return partnersList
     */
    public org.mule.module.netsuite.api.internal.CashRefundPartnersList getPartnersList() {
        return partnersList;
    }


    /**
     * Sets the partnersList value for this CashRefund.
     * 
     * @param partnersList
     */
    public void setPartnersList(org.mule.module.netsuite.api.internal.CashRefundPartnersList partnersList) {
        this.partnersList = partnersList;
    }


    /**
     * Gets the customFieldList value for this CashRefund.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CashRefund.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this CashRefund.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CashRefund.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this CashRefund.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CashRefund.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CashRefund)) return false;
        CashRefund other = (CashRefund) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.vatRegNum==null && other.getVatRegNum()==null) || 
             (this.vatRegNum!=null &&
              this.vatRegNum.equals(other.getVatRegNum()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.leadSource==null && other.getLeadSource()==null) || 
             (this.leadSource!=null &&
              this.leadSource.equals(other.getLeadSource()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.salesRep==null && other.getSalesRep()==null) || 
             (this.salesRep!=null &&
              this.salesRep.equals(other.getSalesRep()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.contribPct==null && other.getContribPct()==null) || 
             (this.contribPct!=null &&
              this.contribPct.equals(other.getContribPct()))) &&
            ((this.otherRefNum==null && other.getOtherRefNum()==null) || 
             (this.otherRefNum!=null &&
              this.otherRefNum.equals(other.getOtherRefNum()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.salesEffectiveDate==null && other.getSalesEffectiveDate()==null) || 
             (this.salesEffectiveDate!=null &&
              this.salesEffectiveDate.equals(other.getSalesEffectiveDate()))) &&
            ((this.refundCheck==null && other.getRefundCheck()==null) || 
             (this.refundCheck!=null &&
              this.refundCheck.equals(other.getRefundCheck()))) &&
            ((this.toPrint2==null && other.getToPrint2()==null) || 
             (this.toPrint2!=null &&
              this.toPrint2.equals(other.getToPrint2()))) &&
            ((this.excludeCommission==null && other.getExcludeCommission()==null) || 
             (this.excludeCommission!=null &&
              this.excludeCommission.equals(other.getExcludeCommission()))) &&
            ((this.totalCostEstimate==null && other.getTotalCostEstimate()==null) || 
             (this.totalCostEstimate!=null &&
              this.totalCostEstimate.equals(other.getTotalCostEstimate()))) &&
            ((this.estGrossProfit==null && other.getEstGrossProfit()==null) || 
             (this.estGrossProfit!=null &&
              this.estGrossProfit.equals(other.getEstGrossProfit()))) &&
            ((this.estGrossProfitPercent==null && other.getEstGrossProfitPercent()==null) || 
             (this.estGrossProfitPercent!=null &&
              this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent()))) &&
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.exchangeRate==null && other.getExchangeRate()==null) || 
             (this.exchangeRate!=null &&
              this.exchangeRate.equals(other.getExchangeRate()))) &&
            ((this.currencyName==null && other.getCurrencyName()==null) || 
             (this.currencyName!=null &&
              this.currencyName.equals(other.getCurrencyName()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.discountItem==null && other.getDiscountItem()==null) || 
             (this.discountItem!=null &&
              this.discountItem.equals(other.getDiscountItem()))) &&
            ((this.discountRate==null && other.getDiscountRate()==null) || 
             (this.discountRate!=null &&
              this.discountRate.equals(other.getDiscountRate()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.taxItem==null && other.getTaxItem()==null) || 
             (this.taxItem!=null &&
              this.taxItem.equals(other.getTaxItem()))) &&
            ((this.taxRate==null && other.getTaxRate()==null) || 
             (this.taxRate!=null &&
              this.taxRate.equals(other.getTaxRate()))) &&
            ((this.toBePrinted==null && other.getToBePrinted()==null) || 
             (this.toBePrinted!=null &&
              this.toBePrinted.equals(other.getToBePrinted()))) &&
            ((this.toBeEmailed==null && other.getToBeEmailed()==null) || 
             (this.toBeEmailed!=null &&
              this.toBeEmailed.equals(other.getToBeEmailed()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.toBeFaxed==null && other.getToBeFaxed()==null) || 
             (this.toBeFaxed!=null &&
              this.toBeFaxed.equals(other.getToBeFaxed()))) &&
            ((this.fax==null && other.getFax()==null) || 
             (this.fax!=null &&
              this.fax.equals(other.getFax()))) &&
            ((this.messageSel==null && other.getMessageSel()==null) || 
             (this.messageSel!=null &&
              this.messageSel.equals(other.getMessageSel()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.transactionBillAddress==null && other.getTransactionBillAddress()==null) || 
             (this.transactionBillAddress!=null &&
              this.transactionBillAddress.equals(other.getTransactionBillAddress()))) &&
            ((this.billAddressList==null && other.getBillAddressList()==null) || 
             (this.billAddressList!=null &&
              this.billAddressList.equals(other.getBillAddressList()))) &&
            ((this.billAddress==null && other.getBillAddress()==null) || 
             (this.billAddress!=null &&
              this.billAddress.equals(other.getBillAddress()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.shippingTaxCode==null && other.getShippingTaxCode()==null) || 
             (this.shippingTaxCode!=null &&
              this.shippingTaxCode.equals(other.getShippingTaxCode()))) &&
            ((this.shippingTax1Rate==null && other.getShippingTax1Rate()==null) || 
             (this.shippingTax1Rate!=null &&
              this.shippingTax1Rate.equals(other.getShippingTax1Rate()))) &&
            ((this.shippingTax2Rate==null && other.getShippingTax2Rate()==null) || 
             (this.shippingTax2Rate!=null &&
              this.shippingTax2Rate.equals(other.getShippingTax2Rate()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.handlingTaxCode==null && other.getHandlingTaxCode()==null) || 
             (this.handlingTaxCode!=null &&
              this.handlingTaxCode.equals(other.getHandlingTaxCode()))) &&
            ((this.handlingTax1Rate==null && other.getHandlingTax1Rate()==null) || 
             (this.handlingTax1Rate!=null &&
              this.handlingTax1Rate.equals(other.getHandlingTax1Rate()))) &&
            ((this.handlingTax2Rate==null && other.getHandlingTax2Rate()==null) || 
             (this.handlingTax2Rate!=null &&
              this.handlingTax2Rate.equals(other.getHandlingTax2Rate()))) &&
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.salesGroup==null && other.getSalesGroup()==null) || 
             (this.salesGroup!=null &&
              this.salesGroup.equals(other.getSalesGroup()))) &&
            ((this.syncSalesTeams==null && other.getSyncSalesTeams()==null) || 
             (this.syncSalesTeams!=null &&
              this.syncSalesTeams.equals(other.getSyncSalesTeams()))) &&
            ((this.paymentMethod==null && other.getPaymentMethod()==null) || 
             (this.paymentMethod!=null &&
              this.paymentMethod.equals(other.getPaymentMethod()))) &&
            ((this.revenueStatus==null && other.getRevenueStatus()==null) || 
             (this.revenueStatus!=null &&
              this.revenueStatus.equals(other.getRevenueStatus()))) &&
            ((this.recognizedRevenue==null && other.getRecognizedRevenue()==null) || 
             (this.recognizedRevenue!=null &&
              this.recognizedRevenue.equals(other.getRecognizedRevenue()))) &&
            ((this.deferredRevenue==null && other.getDeferredRevenue()==null) || 
             (this.deferredRevenue!=null &&
              this.deferredRevenue.equals(other.getDeferredRevenue()))) &&
            ((this.revRecOnRevCommitment==null && other.getRevRecOnRevCommitment()==null) || 
             (this.revRecOnRevCommitment!=null &&
              this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment()))) &&
            ((this.creditCard==null && other.getCreditCard()==null) || 
             (this.creditCard!=null &&
              this.creditCard.equals(other.getCreditCard()))) &&
            ((this.chargeIt==null && other.getChargeIt()==null) || 
             (this.chargeIt!=null &&
              this.chargeIt.equals(other.getChargeIt()))) &&
            ((this.ccNumber==null && other.getCcNumber()==null) || 
             (this.ccNumber!=null &&
              this.ccNumber.equals(other.getCcNumber()))) &&
            ((this.ccExpireDate==null && other.getCcExpireDate()==null) || 
             (this.ccExpireDate!=null &&
              this.ccExpireDate.equals(other.getCcExpireDate()))) &&
            ((this.ccName==null && other.getCcName()==null) || 
             (this.ccName!=null &&
              this.ccName.equals(other.getCcName()))) &&
            ((this.ccStreet==null && other.getCcStreet()==null) || 
             (this.ccStreet!=null &&
              this.ccStreet.equals(other.getCcStreet()))) &&
            ((this.ccZipCode==null && other.getCcZipCode()==null) || 
             (this.ccZipCode!=null &&
              this.ccZipCode.equals(other.getCcZipCode()))) &&
            ((this.ccApproved==null && other.getCcApproved()==null) || 
             (this.ccApproved!=null &&
              this.ccApproved.equals(other.getCcApproved()))) &&
            ((this.creditCardProcessor==null && other.getCreditCardProcessor()==null) || 
             (this.creditCardProcessor!=null &&
              this.creditCardProcessor.equals(other.getCreditCardProcessor()))) &&
            ((this.debitCardIssueNo==null && other.getDebitCardIssueNo()==null) || 
             (this.debitCardIssueNo!=null &&
              this.debitCardIssueNo.equals(other.getDebitCardIssueNo()))) &&
            ((this.pnRefNum==null && other.getPnRefNum()==null) || 
             (this.pnRefNum!=null &&
              this.pnRefNum.equals(other.getPnRefNum()))) &&
            ((this.validFrom==null && other.getValidFrom()==null) || 
             (this.validFrom!=null &&
              this.validFrom.equals(other.getValidFrom()))) &&
            ((this.payPalTranId==null && other.getPayPalTranId()==null) || 
             (this.payPalTranId!=null &&
              this.payPalTranId.equals(other.getPayPalTranId()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.discountTotal==null && other.getDiscountTotal()==null) || 
             (this.discountTotal!=null &&
              this.discountTotal.equals(other.getDiscountTotal()))) &&
            ((this.taxTotal==null && other.getTaxTotal()==null) || 
             (this.taxTotal!=null &&
              this.taxTotal.equals(other.getTaxTotal()))) &&
            ((this.tax2Total==null && other.getTax2Total()==null) || 
             (this.tax2Total!=null &&
              this.tax2Total.equals(other.getTax2Total()))) &&
            ((this.altShippingCost==null && other.getAltShippingCost()==null) || 
             (this.altShippingCost!=null &&
              this.altShippingCost.equals(other.getAltShippingCost()))) &&
            ((this.payPalStatus==null && other.getPayPalStatus()==null) || 
             (this.payPalStatus!=null &&
              this.payPalStatus.equals(other.getPayPalStatus()))) &&
            ((this.altHandlingCost==null && other.getAltHandlingCost()==null) || 
             (this.altHandlingCost!=null &&
              this.altHandlingCost.equals(other.getAltHandlingCost()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.payPalAuthId==null && other.getPayPalAuthId()==null) || 
             (this.payPalAuthId!=null &&
              this.payPalAuthId.equals(other.getPayPalAuthId()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.giftCert==null && other.getGiftCert()==null) || 
             (this.giftCert!=null &&
              this.giftCert.equals(other.getGiftCert()))) &&
            ((this.giftCertTotal==null && other.getGiftCertTotal()==null) || 
             (this.giftCertTotal!=null &&
              this.giftCertTotal.equals(other.getGiftCertTotal()))) &&
            ((this.giftCertApplied==null && other.getGiftCertApplied()==null) || 
             (this.giftCertApplied!=null &&
              this.giftCertApplied.equals(other.getGiftCertApplied()))) &&
            ((this.giftCertAvailable==null && other.getGiftCertAvailable()==null) || 
             (this.giftCertAvailable!=null &&
              this.giftCertAvailable.equals(other.getGiftCertAvailable()))) &&
            ((this.tranIsVsoeBundle==null && other.getTranIsVsoeBundle()==null) || 
             (this.tranIsVsoeBundle!=null &&
              this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle()))) &&
            ((this.payPalProcess==null && other.getPayPalProcess()==null) || 
             (this.payPalProcess!=null &&
              this.payPalProcess.equals(other.getPayPalProcess()))) &&
            ((this.vsoeAutoCalc==null && other.getVsoeAutoCalc()==null) || 
             (this.vsoeAutoCalc!=null &&
              this.vsoeAutoCalc.equals(other.getVsoeAutoCalc()))) &&
            ((this.syncPartnerTeams==null && other.getSyncPartnerTeams()==null) || 
             (this.syncPartnerTeams!=null &&
              this.syncPartnerTeams.equals(other.getSyncPartnerTeams()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.salesTeamList==null && other.getSalesTeamList()==null) || 
             (this.salesTeamList!=null &&
              this.salesTeamList.equals(other.getSalesTeamList()))) &&
            ((this.partnersList==null && other.getPartnersList()==null) || 
             (this.partnersList!=null &&
              this.partnersList.equals(other.getPartnersList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getVatRegNum() != null) {
            _hashCode += getVatRegNum().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getSource() != null) {
            _hashCode += getSource().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLeadSource() != null) {
            _hashCode += getLeadSource().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getSalesRep() != null) {
            _hashCode += getSalesRep().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getContribPct() != null) {
            _hashCode += getContribPct().hashCode();
        }
        if (getOtherRefNum() != null) {
            _hashCode += getOtherRefNum().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getSalesEffectiveDate() != null) {
            _hashCode += getSalesEffectiveDate().hashCode();
        }
        if (getRefundCheck() != null) {
            _hashCode += getRefundCheck().hashCode();
        }
        if (getToPrint2() != null) {
            _hashCode += getToPrint2().hashCode();
        }
        if (getExcludeCommission() != null) {
            _hashCode += getExcludeCommission().hashCode();
        }
        if (getTotalCostEstimate() != null) {
            _hashCode += getTotalCostEstimate().hashCode();
        }
        if (getEstGrossProfit() != null) {
            _hashCode += getEstGrossProfit().hashCode();
        }
        if (getEstGrossProfitPercent() != null) {
            _hashCode += getEstGrossProfitPercent().hashCode();
        }
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getCurrencyName() != null) {
            _hashCode += getCurrencyName().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getDiscountItem() != null) {
            _hashCode += getDiscountItem().hashCode();
        }
        if (getDiscountRate() != null) {
            _hashCode += getDiscountRate().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getTaxItem() != null) {
            _hashCode += getTaxItem().hashCode();
        }
        if (getTaxRate() != null) {
            _hashCode += getTaxRate().hashCode();
        }
        if (getToBePrinted() != null) {
            _hashCode += getToBePrinted().hashCode();
        }
        if (getToBeEmailed() != null) {
            _hashCode += getToBeEmailed().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getToBeFaxed() != null) {
            _hashCode += getToBeFaxed().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getMessageSel() != null) {
            _hashCode += getMessageSel().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getTransactionBillAddress() != null) {
            _hashCode += getTransactionBillAddress().hashCode();
        }
        if (getBillAddressList() != null) {
            _hashCode += getBillAddressList().hashCode();
        }
        if (getBillAddress() != null) {
            _hashCode += getBillAddress().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getShippingTaxCode() != null) {
            _hashCode += getShippingTaxCode().hashCode();
        }
        if (getShippingTax1Rate() != null) {
            _hashCode += getShippingTax1Rate().hashCode();
        }
        if (getShippingTax2Rate() != null) {
            _hashCode += getShippingTax2Rate().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getHandlingTaxCode() != null) {
            _hashCode += getHandlingTaxCode().hashCode();
        }
        if (getHandlingTax1Rate() != null) {
            _hashCode += getHandlingTax1Rate().hashCode();
        }
        if (getHandlingTax2Rate() != null) {
            _hashCode += getHandlingTax2Rate().hashCode();
        }
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getSalesGroup() != null) {
            _hashCode += getSalesGroup().hashCode();
        }
        if (getSyncSalesTeams() != null) {
            _hashCode += getSyncSalesTeams().hashCode();
        }
        if (getPaymentMethod() != null) {
            _hashCode += getPaymentMethod().hashCode();
        }
        if (getRevenueStatus() != null) {
            _hashCode += getRevenueStatus().hashCode();
        }
        if (getRecognizedRevenue() != null) {
            _hashCode += getRecognizedRevenue().hashCode();
        }
        if (getDeferredRevenue() != null) {
            _hashCode += getDeferredRevenue().hashCode();
        }
        if (getRevRecOnRevCommitment() != null) {
            _hashCode += getRevRecOnRevCommitment().hashCode();
        }
        if (getCreditCard() != null) {
            _hashCode += getCreditCard().hashCode();
        }
        if (getChargeIt() != null) {
            _hashCode += getChargeIt().hashCode();
        }
        if (getCcNumber() != null) {
            _hashCode += getCcNumber().hashCode();
        }
        if (getCcExpireDate() != null) {
            _hashCode += getCcExpireDate().hashCode();
        }
        if (getCcName() != null) {
            _hashCode += getCcName().hashCode();
        }
        if (getCcStreet() != null) {
            _hashCode += getCcStreet().hashCode();
        }
        if (getCcZipCode() != null) {
            _hashCode += getCcZipCode().hashCode();
        }
        if (getCcApproved() != null) {
            _hashCode += getCcApproved().hashCode();
        }
        if (getCreditCardProcessor() != null) {
            _hashCode += getCreditCardProcessor().hashCode();
        }
        if (getDebitCardIssueNo() != null) {
            _hashCode += getDebitCardIssueNo().hashCode();
        }
        if (getPnRefNum() != null) {
            _hashCode += getPnRefNum().hashCode();
        }
        if (getValidFrom() != null) {
            _hashCode += getValidFrom().hashCode();
        }
        if (getPayPalTranId() != null) {
            _hashCode += getPayPalTranId().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getDiscountTotal() != null) {
            _hashCode += getDiscountTotal().hashCode();
        }
        if (getTaxTotal() != null) {
            _hashCode += getTaxTotal().hashCode();
        }
        if (getTax2Total() != null) {
            _hashCode += getTax2Total().hashCode();
        }
        if (getAltShippingCost() != null) {
            _hashCode += getAltShippingCost().hashCode();
        }
        if (getPayPalStatus() != null) {
            _hashCode += getPayPalStatus().hashCode();
        }
        if (getAltHandlingCost() != null) {
            _hashCode += getAltHandlingCost().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getPayPalAuthId() != null) {
            _hashCode += getPayPalAuthId().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getGiftCert() != null) {
            _hashCode += getGiftCert().hashCode();
        }
        if (getGiftCertTotal() != null) {
            _hashCode += getGiftCertTotal().hashCode();
        }
        if (getGiftCertApplied() != null) {
            _hashCode += getGiftCertApplied().hashCode();
        }
        if (getGiftCertAvailable() != null) {
            _hashCode += getGiftCertAvailable().hashCode();
        }
        if (getTranIsVsoeBundle() != null) {
            _hashCode += getTranIsVsoeBundle().hashCode();
        }
        if (getPayPalProcess() != null) {
            _hashCode += getPayPalProcess().hashCode();
        }
        if (getVsoeAutoCalc() != null) {
            _hashCode += getVsoeAutoCalc().hashCode();
        }
        if (getSyncPartnerTeams() != null) {
            _hashCode += getSyncPartnerTeams().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getSalesTeamList() != null) {
            _hashCode += getSalesTeamList().hashCode();
        }
        if (getPartnersList() != null) {
            _hashCode += getPartnersList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CashRefund.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefund"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundCheck");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "refundCheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toPrint2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "toPrint2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "discountItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "discountRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "messageSel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionBillAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "transactionBillAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BillAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "shippingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "handlingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "RevenueStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeIt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "chargeIt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "debitCardIssueNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "discountTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altShippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "altShippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altHandlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "altHandlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalAuthId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "payPalAuthId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCert");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCert"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payPalProcess");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "payPalProcess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAutoCalc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vsoeAutoCalc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "CashRefundPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
