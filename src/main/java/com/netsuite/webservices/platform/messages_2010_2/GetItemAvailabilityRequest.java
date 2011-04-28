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

import com.netsuite.webservices.platform.core_2010_2.ItemAvailabilityFilter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetItemAvailabilityRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetItemAvailabilityRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="itemAvailabilityFilter" type="{urn:core_2010_2.platform.webservices.netsuite.com}ItemAvailabilityFilter"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetItemAvailabilityRequest", propOrder = {
    "itemAvailabilityFilter"
})
public class GetItemAvailabilityRequest {

    @XmlElement(required = true)
    protected ItemAvailabilityFilter itemAvailabilityFilter;
    
    public GetItemAvailabilityRequest()
    {
    }    

    public GetItemAvailabilityRequest(ItemAvailabilityFilter itemAvailabilityFilter)
    {
        this.itemAvailabilityFilter = itemAvailabilityFilter;
    }

    /**
     * Gets the value of the itemAvailabilityFilter property.
     * 
     * @return
     *     possible object is
     *     {@link ItemAvailabilityFilter }
     *     
     */
    public ItemAvailabilityFilter getItemAvailabilityFilter() {
        return itemAvailabilityFilter;
    }

    /**
     * Sets the value of the itemAvailabilityFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemAvailabilityFilter }
     *     
     */
    public void setItemAvailabilityFilter(ItemAvailabilityFilter value) {
        this.itemAvailabilityFilter = value;
    }

}
