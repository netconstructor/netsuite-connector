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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetListResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetListResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2010_2.platform.webservices.netsuite.com}readResponseList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetListResponse", propOrder = {
    "readResponseList"
})
public class GetListResponse {

    @XmlElement(required = true)
    protected ReadResponseList readResponseList;

    /**
     * Gets the value of the readResponseList property.
     * 
     * @return
     *     possible object is
     *     {@link ReadResponseList }
     *     
     */
    public ReadResponseList getReadResponseList() {
        return readResponseList;
    }

    /**
     * Sets the value of the readResponseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReadResponseList }
     *     
     */
    public void setReadResponseList(ReadResponseList value) {
        this.readResponseList = value;
    }

}
