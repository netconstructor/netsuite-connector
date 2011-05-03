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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.types.RecordType;

import org.junit.Test;

/**
 * Test for {@link RecordReferences}
 * 
 * @author flbulgarelli
 */
public class RecordReferencesUnitTest
{

    @Test
    public void testFromInternalId()
    {
        String internalId = "A123";
        RecordRef ref = RecordReferences.from(RecordType.ACCOUNT, internalId, RecordIdType.INTERNAL).createRef();
        assertEquals(internalId, ref.getInternalId());
        assertEquals(RecordType.ACCOUNT, ref.getType());
        assertNull(ref.getExternalId());
    }

    @Test
    public void testFromExternalId()
    {
        String externalId = "A123";
        RecordRef ref = RecordReferences.from(RecordType.ACCOUNT, externalId, RecordIdType.EXTERNAL).createRef();
        assertEquals(externalId, ref.getExternalId());
        assertNull(ref.getInternalId());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromBadInputId()
    {
        RecordReferences.from(RecordType.ACCOUNT, null, RecordIdType.INTERNAL);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFromBadInputType()
    {
        RecordReferences.from(null, "A126", RecordIdType.INTERNAL);
    }

    @Test
    public void nullSafeFromNull() throws Exception
    {
        assertNull(RecordReferences.nulSafeFrom(null, null, null));
    }

    @Test
    public void nullSafeFromNotNull() throws Exception
    {
        assertNotNull(RecordReferences.nulSafeFrom(RecordType.ASSEMBLY_UNBUILD, "A126", RecordIdType.INTERNAL));
    }

    @Test(expected = IllegalArgumentException.class)
    public void nullSafeFromNotIllegalArgument() throws Exception
    {
        RecordReferences.nulSafeFrom(null, "A126", null);
    }

}
