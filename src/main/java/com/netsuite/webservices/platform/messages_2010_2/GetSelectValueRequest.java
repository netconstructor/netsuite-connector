/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.messages_2010_2;

import com.netsuite.webservices.platform.core_2010_2.GetSelectValueFieldDescription;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelectValueRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelectValueRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fieldDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}GetSelectValueFieldDescription"/>
 *         &lt;element name="pageIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelectValueRequest", propOrder = {
    "fieldDescription",
    "pageIndex"
})
public class GetSelectValueRequest {

    @XmlElement(required = true)
    protected GetSelectValueFieldDescription fieldDescription;
    protected int pageIndex;

    /**
     * Gets the value of the fieldDescription property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueFieldDescription }
     *     
     */
    public GetSelectValueFieldDescription getFieldDescription() {
        return fieldDescription;
    }

    /**
     * Sets the value of the fieldDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueFieldDescription }
     *     
     */
    public void setFieldDescription(GetSelectValueFieldDescription value) {
        this.fieldDescription = value;
    }

    /**
     * Gets the value of the pageIndex property.
     * 
     */
    public int getPageIndex() {
        return pageIndex;
    }

    /**
     * Sets the value of the pageIndex property.
     * 
     */
    public void setPageIndex(int value) {
        this.pageIndex = value;
    }

}
