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

import org.mule.module.netsuite.api.model.entity.RecordId;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

public final class RecordIds
{
    private RecordIds()
    {
    }

    public static RecordId from(@NotNull String id, @NotNull RecordIdType recordIdType)
    {
        Validate.notEmpty(id);
        Validate.notNull(recordIdType);
        return recordIdType.newId(id);
    }

    public static RecordId nullSafeFrom(String id, RecordIdType recordIdType)
    {
        return id != null ? from(id, recordIdType) : null;
    }
}
