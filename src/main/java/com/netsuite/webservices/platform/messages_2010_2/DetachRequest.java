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

import com.netsuite.webservices.platform.core_2010_2.DetachBasicReference;
import com.netsuite.webservices.platform.core_2010_2.DetachReference;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DetachRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DetachRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="detachReference" type="{urn:core_2010_2.platform.webservices.netsuite.com}DetachReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetachRequest", propOrder = {
    "detachReference"
})
public class DetachRequest {

    @XmlElement(required = true)
    protected DetachReference detachReference;

    public DetachRequest()
    {
    }
    
    public DetachRequest(DetachReference detachReference)
    {
        this.detachReference = detachReference;
    }

    /**
     * Gets the value of the detachReference property.
     * 
     * @return
     *     possible object is
     *     {@link DetachReference }
     *     
     */
    public DetachReference getDetachReference() {
        return detachReference;
    }

    /**
     * Sets the value of the detachReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link DetachReference }
     *     
     */
    public void setDetachReference(DetachReference value) {
        this.detachReference = value;
    }

}
