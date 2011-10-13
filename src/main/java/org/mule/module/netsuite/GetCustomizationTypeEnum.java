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

import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;


public enum GetCustomizationTypeEnum
{
    CRM_CUSTOM_FIELD(GetCustomizationType.CRM_CUSTOM_FIELD),
    CUSTOM_LIST(GetCustomizationType.    CUSTOM_LIST),
    CUSTOM_RECORD_TYPE(GetCustomizationType.    CUSTOM_RECORD_TYPE),
    ENTITY_CUSTOM_FIELD(GetCustomizationType.    ENTITY_CUSTOM_FIELD),
    ITEM_CUSTOM_FIELD(GetCustomizationType.    ITEM_CUSTOM_FIELD),
    ITEM_NUMBER_CUSTOM_FIELD(GetCustomizationType.    ITEM_NUMBER_CUSTOM_FIELD),
    ITEM_OPTION_CUSTOM_FIELD(GetCustomizationType.    ITEM_OPTION_CUSTOM_FIELD),
    OTHER_CUSTOM_FIELD(GetCustomizationType.    OTHER_CUSTOM_FIELD),
    TRANSACTION_BODY_CUSTOM_FIELD(GetCustomizationType.    TRANSACTION_BODY_CUSTOM_FIELD),
    TRANSACTION_COLUMN_CUSTOM_FIELD(GetCustomizationType.TRANSACTION_COLUMN_CUSTOM_FIELD);
    
    private GetCustomizationType getCustomizationType;

    private GetCustomizationTypeEnum(GetCustomizationType getCustomizationType)
    {
        this.getCustomizationType = getCustomizationType;
    }

    public GetCustomizationType toGetGetGetCustomizationType()
    {
        return getCustomizationType;
    }

}


