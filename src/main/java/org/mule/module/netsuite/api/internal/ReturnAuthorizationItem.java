/**
 * ReturnAuthorizationItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ReturnAuthorizationItem  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef job;

    private org.mule.module.netsuite.api.internal.RecordRef item;

    private java.lang.Long orderLine;

    private java.lang.Long line;

    private java.lang.Double quantity;

    private java.lang.Double quantityReceived;

    private java.lang.Double quantityBilled;

    private org.mule.module.netsuite.api.internal.RecordRef units;

    private java.lang.String description;

    private java.lang.String serialNumbers;

    private org.mule.module.netsuite.api.internal.RecordRef price;

    private java.lang.String rate;

    private java.lang.Double amount;

    private org.mule.module.netsuite.api.internal.CustomFieldList options;

    private java.lang.Long revRecTermInMonths;

    private java.lang.Boolean deferRevRec;

    private java.lang.Boolean isClosed;

    private java.lang.Boolean isDropShipment;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType;

    private java.lang.Double costEstimate;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRef revRecSchedule;

    private java.util.Calendar revRecStartDate;

    private java.util.Calendar revRecEndDate;

    private org.mule.module.netsuite.api.internal.RecordRef taxCode;

    private java.lang.Double taxRate1;

    private java.lang.Double taxRate2;

    private java.lang.Double tax1Amt;

    private java.lang.Double grossAmt;

    private java.lang.Boolean isTaxable;

    private java.lang.String giftCertFrom;

    private java.lang.String giftCertRecipientName;

    private java.lang.String giftCertRecipientEmail;

    private java.lang.String giftCertMessage;

    private java.lang.String giftCertNumber;

    private java.lang.Double vsoePrice;

    private java.lang.Double vsoeAmount;

    private java.lang.Double altSalesAmt;

    private java.lang.Double vsoeAllocation;

    private org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral;

    private org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    public ReturnAuthorizationItem() {
    }

    public ReturnAuthorizationItem(
           org.mule.module.netsuite.api.internal.RecordRef job,
           org.mule.module.netsuite.api.internal.RecordRef item,
           java.lang.Long orderLine,
           java.lang.Long line,
           java.lang.Double quantity,
           java.lang.Double quantityReceived,
           java.lang.Double quantityBilled,
           org.mule.module.netsuite.api.internal.RecordRef units,
           java.lang.String description,
           java.lang.String serialNumbers,
           org.mule.module.netsuite.api.internal.RecordRef price,
           java.lang.String rate,
           java.lang.Double amount,
           org.mule.module.netsuite.api.internal.CustomFieldList options,
           java.lang.Long revRecTermInMonths,
           java.lang.Boolean deferRevRec,
           java.lang.Boolean isClosed,
           java.lang.Boolean isDropShipment,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType,
           java.lang.Double costEstimate,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRef revRecSchedule,
           java.util.Calendar revRecStartDate,
           java.util.Calendar revRecEndDate,
           org.mule.module.netsuite.api.internal.RecordRef taxCode,
           java.lang.Double taxRate1,
           java.lang.Double taxRate2,
           java.lang.Double tax1Amt,
           java.lang.Double grossAmt,
           java.lang.Boolean isTaxable,
           java.lang.String giftCertFrom,
           java.lang.String giftCertRecipientName,
           java.lang.String giftCertRecipientEmail,
           java.lang.String giftCertMessage,
           java.lang.String giftCertNumber,
           java.lang.Double vsoePrice,
           java.lang.Double vsoeAmount,
           java.lang.Double altSalesAmt,
           java.lang.Double vsoeAllocation,
           org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral,
           org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
           this.job = job;
           this.item = item;
           this.orderLine = orderLine;
           this.line = line;
           this.quantity = quantity;
           this.quantityReceived = quantityReceived;
           this.quantityBilled = quantityBilled;
           this.units = units;
           this.description = description;
           this.serialNumbers = serialNumbers;
           this.price = price;
           this.rate = rate;
           this.amount = amount;
           this.options = options;
           this.revRecTermInMonths = revRecTermInMonths;
           this.deferRevRec = deferRevRec;
           this.isClosed = isClosed;
           this.isDropShipment = isDropShipment;
           this.department = department;
           this.costEstimateType = costEstimateType;
           this.costEstimate = costEstimate;
           this._class = _class;
           this.location = location;
           this.revRecSchedule = revRecSchedule;
           this.revRecStartDate = revRecStartDate;
           this.revRecEndDate = revRecEndDate;
           this.taxCode = taxCode;
           this.taxRate1 = taxRate1;
           this.taxRate2 = taxRate2;
           this.tax1Amt = tax1Amt;
           this.grossAmt = grossAmt;
           this.isTaxable = isTaxable;
           this.giftCertFrom = giftCertFrom;
           this.giftCertRecipientName = giftCertRecipientName;
           this.giftCertRecipientEmail = giftCertRecipientEmail;
           this.giftCertMessage = giftCertMessage;
           this.giftCertNumber = giftCertNumber;
           this.vsoePrice = vsoePrice;
           this.vsoeAmount = vsoeAmount;
           this.altSalesAmt = altSalesAmt;
           this.vsoeAllocation = vsoeAllocation;
           this.vsoeDeferral = vsoeDeferral;
           this.vsoePermitDiscount = vsoePermitDiscount;
           this.vsoeDelivered = vsoeDelivered;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the job value for this ReturnAuthorizationItem.
     * 
     * @return job
     */
    public org.mule.module.netsuite.api.internal.RecordRef getJob() {
        return job;
    }


    /**
     * Sets the job value for this ReturnAuthorizationItem.
     * 
     * @param job
     */
    public void setJob(org.mule.module.netsuite.api.internal.RecordRef job) {
        this.job = job;
    }


    /**
     * Gets the item value for this ReturnAuthorizationItem.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this ReturnAuthorizationItem.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the orderLine value for this ReturnAuthorizationItem.
     * 
     * @return orderLine
     */
    public java.lang.Long getOrderLine() {
        return orderLine;
    }


    /**
     * Sets the orderLine value for this ReturnAuthorizationItem.
     * 
     * @param orderLine
     */
    public void setOrderLine(java.lang.Long orderLine) {
        this.orderLine = orderLine;
    }


    /**
     * Gets the line value for this ReturnAuthorizationItem.
     * 
     * @return line
     */
    public java.lang.Long getLine() {
        return line;
    }


    /**
     * Sets the line value for this ReturnAuthorizationItem.
     * 
     * @param line
     */
    public void setLine(java.lang.Long line) {
        this.line = line;
    }


    /**
     * Gets the quantity value for this ReturnAuthorizationItem.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ReturnAuthorizationItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the quantityReceived value for this ReturnAuthorizationItem.
     * 
     * @return quantityReceived
     */
    public java.lang.Double getQuantityReceived() {
        return quantityReceived;
    }


    /**
     * Sets the quantityReceived value for this ReturnAuthorizationItem.
     * 
     * @param quantityReceived
     */
    public void setQuantityReceived(java.lang.Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }


    /**
     * Gets the quantityBilled value for this ReturnAuthorizationItem.
     * 
     * @return quantityBilled
     */
    public java.lang.Double getQuantityBilled() {
        return quantityBilled;
    }


    /**
     * Sets the quantityBilled value for this ReturnAuthorizationItem.
     * 
     * @param quantityBilled
     */
    public void setQuantityBilled(java.lang.Double quantityBilled) {
        this.quantityBilled = quantityBilled;
    }


    /**
     * Gets the units value for this ReturnAuthorizationItem.
     * 
     * @return units
     */
    public org.mule.module.netsuite.api.internal.RecordRef getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ReturnAuthorizationItem.
     * 
     * @param units
     */
    public void setUnits(org.mule.module.netsuite.api.internal.RecordRef units) {
        this.units = units;
    }


    /**
     * Gets the description value for this ReturnAuthorizationItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ReturnAuthorizationItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the serialNumbers value for this ReturnAuthorizationItem.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this ReturnAuthorizationItem.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the price value for this ReturnAuthorizationItem.
     * 
     * @return price
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ReturnAuthorizationItem.
     * 
     * @param price
     */
    public void setPrice(org.mule.module.netsuite.api.internal.RecordRef price) {
        this.price = price;
    }


    /**
     * Gets the rate value for this ReturnAuthorizationItem.
     * 
     * @return rate
     */
    public java.lang.String getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this ReturnAuthorizationItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.String rate) {
        this.rate = rate;
    }


    /**
     * Gets the amount value for this ReturnAuthorizationItem.
     * 
     * @return amount
     */
    public java.lang.Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ReturnAuthorizationItem.
     * 
     * @param amount
     */
    public void setAmount(java.lang.Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the options value for this ReturnAuthorizationItem.
     * 
     * @return options
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ReturnAuthorizationItem.
     * 
     * @param options
     */
    public void setOptions(org.mule.module.netsuite.api.internal.CustomFieldList options) {
        this.options = options;
    }


    /**
     * Gets the revRecTermInMonths value for this ReturnAuthorizationItem.
     * 
     * @return revRecTermInMonths
     */
    public java.lang.Long getRevRecTermInMonths() {
        return revRecTermInMonths;
    }


    /**
     * Sets the revRecTermInMonths value for this ReturnAuthorizationItem.
     * 
     * @param revRecTermInMonths
     */
    public void setRevRecTermInMonths(java.lang.Long revRecTermInMonths) {
        this.revRecTermInMonths = revRecTermInMonths;
    }


    /**
     * Gets the deferRevRec value for this ReturnAuthorizationItem.
     * 
     * @return deferRevRec
     */
    public java.lang.Boolean getDeferRevRec() {
        return deferRevRec;
    }


    /**
     * Sets the deferRevRec value for this ReturnAuthorizationItem.
     * 
     * @param deferRevRec
     */
    public void setDeferRevRec(java.lang.Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
    }


    /**
     * Gets the isClosed value for this ReturnAuthorizationItem.
     * 
     * @return isClosed
     */
    public java.lang.Boolean getIsClosed() {
        return isClosed;
    }


    /**
     * Sets the isClosed value for this ReturnAuthorizationItem.
     * 
     * @param isClosed
     */
    public void setIsClosed(java.lang.Boolean isClosed) {
        this.isClosed = isClosed;
    }


    /**
     * Gets the isDropShipment value for this ReturnAuthorizationItem.
     * 
     * @return isDropShipment
     */
    public java.lang.Boolean getIsDropShipment() {
        return isDropShipment;
    }


    /**
     * Sets the isDropShipment value for this ReturnAuthorizationItem.
     * 
     * @param isDropShipment
     */
    public void setIsDropShipment(java.lang.Boolean isDropShipment) {
        this.isDropShipment = isDropShipment;
    }


    /**
     * Gets the department value for this ReturnAuthorizationItem.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ReturnAuthorizationItem.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the costEstimateType value for this ReturnAuthorizationItem.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this ReturnAuthorizationItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costEstimate value for this ReturnAuthorizationItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this ReturnAuthorizationItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the _class value for this ReturnAuthorizationItem.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ReturnAuthorizationItem.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this ReturnAuthorizationItem.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ReturnAuthorizationItem.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the revRecSchedule value for this ReturnAuthorizationItem.
     * 
     * @return revRecSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ReturnAuthorizationItem.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(org.mule.module.netsuite.api.internal.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the revRecStartDate value for this ReturnAuthorizationItem.
     * 
     * @return revRecStartDate
     */
    public java.util.Calendar getRevRecStartDate() {
        return revRecStartDate;
    }


    /**
     * Sets the revRecStartDate value for this ReturnAuthorizationItem.
     * 
     * @param revRecStartDate
     */
    public void setRevRecStartDate(java.util.Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }


    /**
     * Gets the revRecEndDate value for this ReturnAuthorizationItem.
     * 
     * @return revRecEndDate
     */
    public java.util.Calendar getRevRecEndDate() {
        return revRecEndDate;
    }


    /**
     * Sets the revRecEndDate value for this ReturnAuthorizationItem.
     * 
     * @param revRecEndDate
     */
    public void setRevRecEndDate(java.util.Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }


    /**
     * Gets the taxCode value for this ReturnAuthorizationItem.
     * 
     * @return taxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ReturnAuthorizationItem.
     * 
     * @param taxCode
     */
    public void setTaxCode(org.mule.module.netsuite.api.internal.RecordRef taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxRate1 value for this ReturnAuthorizationItem.
     * 
     * @return taxRate1
     */
    public java.lang.Double getTaxRate1() {
        return taxRate1;
    }


    /**
     * Sets the taxRate1 value for this ReturnAuthorizationItem.
     * 
     * @param taxRate1
     */
    public void setTaxRate1(java.lang.Double taxRate1) {
        this.taxRate1 = taxRate1;
    }


    /**
     * Gets the taxRate2 value for this ReturnAuthorizationItem.
     * 
     * @return taxRate2
     */
    public java.lang.Double getTaxRate2() {
        return taxRate2;
    }


    /**
     * Sets the taxRate2 value for this ReturnAuthorizationItem.
     * 
     * @param taxRate2
     */
    public void setTaxRate2(java.lang.Double taxRate2) {
        this.taxRate2 = taxRate2;
    }


    /**
     * Gets the tax1Amt value for this ReturnAuthorizationItem.
     * 
     * @return tax1Amt
     */
    public java.lang.Double getTax1Amt() {
        return tax1Amt;
    }


    /**
     * Sets the tax1Amt value for this ReturnAuthorizationItem.
     * 
     * @param tax1Amt
     */
    public void setTax1Amt(java.lang.Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }


    /**
     * Gets the grossAmt value for this ReturnAuthorizationItem.
     * 
     * @return grossAmt
     */
    public java.lang.Double getGrossAmt() {
        return grossAmt;
    }


    /**
     * Sets the grossAmt value for this ReturnAuthorizationItem.
     * 
     * @param grossAmt
     */
    public void setGrossAmt(java.lang.Double grossAmt) {
        this.grossAmt = grossAmt;
    }


    /**
     * Gets the isTaxable value for this ReturnAuthorizationItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this ReturnAuthorizationItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the giftCertFrom value for this ReturnAuthorizationItem.
     * 
     * @return giftCertFrom
     */
    public java.lang.String getGiftCertFrom() {
        return giftCertFrom;
    }


    /**
     * Sets the giftCertFrom value for this ReturnAuthorizationItem.
     * 
     * @param giftCertFrom
     */
    public void setGiftCertFrom(java.lang.String giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }


    /**
     * Gets the giftCertRecipientName value for this ReturnAuthorizationItem.
     * 
     * @return giftCertRecipientName
     */
    public java.lang.String getGiftCertRecipientName() {
        return giftCertRecipientName;
    }


    /**
     * Sets the giftCertRecipientName value for this ReturnAuthorizationItem.
     * 
     * @param giftCertRecipientName
     */
    public void setGiftCertRecipientName(java.lang.String giftCertRecipientName) {
        this.giftCertRecipientName = giftCertRecipientName;
    }


    /**
     * Gets the giftCertRecipientEmail value for this ReturnAuthorizationItem.
     * 
     * @return giftCertRecipientEmail
     */
    public java.lang.String getGiftCertRecipientEmail() {
        return giftCertRecipientEmail;
    }


    /**
     * Sets the giftCertRecipientEmail value for this ReturnAuthorizationItem.
     * 
     * @param giftCertRecipientEmail
     */
    public void setGiftCertRecipientEmail(java.lang.String giftCertRecipientEmail) {
        this.giftCertRecipientEmail = giftCertRecipientEmail;
    }


    /**
     * Gets the giftCertMessage value for this ReturnAuthorizationItem.
     * 
     * @return giftCertMessage
     */
    public java.lang.String getGiftCertMessage() {
        return giftCertMessage;
    }


    /**
     * Sets the giftCertMessage value for this ReturnAuthorizationItem.
     * 
     * @param giftCertMessage
     */
    public void setGiftCertMessage(java.lang.String giftCertMessage) {
        this.giftCertMessage = giftCertMessage;
    }


    /**
     * Gets the giftCertNumber value for this ReturnAuthorizationItem.
     * 
     * @return giftCertNumber
     */
    public java.lang.String getGiftCertNumber() {
        return giftCertNumber;
    }


    /**
     * Sets the giftCertNumber value for this ReturnAuthorizationItem.
     * 
     * @param giftCertNumber
     */
    public void setGiftCertNumber(java.lang.String giftCertNumber) {
        this.giftCertNumber = giftCertNumber;
    }


    /**
     * Gets the vsoePrice value for this ReturnAuthorizationItem.
     * 
     * @return vsoePrice
     */
    public java.lang.Double getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this ReturnAuthorizationItem.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(java.lang.Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the vsoeAmount value for this ReturnAuthorizationItem.
     * 
     * @return vsoeAmount
     */
    public java.lang.Double getVsoeAmount() {
        return vsoeAmount;
    }


    /**
     * Sets the vsoeAmount value for this ReturnAuthorizationItem.
     * 
     * @param vsoeAmount
     */
    public void setVsoeAmount(java.lang.Double vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }


    /**
     * Gets the altSalesAmt value for this ReturnAuthorizationItem.
     * 
     * @return altSalesAmt
     */
    public java.lang.Double getAltSalesAmt() {
        return altSalesAmt;
    }


    /**
     * Sets the altSalesAmt value for this ReturnAuthorizationItem.
     * 
     * @param altSalesAmt
     */
    public void setAltSalesAmt(java.lang.Double altSalesAmt) {
        this.altSalesAmt = altSalesAmt;
    }


    /**
     * Gets the vsoeAllocation value for this ReturnAuthorizationItem.
     * 
     * @return vsoeAllocation
     */
    public java.lang.Double getVsoeAllocation() {
        return vsoeAllocation;
    }


    /**
     * Sets the vsoeAllocation value for this ReturnAuthorizationItem.
     * 
     * @param vsoeAllocation
     */
    public void setVsoeAllocation(java.lang.Double vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }


    /**
     * Gets the vsoeDeferral value for this ReturnAuthorizationItem.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this ReturnAuthorizationItem.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this ReturnAuthorizationItem.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this ReturnAuthorizationItem.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this ReturnAuthorizationItem.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this ReturnAuthorizationItem.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the customFieldList value for this ReturnAuthorizationItem.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ReturnAuthorizationItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReturnAuthorizationItem)) return false;
        ReturnAuthorizationItem other = (ReturnAuthorizationItem) obj;
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
            ((this.orderLine==null && other.getOrderLine()==null) || 
             (this.orderLine!=null &&
              this.orderLine.equals(other.getOrderLine()))) &&
            ((this.line==null && other.getLine()==null) || 
             (this.line!=null &&
              this.line.equals(other.getLine()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.quantityReceived==null && other.getQuantityReceived()==null) || 
             (this.quantityReceived!=null &&
              this.quantityReceived.equals(other.getQuantityReceived()))) &&
            ((this.quantityBilled==null && other.getQuantityBilled()==null) || 
             (this.quantityBilled!=null &&
              this.quantityBilled.equals(other.getQuantityBilled()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              this.options.equals(other.getOptions()))) &&
            ((this.revRecTermInMonths==null && other.getRevRecTermInMonths()==null) || 
             (this.revRecTermInMonths!=null &&
              this.revRecTermInMonths.equals(other.getRevRecTermInMonths()))) &&
            ((this.deferRevRec==null && other.getDeferRevRec()==null) || 
             (this.deferRevRec!=null &&
              this.deferRevRec.equals(other.getDeferRevRec()))) &&
            ((this.isClosed==null && other.getIsClosed()==null) || 
             (this.isClosed!=null &&
              this.isClosed.equals(other.getIsClosed()))) &&
            ((this.isDropShipment==null && other.getIsDropShipment()==null) || 
             (this.isDropShipment!=null &&
              this.isDropShipment.equals(other.getIsDropShipment()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
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
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxRate1==null && other.getTaxRate1()==null) || 
             (this.taxRate1!=null &&
              this.taxRate1.equals(other.getTaxRate1()))) &&
            ((this.taxRate2==null && other.getTaxRate2()==null) || 
             (this.taxRate2!=null &&
              this.taxRate2.equals(other.getTaxRate2()))) &&
            ((this.tax1Amt==null && other.getTax1Amt()==null) || 
             (this.tax1Amt!=null &&
              this.tax1Amt.equals(other.getTax1Amt()))) &&
            ((this.grossAmt==null && other.getGrossAmt()==null) || 
             (this.grossAmt!=null &&
              this.grossAmt.equals(other.getGrossAmt()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
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
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.vsoeAmount==null && other.getVsoeAmount()==null) || 
             (this.vsoeAmount!=null &&
              this.vsoeAmount.equals(other.getVsoeAmount()))) &&
            ((this.altSalesAmt==null && other.getAltSalesAmt()==null) || 
             (this.altSalesAmt!=null &&
              this.altSalesAmt.equals(other.getAltSalesAmt()))) &&
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
        if (getOrderLine() != null) {
            _hashCode += getOrderLine().hashCode();
        }
        if (getLine() != null) {
            _hashCode += getLine().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getQuantityReceived() != null) {
            _hashCode += getQuantityReceived().hashCode();
        }
        if (getQuantityBilled() != null) {
            _hashCode += getQuantityBilled().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
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
        if (getOptions() != null) {
            _hashCode += getOptions().hashCode();
        }
        if (getRevRecTermInMonths() != null) {
            _hashCode += getRevRecTermInMonths().hashCode();
        }
        if (getDeferRevRec() != null) {
            _hashCode += getDeferRevRec().hashCode();
        }
        if (getIsClosed() != null) {
            _hashCode += getIsClosed().hashCode();
        }
        if (getIsDropShipment() != null) {
            _hashCode += getIsDropShipment().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
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
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxRate1() != null) {
            _hashCode += getTaxRate1().hashCode();
        }
        if (getTaxRate2() != null) {
            _hashCode += getTaxRate2().hashCode();
        }
        if (getTax1Amt() != null) {
            _hashCode += getTax1Amt().hashCode();
        }
        if (getGrossAmt() != null) {
            _hashCode += getGrossAmt().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
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
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getVsoeAmount() != null) {
            _hashCode += getVsoeAmount().hashCode();
        }
        if (getAltSalesAmt() != null) {
            _hashCode += getAltSalesAmt().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReturnAuthorizationItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "ReturnAuthorizationItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderLine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "orderLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecTermInMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "revRecTermInMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipment");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "isDropShipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipientName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertRecipientName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipientEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertRecipientEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "giftCertNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altSalesAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "altSalesAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customers_2010_2.transactions.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
