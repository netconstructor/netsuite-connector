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

import org.mule.module.netsuite.api.internal.RecordRef;

import org.apache.commons.lang.Validate;

public interface EntityId
{
    RecordRef createRef();

    abstract class AbstractId implements EntityId
    {
        private final String id;

        public AbstractId(String id)
        {
            Validate.notNull(id);
            this.id = id;
        }

        public RecordRef createRef()
        {
            RecordRef recordRef = new RecordRef();
            populate(recordRef);
            return recordRef;
        }

        abstract void populate(RecordRef recordRef);

        public String getId()
        {
            return id;
        }
    }

    class ExternalId extends AbstractId
    {

        public ExternalId(String id)
        {
            super(id);
        }

        public void populate(RecordRef recordRef)
        {
            recordRef.setExternalId(getId());
        }
    }

    class InternalId extends AbstractId
    {

        public InternalId(String id)
        {
            super(id);
        }

        public void populate(RecordRef recordRef)
        {
            recordRef.setInternalId(getId());
        }
    }

}
