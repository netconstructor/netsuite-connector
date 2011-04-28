/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.sales_2010_2;

import com.netsuite.webservices.platform.common_2010_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.OriginatingLeadSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpportunitySearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpportunitySearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="actualJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="decisionMakerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="estimateJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="leadSourceJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="orderJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}OriginatingLeadSearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="salesRepJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunitySearch", propOrder = {
    "basic",
    "actualJoin",
    "callJoin",
    "customerJoin",
    "decisionMakerJoin",
    "estimateJoin",
    "eventJoin",
    "fileJoin",
    "leadSourceJoin",
    "messagesJoin",
    "orderJoin",
    "originatingLeadJoin",
    "partnerJoin",
    "salesRepJoin",
    "taskJoin",
    "userNotesJoin"
})
public class OpportunitySearch
    extends SearchRecord
{

    protected OpportunitySearchBasic basic;
    protected TransactionSearchBasic actualJoin;
    protected PhoneCallSearchBasic callJoin;
    protected CustomerSearchBasic customerJoin;
    protected ContactSearchBasic decisionMakerJoin;
    protected TransactionSearchBasic estimateJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected FileSearchBasic fileJoin;
    protected CampaignSearchBasic leadSourceJoin;
    protected MessageSearchBasic messagesJoin;
    protected TransactionSearchBasic orderJoin;
    protected OriginatingLeadSearchBasic originatingLeadJoin;
    protected PartnerSearchBasic partnerJoin;
    protected EmployeeSearchBasic salesRepJoin;
    protected TaskSearchBasic taskJoin;
    protected NoteSearchBasic userNotesJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public OpportunitySearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public void setBasic(OpportunitySearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the actualJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getActualJoin() {
        return actualJoin;
    }

    /**
     * Sets the value of the actualJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setActualJoin(TransactionSearchBasic value) {
        this.actualJoin = value;
    }

    /**
     * Gets the value of the callJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public PhoneCallSearchBasic getCallJoin() {
        return callJoin;
    }

    /**
     * Sets the value of the callJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchBasic value) {
        this.callJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the decisionMakerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getDecisionMakerJoin() {
        return decisionMakerJoin;
    }

    /**
     * Sets the value of the decisionMakerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setDecisionMakerJoin(ContactSearchBasic value) {
        this.decisionMakerJoin = value;
    }

    /**
     * Gets the value of the estimateJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getEstimateJoin() {
        return estimateJoin;
    }

    /**
     * Sets the value of the estimateJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setEstimateJoin(TransactionSearchBasic value) {
        this.estimateJoin = value;
    }

    /**
     * Gets the value of the eventJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public CalendarEventSearchBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * Sets the value of the eventJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchBasic value) {
        this.eventJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setFileJoin(FileSearchBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the leadSourceJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }

    /**
     * Sets the value of the leadSourceJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setLeadSourceJoin(CampaignSearchBasic value) {
        this.leadSourceJoin = value;
    }

    /**
     * Gets the value of the messagesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesJoin() {
        return messagesJoin;
    }

    /**
     * Sets the value of the messagesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesJoin(MessageSearchBasic value) {
        this.messagesJoin = value;
    }

    /**
     * Gets the value of the orderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getOrderJoin() {
        return orderJoin;
    }

    /**
     * Sets the value of the orderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setOrderJoin(TransactionSearchBasic value) {
        this.orderJoin = value;
    }

    /**
     * Gets the value of the originatingLeadJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchBasic }
     *     
     */
    public OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * Sets the value of the originatingLeadJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchBasic value) {
        this.originatingLeadJoin = value;
    }

    /**
     * Gets the value of the partnerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public PartnerSearchBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * Sets the value of the partnerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchBasic value) {
        this.partnerJoin = value;
    }

    /**
     * Gets the value of the salesRepJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getSalesRepJoin() {
        return salesRepJoin;
    }

    /**
     * Sets the value of the salesRepJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setSalesRepJoin(EmployeeSearchBasic value) {
        this.salesRepJoin = value;
    }

    /**
     * Gets the value of the taskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchBasic }
     *     
     */
    public TaskSearchBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * Sets the value of the taskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchBasic }
     *     
     */
    public void setTaskJoin(TaskSearchBasic value) {
        this.taskJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchBasic }
     *     
     */
    public NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchBasic value) {
        this.userNotesJoin = value;
    }

}
