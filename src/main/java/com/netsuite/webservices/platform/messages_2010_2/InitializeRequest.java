
package com.netsuite.webservices.platform.messages_2010_2;

import com.netsuite.webservices.platform.core_2010_2.InitializeRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InitializeRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitializeRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initializeRecord" type="{urn:core_2010_2.platform.webservices.netsuite.com}InitializeRecord"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitializeRequest", propOrder = {
    "initializeRecord"
})
public class InitializeRequest {

    @XmlElement(required = true)
    protected InitializeRecord initializeRecord;

    /**
     * Gets the value of the initializeRecord property.
     * 
     * @return
     *     possible object is
     *     {@link InitializeRecord }
     *     
     */
    public InitializeRecord getInitializeRecord() {
        return initializeRecord;
    }

    /**
     * Sets the value of the initializeRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitializeRecord }
     *     
     */
    public void setInitializeRecord(InitializeRecord value) {
        this.initializeRecord = value;
    }

}
