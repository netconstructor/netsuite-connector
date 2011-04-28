/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.core_2010_2;

import com.netsuite.webservices.platform.core_2010_2.types.GetCustomizationType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CustomizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="getCustomizationType" type="{urn:types.core_2010_2.platform.webservices.netsuite.com}GetCustomizationType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationType")
public class CustomizationType {

    @XmlAttribute(name = "getCustomizationType")
    protected GetCustomizationType getCustomizationType;
    
    public CustomizationType()
    {
    }

    public CustomizationType(GetCustomizationType getCustomizationType)
    {
        this.getCustomizationType = getCustomizationType;
    }

    /**
     * Gets the value of the getCustomizationType property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomizationType }
     *     
     */
    public GetCustomizationType getGetCustomizationType() {
        return getCustomizationType;
    }

    /**
     * Sets the value of the getCustomizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomizationType }
     *     
     */
    public void setGetCustomizationType(GetCustomizationType value) {
        this.getCustomizationType = value;
    }

}
