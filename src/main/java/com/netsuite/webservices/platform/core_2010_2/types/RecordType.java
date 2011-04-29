/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.core_2010_2.types;

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
import com.netsuite.webservices.lists.relationships_2010_2.Contact;
import com.netsuite.webservices.lists.relationships_2010_2.Customer;
import com.netsuite.webservices.lists.relationships_2010_2.CustomerStatus;
import com.netsuite.webservices.lists.relationships_2010_2.EntityGroup;
import com.netsuite.webservices.lists.relationships_2010_2.Job;
import com.netsuite.webservices.lists.relationships_2010_2.JobStatus;
import com.netsuite.webservices.lists.relationships_2010_2.JobType;
import com.netsuite.webservices.lists.relationships_2010_2.Partner;
import com.netsuite.webservices.lists.relationships_2010_2.Vendor;
import com.netsuite.webservices.lists.support_2010_2.Issue;
import com.netsuite.webservices.lists.support_2010_2.Solution;
import com.netsuite.webservices.lists.support_2010_2.SupportCase;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseIssue;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseOrigin;
import com.netsuite.webservices.lists.support_2010_2.SupportCasePriority;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseStatus;
import com.netsuite.webservices.lists.support_2010_2.SupportCaseType;
import com.netsuite.webservices.lists.support_2010_2.Topic;
import com.netsuite.webservices.lists.website_2010_2.SiteCategory;
import com.netsuite.webservices.platform.core_2010_2.Record;
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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="account"/>
 *     &lt;enumeration value="accountingPeriod"/>
 *     &lt;enumeration value="assemblyBuild"/>
 *     &lt;enumeration value="assemblyUnbuild"/>
 *     &lt;enumeration value="assemblyItem"/>
 *     &lt;enumeration value="bin"/>
 *     &lt;enumeration value="budget"/>
 *     &lt;enumeration value="budgetCategory"/>
 *     &lt;enumeration value="calendarEvent"/>
 *     &lt;enumeration value="campaign"/>
 *     &lt;enumeration value="campaignAudience"/>
 *     &lt;enumeration value="campaignCategory"/>
 *     &lt;enumeration value="campaignChannel"/>
 *     &lt;enumeration value="campaignFamily"/>
 *     &lt;enumeration value="campaignOffer"/>
 *     &lt;enumeration value="campaignResponse"/>
 *     &lt;enumeration value="campaignSearchEngine"/>
 *     &lt;enumeration value="campaignSubscription"/>
 *     &lt;enumeration value="campaignVertical"/>
 *     &lt;enumeration value="cashRefund"/>
 *     &lt;enumeration value="cashSale"/>
 *     &lt;enumeration value="check"/>
 *     &lt;enumeration value="classification"/>
 *     &lt;enumeration value="contact"/>
 *     &lt;enumeration value="contactCategory"/>
 *     &lt;enumeration value="contactRole"/>
 *     &lt;enumeration value="creditMemo"/>
 *     &lt;enumeration value="crmCustomField"/>
 *     &lt;enumeration value="currency"/>
 *     &lt;enumeration value="customList"/>
 *     &lt;enumeration value="customRecord"/>
 *     &lt;enumeration value="customRecordCustomField"/>
 *     &lt;enumeration value="customRecordType"/>
 *     &lt;enumeration value="customer"/>
 *     &lt;enumeration value="customerCategory"/>
 *     &lt;enumeration value="customerDeposit"/>
 *     &lt;enumeration value="customerPayment"/>
 *     &lt;enumeration value="customerRefund"/>
 *     &lt;enumeration value="customerStatus"/>
 *     &lt;enumeration value="depositApplication"/>
 *     &lt;enumeration value="department"/>
 *     &lt;enumeration value="descriptionItem"/>
 *     &lt;enumeration value="discountItem"/>
 *     &lt;enumeration value="downloadItem"/>
 *     &lt;enumeration value="employee"/>
 *     &lt;enumeration value="entityCustomField"/>
 *     &lt;enumeration value="entityGroup"/>
 *     &lt;enumeration value="estimate"/>
 *     &lt;enumeration value="expenseCategory"/>
 *     &lt;enumeration value="expenseReport"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="folder"/>
 *     &lt;enumeration value="giftCertificate"/>
 *     &lt;enumeration value="giftCertificateItem"/>
 *     &lt;enumeration value="interCompanyJournalEntry"/>
 *     &lt;enumeration value="interCompanyTransferOrder"/>
 *     &lt;enumeration value="inventoryAdjustment"/>
 *     &lt;enumeration value="inventoryItem"/>
 *     &lt;enumeration value="invoice"/>
 *     &lt;enumeration value="itemCustomField"/>
 *     &lt;enumeration value="itemFulfillment"/>
 *     &lt;enumeration value="itemNumberCustomField"/>
 *     &lt;enumeration value="itemOptionCustomField"/>
 *     &lt;enumeration value="issue"/>
 *     &lt;enumeration value="job"/>
 *     &lt;enumeration value="jobStatus"/>
 *     &lt;enumeration value="jobType"/>
 *     &lt;enumeration value="itemReceipt"/>
 *     &lt;enumeration value="journalEntry"/>
 *     &lt;enumeration value="kitItem"/>
 *     &lt;enumeration value="leadSource"/>
 *     &lt;enumeration value="location"/>
 *     &lt;enumeration value="lotNumberedInventoryItem"/>
 *     &lt;enumeration value="lotNumberedAssemblyItem"/>
 *     &lt;enumeration value="markupItem"/>
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="nonInventoryPurchaseItem"/>
 *     &lt;enumeration value="nonInventoryResaleItem"/>
 *     &lt;enumeration value="nonInventorySaleItem"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="noteType"/>
 *     &lt;enumeration value="opportunity"/>
 *     &lt;enumeration value="otherChargePurchaseItem"/>
 *     &lt;enumeration value="otherChargeResaleItem"/>
 *     &lt;enumeration value="otherChargeSaleItem"/>
 *     &lt;enumeration value="otherCustomField"/>
 *     &lt;enumeration value="partner"/>
 *     &lt;enumeration value="partnerCategory"/>
 *     &lt;enumeration value="paymentItem"/>
 *     &lt;enumeration value="paymentMethod"/>
 *     &lt;enumeration value="phoneCall"/>
 *     &lt;enumeration value="priceLevel"/>
 *     &lt;enumeration value="projectTask"/>
 *     &lt;enumeration value="promotionCode"/>
 *     &lt;enumeration value="purchaseOrder"/>
 *     &lt;enumeration value="returnAuthorization"/>
 *     &lt;enumeration value="salesOrder"/>
 *     &lt;enumeration value="salesRole"/>
 *     &lt;enumeration value="salesTaxItem"/>
 *     &lt;enumeration value="serializedInventoryItem"/>
 *     &lt;enumeration value="serializedAssemblyItem"/>
 *     &lt;enumeration value="servicePurchaseItem"/>
 *     &lt;enumeration value="serviceResaleItem"/>
 *     &lt;enumeration value="serviceSaleItem"/>
 *     &lt;enumeration value="solution"/>
 *     &lt;enumeration value="siteCategory"/>
 *     &lt;enumeration value="state"/>
 *     &lt;enumeration value="subsidiary"/>
 *     &lt;enumeration value="subtotalItem"/>
 *     &lt;enumeration value="supportCase"/>
 *     &lt;enumeration value="supportCaseIssue"/>
 *     &lt;enumeration value="supportCaseOrigin"/>
 *     &lt;enumeration value="supportCasePriority"/>
 *     &lt;enumeration value="supportCaseStatus"/>
 *     &lt;enumeration value="supportCaseType"/>
 *     &lt;enumeration value="task"/>
 *     &lt;enumeration value="taxGroup"/>
 *     &lt;enumeration value="taxType"/>
 *     &lt;enumeration value="term"/>
 *     &lt;enumeration value="timeBill"/>
 *     &lt;enumeration value="topic"/>
 *     &lt;enumeration value="transferOrder"/>
 *     &lt;enumeration value="transactionBodyCustomField"/>
 *     &lt;enumeration value="transactionColumnCustomField"/>
 *     &lt;enumeration value="unitsType"/>
 *     &lt;enumeration value="vendor"/>
 *     &lt;enumeration value="vendorCategory"/>
 *     &lt;enumeration value="vendorBill"/>
 *     &lt;enumeration value="vendorPayment"/>
 *     &lt;enumeration value="winLossReason"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RecordType", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum RecordType {
    // REGEXP for associating RecordTypes and Classes:
    // find: ([A-Z])([A-Z_]+)\("(.)(.+)"\),
    // replace: $1$2\("$3$4"\, $1$4\.class),

    @XmlEnumValue("account")
    ACCOUNT("account", Account.class),
    @XmlEnumValue("accountingPeriod")
    ACCOUNTING_PERIOD("accountingPeriod", AccountingPeriod.class),
    @XmlEnumValue("assemblyBuild")
    ASSEMBLY_BUILD("assemblyBuild", AssemblyBuild.class),
    @XmlEnumValue("assemblyUnbuild")
    ASSEMBLY_UNBUILD("assemblyUnbuild", AssemblyUnbuild.class),
    @XmlEnumValue("assemblyItem")
    ASSEMBLY_ITEM("assemblyItem", AssemblyItem.class),
    @XmlEnumValue("bin")
    BIN("bin", Bin.class),
    @XmlEnumValue("budget")
    BUDGET("budget", Budget.class),
    @XmlEnumValue("budgetCategory")
    BUDGET_CATEGORY("budgetCategory", BudgetCategory.class),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent", CalendarEvent.class),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign", Campaign.class),
    @XmlEnumValue("campaignAudience")
    CAMPAIGN_AUDIENCE("campaignAudience", CampaignAudience.class),
    @XmlEnumValue("campaignCategory")
    CAMPAIGN_CATEGORY("campaignCategory", CampaignCategory.class),
    @XmlEnumValue("campaignChannel")
    CAMPAIGN_CHANNEL("campaignChannel", CampaignChannel.class),
    @XmlEnumValue("campaignFamily")
    CAMPAIGN_FAMILY("campaignFamily", CampaignFamily.class),
    @XmlEnumValue("campaignOffer")
    CAMPAIGN_OFFER("campaignOffer", CampaignOffer.class),
    @XmlEnumValue("campaignResponse")
    CAMPAIGN_RESPONSE("campaignResponse", CampaignResponse.class),
    @XmlEnumValue("campaignSearchEngine")
    CAMPAIGN_SEARCH_ENGINE("campaignSearchEngine", CampaignSearchEngine.class),
    @XmlEnumValue("campaignSubscription")
    CAMPAIGN_SUBSCRIPTION("campaignSubscription", CampaignSubscription.class),
    @XmlEnumValue("campaignVertical")
    CAMPAIGN_VERTICAL("campaignVertical", CampaignVertical.class),
    @XmlEnumValue("cashRefund")
    CASH_REFUND("cashRefund", CashRefund.class),
    @XmlEnumValue("cashSale")
    CASH_SALE("cashSale", CashSale.class),
    @XmlEnumValue("check")
    CHECK("check", Check.class),
    @XmlEnumValue("classification")
    CLASSIFICATION("classification", Classification.class),
    @XmlEnumValue("contact")
    CONTACT("contact", Contact.class),
    @XmlEnumValue("contactCategory")
    CONTACT_CATEGORY("contactCategory", ContactCategory.class),
    @XmlEnumValue("contactRole")
    CONTACT_ROLE("contactRole", ContactRole.class),
    @XmlEnumValue("creditMemo")
    CREDIT_MEMO("creditMemo", CreditMemo.class),
    @XmlEnumValue("crmCustomField")
    CRM_CUSTOM_FIELD("crmCustomField", CrmCustomField.class),
    @XmlEnumValue("currency")
    CURRENCY("currency", Currency.class),
    @XmlEnumValue("customList")
    CUSTOM_LIST("customList", CustomList.class),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord", CustomRecord.class),
    @XmlEnumValue("customRecordCustomField")
    CUSTOM_RECORD_CUSTOM_FIELD("customRecordCustomField", CustomRecordCustomField.class),
    @XmlEnumValue("customRecordType")
    CUSTOM_RECORD_TYPE("customRecordType", CustomRecordType.class),
    @XmlEnumValue("customer")
    CUSTOMER("customer", Customer.class),
    @XmlEnumValue("customerCategory")
    CUSTOMER_CATEGORY("customerCategory", CustomerCategory.class),
    @XmlEnumValue("customerDeposit")
    CUSTOMER_DEPOSIT("customerDeposit", CustomerDeposit.class),
    @XmlEnumValue("customerPayment")
    CUSTOMER_PAYMENT("customerPayment", CustomerPayment.class),
    @XmlEnumValue("customerRefund")
    CUSTOMER_REFUND("customerRefund", CustomerRefund.class),
    @XmlEnumValue("customerStatus")
    CUSTOMER_STATUS("customerStatus", CustomerStatus.class),
    @XmlEnumValue("depositApplication")
    DEPOSIT_APPLICATION("depositApplication", DepositApplication.class),
    @XmlEnumValue("department")
    DEPARTMENT("department", Department.class),
    @XmlEnumValue("descriptionItem")
    DESCRIPTION_ITEM("descriptionItem", DescriptionItem.class),
    @XmlEnumValue("discountItem")
    DISCOUNT_ITEM("discountItem", DiscountItem.class),
    @XmlEnumValue("downloadItem")
    DOWNLOAD_ITEM("downloadItem", DownloadItem.class),
    @XmlEnumValue("employee")
    EMPLOYEE("employee", Employee.class),
    @XmlEnumValue("entityCustomField")
    ENTITY_CUSTOM_FIELD("entityCustomField", EntityCustomField.class),
    @XmlEnumValue("entityGroup")
    ENTITY_GROUP("entityGroup", EntityGroup.class),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate", Estimate.class),
    @XmlEnumValue("expenseCategory")
    EXPENSE_CATEGORY("expenseCategory", ExpenseCategory.class),
    @XmlEnumValue("expenseReport")
    EXPENSE_REPORT("expenseReport", ExpenseReport.class),
    @XmlEnumValue("file")
    FILE("file", File.class),
    @XmlEnumValue("folder")
    FOLDER("folder", Folder.class),
    @XmlEnumValue("giftCertificate")
    GIFT_CERTIFICATE("giftCertificate", GiftCertificate.class),
    @XmlEnumValue("giftCertificateItem")
    GIFT_CERTIFICATE_ITEM("giftCertificateItem", GiftCertificateItem.class),
    @XmlEnumValue("interCompanyJournalEntry")
    INTER_COMPANY_JOURNAL_ENTRY("interCompanyJournalEntry", InterCompanyJournalEntry.class),
    @XmlEnumValue("interCompanyTransferOrder")
    INTER_COMPANY_TRANSFER_ORDER("interCompanyTransferOrder", InterCompanyTransferOrder.class),
    @XmlEnumValue("inventoryAdjustment")
    INVENTORY_ADJUSTMENT("inventoryAdjustment", InventoryAdjustment.class),
    @XmlEnumValue("inventoryItem")
    INVENTORY_ITEM("inventoryItem", InventoryItem.class),
    @XmlEnumValue("invoice")
    INVOICE("invoice", Invoice.class),
    @XmlEnumValue("itemCustomField")
    ITEM_CUSTOM_FIELD("itemCustomField", ItemCustomField.class),
    @XmlEnumValue("itemFulfillment")
    ITEM_FULFILLMENT("itemFulfillment", ItemFulfillment.class),
    @XmlEnumValue("itemNumberCustomField")
    ITEM_NUMBER_CUSTOM_FIELD("itemNumberCustomField", ItemNumberCustomField.class),
    @XmlEnumValue("itemOptionCustomField")
    ITEM_OPTION_CUSTOM_FIELD("itemOptionCustomField", ItemOptionCustomField.class),
    @XmlEnumValue("issue")
    ISSUE("issue", Issue.class),
    @XmlEnumValue("job")
    JOB("job", Job.class),
    @XmlEnumValue("jobStatus")
    JOB_STATUS("jobStatus", JobStatus.class),
    @XmlEnumValue("jobType")
    JOB_TYPE("jobType", JobType.class),
    @XmlEnumValue("itemReceipt")
    ITEM_RECEIPT("itemReceipt", ItemReceipt.class),
    @XmlEnumValue("journalEntry")
    JOURNAL_ENTRY("journalEntry", JournalEntry.class),
    @XmlEnumValue("kitItem")
    KIT_ITEM("kitItem", KitItem.class),
    @XmlEnumValue("leadSource")
    LEAD_SOURCE("leadSource", LeadSource.class),
    @XmlEnumValue("location")
    LOCATION("location", Location.class),
    @XmlEnumValue("lotNumberedInventoryItem")
    LOT_NUMBERED_INVENTORY_ITEM("lotNumberedInventoryItem", LotNumberedInventoryItem.class),
    @XmlEnumValue("lotNumberedAssemblyItem")
    LOT_NUMBERED_ASSEMBLY_ITEM("lotNumberedAssemblyItem", LotNumberedAssemblyItem.class),
    @XmlEnumValue("markupItem")
    MARKUP_ITEM("markupItem", MarkupItem.class),
    @XmlEnumValue("message")
    MESSAGE("message", Message.class),
    @XmlEnumValue("nonInventoryPurchaseItem")
    NON_INVENTORY_PURCHASE_ITEM("nonInventoryPurchaseItem", NonInventoryPurchaseItem.class),
    @XmlEnumValue("nonInventoryResaleItem")
    NON_INVENTORY_RESALE_ITEM("nonInventoryResaleItem", NonInventoryResaleItem.class),
    @XmlEnumValue("nonInventorySaleItem")
    NON_INVENTORY_SALE_ITEM("nonInventorySaleItem", NonInventorySaleItem.class),
    @XmlEnumValue("note")
    NOTE("note", Note.class),
    @XmlEnumValue("noteType")
    NOTE_TYPE("noteType", NoteType.class),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity", Opportunity.class),
    @XmlEnumValue("otherChargePurchaseItem")
    OTHER_CHARGE_PURCHASE_ITEM("otherChargePurchaseItem", OtherChargePurchaseItem.class),
    @XmlEnumValue("otherChargeResaleItem")
    OTHER_CHARGE_RESALE_ITEM("otherChargeResaleItem", OtherChargeResaleItem.class),
    @XmlEnumValue("otherChargeSaleItem")
    OTHER_CHARGE_SALE_ITEM("otherChargeSaleItem", OtherChargeSaleItem.class),
    @XmlEnumValue("otherCustomField")
    OTHER_CUSTOM_FIELD("otherCustomField", OtherCustomField.class),
    @XmlEnumValue("partner")
    PARTNER("partner", Partner.class),
    @XmlEnumValue("partnerCategory")
    PARTNER_CATEGORY("partnerCategory", PartnerCategory.class),
    @XmlEnumValue("paymentItem")
    PAYMENT_ITEM("paymentItem", PaymentItem.class),
    @XmlEnumValue("paymentMethod")
    PAYMENT_METHOD("paymentMethod", PaymentMethod.class),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall", PhoneCall.class),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel", PriceLevel.class),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask", ProjectTask.class),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode", PromotionCode.class),
    @XmlEnumValue("purchaseOrder")
    PURCHASE_ORDER("purchaseOrder", PurchaseOrder.class),
    @XmlEnumValue("returnAuthorization")
    RETURN_AUTHORIZATION("returnAuthorization", ReturnAuthorization.class),
    @XmlEnumValue("salesOrder")
    SALES_ORDER("salesOrder", SalesOrder.class),
    @XmlEnumValue("salesRole")
    SALES_ROLE("salesRole", SalesRole.class),
    @XmlEnumValue("salesTaxItem")
    SALES_TAX_ITEM("salesTaxItem", SalesTaxItem.class),
    @XmlEnumValue("serializedInventoryItem")
    SERIALIZED_INVENTORY_ITEM("serializedInventoryItem", SerializedInventoryItem.class),
    @XmlEnumValue("serializedAssemblyItem")
    SERIALIZED_ASSEMBLY_ITEM("serializedAssemblyItem", SerializedAssemblyItem.class),
    @XmlEnumValue("servicePurchaseItem")
    SERVICE_PURCHASE_ITEM("servicePurchaseItem", ServicePurchaseItem.class),
    @XmlEnumValue("serviceResaleItem")
    SERVICE_RESALE_ITEM("serviceResaleItem", ServiceResaleItem.class),
    @XmlEnumValue("serviceSaleItem")
    SERVICE_SALE_ITEM("serviceSaleItem", ServiceSaleItem.class),
    @XmlEnumValue("solution")
    SOLUTION("solution", Solution.class),
    //XXX there are two classes with the same name
    @XmlEnumValue("siteCategory") 
    SITE_CATEGORY("siteCategory", SiteCategory.class),
    @XmlEnumValue("state")
    STATE("state", State.class),
    @XmlEnumValue("subsidiary")
    SUBSIDIARY("subsidiary", Subsidiary.class),
    @XmlEnumValue("subtotalItem")
    SUBTOTAL_ITEM("subtotalItem", SubtotalItem.class),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase", SupportCase.class),
    @XmlEnumValue("supportCaseIssue")
    SUPPORT_CASE_ISSUE("supportCaseIssue", SupportCaseIssue.class),
    @XmlEnumValue("supportCaseOrigin")
    SUPPORT_CASE_ORIGIN("supportCaseOrigin", SupportCaseOrigin.class),
    @XmlEnumValue("supportCasePriority")
    SUPPORT_CASE_PRIORITY("supportCasePriority", SupportCasePriority.class),
    @XmlEnumValue("supportCaseStatus")
    SUPPORT_CASE_STATUS("supportCaseStatus", SupportCaseStatus.class),
    @XmlEnumValue("supportCaseType")
    SUPPORT_CASE_TYPE("supportCaseType", SupportCaseType.class),
    @XmlEnumValue("task")
    TASK("task", Task.class),
    @XmlEnumValue("taxGroup")
    TAX_GROUP("taxGroup", TaxGroup.class),
    @XmlEnumValue("taxType")
    TAX_TYPE("taxType", TaxType.class),
    @XmlEnumValue("term")
    TERM("term", Term.class),
    @XmlEnumValue("timeBill")
    TIME_BILL("timeBill", TimeBill.class),
    @XmlEnumValue("topic")
    TOPIC("topic", Topic.class),
    @XmlEnumValue("transferOrder")
    TRANSFER_ORDER("transferOrder", TransferOrder.class),
    @XmlEnumValue("transactionBodyCustomField")
    TRANSACTION_BODY_CUSTOM_FIELD("transactionBodyCustomField", TransactionBodyCustomField.class),
    @XmlEnumValue("transactionColumnCustomField")
    TRANSACTION_COLUMN_CUSTOM_FIELD("transactionColumnCustomField", TransactionColumnCustomField.class),
    @XmlEnumValue("unitsType")
    UNITS_TYPE("unitsType", UnitsType.class),
    @XmlEnumValue("vendor")
    VENDOR("vendor", Vendor.class),
    @XmlEnumValue("vendorCategory")
    VENDOR_CATEGORY("vendorCategory", VendorCategory.class),
    @XmlEnumValue("vendorBill")
    VENDOR_BILL("vendorBill", VendorBill.class),
    @XmlEnumValue("vendorPayment")
    VENDOR_PAYMENT("vendorPayment", VendorPayment.class),
    @XmlEnumValue("winLossReason")
    WIN_LOSS_REASON("winLossReason", WinLossReason.class);
    private final String value;
    private final Class<? extends Record> recordClass;

    RecordType(String v, Class<? extends Record> recordClass) {
        value = v;
        this.recordClass = recordClass;
    }

    public String value() {
        return value;
    }

    public static RecordType fromValue(String v) {
        for (RecordType c: RecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }
    
    public Class<? extends Record> getRecordClass()
    {
        return recordClass;
    }

}
