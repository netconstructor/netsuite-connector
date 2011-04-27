
package com.netsuite.webservices.platform.messages_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetAsyncResultResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetAsyncResultResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:messages_2010_2.platform.webservices.netsuite.com}asyncResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAsyncResultResponse", propOrder = {
    "asyncResult"
})
public class GetAsyncResultResponse {

    @XmlElement(required = true)
    protected AsyncResult asyncResult;

    /**
     * Gets the value of the asyncResult property.
     * 
     * @return
     *     possible object is
     *     {@link AsyncResult }
     *     
     */
    public AsyncResult getAsyncResult() {
        return asyncResult;
    }

    /**
     * Sets the value of the asyncResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsyncResult }
     *     
     */
    public void setAsyncResult(AsyncResult value) {
        this.asyncResult = value;
    }

}
