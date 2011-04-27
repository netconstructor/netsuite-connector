
package com.netsuite.webservices.platform.messages_2010_2;

import com.netsuite.webservices.platform.core_2010_2.GetSavedSearchResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetSavedSearchResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetSavedSearchResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}getSavedSearchResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetSavedSearchResponse", propOrder = {
    "getSavedSearchResult"
})
public class GetSavedSearchResponse {

    @XmlElement(namespace = "urn:core_2010_2.platform.webservices.netsuite.com", required = true)
    protected GetSavedSearchResult getSavedSearchResult;

    /**
     * Gets the value of the getSavedSearchResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetSavedSearchResult }
     *     
     */
    public GetSavedSearchResult getGetSavedSearchResult() {
        return getSavedSearchResult;
    }

    /**
     * Sets the value of the getSavedSearchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetSavedSearchResult }
     *     
     */
    public void setGetSavedSearchResult(GetSavedSearchResult value) {
        this.getSavedSearchResult = value;
    }

}
