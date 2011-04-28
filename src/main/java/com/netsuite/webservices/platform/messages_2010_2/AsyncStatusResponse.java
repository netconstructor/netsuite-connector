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

import com.netsuite.webservices.platform.core_2010_2.AsyncStatusResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}asyncStatusResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncStatusResponse", propOrder = {
    "asyncStatusResult"
})
public class AsyncStatusResponse {

    @XmlElement(namespace = "urn:core_2010_2.platform.webservices.netsuite.com", required = true)
    protected AsyncStatusResult asyncStatusResult;

    /**
     * Gets the value of the asyncStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncStatusResult }
     *     
     */
    public AsyncStatusResult getAsyncStatusResult() {
        return asyncStatusResult;
    }

    /**
     * Sets the value of the asyncStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncStatusResult }
     *     
     */
    public void setAsyncStatusResult(AsyncStatusResult value) {
        this.asyncStatusResult = value;
    }

}
