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
 * <p>Java class for GetBudgetExchangeRateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBudgetExchangeRateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}status"/>
 *         &lt;element name="budgetExchangeRateList" type="{urn:core_2010_2.platform.webservices.netsuite.com}BudgetExchangeRateList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBudgetExchangeRateResult", propOrder = {
    "status",
    "budgetExchangeRateList"
})
public class GetBudgetExchangeRateResult {

    @XmlElement(required = true)
    protected Status status;
    protected BudgetExchangeRateList budgetExchangeRateList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the budgetExchangeRateList property.
     * 
     * @return
     *     possible object is
     *     {@link BudgetExchangeRateList }
     *     
     */
    public BudgetExchangeRateList getBudgetExchangeRateList() {
        return budgetExchangeRateList;
    }

    /**
     * Sets the value of the budgetExchangeRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BudgetExchangeRateList }
     *     
     */
    public void setBudgetExchangeRateList(BudgetExchangeRateList value) {
        this.budgetExchangeRateList = value;
    }

}
