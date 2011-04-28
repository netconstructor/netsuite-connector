/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.general.communication_2010_2;

import com.netsuite.webservices.platform.common_2010_2.CalendarEventSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.CampaignSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.EntitySearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.IssueSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.OpportunitySearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.OriginatingLeadSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.PartnerSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.PhoneCallSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.SolutionSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.SupportCaseSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoteSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoteSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="authorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PhoneCallSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="campaignJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CampaignSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="caseJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}SupportCaseSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="contactJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ContactSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="entityJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CalendarEventSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="issueJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}IssueSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}OpportunitySearchRowBasic" minOccurs="0"/>
 *         &lt;element name="originatingLeadJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}OriginatingLeadSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="partnerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PartnerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="solutionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}SolutionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TaskSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoteSearchRow", propOrder = {
    "basic",
    "authorJoin",
    "callJoin",
    "campaignJoin",
    "caseJoin",
    "contactJoin",
    "customerJoin",
    "employeeJoin",
    "entityJoin",
    "eventJoin",
    "issueJoin",
    "itemJoin",
    "opportunityJoin",
    "originatingLeadJoin",
    "partnerJoin",
    "solutionJoin",
    "taskJoin",
    "transactionJoin",
    "userJoin",
    "vendorJoin"
})
public class NoteSearchRow
    extends SearchRow
{

    protected NoteSearchRowBasic basic;
    protected EmployeeSearchRowBasic authorJoin;
    protected PhoneCallSearchRowBasic callJoin;
    protected CampaignSearchRowBasic campaignJoin;
    protected SupportCaseSearchRowBasic caseJoin;
    protected ContactSearchRowBasic contactJoin;
    protected CustomerSearchRowBasic customerJoin;
    protected EmployeeSearchRowBasic employeeJoin;
    protected EntitySearchRowBasic entityJoin;
    protected CalendarEventSearchRowBasic eventJoin;
    protected IssueSearchRowBasic issueJoin;
    protected ItemSearchRowBasic itemJoin;
    protected OpportunitySearchRowBasic opportunityJoin;
    protected OriginatingLeadSearchRowBasic originatingLeadJoin;
    protected PartnerSearchRowBasic partnerJoin;
    protected SolutionSearchRowBasic solutionJoin;
    protected TaskSearchRowBasic taskJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected VendorSearchRowBasic vendorJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setBasic(NoteSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the authorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getAuthorJoin() {
        return authorJoin;
    }

    /**
     * Sets the value of the authorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setAuthorJoin(EmployeeSearchRowBasic value) {
        this.authorJoin = value;
    }

    /**
     * Gets the value of the callJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }

    /**
     * Sets the value of the callJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneCallSearchRowBasic }
     *     
     */
    public void setCallJoin(PhoneCallSearchRowBasic value) {
        this.callJoin = value;
    }

    /**
     * Gets the value of the campaignJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public CampaignSearchRowBasic getCampaignJoin() {
        return campaignJoin;
    }

    /**
     * Sets the value of the campaignJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CampaignSearchRowBasic }
     *     
     */
    public void setCampaignJoin(CampaignSearchRowBasic value) {
        this.campaignJoin = value;
    }

    /**
     * Gets the value of the caseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }

    /**
     * Sets the value of the caseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportCaseSearchRowBasic }
     *     
     */
    public void setCaseJoin(SupportCaseSearchRowBasic value) {
        this.caseJoin = value;
    }

    /**
     * Gets the value of the contactJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public ContactSearchRowBasic getContactJoin() {
        return contactJoin;
    }

    /**
     * Sets the value of the contactJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchRowBasic }
     *     
     */
    public void setContactJoin(ContactSearchRowBasic value) {
        this.contactJoin = value;
    }

    /**
     * Gets the value of the customerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }

    /**
     * Sets the value of the customerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setCustomerJoin(CustomerSearchRowBasic value) {
        this.customerJoin = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchRowBasic value) {
        this.employeeJoin = value;
    }

    /**
     * Gets the value of the entityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getEntityJoin() {
        return entityJoin;
    }

    /**
     * Sets the value of the entityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setEntityJoin(EntitySearchRowBasic value) {
        this.entityJoin = value;
    }

    /**
     * Gets the value of the eventJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }

    /**
     * Sets the value of the eventJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarEventSearchRowBasic }
     *     
     */
    public void setEventJoin(CalendarEventSearchRowBasic value) {
        this.eventJoin = value;
    }

    /**
     * Gets the value of the issueJoin property.
     * 
     * @return
     *     possible object is
     *     {@link IssueSearchRowBasic }
     *     
     */
    public IssueSearchRowBasic getIssueJoin() {
        return issueJoin;
    }

    /**
     * Sets the value of the issueJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssueSearchRowBasic }
     *     
     */
    public void setIssueJoin(IssueSearchRowBasic value) {
        this.issueJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setItemJoin(ItemSearchRowBasic value) {
        this.itemJoin = value;
    }

    /**
     * Gets the value of the opportunityJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }

    /**
     * Sets the value of the opportunityJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpportunitySearchRowBasic }
     *     
     */
    public void setOpportunityJoin(OpportunitySearchRowBasic value) {
        this.opportunityJoin = value;
    }

    /**
     * Gets the value of the originatingLeadJoin property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return originatingLeadJoin;
    }

    /**
     * Sets the value of the originatingLeadJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingLeadSearchRowBasic }
     *     
     */
    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic value) {
        this.originatingLeadJoin = value;
    }

    /**
     * Gets the value of the partnerJoin property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public PartnerSearchRowBasic getPartnerJoin() {
        return partnerJoin;
    }

    /**
     * Sets the value of the partnerJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerSearchRowBasic }
     *     
     */
    public void setPartnerJoin(PartnerSearchRowBasic value) {
        this.partnerJoin = value;
    }

    /**
     * Gets the value of the solutionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public SolutionSearchRowBasic getSolutionJoin() {
        return solutionJoin;
    }

    /**
     * Sets the value of the solutionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SolutionSearchRowBasic }
     *     
     */
    public void setSolutionJoin(SolutionSearchRowBasic value) {
        this.solutionJoin = value;
    }

    /**
     * Gets the value of the taskJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }

    /**
     * Sets the value of the taskJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskSearchRowBasic }
     *     
     */
    public void setTaskJoin(TaskSearchRowBasic value) {
        this.taskJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
        this.vendorJoin = value;
    }

}
