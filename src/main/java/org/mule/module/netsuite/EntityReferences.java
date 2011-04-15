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

import org.mule.module.netsuite.api.model.entity.EntityReference;
import org.mule.module.netsuite.api.model.entity.EntityType;
import org.mule.module.netsuite.api.model.entity.EntityId.ExternalId;
import org.mule.module.netsuite.api.model.entity.EntityId.InternalId;

import javax.validation.constraints.NotNull;

/**
 * Utility class for creating {@link EntityReferences} from connector arguments
 */
public final class EntityReferences
{
    private EntityReferences()
    {
    }

    public static EntityReference from(@NotNull EntityType entityType, String internalId, String externalId)
    {
        return new EntityReference(//
            internalId != null ? new InternalId(internalId) : new ExternalId(externalId), entityType);
    }

}
