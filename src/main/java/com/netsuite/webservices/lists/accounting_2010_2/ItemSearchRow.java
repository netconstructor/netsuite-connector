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

import com.netsuite.webservices.platform.common_2010_2.BinSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.CustomerSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.FileSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.ItemSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.LocationSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.NoteSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.TransactionSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.VendorSearchRowBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="binNumberJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}BinSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="fileJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}FileSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="inventoryLocationJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="memberItemJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="parentJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}ItemSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="preferredLocationJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="preferredVendorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="shopperJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}CustomerSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="transactionJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}TransactionSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userNotesJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}NoteSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="vendorJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}VendorSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemSearchRow", propOrder = {
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
public class ItemSearchRow
    extends SearchRow
{

    protected ItemSearchRowBasic basic;
    protected BinSearchRowBasic binNumberJoin;
    protected FileSearchRowBasic fileJoin;
    protected LocationSearchRowBasic inventoryLocationJoin;
    protected ItemSearchRowBasic memberItemJoin;
    protected ItemSearchRowBasic parentJoin;
    protected LocationSearchRowBasic preferredLocationJoin;
    protected VendorSearchRowBasic preferredVendorJoin;
    protected CustomerSearchRowBasic shopperJoin;
    protected TransactionSearchRowBasic transactionJoin;
    protected EmployeeSearchRowBasic userJoin;
    protected NoteSearchRowBasic userNotesJoin;
    protected VendorSearchRowBasic vendorJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setBasic(ItemSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the binNumberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }

    /**
     * Sets the value of the binNumberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinSearchRowBasic }
     *     
     */
    public void setBinNumberJoin(BinSearchRowBasic value) {
        this.binNumberJoin = value;
    }

    /**
     * Gets the value of the fileJoin property.
     * 
     * @return
     *     possible object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }

    /**
     * Sets the value of the fileJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSearchRowBasic }
     *     
     */
    public void setFileJoin(FileSearchRowBasic value) {
        this.fileJoin = value;
    }

    /**
     * Gets the value of the inventoryLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }

    /**
     * Sets the value of the inventoryLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setInventoryLocationJoin(LocationSearchRowBasic value) {
        this.inventoryLocationJoin = value;
    }

    /**
     * Gets the value of the memberItemJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getMemberItemJoin() {
        return memberItemJoin;
    }

    /**
     * Sets the value of the memberItemJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setMemberItemJoin(ItemSearchRowBasic value) {
        this.memberItemJoin = value;
    }

    /**
     * Gets the value of the parentJoin property.
     * 
     * @return
     *     possible object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public ItemSearchRowBasic getParentJoin() {
        return parentJoin;
    }

    /**
     * Sets the value of the parentJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemSearchRowBasic }
     *     
     */
    public void setParentJoin(ItemSearchRowBasic value) {
        this.parentJoin = value;
    }

    /**
     * Gets the value of the preferredLocationJoin property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }

    /**
     * Sets the value of the preferredLocationJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setPreferredLocationJoin(LocationSearchRowBasic value) {
        this.preferredLocationJoin = value;
    }

    /**
     * Gets the value of the preferredVendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }

    /**
     * Sets the value of the preferredVendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setPreferredVendorJoin(VendorSearchRowBasic value) {
        this.preferredVendorJoin = value;
    }

    /**
     * Gets the value of the shopperJoin property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public CustomerSearchRowBasic getShopperJoin() {
        return shopperJoin;
    }

    /**
     * Sets the value of the shopperJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSearchRowBasic }
     *     
     */
    public void setShopperJoin(CustomerSearchRowBasic value) {
        this.shopperJoin = value;
    }

    /**
     * Gets the value of the transactionJoin property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }

    /**
     * Sets the value of the transactionJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionSearchRowBasic }
     *     
     */
    public void setTransactionJoin(TransactionSearchRowBasic value) {
        this.transactionJoin = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

    /**
     * Gets the value of the userNotesJoin property.
     * 
     * @return
     *     possible object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }

    /**
     * Sets the value of the userNotesJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoteSearchRowBasic }
     *     
     */
    public void setUserNotesJoin(NoteSearchRowBasic value) {
        this.userNotesJoin = value;
    }

    /**
     * Gets the value of the vendorJoin property.
     * 
     * @return
     *     possible object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }

    /**
     * Sets the value of the vendorJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link VendorSearchRowBasic }
     *     
     */
    public void setVendorJoin(VendorSearchRowBasic value) {
        this.vendorJoin = value;
    }

}
