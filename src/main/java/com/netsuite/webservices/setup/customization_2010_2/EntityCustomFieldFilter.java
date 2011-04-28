/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.setup.customization_2010_2;

import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.setup.customization_2010_2.types.CustomizationFilterCompareType;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntityCustomFieldFilter complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityCustomFieldFilter">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fldFilter" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="fldFilterChecked" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="fldFilterCompareType" type="{urn:types.customization_2010_2.setup.webservices.netsuite.com}CustomizationFilterCompareType" minOccurs="0"/>
 *         &lt;element name="fldFilterVal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fldFilterSelList" type="{urn:customization_2010_2.setup.webservices.netsuite.com}FldFilterSelList" minOccurs="0"/>
 *         &lt;element name="fldFilterNotNull" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityCustomFieldFilter", propOrder = {
    "fldFilter",
    "fldFilterChecked",
    "fldFilterCompareType",
    "fldFilterVal",
    "fldFilterSelList",
    "fldFilterNotNull"
})
public class EntityCustomFieldFilter {

    protected RecordRef fldFilter;
    protected Boolean fldFilterChecked;
    protected CustomizationFilterCompareType fldFilterCompareType;
    protected String fldFilterVal;
    protected FldFilterSelList fldFilterSelList;
    protected Boolean fldFilterNotNull;

    /**
     * Gets the value of the fldFilter property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getFldFilter() {
        return fldFilter;
    }

    /**
     * Sets the value of the fldFilter property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setFldFilter(RecordRef value) {
        this.fldFilter = value;
    }

    /**
     * Gets the value of the fldFilterChecked property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFldFilterChecked() {
        return fldFilterChecked;
    }

    /**
     * Sets the value of the fldFilterChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFldFilterChecked(Boolean value) {
        this.fldFilterChecked = value;
    }

    /**
     * Gets the value of the fldFilterCompareType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomizationFilterCompareType }
     *     
     */
    public CustomizationFilterCompareType getFldFilterCompareType() {
        return fldFilterCompareType;
    }

    /**
     * Sets the value of the fldFilterCompareType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomizationFilterCompareType }
     *     
     */
    public void setFldFilterCompareType(CustomizationFilterCompareType value) {
        this.fldFilterCompareType = value;
    }

    /**
     * Gets the value of the fldFilterVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFldFilterVal() {
        return fldFilterVal;
    }

    /**
     * Sets the value of the fldFilterVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFldFilterVal(String value) {
        this.fldFilterVal = value;
    }

    /**
     * Gets the value of the fldFilterSelList property.
     * 
     * @return
     *     possible object is
     *     {@link FldFilterSelList }
     *     
     */
    public FldFilterSelList getFldFilterSelList() {
        return fldFilterSelList;
    }

    /**
     * Sets the value of the fldFilterSelList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FldFilterSelList }
     *     
     */
    public void setFldFilterSelList(FldFilterSelList value) {
        this.fldFilterSelList = value;
    }

    /**
     * Gets the value of the fldFilterNotNull property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFldFilterNotNull() {
        return fldFilterNotNull;
    }

    /**
     * Sets the value of the fldFilterNotNull property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFldFilterNotNull(Boolean value) {
        this.fldFilterNotNull = value;
    }

}
