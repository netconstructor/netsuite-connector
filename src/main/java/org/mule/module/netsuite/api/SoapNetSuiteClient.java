/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api;

import org.mule.module.netsuite.api.annotation.NetSuiteOperation;
import org.mule.module.netsuite.api.annotation.ReturnType;
import org.mule.module.netsuite.api.model.entity.EntityId;
import org.mule.module.netsuite.api.model.entity.EntityReference;

import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

import javax.validation.constraints.NotNull;

public interface SoapNetSuiteClient extends NetSuiteClient<Object, Exception, Object>
{

    @NetSuiteOperation
    Object attachEntity(@NotNull EntityReference sourceEntity,
                        @NotNull EntityReference destinationEntity,
                        EntityReference contactEntity) throws Exception;

    @NetSuiteOperation
    Object deleteEntity(EntityReference entity) throws Exception;

    @NetSuiteOperation
    Object detachEntity(@NotNull EntityReference sourceEntity, @NotNull EntityReference destinationEntity)
        throws Exception;

    @NetSuiteOperation(responseName = "GetDeletedResult", resultName = "DeletedRecord", resultType = ReturnType.LIST)
    Object getDeletedEntity(RecordType type, String whenExpression) throws Exception;

    @NetSuiteOperation(responseName = "ReadResponse", resultName = "Record", resultType = ReturnType.RECORD)
    Object getEntity(EntityReference entity) throws Exception;

    @NetSuiteOperation(responseName = "GetAllResult", resultName = "Record", resultType = ReturnType.LIST)
    Object getEntities(RecordType type) throws Exception;

    @NetSuiteOperation(responseName = "GetBudgetExchangeRateResult", resultName = "BudgetExchangeRate", resultType = ReturnType.LIST)
    Object getBudgetExchangeRate(@NotNull EntityId period,
                                 @NotNull EntityId fromSubsidiary,
                                 EntityId toSubsidiary) throws Exception;

    @NetSuiteOperation(responseName = "GetConsolidatedExchangeRateResult", resultName = "ConsolidatedExchangeRate", resultType = ReturnType.LIST)
    Object getConsolidatedExchangeRate(@NotNull EntityId period,
                                       @NotNull EntityId fromSubsidiary,
                                       EntityId toSubsidiary) throws Exception;

    @NetSuiteOperation(responseName = "GetCustomizationIdResult", resultName = "CustomizationRef", resultType = ReturnType.LIST)
    Object getCustomizationId(@NotNull RecordType type, boolean includeInactives) throws Exception;

    @NetSuiteOperation(responseName = "GetSavedSearchResult", resultName = "RecordRef", resultType = ReturnType.LIST)
    Object getItemAvailability() throws Exception;

    @NetSuiteOperation(responseName = "GetSavedSearchResult", resultName = "RecordRef", resultType = ReturnType.LIST)
    Object getSavedSearch(@NotNull RecordType type) throws Exception;

    @NetSuiteOperation(responseName = "GetServerTimeResult", resultName = "ServerTime", resultType = ReturnType.RECORD)
    Object getServerTime() throws Exception;

    @NetSuiteOperation
    Object updateInviteeStatus(@NotNull EntityReference entity, @NotNull CalendarEventAttendeeResponse status)
        throws Exception;

}
