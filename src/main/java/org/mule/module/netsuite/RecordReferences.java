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

import org.mule.module.netsuite.api.model.entity.RecordReference;

import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

/**
 * Utility class for creating {@link RecordReferences} from connector arguments
 */
public final class RecordReferences
{
    private RecordReferences()
    {
    }

    public static RecordReference from(@NotNull RecordType recordType,
                                       @NotNull String id,
                                       @NotNull RecordIdType idType)
    {
        return new RecordReference(RecordIds.from(id, idType), recordType);
    }

    public static RecordReference nulSafeFrom(@NotNull RecordType recordType,
                                              @NotNull String id,
                                              @NotNull RecordIdType idType)
    {
        return recordType != null ? from(recordType, id, idType)// 
                                 : fromNull(id, idType);
    }

    private static RecordReference fromNull(String id, RecordIdType idType)
    {
        Validate.isTrue(id == null, "Must specify recordType");
        return null;
    }

}
