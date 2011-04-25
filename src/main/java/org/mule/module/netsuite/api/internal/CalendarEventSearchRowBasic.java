/**
 * CalendarEventSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CalendarEventSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] attendee;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] completedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] endTime;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] instanceEnd;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] instanceStart;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] markdone;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] message;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] organizer;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] recurrence;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] resource;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] response;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] startDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] startTime;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] title;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] transaction;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public CalendarEventSearchRowBasic() {
    }

    public CalendarEventSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] attendee,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] company,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] completedDate,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] contact,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] createdDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] endTime,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] instanceEnd,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] instanceStart,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] location,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] markdone,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] message,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] organizer,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] owner,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] recurrence,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] resource,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] response,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] startDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] startTime,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] status,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] title,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] transaction,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.attendee = attendee;
           this.company = company;
           this.completedDate = completedDate;
           this.contact = contact;
           this.createdDate = createdDate;
           this.endTime = endTime;
           this.externalId = externalId;
           this.instanceEnd = instanceEnd;
           this.instanceStart = instanceStart;
           this.internalId = internalId;
           this.lastModifiedDate = lastModifiedDate;
           this.location = location;
           this.markdone = markdone;
           this.message = message;
           this.organizer = organizer;
           this.owner = owner;
           this.recurrence = recurrence;
           this.resource = resource;
           this.response = response;
           this.startDate = startDate;
           this.startTime = startTime;
           this.status = status;
           this.title = title;
           this.transaction = transaction;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the attendee value for this CalendarEventSearchRowBasic.
     * 
     * @return attendee
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAttendee() {
        return attendee;
    }


    /**
     * Sets the attendee value for this CalendarEventSearchRowBasic.
     * 
     * @param attendee
     */
    public void setAttendee(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] attendee) {
        this.attendee = attendee;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAttendee(int i) {
        return this.attendee[i];
    }

    public void setAttendee(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.attendee[i] = _value;
    }


    /**
     * Gets the company value for this CalendarEventSearchRowBasic.
     * 
     * @return company
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getCompany() {
        return company;
    }


    /**
     * Sets the company value for this CalendarEventSearchRowBasic.
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
     * Gets the completedDate value for this CalendarEventSearchRowBasic.
     * 
     * @return completedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCompletedDate() {
        return completedDate;
    }


    /**
     * Sets the completedDate value for this CalendarEventSearchRowBasic.
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
     * Gets the contact value for this CalendarEventSearchRowBasic.
     * 
     * @return contact
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this CalendarEventSearchRowBasic.
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
     * Gets the createdDate value for this CalendarEventSearchRowBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CalendarEventSearchRowBasic.
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
     * Gets the endTime value for this CalendarEventSearchRowBasic.
     * 
     * @return endTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEndTime() {
        return endTime;
    }


    /**
     * Sets the endTime value for this CalendarEventSearchRowBasic.
     * 
     * @param endTime
     */
    public void setEndTime(org.mule.module.netsuite.api.internal.SearchColumnStringField[] endTime) {
        this.endTime = endTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.endTime[i] = _value;
    }


    /**
     * Gets the externalId value for this CalendarEventSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this CalendarEventSearchRowBasic.
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
     * Gets the instanceEnd value for this CalendarEventSearchRowBasic.
     * 
     * @return instanceEnd
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getInstanceEnd() {
        return instanceEnd;
    }


    /**
     * Sets the instanceEnd value for this CalendarEventSearchRowBasic.
     * 
     * @param instanceEnd
     */
    public void setInstanceEnd(org.mule.module.netsuite.api.internal.SearchColumnDateField[] instanceEnd) {
        this.instanceEnd = instanceEnd;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getInstanceEnd(int i) {
        return this.instanceEnd[i];
    }

    public void setInstanceEnd(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.instanceEnd[i] = _value;
    }


    /**
     * Gets the instanceStart value for this CalendarEventSearchRowBasic.
     * 
     * @return instanceStart
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getInstanceStart() {
        return instanceStart;
    }


    /**
     * Sets the instanceStart value for this CalendarEventSearchRowBasic.
     * 
     * @param instanceStart
     */
    public void setInstanceStart(org.mule.module.netsuite.api.internal.SearchColumnDateField[] instanceStart) {
        this.instanceStart = instanceStart;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getInstanceStart(int i) {
        return this.instanceStart[i];
    }

    public void setInstanceStart(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.instanceStart[i] = _value;
    }


    /**
     * Gets the internalId value for this CalendarEventSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CalendarEventSearchRowBasic.
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
     * Gets the lastModifiedDate value for this CalendarEventSearchRowBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CalendarEventSearchRowBasic.
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
     * Gets the location value for this CalendarEventSearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this CalendarEventSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchColumnStringField[] location) {
        this.location = location;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the markdone value for this CalendarEventSearchRowBasic.
     * 
     * @return markdone
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMarkdone() {
        return markdone;
    }


    /**
     * Sets the markdone value for this CalendarEventSearchRowBasic.
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
     * Gets the message value for this CalendarEventSearchRowBasic.
     * 
     * @return message
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CalendarEventSearchRowBasic.
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
     * Gets the organizer value for this CalendarEventSearchRowBasic.
     * 
     * @return organizer
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOrganizer() {
        return organizer;
    }


    /**
     * Sets the organizer value for this CalendarEventSearchRowBasic.
     * 
     * @param organizer
     */
    public void setOrganizer(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] organizer) {
        this.organizer = organizer;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getOrganizer(int i) {
        return this.organizer[i];
    }

    public void setOrganizer(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.organizer[i] = _value;
    }


    /**
     * Gets the owner value for this CalendarEventSearchRowBasic.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this CalendarEventSearchRowBasic.
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
     * Gets the recurrence value for this CalendarEventSearchRowBasic.
     * 
     * @return recurrence
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getRecurrence() {
        return recurrence;
    }


    /**
     * Sets the recurrence value for this CalendarEventSearchRowBasic.
     * 
     * @param recurrence
     */
    public void setRecurrence(org.mule.module.netsuite.api.internal.SearchColumnStringField[] recurrence) {
        this.recurrence = recurrence;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getRecurrence(int i) {
        return this.recurrence[i];
    }

    public void setRecurrence(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.recurrence[i] = _value;
    }


    /**
     * Gets the resource value for this CalendarEventSearchRowBasic.
     * 
     * @return resource
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this CalendarEventSearchRowBasic.
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
     * Gets the response value for this CalendarEventSearchRowBasic.
     * 
     * @return response
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CalendarEventSearchRowBasic.
     * 
     * @param response
     */
    public void setResponse(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] response) {
        this.response = response;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getResponse(int i) {
        return this.response[i];
    }

    public void setResponse(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.response[i] = _value;
    }


    /**
     * Gets the startDate value for this CalendarEventSearchRowBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CalendarEventSearchRowBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchColumnStringField[] startDate) {
        this.startDate = startDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.startDate[i] = _value;
    }


    /**
     * Gets the startTime value for this CalendarEventSearchRowBasic.
     * 
     * @return startTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStartTime() {
        return startTime;
    }


    /**
     * Sets the startTime value for this CalendarEventSearchRowBasic.
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
     * Gets the status value for this CalendarEventSearchRowBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CalendarEventSearchRowBasic.
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
     * Gets the title value for this CalendarEventSearchRowBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CalendarEventSearchRowBasic.
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
     * Gets the transaction value for this CalendarEventSearchRowBasic.
     * 
     * @return transaction
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTransaction() {
        return transaction;
    }


    /**
     * Sets the transaction value for this CalendarEventSearchRowBasic.
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
     * Gets the customFieldList value for this CalendarEventSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CalendarEventSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CalendarEventSearchRowBasic)) return false;
        CalendarEventSearchRowBasic other = (CalendarEventSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.attendee==null && other.getAttendee()==null) || 
             (this.attendee!=null &&
              java.util.Arrays.equals(this.attendee, other.getAttendee()))) &&
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
            ((this.endTime==null && other.getEndTime()==null) || 
             (this.endTime!=null &&
              java.util.Arrays.equals(this.endTime, other.getEndTime()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.instanceEnd==null && other.getInstanceEnd()==null) || 
             (this.instanceEnd!=null &&
              java.util.Arrays.equals(this.instanceEnd, other.getInstanceEnd()))) &&
            ((this.instanceStart==null && other.getInstanceStart()==null) || 
             (this.instanceStart!=null &&
              java.util.Arrays.equals(this.instanceStart, other.getInstanceStart()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              java.util.Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.markdone==null && other.getMarkdone()==null) || 
             (this.markdone!=null &&
              java.util.Arrays.equals(this.markdone, other.getMarkdone()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              java.util.Arrays.equals(this.message, other.getMessage()))) &&
            ((this.organizer==null && other.getOrganizer()==null) || 
             (this.organizer!=null &&
              java.util.Arrays.equals(this.organizer, other.getOrganizer()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              java.util.Arrays.equals(this.owner, other.getOwner()))) &&
            ((this.recurrence==null && other.getRecurrence()==null) || 
             (this.recurrence!=null &&
              java.util.Arrays.equals(this.recurrence, other.getRecurrence()))) &&
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              java.util.Arrays.equals(this.resource, other.getResource()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              java.util.Arrays.equals(this.response, other.getResponse()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              java.util.Arrays.equals(this.startDate, other.getStartDate()))) &&
            ((this.startTime==null && other.getStartTime()==null) || 
             (this.startTime!=null &&
              java.util.Arrays.equals(this.startTime, other.getStartTime()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              java.util.Arrays.equals(this.status, other.getStatus()))) &&
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
        if (getAttendee() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAttendee());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAttendee(), i);
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
        if (getInstanceEnd() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstanceEnd());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstanceEnd(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInstanceStart() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInstanceStart());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInstanceStart(), i);
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
        if (getOrganizer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOrganizer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOrganizer(), i);
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
        if (getRecurrence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecurrence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecurrence(), i);
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
        if (getResponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponse(), i);
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
        new org.apache.axis.description.TypeDesc(CalendarEventSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "attendee"));
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
        elemField.setFieldName("endTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("instanceEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "instanceEnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instanceStart");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "instanceStart"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("organizer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "organizer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("recurrence");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "recurrence"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
