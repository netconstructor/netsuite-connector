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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordRefList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordRefList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recordRef" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordRefList", propOrder = {
    "recordRef"
})
public class RecordRefList {

    protected List<RecordRef> recordRef;
    
    public RecordRefList()
    {
    }

    public RecordRefList(List<RecordRef> recordRef)
    {
        this.recordRef = recordRef;
    }

    /**
     * Gets the value of the recordRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recordRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecordRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordRef }
     * 
     * 
     */
    public List<RecordRef> getRecordRef() {
        if (recordRef == null) {
            recordRef = new ArrayList<RecordRef>();
        }
        return this.recordRef;
    }

}
