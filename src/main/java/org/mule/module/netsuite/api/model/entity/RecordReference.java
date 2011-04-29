/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.entity;

import com.netsuite.webservices.platform.core_2010_2.InitializeRef;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.types.InitializeRefType;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.Validate;

public class RecordReference
{
    private final RecordId id;
    private final RecordType type;

    public RecordReference(@NotNull RecordId id, @NotNull RecordType type)
    {
        Validate.notNull(id);
        Validate.notNull(type);
        this.id = id;
        this.type = type;
    }

    @NotNull
    public RecordRef createRef()
    {
        RecordRef recordRef = id.createRef();
        recordRef.setType(type);
        return recordRef;
    }
    
    public InitializeRef createInitializeRef()
    {
        InitializeRef initializeRef = id.createInitializeRef();
        initializeRef.setType(InitializeRefType.fromValue(type.value()));
        return initializeRef;
    }
    
    
    public RecordType getType()
    {
        return type;
    }

    public RecordId getId()
    {
        return id;
    }


}
