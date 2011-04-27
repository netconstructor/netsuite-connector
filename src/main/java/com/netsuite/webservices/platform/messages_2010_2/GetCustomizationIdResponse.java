
package com.netsuite.webservices.platform.messages_2010_2;

import com.netsuite.webservices.platform.core_2010_2.GetCustomizationIdResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetCustomizationIdResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetCustomizationIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}getCustomizationIdResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCustomizationIdResponse", propOrder = {
    "getCustomizationIdResult"
})
public class GetCustomizationIdResponse {

    @XmlElement(namespace = "urn:core_2010_2.platform.webservices.netsuite.com", required = true)
    protected GetCustomizationIdResult getCustomizationIdResult;

    /**
     * Gets the value of the getCustomizationIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomizationIdResult }
     *     
     */
    public GetCustomizationIdResult getGetCustomizationIdResult() {
        return getCustomizationIdResult;
    }

    /**
     * Sets the value of the getCustomizationIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomizationIdResult }
     *     
     */
    public void setGetCustomizationIdResult(GetCustomizationIdResult value) {
        this.getCustomizationIdResult = value;
    }

}
