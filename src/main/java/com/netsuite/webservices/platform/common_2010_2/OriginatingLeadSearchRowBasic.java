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

import com.netsuite.webservices.platform.core_2010_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnCustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDateField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDoubleField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnLongField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnStringField;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OriginatingLeadSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginatingLeadSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="altContact" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availableOffline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="balance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billAddress" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="buyingReason" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="buyingTimeFrame" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccCustomerCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccDefault" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccExpDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccHolderName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ccType" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="companyName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contact" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contribution" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contributionPrimary" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="conversionDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditHoldOverride" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="creditLimit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="currency" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateClosed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="daysOverdue" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="depositBalance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="emailTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="entityStatus" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="estimatedBudget" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="explicitConversion" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="faxTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstOrderDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstSaleDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giveAccess" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="groupPricingLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hasDuplicates" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="homePhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isBudgetApproved" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isPerson" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isShipAddress" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemPricingLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemPricingUnitPrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobEndDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobProjectedEnd" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobStartDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="jobType" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="leadDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="leadSource" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manualCreditHold" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="middleName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onCreditHold" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overdueBalance" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partner" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partnerContribution" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partnerRole" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="partnerTeamMember" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pec" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prefCCProcessor" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="priceLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pricingItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="printTransactions" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prospectDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reminderDays" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="resaleNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="role" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesReadiness" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesRep" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesTeamMember" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesTeamRole" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salutation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipAddress" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipComplete" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shippingItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="terms" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="territory" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="title" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unbilledOrders" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="url" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vatRegNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="webLead" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="customFieldList" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnCustomFieldList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginatingLeadSearchRowBasic", propOrder = {
    "accountNumber",
    "altContact",
    "availableOffline",
    "balance",
    "billAddress",
    "buyingReason",
    "buyingTimeFrame",
    "category",
    "ccCustomerCode",
    "ccDefault",
    "ccExpDate",
    "ccHolderName",
    "ccNumber",
    "ccType",
    "companyName",
    "contact",
    "contribution",
    "contributionPrimary",
    "conversionDate",
    "creditHoldOverride",
    "creditLimit",
    "currency",
    "dateClosed",
    "daysOverdue",
    "depositBalance",
    "emailTransactions",
    "endDate",
    "entityStatus",
    "estimatedBudget",
    "explicitConversion",
    "faxTransactions",
    "firstName",
    "firstOrderDate",
    "firstSaleDate",
    "giveAccess",
    "groupPricingLevel",
    "hasDuplicates",
    "homePhone",
    "isBudgetApproved",
    "isPerson",
    "isShipAddress",
    "itemPricingLevel",
    "itemPricingUnitPrice",
    "jobEndDate",
    "jobProjectedEnd",
    "jobStartDate",
    "jobType",
    "lastName",
    "leadDate",
    "leadSource",
    "manualCreditHold",
    "middleName",
    "mobilePhone",
    "onCreditHold",
    "overdueBalance",
    "parent",
    "partner",
    "partnerContribution",
    "partnerRole",
    "partnerTeamMember",
    "pec",
    "prefCCProcessor",
    "priceLevel",
    "pricingGroup",
    "pricingItem",
    "printTransactions",
    "prospectDate",
    "reminderDays",
    "resaleNumber",
    "role",
    "salesReadiness",
    "salesRep",
    "salesTeamMember",
    "salesTeamRole",
    "salutation",
    "shipAddress",
    "shipComplete",
    "shippingItem",
    "stage",
    "startDate",
    "taxable",
    "taxItem",
    "terms",
    "territory",
    "title",
    "unbilledOrders",
    "url",
    "vatRegNumber",
    "webLead",
    "customFieldList"
})
public class OriginatingLeadSearchRowBasic {

    protected List<SearchColumnStringField> accountNumber;
    protected List<SearchColumnStringField> altContact;
    protected List<SearchColumnBooleanField> availableOffline;
    protected List<SearchColumnDoubleField> balance;
    protected List<SearchColumnStringField> billAddress;
    protected List<SearchColumnStringField> buyingReason;
    protected List<SearchColumnStringField> buyingTimeFrame;
    protected List<SearchColumnSelectField> category;
    protected List<SearchColumnStringField> ccCustomerCode;
    protected List<SearchColumnBooleanField> ccDefault;
    protected List<SearchColumnDateField> ccExpDate;
    protected List<SearchColumnStringField> ccHolderName;
    protected List<SearchColumnStringField> ccNumber;
    protected List<SearchColumnSelectField> ccType;
    protected List<SearchColumnStringField> companyName;
    protected List<SearchColumnStringField> contact;
    protected List<SearchColumnDoubleField> contribution;
    protected List<SearchColumnDoubleField> contributionPrimary;
    protected List<SearchColumnDateField> conversionDate;
    protected List<SearchColumnBooleanField> creditHoldOverride;
    protected List<SearchColumnDoubleField> creditLimit;
    protected List<SearchColumnSelectField> currency;
    protected List<SearchColumnDateField> dateClosed;
    protected List<SearchColumnLongField> daysOverdue;
    protected List<SearchColumnDoubleField> depositBalance;
    protected List<SearchColumnBooleanField> emailTransactions;
    protected List<SearchColumnDateField> endDate;
    protected List<SearchColumnSelectField> entityStatus;
    protected List<SearchColumnDoubleField> estimatedBudget;
    protected List<SearchColumnBooleanField> explicitConversion;
    protected List<SearchColumnBooleanField> faxTransactions;
    protected List<SearchColumnStringField> firstName;
    protected List<SearchColumnDateField> firstOrderDate;
    protected List<SearchColumnDateField> firstSaleDate;
    protected List<SearchColumnBooleanField> giveAccess;
    protected List<SearchColumnStringField> groupPricingLevel;
    protected List<SearchColumnBooleanField> hasDuplicates;
    protected List<SearchColumnStringField> homePhone;
    protected List<SearchColumnBooleanField> isBudgetApproved;
    protected List<SearchColumnBooleanField> isPerson;
    protected List<SearchColumnBooleanField> isShipAddress;
    protected List<SearchColumnStringField> itemPricingLevel;
    protected List<SearchColumnDoubleField> itemPricingUnitPrice;
    protected List<SearchColumnDateField> jobEndDate;
    protected List<SearchColumnDateField> jobProjectedEnd;
    protected List<SearchColumnDateField> jobStartDate;
    protected List<SearchColumnSelectField> jobType;
    protected List<SearchColumnStringField> lastName;
    protected List<SearchColumnDateField> leadDate;
    protected List<SearchColumnSelectField> leadSource;
    protected List<SearchColumnBooleanField> manualCreditHold;
    protected List<SearchColumnStringField> middleName;
    protected List<SearchColumnStringField> mobilePhone;
    protected List<SearchColumnBooleanField> onCreditHold;
    protected List<SearchColumnDoubleField> overdueBalance;
    protected List<SearchColumnSelectField> parent;
    protected List<SearchColumnSelectField> partner;
    protected List<SearchColumnDoubleField> partnerContribution;
    protected List<SearchColumnStringField> partnerRole;
    protected List<SearchColumnSelectField> partnerTeamMember;
    protected List<SearchColumnStringField> pec;
    protected List<SearchColumnSelectField> prefCCProcessor;
    protected List<SearchColumnSelectField> priceLevel;
    protected List<SearchColumnStringField> pricingGroup;
    protected List<SearchColumnStringField> pricingItem;
    protected List<SearchColumnBooleanField> printTransactions;
    protected List<SearchColumnDateField> prospectDate;
    protected List<SearchColumnLongField> reminderDays;
    protected List<SearchColumnStringField> resaleNumber;
    protected List<SearchColumnStringField> role;
    protected List<SearchColumnStringField> salesReadiness;
    protected List<SearchColumnSelectField> salesRep;
    protected List<SearchColumnSelectField> salesTeamMember;
    protected List<SearchColumnSelectField> salesTeamRole;
    protected List<SearchColumnStringField> salutation;
    protected List<SearchColumnStringField> shipAddress;
    protected List<SearchColumnBooleanField> shipComplete;
    protected List<SearchColumnSelectField> shippingItem;
    protected List<SearchColumnStringField> stage;
    protected List<SearchColumnDateField> startDate;
    protected List<SearchColumnBooleanField> taxable;
    protected List<SearchColumnSelectField> taxItem;
    protected List<SearchColumnSelectField> terms;
    protected List<SearchColumnSelectField> territory;
    protected List<SearchColumnStringField> title;
    protected List<SearchColumnDoubleField> unbilledOrders;
    protected List<SearchColumnStringField> url;
    protected List<SearchColumnStringField> vatRegNumber;
    protected List<SearchColumnBooleanField> webLead;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the accountNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAccountNumber() {
        if (accountNumber == null) {
            accountNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.accountNumber;
    }

    /**
     * Gets the value of the altContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the altContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAltContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getAltContact() {
        if (altContact == null) {
            altContact = new ArrayList<SearchColumnStringField>();
        }
        return this.altContact;
    }

    /**
     * Gets the value of the availableOffline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableOffline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableOffline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAvailableOffline() {
        if (availableOffline == null) {
            availableOffline = new ArrayList<SearchColumnBooleanField>();
        }
        return this.availableOffline;
    }

    /**
     * Gets the value of the balance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the balance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBalance() {
        if (balance == null) {
            balance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.balance;
    }

    /**
     * Gets the value of the billAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBillAddress() {
        if (billAddress == null) {
            billAddress = new ArrayList<SearchColumnStringField>();
        }
        return this.billAddress;
    }

    /**
     * Gets the value of the buyingReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyingReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyingReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBuyingReason() {
        if (buyingReason == null) {
            buyingReason = new ArrayList<SearchColumnStringField>();
        }
        return this.buyingReason;
    }

    /**
     * Gets the value of the buyingTimeFrame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyingTimeFrame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyingTimeFrame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBuyingTimeFrame() {
        if (buyingTimeFrame == null) {
            buyingTimeFrame = new ArrayList<SearchColumnStringField>();
        }
        return this.buyingTimeFrame;
    }

    /**
     * Gets the value of the category property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the category property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCategory() {
        if (category == null) {
            category = new ArrayList<SearchColumnSelectField>();
        }
        return this.category;
    }

    /**
     * Gets the value of the ccCustomerCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccCustomerCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcCustomerCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcCustomerCode() {
        if (ccCustomerCode == null) {
            ccCustomerCode = new ArrayList<SearchColumnStringField>();
        }
        return this.ccCustomerCode;
    }

    /**
     * Gets the value of the ccDefault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccDefault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcDefault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getCcDefault() {
        if (ccDefault == null) {
            ccDefault = new ArrayList<SearchColumnBooleanField>();
        }
        return this.ccDefault;
    }

    /**
     * Gets the value of the ccExpDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccExpDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcExpDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCcExpDate() {
        if (ccExpDate == null) {
            ccExpDate = new ArrayList<SearchColumnDateField>();
        }
        return this.ccExpDate;
    }

    /**
     * Gets the value of the ccHolderName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccHolderName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcHolderName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcHolderName() {
        if (ccHolderName == null) {
            ccHolderName = new ArrayList<SearchColumnStringField>();
        }
        return this.ccHolderName;
    }

    /**
     * Gets the value of the ccNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCcNumber() {
        if (ccNumber == null) {
            ccNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.ccNumber;
    }

    /**
     * Gets the value of the ccType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ccType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCcType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCcType() {
        if (ccType == null) {
            ccType = new ArrayList<SearchColumnSelectField>();
        }
        return this.ccType;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCompanyName() {
        if (companyName == null) {
            companyName = new ArrayList<SearchColumnStringField>();
        }
        return this.companyName;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getContact() {
        if (contact == null) {
            contact = new ArrayList<SearchColumnStringField>();
        }
        return this.contact;
    }

    /**
     * Gets the value of the contribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getContribution() {
        if (contribution == null) {
            contribution = new ArrayList<SearchColumnDoubleField>();
        }
        return this.contribution;
    }

    /**
     * Gets the value of the contributionPrimary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contributionPrimary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContributionPrimary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getContributionPrimary() {
        if (contributionPrimary == null) {
            contributionPrimary = new ArrayList<SearchColumnDoubleField>();
        }
        return this.contributionPrimary;
    }

    /**
     * Gets the value of the conversionDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conversionDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConversionDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getConversionDate() {
        if (conversionDate == null) {
            conversionDate = new ArrayList<SearchColumnDateField>();
        }
        return this.conversionDate;
    }

    /**
     * Gets the value of the creditHoldOverride property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditHoldOverride property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditHoldOverride().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getCreditHoldOverride() {
        if (creditHoldOverride == null) {
            creditHoldOverride = new ArrayList<SearchColumnBooleanField>();
        }
        return this.creditHoldOverride;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the creditLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreditLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCreditLimit() {
        if (creditLimit == null) {
            creditLimit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.creditLimit;
    }

    /**
     * Gets the value of the currency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getCurrency() {
        if (currency == null) {
            currency = new ArrayList<SearchColumnSelectField>();
        }
        return this.currency;
    }

    /**
     * Gets the value of the dateClosed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateClosed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateClosed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDateClosed() {
        if (dateClosed == null) {
            dateClosed = new ArrayList<SearchColumnDateField>();
        }
        return this.dateClosed;
    }

    /**
     * Gets the value of the daysOverdue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysOverdue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysOverdue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getDaysOverdue() {
        if (daysOverdue == null) {
            daysOverdue = new ArrayList<SearchColumnLongField>();
        }
        return this.daysOverdue;
    }

    /**
     * Gets the value of the depositBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDepositBalance() {
        if (depositBalance == null) {
            depositBalance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.depositBalance;
    }

    /**
     * Gets the value of the emailTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getEmailTransactions() {
        if (emailTransactions == null) {
            emailTransactions = new ArrayList<SearchColumnBooleanField>();
        }
        return this.emailTransactions;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getEndDate() {
        if (endDate == null) {
            endDate = new ArrayList<SearchColumnDateField>();
        }
        return this.endDate;
    }

    /**
     * Gets the value of the entityStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entityStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntityStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getEntityStatus() {
        if (entityStatus == null) {
            entityStatus = new ArrayList<SearchColumnSelectField>();
        }
        return this.entityStatus;
    }

    /**
     * Gets the value of the estimatedBudget property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estimatedBudget property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstimatedBudget().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getEstimatedBudget() {
        if (estimatedBudget == null) {
            estimatedBudget = new ArrayList<SearchColumnDoubleField>();
        }
        return this.estimatedBudget;
    }

    /**
     * Gets the value of the explicitConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the explicitConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExplicitConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getExplicitConversion() {
        if (explicitConversion == null) {
            explicitConversion = new ArrayList<SearchColumnBooleanField>();
        }
        return this.explicitConversion;
    }

    /**
     * Gets the value of the faxTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the faxTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFaxTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getFaxTransactions() {
        if (faxTransactions == null) {
            faxTransactions = new ArrayList<SearchColumnBooleanField>();
        }
        return this.faxTransactions;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFirstName() {
        if (firstName == null) {
            firstName = new ArrayList<SearchColumnStringField>();
        }
        return this.firstName;
    }

    /**
     * Gets the value of the firstOrderDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstOrderDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstOrderDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getFirstOrderDate() {
        if (firstOrderDate == null) {
            firstOrderDate = new ArrayList<SearchColumnDateField>();
        }
        return this.firstOrderDate;
    }

    /**
     * Gets the value of the firstSaleDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the firstSaleDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFirstSaleDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getFirstSaleDate() {
        if (firstSaleDate == null) {
            firstSaleDate = new ArrayList<SearchColumnDateField>();
        }
        return this.firstSaleDate;
    }

    /**
     * Gets the value of the giveAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giveAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiveAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getGiveAccess() {
        if (giveAccess == null) {
            giveAccess = new ArrayList<SearchColumnBooleanField>();
        }
        return this.giveAccess;
    }

    /**
     * Gets the value of the groupPricingLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the groupPricingLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGroupPricingLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGroupPricingLevel() {
        if (groupPricingLevel == null) {
            groupPricingLevel = new ArrayList<SearchColumnStringField>();
        }
        return this.groupPricingLevel;
    }

    /**
     * Gets the value of the hasDuplicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hasDuplicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHasDuplicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getHasDuplicates() {
        if (hasDuplicates == null) {
            hasDuplicates = new ArrayList<SearchColumnBooleanField>();
        }
        return this.hasDuplicates;
    }

    /**
     * Gets the value of the homePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the homePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHomePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getHomePhone() {
        if (homePhone == null) {
            homePhone = new ArrayList<SearchColumnStringField>();
        }
        return this.homePhone;
    }

    /**
     * Gets the value of the isBudgetApproved property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isBudgetApproved property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsBudgetApproved().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsBudgetApproved() {
        if (isBudgetApproved == null) {
            isBudgetApproved = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isBudgetApproved;
    }

    /**
     * Gets the value of the isPerson property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isPerson property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsPerson().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsPerson() {
        if (isPerson == null) {
            isPerson = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isPerson;
    }

    /**
     * Gets the value of the isShipAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isShipAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsShipAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsShipAddress() {
        if (isShipAddress == null) {
            isShipAddress = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isShipAddress;
    }

    /**
     * Gets the value of the itemPricingLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPricingLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPricingLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getItemPricingLevel() {
        if (itemPricingLevel == null) {
            itemPricingLevel = new ArrayList<SearchColumnStringField>();
        }
        return this.itemPricingLevel;
    }

    /**
     * Gets the value of the itemPricingUnitPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemPricingUnitPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemPricingUnitPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getItemPricingUnitPrice() {
        if (itemPricingUnitPrice == null) {
            itemPricingUnitPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.itemPricingUnitPrice;
    }

    /**
     * Gets the value of the jobEndDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobEndDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobEndDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getJobEndDate() {
        if (jobEndDate == null) {
            jobEndDate = new ArrayList<SearchColumnDateField>();
        }
        return this.jobEndDate;
    }

    /**
     * Gets the value of the jobProjectedEnd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobProjectedEnd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobProjectedEnd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getJobProjectedEnd() {
        if (jobProjectedEnd == null) {
            jobProjectedEnd = new ArrayList<SearchColumnDateField>();
        }
        return this.jobProjectedEnd;
    }

    /**
     * Gets the value of the jobStartDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobStartDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobStartDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getJobStartDate() {
        if (jobStartDate == null) {
            jobStartDate = new ArrayList<SearchColumnDateField>();
        }
        return this.jobStartDate;
    }

    /**
     * Gets the value of the jobType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getJobType() {
        if (jobType == null) {
            jobType = new ArrayList<SearchColumnSelectField>();
        }
        return this.jobType;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getLastName() {
        if (lastName == null) {
            lastName = new ArrayList<SearchColumnStringField>();
        }
        return this.lastName;
    }

    /**
     * Gets the value of the leadDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLeadDate() {
        if (leadDate == null) {
            leadDate = new ArrayList<SearchColumnDateField>();
        }
        return this.leadDate;
    }

    /**
     * Gets the value of the leadSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLeadSource() {
        if (leadSource == null) {
            leadSource = new ArrayList<SearchColumnSelectField>();
        }
        return this.leadSource;
    }

    /**
     * Gets the value of the manualCreditHold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manualCreditHold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManualCreditHold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getManualCreditHold() {
        if (manualCreditHold == null) {
            manualCreditHold = new ArrayList<SearchColumnBooleanField>();
        }
        return this.manualCreditHold;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<SearchColumnStringField>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the mobilePhone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mobilePhone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMobilePhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMobilePhone() {
        if (mobilePhone == null) {
            mobilePhone = new ArrayList<SearchColumnStringField>();
        }
        return this.mobilePhone;
    }

    /**
     * Gets the value of the onCreditHold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onCreditHold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnCreditHold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getOnCreditHold() {
        if (onCreditHold == null) {
            onCreditHold = new ArrayList<SearchColumnBooleanField>();
        }
        return this.onCreditHold;
    }

    /**
     * Gets the value of the overdueBalance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overdueBalance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverdueBalance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOverdueBalance() {
        if (overdueBalance == null) {
            overdueBalance = new ArrayList<SearchColumnDoubleField>();
        }
        return this.overdueBalance;
    }

    /**
     * Gets the value of the parent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the parent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getParent() {
        if (parent == null) {
            parent = new ArrayList<SearchColumnSelectField>();
        }
        return this.parent;
    }

    /**
     * Gets the value of the partner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPartner() {
        if (partner == null) {
            partner = new ArrayList<SearchColumnSelectField>();
        }
        return this.partner;
    }

    /**
     * Gets the value of the partnerContribution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerContribution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerContribution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPartnerContribution() {
        if (partnerContribution == null) {
            partnerContribution = new ArrayList<SearchColumnDoubleField>();
        }
        return this.partnerContribution;
    }

    /**
     * Gets the value of the partnerRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPartnerRole() {
        if (partnerRole == null) {
            partnerRole = new ArrayList<SearchColumnStringField>();
        }
        return this.partnerRole;
    }

    /**
     * Gets the value of the partnerTeamMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerTeamMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerTeamMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPartnerTeamMember() {
        if (partnerTeamMember == null) {
            partnerTeamMember = new ArrayList<SearchColumnSelectField>();
        }
        return this.partnerTeamMember;
    }

    /**
     * Gets the value of the pec property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pec property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPec().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPec() {
        if (pec == null) {
            pec = new ArrayList<SearchColumnStringField>();
        }
        return this.pec;
    }

    /**
     * Gets the value of the prefCCProcessor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefCCProcessor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefCCProcessor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPrefCCProcessor() {
        if (prefCCProcessor == null) {
            prefCCProcessor = new ArrayList<SearchColumnSelectField>();
        }
        return this.prefCCProcessor;
    }

    /**
     * Gets the value of the priceLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPriceLevel() {
        if (priceLevel == null) {
            priceLevel = new ArrayList<SearchColumnSelectField>();
        }
        return this.priceLevel;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPricingGroup() {
        if (pricingGroup == null) {
            pricingGroup = new ArrayList<SearchColumnStringField>();
        }
        return this.pricingGroup;
    }

    /**
     * Gets the value of the pricingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPricingItem() {
        if (pricingItem == null) {
            pricingItem = new ArrayList<SearchColumnStringField>();
        }
        return this.pricingItem;
    }

    /**
     * Gets the value of the printTransactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the printTransactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrintTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPrintTransactions() {
        if (printTransactions == null) {
            printTransactions = new ArrayList<SearchColumnBooleanField>();
        }
        return this.printTransactions;
    }

    /**
     * Gets the value of the prospectDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prospectDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProspectDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getProspectDate() {
        if (prospectDate == null) {
            prospectDate = new ArrayList<SearchColumnDateField>();
        }
        return this.prospectDate;
    }

    /**
     * Gets the value of the reminderDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reminderDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReminderDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getReminderDays() {
        if (reminderDays == null) {
            reminderDays = new ArrayList<SearchColumnLongField>();
        }
        return this.reminderDays;
    }

    /**
     * Gets the value of the resaleNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resaleNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResaleNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getResaleNumber() {
        if (resaleNumber == null) {
            resaleNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.resaleNumber;
    }

    /**
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getRole() {
        if (role == null) {
            role = new ArrayList<SearchColumnStringField>();
        }
        return this.role;
    }

    /**
     * Gets the value of the salesReadiness property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesReadiness property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesReadiness().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSalesReadiness() {
        if (salesReadiness == null) {
            salesReadiness = new ArrayList<SearchColumnStringField>();
        }
        return this.salesReadiness;
    }

    /**
     * Gets the value of the salesRep property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesRep property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesRep().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesRep() {
        if (salesRep == null) {
            salesRep = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesRep;
    }

    /**
     * Gets the value of the salesTeamMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTeamMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTeamMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesTeamMember() {
        if (salesTeamMember == null) {
            salesTeamMember = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesTeamMember;
    }

    /**
     * Gets the value of the salesTeamRole property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTeamRole property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTeamRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesTeamRole() {
        if (salesTeamRole == null) {
            salesTeamRole = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesTeamRole;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salutation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalutation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSalutation() {
        if (salutation == null) {
            salutation = new ArrayList<SearchColumnStringField>();
        }
        return this.salutation;
    }

    /**
     * Gets the value of the shipAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShipAddress() {
        if (shipAddress == null) {
            shipAddress = new ArrayList<SearchColumnStringField>();
        }
        return this.shipAddress;
    }

    /**
     * Gets the value of the shipComplete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipComplete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipComplete().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShipComplete() {
        if (shipComplete == null) {
            shipComplete = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shipComplete;
    }

    /**
     * Gets the value of the shippingItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getShippingItem() {
        if (shippingItem == null) {
            shippingItem = new ArrayList<SearchColumnSelectField>();
        }
        return this.shippingItem;
    }

    /**
     * Gets the value of the stage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStage() {
        if (stage == null) {
            stage = new ArrayList<SearchColumnStringField>();
        }
        return this.stage;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getStartDate() {
        if (startDate == null) {
            startDate = new ArrayList<SearchColumnDateField>();
        }
        return this.startDate;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getTaxable() {
        if (taxable == null) {
            taxable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.taxable;
    }

    /**
     * Gets the value of the taxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTaxItem() {
        if (taxItem == null) {
            taxItem = new ArrayList<SearchColumnSelectField>();
        }
        return this.taxItem;
    }

    /**
     * Gets the value of the terms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the terms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTerms() {
        if (terms == null) {
            terms = new ArrayList<SearchColumnSelectField>();
        }
        return this.terms;
    }

    /**
     * Gets the value of the territory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the territory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTerritory() {
        if (territory == null) {
            territory = new ArrayList<SearchColumnSelectField>();
        }
        return this.territory;
    }

    /**
     * Gets the value of the title property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the title property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getTitle() {
        if (title == null) {
            title = new ArrayList<SearchColumnStringField>();
        }
        return this.title;
    }

    /**
     * Gets the value of the unbilledOrders property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unbilledOrders property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbilledOrders().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getUnbilledOrders() {
        if (unbilledOrders == null) {
            unbilledOrders = new ArrayList<SearchColumnDoubleField>();
        }
        return this.unbilledOrders;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUrl() {
        if (url == null) {
            url = new ArrayList<SearchColumnStringField>();
        }
        return this.url;
    }

    /**
     * Gets the value of the vatRegNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vatRegNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVatRegNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVatRegNumber() {
        if (vatRegNumber == null) {
            vatRegNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.vatRegNumber;
    }

    /**
     * Gets the value of the webLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getWebLead() {
        if (webLead == null) {
            webLead = new ArrayList<SearchColumnBooleanField>();
        }
        return this.webLead;
    }

    /**
     * Gets the value of the customFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }

    /**
     * Sets the value of the customFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchColumnCustomFieldList }
     *     
     */
    public void setCustomFieldList(SearchColumnCustomFieldList value) {
        this.customFieldList = value;
    }

}
