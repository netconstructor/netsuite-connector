
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_assemblyBuild"/>
 *     &lt;enumeration value="_assemblyUnbuild"/>
 *     &lt;enumeration value="_cashRefund"/>
 *     &lt;enumeration value="_cashSale"/>
 *     &lt;enumeration value="_check"/>
 *     &lt;enumeration value="_creditMemo"/>
 *     &lt;enumeration value="_customerDeposit"/>
 *     &lt;enumeration value="_customerPayment"/>
 *     &lt;enumeration value="_customerRefund"/>
 *     &lt;enumeration value="_depositApplication"/>
 *     &lt;enumeration value="_estimate"/>
 *     &lt;enumeration value="_expenseReport"/>
 *     &lt;enumeration value="_inventoryAdjustment"/>
 *     &lt;enumeration value="_invoice"/>
 *     &lt;enumeration value="_itemFulfillment"/>
 *     &lt;enumeration value="_itemReceipt"/>
 *     &lt;enumeration value="_journal"/>
 *     &lt;enumeration value="_opportunity"/>
 *     &lt;enumeration value="_purchaseOrder"/>
 *     &lt;enumeration value="_returnAuthorization"/>
 *     &lt;enumeration value="_salesOrder"/>
 *     &lt;enumeration value="_transferOrder"/>
 *     &lt;enumeration value="_vendorBill"/>
 *     &lt;enumeration value="_vendorPayment"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionType", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionType {

    @XmlEnumValue("_assemblyBuild")
    ASSEMBLY_BUILD("_assemblyBuild"),
    @XmlEnumValue("_assemblyUnbuild")
    ASSEMBLY_UNBUILD("_assemblyUnbuild"),
    @XmlEnumValue("_cashRefund")
    CASH_REFUND("_cashRefund"),
    @XmlEnumValue("_cashSale")
    CASH_SALE("_cashSale"),
    @XmlEnumValue("_check")
    CHECK("_check"),
    @XmlEnumValue("_creditMemo")
    CREDIT_MEMO("_creditMemo"),
    @XmlEnumValue("_customerDeposit")
    CUSTOMER_DEPOSIT("_customerDeposit"),
    @XmlEnumValue("_customerPayment")
    CUSTOMER_PAYMENT("_customerPayment"),
    @XmlEnumValue("_customerRefund")
    CUSTOMER_REFUND("_customerRefund"),
    @XmlEnumValue("_depositApplication")
    DEPOSIT_APPLICATION("_depositApplication"),
    @XmlEnumValue("_estimate")
    ESTIMATE("_estimate"),
    @XmlEnumValue("_expenseReport")
    EXPENSE_REPORT("_expenseReport"),
    @XmlEnumValue("_inventoryAdjustment")
    INVENTORY_ADJUSTMENT("_inventoryAdjustment"),
    @XmlEnumValue("_invoice")
    INVOICE("_invoice"),
    @XmlEnumValue("_itemFulfillment")
    ITEM_FULFILLMENT("_itemFulfillment"),
    @XmlEnumValue("_itemReceipt")
    ITEM_RECEIPT("_itemReceipt"),
    @XmlEnumValue("_journal")
    JOURNAL("_journal"),
    @XmlEnumValue("_opportunity")
    OPPORTUNITY("_opportunity"),
    @XmlEnumValue("_purchaseOrder")
    PURCHASE_ORDER("_purchaseOrder"),
    @XmlEnumValue("_returnAuthorization")
    RETURN_AUTHORIZATION("_returnAuthorization"),
    @XmlEnumValue("_salesOrder")
    SALES_ORDER("_salesOrder"),
    @XmlEnumValue("_transferOrder")
    TRANSFER_ORDER("_transferOrder"),
    @XmlEnumValue("_vendorBill")
    VENDOR_BILL("_vendorBill"),
    @XmlEnumValue("_vendorPayment")
    VENDOR_PAYMENT("_vendorPayment");
    private final String value;

    TransactionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionType fromValue(String v) {
        for (TransactionType c: TransactionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
