/**
 * SupportCaseSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SupportCaseSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] awaitingReply;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] caseNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] customerStage;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] email;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] escalatee;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] helpDesk;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] inboundEmail;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issue;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] issueNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastMessageDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastReopenedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] locked;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] module;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] origin;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priority;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] product;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] stage;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] status;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public SupportCaseSearchRowBasic() {
    }

    public SupportCaseSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assigned,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] awaitingReply,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] caseNumber,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] customerStage,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] email,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] endDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] escalatee,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] helpDesk,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] inboundEmail,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issue,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] issueNumber,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastMessageDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastReopenedDate,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] locked,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] module,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] origin,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priority,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] product,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] stage,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] status,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.assigned = assigned;
           this.awaitingReply = awaitingReply;
           this.caseNumber = caseNumber;
           this.category = category;
           this.company = company;
           this.contact = contact;
           this.createdDate = createdDate;
           this.customerStage = customerStage;
           this.email = email;
           this.endDate = endDate;
           this.escalatee = escalatee;
           this.externalId = externalId;
           this.helpDesk = helpDesk;
           this.inboundEmail = inboundEmail;
           this.internalId = internalId;
           this.isInactive = isInactive;
           this.issue = issue;
           this.issueNumber = issueNumber;
           this.item = item;
           this.lastMessageDate = lastMessageDate;
           this.lastModifiedDate = lastModifiedDate;
           this.lastReopenedDate = lastReopenedDate;
           this.locked = locked;
           this.module = module;
           this.origin = origin;
           this.priority = priority;
           this.product = product;
           this.serialNumber = serialNumber;
           this.stage = stage;
           this.startDate = startDate;
           this.status = status;
           this.title = title;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the assigned value for this SupportCaseSearchRowBasic.
     * 
     * @return assigned
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this SupportCaseSearchRowBasic.
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
     * Gets the awaitingReply value for this SupportCaseSearchRowBasic.
     * 
     * @return awaitingReply
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAwaitingReply() {
        return awaitingReply;
    }


    /**
     * Sets the awaitingReply value for this SupportCaseSearchRowBasic.
     * 
     * @param awaitingReply
     */
    public void setAwaitingReply(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] awaitingReply) {
        this.awaitingReply = awaitingReply;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAwaitingReply(int i) {
        return this.awaitingReply[i];
    }

    public void setAwaitingReply(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.awaitingReply[i] = _value;
    }


    /**
     * Gets the caseNumber value for this SupportCaseSearchRowBasic.
     * 
     * @return caseNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this SupportCaseSearchRowBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] caseNumber) {
        this.caseNumber = caseNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCaseNumber(int i) {
        return this.caseNumber[i];
    }

    public void setCaseNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.caseNumber[i] = _value;
    }


    /**
     * Gets the category value for this SupportCaseSearchRowBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SupportCaseSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] category) {
        this.category = category;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the company value for this SupportCaseSearchRowBasic.
     * 
     * @return company
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCompany() {
        return company;
    }


    /**
     * Sets the company value for this SupportCaseSearchRowBasic.
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
     * Gets the contact value for this SupportCaseSearchRowBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this SupportCaseSearchRowBasic.
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
     * Gets the createdDate value for this SupportCaseSearchRowBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SupportCaseSearchRowBasic.
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
     * Gets the customerStage value for this SupportCaseSearchRowBasic.
     * 
     * @return customerStage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCustomerStage() {
        return customerStage;
    }


    /**
     * Sets the customerStage value for this SupportCaseSearchRowBasic.
     * 
     * @param customerStage
     */
    public void setCustomerStage(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] customerStage) {
        this.customerStage = customerStage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCustomerStage(int i) {
        return this.customerStage[i];
    }

    public void setCustomerStage(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.customerStage[i] = _value;
    }


    /**
     * Gets the email value for this SupportCaseSearchRowBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SupportCaseSearchRowBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchColumnStringField[] email) {
        this.email = email;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.email[i] = _value;
    }


    /**
     * Gets the endDate value for this SupportCaseSearchRowBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this SupportCaseSearchRowBasic.
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
     * Gets the escalatee value for this SupportCaseSearchRowBasic.
     * 
     * @return escalatee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getEscalatee() {
        return escalatee;
    }


    /**
     * Sets the escalatee value for this SupportCaseSearchRowBasic.
     * 
     * @param escalatee
     */
    public void setEscalatee(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] escalatee) {
        this.escalatee = escalatee;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getEscalatee(int i) {
        return this.escalatee[i];
    }

    public void setEscalatee(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.escalatee[i] = _value;
    }


    /**
     * Gets the externalId value for this SupportCaseSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SupportCaseSearchRowBasic.
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
     * Gets the helpDesk value for this SupportCaseSearchRowBasic.
     * 
     * @return helpDesk
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getHelpDesk() {
        return helpDesk;
    }


    /**
     * Sets the helpDesk value for this SupportCaseSearchRowBasic.
     * 
     * @param helpDesk
     */
    public void setHelpDesk(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] helpDesk) {
        this.helpDesk = helpDesk;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getHelpDesk(int i) {
        return this.helpDesk[i];
    }

    public void setHelpDesk(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.helpDesk[i] = _value;
    }


    /**
     * Gets the inboundEmail value for this SupportCaseSearchRowBasic.
     * 
     * @return inboundEmail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getInboundEmail() {
        return inboundEmail;
    }


    /**
     * Sets the inboundEmail value for this SupportCaseSearchRowBasic.
     * 
     * @param inboundEmail
     */
    public void setInboundEmail(org.mule.module.netsuite.api.internal.SearchColumnStringField[] inboundEmail) {
        this.inboundEmail = inboundEmail;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getInboundEmail(int i) {
        return this.inboundEmail[i];
    }

    public void setInboundEmail(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.inboundEmail[i] = _value;
    }


    /**
     * Gets the internalId value for this SupportCaseSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SupportCaseSearchRowBasic.
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
     * Gets the isInactive value for this SupportCaseSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SupportCaseSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the issue value for this SupportCaseSearchRowBasic.
     * 
     * @return issue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this SupportCaseSearchRowBasic.
     * 
     * @param issue
     */
    public void setIssue(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issue) {
        this.issue = issue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getIssue(int i) {
        return this.issue[i];
    }

    public void setIssue(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.issue[i] = _value;
    }


    /**
     * Gets the issueNumber value for this SupportCaseSearchRowBasic.
     * 
     * @return issueNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getIssueNumber() {
        return issueNumber;
    }


    /**
     * Sets the issueNumber value for this SupportCaseSearchRowBasic.
     * 
     * @param issueNumber
     */
    public void setIssueNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] issueNumber) {
        this.issueNumber = issueNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getIssueNumber(int i) {
        return this.issueNumber[i];
    }

    public void setIssueNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.issueNumber[i] = _value;
    }


    /**
     * Gets the item value for this SupportCaseSearchRowBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getItem() {
        return item;
    }


    /**
     * Sets the item value for this SupportCaseSearchRowBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] item) {
        this.item = item;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.item[i] = _value;
    }


    /**
     * Gets the lastMessageDate value for this SupportCaseSearchRowBasic.
     * 
     * @return lastMessageDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastMessageDate() {
        return lastMessageDate;
    }


    /**
     * Sets the lastMessageDate value for this SupportCaseSearchRowBasic.
     * 
     * @param lastMessageDate
     */
    public void setLastMessageDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastMessageDate(int i) {
        return this.lastMessageDate[i];
    }

    public void setLastMessageDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastMessageDate[i] = _value;
    }


    /**
     * Gets the lastModifiedDate value for this SupportCaseSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SupportCaseSearchRowBasic.
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
     * Gets the lastReopenedDate value for this SupportCaseSearchRowBasic.
     * 
     * @return lastReopenedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastReopenedDate() {
        return lastReopenedDate;
    }


    /**
     * Sets the lastReopenedDate value for this SupportCaseSearchRowBasic.
     * 
     * @param lastReopenedDate
     */
    public void setLastReopenedDate(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastReopenedDate(int i) {
        return this.lastReopenedDate[i];
    }

    public void setLastReopenedDate(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastReopenedDate[i] = _value;
    }


    /**
     * Gets the locked value for this SupportCaseSearchRowBasic.
     * 
     * @return locked
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this SupportCaseSearchRowBasic.
     * 
     * @param locked
     */
    public void setLocked(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] locked) {
        this.locked = locked;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getLocked(int i) {
        return this.locked[i];
    }

    public void setLocked(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.locked[i] = _value;
    }


    /**
     * Gets the module value for this SupportCaseSearchRowBasic.
     * 
     * @return module
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getModule() {
        return module;
    }


    /**
     * Sets the module value for this SupportCaseSearchRowBasic.
     * 
     * @param module
     */
    public void setModule(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] module) {
        this.module = module;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getModule(int i) {
        return this.module[i];
    }

    public void setModule(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.module[i] = _value;
    }


    /**
     * Gets the origin value for this SupportCaseSearchRowBasic.
     * 
     * @return origin
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SupportCaseSearchRowBasic.
     * 
     * @param origin
     */
    public void setOrigin(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] origin) {
        this.origin = origin;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getOrigin(int i) {
        return this.origin[i];
    }

    public void setOrigin(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.origin[i] = _value;
    }


    /**
     * Gets the priority value for this SupportCaseSearchRowBasic.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SupportCaseSearchRowBasic.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] priority) {
        this.priority = priority;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.priority[i] = _value;
    }


    /**
     * Gets the product value for this SupportCaseSearchRowBasic.
     * 
     * @return product
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SupportCaseSearchRowBasic.
     * 
     * @param product
     */
    public void setProduct(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] product) {
        this.product = product;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.product[i] = _value;
    }


    /**
     * Gets the serialNumber value for this SupportCaseSearchRowBasic.
     * 
     * @return serialNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this SupportCaseSearchRowBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }


    /**
     * Gets the stage value for this SupportCaseSearchRowBasic.
     * 
     * @return stage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this SupportCaseSearchRowBasic.
     * 
     * @param stage
     */
    public void setStage(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] stage) {
        this.stage = stage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.stage[i] = _value;
    }


    /**
     * Gets the startDate value for this SupportCaseSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SupportCaseSearchRowBasic.
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
     * Gets the status value for this SupportCaseSearchRowBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SupportCaseSearchRowBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] status) {
        this.status = status;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.status[i] = _value;
    }


    /**
     * Gets the title value for this SupportCaseSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SupportCaseSearchRowBasic.
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
     * Gets the customFieldList value for this SupportCaseSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SupportCaseSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseSearchRowBasic)) return false;
        SupportCaseSearchRowBasic other = (SupportCaseSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              java.util.Arrays.equals(this.assigned, other.getAssigned()))) &&
            ((this.awaitingReply==null && other.getAwaitingReply()==null) || 
             (this.awaitingReply!=null &&
              java.util.Arrays.equals(this.awaitingReply, other.getAwaitingReply()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              java.util.Arrays.equals(this.caseNumber, other.getCaseNumber()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              java.util.Arrays.equals(this.company, other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              java.util.Arrays.equals(this.contact, other.getContact()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              java.util.Arrays.equals(this.createdDate, other.getCreatedDate()))) &&
            ((this.customerStage==null && other.getCustomerStage()==null) || 
             (this.customerStage!=null &&
              java.util.Arrays.equals(this.customerStage, other.getCustomerStage()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              java.util.Arrays.equals(this.email, other.getEmail()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              java.util.Arrays.equals(this.endDate, other.getEndDate()))) &&
            ((this.escalatee==null && other.getEscalatee()==null) || 
             (this.escalatee!=null &&
              java.util.Arrays.equals(this.escalatee, other.getEscalatee()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.helpDesk==null && other.getHelpDesk()==null) || 
             (this.helpDesk!=null &&
              java.util.Arrays.equals(this.helpDesk, other.getHelpDesk()))) &&
            ((this.inboundEmail==null && other.getInboundEmail()==null) || 
             (this.inboundEmail!=null &&
              java.util.Arrays.equals(this.inboundEmail, other.getInboundEmail()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              java.util.Arrays.equals(this.issue, other.getIssue()))) &&
            ((this.issueNumber==null && other.getIssueNumber()==null) || 
             (this.issueNumber!=null &&
              java.util.Arrays.equals(this.issueNumber, other.getIssueNumber()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              java.util.Arrays.equals(this.item, other.getItem()))) &&
            ((this.lastMessageDate==null && other.getLastMessageDate()==null) || 
             (this.lastMessageDate!=null &&
              java.util.Arrays.equals(this.lastMessageDate, other.getLastMessageDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.lastReopenedDate==null && other.getLastReopenedDate()==null) || 
             (this.lastReopenedDate!=null &&
              java.util.Arrays.equals(this.lastReopenedDate, other.getLastReopenedDate()))) &&
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              java.util.Arrays.equals(this.locked, other.getLocked()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              java.util.Arrays.equals(this.module, other.getModule()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              java.util.Arrays.equals(this.origin, other.getOrigin()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              java.util.Arrays.equals(this.product, other.getProduct()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              java.util.Arrays.equals(this.serialNumber, other.getSerialNumber()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              java.util.Arrays.equals(this.stage, other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
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
        if (getAwaitingReply() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAwaitingReply());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAwaitingReply(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCaseNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaseNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaseNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
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
        if (getCustomerStage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomerStage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomerStage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmail(), i);
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
        if (getEscalatee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEscalatee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEscalatee(), i);
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
        if (getHelpDesk() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHelpDesk());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHelpDesk(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInboundEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInboundEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInboundEmail(), i);
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
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueNumber(), i);
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
        if (getLastMessageDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastMessageDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastMessageDate(), i);
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
        if (getLastReopenedDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastReopenedDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastReopenedDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocked() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocked());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocked(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOrigin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrigin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrigin(), i);
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
        if (getProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStage(), i);
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
        new org.apache.axis.description.TypeDesc(SupportCaseSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awaitingReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "awaitingReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category"));
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
        elemField.setFieldName("customerStage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customerStage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("escalatee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "escalatee"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "inboundEmail"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastMessageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastMessageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stage"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
