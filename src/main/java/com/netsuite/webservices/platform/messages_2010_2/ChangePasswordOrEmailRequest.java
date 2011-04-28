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

import com.netsuite.webservices.platform.core_2010_2.ChangePasswordOrEmailCredentials;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePasswordOrEmailRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordOrEmailRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="changePasswordOrEmailCredentials" type="{urn:core_2010_2.platform.webservices.netsuite.com}ChangePasswordOrEmailCredentials"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordOrEmailRequest", propOrder = {
    "changePasswordOrEmailCredentials"
})
public class ChangePasswordOrEmailRequest {

    @XmlElement(required = true)
    protected ChangePasswordOrEmailCredentials changePasswordOrEmailCredentials;

    /**
     * Gets the value of the changePasswordOrEmailCredentials property.
     * 
     * @return
     *     possible object is
     *     {@link ChangePasswordOrEmailCredentials }
     *     
     */
    public ChangePasswordOrEmailCredentials getChangePasswordOrEmailCredentials() {
        return changePasswordOrEmailCredentials;
    }

    /**
     * Sets the value of the changePasswordOrEmailCredentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangePasswordOrEmailCredentials }
     *     
     */
    public void setChangePasswordOrEmailCredentials(ChangePasswordOrEmailCredentials value) {
        this.changePasswordOrEmailCredentials = value;
    }

}
