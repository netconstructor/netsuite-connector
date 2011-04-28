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

import com.netsuite.webservices.platform.core_2010_2.types.AsyncStatusType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AsyncStatusResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsyncStatusResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jobId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="status" type="{urn:types.core_2010_2.platform.webservices.netsuite.com}AsyncStatusType"/>
 *         &lt;element name="percentCompleted" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="estRemainingDuration" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsyncStatusResult", propOrder = {
    "jobId",
    "status",
    "percentCompleted",
    "estRemainingDuration"
})
public class AsyncStatusResult {

    @XmlElement(required = true)
    protected String jobId;
    @XmlElement(required = true)
    protected AsyncStatusType status;
    protected double percentCompleted;
    protected double estRemainingDuration;

    /**
     * Gets the value of the jobId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobId() {
        return jobId;
    }

    /**
     * Sets the value of the jobId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobId(String value) {
        this.jobId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncStatusType }
     *     
     */
    public AsyncStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncStatusType }
     *     
     */
    public void setStatus(AsyncStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the percentCompleted property.
     * 
     */
    public double getPercentCompleted() {
        return percentCompleted;
    }

    /**
     * Sets the value of the percentCompleted property.
     * 
     */
    public void setPercentCompleted(double value) {
        this.percentCompleted = value;
    }

    /**
     * Gets the value of the estRemainingDuration property.
     * 
     */
    public double getEstRemainingDuration() {
        return estRemainingDuration;
    }

    /**
     * Sets the value of the estRemainingDuration property.
     * 
     */
    public void setEstRemainingDuration(double value) {
        this.estRemainingDuration = value;
    }

}
