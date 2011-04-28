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

import com.netsuite.webservices.platform.common_2010_2.AccountSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.AccountingPeriodSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.BinSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CalendarEventSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CampaignSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ClassificationSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ContactSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.DepartmentSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ExpenseCategorySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.JobSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.MessageSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.OpportunitySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.PhoneCallSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.SubsidiarySearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TaskSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransactionSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}AccountSearchBasic" minOccurs="0"/>
 *         &lt;element name="accountingPeriodJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}AccountingPeriodSearchBasic" minOccurs="0"/>
 *         &lt;element name="appliedToTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="applyingTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="billingTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="binNumberJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}BinSearchBasic" minOccurs="0"/>
 *         &lt;element name="callJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}PhoneCallSearchBasic" minOccurs="0"/>
 *         &lt;element name="classJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ClassificationSearchBasic" minOccurs="0"/>
 *         &lt;element name="cogsPurchaseJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="cogsSaleJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="contactPrimaryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ContactSearchBasic" minOccurs="0"/>
 *         &lt;element name="createdFromJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="customerMainJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="departmentJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}DepartmentSearchBasic" minOccurs="0"/>
 *         &lt;element name="depositTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="employeeJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="eventJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CalendarEventSearchBasic" minOccurs="0"/>
 *         &lt;element name="expenseCategoryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ExpenseCategorySearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="fulfillingTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="itemJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="jobMainJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}JobSearchBasic" minOccurs="0"/>
 *         &lt;element name="leadSourceJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CampaignSearchBasic" minOccurs="0"/>
 *         &lt;element name="locationJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="messagesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}MessageSearchBasic" minOccurs="0"/>
 *         &lt;element name="opportunityJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}OpportunitySearchBasic" minOccurs="0"/>
 *         &lt;element name="paidTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="payingTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="purchaseOrderJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="requestorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="revCommittingTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="rgPostingTransactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="salesRepJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="subsidiaryJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}SubsidiarySearchBasic" minOccurs="0"/>
 *         &lt;element name="taskJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TaskSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionSearch", propOrder = {
    "basic",
    "accountJoin",
    "accountingPeriodJoin",
    "appliedToTransactionJoin",
    "applyingTransactionJoin",
    "billingTransactionJoin",
    "binNumberJoin",
    "callJoin",
    "classJoin",
    "cogsPurchaseJoin",
    "cogsSaleJoin",
    "contactPrimaryJoin",
    "createdFromJoin",
    "customerJoin",
    "customerMainJoin",
    "departmentJoin",
    "depositTransactionJoin",
    "employeeJoin",
    "eventJoin",
    "expenseCategoryJoin",
    "fileJoin",
    "fulfillingTransactionJoin",
    "itemJoin",
    "jobJoin",
    "jobMainJoin",
    "leadSourceJoin",
    "locationJoin",
    "messagesJoin",
    "opportunityJoin",
    "paidTransactionJoin",
    "payingTransactionJoin",
    "purchaseOrderJoin",
    "requestorJoin",
    "revCommittingTransactionJoin",
    "rgPostingTransactionJoin",
    "salesRepJoin",
    "subsidiaryJoin",
    "taskJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin"
})
public class TransactionSearch
    extends SearchRecord
{

    protected TransactionSearchBasic basic;
    protected AccountSearchBasic accountJoin;
    protected AccountingPeriodSearchBasic accountingPeriodJoin;
    protected TransactionSearchBasic appliedToTransactionJoin;
    protected TransactionSearchBasic applyingTransactionJoin;
    protected TransactionSearchBasic billingTransactionJoin;
    protected BinSearchBasic binNumberJoin;
    protected PhoneCallSearchBasic callJoin;
    protected ClassificationSearchBasic classJoin;
    protected TransactionSearchBasic cogsPurchaseJoin;
    protected TransactionSearchBasic cogsSaleJoin;
    protected ContactSearchBasic contactPrimaryJoin;
    protected TransactionSearchBasic createdFromJoin;
    protected CustomerSearchBasic customerJoin;
    protected CustomerSearchBasic customerMainJoin;
    protected DepartmentSearchBasic departmentJoin;
    protected TransactionSearchBasic depositTransactionJoin;
    protected EmployeeSearchBasic employeeJoin;
    protected CalendarEventSearchBasic eventJoin;
    protected ExpenseCategorySearchBasic expenseCategoryJoin;
    protected FileSearchBasic fileJoin;
    protected TransactionSearchBasic fulfillingTransactionJoin;
    protected ItemSearchBasic itemJoin;
    protected JobSearchBasic jobJoin;
    protected JobSearchBasic jobMainJoin;
    protected CampaignSearchBasic leadSourceJoin;
    protected LocationSearchBasic locationJoin;
    protected MessageSearchBasic messagesJoin;
    protected OpportunitySearchBasic opportunityJoin;
    protected TransactionSearchBasic paidTransactionJoin;
    protected TransactionSearchBasic payingTransactionJoin;
    protected TransactionSearchBasic purchaseOrderJoin;
    protected EmployeeSearchBasic requestorJoin;
    protected TransactionSearchBasic revCommittingTransactionJoin;
    protected TransactionSearchBasic rgPostingTransactionJoin;
    protected EmployeeSearchBasic salesRepJoin;
    protected SubsidiarySearchBasic subsidiaryJoin;
    protected TaskSearchBasic taskJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setBasic(TransactionSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the accountJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountSearchBasic }
     *     
     */
    public AccountSearchBasic getAccountJoin() {
        return accountJoin;
    }

    /**
     * Sets the value of the accountJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountSearchBasic }
     *     
     */
    public void setAccountJoin(AccountSearchBasic value) {
        this.accountJoin = value;
    }

    /**
     * Gets the value of the accountingPeriodJoin property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public AccountingPeriodSearchBasic getAccountingPeriodJoin() {
        return accountingPeriodJoin;
    }

    /**
     * Sets the value of the accountingPeriodJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingPeriodSearchBasic }
     *     
     */
    public void setAccountingPeriodJoin(AccountingPeriodSearchBasic value) {
        this.accountingPeriodJoin = value;
    }

    /**
     * Gets the value of the appliedToTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }

    /**
     * Sets the value of the appliedToTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setAppliedToTransactionJoin(TransactionSearchBasic value) {
        this.appliedToTransactionJoin = value;
    }

    /**
     * Gets the value of the applyingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getApplyingTransactionJoin() {
        return applyingTransactionJoin;
    }

    /**
     * Sets the value of the applyingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setApplyingTransactionJoin(TransactionSearchBasic value) {
        this.applyingTransactionJoin = value;
    }

    /**
     * Gets the value of the billingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getBillingTransactionJoin() {
        return billingTransactionJoin;
    }

    /**
     * Sets the value of the billingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setBillingTransactionJoin(TransactionSearchBasic value) {
        this.billingTransactionJoin = value;
    }

    /**
     * Gets the value of the binNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BinSearchBasic }
     *     
     */
    public BinSearchBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * Sets the value of the binNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchBasic value) {
        this.binNumberJoin = value;
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
     * Gets the value of the classJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public ClassificationSearchBasic getClassJoin() {
        return classJoin;
    }

    /**
     * Sets the value of the classJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationSearchBasic }
     *     
     */
    public void setClassJoin(ClassificationSearchBasic value) {
        this.classJoin = value;
    }

    /**
     * Gets the value of the cogsPurchaseJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCogsPurchaseJoin() {
        return cogsPurchaseJoin;
    }

    /**
     * Sets the value of the cogsPurchaseJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCogsPurchaseJoin(TransactionSearchBasic value) {
        this.cogsPurchaseJoin = value;
    }

    /**
     * Gets the value of the cogsSaleJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCogsSaleJoin() {
        return cogsSaleJoin;
    }

    /**
     * Sets the value of the cogsSaleJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCogsSaleJoin(TransactionSearchBasic value) {
        this.cogsSaleJoin = value;
    }

    /**
     * Gets the value of the contactPrimaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ContactSearchBasic }
     *     
     */
    public ContactSearchBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }

    /**
     * Sets the value of the contactPrimaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactSearchBasic }
     *     
     */
    public void setContactPrimaryJoin(ContactSearchBasic value) {
        this.contactPrimaryJoin = value;
    }

    /**
     * Gets the value of the createdFromJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getCreatedFromJoin() {
        return createdFromJoin;
    }

    /**
     * Sets the value of the createdFromJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setCreatedFromJoin(TransactionSearchBasic value) {
        this.createdFromJoin = value;
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
     * Gets the value of the customerMainJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getCustomerMainJoin() {
        return customerMainJoin;
    }

    /**
     * Sets the value of the customerMainJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setCustomerMainJoin(CustomerSearchBasic value) {
        this.customerMainJoin = value;
    }

    /**
     * Gets the value of the departmentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public DepartmentSearchBasic getDepartmentJoin() {
        return departmentJoin;
    }

    /**
     * Sets the value of the departmentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartmentSearchBasic }
     *     
     */
    public void setDepartmentJoin(DepartmentSearchBasic value) {
        this.departmentJoin = value;
    }

    /**
     * Gets the value of the depositTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getDepositTransactionJoin() {
        return depositTransactionJoin;
    }

    /**
     * Sets the value of the depositTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setDepositTransactionJoin(TransactionSearchBasic value) {
        this.depositTransactionJoin = value;
    }

    /**
     * Gets the value of the employeeJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getEmployeeJoin() {
        return employeeJoin;
    }

    /**
     * Sets the value of the employeeJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setEmployeeJoin(EmployeeSearchBasic value) {
        this.employeeJoin = value;
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
     * Gets the value of the expenseCategoryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ExpenseCategorySearchBasic }
     *     
     */
    public ExpenseCategorySearchBasic getExpenseCategoryJoin() {
        return expenseCategoryJoin;
    }

    /**
     * Sets the value of the expenseCategoryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpenseCategorySearchBasic }
     *     
     */
    public void setExpenseCategoryJoin(ExpenseCategorySearchBasic value) {
        this.expenseCategoryJoin = value;
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
     * Gets the value of the fulfillingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getFulfillingTransactionJoin() {
        return fulfillingTransactionJoin;
    }

    /**
     * Sets the value of the fulfillingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setFulfillingTransactionJoin(TransactionSearchBasic value) {
        this.fulfillingTransactionJoin = value;
    }

    /**
     * Gets the value of the itemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getItemJoin() {
        return itemJoin;
    }

    /**
     * Sets the value of the itemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setItemJoin(ItemSearchBasic value) {
        this.itemJoin = value;
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
     * Gets the value of the jobMainJoin property.
     * 
     * @return
     *     possible object is
     *     {@link JobSearchBasic }
     *     
     */
    public JobSearchBasic getJobMainJoin() {
        return jobMainJoin;
    }

    /**
     * Sets the value of the jobMainJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobSearchBasic }
     *     
     */
    public void setJobMainJoin(JobSearchBasic value) {
        this.jobMainJoin = value;
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
     * Gets the value of the locationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getLocationJoin() {
        return locationJoin;
    }

    /**
     * Sets the value of the locationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setLocationJoin(LocationSearchBasic value) {
        this.locationJoin = value;
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
     * Gets the value of the paidTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPaidTransactionJoin() {
        return paidTransactionJoin;
    }

    /**
     * Sets the value of the paidTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPaidTransactionJoin(TransactionSearchBasic value) {
        this.paidTransactionJoin = value;
    }

    /**
     * Gets the value of the payingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPayingTransactionJoin() {
        return payingTransactionJoin;
    }

    /**
     * Sets the value of the payingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPayingTransactionJoin(TransactionSearchBasic value) {
        this.payingTransactionJoin = value;
    }

    /**
     * Gets the value of the purchaseOrderJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }

    /**
     * Sets the value of the purchaseOrderJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setPurchaseOrderJoin(TransactionSearchBasic value) {
        this.purchaseOrderJoin = value;
    }

    /**
     * Gets the value of the requestorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getRequestorJoin() {
        return requestorJoin;
    }

    /**
     * Sets the value of the requestorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setRequestorJoin(EmployeeSearchBasic value) {
        this.requestorJoin = value;
    }

    /**
     * Gets the value of the revCommittingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getRevCommittingTransactionJoin() {
        return revCommittingTransactionJoin;
    }

    /**
     * Sets the value of the revCommittingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setRevCommittingTransactionJoin(TransactionSearchBasic value) {
        this.revCommittingTransactionJoin = value;
    }

    /**
     * Gets the value of the rgPostingTransactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getRgPostingTransactionJoin() {
        return rgPostingTransactionJoin;
    }

    /**
     * Sets the value of the rgPostingTransactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setRgPostingTransactionJoin(TransactionSearchBasic value) {
        this.rgPostingTransactionJoin = value;
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
     * Gets the value of the subsidiaryJoin property.
     * 
     * @return
     *     possible object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public SubsidiarySearchBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }

    /**
     * Sets the value of the subsidiaryJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsidiarySearchBasic }
     *     
     */
    public void setSubsidiaryJoin(SubsidiarySearchBasic value) {
        this.subsidiaryJoin = value;
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

}
