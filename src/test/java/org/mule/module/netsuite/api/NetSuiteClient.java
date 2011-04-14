/**
 * Mule S3 Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import org.mule.module.netsuite.api.entity.EntityReference;
import org.mule.module.netsuite.api.entity.EntityType;

import java.util.List;

import javax.validation.constraints.NotNull;

/**
 * A NetSuite facade
 * 
 * @author flbulgarelli
 */
public interface NetSuiteClient
{
    Object getEntity(@NotNull EntityReference sourceEntity);

    @NotNull
    List<Object> getDeletedEntity(@NotNull EntityType type, @NotNull String whenExpression);

    void attachEntity(@NotNull EntityReference sourceEntity, @NotNull EntityReference destinationEntity);

    void dettachEntity(@NotNull EntityReference sourceEntity, @NotNull EntityReference destinationEntity);

    void deleteEntity(@NotNull EntityReference entity);

    @NotNull
    List<Object> listEntities(@NotNull EntityType type);
}
