/*
 * $Id$
 * --------------------------------------------------------------------------------------
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.event;

import static org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse._accepted;
import static org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse._declined;
import static org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse._noResponse;
import static org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse._tentative;

import org.mule.module.netsuite.api.internal.CalendarEventAttendeeResponse;

public enum EventAttendeeStatus
{
    ACCEPTED(_accepted), // 
    DECLINED(_declined), // 
    NO_RESPONSE(_noResponse), // 
    TENTATIVE(_tentative);

    private CalendarEventAttendeeResponse attendeeResponse;

    private EventAttendeeStatus(CalendarEventAttendeeResponse attendeeResponse)
    {
        this.attendeeResponse = attendeeResponse;
    }

    public CalendarEventAttendeeResponse getCalendarEventAttendeeResponse()
    {
        return attendeeResponse;
    }

}
