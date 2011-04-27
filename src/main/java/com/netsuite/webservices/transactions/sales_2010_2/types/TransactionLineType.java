
package com.netsuite.webservices.transactions.sales_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionLineType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionLineType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_billExchangeRateVariance"/>
 *     &lt;enumeration value="_billPriceVariance"/>
 *     &lt;enumeration value="_billQuantityVariance"/>
 *     &lt;enumeration value="_gainLoss"/>
 *     &lt;enumeration value="_item"/>
 *     &lt;enumeration value="_receiving"/>
 *     &lt;enumeration value="_shipping"/>
 *     &lt;enumeration value="_totalBillVariance"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionLineType", namespace = "urn:types.sales_2010_2.transactions.webservices.netsuite.com")
@XmlEnum
public enum TransactionLineType {

    @XmlEnumValue("_billExchangeRateVariance")
    BILL_EXCHANGE_RATE_VARIANCE("_billExchangeRateVariance"),
    @XmlEnumValue("_billPriceVariance")
    BILL_PRICE_VARIANCE("_billPriceVariance"),
    @XmlEnumValue("_billQuantityVariance")
    BILL_QUANTITY_VARIANCE("_billQuantityVariance"),
    @XmlEnumValue("_gainLoss")
    GAIN_LOSS("_gainLoss"),
    @XmlEnumValue("_item")
    ITEM("_item"),
    @XmlEnumValue("_receiving")
    RECEIVING("_receiving"),
    @XmlEnumValue("_shipping")
    SHIPPING("_shipping"),
    @XmlEnumValue("_totalBillVariance")
    TOTAL_BILL_VARIANCE("_totalBillVariance");
    private final String value;

    TransactionLineType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TransactionLineType fromValue(String v) {
        for (TransactionLineType c: TransactionLineType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
