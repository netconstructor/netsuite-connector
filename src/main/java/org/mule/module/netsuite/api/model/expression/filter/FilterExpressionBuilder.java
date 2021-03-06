/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.module.netsuite.api.model.expression.filter;

import static org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod;
import static org.mule.module.netsuite.api.model.expression.Quotes.removeQuotesIfPresent;

import org.mule.module.netsuite.api.model.expression.PropertyAccess;
import org.mule.module.netsuite.api.model.expression.Quotes;

import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.platform.core_2010_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.collections.Transformer;
import org.apache.commons.collections.TransformerUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;

public class FilterExpressionBuilder
{
    private SearchRecord target;
    private SearchRecord basic;

    public void setTarget(SearchRecordType targetRecordType)
    {
        target = targetRecordType.newSearchInstance();
        try
        {
            PropertyDescriptor descriptor = newDescriptor("basic", target);
            basic = (SearchRecord) descriptor.getPropertyType().newInstance();
            descriptor.getWriteMethod().invoke(target, basic);
        }
        catch (Exception e)
        {
            throw soften(e);
        }
    }

    public void addSimpleExpression(String operationName,
                                    String attributeName,
                                    Object firstArg,
                                    String secondArg)
    {
        try
        {
            addExpressionToGroup(operationName, attributeName, firstArg, secondArg, basic);
        }
        catch (Exception e)
        {
            throw soften(e);
        }
    }

    public void addJoinedExpression(String operationName,
                                    String joinName,
                                    String attributeName,
                                    Object firstArg,
                                    String secondArg)
    {
        try
        {
            addExpressionToGroup(operationName, attributeName, firstArg, secondArg,
                createOrGetAttributeGroup(joinName));
        }
        catch (Exception e)
        {
            throw soften(e);
        }
    }

    private SearchRecord createOrGetAttributeGroup(String joinName) throws Exception
    {
        PropertyDescriptor d = newDescriptor(joinName + "Join", target);
        SearchRecord attributeGroup = (SearchRecord) d.getReadMethod().invoke(target);
        if (attributeGroup == null)
        {
            attributeGroup = (SearchRecord) d.getPropertyType().newInstance();
            d.getWriteMethod().invoke(target, attributeGroup);
        }
        return attributeGroup;
    }

    private void addExpressionToGroup(String operationName,
                                      String attributeName,
                                      Object firstArg,
                                      String secondArg,
                                      SearchRecord attributeGroup) throws Exception
    {
        Object attribute = addAttribute(attributeName, attributeGroup);
        if (operationName.equals("isTrue"))
        {
            addBooleanOperation(attribute, firstArg, secondArg, "true");
        }
        else if (operationName.equals("isFalse"))
        {
            addBooleanOperation(attribute, firstArg, secondArg, "false");
        }
        else
        {
            addSimpleOperation(operationName, firstArg, secondArg, attribute);
        }
    }

    private void addBooleanOperation(Object attribute,
                                     Object firstArg,
                                     Object secondArg,
                                     String booleanValueAsString) throws Exception
    {
        Validate.isTrue(firstArg == null && secondArg == null, "isTrue/isFalse do not take arguments");
        setFirstArg(booleanValueAsString, attribute);
    }

    private void addSimpleOperation(String operationName, Object firstArg, String secondArg, Object attribute)
        throws Exception
    {
        if (firstArg != null)
        {
            setFirstArg(firstArg, attribute);
        }
        if (secondArg != null)
        {
            setSecondArg(secondArg, attribute);
        }
        setOperation(operationName, attribute);
    }

    private void setOperation(String operationName, Object attribute) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor("operator", attribute);
        descriptor.getWriteMethod().invoke(attribute,
            invokeExactStaticMethod(descriptor.getPropertyType(), "fromValue", operationName));
    }

    private Object addAttribute(String attributeName, SearchRecord attributeGroup) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor(attributeName, attributeGroup);
        Object attributeObject = descriptor.getPropertyType().newInstance();
        descriptor.getWriteMethod().invoke(attributeGroup, attributeObject);
        return attributeObject;

    }

    private void setFirstArg(Object argument, Object attribute) throws Exception
    {
        convertAndSet(argument, "searchValue", attribute);
    }

    private void setSecondArg(String argument, Object attribute) throws Exception
    {
        convertAndSet(argument, "searchValue2", attribute);
    }

    private void convertAndSet(Object argument, String propertyName, Object attribute) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor(propertyName, attribute);
        descriptor.getWriteMethod().invoke(attribute,
            convert(argument, descriptor.getPropertyType(), attribute.getClass()));
    }

    private Object convert(Object argument, Class<?> propertyType, Class<?> attributeClass)
    {
        return ConvertUtils.convert(removeQuotesIfPresent(argument), propertyType);
    }

    private Object removeQuotesIfPresent(Object argument)
    {
        return argument instanceof String ? Quotes.removeQuotesIfPresent((String) argument) : argument;
    }

    private PropertyDescriptor newDescriptor(String propertyName, Object object)
    {
        try
        {
            return new PropertyDescriptor(propertyName, object.getClass());
        }
        catch (IntrospectionException e)
        {
            throw PropertyAccess.propertyNotFound(propertyName, object);
        }
    }

    private RuntimeException soften(Exception e)
    {
        return (RuntimeException) (e instanceof RuntimeException ? e : new UnhandledException(e));
    }

    public SearchRecord build()
    {
        return target;
    }

}
