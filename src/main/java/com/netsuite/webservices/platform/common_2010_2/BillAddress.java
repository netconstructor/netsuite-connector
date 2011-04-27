
package com.netsuite.webservices.platform.common_2010_2;

import com.netsuite.webservices.platform.common_2010_2.types.Country;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BillAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="billAttention" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAddressee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAddr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billAddr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billZip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="billCountry" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillAddress", propOrder = {
    "billAttention",
    "billAddressee",
    "billPhone",
    "billAddr1",
    "billAddr2",
    "billCity",
    "billState",
    "billZip",
    "billCountry"
})
public class BillAddress {

    protected String billAttention;
    protected String billAddressee;
    protected String billPhone;
    protected String billAddr1;
    protected String billAddr2;
    protected String billCity;
    protected String billState;
    protected String billZip;
    protected Country billCountry;

    /**
     * Gets the value of the billAttention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAttention() {
        return billAttention;
    }

    /**
     * Sets the value of the billAttention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAttention(String value) {
        this.billAttention = value;
    }

    /**
     * Gets the value of the billAddressee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddressee() {
        return billAddressee;
    }

    /**
     * Sets the value of the billAddressee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddressee(String value) {
        this.billAddressee = value;
    }

    /**
     * Gets the value of the billPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillPhone() {
        return billPhone;
    }

    /**
     * Sets the value of the billPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillPhone(String value) {
        this.billPhone = value;
    }

    /**
     * Gets the value of the billAddr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddr1() {
        return billAddr1;
    }

    /**
     * Sets the value of the billAddr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddr1(String value) {
        this.billAddr1 = value;
    }

    /**
     * Gets the value of the billAddr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillAddr2() {
        return billAddr2;
    }

    /**
     * Sets the value of the billAddr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillAddr2(String value) {
        this.billAddr2 = value;
    }

    /**
     * Gets the value of the billCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCity() {
        return billCity;
    }

    /**
     * Sets the value of the billCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCity(String value) {
        this.billCity = value;
    }

    /**
     * Gets the value of the billState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillState() {
        return billState;
    }

    /**
     * Sets the value of the billState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillState(String value) {
        this.billState = value;
    }

    /**
     * Gets the value of the billZip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillZip() {
        return billZip;
    }

    /**
     * Sets the value of the billZip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillZip(String value) {
        this.billZip = value;
    }

    /**
     * Gets the value of the billCountry property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getBillCountry() {
        return billCountry;
    }

    /**
     * Sets the value of the billCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setBillCountry(Country value) {
        this.billCountry = value;
    }

}
