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

/**
 * Interface for working with reference-like netsuite soap objects
 * @author flbulgarelli
 */
public interface NetsuiteReference
{
    /**
     * Sets the value of the internalId property.
     * 
     * @param value allowed object is {@link String }
     */
    void setInternalId(String value);

    /**
     * Sets the value of the externalId property.
     * 
     * @param value allowed object is {@link String }
     */
    void setExternalId(String value);

}
