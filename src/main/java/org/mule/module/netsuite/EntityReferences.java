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

/**
 * Utility class for creating {@link EntityReferences} from connector arguments
 */
public final class EntityReferences
{
    private EntityReferences()
    {
    }

    public static RecordReference from(@NotNull RecordType entityType, String internalId, String externalId)
    {
        return new RecordReference(RecordIds.from(internalId, externalId), entityType);
    }

    public static RecordReference nulSafeFrom(RecordType contanctRecordType,
                                              String contanctInternalId,
                                              String contanctExternalId)
    {
        return contanctRecordType != null
                                         ? from(contanctRecordType, contanctInternalId, contanctExternalId)
                                         : null;
    }

}
