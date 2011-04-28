/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.activities.scheduling_2010_2;

import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventAccessLevel;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventDow;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventDowim;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventFrequency;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventReminderType;
import com.netsuite.webservices.activities.scheduling_2010_2.types.CalendarEventStatus;
import com.netsuite.webservices.platform.core_2010_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CalendarEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarEvent">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="company" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="supportCase" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="transaction" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="frequency" type="{urn:types.scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventFrequency" minOccurs="0"/>
 *         &lt;element name="recurrenceDowMaskList" type="{urn:scheduling_2010_2.activities.webservices.netsuite.com}RecurrenceDowMaskList" minOccurs="0"/>
 *         &lt;element name="recurrenceDow" type="{urn:types.scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventDow" minOccurs="0"/>
 *         &lt;element name="recurrenceDowim" type="{urn:types.scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventDowim" minOccurs="0"/>
 *         &lt;element name="seriesStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="noEndDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendEmail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recurrence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="allDayEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="timedEvent" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="reminderType" type="{urn:types.scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventReminderType" minOccurs="0"/>
 *         &lt;element name="reminderMinutes" type="{urn:types.scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventReminderMinutes" minOccurs="0"/>
 *         &lt;element name="status" type="{urn:types.scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventStatus" minOccurs="0"/>
 *         &lt;element name="accessLevel" type="{urn:types.scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventAccessLevel" minOccurs="0"/>
 *         &lt;element name="organizer" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="exclusionDateList" type="{urn:scheduling_2010_2.activities.webservices.netsuite.com}ExclusionDateList" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="owner" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="attendeeList" type="{urn:scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventAttendeeList" minOccurs="0"/>
 *         &lt;element name="resourceList" type="{urn:scheduling_2010_2.activities.webservices.netsuite.com}CalendarEventResourceList" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarEvent", propOrder = {
    "company",
    "contact",
    "supportCase",
    "transaction",
    "period",
    "frequency",
    "recurrenceDowMaskList",
    "recurrenceDow",
    "recurrenceDowim",
    "seriesStartDate",
    "endByDate",
    "noEndDate",
    "sendEmail",
    "customForm",
    "title",
    "recurrence",
    "location",
    "startDate",
    "allDayEvent",
    "timedEvent",
    "reminderType",
    "reminderMinutes",
    "status",
    "accessLevel",
    "organizer",
    "message",
    "createdDate",
    "endDate",
    "exclusionDateList",
    "lastModifiedDate",
    "owner",
    "attendeeList",
    "resourceList",
    "customFieldList"
})
public class CalendarEvent
    extends Record
{

    protected RecordRef company;
    protected RecordRef contact;
    protected RecordRef supportCase;
    protected RecordRef transaction;
    protected Long period;
    protected CalendarEventFrequency frequency;
    protected RecurrenceDowMaskList recurrenceDowMaskList;
    protected CalendarEventDow recurrenceDow;
    protected CalendarEventDowim recurrenceDowim;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar seriesStartDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endByDate;
    protected Boolean noEndDate;
    protected Boolean sendEmail;
    protected RecordRef customForm;
    protected String title;
    protected String recurrence;
    protected String location;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    protected Boolean allDayEvent;
    protected Boolean timedEvent;
    protected CalendarEventReminderType reminderType;
    protected String reminderMinutes;
    protected CalendarEventStatus status;
    protected CalendarEventAccessLevel accessLevel;
    protected RecordRef organizer;
    protected String message;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    protected ExclusionDateList exclusionDateList;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef owner;
    protected CalendarEventAttendeeList attendeeList;
    protected CalendarEventResourceList resourceList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCompany(RecordRef value) {
        this.company = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setContact(RecordRef value) {
        this.contact = value;
    }

    /**
     * Gets the value of the supportCase property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getSupportCase() {
        return supportCase;
    }

    /**
     * Sets the value of the supportCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setSupportCase(RecordRef value) {
        this.supportCase = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTransaction(RecordRef value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriod(Long value) {
        this.period = value;
    }

    /**
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventFrequency }
     *     
     */
    public CalendarEventFrequency getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventFrequency }
     *     
     */
    public void setFrequency(CalendarEventFrequency value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the recurrenceDowMaskList property.
     * 
     * @return
     *     possible object is
     *     {@link RecurrenceDowMaskList }
     *     
     */
    public RecurrenceDowMaskList getRecurrenceDowMaskList() {
        return recurrenceDowMaskList;
    }

    /**
     * Sets the value of the recurrenceDowMaskList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurrenceDowMaskList }
     *     
     */
    public void setRecurrenceDowMaskList(RecurrenceDowMaskList value) {
        this.recurrenceDowMaskList = value;
    }

    /**
     * Gets the value of the recurrenceDow property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventDow }
     *     
     */
    public CalendarEventDow getRecurrenceDow() {
        return recurrenceDow;
    }

    /**
     * Sets the value of the recurrenceDow property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventDow }
     *     
     */
    public void setRecurrenceDow(CalendarEventDow value) {
        this.recurrenceDow = value;
    }

    /**
     * Gets the value of the recurrenceDowim property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventDowim }
     *     
     */
    public CalendarEventDowim getRecurrenceDowim() {
        return recurrenceDowim;
    }

    /**
     * Sets the value of the recurrenceDowim property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventDowim }
     *     
     */
    public void setRecurrenceDowim(CalendarEventDowim value) {
        this.recurrenceDowim = value;
    }

    /**
     * Gets the value of the seriesStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSeriesStartDate() {
        return seriesStartDate;
    }

    /**
     * Sets the value of the seriesStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSeriesStartDate(XMLGregorianCalendar value) {
        this.seriesStartDate = value;
    }

    /**
     * Gets the value of the endByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndByDate() {
        return endByDate;
    }

    /**
     * Sets the value of the endByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndByDate(XMLGregorianCalendar value) {
        this.endByDate = value;
    }

    /**
     * Gets the value of the noEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoEndDate() {
        return noEndDate;
    }

    /**
     * Sets the value of the noEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoEndDate(Boolean value) {
        this.noEndDate = value;
    }

    /**
     * Gets the value of the sendEmail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendEmail() {
        return sendEmail;
    }

    /**
     * Sets the value of the sendEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendEmail(Boolean value) {
        this.sendEmail = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the recurrence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurrence() {
        return recurrence;
    }

    /**
     * Sets the value of the recurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurrence(String value) {
        this.recurrence = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the allDayEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllDayEvent() {
        return allDayEvent;
    }

    /**
     * Sets the value of the allDayEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllDayEvent(Boolean value) {
        this.allDayEvent = value;
    }

    /**
     * Gets the value of the timedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimedEvent() {
        return timedEvent;
    }

    /**
     * Sets the value of the timedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimedEvent(Boolean value) {
        this.timedEvent = value;
    }

    /**
     * Gets the value of the reminderType property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventReminderType }
     *     
     */
    public CalendarEventReminderType getReminderType() {
        return reminderType;
    }

    /**
     * Sets the value of the reminderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventReminderType }
     *     
     */
    public void setReminderType(CalendarEventReminderType value) {
        this.reminderType = value;
    }

    /**
     * Gets the value of the reminderMinutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReminderMinutes() {
        return reminderMinutes;
    }

    /**
     * Sets the value of the reminderMinutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReminderMinutes(String value) {
        this.reminderMinutes = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventStatus }
     *     
     */
    public CalendarEventStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventStatus }
     *     
     */
    public void setStatus(CalendarEventStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the accessLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAccessLevel }
     *     
     */
    public CalendarEventAccessLevel getAccessLevel() {
        return accessLevel;
    }

    /**
     * Sets the value of the accessLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAccessLevel }
     *     
     */
    public void setAccessLevel(CalendarEventAccessLevel value) {
        this.accessLevel = value;
    }

    /**
     * Gets the value of the organizer property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOrganizer() {
        return organizer;
    }

    /**
     * Sets the value of the organizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOrganizer(RecordRef value) {
        this.organizer = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the exclusionDateList property.
     * 
     * @return
     *     possible object is
     *     {@link ExclusionDateList }
     *     
     */
    public ExclusionDateList getExclusionDateList() {
        return exclusionDateList;
    }

    /**
     * Sets the value of the exclusionDateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExclusionDateList }
     *     
     */
    public void setExclusionDateList(ExclusionDateList value) {
        this.exclusionDateList = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setOwner(RecordRef value) {
        this.owner = value;
    }

    /**
     * Gets the value of the attendeeList property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventAttendeeList }
     *     
     */
    public CalendarEventAttendeeList getAttendeeList() {
        return attendeeList;
    }

    /**
     * Sets the value of the attendeeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventAttendeeList }
     *     
     */
    public void setAttendeeList(CalendarEventAttendeeList value) {
        this.attendeeList = value;
    }

    /**
     * Gets the value of the resourceList property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventResourceList }
     *     
     */
    public CalendarEventResourceList getResourceList() {
        return resourceList;
    }

    /**
     * Sets the value of the resourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventResourceList }
     *     
     */
    public void setResourceList(CalendarEventResourceList value) {
        this.resourceList = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
