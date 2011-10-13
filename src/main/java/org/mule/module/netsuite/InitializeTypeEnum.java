/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite;

import com.netsuite.webservices.platform.core_2010_2.types.InitializeType;

public enum InitializeTypeEnum
{
    ASSEMBLY_UNBUILD(InitializeType.ASSEMBLY_UNBUILD),
    CASH_REFUND(InitializeType.CASH_REFUND),
    CASH_SALE(InitializeType.CASH_SALE),
    CREDIT_MEMO(InitializeType.CREDIT_MEMO),
    CUSTOMER_PAYMENT(InitializeType.CUSTOMER_PAYMENT),
    CUSTOMER_REFUND(InitializeType.CUSTOMER_REFUND),
    DEPOSIT_APPLICATION(InitializeType.DEPOSIT_APPLICATION),
    ESTIMATE(InitializeType.ESTIMATE),
    INVOICE(InitializeType.INVOICE),
    ITEM_FULFILLMENT(InitializeType.ITEM_FULFILLMENT),
    ITEM_RECEIPT(InitializeType.ITEM_RECEIPT),
    RETURN_AUTHORIZATION(InitializeType.RETURN_AUTHORIZATION),
    SALES_ORDER(InitializeType.SALES_ORDER),
    VENDOR_BILL(InitializeType.VENDOR_BILL),
    VENDOR_PAYMENT(InitializeType.VENDOR_PAYMENT);
    
    private final InitializeType initializeType;

    private InitializeTypeEnum(InitializeType initializeType)
    {
        this.initializeType = initializeType;
    }

    public InitializeType toInitializeType()
    {
        return initializeType;
    }

}


