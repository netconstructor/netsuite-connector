
package com.netsuite.webservices.platform.core_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetConsolidatedExchangeRateResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetConsolidatedExchangeRateResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:core_2010_2.platform.webservices.netsuite.com}status"/>
 *         &lt;element name="consolidatedExchangeRateList" type="{urn:core_2010_2.platform.webservices.netsuite.com}ConsolidatedExchangeRateList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetConsolidatedExchangeRateResult", propOrder = {
    "status",
    "consolidatedExchangeRateList"
})
public class GetConsolidatedExchangeRateResult {

    @XmlElement(required = true)
    protected Status status;
    protected ConsolidatedExchangeRateList consolidatedExchangeRateList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the consolidatedExchangeRateList property.
     * 
     * @return
     *     possible object is
     *     {@link ConsolidatedExchangeRateList }
     *     
     */
    public ConsolidatedExchangeRateList getConsolidatedExchangeRateList() {
        return consolidatedExchangeRateList;
    }

    /**
     * Sets the value of the consolidatedExchangeRateList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConsolidatedExchangeRateList }
     *     
     */
    public void setConsolidatedExchangeRateList(ConsolidatedExchangeRateList value) {
        this.consolidatedExchangeRateList = value;
    }

}
