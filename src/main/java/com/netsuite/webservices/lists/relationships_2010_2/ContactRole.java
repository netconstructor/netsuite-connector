/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.relationships_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;


/**
 * <p>Java class for ContactRole complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactRole">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contact" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="contactRole" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactRole", propOrder = {
    "contact",
    "contactRole"
})
public class ContactRole {

    protected RecordRef contact;
    protected RecordRef contactRole;

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setContact(RecordRef value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contactRole property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getContactRole() {
        return contactRole;
    }

    /**
     * Sets the value of the contactRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setContactRole(RecordRef value) {
        this.contactRole = value;
    }

}
