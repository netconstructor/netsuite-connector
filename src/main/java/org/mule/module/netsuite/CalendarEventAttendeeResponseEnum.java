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

import com.netsuite.webservices.platform.core_2010_2.types.CalendarEventAttendeeResponse;

public enum CalendarEventAttendeeResponseEnum
{
    ACCEPTED(CalendarEventAttendeeResponse.ACCEPTED),
    DECLINED(CalendarEventAttendeeResponse.DECLINED),
    NO_RESPONSE(CalendarEventAttendeeResponse.NO_RESPONSE),
    TENTATIVE(CalendarEventAttendeeResponse.TENTATIVE);
    
    private final CalendarEventAttendeeResponse value;
    
    private CalendarEventAttendeeResponseEnum(CalendarEventAttendeeResponse value)
    {
        this.value = value;
    }

    public CalendarEventAttendeeResponse toCalendarEventAttendeeResponse()
    {
        return value;
    }

}


