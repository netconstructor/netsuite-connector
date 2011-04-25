/**
 * SupportCaseSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SupportCaseSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned;

    private org.mule.module.netsuite.api.internal.SearchBooleanField awaitingReply;

    private org.mule.module.netsuite.api.internal.SearchStringField caseNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField category;

    private org.mule.module.netsuite.api.internal.SearchDateField closedDate;

    private org.mule.module.netsuite.api.internal.SearchStringField company;

    private org.mule.module.netsuite.api.internal.SearchStringField contact;

    private org.mule.module.netsuite.api.internal.SearchDateField createdDate;

    private org.mule.module.netsuite.api.internal.SearchStringField email;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField escalateTo;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchBooleanField helpDesk;

    private org.mule.module.netsuite.api.internal.SearchStringField inboundEmail;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField issue;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField item;

    private org.mule.module.netsuite.api.internal.SearchBooleanField lastMessage;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchDateField lastReopenedDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField locked;

    private org.mule.module.netsuite.api.internal.SearchStringField message;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField messageAuthor;

    private org.mule.module.netsuite.api.internal.SearchDateField messageDate;

    private org.mule.module.netsuite.api.internal.SearchBooleanField messageType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField module;

    private org.mule.module.netsuite.api.internal.SearchLongField number;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField origin;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField priority;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField product;

    private org.mule.module.netsuite.api.internal.SearchStringField serialNumber;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField stage;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public SupportCaseSearchBasic() {
    }

    public SupportCaseSearchBasic(
           org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned,
           org.mule.module.netsuite.api.internal.SearchBooleanField awaitingReply,
           org.mule.module.netsuite.api.internal.SearchStringField caseNumber,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField category,
           org.mule.module.netsuite.api.internal.SearchDateField closedDate,
           org.mule.module.netsuite.api.internal.SearchStringField company,
           org.mule.module.netsuite.api.internal.SearchStringField contact,
           org.mule.module.netsuite.api.internal.SearchDateField createdDate,
           org.mule.module.netsuite.api.internal.SearchStringField email,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField escalateTo,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchBooleanField helpDesk,
           org.mule.module.netsuite.api.internal.SearchStringField inboundEmail,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField issue,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField item,
           org.mule.module.netsuite.api.internal.SearchBooleanField lastMessage,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchDateField lastReopenedDate,
           org.mule.module.netsuite.api.internal.SearchBooleanField locked,
           org.mule.module.netsuite.api.internal.SearchStringField message,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField messageAuthor,
           org.mule.module.netsuite.api.internal.SearchDateField messageDate,
           org.mule.module.netsuite.api.internal.SearchBooleanField messageType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField module,
           org.mule.module.netsuite.api.internal.SearchLongField number,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField origin,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField priority,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField product,
           org.mule.module.netsuite.api.internal.SearchStringField serialNumber,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField stage,
           org.mule.module.netsuite.api.internal.SearchDateField startDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.assigned = assigned;
        this.awaitingReply = awaitingReply;
        this.caseNumber = caseNumber;
        this.category = category;
        this.closedDate = closedDate;
        this.company = company;
        this.contact = contact;
        this.createdDate = createdDate;
        this.email = email;
        this.escalateTo = escalateTo;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.helpDesk = helpDesk;
        this.inboundEmail = inboundEmail;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.issue = issue;
        this.item = item;
        this.lastMessage = lastMessage;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReopenedDate = lastReopenedDate;
        this.locked = locked;
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.module = module;
        this.number = number;
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
     * Gets the assigned value for this SupportCaseSearchBasic.
     * 
     * @return assigned
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAssigned() {
        return assigned;
    }


    /**
     * Sets the assigned value for this SupportCaseSearchBasic.
     * 
     * @param assigned
     */
    public void setAssigned(org.mule.module.netsuite.api.internal.SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }


    /**
     * Gets the awaitingReply value for this SupportCaseSearchBasic.
     * 
     * @return awaitingReply
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAwaitingReply() {
        return awaitingReply;
    }


    /**
     * Sets the awaitingReply value for this SupportCaseSearchBasic.
     * 
     * @param awaitingReply
     */
    public void setAwaitingReply(org.mule.module.netsuite.api.internal.SearchBooleanField awaitingReply) {
        this.awaitingReply = awaitingReply;
    }


    /**
     * Gets the caseNumber value for this SupportCaseSearchBasic.
     * 
     * @return caseNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCaseNumber() {
        return caseNumber;
    }


    /**
     * Sets the caseNumber value for this SupportCaseSearchBasic.
     * 
     * @param caseNumber
     */
    public void setCaseNumber(org.mule.module.netsuite.api.internal.SearchStringField caseNumber) {
        this.caseNumber = caseNumber;
    }


    /**
     * Gets the category value for this SupportCaseSearchBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this SupportCaseSearchBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the closedDate value for this SupportCaseSearchBasic.
     * 
     * @return closedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getClosedDate() {
        return closedDate;
    }


    /**
     * Sets the closedDate value for this SupportCaseSearchBasic.
     * 
     * @param closedDate
     */
    public void setClosedDate(org.mule.module.netsuite.api.internal.SearchDateField closedDate) {
        this.closedDate = closedDate;
    }


    /**
     * Gets the company value for this SupportCaseSearchBasic.
     * 
     * @return company
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCompany() {
        return company;
    }


    /**
     * Sets the company value for this SupportCaseSearchBasic.
     * 
     * @param company
     */
    public void setCompany(org.mule.module.netsuite.api.internal.SearchStringField company) {
        this.company = company;
    }


    /**
     * Gets the contact value for this SupportCaseSearchBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this SupportCaseSearchBasic.
     * 
     * @param contact
     */
    public void setContact(org.mule.module.netsuite.api.internal.SearchStringField contact) {
        this.contact = contact;
    }


    /**
     * Gets the createdDate value for this SupportCaseSearchBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this SupportCaseSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the email value for this SupportCaseSearchBasic.
     * 
     * @return email
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEmail() {
        return email;
    }


    /**
     * Sets the email value for this SupportCaseSearchBasic.
     * 
     * @param email
     */
    public void setEmail(org.mule.module.netsuite.api.internal.SearchStringField email) {
        this.email = email;
    }


    /**
     * Gets the escalateTo value for this SupportCaseSearchBasic.
     * 
     * @return escalateTo
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getEscalateTo() {
        return escalateTo;
    }


    /**
     * Sets the escalateTo value for this SupportCaseSearchBasic.
     * 
     * @param escalateTo
     */
    public void setEscalateTo(org.mule.module.netsuite.api.internal.SearchMultiSelectField escalateTo) {
        this.escalateTo = escalateTo;
    }


    /**
     * Gets the externalId value for this SupportCaseSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this SupportCaseSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this SupportCaseSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this SupportCaseSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the helpDesk value for this SupportCaseSearchBasic.
     * 
     * @return helpDesk
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getHelpDesk() {
        return helpDesk;
    }


    /**
     * Sets the helpDesk value for this SupportCaseSearchBasic.
     * 
     * @param helpDesk
     */
    public void setHelpDesk(org.mule.module.netsuite.api.internal.SearchBooleanField helpDesk) {
        this.helpDesk = helpDesk;
    }


    /**
     * Gets the inboundEmail value for this SupportCaseSearchBasic.
     * 
     * @return inboundEmail
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getInboundEmail() {
        return inboundEmail;
    }


    /**
     * Sets the inboundEmail value for this SupportCaseSearchBasic.
     * 
     * @param inboundEmail
     */
    public void setInboundEmail(org.mule.module.netsuite.api.internal.SearchStringField inboundEmail) {
        this.inboundEmail = inboundEmail;
    }


    /**
     * Gets the internalId value for this SupportCaseSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this SupportCaseSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this SupportCaseSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this SupportCaseSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this SupportCaseSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this SupportCaseSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the issue value for this SupportCaseSearchBasic.
     * 
     * @return issue
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getIssue() {
        return issue;
    }


    /**
     * Sets the issue value for this SupportCaseSearchBasic.
     * 
     * @param issue
     */
    public void setIssue(org.mule.module.netsuite.api.internal.SearchMultiSelectField issue) {
        this.issue = issue;
    }


    /**
     * Gets the item value for this SupportCaseSearchBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this SupportCaseSearchBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the lastMessage value for this SupportCaseSearchBasic.
     * 
     * @return lastMessage
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getLastMessage() {
        return lastMessage;
    }


    /**
     * Sets the lastMessage value for this SupportCaseSearchBasic.
     * 
     * @param lastMessage
     */
    public void setLastMessage(org.mule.module.netsuite.api.internal.SearchBooleanField lastMessage) {
        this.lastMessage = lastMessage;
    }


    /**
     * Gets the lastModifiedDate value for this SupportCaseSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this SupportCaseSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastReopenedDate value for this SupportCaseSearchBasic.
     * 
     * @return lastReopenedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastReopenedDate() {
        return lastReopenedDate;
    }


    /**
     * Sets the lastReopenedDate value for this SupportCaseSearchBasic.
     * 
     * @param lastReopenedDate
     */
    public void setLastReopenedDate(org.mule.module.netsuite.api.internal.SearchDateField lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }


    /**
     * Gets the locked value for this SupportCaseSearchBasic.
     * 
     * @return locked
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getLocked() {
        return locked;
    }


    /**
     * Sets the locked value for this SupportCaseSearchBasic.
     * 
     * @param locked
     */
    public void setLocked(org.mule.module.netsuite.api.internal.SearchBooleanField locked) {
        this.locked = locked;
    }


    /**
     * Gets the message value for this SupportCaseSearchBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMessage() {
        return message;
    }


    /**
     * Sets the message value for this SupportCaseSearchBasic.
     * 
     * @param message
     */
    public void setMessage(org.mule.module.netsuite.api.internal.SearchStringField message) {
        this.message = message;
    }


    /**
     * Gets the messageAuthor value for this SupportCaseSearchBasic.
     * 
     * @return messageAuthor
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getMessageAuthor() {
        return messageAuthor;
    }


    /**
     * Sets the messageAuthor value for this SupportCaseSearchBasic.
     * 
     * @param messageAuthor
     */
    public void setMessageAuthor(org.mule.module.netsuite.api.internal.SearchMultiSelectField messageAuthor) {
        this.messageAuthor = messageAuthor;
    }


    /**
     * Gets the messageDate value for this SupportCaseSearchBasic.
     * 
     * @return messageDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getMessageDate() {
        return messageDate;
    }


    /**
     * Sets the messageDate value for this SupportCaseSearchBasic.
     * 
     * @param messageDate
     */
    public void setMessageDate(org.mule.module.netsuite.api.internal.SearchDateField messageDate) {
        this.messageDate = messageDate;
    }


    /**
     * Gets the messageType value for this SupportCaseSearchBasic.
     * 
     * @return messageType
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this SupportCaseSearchBasic.
     * 
     * @param messageType
     */
    public void setMessageType(org.mule.module.netsuite.api.internal.SearchBooleanField messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the module value for this SupportCaseSearchBasic.
     * 
     * @return module
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getModule() {
        return module;
    }


    /**
     * Sets the module value for this SupportCaseSearchBasic.
     * 
     * @param module
     */
    public void setModule(org.mule.module.netsuite.api.internal.SearchMultiSelectField module) {
        this.module = module;
    }


    /**
     * Gets the number value for this SupportCaseSearchBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this SupportCaseSearchBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the origin value for this SupportCaseSearchBasic.
     * 
     * @return origin
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this SupportCaseSearchBasic.
     * 
     * @param origin
     */
    public void setOrigin(org.mule.module.netsuite.api.internal.SearchMultiSelectField origin) {
        this.origin = origin;
    }


    /**
     * Gets the priority value for this SupportCaseSearchBasic.
     * 
     * @return priority
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this SupportCaseSearchBasic.
     * 
     * @param priority
     */
    public void setPriority(org.mule.module.netsuite.api.internal.SearchMultiSelectField priority) {
        this.priority = priority;
    }


    /**
     * Gets the product value for this SupportCaseSearchBasic.
     * 
     * @return product
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getProduct() {
        return product;
    }


    /**
     * Sets the product value for this SupportCaseSearchBasic.
     * 
     * @param product
     */
    public void setProduct(org.mule.module.netsuite.api.internal.SearchMultiSelectField product) {
        this.product = product;
    }


    /**
     * Gets the serialNumber value for this SupportCaseSearchBasic.
     * 
     * @return serialNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this SupportCaseSearchBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(org.mule.module.netsuite.api.internal.SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the stage value for this SupportCaseSearchBasic.
     * 
     * @return stage
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getStage() {
        return stage;
    }


    /**
     * Sets the stage value for this SupportCaseSearchBasic.
     * 
     * @param stage
     */
    public void setStage(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField stage) {
        this.stage = stage;
    }


    /**
     * Gets the startDate value for this SupportCaseSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this SupportCaseSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this SupportCaseSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this SupportCaseSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the title value for this SupportCaseSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this SupportCaseSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the customFieldList value for this SupportCaseSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this SupportCaseSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SupportCaseSearchBasic)) return false;
        SupportCaseSearchBasic other = (SupportCaseSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assigned==null && other.getAssigned()==null) || 
             (this.assigned!=null &&
              this.assigned.equals(other.getAssigned()))) &&
            ((this.awaitingReply==null && other.getAwaitingReply()==null) || 
             (this.awaitingReply!=null &&
              this.awaitingReply.equals(other.getAwaitingReply()))) &&
            ((this.caseNumber==null && other.getCaseNumber()==null) || 
             (this.caseNumber!=null &&
              this.caseNumber.equals(other.getCaseNumber()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.closedDate==null && other.getClosedDate()==null) || 
             (this.closedDate!=null &&
              this.closedDate.equals(other.getClosedDate()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.escalateTo==null && other.getEscalateTo()==null) || 
             (this.escalateTo!=null &&
              this.escalateTo.equals(other.getEscalateTo()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.helpDesk==null && other.getHelpDesk()==null) || 
             (this.helpDesk!=null &&
              this.helpDesk.equals(other.getHelpDesk()))) &&
            ((this.inboundEmail==null && other.getInboundEmail()==null) || 
             (this.inboundEmail!=null &&
              this.inboundEmail.equals(other.getInboundEmail()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.issue==null && other.getIssue()==null) || 
             (this.issue!=null &&
              this.issue.equals(other.getIssue()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.lastMessage==null && other.getLastMessage()==null) || 
             (this.lastMessage!=null &&
              this.lastMessage.equals(other.getLastMessage()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastReopenedDate==null && other.getLastReopenedDate()==null) || 
             (this.lastReopenedDate!=null &&
              this.lastReopenedDate.equals(other.getLastReopenedDate()))) &&
            ((this.locked==null && other.getLocked()==null) || 
             (this.locked!=null &&
              this.locked.equals(other.getLocked()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.messageAuthor==null && other.getMessageAuthor()==null) || 
             (this.messageAuthor!=null &&
              this.messageAuthor.equals(other.getMessageAuthor()))) &&
            ((this.messageDate==null && other.getMessageDate()==null) || 
             (this.messageDate!=null &&
              this.messageDate.equals(other.getMessageDate()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.module==null && other.getModule()==null) || 
             (this.module!=null &&
              this.module.equals(other.getModule()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.stage==null && other.getStage()==null) || 
             (this.stage!=null &&
              this.stage.equals(other.getStage()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
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
        if (getAssigned() != null) {
            _hashCode += getAssigned().hashCode();
        }
        if (getAwaitingReply() != null) {
            _hashCode += getAwaitingReply().hashCode();
        }
        if (getCaseNumber() != null) {
            _hashCode += getCaseNumber().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getClosedDate() != null) {
            _hashCode += getClosedDate().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getEscalateTo() != null) {
            _hashCode += getEscalateTo().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getHelpDesk() != null) {
            _hashCode += getHelpDesk().hashCode();
        }
        if (getInboundEmail() != null) {
            _hashCode += getInboundEmail().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIssue() != null) {
            _hashCode += getIssue().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getLastMessage() != null) {
            _hashCode += getLastMessage().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastReopenedDate() != null) {
            _hashCode += getLastReopenedDate().hashCode();
        }
        if (getLocked() != null) {
            _hashCode += getLocked().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getMessageAuthor() != null) {
            _hashCode += getMessageAuthor().hashCode();
        }
        if (getMessageDate() != null) {
            _hashCode += getMessageDate().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getModule() != null) {
            _hashCode += getModule().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getStage() != null) {
            _hashCode += getStage().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
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
        new org.apache.axis.description.TypeDesc(SupportCaseSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("awaitingReply");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "awaitingReply"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("escalateTo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "escalateTo"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "inboundEmail"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("lastMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastMessage"));
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
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locked"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageAuthor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "messageAuthor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "messageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
