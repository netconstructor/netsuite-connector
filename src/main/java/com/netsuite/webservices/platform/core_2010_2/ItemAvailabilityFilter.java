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

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemAvailabilityFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAvailabilityFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="item" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRefList"/>
 *         &lt;element name="lastQtyAvailableChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAvailabilityFilter", propOrder = {
    "item",
    "lastQtyAvailableChange"
})
public class ItemAvailabilityFilter {

    @XmlElement(required = true)
    protected RecordRefList item;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastQtyAvailableChange;
    
    public ItemAvailabilityFilter()
    {
    }

    public ItemAvailabilityFilter(RecordRefList item, XMLGregorianCalendar lastQtyAvailableChange)
    {
        this.item = item;
        this.lastQtyAvailableChange = lastQtyAvailableChange;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRefList }
     *     
     */
    public RecordRefList getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRefList }
     *     
     */
    public void setItem(RecordRefList value) {
        this.item = value;
    }

    /**
     * Gets the value of the lastQtyAvailableChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastQtyAvailableChange() {
        return lastQtyAvailableChange;
    }

    /**
     * Sets the value of the lastQtyAvailableChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastQtyAvailableChange(XMLGregorianCalendar value) {
        this.lastQtyAvailableChange = value;
    }

}
