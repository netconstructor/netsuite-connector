/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.relationships_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2010_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PartnerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SupportCaseSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;


/**
 * <p>Java class for ContactSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="campaignResponseJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}SupportCaseSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerPrimaryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobPrimaryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesFromJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesToJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="partnerPrimaryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PartnerSearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorPrimaryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactSearch", propOrder = {
    "basic",
    "callJoin",
    "campaignResponseJoin",
    "caseJoin",
    "customerJoin",
    "customerPrimaryJoin",
    "eventJoin",
    "fileJoin",
    "jobJoin",
    "jobPrimaryJoin",
    "messagesJoin",
    "messagesFromJoin",
    "messagesToJoin",
    "opportunityJoin",
    "partnerJoin",
    "partnerPrimaryJoin",
    "taskJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin",
    "vendorPrimaryJoin"
})
public class ContactSearch
    extends SearchRecord
{

    protected ContactSearchBasic basic;
    protected PhoneCallSearchBasic callJoin;
    protected CampaignSearchBasic campaignResponseJoin;
    protected SupportCaseSearchBasic caseJoin;
    protected CustomerSearchBasic customerJoin;
    protected CustomerSearchBasic customerPrimaryJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected FileSearchBasic fileJoin;
    protected JobSearchBasic jobJoin;
    protected JobSearchBasic jobPrimaryJoin;
    protected MessageSearchBasic messagesJoin;
    protected MessageSearchBasic messagesFromJoin;
    protected MessageSearchBasic messagesToJoin;
    protected OpportunitySearchBasic opportunityJoin;
    protected PartnerSearchBasic partnerJoin;
    protected PartnerSearchBasic partnerPrimaryJoin;
    protected TaskSearchBasic taskJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;
    protected VendorSearchBasic vendorPrimaryJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setBasic(ContactSearchBasic value) {
        this.basic = value;
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
     * Gets the value of the campaignResponseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public CampaignSearchBasic getCampaignResponseJoin() {
        return campaignResponseJoin;
    }

    /**
     * Sets the value of the campaignResponseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchBasic }
     *     
     */
    public void setCampaignResponseJoin(CampaignSearchBasic value) {
        this.campaignResponseJoin = value;
    }

    /**
     * Gets the value of the caseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public SupportCaseSearchBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * Sets the value of the caseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchBasic value) {
        this.caseJoin = value;
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
     * Gets the value of the customerPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerPrimaryJoin() {
        return customerPrimaryJoin;
    }

    /**
     * Sets the value of the customerPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerPrimaryJoin(CustomerSearchBasic value) {
        this.customerPrimaryJoin = value;
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
     * Gets the value of the jobJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobJoin() {
        return jobJoin;
    }

    /**
     * Sets the value of the jobJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobJoin(JobSearchBasic value) {
        this.jobJoin = value;
    }

    /**
     * Gets the value of the jobPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobPrimaryJoin() {
        return jobPrimaryJoin;
    }

    /**
     * Sets the value of the jobPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobPrimaryJoin(JobSearchBasic value) {
        this.jobPrimaryJoin = value;
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
     * Gets the value of the messagesFromJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesFromJoin() {
        return messagesFromJoin;
    }

    /**
     * Sets the value of the messagesFromJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesFromJoin(MessageSearchBasic value) {
        this.messagesFromJoin = value;
    }

    /**
     * Gets the value of the messagesToJoin property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSearchBasic }
     *     
     */
    public MessageSearchBasic getMessagesToJoin() {
        return messagesToJoin;
    }

    /**
     * Sets the value of the messagesToJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSearchBasic }
     *     
     */
    public void setMessagesToJoin(MessageSearchBasic value) {
        this.messagesToJoin = value;
    }

    /**
     * Gets the value of the opportunityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public OpportunitySearchBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * Sets the value of the opportunityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchBasic value) {
        this.opportunityJoin = value;
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
     * Gets the value of the partnerPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public PartnerSearchBasic getPartnerPrimaryJoin() {
        return partnerPrimaryJoin;
    }

    /**
     * Sets the value of the partnerPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchBasic }
     *     
     */
    public void setPartnerPrimaryJoin(PartnerSearchBasic value) {
        this.partnerPrimaryJoin = value;
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
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
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

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorJoin(VendorSearchBasic value) {
        this.vendorJoin = value;
    }

    /**
     * Gets the value of the vendorPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorPrimaryJoin() {
        return vendorPrimaryJoin;
    }

    /**
     * Sets the value of the vendorPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorPrimaryJoin(VendorSearchBasic value) {
        this.vendorPrimaryJoin = value;
    }

}
