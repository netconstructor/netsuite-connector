/**
 * Mule NetSuite Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */


package com.netsuite.webservices.platform.common_2010_2;

import com.netsuite.webservices.platform.core_2010_2.SearchBooleanField;
import com.netsuite.webservices.platform.core_2010_2.SearchCustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.SearchDateField;
import com.netsuite.webservices.platform.core_2010_2.SearchDoubleField;
import com.netsuite.webservices.platform.core_2010_2.SearchEnumMultiSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchLongField;
import com.netsuite.webservices.platform.core_2010_2.SearchMultiSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchRecord;
import com.netsuite.webservices.platform.core_2010_2.SearchStringField;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginatingLeadSearchBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatingLeadSearchBasic">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRecord">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="availableOffline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="balance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="boughtAmount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="boughtDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="buyingReason" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="buyingTimeFrame" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="ccCustomerCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccDefault" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="ccExpDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="ccHolderName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="ccType" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="classBought" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="companyName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="contribution" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="conversionDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="creditHoldOverride" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="custStage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="custStatus" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="dateClosed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="daysOverdue" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="depositBalance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="deptBought" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="emailTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="estimatedBudget" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="explicitConversion" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="faxTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="firstName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="firstOrderDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="firstSaleDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="group" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="groupPricingLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="hasDuplicates" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isBudgetApproved" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isPerson" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isReportedLead" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="isShipAddress" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="itemPricingLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemPricingUnitPrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="itemsBought" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="itemsOrdered" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="lastName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="leadDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="leadSource" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="locationBought" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="manualCreditHold" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="merchantAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="middleName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="onCreditHold" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="orderedAmount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="orderedDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="otherRelationships" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchEnumMultiSelectField" minOccurs="0"/>
 *         &lt;element name="overdueBalance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="parentItemsBought" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="parentItemsOrdered" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partnerContribution" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchLongField" minOccurs="0"/>
 *         &lt;element name="partnerRole" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="partnerTeamMember" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pec" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="priceLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="pricingItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="printTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="prospectDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="pstExempt" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="reminderDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="resaleNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="role" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesReadiness" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesTeamMember" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salesTeamRole" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="salutation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="shipComplete" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="shippingItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="stage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDateField" minOccurs="0"/>
 *         &lt;element name="subsidBought" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="taxable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="terms" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="territory" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchMultiSelectField" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="unbilledOrders" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchDoubleField" minOccurs="0"/>
 *         &lt;element name="url" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="vatRegNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchStringField" minOccurs="0"/>
 *         &lt;element name="webLead" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchBooleanField" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatingLeadSearchBasic", propOrder = {
    "accountNumber",
    "availableOffline",
    "balance",
    "boughtAmount",
    "boughtDate",
    "buyingReason",
    "buyingTimeFrame",
    "category",
    "ccCustomerCode",
    "ccDefault",
    "ccExpDate",
    "ccHolderName",
    "ccNumber",
    "ccType",
    "classBought",
    "companyName",
    "contact",
    "contribution",
    "conversionDate",
    "creditHoldOverride",
    "creditLimit",
    "currency",
    "custStage",
    "custStatus",
    "dateClosed",
    "daysOverdue",
    "depositBalance",
    "deptBought",
    "emailTransactions",
    "endDate",
    "entityStatus",
    "estimatedBudget",
    "explicitConversion",
    "faxTransactions",
    "firstName",
    "firstOrderDate",
    "firstSaleDate",
    "group",
    "groupPricingLevel",
    "hasDuplicates",
    "isBudgetApproved",
    "isPerson",
    "isReportedLead",
    "isShipAddress",
    "itemPricingLevel",
    "itemPricingUnitPrice",
    "itemsBought",
    "itemsOrdered",
    "lastName",
    "leadDate",
    "leadSource",
    "locationBought",
    "manualCreditHold",
    "merchantAccount",
    "middleName",
    "onCreditHold",
    "orderedAmount",
    "orderedDate",
    "otherRelationships",
    "overdueBalance",
    "parent",
    "parentItemsBought",
    "parentItemsOrdered",
    "partner",
    "partnerContribution",
    "partnerRole",
    "partnerTeamMember",
    "pec",
    "priceLevel",
    "pricingGroup",
    "pricingItem",
    "printTransactions",
    "prospectDate",
    "pstExempt",
    "reminderDate",
    "resaleNumber",
    "role",
    "salesReadiness",
    "salesRep",
    "salesTeamMember",
    "salesTeamRole",
    "salutation",
    "shipComplete",
    "shippingItem",
    "stage",
    "startDate",
    "subsidBought",
    "taxable",
    "terms",
    "territory",
    "title",
    "unbilledOrders",
    "url",
    "vatRegNumber",
    "webLead",
    "customFieldList"
})
public class OriginatingLeadSearchBasic
    extends SearchRecord
{

    protected SearchStringField accountNumber;
    protected SearchBooleanField availableOffline;
    protected SearchDoubleField balance;
    protected SearchDoubleField boughtAmount;
    protected SearchDateField boughtDate;
    protected SearchMultiSelectField buyingReason;
    protected SearchMultiSelectField buyingTimeFrame;
    protected SearchMultiSelectField category;
    protected SearchStringField ccCustomerCode;
    protected SearchBooleanField ccDefault;
    protected SearchDateField ccExpDate;
    protected SearchStringField ccHolderName;
    protected SearchStringField ccNumber;
    protected SearchMultiSelectField ccType;
    protected SearchMultiSelectField classBought;
    protected SearchStringField companyName;
    protected SearchStringField contact;
    protected SearchLongField contribution;
    protected SearchDateField conversionDate;
    protected SearchBooleanField creditHoldOverride;
    protected SearchDoubleField creditLimit;
    protected SearchMultiSelectField currency;
    protected SearchMultiSelectField custStage;
    protected SearchMultiSelectField custStatus;
    protected SearchDateField dateClosed;
    protected SearchLongField daysOverdue;
    protected SearchDoubleField depositBalance;
    protected SearchMultiSelectField deptBought;
    protected SearchBooleanField emailTransactions;
    protected SearchDateField endDate;
    protected SearchMultiSelectField entityStatus;
    protected SearchDoubleField estimatedBudget;
    protected SearchBooleanField explicitConversion;
    protected SearchBooleanField faxTransactions;
    protected SearchStringField firstName;
    protected SearchDateField firstOrderDate;
    protected SearchDateField firstSaleDate;
    protected SearchMultiSelectField group;
    protected SearchMultiSelectField groupPricingLevel;
    protected SearchBooleanField hasDuplicates;
    protected SearchBooleanField isBudgetApproved;
    protected SearchBooleanField isPerson;
    protected SearchBooleanField isReportedLead;
    protected SearchBooleanField isShipAddress;
    protected SearchMultiSelectField itemPricingLevel;
    protected SearchDoubleField itemPricingUnitPrice;
    protected SearchMultiSelectField itemsBought;
    protected SearchMultiSelectField itemsOrdered;
    protected SearchStringField lastName;
    protected SearchDateField leadDate;
    protected SearchMultiSelectField leadSource;
    protected SearchMultiSelectField locationBought;
    protected SearchBooleanField manualCreditHold;
    protected SearchMultiSelectField merchantAccount;
    protected SearchStringField middleName;
    protected SearchBooleanField onCreditHold;
    protected SearchDoubleField orderedAmount;
    protected SearchDateField orderedDate;
    protected SearchEnumMultiSelectField otherRelationships;
    protected SearchDoubleField overdueBalance;
    protected SearchMultiSelectField parent;
    protected SearchMultiSelectField parentItemsBought;
    protected SearchMultiSelectField parentItemsOrdered;
    protected SearchMultiSelectField partner;
    protected SearchLongField partnerContribution;
    protected SearchMultiSelectField partnerRole;
    protected SearchMultiSelectField partnerTeamMember;
    protected SearchStringField pec;
    protected SearchMultiSelectField priceLevel;
    protected SearchMultiSelectField pricingGroup;
    protected SearchMultiSelectField pricingItem;
    protected SearchBooleanField printTransactions;
    protected SearchDateField prospectDate;
    protected SearchBooleanField pstExempt;
    protected SearchDateField reminderDate;
    protected SearchStringField resaleNumber;
    protected SearchMultiSelectField role;
    protected SearchMultiSelectField salesReadiness;
    protected SearchMultiSelectField salesRep;
    protected SearchMultiSelectField salesTeamMember;
    protected SearchMultiSelectField salesTeamRole;
    protected SearchStringField salutation;
    protected SearchBooleanField shipComplete;
    protected SearchMultiSelectField shippingItem;
    protected SearchMultiSelectField stage;
    protected SearchDateField startDate;
    protected SearchMultiSelectField subsidBought;
    protected SearchBooleanField taxable;
    protected SearchMultiSelectField terms;
    protected SearchMultiSelectField territory;
    protected SearchStringField title;
    protected SearchDoubleField unbilledOrders;
    protected SearchStringField url;
    protected SearchStringField vatRegNumber;
    protected SearchBooleanField webLead;
    protected SearchCustomFieldList customFieldList;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setAccountNumber(SearchStringField value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the availableOffline property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getAvailableOffline() {
        return availableOffline;
    }

    /**
     * Sets the value of the availableOffline property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setAvailableOffline(SearchBooleanField value) {
        this.availableOffline = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBalance(SearchDoubleField value) {
        this.balance = value;
    }

    /**
     * Gets the value of the boughtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getBoughtAmount() {
        return boughtAmount;
    }

    /**
     * Sets the value of the boughtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setBoughtAmount(SearchDoubleField value) {
        this.boughtAmount = value;
    }

    /**
     * Gets the value of the boughtDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getBoughtDate() {
        return boughtDate;
    }

    /**
     * Sets the value of the boughtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setBoughtDate(SearchDateField value) {
        this.boughtDate = value;
    }

    /**
     * Gets the value of the buyingReason property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBuyingReason() {
        return buyingReason;
    }

    /**
     * Sets the value of the buyingReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBuyingReason(SearchMultiSelectField value) {
        this.buyingReason = value;
    }

    /**
     * Gets the value of the buyingTimeFrame property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getBuyingTimeFrame() {
        return buyingTimeFrame;
    }

    /**
     * Sets the value of the buyingTimeFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setBuyingTimeFrame(SearchMultiSelectField value) {
        this.buyingTimeFrame = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCategory(SearchMultiSelectField value) {
        this.category = value;
    }

    /**
     * Gets the value of the ccCustomerCode property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcCustomerCode() {
        return ccCustomerCode;
    }

    /**
     * Sets the value of the ccCustomerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcCustomerCode(SearchStringField value) {
        this.ccCustomerCode = value;
    }

    /**
     * Gets the value of the ccDefault property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCcDefault() {
        return ccDefault;
    }

    /**
     * Sets the value of the ccDefault property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCcDefault(SearchBooleanField value) {
        this.ccDefault = value;
    }

    /**
     * Gets the value of the ccExpDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getCcExpDate() {
        return ccExpDate;
    }

    /**
     * Sets the value of the ccExpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setCcExpDate(SearchDateField value) {
        this.ccExpDate = value;
    }

    /**
     * Gets the value of the ccHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcHolderName() {
        return ccHolderName;
    }

    /**
     * Sets the value of the ccHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcHolderName(SearchStringField value) {
        this.ccHolderName = value;
    }

    /**
     * Gets the value of the ccNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCcNumber() {
        return ccNumber;
    }

    /**
     * Sets the value of the ccNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCcNumber(SearchStringField value) {
        this.ccNumber = value;
    }

    /**
     * Gets the value of the ccType property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCcType() {
        return ccType;
    }

    /**
     * Sets the value of the ccType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCcType(SearchMultiSelectField value) {
        this.ccType = value;
    }

    /**
     * Gets the value of the classBought property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getClassBought() {
        return classBought;
    }

    /**
     * Sets the value of the classBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setClassBought(SearchMultiSelectField value) {
        this.classBought = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setCompanyName(SearchStringField value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setContact(SearchStringField value) {
        this.contact = value;
    }

    /**
     * Gets the value of the contribution property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getContribution() {
        return contribution;
    }

    /**
     * Sets the value of the contribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setContribution(SearchLongField value) {
        this.contribution = value;
    }

    /**
     * Gets the value of the conversionDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getConversionDate() {
        return conversionDate;
    }

    /**
     * Sets the value of the conversionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setConversionDate(SearchDateField value) {
        this.conversionDate = value;
    }

    /**
     * Gets the value of the creditHoldOverride property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getCreditHoldOverride() {
        return creditHoldOverride;
    }

    /**
     * Sets the value of the creditHoldOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setCreditHoldOverride(SearchBooleanField value) {
        this.creditHoldOverride = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setCreditLimit(SearchDoubleField value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCurrency(SearchMultiSelectField value) {
        this.currency = value;
    }

    /**
     * Gets the value of the custStage property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustStage() {
        return custStage;
    }

    /**
     * Sets the value of the custStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustStage(SearchMultiSelectField value) {
        this.custStage = value;
    }

    /**
     * Gets the value of the custStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getCustStatus() {
        return custStatus;
    }

    /**
     * Sets the value of the custStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setCustStatus(SearchMultiSelectField value) {
        this.custStatus = value;
    }

    /**
     * Gets the value of the dateClosed property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getDateClosed() {
        return dateClosed;
    }

    /**
     * Sets the value of the dateClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setDateClosed(SearchDateField value) {
        this.dateClosed = value;
    }

    /**
     * Gets the value of the daysOverdue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getDaysOverdue() {
        return daysOverdue;
    }

    /**
     * Sets the value of the daysOverdue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setDaysOverdue(SearchLongField value) {
        this.daysOverdue = value;
    }

    /**
     * Gets the value of the depositBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getDepositBalance() {
        return depositBalance;
    }

    /**
     * Sets the value of the depositBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setDepositBalance(SearchDoubleField value) {
        this.depositBalance = value;
    }

    /**
     * Gets the value of the deptBought property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getDeptBought() {
        return deptBought;
    }

    /**
     * Sets the value of the deptBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setDeptBought(SearchMultiSelectField value) {
        this.deptBought = value;
    }

    /**
     * Gets the value of the emailTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getEmailTransactions() {
        return emailTransactions;
    }

    /**
     * Sets the value of the emailTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setEmailTransactions(SearchBooleanField value) {
        this.emailTransactions = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setEndDate(SearchDateField value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getEntityStatus() {
        return entityStatus;
    }

    /**
     * Sets the value of the entityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setEntityStatus(SearchMultiSelectField value) {
        this.entityStatus = value;
    }

    /**
     * Gets the value of the estimatedBudget property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getEstimatedBudget() {
        return estimatedBudget;
    }

    /**
     * Sets the value of the estimatedBudget property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setEstimatedBudget(SearchDoubleField value) {
        this.estimatedBudget = value;
    }

    /**
     * Gets the value of the explicitConversion property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getExplicitConversion() {
        return explicitConversion;
    }

    /**
     * Sets the value of the explicitConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setExplicitConversion(SearchBooleanField value) {
        this.explicitConversion = value;
    }

    /**
     * Gets the value of the faxTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getFaxTransactions() {
        return faxTransactions;
    }

    /**
     * Sets the value of the faxTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setFaxTransactions(SearchBooleanField value) {
        this.faxTransactions = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setFirstName(SearchStringField value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the firstOrderDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getFirstOrderDate() {
        return firstOrderDate;
    }

    /**
     * Sets the value of the firstOrderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setFirstOrderDate(SearchDateField value) {
        this.firstOrderDate = value;
    }

    /**
     * Gets the value of the firstSaleDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getFirstSaleDate() {
        return firstSaleDate;
    }

    /**
     * Sets the value of the firstSaleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setFirstSaleDate(SearchDateField value) {
        this.firstSaleDate = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setGroup(SearchMultiSelectField value) {
        this.group = value;
    }

    /**
     * Gets the value of the groupPricingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getGroupPricingLevel() {
        return groupPricingLevel;
    }

    /**
     * Sets the value of the groupPricingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setGroupPricingLevel(SearchMultiSelectField value) {
        this.groupPricingLevel = value;
    }

    /**
     * Gets the value of the hasDuplicates property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getHasDuplicates() {
        return hasDuplicates;
    }

    /**
     * Sets the value of the hasDuplicates property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setHasDuplicates(SearchBooleanField value) {
        this.hasDuplicates = value;
    }

    /**
     * Gets the value of the isBudgetApproved property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsBudgetApproved() {
        return isBudgetApproved;
    }

    /**
     * Sets the value of the isBudgetApproved property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsBudgetApproved(SearchBooleanField value) {
        this.isBudgetApproved = value;
    }

    /**
     * Gets the value of the isPerson property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsPerson() {
        return isPerson;
    }

    /**
     * Sets the value of the isPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsPerson(SearchBooleanField value) {
        this.isPerson = value;
    }

    /**
     * Gets the value of the isReportedLead property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsReportedLead() {
        return isReportedLead;
    }

    /**
     * Sets the value of the isReportedLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsReportedLead(SearchBooleanField value) {
        this.isReportedLead = value;
    }

    /**
     * Gets the value of the isShipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getIsShipAddress() {
        return isShipAddress;
    }

    /**
     * Sets the value of the isShipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setIsShipAddress(SearchBooleanField value) {
        this.isShipAddress = value;
    }

    /**
     * Gets the value of the itemPricingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemPricingLevel() {
        return itemPricingLevel;
    }

    /**
     * Sets the value of the itemPricingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemPricingLevel(SearchMultiSelectField value) {
        this.itemPricingLevel = value;
    }

    /**
     * Gets the value of the itemPricingUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getItemPricingUnitPrice() {
        return itemPricingUnitPrice;
    }

    /**
     * Sets the value of the itemPricingUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setItemPricingUnitPrice(SearchDoubleField value) {
        this.itemPricingUnitPrice = value;
    }

    /**
     * Gets the value of the itemsBought property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemsBought() {
        return itemsBought;
    }

    /**
     * Sets the value of the itemsBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemsBought(SearchMultiSelectField value) {
        this.itemsBought = value;
    }

    /**
     * Gets the value of the itemsOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getItemsOrdered() {
        return itemsOrdered;
    }

    /**
     * Sets the value of the itemsOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setItemsOrdered(SearchMultiSelectField value) {
        this.itemsOrdered = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setLastName(SearchStringField value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the leadDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getLeadDate() {
        return leadDate;
    }

    /**
     * Sets the value of the leadDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setLeadDate(SearchDateField value) {
        this.leadDate = value;
    }

    /**
     * Gets the value of the leadSource property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLeadSource() {
        return leadSource;
    }

    /**
     * Sets the value of the leadSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLeadSource(SearchMultiSelectField value) {
        this.leadSource = value;
    }

    /**
     * Gets the value of the locationBought property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getLocationBought() {
        return locationBought;
    }

    /**
     * Sets the value of the locationBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setLocationBought(SearchMultiSelectField value) {
        this.locationBought = value;
    }

    /**
     * Gets the value of the manualCreditHold property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getManualCreditHold() {
        return manualCreditHold;
    }

    /**
     * Sets the value of the manualCreditHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setManualCreditHold(SearchBooleanField value) {
        this.manualCreditHold = value;
    }

    /**
     * Gets the value of the merchantAccount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getMerchantAccount() {
        return merchantAccount;
    }

    /**
     * Sets the value of the merchantAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setMerchantAccount(SearchMultiSelectField value) {
        this.merchantAccount = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setMiddleName(SearchStringField value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the onCreditHold property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getOnCreditHold() {
        return onCreditHold;
    }

    /**
     * Sets the value of the onCreditHold property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setOnCreditHold(SearchBooleanField value) {
        this.onCreditHold = value;
    }

    /**
     * Gets the value of the orderedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOrderedAmount() {
        return orderedAmount;
    }

    /**
     * Sets the value of the orderedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOrderedAmount(SearchDoubleField value) {
        this.orderedAmount = value;
    }

    /**
     * Gets the value of the orderedDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getOrderedDate() {
        return orderedDate;
    }

    /**
     * Sets the value of the orderedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setOrderedDate(SearchDateField value) {
        this.orderedDate = value;
    }

    /**
     * Gets the value of the otherRelationships property.
     * 
     * @return
     *     possible object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public SearchEnumMultiSelectField getOtherRelationships() {
        return otherRelationships;
    }

    /**
     * Sets the value of the otherRelationships property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchEnumMultiSelectField }
     *     
     */
    public void setOtherRelationships(SearchEnumMultiSelectField value) {
        this.otherRelationships = value;
    }

    /**
     * Gets the value of the overdueBalance property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getOverdueBalance() {
        return overdueBalance;
    }

    /**
     * Sets the value of the overdueBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setOverdueBalance(SearchDoubleField value) {
        this.overdueBalance = value;
    }

    /**
     * Gets the value of the parent property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParent() {
        return parent;
    }

    /**
     * Sets the value of the parent property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParent(SearchMultiSelectField value) {
        this.parent = value;
    }

    /**
     * Gets the value of the parentItemsBought property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParentItemsBought() {
        return parentItemsBought;
    }

    /**
     * Sets the value of the parentItemsBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParentItemsBought(SearchMultiSelectField value) {
        this.parentItemsBought = value;
    }

    /**
     * Gets the value of the parentItemsOrdered property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getParentItemsOrdered() {
        return parentItemsOrdered;
    }

    /**
     * Sets the value of the parentItemsOrdered property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setParentItemsOrdered(SearchMultiSelectField value) {
        this.parentItemsOrdered = value;
    }

    /**
     * Gets the value of the partner property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartner() {
        return partner;
    }

    /**
     * Sets the value of the partner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartner(SearchMultiSelectField value) {
        this.partner = value;
    }

    /**
     * Gets the value of the partnerContribution property.
     * 
     * @return
     *     possible object is
     *     {@link SearchLongField }
     *     
     */
    public SearchLongField getPartnerContribution() {
        return partnerContribution;
    }

    /**
     * Sets the value of the partnerContribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchLongField }
     *     
     */
    public void setPartnerContribution(SearchLongField value) {
        this.partnerContribution = value;
    }

    /**
     * Gets the value of the partnerRole property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartnerRole() {
        return partnerRole;
    }

    /**
     * Sets the value of the partnerRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartnerRole(SearchMultiSelectField value) {
        this.partnerRole = value;
    }

    /**
     * Gets the value of the partnerTeamMember property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPartnerTeamMember() {
        return partnerTeamMember;
    }

    /**
     * Sets the value of the partnerTeamMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPartnerTeamMember(SearchMultiSelectField value) {
        this.partnerTeamMember = value;
    }

    /**
     * Gets the value of the pec property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getPec() {
        return pec;
    }

    /**
     * Sets the value of the pec property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setPec(SearchStringField value) {
        this.pec = value;
    }

    /**
     * Gets the value of the priceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPriceLevel() {
        return priceLevel;
    }

    /**
     * Sets the value of the priceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPriceLevel(SearchMultiSelectField value) {
        this.priceLevel = value;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPricingGroup() {
        return pricingGroup;
    }

    /**
     * Sets the value of the pricingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPricingGroup(SearchMultiSelectField value) {
        this.pricingGroup = value;
    }

    /**
     * Gets the value of the pricingItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getPricingItem() {
        return pricingItem;
    }

    /**
     * Sets the value of the pricingItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setPricingItem(SearchMultiSelectField value) {
        this.pricingItem = value;
    }

    /**
     * Gets the value of the printTransactions property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPrintTransactions() {
        return printTransactions;
    }

    /**
     * Sets the value of the printTransactions property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPrintTransactions(SearchBooleanField value) {
        this.printTransactions = value;
    }

    /**
     * Gets the value of the prospectDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getProspectDate() {
        return prospectDate;
    }

    /**
     * Sets the value of the prospectDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setProspectDate(SearchDateField value) {
        this.prospectDate = value;
    }

    /**
     * Gets the value of the pstExempt property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getPstExempt() {
        return pstExempt;
    }

    /**
     * Sets the value of the pstExempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setPstExempt(SearchBooleanField value) {
        this.pstExempt = value;
    }

    /**
     * Gets the value of the reminderDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getReminderDate() {
        return reminderDate;
    }

    /**
     * Sets the value of the reminderDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setReminderDate(SearchDateField value) {
        this.reminderDate = value;
    }

    /**
     * Gets the value of the resaleNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getResaleNumber() {
        return resaleNumber;
    }

    /**
     * Sets the value of the resaleNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setResaleNumber(SearchStringField value) {
        this.resaleNumber = value;
    }

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setRole(SearchMultiSelectField value) {
        this.role = value;
    }

    /**
     * Gets the value of the salesReadiness property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesReadiness() {
        return salesReadiness;
    }

    /**
     * Sets the value of the salesReadiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesReadiness(SearchMultiSelectField value) {
        this.salesReadiness = value;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesRep() {
        return salesRep;
    }

    /**
     * Sets the value of the salesRep property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesRep(SearchMultiSelectField value) {
        this.salesRep = value;
    }

    /**
     * Gets the value of the salesTeamMember property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesTeamMember() {
        return salesTeamMember;
    }

    /**
     * Sets the value of the salesTeamMember property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesTeamMember(SearchMultiSelectField value) {
        this.salesTeamMember = value;
    }

    /**
     * Gets the value of the salesTeamRole property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSalesTeamRole() {
        return salesTeamRole;
    }

    /**
     * Sets the value of the salesTeamRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSalesTeamRole(SearchMultiSelectField value) {
        this.salesTeamRole = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setSalutation(SearchStringField value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the shipComplete property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getShipComplete() {
        return shipComplete;
    }

    /**
     * Sets the value of the shipComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setShipComplete(SearchBooleanField value) {
        this.shipComplete = value;
    }

    /**
     * Gets the value of the shippingItem property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getShippingItem() {
        return shippingItem;
    }

    /**
     * Sets the value of the shippingItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setShippingItem(SearchMultiSelectField value) {
        this.shippingItem = value;
    }

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getStage() {
        return stage;
    }

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setStage(SearchMultiSelectField value) {
        this.stage = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateField }
     *     
     */
    public SearchDateField getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateField }
     *     
     */
    public void setStartDate(SearchDateField value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the subsidBought property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getSubsidBought() {
        return subsidBought;
    }

    /**
     * Sets the value of the subsidBought property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setSubsidBought(SearchMultiSelectField value) {
        this.subsidBought = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getTaxable() {
        return taxable;
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setTaxable(SearchBooleanField value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTerms(SearchMultiSelectField value) {
        this.terms = value;
    }

    /**
     * Gets the value of the territory property.
     * 
     * @return
     *     possible object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public SearchMultiSelectField getTerritory() {
        return territory;
    }

    /**
     * Sets the value of the territory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchMultiSelectField }
     *     
     */
    public void setTerritory(SearchMultiSelectField value) {
        this.territory = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setTitle(SearchStringField value) {
        this.title = value;
    }

    /**
     * Gets the value of the unbilledOrders property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDoubleField }
     *     
     */
    public SearchDoubleField getUnbilledOrders() {
        return unbilledOrders;
    }

    /**
     * Sets the value of the unbilledOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDoubleField }
     *     
     */
    public void setUnbilledOrders(SearchDoubleField value) {
        this.unbilledOrders = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setUrl(SearchStringField value) {
        this.url = value;
    }

    /**
     * Gets the value of the vatRegNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SearchStringField }
     *     
     */
    public SearchStringField getVatRegNumber() {
        return vatRegNumber;
    }

    /**
     * Sets the value of the vatRegNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchStringField }
     *     
     */
    public void setVatRegNumber(SearchStringField value) {
        this.vatRegNumber = value;
    }

    /**
     * Gets the value of the webLead property.
     * 
     * @return
     *     possible object is
     *     {@link SearchBooleanField }
     *     
     */
    public SearchBooleanField getWebLead() {
        return webLead;
    }

    /**
     * Sets the value of the webLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchBooleanField }
     *     
     */
    public void setWebLead(SearchBooleanField value) {
        this.webLead = value;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchCustomFieldList value) {
        this.customFieldList = value;
    }

}
