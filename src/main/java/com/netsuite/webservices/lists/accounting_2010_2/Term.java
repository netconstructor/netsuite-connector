/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.accounting_2010_2;

import com.netsuite.webservices.platform.core_2010_2.Record;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Term complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Term">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dateDriven" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="daysUntilNetDue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="discountPercent" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="daysUntilExpiry" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dayOfMonthNetDue" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="dueNextMonthIfWithinDays" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="discountPercentDateDriven" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="dayDiscountExpires" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="preferred" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Term", propOrder = {
    "name",
    "dateDriven",
    "daysUntilNetDue",
    "discountPercent",
    "daysUntilExpiry",
    "dayOfMonthNetDue",
    "dueNextMonthIfWithinDays",
    "discountPercentDateDriven",
    "dayDiscountExpires",
    "preferred",
    "isInactive"
})
public class Term
    extends Record
{

    protected String name;
    protected Boolean dateDriven;
    protected Long daysUntilNetDue;
    protected Double discountPercent;
    protected Long daysUntilExpiry;
    protected Long dayOfMonthNetDue;
    protected Long dueNextMonthIfWithinDays;
    protected Double discountPercentDateDriven;
    protected Long dayDiscountExpires;
    protected Boolean preferred;
    protected Boolean isInactive;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the dateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDateDriven() {
        return dateDriven;
    }

    /**
     * Sets the value of the dateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDateDriven(Boolean value) {
        this.dateDriven = value;
    }

    /**
     * Gets the value of the daysUntilNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysUntilNetDue() {
        return daysUntilNetDue;
    }

    /**
     * Sets the value of the daysUntilNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysUntilNetDue(Long value) {
        this.daysUntilNetDue = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountPercent(Double value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the daysUntilExpiry property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDaysUntilExpiry() {
        return daysUntilExpiry;
    }

    /**
     * Sets the value of the daysUntilExpiry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDaysUntilExpiry(Long value) {
        this.daysUntilExpiry = value;
    }

    /**
     * Gets the value of the dayOfMonthNetDue property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDayOfMonthNetDue() {
        return dayOfMonthNetDue;
    }

    /**
     * Sets the value of the dayOfMonthNetDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDayOfMonthNetDue(Long value) {
        this.dayOfMonthNetDue = value;
    }

    /**
     * Gets the value of the dueNextMonthIfWithinDays property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDueNextMonthIfWithinDays() {
        return dueNextMonthIfWithinDays;
    }

    /**
     * Sets the value of the dueNextMonthIfWithinDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDueNextMonthIfWithinDays(Long value) {
        this.dueNextMonthIfWithinDays = value;
    }

    /**
     * Gets the value of the discountPercentDateDriven property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getDiscountPercentDateDriven() {
        return discountPercentDateDriven;
    }

    /**
     * Sets the value of the discountPercentDateDriven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDiscountPercentDateDriven(Double value) {
        this.discountPercentDateDriven = value;
    }

    /**
     * Gets the value of the dayDiscountExpires property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDayDiscountExpires() {
        return dayDiscountExpires;
    }

    /**
     * Sets the value of the dayDiscountExpires property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDayDiscountExpires(Long value) {
        this.dayDiscountExpires = value;
    }

    /**
     * Gets the value of the preferred property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPreferred() {
        return preferred;
    }

    /**
     * Sets the value of the preferred property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPreferred(Boolean value) {
        this.preferred = value;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInactive() {
        return isInactive;
    }

    /**
     * Sets the value of the isInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInactive(Boolean value) {
        this.isInactive = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
