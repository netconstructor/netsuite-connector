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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeletedRecordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeletedRecordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assemblyBuild"/>
 *     &lt;enumeration value="assemblyUnbuild"/>
 *     &lt;enumeration value="calendarEvent"/>
 *     &lt;enumeration value="campaign"/>
 *     &lt;enumeration value="cashRefund"/>
 *     &lt;enumeration value="cashSale"/>
 *     &lt;enumeration value="check"/>
 *     &lt;enumeration value="contact"/>
 *     &lt;enumeration value="contactCategory"/>
 *     &lt;enumeration value="creditMemo"/>
 *     &lt;enumeration value="customRecord"/>
 *     &lt;enumeration value="customer"/>
 *     &lt;enumeration value="customerCategory"/>
 *     &lt;enumeration value="customerDeposit"/>
 *     &lt;enumeration value="customerPayment"/>
 *     &lt;enumeration value="customerRefund"/>
 *     &lt;enumeration value="customerStatus"/>
 *     &lt;enumeration value="depositApplication"/>
 *     &lt;enumeration value="employee"/>
 *     &lt;enumeration value="expenseReport"/>
 *     &lt;enumeration value="estimate"/>
 *     &lt;enumeration value="file"/>
 *     &lt;enumeration value="folder"/>
 *     &lt;enumeration value="interCompanyJournalEntry"/>
 *     &lt;enumeration value="interCompanyTransferOrder"/>
 *     &lt;enumeration value="inventoryAdjustment"/>
 *     &lt;enumeration value="invoice"/>
 *     &lt;enumeration value="itemFulfillment"/>
 *     &lt;enumeration value="issue"/>
 *     &lt;enumeration value="job"/>
 *     &lt;enumeration value="jobStatus"/>
 *     &lt;enumeration value="itemReceipt"/>
 *     &lt;enumeration value="journalEntry"/>
 *     &lt;enumeration value="message"/>
 *     &lt;enumeration value="note"/>
 *     &lt;enumeration value="noteType"/>
 *     &lt;enumeration value="opportunity"/>
 *     &lt;enumeration value="partner"/>
 *     &lt;enumeration value="paymentMethod"/>
 *     &lt;enumeration value="phoneCall"/>
 *     &lt;enumeration value="priceLevel"/>
 *     &lt;enumeration value="projectTask"/>
 *     &lt;enumeration value="promotionCode"/>
 *     &lt;enumeration value="purchaseOrder"/>
 *     &lt;enumeration value="returnAuthorization"/>
 *     &lt;enumeration value="salesOrder"/>
 *     &lt;enumeration value="supportCase"/>
 *     &lt;enumeration value="supportCaseIssue"/>
 *     &lt;enumeration value="supportCaseOrigin"/>
 *     &lt;enumeration value="supportCasePriority"/>
 *     &lt;enumeration value="supportCaseStatus"/>
 *     &lt;enumeration value="supportCaseType"/>
 *     &lt;enumeration value="task"/>
 *     &lt;enumeration value="term"/>
 *     &lt;enumeration value="transferOrder"/>
 *     &lt;enumeration value="vendor"/>
 *     &lt;enumeration value="vendorBill"/>
 *     &lt;enumeration value="vendorPayment"/>
 *     &lt;enumeration value="winLossReason"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeletedRecordType", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum DeletedRecordType {

    @XmlEnumValue("assemblyBuild")
    ASSEMBLY_BUILD("assemblyBuild"),
    @XmlEnumValue("assemblyUnbuild")
    ASSEMBLY_UNBUILD("assemblyUnbuild"),
    @XmlEnumValue("calendarEvent")
    CALENDAR_EVENT("calendarEvent"),
    @XmlEnumValue("campaign")
    CAMPAIGN("campaign"),
    @XmlEnumValue("cashRefund")
    CASH_REFUND("cashRefund"),
    @XmlEnumValue("cashSale")
    CASH_SALE("cashSale"),
    @XmlEnumValue("check")
    CHECK("check"),
    @XmlEnumValue("contact")
    CONTACT("contact"),
    @XmlEnumValue("contactCategory")
    CONTACT_CATEGORY("contactCategory"),
    @XmlEnumValue("creditMemo")
    CREDIT_MEMO("creditMemo"),
    @XmlEnumValue("customRecord")
    CUSTOM_RECORD("customRecord"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("customerCategory")
    CUSTOMER_CATEGORY("customerCategory"),
    @XmlEnumValue("customerDeposit")
    CUSTOMER_DEPOSIT("customerDeposit"),
    @XmlEnumValue("customerPayment")
    CUSTOMER_PAYMENT("customerPayment"),
    @XmlEnumValue("customerRefund")
    CUSTOMER_REFUND("customerRefund"),
    @XmlEnumValue("customerStatus")
    CUSTOMER_STATUS("customerStatus"),
    @XmlEnumValue("depositApplication")
    DEPOSIT_APPLICATION("depositApplication"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("expenseReport")
    EXPENSE_REPORT("expenseReport"),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("file")
    FILE("file"),
    @XmlEnumValue("folder")
    FOLDER("folder"),
    @XmlEnumValue("interCompanyJournalEntry")
    INTER_COMPANY_JOURNAL_ENTRY("interCompanyJournalEntry"),
    @XmlEnumValue("interCompanyTransferOrder")
    INTER_COMPANY_TRANSFER_ORDER("interCompanyTransferOrder"),
    @XmlEnumValue("inventoryAdjustment")
    INVENTORY_ADJUSTMENT("inventoryAdjustment"),
    @XmlEnumValue("invoice")
    INVOICE("invoice"),
    @XmlEnumValue("itemFulfillment")
    ITEM_FULFILLMENT("itemFulfillment"),
    @XmlEnumValue("issue")
    ISSUE("issue"),
    @XmlEnumValue("job")
    JOB("job"),
    @XmlEnumValue("jobStatus")
    JOB_STATUS("jobStatus"),
    @XmlEnumValue("itemReceipt")
    ITEM_RECEIPT("itemReceipt"),
    @XmlEnumValue("journalEntry")
    JOURNAL_ENTRY("journalEntry"),
    @XmlEnumValue("message")
    MESSAGE("message"),
    @XmlEnumValue("note")
    NOTE("note"),
    @XmlEnumValue("noteType")
    NOTE_TYPE("noteType"),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity"),
    @XmlEnumValue("partner")
    PARTNER("partner"),
    @XmlEnumValue("paymentMethod")
    PAYMENT_METHOD("paymentMethod"),
    @XmlEnumValue("phoneCall")
    PHONE_CALL("phoneCall"),
    @XmlEnumValue("priceLevel")
    PRICE_LEVEL("priceLevel"),
    @XmlEnumValue("projectTask")
    PROJECT_TASK("projectTask"),
    @XmlEnumValue("promotionCode")
    PROMOTION_CODE("promotionCode"),
    @XmlEnumValue("purchaseOrder")
    PURCHASE_ORDER("purchaseOrder"),
    @XmlEnumValue("returnAuthorization")
    RETURN_AUTHORIZATION("returnAuthorization"),
    @XmlEnumValue("salesOrder")
    SALES_ORDER("salesOrder"),
    @XmlEnumValue("supportCase")
    SUPPORT_CASE("supportCase"),
    @XmlEnumValue("supportCaseIssue")
    SUPPORT_CASE_ISSUE("supportCaseIssue"),
    @XmlEnumValue("supportCaseOrigin")
    SUPPORT_CASE_ORIGIN("supportCaseOrigin"),
    @XmlEnumValue("supportCasePriority")
    SUPPORT_CASE_PRIORITY("supportCasePriority"),
    @XmlEnumValue("supportCaseStatus")
    SUPPORT_CASE_STATUS("supportCaseStatus"),
    @XmlEnumValue("supportCaseType")
    SUPPORT_CASE_TYPE("supportCaseType"),
    @XmlEnumValue("task")
    TASK("task"),
    @XmlEnumValue("term")
    TERM("term"),
    @XmlEnumValue("transferOrder")
    TRANSFER_ORDER("transferOrder"),
    @XmlEnumValue("vendor")
    VENDOR("vendor"),
    @XmlEnumValue("vendorBill")
    VENDOR_BILL("vendorBill"),
    @XmlEnumValue("vendorPayment")
    VENDOR_PAYMENT("vendorPayment"),
    @XmlEnumValue("winLossReason")
    WIN_LOSS_REASON("winLossReason");
    private final String value;

    DeletedRecordType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeletedRecordType fromValue(String v) {
        for (DeletedRecordType c: DeletedRecordType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
