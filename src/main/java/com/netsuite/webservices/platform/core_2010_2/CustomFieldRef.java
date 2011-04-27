
package com.netsuite.webservices.platform.core_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomFieldRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomFieldRef">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomFieldRef")
@XmlSeeAlso({
    SelectCustomFieldRef.class,
    DoubleCustomFieldRef.class,
    LongCustomFieldRef.class,
    BooleanCustomFieldRef.class,
    MultiSelectCustomFieldRef.class,
    StringCustomFieldRef.class,
    DateCustomFieldRef.class
})
public abstract class CustomFieldRef {


}
