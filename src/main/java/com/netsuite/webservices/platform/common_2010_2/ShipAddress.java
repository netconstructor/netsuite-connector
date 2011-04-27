
package com.netsuite.webservices.platform.common_2010_2;

import com.netsuite.webservices.platform.common_2010_2.types.Country;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ShipAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="shipAttention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipAddressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipCountry" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="shipIsResidential" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipAddress", propOrder = {
    "shipAttention",
    "shipAddressee",
    "shipPhone",
    "shipAddr1",
    "shipAddr2",
    "shipCity",
    "shipState",
    "shipZip",
    "shipCountry",
    "shipIsResidential"
})
public class ShipAddress {

    protected String shipAttention;
    protected String shipAddressee;
    protected String shipPhone;
    protected String shipAddr1;
    protected String shipAddr2;
    protected String shipCity;
    protected String shipState;
    protected String shipZip;
    protected Country shipCountry;
    protected Boolean shipIsResidential;

    /**
     * Gets the value of the shipAttention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAttention() {
        return shipAttention;
    }

    /**
     * Sets the value of the shipAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAttention(String value) {
        this.shipAttention = value;
    }

    /**
     * Gets the value of the shipAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddressee() {
        return shipAddressee;
    }

    /**
     * Sets the value of the shipAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddressee(String value) {
        this.shipAddressee = value;
    }

    /**
     * Gets the value of the shipPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipPhone() {
        return shipPhone;
    }

    /**
     * Sets the value of the shipPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipPhone(String value) {
        this.shipPhone = value;
    }

    /**
     * Gets the value of the shipAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddr1() {
        return shipAddr1;
    }

    /**
     * Sets the value of the shipAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddr1(String value) {
        this.shipAddr1 = value;
    }

    /**
     * Gets the value of the shipAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddr2() {
        return shipAddr2;
    }

    /**
     * Sets the value of the shipAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddr2(String value) {
        this.shipAddr2 = value;
    }

    /**
     * Gets the value of the shipCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipCity() {
        return shipCity;
    }

    /**
     * Sets the value of the shipCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipCity(String value) {
        this.shipCity = value;
    }

    /**
     * Gets the value of the shipState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipState() {
        return shipState;
    }

    /**
     * Sets the value of the shipState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipState(String value) {
        this.shipState = value;
    }

    /**
     * Gets the value of the shipZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipZip() {
        return shipZip;
    }

    /**
     * Sets the value of the shipZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipZip(String value) {
        this.shipZip = value;
    }

    /**
     * Gets the value of the shipCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getShipCountry() {
        return shipCountry;
    }

    /**
     * Sets the value of the shipCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setShipCountry(Country value) {
        this.shipCountry = value;
    }

    /**
     * Gets the value of the shipIsResidential property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShipIsResidential() {
        return shipIsResidential;
    }

    /**
     * Sets the value of the shipIsResidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShipIsResidential(Boolean value) {
        this.shipIsResidential = value;
    }

}
