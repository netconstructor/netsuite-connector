package org.mule.module.netsuite.api.model.expression.filter;

import java.beans.PropertyDescriptor;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.lang.UnhandledException;

import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.types.SearchRecordType;

public class FilterExpressionBuilder
{
    private String operation;
    private SearchRecord target;
    private Object attribute;

    public void setOperation(String operation)
    {
        this.operation = operation;
    }

    public void setTarget(String target)
    {
        this.target = SearchRecordType.fromValue(target).newInstance();
    }

    public void setAttribute(String attribute)
    {
        PropertyDescriptor descriptor;
        try
        {
            descriptor = new PropertyDescriptor(attribute, target.getClass());
            this.attribute = descriptor.getPropertyType()
                    .newInstance();
            descriptor.getWriteMethod().invoke(target, this.attribute);
            // TODO may not be found directly, and be a join instead
            // TODO exception when descriptor is not found is confusing 
        } catch (Exception e)
        {
            throw new UnhandledException(e);
        }
    }

    // TODO boolean do not work
    public void setFirstArg(String argument)
    {
        convertAndSet(argument, "searchValue");
    }

    public void setSecondArg(String argument)
    {
        convertAndSet(argument, "searchValue2");
    }

    private void convertAndSet(String argument, String propertyName)
    {
        try
        {
            PropertyDescriptor descriptor = new PropertyDescriptor(
                    propertyName, attribute.getClass());
            descriptor.getWriteMethod()
                    .invoke(attribute,
                            ConvertUtils.convert(argument,
                                    descriptor.getPropertyType()));
        } catch (Exception e)
        {
            throw new UnhandledException(e);
        }

    }

    public SearchRecord build()
    {
        return target;
    }

}
