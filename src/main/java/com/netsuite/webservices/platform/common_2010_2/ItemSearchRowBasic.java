
package com.netsuite.webservices.platform.common_2010_2;

import com.netsuite.webservices.platform.core_2010_2.SearchColumnBooleanField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnCustomFieldList;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDateField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnDoubleField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnEnumSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnLongField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnSelectField;
import com.netsuite.webservices.platform.core_2010_2.SearchColumnStringField;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItemSearchRowBasic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemSearchRowBasic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="assetAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="autoLeadTime" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="autoPreferredStockLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="autoReorderPoint" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="availableToPartners" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="averageCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="basePrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billExchRateVarianceAcct" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billPriceVarianceAcct" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="billQtyVarianceAcct" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="binNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="binOnHandAvail" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="binOnHandCount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="buildEntireAssembly" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="buyItNowPrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="category" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="class" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="copyDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costEstimate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costEstimateType" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="costingMethod" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="countryOfManufacture" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="created" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="createJob" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dateViewed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="daysBeforeExpiration" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="defaultReturnCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deferredExpenseAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="deferredRevenueAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="demandModifier" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="department" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="departmentnohierarchy" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="displayIneBayStore" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="displayName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dontShowPrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eBayItemDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eBayItemSubtitle" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="eBayItemTitle" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ebayRelistingOption" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="endAuctionsWhenOutOfStock" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="excludeFromSitemap" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expenseAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="externalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="featuredDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feedDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="feedName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="froogleProductFeed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="fxCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gainLossAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCertAuthCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCertEmail" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCertExpirationDate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCertFrom" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCertMessage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCertOriginalAmount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="giftCertRecipient" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="hits" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="imageUrl" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="incomeAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="internalId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="inventoryLocation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isAvailable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isDropShipItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isFulfillable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isGcoCompliant" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isInactive" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isOnline" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSpecialOrderItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isSpecialWorkOrderItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="issueProduct" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isTaxable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="isVsoeBundle" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="itemUrl" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastPurchasePrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="lastQuantityAvailableChange" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="leadTime" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="liabilityAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="listingDuration" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="location" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationAverageCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationBinQuantityAvailable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationDefaultReturnCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationPreferredStockLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationQuantityAvailable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationQuantityBackOrdered" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationQuantityCommitted" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationQuantityInTransit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationQuantityOnHand" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationQuantityOnOrder" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationReOrderPoint" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationTotalValue" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturer" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturerAddr1" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturerCity" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturerState" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturerTariff" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturerTaxId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="manufacturerZip" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="matchBillToReceipt" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="memberItem" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="memberQuantity" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="metaTagHtml" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="minimumQuantity" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="modified" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDateField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="mpn" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="multManufactureAddr" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nextagCategory" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nextagProductFeed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="noPriceMessage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numActiveListings" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numberAllowedDownloads" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="numCurrentlyListed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offerSupport" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onlineCustomerPrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onlinePrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="onSpecial" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherPrices" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="otherVendor" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outOfStockBehavior" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="outOfStockMessage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="overallQuantityPricingType" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageTitle" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="parent" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferenceCriterion" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferredBin" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferredLocation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferredStockLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="preferredStockLevelDays" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pricingGroup" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="primaryCategory" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purchaseDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purchaseUnit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantityAvailable" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantityBackOrdered" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantityCommitted" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantityOnHand" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantityOnOrder" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="quantityPricingSchedule" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reorderMultiple" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reOrderPoint" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="reservePrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="revRecSchedule" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="safetyStockLevel" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="safetyStockLevelDays" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="salesTaxCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="saleUnit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduleBCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduleBNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="scheduleBQuantity" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="searchKeywords" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="seasonalDemand" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sellOnEBay" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serialNumber" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serialNumberLocation" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipIndividually" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shipPackage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shippingRate" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shoppingDotComCategory" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shoppingProductFeed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shopzillaCategoryId" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnLongField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="shopzillaProductFeed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="sitemapPriority" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="softDescriptor" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startingPrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stockDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="stockUnit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="storeDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="storeDetailedDescription" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="storeDisplayImage" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="storeDisplayName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="storeDisplayThumbnail" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subsidiary" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="subType" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxSchedule" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="thumbNailUrl" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalValue" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="trackLandedCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transferPrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="type" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unbuildVarianceAccount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="unitsType" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="upcCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="urlComponent" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useBins" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="useMarginalRates" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendor" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendorCode" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendorCost" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendorName" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnStringField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vendorSchedule" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vsoeDeferral" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vsoeDelivered" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vsoePermitDiscount" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vsoePrice" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="webSite" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weight" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnDoubleField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="weightUnit" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnEnumSelectField" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="yahooProductFeed" type="{urn:core_2010_2.platform.webservices.netsuite.com}SearchColumnBooleanField" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ItemSearchRowBasic", propOrder = {
    "assetAccount",
    "autoLeadTime",
    "autoPreferredStockLevel",
    "autoReorderPoint",
    "availableToPartners",
    "averageCost",
    "basePrice",
    "billExchRateVarianceAcct",
    "billPriceVarianceAcct",
    "billQtyVarianceAcct",
    "binNumber",
    "binOnHandAvail",
    "binOnHandCount",
    "buildEntireAssembly",
    "buyItNowPrice",
    "category",
    "clazz",
    "copyDescription",
    "cost",
    "costEstimate",
    "costEstimateType",
    "costingMethod",
    "countryOfManufacture",
    "created",
    "createJob",
    "dateViewed",
    "daysBeforeExpiration",
    "defaultReturnCost",
    "deferredExpenseAccount",
    "deferredRevenueAccount",
    "demandModifier",
    "department",
    "departmentnohierarchy",
    "displayIneBayStore",
    "displayName",
    "dontShowPrice",
    "eBayItemDescription",
    "eBayItemSubtitle",
    "eBayItemTitle",
    "ebayRelistingOption",
    "endAuctionsWhenOutOfStock",
    "excludeFromSitemap",
    "expenseAccount",
    "externalId",
    "featuredDescription",
    "feedDescription",
    "feedName",
    "froogleProductFeed",
    "fxCost",
    "gainLossAccount",
    "giftCertAuthCode",
    "giftCertEmail",
    "giftCertExpirationDate",
    "giftCertFrom",
    "giftCertMessage",
    "giftCertOriginalAmount",
    "giftCertRecipient",
    "hits",
    "imageUrl",
    "incomeAccount",
    "internalId",
    "inventoryLocation",
    "isAvailable",
    "isDropShipItem",
    "isFulfillable",
    "isGcoCompliant",
    "isInactive",
    "isOnline",
    "isSpecialOrderItem",
    "isSpecialWorkOrderItem",
    "issueProduct",
    "isTaxable",
    "isVsoeBundle",
    "itemId",
    "itemUrl",
    "lastPurchasePrice",
    "lastQuantityAvailableChange",
    "leadTime",
    "liabilityAccount",
    "listingDuration",
    "location",
    "locationAverageCost",
    "locationBinQuantityAvailable",
    "locationDefaultReturnCost",
    "locationPreferredStockLevel",
    "locationQuantityAvailable",
    "locationQuantityBackOrdered",
    "locationQuantityCommitted",
    "locationQuantityInTransit",
    "locationQuantityOnHand",
    "locationQuantityOnOrder",
    "locationReOrderPoint",
    "locationTotalValue",
    "manufacturer",
    "manufacturerAddr1",
    "manufacturerCity",
    "manufacturerState",
    "manufacturerTariff",
    "manufacturerTaxId",
    "manufacturerZip",
    "matchBillToReceipt",
    "memberItem",
    "memberQuantity",
    "metaTagHtml",
    "minimumQuantity",
    "modified",
    "mpn",
    "multManufactureAddr",
    "nextagCategory",
    "nextagProductFeed",
    "noPriceMessage",
    "numActiveListings",
    "numberAllowedDownloads",
    "numCurrentlyListed",
    "offerSupport",
    "onlineCustomerPrice",
    "onlinePrice",
    "onSpecial",
    "otherPrices",
    "otherVendor",
    "outOfStockBehavior",
    "outOfStockMessage",
    "overallQuantityPricingType",
    "pageTitle",
    "parent",
    "preferenceCriterion",
    "preferredBin",
    "preferredLocation",
    "preferredStockLevel",
    "preferredStockLevelDays",
    "pricingGroup",
    "primaryCategory",
    "purchaseDescription",
    "purchaseUnit",
    "quantityAvailable",
    "quantityBackOrdered",
    "quantityCommitted",
    "quantityOnHand",
    "quantityOnOrder",
    "quantityPricingSchedule",
    "reorderMultiple",
    "reOrderPoint",
    "reservePrice",
    "revRecSchedule",
    "safetyStockLevel",
    "safetyStockLevelDays",
    "salesDescription",
    "salesTaxCode",
    "saleUnit",
    "scheduleBCode",
    "scheduleBNumber",
    "scheduleBQuantity",
    "searchKeywords",
    "seasonalDemand",
    "sellOnEBay",
    "serialNumber",
    "serialNumberLocation",
    "shipIndividually",
    "shipPackage",
    "shippingRate",
    "shoppingDotComCategory",
    "shoppingProductFeed",
    "shopzillaCategoryId",
    "shopzillaProductFeed",
    "sitemapPriority",
    "softDescriptor",
    "startingPrice",
    "stockDescription",
    "stockUnit",
    "storeDescription",
    "storeDetailedDescription",
    "storeDisplayImage",
    "storeDisplayName",
    "storeDisplayThumbnail",
    "subsidiary",
    "subType",
    "taxSchedule",
    "thumbNailUrl",
    "totalValue",
    "trackLandedCost",
    "transferPrice",
    "type",
    "unbuildVarianceAccount",
    "unitsType",
    "upcCode",
    "urlComponent",
    "useBins",
    "useMarginalRates",
    "vendor",
    "vendorCode",
    "vendorCost",
    "vendorName",
    "vendorSchedule",
    "vsoeDeferral",
    "vsoeDelivered",
    "vsoePermitDiscount",
    "vsoePrice",
    "webSite",
    "weight",
    "weightUnit",
    "yahooProductFeed",
    "customFieldList"
})
public class ItemSearchRowBasic {

    protected List<SearchColumnSelectField> assetAccount;
    protected List<SearchColumnBooleanField> autoLeadTime;
    protected List<SearchColumnBooleanField> autoPreferredStockLevel;
    protected List<SearchColumnBooleanField> autoReorderPoint;
    protected List<SearchColumnBooleanField> availableToPartners;
    protected List<SearchColumnDoubleField> averageCost;
    protected List<SearchColumnDoubleField> basePrice;
    protected List<SearchColumnSelectField> billExchRateVarianceAcct;
    protected List<SearchColumnSelectField> billPriceVarianceAcct;
    protected List<SearchColumnSelectField> billQtyVarianceAcct;
    protected List<SearchColumnStringField> binNumber;
    protected List<SearchColumnDoubleField> binOnHandAvail;
    protected List<SearchColumnDoubleField> binOnHandCount;
    protected List<SearchColumnBooleanField> buildEntireAssembly;
    protected List<SearchColumnDoubleField> buyItNowPrice;
    protected List<SearchColumnStringField> category;
    @XmlElement(name = "class")
    protected List<SearchColumnSelectField> clazz;
    protected List<SearchColumnBooleanField> copyDescription;
    protected List<SearchColumnDoubleField> cost;
    protected List<SearchColumnDoubleField> costEstimate;
    protected List<SearchColumnEnumSelectField> costEstimateType;
    protected List<SearchColumnEnumSelectField> costingMethod;
    protected List<SearchColumnEnumSelectField> countryOfManufacture;
    protected List<SearchColumnDateField> created;
    protected List<SearchColumnBooleanField> createJob;
    protected List<SearchColumnDateField> dateViewed;
    protected List<SearchColumnStringField> daysBeforeExpiration;
    protected List<SearchColumnDoubleField> defaultReturnCost;
    protected List<SearchColumnSelectField> deferredExpenseAccount;
    protected List<SearchColumnSelectField> deferredRevenueAccount;
    protected List<SearchColumnDoubleField> demandModifier;
    protected List<SearchColumnSelectField> department;
    protected List<SearchColumnSelectField> departmentnohierarchy;
    protected List<SearchColumnBooleanField> displayIneBayStore;
    protected List<SearchColumnStringField> displayName;
    protected List<SearchColumnBooleanField> dontShowPrice;
    protected List<SearchColumnStringField> eBayItemDescription;
    protected List<SearchColumnStringField> eBayItemSubtitle;
    protected List<SearchColumnStringField> eBayItemTitle;
    protected List<SearchColumnEnumSelectField> ebayRelistingOption;
    protected List<SearchColumnBooleanField> endAuctionsWhenOutOfStock;
    protected List<SearchColumnBooleanField> excludeFromSitemap;
    protected List<SearchColumnSelectField> expenseAccount;
    protected List<SearchColumnSelectField> externalId;
    protected List<SearchColumnStringField> featuredDescription;
    protected List<SearchColumnStringField> feedDescription;
    protected List<SearchColumnStringField> feedName;
    protected List<SearchColumnBooleanField> froogleProductFeed;
    protected List<SearchColumnDoubleField> fxCost;
    protected List<SearchColumnSelectField> gainLossAccount;
    protected List<SearchColumnStringField> giftCertAuthCode;
    protected List<SearchColumnStringField> giftCertEmail;
    protected List<SearchColumnStringField> giftCertExpirationDate;
    protected List<SearchColumnStringField> giftCertFrom;
    protected List<SearchColumnStringField> giftCertMessage;
    protected List<SearchColumnStringField> giftCertOriginalAmount;
    protected List<SearchColumnStringField> giftCertRecipient;
    protected List<SearchColumnLongField> hits;
    protected List<SearchColumnStringField> imageUrl;
    protected List<SearchColumnSelectField> incomeAccount;
    protected List<SearchColumnSelectField> internalId;
    protected List<SearchColumnSelectField> inventoryLocation;
    protected List<SearchColumnBooleanField> isAvailable;
    protected List<SearchColumnBooleanField> isDropShipItem;
    protected List<SearchColumnBooleanField> isFulfillable;
    protected List<SearchColumnBooleanField> isGcoCompliant;
    protected List<SearchColumnBooleanField> isInactive;
    protected List<SearchColumnBooleanField> isOnline;
    protected List<SearchColumnBooleanField> isSpecialOrderItem;
    protected List<SearchColumnBooleanField> isSpecialWorkOrderItem;
    protected List<SearchColumnSelectField> issueProduct;
    protected List<SearchColumnBooleanField> isTaxable;
    protected List<SearchColumnBooleanField> isVsoeBundle;
    protected List<SearchColumnStringField> itemId;
    protected List<SearchColumnStringField> itemUrl;
    protected List<SearchColumnDoubleField> lastPurchasePrice;
    protected List<SearchColumnDateField> lastQuantityAvailableChange;
    protected List<SearchColumnLongField> leadTime;
    protected List<SearchColumnSelectField> liabilityAccount;
    protected List<SearchColumnEnumSelectField> listingDuration;
    protected List<SearchColumnSelectField> location;
    protected List<SearchColumnDoubleField> locationAverageCost;
    protected List<SearchColumnDoubleField> locationBinQuantityAvailable;
    protected List<SearchColumnDoubleField> locationDefaultReturnCost;
    protected List<SearchColumnDoubleField> locationPreferredStockLevel;
    protected List<SearchColumnDoubleField> locationQuantityAvailable;
    protected List<SearchColumnDoubleField> locationQuantityBackOrdered;
    protected List<SearchColumnDoubleField> locationQuantityCommitted;
    protected List<SearchColumnDoubleField> locationQuantityInTransit;
    protected List<SearchColumnDoubleField> locationQuantityOnHand;
    protected List<SearchColumnDoubleField> locationQuantityOnOrder;
    protected List<SearchColumnDoubleField> locationReOrderPoint;
    protected List<SearchColumnDoubleField> locationTotalValue;
    protected List<SearchColumnStringField> manufacturer;
    protected List<SearchColumnStringField> manufacturerAddr1;
    protected List<SearchColumnStringField> manufacturerCity;
    protected List<SearchColumnStringField> manufacturerState;
    protected List<SearchColumnStringField> manufacturerTariff;
    protected List<SearchColumnStringField> manufacturerTaxId;
    protected List<SearchColumnStringField> manufacturerZip;
    protected List<SearchColumnBooleanField> matchBillToReceipt;
    protected List<SearchColumnSelectField> memberItem;
    protected List<SearchColumnDoubleField> memberQuantity;
    protected List<SearchColumnStringField> metaTagHtml;
    protected List<SearchColumnStringField> minimumQuantity;
    protected List<SearchColumnDateField> modified;
    protected List<SearchColumnStringField> mpn;
    protected List<SearchColumnBooleanField> multManufactureAddr;
    protected List<SearchColumnStringField> nextagCategory;
    protected List<SearchColumnBooleanField> nextagProductFeed;
    protected List<SearchColumnStringField> noPriceMessage;
    protected List<SearchColumnLongField> numActiveListings;
    protected List<SearchColumnStringField> numberAllowedDownloads;
    protected List<SearchColumnLongField> numCurrentlyListed;
    protected List<SearchColumnBooleanField> offerSupport;
    protected List<SearchColumnDoubleField> onlineCustomerPrice;
    protected List<SearchColumnDoubleField> onlinePrice;
    protected List<SearchColumnBooleanField> onSpecial;
    protected List<SearchColumnDoubleField> otherPrices;
    protected List<SearchColumnSelectField> otherVendor;
    protected List<SearchColumnStringField> outOfStockBehavior;
    protected List<SearchColumnStringField> outOfStockMessage;
    protected List<SearchColumnEnumSelectField> overallQuantityPricingType;
    protected List<SearchColumnStringField> pageTitle;
    protected List<SearchColumnSelectField> parent;
    protected List<SearchColumnStringField> preferenceCriterion;
    protected List<SearchColumnBooleanField> preferredBin;
    protected List<SearchColumnSelectField> preferredLocation;
    protected List<SearchColumnDoubleField> preferredStockLevel;
    protected List<SearchColumnLongField> preferredStockLevelDays;
    protected List<SearchColumnSelectField> pricingGroup;
    protected List<SearchColumnStringField> primaryCategory;
    protected List<SearchColumnStringField> purchaseDescription;
    protected List<SearchColumnSelectField> purchaseUnit;
    protected List<SearchColumnDoubleField> quantityAvailable;
    protected List<SearchColumnDoubleField> quantityBackOrdered;
    protected List<SearchColumnDoubleField> quantityCommitted;
    protected List<SearchColumnDoubleField> quantityOnHand;
    protected List<SearchColumnDoubleField> quantityOnOrder;
    protected List<SearchColumnSelectField> quantityPricingSchedule;
    protected List<SearchColumnLongField> reorderMultiple;
    protected List<SearchColumnDoubleField> reOrderPoint;
    protected List<SearchColumnDoubleField> reservePrice;
    protected List<SearchColumnSelectField> revRecSchedule;
    protected List<SearchColumnDoubleField> safetyStockLevel;
    protected List<SearchColumnLongField> safetyStockLevelDays;
    protected List<SearchColumnStringField> salesDescription;
    protected List<SearchColumnSelectField> salesTaxCode;
    protected List<SearchColumnSelectField> saleUnit;
    protected List<SearchColumnEnumSelectField> scheduleBCode;
    protected List<SearchColumnStringField> scheduleBNumber;
    protected List<SearchColumnStringField> scheduleBQuantity;
    protected List<SearchColumnStringField> searchKeywords;
    protected List<SearchColumnBooleanField> seasonalDemand;
    protected List<SearchColumnBooleanField> sellOnEBay;
    protected List<SearchColumnStringField> serialNumber;
    protected List<SearchColumnStringField> serialNumberLocation;
    protected List<SearchColumnBooleanField> shipIndividually;
    protected List<SearchColumnSelectField> shipPackage;
    protected List<SearchColumnDoubleField> shippingRate;
    protected List<SearchColumnStringField> shoppingDotComCategory;
    protected List<SearchColumnBooleanField> shoppingProductFeed;
    protected List<SearchColumnLongField> shopzillaCategoryId;
    protected List<SearchColumnBooleanField> shopzillaProductFeed;
    protected List<SearchColumnEnumSelectField> sitemapPriority;
    protected List<SearchColumnSelectField> softDescriptor;
    protected List<SearchColumnDoubleField> startingPrice;
    protected List<SearchColumnStringField> stockDescription;
    protected List<SearchColumnSelectField> stockUnit;
    protected List<SearchColumnStringField> storeDescription;
    protected List<SearchColumnStringField> storeDetailedDescription;
    protected List<SearchColumnSelectField> storeDisplayImage;
    protected List<SearchColumnStringField> storeDisplayName;
    protected List<SearchColumnSelectField> storeDisplayThumbnail;
    protected List<SearchColumnSelectField> subsidiary;
    protected List<SearchColumnEnumSelectField> subType;
    protected List<SearchColumnSelectField> taxSchedule;
    protected List<SearchColumnStringField> thumbNailUrl;
    protected List<SearchColumnDoubleField> totalValue;
    protected List<SearchColumnBooleanField> trackLandedCost;
    protected List<SearchColumnDoubleField> transferPrice;
    protected List<SearchColumnEnumSelectField> type;
    protected List<SearchColumnSelectField> unbuildVarianceAccount;
    protected List<SearchColumnSelectField> unitsType;
    protected List<SearchColumnStringField> upcCode;
    protected List<SearchColumnStringField> urlComponent;
    protected List<SearchColumnBooleanField> useBins;
    protected List<SearchColumnBooleanField> useMarginalRates;
    protected List<SearchColumnSelectField> vendor;
    protected List<SearchColumnStringField> vendorCode;
    protected List<SearchColumnDoubleField> vendorCost;
    protected List<SearchColumnStringField> vendorName;
    protected List<SearchColumnSelectField> vendorSchedule;
    protected List<SearchColumnEnumSelectField> vsoeDeferral;
    protected List<SearchColumnBooleanField> vsoeDelivered;
    protected List<SearchColumnEnumSelectField> vsoePermitDiscount;
    protected List<SearchColumnDoubleField> vsoePrice;
    protected List<SearchColumnSelectField> webSite;
    protected List<SearchColumnDoubleField> weight;
    protected List<SearchColumnEnumSelectField> weightUnit;
    protected List<SearchColumnBooleanField> yahooProductFeed;
    protected SearchColumnCustomFieldList customFieldList;

    /**
     * Gets the value of the assetAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getAssetAccount() {
        if (assetAccount == null) {
            assetAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.assetAccount;
    }

    /**
     * Gets the value of the autoLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAutoLeadTime() {
        if (autoLeadTime == null) {
            autoLeadTime = new ArrayList<SearchColumnBooleanField>();
        }
        return this.autoLeadTime;
    }

    /**
     * Gets the value of the autoPreferredStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoPreferredStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoPreferredStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAutoPreferredStockLevel() {
        if (autoPreferredStockLevel == null) {
            autoPreferredStockLevel = new ArrayList<SearchColumnBooleanField>();
        }
        return this.autoPreferredStockLevel;
    }

    /**
     * Gets the value of the autoReorderPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autoReorderPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutoReorderPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAutoReorderPoint() {
        if (autoReorderPoint == null) {
            autoReorderPoint = new ArrayList<SearchColumnBooleanField>();
        }
        return this.autoReorderPoint;
    }

    /**
     * Gets the value of the availableToPartners property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availableToPartners property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailableToPartners().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getAvailableToPartners() {
        if (availableToPartners == null) {
            availableToPartners = new ArrayList<SearchColumnBooleanField>();
        }
        return this.availableToPartners;
    }

    /**
     * Gets the value of the averageCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the averageCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAverageCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getAverageCost() {
        if (averageCost == null) {
            averageCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.averageCost;
    }

    /**
     * Gets the value of the basePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the basePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBasePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBasePrice() {
        if (basePrice == null) {
            basePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.basePrice;
    }

    /**
     * Gets the value of the billExchRateVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billExchRateVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillExchRateVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillExchRateVarianceAcct() {
        if (billExchRateVarianceAcct == null) {
            billExchRateVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.billExchRateVarianceAcct;
    }

    /**
     * Gets the value of the billPriceVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billPriceVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillPriceVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillPriceVarianceAcct() {
        if (billPriceVarianceAcct == null) {
            billPriceVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.billPriceVarianceAcct;
    }

    /**
     * Gets the value of the billQtyVarianceAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billQtyVarianceAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillQtyVarianceAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getBillQtyVarianceAcct() {
        if (billQtyVarianceAcct == null) {
            billQtyVarianceAcct = new ArrayList<SearchColumnSelectField>();
        }
        return this.billQtyVarianceAcct;
    }

    /**
     * Gets the value of the binNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getBinNumber() {
        if (binNumber == null) {
            binNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.binNumber;
    }

    /**
     * Gets the value of the binOnHandAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binOnHandAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinOnHandAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBinOnHandAvail() {
        if (binOnHandAvail == null) {
            binOnHandAvail = new ArrayList<SearchColumnDoubleField>();
        }
        return this.binOnHandAvail;
    }

    /**
     * Gets the value of the binOnHandCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binOnHandCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinOnHandCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBinOnHandCount() {
        if (binOnHandCount == null) {
            binOnHandCount = new ArrayList<SearchColumnDoubleField>();
        }
        return this.binOnHandCount;
    }

    /**
     * Gets the value of the buildEntireAssembly property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildEntireAssembly property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildEntireAssembly().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getBuildEntireAssembly() {
        if (buildEntireAssembly == null) {
            buildEntireAssembly = new ArrayList<SearchColumnBooleanField>();
        }
        return this.buildEntireAssembly;
    }

    /**
     * Gets the value of the buyItNowPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buyItNowPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuyItNowPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getBuyItNowPrice() {
        if (buyItNowPrice == null) {
            buyItNowPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.buyItNowPrice;
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
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getCategory() {
        if (category == null) {
            category = new ArrayList<SearchColumnStringField>();
        }
        return this.category;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clazz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClazz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getClazz() {
        if (clazz == null) {
            clazz = new ArrayList<SearchColumnSelectField>();
        }
        return this.clazz;
    }

    /**
     * Gets the value of the copyDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copyDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopyDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getCopyDescription() {
        if (copyDescription == null) {
            copyDescription = new ArrayList<SearchColumnBooleanField>();
        }
        return this.copyDescription;
    }

    /**
     * Gets the value of the cost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCost() {
        if (cost == null) {
            cost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.cost;
    }

    /**
     * Gets the value of the costEstimate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costEstimate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostEstimate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getCostEstimate() {
        if (costEstimate == null) {
            costEstimate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.costEstimate;
    }

    /**
     * Gets the value of the costEstimateType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costEstimateType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostEstimateType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCostEstimateType() {
        if (costEstimateType == null) {
            costEstimateType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.costEstimateType;
    }

    /**
     * Gets the value of the costingMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costingMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostingMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCostingMethod() {
        if (costingMethod == null) {
            costingMethod = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.costingMethod;
    }

    /**
     * Gets the value of the countryOfManufacture property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfManufacture property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfManufacture().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getCountryOfManufacture() {
        if (countryOfManufacture == null) {
            countryOfManufacture = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.countryOfManufacture;
    }

    /**
     * Gets the value of the created property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the created property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getCreated() {
        if (created == null) {
            created = new ArrayList<SearchColumnDateField>();
        }
        return this.created;
    }

    /**
     * Gets the value of the createJob property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createJob property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateJob().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getCreateJob() {
        if (createJob == null) {
            createJob = new ArrayList<SearchColumnBooleanField>();
        }
        return this.createJob;
    }

    /**
     * Gets the value of the dateViewed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dateViewed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDateViewed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getDateViewed() {
        if (dateViewed == null) {
            dateViewed = new ArrayList<SearchColumnDateField>();
        }
        return this.dateViewed;
    }

    /**
     * Gets the value of the daysBeforeExpiration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the daysBeforeExpiration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDaysBeforeExpiration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDaysBeforeExpiration() {
        if (daysBeforeExpiration == null) {
            daysBeforeExpiration = new ArrayList<SearchColumnStringField>();
        }
        return this.daysBeforeExpiration;
    }

    /**
     * Gets the value of the defaultReturnCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defaultReturnCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefaultReturnCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDefaultReturnCost() {
        if (defaultReturnCost == null) {
            defaultReturnCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.defaultReturnCost;
    }

    /**
     * Gets the value of the deferredExpenseAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredExpenseAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredExpenseAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDeferredExpenseAccount() {
        if (deferredExpenseAccount == null) {
            deferredExpenseAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.deferredExpenseAccount;
    }

    /**
     * Gets the value of the deferredRevenueAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deferredRevenueAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeferredRevenueAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDeferredRevenueAccount() {
        if (deferredRevenueAccount == null) {
            deferredRevenueAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.deferredRevenueAccount;
    }

    /**
     * Gets the value of the demandModifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the demandModifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDemandModifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getDemandModifier() {
        if (demandModifier == null) {
            demandModifier = new ArrayList<SearchColumnDoubleField>();
        }
        return this.demandModifier;
    }

    /**
     * Gets the value of the department property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the department property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDepartment() {
        if (department == null) {
            department = new ArrayList<SearchColumnSelectField>();
        }
        return this.department;
    }

    /**
     * Gets the value of the departmentnohierarchy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departmentnohierarchy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartmentnohierarchy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getDepartmentnohierarchy() {
        if (departmentnohierarchy == null) {
            departmentnohierarchy = new ArrayList<SearchColumnSelectField>();
        }
        return this.departmentnohierarchy;
    }

    /**
     * Gets the value of the displayIneBayStore property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayIneBayStore property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayIneBayStore().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDisplayIneBayStore() {
        if (displayIneBayStore == null) {
            displayIneBayStore = new ArrayList<SearchColumnBooleanField>();
        }
        return this.displayIneBayStore;
    }

    /**
     * Gets the value of the displayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the displayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getDisplayName() {
        if (displayName == null) {
            displayName = new ArrayList<SearchColumnStringField>();
        }
        return this.displayName;
    }

    /**
     * Gets the value of the dontShowPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dontShowPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDontShowPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getDontShowPrice() {
        if (dontShowPrice == null) {
            dontShowPrice = new ArrayList<SearchColumnBooleanField>();
        }
        return this.dontShowPrice;
    }

    /**
     * Gets the value of the eBayItemDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eBayItemDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBayItemDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEBayItemDescription() {
        if (eBayItemDescription == null) {
            eBayItemDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.eBayItemDescription;
    }

    /**
     * Gets the value of the eBayItemSubtitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eBayItemSubtitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBayItemSubtitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEBayItemSubtitle() {
        if (eBayItemSubtitle == null) {
            eBayItemSubtitle = new ArrayList<SearchColumnStringField>();
        }
        return this.eBayItemSubtitle;
    }

    /**
     * Gets the value of the eBayItemTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eBayItemTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEBayItemTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getEBayItemTitle() {
        if (eBayItemTitle == null) {
            eBayItemTitle = new ArrayList<SearchColumnStringField>();
        }
        return this.eBayItemTitle;
    }

    /**
     * Gets the value of the ebayRelistingOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ebayRelistingOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEbayRelistingOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getEbayRelistingOption() {
        if (ebayRelistingOption == null) {
            ebayRelistingOption = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.ebayRelistingOption;
    }

    /**
     * Gets the value of the endAuctionsWhenOutOfStock property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endAuctionsWhenOutOfStock property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndAuctionsWhenOutOfStock().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getEndAuctionsWhenOutOfStock() {
        if (endAuctionsWhenOutOfStock == null) {
            endAuctionsWhenOutOfStock = new ArrayList<SearchColumnBooleanField>();
        }
        return this.endAuctionsWhenOutOfStock;
    }

    /**
     * Gets the value of the excludeFromSitemap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeFromSitemap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeFromSitemap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getExcludeFromSitemap() {
        if (excludeFromSitemap == null) {
            excludeFromSitemap = new ArrayList<SearchColumnBooleanField>();
        }
        return this.excludeFromSitemap;
    }

    /**
     * Gets the value of the expenseAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expenseAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpenseAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExpenseAccount() {
        if (expenseAccount == null) {
            expenseAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.expenseAccount;
    }

    /**
     * Gets the value of the externalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getExternalId() {
        if (externalId == null) {
            externalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.externalId;
    }

    /**
     * Gets the value of the featuredDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featuredDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeaturedDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFeaturedDescription() {
        if (featuredDescription == null) {
            featuredDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.featuredDescription;
    }

    /**
     * Gets the value of the feedDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFeedDescription() {
        if (feedDescription == null) {
            feedDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.feedDescription;
    }

    /**
     * Gets the value of the feedName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feedName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeedName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getFeedName() {
        if (feedName == null) {
            feedName = new ArrayList<SearchColumnStringField>();
        }
        return this.feedName;
    }

    /**
     * Gets the value of the froogleProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the froogleProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFroogleProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getFroogleProductFeed() {
        if (froogleProductFeed == null) {
            froogleProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.froogleProductFeed;
    }

    /**
     * Gets the value of the fxCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getFxCost() {
        if (fxCost == null) {
            fxCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.fxCost;
    }

    /**
     * Gets the value of the gainLossAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gainLossAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGainLossAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getGainLossAccount() {
        if (gainLossAccount == null) {
            gainLossAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.gainLossAccount;
    }

    /**
     * Gets the value of the giftCertAuthCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertAuthCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertAuthCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertAuthCode() {
        if (giftCertAuthCode == null) {
            giftCertAuthCode = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertAuthCode;
    }

    /**
     * Gets the value of the giftCertEmail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertEmail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertEmail() {
        if (giftCertEmail == null) {
            giftCertEmail = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertEmail;
    }

    /**
     * Gets the value of the giftCertExpirationDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertExpirationDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertExpirationDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertExpirationDate() {
        if (giftCertExpirationDate == null) {
            giftCertExpirationDate = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertExpirationDate;
    }

    /**
     * Gets the value of the giftCertFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertFrom() {
        if (giftCertFrom == null) {
            giftCertFrom = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertFrom;
    }

    /**
     * Gets the value of the giftCertMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertMessage() {
        if (giftCertMessage == null) {
            giftCertMessage = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertMessage;
    }

    /**
     * Gets the value of the giftCertOriginalAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertOriginalAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertOriginalAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertOriginalAmount() {
        if (giftCertOriginalAmount == null) {
            giftCertOriginalAmount = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertOriginalAmount;
    }

    /**
     * Gets the value of the giftCertRecipient property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the giftCertRecipient property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGiftCertRecipient().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getGiftCertRecipient() {
        if (giftCertRecipient == null) {
            giftCertRecipient = new ArrayList<SearchColumnStringField>();
        }
        return this.giftCertRecipient;
    }

    /**
     * Gets the value of the hits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getHits() {
        if (hits == null) {
            hits = new ArrayList<SearchColumnLongField>();
        }
        return this.hits;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getImageUrl() {
        if (imageUrl == null) {
            imageUrl = new ArrayList<SearchColumnStringField>();
        }
        return this.imageUrl;
    }

    /**
     * Gets the value of the incomeAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomeAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomeAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getIncomeAccount() {
        if (incomeAccount == null) {
            incomeAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.incomeAccount;
    }

    /**
     * Gets the value of the internalId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInternalId() {
        if (internalId == null) {
            internalId = new ArrayList<SearchColumnSelectField>();
        }
        return this.internalId;
    }

    /**
     * Gets the value of the inventoryLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getInventoryLocation() {
        if (inventoryLocation == null) {
            inventoryLocation = new ArrayList<SearchColumnSelectField>();
        }
        return this.inventoryLocation;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsAvailable() {
        if (isAvailable == null) {
            isAvailable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isAvailable;
    }

    /**
     * Gets the value of the isDropShipItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isDropShipItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsDropShipItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsDropShipItem() {
        if (isDropShipItem == null) {
            isDropShipItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isDropShipItem;
    }

    /**
     * Gets the value of the isFulfillable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isFulfillable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsFulfillable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsFulfillable() {
        if (isFulfillable == null) {
            isFulfillable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isFulfillable;
    }

    /**
     * Gets the value of the isGcoCompliant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isGcoCompliant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsGcoCompliant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsGcoCompliant() {
        if (isGcoCompliant == null) {
            isGcoCompliant = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isGcoCompliant;
    }

    /**
     * Gets the value of the isInactive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isInactive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsInactive().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsInactive() {
        if (isInactive == null) {
            isInactive = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isInactive;
    }

    /**
     * Gets the value of the isOnline property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isOnline property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsOnline().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsOnline() {
        if (isOnline == null) {
            isOnline = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isOnline;
    }

    /**
     * Gets the value of the isSpecialOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSpecialOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSpecialOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSpecialOrderItem() {
        if (isSpecialOrderItem == null) {
            isSpecialOrderItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSpecialOrderItem;
    }

    /**
     * Gets the value of the isSpecialWorkOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isSpecialWorkOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsSpecialWorkOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsSpecialWorkOrderItem() {
        if (isSpecialWorkOrderItem == null) {
            isSpecialWorkOrderItem = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isSpecialWorkOrderItem;
    }

    /**
     * Gets the value of the issueProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issueProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssueProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getIssueProduct() {
        if (issueProduct == null) {
            issueProduct = new ArrayList<SearchColumnSelectField>();
        }
        return this.issueProduct;
    }

    /**
     * Gets the value of the isTaxable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isTaxable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsTaxable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsTaxable() {
        if (isTaxable == null) {
            isTaxable = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isTaxable;
    }

    /**
     * Gets the value of the isVsoeBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isVsoeBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsVsoeBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getIsVsoeBundle() {
        if (isVsoeBundle == null) {
            isVsoeBundle = new ArrayList<SearchColumnBooleanField>();
        }
        return this.isVsoeBundle;
    }

    /**
     * Gets the value of the itemId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getItemId() {
        if (itemId == null) {
            itemId = new ArrayList<SearchColumnStringField>();
        }
        return this.itemId;
    }

    /**
     * Gets the value of the itemUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itemUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItemUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getItemUrl() {
        if (itemUrl == null) {
            itemUrl = new ArrayList<SearchColumnStringField>();
        }
        return this.itemUrl;
    }

    /**
     * Gets the value of the lastPurchasePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastPurchasePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastPurchasePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLastPurchasePrice() {
        if (lastPurchasePrice == null) {
            lastPurchasePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.lastPurchasePrice;
    }

    /**
     * Gets the value of the lastQuantityAvailableChange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lastQuantityAvailableChange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLastQuantityAvailableChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getLastQuantityAvailableChange() {
        if (lastQuantityAvailableChange == null) {
            lastQuantityAvailableChange = new ArrayList<SearchColumnDateField>();
        }
        return this.lastQuantityAvailableChange;
    }

    /**
     * Gets the value of the leadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the leadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getLeadTime() {
        if (leadTime == null) {
            leadTime = new ArrayList<SearchColumnLongField>();
        }
        return this.leadTime;
    }

    /**
     * Gets the value of the liabilityAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the liabilityAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLiabilityAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLiabilityAccount() {
        if (liabilityAccount == null) {
            liabilityAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.liabilityAccount;
    }

    /**
     * Gets the value of the listingDuration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listingDuration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListingDuration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getListingDuration() {
        if (listingDuration == null) {
            listingDuration = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.listingDuration;
    }

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getLocation() {
        if (location == null) {
            location = new ArrayList<SearchColumnSelectField>();
        }
        return this.location;
    }

    /**
     * Gets the value of the locationAverageCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationAverageCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationAverageCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationAverageCost() {
        if (locationAverageCost == null) {
            locationAverageCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationAverageCost;
    }

    /**
     * Gets the value of the locationBinQuantityAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationBinQuantityAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationBinQuantityAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationBinQuantityAvailable() {
        if (locationBinQuantityAvailable == null) {
            locationBinQuantityAvailable = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationBinQuantityAvailable;
    }

    /**
     * Gets the value of the locationDefaultReturnCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationDefaultReturnCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationDefaultReturnCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationDefaultReturnCost() {
        if (locationDefaultReturnCost == null) {
            locationDefaultReturnCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationDefaultReturnCost;
    }

    /**
     * Gets the value of the locationPreferredStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationPreferredStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationPreferredStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationPreferredStockLevel() {
        if (locationPreferredStockLevel == null) {
            locationPreferredStockLevel = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationPreferredStockLevel;
    }

    /**
     * Gets the value of the locationQuantityAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityAvailable() {
        if (locationQuantityAvailable == null) {
            locationQuantityAvailable = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityAvailable;
    }

    /**
     * Gets the value of the locationQuantityBackOrdered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityBackOrdered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityBackOrdered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityBackOrdered() {
        if (locationQuantityBackOrdered == null) {
            locationQuantityBackOrdered = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityBackOrdered;
    }

    /**
     * Gets the value of the locationQuantityCommitted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityCommitted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityCommitted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityCommitted() {
        if (locationQuantityCommitted == null) {
            locationQuantityCommitted = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityCommitted;
    }

    /**
     * Gets the value of the locationQuantityInTransit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityInTransit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityInTransit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityInTransit() {
        if (locationQuantityInTransit == null) {
            locationQuantityInTransit = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityInTransit;
    }

    /**
     * Gets the value of the locationQuantityOnHand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityOnHand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityOnHand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityOnHand() {
        if (locationQuantityOnHand == null) {
            locationQuantityOnHand = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityOnHand;
    }

    /**
     * Gets the value of the locationQuantityOnOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationQuantityOnOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationQuantityOnOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationQuantityOnOrder() {
        if (locationQuantityOnOrder == null) {
            locationQuantityOnOrder = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationQuantityOnOrder;
    }

    /**
     * Gets the value of the locationReOrderPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationReOrderPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationReOrderPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationReOrderPoint() {
        if (locationReOrderPoint == null) {
            locationReOrderPoint = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationReOrderPoint;
    }

    /**
     * Gets the value of the locationTotalValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationTotalValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationTotalValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getLocationTotalValue() {
        if (locationTotalValue == null) {
            locationTotalValue = new ArrayList<SearchColumnDoubleField>();
        }
        return this.locationTotalValue;
    }

    /**
     * Gets the value of the manufacturer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturer() {
        if (manufacturer == null) {
            manufacturer = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturer;
    }

    /**
     * Gets the value of the manufacturerAddr1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerAddr1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerAddr1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerAddr1() {
        if (manufacturerAddr1 == null) {
            manufacturerAddr1 = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerAddr1;
    }

    /**
     * Gets the value of the manufacturerCity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerCity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerCity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerCity() {
        if (manufacturerCity == null) {
            manufacturerCity = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerCity;
    }

    /**
     * Gets the value of the manufacturerState property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerState property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerState().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerState() {
        if (manufacturerState == null) {
            manufacturerState = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerState;
    }

    /**
     * Gets the value of the manufacturerTariff property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerTariff property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerTariff().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerTariff() {
        if (manufacturerTariff == null) {
            manufacturerTariff = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerTariff;
    }

    /**
     * Gets the value of the manufacturerTaxId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerTaxId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerTaxId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerTaxId() {
        if (manufacturerTaxId == null) {
            manufacturerTaxId = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerTaxId;
    }

    /**
     * Gets the value of the manufacturerZip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerZip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerZip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getManufacturerZip() {
        if (manufacturerZip == null) {
            manufacturerZip = new ArrayList<SearchColumnStringField>();
        }
        return this.manufacturerZip;
    }

    /**
     * Gets the value of the matchBillToReceipt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matchBillToReceipt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatchBillToReceipt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getMatchBillToReceipt() {
        if (matchBillToReceipt == null) {
            matchBillToReceipt = new ArrayList<SearchColumnBooleanField>();
        }
        return this.matchBillToReceipt;
    }

    /**
     * Gets the value of the memberItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getMemberItem() {
        if (memberItem == null) {
            memberItem = new ArrayList<SearchColumnSelectField>();
        }
        return this.memberItem;
    }

    /**
     * Gets the value of the memberQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getMemberQuantity() {
        if (memberQuantity == null) {
            memberQuantity = new ArrayList<SearchColumnDoubleField>();
        }
        return this.memberQuantity;
    }

    /**
     * Gets the value of the metaTagHtml property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metaTagHtml property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetaTagHtml().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMetaTagHtml() {
        if (metaTagHtml == null) {
            metaTagHtml = new ArrayList<SearchColumnStringField>();
        }
        return this.metaTagHtml;
    }

    /**
     * Gets the value of the minimumQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the minimumQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMinimumQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMinimumQuantity() {
        if (minimumQuantity == null) {
            minimumQuantity = new ArrayList<SearchColumnStringField>();
        }
        return this.minimumQuantity;
    }

    /**
     * Gets the value of the modified property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modified property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModified().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDateField }
     * 
     * 
     */
    public List<SearchColumnDateField> getModified() {
        if (modified == null) {
            modified = new ArrayList<SearchColumnDateField>();
        }
        return this.modified;
    }

    /**
     * Gets the value of the mpn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mpn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMpn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getMpn() {
        if (mpn == null) {
            mpn = new ArrayList<SearchColumnStringField>();
        }
        return this.mpn;
    }

    /**
     * Gets the value of the multManufactureAddr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the multManufactureAddr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMultManufactureAddr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getMultManufactureAddr() {
        if (multManufactureAddr == null) {
            multManufactureAddr = new ArrayList<SearchColumnBooleanField>();
        }
        return this.multManufactureAddr;
    }

    /**
     * Gets the value of the nextagCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextagCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextagCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNextagCategory() {
        if (nextagCategory == null) {
            nextagCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.nextagCategory;
    }

    /**
     * Gets the value of the nextagProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nextagProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNextagProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getNextagProductFeed() {
        if (nextagProductFeed == null) {
            nextagProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.nextagProductFeed;
    }

    /**
     * Gets the value of the noPriceMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noPriceMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoPriceMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNoPriceMessage() {
        if (noPriceMessage == null) {
            noPriceMessage = new ArrayList<SearchColumnStringField>();
        }
        return this.noPriceMessage;
    }

    /**
     * Gets the value of the numActiveListings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numActiveListings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumActiveListings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getNumActiveListings() {
        if (numActiveListings == null) {
            numActiveListings = new ArrayList<SearchColumnLongField>();
        }
        return this.numActiveListings;
    }

    /**
     * Gets the value of the numberAllowedDownloads property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numberAllowedDownloads property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumberAllowedDownloads().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getNumberAllowedDownloads() {
        if (numberAllowedDownloads == null) {
            numberAllowedDownloads = new ArrayList<SearchColumnStringField>();
        }
        return this.numberAllowedDownloads;
    }

    /**
     * Gets the value of the numCurrentlyListed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numCurrentlyListed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumCurrentlyListed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getNumCurrentlyListed() {
        if (numCurrentlyListed == null) {
            numCurrentlyListed = new ArrayList<SearchColumnLongField>();
        }
        return this.numCurrentlyListed;
    }

    /**
     * Gets the value of the offerSupport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerSupport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferSupport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getOfferSupport() {
        if (offerSupport == null) {
            offerSupport = new ArrayList<SearchColumnBooleanField>();
        }
        return this.offerSupport;
    }

    /**
     * Gets the value of the onlineCustomerPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlineCustomerPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlineCustomerPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOnlineCustomerPrice() {
        if (onlineCustomerPrice == null) {
            onlineCustomerPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.onlineCustomerPrice;
    }

    /**
     * Gets the value of the onlinePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onlinePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnlinePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOnlinePrice() {
        if (onlinePrice == null) {
            onlinePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.onlinePrice;
    }

    /**
     * Gets the value of the onSpecial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the onSpecial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOnSpecial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getOnSpecial() {
        if (onSpecial == null) {
            onSpecial = new ArrayList<SearchColumnBooleanField>();
        }
        return this.onSpecial;
    }

    /**
     * Gets the value of the otherPrices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherPrices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherPrices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getOtherPrices() {
        if (otherPrices == null) {
            otherPrices = new ArrayList<SearchColumnDoubleField>();
        }
        return this.otherPrices;
    }

    /**
     * Gets the value of the otherVendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherVendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getOtherVendor() {
        if (otherVendor == null) {
            otherVendor = new ArrayList<SearchColumnSelectField>();
        }
        return this.otherVendor;
    }

    /**
     * Gets the value of the outOfStockBehavior property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outOfStockBehavior property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutOfStockBehavior().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getOutOfStockBehavior() {
        if (outOfStockBehavior == null) {
            outOfStockBehavior = new ArrayList<SearchColumnStringField>();
        }
        return this.outOfStockBehavior;
    }

    /**
     * Gets the value of the outOfStockMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outOfStockMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOutOfStockMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getOutOfStockMessage() {
        if (outOfStockMessage == null) {
            outOfStockMessage = new ArrayList<SearchColumnStringField>();
        }
        return this.outOfStockMessage;
    }

    /**
     * Gets the value of the overallQuantityPricingType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the overallQuantityPricingType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOverallQuantityPricingType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getOverallQuantityPricingType() {
        if (overallQuantityPricingType == null) {
            overallQuantityPricingType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.overallQuantityPricingType;
    }

    /**
     * Gets the value of the pageTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pageTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPageTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPageTitle() {
        if (pageTitle == null) {
            pageTitle = new ArrayList<SearchColumnStringField>();
        }
        return this.pageTitle;
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
     * Gets the value of the preferenceCriterion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferenceCriterion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferenceCriterion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPreferenceCriterion() {
        if (preferenceCriterion == null) {
            preferenceCriterion = new ArrayList<SearchColumnStringField>();
        }
        return this.preferenceCriterion;
    }

    /**
     * Gets the value of the preferredBin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredBin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredBin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getPreferredBin() {
        if (preferredBin == null) {
            preferredBin = new ArrayList<SearchColumnBooleanField>();
        }
        return this.preferredBin;
    }

    /**
     * Gets the value of the preferredLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPreferredLocation() {
        if (preferredLocation == null) {
            preferredLocation = new ArrayList<SearchColumnSelectField>();
        }
        return this.preferredLocation;
    }

    /**
     * Gets the value of the preferredStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getPreferredStockLevel() {
        if (preferredStockLevel == null) {
            preferredStockLevel = new ArrayList<SearchColumnDoubleField>();
        }
        return this.preferredStockLevel;
    }

    /**
     * Gets the value of the preferredStockLevelDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredStockLevelDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredStockLevelDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getPreferredStockLevelDays() {
        if (preferredStockLevelDays == null) {
            preferredStockLevelDays = new ArrayList<SearchColumnLongField>();
        }
        return this.preferredStockLevelDays;
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
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPricingGroup() {
        if (pricingGroup == null) {
            pricingGroup = new ArrayList<SearchColumnSelectField>();
        }
        return this.pricingGroup;
    }

    /**
     * Gets the value of the primaryCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPrimaryCategory() {
        if (primaryCategory == null) {
            primaryCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.primaryCategory;
    }

    /**
     * Gets the value of the purchaseDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getPurchaseDescription() {
        if (purchaseDescription == null) {
            purchaseDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.purchaseDescription;
    }

    /**
     * Gets the value of the purchaseUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getPurchaseUnit() {
        if (purchaseUnit == null) {
            purchaseUnit = new ArrayList<SearchColumnSelectField>();
        }
        return this.purchaseUnit;
    }

    /**
     * Gets the value of the quantityAvailable property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityAvailable property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityAvailable().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityAvailable() {
        if (quantityAvailable == null) {
            quantityAvailable = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityAvailable;
    }

    /**
     * Gets the value of the quantityBackOrdered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityBackOrdered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityBackOrdered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityBackOrdered() {
        if (quantityBackOrdered == null) {
            quantityBackOrdered = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityBackOrdered;
    }

    /**
     * Gets the value of the quantityCommitted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityCommitted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityCommitted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityCommitted() {
        if (quantityCommitted == null) {
            quantityCommitted = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityCommitted;
    }

    /**
     * Gets the value of the quantityOnHand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityOnHand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityOnHand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityOnHand() {
        if (quantityOnHand == null) {
            quantityOnHand = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityOnHand;
    }

    /**
     * Gets the value of the quantityOnOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityOnOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityOnOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getQuantityOnOrder() {
        if (quantityOnOrder == null) {
            quantityOnOrder = new ArrayList<SearchColumnDoubleField>();
        }
        return this.quantityOnOrder;
    }

    /**
     * Gets the value of the quantityPricingSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quantityPricingSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuantityPricingSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getQuantityPricingSchedule() {
        if (quantityPricingSchedule == null) {
            quantityPricingSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.quantityPricingSchedule;
    }

    /**
     * Gets the value of the reorderMultiple property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reorderMultiple property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReorderMultiple().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getReorderMultiple() {
        if (reorderMultiple == null) {
            reorderMultiple = new ArrayList<SearchColumnLongField>();
        }
        return this.reorderMultiple;
    }

    /**
     * Gets the value of the reOrderPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reOrderPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReOrderPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getReOrderPoint() {
        if (reOrderPoint == null) {
            reOrderPoint = new ArrayList<SearchColumnDoubleField>();
        }
        return this.reOrderPoint;
    }

    /**
     * Gets the value of the reservePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reservePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReservePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getReservePrice() {
        if (reservePrice == null) {
            reservePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.reservePrice;
    }

    /**
     * Gets the value of the revRecSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revRecSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevRecSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getRevRecSchedule() {
        if (revRecSchedule == null) {
            revRecSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.revRecSchedule;
    }

    /**
     * Gets the value of the safetyStockLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyStockLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyStockLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getSafetyStockLevel() {
        if (safetyStockLevel == null) {
            safetyStockLevel = new ArrayList<SearchColumnDoubleField>();
        }
        return this.safetyStockLevel;
    }

    /**
     * Gets the value of the safetyStockLevelDays property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the safetyStockLevelDays property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSafetyStockLevelDays().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getSafetyStockLevelDays() {
        if (safetyStockLevelDays == null) {
            safetyStockLevelDays = new ArrayList<SearchColumnLongField>();
        }
        return this.safetyStockLevelDays;
    }

    /**
     * Gets the value of the salesDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSalesDescription() {
        if (salesDescription == null) {
            salesDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.salesDescription;
    }

    /**
     * Gets the value of the salesTaxCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesTaxCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesTaxCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSalesTaxCode() {
        if (salesTaxCode == null) {
            salesTaxCode = new ArrayList<SearchColumnSelectField>();
        }
        return this.salesTaxCode;
    }

    /**
     * Gets the value of the saleUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSaleUnit() {
        if (saleUnit == null) {
            saleUnit = new ArrayList<SearchColumnSelectField>();
        }
        return this.saleUnit;
    }

    /**
     * Gets the value of the scheduleBCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleBCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleBCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getScheduleBCode() {
        if (scheduleBCode == null) {
            scheduleBCode = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.scheduleBCode;
    }

    /**
     * Gets the value of the scheduleBNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleBNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleBNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getScheduleBNumber() {
        if (scheduleBNumber == null) {
            scheduleBNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.scheduleBNumber;
    }

    /**
     * Gets the value of the scheduleBQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleBQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleBQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getScheduleBQuantity() {
        if (scheduleBQuantity == null) {
            scheduleBQuantity = new ArrayList<SearchColumnStringField>();
        }
        return this.scheduleBQuantity;
    }

    /**
     * Gets the value of the searchKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSearchKeywords() {
        if (searchKeywords == null) {
            searchKeywords = new ArrayList<SearchColumnStringField>();
        }
        return this.searchKeywords;
    }

    /**
     * Gets the value of the seasonalDemand property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seasonalDemand property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeasonalDemand().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSeasonalDemand() {
        if (seasonalDemand == null) {
            seasonalDemand = new ArrayList<SearchColumnBooleanField>();
        }
        return this.seasonalDemand;
    }

    /**
     * Gets the value of the sellOnEBay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sellOnEBay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSellOnEBay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getSellOnEBay() {
        if (sellOnEBay == null) {
            sellOnEBay = new ArrayList<SearchColumnBooleanField>();
        }
        return this.sellOnEBay;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSerialNumber() {
        if (serialNumber == null) {
            serialNumber = new ArrayList<SearchColumnStringField>();
        }
        return this.serialNumber;
    }

    /**
     * Gets the value of the serialNumberLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialNumberLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialNumberLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getSerialNumberLocation() {
        if (serialNumberLocation == null) {
            serialNumberLocation = new ArrayList<SearchColumnStringField>();
        }
        return this.serialNumberLocation;
    }

    /**
     * Gets the value of the shipIndividually property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipIndividually property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipIndividually().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShipIndividually() {
        if (shipIndividually == null) {
            shipIndividually = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shipIndividually;
    }

    /**
     * Gets the value of the shipPackage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipPackage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipPackage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getShipPackage() {
        if (shipPackage == null) {
            shipPackage = new ArrayList<SearchColumnSelectField>();
        }
        return this.shipPackage;
    }

    /**
     * Gets the value of the shippingRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getShippingRate() {
        if (shippingRate == null) {
            shippingRate = new ArrayList<SearchColumnDoubleField>();
        }
        return this.shippingRate;
    }

    /**
     * Gets the value of the shoppingDotComCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingDotComCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingDotComCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getShoppingDotComCategory() {
        if (shoppingDotComCategory == null) {
            shoppingDotComCategory = new ArrayList<SearchColumnStringField>();
        }
        return this.shoppingDotComCategory;
    }

    /**
     * Gets the value of the shoppingProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shoppingProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShoppingProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShoppingProductFeed() {
        if (shoppingProductFeed == null) {
            shoppingProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shoppingProductFeed;
    }

    /**
     * Gets the value of the shopzillaCategoryId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopzillaCategoryId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShopzillaCategoryId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnLongField }
     * 
     * 
     */
    public List<SearchColumnLongField> getShopzillaCategoryId() {
        if (shopzillaCategoryId == null) {
            shopzillaCategoryId = new ArrayList<SearchColumnLongField>();
        }
        return this.shopzillaCategoryId;
    }

    /**
     * Gets the value of the shopzillaProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopzillaProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShopzillaProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getShopzillaProductFeed() {
        if (shopzillaProductFeed == null) {
            shopzillaProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.shopzillaProductFeed;
    }

    /**
     * Gets the value of the sitemapPriority property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sitemapPriority property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSitemapPriority().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSitemapPriority() {
        if (sitemapPriority == null) {
            sitemapPriority = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.sitemapPriority;
    }

    /**
     * Gets the value of the softDescriptor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softDescriptor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftDescriptor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSoftDescriptor() {
        if (softDescriptor == null) {
            softDescriptor = new ArrayList<SearchColumnSelectField>();
        }
        return this.softDescriptor;
    }

    /**
     * Gets the value of the startingPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the startingPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStartingPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getStartingPrice() {
        if (startingPrice == null) {
            startingPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.startingPrice;
    }

    /**
     * Gets the value of the stockDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStockDescription() {
        if (stockDescription == null) {
            stockDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.stockDescription;
    }

    /**
     * Gets the value of the stockUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stockUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStockUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getStockUnit() {
        if (stockUnit == null) {
            stockUnit = new ArrayList<SearchColumnSelectField>();
        }
        return this.stockUnit;
    }

    /**
     * Gets the value of the storeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStoreDescription() {
        if (storeDescription == null) {
            storeDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.storeDescription;
    }

    /**
     * Gets the value of the storeDetailedDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDetailedDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDetailedDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStoreDetailedDescription() {
        if (storeDetailedDescription == null) {
            storeDetailedDescription = new ArrayList<SearchColumnStringField>();
        }
        return this.storeDetailedDescription;
    }

    /**
     * Gets the value of the storeDisplayImage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDisplayImage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDisplayImage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getStoreDisplayImage() {
        if (storeDisplayImage == null) {
            storeDisplayImage = new ArrayList<SearchColumnSelectField>();
        }
        return this.storeDisplayImage;
    }

    /**
     * Gets the value of the storeDisplayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDisplayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getStoreDisplayName() {
        if (storeDisplayName == null) {
            storeDisplayName = new ArrayList<SearchColumnStringField>();
        }
        return this.storeDisplayName;
    }

    /**
     * Gets the value of the storeDisplayThumbnail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the storeDisplayThumbnail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStoreDisplayThumbnail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getStoreDisplayThumbnail() {
        if (storeDisplayThumbnail == null) {
            storeDisplayThumbnail = new ArrayList<SearchColumnSelectField>();
        }
        return this.storeDisplayThumbnail;
    }

    /**
     * Gets the value of the subsidiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subsidiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubsidiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getSubsidiary() {
        if (subsidiary == null) {
            subsidiary = new ArrayList<SearchColumnSelectField>();
        }
        return this.subsidiary;
    }

    /**
     * Gets the value of the subType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getSubType() {
        if (subType == null) {
            subType = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.subType;
    }

    /**
     * Gets the value of the taxSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getTaxSchedule() {
        if (taxSchedule == null) {
            taxSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.taxSchedule;
    }

    /**
     * Gets the value of the thumbNailUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the thumbNailUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThumbNailUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getThumbNailUrl() {
        if (thumbNailUrl == null) {
            thumbNailUrl = new ArrayList<SearchColumnStringField>();
        }
        return this.thumbNailUrl;
    }

    /**
     * Gets the value of the totalValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the totalValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTotalValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTotalValue() {
        if (totalValue == null) {
            totalValue = new ArrayList<SearchColumnDoubleField>();
        }
        return this.totalValue;
    }

    /**
     * Gets the value of the trackLandedCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackLandedCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackLandedCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getTrackLandedCost() {
        if (trackLandedCost == null) {
            trackLandedCost = new ArrayList<SearchColumnBooleanField>();
        }
        return this.trackLandedCost;
    }

    /**
     * Gets the value of the transferPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getTransferPrice() {
        if (transferPrice == null) {
            transferPrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.transferPrice;
    }

    /**
     * Gets the value of the type property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the type property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getType() {
        if (type == null) {
            type = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.type;
    }

    /**
     * Gets the value of the unbuildVarianceAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unbuildVarianceAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnbuildVarianceAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getUnbuildVarianceAccount() {
        if (unbuildVarianceAccount == null) {
            unbuildVarianceAccount = new ArrayList<SearchColumnSelectField>();
        }
        return this.unbuildVarianceAccount;
    }

    /**
     * Gets the value of the unitsType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitsType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getUnitsType() {
        if (unitsType == null) {
            unitsType = new ArrayList<SearchColumnSelectField>();
        }
        return this.unitsType;
    }

    /**
     * Gets the value of the upcCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the upcCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpcCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUpcCode() {
        if (upcCode == null) {
            upcCode = new ArrayList<SearchColumnStringField>();
        }
        return this.upcCode;
    }

    /**
     * Gets the value of the urlComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getUrlComponent() {
        if (urlComponent == null) {
            urlComponent = new ArrayList<SearchColumnStringField>();
        }
        return this.urlComponent;
    }

    /**
     * Gets the value of the useBins property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useBins property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseBins().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseBins() {
        if (useBins == null) {
            useBins = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useBins;
    }

    /**
     * Gets the value of the useMarginalRates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useMarginalRates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseMarginalRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getUseMarginalRates() {
        if (useMarginalRates == null) {
            useMarginalRates = new ArrayList<SearchColumnBooleanField>();
        }
        return this.useMarginalRates;
    }

    /**
     * Gets the value of the vendor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVendor() {
        if (vendor == null) {
            vendor = new ArrayList<SearchColumnSelectField>();
        }
        return this.vendor;
    }

    /**
     * Gets the value of the vendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVendorCode() {
        if (vendorCode == null) {
            vendorCode = new ArrayList<SearchColumnStringField>();
        }
        return this.vendorCode;
    }

    /**
     * Gets the value of the vendorCost property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorCost property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorCost().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getVendorCost() {
        if (vendorCost == null) {
            vendorCost = new ArrayList<SearchColumnDoubleField>();
        }
        return this.vendorCost;
    }

    /**
     * Gets the value of the vendorName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnStringField }
     * 
     * 
     */
    public List<SearchColumnStringField> getVendorName() {
        if (vendorName == null) {
            vendorName = new ArrayList<SearchColumnStringField>();
        }
        return this.vendorName;
    }

    /**
     * Gets the value of the vendorSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getVendorSchedule() {
        if (vendorSchedule == null) {
            vendorSchedule = new ArrayList<SearchColumnSelectField>();
        }
        return this.vendorSchedule;
    }

    /**
     * Gets the value of the vsoeDeferral property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoeDeferral property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoeDeferral().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getVsoeDeferral() {
        if (vsoeDeferral == null) {
            vsoeDeferral = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.vsoeDeferral;
    }

    /**
     * Gets the value of the vsoeDelivered property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoeDelivered property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoeDelivered().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getVsoeDelivered() {
        if (vsoeDelivered == null) {
            vsoeDelivered = new ArrayList<SearchColumnBooleanField>();
        }
        return this.vsoeDelivered;
    }

    /**
     * Gets the value of the vsoePermitDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoePermitDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoePermitDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getVsoePermitDiscount() {
        if (vsoePermitDiscount == null) {
            vsoePermitDiscount = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.vsoePermitDiscount;
    }

    /**
     * Gets the value of the vsoePrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vsoePrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVsoePrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getVsoePrice() {
        if (vsoePrice == null) {
            vsoePrice = new ArrayList<SearchColumnDoubleField>();
        }
        return this.vsoePrice;
    }

    /**
     * Gets the value of the webSite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the webSite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWebSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnSelectField }
     * 
     * 
     */
    public List<SearchColumnSelectField> getWebSite() {
        if (webSite == null) {
            webSite = new ArrayList<SearchColumnSelectField>();
        }
        return this.webSite;
    }

    /**
     * Gets the value of the weight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnDoubleField }
     * 
     * 
     */
    public List<SearchColumnDoubleField> getWeight() {
        if (weight == null) {
            weight = new ArrayList<SearchColumnDoubleField>();
        }
        return this.weight;
    }

    /**
     * Gets the value of the weightUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnEnumSelectField }
     * 
     * 
     */
    public List<SearchColumnEnumSelectField> getWeightUnit() {
        if (weightUnit == null) {
            weightUnit = new ArrayList<SearchColumnEnumSelectField>();
        }
        return this.weightUnit;
    }

    /**
     * Gets the value of the yahooProductFeed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yahooProductFeed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYahooProductFeed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchColumnBooleanField }
     * 
     * 
     */
    public List<SearchColumnBooleanField> getYahooProductFeed() {
        if (yahooProductFeed == null) {
            yahooProductFeed = new ArrayList<SearchColumnBooleanField>();
        }
        return this.yahooProductFeed;
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
