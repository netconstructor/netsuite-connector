
package com.netsuite.webservices.platform.messages_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2010_2.platform.webservices.netsuite.com}sessionResponse"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse", propOrder = {
    "sessionResponse"
})
public class LoginResponse {

    @XmlElement(required = true)
    protected SessionResponse sessionResponse;

    /**
     * Gets the value of the sessionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SessionResponse }
     *     
     */
    public SessionResponse getSessionResponse() {
        return sessionResponse;
    }

    /**
     * Sets the value of the sessionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResponse }
     *     
     */
    public void setSessionResponse(SessionResponse value) {
        this.sessionResponse = value;
    }

}
