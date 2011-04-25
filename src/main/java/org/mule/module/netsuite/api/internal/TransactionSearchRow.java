/**
 * TransactionSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionSearchRow  extends org.mule.module.netsuite.api.internal.SearchRow  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic basic;

    private org.mule.module.netsuite.api.internal.AccountSearchRowBasic accountJoin;

    private org.mule.module.netsuite.api.internal.AccountingPeriodSearchRowBasic accountingPeriodJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic appliedToTransactionJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic applyingTransactionJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic billingTransactionJoin;

    private org.mule.module.netsuite.api.internal.BinSearchRowBasic binNumberJoin;

    private org.mule.module.netsuite.api.internal.PhoneCallSearchRowBasic callJoin;

    private org.mule.module.netsuite.api.internal.ClassificationSearchRowBasic classJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic cogsPurchaseJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic cogsSaleJoin;

    private org.mule.module.netsuite.api.internal.ContactSearchRowBasic contactPrimaryJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic createdFromJoin;

    private org.mule.module.netsuite.api.internal.CustomerSearchRowBasic customerJoin;

    private org.mule.module.netsuite.api.internal.CustomerSearchRowBasic customerMainJoin;

    private org.mule.module.netsuite.api.internal.DepartmentSearchRowBasic departmentJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic depositTransactionJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic employeeJoin;

    private org.mule.module.netsuite.api.internal.CalendarEventSearchRowBasic eventJoin;

    private org.mule.module.netsuite.api.internal.ExpenseCategorySearchRowBasic expenseCategoryJoin;

    private org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic fulfillingTransactionJoin;

    private org.mule.module.netsuite.api.internal.ItemSearchRowBasic itemJoin;

    private org.mule.module.netsuite.api.internal.JobSearchRowBasic jobJoin;

    private org.mule.module.netsuite.api.internal.JobSearchRowBasic jobMainJoin;

    private org.mule.module.netsuite.api.internal.CampaignSearchRowBasic leadSourceJoin;

    private org.mule.module.netsuite.api.internal.LocationSearchRowBasic locationJoin;

    private org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesJoin;

    private org.mule.module.netsuite.api.internal.OpportunitySearchRowBasic opportunityJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic paidTransactionJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic payingTransactionJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic purchaseOrderJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic requestorJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic revCommittingTransactionJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic rgPostingTransactionJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic salesRepJoin;

    private org.mule.module.netsuite.api.internal.SubsidiarySearchRowBasic subsidiaryJoin;

    private org.mule.module.netsuite.api.internal.TaskSearchRowBasic taskJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin;

    private org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin;

    private org.mule.module.netsuite.api.internal.VendorSearchRowBasic vendorJoin;

    public TransactionSearchRow() {
    }

    public TransactionSearchRow(
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic basic,
           org.mule.module.netsuite.api.internal.AccountSearchRowBasic accountJoin,
           org.mule.module.netsuite.api.internal.AccountingPeriodSearchRowBasic accountingPeriodJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic appliedToTransactionJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic applyingTransactionJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic billingTransactionJoin,
           org.mule.module.netsuite.api.internal.BinSearchRowBasic binNumberJoin,
           org.mule.module.netsuite.api.internal.PhoneCallSearchRowBasic callJoin,
           org.mule.module.netsuite.api.internal.ClassificationSearchRowBasic classJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic cogsPurchaseJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic cogsSaleJoin,
           org.mule.module.netsuite.api.internal.ContactSearchRowBasic contactPrimaryJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic createdFromJoin,
           org.mule.module.netsuite.api.internal.CustomerSearchRowBasic customerJoin,
           org.mule.module.netsuite.api.internal.CustomerSearchRowBasic customerMainJoin,
           org.mule.module.netsuite.api.internal.DepartmentSearchRowBasic departmentJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic depositTransactionJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic employeeJoin,
           org.mule.module.netsuite.api.internal.CalendarEventSearchRowBasic eventJoin,
           org.mule.module.netsuite.api.internal.ExpenseCategorySearchRowBasic expenseCategoryJoin,
           org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic fulfillingTransactionJoin,
           org.mule.module.netsuite.api.internal.ItemSearchRowBasic itemJoin,
           org.mule.module.netsuite.api.internal.JobSearchRowBasic jobJoin,
           org.mule.module.netsuite.api.internal.JobSearchRowBasic jobMainJoin,
           org.mule.module.netsuite.api.internal.CampaignSearchRowBasic leadSourceJoin,
           org.mule.module.netsuite.api.internal.LocationSearchRowBasic locationJoin,
           org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesJoin,
           org.mule.module.netsuite.api.internal.OpportunitySearchRowBasic opportunityJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic paidTransactionJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic payingTransactionJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic purchaseOrderJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic requestorJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic revCommittingTransactionJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic rgPostingTransactionJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic salesRepJoin,
           org.mule.module.netsuite.api.internal.SubsidiarySearchRowBasic subsidiaryJoin,
           org.mule.module.netsuite.api.internal.TaskSearchRowBasic taskJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin,
           org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin,
           org.mule.module.netsuite.api.internal.VendorSearchRowBasic vendorJoin) {
        this.basic = basic;
        this.accountJoin = accountJoin;
        this.accountingPeriodJoin = accountingPeriodJoin;
        this.appliedToTransactionJoin = appliedToTransactionJoin;
        this.applyingTransactionJoin = applyingTransactionJoin;
        this.billingTransactionJoin = billingTransactionJoin;
        this.binNumberJoin = binNumberJoin;
        this.callJoin = callJoin;
        this.classJoin = classJoin;
        this.cogsPurchaseJoin = cogsPurchaseJoin;
        this.cogsSaleJoin = cogsSaleJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.createdFromJoin = createdFromJoin;
        this.customerJoin = customerJoin;
        this.customerMainJoin = customerMainJoin;
        this.departmentJoin = departmentJoin;
        this.depositTransactionJoin = depositTransactionJoin;
        this.employeeJoin = employeeJoin;
        this.eventJoin = eventJoin;
        this.expenseCategoryJoin = expenseCategoryJoin;
        this.fileJoin = fileJoin;
        this.fulfillingTransactionJoin = fulfillingTransactionJoin;
        this.itemJoin = itemJoin;
        this.jobJoin = jobJoin;
        this.jobMainJoin = jobMainJoin;
        this.leadSourceJoin = leadSourceJoin;
        this.locationJoin = locationJoin;
        this.messagesJoin = messagesJoin;
        this.opportunityJoin = opportunityJoin;
        this.paidTransactionJoin = paidTransactionJoin;
        this.payingTransactionJoin = payingTransactionJoin;
        this.purchaseOrderJoin = purchaseOrderJoin;
        this.requestorJoin = requestorJoin;
        this.revCommittingTransactionJoin = revCommittingTransactionJoin;
        this.rgPostingTransactionJoin = rgPostingTransactionJoin;
        this.salesRepJoin = salesRepJoin;
        this.subsidiaryJoin = subsidiaryJoin;
        this.taskJoin = taskJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the basic value for this TransactionSearchRow.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this TransactionSearchRow.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the accountJoin value for this TransactionSearchRow.
     * 
     * @return accountJoin
     */
    public org.mule.module.netsuite.api.internal.AccountSearchRowBasic getAccountJoin() {
        return accountJoin;
    }


    /**
     * Sets the accountJoin value for this TransactionSearchRow.
     * 
     * @param accountJoin
     */
    public void setAccountJoin(org.mule.module.netsuite.api.internal.AccountSearchRowBasic accountJoin) {
        this.accountJoin = accountJoin;
    }


    /**
     * Gets the accountingPeriodJoin value for this TransactionSearchRow.
     * 
     * @return accountingPeriodJoin
     */
    public org.mule.module.netsuite.api.internal.AccountingPeriodSearchRowBasic getAccountingPeriodJoin() {
        return accountingPeriodJoin;
    }


    /**
     * Sets the accountingPeriodJoin value for this TransactionSearchRow.
     * 
     * @param accountingPeriodJoin
     */
    public void setAccountingPeriodJoin(org.mule.module.netsuite.api.internal.AccountingPeriodSearchRowBasic accountingPeriodJoin) {
        this.accountingPeriodJoin = accountingPeriodJoin;
    }


    /**
     * Gets the appliedToTransactionJoin value for this TransactionSearchRow.
     * 
     * @return appliedToTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getAppliedToTransactionJoin() {
        return appliedToTransactionJoin;
    }


    /**
     * Sets the appliedToTransactionJoin value for this TransactionSearchRow.
     * 
     * @param appliedToTransactionJoin
     */
    public void setAppliedToTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic appliedToTransactionJoin) {
        this.appliedToTransactionJoin = appliedToTransactionJoin;
    }


    /**
     * Gets the applyingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return applyingTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getApplyingTransactionJoin() {
        return applyingTransactionJoin;
    }


    /**
     * Sets the applyingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param applyingTransactionJoin
     */
    public void setApplyingTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic applyingTransactionJoin) {
        this.applyingTransactionJoin = applyingTransactionJoin;
    }


    /**
     * Gets the billingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return billingTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getBillingTransactionJoin() {
        return billingTransactionJoin;
    }


    /**
     * Sets the billingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param billingTransactionJoin
     */
    public void setBillingTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic billingTransactionJoin) {
        this.billingTransactionJoin = billingTransactionJoin;
    }


    /**
     * Gets the binNumberJoin value for this TransactionSearchRow.
     * 
     * @return binNumberJoin
     */
    public org.mule.module.netsuite.api.internal.BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }


    /**
     * Sets the binNumberJoin value for this TransactionSearchRow.
     * 
     * @param binNumberJoin
     */
    public void setBinNumberJoin(org.mule.module.netsuite.api.internal.BinSearchRowBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }


    /**
     * Gets the callJoin value for this TransactionSearchRow.
     * 
     * @return callJoin
     */
    public org.mule.module.netsuite.api.internal.PhoneCallSearchRowBasic getCallJoin() {
        return callJoin;
    }


    /**
     * Sets the callJoin value for this TransactionSearchRow.
     * 
     * @param callJoin
     */
    public void setCallJoin(org.mule.module.netsuite.api.internal.PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }


    /**
     * Gets the classJoin value for this TransactionSearchRow.
     * 
     * @return classJoin
     */
    public org.mule.module.netsuite.api.internal.ClassificationSearchRowBasic getClassJoin() {
        return classJoin;
    }


    /**
     * Sets the classJoin value for this TransactionSearchRow.
     * 
     * @param classJoin
     */
    public void setClassJoin(org.mule.module.netsuite.api.internal.ClassificationSearchRowBasic classJoin) {
        this.classJoin = classJoin;
    }


    /**
     * Gets the cogsPurchaseJoin value for this TransactionSearchRow.
     * 
     * @return cogsPurchaseJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getCogsPurchaseJoin() {
        return cogsPurchaseJoin;
    }


    /**
     * Sets the cogsPurchaseJoin value for this TransactionSearchRow.
     * 
     * @param cogsPurchaseJoin
     */
    public void setCogsPurchaseJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic cogsPurchaseJoin) {
        this.cogsPurchaseJoin = cogsPurchaseJoin;
    }


    /**
     * Gets the cogsSaleJoin value for this TransactionSearchRow.
     * 
     * @return cogsSaleJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getCogsSaleJoin() {
        return cogsSaleJoin;
    }


    /**
     * Sets the cogsSaleJoin value for this TransactionSearchRow.
     * 
     * @param cogsSaleJoin
     */
    public void setCogsSaleJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic cogsSaleJoin) {
        this.cogsSaleJoin = cogsSaleJoin;
    }


    /**
     * Gets the contactPrimaryJoin value for this TransactionSearchRow.
     * 
     * @return contactPrimaryJoin
     */
    public org.mule.module.netsuite.api.internal.ContactSearchRowBasic getContactPrimaryJoin() {
        return contactPrimaryJoin;
    }


    /**
     * Sets the contactPrimaryJoin value for this TransactionSearchRow.
     * 
     * @param contactPrimaryJoin
     */
    public void setContactPrimaryJoin(org.mule.module.netsuite.api.internal.ContactSearchRowBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }


    /**
     * Gets the createdFromJoin value for this TransactionSearchRow.
     * 
     * @return createdFromJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getCreatedFromJoin() {
        return createdFromJoin;
    }


    /**
     * Sets the createdFromJoin value for this TransactionSearchRow.
     * 
     * @param createdFromJoin
     */
    public void setCreatedFromJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic createdFromJoin) {
        this.createdFromJoin = createdFromJoin;
    }


    /**
     * Gets the customerJoin value for this TransactionSearchRow.
     * 
     * @return customerJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchRowBasic getCustomerJoin() {
        return customerJoin;
    }


    /**
     * Sets the customerJoin value for this TransactionSearchRow.
     * 
     * @param customerJoin
     */
    public void setCustomerJoin(org.mule.module.netsuite.api.internal.CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }


    /**
     * Gets the customerMainJoin value for this TransactionSearchRow.
     * 
     * @return customerMainJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchRowBasic getCustomerMainJoin() {
        return customerMainJoin;
    }


    /**
     * Sets the customerMainJoin value for this TransactionSearchRow.
     * 
     * @param customerMainJoin
     */
    public void setCustomerMainJoin(org.mule.module.netsuite.api.internal.CustomerSearchRowBasic customerMainJoin) {
        this.customerMainJoin = customerMainJoin;
    }


    /**
     * Gets the departmentJoin value for this TransactionSearchRow.
     * 
     * @return departmentJoin
     */
    public org.mule.module.netsuite.api.internal.DepartmentSearchRowBasic getDepartmentJoin() {
        return departmentJoin;
    }


    /**
     * Sets the departmentJoin value for this TransactionSearchRow.
     * 
     * @param departmentJoin
     */
    public void setDepartmentJoin(org.mule.module.netsuite.api.internal.DepartmentSearchRowBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }


    /**
     * Gets the depositTransactionJoin value for this TransactionSearchRow.
     * 
     * @return depositTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getDepositTransactionJoin() {
        return depositTransactionJoin;
    }


    /**
     * Sets the depositTransactionJoin value for this TransactionSearchRow.
     * 
     * @param depositTransactionJoin
     */
    public void setDepositTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic depositTransactionJoin) {
        this.depositTransactionJoin = depositTransactionJoin;
    }


    /**
     * Gets the employeeJoin value for this TransactionSearchRow.
     * 
     * @return employeeJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getEmployeeJoin() {
        return employeeJoin;
    }


    /**
     * Sets the employeeJoin value for this TransactionSearchRow.
     * 
     * @param employeeJoin
     */
    public void setEmployeeJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }


    /**
     * Gets the eventJoin value for this TransactionSearchRow.
     * 
     * @return eventJoin
     */
    public org.mule.module.netsuite.api.internal.CalendarEventSearchRowBasic getEventJoin() {
        return eventJoin;
    }


    /**
     * Sets the eventJoin value for this TransactionSearchRow.
     * 
     * @param eventJoin
     */
    public void setEventJoin(org.mule.module.netsuite.api.internal.CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }


    /**
     * Gets the expenseCategoryJoin value for this TransactionSearchRow.
     * 
     * @return expenseCategoryJoin
     */
    public org.mule.module.netsuite.api.internal.ExpenseCategorySearchRowBasic getExpenseCategoryJoin() {
        return expenseCategoryJoin;
    }


    /**
     * Sets the expenseCategoryJoin value for this TransactionSearchRow.
     * 
     * @param expenseCategoryJoin
     */
    public void setExpenseCategoryJoin(org.mule.module.netsuite.api.internal.ExpenseCategorySearchRowBasic expenseCategoryJoin) {
        this.expenseCategoryJoin = expenseCategoryJoin;
    }


    /**
     * Gets the fileJoin value for this TransactionSearchRow.
     * 
     * @return fileJoin
     */
    public org.mule.module.netsuite.api.internal.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this TransactionSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the fulfillingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return fulfillingTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getFulfillingTransactionJoin() {
        return fulfillingTransactionJoin;
    }


    /**
     * Sets the fulfillingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param fulfillingTransactionJoin
     */
    public void setFulfillingTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic fulfillingTransactionJoin) {
        this.fulfillingTransactionJoin = fulfillingTransactionJoin;
    }


    /**
     * Gets the itemJoin value for this TransactionSearchRow.
     * 
     * @return itemJoin
     */
    public org.mule.module.netsuite.api.internal.ItemSearchRowBasic getItemJoin() {
        return itemJoin;
    }


    /**
     * Sets the itemJoin value for this TransactionSearchRow.
     * 
     * @param itemJoin
     */
    public void setItemJoin(org.mule.module.netsuite.api.internal.ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }


    /**
     * Gets the jobJoin value for this TransactionSearchRow.
     * 
     * @return jobJoin
     */
    public org.mule.module.netsuite.api.internal.JobSearchRowBasic getJobJoin() {
        return jobJoin;
    }


    /**
     * Sets the jobJoin value for this TransactionSearchRow.
     * 
     * @param jobJoin
     */
    public void setJobJoin(org.mule.module.netsuite.api.internal.JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }


    /**
     * Gets the jobMainJoin value for this TransactionSearchRow.
     * 
     * @return jobMainJoin
     */
    public org.mule.module.netsuite.api.internal.JobSearchRowBasic getJobMainJoin() {
        return jobMainJoin;
    }


    /**
     * Sets the jobMainJoin value for this TransactionSearchRow.
     * 
     * @param jobMainJoin
     */
    public void setJobMainJoin(org.mule.module.netsuite.api.internal.JobSearchRowBasic jobMainJoin) {
        this.jobMainJoin = jobMainJoin;
    }


    /**
     * Gets the leadSourceJoin value for this TransactionSearchRow.
     * 
     * @return leadSourceJoin
     */
    public org.mule.module.netsuite.api.internal.CampaignSearchRowBasic getLeadSourceJoin() {
        return leadSourceJoin;
    }


    /**
     * Sets the leadSourceJoin value for this TransactionSearchRow.
     * 
     * @param leadSourceJoin
     */
    public void setLeadSourceJoin(org.mule.module.netsuite.api.internal.CampaignSearchRowBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
    }


    /**
     * Gets the locationJoin value for this TransactionSearchRow.
     * 
     * @return locationJoin
     */
    public org.mule.module.netsuite.api.internal.LocationSearchRowBasic getLocationJoin() {
        return locationJoin;
    }


    /**
     * Sets the locationJoin value for this TransactionSearchRow.
     * 
     * @param locationJoin
     */
    public void setLocationJoin(org.mule.module.netsuite.api.internal.LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }


    /**
     * Gets the messagesJoin value for this TransactionSearchRow.
     * 
     * @return messagesJoin
     */
    public org.mule.module.netsuite.api.internal.MessageSearchRowBasic getMessagesJoin() {
        return messagesJoin;
    }


    /**
     * Sets the messagesJoin value for this TransactionSearchRow.
     * 
     * @param messagesJoin
     */
    public void setMessagesJoin(org.mule.module.netsuite.api.internal.MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }


    /**
     * Gets the opportunityJoin value for this TransactionSearchRow.
     * 
     * @return opportunityJoin
     */
    public org.mule.module.netsuite.api.internal.OpportunitySearchRowBasic getOpportunityJoin() {
        return opportunityJoin;
    }


    /**
     * Sets the opportunityJoin value for this TransactionSearchRow.
     * 
     * @param opportunityJoin
     */
    public void setOpportunityJoin(org.mule.module.netsuite.api.internal.OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }


    /**
     * Gets the paidTransactionJoin value for this TransactionSearchRow.
     * 
     * @return paidTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getPaidTransactionJoin() {
        return paidTransactionJoin;
    }


    /**
     * Sets the paidTransactionJoin value for this TransactionSearchRow.
     * 
     * @param paidTransactionJoin
     */
    public void setPaidTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic paidTransactionJoin) {
        this.paidTransactionJoin = paidTransactionJoin;
    }


    /**
     * Gets the payingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return payingTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getPayingTransactionJoin() {
        return payingTransactionJoin;
    }


    /**
     * Sets the payingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param payingTransactionJoin
     */
    public void setPayingTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic payingTransactionJoin) {
        this.payingTransactionJoin = payingTransactionJoin;
    }


    /**
     * Gets the purchaseOrderJoin value for this TransactionSearchRow.
     * 
     * @return purchaseOrderJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getPurchaseOrderJoin() {
        return purchaseOrderJoin;
    }


    /**
     * Sets the purchaseOrderJoin value for this TransactionSearchRow.
     * 
     * @param purchaseOrderJoin
     */
    public void setPurchaseOrderJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic purchaseOrderJoin) {
        this.purchaseOrderJoin = purchaseOrderJoin;
    }


    /**
     * Gets the requestorJoin value for this TransactionSearchRow.
     * 
     * @return requestorJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getRequestorJoin() {
        return requestorJoin;
    }


    /**
     * Sets the requestorJoin value for this TransactionSearchRow.
     * 
     * @param requestorJoin
     */
    public void setRequestorJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic requestorJoin) {
        this.requestorJoin = requestorJoin;
    }


    /**
     * Gets the revCommittingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return revCommittingTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getRevCommittingTransactionJoin() {
        return revCommittingTransactionJoin;
    }


    /**
     * Sets the revCommittingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param revCommittingTransactionJoin
     */
    public void setRevCommittingTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic revCommittingTransactionJoin) {
        this.revCommittingTransactionJoin = revCommittingTransactionJoin;
    }


    /**
     * Gets the rgPostingTransactionJoin value for this TransactionSearchRow.
     * 
     * @return rgPostingTransactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getRgPostingTransactionJoin() {
        return rgPostingTransactionJoin;
    }


    /**
     * Sets the rgPostingTransactionJoin value for this TransactionSearchRow.
     * 
     * @param rgPostingTransactionJoin
     */
    public void setRgPostingTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic rgPostingTransactionJoin) {
        this.rgPostingTransactionJoin = rgPostingTransactionJoin;
    }


    /**
     * Gets the salesRepJoin value for this TransactionSearchRow.
     * 
     * @return salesRepJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getSalesRepJoin() {
        return salesRepJoin;
    }


    /**
     * Sets the salesRepJoin value for this TransactionSearchRow.
     * 
     * @param salesRepJoin
     */
    public void setSalesRepJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }


    /**
     * Gets the subsidiaryJoin value for this TransactionSearchRow.
     * 
     * @return subsidiaryJoin
     */
    public org.mule.module.netsuite.api.internal.SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return subsidiaryJoin;
    }


    /**
     * Sets the subsidiaryJoin value for this TransactionSearchRow.
     * 
     * @param subsidiaryJoin
     */
    public void setSubsidiaryJoin(org.mule.module.netsuite.api.internal.SubsidiarySearchRowBasic subsidiaryJoin) {
        this.subsidiaryJoin = subsidiaryJoin;
    }


    /**
     * Gets the taskJoin value for this TransactionSearchRow.
     * 
     * @return taskJoin
     */
    public org.mule.module.netsuite.api.internal.TaskSearchRowBasic getTaskJoin() {
        return taskJoin;
    }


    /**
     * Sets the taskJoin value for this TransactionSearchRow.
     * 
     * @param taskJoin
     */
    public void setTaskJoin(org.mule.module.netsuite.api.internal.TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }


    /**
     * Gets the userJoin value for this TransactionSearchRow.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this TransactionSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this TransactionSearchRow.
     * 
     * @return userNotesJoin
     */
    public org.mule.module.netsuite.api.internal.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this TransactionSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the vendorJoin value for this TransactionSearchRow.
     * 
     * @return vendorJoin
     */
    public org.mule.module.netsuite.api.internal.VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this TransactionSearchRow.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(org.mule.module.netsuite.api.internal.VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionSearchRow)) return false;
        TransactionSearchRow other = (TransactionSearchRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.accountJoin==null && other.getAccountJoin()==null) || 
             (this.accountJoin!=null &&
              this.accountJoin.equals(other.getAccountJoin()))) &&
            ((this.accountingPeriodJoin==null && other.getAccountingPeriodJoin()==null) || 
             (this.accountingPeriodJoin!=null &&
              this.accountingPeriodJoin.equals(other.getAccountingPeriodJoin()))) &&
            ((this.appliedToTransactionJoin==null && other.getAppliedToTransactionJoin()==null) || 
             (this.appliedToTransactionJoin!=null &&
              this.appliedToTransactionJoin.equals(other.getAppliedToTransactionJoin()))) &&
            ((this.applyingTransactionJoin==null && other.getApplyingTransactionJoin()==null) || 
             (this.applyingTransactionJoin!=null &&
              this.applyingTransactionJoin.equals(other.getApplyingTransactionJoin()))) &&
            ((this.billingTransactionJoin==null && other.getBillingTransactionJoin()==null) || 
             (this.billingTransactionJoin!=null &&
              this.billingTransactionJoin.equals(other.getBillingTransactionJoin()))) &&
            ((this.binNumberJoin==null && other.getBinNumberJoin()==null) || 
             (this.binNumberJoin!=null &&
              this.binNumberJoin.equals(other.getBinNumberJoin()))) &&
            ((this.callJoin==null && other.getCallJoin()==null) || 
             (this.callJoin!=null &&
              this.callJoin.equals(other.getCallJoin()))) &&
            ((this.classJoin==null && other.getClassJoin()==null) || 
             (this.classJoin!=null &&
              this.classJoin.equals(other.getClassJoin()))) &&
            ((this.cogsPurchaseJoin==null && other.getCogsPurchaseJoin()==null) || 
             (this.cogsPurchaseJoin!=null &&
              this.cogsPurchaseJoin.equals(other.getCogsPurchaseJoin()))) &&
            ((this.cogsSaleJoin==null && other.getCogsSaleJoin()==null) || 
             (this.cogsSaleJoin!=null &&
              this.cogsSaleJoin.equals(other.getCogsSaleJoin()))) &&
            ((this.contactPrimaryJoin==null && other.getContactPrimaryJoin()==null) || 
             (this.contactPrimaryJoin!=null &&
              this.contactPrimaryJoin.equals(other.getContactPrimaryJoin()))) &&
            ((this.createdFromJoin==null && other.getCreatedFromJoin()==null) || 
             (this.createdFromJoin!=null &&
              this.createdFromJoin.equals(other.getCreatedFromJoin()))) &&
            ((this.customerJoin==null && other.getCustomerJoin()==null) || 
             (this.customerJoin!=null &&
              this.customerJoin.equals(other.getCustomerJoin()))) &&
            ((this.customerMainJoin==null && other.getCustomerMainJoin()==null) || 
             (this.customerMainJoin!=null &&
              this.customerMainJoin.equals(other.getCustomerMainJoin()))) &&
            ((this.departmentJoin==null && other.getDepartmentJoin()==null) || 
             (this.departmentJoin!=null &&
              this.departmentJoin.equals(other.getDepartmentJoin()))) &&
            ((this.depositTransactionJoin==null && other.getDepositTransactionJoin()==null) || 
             (this.depositTransactionJoin!=null &&
              this.depositTransactionJoin.equals(other.getDepositTransactionJoin()))) &&
            ((this.employeeJoin==null && other.getEmployeeJoin()==null) || 
             (this.employeeJoin!=null &&
              this.employeeJoin.equals(other.getEmployeeJoin()))) &&
            ((this.eventJoin==null && other.getEventJoin()==null) || 
             (this.eventJoin!=null &&
              this.eventJoin.equals(other.getEventJoin()))) &&
            ((this.expenseCategoryJoin==null && other.getExpenseCategoryJoin()==null) || 
             (this.expenseCategoryJoin!=null &&
              this.expenseCategoryJoin.equals(other.getExpenseCategoryJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.fulfillingTransactionJoin==null && other.getFulfillingTransactionJoin()==null) || 
             (this.fulfillingTransactionJoin!=null &&
              this.fulfillingTransactionJoin.equals(other.getFulfillingTransactionJoin()))) &&
            ((this.itemJoin==null && other.getItemJoin()==null) || 
             (this.itemJoin!=null &&
              this.itemJoin.equals(other.getItemJoin()))) &&
            ((this.jobJoin==null && other.getJobJoin()==null) || 
             (this.jobJoin!=null &&
              this.jobJoin.equals(other.getJobJoin()))) &&
            ((this.jobMainJoin==null && other.getJobMainJoin()==null) || 
             (this.jobMainJoin!=null &&
              this.jobMainJoin.equals(other.getJobMainJoin()))) &&
            ((this.leadSourceJoin==null && other.getLeadSourceJoin()==null) || 
             (this.leadSourceJoin!=null &&
              this.leadSourceJoin.equals(other.getLeadSourceJoin()))) &&
            ((this.locationJoin==null && other.getLocationJoin()==null) || 
             (this.locationJoin!=null &&
              this.locationJoin.equals(other.getLocationJoin()))) &&
            ((this.messagesJoin==null && other.getMessagesJoin()==null) || 
             (this.messagesJoin!=null &&
              this.messagesJoin.equals(other.getMessagesJoin()))) &&
            ((this.opportunityJoin==null && other.getOpportunityJoin()==null) || 
             (this.opportunityJoin!=null &&
              this.opportunityJoin.equals(other.getOpportunityJoin()))) &&
            ((this.paidTransactionJoin==null && other.getPaidTransactionJoin()==null) || 
             (this.paidTransactionJoin!=null &&
              this.paidTransactionJoin.equals(other.getPaidTransactionJoin()))) &&
            ((this.payingTransactionJoin==null && other.getPayingTransactionJoin()==null) || 
             (this.payingTransactionJoin!=null &&
              this.payingTransactionJoin.equals(other.getPayingTransactionJoin()))) &&
            ((this.purchaseOrderJoin==null && other.getPurchaseOrderJoin()==null) || 
             (this.purchaseOrderJoin!=null &&
              this.purchaseOrderJoin.equals(other.getPurchaseOrderJoin()))) &&
            ((this.requestorJoin==null && other.getRequestorJoin()==null) || 
             (this.requestorJoin!=null &&
              this.requestorJoin.equals(other.getRequestorJoin()))) &&
            ((this.revCommittingTransactionJoin==null && other.getRevCommittingTransactionJoin()==null) || 
             (this.revCommittingTransactionJoin!=null &&
              this.revCommittingTransactionJoin.equals(other.getRevCommittingTransactionJoin()))) &&
            ((this.rgPostingTransactionJoin==null && other.getRgPostingTransactionJoin()==null) || 
             (this.rgPostingTransactionJoin!=null &&
              this.rgPostingTransactionJoin.equals(other.getRgPostingTransactionJoin()))) &&
            ((this.salesRepJoin==null && other.getSalesRepJoin()==null) || 
             (this.salesRepJoin!=null &&
              this.salesRepJoin.equals(other.getSalesRepJoin()))) &&
            ((this.subsidiaryJoin==null && other.getSubsidiaryJoin()==null) || 
             (this.subsidiaryJoin!=null &&
              this.subsidiaryJoin.equals(other.getSubsidiaryJoin()))) &&
            ((this.taskJoin==null && other.getTaskJoin()==null) || 
             (this.taskJoin!=null &&
              this.taskJoin.equals(other.getTaskJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin())));
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
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getAccountJoin() != null) {
            _hashCode += getAccountJoin().hashCode();
        }
        if (getAccountingPeriodJoin() != null) {
            _hashCode += getAccountingPeriodJoin().hashCode();
        }
        if (getAppliedToTransactionJoin() != null) {
            _hashCode += getAppliedToTransactionJoin().hashCode();
        }
        if (getApplyingTransactionJoin() != null) {
            _hashCode += getApplyingTransactionJoin().hashCode();
        }
        if (getBillingTransactionJoin() != null) {
            _hashCode += getBillingTransactionJoin().hashCode();
        }
        if (getBinNumberJoin() != null) {
            _hashCode += getBinNumberJoin().hashCode();
        }
        if (getCallJoin() != null) {
            _hashCode += getCallJoin().hashCode();
        }
        if (getClassJoin() != null) {
            _hashCode += getClassJoin().hashCode();
        }
        if (getCogsPurchaseJoin() != null) {
            _hashCode += getCogsPurchaseJoin().hashCode();
        }
        if (getCogsSaleJoin() != null) {
            _hashCode += getCogsSaleJoin().hashCode();
        }
        if (getContactPrimaryJoin() != null) {
            _hashCode += getContactPrimaryJoin().hashCode();
        }
        if (getCreatedFromJoin() != null) {
            _hashCode += getCreatedFromJoin().hashCode();
        }
        if (getCustomerJoin() != null) {
            _hashCode += getCustomerJoin().hashCode();
        }
        if (getCustomerMainJoin() != null) {
            _hashCode += getCustomerMainJoin().hashCode();
        }
        if (getDepartmentJoin() != null) {
            _hashCode += getDepartmentJoin().hashCode();
        }
        if (getDepositTransactionJoin() != null) {
            _hashCode += getDepositTransactionJoin().hashCode();
        }
        if (getEmployeeJoin() != null) {
            _hashCode += getEmployeeJoin().hashCode();
        }
        if (getEventJoin() != null) {
            _hashCode += getEventJoin().hashCode();
        }
        if (getExpenseCategoryJoin() != null) {
            _hashCode += getExpenseCategoryJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getFulfillingTransactionJoin() != null) {
            _hashCode += getFulfillingTransactionJoin().hashCode();
        }
        if (getItemJoin() != null) {
            _hashCode += getItemJoin().hashCode();
        }
        if (getJobJoin() != null) {
            _hashCode += getJobJoin().hashCode();
        }
        if (getJobMainJoin() != null) {
            _hashCode += getJobMainJoin().hashCode();
        }
        if (getLeadSourceJoin() != null) {
            _hashCode += getLeadSourceJoin().hashCode();
        }
        if (getLocationJoin() != null) {
            _hashCode += getLocationJoin().hashCode();
        }
        if (getMessagesJoin() != null) {
            _hashCode += getMessagesJoin().hashCode();
        }
        if (getOpportunityJoin() != null) {
            _hashCode += getOpportunityJoin().hashCode();
        }
        if (getPaidTransactionJoin() != null) {
            _hashCode += getPaidTransactionJoin().hashCode();
        }
        if (getPayingTransactionJoin() != null) {
            _hashCode += getPayingTransactionJoin().hashCode();
        }
        if (getPurchaseOrderJoin() != null) {
            _hashCode += getPurchaseOrderJoin().hashCode();
        }
        if (getRequestorJoin() != null) {
            _hashCode += getRequestorJoin().hashCode();
        }
        if (getRevCommittingTransactionJoin() != null) {
            _hashCode += getRevCommittingTransactionJoin().hashCode();
        }
        if (getRgPostingTransactionJoin() != null) {
            _hashCode += getRgPostingTransactionJoin().hashCode();
        }
        if (getSalesRepJoin() != null) {
            _hashCode += getSalesRepJoin().hashCode();
        }
        if (getSubsidiaryJoin() != null) {
            _hashCode += getSubsidiaryJoin().hashCode();
        }
        if (getTaskJoin() != null) {
            _hashCode += getTaskJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransactionSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "TransactionSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "accountJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingPeriodJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "accountingPeriodJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appliedToTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "appliedToTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applyingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "applyingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "billingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ClassificationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogsPurchaseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "cogsPurchaseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cogsSaleJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "cogsSaleJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFromJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "createdFromJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerMainJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "customerMainJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "DepartmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("depositTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "depositTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseCategoryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "expenseCategoryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ExpenseCategorySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fulfillingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "fulfillingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobMainJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "jobMainJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paidTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "paidTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("payingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "payingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "purchaseOrderJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "requestorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revCommittingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "revCommittingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rgPostingTransactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "rgPostingTransactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "subsidiaryJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
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
