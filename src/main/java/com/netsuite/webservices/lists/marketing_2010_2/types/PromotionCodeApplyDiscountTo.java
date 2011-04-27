
package com.netsuite.webservices.lists.marketing_2010_2.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PromotionCodeApplyDiscountTo.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PromotionCodeApplyDiscountTo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="_allSales"/>
 *     &lt;enumeration value="_firstSaleOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PromotionCodeApplyDiscountTo", namespace = "urn:types.marketing_2010_2.lists.webservices.netsuite.com")
@XmlEnum
public enum PromotionCodeApplyDiscountTo {

    @XmlEnumValue("_allSales")
    ALL_SALES("_allSales"),
    @XmlEnumValue("_firstSaleOnly")
    FIRST_SALE_ONLY("_firstSaleOnly");
    private final String value;

    PromotionCodeApplyDiscountTo(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PromotionCodeApplyDiscountTo fromValue(String v) {
        for (PromotionCodeApplyDiscountTo c: PromotionCodeApplyDiscountTo.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
