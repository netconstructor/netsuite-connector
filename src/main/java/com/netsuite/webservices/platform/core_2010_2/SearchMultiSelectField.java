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

import com.netsuite.webservices.platform.core_2010_2.types.SearchMultiSelectFieldOperator;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchMultiSelectField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchMultiSelectField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchValue" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{urn:types.core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectFieldOperator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchMultiSelectField", propOrder = {
    "searchValue"
})
public class SearchMultiSelectField {

    protected List<RecordRef> searchValue;
    @XmlAttribute(name = "operator")
    protected SearchMultiSelectFieldOperator operator;

    /**
     * Gets the value of the searchValue property.
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordRef }
     */
    public List<RecordRef> getSearchValue() {
        if (searchValue == null) {
            searchValue = new ArrayList<RecordRef>();
        }
        return this.searchValue;
    }

    public void setSearchValue(List<RecordRef> searchValue)
    {
        this.searchValue = searchValue;
    }
    
    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectFieldOperator }
     *     
     */
    public SearchMultiSelectFieldOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectFieldOperator }
     *     
     */
    public void setOperator(SearchMultiSelectFieldOperator value) {
        this.operator = value;
    }

}
