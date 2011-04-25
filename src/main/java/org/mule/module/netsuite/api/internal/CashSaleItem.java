/**
 * CashSaleItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CashSaleItem  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef job;

    private org.mule.module.netsuite.api.internal.RecordRef item;

    private java.lang.Long line;

    private java.lang.Double quantityAvailable;

    private java.lang.Double quantityOnHand;

    private java.lang.Double quantityFulfilled;

    private java.lang.Double quantity;

    private org.mule.module.netsuite.api.internal.RecordRef units;

    private java.lang.String serialNumbers;

    private java.lang.String binNumbers;

    private java.lang.String description;

    private org.mule.module.netsuite.api.internal.RecordRef price;

    private java.lang.String rate;

    private java.lang.Double amount;

    private java.lang.Long orderLine;

    private java.lang.String licenseCode;

    private java.lang.Boolean isTaxable;

    private org.mule.module.netsuite.api.internal.CustomFieldList options;

    private java.lang.Boolean deferRevRec;

    private java.lang.Double currentPercent;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private java.lang.Double percentComplete;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRef revRecSchedule;

    private java.util.Calendar revRecStartDate;

    private java.util.Calendar revRecEndDate;

    private java.lang.Double grossAmt;

    private org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType;

    private java.lang.Double costEstimate;

    private java.lang.Double amountOrdered;

    private java.lang.Double tax1Amt;

    private java.lang.Double quantityOrdered;

    private java.lang.Double quantityRemaining;

    private org.mule.module.netsuite.api.internal.RecordRef taxCode;

    private java.lang.Double taxRate1;

    private java.lang.Double taxRate2;

    private java.lang.String giftCertFrom;

    private java.lang.String giftCertRecipientName;

    private java.lang.String giftCertRecipientEmail;

    private java.lang.String giftCertMessage;

    private java.lang.String giftCertNumber;

    private java.lang.Long shipGroup;

    private java.lang.Boolean itemIsFulfilled;

    private org.mule.module.netsuite.api.internal.RecordRef shipAddress;

    private org.mule.module.netsuite.api.internal.RecordRef shipMethod;

    private java.lang.Double vsoePrice;

    private java.lang.Double vsoeAmount;

    private java.lang.Double vsoeAllocation;

    private org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral;

    private org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    public CashSaleItem() {
    }

    public CashSaleItem(
           org.mule.module.netsuite.api.internal.RecordRef job,
           org.mule.module.netsuite.api.internal.RecordRef item,
           java.lang.Long line,
           java.lang.Double quantityAvailable,
           java.lang.Double quantityOnHand,
           java.lang.Double quantityFulfilled,
           java.lang.Double quantity,
           org.mule.module.netsuite.api.internal.RecordRef units,
           java.lang.String serialNumbers,
           java.lang.String binNumbers,
           java.lang.String description,
           org.mule.module.netsuite.api.internal.RecordRef price,
           java.lang.String rate,
           java.lang.Double amount,
           java.lang.Long orderLine,
           java.lang.String licenseCode,
           java.lang.Boolean isTaxable,
           org.mule.module.netsuite.api.internal.CustomFieldList options,
           java.lang.Boolean deferRevRec,
           java.lang.Double currentPercent,
           org.mule.module.netsuite.api.internal.RecordRef department,
           java.lang.Double percentComplete,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRef revRecSchedule,
           java.util.Calendar revRecStartDate,
           java.util.Calendar revRecEndDate,
           java.lang.Double grossAmt,
           org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType,
           java.lang.Double costEstimate,
           java.lang.Double amountOrdered,
           java.lang.Double tax1Amt,
           java.lang.Double quantityOrdered,
           java.lang.Double quantityRemaining,
           org.mule.module.netsuite.api.internal.RecordRef taxCode,
           java.lang.Double taxRate1,
           java.lang.Double taxRate2,
           java.lang.String giftCertFrom,
           java.lang.String giftCertRecipientName,
           java.lang.String giftCertRecipientEmail,
           java.lang.String giftCertMessage,
           java.lang.String giftCertNumber,
           java.lang.Long shipGroup,
           java.lang.Boolean itemIsFulfilled,
           org.mule.module.netsuite.api.internal.RecordRef shipAddress,
           org.mule.module.netsuite.api.internal.RecordRef shipMethod,
           java.lang.Double vsoePrice,
           java.lang.Double vsoeAmount,
           java.lang.Double vsoeAllocation,
           org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral,
           org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
           this.job = job;
           this.item = item;
           this.line = line;
           this.quantityAvailable = quantityAvailable;
           this.quantityOnHand = quantityOnHand;
           this.quantityFulfilled = quantityFulfilled;
           this.quantity = quantity;
           this.units = units;
           this.serialNumbers = serialNumbers;
           this.binNumbers = binNumbers;
           this.description = description;
           this.price = price;
           this.rate = rate;
           this.amount = amount;
           this.orderLine = orderLine;
           this.licenseCode = licenseCode;
           this.isTaxable = isTaxable;
           this.options = options;
           this.deferRevRec = deferRevRec;
           this.currentPercent = currentPercent;
           this.department = department;
           this.percentComplete = percentComplete;
           this._class = _class;
           this.location = location;
           this.revRecSchedule = revRecSchedule;
           this.revRecStartDate = revRecStartDate;
           this.revRecEndDate = revRecEndDate;
           this.grossAmt = grossAmt;
           this.costEstimateType = costEstimateType;
           this.costEstimate = costEstimate;
           this.amountOrdered = amountOrdered;
           this.tax1Amt = tax1Amt;
           this.quantityOrdered = quantityOrdered;
           this.quantityRemaining = quantityRemaining;
           this.taxCode = taxCode;
           this.taxRate1 = taxRate1;
           this.taxRate2 = taxRate2;
           this.giftCertFrom = giftCertFrom;
           this.giftCertRecipientName = giftCertRecipientName;
           this.giftCertRecipientEmail = giftCertRecipientEmail;
           this.giftCertMessage = giftCertMessage;
           this.giftCertNumber = giftCertNumber;
           this.shipGroup = shipGroup;
           this.itemIsFulfilled = itemIsFulfilled;
           this.shipAddress = shipAddress;
           this.shipMethod = shipMethod;
           this.vsoePrice = vsoePrice;
           this.vsoeAmount = vsoeAmount;
           this.vsoeAllocation = vsoeAllocation;
           this.vsoeDeferral = vsoeDeferral;
           this.vsoePermitDiscount = vsoePermitDiscount;
           this.vsoeDelivered = vsoeDelivered;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the job value for this CashSaleItem.
     * 
     * @return job
     */
    public org.mule.module.netsuite.api.internal.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this CashSaleItem.
     * 
     * @param job
     */
    public void setJob(org.mule.module.netsuite.api.internal.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the item value for this CashSaleItem.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this CashSaleItem.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the line value for this CashSaleItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this CashSaleItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the quantityAvailable value for this CashSaleItem.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this CashSaleItem.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityOnHand value for this CashSaleItem.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this CashSaleItem.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the quantityFulfilled value for this CashSaleItem.
     * 
     * @return quantityFulfilled
     */
    public java.lang.Double getQuantityFulfilled() {
        return quantityFulfilled;
    }


    /**
     * Sets the quantityFulfilled value for this CashSaleItem.
     * 
     * @param quantityFulfilled
     */
    public void setQuantityFulfilled(java.lang.Double quantityFulfilled) {
        this.quantityFulfilled = quantityFulfilled;
    }


    /**
     * Gets the quantity value for this CashSaleItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this CashSaleItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the units value for this CashSaleItem.
     * 
     * @return units
     */
    public org.mule.module.netsuite.api.internal.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this CashSaleItem.
     * 
     * @param units
     */
    public void setUnits(org.mule.module.netsuite.api.internal.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the serialNumbers value for this CashSaleItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this CashSaleItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the binNumbers value for this CashSaleItem.
     * 
     * @return binNumbers
     */
    public java.lang.String getBinNumbers() {
        return binNumbers;
    }


    /**
     * Sets the binNumbers value for this CashSaleItem.
     * 
     * @param binNumbers
     */
    public void setBinNumbers(java.lang.String binNumbers) {
        this.binNumbers = binNumbers;
    }


    /**
     * Gets the description value for this CashSaleItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CashSaleItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the price value for this CashSaleItem.
     * 
     * @return price
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CashSaleItem.
     * 
     * @param price
     */
    public void setPrice(org.mule.module.netsuite.api.internal.RecordRef price) {
        this.price = price;
    }


    /**
     * Gets the rate value for this CashSaleItem.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this CashSaleItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the amount value for this CashSaleItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this CashSaleItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the orderLine value for this CashSaleItem.
     * 
     * @return orderLine
     */
    public java.lang.Long getOrderLine() {
        return orderLine;
    }


    /**
     * Sets the orderLine value for this CashSaleItem.
     * 
     * @param orderLine
     */
    public void setOrderLine(java.lang.Long orderLine) {
        this.orderLine = orderLine;
    }


    /**
     * Gets the licenseCode value for this CashSaleItem.
     * 
     * @return licenseCode
     */
    public java.lang.String getLicenseCode() {
        return licenseCode;
    }


    /**
     * Sets the licenseCode value for this CashSaleItem.
     * 
     * @param licenseCode
     */
    public void setLicenseCode(java.lang.String licenseCode) {
        this.licenseCode = licenseCode;
    }


    /**
     * Gets the isTaxable value for this CashSaleItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this CashSaleItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the options value for this CashSaleItem.
     * 
     * @return options
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this CashSaleItem.
     * 
     * @param options
     */
    public void setOptions(org.mule.module.netsuite.api.internal.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the deferRevRec value for this CashSaleItem.
     * 
     * @return deferRevRec
     */
    public java.lang.Boolean getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this CashSaleItem.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(java.lang.Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the currentPercent value for this CashSaleItem.
     * 
     * @return currentPercent
     */
    public java.lang.Double getCurrentPercent() {
        return currentPercent;
    }


    /**
     * Sets the currentPercent value for this CashSaleItem.
     * 
     * @param currentPercent
     */
    public void setCurrentPercent(java.lang.Double currentPercent) {
        this.currentPercent = currentPercent;
    }


    /**
     * Gets the department value for this CashSaleItem.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CashSaleItem.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the percentComplete value for this CashSaleItem.
     * 
     * @return percentComplete
     */
    public java.lang.Double getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this CashSaleItem.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(java.lang.Double percentComplete) {
        this.percentComplete = percentComplete;
    }


    /**
     * Gets the _class value for this CashSaleItem.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this CashSaleItem.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this CashSaleItem.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CashSaleItem.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the revRecSchedule value for this CashSaleItem.
     * 
     * @return revRecSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this CashSaleItem.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(org.mule.module.netsuite.api.internal.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the revRecStartDate value for this CashSaleItem.
     * 
     * @return revRecStartDate
     */
    public java.util.Calendar getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this CashSaleItem.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecEndDate value for this CashSaleItem.
     * 
     * @return revRecEndDate
     */
    public java.util.Calendar getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this CashSaleItem.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(java.util.Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the grossAmt value for this CashSaleItem.
     * 
     * @return grossAmt
     */
    public java.lang.Double getGrossAmt() {
        return grossAmt;
    }


    /**
     * Sets the grossAmt value for this CashSaleItem.
     * 
     * @param grossAmt
     */
    public void setGrossAmt(java.lang.Double grossAmt) {
        this.grossAmt = grossAmt;
    }


    /**
     * Gets the costEstimateType value for this CashSaleItem.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this CashSaleItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costEstimate value for this CashSaleItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this CashSaleItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the amountOrdered value for this CashSaleItem.
     * 
     * @return amountOrdered
     */
    public java.lang.Double getAmountOrdered() {
        return amountOrdered;
    }


    /**
     * Sets the amountOrdered value for this CashSaleItem.
     * 
     * @param amountOrdered
     */
    public void setAmountOrdered(java.lang.Double amountOrdered) {
        this.amountOrdered = amountOrdered;
    }


    /**
     * Gets the tax1Amt value for this CashSaleItem.
     * 
     * @return tax1Amt
     */
    public java.lang.Double getTax1Amt() {
        return tax1Amt;
    }


    /**
     * Sets the tax1Amt value for this CashSaleItem.
     * 
     * @param tax1Amt
     */
    public void setTax1Amt(java.lang.Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }


    /**
     * Gets the quantityOrdered value for this CashSaleItem.
     * 
     * @return quantityOrdered
     */
    public java.lang.Double getQuantityOrdered() {
        return quantityOrdered;
    }


    /**
     * Sets the quantityOrdered value for this CashSaleItem.
     * 
     * @param quantityOrdered
     */
    public void setQuantityOrdered(java.lang.Double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }


    /**
     * Gets the quantityRemaining value for this CashSaleItem.
     * 
     * @return quantityRemaining
     */
    public java.lang.Double getQuantityRemaining() {
        return quantityRemaining;
    }


    /**
     * Sets the quantityRemaining value for this CashSaleItem.
     * 
     * @param quantityRemaining
     */
    public void setQuantityRemaining(java.lang.Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }


    /**
     * Gets the taxCode value for this CashSaleItem.
     * 
     * @return taxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this CashSaleItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(org.mule.module.netsuite.api.internal.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxRate1 value for this CashSaleItem.
     * 
     * @return taxRate1
     */
    public java.lang.Double getTaxRate1() {
        return taxRate1;
    }


    /**
     * Sets the taxRate1 value for this CashSaleItem.
     * 
     * @param taxRate1
     */
    public void setTaxRate1(java.lang.Double taxRate1) {
        this.taxRate1 = taxRate1;
    }


    /**
     * Gets the taxRate2 value for this CashSaleItem.
     * 
     * @return taxRate2
     */
    public java.lang.Double getTaxRate2() {
        return taxRate2;
    }


    /**
     * Sets the taxRate2 value for this CashSaleItem.
     * 
     * @param taxRate2
     */
    public void setTaxRate2(java.lang.Double taxRate2) {
        this.taxRate2 = taxRate2;
    }


    /**
     * Gets the giftCertFrom value for this CashSaleItem.
     * 
     * @return giftCertFrom
     */
    public java.lang.String getGiftCertFrom() {
        return giftCertFrom;
    }


    /**
     * Sets the giftCertFrom value for this CashSaleItem.
     * 
     * @param giftCertFrom
     */
    public void setGiftCertFrom(java.lang.String giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }


    /**
     * Gets the giftCertRecipientName value for this CashSaleItem.
     * 
     * @return giftCertRecipientName
     */
    public java.lang.String getGiftCertRecipientName() {
        return giftCertRecipientName;
    }


    /**
     * Sets the giftCertRecipientName value for this CashSaleItem.
     * 
     * @param giftCertRecipientName
     */
    public void setGiftCertRecipientName(java.lang.String giftCertRecipientName) {
        this.giftCertRecipientName = giftCertRecipientName;
    }


    /**
     * Gets the giftCertRecipientEmail value for this CashSaleItem.
     * 
     * @return giftCertRecipientEmail
     */
    public java.lang.String getGiftCertRecipientEmail() {
        return giftCertRecipientEmail;
    }


    /**
     * Sets the giftCertRecipientEmail value for this CashSaleItem.
     * 
     * @param giftCertRecipientEmail
     */
    public void setGiftCertRecipientEmail(java.lang.String giftCertRecipientEmail) {
        this.giftCertRecipientEmail = giftCertRecipientEmail;
    }


    /**
     * Gets the giftCertMessage value for this CashSaleItem.
     * 
     * @return giftCertMessage
     */
    public java.lang.String getGiftCertMessage() {
        return giftCertMessage;
    }


    /**
     * Sets the giftCertMessage value for this CashSaleItem.
     * 
     * @param giftCertMessage
     */
    public void setGiftCertMessage(java.lang.String giftCertMessage) {
        this.giftCertMessage = giftCertMessage;
    }


    /**
     * Gets the giftCertNumber value for this CashSaleItem.
     * 
     * @return giftCertNumber
     */
    public java.lang.String getGiftCertNumber() {
        return giftCertNumber;
    }


    /**
     * Sets the giftCertNumber value for this CashSaleItem.
     * 
     * @param giftCertNumber
     */
    public void setGiftCertNumber(java.lang.String giftCertNumber) {
        this.giftCertNumber = giftCertNumber;
    }


    /**
     * Gets the shipGroup value for this CashSaleItem.
     * 
     * @return shipGroup
     */
    public java.lang.Long getShipGroup() {
        return shipGroup;
    }


    /**
     * Sets the shipGroup value for this CashSaleItem.
     * 
     * @param shipGroup
     */
    public void setShipGroup(java.lang.Long shipGroup) {
        this.shipGroup = shipGroup;
    }


    /**
     * Gets the itemIsFulfilled value for this CashSaleItem.
     * 
     * @return itemIsFulfilled
     */
    public java.lang.Boolean getItemIsFulfilled() {
        return itemIsFulfilled;
    }


    /**
     * Sets the itemIsFulfilled value for this CashSaleItem.
     * 
     * @param itemIsFulfilled
     */
    public void setItemIsFulfilled(java.lang.Boolean itemIsFulfilled) {
        this.itemIsFulfilled = itemIsFulfilled;
    }


    /**
     * Gets the shipAddress value for this CashSaleItem.
     * 
     * @return shipAddress
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this CashSaleItem.
     * 
     * @param shipAddress
     */
    public void setShipAddress(org.mule.module.netsuite.api.internal.RecordRef shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the shipMethod value for this CashSaleItem.
     * 
     * @return shipMethod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this CashSaleItem.
     * 
     * @param shipMethod
     */
    public void setShipMethod(org.mule.module.netsuite.api.internal.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the vsoePrice value for this CashSaleItem.
     * 
     * @return vsoePrice
     */
    public java.lang.Double getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this CashSaleItem.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(java.lang.Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the vsoeAmount value for this CashSaleItem.
     * 
     * @return vsoeAmount
     */
    public java.lang.Double getVsoeAmount() {
        return vsoeAmount;
    }


    /**
     * Sets the vsoeAmount value for this CashSaleItem.
     * 
     * @param vsoeAmount
     */
    public void setVsoeAmount(java.lang.Double vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }


    /**
     * Gets the vsoeAllocation value for this CashSaleItem.
     * 
     * @return vsoeAllocation
     */
    public java.lang.Double getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this CashSaleItem.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(java.lang.Double vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }


    /**
     * Gets the vsoeDeferral value for this CashSaleItem.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this CashSaleItem.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this CashSaleItem.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this CashSaleItem.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this CashSaleItem.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this CashSaleItem.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the customFieldList value for this CashSaleItem.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CashSaleItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CashSaleItem)) return false;
        CashSaleItem other = (CashSaleItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.job==null && other.getJob()==null) || 
             (this.job!=null &&
              this.job.equals(other.getJob()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.quantityFulfilled==null && other.getQuantityFulfilled()==null) || 
             (this.quantityFulfilled!=null &&
              this.quantityFulfilled.equals(other.getQuantityFulfilled()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.binNumbers==null && other.getBinNumbers()==null) || 
             (this.binNumbers!=null &&
              this.binNumbers.equals(other.getBinNumbers()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.orderLine==null && other.getOrderLine()==null) || 
             (this.orderLine!=null &&
              this.orderLine.equals(other.getOrderLine()))) &&
            ((this.licenseCode==null && other.getLicenseCode()==null) || 
             (this.licenseCode!=null &&
              this.licenseCode.equals(other.getLicenseCode()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.currentPercent==null && other.getCurrentPercent()==null) || 
             (this.currentPercent!=null &&
              this.currentPercent.equals(other.getCurrentPercent()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              this.percentComplete.equals(other.getPercentComplete()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.revRecStartDate==null && other.getRevRecStartDate()==null) || 
             (this.revRecStartDate!=null &&
              this.revRecStartDate.equals(other.getRevRecStartDate()))) &&
            ((this.revRecEndDate==null && other.getRevRecEndDate()==null) || 
             (this.revRecEndDate!=null &&
              this.revRecEndDate.equals(other.getRevRecEndDate()))) &&
            ((this.grossAmt==null && other.getGrossAmt()==null) || 
             (this.grossAmt!=null &&
              this.grossAmt.equals(other.getGrossAmt()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.amountOrdered==null && other.getAmountOrdered()==null) || 
             (this.amountOrdered!=null &&
              this.amountOrdered.equals(other.getAmountOrdered()))) &&
            ((this.tax1Amt==null && other.getTax1Amt()==null) || 
             (this.tax1Amt!=null &&
              this.tax1Amt.equals(other.getTax1Amt()))) &&
            ((this.quantityOrdered==null && other.getQuantityOrdered()==null) || 
             (this.quantityOrdered!=null &&
              this.quantityOrdered.equals(other.getQuantityOrdered()))) &&
            ((this.quantityRemaining==null && other.getQuantityRemaining()==null) || 
             (this.quantityRemaining!=null &&
              this.quantityRemaining.equals(other.getQuantityRemaining()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxRate1==null && other.getTaxRate1()==null) || 
             (this.taxRate1!=null &&
              this.taxRate1.equals(other.getTaxRate1()))) &&
            ((this.taxRate2==null && other.getTaxRate2()==null) || 
             (this.taxRate2!=null &&
              this.taxRate2.equals(other.getTaxRate2()))) &&
            ((this.giftCertFrom==null && other.getGiftCertFrom()==null) || 
             (this.giftCertFrom!=null &&
              this.giftCertFrom.equals(other.getGiftCertFrom()))) &&
            ((this.giftCertRecipientName==null && other.getGiftCertRecipientName()==null) || 
             (this.giftCertRecipientName!=null &&
              this.giftCertRecipientName.equals(other.getGiftCertRecipientName()))) &&
            ((this.giftCertRecipientEmail==null && other.getGiftCertRecipientEmail()==null) || 
             (this.giftCertRecipientEmail!=null &&
              this.giftCertRecipientEmail.equals(other.getGiftCertRecipientEmail()))) &&
            ((this.giftCertMessage==null && other.getGiftCertMessage()==null) || 
             (this.giftCertMessage!=null &&
              this.giftCertMessage.equals(other.getGiftCertMessage()))) &&
            ((this.giftCertNumber==null && other.getGiftCertNumber()==null) || 
             (this.giftCertNumber!=null &&
              this.giftCertNumber.equals(other.getGiftCertNumber()))) &&
            ((this.shipGroup==null && other.getShipGroup()==null) || 
             (this.shipGroup!=null &&
              this.shipGroup.equals(other.getShipGroup()))) &&
            ((this.itemIsFulfilled==null && other.getItemIsFulfilled()==null) || 
             (this.itemIsFulfilled!=null &&
              this.itemIsFulfilled.equals(other.getItemIsFulfilled()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.vsoeAmount==null && other.getVsoeAmount()==null) || 
             (this.vsoeAmount!=null &&
              this.vsoeAmount.equals(other.getVsoeAmount()))) &&
            ((this.vsoeAllocation==null && other.getVsoeAllocation()==null) || 
             (this.vsoeAllocation!=null &&
              this.vsoeAllocation.equals(other.getVsoeAllocation()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
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
        if (getJob() != null) {
            _hashCode += getJob().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getQuantityFulfilled() != null) {
            _hashCode += getQuantityFulfilled().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getBinNumbers() != null) {
            _hashCode += getBinNumbers().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getOrderLine() != null) {
            _hashCode += getOrderLine().hashCode();
        }
        if (getLicenseCode() != null) {
            _hashCode += getLicenseCode().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getCurrentPercent() != null) {
            _hashCode += getCurrentPercent().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getPercentComplete() != null) {
            _hashCode += getPercentComplete().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getRevRecStartDate() != null) {
            _hashCode += getRevRecStartDate().hashCode();
        }
        if (getRevRecEndDate() != null) {
            _hashCode += getRevRecEndDate().hashCode();
        }
        if (getGrossAmt() != null) {
            _hashCode += getGrossAmt().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getAmountOrdered() != null) {
            _hashCode += getAmountOrdered().hashCode();
        }
        if (getTax1Amt() != null) {
            _hashCode += getTax1Amt().hashCode();
        }
        if (getQuantityOrdered() != null) {
            _hashCode += getQuantityOrdered().hashCode();
        }
        if (getQuantityRemaining() != null) {
            _hashCode += getQuantityRemaining().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxRate1() != null) {
            _hashCode += getTaxRate1().hashCode();
        }
        if (getTaxRate2() != null) {
            _hashCode += getTaxRate2().hashCode();
        }
        if (getGiftCertFrom() != null) {
            _hashCode += getGiftCertFrom().hashCode();
        }
        if (getGiftCertRecipientName() != null) {
            _hashCode += getGiftCertRecipientName().hashCode();
        }
        if (getGiftCertRecipientEmail() != null) {
            _hashCode += getGiftCertRecipientEmail().hashCode();
        }
        if (getGiftCertMessage() != null) {
            _hashCode += getGiftCertMessage().hashCode();
        }
        if (getGiftCertNumber() != null) {
            _hashCode += getGiftCertNumber().hashCode();
        }
        if (getShipGroup() != null) {
            _hashCode += getShipGroup().hashCode();
        }
        if (getItemIsFulfilled() != null) {
            _hashCode += getItemIsFulfilled().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getVsoeAmount() != null) {
            _hashCode += getVsoeAmount().hashCode();
        }
        if (getVsoeAllocation() != null) {
            _hashCode += getVsoeAllocation().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CashSaleItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "CashSaleItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "quantityFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "orderLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "licenseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentPercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "currentPercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amountOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "amountOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "quantityOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipientName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "giftCertRecipientName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "giftCertRecipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "giftCertNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemIsFulfilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "itemIsFulfilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "customFieldList"));
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
