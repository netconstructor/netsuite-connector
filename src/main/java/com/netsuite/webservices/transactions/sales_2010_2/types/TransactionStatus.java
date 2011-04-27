
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_billOpen"/>
 *     &lt;enumeration value="_billPaidInFull"/>
 *     &lt;enumeration value="_billPaymentOnlineBillPayPendingAccountingApproval"/>
 *     &lt;enumeration value="_billPaymentVoided"/>
 *     &lt;enumeration value="_cashSaleDeposited"/>
 *     &lt;enumeration value="_cashSaleNotDeposited"/>
 *     &lt;enumeration value="_cashSaleUnapprovedPayment"/>
 *     &lt;enumeration value="_checkOnlineBillPayPendingAccountingApproval"/>
 *     &lt;enumeration value="_checkVoided"/>
 *     &lt;enumeration value="_commissionOverpaid"/>
 *     &lt;enumeration value="_commissionPaidInFull"/>
 *     &lt;enumeration value="_commissionPendingAccountingApproval"/>
 *     &lt;enumeration value="_commissionPendingPayment"/>
 *     &lt;enumeration value="_commissionRejectedByAccounting"/>
 *     &lt;enumeration value="_creditMemoFullyApplied"/>
 *     &lt;enumeration value="_creditMemoOpen"/>
 *     &lt;enumeration value="_customerDepositDeposited"/>
 *     &lt;enumeration value="_customerDepositFullyApplied"/>
 *     &lt;enumeration value="_customerDepositNotDeposited"/>
 *     &lt;enumeration value="_customerRefundVoided"/>
 *     &lt;enumeration value="_estimateClosed"/>
 *     &lt;enumeration value="_estimateExpired"/>
 *     &lt;enumeration value="_estimateOpen"/>
 *     &lt;enumeration value="_estimateProcessed"/>
 *     &lt;enumeration value="_estimateVoided"/>
 *     &lt;enumeration value="_expenseReportApprovedByAccounting"/>
 *     &lt;enumeration value="_expenseReportApprovedOverriddenByAccounting"/>
 *     &lt;enumeration value="_expenseReportInProgress"/>
 *     &lt;enumeration value="_expenseReportPaidInFull"/>
 *     &lt;enumeration value="_expenseReportPendingAccountingApproval"/>
 *     &lt;enumeration value="_expenseReportPendingSupervisorApproval"/>
 *     &lt;enumeration value="_expenseReportRejectedByAccounting"/>
 *     &lt;enumeration value="_expenseReportRejectedBySupervisor"/>
 *     &lt;enumeration value="_expenseReportRejectedOverriddenByAccounting"/>
 *     &lt;enumeration value="_invoiceOpen"/>
 *     &lt;enumeration value="_invoicePaidInFull"/>
 *     &lt;enumeration value="_itemFulfillmentPacked"/>
 *     &lt;enumeration value="_itemFulfillmentPicked"/>
 *     &lt;enumeration value="_itemFulfillmentShipped"/>
 *     &lt;enumeration value="_journalApprovedForPosting"/>
 *     &lt;enumeration value="_journalPendingApproval"/>
 *     &lt;enumeration value="_opportunityClosedLost"/>
 *     &lt;enumeration value="_opportunityClosedWon"/>
 *     &lt;enumeration value="_opportunityInProgress"/>
 *     &lt;enumeration value="_opportunityIssuedEstimate"/>
 *     &lt;enumeration value="_paycheckCommitted"/>
 *     &lt;enumeration value="_paycheckPendingCommitment"/>
 *     &lt;enumeration value="_paycheckPendingTaxCalculation"/>
 *     &lt;enumeration value="_paycheckPreview"/>
 *     &lt;enumeration value="_paycheckReversed"/>
 *     &lt;enumeration value="_paycheckUndefined"/>
 *     &lt;enumeration value="_paymentDeposited"/>
 *     &lt;enumeration value="_paymentNotDeposited"/>
 *     &lt;enumeration value="_paymentUnapprovedPayment"/>
 *     &lt;enumeration value="_payrollLiabilityCheckVoided"/>
 *     &lt;enumeration value="_purchaseOrderClosed"/>
 *     &lt;enumeration value="_purchaseOrderFullyBilled"/>
 *     &lt;enumeration value="_purchaseOrderPartiallyReceived"/>
 *     &lt;enumeration value="_purchaseOrderPendingBill"/>
 *     &lt;enumeration value="_purchaseOrderPendingBillingPartiallyReceived"/>
 *     &lt;enumeration value="_purchaseOrderPendingReceipt"/>
 *     &lt;enumeration value="_purchaseOrderPendingSupervisorApproval"/>
 *     &lt;enumeration value="_purchaseOrderRejectedBySupervisor"/>
 *     &lt;enumeration value="_returnAuthorizationCancelled"/>
 *     &lt;enumeration value="_returnAuthorizationClosed"/>
 *     &lt;enumeration value="_returnAuthorizationPartiallyReceived"/>
 *     &lt;enumeration value="_returnAuthorizationPendingApproval"/>
 *     &lt;enumeration value="_returnAuthorizationPendingReceipt"/>
 *     &lt;enumeration value="_returnAuthorizationPendingRefund"/>
 *     &lt;enumeration value="_returnAuthorizationPendingRefundPartiallyReceived"/>
 *     &lt;enumeration value="_returnAuthorizationRefunded"/>
 *     &lt;enumeration value="_salesOrderBilled"/>
 *     &lt;enumeration value="_salesOrderCancelled"/>
 *     &lt;enumeration value="_salesOrderClosed"/>
 *     &lt;enumeration value="_salesOrderPartiallyFulfilled"/>
 *     &lt;enumeration value="_salesOrderPendingApproval"/>
 *     &lt;enumeration value="_salesOrderPendingBilling"/>
 *     &lt;enumeration value="_salesOrderPendingBillingPartiallyFulfilled"/>
 *     &lt;enumeration value="_salesOrderPendingFulfillment"/>
 *     &lt;enumeration value="_salesTaxPaymentOnlineBillPayPendingAccountingApproval"/>
 *     &lt;enumeration value="_salesTaxPaymentVoided"/>
 *     &lt;enumeration value="_statementChargeOpen"/>
 *     &lt;enumeration value="_statementChargePaidInFull"/>
 *     &lt;enumeration value="_taxLiabilityChequeVoided"/>
 *     &lt;enumeration value="_tegataPayableEndorsed"/>
 *     &lt;enumeration value="_tegataPayableIssued"/>
 *     &lt;enumeration value="_tegataPayablePaid"/>
 *     &lt;enumeration value="_tegataReceivablesCollected"/>
 *     &lt;enumeration value="_tegataReceivablesDiscounted"/>
 *     &lt;enumeration value="_tegataReceivablesEndorsed"/>
 *     &lt;enumeration value="_tegataReceivablesHolding"/>
 *     &lt;enumeration value="_transferOrderClosed"/>
 *     &lt;enumeration value="_transferOrderPartiallyFulfilled"/>
 *     &lt;enumeration value="_transferOrderPendingApproval"/>
 *     &lt;enumeration value="_transferOrderPendingFulfillment"/>
 *     &lt;enumeration value="_transferOrderPendingReceipt"/>
 *     &lt;enumeration value="_transferOrderPendingReceiptPartiallyFulfilled"/>
 *     &lt;enumeration value="_transferOrderReceived"/>
 *     &lt;enumeration value="_transferOrderRejected"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationCancelled"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationClosed"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationCredited"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationPartiallyReturned"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingApproval"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingCredit"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingCreditPartiallyReturned"/>
 *     &lt;enumeration value="_vendorReturnAuthorizationPendingReturn"/>
 *     &lt;enumeration value="_workOrderBuilt"/>
 *     &lt;enumeration value="_workOrderCancelled"/>
 *     &lt;enumeration value="_workOrderClosed"/>
 *     &lt;enumeration value="_workOrderPartiallyBuilt"/>
 *     &lt;enumeration value="_workOrderPendingBuild"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionStatus", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionStatus {

    @XmlEnumValue("_billOpen")
    BILL_OPEN("_billOpen"),
    @XmlEnumValue("_billPaidInFull")
    BILL_PAID_IN_FULL("_billPaidInFull"),
    @XmlEnumValue("_billPaymentOnlineBillPayPendingAccountingApproval")
    BILL_PAYMENT_ONLINE_BILL_PAY_PENDING_ACCOUNTING_APPROVAL("_billPaymentOnlineBillPayPendingAccountingApproval"),
    @XmlEnumValue("_billPaymentVoided")
    BILL_PAYMENT_VOIDED("_billPaymentVoided"),
    @XmlEnumValue("_cashSaleDeposited")
    CASH_SALE_DEPOSITED("_cashSaleDeposited"),
    @XmlEnumValue("_cashSaleNotDeposited")
    CASH_SALE_NOT_DEPOSITED("_cashSaleNotDeposited"),
    @XmlEnumValue("_cashSaleUnapprovedPayment")
    CASH_SALE_UNAPPROVED_PAYMENT("_cashSaleUnapprovedPayment"),
    @XmlEnumValue("_checkOnlineBillPayPendingAccountingApproval")
    CHECK_ONLINE_BILL_PAY_PENDING_ACCOUNTING_APPROVAL("_checkOnlineBillPayPendingAccountingApproval"),
    @XmlEnumValue("_checkVoided")
    CHECK_VOIDED("_checkVoided"),
    @XmlEnumValue("_commissionOverpaid")
    COMMISSION_OVERPAID("_commissionOverpaid"),
    @XmlEnumValue("_commissionPaidInFull")
    COMMISSION_PAID_IN_FULL("_commissionPaidInFull"),
    @XmlEnumValue("_commissionPendingAccountingApproval")
    COMMISSION_PENDING_ACCOUNTING_APPROVAL("_commissionPendingAccountingApproval"),
    @XmlEnumValue("_commissionPendingPayment")
    COMMISSION_PENDING_PAYMENT("_commissionPendingPayment"),
    @XmlEnumValue("_commissionRejectedByAccounting")
    COMMISSION_REJECTED_BY_ACCOUNTING("_commissionRejectedByAccounting"),
    @XmlEnumValue("_creditMemoFullyApplied")
    CREDIT_MEMO_FULLY_APPLIED("_creditMemoFullyApplied"),
    @XmlEnumValue("_creditMemoOpen")
    CREDIT_MEMO_OPEN("_creditMemoOpen"),
    @XmlEnumValue("_customerDepositDeposited")
    CUSTOMER_DEPOSIT_DEPOSITED("_customerDepositDeposited"),
    @XmlEnumValue("_customerDepositFullyApplied")
    CUSTOMER_DEPOSIT_FULLY_APPLIED("_customerDepositFullyApplied"),
    @XmlEnumValue("_customerDepositNotDeposited")
    CUSTOMER_DEPOSIT_NOT_DEPOSITED("_customerDepositNotDeposited"),
    @XmlEnumValue("_customerRefundVoided")
    CUSTOMER_REFUND_VOIDED("_customerRefundVoided"),
    @XmlEnumValue("_estimateClosed")
    ESTIMATE_CLOSED("_estimateClosed"),
    @XmlEnumValue("_estimateExpired")
    ESTIMATE_EXPIRED("_estimateExpired"),
    @XmlEnumValue("_estimateOpen")
    ESTIMATE_OPEN("_estimateOpen"),
    @XmlEnumValue("_estimateProcessed")
    ESTIMATE_PROCESSED("_estimateProcessed"),
    @XmlEnumValue("_estimateVoided")
    ESTIMATE_VOIDED("_estimateVoided"),
    @XmlEnumValue("_expenseReportApprovedByAccounting")
    EXPENSE_REPORT_APPROVED_BY_ACCOUNTING("_expenseReportApprovedByAccounting"),
    @XmlEnumValue("_expenseReportApprovedOverriddenByAccounting")
    EXPENSE_REPORT_APPROVED_OVERRIDDEN_BY_ACCOUNTING("_expenseReportApprovedOverriddenByAccounting"),
    @XmlEnumValue("_expenseReportInProgress")
    EXPENSE_REPORT_IN_PROGRESS("_expenseReportInProgress"),
    @XmlEnumValue("_expenseReportPaidInFull")
    EXPENSE_REPORT_PAID_IN_FULL("_expenseReportPaidInFull"),
    @XmlEnumValue("_expenseReportPendingAccountingApproval")
    EXPENSE_REPORT_PENDING_ACCOUNTING_APPROVAL("_expenseReportPendingAccountingApproval"),
    @XmlEnumValue("_expenseReportPendingSupervisorApproval")
    EXPENSE_REPORT_PENDING_SUPERVISOR_APPROVAL("_expenseReportPendingSupervisorApproval"),
    @XmlEnumValue("_expenseReportRejectedByAccounting")
    EXPENSE_REPORT_REJECTED_BY_ACCOUNTING("_expenseReportRejectedByAccounting"),
    @XmlEnumValue("_expenseReportRejectedBySupervisor")
    EXPENSE_REPORT_REJECTED_BY_SUPERVISOR("_expenseReportRejectedBySupervisor"),
    @XmlEnumValue("_expenseReportRejectedOverriddenByAccounting")
    EXPENSE_REPORT_REJECTED_OVERRIDDEN_BY_ACCOUNTING("_expenseReportRejectedOverriddenByAccounting"),
    @XmlEnumValue("_invoiceOpen")
    INVOICE_OPEN("_invoiceOpen"),
    @XmlEnumValue("_invoicePaidInFull")
    INVOICE_PAID_IN_FULL("_invoicePaidInFull"),
    @XmlEnumValue("_itemFulfillmentPacked")
    ITEM_FULFILLMENT_PACKED("_itemFulfillmentPacked"),
    @XmlEnumValue("_itemFulfillmentPicked")
    ITEM_FULFILLMENT_PICKED("_itemFulfillmentPicked"),
    @XmlEnumValue("_itemFulfillmentShipped")
    ITEM_FULFILLMENT_SHIPPED("_itemFulfillmentShipped"),
    @XmlEnumValue("_journalApprovedForPosting")
    JOURNAL_APPROVED_FOR_POSTING("_journalApprovedForPosting"),
    @XmlEnumValue("_journalPendingApproval")
    JOURNAL_PENDING_APPROVAL("_journalPendingApproval"),
    @XmlEnumValue("_opportunityClosedLost")
    OPPORTUNITY_CLOSED_LOST("_opportunityClosedLost"),
    @XmlEnumValue("_opportunityClosedWon")
    OPPORTUNITY_CLOSED_WON("_opportunityClosedWon"),
    @XmlEnumValue("_opportunityInProgress")
    OPPORTUNITY_IN_PROGRESS("_opportunityInProgress"),
    @XmlEnumValue("_opportunityIssuedEstimate")
    OPPORTUNITY_ISSUED_ESTIMATE("_opportunityIssuedEstimate"),
    @XmlEnumValue("_paycheckCommitted")
    PAYCHECK_COMMITTED("_paycheckCommitted"),
    @XmlEnumValue("_paycheckPendingCommitment")
    PAYCHECK_PENDING_COMMITMENT("_paycheckPendingCommitment"),
    @XmlEnumValue("_paycheckPendingTaxCalculation")
    PAYCHECK_PENDING_TAX_CALCULATION("_paycheckPendingTaxCalculation"),
    @XmlEnumValue("_paycheckPreview")
    PAYCHECK_PREVIEW("_paycheckPreview"),
    @XmlEnumValue("_paycheckReversed")
    PAYCHECK_REVERSED("_paycheckReversed"),
    @XmlEnumValue("_paycheckUndefined")
    PAYCHECK_UNDEFINED("_paycheckUndefined"),
    @XmlEnumValue("_paymentDeposited")
    PAYMENT_DEPOSITED("_paymentDeposited"),
    @XmlEnumValue("_paymentNotDeposited")
    PAYMENT_NOT_DEPOSITED("_paymentNotDeposited"),
    @XmlEnumValue("_paymentUnapprovedPayment")
    PAYMENT_UNAPPROVED_PAYMENT("_paymentUnapprovedPayment"),
    @XmlEnumValue("_payrollLiabilityCheckVoided")
    PAYROLL_LIABILITY_CHECK_VOIDED("_payrollLiabilityCheckVoided"),
    @XmlEnumValue("_purchaseOrderClosed")
    PURCHASE_ORDER_CLOSED("_purchaseOrderClosed"),
    @XmlEnumValue("_purchaseOrderFullyBilled")
    PURCHASE_ORDER_FULLY_BILLED("_purchaseOrderFullyBilled"),
    @XmlEnumValue("_purchaseOrderPartiallyReceived")
    PURCHASE_ORDER_PARTIALLY_RECEIVED("_purchaseOrderPartiallyReceived"),
    @XmlEnumValue("_purchaseOrderPendingBill")
    PURCHASE_ORDER_PENDING_BILL("_purchaseOrderPendingBill"),
    @XmlEnumValue("_purchaseOrderPendingBillingPartiallyReceived")
    PURCHASE_ORDER_PENDING_BILLING_PARTIALLY_RECEIVED("_purchaseOrderPendingBillingPartiallyReceived"),
    @XmlEnumValue("_purchaseOrderPendingReceipt")
    PURCHASE_ORDER_PENDING_RECEIPT("_purchaseOrderPendingReceipt"),
    @XmlEnumValue("_purchaseOrderPendingSupervisorApproval")
    PURCHASE_ORDER_PENDING_SUPERVISOR_APPROVAL("_purchaseOrderPendingSupervisorApproval"),
    @XmlEnumValue("_purchaseOrderRejectedBySupervisor")
    PURCHASE_ORDER_REJECTED_BY_SUPERVISOR("_purchaseOrderRejectedBySupervisor"),
    @XmlEnumValue("_returnAuthorizationCancelled")
    RETURN_AUTHORIZATION_CANCELLED("_returnAuthorizationCancelled"),
    @XmlEnumValue("_returnAuthorizationClosed")
    RETURN_AUTHORIZATION_CLOSED("_returnAuthorizationClosed"),
    @XmlEnumValue("_returnAuthorizationPartiallyReceived")
    RETURN_AUTHORIZATION_PARTIALLY_RECEIVED("_returnAuthorizationPartiallyReceived"),
    @XmlEnumValue("_returnAuthorizationPendingApproval")
    RETURN_AUTHORIZATION_PENDING_APPROVAL("_returnAuthorizationPendingApproval"),
    @XmlEnumValue("_returnAuthorizationPendingReceipt")
    RETURN_AUTHORIZATION_PENDING_RECEIPT("_returnAuthorizationPendingReceipt"),
    @XmlEnumValue("_returnAuthorizationPendingRefund")
    RETURN_AUTHORIZATION_PENDING_REFUND("_returnAuthorizationPendingRefund"),
    @XmlEnumValue("_returnAuthorizationPendingRefundPartiallyReceived")
    RETURN_AUTHORIZATION_PENDING_REFUND_PARTIALLY_RECEIVED("_returnAuthorizationPendingRefundPartiallyReceived"),
    @XmlEnumValue("_returnAuthorizationRefunded")
    RETURN_AUTHORIZATION_REFUNDED("_returnAuthorizationRefunded"),
    @XmlEnumValue("_salesOrderBilled")
    SALES_ORDER_BILLED("_salesOrderBilled"),
    @XmlEnumValue("_salesOrderCancelled")
    SALES_ORDER_CANCELLED("_salesOrderCancelled"),
    @XmlEnumValue("_salesOrderClosed")
    SALES_ORDER_CLOSED("_salesOrderClosed"),
    @XmlEnumValue("_salesOrderPartiallyFulfilled")
    SALES_ORDER_PARTIALLY_FULFILLED("_salesOrderPartiallyFulfilled"),
    @XmlEnumValue("_salesOrderPendingApproval")
    SALES_ORDER_PENDING_APPROVAL("_salesOrderPendingApproval"),
    @XmlEnumValue("_salesOrderPendingBilling")
    SALES_ORDER_PENDING_BILLING("_salesOrderPendingBilling"),
    @XmlEnumValue("_salesOrderPendingBillingPartiallyFulfilled")
    SALES_ORDER_PENDING_BILLING_PARTIALLY_FULFILLED("_salesOrderPendingBillingPartiallyFulfilled"),
    @XmlEnumValue("_salesOrderPendingFulfillment")
    SALES_ORDER_PENDING_FULFILLMENT("_salesOrderPendingFulfillment"),
    @XmlEnumValue("_salesTaxPaymentOnlineBillPayPendingAccountingApproval")
    SALES_TAX_PAYMENT_ONLINE_BILL_PAY_PENDING_ACCOUNTING_APPROVAL("_salesTaxPaymentOnlineBillPayPendingAccountingApproval"),
    @XmlEnumValue("_salesTaxPaymentVoided")
    SALES_TAX_PAYMENT_VOIDED("_salesTaxPaymentVoided"),
    @XmlEnumValue("_statementChargeOpen")
    STATEMENT_CHARGE_OPEN("_statementChargeOpen"),
    @XmlEnumValue("_statementChargePaidInFull")
    STATEMENT_CHARGE_PAID_IN_FULL("_statementChargePaidInFull"),
    @XmlEnumValue("_taxLiabilityChequeVoided")
    TAX_LIABILITY_CHEQUE_VOIDED("_taxLiabilityChequeVoided"),
    @XmlEnumValue("_tegataPayableEndorsed")
    TEGATA_PAYABLE_ENDORSED("_tegataPayableEndorsed"),
    @XmlEnumValue("_tegataPayableIssued")
    TEGATA_PAYABLE_ISSUED("_tegataPayableIssued"),
    @XmlEnumValue("_tegataPayablePaid")
    TEGATA_PAYABLE_PAID("_tegataPayablePaid"),
    @XmlEnumValue("_tegataReceivablesCollected")
    TEGATA_RECEIVABLES_COLLECTED("_tegataReceivablesCollected"),
    @XmlEnumValue("_tegataReceivablesDiscounted")
    TEGATA_RECEIVABLES_DISCOUNTED("_tegataReceivablesDiscounted"),
    @XmlEnumValue("_tegataReceivablesEndorsed")
    TEGATA_RECEIVABLES_ENDORSED("_tegataReceivablesEndorsed"),
    @XmlEnumValue("_tegataReceivablesHolding")
    TEGATA_RECEIVABLES_HOLDING("_tegataReceivablesHolding"),
    @XmlEnumValue("_transferOrderClosed")
    TRANSFER_ORDER_CLOSED("_transferOrderClosed"),
    @XmlEnumValue("_transferOrderPartiallyFulfilled")
    TRANSFER_ORDER_PARTIALLY_FULFILLED("_transferOrderPartiallyFulfilled"),
    @XmlEnumValue("_transferOrderPendingApproval")
    TRANSFER_ORDER_PENDING_APPROVAL("_transferOrderPendingApproval"),
    @XmlEnumValue("_transferOrderPendingFulfillment")
    TRANSFER_ORDER_PENDING_FULFILLMENT("_transferOrderPendingFulfillment"),
    @XmlEnumValue("_transferOrderPendingReceipt")
    TRANSFER_ORDER_PENDING_RECEIPT("_transferOrderPendingReceipt"),
    @XmlEnumValue("_transferOrderPendingReceiptPartiallyFulfilled")
    TRANSFER_ORDER_PENDING_RECEIPT_PARTIALLY_FULFILLED("_transferOrderPendingReceiptPartiallyFulfilled"),
    @XmlEnumValue("_transferOrderReceived")
    TRANSFER_ORDER_RECEIVED("_transferOrderReceived"),
    @XmlEnumValue("_transferOrderRejected")
    TRANSFER_ORDER_REJECTED("_transferOrderRejected"),
    @XmlEnumValue("_vendorReturnAuthorizationCancelled")
    VENDOR_RETURN_AUTHORIZATION_CANCELLED("_vendorReturnAuthorizationCancelled"),
    @XmlEnumValue("_vendorReturnAuthorizationClosed")
    VENDOR_RETURN_AUTHORIZATION_CLOSED("_vendorReturnAuthorizationClosed"),
    @XmlEnumValue("_vendorReturnAuthorizationCredited")
    VENDOR_RETURN_AUTHORIZATION_CREDITED("_vendorReturnAuthorizationCredited"),
    @XmlEnumValue("_vendorReturnAuthorizationPartiallyReturned")
    VENDOR_RETURN_AUTHORIZATION_PARTIALLY_RETURNED("_vendorReturnAuthorizationPartiallyReturned"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingApproval")
    VENDOR_RETURN_AUTHORIZATION_PENDING_APPROVAL("_vendorReturnAuthorizationPendingApproval"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingCredit")
    VENDOR_RETURN_AUTHORIZATION_PENDING_CREDIT("_vendorReturnAuthorizationPendingCredit"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingCreditPartiallyReturned")
    VENDOR_RETURN_AUTHORIZATION_PENDING_CREDIT_PARTIALLY_RETURNED("_vendorReturnAuthorizationPendingCreditPartiallyReturned"),
    @XmlEnumValue("_vendorReturnAuthorizationPendingReturn")
    VENDOR_RETURN_AUTHORIZATION_PENDING_RETURN("_vendorReturnAuthorizationPendingReturn"),
    @XmlEnumValue("_workOrderBuilt")
    WORK_ORDER_BUILT("_workOrderBuilt"),
    @XmlEnumValue("_workOrderCancelled")
    WORK_ORDER_CANCELLED("_workOrderCancelled"),
    @XmlEnumValue("_workOrderClosed")
    WORK_ORDER_CLOSED("_workOrderClosed"),
    @XmlEnumValue("_workOrderPartiallyBuilt")
    WORK_ORDER_PARTIALLY_BUILT("_workOrderPartiallyBuilt"),
    @XmlEnumValue("_workOrderPendingBuild")
    WORK_ORDER_PENDING_BUILD("_workOrderPendingBuild");
    private final String value;

    TransactionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionStatus fromValue(String v) {
        for (TransactionStatus c: TransactionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
