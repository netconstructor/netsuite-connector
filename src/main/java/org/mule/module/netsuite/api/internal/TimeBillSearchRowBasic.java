/**
 * TimeBillSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TimeBillSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] _break;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customer;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] date;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] durationDecimal;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employee;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endTime;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] hours;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBillable;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isExempt;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isProductive;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isUtilized;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] item;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModified;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] paidExternally;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] payItem;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] payrollDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startTime;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] status;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] supervisorApproval;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] temporaryLocalJurisdiction;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] temporaryStateJurisdiction;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public TimeBillSearchRowBasic() {
    }

    public TimeBillSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] _break,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customer,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] date,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateCreated,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] durationDecimal,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employee,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endTime,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] hours,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBillable,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isExempt,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isProductive,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isUtilized,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] item,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModified,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] memo,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] paidExternally,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] payItem,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] payrollDate,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] rate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startTime,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] status,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] subsidiary,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] supervisorApproval,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] temporaryLocalJurisdiction,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] temporaryStateJurisdiction,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this._break = _break;
           this._class = _class;
           this.customer = customer;
           this.date = date;
           this.dateCreated = dateCreated;
           this.department = department;
           this.durationDecimal = durationDecimal;
           this.employee = employee;
           this.endTime = endTime;
           this.externalId = externalId;
           this.hours = hours;
           this.internalId = internalId;
           this.isBillable = isBillable;
           this.isExempt = isExempt;
           this.isProductive = isProductive;
           this.isUtilized = isUtilized;
           this.item = item;
           this.lastModified = lastModified;
           this.location = location;
           this.memo = memo;
           this.paidExternally = paidExternally;
           this.payItem = payItem;
           this.payrollDate = payrollDate;
           this.rate = rate;
           this.startTime = startTime;
           this.status = status;
           this.subsidiary = subsidiary;
           this.supervisorApproval = supervisorApproval;
           this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
           this.temporaryStateJurisdiction = temporaryStateJurisdiction;
           this.type = type;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the _break value for this TimeBillSearchRowBasic.
     * 
     * @return _break
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] get_break() {
        return _break;
    }


    /**
     * Sets the _break value for this TimeBillSearchRowBasic.
     * 
     * @param _break
     */
    public void set_break(org.mule.module.netsuite.api.internal.SearchColumnStringField[] _break) {
        this._break = _break;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField get_break(int i) {
        return this._break[i];
    }

    public void set_break(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this._break[i] = _value;
    }


    /**
     * Gets the _class value for this TimeBillSearchRowBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this TimeBillSearchRowBasic.
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
     * Gets the customer value for this TimeBillSearchRowBasic.
     * 
     * @return customer
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this TimeBillSearchRowBasic.
     * 
     * @param customer
     */
    public void setCustomer(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.customer[i] = _value;
    }


    /**
     * Gets the date value for this TimeBillSearchRowBasic.
     * 
     * @return date
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDate() {
        return date;
    }


    /**
     * Sets the date value for this TimeBillSearchRowBasic.
     * 
     * @param date
     */
    public void setDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] date) {
        this.date = date;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDate(int i) {
        return this.date[i];
    }

    public void setDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.date[i] = _value;
    }


    /**
     * Gets the dateCreated value for this TimeBillSearchRowBasic.
     * 
     * @return dateCreated
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateCreated() {
        return dateCreated;
    }


    /**
     * Sets the dateCreated value for this TimeBillSearchRowBasic.
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
     * Gets the department value for this TimeBillSearchRowBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this TimeBillSearchRowBasic.
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
     * Gets the durationDecimal value for this TimeBillSearchRowBasic.
     * 
     * @return durationDecimal
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDurationDecimal() {
        return durationDecimal;
    }


    /**
     * Sets the durationDecimal value for this TimeBillSearchRowBasic.
     * 
     * @param durationDecimal
     */
    public void setDurationDecimal(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] durationDecimal) {
        this.durationDecimal = durationDecimal;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDurationDecimal(int i) {
        return this.durationDecimal[i];
    }

    public void setDurationDecimal(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.durationDecimal[i] = _value;
    }


    /**
     * Gets the employee value for this TimeBillSearchRowBasic.
     * 
     * @return employee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEmployee() {
        return employee;
    }


    /**
     * Sets the employee value for this TimeBillSearchRowBasic.
     * 
     * @param employee
     */
    public void setEmployee(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] employee) {
        this.employee = employee;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEmployee(int i) {
        return this.employee[i];
    }

    public void setEmployee(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.employee[i] = _value;
    }


    /**
     * Gets the endTime value for this TimeBillSearchRowBasic.
     * 
     * @return endTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this TimeBillSearchRowBasic.
     * 
     * @param endTime
     */
    public void setEndTime(org.mule.module.netsuite.api.internal.SearchColumnDateField[] endTime) {
        this.endTime = endTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.endTime[i] = _value;
    }


    /**
     * Gets the externalId value for this TimeBillSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TimeBillSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] externalId) {
        this.externalId = externalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the hours value for this TimeBillSearchRowBasic.
     * 
     * @return hours
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getHours() {
        return hours;
    }


    /**
     * Sets the hours value for this TimeBillSearchRowBasic.
     * 
     * @param hours
     */
    public void setHours(org.mule.module.netsuite.api.internal.SearchColumnStringField[] hours) {
        this.hours = hours;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getHours(int i) {
        return this.hours[i];
    }

    public void setHours(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.hours[i] = _value;
    }


    /**
     * Gets the internalId value for this TimeBillSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TimeBillSearchRowBasic.
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
     * Gets the isBillable value for this TimeBillSearchRowBasic.
     * 
     * @return isBillable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsBillable() {
        return isBillable;
    }


    /**
     * Sets the isBillable value for this TimeBillSearchRowBasic.
     * 
     * @param isBillable
     */
    public void setIsBillable(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isBillable) {
        this.isBillable = isBillable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsBillable(int i) {
        return this.isBillable[i];
    }

    public void setIsBillable(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isBillable[i] = _value;
    }


    /**
     * Gets the isExempt value for this TimeBillSearchRowBasic.
     * 
     * @return isExempt
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsExempt() {
        return isExempt;
    }


    /**
     * Sets the isExempt value for this TimeBillSearchRowBasic.
     * 
     * @param isExempt
     */
    public void setIsExempt(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isExempt) {
        this.isExempt = isExempt;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsExempt(int i) {
        return this.isExempt[i];
    }

    public void setIsExempt(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isExempt[i] = _value;
    }


    /**
     * Gets the isProductive value for this TimeBillSearchRowBasic.
     * 
     * @return isProductive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsProductive() {
        return isProductive;
    }


    /**
     * Sets the isProductive value for this TimeBillSearchRowBasic.
     * 
     * @param isProductive
     */
    public void setIsProductive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isProductive) {
        this.isProductive = isProductive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsProductive(int i) {
        return this.isProductive[i];
    }

    public void setIsProductive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isProductive[i] = _value;
    }


    /**
     * Gets the isUtilized value for this TimeBillSearchRowBasic.
     * 
     * @return isUtilized
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsUtilized() {
        return isUtilized;
    }


    /**
     * Sets the isUtilized value for this TimeBillSearchRowBasic.
     * 
     * @param isUtilized
     */
    public void setIsUtilized(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isUtilized) {
        this.isUtilized = isUtilized;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsUtilized(int i) {
        return this.isUtilized[i];
    }

    public void setIsUtilized(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isUtilized[i] = _value;
    }


    /**
     * Gets the item value for this TimeBillSearchRowBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this TimeBillSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchColumnStringField[] item) {
        this.item = item;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the lastModified value for this TimeBillSearchRowBasic.
     * 
     * @return lastModified
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModified() {
        return lastModified;
    }


    /**
     * Sets the lastModified value for this TimeBillSearchRowBasic.
     * 
     * @param lastModified
     */
    public void setLastModified(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModified) {
        this.lastModified = lastModified;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastModified(int i) {
        return this.lastModified[i];
    }

    public void setLastModified(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastModified[i] = _value;
    }


    /**
     * Gets the location value for this TimeBillSearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this TimeBillSearchRowBasic.
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
     * Gets the memo value for this TimeBillSearchRowBasic.
     * 
     * @return memo
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this TimeBillSearchRowBasic.
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
     * Gets the paidExternally value for this TimeBillSearchRowBasic.
     * 
     * @return paidExternally
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getPaidExternally() {
        return paidExternally;
    }


    /**
     * Sets the paidExternally value for this TimeBillSearchRowBasic.
     * 
     * @param paidExternally
     */
    public void setPaidExternally(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] paidExternally) {
        this.paidExternally = paidExternally;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getPaidExternally(int i) {
        return this.paidExternally[i];
    }

    public void setPaidExternally(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.paidExternally[i] = _value;
    }


    /**
     * Gets the payItem value for this TimeBillSearchRowBasic.
     * 
     * @return payItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPayItem() {
        return payItem;
    }


    /**
     * Sets the payItem value for this TimeBillSearchRowBasic.
     * 
     * @param payItem
     */
    public void setPayItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] payItem) {
        this.payItem = payItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPayItem(int i) {
        return this.payItem[i];
    }

    public void setPayItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.payItem[i] = _value;
    }


    /**
     * Gets the payrollDate value for this TimeBillSearchRowBasic.
     * 
     * @return payrollDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getPayrollDate() {
        return payrollDate;
    }


    /**
     * Sets the payrollDate value for this TimeBillSearchRowBasic.
     * 
     * @param payrollDate
     */
    public void setPayrollDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] payrollDate) {
        this.payrollDate = payrollDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getPayrollDate(int i) {
        return this.payrollDate[i];
    }

    public void setPayrollDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.payrollDate[i] = _value;
    }


    /**
     * Gets the rate value for this TimeBillSearchRowBasic.
     * 
     * @return rate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this TimeBillSearchRowBasic.
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
     * Gets the startTime value for this TimeBillSearchRowBasic.
     * 
     * @return startTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TimeBillSearchRowBasic.
     * 
     * @param startTime
     */
    public void setStartTime(org.mule.module.netsuite.api.internal.SearchColumnDateField[] startTime) {
        this.startTime = startTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.startTime[i] = _value;
    }


    /**
     * Gets the status value for this TimeBillSearchRowBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TimeBillSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchColumnStringField[] status) {
        this.status = status;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the subsidiary value for this TimeBillSearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this TimeBillSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchColumnStringField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the supervisorApproval value for this TimeBillSearchRowBasic.
     * 
     * @return supervisorApproval
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getSupervisorApproval() {
        return supervisorApproval;
    }


    /**
     * Sets the supervisorApproval value for this TimeBillSearchRowBasic.
     * 
     * @param supervisorApproval
     */
    public void setSupervisorApproval(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] supervisorApproval) {
        this.supervisorApproval = supervisorApproval;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getSupervisorApproval(int i) {
        return this.supervisorApproval[i];
    }

    public void setSupervisorApproval(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.supervisorApproval[i] = _value;
    }


    /**
     * Gets the temporaryLocalJurisdiction value for this TimeBillSearchRowBasic.
     * 
     * @return temporaryLocalJurisdiction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTemporaryLocalJurisdiction() {
        return temporaryLocalJurisdiction;
    }


    /**
     * Sets the temporaryLocalJurisdiction value for this TimeBillSearchRowBasic.
     * 
     * @param temporaryLocalJurisdiction
     */
    public void setTemporaryLocalJurisdiction(org.mule.module.netsuite.api.internal.SearchColumnStringField[] temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTemporaryLocalJurisdiction(int i) {
        return this.temporaryLocalJurisdiction[i];
    }

    public void setTemporaryLocalJurisdiction(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.temporaryLocalJurisdiction[i] = _value;
    }


    /**
     * Gets the temporaryStateJurisdiction value for this TimeBillSearchRowBasic.
     * 
     * @return temporaryStateJurisdiction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTemporaryStateJurisdiction() {
        return temporaryStateJurisdiction;
    }


    /**
     * Sets the temporaryStateJurisdiction value for this TimeBillSearchRowBasic.
     * 
     * @param temporaryStateJurisdiction
     */
    public void setTemporaryStateJurisdiction(org.mule.module.netsuite.api.internal.SearchColumnStringField[] temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getTemporaryStateJurisdiction(int i) {
        return this.temporaryStateJurisdiction[i];
    }

    public void setTemporaryStateJurisdiction(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.temporaryStateJurisdiction[i] = _value;
    }


    /**
     * Gets the type value for this TimeBillSearchRowBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this TimeBillSearchRowBasic.
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
     * Gets the customFieldList value for this TimeBillSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TimeBillSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TimeBillSearchRowBasic)) return false;
        TimeBillSearchRowBasic other = (TimeBillSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._break==null && other.get_break()==null) || 
             (this._break!=null &&
              java.util.Arrays.equals(this._break, other.get_break()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              java.util.Arrays.equals(this.customer, other.getCustomer()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              java.util.Arrays.equals(this.date, other.getDate()))) &&
            ((this.dateCreated==null && other.getDateCreated()==null) || 
             (this.dateCreated!=null &&
              java.util.Arrays.equals(this.dateCreated, other.getDateCreated()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.durationDecimal==null && other.getDurationDecimal()==null) || 
             (this.durationDecimal!=null &&
              java.util.Arrays.equals(this.durationDecimal, other.getDurationDecimal()))) &&
            ((this.employee==null && other.getEmployee()==null) || 
             (this.employee!=null &&
              java.util.Arrays.equals(this.employee, other.getEmployee()))) &&
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              java.util.Arrays.equals(this.endTime, other.getEndTime()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.hours==null && other.getHours()==null) || 
             (this.hours!=null &&
              java.util.Arrays.equals(this.hours, other.getHours()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isBillable==null && other.getIsBillable()==null) || 
             (this.isBillable!=null &&
              java.util.Arrays.equals(this.isBillable, other.getIsBillable()))) &&
            ((this.isExempt==null && other.getIsExempt()==null) || 
             (this.isExempt!=null &&
              java.util.Arrays.equals(this.isExempt, other.getIsExempt()))) &&
            ((this.isProductive==null && other.getIsProductive()==null) || 
             (this.isProductive!=null &&
              java.util.Arrays.equals(this.isProductive, other.getIsProductive()))) &&
            ((this.isUtilized==null && other.getIsUtilized()==null) || 
             (this.isUtilized!=null &&
              java.util.Arrays.equals(this.isUtilized, other.getIsUtilized()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastModified==null && other.getLastModified()==null) || 
             (this.lastModified!=null &&
              java.util.Arrays.equals(this.lastModified, other.getLastModified()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              java.util.Arrays.equals(this.memo, other.getMemo()))) &&
            ((this.paidExternally==null && other.getPaidExternally()==null) || 
             (this.paidExternally!=null &&
              java.util.Arrays.equals(this.paidExternally, other.getPaidExternally()))) &&
            ((this.payItem==null && other.getPayItem()==null) || 
             (this.payItem!=null &&
              java.util.Arrays.equals(this.payItem, other.getPayItem()))) &&
            ((this.payrollDate==null && other.getPayrollDate()==null) || 
             (this.payrollDate!=null &&
              java.util.Arrays.equals(this.payrollDate, other.getPayrollDate()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              java.util.Arrays.equals(this.rate, other.getRate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              java.util.Arrays.equals(this.startTime, other.getStartTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.supervisorApproval==null && other.getSupervisorApproval()==null) || 
             (this.supervisorApproval!=null &&
              java.util.Arrays.equals(this.supervisorApproval, other.getSupervisorApproval()))) &&
            ((this.temporaryLocalJurisdiction==null && other.getTemporaryLocalJurisdiction()==null) || 
             (this.temporaryLocalJurisdiction!=null &&
              java.util.Arrays.equals(this.temporaryLocalJurisdiction, other.getTemporaryLocalJurisdiction()))) &&
            ((this.temporaryStateJurisdiction==null && other.getTemporaryStateJurisdiction()==null) || 
             (this.temporaryStateJurisdiction!=null &&
              java.util.Arrays.equals(this.temporaryStateJurisdiction, other.getTemporaryStateJurisdiction()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
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
        if (get_break() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_break());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_break(), i);
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
        if (getCustomer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDate(), i);
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
        if (getDurationDecimal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDurationDecimal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDurationDecimal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmployee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmployee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmployee(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndTime(), i);
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
        if (getHours() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHours());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHours(), i);
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
        if (getIsBillable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsBillable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsBillable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsExempt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsExempt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsExempt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsProductive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsProductive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsProductive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsUtilized() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsUtilized());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsUtilized(), i);
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
        if (getLastModified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastModified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastModified(), i);
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
        if (getPaidExternally() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPaidExternally());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPaidExternally(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPayrollDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPayrollDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPayrollDate(), i);
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
        if (getStartTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartTime(), i);
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
        if (getSupervisorApproval() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupervisorApproval());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupervisorApproval(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporaryLocalJurisdiction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemporaryLocalJurisdiction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemporaryLocalJurisdiction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTemporaryStateJurisdiction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTemporaryStateJurisdiction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTemporaryStateJurisdiction(), i);
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
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TimeBillSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_break");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "break"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("durationDecimal");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "durationDecimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "hours"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isExempt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isExempt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isProductive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isProductive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUtilized");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isUtilized"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payrollDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "payrollDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorApproval");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "supervisorApproval"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
