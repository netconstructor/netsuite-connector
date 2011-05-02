package org.mule.module.netsuite.api.model.expression.filter;

import static org.apache.commons.beanutils.MethodUtils.invokeExactStaticMethod;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.lang.UnhandledException;
import org.apache.commons.lang.Validate;

import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

public class FilterExpressionBuilder
{
    private SearchRecord target;
    private SearchRecord basic;

    public void setTarget(SearchRecordType targetRecordType)
    {
        target = targetRecordType.newInstance();
        try
        {
            PropertyDescriptor descriptor = newDescriptor("basic", target);
            basic = (SearchRecord) descriptor.getPropertyType().newInstance();
            descriptor.getWriteMethod().invoke(target, basic);
        } catch (Exception e)
        {
            throw soften(e);
        }
    }

    public void addSimpleExpression(String operationName, String attributeName,
            String firstArg, String secondArg)
    {
        try
        {
            addExpressionToGroup(operationName, attributeName, firstArg,
                    secondArg, basic);
        } catch (Exception e)
        {
            throw soften(e);
        }
    }

    public void addJoinedExpression(String operationName, String joinName,
            String attributeName, String firstArg, String secondArg)
    {
        try
        {
            addExpressionToGroup(operationName, attributeName, firstArg,
                    secondArg, createOrGetAttributeGroup(joinName));
        } catch (Exception e)
        {
            throw soften(e);
        }
    }

    private SearchRecord createOrGetAttributeGroup(String joinName)
            throws Exception
    {
        PropertyDescriptor d = newDescriptor(joinName + "Join", target);
        SearchRecord attributeGroup = (SearchRecord) d.getReadMethod().invoke(
                target);
        if (attributeGroup == null)
        {
            attributeGroup = (SearchRecord) d.getPropertyType().newInstance();
            d.getWriteMethod().invoke(target, attributeGroup);
        }
        return attributeGroup;
    }

    private void addExpressionToGroup(String operationName,
            String attributeName, String firstArg, String secondArg,
            SearchRecord attributeGroup) throws Exception
    {
        Object attribute = addAttribute(attributeName, attributeGroup);
        if (operationName.equals("isTrue"))
        {
            Validate.isTrue(firstArg == null && secondArg == null,
                    "isTrue does not take arguments");
            addBooleanOperation(attribute);
        } else
        {
            addSimpleOperation(operationName, firstArg, secondArg, attribute);
        }
    }

    private void addBooleanOperation(Object attribute) throws Exception
    {
        setFirstArg(true, attribute);
    }

    private void addSimpleOperation(String operationName, String firstArg,
            String secondArg, Object attribute) throws Exception
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

    private void setOperation(String operationName, Object attribute)
            throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor("operator", attribute);
        descriptor.getWriteMethod().invoke(
                attribute,
                invokeExactStaticMethod(descriptor.getPropertyType(),
                        "fromValue", operationName));
    }

    private Object addAttribute(String attributeName,
            SearchRecord attributeGroup) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor(attributeName,
                attributeGroup);
        Object attributeObject = descriptor.getPropertyType().newInstance();
        descriptor.getWriteMethod().invoke(attributeGroup, attributeObject);
        return attributeObject;

    }

    private void setFirstArg(Object argument, Object attribute)
            throws Exception
    {
        convertAndSet(argument, "searchValue", attribute);
    }

    private void setSecondArg(Object argument, Object attribute)
            throws Exception
    {
        convertAndSet(argument, "searchValue2", attribute);
    }

    private void convertAndSet(Object argument, String propertyName,
            Object attribute) throws Exception
    {
        PropertyDescriptor descriptor = newDescriptor(propertyName, attribute);
        descriptor.getWriteMethod().invoke(attribute,
                ConvertUtils.convert(argument, descriptor.getPropertyType()));

    }

    private PropertyDescriptor newDescriptor(String propertyName, Object object)
    {
        try
        {
            return new PropertyDescriptor(propertyName, object.getClass());
        } catch (IntrospectionException e)
        {
            throw new IllegalArgumentException("Invallid property "
                    + propertyName + " for class " + object.getClass());
        }
    }

    private RuntimeException soften(Exception e)
    {
        return (RuntimeException) (e instanceof RuntimeException ? e
                : new UnhandledException(e));
    }

    public SearchRecord build()
    {
        return target;
    }

}
