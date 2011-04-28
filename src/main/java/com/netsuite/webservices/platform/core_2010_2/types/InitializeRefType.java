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
 * <p>Java class for InitializeRefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InitializeRefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="assemblyBuild"/>
 *     &lt;enumeration value="cashSale"/>
 *     &lt;enumeration value="creditMemo"/>
 *     &lt;enumeration value="customer"/>
 *     &lt;enumeration value="customerDeposit"/>
 *     &lt;enumeration value="employee"/>
 *     &lt;enumeration value="estimate"/>
 *     &lt;enumeration value="interCompanyTransferOrder"/>
 *     &lt;enumeration value="invoice"/>
 *     &lt;enumeration value="opportunity"/>
 *     &lt;enumeration value="purchaseOrder"/>
 *     &lt;enumeration value="returnAuthorization"/>
 *     &lt;enumeration value="salesOrder"/>
 *     &lt;enumeration value="transferOrder"/>
 *     &lt;enumeration value="vendor"/>
 *     &lt;enumeration value="vendorBill"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InitializeRefType", namespace = "urn:types.core_2010_2.platform.webservices.netsuite.com")
@XmlEnum
public enum InitializeRefType {

    @XmlEnumValue("assemblyBuild")
    ASSEMBLY_BUILD("assemblyBuild"),
    @XmlEnumValue("cashSale")
    CASH_SALE("cashSale"),
    @XmlEnumValue("creditMemo")
    CREDIT_MEMO("creditMemo"),
    @XmlEnumValue("customer")
    CUSTOMER("customer"),
    @XmlEnumValue("customerDeposit")
    CUSTOMER_DEPOSIT("customerDeposit"),
    @XmlEnumValue("employee")
    EMPLOYEE("employee"),
    @XmlEnumValue("estimate")
    ESTIMATE("estimate"),
    @XmlEnumValue("interCompanyTransferOrder")
    INTER_COMPANY_TRANSFER_ORDER("interCompanyTransferOrder"),
    @XmlEnumValue("invoice")
    INVOICE("invoice"),
    @XmlEnumValue("opportunity")
    OPPORTUNITY("opportunity"),
    @XmlEnumValue("purchaseOrder")
    PURCHASE_ORDER("purchaseOrder"),
    @XmlEnumValue("returnAuthorization")
    RETURN_AUTHORIZATION("returnAuthorization"),
    @XmlEnumValue("salesOrder")
    SALES_ORDER("salesOrder"),
    @XmlEnumValue("transferOrder")
    TRANSFER_ORDER("transferOrder"),
    @XmlEnumValue("vendor")
    VENDOR("vendor"),
    @XmlEnumValue("vendorBill")
    VENDOR_BILL("vendorBill");
    private final String value;

    InitializeRefType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InitializeRefType fromValue(String v) {
        for (InitializeRefType c: InitializeRefType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
