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

import com.netsuite.webservices.platform.core_2010_2.UpdateInviteeStatusReference;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UpdateInviteeStatusListRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateInviteeStatusListRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateInviteeStatusReference" type="{urn:core_2010_2.platform.webservices.netsuite.com}UpdateInviteeStatusReference" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateInviteeStatusListRequest", propOrder = {
    "updateInviteeStatusReference"
})
public class UpdateInviteeStatusListRequest {

    @XmlElement(required = true)
    protected List<UpdateInviteeStatusReference> updateInviteeStatusReference;

    /**
     * Gets the value of the updateInviteeStatusReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updateInviteeStatusReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdateInviteeStatusReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdateInviteeStatusReference }
     * 
     * 
     */
    public List<UpdateInviteeStatusReference> getUpdateInviteeStatusReference() {
        if (updateInviteeStatusReference == null) {
            updateInviteeStatusReference = new ArrayList<UpdateInviteeStatusReference>();
        }
        return this.updateInviteeStatusReference;
    }

}
