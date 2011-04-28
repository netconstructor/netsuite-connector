/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.core_2010_2;

import com.netsuite.webservices.activities.scheduling_2010_2.CalendarEvent;
import com.netsuite.webservices.activities.scheduling_2010_2.PhoneCall;
import com.netsuite.webservices.activities.scheduling_2010_2.ProjectTask;
import com.netsuite.webservices.activities.scheduling_2010_2.Task;
import com.netsuite.webservices.documents.filecabinet_2010_2.File;
import com.netsuite.webservices.documents.filecabinet_2010_2.Folder;
import com.netsuite.webservices.general.communication_2010_2.Message;
import com.netsuite.webservices.general.communication_2010_2.Note;
import com.netsuite.webservices.lists.accounting_2010_2.Account;
import com.netsuite.webservices.lists.accounting_2010_2.AccountingPeriod;
import com.netsuite.webservices.lists.accounting_2010_2.AssemblyItem;
import com.netsuite.webservices.lists.accounting_2010_2.Bin;
import com.netsuite.webservices.lists.accounting_2010_2.BudgetCategory;
import com.netsuite.webservices.lists.accounting_2010_2.Classification;
import com.netsuite.webservices.lists.accounting_2010_2.ContactCategory;
import com.netsuite.webservices.lists.accounting_2010_2.ContactRole;
import com.netsuite.webservices.lists.accounting_2010_2.Currency;
import com.netsuite.webservices.lists.accounting_2010_2.CustomerCategory;
import com.netsuite.webservices.lists.accounting_2010_2.Department;
import com.netsuite.webservices.lists.accounting_2010_2.DescriptionItem;
import com.netsuite.webservices.lists.accounting_2010_2.DiscountItem;
import com.netsuite.webservices.lists.accounting_2010_2.DownloadItem;
import com.netsuite.webservices.lists.accounting_2010_2.ExpenseCategory;
import com.netsuite.webservices.lists.accounting_2010_2.GiftCertificate;
import com.netsuite.webservices.lists.accounting_2010_2.GiftCertificateItem;
import com.netsuite.webservices.lists.accounting_2010_2.InventoryItem;
import com.netsuite.webservices.lists.accounting_2010_2.KitItem;
import com.netsuite.webservices.lists.accounting_2010_2.LeadSource;
import com.netsuite.webservices.lists.accounting_2010_2.Location;
import com.netsuite.webservices.lists.accounting_2010_2.LotNumberedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2010_2.LotNumberedInventoryItem;
import com.netsuite.webservices.lists.accounting_2010_2.MarkupItem;
import com.netsuite.webservices.lists.accounting_2010_2.NonInventoryPurchaseItem;
import com.netsuite.webservices.lists.accounting_2010_2.NonInventoryResaleItem;
import com.netsuite.webservices.lists.accounting_2010_2.NonInventorySaleItem;
import com.netsuite.webservices.lists.accounting_2010_2.NoteType;
import com.netsuite.webservices.lists.accounting_2010_2.OtherChargePurchaseItem;
import com.netsuite.webservices.lists.accounting_2010_2.OtherChargeResaleItem;
import com.netsuite.webservices.lists.accounting_2010_2.OtherChargeSaleItem;
import com.netsuite.webservices.lists.accounting_2010_2.PartnerCategory;
import com.netsuite.webservices.lists.accounting_2010_2.PaymentItem;
import com.netsuite.webservices.lists.accounting_2010_2.PaymentMethod;
import com.netsuite.webservices.lists.accounting_2010_2.PriceLevel;
import com.netsuite.webservices.lists.accounting_2010_2.SalesRole;
import com.netsuite.webservices.lists.accounting_2010_2.SalesTaxItem;
import com.netsuite.webservices.lists.accounting_2010_2.SerializedAssemblyItem;
import com.netsuite.webservices.lists.accounting_2010_2.SerializedInventoryItem;
import com.netsuite.webservices.lists.accounting_2010_2.ServicePurchaseItem;
import com.netsuite.webservices.lists.accounting_2010_2.ServiceResaleItem;
import com.netsuite.webservices.lists.accounting_2010_2.ServiceSaleItem;
import com.netsuite.webservices.lists.accounting_2010_2.State;
import com.netsuite.webservices.lists.accounting_2010_2.Subsidiary;
import com.netsuite.webservices.lists.accounting_2010_2.SubtotalItem;
import com.netsuite.webservices.lists.accounting_2010_2.TaxGroup;
import com.netsuite.webservices.lists.accounting_2010_2.TaxType;
import com.netsuite.webservices.lists.accounting_2010_2.Term;
import com.netsuite.webservices.lists.accounting_2010_2.UnitsType;
import com.netsuite.webservices.lists.accounting_2010_2.VendorCategory;
import com.netsuite.webservices.lists.accounting_2010_2.WinLossReason;
import com.netsuite.webservices.lists.employees_2010_2.Employee;
import com.netsuite.webservices.lists.marketing_2010_2.Campaign;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignAudience;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignCategory;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignChannel;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignFamily;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignOffer;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignResponse;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignSearchEngine;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignSubscription;
import com.netsuite.webservices.lists.marketing_2010_2.CampaignVertical;
import com.netsuite.webservices.lists.marketing_2010_2.PromotionCode;
import com.netsuite.webservices.lists.support_2010_2.Issue;
import com.netsuite.webservices.lists.support_2010_2.Solution;
import com.netsuite.webservices.lists.support_2010_2.SupportCase;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseIssue;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseOrigin;
import com.netsuite.webservices.lists.support_2010_2.SupportCasePriority;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseStatus;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseType;
import com.netsuite.webservices.lists.support_2010_2.Topic;
import com.netsuite.webservices.setup.customization_2010_2.CrmCustomField;
import com.netsuite.webservices.setup.customization_2010_2.CustomList;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecord;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecordCustomField;
import com.netsuite.webservices.setup.customization_2010_2.CustomRecordType;
import com.netsuite.webservices.setup.customization_2010_2.EntityCustomField;
import com.netsuite.webservices.setup.customization_2010_2.ItemCustomField;
import com.netsuite.webservices.setup.customization_2010_2.ItemNumberCustomField;
import com.netsuite.webservices.setup.customization_2010_2.ItemOptionCustomField;
import com.netsuite.webservices.setup.customization_2010_2.OtherCustomField;
import com.netsuite.webservices.setup.customization_2010_2.TransactionBodyCustomField;
import com.netsuite.webservices.setup.customization_2010_2.TransactionColumnCustomField;
import com.netsuite.webservices.transactions.bank_2010_2.Check;
import com.netsuite.webservices.transactions.customers_2010_2.CashRefund;
import com.netsuite.webservices.transactions.customers_2010_2.CreditMemo;
import com.netsuite.webservices.transactions.customers_2010_2.CustomerDeposit;
import com.netsuite.webservices.transactions.customers_2010_2.CustomerPayment;
import com.netsuite.webservices.transactions.customers_2010_2.CustomerRefund;
import com.netsuite.webservices.transactions.customers_2010_2.DepositApplication;
import com.netsuite.webservices.transactions.customers_2010_2.ReturnAuthorization;
import com.netsuite.webservices.transactions.employees_2010_2.ExpenseReport;
import com.netsuite.webservices.transactions.employees_2010_2.TimeBill;
import com.netsuite.webservices.transactions.financial_2010_2.Budget;
import com.netsuite.webservices.transactions.general_2010_2.InterCompanyJournalEntry;
import com.netsuite.webservices.transactions.general_2010_2.JournalEntry;
import com.netsuite.webservices.transactions.inventory_2010_2.AssemblyBuild;
import com.netsuite.webservices.transactions.inventory_2010_2.AssemblyUnbuild;
import com.netsuite.webservices.transactions.inventory_2010_2.InterCompanyTransferOrder;
import com.netsuite.webservices.transactions.inventory_2010_2.InventoryAdjustment;
import com.netsuite.webservices.transactions.inventory_2010_2.TransferOrder;
import com.netsuite.webservices.transactions.purchases_2010_2.ItemReceipt;
import com.netsuite.webservices.transactions.purchases_2010_2.PurchaseOrder;
import com.netsuite.webservices.transactions.purchases_2010_2.VendorBill;
import com.netsuite.webservices.transactions.purchases_2010_2.VendorPayment;
import com.netsuite.webservices.transactions.sales_2010_2.CashSale;
import com.netsuite.webservices.transactions.sales_2010_2.Estimate;
import com.netsuite.webservices.transactions.sales_2010_2.Invoice;
import com.netsuite.webservices.transactions.sales_2010_2.ItemFulfillment;
import com.netsuite.webservices.transactions.sales_2010_2.Opportunity;
import com.netsuite.webservices.transactions.sales_2010_2.SalesOrder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Record complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Record">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nullFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}NullField" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Record", propOrder = {
    "nullFieldList"
})
@XmlSeeAlso({
    AssemblyUnbuild.class,
    TransferOrder.class,
    InventoryAdjustment.class,
    AssemblyBuild.class,
    InterCompanyTransferOrder.class,
    Check.class,
    SupportCaseIssue.class,
    SupportCasePriority.class,
    SupportCase.class,
    SupportCaseOrigin.class,
    Issue.class,
    SupportCaseType.class,
    Topic.class,
    Solution.class,
    SupportCaseStatus.class,
    InterCompanyJournalEntry.class,
    JournalEntry.class,
    CampaignResponse.class,
    PromotionCode.class,
    CampaignChannel.class,
    CampaignOffer.class,
    CampaignVertical.class,
    CampaignCategory.class,
    Campaign.class,
    CampaignSearchEngine.class,
    CampaignAudience.class,
    CampaignFamily.class,
    CampaignSubscription.class,
    Folder.class,
    File.class,
    CreditMemo.class,
    ReturnAuthorization.class,
    DepositApplication.class,
    CustomerDeposit.class,
    CashRefund.class,
    CustomerPayment.class,
    CustomerRefund.class,
    NonInventoryPurchaseItem.class,
    AccountingPeriod.class,
    Subsidiary.class,
    SalesRole.class,
    GiftCertificateItem.class,
    PaymentItem.class,
    ServiceResaleItem.class,
    LeadSource.class,
    NoteType.class,
    ServicePurchaseItem.class,
    OtherChargeResaleItem.class,
    Classification.class,
    PartnerCategory.class,
    ServiceSaleItem.class,
    Currency.class,
    NonInventorySaleItem.class,
    ContactRole.class,
    DiscountItem.class,
    GiftCertificate.class,
    PaymentMethod.class,
    LotNumberedAssemblyItem.class,
    SerializedInventoryItem.class,
    AssemblyItem.class,
    PriceLevel.class,
    Term.class,
    Bin.class,
    TaxGroup.class,
    LotNumberedInventoryItem.class,
    TaxType.class,
    SerializedAssemblyItem.class,
    DownloadItem.class,
    CustomerCategory.class,
    InventoryItem.class,
    ContactCategory.class,
    State.class,
    Account.class,
    VendorCategory.class,
    KitItem.class,
    SalesTaxItem.class,
    BudgetCategory.class,
    OtherChargeSaleItem.class,
    Department.class,
    WinLossReason.class,
    NonInventoryResaleItem.class,
    DescriptionItem.class,
    Location.class,
    MarkupItem.class,
    ExpenseCategory.class,
    UnitsType.class,
    OtherChargePurchaseItem.class,
    SubtotalItem.class,
    VendorBill.class,
    ItemReceipt.class,
    VendorPayment.class,
    PurchaseOrder.class,
    ExpenseReport.class,
    TimeBill.class,
    Employee.class,
    Message.class,
    Note.class,
    Estimate.class,
    ItemFulfillment.class,
    SalesOrder.class,
    Opportunity.class,
    CashSale.class,
    Invoice.class,
    ProjectTask.class,
    Task.class,
    PhoneCall.class,
    CalendarEvent.class,
    Budget.class,
    TransactionColumnCustomField.class,
    EntityCustomField.class,
    CustomRecordType.class,
    CrmCustomField.class,
    ItemCustomField.class,
    TransactionBodyCustomField.class,
    CustomRecord.class,
    CustomRecordCustomField.class,
    CustomList.class,
    ItemOptionCustomField.class,
    ItemNumberCustomField.class,
    OtherCustomField.class
})
public abstract class Record {

    protected NullField nullFieldList;

    /**
     * Gets the value of the nullFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link NullField }
     *     
     */
    public NullField getNullFieldList() {
        return nullFieldList;
    }

    /**
     * Sets the value of the nullFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullField }
     *     
     */
    public void setNullFieldList(NullField value) {
        this.nullFieldList = value;
    }

}
