
package com.netsuite.webservices.platform.messages_2010_2;

import com.netsuite.webservices.platform.core_2010_2.GetSavedSearchRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSavedSearchRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSavedSearchRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="record" type="{urn:core_2010_2.platform.webservices.netsuite.com}GetSavedSearchRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSavedSearchRequest", propOrder = {
    "record"
})
public class GetSavedSearchRequest {

    @XmlElement(required = true)
    protected GetSavedSearchRecord record;
    
    public GetSavedSearchRequest()
    {
    }

    public GetSavedSearchRequest(GetSavedSearchRecord record)
    {
        this.record = record;
    }

    /**
     * Gets the value of the record property.
     * 
     * @return
     *     possible object is
     *     {@link GetSavedSearchRecord }
     *     
     */
    public GetSavedSearchRecord getRecord() {
        return record;
    }

    /**
     * Sets the value of the record property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSavedSearchRecord }
     *     
     */
    public void setRecord(GetSavedSearchRecord value) {
        this.record = value;
    }

}
