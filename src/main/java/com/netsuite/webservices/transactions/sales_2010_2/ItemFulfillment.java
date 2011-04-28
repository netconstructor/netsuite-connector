/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.transactions.sales_2010_2;

import com.netsuite.webservices.platform.common_2010_2.ShipAddress;
import com.netsuite.webservices.platform.common_2010_2.types.Country;
import com.netsuite.webservices.platform.core_2010_2.CustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.Record;
import com.netsuite.webservices.platform.core_2010_2.RecordRef;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentB13AFilingOptionFedEx;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentExportTypeUps;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentHomeDeliveryTypeFedEx;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentLicenseExceptionUps;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentMethodOfTransportUps;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentShipStatus;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentTermsOfSaleFedEx;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentThirdPartyTypeFedEx;
import com.netsuite.webservices.transactions.sales_2010_2.types.ItemFulfillmentThirdPartyTypeUps;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ItemFulfillment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemFulfillment">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}Record">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="lastModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="customForm" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="postingPeriod" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="entity" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createdFrom" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="createdFromShipGroup" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="transactionShipAddress" type="{urn:common_2010_2.platform.webservices.netsuite.com}ShipAddress" minOccurs="0"/>
 *         &lt;element name="shipAddressList" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="shipAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipStatus" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentShipStatus" minOccurs="0"/>
 *         &lt;element name="saturdayDeliveryUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendShipNotifyEmailUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendBackupEmailUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailAddressUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailAddress2Ups" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backupEmailAddressUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailMessageUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyAcctUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyZipcodeUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountryUps" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="thirdPartyTypeUps" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentThirdPartyTypeUps" minOccurs="0"/>
 *         &lt;element name="partiesToTransactionUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="exportTypeUps" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentExportTypeUps" minOccurs="0"/>
 *         &lt;element name="methodOfTransportUps" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentMethodOfTransportUps" minOccurs="0"/>
 *         &lt;element name="carrierIdUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="entryNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inbondCodeUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isRoutedExportTransactionUps" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="licenseNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="licenseDateUps" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="licenseExceptionUps" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentLicenseExceptionUps" minOccurs="0"/>
 *         &lt;element name="eccNumberUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recipientTaxIdUps" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="blanketStartDateUps" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="blanketEndDateUps" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="shipmentWeightUps" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="saturdayDeliveryFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="saturdayPickupFedex" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendShipNotifyEmailFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendBackupEmailFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="signatureHomeDeliveryFedEx" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shipNotifyEmailAddressFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="backupEmailAddressFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipDateFedEx" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="homeDeliveryTypeFedEx" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentHomeDeliveryTypeFedEx" minOccurs="0"/>
 *         &lt;element name="homeDeliveryDateFedEx" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="bookingConfirmationNumFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="intlExemptionNumFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="b13aFilingOptionFedEx" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentB13AFilingOptionFedEx" minOccurs="0"/>
 *         &lt;element name="b13aStatementDataFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyAcctFedEx" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="thirdPartyCountryFedEx" type="{urn:types.common_2010_2.platform.webservices.netsuite.com}Country" minOccurs="0"/>
 *         &lt;element name="thirdPartyTypeFedEx" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentThirdPartyTypeFedEx" minOccurs="0"/>
 *         &lt;element name="shipmentWeightFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="termsOfSaleFedEx" type="{urn:types.sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentTermsOfSaleFedEx" minOccurs="0"/>
 *         &lt;element name="termsFreightChargeFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="termsInsuranceChargeFedEx" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="tranDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="tranId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shipMethod" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="generateIntegratedShipperLabel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="shippingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="handlingCost" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="memo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transferLocation" type="{urn:core_2010_2.platform.webservices.netsuite.com}RecordRef" minOccurs="0"/>
 *         &lt;element name="packageList" type="{urn:sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageList" minOccurs="0"/>
 *         &lt;element name="packageUpsList" type="{urn:sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUpsList" minOccurs="0"/>
 *         &lt;element name="packageUspsList" type="{urn:sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageUspsList" minOccurs="0"/>
 *         &lt;element name="packageFedExList" type="{urn:sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentPackageFedExList" minOccurs="0"/>
 *         &lt;element name="itemList" type="{urn:sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentItemList" minOccurs="0"/>
 *         &lt;element name="shipGroupList" type="{urn:sales_2010_2.transactions.webservices.netsuite.com}ItemFulfillmentShipGroupList" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}CustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="internalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="externalId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemFulfillment", propOrder = {
    "createdDate",
    "lastModifiedDate",
    "customForm",
    "postingPeriod",
    "entity",
    "createdFrom",
    "createdFromShipGroup",
    "partner",
    "transactionShipAddress",
    "shipAddressList",
    "shipAddress",
    "shipStatus",
    "saturdayDeliveryUps",
    "sendShipNotifyEmailUps",
    "sendBackupEmailUps",
    "shipNotifyEmailAddressUps",
    "shipNotifyEmailAddress2Ups",
    "backupEmailAddressUps",
    "shipNotifyEmailMessageUps",
    "thirdPartyAcctUps",
    "thirdPartyZipcodeUps",
    "thirdPartyCountryUps",
    "thirdPartyTypeUps",
    "partiesToTransactionUps",
    "exportTypeUps",
    "methodOfTransportUps",
    "carrierIdUps",
    "entryNumberUps",
    "inbondCodeUps",
    "isRoutedExportTransactionUps",
    "licenseNumberUps",
    "licenseDateUps",
    "licenseExceptionUps",
    "eccNumberUps",
    "recipientTaxIdUps",
    "blanketStartDateUps",
    "blanketEndDateUps",
    "shipmentWeightUps",
    "saturdayDeliveryFedEx",
    "saturdayPickupFedex",
    "sendShipNotifyEmailFedEx",
    "sendBackupEmailFedEx",
    "signatureHomeDeliveryFedEx",
    "shipNotifyEmailAddressFedEx",
    "backupEmailAddressFedEx",
    "shipDateFedEx",
    "homeDeliveryTypeFedEx",
    "homeDeliveryDateFedEx",
    "bookingConfirmationNumFedEx",
    "intlExemptionNumFedEx",
    "b13AFilingOptionFedEx",
    "b13AStatementDataFedEx",
    "thirdPartyAcctFedEx",
    "thirdPartyCountryFedEx",
    "thirdPartyTypeFedEx",
    "shipmentWeightFedEx",
    "termsOfSaleFedEx",
    "termsFreightChargeFedEx",
    "termsInsuranceChargeFedEx",
    "tranDate",
    "tranId",
    "shipMethod",
    "generateIntegratedShipperLabel",
    "shippingCost",
    "handlingCost",
    "memo",
    "transferLocation",
    "packageList",
    "packageUpsList",
    "packageUspsList",
    "packageFedExList",
    "itemList",
    "shipGroupList",
    "customFieldList"
})
public class ItemFulfillment
    extends Record
{

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifiedDate;
    protected RecordRef customForm;
    protected RecordRef postingPeriod;
    protected RecordRef entity;
    protected RecordRef createdFrom;
    protected Long createdFromShipGroup;
    protected RecordRef partner;
    protected ShipAddress transactionShipAddress;
    protected RecordRef shipAddressList;
    protected String shipAddress;
    protected ItemFulfillmentShipStatus shipStatus;
    protected Boolean saturdayDeliveryUps;
    protected Boolean sendShipNotifyEmailUps;
    protected Boolean sendBackupEmailUps;
    protected String shipNotifyEmailAddressUps;
    protected String shipNotifyEmailAddress2Ups;
    protected String backupEmailAddressUps;
    protected String shipNotifyEmailMessageUps;
    protected String thirdPartyAcctUps;
    protected String thirdPartyZipcodeUps;
    protected Country thirdPartyCountryUps;
    protected ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps;
    protected Boolean partiesToTransactionUps;
    protected ItemFulfillmentExportTypeUps exportTypeUps;
    protected ItemFulfillmentMethodOfTransportUps methodOfTransportUps;
    protected String carrierIdUps;
    protected String entryNumberUps;
    protected String inbondCodeUps;
    protected Boolean isRoutedExportTransactionUps;
    protected String licenseNumberUps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar licenseDateUps;
    protected ItemFulfillmentLicenseExceptionUps licenseExceptionUps;
    protected String eccNumberUps;
    protected String recipientTaxIdUps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar blanketStartDateUps;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar blanketEndDateUps;
    protected Double shipmentWeightUps;
    protected Boolean saturdayDeliveryFedEx;
    protected Boolean saturdayPickupFedex;
    protected Boolean sendShipNotifyEmailFedEx;
    protected Boolean sendBackupEmailFedEx;
    protected Boolean signatureHomeDeliveryFedEx;
    protected String shipNotifyEmailAddressFedEx;
    protected String backupEmailAddressFedEx;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar shipDateFedEx;
    protected ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar homeDeliveryDateFedEx;
    protected String bookingConfirmationNumFedEx;
    protected String intlExemptionNumFedEx;
    @XmlElement(name = "b13aFilingOptionFedEx")
    protected ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx;
    @XmlElement(name = "b13aStatementDataFedEx")
    protected String b13AStatementDataFedEx;
    protected String thirdPartyAcctFedEx;
    protected Country thirdPartyCountryFedEx;
    protected ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx;
    protected Double shipmentWeightFedEx;
    protected ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx;
    protected Double termsFreightChargeFedEx;
    protected Double termsInsuranceChargeFedEx;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tranDate;
    protected String tranId;
    protected RecordRef shipMethod;
    protected Boolean generateIntegratedShipperLabel;
    protected Double shippingCost;
    protected Double handlingCost;
    protected String memo;
    protected RecordRef transferLocation;
    protected ItemFulfillmentPackageList packageList;
    protected ItemFulfillmentPackageUpsList packageUpsList;
    protected ItemFulfillmentPackageUspsList packageUspsList;
    protected ItemFulfillmentPackageFedExList packageFedExList;
    protected ItemFulfillmentItemList itemList;
    protected ItemFulfillmentShipGroupList shipGroupList;
    protected CustomFieldList customFieldList;
    @XmlAttribute(name = "internalId")
    protected String internalId;
    @XmlAttribute(name = "externalId")
    protected String externalId;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the lastModifiedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifiedDate() {
        return lastModifiedDate;
    }

    /**
     * Sets the value of the lastModifiedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifiedDate(XMLGregorianCalendar value) {
        this.lastModifiedDate = value;
    }

    /**
     * Gets the value of the customForm property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCustomForm() {
        return customForm;
    }

    /**
     * Sets the value of the customForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCustomForm(RecordRef value) {
        this.customForm = value;
    }

    /**
     * Gets the value of the postingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPostingPeriod() {
        return postingPeriod;
    }

    /**
     * Sets the value of the postingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPostingPeriod(RecordRef value) {
        this.postingPeriod = value;
    }

    /**
     * Gets the value of the entity property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getEntity() {
        return entity;
    }

    /**
     * Sets the value of the entity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setEntity(RecordRef value) {
        this.entity = value;
    }

    /**
     * Gets the value of the createdFrom property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getCreatedFrom() {
        return createdFrom;
    }

    /**
     * Sets the value of the createdFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setCreatedFrom(RecordRef value) {
        this.createdFrom = value;
    }

    /**
     * Gets the value of the createdFromShipGroup property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreatedFromShipGroup() {
        return createdFromShipGroup;
    }

    /**
     * Sets the value of the createdFromShipGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreatedFromShipGroup(Long value) {
        this.createdFromShipGroup = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setPartner(RecordRef value) {
        this.partner = value;
    }

    /**
     * Gets the value of the transactionShipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link ShipAddress }
     *     
     */
    public ShipAddress getTransactionShipAddress() {
        return transactionShipAddress;
    }

    /**
     * Sets the value of the transactionShipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipAddress }
     *     
     */
    public void setTransactionShipAddress(ShipAddress value) {
        this.transactionShipAddress = value;
    }

    /**
     * Gets the value of the shipAddressList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipAddressList() {
        return shipAddressList;
    }

    /**
     * Sets the value of the shipAddressList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipAddressList(RecordRef value) {
        this.shipAddressList = value;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipAddress() {
        return shipAddress;
    }

    /**
     * Sets the value of the shipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipAddress(String value) {
        this.shipAddress = value;
    }

    /**
     * Gets the value of the shipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentShipStatus }
     *     
     */
    public ItemFulfillmentShipStatus getShipStatus() {
        return shipStatus;
    }

    /**
     * Sets the value of the shipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentShipStatus }
     *     
     */
    public void setShipStatus(ItemFulfillmentShipStatus value) {
        this.shipStatus = value;
    }

    /**
     * Gets the value of the saturdayDeliveryUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayDeliveryUps() {
        return saturdayDeliveryUps;
    }

    /**
     * Sets the value of the saturdayDeliveryUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayDeliveryUps(Boolean value) {
        this.saturdayDeliveryUps = value;
    }

    /**
     * Gets the value of the sendShipNotifyEmailUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendShipNotifyEmailUps() {
        return sendShipNotifyEmailUps;
    }

    /**
     * Sets the value of the sendShipNotifyEmailUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendShipNotifyEmailUps(Boolean value) {
        this.sendShipNotifyEmailUps = value;
    }

    /**
     * Gets the value of the sendBackupEmailUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendBackupEmailUps() {
        return sendBackupEmailUps;
    }

    /**
     * Sets the value of the sendBackupEmailUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendBackupEmailUps(Boolean value) {
        this.sendBackupEmailUps = value;
    }

    /**
     * Gets the value of the shipNotifyEmailAddressUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailAddressUps() {
        return shipNotifyEmailAddressUps;
    }

    /**
     * Sets the value of the shipNotifyEmailAddressUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailAddressUps(String value) {
        this.shipNotifyEmailAddressUps = value;
    }

    /**
     * Gets the value of the shipNotifyEmailAddress2Ups property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailAddress2Ups() {
        return shipNotifyEmailAddress2Ups;
    }

    /**
     * Sets the value of the shipNotifyEmailAddress2Ups property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailAddress2Ups(String value) {
        this.shipNotifyEmailAddress2Ups = value;
    }

    /**
     * Gets the value of the backupEmailAddressUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupEmailAddressUps() {
        return backupEmailAddressUps;
    }

    /**
     * Sets the value of the backupEmailAddressUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupEmailAddressUps(String value) {
        this.backupEmailAddressUps = value;
    }

    /**
     * Gets the value of the shipNotifyEmailMessageUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailMessageUps() {
        return shipNotifyEmailMessageUps;
    }

    /**
     * Sets the value of the shipNotifyEmailMessageUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailMessageUps(String value) {
        this.shipNotifyEmailMessageUps = value;
    }

    /**
     * Gets the value of the thirdPartyAcctUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcctUps() {
        return thirdPartyAcctUps;
    }

    /**
     * Sets the value of the thirdPartyAcctUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcctUps(String value) {
        this.thirdPartyAcctUps = value;
    }

    /**
     * Gets the value of the thirdPartyZipcodeUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyZipcodeUps() {
        return thirdPartyZipcodeUps;
    }

    /**
     * Sets the value of the thirdPartyZipcodeUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyZipcodeUps(String value) {
        this.thirdPartyZipcodeUps = value;
    }

    /**
     * Gets the value of the thirdPartyCountryUps property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getThirdPartyCountryUps() {
        return thirdPartyCountryUps;
    }

    /**
     * Sets the value of the thirdPartyCountryUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setThirdPartyCountryUps(Country value) {
        this.thirdPartyCountryUps = value;
    }

    /**
     * Gets the value of the thirdPartyTypeUps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentThirdPartyTypeUps }
     *     
     */
    public ItemFulfillmentThirdPartyTypeUps getThirdPartyTypeUps() {
        return thirdPartyTypeUps;
    }

    /**
     * Sets the value of the thirdPartyTypeUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentThirdPartyTypeUps }
     *     
     */
    public void setThirdPartyTypeUps(ItemFulfillmentThirdPartyTypeUps value) {
        this.thirdPartyTypeUps = value;
    }

    /**
     * Gets the value of the partiesToTransactionUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPartiesToTransactionUps() {
        return partiesToTransactionUps;
    }

    /**
     * Sets the value of the partiesToTransactionUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPartiesToTransactionUps(Boolean value) {
        this.partiesToTransactionUps = value;
    }

    /**
     * Gets the value of the exportTypeUps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentExportTypeUps }
     *     
     */
    public ItemFulfillmentExportTypeUps getExportTypeUps() {
        return exportTypeUps;
    }

    /**
     * Sets the value of the exportTypeUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentExportTypeUps }
     *     
     */
    public void setExportTypeUps(ItemFulfillmentExportTypeUps value) {
        this.exportTypeUps = value;
    }

    /**
     * Gets the value of the methodOfTransportUps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentMethodOfTransportUps }
     *     
     */
    public ItemFulfillmentMethodOfTransportUps getMethodOfTransportUps() {
        return methodOfTransportUps;
    }

    /**
     * Sets the value of the methodOfTransportUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentMethodOfTransportUps }
     *     
     */
    public void setMethodOfTransportUps(ItemFulfillmentMethodOfTransportUps value) {
        this.methodOfTransportUps = value;
    }

    /**
     * Gets the value of the carrierIdUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierIdUps() {
        return carrierIdUps;
    }

    /**
     * Sets the value of the carrierIdUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierIdUps(String value) {
        this.carrierIdUps = value;
    }

    /**
     * Gets the value of the entryNumberUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumberUps() {
        return entryNumberUps;
    }

    /**
     * Sets the value of the entryNumberUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumberUps(String value) {
        this.entryNumberUps = value;
    }

    /**
     * Gets the value of the inbondCodeUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInbondCodeUps() {
        return inbondCodeUps;
    }

    /**
     * Sets the value of the inbondCodeUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInbondCodeUps(String value) {
        this.inbondCodeUps = value;
    }

    /**
     * Gets the value of the isRoutedExportTransactionUps property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRoutedExportTransactionUps() {
        return isRoutedExportTransactionUps;
    }

    /**
     * Sets the value of the isRoutedExportTransactionUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRoutedExportTransactionUps(Boolean value) {
        this.isRoutedExportTransactionUps = value;
    }

    /**
     * Gets the value of the licenseNumberUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLicenseNumberUps() {
        return licenseNumberUps;
    }

    /**
     * Sets the value of the licenseNumberUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLicenseNumberUps(String value) {
        this.licenseNumberUps = value;
    }

    /**
     * Gets the value of the licenseDateUps property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLicenseDateUps() {
        return licenseDateUps;
    }

    /**
     * Sets the value of the licenseDateUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLicenseDateUps(XMLGregorianCalendar value) {
        this.licenseDateUps = value;
    }

    /**
     * Gets the value of the licenseExceptionUps property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentLicenseExceptionUps }
     *     
     */
    public ItemFulfillmentLicenseExceptionUps getLicenseExceptionUps() {
        return licenseExceptionUps;
    }

    /**
     * Sets the value of the licenseExceptionUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentLicenseExceptionUps }
     *     
     */
    public void setLicenseExceptionUps(ItemFulfillmentLicenseExceptionUps value) {
        this.licenseExceptionUps = value;
    }

    /**
     * Gets the value of the eccNumberUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEccNumberUps() {
        return eccNumberUps;
    }

    /**
     * Sets the value of the eccNumberUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEccNumberUps(String value) {
        this.eccNumberUps = value;
    }

    /**
     * Gets the value of the recipientTaxIdUps property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientTaxIdUps() {
        return recipientTaxIdUps;
    }

    /**
     * Sets the value of the recipientTaxIdUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientTaxIdUps(String value) {
        this.recipientTaxIdUps = value;
    }

    /**
     * Gets the value of the blanketStartDateUps property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBlanketStartDateUps() {
        return blanketStartDateUps;
    }

    /**
     * Sets the value of the blanketStartDateUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBlanketStartDateUps(XMLGregorianCalendar value) {
        this.blanketStartDateUps = value;
    }

    /**
     * Gets the value of the blanketEndDateUps property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBlanketEndDateUps() {
        return blanketEndDateUps;
    }

    /**
     * Sets the value of the blanketEndDateUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBlanketEndDateUps(XMLGregorianCalendar value) {
        this.blanketEndDateUps = value;
    }

    /**
     * Gets the value of the shipmentWeightUps property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShipmentWeightUps() {
        return shipmentWeightUps;
    }

    /**
     * Sets the value of the shipmentWeightUps property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShipmentWeightUps(Double value) {
        this.shipmentWeightUps = value;
    }

    /**
     * Gets the value of the saturdayDeliveryFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayDeliveryFedEx() {
        return saturdayDeliveryFedEx;
    }

    /**
     * Sets the value of the saturdayDeliveryFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayDeliveryFedEx(Boolean value) {
        this.saturdayDeliveryFedEx = value;
    }

    /**
     * Gets the value of the saturdayPickupFedex property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSaturdayPickupFedex() {
        return saturdayPickupFedex;
    }

    /**
     * Sets the value of the saturdayPickupFedex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSaturdayPickupFedex(Boolean value) {
        this.saturdayPickupFedex = value;
    }

    /**
     * Gets the value of the sendShipNotifyEmailFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendShipNotifyEmailFedEx() {
        return sendShipNotifyEmailFedEx;
    }

    /**
     * Sets the value of the sendShipNotifyEmailFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendShipNotifyEmailFedEx(Boolean value) {
        this.sendShipNotifyEmailFedEx = value;
    }

    /**
     * Gets the value of the sendBackupEmailFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendBackupEmailFedEx() {
        return sendBackupEmailFedEx;
    }

    /**
     * Sets the value of the sendBackupEmailFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendBackupEmailFedEx(Boolean value) {
        this.sendBackupEmailFedEx = value;
    }

    /**
     * Gets the value of the signatureHomeDeliveryFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignatureHomeDeliveryFedEx() {
        return signatureHomeDeliveryFedEx;
    }

    /**
     * Sets the value of the signatureHomeDeliveryFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignatureHomeDeliveryFedEx(Boolean value) {
        this.signatureHomeDeliveryFedEx = value;
    }

    /**
     * Gets the value of the shipNotifyEmailAddressFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipNotifyEmailAddressFedEx() {
        return shipNotifyEmailAddressFedEx;
    }

    /**
     * Sets the value of the shipNotifyEmailAddressFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipNotifyEmailAddressFedEx(String value) {
        this.shipNotifyEmailAddressFedEx = value;
    }

    /**
     * Gets the value of the backupEmailAddressFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupEmailAddressFedEx() {
        return backupEmailAddressFedEx;
    }

    /**
     * Sets the value of the backupEmailAddressFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupEmailAddressFedEx(String value) {
        this.backupEmailAddressFedEx = value;
    }

    /**
     * Gets the value of the shipDateFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDateFedEx() {
        return shipDateFedEx;
    }

    /**
     * Sets the value of the shipDateFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDateFedEx(XMLGregorianCalendar value) {
        this.shipDateFedEx = value;
    }

    /**
     * Gets the value of the homeDeliveryTypeFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentHomeDeliveryTypeFedEx }
     *     
     */
    public ItemFulfillmentHomeDeliveryTypeFedEx getHomeDeliveryTypeFedEx() {
        return homeDeliveryTypeFedEx;
    }

    /**
     * Sets the value of the homeDeliveryTypeFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentHomeDeliveryTypeFedEx }
     *     
     */
    public void setHomeDeliveryTypeFedEx(ItemFulfillmentHomeDeliveryTypeFedEx value) {
        this.homeDeliveryTypeFedEx = value;
    }

    /**
     * Gets the value of the homeDeliveryDateFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHomeDeliveryDateFedEx() {
        return homeDeliveryDateFedEx;
    }

    /**
     * Sets the value of the homeDeliveryDateFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHomeDeliveryDateFedEx(XMLGregorianCalendar value) {
        this.homeDeliveryDateFedEx = value;
    }

    /**
     * Gets the value of the bookingConfirmationNumFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingConfirmationNumFedEx() {
        return bookingConfirmationNumFedEx;
    }

    /**
     * Sets the value of the bookingConfirmationNumFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingConfirmationNumFedEx(String value) {
        this.bookingConfirmationNumFedEx = value;
    }

    /**
     * Gets the value of the intlExemptionNumFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntlExemptionNumFedEx() {
        return intlExemptionNumFedEx;
    }

    /**
     * Sets the value of the intlExemptionNumFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntlExemptionNumFedEx(String value) {
        this.intlExemptionNumFedEx = value;
    }

    /**
     * Gets the value of the b13AFilingOptionFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentB13AFilingOptionFedEx }
     *     
     */
    public ItemFulfillmentB13AFilingOptionFedEx getB13AFilingOptionFedEx() {
        return b13AFilingOptionFedEx;
    }

    /**
     * Sets the value of the b13AFilingOptionFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentB13AFilingOptionFedEx }
     *     
     */
    public void setB13AFilingOptionFedEx(ItemFulfillmentB13AFilingOptionFedEx value) {
        this.b13AFilingOptionFedEx = value;
    }

    /**
     * Gets the value of the b13AStatementDataFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getB13AStatementDataFedEx() {
        return b13AStatementDataFedEx;
    }

    /**
     * Sets the value of the b13AStatementDataFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setB13AStatementDataFedEx(String value) {
        this.b13AStatementDataFedEx = value;
    }

    /**
     * Gets the value of the thirdPartyAcctFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThirdPartyAcctFedEx() {
        return thirdPartyAcctFedEx;
    }

    /**
     * Sets the value of the thirdPartyAcctFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThirdPartyAcctFedEx(String value) {
        this.thirdPartyAcctFedEx = value;
    }

    /**
     * Gets the value of the thirdPartyCountryFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getThirdPartyCountryFedEx() {
        return thirdPartyCountryFedEx;
    }

    /**
     * Sets the value of the thirdPartyCountryFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setThirdPartyCountryFedEx(Country value) {
        this.thirdPartyCountryFedEx = value;
    }

    /**
     * Gets the value of the thirdPartyTypeFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentThirdPartyTypeFedEx }
     *     
     */
    public ItemFulfillmentThirdPartyTypeFedEx getThirdPartyTypeFedEx() {
        return thirdPartyTypeFedEx;
    }

    /**
     * Sets the value of the thirdPartyTypeFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentThirdPartyTypeFedEx }
     *     
     */
    public void setThirdPartyTypeFedEx(ItemFulfillmentThirdPartyTypeFedEx value) {
        this.thirdPartyTypeFedEx = value;
    }

    /**
     * Gets the value of the shipmentWeightFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShipmentWeightFedEx() {
        return shipmentWeightFedEx;
    }

    /**
     * Sets the value of the shipmentWeightFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShipmentWeightFedEx(Double value) {
        this.shipmentWeightFedEx = value;
    }

    /**
     * Gets the value of the termsOfSaleFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentTermsOfSaleFedEx }
     *     
     */
    public ItemFulfillmentTermsOfSaleFedEx getTermsOfSaleFedEx() {
        return termsOfSaleFedEx;
    }

    /**
     * Sets the value of the termsOfSaleFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentTermsOfSaleFedEx }
     *     
     */
    public void setTermsOfSaleFedEx(ItemFulfillmentTermsOfSaleFedEx value) {
        this.termsOfSaleFedEx = value;
    }

    /**
     * Gets the value of the termsFreightChargeFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTermsFreightChargeFedEx() {
        return termsFreightChargeFedEx;
    }

    /**
     * Sets the value of the termsFreightChargeFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTermsFreightChargeFedEx(Double value) {
        this.termsFreightChargeFedEx = value;
    }

    /**
     * Gets the value of the termsInsuranceChargeFedEx property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTermsInsuranceChargeFedEx() {
        return termsInsuranceChargeFedEx;
    }

    /**
     * Sets the value of the termsInsuranceChargeFedEx property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTermsInsuranceChargeFedEx(Double value) {
        this.termsInsuranceChargeFedEx = value;
    }

    /**
     * Gets the value of the tranDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranDate() {
        return tranDate;
    }

    /**
     * Sets the value of the tranDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranDate(XMLGregorianCalendar value) {
        this.tranDate = value;
    }

    /**
     * Gets the value of the tranId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranId() {
        return tranId;
    }

    /**
     * Sets the value of the tranId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranId(String value) {
        this.tranId = value;
    }

    /**
     * Gets the value of the shipMethod property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getShipMethod() {
        return shipMethod;
    }

    /**
     * Sets the value of the shipMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setShipMethod(RecordRef value) {
        this.shipMethod = value;
    }

    /**
     * Gets the value of the generateIntegratedShipperLabel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGenerateIntegratedShipperLabel() {
        return generateIntegratedShipperLabel;
    }

    /**
     * Sets the value of the generateIntegratedShipperLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGenerateIntegratedShipperLabel(Boolean value) {
        this.generateIntegratedShipperLabel = value;
    }

    /**
     * Gets the value of the shippingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShippingCost() {
        return shippingCost;
    }

    /**
     * Sets the value of the shippingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShippingCost(Double value) {
        this.shippingCost = value;
    }

    /**
     * Gets the value of the handlingCost property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHandlingCost() {
        return handlingCost;
    }

    /**
     * Sets the value of the handlingCost property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHandlingCost(Double value) {
        this.handlingCost = value;
    }

    /**
     * Gets the value of the memo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemo() {
        return memo;
    }

    /**
     * Sets the value of the memo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemo(String value) {
        this.memo = value;
    }

    /**
     * Gets the value of the transferLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RecordRef }
     *     
     */
    public RecordRef getTransferLocation() {
        return transferLocation;
    }

    /**
     * Sets the value of the transferLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordRef }
     *     
     */
    public void setTransferLocation(RecordRef value) {
        this.transferLocation = value;
    }

    /**
     * Gets the value of the packageList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageList }
     *     
     */
    public ItemFulfillmentPackageList getPackageList() {
        return packageList;
    }

    /**
     * Sets the value of the packageList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageList }
     *     
     */
    public void setPackageList(ItemFulfillmentPackageList value) {
        this.packageList = value;
    }

    /**
     * Gets the value of the packageUpsList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUpsList }
     *     
     */
    public ItemFulfillmentPackageUpsList getPackageUpsList() {
        return packageUpsList;
    }

    /**
     * Sets the value of the packageUpsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUpsList }
     *     
     */
    public void setPackageUpsList(ItemFulfillmentPackageUpsList value) {
        this.packageUpsList = value;
    }

    /**
     * Gets the value of the packageUspsList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageUspsList }
     *     
     */
    public ItemFulfillmentPackageUspsList getPackageUspsList() {
        return packageUspsList;
    }

    /**
     * Sets the value of the packageUspsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageUspsList }
     *     
     */
    public void setPackageUspsList(ItemFulfillmentPackageUspsList value) {
        this.packageUspsList = value;
    }

    /**
     * Gets the value of the packageFedExList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentPackageFedExList }
     *     
     */
    public ItemFulfillmentPackageFedExList getPackageFedExList() {
        return packageFedExList;
    }

    /**
     * Sets the value of the packageFedExList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentPackageFedExList }
     *     
     */
    public void setPackageFedExList(ItemFulfillmentPackageFedExList value) {
        this.packageFedExList = value;
    }

    /**
     * Gets the value of the itemList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentItemList }
     *     
     */
    public ItemFulfillmentItemList getItemList() {
        return itemList;
    }

    /**
     * Sets the value of the itemList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentItemList }
     *     
     */
    public void setItemList(ItemFulfillmentItemList value) {
        this.itemList = value;
    }

    /**
     * Gets the value of the shipGroupList property.
     * 
     * @return
     *     possible object is
     *     {@link ItemFulfillmentShipGroupList }
     *     
     */
    public ItemFulfillmentShipGroupList getShipGroupList() {
        return shipGroupList;
    }

    /**
     * Sets the value of the shipGroupList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemFulfillmentShipGroupList }
     *     
     */
    public void setShipGroupList(ItemFulfillmentShipGroupList value) {
        this.shipGroupList = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link CustomFieldList }
     *     
     */
    public CustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomFieldList }
     *     
     */
    public void setCustomFieldList(CustomFieldList value) {
        this.customFieldList = value;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalId() {
        return internalId;
    }

    /**
     * Sets the value of the internalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalId(String value) {
        this.internalId = value;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalId() {
        return externalId;
    }

    /**
     * Sets the value of the externalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalId(String value) {
        this.externalId = value;
    }

}
