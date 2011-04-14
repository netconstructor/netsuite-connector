/**
 * Mule S3 Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package org.mule.module.netsuite.api.entity;

import org.mule.module.netsuite.api.internal.RecordType;
import static org.mule.module.netsuite.api.internal.RecordType.*;

public enum EntityType
{
    ACCOUNT(account), //
    ACCOUNTING_PERIOD(accountingPeriod), //
    ASSEMBLY_BUILD(assemblyBuild), //
    ASSEMBLY_UNBUILD(assemblyUnbuild), //
    ASSEMBLY_ITEM(assemblyItem), //
    BIN(bin), //
    BUDGET(budget), //
    BUDGET_CATEGORY(budgetCategory), //
    CALENDAR_EVENT(calendarEvent), //
    CAMPAIGN(campaign), //
    CAMPAIGN_AUDIENCE(campaignAudience), //
    CAMPAIGN_CATEGORY(campaignCategory), //
    CAMPAIGN_CHANNEL(campaignChannel), //
    CAMPAIGN_FAMILY(campaignFamily), //
    CAMPAIGN_OFFER(campaignOffer), //
    CAMPAIGN_RESPONSE(campaignResponse), //
    CAMPAIGN_SEARCH_ENGINE(campaignSearchEngine), //
    CAMPAIGN_SUBSCRIPTION(campaignSubscription), //
    CAMPAIGN_VERTICAL(campaignVertical), //
    CASH_REFUND(cashRefund), //
    CASHSALE(cashSale), //
    CHECK(check), //
    CLASSIFICATION(classification), //
    CONTACT(contact), //
    CONTACT_CATEGORY(contactCategory), //
    CONTACT_ROLE(contactRole), // //
    CREDIT_MEMO(creditMemo), //
    CRM_CUSTOM_FIELD(crmCustomField), //
    CURRENCY(currency), //
    CUSTOM_LIST(customList), //
    CUSTOM_RECORD(customRecord), //
    CUSTOM_RECORD_CUSTOM_FIELD(customRecordCustomField), //
    CUSTOM_RECORD_TYPE(customRecordType), //
    CUSTOMER(customer), //
    CUSTOMER_CATEGORY(customerCategory), //
    CUSTOMER_DEPOSIT(customerDeposit), //
    CUSTOMER_PAYMENT(customerPayment), //
    CUSTOMER_REFUND(customerRefund), //
    CUSTOMER_STATUS(customerStatus), //
    DEPOSIT_APPLICATION(depositApplication), //
    DEPARTMENT(department), //
    DESCRIPTION_ITEM(descriptionItem), //
    DISCOUNT_ITEM(discountItem), //
    DOWNLOAD_ITEM(downloadItem), //
    EMPLOYEE(employee), //
    ENTITY_CUSTOM_FIELD(entityCustomField), //
    ENTITY_GROUP(entityGroup), //
    ESTIMATE(estimate), //
    EXPENSE_CATEGORY(expenseCategory), //
    EXPENSE_REPORT(expenseReport), //
    FILE(file), //
    FOLDER(folder), //
    GIFT_CERTIFICATE(giftCertificate), //
    GIFT_CERTIFICATEITEM(giftCertificateItem), //
    INTER_COMPANY_JOURNAL_ENTRY(interCompanyJournalEntry), //
    INTER_COMPANY_TRANSFER_ORDER(interCompanyTransferOrder), //
    INVENTORY_ADJUSTMENT(inventoryAdjustment), //
    INVENTORY_ITEM(inventoryItem), //
    INVOICE(invoice), //
    ITEM_CUSTOM_FIELD(itemCustomField), //
    ITEM_FULFILLMENT(itemFulfillment), //
    ITEM_NUMBER_CUSTOM_FIELD(itemNumberCustomField), //
    ITEM_OPTION_CUSTOM_FIELD(itemOptionCustomField), //
    ISSUE(issue), //
    JOB(job), //
    JOB_STATUS(jobStatus), //
    JOB_TYPE(jobType), //
    ITEM_RECEIPT(itemReceipt), //
    JOURNAL_ENTRY(journalEntry), //
    KIT_ITEM(kitItem), //
    LEAD_SOURCE(leadSource), //
    LOCATION(location), //
    LOT_NUMBERED_INVENTORY_ITEM(lotNumberedInventoryItem), //
    LOT_NUMBERED_ASSEMBLY_ITEM(lotNumberedAssemblyItem), //
    MARKUP_ITEM(markupItem), //
    MESSAGE(message), //
    NON_INVENTORY_PURCHASE_ITEM(nonInventoryPurchaseItem), //
    NON_INVENTORY_RESALE_ITEM(nonInventoryResaleItem), //
    NON_INVENTORY_SALE_ITEM(nonInventorySaleItem), //
    NOTE(note), //
    NOTE_TYPE(noteType), //
    OPPORTUNITY(opportunity), //
    OTHER_CHARGE_PURCHASE_ITEM(otherChargePurchaseItem), //
    OTHER_CHARGE_RESALE_ITEM(otherChargeResaleItem), //
    OTHER_CHARGE_SALE_ITEM(otherChargeSaleItem), //
    OTHER_CUSTOM_FIELD(otherCustomField), //
    PARTNER(partner), //
    PARTNER_CATEGORY(partnerCategory), //
    PAYMENT_ITEM(paymentItem), //
    PAYMENT_METHOD(paymentMethod), //
    PHONE_CALL(phoneCall), //
    PRICE_LEVEL(priceLevel), //
    PROJECT_TASK(projectTask), //
    PROMOTION_CODE(promotionCode), //
    PURCHASE_ORDER(purchaseOrder), //
    RETURN_AUTHORIZATION(returnAuthorization), //
    SALES_ORDER(salesOrder), //
    SALES_ROLE(salesRole), //
    SALES_TAX_ITEM(salesTaxItem), //
    SERIALIZED_INVENTORY_ITEM(serializedInventoryItem), //
    SERIALIZED_ASSEMBLY_ITEM(serializedAssemblyItem), //
    SERVICE_PURCHASE_ITEM(servicePurchaseItem), //
    SERVICE_RESALE_ITEM(serviceResaleItem), //
    SERVICE_SALE_ITEM(serviceSaleItem), //
    SOLUTION(solution), //
    SITE_CATEGORY(siteCategory), //
    STATE(state), //
    SUBSIDIARY(subsidiary), //
    SUBTOTAL_ITEM(subtotalItem), //
    SUPPORT_CASE(supportCase), //
    SUPPORT_CASE_ISSUE(supportCaseIssue), //
    SUPPORT_CASE_ORIGIN(supportCaseOrigin), //
    SUPPORT_CASE_PRIORITY(supportCasePriority), //
    SUPPORT_CASE_STATUS(supportCaseStatus), //
    SUPPORT_CASE_TYPE(supportCaseType), //
    TASK(task), //
    TAX_GROUP(taxGroup), //
    TAX_TYPE(taxType), //
    TERM(term), //
    TIME_BILL(timeBill), //
    TOPIC(topic), //
    TRANSFER_ORDER(transferOrder), //
    TRANSACTION_BODY_CUSTOM_FIELD(transactionBodyCustomField), //
    TRANSACTION_COLUMN_CUSTOM_FIELD(transactionColumnCustomField), //
    UNITS_TYPE(unitsType), //
    VENDOR(vendor), //
    VENDOR_CATEGORY(vendorCategory), //
    VENDOR_BILL(vendorBill), //
    VENDOR_PAYMENT(vendorPayment), // //
    WIN_LOSS_REASON(winLossReason);

    private RecordType type;

    private EntityType(RecordType type)
    {
        this.type = type;
    }

    public RecordType getType()
    {
        return type;
    }

}
