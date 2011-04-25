/**
 * InterCompanyTransferOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InterCompanyTransferOrder  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.Double shippingCost;

    private java.lang.Double subTotal;

    private java.lang.String status;

    private org.mule.module.netsuite.api.internal.ShipAddress transactionShipAddress;

    private org.mule.module.netsuite.api.internal.RecordRef shipAddressList;

    private java.lang.String shipAddress;

    private java.lang.String fob;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private java.lang.String source;

    private org.mule.module.netsuite.api.internal.TransferOrderOrderStatus orderStatus;

    private org.mule.module.netsuite.api.internal.RecordRef subsidiary;

    private org.mule.module.netsuite.api.internal.RecordRef toSubsidiary;

    private org.mule.module.netsuite.api.internal.RecordRef employee;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRef transferLocation;

    private java.lang.String memo;

    private java.util.Calendar shipDate;

    private org.mule.module.netsuite.api.internal.RecordRef shipMethod;

    private java.lang.String trackingNumbers;

    private java.lang.String linkedTrackingNumbers;

    private java.lang.Boolean shipComplete;

    private java.lang.Double altShippingCost;

    private java.lang.Double shippingTax1Rate;

    private java.lang.Double handlingTax1Rate;

    private java.lang.Double shippingTax2Rate;

    private java.lang.Double handlingTax2Rate;

    private org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode;

    private org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode;

    private java.lang.Double total;

    private org.mule.module.netsuite.api.internal.InterCompanyTransferOrderItemList itemList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public InterCompanyTransferOrder() {
    }

    public InterCompanyTransferOrder(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.Double shippingCost,
           java.lang.Double subTotal,
           java.lang.String status,
           org.mule.module.netsuite.api.internal.ShipAddress transactionShipAddress,
           org.mule.module.netsuite.api.internal.RecordRef shipAddressList,
           java.lang.String shipAddress,
           java.lang.String fob,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           java.lang.String source,
           org.mule.module.netsuite.api.internal.TransferOrderOrderStatus orderStatus,
           org.mule.module.netsuite.api.internal.RecordRef subsidiary,
           org.mule.module.netsuite.api.internal.RecordRef toSubsidiary,
           org.mule.module.netsuite.api.internal.RecordRef employee,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRef transferLocation,
           java.lang.String memo,
           java.util.Calendar shipDate,
           org.mule.module.netsuite.api.internal.RecordRef shipMethod,
           java.lang.String trackingNumbers,
           java.lang.String linkedTrackingNumbers,
           java.lang.Boolean shipComplete,
           java.lang.Double altShippingCost,
           java.lang.Double shippingTax1Rate,
           java.lang.Double handlingTax1Rate,
           java.lang.Double shippingTax2Rate,
           java.lang.Double handlingTax2Rate,
           org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode,
           org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode,
           java.lang.Double total,
           org.mule.module.netsuite.api.internal.InterCompanyTransferOrderItemList itemList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.shippingCost = shippingCost;
        this.subTotal = subTotal;
        this.status = status;
        this.transactionShipAddress = transactionShipAddress;
        this.shipAddressList = shipAddressList;
        this.shipAddress = shipAddress;
        this.fob = fob;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.source = source;
        this.orderStatus = orderStatus;
        this.subsidiary = subsidiary;
        this.toSubsidiary = toSubsidiary;
        this.employee = employee;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.transferLocation = transferLocation;
        this.memo = memo;
        this.shipDate = shipDate;
        this.shipMethod = shipMethod;
        this.trackingNumbers = trackingNumbers;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.shipComplete = shipComplete;
        this.altShippingCost = altShippingCost;
        this.shippingTax1Rate = shippingTax1Rate;
        this.handlingTax1Rate = handlingTax1Rate;
        this.shippingTax2Rate = shippingTax2Rate;
        this.handlingTax2Rate = handlingTax2Rate;
        this.shippingTaxCode = shippingTaxCode;
        this.handlingTaxCode = handlingTaxCode;
        this.total = total;
        this.itemList = itemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this InterCompanyTransferOrder.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this InterCompanyTransferOrder.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this InterCompanyTransferOrder.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this InterCompanyTransferOrder.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this InterCompanyTransferOrder.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this InterCompanyTransferOrder.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the shippingCost value for this InterCompanyTransferOrder.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this InterCompanyTransferOrder.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the subTotal value for this InterCompanyTransferOrder.
     * 
     * @return subTotal
     */
    public java.lang.Double getSubTotal() {
        return subTotal;
    }


    /**
     * Sets the subTotal value for this InterCompanyTransferOrder.
     * 
     * @param subTotal
     */
    public void setSubTotal(java.lang.Double subTotal) {
        this.subTotal = subTotal;
    }


    /**
     * Gets the status value for this InterCompanyTransferOrder.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this InterCompanyTransferOrder.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the transactionShipAddress value for this InterCompanyTransferOrder.
     * 
     * @return transactionShipAddress
     */
    public org.mule.module.netsuite.api.internal.ShipAddress getTransactionShipAddress() {
        return transactionShipAddress;
    }


    /**
     * Sets the transactionShipAddress value for this InterCompanyTransferOrder.
     * 
     * @param transactionShipAddress
     */
    public void setTransactionShipAddress(org.mule.module.netsuite.api.internal.ShipAddress transactionShipAddress) {
        this.transactionShipAddress = transactionShipAddress;
    }


    /**
     * Gets the shipAddressList value for this InterCompanyTransferOrder.
     * 
     * @return shipAddressList
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this InterCompanyTransferOrder.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(org.mule.module.netsuite.api.internal.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the shipAddress value for this InterCompanyTransferOrder.
     * 
     * @return shipAddress
     */
    public java.lang.String getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this InterCompanyTransferOrder.
     * 
     * @param shipAddress
     */
    public void setShipAddress(java.lang.String shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the fob value for this InterCompanyTransferOrder.
     * 
     * @return fob
     */
    public java.lang.String getFob() {
        return fob;
    }


    /**
     * Sets the fob value for this InterCompanyTransferOrder.
     * 
     * @param fob
     */
    public void setFob(java.lang.String fob) {
        this.fob = fob;
    }


    /**
     * Gets the tranDate value for this InterCompanyTransferOrder.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this InterCompanyTransferOrder.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this InterCompanyTransferOrder.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this InterCompanyTransferOrder.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the source value for this InterCompanyTransferOrder.
     * 
     * @return source
     */
    public java.lang.String getSource() {
        return source;
    }


    /**
     * Sets the source value for this InterCompanyTransferOrder.
     * 
     * @param source
     */
    public void setSource(java.lang.String source) {
        this.source = source;
    }


    /**
     * Gets the orderStatus value for this InterCompanyTransferOrder.
     * 
     * @return orderStatus
     */
    public org.mule.module.netsuite.api.internal.TransferOrderOrderStatus getOrderStatus() {
        return orderStatus;
    }


    /**
     * Sets the orderStatus value for this InterCompanyTransferOrder.
     * 
     * @param orderStatus
     */
    public void setOrderStatus(org.mule.module.netsuite.api.internal.TransferOrderOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }


    /**
     * Gets the subsidiary value for this InterCompanyTransferOrder.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this InterCompanyTransferOrder.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the toSubsidiary value for this InterCompanyTransferOrder.
     * 
     * @return toSubsidiary
     */
    public org.mule.module.netsuite.api.internal.RecordRef getToSubsidiary() {
        return toSubsidiary;
    }


    /**
     * Sets the toSubsidiary value for this InterCompanyTransferOrder.
     * 
     * @param toSubsidiary
     */
    public void setToSubsidiary(org.mule.module.netsuite.api.internal.RecordRef toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }


    /**
     * Gets the employee value for this InterCompanyTransferOrder.
     * 
     * @return employee
     */
    public org.mule.module.netsuite.api.internal.RecordRef getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this InterCompanyTransferOrder.
     * 
     * @param employee
     */
    public void setEmployee(org.mule.module.netsuite.api.internal.RecordRef employee) {
        this.employee = employee;
    }


    /**
     * Gets the department value for this InterCompanyTransferOrder.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this InterCompanyTransferOrder.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this InterCompanyTransferOrder.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this InterCompanyTransferOrder.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this InterCompanyTransferOrder.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InterCompanyTransferOrder.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the transferLocation value for this InterCompanyTransferOrder.
     * 
     * @return transferLocation
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTransferLocation() {
        return transferLocation;
    }


    /**
     * Sets the transferLocation value for this InterCompanyTransferOrder.
     * 
     * @param transferLocation
     */
    public void setTransferLocation(org.mule.module.netsuite.api.internal.RecordRef transferLocation) {
        this.transferLocation = transferLocation;
    }


    /**
     * Gets the memo value for this InterCompanyTransferOrder.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this InterCompanyTransferOrder.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the shipDate value for this InterCompanyTransferOrder.
     * 
     * @return shipDate
     */
    public java.util.Calendar getShipDate() {
        return shipDate;
    }


    /**
     * Sets the shipDate value for this InterCompanyTransferOrder.
     * 
     * @param shipDate
     */
    public void setShipDate(java.util.Calendar shipDate) {
        this.shipDate = shipDate;
    }


    /**
     * Gets the shipMethod value for this InterCompanyTransferOrder.
     * 
     * @return shipMethod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this InterCompanyTransferOrder.
     * 
     * @param shipMethod
     */
    public void setShipMethod(org.mule.module.netsuite.api.internal.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the trackingNumbers value for this InterCompanyTransferOrder.
     * 
     * @return trackingNumbers
     */
    public java.lang.String getTrackingNumbers() {
        return trackingNumbers;
    }


    /**
     * Sets the trackingNumbers value for this InterCompanyTransferOrder.
     * 
     * @param trackingNumbers
     */
    public void setTrackingNumbers(java.lang.String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }


    /**
     * Gets the linkedTrackingNumbers value for this InterCompanyTransferOrder.
     * 
     * @return linkedTrackingNumbers
     */
    public java.lang.String getLinkedTrackingNumbers() {
        return linkedTrackingNumbers;
    }


    /**
     * Sets the linkedTrackingNumbers value for this InterCompanyTransferOrder.
     * 
     * @param linkedTrackingNumbers
     */
    public void setLinkedTrackingNumbers(java.lang.String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }


    /**
     * Gets the shipComplete value for this InterCompanyTransferOrder.
     * 
     * @return shipComplete
     */
    public java.lang.Boolean getShipComplete() {
        return shipComplete;
    }


    /**
     * Sets the shipComplete value for this InterCompanyTransferOrder.
     * 
     * @param shipComplete
     */
    public void setShipComplete(java.lang.Boolean shipComplete) {
        this.shipComplete = shipComplete;
    }


    /**
     * Gets the altShippingCost value for this InterCompanyTransferOrder.
     * 
     * @return altShippingCost
     */
    public java.lang.Double getAltShippingCost() {
        return altShippingCost;
    }


    /**
     * Sets the altShippingCost value for this InterCompanyTransferOrder.
     * 
     * @param altShippingCost
     */
    public void setAltShippingCost(java.lang.Double altShippingCost) {
        this.altShippingCost = altShippingCost;
    }


    /**
     * Gets the shippingTax1Rate value for this InterCompanyTransferOrder.
     * 
     * @return shippingTax1Rate
     */
    public java.lang.Double getShippingTax1Rate() {
        return shippingTax1Rate;
    }


    /**
     * Sets the shippingTax1Rate value for this InterCompanyTransferOrder.
     * 
     * @param shippingTax1Rate
     */
    public void setShippingTax1Rate(java.lang.Double shippingTax1Rate) {
        this.shippingTax1Rate = shippingTax1Rate;
    }


    /**
     * Gets the handlingTax1Rate value for this InterCompanyTransferOrder.
     * 
     * @return handlingTax1Rate
     */
    public java.lang.Double getHandlingTax1Rate() {
        return handlingTax1Rate;
    }


    /**
     * Sets the handlingTax1Rate value for this InterCompanyTransferOrder.
     * 
     * @param handlingTax1Rate
     */
    public void setHandlingTax1Rate(java.lang.Double handlingTax1Rate) {
        this.handlingTax1Rate = handlingTax1Rate;
    }


    /**
     * Gets the shippingTax2Rate value for this InterCompanyTransferOrder.
     * 
     * @return shippingTax2Rate
     */
    public java.lang.Double getShippingTax2Rate() {
        return shippingTax2Rate;
    }


    /**
     * Sets the shippingTax2Rate value for this InterCompanyTransferOrder.
     * 
     * @param shippingTax2Rate
     */
    public void setShippingTax2Rate(java.lang.Double shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }


    /**
     * Gets the handlingTax2Rate value for this InterCompanyTransferOrder.
     * 
     * @return handlingTax2Rate
     */
    public java.lang.Double getHandlingTax2Rate() {
        return handlingTax2Rate;
    }


    /**
     * Sets the handlingTax2Rate value for this InterCompanyTransferOrder.
     * 
     * @param handlingTax2Rate
     */
    public void setHandlingTax2Rate(java.lang.Double handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }


    /**
     * Gets the shippingTaxCode value for this InterCompanyTransferOrder.
     * 
     * @return shippingTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShippingTaxCode() {
        return shippingTaxCode;
    }


    /**
     * Sets the shippingTaxCode value for this InterCompanyTransferOrder.
     * 
     * @param shippingTaxCode
     */
    public void setShippingTaxCode(org.mule.module.netsuite.api.internal.RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }


    /**
     * Gets the handlingTaxCode value for this InterCompanyTransferOrder.
     * 
     * @return handlingTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getHandlingTaxCode() {
        return handlingTaxCode;
    }


    /**
     * Sets the handlingTaxCode value for this InterCompanyTransferOrder.
     * 
     * @param handlingTaxCode
     */
    public void setHandlingTaxCode(org.mule.module.netsuite.api.internal.RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }


    /**
     * Gets the total value for this InterCompanyTransferOrder.
     * 
     * @return total
     */
    public java.lang.Double getTotal() {
        return total;
    }


    /**
     * Sets the total value for this InterCompanyTransferOrder.
     * 
     * @param total
     */
    public void setTotal(java.lang.Double total) {
        this.total = total;
    }


    /**
     * Gets the itemList value for this InterCompanyTransferOrder.
     * 
     * @return itemList
     */
    public org.mule.module.netsuite.api.internal.InterCompanyTransferOrderItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this InterCompanyTransferOrder.
     * 
     * @param itemList
     */
    public void setItemList(org.mule.module.netsuite.api.internal.InterCompanyTransferOrderItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the customFieldList value for this InterCompanyTransferOrder.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this InterCompanyTransferOrder.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this InterCompanyTransferOrder.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this InterCompanyTransferOrder.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this InterCompanyTransferOrder.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this InterCompanyTransferOrder.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterCompanyTransferOrder)) return false;
        InterCompanyTransferOrder other = (InterCompanyTransferOrder) obj;
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
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.subTotal==null && other.getSubTotal()==null) || 
             (this.subTotal!=null &&
              this.subTotal.equals(other.getSubTotal()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.transactionShipAddress==null && other.getTransactionShipAddress()==null) || 
             (this.transactionShipAddress!=null &&
              this.transactionShipAddress.equals(other.getTransactionShipAddress()))) &&
            ((this.shipAddressList==null && other.getShipAddressList()==null) || 
             (this.shipAddressList!=null &&
              this.shipAddressList.equals(other.getShipAddressList()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.fob==null && other.getFob()==null) || 
             (this.fob!=null &&
              this.fob.equals(other.getFob()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.source==null && other.getSource()==null) || 
             (this.source!=null &&
              this.source.equals(other.getSource()))) &&
            ((this.orderStatus==null && other.getOrderStatus()==null) || 
             (this.orderStatus!=null &&
              this.orderStatus.equals(other.getOrderStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.toSubsidiary==null && other.getToSubsidiary()==null) || 
             (this.toSubsidiary!=null &&
              this.toSubsidiary.equals(other.getToSubsidiary()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.transferLocation==null && other.getTransferLocation()==null) || 
             (this.transferLocation!=null &&
              this.transferLocation.equals(other.getTransferLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.shipDate==null && other.getShipDate()==null) || 
             (this.shipDate!=null &&
              this.shipDate.equals(other.getShipDate()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.trackingNumbers==null && other.getTrackingNumbers()==null) || 
             (this.trackingNumbers!=null &&
              this.trackingNumbers.equals(other.getTrackingNumbers()))) &&
            ((this.linkedTrackingNumbers==null && other.getLinkedTrackingNumbers()==null) || 
             (this.linkedTrackingNumbers!=null &&
              this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers()))) &&
            ((this.shipComplete==null && other.getShipComplete()==null) || 
             (this.shipComplete!=null &&
              this.shipComplete.equals(other.getShipComplete()))) &&
            ((this.altShippingCost==null && other.getAltShippingCost()==null) || 
             (this.altShippingCost!=null &&
              this.altShippingCost.equals(other.getAltShippingCost()))) &&
            ((this.shippingTax1Rate==null && other.getShippingTax1Rate()==null) || 
             (this.shippingTax1Rate!=null &&
              this.shippingTax1Rate.equals(other.getShippingTax1Rate()))) &&
            ((this.handlingTax1Rate==null && other.getHandlingTax1Rate()==null) || 
             (this.handlingTax1Rate!=null &&
              this.handlingTax1Rate.equals(other.getHandlingTax1Rate()))) &&
            ((this.shippingTax2Rate==null && other.getShippingTax2Rate()==null) || 
             (this.shippingTax2Rate!=null &&
              this.shippingTax2Rate.equals(other.getShippingTax2Rate()))) &&
            ((this.handlingTax2Rate==null && other.getHandlingTax2Rate()==null) || 
             (this.handlingTax2Rate!=null &&
              this.handlingTax2Rate.equals(other.getHandlingTax2Rate()))) &&
            ((this.shippingTaxCode==null && other.getShippingTaxCode()==null) || 
             (this.shippingTaxCode!=null &&
              this.shippingTaxCode.equals(other.getShippingTaxCode()))) &&
            ((this.handlingTaxCode==null && other.getHandlingTaxCode()==null) || 
             (this.handlingTaxCode!=null &&
              this.handlingTaxCode.equals(other.getHandlingTaxCode()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
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
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getSubTotal() != null) {
            _hashCode += getSubTotal().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTransactionShipAddress() != null) {
            _hashCode += getTransactionShipAddress().hashCode();
        }
        if (getShipAddressList() != null) {
            _hashCode += getShipAddressList().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getFob() != null) {
            _hashCode += getFob().hashCode();
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
        if (getOrderStatus() != null) {
            _hashCode += getOrderStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getToSubsidiary() != null) {
            _hashCode += getToSubsidiary().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
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
        if (getTransferLocation() != null) {
            _hashCode += getTransferLocation().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getShipDate() != null) {
            _hashCode += getShipDate().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getTrackingNumbers() != null) {
            _hashCode += getTrackingNumbers().hashCode();
        }
        if (getLinkedTrackingNumbers() != null) {
            _hashCode += getLinkedTrackingNumbers().hashCode();
        }
        if (getShipComplete() != null) {
            _hashCode += getShipComplete().hashCode();
        }
        if (getAltShippingCost() != null) {
            _hashCode += getAltShippingCost().hashCode();
        }
        if (getShippingTax1Rate() != null) {
            _hashCode += getShippingTax1Rate().hashCode();
        }
        if (getHandlingTax1Rate() != null) {
            _hashCode += getHandlingTax1Rate().hashCode();
        }
        if (getShippingTax2Rate() != null) {
            _hashCode += getShippingTax2Rate().hashCode();
        }
        if (getHandlingTax2Rate() != null) {
            _hashCode += getHandlingTax2Rate().hashCode();
        }
        if (getShippingTaxCode() != null) {
            _hashCode += getShippingTaxCode().hashCode();
        }
        if (getHandlingTaxCode() != null) {
            _hashCode += getHandlingTaxCode().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
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
        new org.apache.axis.description.TypeDesc(InterCompanyTransferOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InterCompanyTransferOrder"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionShipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "transactionShipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ShipAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "fob"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.inventory_2010_2.transactions.webservices.netsuite.com", "TransferOrderOrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedTrackingNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "linkedTrackingNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altShippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "altShippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shippingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax1Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "handlingTax1Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "InterCompanyTransferOrderItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:inventory_2010_2.transactions.webservices.netsuite.com", "customFieldList"));
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
