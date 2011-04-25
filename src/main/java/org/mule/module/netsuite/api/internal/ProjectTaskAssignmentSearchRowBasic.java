/**
 * ProjectTaskAssignmentSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTaskAssignmentSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualWork;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBase;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWork;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossProfit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossProfitBase;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] price;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] priceBase;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] resource;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] resourceName;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] serviceItem;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] serviceItemDesc;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCostBase;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitPriceBase;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] workCalendar;

    public ProjectTaskAssignmentSearchRowBasic() {
    }

    public ProjectTaskAssignmentSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualWork,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBase,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWork,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossProfit,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossProfitBase,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] price,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] priceBase,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] resource,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] resourceName,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] serviceItem,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] serviceItemDesc,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCostBase,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitPrice,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitPriceBase,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] workCalendar) {
           this.actualWork = actualWork;
           this.cost = cost;
           this.costBase = costBase;
           this.endDate = endDate;
           this.estimatedWork = estimatedWork;
           this.estimatedWorkBaseline = estimatedWorkBaseline;
           this.grossProfit = grossProfit;
           this.grossProfitBase = grossProfitBase;
           this.internalId = internalId;
           this.price = price;
           this.priceBase = priceBase;
           this.resource = resource;
           this.resourceName = resourceName;
           this.serviceItem = serviceItem;
           this.serviceItemDesc = serviceItemDesc;
           this.startDate = startDate;
           this.unitCost = unitCost;
           this.unitCostBase = unitCostBase;
           this.unitPrice = unitPrice;
           this.unitPriceBase = unitPriceBase;
           this.workCalendar = workCalendar;
    }


    /**
     * Gets the actualWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return actualWork
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param actualWork
     */
    public void setActualWork(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualWork) {
        this.actualWork = actualWork;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getActualWork(int i) {
        return this.actualWork[i];
    }

    public void setActualWork(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.actualWork[i] = _value;
    }


    /**
     * Gets the cost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return cost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param cost
     */
    public void setCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }


    /**
     * Gets the costBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return costBase
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostBase() {
        return costBase;
    }


    /**
     * Sets the costBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param costBase
     */
    public void setCostBase(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBase) {
        this.costBase = costBase;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostBase(int i) {
        return this.costBase[i];
    }

    public void setCostBase(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costBase[i] = _value;
    }


    /**
     * Gets the endDate value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskAssignmentSearchRowBasic.
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
     * Gets the estimatedWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return estimatedWork
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedWork(int i) {
        return this.estimatedWork[i];
    }

    public void setEstimatedWork(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedWork[i] = _value;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return estimatedWorkBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedWorkBaseline(int i) {
        return this.estimatedWorkBaseline[i];
    }

    public void setEstimatedWorkBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedWorkBaseline[i] = _value;
    }


    /**
     * Gets the grossProfit value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return grossProfit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGrossProfit() {
        return grossProfit;
    }


    /**
     * Sets the grossProfit value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param grossProfit
     */
    public void setGrossProfit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossProfit) {
        this.grossProfit = grossProfit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGrossProfit(int i) {
        return this.grossProfit[i];
    }

    public void setGrossProfit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.grossProfit[i] = _value;
    }


    /**
     * Gets the grossProfitBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return grossProfitBase
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getGrossProfitBase() {
        return grossProfitBase;
    }


    /**
     * Sets the grossProfitBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param grossProfitBase
     */
    public void setGrossProfitBase(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] grossProfitBase) {
        this.grossProfitBase = grossProfitBase;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getGrossProfitBase(int i) {
        return this.grossProfitBase[i];
    }

    public void setGrossProfitBase(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.grossProfitBase[i] = _value;
    }


    /**
     * Gets the internalId value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTaskAssignmentSearchRowBasic.
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
     * Gets the price value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return price
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param price
     */
    public void setPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] price) {
        this.price = price;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPrice(int i) {
        return this.price[i];
    }

    public void setPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.price[i] = _value;
    }


    /**
     * Gets the priceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return priceBase
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPriceBase() {
        return priceBase;
    }


    /**
     * Sets the priceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param priceBase
     */
    public void setPriceBase(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] priceBase) {
        this.priceBase = priceBase;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPriceBase(int i) {
        return this.priceBase[i];
    }

    public void setPriceBase(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.priceBase[i] = _value;
    }


    /**
     * Gets the resource value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return resource
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param resource
     */
    public void setResource(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] resource) {
        this.resource = resource;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.resource[i] = _value;
    }


    /**
     * Gets the resourceName value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return resourceName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getResourceName() {
        return resourceName;
    }


    /**
     * Sets the resourceName value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param resourceName
     */
    public void setResourceName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] resourceName) {
        this.resourceName = resourceName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getResourceName(int i) {
        return this.resourceName[i];
    }

    public void setResourceName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.resourceName[i] = _value;
    }


    /**
     * Gets the serviceItem value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return serviceItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getServiceItem() {
        return serviceItem;
    }


    /**
     * Sets the serviceItem value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param serviceItem
     */
    public void setServiceItem(org.mule.module.netsuite.api.internal.SearchColumnStringField[] serviceItem) {
        this.serviceItem = serviceItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getServiceItem(int i) {
        return this.serviceItem[i];
    }

    public void setServiceItem(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.serviceItem[i] = _value;
    }


    /**
     * Gets the serviceItemDesc value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return serviceItemDesc
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getServiceItemDesc() {
        return serviceItemDesc;
    }


    /**
     * Sets the serviceItemDesc value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param serviceItemDesc
     */
    public void setServiceItemDesc(org.mule.module.netsuite.api.internal.SearchColumnStringField[] serviceItemDesc) {
        this.serviceItemDesc = serviceItemDesc;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getServiceItemDesc(int i) {
        return this.serviceItemDesc[i];
    }

    public void setServiceItemDesc(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.serviceItemDesc[i] = _value;
    }


    /**
     * Gets the startDate value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskAssignmentSearchRowBasic.
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
     * Gets the unitCost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitCost
     */
    public void setUnitCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCost) {
        this.unitCost = unitCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getUnitCost(int i) {
        return this.unitCost[i];
    }

    public void setUnitCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.unitCost[i] = _value;
    }


    /**
     * Gets the unitCostBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitCostBase
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getUnitCostBase() {
        return unitCostBase;
    }


    /**
     * Sets the unitCostBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitCostBase
     */
    public void setUnitCostBase(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitCostBase) {
        this.unitCostBase = unitCostBase;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getUnitCostBase(int i) {
        return this.unitCostBase[i];
    }

    public void setUnitCostBase(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.unitCostBase[i] = _value;
    }


    /**
     * Gets the unitPrice value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitPrice) {
        this.unitPrice = unitPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getUnitPrice(int i) {
        return this.unitPrice[i];
    }

    public void setUnitPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.unitPrice[i] = _value;
    }


    /**
     * Gets the unitPriceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return unitPriceBase
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getUnitPriceBase() {
        return unitPriceBase;
    }


    /**
     * Sets the unitPriceBase value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param unitPriceBase
     */
    public void setUnitPriceBase(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] unitPriceBase) {
        this.unitPriceBase = unitPriceBase;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getUnitPriceBase(int i) {
        return this.unitPriceBase[i];
    }

    public void setUnitPriceBase(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.unitPriceBase[i] = _value;
    }


    /**
     * Gets the workCalendar value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @return workCalendar
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getWorkCalendar() {
        return workCalendar;
    }


    /**
     * Sets the workCalendar value for this ProjectTaskAssignmentSearchRowBasic.
     * 
     * @param workCalendar
     */
    public void setWorkCalendar(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] workCalendar) {
        this.workCalendar = workCalendar;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getWorkCalendar(int i) {
        return this.workCalendar[i];
    }

    public void setWorkCalendar(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.workCalendar[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskAssignmentSearchRowBasic)) return false;
        ProjectTaskAssignmentSearchRowBasic other = (ProjectTaskAssignmentSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actualWork==null && other.getActualWork()==null) || 
             (this.actualWork!=null &&
              java.util.Arrays.equals(this.actualWork, other.getActualWork()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              java.util.Arrays.equals(this.cost, other.getCost()))) &&
            ((this.costBase==null && other.getCostBase()==null) || 
             (this.costBase!=null &&
              java.util.Arrays.equals(this.costBase, other.getCostBase()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              java.util.Arrays.equals(this.estimatedWork, other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              java.util.Arrays.equals(this.estimatedWorkBaseline, other.getEstimatedWorkBaseline()))) &&
            ((this.grossProfit==null && other.getGrossProfit()==null) || 
             (this.grossProfit!=null &&
              java.util.Arrays.equals(this.grossProfit, other.getGrossProfit()))) &&
            ((this.grossProfitBase==null && other.getGrossProfitBase()==null) || 
             (this.grossProfitBase!=null &&
              java.util.Arrays.equals(this.grossProfitBase, other.getGrossProfitBase()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              java.util.Arrays.equals(this.price, other.getPrice()))) &&
            ((this.priceBase==null && other.getPriceBase()==null) || 
             (this.priceBase!=null &&
              java.util.Arrays.equals(this.priceBase, other.getPriceBase()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource()))) &&
            ((this.resourceName==null && other.getResourceName()==null) || 
             (this.resourceName!=null &&
              java.util.Arrays.equals(this.resourceName, other.getResourceName()))) &&
            ((this.serviceItem==null && other.getServiceItem()==null) || 
             (this.serviceItem!=null &&
              java.util.Arrays.equals(this.serviceItem, other.getServiceItem()))) &&
            ((this.serviceItemDesc==null && other.getServiceItemDesc()==null) || 
             (this.serviceItemDesc!=null &&
              java.util.Arrays.equals(this.serviceItemDesc, other.getServiceItemDesc()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              java.util.Arrays.equals(this.unitCost, other.getUnitCost()))) &&
            ((this.unitCostBase==null && other.getUnitCostBase()==null) || 
             (this.unitCostBase!=null &&
              java.util.Arrays.equals(this.unitCostBase, other.getUnitCostBase()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              java.util.Arrays.equals(this.unitPrice, other.getUnitPrice()))) &&
            ((this.unitPriceBase==null && other.getUnitPriceBase()==null) || 
             (this.unitPriceBase!=null &&
              java.util.Arrays.equals(this.unitPriceBase, other.getUnitPriceBase()))) &&
            ((this.workCalendar==null && other.getWorkCalendar()==null) || 
             (this.workCalendar!=null &&
              java.util.Arrays.equals(this.workCalendar, other.getWorkCalendar())));
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
        if (getActualWork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualWork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBase(), i);
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
        if (getEstimatedWork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedWorkBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWorkBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWorkBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrossProfit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossProfit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossProfit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGrossProfitBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGrossProfitBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGrossProfitBase(), i);
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
        if (getPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriceBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriceBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriceBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResource() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResource());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResource(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResourceName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResourceName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResourceName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceItemDesc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceItemDesc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceItemDesc(), i);
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
        if (getUnitCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitCostBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitCostBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitCostBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitPriceBase() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitPriceBase());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitPriceBase(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWorkCalendar() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWorkCalendar());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWorkCalendar(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskAssignmentSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossProfit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "grossProfit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grossProfitBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "grossProfitBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "resourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItemDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serviceItemDesc"));
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
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCostBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitCostBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPriceBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitPriceBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
