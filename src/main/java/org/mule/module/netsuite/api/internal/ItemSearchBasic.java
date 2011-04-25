/**
 * ItemSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchMultiSelectField account;

    private org.mule.module.netsuite.api.internal.SearchBooleanField autoLeadTime;

    private org.mule.module.netsuite.api.internal.SearchBooleanField autoPreferredStockLevel;

    private org.mule.module.netsuite.api.internal.SearchBooleanField autoReorderPoint;

    private org.mule.module.netsuite.api.internal.SearchBooleanField availableToPartners;

    private org.mule.module.netsuite.api.internal.SearchDoubleField averageCost;

    private org.mule.module.netsuite.api.internal.SearchStringField binNumber;

    private org.mule.module.netsuite.api.internal.SearchDoubleField binOnHandAvail;

    private org.mule.module.netsuite.api.internal.SearchDoubleField binOnHandCount;

    private org.mule.module.netsuite.api.internal.SearchBooleanField buildEntireAssembly;

    private org.mule.module.netsuite.api.internal.SearchDoubleField buyItNowPrice;

    private org.mule.module.netsuite.api.internal.SearchStringField caption;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField category;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField _class;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField component;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField componentOf;

    private org.mule.module.netsuite.api.internal.SearchBooleanField copyDescription;

    private org.mule.module.netsuite.api.internal.SearchDoubleField cost;

    private org.mule.module.netsuite.api.internal.SearchDoubleField costEstimate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costEstimateType;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costingMethod;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField countryOfManufacture;

    private org.mule.module.netsuite.api.internal.SearchDateField created;

    private org.mule.module.netsuite.api.internal.SearchBooleanField createJob;

    private org.mule.module.netsuite.api.internal.SearchDateField dateViewed;

    private org.mule.module.netsuite.api.internal.SearchDoubleField daysBeforeExpiration;

    private org.mule.module.netsuite.api.internal.SearchDoubleField defaultReturnCost;

    private org.mule.module.netsuite.api.internal.SearchDoubleField demandModifier;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField department;

    private org.mule.module.netsuite.api.internal.SearchBooleanField displayIneBayStore;

    private org.mule.module.netsuite.api.internal.SearchStringField displayName;

    private org.mule.module.netsuite.api.internal.SearchBooleanField dontShowPrice;

    private org.mule.module.netsuite.api.internal.SearchStringField eBayItemDescription;

    private org.mule.module.netsuite.api.internal.SearchStringField eBayItemSubtitle;

    private org.mule.module.netsuite.api.internal.SearchStringField eBayItemTitle;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField ebayRelistingOption;

    private org.mule.module.netsuite.api.internal.SearchBooleanField endAuctionsWhenOutOfStock;

    private org.mule.module.netsuite.api.internal.SearchBooleanField excludeFromSitemap;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId;

    private org.mule.module.netsuite.api.internal.SearchStringField externalIdString;

    private org.mule.module.netsuite.api.internal.SearchStringField featuredDescription;

    private org.mule.module.netsuite.api.internal.SearchStringField feedDescription;

    private org.mule.module.netsuite.api.internal.SearchStringField feedName;

    private org.mule.module.netsuite.api.internal.SearchBooleanField froogleProductFeed;

    private org.mule.module.netsuite.api.internal.SearchDoubleField fxCost;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertAuthCode;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertEmail;

    private org.mule.module.netsuite.api.internal.SearchDateField giftCertExpDate;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertFrom;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertMsg;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertOrigAmt;

    private org.mule.module.netsuite.api.internal.SearchStringField giftCertRecipient;

    private org.mule.module.netsuite.api.internal.SearchStringField imageUrl;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField inventoryLocation;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isAvailable;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isDropShipItem;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isFulfillable;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isGcoCompliant;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isOnline;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isPreferredVendor;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isSpecialOrderItem;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isSpecialWorkOrderItem;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField issueProduct;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isTaxable;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isVsoeBundle;

    private org.mule.module.netsuite.api.internal.SearchStringField itemId;

    private org.mule.module.netsuite.api.internal.SearchStringField itemUrl;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchDoubleField lastPurchasePrice;

    private org.mule.module.netsuite.api.internal.SearchDateField lastQuantityAvailableChange;

    private org.mule.module.netsuite.api.internal.SearchLongField leadTime;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField listingDuration;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField location;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationAverageCost;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationDefaultReturnCost;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationPreferredStockLevel;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityAvailable;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityBackOrdered;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityInTransit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityOnHand;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityOnOrder;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationReorderPoint;

    private org.mule.module.netsuite.api.internal.SearchDoubleField locationTotalValue;

    private org.mule.module.netsuite.api.internal.SearchStringField manufacturer;

    private org.mule.module.netsuite.api.internal.SearchStringField manufactureraddr1;

    private org.mule.module.netsuite.api.internal.SearchStringField manufacturerCity;

    private org.mule.module.netsuite.api.internal.SearchStringField manufacturerState;

    private org.mule.module.netsuite.api.internal.SearchStringField manufacturerTariff;

    private org.mule.module.netsuite.api.internal.SearchStringField manufacturerTaxId;

    private org.mule.module.netsuite.api.internal.SearchStringField manufacturerZip;

    private org.mule.module.netsuite.api.internal.SearchBooleanField matchBillToReceipt;

    private org.mule.module.netsuite.api.internal.SearchBooleanField matrix;

    private org.mule.module.netsuite.api.internal.SearchBooleanField matrixChild;

    private org.mule.module.netsuite.api.internal.SearchStringField metaTagHtml;

    private org.mule.module.netsuite.api.internal.SearchLongField minimumQuantity;

    private org.mule.module.netsuite.api.internal.SearchStringField mpn;

    private org.mule.module.netsuite.api.internal.SearchBooleanField multManufactureAddr;

    private org.mule.module.netsuite.api.internal.SearchStringField nexTagCategory;

    private org.mule.module.netsuite.api.internal.SearchBooleanField nexTagProductFeed;

    private org.mule.module.netsuite.api.internal.SearchLongField numActiveListings;

    private org.mule.module.netsuite.api.internal.SearchDoubleField numberAllowedDownloads;

    private org.mule.module.netsuite.api.internal.SearchLongField numCurrentlyListed;

    private org.mule.module.netsuite.api.internal.SearchBooleanField offerSupport;

    private org.mule.module.netsuite.api.internal.SearchDoubleField onlineCustomerPrice;

    private org.mule.module.netsuite.api.internal.SearchBooleanField onSpecial;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField outOfStockBehavior;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField overallQuantityPricingType;

    private org.mule.module.netsuite.api.internal.SearchStringField pageTitle;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField parent;

    private org.mule.module.netsuite.api.internal.SearchStringField preferenceCriterion;

    private org.mule.module.netsuite.api.internal.SearchBooleanField preferredBin;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField preferredLocation;

    private org.mule.module.netsuite.api.internal.SearchDoubleField preferredStockLevel;

    private org.mule.module.netsuite.api.internal.SearchLongField preferredStockLevelDays;

    private org.mule.module.netsuite.api.internal.SearchDoubleField price;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingGroup;

    private org.mule.module.netsuite.api.internal.SearchLongField primaryCategory;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseUnit;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityAvailable;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityBackOrdered;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityOnHand;

    private org.mule.module.netsuite.api.internal.SearchDoubleField quantityOnOrder;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField quantityPricingSchedule;

    private org.mule.module.netsuite.api.internal.SearchLongField reorderMultiple;

    private org.mule.module.netsuite.api.internal.SearchDoubleField reorderPoint;

    private org.mule.module.netsuite.api.internal.SearchDoubleField reservePrice;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField revRecSchedule;

    private org.mule.module.netsuite.api.internal.SearchDoubleField safetyStockLevel;

    private org.mule.module.netsuite.api.internal.SearchLongField safetyStockLevelDays;

    private org.mule.module.netsuite.api.internal.SearchStringField salesDescription;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField saleUnit;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField scheduleBCode;

    private org.mule.module.netsuite.api.internal.SearchStringField scheduleBNumber;

    private org.mule.module.netsuite.api.internal.SearchStringField scheduleBQuantity;

    private org.mule.module.netsuite.api.internal.SearchStringField searchKeywords;

    private org.mule.module.netsuite.api.internal.SearchBooleanField seasonalDemand;

    private org.mule.module.netsuite.api.internal.SearchBooleanField sellOnebay;

    private org.mule.module.netsuite.api.internal.SearchStringField serialNumber;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField serialNumberLocation;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shipIndividually;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField shipPackage;

    private org.mule.module.netsuite.api.internal.SearchDoubleField shippingRate;

    private org.mule.module.netsuite.api.internal.SearchStringField shoppingDotComCategory;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shoppingProductFeed;

    private org.mule.module.netsuite.api.internal.SearchLongField shopzillaCategoryId;

    private org.mule.module.netsuite.api.internal.SearchBooleanField shopzillaProductFeed;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField sitemapPriority;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField softDescriptor;

    private org.mule.module.netsuite.api.internal.SearchDoubleField startingPrice;

    private org.mule.module.netsuite.api.internal.SearchStringField stockDescription;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField stockUnit;

    private org.mule.module.netsuite.api.internal.SearchStringField storeDescription;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField subType;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField taxCode;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField taxSchedule;

    private org.mule.module.netsuite.api.internal.SearchStringField thumbnailUrl;

    private org.mule.module.netsuite.api.internal.SearchDoubleField totalValue;

    private org.mule.module.netsuite.api.internal.SearchBooleanField trackLandedCost;

    private org.mule.module.netsuite.api.internal.SearchDoubleField transferPrice;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField unitsType;

    private org.mule.module.netsuite.api.internal.SearchStringField upcCode;

    private org.mule.module.netsuite.api.internal.SearchStringField urlComponent;

    private org.mule.module.netsuite.api.internal.SearchBooleanField useBins;

    private org.mule.module.netsuite.api.internal.SearchBooleanField useMarginalRates;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField vendor;

    private org.mule.module.netsuite.api.internal.SearchStringField vendorCode;

    private org.mule.module.netsuite.api.internal.SearchDoubleField vendorCost;

    private org.mule.module.netsuite.api.internal.SearchStringField vendorName;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoeDeferral;

    private org.mule.module.netsuite.api.internal.SearchBooleanField vsoeDelivered;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoePermitDiscount;

    private org.mule.module.netsuite.api.internal.SearchDoubleField vsoePrice;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField webSite;

    private org.mule.module.netsuite.api.internal.SearchDoubleField weight;

    private org.mule.module.netsuite.api.internal.SearchBooleanField yahooProductFeed;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public ItemSearchBasic() {
    }

    public ItemSearchBasic(
           org.mule.module.netsuite.api.internal.SearchMultiSelectField account,
           org.mule.module.netsuite.api.internal.SearchBooleanField autoLeadTime,
           org.mule.module.netsuite.api.internal.SearchBooleanField autoPreferredStockLevel,
           org.mule.module.netsuite.api.internal.SearchBooleanField autoReorderPoint,
           org.mule.module.netsuite.api.internal.SearchBooleanField availableToPartners,
           org.mule.module.netsuite.api.internal.SearchDoubleField averageCost,
           org.mule.module.netsuite.api.internal.SearchStringField binNumber,
           org.mule.module.netsuite.api.internal.SearchDoubleField binOnHandAvail,
           org.mule.module.netsuite.api.internal.SearchDoubleField binOnHandCount,
           org.mule.module.netsuite.api.internal.SearchBooleanField buildEntireAssembly,
           org.mule.module.netsuite.api.internal.SearchDoubleField buyItNowPrice,
           org.mule.module.netsuite.api.internal.SearchStringField caption,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField category,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField _class,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField component,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField componentOf,
           org.mule.module.netsuite.api.internal.SearchBooleanField copyDescription,
           org.mule.module.netsuite.api.internal.SearchDoubleField cost,
           org.mule.module.netsuite.api.internal.SearchDoubleField costEstimate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costEstimateType,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costingMethod,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField countryOfManufacture,
           org.mule.module.netsuite.api.internal.SearchDateField created,
           org.mule.module.netsuite.api.internal.SearchBooleanField createJob,
           org.mule.module.netsuite.api.internal.SearchDateField dateViewed,
           org.mule.module.netsuite.api.internal.SearchDoubleField daysBeforeExpiration,
           org.mule.module.netsuite.api.internal.SearchDoubleField defaultReturnCost,
           org.mule.module.netsuite.api.internal.SearchDoubleField demandModifier,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField department,
           org.mule.module.netsuite.api.internal.SearchBooleanField displayIneBayStore,
           org.mule.module.netsuite.api.internal.SearchStringField displayName,
           org.mule.module.netsuite.api.internal.SearchBooleanField dontShowPrice,
           org.mule.module.netsuite.api.internal.SearchStringField eBayItemDescription,
           org.mule.module.netsuite.api.internal.SearchStringField eBayItemSubtitle,
           org.mule.module.netsuite.api.internal.SearchStringField eBayItemTitle,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField ebayRelistingOption,
           org.mule.module.netsuite.api.internal.SearchBooleanField endAuctionsWhenOutOfStock,
           org.mule.module.netsuite.api.internal.SearchBooleanField excludeFromSitemap,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId,
           org.mule.module.netsuite.api.internal.SearchStringField externalIdString,
           org.mule.module.netsuite.api.internal.SearchStringField featuredDescription,
           org.mule.module.netsuite.api.internal.SearchStringField feedDescription,
           org.mule.module.netsuite.api.internal.SearchStringField feedName,
           org.mule.module.netsuite.api.internal.SearchBooleanField froogleProductFeed,
           org.mule.module.netsuite.api.internal.SearchDoubleField fxCost,
           org.mule.module.netsuite.api.internal.SearchStringField giftCertAuthCode,
           org.mule.module.netsuite.api.internal.SearchStringField giftCertEmail,
           org.mule.module.netsuite.api.internal.SearchDateField giftCertExpDate,
           org.mule.module.netsuite.api.internal.SearchStringField giftCertFrom,
           org.mule.module.netsuite.api.internal.SearchStringField giftCertMsg,
           org.mule.module.netsuite.api.internal.SearchStringField giftCertOrigAmt,
           org.mule.module.netsuite.api.internal.SearchStringField giftCertRecipient,
           org.mule.module.netsuite.api.internal.SearchStringField imageUrl,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField inventoryLocation,
           org.mule.module.netsuite.api.internal.SearchBooleanField isAvailable,
           org.mule.module.netsuite.api.internal.SearchBooleanField isDropShipItem,
           org.mule.module.netsuite.api.internal.SearchBooleanField isFulfillable,
           org.mule.module.netsuite.api.internal.SearchBooleanField isGcoCompliant,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isOnline,
           org.mule.module.netsuite.api.internal.SearchBooleanField isPreferredVendor,
           org.mule.module.netsuite.api.internal.SearchBooleanField isSpecialOrderItem,
           org.mule.module.netsuite.api.internal.SearchBooleanField isSpecialWorkOrderItem,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField issueProduct,
           org.mule.module.netsuite.api.internal.SearchBooleanField isTaxable,
           org.mule.module.netsuite.api.internal.SearchBooleanField isVsoeBundle,
           org.mule.module.netsuite.api.internal.SearchStringField itemId,
           org.mule.module.netsuite.api.internal.SearchStringField itemUrl,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchDoubleField lastPurchasePrice,
           org.mule.module.netsuite.api.internal.SearchDateField lastQuantityAvailableChange,
           org.mule.module.netsuite.api.internal.SearchLongField leadTime,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField listingDuration,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField location,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationAverageCost,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationDefaultReturnCost,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationPreferredStockLevel,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityAvailable,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityBackOrdered,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityCommitted,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityInTransit,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityOnHand,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityOnOrder,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationReorderPoint,
           org.mule.module.netsuite.api.internal.SearchDoubleField locationTotalValue,
           org.mule.module.netsuite.api.internal.SearchStringField manufacturer,
           org.mule.module.netsuite.api.internal.SearchStringField manufactureraddr1,
           org.mule.module.netsuite.api.internal.SearchStringField manufacturerCity,
           org.mule.module.netsuite.api.internal.SearchStringField manufacturerState,
           org.mule.module.netsuite.api.internal.SearchStringField manufacturerTariff,
           org.mule.module.netsuite.api.internal.SearchStringField manufacturerTaxId,
           org.mule.module.netsuite.api.internal.SearchStringField manufacturerZip,
           org.mule.module.netsuite.api.internal.SearchBooleanField matchBillToReceipt,
           org.mule.module.netsuite.api.internal.SearchBooleanField matrix,
           org.mule.module.netsuite.api.internal.SearchBooleanField matrixChild,
           org.mule.module.netsuite.api.internal.SearchStringField metaTagHtml,
           org.mule.module.netsuite.api.internal.SearchLongField minimumQuantity,
           org.mule.module.netsuite.api.internal.SearchStringField mpn,
           org.mule.module.netsuite.api.internal.SearchBooleanField multManufactureAddr,
           org.mule.module.netsuite.api.internal.SearchStringField nexTagCategory,
           org.mule.module.netsuite.api.internal.SearchBooleanField nexTagProductFeed,
           org.mule.module.netsuite.api.internal.SearchLongField numActiveListings,
           org.mule.module.netsuite.api.internal.SearchDoubleField numberAllowedDownloads,
           org.mule.module.netsuite.api.internal.SearchLongField numCurrentlyListed,
           org.mule.module.netsuite.api.internal.SearchBooleanField offerSupport,
           org.mule.module.netsuite.api.internal.SearchDoubleField onlineCustomerPrice,
           org.mule.module.netsuite.api.internal.SearchBooleanField onSpecial,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField outOfStockBehavior,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField overallQuantityPricingType,
           org.mule.module.netsuite.api.internal.SearchStringField pageTitle,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField parent,
           org.mule.module.netsuite.api.internal.SearchStringField preferenceCriterion,
           org.mule.module.netsuite.api.internal.SearchBooleanField preferredBin,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField preferredLocation,
           org.mule.module.netsuite.api.internal.SearchDoubleField preferredStockLevel,
           org.mule.module.netsuite.api.internal.SearchLongField preferredStockLevelDays,
           org.mule.module.netsuite.api.internal.SearchDoubleField price,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingGroup,
           org.mule.module.netsuite.api.internal.SearchLongField primaryCategory,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseUnit,
           org.mule.module.netsuite.api.internal.SearchDoubleField quantityAvailable,
           org.mule.module.netsuite.api.internal.SearchDoubleField quantityBackOrdered,
           org.mule.module.netsuite.api.internal.SearchDoubleField quantityCommitted,
           org.mule.module.netsuite.api.internal.SearchDoubleField quantityOnHand,
           org.mule.module.netsuite.api.internal.SearchDoubleField quantityOnOrder,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField quantityPricingSchedule,
           org.mule.module.netsuite.api.internal.SearchLongField reorderMultiple,
           org.mule.module.netsuite.api.internal.SearchDoubleField reorderPoint,
           org.mule.module.netsuite.api.internal.SearchDoubleField reservePrice,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField revRecSchedule,
           org.mule.module.netsuite.api.internal.SearchDoubleField safetyStockLevel,
           org.mule.module.netsuite.api.internal.SearchLongField safetyStockLevelDays,
           org.mule.module.netsuite.api.internal.SearchStringField salesDescription,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField saleUnit,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField scheduleBCode,
           org.mule.module.netsuite.api.internal.SearchStringField scheduleBNumber,
           org.mule.module.netsuite.api.internal.SearchStringField scheduleBQuantity,
           org.mule.module.netsuite.api.internal.SearchStringField searchKeywords,
           org.mule.module.netsuite.api.internal.SearchBooleanField seasonalDemand,
           org.mule.module.netsuite.api.internal.SearchBooleanField sellOnebay,
           org.mule.module.netsuite.api.internal.SearchStringField serialNumber,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField serialNumberLocation,
           org.mule.module.netsuite.api.internal.SearchBooleanField shipIndividually,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField shipPackage,
           org.mule.module.netsuite.api.internal.SearchDoubleField shippingRate,
           org.mule.module.netsuite.api.internal.SearchStringField shoppingDotComCategory,
           org.mule.module.netsuite.api.internal.SearchBooleanField shoppingProductFeed,
           org.mule.module.netsuite.api.internal.SearchLongField shopzillaCategoryId,
           org.mule.module.netsuite.api.internal.SearchBooleanField shopzillaProductFeed,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField sitemapPriority,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField softDescriptor,
           org.mule.module.netsuite.api.internal.SearchDoubleField startingPrice,
           org.mule.module.netsuite.api.internal.SearchStringField stockDescription,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField stockUnit,
           org.mule.module.netsuite.api.internal.SearchStringField storeDescription,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField subType,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField taxCode,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField taxSchedule,
           org.mule.module.netsuite.api.internal.SearchStringField thumbnailUrl,
           org.mule.module.netsuite.api.internal.SearchDoubleField totalValue,
           org.mule.module.netsuite.api.internal.SearchBooleanField trackLandedCost,
           org.mule.module.netsuite.api.internal.SearchDoubleField transferPrice,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField unitsType,
           org.mule.module.netsuite.api.internal.SearchStringField upcCode,
           org.mule.module.netsuite.api.internal.SearchStringField urlComponent,
           org.mule.module.netsuite.api.internal.SearchBooleanField useBins,
           org.mule.module.netsuite.api.internal.SearchBooleanField useMarginalRates,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField vendor,
           org.mule.module.netsuite.api.internal.SearchStringField vendorCode,
           org.mule.module.netsuite.api.internal.SearchDoubleField vendorCost,
           org.mule.module.netsuite.api.internal.SearchStringField vendorName,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoeDeferral,
           org.mule.module.netsuite.api.internal.SearchBooleanField vsoeDelivered,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoePermitDiscount,
           org.mule.module.netsuite.api.internal.SearchDoubleField vsoePrice,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField webSite,
           org.mule.module.netsuite.api.internal.SearchDoubleField weight,
           org.mule.module.netsuite.api.internal.SearchBooleanField yahooProductFeed,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.account = account;
        this.autoLeadTime = autoLeadTime;
        this.autoPreferredStockLevel = autoPreferredStockLevel;
        this.autoReorderPoint = autoReorderPoint;
        this.availableToPartners = availableToPartners;
        this.averageCost = averageCost;
        this.binNumber = binNumber;
        this.binOnHandAvail = binOnHandAvail;
        this.binOnHandCount = binOnHandCount;
        this.buildEntireAssembly = buildEntireAssembly;
        this.buyItNowPrice = buyItNowPrice;
        this.caption = caption;
        this.category = category;
        this._class = _class;
        this.component = component;
        this.componentOf = componentOf;
        this.copyDescription = copyDescription;
        this.cost = cost;
        this.costEstimate = costEstimate;
        this.costEstimateType = costEstimateType;
        this.costingMethod = costingMethod;
        this.countryOfManufacture = countryOfManufacture;
        this.created = created;
        this.createJob = createJob;
        this.dateViewed = dateViewed;
        this.daysBeforeExpiration = daysBeforeExpiration;
        this.defaultReturnCost = defaultReturnCost;
        this.demandModifier = demandModifier;
        this.department = department;
        this.displayIneBayStore = displayIneBayStore;
        this.displayName = displayName;
        this.dontShowPrice = dontShowPrice;
        this.eBayItemDescription = eBayItemDescription;
        this.eBayItemSubtitle = eBayItemSubtitle;
        this.eBayItemTitle = eBayItemTitle;
        this.ebayRelistingOption = ebayRelistingOption;
        this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
        this.excludeFromSitemap = excludeFromSitemap;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.featuredDescription = featuredDescription;
        this.feedDescription = feedDescription;
        this.feedName = feedName;
        this.froogleProductFeed = froogleProductFeed;
        this.fxCost = fxCost;
        this.giftCertAuthCode = giftCertAuthCode;
        this.giftCertEmail = giftCertEmail;
        this.giftCertExpDate = giftCertExpDate;
        this.giftCertFrom = giftCertFrom;
        this.giftCertMsg = giftCertMsg;
        this.giftCertOrigAmt = giftCertOrigAmt;
        this.giftCertRecipient = giftCertRecipient;
        this.imageUrl = imageUrl;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.inventoryLocation = inventoryLocation;
        this.isAvailable = isAvailable;
        this.isDropShipItem = isDropShipItem;
        this.isFulfillable = isFulfillable;
        this.isGcoCompliant = isGcoCompliant;
        this.isInactive = isInactive;
        this.isOnline = isOnline;
        this.isPreferredVendor = isPreferredVendor;
        this.isSpecialOrderItem = isSpecialOrderItem;
        this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
        this.issueProduct = issueProduct;
        this.isTaxable = isTaxable;
        this.isVsoeBundle = isVsoeBundle;
        this.itemId = itemId;
        this.itemUrl = itemUrl;
        this.lastModifiedDate = lastModifiedDate;
        this.lastPurchasePrice = lastPurchasePrice;
        this.lastQuantityAvailableChange = lastQuantityAvailableChange;
        this.leadTime = leadTime;
        this.listingDuration = listingDuration;
        this.location = location;
        this.locationAverageCost = locationAverageCost;
        this.locationDefaultReturnCost = locationDefaultReturnCost;
        this.locationPreferredStockLevel = locationPreferredStockLevel;
        this.locationQuantityAvailable = locationQuantityAvailable;
        this.locationQuantityBackOrdered = locationQuantityBackOrdered;
        this.locationQuantityCommitted = locationQuantityCommitted;
        this.locationQuantityInTransit = locationQuantityInTransit;
        this.locationQuantityOnHand = locationQuantityOnHand;
        this.locationQuantityOnOrder = locationQuantityOnOrder;
        this.locationReorderPoint = locationReorderPoint;
        this.locationTotalValue = locationTotalValue;
        this.manufacturer = manufacturer;
        this.manufactureraddr1 = manufactureraddr1;
        this.manufacturerCity = manufacturerCity;
        this.manufacturerState = manufacturerState;
        this.manufacturerTariff = manufacturerTariff;
        this.manufacturerTaxId = manufacturerTaxId;
        this.manufacturerZip = manufacturerZip;
        this.matchBillToReceipt = matchBillToReceipt;
        this.matrix = matrix;
        this.matrixChild = matrixChild;
        this.metaTagHtml = metaTagHtml;
        this.minimumQuantity = minimumQuantity;
        this.mpn = mpn;
        this.multManufactureAddr = multManufactureAddr;
        this.nexTagCategory = nexTagCategory;
        this.nexTagProductFeed = nexTagProductFeed;
        this.numActiveListings = numActiveListings;
        this.numberAllowedDownloads = numberAllowedDownloads;
        this.numCurrentlyListed = numCurrentlyListed;
        this.offerSupport = offerSupport;
        this.onlineCustomerPrice = onlineCustomerPrice;
        this.onSpecial = onSpecial;
        this.outOfStockBehavior = outOfStockBehavior;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.pageTitle = pageTitle;
        this.parent = parent;
        this.preferenceCriterion = preferenceCriterion;
        this.preferredBin = preferredBin;
        this.preferredLocation = preferredLocation;
        this.preferredStockLevel = preferredStockLevel;
        this.preferredStockLevelDays = preferredStockLevelDays;
        this.price = price;
        this.pricingGroup = pricingGroup;
        this.primaryCategory = primaryCategory;
        this.purchaseUnit = purchaseUnit;
        this.quantityAvailable = quantityAvailable;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityCommitted = quantityCommitted;
        this.quantityOnHand = quantityOnHand;
        this.quantityOnOrder = quantityOnOrder;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.reorderMultiple = reorderMultiple;
        this.reorderPoint = reorderPoint;
        this.reservePrice = reservePrice;
        this.revRecSchedule = revRecSchedule;
        this.safetyStockLevel = safetyStockLevel;
        this.safetyStockLevelDays = safetyStockLevelDays;
        this.salesDescription = salesDescription;
        this.saleUnit = saleUnit;
        this.scheduleBCode = scheduleBCode;
        this.scheduleBNumber = scheduleBNumber;
        this.scheduleBQuantity = scheduleBQuantity;
        this.searchKeywords = searchKeywords;
        this.seasonalDemand = seasonalDemand;
        this.sellOnebay = sellOnebay;
        this.serialNumber = serialNumber;
        this.serialNumberLocation = serialNumberLocation;
        this.shipIndividually = shipIndividually;
        this.shipPackage = shipPackage;
        this.shippingRate = shippingRate;
        this.shoppingDotComCategory = shoppingDotComCategory;
        this.shoppingProductFeed = shoppingProductFeed;
        this.shopzillaCategoryId = shopzillaCategoryId;
        this.shopzillaProductFeed = shopzillaProductFeed;
        this.sitemapPriority = sitemapPriority;
        this.softDescriptor = softDescriptor;
        this.startingPrice = startingPrice;
        this.stockDescription = stockDescription;
        this.stockUnit = stockUnit;
        this.storeDescription = storeDescription;
        this.subsidiary = subsidiary;
        this.subType = subType;
        this.taxCode = taxCode;
        this.taxSchedule = taxSchedule;
        this.thumbnailUrl = thumbnailUrl;
        this.totalValue = totalValue;
        this.trackLandedCost = trackLandedCost;
        this.transferPrice = transferPrice;
        this.type = type;
        this.unitsType = unitsType;
        this.upcCode = upcCode;
        this.urlComponent = urlComponent;
        this.useBins = useBins;
        this.useMarginalRates = useMarginalRates;
        this.vendor = vendor;
        this.vendorCode = vendorCode;
        this.vendorCost = vendorCost;
        this.vendorName = vendorName;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoeDelivered = vsoeDelivered;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoePrice = vsoePrice;
        this.webSite = webSite;
        this.weight = weight;
        this.yahooProductFeed = yahooProductFeed;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the account value for this ItemSearchBasic.
     * 
     * @return account
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAccount() {
        return account;
    }


    /**
     * Sets the account value for this ItemSearchBasic.
     * 
     * @param account
     */
    public void setAccount(org.mule.module.netsuite.api.internal.SearchMultiSelectField account) {
        this.account = account;
    }


    /**
     * Gets the autoLeadTime value for this ItemSearchBasic.
     * 
     * @return autoLeadTime
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAutoLeadTime() {
        return autoLeadTime;
    }


    /**
     * Sets the autoLeadTime value for this ItemSearchBasic.
     * 
     * @param autoLeadTime
     */
    public void setAutoLeadTime(org.mule.module.netsuite.api.internal.SearchBooleanField autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }


    /**
     * Gets the autoPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @return autoPreferredStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }


    /**
     * Sets the autoPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @param autoPreferredStockLevel
     */
    public void setAutoPreferredStockLevel(org.mule.module.netsuite.api.internal.SearchBooleanField autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }


    /**
     * Gets the autoReorderPoint value for this ItemSearchBasic.
     * 
     * @return autoReorderPoint
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAutoReorderPoint() {
        return autoReorderPoint;
    }


    /**
     * Sets the autoReorderPoint value for this ItemSearchBasic.
     * 
     * @param autoReorderPoint
     */
    public void setAutoReorderPoint(org.mule.module.netsuite.api.internal.SearchBooleanField autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }


    /**
     * Gets the availableToPartners value for this ItemSearchBasic.
     * 
     * @return availableToPartners
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this ItemSearchBasic.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(org.mule.module.netsuite.api.internal.SearchBooleanField availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the averageCost value for this ItemSearchBasic.
     * 
     * @return averageCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this ItemSearchBasic.
     * 
     * @param averageCost
     */
    public void setAverageCost(org.mule.module.netsuite.api.internal.SearchDoubleField averageCost) {
        this.averageCost = averageCost;
    }


    /**
     * Gets the binNumber value for this ItemSearchBasic.
     * 
     * @return binNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this ItemSearchBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(org.mule.module.netsuite.api.internal.SearchStringField binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the binOnHandAvail value for this ItemSearchBasic.
     * 
     * @return binOnHandAvail
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBinOnHandAvail() {
        return binOnHandAvail;
    }


    /**
     * Sets the binOnHandAvail value for this ItemSearchBasic.
     * 
     * @param binOnHandAvail
     */
    public void setBinOnHandAvail(org.mule.module.netsuite.api.internal.SearchDoubleField binOnHandAvail) {
        this.binOnHandAvail = binOnHandAvail;
    }


    /**
     * Gets the binOnHandCount value for this ItemSearchBasic.
     * 
     * @return binOnHandCount
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBinOnHandCount() {
        return binOnHandCount;
    }


    /**
     * Sets the binOnHandCount value for this ItemSearchBasic.
     * 
     * @param binOnHandCount
     */
    public void setBinOnHandCount(org.mule.module.netsuite.api.internal.SearchDoubleField binOnHandCount) {
        this.binOnHandCount = binOnHandCount;
    }


    /**
     * Gets the buildEntireAssembly value for this ItemSearchBasic.
     * 
     * @return buildEntireAssembly
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this ItemSearchBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(org.mule.module.netsuite.api.internal.SearchBooleanField buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }


    /**
     * Gets the buyItNowPrice value for this ItemSearchBasic.
     * 
     * @return buyItNowPrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBuyItNowPrice() {
        return buyItNowPrice;
    }


    /**
     * Sets the buyItNowPrice value for this ItemSearchBasic.
     * 
     * @param buyItNowPrice
     */
    public void setBuyItNowPrice(org.mule.module.netsuite.api.internal.SearchDoubleField buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }


    /**
     * Gets the caption value for this ItemSearchBasic.
     * 
     * @return caption
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCaption() {
        return caption;
    }


    /**
     * Sets the caption value for this ItemSearchBasic.
     * 
     * @param caption
     */
    public void setCaption(org.mule.module.netsuite.api.internal.SearchStringField caption) {
        this.caption = caption;
    }


    /**
     * Gets the category value for this ItemSearchBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ItemSearchBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the _class value for this ItemSearchBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ItemSearchBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchMultiSelectField _class) {
        this._class = _class;
    }


    /**
     * Gets the component value for this ItemSearchBasic.
     * 
     * @return component
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getComponent() {
        return component;
    }


    /**
     * Sets the component value for this ItemSearchBasic.
     * 
     * @param component
     */
    public void setComponent(org.mule.module.netsuite.api.internal.SearchMultiSelectField component) {
        this.component = component;
    }


    /**
     * Gets the componentOf value for this ItemSearchBasic.
     * 
     * @return componentOf
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getComponentOf() {
        return componentOf;
    }


    /**
     * Sets the componentOf value for this ItemSearchBasic.
     * 
     * @param componentOf
     */
    public void setComponentOf(org.mule.module.netsuite.api.internal.SearchMultiSelectField componentOf) {
        this.componentOf = componentOf;
    }


    /**
     * Gets the copyDescription value for this ItemSearchBasic.
     * 
     * @return copyDescription
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getCopyDescription() {
        return copyDescription;
    }


    /**
     * Sets the copyDescription value for this ItemSearchBasic.
     * 
     * @param copyDescription
     */
    public void setCopyDescription(org.mule.module.netsuite.api.internal.SearchBooleanField copyDescription) {
        this.copyDescription = copyDescription;
    }


    /**
     * Gets the cost value for this ItemSearchBasic.
     * 
     * @return cost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ItemSearchBasic.
     * 
     * @param cost
     */
    public void setCost(org.mule.module.netsuite.api.internal.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the costEstimate value for this ItemSearchBasic.
     * 
     * @return costEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this ItemSearchBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(org.mule.module.netsuite.api.internal.SearchDoubleField costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the costEstimateType value for this ItemSearchBasic.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this ItemSearchBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costingMethod value for this ItemSearchBasic.
     * 
     * @return costingMethod
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCostingMethod() {
        return costingMethod;
    }


    /**
     * Sets the costingMethod value for this ItemSearchBasic.
     * 
     * @param costingMethod
     */
    public void setCostingMethod(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField costingMethod) {
        this.costingMethod = costingMethod;
    }


    /**
     * Gets the countryOfManufacture value for this ItemSearchBasic.
     * 
     * @return countryOfManufacture
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this ItemSearchBasic.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the created value for this ItemSearchBasic.
     * 
     * @return created
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreated() {
        return created;
    }


    /**
     * Sets the created value for this ItemSearchBasic.
     * 
     * @param created
     */
    public void setCreated(org.mule.module.netsuite.api.internal.SearchDateField created) {
        this.created = created;
    }


    /**
     * Gets the createJob value for this ItemSearchBasic.
     * 
     * @return createJob
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getCreateJob() {
        return createJob;
    }


    /**
     * Sets the createJob value for this ItemSearchBasic.
     * 
     * @param createJob
     */
    public void setCreateJob(org.mule.module.netsuite.api.internal.SearchBooleanField createJob) {
        this.createJob = createJob;
    }


    /**
     * Gets the dateViewed value for this ItemSearchBasic.
     * 
     * @return dateViewed
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this ItemSearchBasic.
     * 
     * @param dateViewed
     */
    public void setDateViewed(org.mule.module.netsuite.api.internal.SearchDateField dateViewed) {
        this.dateViewed = dateViewed;
    }


    /**
     * Gets the daysBeforeExpiration value for this ItemSearchBasic.
     * 
     * @return daysBeforeExpiration
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }


    /**
     * Sets the daysBeforeExpiration value for this ItemSearchBasic.
     * 
     * @param daysBeforeExpiration
     */
    public void setDaysBeforeExpiration(org.mule.module.netsuite.api.internal.SearchDoubleField daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }


    /**
     * Gets the defaultReturnCost value for this ItemSearchBasic.
     * 
     * @return defaultReturnCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDefaultReturnCost() {
        return defaultReturnCost;
    }


    /**
     * Sets the defaultReturnCost value for this ItemSearchBasic.
     * 
     * @param defaultReturnCost
     */
    public void setDefaultReturnCost(org.mule.module.netsuite.api.internal.SearchDoubleField defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }


    /**
     * Gets the demandModifier value for this ItemSearchBasic.
     * 
     * @return demandModifier
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getDemandModifier() {
        return demandModifier;
    }


    /**
     * Sets the demandModifier value for this ItemSearchBasic.
     * 
     * @param demandModifier
     */
    public void setDemandModifier(org.mule.module.netsuite.api.internal.SearchDoubleField demandModifier) {
        this.demandModifier = demandModifier;
    }


    /**
     * Gets the department value for this ItemSearchBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ItemSearchBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchMultiSelectField department) {
        this.department = department;
    }


    /**
     * Gets the displayIneBayStore value for this ItemSearchBasic.
     * 
     * @return displayIneBayStore
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getDisplayIneBayStore() {
        return displayIneBayStore;
    }


    /**
     * Sets the displayIneBayStore value for this ItemSearchBasic.
     * 
     * @param displayIneBayStore
     */
    public void setDisplayIneBayStore(org.mule.module.netsuite.api.internal.SearchBooleanField displayIneBayStore) {
        this.displayIneBayStore = displayIneBayStore;
    }


    /**
     * Gets the displayName value for this ItemSearchBasic.
     * 
     * @return displayName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ItemSearchBasic.
     * 
     * @param displayName
     */
    public void setDisplayName(org.mule.module.netsuite.api.internal.SearchStringField displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the dontShowPrice value for this ItemSearchBasic.
     * 
     * @return dontShowPrice
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this ItemSearchBasic.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(org.mule.module.netsuite.api.internal.SearchBooleanField dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }


    /**
     * Gets the eBayItemDescription value for this ItemSearchBasic.
     * 
     * @return eBayItemDescription
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEBayItemDescription() {
        return eBayItemDescription;
    }


    /**
     * Sets the eBayItemDescription value for this ItemSearchBasic.
     * 
     * @param eBayItemDescription
     */
    public void setEBayItemDescription(org.mule.module.netsuite.api.internal.SearchStringField eBayItemDescription) {
        this.eBayItemDescription = eBayItemDescription;
    }


    /**
     * Gets the eBayItemSubtitle value for this ItemSearchBasic.
     * 
     * @return eBayItemSubtitle
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEBayItemSubtitle() {
        return eBayItemSubtitle;
    }


    /**
     * Sets the eBayItemSubtitle value for this ItemSearchBasic.
     * 
     * @param eBayItemSubtitle
     */
    public void setEBayItemSubtitle(org.mule.module.netsuite.api.internal.SearchStringField eBayItemSubtitle) {
        this.eBayItemSubtitle = eBayItemSubtitle;
    }


    /**
     * Gets the eBayItemTitle value for this ItemSearchBasic.
     * 
     * @return eBayItemTitle
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEBayItemTitle() {
        return eBayItemTitle;
    }


    /**
     * Sets the eBayItemTitle value for this ItemSearchBasic.
     * 
     * @param eBayItemTitle
     */
    public void setEBayItemTitle(org.mule.module.netsuite.api.internal.SearchStringField eBayItemTitle) {
        this.eBayItemTitle = eBayItemTitle;
    }


    /**
     * Gets the ebayRelistingOption value for this ItemSearchBasic.
     * 
     * @return ebayRelistingOption
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getEbayRelistingOption() {
        return ebayRelistingOption;
    }


    /**
     * Sets the ebayRelistingOption value for this ItemSearchBasic.
     * 
     * @param ebayRelistingOption
     */
    public void setEbayRelistingOption(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField ebayRelistingOption) {
        this.ebayRelistingOption = ebayRelistingOption;
    }


    /**
     * Gets the endAuctionsWhenOutOfStock value for this ItemSearchBasic.
     * 
     * @return endAuctionsWhenOutOfStock
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getEndAuctionsWhenOutOfStock() {
        return endAuctionsWhenOutOfStock;
    }


    /**
     * Sets the endAuctionsWhenOutOfStock value for this ItemSearchBasic.
     * 
     * @param endAuctionsWhenOutOfStock
     */
    public void setEndAuctionsWhenOutOfStock(org.mule.module.netsuite.api.internal.SearchBooleanField endAuctionsWhenOutOfStock) {
        this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
    }


    /**
     * Gets the excludeFromSitemap value for this ItemSearchBasic.
     * 
     * @return excludeFromSitemap
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this ItemSearchBasic.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(org.mule.module.netsuite.api.internal.SearchBooleanField excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the externalId value for this ItemSearchBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemSearchBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }


    /**
     * Gets the externalIdString value for this ItemSearchBasic.
     * 
     * @return externalIdString
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getExternalIdString() {
        return externalIdString;
    }


    /**
     * Sets the externalIdString value for this ItemSearchBasic.
     * 
     * @param externalIdString
     */
    public void setExternalIdString(org.mule.module.netsuite.api.internal.SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }


    /**
     * Gets the featuredDescription value for this ItemSearchBasic.
     * 
     * @return featuredDescription
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this ItemSearchBasic.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(org.mule.module.netsuite.api.internal.SearchStringField featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the feedDescription value for this ItemSearchBasic.
     * 
     * @return feedDescription
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFeedDescription() {
        return feedDescription;
    }


    /**
     * Sets the feedDescription value for this ItemSearchBasic.
     * 
     * @param feedDescription
     */
    public void setFeedDescription(org.mule.module.netsuite.api.internal.SearchStringField feedDescription) {
        this.feedDescription = feedDescription;
    }


    /**
     * Gets the feedName value for this ItemSearchBasic.
     * 
     * @return feedName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getFeedName() {
        return feedName;
    }


    /**
     * Sets the feedName value for this ItemSearchBasic.
     * 
     * @param feedName
     */
    public void setFeedName(org.mule.module.netsuite.api.internal.SearchStringField feedName) {
        this.feedName = feedName;
    }


    /**
     * Gets the froogleProductFeed value for this ItemSearchBasic.
     * 
     * @return froogleProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getFroogleProductFeed() {
        return froogleProductFeed;
    }


    /**
     * Sets the froogleProductFeed value for this ItemSearchBasic.
     * 
     * @param froogleProductFeed
     */
    public void setFroogleProductFeed(org.mule.module.netsuite.api.internal.SearchBooleanField froogleProductFeed) {
        this.froogleProductFeed = froogleProductFeed;
    }


    /**
     * Gets the fxCost value for this ItemSearchBasic.
     * 
     * @return fxCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getFxCost() {
        return fxCost;
    }


    /**
     * Sets the fxCost value for this ItemSearchBasic.
     * 
     * @param fxCost
     */
    public void setFxCost(org.mule.module.netsuite.api.internal.SearchDoubleField fxCost) {
        this.fxCost = fxCost;
    }


    /**
     * Gets the giftCertAuthCode value for this ItemSearchBasic.
     * 
     * @return giftCertAuthCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertAuthCode() {
        return giftCertAuthCode;
    }


    /**
     * Sets the giftCertAuthCode value for this ItemSearchBasic.
     * 
     * @param giftCertAuthCode
     */
    public void setGiftCertAuthCode(org.mule.module.netsuite.api.internal.SearchStringField giftCertAuthCode) {
        this.giftCertAuthCode = giftCertAuthCode;
    }


    /**
     * Gets the giftCertEmail value for this ItemSearchBasic.
     * 
     * @return giftCertEmail
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertEmail() {
        return giftCertEmail;
    }


    /**
     * Sets the giftCertEmail value for this ItemSearchBasic.
     * 
     * @param giftCertEmail
     */
    public void setGiftCertEmail(org.mule.module.netsuite.api.internal.SearchStringField giftCertEmail) {
        this.giftCertEmail = giftCertEmail;
    }


    /**
     * Gets the giftCertExpDate value for this ItemSearchBasic.
     * 
     * @return giftCertExpDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getGiftCertExpDate() {
        return giftCertExpDate;
    }


    /**
     * Sets the giftCertExpDate value for this ItemSearchBasic.
     * 
     * @param giftCertExpDate
     */
    public void setGiftCertExpDate(org.mule.module.netsuite.api.internal.SearchDateField giftCertExpDate) {
        this.giftCertExpDate = giftCertExpDate;
    }


    /**
     * Gets the giftCertFrom value for this ItemSearchBasic.
     * 
     * @return giftCertFrom
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertFrom() {
        return giftCertFrom;
    }


    /**
     * Sets the giftCertFrom value for this ItemSearchBasic.
     * 
     * @param giftCertFrom
     */
    public void setGiftCertFrom(org.mule.module.netsuite.api.internal.SearchStringField giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }


    /**
     * Gets the giftCertMsg value for this ItemSearchBasic.
     * 
     * @return giftCertMsg
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertMsg() {
        return giftCertMsg;
    }


    /**
     * Sets the giftCertMsg value for this ItemSearchBasic.
     * 
     * @param giftCertMsg
     */
    public void setGiftCertMsg(org.mule.module.netsuite.api.internal.SearchStringField giftCertMsg) {
        this.giftCertMsg = giftCertMsg;
    }


    /**
     * Gets the giftCertOrigAmt value for this ItemSearchBasic.
     * 
     * @return giftCertOrigAmt
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertOrigAmt() {
        return giftCertOrigAmt;
    }


    /**
     * Sets the giftCertOrigAmt value for this ItemSearchBasic.
     * 
     * @param giftCertOrigAmt
     */
    public void setGiftCertOrigAmt(org.mule.module.netsuite.api.internal.SearchStringField giftCertOrigAmt) {
        this.giftCertOrigAmt = giftCertOrigAmt;
    }


    /**
     * Gets the giftCertRecipient value for this ItemSearchBasic.
     * 
     * @return giftCertRecipient
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getGiftCertRecipient() {
        return giftCertRecipient;
    }


    /**
     * Sets the giftCertRecipient value for this ItemSearchBasic.
     * 
     * @param giftCertRecipient
     */
    public void setGiftCertRecipient(org.mule.module.netsuite.api.internal.SearchStringField giftCertRecipient) {
        this.giftCertRecipient = giftCertRecipient;
    }


    /**
     * Gets the imageUrl value for this ItemSearchBasic.
     * 
     * @return imageUrl
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this ItemSearchBasic.
     * 
     * @param imageUrl
     */
    public void setImageUrl(org.mule.module.netsuite.api.internal.SearchStringField imageUrl) {
        this.imageUrl = imageUrl;
    }


    /**
     * Gets the internalId value for this ItemSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this ItemSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this ItemSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the inventoryLocation value for this ItemSearchBasic.
     * 
     * @return inventoryLocation
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInventoryLocation() {
        return inventoryLocation;
    }


    /**
     * Sets the inventoryLocation value for this ItemSearchBasic.
     * 
     * @param inventoryLocation
     */
    public void setInventoryLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }


    /**
     * Gets the isAvailable value for this ItemSearchBasic.
     * 
     * @return isAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this ItemSearchBasic.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(org.mule.module.netsuite.api.internal.SearchBooleanField isAvailable) {
        this.isAvailable = isAvailable;
    }


    /**
     * Gets the isDropShipItem value for this ItemSearchBasic.
     * 
     * @return isDropShipItem
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsDropShipItem() {
        return isDropShipItem;
    }


    /**
     * Sets the isDropShipItem value for this ItemSearchBasic.
     * 
     * @param isDropShipItem
     */
    public void setIsDropShipItem(org.mule.module.netsuite.api.internal.SearchBooleanField isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }


    /**
     * Gets the isFulfillable value for this ItemSearchBasic.
     * 
     * @return isFulfillable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this ItemSearchBasic.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(org.mule.module.netsuite.api.internal.SearchBooleanField isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the isGcoCompliant value for this ItemSearchBasic.
     * 
     * @return isGcoCompliant
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this ItemSearchBasic.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(org.mule.module.netsuite.api.internal.SearchBooleanField isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }


    /**
     * Gets the isInactive value for this ItemSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ItemSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isOnline value for this ItemSearchBasic.
     * 
     * @return isOnline
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this ItemSearchBasic.
     * 
     * @param isOnline
     */
    public void setIsOnline(org.mule.module.netsuite.api.internal.SearchBooleanField isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isPreferredVendor value for this ItemSearchBasic.
     * 
     * @return isPreferredVendor
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsPreferredVendor() {
        return isPreferredVendor;
    }


    /**
     * Sets the isPreferredVendor value for this ItemSearchBasic.
     * 
     * @param isPreferredVendor
     */
    public void setIsPreferredVendor(org.mule.module.netsuite.api.internal.SearchBooleanField isPreferredVendor) {
        this.isPreferredVendor = isPreferredVendor;
    }


    /**
     * Gets the isSpecialOrderItem value for this ItemSearchBasic.
     * 
     * @return isSpecialOrderItem
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }


    /**
     * Sets the isSpecialOrderItem value for this ItemSearchBasic.
     * 
     * @param isSpecialOrderItem
     */
    public void setIsSpecialOrderItem(org.mule.module.netsuite.api.internal.SearchBooleanField isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }


    /**
     * Gets the isSpecialWorkOrderItem value for this ItemSearchBasic.
     * 
     * @return isSpecialWorkOrderItem
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsSpecialWorkOrderItem() {
        return isSpecialWorkOrderItem;
    }


    /**
     * Sets the isSpecialWorkOrderItem value for this ItemSearchBasic.
     * 
     * @param isSpecialWorkOrderItem
     */
    public void setIsSpecialWorkOrderItem(org.mule.module.netsuite.api.internal.SearchBooleanField isSpecialWorkOrderItem) {
        this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
    }


    /**
     * Gets the issueProduct value for this ItemSearchBasic.
     * 
     * @return issueProduct
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this ItemSearchBasic.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(org.mule.module.netsuite.api.internal.SearchMultiSelectField issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the isTaxable value for this ItemSearchBasic.
     * 
     * @return isTaxable
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this ItemSearchBasic.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(org.mule.module.netsuite.api.internal.SearchBooleanField isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the isVsoeBundle value for this ItemSearchBasic.
     * 
     * @return isVsoeBundle
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsVsoeBundle() {
        return isVsoeBundle;
    }


    /**
     * Sets the isVsoeBundle value for this ItemSearchBasic.
     * 
     * @param isVsoeBundle
     */
    public void setIsVsoeBundle(org.mule.module.netsuite.api.internal.SearchBooleanField isVsoeBundle) {
        this.isVsoeBundle = isVsoeBundle;
    }


    /**
     * Gets the itemId value for this ItemSearchBasic.
     * 
     * @return itemId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemSearchBasic.
     * 
     * @param itemId
     */
    public void setItemId(org.mule.module.netsuite.api.internal.SearchStringField itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the itemUrl value for this ItemSearchBasic.
     * 
     * @return itemUrl
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getItemUrl() {
        return itemUrl;
    }


    /**
     * Sets the itemUrl value for this ItemSearchBasic.
     * 
     * @param itemUrl
     */
    public void setItemUrl(org.mule.module.netsuite.api.internal.SearchStringField itemUrl) {
        this.itemUrl = itemUrl;
    }


    /**
     * Gets the lastModifiedDate value for this ItemSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ItemSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the lastPurchasePrice value for this ItemSearchBasic.
     * 
     * @return lastPurchasePrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLastPurchasePrice() {
        return lastPurchasePrice;
    }


    /**
     * Sets the lastPurchasePrice value for this ItemSearchBasic.
     * 
     * @param lastPurchasePrice
     */
    public void setLastPurchasePrice(org.mule.module.netsuite.api.internal.SearchDoubleField lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }


    /**
     * Gets the lastQuantityAvailableChange value for this ItemSearchBasic.
     * 
     * @return lastQuantityAvailableChange
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastQuantityAvailableChange() {
        return lastQuantityAvailableChange;
    }


    /**
     * Sets the lastQuantityAvailableChange value for this ItemSearchBasic.
     * 
     * @param lastQuantityAvailableChange
     */
    public void setLastQuantityAvailableChange(org.mule.module.netsuite.api.internal.SearchDateField lastQuantityAvailableChange) {
        this.lastQuantityAvailableChange = lastQuantityAvailableChange;
    }


    /**
     * Gets the leadTime value for this ItemSearchBasic.
     * 
     * @return leadTime
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getLeadTime() {
        return leadTime;
    }


    /**
     * Sets the leadTime value for this ItemSearchBasic.
     * 
     * @param leadTime
     */
    public void setLeadTime(org.mule.module.netsuite.api.internal.SearchLongField leadTime) {
        this.leadTime = leadTime;
    }


    /**
     * Gets the listingDuration value for this ItemSearchBasic.
     * 
     * @return listingDuration
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getListingDuration() {
        return listingDuration;
    }


    /**
     * Sets the listingDuration value for this ItemSearchBasic.
     * 
     * @param listingDuration
     */
    public void setListingDuration(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField listingDuration) {
        this.listingDuration = listingDuration;
    }


    /**
     * Gets the location value for this ItemSearchBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemSearchBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField location) {
        this.location = location;
    }


    /**
     * Gets the locationAverageCost value for this ItemSearchBasic.
     * 
     * @return locationAverageCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationAverageCost() {
        return locationAverageCost;
    }


    /**
     * Sets the locationAverageCost value for this ItemSearchBasic.
     * 
     * @param locationAverageCost
     */
    public void setLocationAverageCost(org.mule.module.netsuite.api.internal.SearchDoubleField locationAverageCost) {
        this.locationAverageCost = locationAverageCost;
    }


    /**
     * Gets the locationDefaultReturnCost value for this ItemSearchBasic.
     * 
     * @return locationDefaultReturnCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationDefaultReturnCost() {
        return locationDefaultReturnCost;
    }


    /**
     * Sets the locationDefaultReturnCost value for this ItemSearchBasic.
     * 
     * @param locationDefaultReturnCost
     */
    public void setLocationDefaultReturnCost(org.mule.module.netsuite.api.internal.SearchDoubleField locationDefaultReturnCost) {
        this.locationDefaultReturnCost = locationDefaultReturnCost;
    }


    /**
     * Gets the locationPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @return locationPreferredStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationPreferredStockLevel() {
        return locationPreferredStockLevel;
    }


    /**
     * Sets the locationPreferredStockLevel value for this ItemSearchBasic.
     * 
     * @param locationPreferredStockLevel
     */
    public void setLocationPreferredStockLevel(org.mule.module.netsuite.api.internal.SearchDoubleField locationPreferredStockLevel) {
        this.locationPreferredStockLevel = locationPreferredStockLevel;
    }


    /**
     * Gets the locationQuantityAvailable value for this ItemSearchBasic.
     * 
     * @return locationQuantityAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationQuantityAvailable() {
        return locationQuantityAvailable;
    }


    /**
     * Sets the locationQuantityAvailable value for this ItemSearchBasic.
     * 
     * @param locationQuantityAvailable
     */
    public void setLocationQuantityAvailable(org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityAvailable) {
        this.locationQuantityAvailable = locationQuantityAvailable;
    }


    /**
     * Gets the locationQuantityBackOrdered value for this ItemSearchBasic.
     * 
     * @return locationQuantityBackOrdered
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationQuantityBackOrdered() {
        return locationQuantityBackOrdered;
    }


    /**
     * Sets the locationQuantityBackOrdered value for this ItemSearchBasic.
     * 
     * @param locationQuantityBackOrdered
     */
    public void setLocationQuantityBackOrdered(org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityBackOrdered) {
        this.locationQuantityBackOrdered = locationQuantityBackOrdered;
    }


    /**
     * Gets the locationQuantityCommitted value for this ItemSearchBasic.
     * 
     * @return locationQuantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationQuantityCommitted() {
        return locationQuantityCommitted;
    }


    /**
     * Sets the locationQuantityCommitted value for this ItemSearchBasic.
     * 
     * @param locationQuantityCommitted
     */
    public void setLocationQuantityCommitted(org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityCommitted) {
        this.locationQuantityCommitted = locationQuantityCommitted;
    }


    /**
     * Gets the locationQuantityInTransit value for this ItemSearchBasic.
     * 
     * @return locationQuantityInTransit
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationQuantityInTransit() {
        return locationQuantityInTransit;
    }


    /**
     * Sets the locationQuantityInTransit value for this ItemSearchBasic.
     * 
     * @param locationQuantityInTransit
     */
    public void setLocationQuantityInTransit(org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityInTransit) {
        this.locationQuantityInTransit = locationQuantityInTransit;
    }


    /**
     * Gets the locationQuantityOnHand value for this ItemSearchBasic.
     * 
     * @return locationQuantityOnHand
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationQuantityOnHand() {
        return locationQuantityOnHand;
    }


    /**
     * Sets the locationQuantityOnHand value for this ItemSearchBasic.
     * 
     * @param locationQuantityOnHand
     */
    public void setLocationQuantityOnHand(org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityOnHand) {
        this.locationQuantityOnHand = locationQuantityOnHand;
    }


    /**
     * Gets the locationQuantityOnOrder value for this ItemSearchBasic.
     * 
     * @return locationQuantityOnOrder
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationQuantityOnOrder() {
        return locationQuantityOnOrder;
    }


    /**
     * Sets the locationQuantityOnOrder value for this ItemSearchBasic.
     * 
     * @param locationQuantityOnOrder
     */
    public void setLocationQuantityOnOrder(org.mule.module.netsuite.api.internal.SearchDoubleField locationQuantityOnOrder) {
        this.locationQuantityOnOrder = locationQuantityOnOrder;
    }


    /**
     * Gets the locationReorderPoint value for this ItemSearchBasic.
     * 
     * @return locationReorderPoint
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationReorderPoint() {
        return locationReorderPoint;
    }


    /**
     * Sets the locationReorderPoint value for this ItemSearchBasic.
     * 
     * @param locationReorderPoint
     */
    public void setLocationReorderPoint(org.mule.module.netsuite.api.internal.SearchDoubleField locationReorderPoint) {
        this.locationReorderPoint = locationReorderPoint;
    }


    /**
     * Gets the locationTotalValue value for this ItemSearchBasic.
     * 
     * @return locationTotalValue
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getLocationTotalValue() {
        return locationTotalValue;
    }


    /**
     * Sets the locationTotalValue value for this ItemSearchBasic.
     * 
     * @param locationTotalValue
     */
    public void setLocationTotalValue(org.mule.module.netsuite.api.internal.SearchDoubleField locationTotalValue) {
        this.locationTotalValue = locationTotalValue;
    }


    /**
     * Gets the manufacturer value for this ItemSearchBasic.
     * 
     * @return manufacturer
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ItemSearchBasic.
     * 
     * @param manufacturer
     */
    public void setManufacturer(org.mule.module.netsuite.api.internal.SearchStringField manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the manufactureraddr1 value for this ItemSearchBasic.
     * 
     * @return manufactureraddr1
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getManufactureraddr1() {
        return manufactureraddr1;
    }


    /**
     * Sets the manufactureraddr1 value for this ItemSearchBasic.
     * 
     * @param manufactureraddr1
     */
    public void setManufactureraddr1(org.mule.module.netsuite.api.internal.SearchStringField manufactureraddr1) {
        this.manufactureraddr1 = manufactureraddr1;
    }


    /**
     * Gets the manufacturerCity value for this ItemSearchBasic.
     * 
     * @return manufacturerCity
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getManufacturerCity() {
        return manufacturerCity;
    }


    /**
     * Sets the manufacturerCity value for this ItemSearchBasic.
     * 
     * @param manufacturerCity
     */
    public void setManufacturerCity(org.mule.module.netsuite.api.internal.SearchStringField manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }


    /**
     * Gets the manufacturerState value for this ItemSearchBasic.
     * 
     * @return manufacturerState
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getManufacturerState() {
        return manufacturerState;
    }


    /**
     * Sets the manufacturerState value for this ItemSearchBasic.
     * 
     * @param manufacturerState
     */
    public void setManufacturerState(org.mule.module.netsuite.api.internal.SearchStringField manufacturerState) {
        this.manufacturerState = manufacturerState;
    }


    /**
     * Gets the manufacturerTariff value for this ItemSearchBasic.
     * 
     * @return manufacturerTariff
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getManufacturerTariff() {
        return manufacturerTariff;
    }


    /**
     * Sets the manufacturerTariff value for this ItemSearchBasic.
     * 
     * @param manufacturerTariff
     */
    public void setManufacturerTariff(org.mule.module.netsuite.api.internal.SearchStringField manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }


    /**
     * Gets the manufacturerTaxId value for this ItemSearchBasic.
     * 
     * @return manufacturerTaxId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getManufacturerTaxId() {
        return manufacturerTaxId;
    }


    /**
     * Sets the manufacturerTaxId value for this ItemSearchBasic.
     * 
     * @param manufacturerTaxId
     */
    public void setManufacturerTaxId(org.mule.module.netsuite.api.internal.SearchStringField manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }


    /**
     * Gets the manufacturerZip value for this ItemSearchBasic.
     * 
     * @return manufacturerZip
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getManufacturerZip() {
        return manufacturerZip;
    }


    /**
     * Sets the manufacturerZip value for this ItemSearchBasic.
     * 
     * @param manufacturerZip
     */
    public void setManufacturerZip(org.mule.module.netsuite.api.internal.SearchStringField manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }


    /**
     * Gets the matchBillToReceipt value for this ItemSearchBasic.
     * 
     * @return matchBillToReceipt
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this ItemSearchBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(org.mule.module.netsuite.api.internal.SearchBooleanField matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }


    /**
     * Gets the matrix value for this ItemSearchBasic.
     * 
     * @return matrix
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMatrix() {
        return matrix;
    }


    /**
     * Sets the matrix value for this ItemSearchBasic.
     * 
     * @param matrix
     */
    public void setMatrix(org.mule.module.netsuite.api.internal.SearchBooleanField matrix) {
        this.matrix = matrix;
    }


    /**
     * Gets the matrixChild value for this ItemSearchBasic.
     * 
     * @return matrixChild
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMatrixChild() {
        return matrixChild;
    }


    /**
     * Sets the matrixChild value for this ItemSearchBasic.
     * 
     * @param matrixChild
     */
    public void setMatrixChild(org.mule.module.netsuite.api.internal.SearchBooleanField matrixChild) {
        this.matrixChild = matrixChild;
    }


    /**
     * Gets the metaTagHtml value for this ItemSearchBasic.
     * 
     * @return metaTagHtml
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this ItemSearchBasic.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(org.mule.module.netsuite.api.internal.SearchStringField metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the minimumQuantity value for this ItemSearchBasic.
     * 
     * @return minimumQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this ItemSearchBasic.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(org.mule.module.netsuite.api.internal.SearchLongField minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }


    /**
     * Gets the mpn value for this ItemSearchBasic.
     * 
     * @return mpn
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getMpn() {
        return mpn;
    }


    /**
     * Sets the mpn value for this ItemSearchBasic.
     * 
     * @param mpn
     */
    public void setMpn(org.mule.module.netsuite.api.internal.SearchStringField mpn) {
        this.mpn = mpn;
    }


    /**
     * Gets the multManufactureAddr value for this ItemSearchBasic.
     * 
     * @return multManufactureAddr
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getMultManufactureAddr() {
        return multManufactureAddr;
    }


    /**
     * Sets the multManufactureAddr value for this ItemSearchBasic.
     * 
     * @param multManufactureAddr
     */
    public void setMultManufactureAddr(org.mule.module.netsuite.api.internal.SearchBooleanField multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }


    /**
     * Gets the nexTagCategory value for this ItemSearchBasic.
     * 
     * @return nexTagCategory
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getNexTagCategory() {
        return nexTagCategory;
    }


    /**
     * Sets the nexTagCategory value for this ItemSearchBasic.
     * 
     * @param nexTagCategory
     */
    public void setNexTagCategory(org.mule.module.netsuite.api.internal.SearchStringField nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }


    /**
     * Gets the nexTagProductFeed value for this ItemSearchBasic.
     * 
     * @return nexTagProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getNexTagProductFeed() {
        return nexTagProductFeed;
    }


    /**
     * Sets the nexTagProductFeed value for this ItemSearchBasic.
     * 
     * @param nexTagProductFeed
     */
    public void setNexTagProductFeed(org.mule.module.netsuite.api.internal.SearchBooleanField nexTagProductFeed) {
        this.nexTagProductFeed = nexTagProductFeed;
    }


    /**
     * Gets the numActiveListings value for this ItemSearchBasic.
     * 
     * @return numActiveListings
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumActiveListings() {
        return numActiveListings;
    }


    /**
     * Sets the numActiveListings value for this ItemSearchBasic.
     * 
     * @param numActiveListings
     */
    public void setNumActiveListings(org.mule.module.netsuite.api.internal.SearchLongField numActiveListings) {
        this.numActiveListings = numActiveListings;
    }


    /**
     * Gets the numberAllowedDownloads value for this ItemSearchBasic.
     * 
     * @return numberAllowedDownloads
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getNumberAllowedDownloads() {
        return numberAllowedDownloads;
    }


    /**
     * Sets the numberAllowedDownloads value for this ItemSearchBasic.
     * 
     * @param numberAllowedDownloads
     */
    public void setNumberAllowedDownloads(org.mule.module.netsuite.api.internal.SearchDoubleField numberAllowedDownloads) {
        this.numberAllowedDownloads = numberAllowedDownloads;
    }


    /**
     * Gets the numCurrentlyListed value for this ItemSearchBasic.
     * 
     * @return numCurrentlyListed
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumCurrentlyListed() {
        return numCurrentlyListed;
    }


    /**
     * Sets the numCurrentlyListed value for this ItemSearchBasic.
     * 
     * @param numCurrentlyListed
     */
    public void setNumCurrentlyListed(org.mule.module.netsuite.api.internal.SearchLongField numCurrentlyListed) {
        this.numCurrentlyListed = numCurrentlyListed;
    }


    /**
     * Gets the offerSupport value for this ItemSearchBasic.
     * 
     * @return offerSupport
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this ItemSearchBasic.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(org.mule.module.netsuite.api.internal.SearchBooleanField offerSupport) {
        this.offerSupport = offerSupport;
    }


    /**
     * Gets the onlineCustomerPrice value for this ItemSearchBasic.
     * 
     * @return onlineCustomerPrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getOnlineCustomerPrice() {
        return onlineCustomerPrice;
    }


    /**
     * Sets the onlineCustomerPrice value for this ItemSearchBasic.
     * 
     * @param onlineCustomerPrice
     */
    public void setOnlineCustomerPrice(org.mule.module.netsuite.api.internal.SearchDoubleField onlineCustomerPrice) {
        this.onlineCustomerPrice = onlineCustomerPrice;
    }


    /**
     * Gets the onSpecial value for this ItemSearchBasic.
     * 
     * @return onSpecial
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this ItemSearchBasic.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(org.mule.module.netsuite.api.internal.SearchBooleanField onSpecial) {
        this.onSpecial = onSpecial;
    }


    /**
     * Gets the outOfStockBehavior value for this ItemSearchBasic.
     * 
     * @return outOfStockBehavior
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this ItemSearchBasic.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(org.mule.module.netsuite.api.internal.SearchMultiSelectField outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }


    /**
     * Gets the overallQuantityPricingType value for this ItemSearchBasic.
     * 
     * @return overallQuantityPricingType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this ItemSearchBasic.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }


    /**
     * Gets the pageTitle value for this ItemSearchBasic.
     * 
     * @return pageTitle
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this ItemSearchBasic.
     * 
     * @param pageTitle
     */
    public void setPageTitle(org.mule.module.netsuite.api.internal.SearchStringField pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the parent value for this ItemSearchBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ItemSearchBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchMultiSelectField parent) {
        this.parent = parent;
    }


    /**
     * Gets the preferenceCriterion value for this ItemSearchBasic.
     * 
     * @return preferenceCriterion
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getPreferenceCriterion() {
        return preferenceCriterion;
    }


    /**
     * Sets the preferenceCriterion value for this ItemSearchBasic.
     * 
     * @param preferenceCriterion
     */
    public void setPreferenceCriterion(org.mule.module.netsuite.api.internal.SearchStringField preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }


    /**
     * Gets the preferredBin value for this ItemSearchBasic.
     * 
     * @return preferredBin
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getPreferredBin() {
        return preferredBin;
    }


    /**
     * Sets the preferredBin value for this ItemSearchBasic.
     * 
     * @param preferredBin
     */
    public void setPreferredBin(org.mule.module.netsuite.api.internal.SearchBooleanField preferredBin) {
        this.preferredBin = preferredBin;
    }


    /**
     * Gets the preferredLocation value for this ItemSearchBasic.
     * 
     * @return preferredLocation
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPreferredLocation() {
        return preferredLocation;
    }


    /**
     * Sets the preferredLocation value for this ItemSearchBasic.
     * 
     * @param preferredLocation
     */
    public void setPreferredLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField preferredLocation) {
        this.preferredLocation = preferredLocation;
    }


    /**
     * Gets the preferredStockLevel value for this ItemSearchBasic.
     * 
     * @return preferredStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getPreferredStockLevel() {
        return preferredStockLevel;
    }


    /**
     * Sets the preferredStockLevel value for this ItemSearchBasic.
     * 
     * @param preferredStockLevel
     */
    public void setPreferredStockLevel(org.mule.module.netsuite.api.internal.SearchDoubleField preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }


    /**
     * Gets the preferredStockLevelDays value for this ItemSearchBasic.
     * 
     * @return preferredStockLevelDays
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }


    /**
     * Sets the preferredStockLevelDays value for this ItemSearchBasic.
     * 
     * @param preferredStockLevelDays
     */
    public void setPreferredStockLevelDays(org.mule.module.netsuite.api.internal.SearchLongField preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }


    /**
     * Gets the price value for this ItemSearchBasic.
     * 
     * @return price
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ItemSearchBasic.
     * 
     * @param price
     */
    public void setPrice(org.mule.module.netsuite.api.internal.SearchDoubleField price) {
        this.price = price;
    }


    /**
     * Gets the pricingGroup value for this ItemSearchBasic.
     * 
     * @return pricingGroup
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this ItemSearchBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(org.mule.module.netsuite.api.internal.SearchMultiSelectField pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the primaryCategory value for this ItemSearchBasic.
     * 
     * @return primaryCategory
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getPrimaryCategory() {
        return primaryCategory;
    }


    /**
     * Sets the primaryCategory value for this ItemSearchBasic.
     * 
     * @param primaryCategory
     */
    public void setPrimaryCategory(org.mule.module.netsuite.api.internal.SearchLongField primaryCategory) {
        this.primaryCategory = primaryCategory;
    }


    /**
     * Gets the purchaseUnit value for this ItemSearchBasic.
     * 
     * @return purchaseUnit
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this ItemSearchBasic.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(org.mule.module.netsuite.api.internal.SearchMultiSelectField purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }


    /**
     * Gets the quantityAvailable value for this ItemSearchBasic.
     * 
     * @return quantityAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this ItemSearchBasic.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(org.mule.module.netsuite.api.internal.SearchDoubleField quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityBackOrdered value for this ItemSearchBasic.
     * 
     * @return quantityBackOrdered
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this ItemSearchBasic.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(org.mule.module.netsuite.api.internal.SearchDoubleField quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the quantityCommitted value for this ItemSearchBasic.
     * 
     * @return quantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this ItemSearchBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(org.mule.module.netsuite.api.internal.SearchDoubleField quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityOnHand value for this ItemSearchBasic.
     * 
     * @return quantityOnHand
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this ItemSearchBasic.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(org.mule.module.netsuite.api.internal.SearchDoubleField quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the quantityOnOrder value for this ItemSearchBasic.
     * 
     * @return quantityOnOrder
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getQuantityOnOrder() {
        return quantityOnOrder;
    }


    /**
     * Sets the quantityOnOrder value for this ItemSearchBasic.
     * 
     * @param quantityOnOrder
     */
    public void setQuantityOnOrder(org.mule.module.netsuite.api.internal.SearchDoubleField quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }


    /**
     * Gets the quantityPricingSchedule value for this ItemSearchBasic.
     * 
     * @return quantityPricingSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this ItemSearchBasic.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(org.mule.module.netsuite.api.internal.SearchMultiSelectField quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }


    /**
     * Gets the reorderMultiple value for this ItemSearchBasic.
     * 
     * @return reorderMultiple
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getReorderMultiple() {
        return reorderMultiple;
    }


    /**
     * Sets the reorderMultiple value for this ItemSearchBasic.
     * 
     * @param reorderMultiple
     */
    public void setReorderMultiple(org.mule.module.netsuite.api.internal.SearchLongField reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }


    /**
     * Gets the reorderPoint value for this ItemSearchBasic.
     * 
     * @return reorderPoint
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getReorderPoint() {
        return reorderPoint;
    }


    /**
     * Sets the reorderPoint value for this ItemSearchBasic.
     * 
     * @param reorderPoint
     */
    public void setReorderPoint(org.mule.module.netsuite.api.internal.SearchDoubleField reorderPoint) {
        this.reorderPoint = reorderPoint;
    }


    /**
     * Gets the reservePrice value for this ItemSearchBasic.
     * 
     * @return reservePrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getReservePrice() {
        return reservePrice;
    }


    /**
     * Sets the reservePrice value for this ItemSearchBasic.
     * 
     * @param reservePrice
     */
    public void setReservePrice(org.mule.module.netsuite.api.internal.SearchDoubleField reservePrice) {
        this.reservePrice = reservePrice;
    }


    /**
     * Gets the revRecSchedule value for this ItemSearchBasic.
     * 
     * @return revRecSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ItemSearchBasic.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(org.mule.module.netsuite.api.internal.SearchMultiSelectField revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the safetyStockLevel value for this ItemSearchBasic.
     * 
     * @return safetyStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getSafetyStockLevel() {
        return safetyStockLevel;
    }


    /**
     * Sets the safetyStockLevel value for this ItemSearchBasic.
     * 
     * @param safetyStockLevel
     */
    public void setSafetyStockLevel(org.mule.module.netsuite.api.internal.SearchDoubleField safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }


    /**
     * Gets the safetyStockLevelDays value for this ItemSearchBasic.
     * 
     * @return safetyStockLevelDays
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }


    /**
     * Sets the safetyStockLevelDays value for this ItemSearchBasic.
     * 
     * @param safetyStockLevelDays
     */
    public void setSafetyStockLevelDays(org.mule.module.netsuite.api.internal.SearchLongField safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }


    /**
     * Gets the salesDescription value for this ItemSearchBasic.
     * 
     * @return salesDescription
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this ItemSearchBasic.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(org.mule.module.netsuite.api.internal.SearchStringField salesDescription) {
        this.salesDescription = salesDescription;
    }


    /**
     * Gets the saleUnit value for this ItemSearchBasic.
     * 
     * @return saleUnit
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this ItemSearchBasic.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(org.mule.module.netsuite.api.internal.SearchMultiSelectField saleUnit) {
        this.saleUnit = saleUnit;
    }


    /**
     * Gets the scheduleBCode value for this ItemSearchBasic.
     * 
     * @return scheduleBCode
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getScheduleBCode() {
        return scheduleBCode;
    }


    /**
     * Sets the scheduleBCode value for this ItemSearchBasic.
     * 
     * @param scheduleBCode
     */
    public void setScheduleBCode(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }


    /**
     * Gets the scheduleBNumber value for this ItemSearchBasic.
     * 
     * @return scheduleBNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getScheduleBNumber() {
        return scheduleBNumber;
    }


    /**
     * Sets the scheduleBNumber value for this ItemSearchBasic.
     * 
     * @param scheduleBNumber
     */
    public void setScheduleBNumber(org.mule.module.netsuite.api.internal.SearchStringField scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }


    /**
     * Gets the scheduleBQuantity value for this ItemSearchBasic.
     * 
     * @return scheduleBQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getScheduleBQuantity() {
        return scheduleBQuantity;
    }


    /**
     * Sets the scheduleBQuantity value for this ItemSearchBasic.
     * 
     * @param scheduleBQuantity
     */
    public void setScheduleBQuantity(org.mule.module.netsuite.api.internal.SearchStringField scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }


    /**
     * Gets the searchKeywords value for this ItemSearchBasic.
     * 
     * @return searchKeywords
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this ItemSearchBasic.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(org.mule.module.netsuite.api.internal.SearchStringField searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the seasonalDemand value for this ItemSearchBasic.
     * 
     * @return seasonalDemand
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getSeasonalDemand() {
        return seasonalDemand;
    }


    /**
     * Sets the seasonalDemand value for this ItemSearchBasic.
     * 
     * @param seasonalDemand
     */
    public void setSeasonalDemand(org.mule.module.netsuite.api.internal.SearchBooleanField seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }


    /**
     * Gets the sellOnebay value for this ItemSearchBasic.
     * 
     * @return sellOnebay
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getSellOnebay() {
        return sellOnebay;
    }


    /**
     * Sets the sellOnebay value for this ItemSearchBasic.
     * 
     * @param sellOnebay
     */
    public void setSellOnebay(org.mule.module.netsuite.api.internal.SearchBooleanField sellOnebay) {
        this.sellOnebay = sellOnebay;
    }


    /**
     * Gets the serialNumber value for this ItemSearchBasic.
     * 
     * @return serialNumber
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ItemSearchBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(org.mule.module.netsuite.api.internal.SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the serialNumberLocation value for this ItemSearchBasic.
     * 
     * @return serialNumberLocation
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSerialNumberLocation() {
        return serialNumberLocation;
    }


    /**
     * Sets the serialNumberLocation value for this ItemSearchBasic.
     * 
     * @param serialNumberLocation
     */
    public void setSerialNumberLocation(org.mule.module.netsuite.api.internal.SearchMultiSelectField serialNumberLocation) {
        this.serialNumberLocation = serialNumberLocation;
    }


    /**
     * Gets the shipIndividually value for this ItemSearchBasic.
     * 
     * @return shipIndividually
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShipIndividually() {
        return shipIndividually;
    }


    /**
     * Sets the shipIndividually value for this ItemSearchBasic.
     * 
     * @param shipIndividually
     */
    public void setShipIndividually(org.mule.module.netsuite.api.internal.SearchBooleanField shipIndividually) {
        this.shipIndividually = shipIndividually;
    }


    /**
     * Gets the shipPackage value for this ItemSearchBasic.
     * 
     * @return shipPackage
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getShipPackage() {
        return shipPackage;
    }


    /**
     * Sets the shipPackage value for this ItemSearchBasic.
     * 
     * @param shipPackage
     */
    public void setShipPackage(org.mule.module.netsuite.api.internal.SearchMultiSelectField shipPackage) {
        this.shipPackage = shipPackage;
    }


    /**
     * Gets the shippingRate value for this ItemSearchBasic.
     * 
     * @return shippingRate
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getShippingRate() {
        return shippingRate;
    }


    /**
     * Sets the shippingRate value for this ItemSearchBasic.
     * 
     * @param shippingRate
     */
    public void setShippingRate(org.mule.module.netsuite.api.internal.SearchDoubleField shippingRate) {
        this.shippingRate = shippingRate;
    }


    /**
     * Gets the shoppingDotComCategory value for this ItemSearchBasic.
     * 
     * @return shoppingDotComCategory
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }


    /**
     * Sets the shoppingDotComCategory value for this ItemSearchBasic.
     * 
     * @param shoppingDotComCategory
     */
    public void setShoppingDotComCategory(org.mule.module.netsuite.api.internal.SearchStringField shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }


    /**
     * Gets the shoppingProductFeed value for this ItemSearchBasic.
     * 
     * @return shoppingProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShoppingProductFeed() {
        return shoppingProductFeed;
    }


    /**
     * Sets the shoppingProductFeed value for this ItemSearchBasic.
     * 
     * @param shoppingProductFeed
     */
    public void setShoppingProductFeed(org.mule.module.netsuite.api.internal.SearchBooleanField shoppingProductFeed) {
        this.shoppingProductFeed = shoppingProductFeed;
    }


    /**
     * Gets the shopzillaCategoryId value for this ItemSearchBasic.
     * 
     * @return shopzillaCategoryId
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }


    /**
     * Sets the shopzillaCategoryId value for this ItemSearchBasic.
     * 
     * @param shopzillaCategoryId
     */
    public void setShopzillaCategoryId(org.mule.module.netsuite.api.internal.SearchLongField shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }


    /**
     * Gets the shopzillaProductFeed value for this ItemSearchBasic.
     * 
     * @return shopzillaProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getShopzillaProductFeed() {
        return shopzillaProductFeed;
    }


    /**
     * Sets the shopzillaProductFeed value for this ItemSearchBasic.
     * 
     * @param shopzillaProductFeed
     */
    public void setShopzillaProductFeed(org.mule.module.netsuite.api.internal.SearchBooleanField shopzillaProductFeed) {
        this.shopzillaProductFeed = shopzillaProductFeed;
    }


    /**
     * Gets the sitemapPriority value for this ItemSearchBasic.
     * 
     * @return sitemapPriority
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this ItemSearchBasic.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the softDescriptor value for this ItemSearchBasic.
     * 
     * @return softDescriptor
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this ItemSearchBasic.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(org.mule.module.netsuite.api.internal.SearchMultiSelectField softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the startingPrice value for this ItemSearchBasic.
     * 
     * @return startingPrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getStartingPrice() {
        return startingPrice;
    }


    /**
     * Sets the startingPrice value for this ItemSearchBasic.
     * 
     * @param startingPrice
     */
    public void setStartingPrice(org.mule.module.netsuite.api.internal.SearchDoubleField startingPrice) {
        this.startingPrice = startingPrice;
    }


    /**
     * Gets the stockDescription value for this ItemSearchBasic.
     * 
     * @return stockDescription
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getStockDescription() {
        return stockDescription;
    }


    /**
     * Sets the stockDescription value for this ItemSearchBasic.
     * 
     * @param stockDescription
     */
    public void setStockDescription(org.mule.module.netsuite.api.internal.SearchStringField stockDescription) {
        this.stockDescription = stockDescription;
    }


    /**
     * Gets the stockUnit value for this ItemSearchBasic.
     * 
     * @return stockUnit
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getStockUnit() {
        return stockUnit;
    }


    /**
     * Sets the stockUnit value for this ItemSearchBasic.
     * 
     * @param stockUnit
     */
    public void setStockUnit(org.mule.module.netsuite.api.internal.SearchMultiSelectField stockUnit) {
        this.stockUnit = stockUnit;
    }


    /**
     * Gets the storeDescription value for this ItemSearchBasic.
     * 
     * @return storeDescription
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this ItemSearchBasic.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(org.mule.module.netsuite.api.internal.SearchStringField storeDescription) {
        this.storeDescription = storeDescription;
    }


    /**
     * Gets the subsidiary value for this ItemSearchBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemSearchBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }


    /**
     * Gets the subType value for this ItemSearchBasic.
     * 
     * @return subType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this ItemSearchBasic.
     * 
     * @param subType
     */
    public void setSubType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField subType) {
        this.subType = subType;
    }


    /**
     * Gets the taxCode value for this ItemSearchBasic.
     * 
     * @return taxCode
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTaxCode() {
        return taxCode;
    }


    /**
     * Sets the taxCode value for this ItemSearchBasic.
     * 
     * @param taxCode
     */
    public void setTaxCode(org.mule.module.netsuite.api.internal.SearchMultiSelectField taxCode) {
        this.taxCode = taxCode;
    }


    /**
     * Gets the taxSchedule value for this ItemSearchBasic.
     * 
     * @return taxSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this ItemSearchBasic.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(org.mule.module.netsuite.api.internal.SearchMultiSelectField taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the thumbnailUrl value for this ItemSearchBasic.
     * 
     * @return thumbnailUrl
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getThumbnailUrl() {
        return thumbnailUrl;
    }


    /**
     * Sets the thumbnailUrl value for this ItemSearchBasic.
     * 
     * @param thumbnailUrl
     */
    public void setThumbnailUrl(org.mule.module.netsuite.api.internal.SearchStringField thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }


    /**
     * Gets the totalValue value for this ItemSearchBasic.
     * 
     * @return totalValue
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTotalValue() {
        return totalValue;
    }


    /**
     * Sets the totalValue value for this ItemSearchBasic.
     * 
     * @param totalValue
     */
    public void setTotalValue(org.mule.module.netsuite.api.internal.SearchDoubleField totalValue) {
        this.totalValue = totalValue;
    }


    /**
     * Gets the trackLandedCost value for this ItemSearchBasic.
     * 
     * @return trackLandedCost
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getTrackLandedCost() {
        return trackLandedCost;
    }


    /**
     * Sets the trackLandedCost value for this ItemSearchBasic.
     * 
     * @param trackLandedCost
     */
    public void setTrackLandedCost(org.mule.module.netsuite.api.internal.SearchBooleanField trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }


    /**
     * Gets the transferPrice value for this ItemSearchBasic.
     * 
     * @return transferPrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getTransferPrice() {
        return transferPrice;
    }


    /**
     * Sets the transferPrice value for this ItemSearchBasic.
     * 
     * @param transferPrice
     */
    public void setTransferPrice(org.mule.module.netsuite.api.internal.SearchDoubleField transferPrice) {
        this.transferPrice = transferPrice;
    }


    /**
     * Gets the type value for this ItemSearchBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getType() {
        return type;
    }


    /**
     * Sets the type value for this ItemSearchBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField type) {
        this.type = type;
    }


    /**
     * Gets the unitsType value for this ItemSearchBasic.
     * 
     * @return unitsType
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this ItemSearchBasic.
     * 
     * @param unitsType
     */
    public void setUnitsType(org.mule.module.netsuite.api.internal.SearchMultiSelectField unitsType) {
        this.unitsType = unitsType;
    }


    /**
     * Gets the upcCode value for this ItemSearchBasic.
     * 
     * @return upcCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this ItemSearchBasic.
     * 
     * @param upcCode
     */
    public void setUpcCode(org.mule.module.netsuite.api.internal.SearchStringField upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the urlComponent value for this ItemSearchBasic.
     * 
     * @return urlComponent
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this ItemSearchBasic.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(org.mule.module.netsuite.api.internal.SearchStringField urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the useBins value for this ItemSearchBasic.
     * 
     * @return useBins
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getUseBins() {
        return useBins;
    }


    /**
     * Sets the useBins value for this ItemSearchBasic.
     * 
     * @param useBins
     */
    public void setUseBins(org.mule.module.netsuite.api.internal.SearchBooleanField useBins) {
        this.useBins = useBins;
    }


    /**
     * Gets the useMarginalRates value for this ItemSearchBasic.
     * 
     * @return useMarginalRates
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this ItemSearchBasic.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(org.mule.module.netsuite.api.internal.SearchBooleanField useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }


    /**
     * Gets the vendor value for this ItemSearchBasic.
     * 
     * @return vendor
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ItemSearchBasic.
     * 
     * @param vendor
     */
    public void setVendor(org.mule.module.netsuite.api.internal.SearchMultiSelectField vendor) {
        this.vendor = vendor;
    }


    /**
     * Gets the vendorCode value for this ItemSearchBasic.
     * 
     * @return vendorCode
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getVendorCode() {
        return vendorCode;
    }


    /**
     * Sets the vendorCode value for this ItemSearchBasic.
     * 
     * @param vendorCode
     */
    public void setVendorCode(org.mule.module.netsuite.api.internal.SearchStringField vendorCode) {
        this.vendorCode = vendorCode;
    }


    /**
     * Gets the vendorCost value for this ItemSearchBasic.
     * 
     * @return vendorCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getVendorCost() {
        return vendorCost;
    }


    /**
     * Sets the vendorCost value for this ItemSearchBasic.
     * 
     * @param vendorCost
     */
    public void setVendorCost(org.mule.module.netsuite.api.internal.SearchDoubleField vendorCost) {
        this.vendorCost = vendorCost;
    }


    /**
     * Gets the vendorName value for this ItemSearchBasic.
     * 
     * @return vendorName
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this ItemSearchBasic.
     * 
     * @param vendorName
     */
    public void setVendorName(org.mule.module.netsuite.api.internal.SearchStringField vendorName) {
        this.vendorName = vendorName;
    }


    /**
     * Gets the vsoeDeferral value for this ItemSearchBasic.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this ItemSearchBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoeDelivered value for this ItemSearchBasic.
     * 
     * @return vsoeDelivered
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this ItemSearchBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(org.mule.module.netsuite.api.internal.SearchBooleanField vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the vsoePermitDiscount value for this ItemSearchBasic.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this ItemSearchBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoePrice value for this ItemSearchBasic.
     * 
     * @return vsoePrice
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this ItemSearchBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(org.mule.module.netsuite.api.internal.SearchDoubleField vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the webSite value for this ItemSearchBasic.
     * 
     * @return webSite
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this ItemSearchBasic.
     * 
     * @param webSite
     */
    public void setWebSite(org.mule.module.netsuite.api.internal.SearchMultiSelectField webSite) {
        this.webSite = webSite;
    }


    /**
     * Gets the weight value for this ItemSearchBasic.
     * 
     * @return weight
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ItemSearchBasic.
     * 
     * @param weight
     */
    public void setWeight(org.mule.module.netsuite.api.internal.SearchDoubleField weight) {
        this.weight = weight;
    }


    /**
     * Gets the yahooProductFeed value for this ItemSearchBasic.
     * 
     * @return yahooProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getYahooProductFeed() {
        return yahooProductFeed;
    }


    /**
     * Sets the yahooProductFeed value for this ItemSearchBasic.
     * 
     * @param yahooProductFeed
     */
    public void setYahooProductFeed(org.mule.module.netsuite.api.internal.SearchBooleanField yahooProductFeed) {
        this.yahooProductFeed = yahooProductFeed;
    }


    /**
     * Gets the customFieldList value for this ItemSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSearchBasic)) return false;
        ItemSearchBasic other = (ItemSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.account==null && other.getAccount()==null) || 
             (this.account!=null &&
              this.account.equals(other.getAccount()))) &&
            ((this.autoLeadTime==null && other.getAutoLeadTime()==null) || 
             (this.autoLeadTime!=null &&
              this.autoLeadTime.equals(other.getAutoLeadTime()))) &&
            ((this.autoPreferredStockLevel==null && other.getAutoPreferredStockLevel()==null) || 
             (this.autoPreferredStockLevel!=null &&
              this.autoPreferredStockLevel.equals(other.getAutoPreferredStockLevel()))) &&
            ((this.autoReorderPoint==null && other.getAutoReorderPoint()==null) || 
             (this.autoReorderPoint!=null &&
              this.autoReorderPoint.equals(other.getAutoReorderPoint()))) &&
            ((this.availableToPartners==null && other.getAvailableToPartners()==null) || 
             (this.availableToPartners!=null &&
              this.availableToPartners.equals(other.getAvailableToPartners()))) &&
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              this.averageCost.equals(other.getAverageCost()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.binOnHandAvail==null && other.getBinOnHandAvail()==null) || 
             (this.binOnHandAvail!=null &&
              this.binOnHandAvail.equals(other.getBinOnHandAvail()))) &&
            ((this.binOnHandCount==null && other.getBinOnHandCount()==null) || 
             (this.binOnHandCount!=null &&
              this.binOnHandCount.equals(other.getBinOnHandCount()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              this.buildEntireAssembly.equals(other.getBuildEntireAssembly()))) &&
            ((this.buyItNowPrice==null && other.getBuyItNowPrice()==null) || 
             (this.buyItNowPrice!=null &&
              this.buyItNowPrice.equals(other.getBuyItNowPrice()))) &&
            ((this.caption==null && other.getCaption()==null) || 
             (this.caption!=null &&
              this.caption.equals(other.getCaption()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.component==null && other.getComponent()==null) || 
             (this.component!=null &&
              this.component.equals(other.getComponent()))) &&
            ((this.componentOf==null && other.getComponentOf()==null) || 
             (this.componentOf!=null &&
              this.componentOf.equals(other.getComponentOf()))) &&
            ((this.copyDescription==null && other.getCopyDescription()==null) || 
             (this.copyDescription!=null &&
              this.copyDescription.equals(other.getCopyDescription()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costingMethod==null && other.getCostingMethod()==null) || 
             (this.costingMethod!=null &&
              this.costingMethod.equals(other.getCostingMethod()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              this.countryOfManufacture.equals(other.getCountryOfManufacture()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.createJob==null && other.getCreateJob()==null) || 
             (this.createJob!=null &&
              this.createJob.equals(other.getCreateJob()))) &&
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              this.dateViewed.equals(other.getDateViewed()))) &&
            ((this.daysBeforeExpiration==null && other.getDaysBeforeExpiration()==null) || 
             (this.daysBeforeExpiration!=null &&
              this.daysBeforeExpiration.equals(other.getDaysBeforeExpiration()))) &&
            ((this.defaultReturnCost==null && other.getDefaultReturnCost()==null) || 
             (this.defaultReturnCost!=null &&
              this.defaultReturnCost.equals(other.getDefaultReturnCost()))) &&
            ((this.demandModifier==null && other.getDemandModifier()==null) || 
             (this.demandModifier!=null &&
              this.demandModifier.equals(other.getDemandModifier()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.displayIneBayStore==null && other.getDisplayIneBayStore()==null) || 
             (this.displayIneBayStore!=null &&
              this.displayIneBayStore.equals(other.getDisplayIneBayStore()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.dontShowPrice==null && other.getDontShowPrice()==null) || 
             (this.dontShowPrice!=null &&
              this.dontShowPrice.equals(other.getDontShowPrice()))) &&
            ((this.eBayItemDescription==null && other.getEBayItemDescription()==null) || 
             (this.eBayItemDescription!=null &&
              this.eBayItemDescription.equals(other.getEBayItemDescription()))) &&
            ((this.eBayItemSubtitle==null && other.getEBayItemSubtitle()==null) || 
             (this.eBayItemSubtitle!=null &&
              this.eBayItemSubtitle.equals(other.getEBayItemSubtitle()))) &&
            ((this.eBayItemTitle==null && other.getEBayItemTitle()==null) || 
             (this.eBayItemTitle!=null &&
              this.eBayItemTitle.equals(other.getEBayItemTitle()))) &&
            ((this.ebayRelistingOption==null && other.getEbayRelistingOption()==null) || 
             (this.ebayRelistingOption!=null &&
              this.ebayRelistingOption.equals(other.getEbayRelistingOption()))) &&
            ((this.endAuctionsWhenOutOfStock==null && other.getEndAuctionsWhenOutOfStock()==null) || 
             (this.endAuctionsWhenOutOfStock!=null &&
              this.endAuctionsWhenOutOfStock.equals(other.getEndAuctionsWhenOutOfStock()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              this.excludeFromSitemap.equals(other.getExcludeFromSitemap()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId()))) &&
            ((this.externalIdString==null && other.getExternalIdString()==null) || 
             (this.externalIdString!=null &&
              this.externalIdString.equals(other.getExternalIdString()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
            ((this.feedDescription==null && other.getFeedDescription()==null) || 
             (this.feedDescription!=null &&
              this.feedDescription.equals(other.getFeedDescription()))) &&
            ((this.feedName==null && other.getFeedName()==null) || 
             (this.feedName!=null &&
              this.feedName.equals(other.getFeedName()))) &&
            ((this.froogleProductFeed==null && other.getFroogleProductFeed()==null) || 
             (this.froogleProductFeed!=null &&
              this.froogleProductFeed.equals(other.getFroogleProductFeed()))) &&
            ((this.fxCost==null && other.getFxCost()==null) || 
             (this.fxCost!=null &&
              this.fxCost.equals(other.getFxCost()))) &&
            ((this.giftCertAuthCode==null && other.getGiftCertAuthCode()==null) || 
             (this.giftCertAuthCode!=null &&
              this.giftCertAuthCode.equals(other.getGiftCertAuthCode()))) &&
            ((this.giftCertEmail==null && other.getGiftCertEmail()==null) || 
             (this.giftCertEmail!=null &&
              this.giftCertEmail.equals(other.getGiftCertEmail()))) &&
            ((this.giftCertExpDate==null && other.getGiftCertExpDate()==null) || 
             (this.giftCertExpDate!=null &&
              this.giftCertExpDate.equals(other.getGiftCertExpDate()))) &&
            ((this.giftCertFrom==null && other.getGiftCertFrom()==null) || 
             (this.giftCertFrom!=null &&
              this.giftCertFrom.equals(other.getGiftCertFrom()))) &&
            ((this.giftCertMsg==null && other.getGiftCertMsg()==null) || 
             (this.giftCertMsg!=null &&
              this.giftCertMsg.equals(other.getGiftCertMsg()))) &&
            ((this.giftCertOrigAmt==null && other.getGiftCertOrigAmt()==null) || 
             (this.giftCertOrigAmt!=null &&
              this.giftCertOrigAmt.equals(other.getGiftCertOrigAmt()))) &&
            ((this.giftCertRecipient==null && other.getGiftCertRecipient()==null) || 
             (this.giftCertRecipient!=null &&
              this.giftCertRecipient.equals(other.getGiftCertRecipient()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              this.imageUrl.equals(other.getImageUrl()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.inventoryLocation==null && other.getInventoryLocation()==null) || 
             (this.inventoryLocation!=null &&
              this.inventoryLocation.equals(other.getInventoryLocation()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              this.isAvailable.equals(other.getIsAvailable()))) &&
            ((this.isDropShipItem==null && other.getIsDropShipItem()==null) || 
             (this.isDropShipItem!=null &&
              this.isDropShipItem.equals(other.getIsDropShipItem()))) &&
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              this.isFulfillable.equals(other.getIsFulfillable()))) &&
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              this.isGcoCompliant.equals(other.getIsGcoCompliant()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isPreferredVendor==null && other.getIsPreferredVendor()==null) || 
             (this.isPreferredVendor!=null &&
              this.isPreferredVendor.equals(other.getIsPreferredVendor()))) &&
            ((this.isSpecialOrderItem==null && other.getIsSpecialOrderItem()==null) || 
             (this.isSpecialOrderItem!=null &&
              this.isSpecialOrderItem.equals(other.getIsSpecialOrderItem()))) &&
            ((this.isSpecialWorkOrderItem==null && other.getIsSpecialWorkOrderItem()==null) || 
             (this.isSpecialWorkOrderItem!=null &&
              this.isSpecialWorkOrderItem.equals(other.getIsSpecialWorkOrderItem()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.isVsoeBundle==null && other.getIsVsoeBundle()==null) || 
             (this.isVsoeBundle!=null &&
              this.isVsoeBundle.equals(other.getIsVsoeBundle()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.itemUrl==null && other.getItemUrl()==null) || 
             (this.itemUrl!=null &&
              this.itemUrl.equals(other.getItemUrl()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.lastPurchasePrice==null && other.getLastPurchasePrice()==null) || 
             (this.lastPurchasePrice!=null &&
              this.lastPurchasePrice.equals(other.getLastPurchasePrice()))) &&
            ((this.lastQuantityAvailableChange==null && other.getLastQuantityAvailableChange()==null) || 
             (this.lastQuantityAvailableChange!=null &&
              this.lastQuantityAvailableChange.equals(other.getLastQuantityAvailableChange()))) &&
            ((this.leadTime==null && other.getLeadTime()==null) || 
             (this.leadTime!=null &&
              this.leadTime.equals(other.getLeadTime()))) &&
            ((this.listingDuration==null && other.getListingDuration()==null) || 
             (this.listingDuration!=null &&
              this.listingDuration.equals(other.getListingDuration()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.locationAverageCost==null && other.getLocationAverageCost()==null) || 
             (this.locationAverageCost!=null &&
              this.locationAverageCost.equals(other.getLocationAverageCost()))) &&
            ((this.locationDefaultReturnCost==null && other.getLocationDefaultReturnCost()==null) || 
             (this.locationDefaultReturnCost!=null &&
              this.locationDefaultReturnCost.equals(other.getLocationDefaultReturnCost()))) &&
            ((this.locationPreferredStockLevel==null && other.getLocationPreferredStockLevel()==null) || 
             (this.locationPreferredStockLevel!=null &&
              this.locationPreferredStockLevel.equals(other.getLocationPreferredStockLevel()))) &&
            ((this.locationQuantityAvailable==null && other.getLocationQuantityAvailable()==null) || 
             (this.locationQuantityAvailable!=null &&
              this.locationQuantityAvailable.equals(other.getLocationQuantityAvailable()))) &&
            ((this.locationQuantityBackOrdered==null && other.getLocationQuantityBackOrdered()==null) || 
             (this.locationQuantityBackOrdered!=null &&
              this.locationQuantityBackOrdered.equals(other.getLocationQuantityBackOrdered()))) &&
            ((this.locationQuantityCommitted==null && other.getLocationQuantityCommitted()==null) || 
             (this.locationQuantityCommitted!=null &&
              this.locationQuantityCommitted.equals(other.getLocationQuantityCommitted()))) &&
            ((this.locationQuantityInTransit==null && other.getLocationQuantityInTransit()==null) || 
             (this.locationQuantityInTransit!=null &&
              this.locationQuantityInTransit.equals(other.getLocationQuantityInTransit()))) &&
            ((this.locationQuantityOnHand==null && other.getLocationQuantityOnHand()==null) || 
             (this.locationQuantityOnHand!=null &&
              this.locationQuantityOnHand.equals(other.getLocationQuantityOnHand()))) &&
            ((this.locationQuantityOnOrder==null && other.getLocationQuantityOnOrder()==null) || 
             (this.locationQuantityOnOrder!=null &&
              this.locationQuantityOnOrder.equals(other.getLocationQuantityOnOrder()))) &&
            ((this.locationReorderPoint==null && other.getLocationReorderPoint()==null) || 
             (this.locationReorderPoint!=null &&
              this.locationReorderPoint.equals(other.getLocationReorderPoint()))) &&
            ((this.locationTotalValue==null && other.getLocationTotalValue()==null) || 
             (this.locationTotalValue!=null &&
              this.locationTotalValue.equals(other.getLocationTotalValue()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.manufactureraddr1==null && other.getManufactureraddr1()==null) || 
             (this.manufactureraddr1!=null &&
              this.manufactureraddr1.equals(other.getManufactureraddr1()))) &&
            ((this.manufacturerCity==null && other.getManufacturerCity()==null) || 
             (this.manufacturerCity!=null &&
              this.manufacturerCity.equals(other.getManufacturerCity()))) &&
            ((this.manufacturerState==null && other.getManufacturerState()==null) || 
             (this.manufacturerState!=null &&
              this.manufacturerState.equals(other.getManufacturerState()))) &&
            ((this.manufacturerTariff==null && other.getManufacturerTariff()==null) || 
             (this.manufacturerTariff!=null &&
              this.manufacturerTariff.equals(other.getManufacturerTariff()))) &&
            ((this.manufacturerTaxId==null && other.getManufacturerTaxId()==null) || 
             (this.manufacturerTaxId!=null &&
              this.manufacturerTaxId.equals(other.getManufacturerTaxId()))) &&
            ((this.manufacturerZip==null && other.getManufacturerZip()==null) || 
             (this.manufacturerZip!=null &&
              this.manufacturerZip.equals(other.getManufacturerZip()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              this.matchBillToReceipt.equals(other.getMatchBillToReceipt()))) &&
            ((this.matrix==null && other.getMatrix()==null) || 
             (this.matrix!=null &&
              this.matrix.equals(other.getMatrix()))) &&
            ((this.matrixChild==null && other.getMatrixChild()==null) || 
             (this.matrixChild!=null &&
              this.matrixChild.equals(other.getMatrixChild()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              this.metaTagHtml.equals(other.getMetaTagHtml()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              this.minimumQuantity.equals(other.getMinimumQuantity()))) &&
            ((this.mpn==null && other.getMpn()==null) || 
             (this.mpn!=null &&
              this.mpn.equals(other.getMpn()))) &&
            ((this.multManufactureAddr==null && other.getMultManufactureAddr()==null) || 
             (this.multManufactureAddr!=null &&
              this.multManufactureAddr.equals(other.getMultManufactureAddr()))) &&
            ((this.nexTagCategory==null && other.getNexTagCategory()==null) || 
             (this.nexTagCategory!=null &&
              this.nexTagCategory.equals(other.getNexTagCategory()))) &&
            ((this.nexTagProductFeed==null && other.getNexTagProductFeed()==null) || 
             (this.nexTagProductFeed!=null &&
              this.nexTagProductFeed.equals(other.getNexTagProductFeed()))) &&
            ((this.numActiveListings==null && other.getNumActiveListings()==null) || 
             (this.numActiveListings!=null &&
              this.numActiveListings.equals(other.getNumActiveListings()))) &&
            ((this.numberAllowedDownloads==null && other.getNumberAllowedDownloads()==null) || 
             (this.numberAllowedDownloads!=null &&
              this.numberAllowedDownloads.equals(other.getNumberAllowedDownloads()))) &&
            ((this.numCurrentlyListed==null && other.getNumCurrentlyListed()==null) || 
             (this.numCurrentlyListed!=null &&
              this.numCurrentlyListed.equals(other.getNumCurrentlyListed()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              this.offerSupport.equals(other.getOfferSupport()))) &&
            ((this.onlineCustomerPrice==null && other.getOnlineCustomerPrice()==null) || 
             (this.onlineCustomerPrice!=null &&
              this.onlineCustomerPrice.equals(other.getOnlineCustomerPrice()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              this.onSpecial.equals(other.getOnSpecial()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              this.outOfStockBehavior.equals(other.getOutOfStockBehavior()))) &&
            ((this.overallQuantityPricingType==null && other.getOverallQuantityPricingType()==null) || 
             (this.overallQuantityPricingType!=null &&
              this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              this.pageTitle.equals(other.getPageTitle()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.preferenceCriterion==null && other.getPreferenceCriterion()==null) || 
             (this.preferenceCriterion!=null &&
              this.preferenceCriterion.equals(other.getPreferenceCriterion()))) &&
            ((this.preferredBin==null && other.getPreferredBin()==null) || 
             (this.preferredBin!=null &&
              this.preferredBin.equals(other.getPreferredBin()))) &&
            ((this.preferredLocation==null && other.getPreferredLocation()==null) || 
             (this.preferredLocation!=null &&
              this.preferredLocation.equals(other.getPreferredLocation()))) &&
            ((this.preferredStockLevel==null && other.getPreferredStockLevel()==null) || 
             (this.preferredStockLevel!=null &&
              this.preferredStockLevel.equals(other.getPreferredStockLevel()))) &&
            ((this.preferredStockLevelDays==null && other.getPreferredStockLevelDays()==null) || 
             (this.preferredStockLevelDays!=null &&
              this.preferredStockLevelDays.equals(other.getPreferredStockLevelDays()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              this.pricingGroup.equals(other.getPricingGroup()))) &&
            ((this.primaryCategory==null && other.getPrimaryCategory()==null) || 
             (this.primaryCategory!=null &&
              this.primaryCategory.equals(other.getPrimaryCategory()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              this.purchaseUnit.equals(other.getPurchaseUnit()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.quantityOnOrder==null && other.getQuantityOnOrder()==null) || 
             (this.quantityOnOrder!=null &&
              this.quantityOnOrder.equals(other.getQuantityOnOrder()))) &&
            ((this.quantityPricingSchedule==null && other.getQuantityPricingSchedule()==null) || 
             (this.quantityPricingSchedule!=null &&
              this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule()))) &&
            ((this.reorderMultiple==null && other.getReorderMultiple()==null) || 
             (this.reorderMultiple!=null &&
              this.reorderMultiple.equals(other.getReorderMultiple()))) &&
            ((this.reorderPoint==null && other.getReorderPoint()==null) || 
             (this.reorderPoint!=null &&
              this.reorderPoint.equals(other.getReorderPoint()))) &&
            ((this.reservePrice==null && other.getReservePrice()==null) || 
             (this.reservePrice!=null &&
              this.reservePrice.equals(other.getReservePrice()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.safetyStockLevel==null && other.getSafetyStockLevel()==null) || 
             (this.safetyStockLevel!=null &&
              this.safetyStockLevel.equals(other.getSafetyStockLevel()))) &&
            ((this.safetyStockLevelDays==null && other.getSafetyStockLevelDays()==null) || 
             (this.safetyStockLevelDays!=null &&
              this.safetyStockLevelDays.equals(other.getSafetyStockLevelDays()))) &&
            ((this.salesDescription==null && other.getSalesDescription()==null) || 
             (this.salesDescription!=null &&
              this.salesDescription.equals(other.getSalesDescription()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              this.saleUnit.equals(other.getSaleUnit()))) &&
            ((this.scheduleBCode==null && other.getScheduleBCode()==null) || 
             (this.scheduleBCode!=null &&
              this.scheduleBCode.equals(other.getScheduleBCode()))) &&
            ((this.scheduleBNumber==null && other.getScheduleBNumber()==null) || 
             (this.scheduleBNumber!=null &&
              this.scheduleBNumber.equals(other.getScheduleBNumber()))) &&
            ((this.scheduleBQuantity==null && other.getScheduleBQuantity()==null) || 
             (this.scheduleBQuantity!=null &&
              this.scheduleBQuantity.equals(other.getScheduleBQuantity()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              this.searchKeywords.equals(other.getSearchKeywords()))) &&
            ((this.seasonalDemand==null && other.getSeasonalDemand()==null) || 
             (this.seasonalDemand!=null &&
              this.seasonalDemand.equals(other.getSeasonalDemand()))) &&
            ((this.sellOnebay==null && other.getSellOnebay()==null) || 
             (this.sellOnebay!=null &&
              this.sellOnebay.equals(other.getSellOnebay()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.serialNumberLocation==null && other.getSerialNumberLocation()==null) || 
             (this.serialNumberLocation!=null &&
              this.serialNumberLocation.equals(other.getSerialNumberLocation()))) &&
            ((this.shipIndividually==null && other.getShipIndividually()==null) || 
             (this.shipIndividually!=null &&
              this.shipIndividually.equals(other.getShipIndividually()))) &&
            ((this.shipPackage==null && other.getShipPackage()==null) || 
             (this.shipPackage!=null &&
              this.shipPackage.equals(other.getShipPackage()))) &&
            ((this.shippingRate==null && other.getShippingRate()==null) || 
             (this.shippingRate!=null &&
              this.shippingRate.equals(other.getShippingRate()))) &&
            ((this.shoppingDotComCategory==null && other.getShoppingDotComCategory()==null) || 
             (this.shoppingDotComCategory!=null &&
              this.shoppingDotComCategory.equals(other.getShoppingDotComCategory()))) &&
            ((this.shoppingProductFeed==null && other.getShoppingProductFeed()==null) || 
             (this.shoppingProductFeed!=null &&
              this.shoppingProductFeed.equals(other.getShoppingProductFeed()))) &&
            ((this.shopzillaCategoryId==null && other.getShopzillaCategoryId()==null) || 
             (this.shopzillaCategoryId!=null &&
              this.shopzillaCategoryId.equals(other.getShopzillaCategoryId()))) &&
            ((this.shopzillaProductFeed==null && other.getShopzillaProductFeed()==null) || 
             (this.shopzillaProductFeed!=null &&
              this.shopzillaProductFeed.equals(other.getShopzillaProductFeed()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              this.sitemapPriority.equals(other.getSitemapPriority()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.startingPrice==null && other.getStartingPrice()==null) || 
             (this.startingPrice!=null &&
              this.startingPrice.equals(other.getStartingPrice()))) &&
            ((this.stockDescription==null && other.getStockDescription()==null) || 
             (this.stockDescription!=null &&
              this.stockDescription.equals(other.getStockDescription()))) &&
            ((this.stockUnit==null && other.getStockUnit()==null) || 
             (this.stockUnit!=null &&
              this.stockUnit.equals(other.getStockUnit()))) &&
            ((this.storeDescription==null && other.getStoreDescription()==null) || 
             (this.storeDescription!=null &&
              this.storeDescription.equals(other.getStoreDescription()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              this.subsidiary.equals(other.getSubsidiary()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              this.subType.equals(other.getSubType()))) &&
            ((this.taxCode==null && other.getTaxCode()==null) || 
             (this.taxCode!=null &&
              this.taxCode.equals(other.getTaxCode()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.thumbnailUrl==null && other.getThumbnailUrl()==null) || 
             (this.thumbnailUrl!=null &&
              this.thumbnailUrl.equals(other.getThumbnailUrl()))) &&
            ((this.totalValue==null && other.getTotalValue()==null) || 
             (this.totalValue!=null &&
              this.totalValue.equals(other.getTotalValue()))) &&
            ((this.trackLandedCost==null && other.getTrackLandedCost()==null) || 
             (this.trackLandedCost!=null &&
              this.trackLandedCost.equals(other.getTrackLandedCost()))) &&
            ((this.transferPrice==null && other.getTransferPrice()==null) || 
             (this.transferPrice!=null &&
              this.transferPrice.equals(other.getTransferPrice()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              this.unitsType.equals(other.getUnitsType()))) &&
            ((this.upcCode==null && other.getUpcCode()==null) || 
             (this.upcCode!=null &&
              this.upcCode.equals(other.getUpcCode()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
            ((this.useBins==null && other.getUseBins()==null) || 
             (this.useBins!=null &&
              this.useBins.equals(other.getUseBins()))) &&
            ((this.useMarginalRates==null && other.getUseMarginalRates()==null) || 
             (this.useMarginalRates!=null &&
              this.useMarginalRates.equals(other.getUseMarginalRates()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              this.vendor.equals(other.getVendor()))) &&
            ((this.vendorCode==null && other.getVendorCode()==null) || 
             (this.vendorCode!=null &&
              this.vendorCode.equals(other.getVendorCode()))) &&
            ((this.vendorCost==null && other.getVendorCost()==null) || 
             (this.vendorCost!=null &&
              this.vendorCost.equals(other.getVendorCost()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              this.vendorName.equals(other.getVendorName()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              this.webSite.equals(other.getWebSite()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.yahooProductFeed==null && other.getYahooProductFeed()==null) || 
             (this.yahooProductFeed!=null &&
              this.yahooProductFeed.equals(other.getYahooProductFeed()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAccount() != null) {
            _hashCode += getAccount().hashCode();
        }
        if (getAutoLeadTime() != null) {
            _hashCode += getAutoLeadTime().hashCode();
        }
        if (getAutoPreferredStockLevel() != null) {
            _hashCode += getAutoPreferredStockLevel().hashCode();
        }
        if (getAutoReorderPoint() != null) {
            _hashCode += getAutoReorderPoint().hashCode();
        }
        if (getAvailableToPartners() != null) {
            _hashCode += getAvailableToPartners().hashCode();
        }
        if (getAverageCost() != null) {
            _hashCode += getAverageCost().hashCode();
        }
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getBinOnHandAvail() != null) {
            _hashCode += getBinOnHandAvail().hashCode();
        }
        if (getBinOnHandCount() != null) {
            _hashCode += getBinOnHandCount().hashCode();
        }
        if (getBuildEntireAssembly() != null) {
            _hashCode += getBuildEntireAssembly().hashCode();
        }
        if (getBuyItNowPrice() != null) {
            _hashCode += getBuyItNowPrice().hashCode();
        }
        if (getCaption() != null) {
            _hashCode += getCaption().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getComponent() != null) {
            _hashCode += getComponent().hashCode();
        }
        if (getComponentOf() != null) {
            _hashCode += getComponentOf().hashCode();
        }
        if (getCopyDescription() != null) {
            _hashCode += getCopyDescription().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostingMethod() != null) {
            _hashCode += getCostingMethod().hashCode();
        }
        if (getCountryOfManufacture() != null) {
            _hashCode += getCountryOfManufacture().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getCreateJob() != null) {
            _hashCode += getCreateJob().hashCode();
        }
        if (getDateViewed() != null) {
            _hashCode += getDateViewed().hashCode();
        }
        if (getDaysBeforeExpiration() != null) {
            _hashCode += getDaysBeforeExpiration().hashCode();
        }
        if (getDefaultReturnCost() != null) {
            _hashCode += getDefaultReturnCost().hashCode();
        }
        if (getDemandModifier() != null) {
            _hashCode += getDemandModifier().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getDisplayIneBayStore() != null) {
            _hashCode += getDisplayIneBayStore().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getDontShowPrice() != null) {
            _hashCode += getDontShowPrice().hashCode();
        }
        if (getEBayItemDescription() != null) {
            _hashCode += getEBayItemDescription().hashCode();
        }
        if (getEBayItemSubtitle() != null) {
            _hashCode += getEBayItemSubtitle().hashCode();
        }
        if (getEBayItemTitle() != null) {
            _hashCode += getEBayItemTitle().hashCode();
        }
        if (getEbayRelistingOption() != null) {
            _hashCode += getEbayRelistingOption().hashCode();
        }
        if (getEndAuctionsWhenOutOfStock() != null) {
            _hashCode += getEndAuctionsWhenOutOfStock().hashCode();
        }
        if (getExcludeFromSitemap() != null) {
            _hashCode += getExcludeFromSitemap().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        if (getExternalIdString() != null) {
            _hashCode += getExternalIdString().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
        }
        if (getFeedDescription() != null) {
            _hashCode += getFeedDescription().hashCode();
        }
        if (getFeedName() != null) {
            _hashCode += getFeedName().hashCode();
        }
        if (getFroogleProductFeed() != null) {
            _hashCode += getFroogleProductFeed().hashCode();
        }
        if (getFxCost() != null) {
            _hashCode += getFxCost().hashCode();
        }
        if (getGiftCertAuthCode() != null) {
            _hashCode += getGiftCertAuthCode().hashCode();
        }
        if (getGiftCertEmail() != null) {
            _hashCode += getGiftCertEmail().hashCode();
        }
        if (getGiftCertExpDate() != null) {
            _hashCode += getGiftCertExpDate().hashCode();
        }
        if (getGiftCertFrom() != null) {
            _hashCode += getGiftCertFrom().hashCode();
        }
        if (getGiftCertMsg() != null) {
            _hashCode += getGiftCertMsg().hashCode();
        }
        if (getGiftCertOrigAmt() != null) {
            _hashCode += getGiftCertOrigAmt().hashCode();
        }
        if (getGiftCertRecipient() != null) {
            _hashCode += getGiftCertRecipient().hashCode();
        }
        if (getImageUrl() != null) {
            _hashCode += getImageUrl().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getInventoryLocation() != null) {
            _hashCode += getInventoryLocation().hashCode();
        }
        if (getIsAvailable() != null) {
            _hashCode += getIsAvailable().hashCode();
        }
        if (getIsDropShipItem() != null) {
            _hashCode += getIsDropShipItem().hashCode();
        }
        if (getIsFulfillable() != null) {
            _hashCode += getIsFulfillable().hashCode();
        }
        if (getIsGcoCompliant() != null) {
            _hashCode += getIsGcoCompliant().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsPreferredVendor() != null) {
            _hashCode += getIsPreferredVendor().hashCode();
        }
        if (getIsSpecialOrderItem() != null) {
            _hashCode += getIsSpecialOrderItem().hashCode();
        }
        if (getIsSpecialWorkOrderItem() != null) {
            _hashCode += getIsSpecialWorkOrderItem().hashCode();
        }
        if (getIssueProduct() != null) {
            _hashCode += getIssueProduct().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getIsVsoeBundle() != null) {
            _hashCode += getIsVsoeBundle().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getItemUrl() != null) {
            _hashCode += getItemUrl().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getLastPurchasePrice() != null) {
            _hashCode += getLastPurchasePrice().hashCode();
        }
        if (getLastQuantityAvailableChange() != null) {
            _hashCode += getLastQuantityAvailableChange().hashCode();
        }
        if (getLeadTime() != null) {
            _hashCode += getLeadTime().hashCode();
        }
        if (getListingDuration() != null) {
            _hashCode += getListingDuration().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getLocationAverageCost() != null) {
            _hashCode += getLocationAverageCost().hashCode();
        }
        if (getLocationDefaultReturnCost() != null) {
            _hashCode += getLocationDefaultReturnCost().hashCode();
        }
        if (getLocationPreferredStockLevel() != null) {
            _hashCode += getLocationPreferredStockLevel().hashCode();
        }
        if (getLocationQuantityAvailable() != null) {
            _hashCode += getLocationQuantityAvailable().hashCode();
        }
        if (getLocationQuantityBackOrdered() != null) {
            _hashCode += getLocationQuantityBackOrdered().hashCode();
        }
        if (getLocationQuantityCommitted() != null) {
            _hashCode += getLocationQuantityCommitted().hashCode();
        }
        if (getLocationQuantityInTransit() != null) {
            _hashCode += getLocationQuantityInTransit().hashCode();
        }
        if (getLocationQuantityOnHand() != null) {
            _hashCode += getLocationQuantityOnHand().hashCode();
        }
        if (getLocationQuantityOnOrder() != null) {
            _hashCode += getLocationQuantityOnOrder().hashCode();
        }
        if (getLocationReorderPoint() != null) {
            _hashCode += getLocationReorderPoint().hashCode();
        }
        if (getLocationTotalValue() != null) {
            _hashCode += getLocationTotalValue().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getManufactureraddr1() != null) {
            _hashCode += getManufactureraddr1().hashCode();
        }
        if (getManufacturerCity() != null) {
            _hashCode += getManufacturerCity().hashCode();
        }
        if (getManufacturerState() != null) {
            _hashCode += getManufacturerState().hashCode();
        }
        if (getManufacturerTariff() != null) {
            _hashCode += getManufacturerTariff().hashCode();
        }
        if (getManufacturerTaxId() != null) {
            _hashCode += getManufacturerTaxId().hashCode();
        }
        if (getManufacturerZip() != null) {
            _hashCode += getManufacturerZip().hashCode();
        }
        if (getMatchBillToReceipt() != null) {
            _hashCode += getMatchBillToReceipt().hashCode();
        }
        if (getMatrix() != null) {
            _hashCode += getMatrix().hashCode();
        }
        if (getMatrixChild() != null) {
            _hashCode += getMatrixChild().hashCode();
        }
        if (getMetaTagHtml() != null) {
            _hashCode += getMetaTagHtml().hashCode();
        }
        if (getMinimumQuantity() != null) {
            _hashCode += getMinimumQuantity().hashCode();
        }
        if (getMpn() != null) {
            _hashCode += getMpn().hashCode();
        }
        if (getMultManufactureAddr() != null) {
            _hashCode += getMultManufactureAddr().hashCode();
        }
        if (getNexTagCategory() != null) {
            _hashCode += getNexTagCategory().hashCode();
        }
        if (getNexTagProductFeed() != null) {
            _hashCode += getNexTagProductFeed().hashCode();
        }
        if (getNumActiveListings() != null) {
            _hashCode += getNumActiveListings().hashCode();
        }
        if (getNumberAllowedDownloads() != null) {
            _hashCode += getNumberAllowedDownloads().hashCode();
        }
        if (getNumCurrentlyListed() != null) {
            _hashCode += getNumCurrentlyListed().hashCode();
        }
        if (getOfferSupport() != null) {
            _hashCode += getOfferSupport().hashCode();
        }
        if (getOnlineCustomerPrice() != null) {
            _hashCode += getOnlineCustomerPrice().hashCode();
        }
        if (getOnSpecial() != null) {
            _hashCode += getOnSpecial().hashCode();
        }
        if (getOutOfStockBehavior() != null) {
            _hashCode += getOutOfStockBehavior().hashCode();
        }
        if (getOverallQuantityPricingType() != null) {
            _hashCode += getOverallQuantityPricingType().hashCode();
        }
        if (getPageTitle() != null) {
            _hashCode += getPageTitle().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPreferenceCriterion() != null) {
            _hashCode += getPreferenceCriterion().hashCode();
        }
        if (getPreferredBin() != null) {
            _hashCode += getPreferredBin().hashCode();
        }
        if (getPreferredLocation() != null) {
            _hashCode += getPreferredLocation().hashCode();
        }
        if (getPreferredStockLevel() != null) {
            _hashCode += getPreferredStockLevel().hashCode();
        }
        if (getPreferredStockLevelDays() != null) {
            _hashCode += getPreferredStockLevelDays().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getPricingGroup() != null) {
            _hashCode += getPricingGroup().hashCode();
        }
        if (getPrimaryCategory() != null) {
            _hashCode += getPrimaryCategory().hashCode();
        }
        if (getPurchaseUnit() != null) {
            _hashCode += getPurchaseUnit().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getQuantityOnOrder() != null) {
            _hashCode += getQuantityOnOrder().hashCode();
        }
        if (getQuantityPricingSchedule() != null) {
            _hashCode += getQuantityPricingSchedule().hashCode();
        }
        if (getReorderMultiple() != null) {
            _hashCode += getReorderMultiple().hashCode();
        }
        if (getReorderPoint() != null) {
            _hashCode += getReorderPoint().hashCode();
        }
        if (getReservePrice() != null) {
            _hashCode += getReservePrice().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getSafetyStockLevel() != null) {
            _hashCode += getSafetyStockLevel().hashCode();
        }
        if (getSafetyStockLevelDays() != null) {
            _hashCode += getSafetyStockLevelDays().hashCode();
        }
        if (getSalesDescription() != null) {
            _hashCode += getSalesDescription().hashCode();
        }
        if (getSaleUnit() != null) {
            _hashCode += getSaleUnit().hashCode();
        }
        if (getScheduleBCode() != null) {
            _hashCode += getScheduleBCode().hashCode();
        }
        if (getScheduleBNumber() != null) {
            _hashCode += getScheduleBNumber().hashCode();
        }
        if (getScheduleBQuantity() != null) {
            _hashCode += getScheduleBQuantity().hashCode();
        }
        if (getSearchKeywords() != null) {
            _hashCode += getSearchKeywords().hashCode();
        }
        if (getSeasonalDemand() != null) {
            _hashCode += getSeasonalDemand().hashCode();
        }
        if (getSellOnebay() != null) {
            _hashCode += getSellOnebay().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getSerialNumberLocation() != null) {
            _hashCode += getSerialNumberLocation().hashCode();
        }
        if (getShipIndividually() != null) {
            _hashCode += getShipIndividually().hashCode();
        }
        if (getShipPackage() != null) {
            _hashCode += getShipPackage().hashCode();
        }
        if (getShippingRate() != null) {
            _hashCode += getShippingRate().hashCode();
        }
        if (getShoppingDotComCategory() != null) {
            _hashCode += getShoppingDotComCategory().hashCode();
        }
        if (getShoppingProductFeed() != null) {
            _hashCode += getShoppingProductFeed().hashCode();
        }
        if (getShopzillaCategoryId() != null) {
            _hashCode += getShopzillaCategoryId().hashCode();
        }
        if (getShopzillaProductFeed() != null) {
            _hashCode += getShopzillaProductFeed().hashCode();
        }
        if (getSitemapPriority() != null) {
            _hashCode += getSitemapPriority().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getStartingPrice() != null) {
            _hashCode += getStartingPrice().hashCode();
        }
        if (getStockDescription() != null) {
            _hashCode += getStockDescription().hashCode();
        }
        if (getStockUnit() != null) {
            _hashCode += getStockUnit().hashCode();
        }
        if (getStoreDescription() != null) {
            _hashCode += getStoreDescription().hashCode();
        }
        if (getSubsidiary() != null) {
            _hashCode += getSubsidiary().hashCode();
        }
        if (getSubType() != null) {
            _hashCode += getSubType().hashCode();
        }
        if (getTaxCode() != null) {
            _hashCode += getTaxCode().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getThumbnailUrl() != null) {
            _hashCode += getThumbnailUrl().hashCode();
        }
        if (getTotalValue() != null) {
            _hashCode += getTotalValue().hashCode();
        }
        if (getTrackLandedCost() != null) {
            _hashCode += getTrackLandedCost().hashCode();
        }
        if (getTransferPrice() != null) {
            _hashCode += getTransferPrice().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getUnitsType() != null) {
            _hashCode += getUnitsType().hashCode();
        }
        if (getUpcCode() != null) {
            _hashCode += getUpcCode().hashCode();
        }
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
        }
        if (getUseBins() != null) {
            _hashCode += getUseBins().hashCode();
        }
        if (getUseMarginalRates() != null) {
            _hashCode += getUseMarginalRates().hashCode();
        }
        if (getVendor() != null) {
            _hashCode += getVendor().hashCode();
        }
        if (getVendorCode() != null) {
            _hashCode += getVendorCode().hashCode();
        }
        if (getVendorCost() != null) {
            _hashCode += getVendorCost().hashCode();
        }
        if (getVendorName() != null) {
            _hashCode += getVendorName().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getWebSite() != null) {
            _hashCode += getWebSite().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getYahooProductFeed() != null) {
            _hashCode += getYahooProductFeed().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binOnHandAvail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binOnHandCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyItNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyItNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "caption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "component"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentOf");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "componentOf"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayIneBayStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "displayIneBayStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eBayItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemSubtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eBayItemSubtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eBayItemTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebayRelistingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ebayRelistingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAuctionsWhenOutOfStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endAuctionsWhenOutOfStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "feedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "feedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("froogleProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "froogleProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertExpDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertExpDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertMsg");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertMsg"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertOrigAmt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertOrigAmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "imageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPreferredVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isPreferredVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialWorkOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSpecialWorkOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastQuantityAvailableChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastQuantityAvailableChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "listingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAverageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationAverageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDefaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationDefaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityInTransit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityInTransit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationReorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationReorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTotalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationTotalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufactureraddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufactureraddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrixChild");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "matrixChild"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexTagCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nexTagCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexTagProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nexTagProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveListings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "numActiveListings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberAllowedDownloads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "numberAllowedDownloads"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCurrentlyListed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "numCurrentlyListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineCustomerPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onlineCustomerPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellOnebay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "sellOnebay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumberLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shoppingProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shopzillaProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbnailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "thumbnailUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendorCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yahooProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "yahooProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
