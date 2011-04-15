/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.entity;

import org.mule.module.netsuite.api.internal.RecordRef;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

public class EntityReference
{
    private final EntityId id;
    private final EntityType type;

    public EntityReference(@NotNull EntityId id, @NotNull EntityType type)
    {
        Validate.notNull(id);
        Validate.notNull(type);
        this.id = id;
        this.type = type;
    }

    @NotNull
    public RecordRef createRecordRef()
    {
        RecordRef recordRef = new RecordRef();
        recordRef.setType(type.getType());
        id.populate(recordRef);
        return recordRef;
    }

}
