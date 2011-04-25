/**
 * ProjectTaskSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTaskSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchDoubleField actualWork;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField assignee;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField company;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField constraintType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField contact;

    private org.mule.module.netsuite.api.internal.SearchDoubleField cost;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costBase;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costBaseBaseline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costBaseline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costBaseVariance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costVariance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costVariancePercent;

    private org.mule.module.netsuite.api.internal.SearchDateField createdDate;

    private org.mule.module.netsuite.api.internal.SearchDateField endDate;

    private org.mule.module.netsuite.api.internal.SearchDateField endDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField endDateVariance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWork;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkBaseline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkVariance;

    private org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkVariancePercent;

    private org.mule.module.netsuite.api.internal.SearchLongField id;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isSummaryTask;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField owner;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parent;

    private org.mule.module.netsuite.api.internal.SearchDoubleField percentWorkComplete;

    private org.mule.module.netsuite.api.internal.SearchStringField predecessors;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField priority;

    private org.mule.module.netsuite.api.internal.SearchDoubleField remainingWork;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    private org.mule.module.netsuite.api.internal.SearchDateField startDateBaseline;

    private org.mule.module.netsuite.api.internal.SearchDoubleField startDateVariance;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public ProjectTaskSearchBasic() {
    }

    public ProjectTaskSearchBasic(
           org.mule.module.netsuite.api.internal.SearchDoubleField actualWork,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField assignee,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField company,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField constraintType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField contact,
           org.mule.module.netsuite.api.internal.SearchDoubleField cost,
           org.mule.module.netsuite.api.internal.SearchDoubleField costBase,
           org.mule.module.netsuite.api.internal.SearchDoubleField costBaseBaseline,
           org.mule.module.netsuite.api.internal.SearchDoubleField costBaseline,
           org.mule.module.netsuite.api.internal.SearchDoubleField costBaseVariance,
           org.mule.module.netsuite.api.internal.SearchDoubleField costVariance,
           org.mule.module.netsuite.api.internal.SearchDoubleField costVariancePercent,
           org.mule.module.netsuite.api.internal.SearchDateField createdDate,
           org.mule.module.netsuite.api.internal.SearchDateField endDate,
           org.mule.module.netsuite.api.internal.SearchDateField endDateBaseline,
           org.mule.module.netsuite.api.internal.SearchDoubleField endDateVariance,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWork,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkBaseline,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkVariance,
           org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkVariancePercent,
           org.mule.module.netsuite.api.internal.SearchLongField id,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isSummaryTask,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField owner,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parent,
           org.mule.module.netsuite.api.internal.SearchDoubleField percentWorkComplete,
           org.mule.module.netsuite.api.internal.SearchStringField predecessors,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField priority,
           org.mule.module.netsuite.api.internal.SearchDoubleField remainingWork,
           org.mule.module.netsuite.api.internal.SearchDateField startDate,
           org.mule.module.netsuite.api.internal.SearchDateField startDateBaseline,
           org.mule.module.netsuite.api.internal.SearchDoubleField startDateVariance,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.actualWork = actualWork;
        this.assignee = assignee;
        this.company = company;
        this.constraintType = constraintType;
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
        this.internalIdNumber = internalIdNumber;
        this.isSummaryTask = isSummaryTask;
        this.lastModifiedDate = lastModifiedDate;
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
     * Gets the actualWork value for this ProjectTaskSearchBasic.
     * 
     * @return actualWork
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getActualWork() {
        return actualWork;
    }


    /**
     * Sets the actualWork value for this ProjectTaskSearchBasic.
     * 
     * @param actualWork
     */
    public void setActualWork(org.mule.module.netsuite.api.internal.SearchDoubleField actualWork) {
        this.actualWork = actualWork;
    }


    /**
     * Gets the assignee value for this ProjectTaskSearchBasic.
     * 
     * @return assignee
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAssignee() {
        return assignee;
    }


    /**
     * Sets the assignee value for this ProjectTaskSearchBasic.
     * 
     * @param assignee
     */
    public void setAssignee(org.mule.module.netsuite.api.internal.SearchMultiSelectField assignee) {
        this.assignee = assignee;
    }


    /**
     * Gets the company value for this ProjectTaskSearchBasic.
     * 
     * @return company
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCompany() {
        return company;
    }


    /**
     * Sets the company value for this ProjectTaskSearchBasic.
     * 
     * @param company
     */
    public void setCompany(org.mule.module.netsuite.api.internal.SearchMultiSelectField company) {
        this.company = company;
    }


    /**
     * Gets the constraintType value for this ProjectTaskSearchBasic.
     * 
     * @return constraintType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getConstraintType() {
        return constraintType;
    }


    /**
     * Sets the constraintType value for this ProjectTaskSearchBasic.
     * 
     * @param constraintType
     */
    public void setConstraintType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField constraintType) {
        this.constraintType = constraintType;
    }


    /**
     * Gets the contact value for this ProjectTaskSearchBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this ProjectTaskSearchBasic.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.SearchMultiSelectField contact) {
        this.contact = contact;
    }


    /**
     * Gets the cost value for this ProjectTaskSearchBasic.
     * 
     * @return cost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskSearchBasic.
     * 
     * @param cost
     */
    public void setCost(org.mule.module.netsuite.api.internal.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the costBase value for this ProjectTaskSearchBasic.
     * 
     * @return costBase
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostBase() {
        return costBase;
    }


    /**
     * Sets the costBase value for this ProjectTaskSearchBasic.
     * 
     * @param costBase
     */
    public void setCostBase(org.mule.module.netsuite.api.internal.SearchDoubleField costBase) {
        this.costBase = costBase;
    }


    /**
     * Gets the costBaseBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return costBaseBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostBaseBaseline() {
        return costBaseBaseline;
    }


    /**
     * Sets the costBaseBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param costBaseBaseline
     */
    public void setCostBaseBaseline(org.mule.module.netsuite.api.internal.SearchDoubleField costBaseBaseline) {
        this.costBaseBaseline = costBaseBaseline;
    }


    /**
     * Gets the costBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return costBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostBaseline() {
        return costBaseline;
    }


    /**
     * Sets the costBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param costBaseline
     */
    public void setCostBaseline(org.mule.module.netsuite.api.internal.SearchDoubleField costBaseline) {
        this.costBaseline = costBaseline;
    }


    /**
     * Gets the costBaseVariance value for this ProjectTaskSearchBasic.
     * 
     * @return costBaseVariance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostBaseVariance() {
        return costBaseVariance;
    }


    /**
     * Sets the costBaseVariance value for this ProjectTaskSearchBasic.
     * 
     * @param costBaseVariance
     */
    public void setCostBaseVariance(org.mule.module.netsuite.api.internal.SearchDoubleField costBaseVariance) {
        this.costBaseVariance = costBaseVariance;
    }


    /**
     * Gets the costVariance value for this ProjectTaskSearchBasic.
     * 
     * @return costVariance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostVariance() {
        return costVariance;
    }


    /**
     * Sets the costVariance value for this ProjectTaskSearchBasic.
     * 
     * @param costVariance
     */
    public void setCostVariance(org.mule.module.netsuite.api.internal.SearchDoubleField costVariance) {
        this.costVariance = costVariance;
    }


    /**
     * Gets the costVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @return costVariancePercent
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostVariancePercent() {
        return costVariancePercent;
    }


    /**
     * Sets the costVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @param costVariancePercent
     */
    public void setCostVariancePercent(org.mule.module.netsuite.api.internal.SearchDoubleField costVariancePercent) {
        this.costVariancePercent = costVariancePercent;
    }


    /**
     * Gets the createdDate value for this ProjectTaskSearchBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ProjectTaskSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endDate value for this ProjectTaskSearchBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this ProjectTaskSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the endDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return endDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEndDateBaseline() {
        return endDateBaseline;
    }


    /**
     * Sets the endDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param endDateBaseline
     */
    public void setEndDateBaseline(org.mule.module.netsuite.api.internal.SearchDateField endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }


    /**
     * Gets the endDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @return endDateVariance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEndDateVariance() {
        return endDateVariance;
    }


    /**
     * Sets the endDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @param endDateVariance
     */
    public void setEndDateVariance(org.mule.module.netsuite.api.internal.SearchDoubleField endDateVariance) {
        this.endDateVariance = endDateVariance;
    }


    /**
     * Gets the estimatedWork value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWork
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the estimatedWorkBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWorkBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedWorkBaseline() {
        return estimatedWorkBaseline;
    }


    /**
     * Sets the estimatedWorkBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWorkBaseline
     */
    public void setEstimatedWorkBaseline(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }


    /**
     * Gets the estimatedWorkVariance value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWorkVariance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedWorkVariance() {
        return estimatedWorkVariance;
    }


    /**
     * Sets the estimatedWorkVariance value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWorkVariance
     */
    public void setEstimatedWorkVariance(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkVariance) {
        this.estimatedWorkVariance = estimatedWorkVariance;
    }


    /**
     * Gets the estimatedWorkVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @return estimatedWorkVariancePercent
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getEstimatedWorkVariancePercent() {
        return estimatedWorkVariancePercent;
    }


    /**
     * Sets the estimatedWorkVariancePercent value for this ProjectTaskSearchBasic.
     * 
     * @param estimatedWorkVariancePercent
     */
    public void setEstimatedWorkVariancePercent(org.mule.module.netsuite.api.internal.SearchDoubleField estimatedWorkVariancePercent) {
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
    }


    /**
     * Gets the id value for this ProjectTaskSearchBasic.
     * 
     * @return id
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getId() {
        return id;
    }


    /**
     * Sets the id value for this ProjectTaskSearchBasic.
     * 
     * @param id
     */
    public void setId(org.mule.module.netsuite.api.internal.SearchLongField id) {
        this.id = id;
    }


    /**
     * Gets the internalId value for this ProjectTaskSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ProjectTaskSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ProjectTaskSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ProjectTaskSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isSummaryTask value for this ProjectTaskSearchBasic.
     * 
     * @return isSummaryTask
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsSummaryTask() {
        return isSummaryTask;
    }


    /**
     * Sets the isSummaryTask value for this ProjectTaskSearchBasic.
     * 
     * @param isSummaryTask
     */
    public void setIsSummaryTask(org.mule.module.netsuite.api.internal.SearchBooleanField isSummaryTask) {
        this.isSummaryTask = isSummaryTask;
    }


    /**
     * Gets the lastModifiedDate value for this ProjectTaskSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ProjectTaskSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the owner value for this ProjectTaskSearchBasic.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this ProjectTaskSearchBasic.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.SearchMultiSelectField owner) {
        this.owner = owner;
    }


    /**
     * Gets the parent value for this ProjectTaskSearchBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ProjectTaskSearchBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the percentWorkComplete value for this ProjectTaskSearchBasic.
     * 
     * @return percentWorkComplete
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getPercentWorkComplete() {
        return percentWorkComplete;
    }


    /**
     * Sets the percentWorkComplete value for this ProjectTaskSearchBasic.
     * 
     * @param percentWorkComplete
     */
    public void setPercentWorkComplete(org.mule.module.netsuite.api.internal.SearchDoubleField percentWorkComplete) {
        this.percentWorkComplete = percentWorkComplete;
    }


    /**
     * Gets the predecessors value for this ProjectTaskSearchBasic.
     * 
     * @return predecessors
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPredecessors() {
        return predecessors;
    }


    /**
     * Sets the predecessors value for this ProjectTaskSearchBasic.
     * 
     * @param predecessors
     */
    public void setPredecessors(org.mule.module.netsuite.api.internal.SearchStringField predecessors) {
        this.predecessors = predecessors;
    }


    /**
     * Gets the priority value for this ProjectTaskSearchBasic.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this ProjectTaskSearchBasic.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField priority) {
        this.priority = priority;
    }


    /**
     * Gets the remainingWork value for this ProjectTaskSearchBasic.
     * 
     * @return remainingWork
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getRemainingWork() {
        return remainingWork;
    }


    /**
     * Sets the remainingWork value for this ProjectTaskSearchBasic.
     * 
     * @param remainingWork
     */
    public void setRemainingWork(org.mule.module.netsuite.api.internal.SearchDoubleField remainingWork) {
        this.remainingWork = remainingWork;
    }


    /**
     * Gets the startDate value for this ProjectTaskSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this ProjectTaskSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the startDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @return startDateBaseline
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDateBaseline() {
        return startDateBaseline;
    }


    /**
     * Sets the startDateBaseline value for this ProjectTaskSearchBasic.
     * 
     * @param startDateBaseline
     */
    public void setStartDateBaseline(org.mule.module.netsuite.api.internal.SearchDateField startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }


    /**
     * Gets the startDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @return startDateVariance
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getStartDateVariance() {
        return startDateVariance;
    }


    /**
     * Sets the startDateVariance value for this ProjectTaskSearchBasic.
     * 
     * @param startDateVariance
     */
    public void setStartDateVariance(org.mule.module.netsuite.api.internal.SearchDoubleField startDateVariance) {
        this.startDateVariance = startDateVariance;
    }


    /**
     * Gets the status value for this ProjectTaskSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ProjectTaskSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the title value for this ProjectTaskSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this ProjectTaskSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the customFieldList value for this ProjectTaskSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ProjectTaskSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskSearchBasic)) return false;
        ProjectTaskSearchBasic other = (ProjectTaskSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.actualWork==null && other.getActualWork()==null) || 
             (this.actualWork!=null &&
              this.actualWork.equals(other.getActualWork()))) &&
            ((this.assignee==null && other.getAssignee()==null) || 
             (this.assignee!=null &&
              this.assignee.equals(other.getAssignee()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.constraintType==null && other.getConstraintType()==null) || 
             (this.constraintType!=null &&
              this.constraintType.equals(other.getConstraintType()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costBase==null && other.getCostBase()==null) || 
             (this.costBase!=null &&
              this.costBase.equals(other.getCostBase()))) &&
            ((this.costBaseBaseline==null && other.getCostBaseBaseline()==null) || 
             (this.costBaseBaseline!=null &&
              this.costBaseBaseline.equals(other.getCostBaseBaseline()))) &&
            ((this.costBaseline==null && other.getCostBaseline()==null) || 
             (this.costBaseline!=null &&
              this.costBaseline.equals(other.getCostBaseline()))) &&
            ((this.costBaseVariance==null && other.getCostBaseVariance()==null) || 
             (this.costBaseVariance!=null &&
              this.costBaseVariance.equals(other.getCostBaseVariance()))) &&
            ((this.costVariance==null && other.getCostVariance()==null) || 
             (this.costVariance!=null &&
              this.costVariance.equals(other.getCostVariance()))) &&
            ((this.costVariancePercent==null && other.getCostVariancePercent()==null) || 
             (this.costVariancePercent!=null &&
              this.costVariancePercent.equals(other.getCostVariancePercent()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.endDateBaseline==null && other.getEndDateBaseline()==null) || 
             (this.endDateBaseline!=null &&
              this.endDateBaseline.equals(other.getEndDateBaseline()))) &&
            ((this.endDateVariance==null && other.getEndDateVariance()==null) || 
             (this.endDateVariance!=null &&
              this.endDateVariance.equals(other.getEndDateVariance()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.estimatedWorkBaseline==null && other.getEstimatedWorkBaseline()==null) || 
             (this.estimatedWorkBaseline!=null &&
              this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline()))) &&
            ((this.estimatedWorkVariance==null && other.getEstimatedWorkVariance()==null) || 
             (this.estimatedWorkVariance!=null &&
              this.estimatedWorkVariance.equals(other.getEstimatedWorkVariance()))) &&
            ((this.estimatedWorkVariancePercent==null && other.getEstimatedWorkVariancePercent()==null) || 
             (this.estimatedWorkVariancePercent!=null &&
              this.estimatedWorkVariancePercent.equals(other.getEstimatedWorkVariancePercent()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isSummaryTask==null && other.getIsSummaryTask()==null) || 
             (this.isSummaryTask!=null &&
              this.isSummaryTask.equals(other.getIsSummaryTask()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.percentWorkComplete==null && other.getPercentWorkComplete()==null) || 
             (this.percentWorkComplete!=null &&
              this.percentWorkComplete.equals(other.getPercentWorkComplete()))) &&
            ((this.predecessors==null && other.getPredecessors()==null) || 
             (this.predecessors!=null &&
              this.predecessors.equals(other.getPredecessors()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.remainingWork==null && other.getRemainingWork()==null) || 
             (this.remainingWork!=null &&
              this.remainingWork.equals(other.getRemainingWork()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.startDateBaseline==null && other.getStartDateBaseline()==null) || 
             (this.startDateBaseline!=null &&
              this.startDateBaseline.equals(other.getStartDateBaseline()))) &&
            ((this.startDateVariance==null && other.getStartDateVariance()==null) || 
             (this.startDateVariance!=null &&
              this.startDateVariance.equals(other.getStartDateVariance()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
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
        if (getActualWork() != null) {
            _hashCode += getActualWork().hashCode();
        }
        if (getAssignee() != null) {
            _hashCode += getAssignee().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getConstraintType() != null) {
            _hashCode += getConstraintType().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostBase() != null) {
            _hashCode += getCostBase().hashCode();
        }
        if (getCostBaseBaseline() != null) {
            _hashCode += getCostBaseBaseline().hashCode();
        }
        if (getCostBaseline() != null) {
            _hashCode += getCostBaseline().hashCode();
        }
        if (getCostBaseVariance() != null) {
            _hashCode += getCostBaseVariance().hashCode();
        }
        if (getCostVariance() != null) {
            _hashCode += getCostVariance().hashCode();
        }
        if (getCostVariancePercent() != null) {
            _hashCode += getCostVariancePercent().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEndDateBaseline() != null) {
            _hashCode += getEndDateBaseline().hashCode();
        }
        if (getEndDateVariance() != null) {
            _hashCode += getEndDateVariance().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getEstimatedWorkBaseline() != null) {
            _hashCode += getEstimatedWorkBaseline().hashCode();
        }
        if (getEstimatedWorkVariance() != null) {
            _hashCode += getEstimatedWorkVariance().hashCode();
        }
        if (getEstimatedWorkVariancePercent() != null) {
            _hashCode += getEstimatedWorkVariancePercent().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsSummaryTask() != null) {
            _hashCode += getIsSummaryTask().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPercentWorkComplete() != null) {
            _hashCode += getPercentWorkComplete().hashCode();
        }
        if (getPredecessors() != null) {
            _hashCode += getPredecessors().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRemainingWork() != null) {
            _hashCode += getRemainingWork().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStartDateBaseline() != null) {
            _hashCode += getStartDateBaseline().hashCode();
        }
        if (getStartDateVariance() != null) {
            _hashCode += getStartDateVariance().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assignee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBaseBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costBaseVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costBaseVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costVariancePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWorkVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWorkVariancePercent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedWorkVariancePercent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("isSummaryTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSummaryTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentWorkComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "percentWorkComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "predecessors"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateVariance");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDateVariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
