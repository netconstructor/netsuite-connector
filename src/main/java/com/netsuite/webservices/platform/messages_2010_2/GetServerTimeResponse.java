
package com.netsuite.webservices.platform.messages_2010_2;

import com.netsuite.webservices.platform.core_2010_2.GetServerTimeResult;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetServerTimeResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetServerTimeResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}getServerTimeResult"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetServerTimeResponse", propOrder = {
    "getServerTimeResult"
})
public class GetServerTimeResponse {

    @XmlElement(namespace = "urn:core_2010_2.platform.webservices.netsuite.com", required = true)
    protected GetServerTimeResult getServerTimeResult;
    
    public GetServerTimeResponse()
    {
    }

    public GetServerTimeResponse(GetServerTimeResult getServerTimeResult)
    {
        this.getServerTimeResult = getServerTimeResult;
    }

    /**
     * Gets the value of the getServerTimeResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetServerTimeResult }
     *     
     */
    public GetServerTimeResult getGetServerTimeResult() {
        return getServerTimeResult;
    }

    /**
     * Sets the value of the getServerTimeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetServerTimeResult }
     *     
     */
    public void setGetServerTimeResult(GetServerTimeResult value) {
        this.getServerTimeResult = value;
    }

}
