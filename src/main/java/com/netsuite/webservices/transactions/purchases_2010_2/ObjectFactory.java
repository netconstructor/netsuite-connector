
package com.netsuite.webservices.transactions.purchases_2010_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.transactions.purchases_2010_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PurchaseOrder_QNAME = new QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "PurchaseOrder");
    private final static QName _VendorPayment_QNAME = new QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "vendorPayment");
    private final static QName _ItemReceipt_QNAME = new QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "ItemReceipt");
    private final static QName _VendorBill_QNAME = new QName("urn:purchases_2010_2.transactions.webservices.netsuite.com", "VendorBill");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.transactions.purchases_2010_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VendorBill }
     * 
     */
    public VendorBill createVendorBill() {
        return new VendorBill();
    }

    /**
     * Create an instance of {@link PurchaseOrderItemList }
     * 
     */
    public PurchaseOrderItemList createPurchaseOrderItemList() {
        return new PurchaseOrderItemList();
    }

    /**
     * Create an instance of {@link VendorPaymentCredit }
     * 
     */
    public VendorPaymentCredit createVendorPaymentCredit() {
        return new VendorPaymentCredit();
    }

    /**
     * Create an instance of {@link VendorBillItem }
     * 
     */
    public VendorBillItem createVendorBillItem() {
        return new VendorBillItem();
    }

    /**
     * Create an instance of {@link ItemReceiptItem }
     * 
     */
    public ItemReceiptItem createItemReceiptItem() {
        return new ItemReceiptItem();
    }

    /**
     * Create an instance of {@link VendorPaymentApplyList }
     * 
     */
    public VendorPaymentApplyList createVendorPaymentApplyList() {
        return new VendorPaymentApplyList();
    }

    /**
     * Create an instance of {@link PurchaseOrder }
     * 
     */
    public PurchaseOrder createPurchaseOrder() {
        return new PurchaseOrder();
    }

    /**
     * Create an instance of {@link VendorBillItemList }
     * 
     */
    public VendorBillItemList createVendorBillItemList() {
        return new VendorBillItemList();
    }

    /**
     * Create an instance of {@link ItemReceiptExpenseList }
     * 
     */
    public ItemReceiptExpenseList createItemReceiptExpenseList() {
        return new ItemReceiptExpenseList();
    }

    /**
     * Create an instance of {@link ItemReceiptItemList }
     * 
     */
    public ItemReceiptItemList createItemReceiptItemList() {
        return new ItemReceiptItemList();
    }

    /**
     * Create an instance of {@link PurchLandedCostList }
     * 
     */
    public PurchLandedCostList createPurchLandedCostList() {
        return new PurchLandedCostList();
    }

    /**
     * Create an instance of {@link VendorBillExpense }
     * 
     */
    public VendorBillExpense createVendorBillExpense() {
        return new VendorBillExpense();
    }

    /**
     * Create an instance of {@link ItemReceipt }
     * 
     */
    public ItemReceipt createItemReceipt() {
        return new ItemReceipt();
    }

    /**
     * Create an instance of {@link VendorBillExpenseList }
     * 
     */
    public VendorBillExpenseList createVendorBillExpenseList() {
        return new VendorBillExpenseList();
    }

    /**
     * Create an instance of {@link PurchaseOrderExpense }
     * 
     */
    public PurchaseOrderExpense createPurchaseOrderExpense() {
        return new PurchaseOrderExpense();
    }

    /**
     * Create an instance of {@link VendorPaymentApply }
     * 
     */
    public VendorPaymentApply createVendorPaymentApply() {
        return new VendorPaymentApply();
    }

    /**
     * Create an instance of {@link PurchaseOrderExpenseList }
     * 
     */
    public PurchaseOrderExpenseList createPurchaseOrderExpenseList() {
        return new PurchaseOrderExpenseList();
    }

    /**
     * Create an instance of {@link VendorPayment }
     * 
     */
    public VendorPayment createVendorPayment() {
        return new VendorPayment();
    }

    /**
     * Create an instance of {@link ItemReceiptExpense }
     * 
     */
    public ItemReceiptExpense createItemReceiptExpense() {
        return new ItemReceiptExpense();
    }

    /**
     * Create an instance of {@link PurchaseOrderItem }
     * 
     */
    public PurchaseOrderItem createPurchaseOrderItem() {
        return new PurchaseOrderItem();
    }

    /**
     * Create an instance of {@link VendorPaymentCreditList }
     * 
     */
    public VendorPaymentCreditList createVendorPaymentCreditList() {
        return new VendorPaymentCreditList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PurchaseOrder }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2010_2.transactions.webservices.netsuite.com", name = "PurchaseOrder")
    public JAXBElement<PurchaseOrder> createPurchaseOrder(PurchaseOrder value) {
        return new JAXBElement<PurchaseOrder>(_PurchaseOrder_QNAME, PurchaseOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2010_2.transactions.webservices.netsuite.com", name = "vendorPayment")
    public JAXBElement<VendorPayment> createVendorPayment(VendorPayment value) {
        return new JAXBElement<VendorPayment>(_VendorPayment_QNAME, VendorPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemReceipt }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2010_2.transactions.webservices.netsuite.com", name = "ItemReceipt")
    public JAXBElement<ItemReceipt> createItemReceipt(ItemReceipt value) {
        return new JAXBElement<ItemReceipt>(_ItemReceipt_QNAME, ItemReceipt.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VendorBill }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:purchases_2010_2.transactions.webservices.netsuite.com", name = "VendorBill")
    public JAXBElement<VendorBill> createVendorBill(VendorBill value) {
        return new JAXBElement<VendorBill>(_VendorBill_QNAME, VendorBill.class, null, value);
    }

}
