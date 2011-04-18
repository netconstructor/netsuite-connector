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

import static org.junit.Assert.*;

import org.mule.module.netsuite.api.internal.RecordRef;
import org.mule.module.netsuite.api.model.entity.EntityReference;
import org.mule.module.netsuite.api.model.entity.EntityType;

import org.junit.Test;

public class EntityReferencesUnitTest
{

    @Test
    public void testFromInternalId()
    {
        String internalId = "A123";
        RecordRef ref = EntityReferences.from(EntityType.ACCOUNT, internalId, null).createRef();
        assertEquals(internalId, ref.getInternalId());
        assertEquals(EntityType.ACCOUNT.getType(), ref.getType());
        assertNull(ref.getExternalId());
    }

    @Test
    public void testFromExternalId()
    {
        String externalId = "A123";
        RecordRef ref = EntityReferences.from(EntityType.ACCOUNT, null, externalId).createRef();
        assertEquals(externalId, ref.getExternalId());
        assertNull(ref.getInternalId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromBadInputId()
    {
        EntityReferences.from(EntityType.ACCOUNT, null, null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromBadInputType()
    {
        EntityReferences.from(null, "A126", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromTwoIds()
    {
        EntityReferences.from(EntityType.ASSEMBLY_UNBUILD, "A126", "EFR5");
    }

}
