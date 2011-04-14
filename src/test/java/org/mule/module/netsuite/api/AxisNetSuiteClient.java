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
import org.mule.module.netsuite.api.internal.ExceededRecordCountFault;
import org.mule.module.netsuite.api.internal.ExceededRequestLimitFault;
import org.mule.module.netsuite.api.internal.ExceededRequestSizeFault;
import org.mule.module.netsuite.api.internal.ExceededUsageLimitFault;
import org.mule.module.netsuite.api.internal.InvalidCredentialsFault;
import org.mule.module.netsuite.api.internal.InvalidSessionFault;
import org.mule.module.netsuite.api.internal.NetSuitePortType;
import org.mule.module.netsuite.api.internal.UnexpectedErrorFault;

import java.rmi.RemoteException;
import java.util.List;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang.NotImplementedException;
import org.apache.commons.lang.Validate;

public class AxisNetSuiteClient implements NetSuiteClient
{
    private final AxisPortProvider portProvider;

    public AxisNetSuiteClient(@NotNull AxisPortProvider portProvider)
    {
        Validate.notNull(portProvider);
        this.portProvider = portProvider;
    }

    public void attachEntity(EntityReference sourceEntity, EntityReference destinationEntity)
    {
        // TODO Auto-generated method stub

    }

    public void deleteEntity(EntityReference entity)
    {
        // TODO Auto-generated method stub

    }

    public void dettachEntity(EntityReference sourceEntity, EntityReference destinationEntity)
    {
        // TODO Auto-generated method stub

    }

    public List<Object> getDeletedEntity(EntityType type, String whenExpression)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public Object getEntity(EntityReference entity)
    {
        try
        {
            return getAuthenticatedPort().get(entity.createRecordRef());
        }
        catch (ExceededRequestSizeFault e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvalidCredentialsFault e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExceededUsageLimitFault e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExceededRequestLimitFault e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (ExceededRecordCountFault e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (UnexpectedErrorFault e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvalidSessionFault e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (RemoteException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        throw new NotImplementedException("Exception handling is not implemented yet");
    }

    public List<Object> listEntities(EntityType type)
    {
        // TODO Auto-generated method stub
        return null;
    }

    public NetSuitePortType getAuthenticatedPort() throws RemoteException
    {
        return portProvider.getAuthenticatedPort();
    }

    
    
}
