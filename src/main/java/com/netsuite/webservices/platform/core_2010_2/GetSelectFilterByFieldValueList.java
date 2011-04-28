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

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSelectFilterByFieldValueList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSelectFilterByFieldValueList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="filterBy" type="{urn:core_2010_2.platform.webservices.netsuite.com}GetSelectFilterByFieldValue" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSelectFilterByFieldValueList", propOrder = {
    "filterBy"
})
public class GetSelectFilterByFieldValueList {

    @XmlElement(required = true)
    protected List<GetSelectFilterByFieldValue> filterBy;

    /**
     * Gets the value of the filterBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filterBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFilterBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetSelectFilterByFieldValue }
     * 
     * 
     */
    public List<GetSelectFilterByFieldValue> getFilterBy() {
        if (filterBy == null) {
            filterBy = new ArrayList<GetSelectFilterByFieldValue>();
        }
        return this.filterBy;
    }

}
