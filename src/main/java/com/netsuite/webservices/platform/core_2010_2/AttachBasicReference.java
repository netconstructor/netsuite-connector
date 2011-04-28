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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachBasicReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachBasicReference">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}AttachReference">
 *       &lt;sequence>
 *         &lt;element name="attachedRecord" type="{urn:core_2010_2.platform.webservices.netsuite.com}BaseRef"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachBasicReference", propOrder = {
    "attachedRecord"
})
public class AttachBasicReference
    extends AttachReference
{

    @XmlElement(required = true)
    protected BaseRef attachedRecord;
    
    public AttachBasicReference()
    {
    }
    
    public AttachBasicReference(BaseRef attachTo, BaseRef attachRecord)
    {
        super(attachTo);
        this.attachedRecord = attachRecord;
    }

    /**
     * Gets the value of the attachedRecord property.
     * 
     * @return
     *     possible object is
     *     {@link BaseRef }
     *     
     */
    public BaseRef getAttachedRecord() {
        return attachedRecord;
    }

    /**
     * Sets the value of the attachedRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseRef }
     *     
     */
    public void setAttachedRecord(BaseRef value) {
        this.attachedRecord = value;
    }

}
