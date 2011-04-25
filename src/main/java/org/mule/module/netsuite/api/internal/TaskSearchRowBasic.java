/**
 * TaskSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TaskSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] accessLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualTime;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] completedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dueDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTime;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverride;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobSummaryTask;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobTask;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] markdone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] message;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] milestone;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] order;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentComplete;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentTimeComplete;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] priority;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] startTime;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] timeRemaining;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] transaction;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public TaskSearchRowBasic() {
    }

    public TaskSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] accessLevel,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualTime,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] completedDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dueDate,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTime,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverride,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobSummaryTask,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobTask,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] markdone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] message,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] milestone,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] order,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentComplete,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentTimeComplete,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] priority,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] startTime,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] timeRemaining,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] transaction,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.accessLevel = accessLevel;
           this.actualTime = actualTime;
           this.assigned = assigned;
           this.company = company;
           this.completedDate = completedDate;
           this.contact = contact;
           this.createdDate = createdDate;
           this.dueDate = dueDate;
           this.estimatedTime = estimatedTime;
           this.estimatedTimeOverride = estimatedTimeOverride;
           this.externalId = externalId;
           this.internalId = internalId;
           this.isJobSummaryTask = isJobSummaryTask;
           this.isJobTask = isJobTask;
           this.lastModifiedDate = lastModifiedDate;
           this.markdone = markdone;
           this.message = message;
           this.milestone = milestone;
           this.order = order;
           this.owner = owner;
           this.percentComplete = percentComplete;
           this.percentTimeComplete = percentTimeComplete;
           this.priority = priority;
           this.startDate = startDate;
           this.startTime = startTime;
           this.status = status;
           this.timeRemaining = timeRemaining;
           this.title = title;
           this.transaction = transaction;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the accessLevel value for this TaskSearchRowBasic.
     * 
     * @return accessLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getAccessLevel() {
        return accessLevel;
    }


    /**
     * Sets the accessLevel value for this TaskSearchRowBasic.
     * 
     * @param accessLevel
     */
    public void setAccessLevel(org.mule.module.netsuite.api.internal.SearchColumnStringField[] accessLevel) {
        this.accessLevel = accessLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getAccessLevel(int i) {
        return this.accessLevel[i];
    }

    public void setAccessLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.accessLevel[i] = _value;
    }


    /**
     * Gets the actualTime value for this TaskSearchRowBasic.
     * 
     * @return actualTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getActualTime() {
        return actualTime;
    }


    /**
     * Sets the actualTime value for this TaskSearchRowBasic.
     * 
     * @param actualTime
     */
    public void setActualTime(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] actualTime) {
        this.actualTime = actualTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getActualTime(int i) {
        return this.actualTime[i];
    }

    public void setActualTime(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.actualTime[i] = _value;
    }


    /**
     * Gets the assigned value for this TaskSearchRowBasic.
     * 
     * @return assigned
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this TaskSearchRowBasic.
     * 
     * @param assigned
     */
    public void setAssigned(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned) {
        this.assigned = assigned;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.assigned[i] = _value;
    }


    /**
     * Gets the company value for this TaskSearchRowBasic.
     * 
     * @return company
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCompany() {
        return company;
    }


    /**
     * Sets the company value for this TaskSearchRowBasic.
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
     * Gets the completedDate value for this TaskSearchRowBasic.
     * 
     * @return completedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this TaskSearchRowBasic.
     * 
     * @param completedDate
     */
    public void setCompletedDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] completedDate) {
        this.completedDate = completedDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCompletedDate(int i) {
        return this.completedDate[i];
    }

    public void setCompletedDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.completedDate[i] = _value;
    }


    /**
     * Gets the contact value for this TaskSearchRowBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this TaskSearchRowBasic.
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
     * Gets the createdDate value for this TaskSearchRowBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this TaskSearchRowBasic.
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
     * Gets the dueDate value for this TaskSearchRowBasic.
     * 
     * @return dueDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDueDate() {
        return dueDate;
    }


    /**
     * Sets the dueDate value for this TaskSearchRowBasic.
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
     * Gets the estimatedTime value for this TaskSearchRowBasic.
     * 
     * @return estimatedTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedTime() {
        return estimatedTime;
    }


    /**
     * Sets the estimatedTime value for this TaskSearchRowBasic.
     * 
     * @param estimatedTime
     */
    public void setEstimatedTime(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedTime(int i) {
        return this.estimatedTime[i];
    }

    public void setEstimatedTime(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedTime[i] = _value;
    }


    /**
     * Gets the estimatedTimeOverride value for this TaskSearchRowBasic.
     * 
     * @return estimatedTimeOverride
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getEstimatedTimeOverride() {
        return estimatedTimeOverride;
    }


    /**
     * Sets the estimatedTimeOverride value for this TaskSearchRowBasic.
     * 
     * @param estimatedTimeOverride
     */
    public void setEstimatedTimeOverride(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getEstimatedTimeOverride(int i) {
        return this.estimatedTimeOverride[i];
    }

    public void setEstimatedTimeOverride(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.estimatedTimeOverride[i] = _value;
    }


    /**
     * Gets the externalId value for this TaskSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this TaskSearchRowBasic.
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
     * Gets the internalId value for this TaskSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this TaskSearchRowBasic.
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
     * Gets the isJobSummaryTask value for this TaskSearchRowBasic.
     * 
     * @return isJobSummaryTask
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsJobSummaryTask() {
        return isJobSummaryTask;
    }


    /**
     * Sets the isJobSummaryTask value for this TaskSearchRowBasic.
     * 
     * @param isJobSummaryTask
     */
    public void setIsJobSummaryTask(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobSummaryTask) {
        this.isJobSummaryTask = isJobSummaryTask;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsJobSummaryTask(int i) {
        return this.isJobSummaryTask[i];
    }

    public void setIsJobSummaryTask(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isJobSummaryTask[i] = _value;
    }


    /**
     * Gets the isJobTask value for this TaskSearchRowBasic.
     * 
     * @return isJobTask
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsJobTask() {
        return isJobTask;
    }


    /**
     * Sets the isJobTask value for this TaskSearchRowBasic.
     * 
     * @param isJobTask
     */
    public void setIsJobTask(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isJobTask) {
        this.isJobTask = isJobTask;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsJobTask(int i) {
        return this.isJobTask[i];
    }

    public void setIsJobTask(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isJobTask[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this TaskSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this TaskSearchRowBasic.
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
     * Gets the markdone value for this TaskSearchRowBasic.
     * 
     * @return markdone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMarkdone() {
        return markdone;
    }


    /**
     * Sets the markdone value for this TaskSearchRowBasic.
     * 
     * @param markdone
     */
    public void setMarkdone(org.mule.module.netsuite.api.internal.SearchColumnStringField[] markdone) {
        this.markdone = markdone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMarkdone(int i) {
        return this.markdone[i];
    }

    public void setMarkdone(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.markdone[i] = _value;
    }


    /**
     * Gets the message value for this TaskSearchRowBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this TaskSearchRowBasic.
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
     * Gets the milestone value for this TaskSearchRowBasic.
     * 
     * @return milestone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getMilestone() {
        return milestone;
    }


    /**
     * Sets the milestone value for this TaskSearchRowBasic.
     * 
     * @param milestone
     */
    public void setMilestone(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] milestone) {
        this.milestone = milestone;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getMilestone(int i) {
        return this.milestone[i];
    }

    public void setMilestone(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.milestone[i] = _value;
    }


    /**
     * Gets the order value for this TaskSearchRowBasic.
     * 
     * @return order
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getOrder() {
        return order;
    }


    /**
     * Sets the order value for this TaskSearchRowBasic.
     * 
     * @param order
     */
    public void setOrder(org.mule.module.netsuite.api.internal.SearchColumnLongField[] order) {
        this.order = order;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.order[i] = _value;
    }


    /**
     * Gets the owner value for this TaskSearchRowBasic.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this TaskSearchRowBasic.
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
     * Gets the percentComplete value for this TaskSearchRowBasic.
     * 
     * @return percentComplete
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPercentComplete() {
        return percentComplete;
    }


    /**
     * Sets the percentComplete value for this TaskSearchRowBasic.
     * 
     * @param percentComplete
     */
    public void setPercentComplete(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentComplete) {
        this.percentComplete = percentComplete;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPercentComplete(int i) {
        return this.percentComplete[i];
    }

    public void setPercentComplete(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.percentComplete[i] = _value;
    }


    /**
     * Gets the percentTimeComplete value for this TaskSearchRowBasic.
     * 
     * @return percentTimeComplete
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPercentTimeComplete() {
        return percentTimeComplete;
    }


    /**
     * Sets the percentTimeComplete value for this TaskSearchRowBasic.
     * 
     * @param percentTimeComplete
     */
    public void setPercentTimeComplete(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPercentTimeComplete(int i) {
        return this.percentTimeComplete[i];
    }

    public void setPercentTimeComplete(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.percentTimeComplete[i] = _value;
    }


    /**
     * Gets the priority value for this TaskSearchRowBasic.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this TaskSearchRowBasic.
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
     * Gets the startDate value for this TaskSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this TaskSearchRowBasic.
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
     * Gets the startTime value for this TaskSearchRowBasic.
     * 
     * @return startTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this TaskSearchRowBasic.
     * 
     * @param startTime
     */
    public void setStartTime(org.mule.module.netsuite.api.internal.SearchColumnStringField[] startTime) {
        this.startTime = startTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.startTime[i] = _value;
    }


    /**
     * Gets the status value for this TaskSearchRowBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this TaskSearchRowBasic.
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
     * Gets the timeRemaining value for this TaskSearchRowBasic.
     * 
     * @return timeRemaining
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTimeRemaining() {
        return timeRemaining;
    }


    /**
     * Sets the timeRemaining value for this TaskSearchRowBasic.
     * 
     * @param timeRemaining
     */
    public void setTimeRemaining(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTimeRemaining(int i) {
        return this.timeRemaining[i];
    }

    public void setTimeRemaining(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.timeRemaining[i] = _value;
    }


    /**
     * Gets the title value for this TaskSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this TaskSearchRowBasic.
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
     * Gets the transaction value for this TaskSearchRowBasic.
     * 
     * @return transaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this TaskSearchRowBasic.
     * 
     * @param transaction
     */
    public void setTransaction(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] transaction) {
        this.transaction = transaction;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTransaction(int i) {
        return this.transaction[i];
    }

    public void setTransaction(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.transaction[i] = _value;
    }


    /**
     * Gets the customFieldList value for this TaskSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this TaskSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaskSearchRowBasic)) return false;
        TaskSearchRowBasic other = (TaskSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessLevel==null && other.getAccessLevel()==null) || 
             (this.accessLevel!=null &&
              java.util.Arrays.equals(this.accessLevel, other.getAccessLevel()))) &&
            ((this.actualTime==null && other.getActualTime()==null) || 
             (this.actualTime!=null &&
              java.util.Arrays.equals(this.actualTime, other.getActualTime()))) &&
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              java.util.Arrays.equals(this.assigned, other.getAssigned()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              java.util.Arrays.equals(this.company, other.getCompany()))) &&
            ((this.completedDate==null && other.getCompletedDate()==null) || 
             (this.completedDate!=null &&
              java.util.Arrays.equals(this.completedDate, other.getCompletedDate()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.dueDate==null && other.getDueDate()==null) || 
             (this.dueDate!=null &&
              java.util.Arrays.equals(this.dueDate, other.getDueDate()))) &&
            ((this.estimatedTime==null && other.getEstimatedTime()==null) || 
             (this.estimatedTime!=null &&
              java.util.Arrays.equals(this.estimatedTime, other.getEstimatedTime()))) &&
            ((this.estimatedTimeOverride==null && other.getEstimatedTimeOverride()==null) || 
             (this.estimatedTimeOverride!=null &&
              java.util.Arrays.equals(this.estimatedTimeOverride, other.getEstimatedTimeOverride()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isJobSummaryTask==null && other.getIsJobSummaryTask()==null) || 
             (this.isJobSummaryTask!=null &&
              java.util.Arrays.equals(this.isJobSummaryTask, other.getIsJobSummaryTask()))) &&
            ((this.isJobTask==null && other.getIsJobTask()==null) || 
             (this.isJobTask!=null &&
              java.util.Arrays.equals(this.isJobTask, other.getIsJobTask()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.markdone==null && other.getMarkdone()==null) || 
             (this.markdone!=null &&
              java.util.Arrays.equals(this.markdone, other.getMarkdone()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.milestone==null && other.getMilestone()==null) || 
             (this.milestone!=null &&
              java.util.Arrays.equals(this.milestone, other.getMilestone()))) &&
            ((this.order==null && other.getOrder()==null) || 
             (this.order!=null &&
              java.util.Arrays.equals(this.order, other.getOrder()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.percentComplete==null && other.getPercentComplete()==null) || 
             (this.percentComplete!=null &&
              java.util.Arrays.equals(this.percentComplete, other.getPercentComplete()))) &&
            ((this.percentTimeComplete==null && other.getPercentTimeComplete()==null) || 
             (this.percentTimeComplete!=null &&
              java.util.Arrays.equals(this.percentTimeComplete, other.getPercentTimeComplete()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              java.util.Arrays.equals(this.startTime, other.getStartTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
            ((this.timeRemaining==null && other.getTimeRemaining()==null) || 
             (this.timeRemaining!=null &&
              java.util.Arrays.equals(this.timeRemaining, other.getTimeRemaining()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              java.util.Arrays.equals(this.title, other.getTitle()))) &&
            ((this.transaction==null && other.getTransaction()==null) || 
             (this.transaction!=null &&
              java.util.Arrays.equals(this.transaction, other.getTransaction()))) &&
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
        if (getAccessLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActualTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActualTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActualTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAssigned() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssigned());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssigned(), i);
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
        if (getCompletedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCompletedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCompletedDate(), i);
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
        if (getEstimatedTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEstimatedTimeOverride() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEstimatedTimeOverride());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEstimatedTimeOverride(), i);
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
        if (getIsJobSummaryTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsJobSummaryTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsJobSummaryTask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsJobTask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsJobTask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsJobTask(), i);
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
        if (getMarkdone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMarkdone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMarkdone(), i);
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
        if (getMilestone() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMilestone());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMilestone(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrder(), i);
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
        if (getPercentComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentComplete(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPercentTimeComplete() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPercentTimeComplete());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPercentTimeComplete(), i);
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
        if (getTimeRemaining() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTimeRemaining());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTimeRemaining(), i);
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
        if (getTransaction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransaction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransaction(), i);
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
        new org.apache.axis.description.TypeDesc(TaskSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isJobSummaryTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isJobSummaryTask"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isJobTask");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isJobTask"));
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
        elemField.setFieldName("markdone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "markdone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("milestone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "milestone"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "order"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("transaction");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
