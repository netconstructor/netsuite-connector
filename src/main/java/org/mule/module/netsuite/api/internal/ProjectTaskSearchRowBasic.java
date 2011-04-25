/**
 * ProjectTaskSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTaskSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualWork;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] constrainttype;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBase;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costVariancePercent;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] endDateVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWork;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkVariancePercent;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] id;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSummaryTask;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] message;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentWorkComplete;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] predecessors;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] priority;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] remainingWork;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] startDateVariance;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public ProjectTaskSearchRowBasic() {
    }

    public ProjectTaskSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualWork,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] constrainttype,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBase,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseVariance,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costVariance,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costVariancePercent,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDateBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] endDateVariance,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWork,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkVariance,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkVariancePercent,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] id,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSummaryTask,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] message,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentWorkComplete,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] predecessors,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] priority,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] remainingWork,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDateBaseline,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] startDateVariance,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.actualWork = actualWork;
           this.company = company;
           this.constrainttype = constrainttype;
           this.contact = contact;
           this.cost = cost;
           this.costBase = costBase;
           this.costBaseBaseline = costBaseBaseline;
           this.costBaseline = costBaseline;
           this.costBaseVariance = costBaseVariance;
           this.costVariance = costVariance;
           this.costVariancePercent = costVariancePercent;
           this.createdDate = createdDate;
           this.endDate = endDate;
           this.endDateBaseline = endDateBaseline;
           this.endDateVariance = endDateVariance;
           this.estimatedWork = estimatedWork;
           this.estimatedWorkBaseline = estimatedWorkBaseline;
           this.estimatedWorkVariance = estimatedWorkVariance;
           this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
           this.id = id;
           this.internalId = internalId;
           this.isSummaryTask = isSummaryTask;
           this.lastModifiedDate = lastModifiedDate;
           this.message = message;
           this.owner = owner;
           this.parent = parent;
           this.percentWorkComplete = percentWorkComplete;
           this.predecessors = predecessors;
           this.priority = priority;
           this.remainingWork = remainingWork;
           this.startDate = startDate;
           this.startDateBaseline = startDateBaseline;
           this.startDateVariance = startDateVariance;
           this.status = status;
           this.title = title;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the actualWork value for this ProjectTaskSearchRowBasic.
     * 
     * @return actualWork
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTaskSearchRowBasic.
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
     * Gets the company value for this ProjectTaskSearchRowBasic.
     * 
     * @return company
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ProjectTaskSearchRowBasic.
     * 
     * @param company
     */
    public void setCompany(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company) {
        this.company = company;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCompany(int i) {
        return this.company[i];
    }

    public void setCompany(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.company[i] = _value;
    }


    /**
     * Gets the constrainttype value for this ProjectTaskSearchRowBasic.
     * 
     * @return constrainttype
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getConstrainttype() {
        return constrainttype;
    }


    /**
     * Sets the constrainttype value for this ProjectTaskSearchRowBasic.
     * 
     * @param constrainttype
     */
    public void setConstrainttype(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] constrainttype) {
        this.constrainttype = constrainttype;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getConstrainttype(int i) {
        return this.constrainttype[i];
    }

    public void setConstrainttype(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.constrainttype[i] = _value;
    }


    /**
     * Gets the contact value for this ProjectTaskSearchRowBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ProjectTaskSearchRowBasic.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact) {
        this.contact = contact;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.contact[i] = _value;
    }


    /**
     * Gets the cost value for this ProjectTaskSearchRowBasic.
     * 
     * @return cost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskSearchRowBasic.
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
     * Gets the costBase value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBase
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostBase() {
        return costBase;
    }


    /**
     * Sets the costBase value for this ProjectTaskSearchRowBasic.
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
     * Gets the costBaseBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBaseBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostBaseBaseline() {
        return costBaseBaseline;
    }


    /**
     * Sets the costBaseBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param costBaseBaseline
     */
    public void setCostBaseBaseline(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseBaseline) {
        this.costBaseBaseline = costBaseBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostBaseBaseline(int i) {
        return this.costBaseBaseline[i];
    }

    public void setCostBaseBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costBaseBaseline[i] = _value;
    }


    /**
     * Gets the costBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostBaseline() {
        return costBaseline;
    }


    /**
     * Sets the costBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param costBaseline
     */
    public void setCostBaseline(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseline) {
        this.costBaseline = costBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostBaseline(int i) {
        return this.costBaseline[i];
    }

    public void setCostBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costBaseline[i] = _value;
    }


    /**
     * Gets the costBaseVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return costBaseVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostBaseVariance() {
        return costBaseVariance;
    }


    /**
     * Sets the costBaseVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param costBaseVariance
     */
    public void setCostBaseVariance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costBaseVariance) {
        this.costBaseVariance = costBaseVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostBaseVariance(int i) {
        return this.costBaseVariance[i];
    }

    public void setCostBaseVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costBaseVariance[i] = _value;
    }


    /**
     * Gets the costVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return costVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostVariance() {
        return costVariance;
    }


    /**
     * Sets the costVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param costVariance
     */
    public void setCostVariance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costVariance) {
        this.costVariance = costVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostVariance(int i) {
        return this.costVariance[i];
    }

    public void setCostVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costVariance[i] = _value;
    }


    /**
     * Gets the costVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @return costVariancePercent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostVariancePercent() {
        return costVariancePercent;
    }


    /**
     * Sets the costVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @param costVariancePercent
     */
    public void setCostVariancePercent(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costVariancePercent) {
        this.costVariancePercent = costVariancePercent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostVariancePercent(int i) {
        return this.costVariancePercent[i];
    }

    public void setCostVariancePercent(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costVariancePercent[i] = _value;
    }


    /**
     * Gets the createdDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProjectTaskSearchRowBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }


    /**
     * Gets the endDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskSearchRowBasic.
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
     * Gets the endDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return endDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDateBaseline() {
        return endDateBaseline;
    }


    /**
     * Sets the endDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param endDateBaseline
     */
    public void setEndDateBaseline(org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getEndDateBaseline(int i) {
        return this.endDateBaseline[i];
    }

    public void setEndDateBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.endDateBaseline[i] = _value;
    }


    /**
     * Gets the endDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return endDateVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEndDateVariance() {
        return endDateVariance;
    }


    /**
     * Sets the endDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param endDateVariance
     */
    public void setEndDateVariance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] endDateVariance) {
        this.endDateVariance = endDateVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEndDateVariance(int i) {
        return this.endDateVariance[i];
    }

    public void setEndDateVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.endDateVariance[i] = _value;
    }


    /**
     * Gets the estimatedWork value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWork
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskSearchRowBasic.
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
     * Gets the estimatedWorkBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWorkBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTaskSearchRowBasic.
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
     * Gets the estimatedWorkVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWorkVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedWorkVariance() {
        return estimatedWorkVariance;
    }


    /**
     * Sets the estimatedWorkVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param estimatedWorkVariance
     */
    public void setEstimatedWorkVariance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkVariance) {
        this.estimatedWorkVariance = estimatedWorkVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedWorkVariance(int i) {
        return this.estimatedWorkVariance[i];
    }

    public void setEstimatedWorkVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedWorkVariance[i] = _value;
    }


    /**
     * Gets the estimatedWorkVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @return estimatedWorkVariancePercent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedWorkVariancePercent() {
        return estimatedWorkVariancePercent;
    }


    /**
     * Sets the estimatedWorkVariancePercent value for this ProjectTaskSearchRowBasic.
     * 
     * @param estimatedWorkVariancePercent
     */
    public void setEstimatedWorkVariancePercent(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedWorkVariancePercent) {
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedWorkVariancePercent(int i) {
        return this.estimatedWorkVariancePercent[i];
    }

    public void setEstimatedWorkVariancePercent(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedWorkVariancePercent[i] = _value;
    }


    /**
     * Gets the id value for this ProjectTaskSearchRowBasic.
     * 
     * @return id
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getId() {
        return id;
    }


    /**
     * Sets the id value for this ProjectTaskSearchRowBasic.
     * 
     * @param id
     */
    public void setId(org.mule.module.netsuite.api.internal.SearchColumnLongField[] id) {
        this.id = id;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.id[i] = _value;
    }


    /**
     * Gets the internalId value for this ProjectTaskSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTaskSearchRowBasic.
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
     * Gets the isSummaryTask value for this ProjectTaskSearchRowBasic.
     * 
     * @return isSummaryTask
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsSummaryTask() {
        return isSummaryTask;
    }


    /**
     * Sets the isSummaryTask value for this ProjectTaskSearchRowBasic.
     * 
     * @param isSummaryTask
     */
    public void setIsSummaryTask(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSummaryTask) {
        this.isSummaryTask = isSummaryTask;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsSummaryTask(int i) {
        return this.isSummaryTask[i];
    }

    public void setIsSummaryTask(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isSummaryTask[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ProjectTaskSearchRowBasic.
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
     * Gets the message value for this ProjectTaskSearchRowBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this ProjectTaskSearchRowBasic.
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
     * Gets the owner value for this ProjectTaskSearchRowBasic.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ProjectTaskSearchRowBasic.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }


    /**
     * Gets the parent value for this ProjectTaskSearchRowBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ProjectTaskSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the percentWorkComplete value for this ProjectTaskSearchRowBasic.
     * 
     * @return percentWorkComplete
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPercentWorkComplete() {
        return percentWorkComplete;
    }


    /**
     * Sets the percentWorkComplete value for this ProjectTaskSearchRowBasic.
     * 
     * @param percentWorkComplete
     */
    public void setPercentWorkComplete(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentWorkComplete) {
        this.percentWorkComplete = percentWorkComplete;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPercentWorkComplete(int i) {
        return this.percentWorkComplete[i];
    }

    public void setPercentWorkComplete(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.percentWorkComplete[i] = _value;
    }


    /**
     * Gets the predecessors value for this ProjectTaskSearchRowBasic.
     * 
     * @return predecessors
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPredecessors() {
        return predecessors;
    }


    /**
     * Sets the predecessors value for this ProjectTaskSearchRowBasic.
     * 
     * @param predecessors
     */
    public void setPredecessors(org.mule.module.netsuite.api.internal.SearchColumnStringField[] predecessors) {
        this.predecessors = predecessors;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPredecessors(int i) {
        return this.predecessors[i];
    }

    public void setPredecessors(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.predecessors[i] = _value;
    }


    /**
     * Gets the priority value for this ProjectTaskSearchRowBasic.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ProjectTaskSearchRowBasic.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] priority) {
        this.priority = priority;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.priority[i] = _value;
    }


    /**
     * Gets the remainingWork value for this ProjectTaskSearchRowBasic.
     * 
     * @return remainingWork
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getRemainingWork() {
        return remainingWork;
    }


    /**
     * Sets the remainingWork value for this ProjectTaskSearchRowBasic.
     * 
     * @param remainingWork
     */
    public void setRemainingWork(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] remainingWork) {
        this.remainingWork = remainingWork;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getRemainingWork(int i) {
        return this.remainingWork[i];
    }

    public void setRemainingWork(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.remainingWork[i] = _value;
    }


    /**
     * Gets the startDate value for this ProjectTaskSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskSearchRowBasic.
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
     * Gets the startDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @return startDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this ProjectTaskSearchRowBasic.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getStartDateBaseline(int i) {
        return this.startDateBaseline[i];
    }

    public void setStartDateBaseline(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.startDateBaseline[i] = _value;
    }


    /**
     * Gets the startDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @return startDateVariance
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getStartDateVariance() {
        return startDateVariance;
    }


    /**
     * Sets the startDateVariance value for this ProjectTaskSearchRowBasic.
     * 
     * @param startDateVariance
     */
    public void setStartDateVariance(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] startDateVariance) {
        this.startDateVariance = startDateVariance;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getStartDateVariance(int i) {
        return this.startDateVariance[i];
    }

    public void setStartDateVariance(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.startDateVariance[i] = _value;
    }


    /**
     * Gets the status value for this ProjectTaskSearchRowBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProjectTaskSearchRowBasic.
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
     * Gets the title value for this ProjectTaskSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProjectTaskSearchRowBasic.
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
     * Gets the customFieldList value for this ProjectTaskSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ProjectTaskSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskSearchRowBasic)) return false;
        ProjectTaskSearchRowBasic other = (ProjectTaskSearchRowBasic) obj;
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
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              java.util.Arrays.equals(this.company, other.getCompany()))) &&
            ((this.constrainttype==null && other.getConstrainttype()==null) || 
             (this.constrainttype!=null &&
              java.util.Arrays.equals(this.constrainttype, other.getConstrainttype()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              java.util.Arrays.equals(this.cost, other.getCost()))) &&
            ((this.costBase==null && other.getCostBase()==null) || 
             (this.costBase!=null &&
              java.util.Arrays.equals(this.costBase, other.getCostBase()))) &&
            ((this.costBaseBaseline==null && other.getCostBaseBaseline()==null) || 
             (this.costBaseBaseline!=null &&
              java.util.Arrays.equals(this.costBaseBaseline, other.getCostBaseBaseline()))) &&
            ((this.costBaseline==null && other.getCostBaseline()==null) || 
             (this.costBaseline!=null &&
              java.util.Arrays.equals(this.costBaseline, other.getCostBaseline()))) &&
            ((this.costBaseVariance==null && other.getCostBaseVariance()==null) || 
             (this.costBaseVariance!=null &&
              java.util.Arrays.equals(this.costBaseVariance, other.getCostBaseVariance()))) &&
            ((this.costVariance==null && other.getCostVariance()==null) || 
             (this.costVariance!=null &&
              java.util.Arrays.equals(this.costVariance, other.getCostVariance()))) &&
            ((this.costVariancePercent==null && other.getCostVariancePercent()==null) || 
             (this.costVariancePercent!=null &&
              java.util.Arrays.equals(this.costVariancePercent, other.getCostVariancePercent()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.endDateBaseline==null && other.getEndDateBaseline()==null) || 
             (this.endDateBaseline!=null &&
              java.util.Arrays.equals(this.endDateBaseline, other.getEndDateBaseline()))) &&
            ((this.endDateVariance==null && other.getEndDateVariance()==null) || 
             (this.endDateVariance!=null &&
              java.util.Arrays.equals(this.endDateVariance, other.getEndDateVariance()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              java.util.Arrays.equals(this.estimatedWork, other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              java.util.Arrays.equals(this.estimatedWorkBaseline, other.getEstimatedWorkBaseline()))) &&
            ((this.estimatedWorkVariance==null && other.getEstimatedWorkVariance()==null) || 
             (this.estimatedWorkVariance!=null &&
              java.util.Arrays.equals(this.estimatedWorkVariance, other.getEstimatedWorkVariance()))) &&
            ((this.estimatedWorkVariancePercent==null && other.getEstimatedWorkVariancePercent()==null) || 
             (this.estimatedWorkVariancePercent!=null &&
              java.util.Arrays.equals(this.estimatedWorkVariancePercent, other.getEstimatedWorkVariancePercent()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              java.util.Arrays.equals(this.id, other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isSummaryTask==null && other.getIsSummaryTask()==null) || 
             (this.isSummaryTask!=null &&
              java.util.Arrays.equals(this.isSummaryTask, other.getIsSummaryTask()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.percentWorkComplete==null && other.getPercentWorkComplete()==null) || 
             (this.percentWorkComplete!=null &&
              java.util.Arrays.equals(this.percentWorkComplete, other.getPercentWorkComplete()))) &&
            ((this.predecessors==null && other.getPredecessors()==null) || 
             (this.predecessors!=null &&
              java.util.Arrays.equals(this.predecessors, other.getPredecessors()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.remainingWork==null && other.getRemainingWork()==null) || 
             (this.remainingWork!=null &&
              java.util.Arrays.equals(this.remainingWork, other.getRemainingWork()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              java.util.Arrays.equals(this.startDateBaseline, other.getStartDateBaseline()))) &&
            ((this.startDateVariance==null && other.getStartDateVariance()==null) || 
             (this.startDateVariance!=null &&
              java.util.Arrays.equals(this.startDateVariance, other.getStartDateVariance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
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
        if (getCompany() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompany());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompany(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConstrainttype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConstrainttype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConstrainttype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContact() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContact());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContact(), i);
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
        if (getCostBaseBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBaseBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBaseBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostBaseVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostBaseVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostBaseVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostVariancePercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostVariancePercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostVariancePercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreatedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreatedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreatedDate(), i);
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
        if (getEndDateBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDateBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDateBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndDateVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndDateVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndDateVariance(), i);
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
        if (getEstimatedWorkVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWorkVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWorkVariance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedWorkVariancePercent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedWorkVariancePercent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedWorkVariancePercent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getId(), i);
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
        if (getIsSummaryTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSummaryTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSummaryTask(), i);
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
        if (getOwner() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwner());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwner(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPercentWorkComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentWorkComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentWorkComplete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPredecessors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPredecessors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPredecessors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemainingWork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemainingWork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemainingWork(), i);
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
        if (getStartDateBaseline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDateBaseline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDateBaseline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDateVariance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartDateVariance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartDateVariance(), i);
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
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constrainttype");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "constrainttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("costBaseBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBaseBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBaseVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costVariancePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("estimatedWorkVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWorkVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWorkVariancePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("isSummaryTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSummaryTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentWorkComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "percentWorkComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "predecessors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
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
