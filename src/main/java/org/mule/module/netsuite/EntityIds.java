/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite;

import org.mule.module.netsuite.api.model.entity.EntityId;
import org.mule.module.netsuite.api.model.entity.EntityId.ExternalId;
import org.mule.module.netsuite.api.model.entity.EntityId.InternalId;

import org.apache.commons.lang.Validate;

public class EntityIds
{
    public static EntityId from(String internalId, String externalId)
    {
        Validate.isTrue((internalId == null) != (externalId == null), "Must specify one and only one id");
        return internalId != null ? new InternalId(internalId) : new ExternalId(externalId);
    }

    public static EntityId nullSafeFrom(String internalId, String externalId)
    {
        return internalId == null && externalId == null ? null : from(internalId, externalId);
    }
}
