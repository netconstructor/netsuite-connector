/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.annotation;

import org.mule.module.netsuite.api.SoapNetSuiteClient;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Metadata of a {@link SoapNetSuiteClient} Method
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface NetSuiteOperation
{
    /**
     * @return the name of the attribute of the operation response that represent the
     *         response wrapper object, in CamelCase
     */
    String responseName() default "WriteResponse";

    /**
     * @return the name of the attribute of the response wrapper object that
     *         represents the actual meaningful result of the operation, in CamelCase
     */
    String resultName() default "";

    ReturnType resultType() default ReturnType.VOID;

    /**
     * @return if return types of operation should be adapted. responseName,
     *         resultName and resultType have only sense if adapt is set to true
     */
    boolean adapt() default true;

}
