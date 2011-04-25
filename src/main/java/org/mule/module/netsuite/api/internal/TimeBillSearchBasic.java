/**
 * TimeBillSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TimeBillSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchBooleanField approved;

    private org.mule.module.netsuite.api.internal.SearchBooleanField billable;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField _class;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField customer;

    private org.mule.module.netsuite.api.internal.SearchDateField date;

    private org.mule.module.netsuite.api.internal.SearchDateField dateCreated;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField department;

    private org.mule.module.netsuite.api.internal.SearchDoubleField duration;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField employee;

    private org.mule.module.netsuite.api.internal.SearchBooleanField exempt;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField item;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModified;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField location;

    private org.mule.module.netsuite.api.internal.SearchStringField memo;

    private org.mule.module.netsuite.api.internal.SearchBooleanField paidByPayroll;

    private org.mule.module.netsuite.api.internal.SearchBooleanField paidExternally;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField payItem;

    private org.mule.module.netsuite.api.internal.SearchBooleanField productive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField status;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField temporaryLocalJurisdiction;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField temporaryStateJurisdiction;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type;

    private org.mule.module.netsuite.api.internal.SearchBooleanField utilized;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public TimeBillSearchBasic() {
    }

    public TimeBillSearchBasic(
           org.mule.module.netsuite.api.internal.SearchBooleanField approved,
           org.mule.module.netsuite.api.internal.SearchBooleanField billable,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField _class,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField customer,
           org.mule.module.netsuite.api.internal.SearchDateField date,
           org.mule.module.netsuite.api.internal.SearchDateField dateCreated,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField department,
           org.mule.module.netsuite.api.internal.SearchDoubleField duration,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField employee,
           org.mule.module.netsuite.api.internal.SearchBooleanField exempt,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField item,
           org.mule.module.netsuite.api.internal.SearchDateField lastModified,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField location,
           org.mule.module.netsuite.api.internal.SearchStringField memo,
           org.mule.module.netsuite.api.internal.SearchBooleanField paidByPayroll,
           org.mule.module.netsuite.api.internal.SearchBooleanField paidExternally,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField payItem,
           org.mule.module.netsuite.api.internal.SearchBooleanField productive,
           org.mule.module.netsuite.api.internal.SearchBooleanField status,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField temporaryLocalJurisdiction,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField temporaryStateJurisdiction,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type,
           org.mule.module.netsuite.api.internal.SearchBooleanField utilized,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.approved = approved;
        this.billable = billable;
        this._class = _class;
        this.customer = customer;
        this.date = date;
        this.dateCreated = dateCreated;
        this.department = department;
        this.duration = duration;
        this.employee = employee;
        this.exempt = exempt;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.memo = memo;
        this.paidByPayroll = paidByPayroll;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.productive = productive;
        this.status = status;
        this.subsidiary = subsidiary;
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
        this.type = type;
        this.utilized = utilized;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the approved value for this TimeBillSearchBasic.
     * 
     * @return approved
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getApproved() {
        return approved;
    }


    /**
     * Sets the approved value for this TimeBillSearchBasic.
     * 
     * @param approved
     */
    public void setApproved(org.mule.module.netsuite.api.internal.SearchBooleanField approved) {
        this.approved = approved;
    }


    /**
     * Gets the billable value for this TimeBillSearchBasic.
     * 
     * @return billable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getBillable() {
        return billable;
    }


    /**
     * Sets the billable value for this TimeBillSearchBasic.
     * 
     * @param billable
     */
    public void setBillable(org.mule.module.netsuite.api.internal.SearchBooleanField billable) {
        this.billable = billable;
    }


    /**
     * Gets the _class value for this TimeBillSearchBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeBillSearchBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the customer value for this TimeBillSearchBasic.
     * 
     * @return customer
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeBillSearchBasic.
     * 
     * @param customer
     */
    public void setCustomer(org.mule.module.netsuite.api.internal.SearchMultiSelectField customer) {
        this.customer = customer;
    }


    /**
     * Gets the date value for this TimeBillSearchBasic.
     * 
     * @return date
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDate() {
        return date;
    }


    /**
     * Sets the date value for this TimeBillSearchBasic.
     * 
     * @param date
     */
    public void setDate(org.mule.module.netsuite.api.internal.SearchDateField date) {
        this.date = date;
    }


    /**
     * Gets the dateCreated value for this TimeBillSearchBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TimeBillSearchBasic.
     * 
     * @param dateCreated
     */
    public void setDateCreated(org.mule.module.netsuite.api.internal.SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }


    /**
     * Gets the department value for this TimeBillSearchBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeBillSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the duration value for this TimeBillSearchBasic.
     * 
     * @return duration
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDuration() {
        return duration;
    }


    /**
     * Sets the duration value for this TimeBillSearchBasic.
     * 
     * @param duration
     */
    public void setDuration(org.mule.module.netsuite.api.internal.SearchDoubleField duration) {
        this.duration = duration;
    }


    /**
     * Gets the employee value for this TimeBillSearchBasic.
     * 
     * @return employee
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeBillSearchBasic.
     * 
     * @param employee
     */
    public void setEmployee(org.mule.module.netsuite.api.internal.SearchMultiSelectField employee) {
        this.employee = employee;
    }


    /**
     * Gets the exempt value for this TimeBillSearchBasic.
     * 
     * @return exempt
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getExempt() {
        return exempt;
    }


    /**
     * Sets the exempt value for this TimeBillSearchBasic.
     * 
     * @param exempt
     */
    public void setExempt(org.mule.module.netsuite.api.internal.SearchBooleanField exempt) {
        this.exempt = exempt;
    }


    /**
     * Gets the externalId value for this TimeBillSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeBillSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this TimeBillSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this TimeBillSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the internalId value for this TimeBillSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeBillSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this TimeBillSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this TimeBillSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the item value for this TimeBillSearchBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeBillSearchBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastModified value for this TimeBillSearchBasic.
     * 
     * @return lastModified
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this TimeBillSearchBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(org.mule.module.netsuite.api.internal.SearchDateField lastModified) {
        this.lastModified = lastModified;
    }


    /**
     * Gets the location value for this TimeBillSearchBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeBillSearchBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the memo value for this TimeBillSearchBasic.
     * 
     * @return memo
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeBillSearchBasic.
     * 
     * @param memo
     */
    public void setMemo(org.mule.module.netsuite.api.internal.SearchStringField memo) {
        this.memo = memo;
    }


    /**
     * Gets the paidByPayroll value for this TimeBillSearchBasic.
     * 
     * @return paidByPayroll
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPaidByPayroll() {
        return paidByPayroll;
    }


    /**
     * Sets the paidByPayroll value for this TimeBillSearchBasic.
     * 
     * @param paidByPayroll
     */
    public void setPaidByPayroll(org.mule.module.netsuite.api.internal.SearchBooleanField paidByPayroll) {
        this.paidByPayroll = paidByPayroll;
    }


    /**
     * Gets the paidExternally value for this TimeBillSearchBasic.
     * 
     * @return paidExternally
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeBillSearchBasic.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(org.mule.module.netsuite.api.internal.SearchBooleanField paidExternally) {
        this.paidExternally = paidExternally;
    }


    /**
     * Gets the payItem value for this TimeBillSearchBasic.
     * 
     * @return payItem
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this TimeBillSearchBasic.
     * 
     * @param payItem
     */
    public void setPayItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField payItem) {
        this.payItem = payItem;
    }


    /**
     * Gets the productive value for this TimeBillSearchBasic.
     * 
     * @return productive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getProductive() {
        return productive;
    }


    /**
     * Sets the productive value for this TimeBillSearchBasic.
     * 
     * @param productive
     */
    public void setProductive(org.mule.module.netsuite.api.internal.SearchBooleanField productive) {
        this.productive = productive;
    }


    /**
     * Gets the status value for this TimeBillSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TimeBillSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchBooleanField status) {
        this.status = status;
    }


    /**
     * Gets the subsidiary value for this TimeBillSearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeBillSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the temporaryLocalJurisdiction value for this TimeBillSearchBasic.
     * 
     * @return temporaryLocalJurisdiction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTemporaryLocalJurisdiction() {
        return temporaryLocalJurisdiction;
    }


    /**
     * Sets the temporaryLocalJurisdiction value for this TimeBillSearchBasic.
     * 
     * @param temporaryLocalJurisdiction
     */
    public void setTemporaryLocalJurisdiction(org.mule.module.netsuite.api.internal.SearchMultiSelectField temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }


    /**
     * Gets the temporaryStateJurisdiction value for this TimeBillSearchBasic.
     * 
     * @return temporaryStateJurisdiction
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTemporaryStateJurisdiction() {
        return temporaryStateJurisdiction;
    }


    /**
     * Sets the temporaryStateJurisdiction value for this TimeBillSearchBasic.
     * 
     * @param temporaryStateJurisdiction
     */
    public void setTemporaryStateJurisdiction(org.mule.module.netsuite.api.internal.SearchMultiSelectField temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }


    /**
     * Gets the type value for this TimeBillSearchBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeBillSearchBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the utilized value for this TimeBillSearchBasic.
     * 
     * @return utilized
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getUtilized() {
        return utilized;
    }


    /**
     * Sets the utilized value for this TimeBillSearchBasic.
     * 
     * @param utilized
     */
    public void setUtilized(org.mule.module.netsuite.api.internal.SearchBooleanField utilized) {
        this.utilized = utilized;
    }


    /**
     * Gets the customFieldList value for this TimeBillSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeBillSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeBillSearchBasic)) return false;
        TimeBillSearchBasic other = (TimeBillSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.approved==null && other.getApproved()==null) || 
             (this.approved!=null &&
              this.approved.equals(other.getApproved()))) &&
            ((this.billable==null && other.getBillable()==null) || 
             (this.billable!=null &&
              this.billable.equals(other.getBillable()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              this.dateCreated.equals(other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.duration==null && other.getDuration()==null) || 
             (this.duration!=null &&
              this.duration.equals(other.getDuration()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              this.employee.equals(other.getEmployee()))) &&
            ((this.exempt==null && other.getExempt()==null) || 
             (this.exempt!=null &&
              this.exempt.equals(other.getExempt()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              this.lastModified.equals(other.getLastModified()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.paidByPayroll==null && other.getPaidByPayroll()==null) || 
             (this.paidByPayroll!=null &&
              this.paidByPayroll.equals(other.getPaidByPayroll()))) &&
            ((this.paidExternally==null && other.getPaidExternally()==null) || 
             (this.paidExternally!=null &&
              this.paidExternally.equals(other.getPaidExternally()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              this.payItem.equals(other.getPayItem()))) &&
            ((this.productive==null && other.getProductive()==null) || 
             (this.productive!=null &&
              this.productive.equals(other.getProductive()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.temporaryLocalJurisdiction==null && other.getTemporaryLocalJurisdiction()==null) || 
             (this.temporaryLocalJurisdiction!=null &&
              this.temporaryLocalJurisdiction.equals(other.getTemporaryLocalJurisdiction()))) &&
            ((this.temporaryStateJurisdiction==null && other.getTemporaryStateJurisdiction()==null) || 
             (this.temporaryStateJurisdiction!=null &&
              this.temporaryStateJurisdiction.equals(other.getTemporaryStateJurisdiction()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.utilized==null && other.getUtilized()==null) || 
             (this.utilized!=null &&
              this.utilized.equals(other.getUtilized()))) &&
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
        if (getApproved() != null) {
            _hashCode += getApproved().hashCode();
        }
        if (getBillable() != null) {
            _hashCode += getBillable().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getDateCreated() != null) {
            _hashCode += getDateCreated().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDuration() != null) {
            _hashCode += getDuration().hashCode();
        }
        if (getEmployee() != null) {
            _hashCode += getEmployee().hashCode();
        }
        if (getExempt() != null) {
            _hashCode += getExempt().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastModified() != null) {
            _hashCode += getLastModified().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPaidByPayroll() != null) {
            _hashCode += getPaidByPayroll().hashCode();
        }
        if (getPaidExternally() != null) {
            _hashCode += getPaidExternally().hashCode();
        }
        if (getPayItem() != null) {
            _hashCode += getPayItem().hashCode();
        }
        if (getProductive() != null) {
            _hashCode += getProductive().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getTemporaryLocalJurisdiction() != null) {
            _hashCode += getTemporaryLocalJurisdiction().hashCode();
        }
        if (getTemporaryStateJurisdiction() != null) {
            _hashCode += getTemporaryStateJurisdiction().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUtilized() != null) {
            _hashCode += getUtilized().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeBillSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "approved"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "duration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("exempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidByPayroll");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paidByPayroll"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "productive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("utilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "utilized"));
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
