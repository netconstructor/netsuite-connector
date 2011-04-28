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

import com.netsuite.webservices.platform.core_2010_2.GetSelectValueResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSelectValueResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSelectValueResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}getSelectValueResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSelectValueResponse", propOrder = {
    "getSelectValueResult"
})
public class GetSelectValueResponse {

    @XmlElement(namespace = "urn:core_2010_2.platform.webservices.netsuite.com", required = true)
    protected GetSelectValueResult getSelectValueResult;

    /**
     * Gets the value of the getSelectValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSelectValueResult }
     *     
     */
    public GetSelectValueResult getGetSelectValueResult() {
        return getSelectValueResult;
    }

    /**
     * Sets the value of the getSelectValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSelectValueResult }
     *     
     */
    public void setGetSelectValueResult(GetSelectValueResult value) {
        this.getSelectValueResult = value;
    }

}
