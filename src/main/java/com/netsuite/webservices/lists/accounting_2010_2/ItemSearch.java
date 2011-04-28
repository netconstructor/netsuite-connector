/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.lists.accounting_2010_2;

import com.netsuite.webservices.platform.common_2010_2.BinSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.FileSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.ItemSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.LocationSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorSearchBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSearch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearch">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="binNumberJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}BinSearchBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}FileSearchBasic" minOccurs="0"/>
 *         &lt;element name="inventoryLocationJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="memberItemJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="parentJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchBasic" minOccurs="0"/>
 *         &lt;element name="preferredLocationJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}LocationSearchBasic" minOccurs="0"/>
 *         &lt;element name="preferredVendorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *         &lt;element name="shopperJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}NoteSearchBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearch", propOrder = {
    "basic",
    "binNumberJoin",
    "fileJoin",
    "inventoryLocationJoin",
    "memberItemJoin",
    "parentJoin",
    "preferredLocationJoin",
    "preferredVendorJoin",
    "shopperJoin",
    "transactionJoin",
    "userJoin",
    "userNotesJoin",
    "vendorJoin"
})
public class ItemSearch
    extends SearchRecord
{

    protected ItemSearchBasic basic;
    protected BinSearchBasic binNumberJoin;
    protected FileSearchBasic fileJoin;
    protected LocationSearchBasic inventoryLocationJoin;
    protected ItemSearchBasic memberItemJoin;
    protected ItemSearchBasic parentJoin;
    protected LocationSearchBasic preferredLocationJoin;
    protected VendorSearchBasic preferredVendorJoin;
    protected CustomerSearchBasic shopperJoin;
    protected TransactionSearchBasic transactionJoin;
    protected EmployeeSearchBasic userJoin;
    protected NoteSearchBasic userNotesJoin;
    protected VendorSearchBasic vendorJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setBasic(ItemSearchBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the binNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BinSearchBasic }
     *     
     */
    public BinSearchBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * Sets the value of the binNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchBasic }
     *     
     */
    public FileSearchBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchBasic }
     *     
     */
    public void setFileJoin(FileSearchBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the inventoryLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }

    /**
     * Sets the value of the inventoryLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setInventoryLocationJoin(LocationSearchBasic value) {
        this.inventoryLocationJoin = value;
    }

    /**
     * Gets the value of the memberItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getMemberItemJoin() {
        return memberItemJoin;
    }

    /**
     * Sets the value of the memberItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setMemberItemJoin(ItemSearchBasic value) {
        this.memberItemJoin = value;
    }

    /**
     * Gets the value of the parentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchBasic }
     *     
     */
    public ItemSearchBasic getParentJoin() {
        return parentJoin;
    }

    /**
     * Sets the value of the parentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchBasic }
     *     
     */
    public void setParentJoin(ItemSearchBasic value) {
        this.parentJoin = value;
    }

    /**
     * Gets the value of the preferredLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchBasic }
     *     
     */
    public LocationSearchBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }

    /**
     * Sets the value of the preferredLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchBasic }
     *     
     */
    public void setPreferredLocationJoin(LocationSearchBasic value) {
        this.preferredLocationJoin = value;
    }

    /**
     * Gets the value of the preferredVendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }

    /**
     * Sets the value of the preferredVendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setPreferredVendorJoin(VendorSearchBasic value) {
        this.preferredVendorJoin = value;
    }

    /**
     * Gets the value of the shopperJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public CustomerSearchBasic getShopperJoin() {
        return shopperJoin;
    }

    /**
     * Sets the value of the shopperJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchBasic }
     *     
     */
    public void setShopperJoin(CustomerSearchBasic value) {
        this.shopperJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public TransactionSearchBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchBasic }
     *     
     */
    public NoteSearchBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchBasic }
     *     
     */
    public VendorSearchBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchBasic }
     *     
     */
    public void setVendorJoin(VendorSearchBasic value) {
        this.vendorJoin = value;
    }

}
