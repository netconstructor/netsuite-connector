
package com.netsuite.webservices.platform.core_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangePasswordOrEmailCredentials complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangePasswordOrEmailCredentials">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newEmail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newEmail2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="newPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="newPassword2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="justThisAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangePasswordOrEmailCredentials", propOrder = {
    "currentPassword",
    "newEmail",
    "newEmail2",
    "newPassword",
    "newPassword2",
    "justThisAccount"
})
public class ChangePasswordOrEmailCredentials {

    @XmlElement(required = true)
    protected String currentPassword;
    @XmlElement(required = true)
    protected String newEmail;
    @XmlElement(required = true)
    protected String newEmail2;
    protected String newPassword;
    protected String newPassword2;
    protected Boolean justThisAccount;

    /**
     * Gets the value of the currentPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentPassword() {
        return currentPassword;
    }

    /**
     * Sets the value of the currentPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentPassword(String value) {
        this.currentPassword = value;
    }

    /**
     * Gets the value of the newEmail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmail() {
        return newEmail;
    }

    /**
     * Sets the value of the newEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmail(String value) {
        this.newEmail = value;
    }

    /**
     * Gets the value of the newEmail2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewEmail2() {
        return newEmail2;
    }

    /**
     * Sets the value of the newEmail2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewEmail2(String value) {
        this.newEmail2 = value;
    }

    /**
     * Gets the value of the newPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * Sets the value of the newPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword(String value) {
        this.newPassword = value;
    }

    /**
     * Gets the value of the newPassword2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewPassword2() {
        return newPassword2;
    }

    /**
     * Sets the value of the newPassword2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewPassword2(String value) {
        this.newPassword2 = value;
    }

    /**
     * Gets the value of the justThisAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isJustThisAccount() {
        return justThisAccount;
    }

    /**
     * Sets the value of the justThisAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setJustThisAccount(Boolean value) {
        this.justThisAccount = value;
    }

}
