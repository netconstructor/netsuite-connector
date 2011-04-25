/**
 * ItemSearchRowBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemSearchRowBasic  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assetAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoLeadTime;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoPreferredStockLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoReorderPoint;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableToPartners;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] averageCost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] basePrice;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billExchRateVarianceAcct;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billPriceVarianceAcct;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billQtyVarianceAcct;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binOnHandAvail;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binOnHandCount;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] buildEntireAssembly;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] buyItNowPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] category;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] copyDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costEstimate;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costEstimateType;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costingMethod;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] countryOfManufacture;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] created;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] createJob;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateViewed;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] daysBeforeExpiration;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] defaultReturnCost;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] deferredExpenseAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] deferredRevenueAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] demandModifier;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] departmentnohierarchy;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] displayIneBayStore;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] displayName;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] dontShowPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemSubtitle;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemTitle;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] ebayRelistingOption;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] endAuctionsWhenOutOfStock;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] excludeFromSitemap;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] expenseAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] featuredDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] feedDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] feedName;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] froogleProductFeed;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxCost;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] gainLossAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertAuthCode;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertEmail;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertExpirationDate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertFrom;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertMessage;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertOriginalAmount;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertRecipient;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] hits;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] imageUrl;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] incomeAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] inventoryLocation;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAvailable;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDropShipItem;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isFulfillable;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoCompliant;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isOnline;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSpecialOrderItem;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSpecialWorkOrderItem;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issueProduct;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTaxable;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isVsoeBundle;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemUrl;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] lastPurchasePrice;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastQuantityAvailableChange;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] leadTime;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] liabilityAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] listingDuration;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationAverageCost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationBinQuantityAvailable;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationDefaultReturnCost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationPreferredStockLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityAvailable;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityBackOrdered;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityInTransit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityOnHand;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityOnOrder;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationReOrderPoint;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationTotalValue;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturer;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerAddr1;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerCity;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerState;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerTariff;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerTaxId;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerZip;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] matchBillToReceipt;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] memberItem;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] memberQuantity;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] metaTagHtml;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] minimumQuantity;

    private org.mule.module.netsuite.api.internal.SearchColumnDateField[] modified;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] mpn;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] multManufactureAddr;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] nextagCategory;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] nextagProductFeed;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] noPriceMessage;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] numActiveListings;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] numberAllowedDownloads;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] numCurrentlyListed;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] offerSupport;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] onlineCustomerPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] onlinePrice;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] onSpecial;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] otherPrices;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] otherVendor;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] outOfStockBehavior;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] outOfStockMessage;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] overallQuantityPricingType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] pageTitle;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] preferenceCriterion;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] preferredBin;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] preferredLocation;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] preferredStockLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] preferredStockLevelDays;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] pricingGroup;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryCategory;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] purchaseDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseUnit;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityAvailable;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityBackOrdered;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityCommitted;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityOnHand;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityOnOrder;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] quantityPricingSchedule;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] reorderMultiple;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] reOrderPoint;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] reservePrice;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] revRecSchedule;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] safetyStockLevel;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] safetyStockLevelDays;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTaxCode;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] saleUnit;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] scheduleBCode;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] scheduleBNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] scheduleBQuantity;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] searchKeywords;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] seasonalDemand;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] sellOnEBay;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumberLocation;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipIndividually;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shipPackage;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] shippingRate;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] shoppingDotComCategory;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shoppingProductFeed;

    private org.mule.module.netsuite.api.internal.SearchColumnLongField[] shopzillaCategoryId;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shopzillaProductFeed;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] sitemapPriority;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] softDescriptor;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] startingPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] stockDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] stockUnit;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDetailedDescription;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] storeDisplayImage;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDisplayName;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] storeDisplayThumbnail;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] subType;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxSchedule;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] thumbNailUrl;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] totalValue;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] trackLandedCost;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferPrice;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] unbuildVarianceAccount;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] unitsType;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] upcCode;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] urlComponent;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useBins;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useMarginalRates;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendor;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] vendorCode;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vendorCost;

    private org.mule.module.netsuite.api.internal.SearchColumnStringField[] vendorName;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendorSchedule;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoeDeferral;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] vsoeDelivered;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoePermitDiscount;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoePrice;

    private org.mule.module.netsuite.api.internal.SearchColumnSelectField[] webSite;

    private org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] weight;

    private org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] weightUnit;

    private org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] yahooProductFeed;

    private org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList;

    public ItemSearchRowBasic() {
    }

    public ItemSearchRowBasic(
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assetAccount,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoLeadTime,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoPreferredStockLevel,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoReorderPoint,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableToPartners,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] averageCost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] basePrice,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billExchRateVarianceAcct,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billPriceVarianceAcct,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billQtyVarianceAcct,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binOnHandAvail,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binOnHandCount,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] buildEntireAssembly,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] buyItNowPrice,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] category,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] copyDescription,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costEstimate,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costEstimateType,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costingMethod,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] countryOfManufacture,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] created,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] createJob,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateViewed,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] daysBeforeExpiration,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] defaultReturnCost,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] deferredExpenseAccount,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] deferredRevenueAccount,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] demandModifier,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] departmentnohierarchy,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] displayIneBayStore,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] displayName,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] dontShowPrice,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemDescription,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemSubtitle,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemTitle,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] ebayRelistingOption,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] endAuctionsWhenOutOfStock,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] excludeFromSitemap,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] expenseAccount,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] featuredDescription,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] feedDescription,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] feedName,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] froogleProductFeed,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxCost,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] gainLossAccount,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertAuthCode,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertEmail,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertExpirationDate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertFrom,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertMessage,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertOriginalAmount,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertRecipient,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] hits,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] imageUrl,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] incomeAccount,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] inventoryLocation,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAvailable,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDropShipItem,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isFulfillable,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoCompliant,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isOnline,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSpecialOrderItem,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSpecialWorkOrderItem,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issueProduct,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTaxable,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isVsoeBundle,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemUrl,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] lastPurchasePrice,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastQuantityAvailableChange,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] leadTime,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] liabilityAccount,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] listingDuration,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationAverageCost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationBinQuantityAvailable,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationDefaultReturnCost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationPreferredStockLevel,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityAvailable,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityBackOrdered,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityCommitted,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityInTransit,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityOnHand,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityOnOrder,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationReOrderPoint,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationTotalValue,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturer,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerAddr1,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerCity,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerState,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerTariff,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerTaxId,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerZip,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] matchBillToReceipt,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] memberItem,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] memberQuantity,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] metaTagHtml,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] minimumQuantity,
           org.mule.module.netsuite.api.internal.SearchColumnDateField[] modified,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] mpn,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] multManufactureAddr,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] nextagCategory,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] nextagProductFeed,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] noPriceMessage,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] numActiveListings,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] numberAllowedDownloads,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] numCurrentlyListed,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] offerSupport,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] onlineCustomerPrice,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] onlinePrice,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] onSpecial,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] otherPrices,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] otherVendor,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] outOfStockBehavior,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] outOfStockMessage,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] overallQuantityPricingType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] pageTitle,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] preferenceCriterion,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] preferredBin,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] preferredLocation,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] preferredStockLevel,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] preferredStockLevelDays,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] pricingGroup,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryCategory,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] purchaseDescription,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseUnit,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityAvailable,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityBackOrdered,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityCommitted,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityOnHand,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityOnOrder,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] quantityPricingSchedule,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] reorderMultiple,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] reOrderPoint,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] reservePrice,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] revRecSchedule,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] safetyStockLevel,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] safetyStockLevelDays,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesDescription,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTaxCode,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] saleUnit,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] scheduleBCode,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] scheduleBNumber,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] scheduleBQuantity,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] searchKeywords,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] seasonalDemand,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] sellOnEBay,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumberLocation,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipIndividually,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shipPackage,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] shippingRate,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] shoppingDotComCategory,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shoppingProductFeed,
           org.mule.module.netsuite.api.internal.SearchColumnLongField[] shopzillaCategoryId,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shopzillaProductFeed,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] sitemapPriority,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] softDescriptor,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] startingPrice,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] stockDescription,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] stockUnit,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDescription,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDetailedDescription,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] storeDisplayImage,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDisplayName,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] storeDisplayThumbnail,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] subType,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxSchedule,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] thumbNailUrl,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] totalValue,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] trackLandedCost,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferPrice,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] unbuildVarianceAccount,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] unitsType,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] upcCode,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] urlComponent,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useBins,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useMarginalRates,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendor,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] vendorCode,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vendorCost,
           org.mule.module.netsuite.api.internal.SearchColumnStringField[] vendorName,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendorSchedule,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoeDeferral,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] vsoeDelivered,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoePermitDiscount,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoePrice,
           org.mule.module.netsuite.api.internal.SearchColumnSelectField[] webSite,
           org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] weight,
           org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] weightUnit,
           org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] yahooProductFeed,
           org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
           this.assetAccount = assetAccount;
           this.autoLeadTime = autoLeadTime;
           this.autoPreferredStockLevel = autoPreferredStockLevel;
           this.autoReorderPoint = autoReorderPoint;
           this.availableToPartners = availableToPartners;
           this.averageCost = averageCost;
           this.basePrice = basePrice;
           this.billExchRateVarianceAcct = billExchRateVarianceAcct;
           this.billPriceVarianceAcct = billPriceVarianceAcct;
           this.billQtyVarianceAcct = billQtyVarianceAcct;
           this.binNumber = binNumber;
           this.binOnHandAvail = binOnHandAvail;
           this.binOnHandCount = binOnHandCount;
           this.buildEntireAssembly = buildEntireAssembly;
           this.buyItNowPrice = buyItNowPrice;
           this.category = category;
           this._class = _class;
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
           this.deferredExpenseAccount = deferredExpenseAccount;
           this.deferredRevenueAccount = deferredRevenueAccount;
           this.demandModifier = demandModifier;
           this.department = department;
           this.departmentnohierarchy = departmentnohierarchy;
           this.displayIneBayStore = displayIneBayStore;
           this.displayName = displayName;
           this.dontShowPrice = dontShowPrice;
           this.eBayItemDescription = eBayItemDescription;
           this.eBayItemSubtitle = eBayItemSubtitle;
           this.eBayItemTitle = eBayItemTitle;
           this.ebayRelistingOption = ebayRelistingOption;
           this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
           this.excludeFromSitemap = excludeFromSitemap;
           this.expenseAccount = expenseAccount;
           this.externalId = externalId;
           this.featuredDescription = featuredDescription;
           this.feedDescription = feedDescription;
           this.feedName = feedName;
           this.froogleProductFeed = froogleProductFeed;
           this.fxCost = fxCost;
           this.gainLossAccount = gainLossAccount;
           this.giftCertAuthCode = giftCertAuthCode;
           this.giftCertEmail = giftCertEmail;
           this.giftCertExpirationDate = giftCertExpirationDate;
           this.giftCertFrom = giftCertFrom;
           this.giftCertMessage = giftCertMessage;
           this.giftCertOriginalAmount = giftCertOriginalAmount;
           this.giftCertRecipient = giftCertRecipient;
           this.hits = hits;
           this.imageUrl = imageUrl;
           this.incomeAccount = incomeAccount;
           this.internalId = internalId;
           this.inventoryLocation = inventoryLocation;
           this.isAvailable = isAvailable;
           this.isDropShipItem = isDropShipItem;
           this.isFulfillable = isFulfillable;
           this.isGcoCompliant = isGcoCompliant;
           this.isInactive = isInactive;
           this.isOnline = isOnline;
           this.isSpecialOrderItem = isSpecialOrderItem;
           this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
           this.issueProduct = issueProduct;
           this.isTaxable = isTaxable;
           this.isVsoeBundle = isVsoeBundle;
           this.itemId = itemId;
           this.itemUrl = itemUrl;
           this.lastPurchasePrice = lastPurchasePrice;
           this.lastQuantityAvailableChange = lastQuantityAvailableChange;
           this.leadTime = leadTime;
           this.liabilityAccount = liabilityAccount;
           this.listingDuration = listingDuration;
           this.location = location;
           this.locationAverageCost = locationAverageCost;
           this.locationBinQuantityAvailable = locationBinQuantityAvailable;
           this.locationDefaultReturnCost = locationDefaultReturnCost;
           this.locationPreferredStockLevel = locationPreferredStockLevel;
           this.locationQuantityAvailable = locationQuantityAvailable;
           this.locationQuantityBackOrdered = locationQuantityBackOrdered;
           this.locationQuantityCommitted = locationQuantityCommitted;
           this.locationQuantityInTransit = locationQuantityInTransit;
           this.locationQuantityOnHand = locationQuantityOnHand;
           this.locationQuantityOnOrder = locationQuantityOnOrder;
           this.locationReOrderPoint = locationReOrderPoint;
           this.locationTotalValue = locationTotalValue;
           this.manufacturer = manufacturer;
           this.manufacturerAddr1 = manufacturerAddr1;
           this.manufacturerCity = manufacturerCity;
           this.manufacturerState = manufacturerState;
           this.manufacturerTariff = manufacturerTariff;
           this.manufacturerTaxId = manufacturerTaxId;
           this.manufacturerZip = manufacturerZip;
           this.matchBillToReceipt = matchBillToReceipt;
           this.memberItem = memberItem;
           this.memberQuantity = memberQuantity;
           this.metaTagHtml = metaTagHtml;
           this.minimumQuantity = minimumQuantity;
           this.modified = modified;
           this.mpn = mpn;
           this.multManufactureAddr = multManufactureAddr;
           this.nextagCategory = nextagCategory;
           this.nextagProductFeed = nextagProductFeed;
           this.noPriceMessage = noPriceMessage;
           this.numActiveListings = numActiveListings;
           this.numberAllowedDownloads = numberAllowedDownloads;
           this.numCurrentlyListed = numCurrentlyListed;
           this.offerSupport = offerSupport;
           this.onlineCustomerPrice = onlineCustomerPrice;
           this.onlinePrice = onlinePrice;
           this.onSpecial = onSpecial;
           this.otherPrices = otherPrices;
           this.otherVendor = otherVendor;
           this.outOfStockBehavior = outOfStockBehavior;
           this.outOfStockMessage = outOfStockMessage;
           this.overallQuantityPricingType = overallQuantityPricingType;
           this.pageTitle = pageTitle;
           this.parent = parent;
           this.preferenceCriterion = preferenceCriterion;
           this.preferredBin = preferredBin;
           this.preferredLocation = preferredLocation;
           this.preferredStockLevel = preferredStockLevel;
           this.preferredStockLevelDays = preferredStockLevelDays;
           this.pricingGroup = pricingGroup;
           this.primaryCategory = primaryCategory;
           this.purchaseDescription = purchaseDescription;
           this.purchaseUnit = purchaseUnit;
           this.quantityAvailable = quantityAvailable;
           this.quantityBackOrdered = quantityBackOrdered;
           this.quantityCommitted = quantityCommitted;
           this.quantityOnHand = quantityOnHand;
           this.quantityOnOrder = quantityOnOrder;
           this.quantityPricingSchedule = quantityPricingSchedule;
           this.reorderMultiple = reorderMultiple;
           this.reOrderPoint = reOrderPoint;
           this.reservePrice = reservePrice;
           this.revRecSchedule = revRecSchedule;
           this.safetyStockLevel = safetyStockLevel;
           this.safetyStockLevelDays = safetyStockLevelDays;
           this.salesDescription = salesDescription;
           this.salesTaxCode = salesTaxCode;
           this.saleUnit = saleUnit;
           this.scheduleBCode = scheduleBCode;
           this.scheduleBNumber = scheduleBNumber;
           this.scheduleBQuantity = scheduleBQuantity;
           this.searchKeywords = searchKeywords;
           this.seasonalDemand = seasonalDemand;
           this.sellOnEBay = sellOnEBay;
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
           this.storeDetailedDescription = storeDetailedDescription;
           this.storeDisplayImage = storeDisplayImage;
           this.storeDisplayName = storeDisplayName;
           this.storeDisplayThumbnail = storeDisplayThumbnail;
           this.subsidiary = subsidiary;
           this.subType = subType;
           this.taxSchedule = taxSchedule;
           this.thumbNailUrl = thumbNailUrl;
           this.totalValue = totalValue;
           this.trackLandedCost = trackLandedCost;
           this.transferPrice = transferPrice;
           this.type = type;
           this.unbuildVarianceAccount = unbuildVarianceAccount;
           this.unitsType = unitsType;
           this.upcCode = upcCode;
           this.urlComponent = urlComponent;
           this.useBins = useBins;
           this.useMarginalRates = useMarginalRates;
           this.vendor = vendor;
           this.vendorCode = vendorCode;
           this.vendorCost = vendorCost;
           this.vendorName = vendorName;
           this.vendorSchedule = vendorSchedule;
           this.vsoeDeferral = vsoeDeferral;
           this.vsoeDelivered = vsoeDelivered;
           this.vsoePermitDiscount = vsoePermitDiscount;
           this.vsoePrice = vsoePrice;
           this.webSite = webSite;
           this.weight = weight;
           this.weightUnit = weightUnit;
           this.yahooProductFeed = yahooProductFeed;
           this.customFieldList = customFieldList;
    }


    /**
     * Gets the assetAccount value for this ItemSearchRowBasic.
     * 
     * @return assetAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getAssetAccount() {
        return assetAccount;
    }


    /**
     * Sets the assetAccount value for this ItemSearchRowBasic.
     * 
     * @param assetAccount
     */
    public void setAssetAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] assetAccount) {
        this.assetAccount = assetAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getAssetAccount(int i) {
        return this.assetAccount[i];
    }

    public void setAssetAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.assetAccount[i] = _value;
    }


    /**
     * Gets the autoLeadTime value for this ItemSearchRowBasic.
     * 
     * @return autoLeadTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAutoLeadTime() {
        return autoLeadTime;
    }


    /**
     * Sets the autoLeadTime value for this ItemSearchRowBasic.
     * 
     * @param autoLeadTime
     */
    public void setAutoLeadTime(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoLeadTime) {
        this.autoLeadTime = autoLeadTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAutoLeadTime(int i) {
        return this.autoLeadTime[i];
    }

    public void setAutoLeadTime(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.autoLeadTime[i] = _value;
    }


    /**
     * Gets the autoPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @return autoPreferredStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAutoPreferredStockLevel() {
        return autoPreferredStockLevel;
    }


    /**
     * Sets the autoPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @param autoPreferredStockLevel
     */
    public void setAutoPreferredStockLevel(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoPreferredStockLevel) {
        this.autoPreferredStockLevel = autoPreferredStockLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAutoPreferredStockLevel(int i) {
        return this.autoPreferredStockLevel[i];
    }

    public void setAutoPreferredStockLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.autoPreferredStockLevel[i] = _value;
    }


    /**
     * Gets the autoReorderPoint value for this ItemSearchRowBasic.
     * 
     * @return autoReorderPoint
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAutoReorderPoint() {
        return autoReorderPoint;
    }


    /**
     * Sets the autoReorderPoint value for this ItemSearchRowBasic.
     * 
     * @param autoReorderPoint
     */
    public void setAutoReorderPoint(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] autoReorderPoint) {
        this.autoReorderPoint = autoReorderPoint;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAutoReorderPoint(int i) {
        return this.autoReorderPoint[i];
    }

    public void setAutoReorderPoint(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.autoReorderPoint[i] = _value;
    }


    /**
     * Gets the availableToPartners value for this ItemSearchRowBasic.
     * 
     * @return availableToPartners
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this ItemSearchRowBasic.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getAvailableToPartners(int i) {
        return this.availableToPartners[i];
    }

    public void setAvailableToPartners(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.availableToPartners[i] = _value;
    }


    /**
     * Gets the averageCost value for this ItemSearchRowBasic.
     * 
     * @return averageCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getAverageCost() {
        return averageCost;
    }


    /**
     * Sets the averageCost value for this ItemSearchRowBasic.
     * 
     * @param averageCost
     */
    public void setAverageCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] averageCost) {
        this.averageCost = averageCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getAverageCost(int i) {
        return this.averageCost[i];
    }

    public void setAverageCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.averageCost[i] = _value;
    }


    /**
     * Gets the basePrice value for this ItemSearchRowBasic.
     * 
     * @return basePrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBasePrice() {
        return basePrice;
    }


    /**
     * Sets the basePrice value for this ItemSearchRowBasic.
     * 
     * @param basePrice
     */
    public void setBasePrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] basePrice) {
        this.basePrice = basePrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBasePrice(int i) {
        return this.basePrice[i];
    }

    public void setBasePrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.basePrice[i] = _value;
    }


    /**
     * Gets the billExchRateVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return billExchRateVarianceAcct
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBillExchRateVarianceAcct() {
        return billExchRateVarianceAcct;
    }


    /**
     * Sets the billExchRateVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param billExchRateVarianceAcct
     */
    public void setBillExchRateVarianceAcct(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billExchRateVarianceAcct) {
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBillExchRateVarianceAcct(int i) {
        return this.billExchRateVarianceAcct[i];
    }

    public void setBillExchRateVarianceAcct(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.billExchRateVarianceAcct[i] = _value;
    }


    /**
     * Gets the billPriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return billPriceVarianceAcct
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBillPriceVarianceAcct() {
        return billPriceVarianceAcct;
    }


    /**
     * Sets the billPriceVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param billPriceVarianceAcct
     */
    public void setBillPriceVarianceAcct(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billPriceVarianceAcct) {
        this.billPriceVarianceAcct = billPriceVarianceAcct;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBillPriceVarianceAcct(int i) {
        return this.billPriceVarianceAcct[i];
    }

    public void setBillPriceVarianceAcct(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.billPriceVarianceAcct[i] = _value;
    }


    /**
     * Gets the billQtyVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @return billQtyVarianceAcct
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getBillQtyVarianceAcct() {
        return billQtyVarianceAcct;
    }


    /**
     * Sets the billQtyVarianceAcct value for this ItemSearchRowBasic.
     * 
     * @param billQtyVarianceAcct
     */
    public void setBillQtyVarianceAcct(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] billQtyVarianceAcct) {
        this.billQtyVarianceAcct = billQtyVarianceAcct;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getBillQtyVarianceAcct(int i) {
        return this.billQtyVarianceAcct[i];
    }

    public void setBillQtyVarianceAcct(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.billQtyVarianceAcct[i] = _value;
    }


    /**
     * Gets the binNumber value for this ItemSearchRowBasic.
     * 
     * @return binNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this ItemSearchRowBasic.
     * 
     * @param binNumber
     */
    public void setBinNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] binNumber) {
        this.binNumber = binNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.binNumber[i] = _value;
    }


    /**
     * Gets the binOnHandAvail value for this ItemSearchRowBasic.
     * 
     * @return binOnHandAvail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBinOnHandAvail() {
        return binOnHandAvail;
    }


    /**
     * Sets the binOnHandAvail value for this ItemSearchRowBasic.
     * 
     * @param binOnHandAvail
     */
    public void setBinOnHandAvail(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binOnHandAvail) {
        this.binOnHandAvail = binOnHandAvail;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBinOnHandAvail(int i) {
        return this.binOnHandAvail[i];
    }

    public void setBinOnHandAvail(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.binOnHandAvail[i] = _value;
    }


    /**
     * Gets the binOnHandCount value for this ItemSearchRowBasic.
     * 
     * @return binOnHandCount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBinOnHandCount() {
        return binOnHandCount;
    }


    /**
     * Sets the binOnHandCount value for this ItemSearchRowBasic.
     * 
     * @param binOnHandCount
     */
    public void setBinOnHandCount(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] binOnHandCount) {
        this.binOnHandCount = binOnHandCount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBinOnHandCount(int i) {
        return this.binOnHandCount[i];
    }

    public void setBinOnHandCount(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.binOnHandCount[i] = _value;
    }


    /**
     * Gets the buildEntireAssembly value for this ItemSearchRowBasic.
     * 
     * @return buildEntireAssembly
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getBuildEntireAssembly() {
        return buildEntireAssembly;
    }


    /**
     * Sets the buildEntireAssembly value for this ItemSearchRowBasic.
     * 
     * @param buildEntireAssembly
     */
    public void setBuildEntireAssembly(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getBuildEntireAssembly(int i) {
        return this.buildEntireAssembly[i];
    }

    public void setBuildEntireAssembly(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.buildEntireAssembly[i] = _value;
    }


    /**
     * Gets the buyItNowPrice value for this ItemSearchRowBasic.
     * 
     * @return buyItNowPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getBuyItNowPrice() {
        return buyItNowPrice;
    }


    /**
     * Sets the buyItNowPrice value for this ItemSearchRowBasic.
     * 
     * @param buyItNowPrice
     */
    public void setBuyItNowPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] buyItNowPrice) {
        this.buyItNowPrice = buyItNowPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getBuyItNowPrice(int i) {
        return this.buyItNowPrice[i];
    }

    public void setBuyItNowPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.buyItNowPrice[i] = _value;
    }


    /**
     * Gets the category value for this ItemSearchRowBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getCategory() {
        return category;
    }


    /**
     * Sets the category value for this ItemSearchRowBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchColumnStringField[] category) {
        this.category = category;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.category[i] = _value;
    }


    /**
     * Gets the _class value for this ItemSearchRowBasic.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this ItemSearchRowBasic.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this._class[i] = _value;
    }


    /**
     * Gets the copyDescription value for this ItemSearchRowBasic.
     * 
     * @return copyDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getCopyDescription() {
        return copyDescription;
    }


    /**
     * Sets the copyDescription value for this ItemSearchRowBasic.
     * 
     * @param copyDescription
     */
    public void setCopyDescription(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] copyDescription) {
        this.copyDescription = copyDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getCopyDescription(int i) {
        return this.copyDescription[i];
    }

    public void setCopyDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.copyDescription[i] = _value;
    }


    /**
     * Gets the cost value for this ItemSearchRowBasic.
     * 
     * @return cost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ItemSearchRowBasic.
     * 
     * @param cost
     */
    public void setCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }


    /**
     * Gets the costEstimate value for this ItemSearchRowBasic.
     * 
     * @return costEstimate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this ItemSearchRowBasic.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] costEstimate) {
        this.costEstimate = costEstimate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getCostEstimate(int i) {
        return this.costEstimate[i];
    }

    public void setCostEstimate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.costEstimate[i] = _value;
    }


    /**
     * Gets the costEstimateType value for this ItemSearchRowBasic.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this ItemSearchRowBasic.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCostEstimateType(int i) {
        return this.costEstimateType[i];
    }

    public void setCostEstimateType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.costEstimateType[i] = _value;
    }


    /**
     * Gets the costingMethod value for this ItemSearchRowBasic.
     * 
     * @return costingMethod
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCostingMethod() {
        return costingMethod;
    }


    /**
     * Sets the costingMethod value for this ItemSearchRowBasic.
     * 
     * @param costingMethod
     */
    public void setCostingMethod(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] costingMethod) {
        this.costingMethod = costingMethod;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCostingMethod(int i) {
        return this.costingMethod[i];
    }

    public void setCostingMethod(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.costingMethod[i] = _value;
    }


    /**
     * Gets the countryOfManufacture value for this ItemSearchRowBasic.
     * 
     * @return countryOfManufacture
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this ItemSearchRowBasic.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getCountryOfManufacture(int i) {
        return this.countryOfManufacture[i];
    }

    public void setCountryOfManufacture(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.countryOfManufacture[i] = _value;
    }


    /**
     * Gets the created value for this ItemSearchRowBasic.
     * 
     * @return created
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getCreated() {
        return created;
    }


    /**
     * Sets the created value for this ItemSearchRowBasic.
     * 
     * @param created
     */
    public void setCreated(org.mule.module.netsuite.api.internal.SearchColumnDateField[] created) {
        this.created = created;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getCreated(int i) {
        return this.created[i];
    }

    public void setCreated(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.created[i] = _value;
    }


    /**
     * Gets the createJob value for this ItemSearchRowBasic.
     * 
     * @return createJob
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getCreateJob() {
        return createJob;
    }


    /**
     * Sets the createJob value for this ItemSearchRowBasic.
     * 
     * @param createJob
     */
    public void setCreateJob(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] createJob) {
        this.createJob = createJob;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getCreateJob(int i) {
        return this.createJob[i];
    }

    public void setCreateJob(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.createJob[i] = _value;
    }


    /**
     * Gets the dateViewed value for this ItemSearchRowBasic.
     * 
     * @return dateViewed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getDateViewed() {
        return dateViewed;
    }


    /**
     * Sets the dateViewed value for this ItemSearchRowBasic.
     * 
     * @param dateViewed
     */
    public void setDateViewed(org.mule.module.netsuite.api.internal.SearchColumnDateField[] dateViewed) {
        this.dateViewed = dateViewed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getDateViewed(int i) {
        return this.dateViewed[i];
    }

    public void setDateViewed(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.dateViewed[i] = _value;
    }


    /**
     * Gets the daysBeforeExpiration value for this ItemSearchRowBasic.
     * 
     * @return daysBeforeExpiration
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }


    /**
     * Sets the daysBeforeExpiration value for this ItemSearchRowBasic.
     * 
     * @param daysBeforeExpiration
     */
    public void setDaysBeforeExpiration(org.mule.module.netsuite.api.internal.SearchColumnStringField[] daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getDaysBeforeExpiration(int i) {
        return this.daysBeforeExpiration[i];
    }

    public void setDaysBeforeExpiration(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.daysBeforeExpiration[i] = _value;
    }


    /**
     * Gets the defaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @return defaultReturnCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDefaultReturnCost() {
        return defaultReturnCost;
    }


    /**
     * Sets the defaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @param defaultReturnCost
     */
    public void setDefaultReturnCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDefaultReturnCost(int i) {
        return this.defaultReturnCost[i];
    }

    public void setDefaultReturnCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.defaultReturnCost[i] = _value;
    }


    /**
     * Gets the deferredExpenseAccount value for this ItemSearchRowBasic.
     * 
     * @return deferredExpenseAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDeferredExpenseAccount() {
        return deferredExpenseAccount;
    }


    /**
     * Sets the deferredExpenseAccount value for this ItemSearchRowBasic.
     * 
     * @param deferredExpenseAccount
     */
    public void setDeferredExpenseAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] deferredExpenseAccount) {
        this.deferredExpenseAccount = deferredExpenseAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDeferredExpenseAccount(int i) {
        return this.deferredExpenseAccount[i];
    }

    public void setDeferredExpenseAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.deferredExpenseAccount[i] = _value;
    }


    /**
     * Gets the deferredRevenueAccount value for this ItemSearchRowBasic.
     * 
     * @return deferredRevenueAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }


    /**
     * Sets the deferredRevenueAccount value for this ItemSearchRowBasic.
     * 
     * @param deferredRevenueAccount
     */
    public void setDeferredRevenueAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDeferredRevenueAccount(int i) {
        return this.deferredRevenueAccount[i];
    }

    public void setDeferredRevenueAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.deferredRevenueAccount[i] = _value;
    }


    /**
     * Gets the demandModifier value for this ItemSearchRowBasic.
     * 
     * @return demandModifier
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getDemandModifier() {
        return demandModifier;
    }


    /**
     * Sets the demandModifier value for this ItemSearchRowBasic.
     * 
     * @param demandModifier
     */
    public void setDemandModifier(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] demandModifier) {
        this.demandModifier = demandModifier;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getDemandModifier(int i) {
        return this.demandModifier[i];
    }

    public void setDemandModifier(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.demandModifier[i] = _value;
    }


    /**
     * Gets the department value for this ItemSearchRowBasic.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this ItemSearchRowBasic.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] department) {
        this.department = department;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.department[i] = _value;
    }


    /**
     * Gets the departmentnohierarchy value for this ItemSearchRowBasic.
     * 
     * @return departmentnohierarchy
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getDepartmentnohierarchy() {
        return departmentnohierarchy;
    }


    /**
     * Sets the departmentnohierarchy value for this ItemSearchRowBasic.
     * 
     * @param departmentnohierarchy
     */
    public void setDepartmentnohierarchy(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] departmentnohierarchy) {
        this.departmentnohierarchy = departmentnohierarchy;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getDepartmentnohierarchy(int i) {
        return this.departmentnohierarchy[i];
    }

    public void setDepartmentnohierarchy(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.departmentnohierarchy[i] = _value;
    }


    /**
     * Gets the displayIneBayStore value for this ItemSearchRowBasic.
     * 
     * @return displayIneBayStore
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getDisplayIneBayStore() {
        return displayIneBayStore;
    }


    /**
     * Sets the displayIneBayStore value for this ItemSearchRowBasic.
     * 
     * @param displayIneBayStore
     */
    public void setDisplayIneBayStore(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] displayIneBayStore) {
        this.displayIneBayStore = displayIneBayStore;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getDisplayIneBayStore(int i) {
        return this.displayIneBayStore[i];
    }

    public void setDisplayIneBayStore(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.displayIneBayStore[i] = _value;
    }


    /**
     * Gets the displayName value for this ItemSearchRowBasic.
     * 
     * @return displayName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this ItemSearchRowBasic.
     * 
     * @param displayName
     */
    public void setDisplayName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] displayName) {
        this.displayName = displayName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getDisplayName(int i) {
        return this.displayName[i];
    }

    public void setDisplayName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.displayName[i] = _value;
    }


    /**
     * Gets the dontShowPrice value for this ItemSearchRowBasic.
     * 
     * @return dontShowPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this ItemSearchRowBasic.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getDontShowPrice(int i) {
        return this.dontShowPrice[i];
    }

    public void setDontShowPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.dontShowPrice[i] = _value;
    }


    /**
     * Gets the eBayItemDescription value for this ItemSearchRowBasic.
     * 
     * @return eBayItemDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEBayItemDescription() {
        return eBayItemDescription;
    }


    /**
     * Sets the eBayItemDescription value for this ItemSearchRowBasic.
     * 
     * @param eBayItemDescription
     */
    public void setEBayItemDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemDescription) {
        this.eBayItemDescription = eBayItemDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getEBayItemDescription(int i) {
        return this.eBayItemDescription[i];
    }

    public void setEBayItemDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.eBayItemDescription[i] = _value;
    }


    /**
     * Gets the eBayItemSubtitle value for this ItemSearchRowBasic.
     * 
     * @return eBayItemSubtitle
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEBayItemSubtitle() {
        return eBayItemSubtitle;
    }


    /**
     * Sets the eBayItemSubtitle value for this ItemSearchRowBasic.
     * 
     * @param eBayItemSubtitle
     */
    public void setEBayItemSubtitle(org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemSubtitle) {
        this.eBayItemSubtitle = eBayItemSubtitle;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getEBayItemSubtitle(int i) {
        return this.eBayItemSubtitle[i];
    }

    public void setEBayItemSubtitle(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.eBayItemSubtitle[i] = _value;
    }


    /**
     * Gets the eBayItemTitle value for this ItemSearchRowBasic.
     * 
     * @return eBayItemTitle
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getEBayItemTitle() {
        return eBayItemTitle;
    }


    /**
     * Sets the eBayItemTitle value for this ItemSearchRowBasic.
     * 
     * @param eBayItemTitle
     */
    public void setEBayItemTitle(org.mule.module.netsuite.api.internal.SearchColumnStringField[] eBayItemTitle) {
        this.eBayItemTitle = eBayItemTitle;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getEBayItemTitle(int i) {
        return this.eBayItemTitle[i];
    }

    public void setEBayItemTitle(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.eBayItemTitle[i] = _value;
    }


    /**
     * Gets the ebayRelistingOption value for this ItemSearchRowBasic.
     * 
     * @return ebayRelistingOption
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getEbayRelistingOption() {
        return ebayRelistingOption;
    }


    /**
     * Sets the ebayRelistingOption value for this ItemSearchRowBasic.
     * 
     * @param ebayRelistingOption
     */
    public void setEbayRelistingOption(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] ebayRelistingOption) {
        this.ebayRelistingOption = ebayRelistingOption;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getEbayRelistingOption(int i) {
        return this.ebayRelistingOption[i];
    }

    public void setEbayRelistingOption(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.ebayRelistingOption[i] = _value;
    }


    /**
     * Gets the endAuctionsWhenOutOfStock value for this ItemSearchRowBasic.
     * 
     * @return endAuctionsWhenOutOfStock
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getEndAuctionsWhenOutOfStock() {
        return endAuctionsWhenOutOfStock;
    }


    /**
     * Sets the endAuctionsWhenOutOfStock value for this ItemSearchRowBasic.
     * 
     * @param endAuctionsWhenOutOfStock
     */
    public void setEndAuctionsWhenOutOfStock(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] endAuctionsWhenOutOfStock) {
        this.endAuctionsWhenOutOfStock = endAuctionsWhenOutOfStock;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getEndAuctionsWhenOutOfStock(int i) {
        return this.endAuctionsWhenOutOfStock[i];
    }

    public void setEndAuctionsWhenOutOfStock(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.endAuctionsWhenOutOfStock[i] = _value;
    }


    /**
     * Gets the excludeFromSitemap value for this ItemSearchRowBasic.
     * 
     * @return excludeFromSitemap
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this ItemSearchRowBasic.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getExcludeFromSitemap(int i) {
        return this.excludeFromSitemap[i];
    }

    public void setExcludeFromSitemap(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.excludeFromSitemap[i] = _value;
    }


    /**
     * Gets the expenseAccount value for this ItemSearchRowBasic.
     * 
     * @return expenseAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExpenseAccount() {
        return expenseAccount;
    }


    /**
     * Sets the expenseAccount value for this ItemSearchRowBasic.
     * 
     * @param expenseAccount
     */
    public void setExpenseAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getExpenseAccount(int i) {
        return this.expenseAccount[i];
    }

    public void setExpenseAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.expenseAccount[i] = _value;
    }


    /**
     * Gets the externalId value for this ItemSearchRowBasic.
     * 
     * @return externalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemSearchRowBasic.
     * 
     * @param externalId
     */
    public void setExternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }


    /**
     * Gets the featuredDescription value for this ItemSearchRowBasic.
     * 
     * @return featuredDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this ItemSearchRowBasic.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] featuredDescription) {
        this.featuredDescription = featuredDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getFeaturedDescription(int i) {
        return this.featuredDescription[i];
    }

    public void setFeaturedDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.featuredDescription[i] = _value;
    }


    /**
     * Gets the feedDescription value for this ItemSearchRowBasic.
     * 
     * @return feedDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFeedDescription() {
        return feedDescription;
    }


    /**
     * Sets the feedDescription value for this ItemSearchRowBasic.
     * 
     * @param feedDescription
     */
    public void setFeedDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] feedDescription) {
        this.feedDescription = feedDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getFeedDescription(int i) {
        return this.feedDescription[i];
    }

    public void setFeedDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.feedDescription[i] = _value;
    }


    /**
     * Gets the feedName value for this ItemSearchRowBasic.
     * 
     * @return feedName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getFeedName() {
        return feedName;
    }


    /**
     * Sets the feedName value for this ItemSearchRowBasic.
     * 
     * @param feedName
     */
    public void setFeedName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] feedName) {
        this.feedName = feedName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getFeedName(int i) {
        return this.feedName[i];
    }

    public void setFeedName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.feedName[i] = _value;
    }


    /**
     * Gets the froogleProductFeed value for this ItemSearchRowBasic.
     * 
     * @return froogleProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getFroogleProductFeed() {
        return froogleProductFeed;
    }


    /**
     * Sets the froogleProductFeed value for this ItemSearchRowBasic.
     * 
     * @param froogleProductFeed
     */
    public void setFroogleProductFeed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] froogleProductFeed) {
        this.froogleProductFeed = froogleProductFeed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getFroogleProductFeed(int i) {
        return this.froogleProductFeed[i];
    }

    public void setFroogleProductFeed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.froogleProductFeed[i] = _value;
    }


    /**
     * Gets the fxCost value for this ItemSearchRowBasic.
     * 
     * @return fxCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getFxCost() {
        return fxCost;
    }


    /**
     * Sets the fxCost value for this ItemSearchRowBasic.
     * 
     * @param fxCost
     */
    public void setFxCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] fxCost) {
        this.fxCost = fxCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getFxCost(int i) {
        return this.fxCost[i];
    }

    public void setFxCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.fxCost[i] = _value;
    }


    /**
     * Gets the gainLossAccount value for this ItemSearchRowBasic.
     * 
     * @return gainLossAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getGainLossAccount() {
        return gainLossAccount;
    }


    /**
     * Sets the gainLossAccount value for this ItemSearchRowBasic.
     * 
     * @param gainLossAccount
     */
    public void setGainLossAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] gainLossAccount) {
        this.gainLossAccount = gainLossAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getGainLossAccount(int i) {
        return this.gainLossAccount[i];
    }

    public void setGainLossAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.gainLossAccount[i] = _value;
    }


    /**
     * Gets the giftCertAuthCode value for this ItemSearchRowBasic.
     * 
     * @return giftCertAuthCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCertAuthCode() {
        return giftCertAuthCode;
    }


    /**
     * Sets the giftCertAuthCode value for this ItemSearchRowBasic.
     * 
     * @param giftCertAuthCode
     */
    public void setGiftCertAuthCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertAuthCode) {
        this.giftCertAuthCode = giftCertAuthCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCertAuthCode(int i) {
        return this.giftCertAuthCode[i];
    }

    public void setGiftCertAuthCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCertAuthCode[i] = _value;
    }


    /**
     * Gets the giftCertEmail value for this ItemSearchRowBasic.
     * 
     * @return giftCertEmail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCertEmail() {
        return giftCertEmail;
    }


    /**
     * Sets the giftCertEmail value for this ItemSearchRowBasic.
     * 
     * @param giftCertEmail
     */
    public void setGiftCertEmail(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertEmail) {
        this.giftCertEmail = giftCertEmail;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCertEmail(int i) {
        return this.giftCertEmail[i];
    }

    public void setGiftCertEmail(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCertEmail[i] = _value;
    }


    /**
     * Gets the giftCertExpirationDate value for this ItemSearchRowBasic.
     * 
     * @return giftCertExpirationDate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCertExpirationDate() {
        return giftCertExpirationDate;
    }


    /**
     * Sets the giftCertExpirationDate value for this ItemSearchRowBasic.
     * 
     * @param giftCertExpirationDate
     */
    public void setGiftCertExpirationDate(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertExpirationDate) {
        this.giftCertExpirationDate = giftCertExpirationDate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCertExpirationDate(int i) {
        return this.giftCertExpirationDate[i];
    }

    public void setGiftCertExpirationDate(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCertExpirationDate[i] = _value;
    }


    /**
     * Gets the giftCertFrom value for this ItemSearchRowBasic.
     * 
     * @return giftCertFrom
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCertFrom() {
        return giftCertFrom;
    }


    /**
     * Sets the giftCertFrom value for this ItemSearchRowBasic.
     * 
     * @param giftCertFrom
     */
    public void setGiftCertFrom(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCertFrom(int i) {
        return this.giftCertFrom[i];
    }

    public void setGiftCertFrom(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCertFrom[i] = _value;
    }


    /**
     * Gets the giftCertMessage value for this ItemSearchRowBasic.
     * 
     * @return giftCertMessage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCertMessage() {
        return giftCertMessage;
    }


    /**
     * Sets the giftCertMessage value for this ItemSearchRowBasic.
     * 
     * @param giftCertMessage
     */
    public void setGiftCertMessage(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertMessage) {
        this.giftCertMessage = giftCertMessage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCertMessage(int i) {
        return this.giftCertMessage[i];
    }

    public void setGiftCertMessage(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCertMessage[i] = _value;
    }


    /**
     * Gets the giftCertOriginalAmount value for this ItemSearchRowBasic.
     * 
     * @return giftCertOriginalAmount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCertOriginalAmount() {
        return giftCertOriginalAmount;
    }


    /**
     * Sets the giftCertOriginalAmount value for this ItemSearchRowBasic.
     * 
     * @param giftCertOriginalAmount
     */
    public void setGiftCertOriginalAmount(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertOriginalAmount) {
        this.giftCertOriginalAmount = giftCertOriginalAmount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCertOriginalAmount(int i) {
        return this.giftCertOriginalAmount[i];
    }

    public void setGiftCertOriginalAmount(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCertOriginalAmount[i] = _value;
    }


    /**
     * Gets the giftCertRecipient value for this ItemSearchRowBasic.
     * 
     * @return giftCertRecipient
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getGiftCertRecipient() {
        return giftCertRecipient;
    }


    /**
     * Sets the giftCertRecipient value for this ItemSearchRowBasic.
     * 
     * @param giftCertRecipient
     */
    public void setGiftCertRecipient(org.mule.module.netsuite.api.internal.SearchColumnStringField[] giftCertRecipient) {
        this.giftCertRecipient = giftCertRecipient;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getGiftCertRecipient(int i) {
        return this.giftCertRecipient[i];
    }

    public void setGiftCertRecipient(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.giftCertRecipient[i] = _value;
    }


    /**
     * Gets the hits value for this ItemSearchRowBasic.
     * 
     * @return hits
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this ItemSearchRowBasic.
     * 
     * @param hits
     */
    public void setHits(org.mule.module.netsuite.api.internal.SearchColumnLongField[] hits) {
        this.hits = hits;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getHits(int i) {
        return this.hits[i];
    }

    public void setHits(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.hits[i] = _value;
    }


    /**
     * Gets the imageUrl value for this ItemSearchRowBasic.
     * 
     * @return imageUrl
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getImageUrl() {
        return imageUrl;
    }


    /**
     * Sets the imageUrl value for this ItemSearchRowBasic.
     * 
     * @param imageUrl
     */
    public void setImageUrl(org.mule.module.netsuite.api.internal.SearchColumnStringField[] imageUrl) {
        this.imageUrl = imageUrl;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getImageUrl(int i) {
        return this.imageUrl[i];
    }

    public void setImageUrl(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.imageUrl[i] = _value;
    }


    /**
     * Gets the incomeAccount value for this ItemSearchRowBasic.
     * 
     * @return incomeAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this ItemSearchRowBasic.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getIncomeAccount(int i) {
        return this.incomeAccount[i];
    }

    public void setIncomeAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.incomeAccount[i] = _value;
    }


    /**
     * Gets the internalId value for this ItemSearchRowBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemSearchRowBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }


    /**
     * Gets the inventoryLocation value for this ItemSearchRowBasic.
     * 
     * @return inventoryLocation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getInventoryLocation() {
        return inventoryLocation;
    }


    /**
     * Sets the inventoryLocation value for this ItemSearchRowBasic.
     * 
     * @param inventoryLocation
     */
    public void setInventoryLocation(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getInventoryLocation(int i) {
        return this.inventoryLocation[i];
    }

    public void setInventoryLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.inventoryLocation[i] = _value;
    }


    /**
     * Gets the isAvailable value for this ItemSearchRowBasic.
     * 
     * @return isAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsAvailable() {
        return isAvailable;
    }


    /**
     * Sets the isAvailable value for this ItemSearchRowBasic.
     * 
     * @param isAvailable
     */
    public void setIsAvailable(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isAvailable) {
        this.isAvailable = isAvailable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsAvailable(int i) {
        return this.isAvailable[i];
    }

    public void setIsAvailable(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isAvailable[i] = _value;
    }


    /**
     * Gets the isDropShipItem value for this ItemSearchRowBasic.
     * 
     * @return isDropShipItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsDropShipItem() {
        return isDropShipItem;
    }


    /**
     * Sets the isDropShipItem value for this ItemSearchRowBasic.
     * 
     * @param isDropShipItem
     */
    public void setIsDropShipItem(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isDropShipItem) {
        this.isDropShipItem = isDropShipItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsDropShipItem(int i) {
        return this.isDropShipItem[i];
    }

    public void setIsDropShipItem(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isDropShipItem[i] = _value;
    }


    /**
     * Gets the isFulfillable value for this ItemSearchRowBasic.
     * 
     * @return isFulfillable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this ItemSearchRowBasic.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsFulfillable(int i) {
        return this.isFulfillable[i];
    }

    public void setIsFulfillable(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isFulfillable[i] = _value;
    }


    /**
     * Gets the isGcoCompliant value for this ItemSearchRowBasic.
     * 
     * @return isGcoCompliant
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this ItemSearchRowBasic.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsGcoCompliant(int i) {
        return this.isGcoCompliant[i];
    }

    public void setIsGcoCompliant(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isGcoCompliant[i] = _value;
    }


    /**
     * Gets the isInactive value for this ItemSearchRowBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this ItemSearchRowBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }


    /**
     * Gets the isOnline value for this ItemSearchRowBasic.
     * 
     * @return isOnline
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this ItemSearchRowBasic.
     * 
     * @param isOnline
     */
    public void setIsOnline(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isOnline) {
        this.isOnline = isOnline;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsOnline(int i) {
        return this.isOnline[i];
    }

    public void setIsOnline(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isOnline[i] = _value;
    }


    /**
     * Gets the isSpecialOrderItem value for this ItemSearchRowBasic.
     * 
     * @return isSpecialOrderItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsSpecialOrderItem() {
        return isSpecialOrderItem;
    }


    /**
     * Sets the isSpecialOrderItem value for this ItemSearchRowBasic.
     * 
     * @param isSpecialOrderItem
     */
    public void setIsSpecialOrderItem(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSpecialOrderItem) {
        this.isSpecialOrderItem = isSpecialOrderItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsSpecialOrderItem(int i) {
        return this.isSpecialOrderItem[i];
    }

    public void setIsSpecialOrderItem(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isSpecialOrderItem[i] = _value;
    }


    /**
     * Gets the isSpecialWorkOrderItem value for this ItemSearchRowBasic.
     * 
     * @return isSpecialWorkOrderItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsSpecialWorkOrderItem() {
        return isSpecialWorkOrderItem;
    }


    /**
     * Sets the isSpecialWorkOrderItem value for this ItemSearchRowBasic.
     * 
     * @param isSpecialWorkOrderItem
     */
    public void setIsSpecialWorkOrderItem(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isSpecialWorkOrderItem) {
        this.isSpecialWorkOrderItem = isSpecialWorkOrderItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsSpecialWorkOrderItem(int i) {
        return this.isSpecialWorkOrderItem[i];
    }

    public void setIsSpecialWorkOrderItem(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isSpecialWorkOrderItem[i] = _value;
    }


    /**
     * Gets the issueProduct value for this ItemSearchRowBasic.
     * 
     * @return issueProduct
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this ItemSearchRowBasic.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] issueProduct) {
        this.issueProduct = issueProduct;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getIssueProduct(int i) {
        return this.issueProduct[i];
    }

    public void setIssueProduct(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.issueProduct[i] = _value;
    }


    /**
     * Gets the isTaxable value for this ItemSearchRowBasic.
     * 
     * @return isTaxable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this ItemSearchRowBasic.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isTaxable) {
        this.isTaxable = isTaxable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsTaxable(int i) {
        return this.isTaxable[i];
    }

    public void setIsTaxable(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isTaxable[i] = _value;
    }


    /**
     * Gets the isVsoeBundle value for this ItemSearchRowBasic.
     * 
     * @return isVsoeBundle
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getIsVsoeBundle() {
        return isVsoeBundle;
    }


    /**
     * Sets the isVsoeBundle value for this ItemSearchRowBasic.
     * 
     * @param isVsoeBundle
     */
    public void setIsVsoeBundle(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] isVsoeBundle) {
        this.isVsoeBundle = isVsoeBundle;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getIsVsoeBundle(int i) {
        return this.isVsoeBundle[i];
    }

    public void setIsVsoeBundle(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.isVsoeBundle[i] = _value;
    }


    /**
     * Gets the itemId value for this ItemSearchRowBasic.
     * 
     * @return itemId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this ItemSearchRowBasic.
     * 
     * @param itemId
     */
    public void setItemId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemId) {
        this.itemId = itemId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getItemId(int i) {
        return this.itemId[i];
    }

    public void setItemId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.itemId[i] = _value;
    }


    /**
     * Gets the itemUrl value for this ItemSearchRowBasic.
     * 
     * @return itemUrl
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getItemUrl() {
        return itemUrl;
    }


    /**
     * Sets the itemUrl value for this ItemSearchRowBasic.
     * 
     * @param itemUrl
     */
    public void setItemUrl(org.mule.module.netsuite.api.internal.SearchColumnStringField[] itemUrl) {
        this.itemUrl = itemUrl;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getItemUrl(int i) {
        return this.itemUrl[i];
    }

    public void setItemUrl(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.itemUrl[i] = _value;
    }


    /**
     * Gets the lastPurchasePrice value for this ItemSearchRowBasic.
     * 
     * @return lastPurchasePrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLastPurchasePrice() {
        return lastPurchasePrice;
    }


    /**
     * Sets the lastPurchasePrice value for this ItemSearchRowBasic.
     * 
     * @param lastPurchasePrice
     */
    public void setLastPurchasePrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLastPurchasePrice(int i) {
        return this.lastPurchasePrice[i];
    }

    public void setLastPurchasePrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.lastPurchasePrice[i] = _value;
    }


    /**
     * Gets the lastQuantityAvailableChange value for this ItemSearchRowBasic.
     * 
     * @return lastQuantityAvailableChange
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getLastQuantityAvailableChange() {
        return lastQuantityAvailableChange;
    }


    /**
     * Sets the lastQuantityAvailableChange value for this ItemSearchRowBasic.
     * 
     * @param lastQuantityAvailableChange
     */
    public void setLastQuantityAvailableChange(org.mule.module.netsuite.api.internal.SearchColumnDateField[] lastQuantityAvailableChange) {
        this.lastQuantityAvailableChange = lastQuantityAvailableChange;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getLastQuantityAvailableChange(int i) {
        return this.lastQuantityAvailableChange[i];
    }

    public void setLastQuantityAvailableChange(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.lastQuantityAvailableChange[i] = _value;
    }


    /**
     * Gets the leadTime value for this ItemSearchRowBasic.
     * 
     * @return leadTime
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getLeadTime() {
        return leadTime;
    }


    /**
     * Sets the leadTime value for this ItemSearchRowBasic.
     * 
     * @param leadTime
     */
    public void setLeadTime(org.mule.module.netsuite.api.internal.SearchColumnLongField[] leadTime) {
        this.leadTime = leadTime;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getLeadTime(int i) {
        return this.leadTime[i];
    }

    public void setLeadTime(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.leadTime[i] = _value;
    }


    /**
     * Gets the liabilityAccount value for this ItemSearchRowBasic.
     * 
     * @return liabilityAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLiabilityAccount() {
        return liabilityAccount;
    }


    /**
     * Sets the liabilityAccount value for this ItemSearchRowBasic.
     * 
     * @param liabilityAccount
     */
    public void setLiabilityAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getLiabilityAccount(int i) {
        return this.liabilityAccount[i];
    }

    public void setLiabilityAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.liabilityAccount[i] = _value;
    }


    /**
     * Gets the listingDuration value for this ItemSearchRowBasic.
     * 
     * @return listingDuration
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getListingDuration() {
        return listingDuration;
    }


    /**
     * Sets the listingDuration value for this ItemSearchRowBasic.
     * 
     * @param listingDuration
     */
    public void setListingDuration(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] listingDuration) {
        this.listingDuration = listingDuration;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getListingDuration(int i) {
        return this.listingDuration[i];
    }

    public void setListingDuration(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.listingDuration[i] = _value;
    }


    /**
     * Gets the location value for this ItemSearchRowBasic.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getLocation() {
        return location;
    }


    /**
     * Sets the location value for this ItemSearchRowBasic.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] location) {
        this.location = location;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.location[i] = _value;
    }


    /**
     * Gets the locationAverageCost value for this ItemSearchRowBasic.
     * 
     * @return locationAverageCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationAverageCost() {
        return locationAverageCost;
    }


    /**
     * Sets the locationAverageCost value for this ItemSearchRowBasic.
     * 
     * @param locationAverageCost
     */
    public void setLocationAverageCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationAverageCost) {
        this.locationAverageCost = locationAverageCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationAverageCost(int i) {
        return this.locationAverageCost[i];
    }

    public void setLocationAverageCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationAverageCost[i] = _value;
    }


    /**
     * Gets the locationBinQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @return locationBinQuantityAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationBinQuantityAvailable() {
        return locationBinQuantityAvailable;
    }


    /**
     * Sets the locationBinQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @param locationBinQuantityAvailable
     */
    public void setLocationBinQuantityAvailable(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationBinQuantityAvailable) {
        this.locationBinQuantityAvailable = locationBinQuantityAvailable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationBinQuantityAvailable(int i) {
        return this.locationBinQuantityAvailable[i];
    }

    public void setLocationBinQuantityAvailable(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationBinQuantityAvailable[i] = _value;
    }


    /**
     * Gets the locationDefaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @return locationDefaultReturnCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationDefaultReturnCost() {
        return locationDefaultReturnCost;
    }


    /**
     * Sets the locationDefaultReturnCost value for this ItemSearchRowBasic.
     * 
     * @param locationDefaultReturnCost
     */
    public void setLocationDefaultReturnCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationDefaultReturnCost) {
        this.locationDefaultReturnCost = locationDefaultReturnCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationDefaultReturnCost(int i) {
        return this.locationDefaultReturnCost[i];
    }

    public void setLocationDefaultReturnCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationDefaultReturnCost[i] = _value;
    }


    /**
     * Gets the locationPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @return locationPreferredStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationPreferredStockLevel() {
        return locationPreferredStockLevel;
    }


    /**
     * Sets the locationPreferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @param locationPreferredStockLevel
     */
    public void setLocationPreferredStockLevel(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationPreferredStockLevel) {
        this.locationPreferredStockLevel = locationPreferredStockLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationPreferredStockLevel(int i) {
        return this.locationPreferredStockLevel[i];
    }

    public void setLocationPreferredStockLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationPreferredStockLevel[i] = _value;
    }


    /**
     * Gets the locationQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationQuantityAvailable() {
        return locationQuantityAvailable;
    }


    /**
     * Sets the locationQuantityAvailable value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityAvailable
     */
    public void setLocationQuantityAvailable(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityAvailable) {
        this.locationQuantityAvailable = locationQuantityAvailable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationQuantityAvailable(int i) {
        return this.locationQuantityAvailable[i];
    }

    public void setLocationQuantityAvailable(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationQuantityAvailable[i] = _value;
    }


    /**
     * Gets the locationQuantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityBackOrdered
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationQuantityBackOrdered() {
        return locationQuantityBackOrdered;
    }


    /**
     * Sets the locationQuantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityBackOrdered
     */
    public void setLocationQuantityBackOrdered(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityBackOrdered) {
        this.locationQuantityBackOrdered = locationQuantityBackOrdered;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationQuantityBackOrdered(int i) {
        return this.locationQuantityBackOrdered[i];
    }

    public void setLocationQuantityBackOrdered(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationQuantityBackOrdered[i] = _value;
    }


    /**
     * Gets the locationQuantityCommitted value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationQuantityCommitted() {
        return locationQuantityCommitted;
    }


    /**
     * Sets the locationQuantityCommitted value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityCommitted
     */
    public void setLocationQuantityCommitted(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityCommitted) {
        this.locationQuantityCommitted = locationQuantityCommitted;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationQuantityCommitted(int i) {
        return this.locationQuantityCommitted[i];
    }

    public void setLocationQuantityCommitted(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationQuantityCommitted[i] = _value;
    }


    /**
     * Gets the locationQuantityInTransit value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityInTransit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationQuantityInTransit() {
        return locationQuantityInTransit;
    }


    /**
     * Sets the locationQuantityInTransit value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityInTransit
     */
    public void setLocationQuantityInTransit(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityInTransit) {
        this.locationQuantityInTransit = locationQuantityInTransit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationQuantityInTransit(int i) {
        return this.locationQuantityInTransit[i];
    }

    public void setLocationQuantityInTransit(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationQuantityInTransit[i] = _value;
    }


    /**
     * Gets the locationQuantityOnHand value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityOnHand
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationQuantityOnHand() {
        return locationQuantityOnHand;
    }


    /**
     * Sets the locationQuantityOnHand value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityOnHand
     */
    public void setLocationQuantityOnHand(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityOnHand) {
        this.locationQuantityOnHand = locationQuantityOnHand;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationQuantityOnHand(int i) {
        return this.locationQuantityOnHand[i];
    }

    public void setLocationQuantityOnHand(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationQuantityOnHand[i] = _value;
    }


    /**
     * Gets the locationQuantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @return locationQuantityOnOrder
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationQuantityOnOrder() {
        return locationQuantityOnOrder;
    }


    /**
     * Sets the locationQuantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @param locationQuantityOnOrder
     */
    public void setLocationQuantityOnOrder(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationQuantityOnOrder) {
        this.locationQuantityOnOrder = locationQuantityOnOrder;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationQuantityOnOrder(int i) {
        return this.locationQuantityOnOrder[i];
    }

    public void setLocationQuantityOnOrder(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationQuantityOnOrder[i] = _value;
    }


    /**
     * Gets the locationReOrderPoint value for this ItemSearchRowBasic.
     * 
     * @return locationReOrderPoint
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationReOrderPoint() {
        return locationReOrderPoint;
    }


    /**
     * Sets the locationReOrderPoint value for this ItemSearchRowBasic.
     * 
     * @param locationReOrderPoint
     */
    public void setLocationReOrderPoint(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationReOrderPoint) {
        this.locationReOrderPoint = locationReOrderPoint;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationReOrderPoint(int i) {
        return this.locationReOrderPoint[i];
    }

    public void setLocationReOrderPoint(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationReOrderPoint[i] = _value;
    }


    /**
     * Gets the locationTotalValue value for this ItemSearchRowBasic.
     * 
     * @return locationTotalValue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getLocationTotalValue() {
        return locationTotalValue;
    }


    /**
     * Sets the locationTotalValue value for this ItemSearchRowBasic.
     * 
     * @param locationTotalValue
     */
    public void setLocationTotalValue(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] locationTotalValue) {
        this.locationTotalValue = locationTotalValue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getLocationTotalValue(int i) {
        return this.locationTotalValue[i];
    }

    public void setLocationTotalValue(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.locationTotalValue[i] = _value;
    }


    /**
     * Gets the manufacturer value for this ItemSearchRowBasic.
     * 
     * @return manufacturer
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this ItemSearchRowBasic.
     * 
     * @param manufacturer
     */
    public void setManufacturer(org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturer) {
        this.manufacturer = manufacturer;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getManufacturer(int i) {
        return this.manufacturer[i];
    }

    public void setManufacturer(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.manufacturer[i] = _value;
    }


    /**
     * Gets the manufacturerAddr1 value for this ItemSearchRowBasic.
     * 
     * @return manufacturerAddr1
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getManufacturerAddr1() {
        return manufacturerAddr1;
    }


    /**
     * Sets the manufacturerAddr1 value for this ItemSearchRowBasic.
     * 
     * @param manufacturerAddr1
     */
    public void setManufacturerAddr1(org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerAddr1) {
        this.manufacturerAddr1 = manufacturerAddr1;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getManufacturerAddr1(int i) {
        return this.manufacturerAddr1[i];
    }

    public void setManufacturerAddr1(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.manufacturerAddr1[i] = _value;
    }


    /**
     * Gets the manufacturerCity value for this ItemSearchRowBasic.
     * 
     * @return manufacturerCity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getManufacturerCity() {
        return manufacturerCity;
    }


    /**
     * Sets the manufacturerCity value for this ItemSearchRowBasic.
     * 
     * @param manufacturerCity
     */
    public void setManufacturerCity(org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getManufacturerCity(int i) {
        return this.manufacturerCity[i];
    }

    public void setManufacturerCity(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.manufacturerCity[i] = _value;
    }


    /**
     * Gets the manufacturerState value for this ItemSearchRowBasic.
     * 
     * @return manufacturerState
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getManufacturerState() {
        return manufacturerState;
    }


    /**
     * Sets the manufacturerState value for this ItemSearchRowBasic.
     * 
     * @param manufacturerState
     */
    public void setManufacturerState(org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerState) {
        this.manufacturerState = manufacturerState;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getManufacturerState(int i) {
        return this.manufacturerState[i];
    }

    public void setManufacturerState(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.manufacturerState[i] = _value;
    }


    /**
     * Gets the manufacturerTariff value for this ItemSearchRowBasic.
     * 
     * @return manufacturerTariff
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getManufacturerTariff() {
        return manufacturerTariff;
    }


    /**
     * Sets the manufacturerTariff value for this ItemSearchRowBasic.
     * 
     * @param manufacturerTariff
     */
    public void setManufacturerTariff(org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getManufacturerTariff(int i) {
        return this.manufacturerTariff[i];
    }

    public void setManufacturerTariff(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.manufacturerTariff[i] = _value;
    }


    /**
     * Gets the manufacturerTaxId value for this ItemSearchRowBasic.
     * 
     * @return manufacturerTaxId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getManufacturerTaxId() {
        return manufacturerTaxId;
    }


    /**
     * Sets the manufacturerTaxId value for this ItemSearchRowBasic.
     * 
     * @param manufacturerTaxId
     */
    public void setManufacturerTaxId(org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getManufacturerTaxId(int i) {
        return this.manufacturerTaxId[i];
    }

    public void setManufacturerTaxId(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.manufacturerTaxId[i] = _value;
    }


    /**
     * Gets the manufacturerZip value for this ItemSearchRowBasic.
     * 
     * @return manufacturerZip
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getManufacturerZip() {
        return manufacturerZip;
    }


    /**
     * Sets the manufacturerZip value for this ItemSearchRowBasic.
     * 
     * @param manufacturerZip
     */
    public void setManufacturerZip(org.mule.module.netsuite.api.internal.SearchColumnStringField[] manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getManufacturerZip(int i) {
        return this.manufacturerZip[i];
    }

    public void setManufacturerZip(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.manufacturerZip[i] = _value;
    }


    /**
     * Gets the matchBillToReceipt value for this ItemSearchRowBasic.
     * 
     * @return matchBillToReceipt
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getMatchBillToReceipt() {
        return matchBillToReceipt;
    }


    /**
     * Sets the matchBillToReceipt value for this ItemSearchRowBasic.
     * 
     * @param matchBillToReceipt
     */
    public void setMatchBillToReceipt(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getMatchBillToReceipt(int i) {
        return this.matchBillToReceipt[i];
    }

    public void setMatchBillToReceipt(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.matchBillToReceipt[i] = _value;
    }


    /**
     * Gets the memberItem value for this ItemSearchRowBasic.
     * 
     * @return memberItem
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getMemberItem() {
        return memberItem;
    }


    /**
     * Sets the memberItem value for this ItemSearchRowBasic.
     * 
     * @param memberItem
     */
    public void setMemberItem(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] memberItem) {
        this.memberItem = memberItem;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getMemberItem(int i) {
        return this.memberItem[i];
    }

    public void setMemberItem(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.memberItem[i] = _value;
    }


    /**
     * Gets the memberQuantity value for this ItemSearchRowBasic.
     * 
     * @return memberQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getMemberQuantity() {
        return memberQuantity;
    }


    /**
     * Sets the memberQuantity value for this ItemSearchRowBasic.
     * 
     * @param memberQuantity
     */
    public void setMemberQuantity(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] memberQuantity) {
        this.memberQuantity = memberQuantity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getMemberQuantity(int i) {
        return this.memberQuantity[i];
    }

    public void setMemberQuantity(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.memberQuantity[i] = _value;
    }


    /**
     * Gets the metaTagHtml value for this ItemSearchRowBasic.
     * 
     * @return metaTagHtml
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this ItemSearchRowBasic.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(org.mule.module.netsuite.api.internal.SearchColumnStringField[] metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMetaTagHtml(int i) {
        return this.metaTagHtml[i];
    }

    public void setMetaTagHtml(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.metaTagHtml[i] = _value;
    }


    /**
     * Gets the minimumQuantity value for this ItemSearchRowBasic.
     * 
     * @return minimumQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this ItemSearchRowBasic.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(org.mule.module.netsuite.api.internal.SearchColumnStringField[] minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMinimumQuantity(int i) {
        return this.minimumQuantity[i];
    }

    public void setMinimumQuantity(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.minimumQuantity[i] = _value;
    }


    /**
     * Gets the modified value for this ItemSearchRowBasic.
     * 
     * @return modified
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDateField[] getModified() {
        return modified;
    }


    /**
     * Sets the modified value for this ItemSearchRowBasic.
     * 
     * @param modified
     */
    public void setModified(org.mule.module.netsuite.api.internal.SearchColumnDateField[] modified) {
        this.modified = modified;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDateField getModified(int i) {
        return this.modified[i];
    }

    public void setModified(int i, org.mule.module.netsuite.api.internal.SearchColumnDateField _value) {
        this.modified[i] = _value;
    }


    /**
     * Gets the mpn value for this ItemSearchRowBasic.
     * 
     * @return mpn
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getMpn() {
        return mpn;
    }


    /**
     * Sets the mpn value for this ItemSearchRowBasic.
     * 
     * @param mpn
     */
    public void setMpn(org.mule.module.netsuite.api.internal.SearchColumnStringField[] mpn) {
        this.mpn = mpn;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getMpn(int i) {
        return this.mpn[i];
    }

    public void setMpn(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.mpn[i] = _value;
    }


    /**
     * Gets the multManufactureAddr value for this ItemSearchRowBasic.
     * 
     * @return multManufactureAddr
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getMultManufactureAddr() {
        return multManufactureAddr;
    }


    /**
     * Sets the multManufactureAddr value for this ItemSearchRowBasic.
     * 
     * @param multManufactureAddr
     */
    public void setMultManufactureAddr(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getMultManufactureAddr(int i) {
        return this.multManufactureAddr[i];
    }

    public void setMultManufactureAddr(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.multManufactureAddr[i] = _value;
    }


    /**
     * Gets the nextagCategory value for this ItemSearchRowBasic.
     * 
     * @return nextagCategory
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNextagCategory() {
        return nextagCategory;
    }


    /**
     * Sets the nextagCategory value for this ItemSearchRowBasic.
     * 
     * @param nextagCategory
     */
    public void setNextagCategory(org.mule.module.netsuite.api.internal.SearchColumnStringField[] nextagCategory) {
        this.nextagCategory = nextagCategory;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNextagCategory(int i) {
        return this.nextagCategory[i];
    }

    public void setNextagCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.nextagCategory[i] = _value;
    }


    /**
     * Gets the nextagProductFeed value for this ItemSearchRowBasic.
     * 
     * @return nextagProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getNextagProductFeed() {
        return nextagProductFeed;
    }


    /**
     * Sets the nextagProductFeed value for this ItemSearchRowBasic.
     * 
     * @param nextagProductFeed
     */
    public void setNextagProductFeed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] nextagProductFeed) {
        this.nextagProductFeed = nextagProductFeed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getNextagProductFeed(int i) {
        return this.nextagProductFeed[i];
    }

    public void setNextagProductFeed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.nextagProductFeed[i] = _value;
    }


    /**
     * Gets the noPriceMessage value for this ItemSearchRowBasic.
     * 
     * @return noPriceMessage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNoPriceMessage() {
        return noPriceMessage;
    }


    /**
     * Sets the noPriceMessage value for this ItemSearchRowBasic.
     * 
     * @param noPriceMessage
     */
    public void setNoPriceMessage(org.mule.module.netsuite.api.internal.SearchColumnStringField[] noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNoPriceMessage(int i) {
        return this.noPriceMessage[i];
    }

    public void setNoPriceMessage(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.noPriceMessage[i] = _value;
    }


    /**
     * Gets the numActiveListings value for this ItemSearchRowBasic.
     * 
     * @return numActiveListings
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getNumActiveListings() {
        return numActiveListings;
    }


    /**
     * Sets the numActiveListings value for this ItemSearchRowBasic.
     * 
     * @param numActiveListings
     */
    public void setNumActiveListings(org.mule.module.netsuite.api.internal.SearchColumnLongField[] numActiveListings) {
        this.numActiveListings = numActiveListings;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getNumActiveListings(int i) {
        return this.numActiveListings[i];
    }

    public void setNumActiveListings(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.numActiveListings[i] = _value;
    }


    /**
     * Gets the numberAllowedDownloads value for this ItemSearchRowBasic.
     * 
     * @return numberAllowedDownloads
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getNumberAllowedDownloads() {
        return numberAllowedDownloads;
    }


    /**
     * Sets the numberAllowedDownloads value for this ItemSearchRowBasic.
     * 
     * @param numberAllowedDownloads
     */
    public void setNumberAllowedDownloads(org.mule.module.netsuite.api.internal.SearchColumnStringField[] numberAllowedDownloads) {
        this.numberAllowedDownloads = numberAllowedDownloads;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getNumberAllowedDownloads(int i) {
        return this.numberAllowedDownloads[i];
    }

    public void setNumberAllowedDownloads(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.numberAllowedDownloads[i] = _value;
    }


    /**
     * Gets the numCurrentlyListed value for this ItemSearchRowBasic.
     * 
     * @return numCurrentlyListed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getNumCurrentlyListed() {
        return numCurrentlyListed;
    }


    /**
     * Sets the numCurrentlyListed value for this ItemSearchRowBasic.
     * 
     * @param numCurrentlyListed
     */
    public void setNumCurrentlyListed(org.mule.module.netsuite.api.internal.SearchColumnLongField[] numCurrentlyListed) {
        this.numCurrentlyListed = numCurrentlyListed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getNumCurrentlyListed(int i) {
        return this.numCurrentlyListed[i];
    }

    public void setNumCurrentlyListed(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.numCurrentlyListed[i] = _value;
    }


    /**
     * Gets the offerSupport value for this ItemSearchRowBasic.
     * 
     * @return offerSupport
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this ItemSearchRowBasic.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] offerSupport) {
        this.offerSupport = offerSupport;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getOfferSupport(int i) {
        return this.offerSupport[i];
    }

    public void setOfferSupport(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.offerSupport[i] = _value;
    }


    /**
     * Gets the onlineCustomerPrice value for this ItemSearchRowBasic.
     * 
     * @return onlineCustomerPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getOnlineCustomerPrice() {
        return onlineCustomerPrice;
    }


    /**
     * Sets the onlineCustomerPrice value for this ItemSearchRowBasic.
     * 
     * @param onlineCustomerPrice
     */
    public void setOnlineCustomerPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] onlineCustomerPrice) {
        this.onlineCustomerPrice = onlineCustomerPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getOnlineCustomerPrice(int i) {
        return this.onlineCustomerPrice[i];
    }

    public void setOnlineCustomerPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.onlineCustomerPrice[i] = _value;
    }


    /**
     * Gets the onlinePrice value for this ItemSearchRowBasic.
     * 
     * @return onlinePrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getOnlinePrice() {
        return onlinePrice;
    }


    /**
     * Sets the onlinePrice value for this ItemSearchRowBasic.
     * 
     * @param onlinePrice
     */
    public void setOnlinePrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] onlinePrice) {
        this.onlinePrice = onlinePrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getOnlinePrice(int i) {
        return this.onlinePrice[i];
    }

    public void setOnlinePrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.onlinePrice[i] = _value;
    }


    /**
     * Gets the onSpecial value for this ItemSearchRowBasic.
     * 
     * @return onSpecial
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this ItemSearchRowBasic.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] onSpecial) {
        this.onSpecial = onSpecial;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getOnSpecial(int i) {
        return this.onSpecial[i];
    }

    public void setOnSpecial(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.onSpecial[i] = _value;
    }


    /**
     * Gets the otherPrices value for this ItemSearchRowBasic.
     * 
     * @return otherPrices
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getOtherPrices() {
        return otherPrices;
    }


    /**
     * Sets the otherPrices value for this ItemSearchRowBasic.
     * 
     * @param otherPrices
     */
    public void setOtherPrices(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] otherPrices) {
        this.otherPrices = otherPrices;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getOtherPrices(int i) {
        return this.otherPrices[i];
    }

    public void setOtherPrices(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.otherPrices[i] = _value;
    }


    /**
     * Gets the otherVendor value for this ItemSearchRowBasic.
     * 
     * @return otherVendor
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getOtherVendor() {
        return otherVendor;
    }


    /**
     * Sets the otherVendor value for this ItemSearchRowBasic.
     * 
     * @param otherVendor
     */
    public void setOtherVendor(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] otherVendor) {
        this.otherVendor = otherVendor;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getOtherVendor(int i) {
        return this.otherVendor[i];
    }

    public void setOtherVendor(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.otherVendor[i] = _value;
    }


    /**
     * Gets the outOfStockBehavior value for this ItemSearchRowBasic.
     * 
     * @return outOfStockBehavior
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this ItemSearchRowBasic.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(org.mule.module.netsuite.api.internal.SearchColumnStringField[] outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getOutOfStockBehavior(int i) {
        return this.outOfStockBehavior[i];
    }

    public void setOutOfStockBehavior(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.outOfStockBehavior[i] = _value;
    }


    /**
     * Gets the outOfStockMessage value for this ItemSearchRowBasic.
     * 
     * @return outOfStockMessage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getOutOfStockMessage() {
        return outOfStockMessage;
    }


    /**
     * Sets the outOfStockMessage value for this ItemSearchRowBasic.
     * 
     * @param outOfStockMessage
     */
    public void setOutOfStockMessage(org.mule.module.netsuite.api.internal.SearchColumnStringField[] outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getOutOfStockMessage(int i) {
        return this.outOfStockMessage[i];
    }

    public void setOutOfStockMessage(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.outOfStockMessage[i] = _value;
    }


    /**
     * Gets the overallQuantityPricingType value for this ItemSearchRowBasic.
     * 
     * @return overallQuantityPricingType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this ItemSearchRowBasic.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getOverallQuantityPricingType(int i) {
        return this.overallQuantityPricingType[i];
    }

    public void setOverallQuantityPricingType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.overallQuantityPricingType[i] = _value;
    }


    /**
     * Gets the pageTitle value for this ItemSearchRowBasic.
     * 
     * @return pageTitle
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this ItemSearchRowBasic.
     * 
     * @param pageTitle
     */
    public void setPageTitle(org.mule.module.netsuite.api.internal.SearchColumnStringField[] pageTitle) {
        this.pageTitle = pageTitle;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPageTitle(int i) {
        return this.pageTitle[i];
    }

    public void setPageTitle(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.pageTitle[i] = _value;
    }


    /**
     * Gets the parent value for this ItemSearchRowBasic.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this ItemSearchRowBasic.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }


    /**
     * Gets the preferenceCriterion value for this ItemSearchRowBasic.
     * 
     * @return preferenceCriterion
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPreferenceCriterion() {
        return preferenceCriterion;
    }


    /**
     * Sets the preferenceCriterion value for this ItemSearchRowBasic.
     * 
     * @param preferenceCriterion
     */
    public void setPreferenceCriterion(org.mule.module.netsuite.api.internal.SearchColumnStringField[] preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPreferenceCriterion(int i) {
        return this.preferenceCriterion[i];
    }

    public void setPreferenceCriterion(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.preferenceCriterion[i] = _value;
    }


    /**
     * Gets the preferredBin value for this ItemSearchRowBasic.
     * 
     * @return preferredBin
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getPreferredBin() {
        return preferredBin;
    }


    /**
     * Sets the preferredBin value for this ItemSearchRowBasic.
     * 
     * @param preferredBin
     */
    public void setPreferredBin(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] preferredBin) {
        this.preferredBin = preferredBin;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getPreferredBin(int i) {
        return this.preferredBin[i];
    }

    public void setPreferredBin(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.preferredBin[i] = _value;
    }


    /**
     * Gets the preferredLocation value for this ItemSearchRowBasic.
     * 
     * @return preferredLocation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPreferredLocation() {
        return preferredLocation;
    }


    /**
     * Sets the preferredLocation value for this ItemSearchRowBasic.
     * 
     * @param preferredLocation
     */
    public void setPreferredLocation(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] preferredLocation) {
        this.preferredLocation = preferredLocation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPreferredLocation(int i) {
        return this.preferredLocation[i];
    }

    public void setPreferredLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.preferredLocation[i] = _value;
    }


    /**
     * Gets the preferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @return preferredStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getPreferredStockLevel() {
        return preferredStockLevel;
    }


    /**
     * Sets the preferredStockLevel value for this ItemSearchRowBasic.
     * 
     * @param preferredStockLevel
     */
    public void setPreferredStockLevel(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getPreferredStockLevel(int i) {
        return this.preferredStockLevel[i];
    }

    public void setPreferredStockLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.preferredStockLevel[i] = _value;
    }


    /**
     * Gets the preferredStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @return preferredStockLevelDays
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getPreferredStockLevelDays() {
        return preferredStockLevelDays;
    }


    /**
     * Sets the preferredStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @param preferredStockLevelDays
     */
    public void setPreferredStockLevelDays(org.mule.module.netsuite.api.internal.SearchColumnLongField[] preferredStockLevelDays) {
        this.preferredStockLevelDays = preferredStockLevelDays;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getPreferredStockLevelDays(int i) {
        return this.preferredStockLevelDays[i];
    }

    public void setPreferredStockLevelDays(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.preferredStockLevelDays[i] = _value;
    }


    /**
     * Gets the pricingGroup value for this ItemSearchRowBasic.
     * 
     * @return pricingGroup
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this ItemSearchRowBasic.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPricingGroup(int i) {
        return this.pricingGroup[i];
    }

    public void setPricingGroup(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.pricingGroup[i] = _value;
    }


    /**
     * Gets the primaryCategory value for this ItemSearchRowBasic.
     * 
     * @return primaryCategory
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPrimaryCategory() {
        return primaryCategory;
    }


    /**
     * Sets the primaryCategory value for this ItemSearchRowBasic.
     * 
     * @param primaryCategory
     */
    public void setPrimaryCategory(org.mule.module.netsuite.api.internal.SearchColumnStringField[] primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPrimaryCategory(int i) {
        return this.primaryCategory[i];
    }

    public void setPrimaryCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.primaryCategory[i] = _value;
    }


    /**
     * Gets the purchaseDescription value for this ItemSearchRowBasic.
     * 
     * @return purchaseDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getPurchaseDescription() {
        return purchaseDescription;
    }


    /**
     * Sets the purchaseDescription value for this ItemSearchRowBasic.
     * 
     * @param purchaseDescription
     */
    public void setPurchaseDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getPurchaseDescription(int i) {
        return this.purchaseDescription[i];
    }

    public void setPurchaseDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.purchaseDescription[i] = _value;
    }


    /**
     * Gets the purchaseUnit value for this ItemSearchRowBasic.
     * 
     * @return purchaseUnit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getPurchaseUnit() {
        return purchaseUnit;
    }


    /**
     * Sets the purchaseUnit value for this ItemSearchRowBasic.
     * 
     * @param purchaseUnit
     */
    public void setPurchaseUnit(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getPurchaseUnit(int i) {
        return this.purchaseUnit[i];
    }

    public void setPurchaseUnit(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.purchaseUnit[i] = _value;
    }


    /**
     * Gets the quantityAvailable value for this ItemSearchRowBasic.
     * 
     * @return quantityAvailable
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this ItemSearchRowBasic.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityAvailable(int i) {
        return this.quantityAvailable[i];
    }

    public void setQuantityAvailable(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityAvailable[i] = _value;
    }


    /**
     * Gets the quantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @return quantityBackOrdered
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this ItemSearchRowBasic.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityBackOrdered(int i) {
        return this.quantityBackOrdered[i];
    }

    public void setQuantityBackOrdered(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityBackOrdered[i] = _value;
    }


    /**
     * Gets the quantityCommitted value for this ItemSearchRowBasic.
     * 
     * @return quantityCommitted
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this ItemSearchRowBasic.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityCommitted(int i) {
        return this.quantityCommitted[i];
    }

    public void setQuantityCommitted(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityCommitted[i] = _value;
    }


    /**
     * Gets the quantityOnHand value for this ItemSearchRowBasic.
     * 
     * @return quantityOnHand
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this ItemSearchRowBasic.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityOnHand(int i) {
        return this.quantityOnHand[i];
    }

    public void setQuantityOnHand(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityOnHand[i] = _value;
    }


    /**
     * Gets the quantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @return quantityOnOrder
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getQuantityOnOrder() {
        return quantityOnOrder;
    }


    /**
     * Sets the quantityOnOrder value for this ItemSearchRowBasic.
     * 
     * @param quantityOnOrder
     */
    public void setQuantityOnOrder(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getQuantityOnOrder(int i) {
        return this.quantityOnOrder[i];
    }

    public void setQuantityOnOrder(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.quantityOnOrder[i] = _value;
    }


    /**
     * Gets the quantityPricingSchedule value for this ItemSearchRowBasic.
     * 
     * @return quantityPricingSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this ItemSearchRowBasic.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getQuantityPricingSchedule(int i) {
        return this.quantityPricingSchedule[i];
    }

    public void setQuantityPricingSchedule(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.quantityPricingSchedule[i] = _value;
    }


    /**
     * Gets the reorderMultiple value for this ItemSearchRowBasic.
     * 
     * @return reorderMultiple
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getReorderMultiple() {
        return reorderMultiple;
    }


    /**
     * Sets the reorderMultiple value for this ItemSearchRowBasic.
     * 
     * @param reorderMultiple
     */
    public void setReorderMultiple(org.mule.module.netsuite.api.internal.SearchColumnLongField[] reorderMultiple) {
        this.reorderMultiple = reorderMultiple;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getReorderMultiple(int i) {
        return this.reorderMultiple[i];
    }

    public void setReorderMultiple(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.reorderMultiple[i] = _value;
    }


    /**
     * Gets the reOrderPoint value for this ItemSearchRowBasic.
     * 
     * @return reOrderPoint
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getReOrderPoint() {
        return reOrderPoint;
    }


    /**
     * Sets the reOrderPoint value for this ItemSearchRowBasic.
     * 
     * @param reOrderPoint
     */
    public void setReOrderPoint(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] reOrderPoint) {
        this.reOrderPoint = reOrderPoint;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getReOrderPoint(int i) {
        return this.reOrderPoint[i];
    }

    public void setReOrderPoint(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.reOrderPoint[i] = _value;
    }


    /**
     * Gets the reservePrice value for this ItemSearchRowBasic.
     * 
     * @return reservePrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getReservePrice() {
        return reservePrice;
    }


    /**
     * Sets the reservePrice value for this ItemSearchRowBasic.
     * 
     * @param reservePrice
     */
    public void setReservePrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] reservePrice) {
        this.reservePrice = reservePrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getReservePrice(int i) {
        return this.reservePrice[i];
    }

    public void setReservePrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.reservePrice[i] = _value;
    }


    /**
     * Gets the revRecSchedule value for this ItemSearchRowBasic.
     * 
     * @return revRecSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this ItemSearchRowBasic.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getRevRecSchedule(int i) {
        return this.revRecSchedule[i];
    }

    public void setRevRecSchedule(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.revRecSchedule[i] = _value;
    }


    /**
     * Gets the safetyStockLevel value for this ItemSearchRowBasic.
     * 
     * @return safetyStockLevel
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getSafetyStockLevel() {
        return safetyStockLevel;
    }


    /**
     * Sets the safetyStockLevel value for this ItemSearchRowBasic.
     * 
     * @param safetyStockLevel
     */
    public void setSafetyStockLevel(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] safetyStockLevel) {
        this.safetyStockLevel = safetyStockLevel;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getSafetyStockLevel(int i) {
        return this.safetyStockLevel[i];
    }

    public void setSafetyStockLevel(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.safetyStockLevel[i] = _value;
    }


    /**
     * Gets the safetyStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @return safetyStockLevelDays
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getSafetyStockLevelDays() {
        return safetyStockLevelDays;
    }


    /**
     * Sets the safetyStockLevelDays value for this ItemSearchRowBasic.
     * 
     * @param safetyStockLevelDays
     */
    public void setSafetyStockLevelDays(org.mule.module.netsuite.api.internal.SearchColumnLongField[] safetyStockLevelDays) {
        this.safetyStockLevelDays = safetyStockLevelDays;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getSafetyStockLevelDays(int i) {
        return this.safetyStockLevelDays[i];
    }

    public void setSafetyStockLevelDays(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.safetyStockLevelDays[i] = _value;
    }


    /**
     * Gets the salesDescription value for this ItemSearchRowBasic.
     * 
     * @return salesDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this ItemSearchRowBasic.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] salesDescription) {
        this.salesDescription = salesDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSalesDescription(int i) {
        return this.salesDescription[i];
    }

    public void setSalesDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.salesDescription[i] = _value;
    }


    /**
     * Gets the salesTaxCode value for this ItemSearchRowBasic.
     * 
     * @return salesTaxCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this ItemSearchRowBasic.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSalesTaxCode(int i) {
        return this.salesTaxCode[i];
    }

    public void setSalesTaxCode(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.salesTaxCode[i] = _value;
    }


    /**
     * Gets the saleUnit value for this ItemSearchRowBasic.
     * 
     * @return saleUnit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSaleUnit() {
        return saleUnit;
    }


    /**
     * Sets the saleUnit value for this ItemSearchRowBasic.
     * 
     * @param saleUnit
     */
    public void setSaleUnit(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] saleUnit) {
        this.saleUnit = saleUnit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSaleUnit(int i) {
        return this.saleUnit[i];
    }

    public void setSaleUnit(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.saleUnit[i] = _value;
    }


    /**
     * Gets the scheduleBCode value for this ItemSearchRowBasic.
     * 
     * @return scheduleBCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getScheduleBCode() {
        return scheduleBCode;
    }


    /**
     * Sets the scheduleBCode value for this ItemSearchRowBasic.
     * 
     * @param scheduleBCode
     */
    public void setScheduleBCode(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getScheduleBCode(int i) {
        return this.scheduleBCode[i];
    }

    public void setScheduleBCode(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.scheduleBCode[i] = _value;
    }


    /**
     * Gets the scheduleBNumber value for this ItemSearchRowBasic.
     * 
     * @return scheduleBNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getScheduleBNumber() {
        return scheduleBNumber;
    }


    /**
     * Sets the scheduleBNumber value for this ItemSearchRowBasic.
     * 
     * @param scheduleBNumber
     */
    public void setScheduleBNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getScheduleBNumber(int i) {
        return this.scheduleBNumber[i];
    }

    public void setScheduleBNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.scheduleBNumber[i] = _value;
    }


    /**
     * Gets the scheduleBQuantity value for this ItemSearchRowBasic.
     * 
     * @return scheduleBQuantity
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getScheduleBQuantity() {
        return scheduleBQuantity;
    }


    /**
     * Sets the scheduleBQuantity value for this ItemSearchRowBasic.
     * 
     * @param scheduleBQuantity
     */
    public void setScheduleBQuantity(org.mule.module.netsuite.api.internal.SearchColumnStringField[] scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getScheduleBQuantity(int i) {
        return this.scheduleBQuantity[i];
    }

    public void setScheduleBQuantity(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.scheduleBQuantity[i] = _value;
    }


    /**
     * Gets the searchKeywords value for this ItemSearchRowBasic.
     * 
     * @return searchKeywords
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this ItemSearchRowBasic.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(org.mule.module.netsuite.api.internal.SearchColumnStringField[] searchKeywords) {
        this.searchKeywords = searchKeywords;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSearchKeywords(int i) {
        return this.searchKeywords[i];
    }

    public void setSearchKeywords(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.searchKeywords[i] = _value;
    }


    /**
     * Gets the seasonalDemand value for this ItemSearchRowBasic.
     * 
     * @return seasonalDemand
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getSeasonalDemand() {
        return seasonalDemand;
    }


    /**
     * Sets the seasonalDemand value for this ItemSearchRowBasic.
     * 
     * @param seasonalDemand
     */
    public void setSeasonalDemand(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] seasonalDemand) {
        this.seasonalDemand = seasonalDemand;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getSeasonalDemand(int i) {
        return this.seasonalDemand[i];
    }

    public void setSeasonalDemand(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.seasonalDemand[i] = _value;
    }


    /**
     * Gets the sellOnEBay value for this ItemSearchRowBasic.
     * 
     * @return sellOnEBay
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getSellOnEBay() {
        return sellOnEBay;
    }


    /**
     * Sets the sellOnEBay value for this ItemSearchRowBasic.
     * 
     * @param sellOnEBay
     */
    public void setSellOnEBay(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] sellOnEBay) {
        this.sellOnEBay = sellOnEBay;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getSellOnEBay(int i) {
        return this.sellOnEBay[i];
    }

    public void setSellOnEBay(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.sellOnEBay[i] = _value;
    }


    /**
     * Gets the serialNumber value for this ItemSearchRowBasic.
     * 
     * @return serialNumber
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this ItemSearchRowBasic.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }


    /**
     * Gets the serialNumberLocation value for this ItemSearchRowBasic.
     * 
     * @return serialNumberLocation
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getSerialNumberLocation() {
        return serialNumberLocation;
    }


    /**
     * Sets the serialNumberLocation value for this ItemSearchRowBasic.
     * 
     * @param serialNumberLocation
     */
    public void setSerialNumberLocation(org.mule.module.netsuite.api.internal.SearchColumnStringField[] serialNumberLocation) {
        this.serialNumberLocation = serialNumberLocation;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getSerialNumberLocation(int i) {
        return this.serialNumberLocation[i];
    }

    public void setSerialNumberLocation(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.serialNumberLocation[i] = _value;
    }


    /**
     * Gets the shipIndividually value for this ItemSearchRowBasic.
     * 
     * @return shipIndividually
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getShipIndividually() {
        return shipIndividually;
    }


    /**
     * Sets the shipIndividually value for this ItemSearchRowBasic.
     * 
     * @param shipIndividually
     */
    public void setShipIndividually(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shipIndividually) {
        this.shipIndividually = shipIndividually;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getShipIndividually(int i) {
        return this.shipIndividually[i];
    }

    public void setShipIndividually(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.shipIndividually[i] = _value;
    }


    /**
     * Gets the shipPackage value for this ItemSearchRowBasic.
     * 
     * @return shipPackage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getShipPackage() {
        return shipPackage;
    }


    /**
     * Sets the shipPackage value for this ItemSearchRowBasic.
     * 
     * @param shipPackage
     */
    public void setShipPackage(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] shipPackage) {
        this.shipPackage = shipPackage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getShipPackage(int i) {
        return this.shipPackage[i];
    }

    public void setShipPackage(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.shipPackage[i] = _value;
    }


    /**
     * Gets the shippingRate value for this ItemSearchRowBasic.
     * 
     * @return shippingRate
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getShippingRate() {
        return shippingRate;
    }


    /**
     * Sets the shippingRate value for this ItemSearchRowBasic.
     * 
     * @param shippingRate
     */
    public void setShippingRate(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] shippingRate) {
        this.shippingRate = shippingRate;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getShippingRate(int i) {
        return this.shippingRate[i];
    }

    public void setShippingRate(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.shippingRate[i] = _value;
    }


    /**
     * Gets the shoppingDotComCategory value for this ItemSearchRowBasic.
     * 
     * @return shoppingDotComCategory
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }


    /**
     * Sets the shoppingDotComCategory value for this ItemSearchRowBasic.
     * 
     * @param shoppingDotComCategory
     */
    public void setShoppingDotComCategory(org.mule.module.netsuite.api.internal.SearchColumnStringField[] shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getShoppingDotComCategory(int i) {
        return this.shoppingDotComCategory[i];
    }

    public void setShoppingDotComCategory(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.shoppingDotComCategory[i] = _value;
    }


    /**
     * Gets the shoppingProductFeed value for this ItemSearchRowBasic.
     * 
     * @return shoppingProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getShoppingProductFeed() {
        return shoppingProductFeed;
    }


    /**
     * Sets the shoppingProductFeed value for this ItemSearchRowBasic.
     * 
     * @param shoppingProductFeed
     */
    public void setShoppingProductFeed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shoppingProductFeed) {
        this.shoppingProductFeed = shoppingProductFeed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getShoppingProductFeed(int i) {
        return this.shoppingProductFeed[i];
    }

    public void setShoppingProductFeed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.shoppingProductFeed[i] = _value;
    }


    /**
     * Gets the shopzillaCategoryId value for this ItemSearchRowBasic.
     * 
     * @return shopzillaCategoryId
     */
    public org.mule.module.netsuite.api.internal.SearchColumnLongField[] getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }


    /**
     * Sets the shopzillaCategoryId value for this ItemSearchRowBasic.
     * 
     * @param shopzillaCategoryId
     */
    public void setShopzillaCategoryId(org.mule.module.netsuite.api.internal.SearchColumnLongField[] shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnLongField getShopzillaCategoryId(int i) {
        return this.shopzillaCategoryId[i];
    }

    public void setShopzillaCategoryId(int i, org.mule.module.netsuite.api.internal.SearchColumnLongField _value) {
        this.shopzillaCategoryId[i] = _value;
    }


    /**
     * Gets the shopzillaProductFeed value for this ItemSearchRowBasic.
     * 
     * @return shopzillaProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getShopzillaProductFeed() {
        return shopzillaProductFeed;
    }


    /**
     * Sets the shopzillaProductFeed value for this ItemSearchRowBasic.
     * 
     * @param shopzillaProductFeed
     */
    public void setShopzillaProductFeed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] shopzillaProductFeed) {
        this.shopzillaProductFeed = shopzillaProductFeed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getShopzillaProductFeed(int i) {
        return this.shopzillaProductFeed[i];
    }

    public void setShopzillaProductFeed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.shopzillaProductFeed[i] = _value;
    }


    /**
     * Gets the sitemapPriority value for this ItemSearchRowBasic.
     * 
     * @return sitemapPriority
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this ItemSearchRowBasic.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getSitemapPriority(int i) {
        return this.sitemapPriority[i];
    }

    public void setSitemapPriority(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.sitemapPriority[i] = _value;
    }


    /**
     * Gets the softDescriptor value for this ItemSearchRowBasic.
     * 
     * @return softDescriptor
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this ItemSearchRowBasic.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSoftDescriptor(int i) {
        return this.softDescriptor[i];
    }

    public void setSoftDescriptor(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.softDescriptor[i] = _value;
    }


    /**
     * Gets the startingPrice value for this ItemSearchRowBasic.
     * 
     * @return startingPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getStartingPrice() {
        return startingPrice;
    }


    /**
     * Sets the startingPrice value for this ItemSearchRowBasic.
     * 
     * @param startingPrice
     */
    public void setStartingPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] startingPrice) {
        this.startingPrice = startingPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getStartingPrice(int i) {
        return this.startingPrice[i];
    }

    public void setStartingPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.startingPrice[i] = _value;
    }


    /**
     * Gets the stockDescription value for this ItemSearchRowBasic.
     * 
     * @return stockDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStockDescription() {
        return stockDescription;
    }


    /**
     * Sets the stockDescription value for this ItemSearchRowBasic.
     * 
     * @param stockDescription
     */
    public void setStockDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] stockDescription) {
        this.stockDescription = stockDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStockDescription(int i) {
        return this.stockDescription[i];
    }

    public void setStockDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.stockDescription[i] = _value;
    }


    /**
     * Gets the stockUnit value for this ItemSearchRowBasic.
     * 
     * @return stockUnit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getStockUnit() {
        return stockUnit;
    }


    /**
     * Sets the stockUnit value for this ItemSearchRowBasic.
     * 
     * @param stockUnit
     */
    public void setStockUnit(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] stockUnit) {
        this.stockUnit = stockUnit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getStockUnit(int i) {
        return this.stockUnit[i];
    }

    public void setStockUnit(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.stockUnit[i] = _value;
    }


    /**
     * Gets the storeDescription value for this ItemSearchRowBasic.
     * 
     * @return storeDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this ItemSearchRowBasic.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDescription) {
        this.storeDescription = storeDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStoreDescription(int i) {
        return this.storeDescription[i];
    }

    public void setStoreDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.storeDescription[i] = _value;
    }


    /**
     * Gets the storeDetailedDescription value for this ItemSearchRowBasic.
     * 
     * @return storeDetailedDescription
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this ItemSearchRowBasic.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStoreDetailedDescription(int i) {
        return this.storeDetailedDescription[i];
    }

    public void setStoreDetailedDescription(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.storeDetailedDescription[i] = _value;
    }


    /**
     * Gets the storeDisplayImage value for this ItemSearchRowBasic.
     * 
     * @return storeDisplayImage
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this ItemSearchRowBasic.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getStoreDisplayImage(int i) {
        return this.storeDisplayImage[i];
    }

    public void setStoreDisplayImage(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.storeDisplayImage[i] = _value;
    }


    /**
     * Gets the storeDisplayName value for this ItemSearchRowBasic.
     * 
     * @return storeDisplayName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getStoreDisplayName() {
        return storeDisplayName;
    }


    /**
     * Sets the storeDisplayName value for this ItemSearchRowBasic.
     * 
     * @param storeDisplayName
     */
    public void setStoreDisplayName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getStoreDisplayName(int i) {
        return this.storeDisplayName[i];
    }

    public void setStoreDisplayName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.storeDisplayName[i] = _value;
    }


    /**
     * Gets the storeDisplayThumbnail value for this ItemSearchRowBasic.
     * 
     * @return storeDisplayThumbnail
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this ItemSearchRowBasic.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getStoreDisplayThumbnail(int i) {
        return this.storeDisplayThumbnail[i];
    }

    public void setStoreDisplayThumbnail(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.storeDisplayThumbnail[i] = _value;
    }


    /**
     * Gets the subsidiary value for this ItemSearchRowBasic.
     * 
     * @return subsidiary
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getSubsidiary() {
        return subsidiary;
    }


    /**
     * Sets the subsidiary value for this ItemSearchRowBasic.
     * 
     * @param subsidiary
     */
    public void setSubsidiary(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }


    /**
     * Gets the subType value for this ItemSearchRowBasic.
     * 
     * @return subType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getSubType() {
        return subType;
    }


    /**
     * Sets the subType value for this ItemSearchRowBasic.
     * 
     * @param subType
     */
    public void setSubType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] subType) {
        this.subType = subType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getSubType(int i) {
        return this.subType[i];
    }

    public void setSubType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.subType[i] = _value;
    }


    /**
     * Gets the taxSchedule value for this ItemSearchRowBasic.
     * 
     * @return taxSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this ItemSearchRowBasic.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getTaxSchedule(int i) {
        return this.taxSchedule[i];
    }

    public void setTaxSchedule(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.taxSchedule[i] = _value;
    }


    /**
     * Gets the thumbNailUrl value for this ItemSearchRowBasic.
     * 
     * @return thumbNailUrl
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getThumbNailUrl() {
        return thumbNailUrl;
    }


    /**
     * Sets the thumbNailUrl value for this ItemSearchRowBasic.
     * 
     * @param thumbNailUrl
     */
    public void setThumbNailUrl(org.mule.module.netsuite.api.internal.SearchColumnStringField[] thumbNailUrl) {
        this.thumbNailUrl = thumbNailUrl;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getThumbNailUrl(int i) {
        return this.thumbNailUrl[i];
    }

    public void setThumbNailUrl(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.thumbNailUrl[i] = _value;
    }


    /**
     * Gets the totalValue value for this ItemSearchRowBasic.
     * 
     * @return totalValue
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTotalValue() {
        return totalValue;
    }


    /**
     * Sets the totalValue value for this ItemSearchRowBasic.
     * 
     * @param totalValue
     */
    public void setTotalValue(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] totalValue) {
        this.totalValue = totalValue;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTotalValue(int i) {
        return this.totalValue[i];
    }

    public void setTotalValue(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.totalValue[i] = _value;
    }


    /**
     * Gets the trackLandedCost value for this ItemSearchRowBasic.
     * 
     * @return trackLandedCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getTrackLandedCost() {
        return trackLandedCost;
    }


    /**
     * Sets the trackLandedCost value for this ItemSearchRowBasic.
     * 
     * @param trackLandedCost
     */
    public void setTrackLandedCost(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] trackLandedCost) {
        this.trackLandedCost = trackLandedCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getTrackLandedCost(int i) {
        return this.trackLandedCost[i];
    }

    public void setTrackLandedCost(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.trackLandedCost[i] = _value;
    }


    /**
     * Gets the transferPrice value for this ItemSearchRowBasic.
     * 
     * @return transferPrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getTransferPrice() {
        return transferPrice;
    }


    /**
     * Sets the transferPrice value for this ItemSearchRowBasic.
     * 
     * @param transferPrice
     */
    public void setTransferPrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] transferPrice) {
        this.transferPrice = transferPrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getTransferPrice(int i) {
        return this.transferPrice[i];
    }

    public void setTransferPrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.transferPrice[i] = _value;
    }


    /**
     * Gets the type value for this ItemSearchRowBasic.
     * 
     * @return type
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getType() {
        return type;
    }


    /**
     * Sets the type value for this ItemSearchRowBasic.
     * 
     * @param type
     */
    public void setType(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }


    /**
     * Gets the unbuildVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @return unbuildVarianceAccount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getUnbuildVarianceAccount() {
        return unbuildVarianceAccount;
    }


    /**
     * Sets the unbuildVarianceAccount value for this ItemSearchRowBasic.
     * 
     * @param unbuildVarianceAccount
     */
    public void setUnbuildVarianceAccount(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] unbuildVarianceAccount) {
        this.unbuildVarianceAccount = unbuildVarianceAccount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getUnbuildVarianceAccount(int i) {
        return this.unbuildVarianceAccount[i];
    }

    public void setUnbuildVarianceAccount(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.unbuildVarianceAccount[i] = _value;
    }


    /**
     * Gets the unitsType value for this ItemSearchRowBasic.
     * 
     * @return unitsType
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getUnitsType() {
        return unitsType;
    }


    /**
     * Sets the unitsType value for this ItemSearchRowBasic.
     * 
     * @param unitsType
     */
    public void setUnitsType(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] unitsType) {
        this.unitsType = unitsType;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getUnitsType(int i) {
        return this.unitsType[i];
    }

    public void setUnitsType(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.unitsType[i] = _value;
    }


    /**
     * Gets the upcCode value for this ItemSearchRowBasic.
     * 
     * @return upcCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this ItemSearchRowBasic.
     * 
     * @param upcCode
     */
    public void setUpcCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] upcCode) {
        this.upcCode = upcCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getUpcCode(int i) {
        return this.upcCode[i];
    }

    public void setUpcCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.upcCode[i] = _value;
    }


    /**
     * Gets the urlComponent value for this ItemSearchRowBasic.
     * 
     * @return urlComponent
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this ItemSearchRowBasic.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(org.mule.module.netsuite.api.internal.SearchColumnStringField[] urlComponent) {
        this.urlComponent = urlComponent;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getUrlComponent(int i) {
        return this.urlComponent[i];
    }

    public void setUrlComponent(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.urlComponent[i] = _value;
    }


    /**
     * Gets the useBins value for this ItemSearchRowBasic.
     * 
     * @return useBins
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getUseBins() {
        return useBins;
    }


    /**
     * Sets the useBins value for this ItemSearchRowBasic.
     * 
     * @param useBins
     */
    public void setUseBins(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useBins) {
        this.useBins = useBins;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getUseBins(int i) {
        return this.useBins[i];
    }

    public void setUseBins(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.useBins[i] = _value;
    }


    /**
     * Gets the useMarginalRates value for this ItemSearchRowBasic.
     * 
     * @return useMarginalRates
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this ItemSearchRowBasic.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getUseMarginalRates(int i) {
        return this.useMarginalRates[i];
    }

    public void setUseMarginalRates(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.useMarginalRates[i] = _value;
    }


    /**
     * Gets the vendor value for this ItemSearchRowBasic.
     * 
     * @return vendor
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getVendor() {
        return vendor;
    }


    /**
     * Sets the vendor value for this ItemSearchRowBasic.
     * 
     * @param vendor
     */
    public void setVendor(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendor) {
        this.vendor = vendor;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getVendor(int i) {
        return this.vendor[i];
    }

    public void setVendor(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.vendor[i] = _value;
    }


    /**
     * Gets the vendorCode value for this ItemSearchRowBasic.
     * 
     * @return vendorCode
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getVendorCode() {
        return vendorCode;
    }


    /**
     * Sets the vendorCode value for this ItemSearchRowBasic.
     * 
     * @param vendorCode
     */
    public void setVendorCode(org.mule.module.netsuite.api.internal.SearchColumnStringField[] vendorCode) {
        this.vendorCode = vendorCode;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getVendorCode(int i) {
        return this.vendorCode[i];
    }

    public void setVendorCode(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.vendorCode[i] = _value;
    }


    /**
     * Gets the vendorCost value for this ItemSearchRowBasic.
     * 
     * @return vendorCost
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getVendorCost() {
        return vendorCost;
    }


    /**
     * Sets the vendorCost value for this ItemSearchRowBasic.
     * 
     * @param vendorCost
     */
    public void setVendorCost(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vendorCost) {
        this.vendorCost = vendorCost;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getVendorCost(int i) {
        return this.vendorCost[i];
    }

    public void setVendorCost(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.vendorCost[i] = _value;
    }


    /**
     * Gets the vendorName value for this ItemSearchRowBasic.
     * 
     * @return vendorName
     */
    public org.mule.module.netsuite.api.internal.SearchColumnStringField[] getVendorName() {
        return vendorName;
    }


    /**
     * Sets the vendorName value for this ItemSearchRowBasic.
     * 
     * @param vendorName
     */
    public void setVendorName(org.mule.module.netsuite.api.internal.SearchColumnStringField[] vendorName) {
        this.vendorName = vendorName;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnStringField getVendorName(int i) {
        return this.vendorName[i];
    }

    public void setVendorName(int i, org.mule.module.netsuite.api.internal.SearchColumnStringField _value) {
        this.vendorName[i] = _value;
    }


    /**
     * Gets the vendorSchedule value for this ItemSearchRowBasic.
     * 
     * @return vendorSchedule
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getVendorSchedule() {
        return vendorSchedule;
    }


    /**
     * Sets the vendorSchedule value for this ItemSearchRowBasic.
     * 
     * @param vendorSchedule
     */
    public void setVendorSchedule(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] vendorSchedule) {
        this.vendorSchedule = vendorSchedule;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getVendorSchedule(int i) {
        return this.vendorSchedule[i];
    }

    public void setVendorSchedule(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.vendorSchedule[i] = _value;
    }


    /**
     * Gets the vsoeDeferral value for this ItemSearchRowBasic.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this ItemSearchRowBasic.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getVsoeDeferral(int i) {
        return this.vsoeDeferral[i];
    }

    public void setVsoeDeferral(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.vsoeDeferral[i] = _value;
    }


    /**
     * Gets the vsoeDelivered value for this ItemSearchRowBasic.
     * 
     * @return vsoeDelivered
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this ItemSearchRowBasic.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getVsoeDelivered(int i) {
        return this.vsoeDelivered[i];
    }

    public void setVsoeDelivered(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.vsoeDelivered[i] = _value;
    }


    /**
     * Gets the vsoePermitDiscount value for this ItemSearchRowBasic.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this ItemSearchRowBasic.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getVsoePermitDiscount(int i) {
        return this.vsoePermitDiscount[i];
    }

    public void setVsoePermitDiscount(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.vsoePermitDiscount[i] = _value;
    }


    /**
     * Gets the vsoePrice value for this ItemSearchRowBasic.
     * 
     * @return vsoePrice
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this ItemSearchRowBasic.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getVsoePrice(int i) {
        return this.vsoePrice[i];
    }

    public void setVsoePrice(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.vsoePrice[i] = _value;
    }


    /**
     * Gets the webSite value for this ItemSearchRowBasic.
     * 
     * @return webSite
     */
    public org.mule.module.netsuite.api.internal.SearchColumnSelectField[] getWebSite() {
        return webSite;
    }


    /**
     * Sets the webSite value for this ItemSearchRowBasic.
     * 
     * @param webSite
     */
    public void setWebSite(org.mule.module.netsuite.api.internal.SearchColumnSelectField[] webSite) {
        this.webSite = webSite;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnSelectField getWebSite(int i) {
        return this.webSite[i];
    }

    public void setWebSite(int i, org.mule.module.netsuite.api.internal.SearchColumnSelectField _value) {
        this.webSite[i] = _value;
    }


    /**
     * Gets the weight value for this ItemSearchRowBasic.
     * 
     * @return weight
     */
    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this ItemSearchRowBasic.
     * 
     * @param weight
     */
    public void setWeight(org.mule.module.netsuite.api.internal.SearchColumnDoubleField[] weight) {
        this.weight = weight;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnDoubleField getWeight(int i) {
        return this.weight[i];
    }

    public void setWeight(int i, org.mule.module.netsuite.api.internal.SearchColumnDoubleField _value) {
        this.weight[i] = _value;
    }


    /**
     * Gets the weightUnit value for this ItemSearchRowBasic.
     * 
     * @return weightUnit
     */
    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this ItemSearchRowBasic.
     * 
     * @param weightUnit
     */
    public void setWeightUnit(org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField[] weightUnit) {
        this.weightUnit = weightUnit;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField getWeightUnit(int i) {
        return this.weightUnit[i];
    }

    public void setWeightUnit(int i, org.mule.module.netsuite.api.internal.SearchColumnEnumSelectField _value) {
        this.weightUnit[i] = _value;
    }


    /**
     * Gets the yahooProductFeed value for this ItemSearchRowBasic.
     * 
     * @return yahooProductFeed
     */
    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] getYahooProductFeed() {
        return yahooProductFeed;
    }


    /**
     * Sets the yahooProductFeed value for this ItemSearchRowBasic.
     * 
     * @param yahooProductFeed
     */
    public void setYahooProductFeed(org.mule.module.netsuite.api.internal.SearchColumnBooleanField[] yahooProductFeed) {
        this.yahooProductFeed = yahooProductFeed;
    }

    public org.mule.module.netsuite.api.internal.SearchColumnBooleanField getYahooProductFeed(int i) {
        return this.yahooProductFeed[i];
    }

    public void setYahooProductFeed(int i, org.mule.module.netsuite.api.internal.SearchColumnBooleanField _value) {
        this.yahooProductFeed[i] = _value;
    }


    /**
     * Gets the customFieldList value for this ItemSearchRowBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemSearchRowBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSearchRowBasic)) return false;
        ItemSearchRowBasic other = (ItemSearchRowBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assetAccount==null && other.getAssetAccount()==null) || 
             (this.assetAccount!=null &&
              java.util.Arrays.equals(this.assetAccount, other.getAssetAccount()))) &&
            ((this.autoLeadTime==null && other.getAutoLeadTime()==null) || 
             (this.autoLeadTime!=null &&
              java.util.Arrays.equals(this.autoLeadTime, other.getAutoLeadTime()))) &&
            ((this.autoPreferredStockLevel==null && other.getAutoPreferredStockLevel()==null) || 
             (this.autoPreferredStockLevel!=null &&
              java.util.Arrays.equals(this.autoPreferredStockLevel, other.getAutoPreferredStockLevel()))) &&
            ((this.autoReorderPoint==null && other.getAutoReorderPoint()==null) || 
             (this.autoReorderPoint!=null &&
              java.util.Arrays.equals(this.autoReorderPoint, other.getAutoReorderPoint()))) &&
            ((this.availableToPartners==null && other.getAvailableToPartners()==null) || 
             (this.availableToPartners!=null &&
              java.util.Arrays.equals(this.availableToPartners, other.getAvailableToPartners()))) &&
            ((this.averageCost==null && other.getAverageCost()==null) || 
             (this.averageCost!=null &&
              java.util.Arrays.equals(this.averageCost, other.getAverageCost()))) &&
            ((this.basePrice==null && other.getBasePrice()==null) || 
             (this.basePrice!=null &&
              java.util.Arrays.equals(this.basePrice, other.getBasePrice()))) &&
            ((this.billExchRateVarianceAcct==null && other.getBillExchRateVarianceAcct()==null) || 
             (this.billExchRateVarianceAcct!=null &&
              java.util.Arrays.equals(this.billExchRateVarianceAcct, other.getBillExchRateVarianceAcct()))) &&
            ((this.billPriceVarianceAcct==null && other.getBillPriceVarianceAcct()==null) || 
             (this.billPriceVarianceAcct!=null &&
              java.util.Arrays.equals(this.billPriceVarianceAcct, other.getBillPriceVarianceAcct()))) &&
            ((this.billQtyVarianceAcct==null && other.getBillQtyVarianceAcct()==null) || 
             (this.billQtyVarianceAcct!=null &&
              java.util.Arrays.equals(this.billQtyVarianceAcct, other.getBillQtyVarianceAcct()))) &&
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              java.util.Arrays.equals(this.binNumber, other.getBinNumber()))) &&
            ((this.binOnHandAvail==null && other.getBinOnHandAvail()==null) || 
             (this.binOnHandAvail!=null &&
              java.util.Arrays.equals(this.binOnHandAvail, other.getBinOnHandAvail()))) &&
            ((this.binOnHandCount==null && other.getBinOnHandCount()==null) || 
             (this.binOnHandCount!=null &&
              java.util.Arrays.equals(this.binOnHandCount, other.getBinOnHandCount()))) &&
            ((this.buildEntireAssembly==null && other.getBuildEntireAssembly()==null) || 
             (this.buildEntireAssembly!=null &&
              java.util.Arrays.equals(this.buildEntireAssembly, other.getBuildEntireAssembly()))) &&
            ((this.buyItNowPrice==null && other.getBuyItNowPrice()==null) || 
             (this.buyItNowPrice!=null &&
              java.util.Arrays.equals(this.buyItNowPrice, other.getBuyItNowPrice()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              java.util.Arrays.equals(this.category, other.getCategory()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              java.util.Arrays.equals(this._class, other.get_class()))) &&
            ((this.copyDescription==null && other.getCopyDescription()==null) || 
             (this.copyDescription!=null &&
              java.util.Arrays.equals(this.copyDescription, other.getCopyDescription()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              java.util.Arrays.equals(this.cost, other.getCost()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              java.util.Arrays.equals(this.costEstimate, other.getCostEstimate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              java.util.Arrays.equals(this.costEstimateType, other.getCostEstimateType()))) &&
            ((this.costingMethod==null && other.getCostingMethod()==null) || 
             (this.costingMethod!=null &&
              java.util.Arrays.equals(this.costingMethod, other.getCostingMethod()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              java.util.Arrays.equals(this.countryOfManufacture, other.getCountryOfManufacture()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              java.util.Arrays.equals(this.created, other.getCreated()))) &&
            ((this.createJob==null && other.getCreateJob()==null) || 
             (this.createJob!=null &&
              java.util.Arrays.equals(this.createJob, other.getCreateJob()))) &&
            ((this.dateViewed==null && other.getDateViewed()==null) || 
             (this.dateViewed!=null &&
              java.util.Arrays.equals(this.dateViewed, other.getDateViewed()))) &&
            ((this.daysBeforeExpiration==null && other.getDaysBeforeExpiration()==null) || 
             (this.daysBeforeExpiration!=null &&
              java.util.Arrays.equals(this.daysBeforeExpiration, other.getDaysBeforeExpiration()))) &&
            ((this.defaultReturnCost==null && other.getDefaultReturnCost()==null) || 
             (this.defaultReturnCost!=null &&
              java.util.Arrays.equals(this.defaultReturnCost, other.getDefaultReturnCost()))) &&
            ((this.deferredExpenseAccount==null && other.getDeferredExpenseAccount()==null) || 
             (this.deferredExpenseAccount!=null &&
              java.util.Arrays.equals(this.deferredExpenseAccount, other.getDeferredExpenseAccount()))) &&
            ((this.deferredRevenueAccount==null && other.getDeferredRevenueAccount()==null) || 
             (this.deferredRevenueAccount!=null &&
              java.util.Arrays.equals(this.deferredRevenueAccount, other.getDeferredRevenueAccount()))) &&
            ((this.demandModifier==null && other.getDemandModifier()==null) || 
             (this.demandModifier!=null &&
              java.util.Arrays.equals(this.demandModifier, other.getDemandModifier()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              java.util.Arrays.equals(this.department, other.getDepartment()))) &&
            ((this.departmentnohierarchy==null && other.getDepartmentnohierarchy()==null) || 
             (this.departmentnohierarchy!=null &&
              java.util.Arrays.equals(this.departmentnohierarchy, other.getDepartmentnohierarchy()))) &&
            ((this.displayIneBayStore==null && other.getDisplayIneBayStore()==null) || 
             (this.displayIneBayStore!=null &&
              java.util.Arrays.equals(this.displayIneBayStore, other.getDisplayIneBayStore()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              java.util.Arrays.equals(this.displayName, other.getDisplayName()))) &&
            ((this.dontShowPrice==null && other.getDontShowPrice()==null) || 
             (this.dontShowPrice!=null &&
              java.util.Arrays.equals(this.dontShowPrice, other.getDontShowPrice()))) &&
            ((this.eBayItemDescription==null && other.getEBayItemDescription()==null) || 
             (this.eBayItemDescription!=null &&
              java.util.Arrays.equals(this.eBayItemDescription, other.getEBayItemDescription()))) &&
            ((this.eBayItemSubtitle==null && other.getEBayItemSubtitle()==null) || 
             (this.eBayItemSubtitle!=null &&
              java.util.Arrays.equals(this.eBayItemSubtitle, other.getEBayItemSubtitle()))) &&
            ((this.eBayItemTitle==null && other.getEBayItemTitle()==null) || 
             (this.eBayItemTitle!=null &&
              java.util.Arrays.equals(this.eBayItemTitle, other.getEBayItemTitle()))) &&
            ((this.ebayRelistingOption==null && other.getEbayRelistingOption()==null) || 
             (this.ebayRelistingOption!=null &&
              java.util.Arrays.equals(this.ebayRelistingOption, other.getEbayRelistingOption()))) &&
            ((this.endAuctionsWhenOutOfStock==null && other.getEndAuctionsWhenOutOfStock()==null) || 
             (this.endAuctionsWhenOutOfStock!=null &&
              java.util.Arrays.equals(this.endAuctionsWhenOutOfStock, other.getEndAuctionsWhenOutOfStock()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              java.util.Arrays.equals(this.excludeFromSitemap, other.getExcludeFromSitemap()))) &&
            ((this.expenseAccount==null && other.getExpenseAccount()==null) || 
             (this.expenseAccount!=null &&
              java.util.Arrays.equals(this.expenseAccount, other.getExpenseAccount()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              java.util.Arrays.equals(this.externalId, other.getExternalId()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              java.util.Arrays.equals(this.featuredDescription, other.getFeaturedDescription()))) &&
            ((this.feedDescription==null && other.getFeedDescription()==null) || 
             (this.feedDescription!=null &&
              java.util.Arrays.equals(this.feedDescription, other.getFeedDescription()))) &&
            ((this.feedName==null && other.getFeedName()==null) || 
             (this.feedName!=null &&
              java.util.Arrays.equals(this.feedName, other.getFeedName()))) &&
            ((this.froogleProductFeed==null && other.getFroogleProductFeed()==null) || 
             (this.froogleProductFeed!=null &&
              java.util.Arrays.equals(this.froogleProductFeed, other.getFroogleProductFeed()))) &&
            ((this.fxCost==null && other.getFxCost()==null) || 
             (this.fxCost!=null &&
              java.util.Arrays.equals(this.fxCost, other.getFxCost()))) &&
            ((this.gainLossAccount==null && other.getGainLossAccount()==null) || 
             (this.gainLossAccount!=null &&
              java.util.Arrays.equals(this.gainLossAccount, other.getGainLossAccount()))) &&
            ((this.giftCertAuthCode==null && other.getGiftCertAuthCode()==null) || 
             (this.giftCertAuthCode!=null &&
              java.util.Arrays.equals(this.giftCertAuthCode, other.getGiftCertAuthCode()))) &&
            ((this.giftCertEmail==null && other.getGiftCertEmail()==null) || 
             (this.giftCertEmail!=null &&
              java.util.Arrays.equals(this.giftCertEmail, other.getGiftCertEmail()))) &&
            ((this.giftCertExpirationDate==null && other.getGiftCertExpirationDate()==null) || 
             (this.giftCertExpirationDate!=null &&
              java.util.Arrays.equals(this.giftCertExpirationDate, other.getGiftCertExpirationDate()))) &&
            ((this.giftCertFrom==null && other.getGiftCertFrom()==null) || 
             (this.giftCertFrom!=null &&
              java.util.Arrays.equals(this.giftCertFrom, other.getGiftCertFrom()))) &&
            ((this.giftCertMessage==null && other.getGiftCertMessage()==null) || 
             (this.giftCertMessage!=null &&
              java.util.Arrays.equals(this.giftCertMessage, other.getGiftCertMessage()))) &&
            ((this.giftCertOriginalAmount==null && other.getGiftCertOriginalAmount()==null) || 
             (this.giftCertOriginalAmount!=null &&
              java.util.Arrays.equals(this.giftCertOriginalAmount, other.getGiftCertOriginalAmount()))) &&
            ((this.giftCertRecipient==null && other.getGiftCertRecipient()==null) || 
             (this.giftCertRecipient!=null &&
              java.util.Arrays.equals(this.giftCertRecipient, other.getGiftCertRecipient()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              java.util.Arrays.equals(this.hits, other.getHits()))) &&
            ((this.imageUrl==null && other.getImageUrl()==null) || 
             (this.imageUrl!=null &&
              java.util.Arrays.equals(this.imageUrl, other.getImageUrl()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              java.util.Arrays.equals(this.incomeAccount, other.getIncomeAccount()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              java.util.Arrays.equals(this.internalId, other.getInternalId()))) &&
            ((this.inventoryLocation==null && other.getInventoryLocation()==null) || 
             (this.inventoryLocation!=null &&
              java.util.Arrays.equals(this.inventoryLocation, other.getInventoryLocation()))) &&
            ((this.isAvailable==null && other.getIsAvailable()==null) || 
             (this.isAvailable!=null &&
              java.util.Arrays.equals(this.isAvailable, other.getIsAvailable()))) &&
            ((this.isDropShipItem==null && other.getIsDropShipItem()==null) || 
             (this.isDropShipItem!=null &&
              java.util.Arrays.equals(this.isDropShipItem, other.getIsDropShipItem()))) &&
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              java.util.Arrays.equals(this.isFulfillable, other.getIsFulfillable()))) &&
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              java.util.Arrays.equals(this.isGcoCompliant, other.getIsGcoCompliant()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              java.util.Arrays.equals(this.isInactive, other.getIsInactive()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              java.util.Arrays.equals(this.isOnline, other.getIsOnline()))) &&
            ((this.isSpecialOrderItem==null && other.getIsSpecialOrderItem()==null) || 
             (this.isSpecialOrderItem!=null &&
              java.util.Arrays.equals(this.isSpecialOrderItem, other.getIsSpecialOrderItem()))) &&
            ((this.isSpecialWorkOrderItem==null && other.getIsSpecialWorkOrderItem()==null) || 
             (this.isSpecialWorkOrderItem!=null &&
              java.util.Arrays.equals(this.isSpecialWorkOrderItem, other.getIsSpecialWorkOrderItem()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              java.util.Arrays.equals(this.issueProduct, other.getIssueProduct()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              java.util.Arrays.equals(this.isTaxable, other.getIsTaxable()))) &&
            ((this.isVsoeBundle==null && other.getIsVsoeBundle()==null) || 
             (this.isVsoeBundle!=null &&
              java.util.Arrays.equals(this.isVsoeBundle, other.getIsVsoeBundle()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              java.util.Arrays.equals(this.itemId, other.getItemId()))) &&
            ((this.itemUrl==null && other.getItemUrl()==null) || 
             (this.itemUrl!=null &&
              java.util.Arrays.equals(this.itemUrl, other.getItemUrl()))) &&
            ((this.lastPurchasePrice==null && other.getLastPurchasePrice()==null) || 
             (this.lastPurchasePrice!=null &&
              java.util.Arrays.equals(this.lastPurchasePrice, other.getLastPurchasePrice()))) &&
            ((this.lastQuantityAvailableChange==null && other.getLastQuantityAvailableChange()==null) || 
             (this.lastQuantityAvailableChange!=null &&
              java.util.Arrays.equals(this.lastQuantityAvailableChange, other.getLastQuantityAvailableChange()))) &&
            ((this.leadTime==null && other.getLeadTime()==null) || 
             (this.leadTime!=null &&
              java.util.Arrays.equals(this.leadTime, other.getLeadTime()))) &&
            ((this.liabilityAccount==null && other.getLiabilityAccount()==null) || 
             (this.liabilityAccount!=null &&
              java.util.Arrays.equals(this.liabilityAccount, other.getLiabilityAccount()))) &&
            ((this.listingDuration==null && other.getListingDuration()==null) || 
             (this.listingDuration!=null &&
              java.util.Arrays.equals(this.listingDuration, other.getListingDuration()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              java.util.Arrays.equals(this.location, other.getLocation()))) &&
            ((this.locationAverageCost==null && other.getLocationAverageCost()==null) || 
             (this.locationAverageCost!=null &&
              java.util.Arrays.equals(this.locationAverageCost, other.getLocationAverageCost()))) &&
            ((this.locationBinQuantityAvailable==null && other.getLocationBinQuantityAvailable()==null) || 
             (this.locationBinQuantityAvailable!=null &&
              java.util.Arrays.equals(this.locationBinQuantityAvailable, other.getLocationBinQuantityAvailable()))) &&
            ((this.locationDefaultReturnCost==null && other.getLocationDefaultReturnCost()==null) || 
             (this.locationDefaultReturnCost!=null &&
              java.util.Arrays.equals(this.locationDefaultReturnCost, other.getLocationDefaultReturnCost()))) &&
            ((this.locationPreferredStockLevel==null && other.getLocationPreferredStockLevel()==null) || 
             (this.locationPreferredStockLevel!=null &&
              java.util.Arrays.equals(this.locationPreferredStockLevel, other.getLocationPreferredStockLevel()))) &&
            ((this.locationQuantityAvailable==null && other.getLocationQuantityAvailable()==null) || 
             (this.locationQuantityAvailable!=null &&
              java.util.Arrays.equals(this.locationQuantityAvailable, other.getLocationQuantityAvailable()))) &&
            ((this.locationQuantityBackOrdered==null && other.getLocationQuantityBackOrdered()==null) || 
             (this.locationQuantityBackOrdered!=null &&
              java.util.Arrays.equals(this.locationQuantityBackOrdered, other.getLocationQuantityBackOrdered()))) &&
            ((this.locationQuantityCommitted==null && other.getLocationQuantityCommitted()==null) || 
             (this.locationQuantityCommitted!=null &&
              java.util.Arrays.equals(this.locationQuantityCommitted, other.getLocationQuantityCommitted()))) &&
            ((this.locationQuantityInTransit==null && other.getLocationQuantityInTransit()==null) || 
             (this.locationQuantityInTransit!=null &&
              java.util.Arrays.equals(this.locationQuantityInTransit, other.getLocationQuantityInTransit()))) &&
            ((this.locationQuantityOnHand==null && other.getLocationQuantityOnHand()==null) || 
             (this.locationQuantityOnHand!=null &&
              java.util.Arrays.equals(this.locationQuantityOnHand, other.getLocationQuantityOnHand()))) &&
            ((this.locationQuantityOnOrder==null && other.getLocationQuantityOnOrder()==null) || 
             (this.locationQuantityOnOrder!=null &&
              java.util.Arrays.equals(this.locationQuantityOnOrder, other.getLocationQuantityOnOrder()))) &&
            ((this.locationReOrderPoint==null && other.getLocationReOrderPoint()==null) || 
             (this.locationReOrderPoint!=null &&
              java.util.Arrays.equals(this.locationReOrderPoint, other.getLocationReOrderPoint()))) &&
            ((this.locationTotalValue==null && other.getLocationTotalValue()==null) || 
             (this.locationTotalValue!=null &&
              java.util.Arrays.equals(this.locationTotalValue, other.getLocationTotalValue()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              java.util.Arrays.equals(this.manufacturer, other.getManufacturer()))) &&
            ((this.manufacturerAddr1==null && other.getManufacturerAddr1()==null) || 
             (this.manufacturerAddr1!=null &&
              java.util.Arrays.equals(this.manufacturerAddr1, other.getManufacturerAddr1()))) &&
            ((this.manufacturerCity==null && other.getManufacturerCity()==null) || 
             (this.manufacturerCity!=null &&
              java.util.Arrays.equals(this.manufacturerCity, other.getManufacturerCity()))) &&
            ((this.manufacturerState==null && other.getManufacturerState()==null) || 
             (this.manufacturerState!=null &&
              java.util.Arrays.equals(this.manufacturerState, other.getManufacturerState()))) &&
            ((this.manufacturerTariff==null && other.getManufacturerTariff()==null) || 
             (this.manufacturerTariff!=null &&
              java.util.Arrays.equals(this.manufacturerTariff, other.getManufacturerTariff()))) &&
            ((this.manufacturerTaxId==null && other.getManufacturerTaxId()==null) || 
             (this.manufacturerTaxId!=null &&
              java.util.Arrays.equals(this.manufacturerTaxId, other.getManufacturerTaxId()))) &&
            ((this.manufacturerZip==null && other.getManufacturerZip()==null) || 
             (this.manufacturerZip!=null &&
              java.util.Arrays.equals(this.manufacturerZip, other.getManufacturerZip()))) &&
            ((this.matchBillToReceipt==null && other.getMatchBillToReceipt()==null) || 
             (this.matchBillToReceipt!=null &&
              java.util.Arrays.equals(this.matchBillToReceipt, other.getMatchBillToReceipt()))) &&
            ((this.memberItem==null && other.getMemberItem()==null) || 
             (this.memberItem!=null &&
              java.util.Arrays.equals(this.memberItem, other.getMemberItem()))) &&
            ((this.memberQuantity==null && other.getMemberQuantity()==null) || 
             (this.memberQuantity!=null &&
              java.util.Arrays.equals(this.memberQuantity, other.getMemberQuantity()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              java.util.Arrays.equals(this.metaTagHtml, other.getMetaTagHtml()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              java.util.Arrays.equals(this.minimumQuantity, other.getMinimumQuantity()))) &&
            ((this.modified==null && other.getModified()==null) || 
             (this.modified!=null &&
              java.util.Arrays.equals(this.modified, other.getModified()))) &&
            ((this.mpn==null && other.getMpn()==null) || 
             (this.mpn!=null &&
              java.util.Arrays.equals(this.mpn, other.getMpn()))) &&
            ((this.multManufactureAddr==null && other.getMultManufactureAddr()==null) || 
             (this.multManufactureAddr!=null &&
              java.util.Arrays.equals(this.multManufactureAddr, other.getMultManufactureAddr()))) &&
            ((this.nextagCategory==null && other.getNextagCategory()==null) || 
             (this.nextagCategory!=null &&
              java.util.Arrays.equals(this.nextagCategory, other.getNextagCategory()))) &&
            ((this.nextagProductFeed==null && other.getNextagProductFeed()==null) || 
             (this.nextagProductFeed!=null &&
              java.util.Arrays.equals(this.nextagProductFeed, other.getNextagProductFeed()))) &&
            ((this.noPriceMessage==null && other.getNoPriceMessage()==null) || 
             (this.noPriceMessage!=null &&
              java.util.Arrays.equals(this.noPriceMessage, other.getNoPriceMessage()))) &&
            ((this.numActiveListings==null && other.getNumActiveListings()==null) || 
             (this.numActiveListings!=null &&
              java.util.Arrays.equals(this.numActiveListings, other.getNumActiveListings()))) &&
            ((this.numberAllowedDownloads==null && other.getNumberAllowedDownloads()==null) || 
             (this.numberAllowedDownloads!=null &&
              java.util.Arrays.equals(this.numberAllowedDownloads, other.getNumberAllowedDownloads()))) &&
            ((this.numCurrentlyListed==null && other.getNumCurrentlyListed()==null) || 
             (this.numCurrentlyListed!=null &&
              java.util.Arrays.equals(this.numCurrentlyListed, other.getNumCurrentlyListed()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              java.util.Arrays.equals(this.offerSupport, other.getOfferSupport()))) &&
            ((this.onlineCustomerPrice==null && other.getOnlineCustomerPrice()==null) || 
             (this.onlineCustomerPrice!=null &&
              java.util.Arrays.equals(this.onlineCustomerPrice, other.getOnlineCustomerPrice()))) &&
            ((this.onlinePrice==null && other.getOnlinePrice()==null) || 
             (this.onlinePrice!=null &&
              java.util.Arrays.equals(this.onlinePrice, other.getOnlinePrice()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              java.util.Arrays.equals(this.onSpecial, other.getOnSpecial()))) &&
            ((this.otherPrices==null && other.getOtherPrices()==null) || 
             (this.otherPrices!=null &&
              java.util.Arrays.equals(this.otherPrices, other.getOtherPrices()))) &&
            ((this.otherVendor==null && other.getOtherVendor()==null) || 
             (this.otherVendor!=null &&
              java.util.Arrays.equals(this.otherVendor, other.getOtherVendor()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              java.util.Arrays.equals(this.outOfStockBehavior, other.getOutOfStockBehavior()))) &&
            ((this.outOfStockMessage==null && other.getOutOfStockMessage()==null) || 
             (this.outOfStockMessage!=null &&
              java.util.Arrays.equals(this.outOfStockMessage, other.getOutOfStockMessage()))) &&
            ((this.overallQuantityPricingType==null && other.getOverallQuantityPricingType()==null) || 
             (this.overallQuantityPricingType!=null &&
              java.util.Arrays.equals(this.overallQuantityPricingType, other.getOverallQuantityPricingType()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              java.util.Arrays.equals(this.pageTitle, other.getPageTitle()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              java.util.Arrays.equals(this.parent, other.getParent()))) &&
            ((this.preferenceCriterion==null && other.getPreferenceCriterion()==null) || 
             (this.preferenceCriterion!=null &&
              java.util.Arrays.equals(this.preferenceCriterion, other.getPreferenceCriterion()))) &&
            ((this.preferredBin==null && other.getPreferredBin()==null) || 
             (this.preferredBin!=null &&
              java.util.Arrays.equals(this.preferredBin, other.getPreferredBin()))) &&
            ((this.preferredLocation==null && other.getPreferredLocation()==null) || 
             (this.preferredLocation!=null &&
              java.util.Arrays.equals(this.preferredLocation, other.getPreferredLocation()))) &&
            ((this.preferredStockLevel==null && other.getPreferredStockLevel()==null) || 
             (this.preferredStockLevel!=null &&
              java.util.Arrays.equals(this.preferredStockLevel, other.getPreferredStockLevel()))) &&
            ((this.preferredStockLevelDays==null && other.getPreferredStockLevelDays()==null) || 
             (this.preferredStockLevelDays!=null &&
              java.util.Arrays.equals(this.preferredStockLevelDays, other.getPreferredStockLevelDays()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              java.util.Arrays.equals(this.pricingGroup, other.getPricingGroup()))) &&
            ((this.primaryCategory==null && other.getPrimaryCategory()==null) || 
             (this.primaryCategory!=null &&
              java.util.Arrays.equals(this.primaryCategory, other.getPrimaryCategory()))) &&
            ((this.purchaseDescription==null && other.getPurchaseDescription()==null) || 
             (this.purchaseDescription!=null &&
              java.util.Arrays.equals(this.purchaseDescription, other.getPurchaseDescription()))) &&
            ((this.purchaseUnit==null && other.getPurchaseUnit()==null) || 
             (this.purchaseUnit!=null &&
              java.util.Arrays.equals(this.purchaseUnit, other.getPurchaseUnit()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              java.util.Arrays.equals(this.quantityAvailable, other.getQuantityAvailable()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              java.util.Arrays.equals(this.quantityBackOrdered, other.getQuantityBackOrdered()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              java.util.Arrays.equals(this.quantityCommitted, other.getQuantityCommitted()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              java.util.Arrays.equals(this.quantityOnHand, other.getQuantityOnHand()))) &&
            ((this.quantityOnOrder==null && other.getQuantityOnOrder()==null) || 
             (this.quantityOnOrder!=null &&
              java.util.Arrays.equals(this.quantityOnOrder, other.getQuantityOnOrder()))) &&
            ((this.quantityPricingSchedule==null && other.getQuantityPricingSchedule()==null) || 
             (this.quantityPricingSchedule!=null &&
              java.util.Arrays.equals(this.quantityPricingSchedule, other.getQuantityPricingSchedule()))) &&
            ((this.reorderMultiple==null && other.getReorderMultiple()==null) || 
             (this.reorderMultiple!=null &&
              java.util.Arrays.equals(this.reorderMultiple, other.getReorderMultiple()))) &&
            ((this.reOrderPoint==null && other.getReOrderPoint()==null) || 
             (this.reOrderPoint!=null &&
              java.util.Arrays.equals(this.reOrderPoint, other.getReOrderPoint()))) &&
            ((this.reservePrice==null && other.getReservePrice()==null) || 
             (this.reservePrice!=null &&
              java.util.Arrays.equals(this.reservePrice, other.getReservePrice()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              java.util.Arrays.equals(this.revRecSchedule, other.getRevRecSchedule()))) &&
            ((this.safetyStockLevel==null && other.getSafetyStockLevel()==null) || 
             (this.safetyStockLevel!=null &&
              java.util.Arrays.equals(this.safetyStockLevel, other.getSafetyStockLevel()))) &&
            ((this.safetyStockLevelDays==null && other.getSafetyStockLevelDays()==null) || 
             (this.safetyStockLevelDays!=null &&
              java.util.Arrays.equals(this.safetyStockLevelDays, other.getSafetyStockLevelDays()))) &&
            ((this.salesDescription==null && other.getSalesDescription()==null) || 
             (this.salesDescription!=null &&
              java.util.Arrays.equals(this.salesDescription, other.getSalesDescription()))) &&
            ((this.salesTaxCode==null && other.getSalesTaxCode()==null) || 
             (this.salesTaxCode!=null &&
              java.util.Arrays.equals(this.salesTaxCode, other.getSalesTaxCode()))) &&
            ((this.saleUnit==null && other.getSaleUnit()==null) || 
             (this.saleUnit!=null &&
              java.util.Arrays.equals(this.saleUnit, other.getSaleUnit()))) &&
            ((this.scheduleBCode==null && other.getScheduleBCode()==null) || 
             (this.scheduleBCode!=null &&
              java.util.Arrays.equals(this.scheduleBCode, other.getScheduleBCode()))) &&
            ((this.scheduleBNumber==null && other.getScheduleBNumber()==null) || 
             (this.scheduleBNumber!=null &&
              java.util.Arrays.equals(this.scheduleBNumber, other.getScheduleBNumber()))) &&
            ((this.scheduleBQuantity==null && other.getScheduleBQuantity()==null) || 
             (this.scheduleBQuantity!=null &&
              java.util.Arrays.equals(this.scheduleBQuantity, other.getScheduleBQuantity()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              java.util.Arrays.equals(this.searchKeywords, other.getSearchKeywords()))) &&
            ((this.seasonalDemand==null && other.getSeasonalDemand()==null) || 
             (this.seasonalDemand!=null &&
              java.util.Arrays.equals(this.seasonalDemand, other.getSeasonalDemand()))) &&
            ((this.sellOnEBay==null && other.getSellOnEBay()==null) || 
             (this.sellOnEBay!=null &&
              java.util.Arrays.equals(this.sellOnEBay, other.getSellOnEBay()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              java.util.Arrays.equals(this.serialNumber, other.getSerialNumber()))) &&
            ((this.serialNumberLocation==null && other.getSerialNumberLocation()==null) || 
             (this.serialNumberLocation!=null &&
              java.util.Arrays.equals(this.serialNumberLocation, other.getSerialNumberLocation()))) &&
            ((this.shipIndividually==null && other.getShipIndividually()==null) || 
             (this.shipIndividually!=null &&
              java.util.Arrays.equals(this.shipIndividually, other.getShipIndividually()))) &&
            ((this.shipPackage==null && other.getShipPackage()==null) || 
             (this.shipPackage!=null &&
              java.util.Arrays.equals(this.shipPackage, other.getShipPackage()))) &&
            ((this.shippingRate==null && other.getShippingRate()==null) || 
             (this.shippingRate!=null &&
              java.util.Arrays.equals(this.shippingRate, other.getShippingRate()))) &&
            ((this.shoppingDotComCategory==null && other.getShoppingDotComCategory()==null) || 
             (this.shoppingDotComCategory!=null &&
              java.util.Arrays.equals(this.shoppingDotComCategory, other.getShoppingDotComCategory()))) &&
            ((this.shoppingProductFeed==null && other.getShoppingProductFeed()==null) || 
             (this.shoppingProductFeed!=null &&
              java.util.Arrays.equals(this.shoppingProductFeed, other.getShoppingProductFeed()))) &&
            ((this.shopzillaCategoryId==null && other.getShopzillaCategoryId()==null) || 
             (this.shopzillaCategoryId!=null &&
              java.util.Arrays.equals(this.shopzillaCategoryId, other.getShopzillaCategoryId()))) &&
            ((this.shopzillaProductFeed==null && other.getShopzillaProductFeed()==null) || 
             (this.shopzillaProductFeed!=null &&
              java.util.Arrays.equals(this.shopzillaProductFeed, other.getShopzillaProductFeed()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              java.util.Arrays.equals(this.sitemapPriority, other.getSitemapPriority()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              java.util.Arrays.equals(this.softDescriptor, other.getSoftDescriptor()))) &&
            ((this.startingPrice==null && other.getStartingPrice()==null) || 
             (this.startingPrice!=null &&
              java.util.Arrays.equals(this.startingPrice, other.getStartingPrice()))) &&
            ((this.stockDescription==null && other.getStockDescription()==null) || 
             (this.stockDescription!=null &&
              java.util.Arrays.equals(this.stockDescription, other.getStockDescription()))) &&
            ((this.stockUnit==null && other.getStockUnit()==null) || 
             (this.stockUnit!=null &&
              java.util.Arrays.equals(this.stockUnit, other.getStockUnit()))) &&
            ((this.storeDescription==null && other.getStoreDescription()==null) || 
             (this.storeDescription!=null &&
              java.util.Arrays.equals(this.storeDescription, other.getStoreDescription()))) &&
            ((this.storeDetailedDescription==null && other.getStoreDetailedDescription()==null) || 
             (this.storeDetailedDescription!=null &&
              java.util.Arrays.equals(this.storeDetailedDescription, other.getStoreDetailedDescription()))) &&
            ((this.storeDisplayImage==null && other.getStoreDisplayImage()==null) || 
             (this.storeDisplayImage!=null &&
              java.util.Arrays.equals(this.storeDisplayImage, other.getStoreDisplayImage()))) &&
            ((this.storeDisplayName==null && other.getStoreDisplayName()==null) || 
             (this.storeDisplayName!=null &&
              java.util.Arrays.equals(this.storeDisplayName, other.getStoreDisplayName()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              java.util.Arrays.equals(this.storeDisplayThumbnail, other.getStoreDisplayThumbnail()))) &&
            ((this.subsidiary==null && other.getSubsidiary()==null) || 
             (this.subsidiary!=null &&
              java.util.Arrays.equals(this.subsidiary, other.getSubsidiary()))) &&
            ((this.subType==null && other.getSubType()==null) || 
             (this.subType!=null &&
              java.util.Arrays.equals(this.subType, other.getSubType()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              java.util.Arrays.equals(this.taxSchedule, other.getTaxSchedule()))) &&
            ((this.thumbNailUrl==null && other.getThumbNailUrl()==null) || 
             (this.thumbNailUrl!=null &&
              java.util.Arrays.equals(this.thumbNailUrl, other.getThumbNailUrl()))) &&
            ((this.totalValue==null && other.getTotalValue()==null) || 
             (this.totalValue!=null &&
              java.util.Arrays.equals(this.totalValue, other.getTotalValue()))) &&
            ((this.trackLandedCost==null && other.getTrackLandedCost()==null) || 
             (this.trackLandedCost!=null &&
              java.util.Arrays.equals(this.trackLandedCost, other.getTrackLandedCost()))) &&
            ((this.transferPrice==null && other.getTransferPrice()==null) || 
             (this.transferPrice!=null &&
              java.util.Arrays.equals(this.transferPrice, other.getTransferPrice()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType()))) &&
            ((this.unbuildVarianceAccount==null && other.getUnbuildVarianceAccount()==null) || 
             (this.unbuildVarianceAccount!=null &&
              java.util.Arrays.equals(this.unbuildVarianceAccount, other.getUnbuildVarianceAccount()))) &&
            ((this.unitsType==null && other.getUnitsType()==null) || 
             (this.unitsType!=null &&
              java.util.Arrays.equals(this.unitsType, other.getUnitsType()))) &&
            ((this.upcCode==null && other.getUpcCode()==null) || 
             (this.upcCode!=null &&
              java.util.Arrays.equals(this.upcCode, other.getUpcCode()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              java.util.Arrays.equals(this.urlComponent, other.getUrlComponent()))) &&
            ((this.useBins==null && other.getUseBins()==null) || 
             (this.useBins!=null &&
              java.util.Arrays.equals(this.useBins, other.getUseBins()))) &&
            ((this.useMarginalRates==null && other.getUseMarginalRates()==null) || 
             (this.useMarginalRates!=null &&
              java.util.Arrays.equals(this.useMarginalRates, other.getUseMarginalRates()))) &&
            ((this.vendor==null && other.getVendor()==null) || 
             (this.vendor!=null &&
              java.util.Arrays.equals(this.vendor, other.getVendor()))) &&
            ((this.vendorCode==null && other.getVendorCode()==null) || 
             (this.vendorCode!=null &&
              java.util.Arrays.equals(this.vendorCode, other.getVendorCode()))) &&
            ((this.vendorCost==null && other.getVendorCost()==null) || 
             (this.vendorCost!=null &&
              java.util.Arrays.equals(this.vendorCost, other.getVendorCost()))) &&
            ((this.vendorName==null && other.getVendorName()==null) || 
             (this.vendorName!=null &&
              java.util.Arrays.equals(this.vendorName, other.getVendorName()))) &&
            ((this.vendorSchedule==null && other.getVendorSchedule()==null) || 
             (this.vendorSchedule!=null &&
              java.util.Arrays.equals(this.vendorSchedule, other.getVendorSchedule()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              java.util.Arrays.equals(this.vsoeDeferral, other.getVsoeDeferral()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              java.util.Arrays.equals(this.vsoeDelivered, other.getVsoeDelivered()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              java.util.Arrays.equals(this.vsoePermitDiscount, other.getVsoePermitDiscount()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              java.util.Arrays.equals(this.vsoePrice, other.getVsoePrice()))) &&
            ((this.webSite==null && other.getWebSite()==null) || 
             (this.webSite!=null &&
              java.util.Arrays.equals(this.webSite, other.getWebSite()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              java.util.Arrays.equals(this.weightUnit, other.getWeightUnit()))) &&
            ((this.yahooProductFeed==null && other.getYahooProductFeed()==null) || 
             (this.yahooProductFeed!=null &&
              java.util.Arrays.equals(this.yahooProductFeed, other.getYahooProductFeed()))) &&
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
        int _hashCode = 1;
        if (getAssetAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssetAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssetAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoLeadTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoLeadTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoLeadTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoPreferredStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoPreferredStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoPreferredStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoReorderPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoReorderPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoReorderPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvailableToPartners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvailableToPartners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvailableToPartners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAverageCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAverageCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAverageCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBasePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBasePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBasePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillExchRateVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillExchRateVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillExchRateVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillPriceVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillPriceVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillPriceVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBillQtyVarianceAcct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillQtyVarianceAcct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillQtyVarianceAcct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinOnHandAvail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinOnHandAvail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinOnHandAvail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinOnHandCount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBinOnHandCount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBinOnHandCount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuildEntireAssembly() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuildEntireAssembly());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuildEntireAssembly(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBuyItNowPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuyItNowPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuyItNowPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (get_class() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_class());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_class(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopyDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopyDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopyDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostEstimateType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostEstimateType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostEstimateType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCostingMethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostingMethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostingMethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCountryOfManufacture() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCountryOfManufacture());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCountryOfManufacture(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreated() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreated());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreated(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateJob() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCreateJob());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCreateJob(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateViewed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDateViewed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDateViewed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDaysBeforeExpiration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDaysBeforeExpiration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDaysBeforeExpiration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultReturnCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultReturnCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultReturnCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferredExpenseAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferredExpenseAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferredExpenseAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeferredRevenueAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDeferredRevenueAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDeferredRevenueAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDemandModifier() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDemandModifier());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDemandModifier(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartment(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDepartmentnohierarchy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartmentnohierarchy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartmentnohierarchy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisplayIneBayStore() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayIneBayStore());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayIneBayStore(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDisplayName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisplayName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisplayName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDontShowPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDontShowPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDontShowPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEBayItemDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBayItemDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBayItemDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEBayItemSubtitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBayItemSubtitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBayItemSubtitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEBayItemTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEBayItemTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEBayItemTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEbayRelistingOption() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEbayRelistingOption());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEbayRelistingOption(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEndAuctionsWhenOutOfStock() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEndAuctionsWhenOutOfStock());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEndAuctionsWhenOutOfStock(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeFromSitemap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeFromSitemap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeFromSitemap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpenseAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExpenseAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExpenseAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeaturedDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeaturedDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeaturedDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeedDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFeedName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFeedName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFeedName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFroogleProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFroogleProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFroogleProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFxCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFxCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFxCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGainLossAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGainLossAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGainLossAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertAuthCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertAuthCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertAuthCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertEmail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertEmail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertEmail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertExpirationDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertExpirationDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertExpirationDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertFrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertFrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertFrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertOriginalAmount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertOriginalAmount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertOriginalAmount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGiftCertRecipient() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGiftCertRecipient());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGiftCertRecipient(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getImageUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getImageUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getImageUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIncomeAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIncomeAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIncomeAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInternalId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInternalId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInternalId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInventoryLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInventoryLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInventoryLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsDropShipItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsDropShipItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsDropShipItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsFulfillable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsFulfillable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsFulfillable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsGcoCompliant() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsGcoCompliant());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsGcoCompliant(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsInactive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsInactive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsInactive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsOnline() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsOnline());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsOnline(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSpecialOrderItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSpecialOrderItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSpecialOrderItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsSpecialWorkOrderItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsSpecialWorkOrderItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsSpecialWorkOrderItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIssueProduct() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIssueProduct());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIssueProduct(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsTaxable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsTaxable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsTaxable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsVsoeBundle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsVsoeBundle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsVsoeBundle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItemUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItemUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItemUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastPurchasePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastPurchasePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastPurchasePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLastQuantityAvailableChange() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastQuantityAvailableChange());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastQuantityAvailableChange(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLeadTime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLeadTime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLeadTime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLiabilityAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLiabilityAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLiabilityAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListingDuration() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListingDuration());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListingDuration(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationAverageCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationAverageCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationAverageCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationBinQuantityAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationBinQuantityAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationBinQuantityAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationDefaultReturnCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationDefaultReturnCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationDefaultReturnCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationPreferredStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationPreferredStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationPreferredStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityBackOrdered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityBackOrdered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityBackOrdered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityInTransit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityInTransit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityInTransit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityOnHand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityOnHand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityOnHand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationQuantityOnOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationQuantityOnOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationQuantityOnOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationReOrderPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationReOrderPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationReOrderPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocationTotalValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocationTotalValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocationTotalValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturer() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturer());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturer(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerAddr1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerAddr1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerAddr1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerCity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerCity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerCity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerTariff() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerTariff());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerTariff(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerTaxId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerTaxId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerTaxId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getManufacturerZip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getManufacturerZip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getManufacturerZip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatchBillToReceipt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMatchBillToReceipt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMatchBillToReceipt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemberItem() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberItem());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberItem(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMemberQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMemberQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMemberQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetaTagHtml() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetaTagHtml());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetaTagHtml(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMinimumQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMinimumQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMinimumQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getModified() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModified());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModified(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMpn() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMpn());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMpn(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultManufactureAddr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultManufactureAddr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultManufactureAddr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextagCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextagCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextagCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextagProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextagProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextagProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNoPriceMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNoPriceMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNoPriceMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumActiveListings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumActiveListings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumActiveListings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumberAllowedDownloads() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumberAllowedDownloads());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumberAllowedDownloads(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumCurrentlyListed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumCurrentlyListed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumCurrentlyListed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOfferSupport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOfferSupport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOfferSupport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnlineCustomerPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnlineCustomerPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnlineCustomerPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnlinePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnlinePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnlinePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOnSpecial() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOnSpecial());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOnSpecial(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherPrices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherPrices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherPrices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOtherVendor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherVendor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherVendor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutOfStockBehavior() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutOfStockBehavior());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutOfStockBehavior(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOutOfStockMessage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOutOfStockMessage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOutOfStockMessage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOverallQuantityPricingType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOverallQuantityPricingType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOverallQuantityPricingType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPageTitle() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPageTitle());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPageTitle(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferenceCriterion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferenceCriterion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferenceCriterion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredBin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredBin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredBin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredStockLevelDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredStockLevelDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredStockLevelDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingGroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPricingGroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPricingGroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPrimaryCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPrimaryCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPrimaryCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPurchaseUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPurchaseUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPurchaseUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityAvailable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityAvailable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityAvailable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityBackOrdered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityBackOrdered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityBackOrdered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityCommitted() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityCommitted());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityCommitted(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityOnHand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityOnHand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityOnHand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityOnOrder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityOnOrder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityOnOrder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuantityPricingSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuantityPricingSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuantityPricingSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReorderMultiple() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReorderMultiple());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReorderMultiple(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReOrderPoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReOrderPoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReOrderPoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReservePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReservePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReservePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRevRecSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRevRecSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRevRecSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSafetyStockLevel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSafetyStockLevel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSafetyStockLevel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSafetyStockLevelDays() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSafetyStockLevelDays());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSafetyStockLevelDays(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSalesTaxCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSalesTaxCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSalesTaxCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSaleUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSaleUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSaleUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleBCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleBCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleBCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleBNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleBNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleBNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScheduleBQuantity() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduleBQuantity());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduleBQuantity(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSearchKeywords() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSearchKeywords());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSearchKeywords(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeasonalDemand() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeasonalDemand());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeasonalDemand(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSellOnEBay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellOnEBay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellOnEBay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSerialNumberLocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSerialNumberLocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSerialNumberLocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipIndividually() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipIndividually());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipIndividually(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipPackage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipPackage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipPackage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShippingRate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShippingRate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShippingRate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShoppingDotComCategory() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShoppingDotComCategory());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShoppingDotComCategory(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShoppingProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShoppingProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShoppingProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShopzillaCategoryId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopzillaCategoryId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopzillaCategoryId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShopzillaProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShopzillaProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShopzillaProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSitemapPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitemapPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitemapPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSoftDescriptor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSoftDescriptor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSoftDescriptor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartingPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStartingPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStartingPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStockDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStockDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStockUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStockUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStockUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDetailedDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDetailedDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDetailedDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDisplayImage() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDisplayImage());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDisplayImage(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDisplayName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDisplayName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDisplayName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoreDisplayThumbnail() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoreDisplayThumbnail());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoreDisplayThumbnail(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubsidiary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubsidiary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubsidiary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaxSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThumbNailUrl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThumbNailUrl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThumbNailUrl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalValue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalValue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalValue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrackLandedCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrackLandedCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrackLandedCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransferPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransferPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransferPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnbuildVarianceAccount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnbuildVarianceAccount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnbuildVarianceAccount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnitsType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnitsType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnitsType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUpcCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUpcCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUpcCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlComponent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlComponent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlComponent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseBins() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseBins());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseBins(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUseMarginalRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUseMarginalRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUseMarginalRates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorCode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorCode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorCode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorCost() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorCost());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorCost(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorSchedule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorSchedule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorSchedule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDeferral() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDeferral());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDeferral(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoeDelivered() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoeDelivered());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoeDelivered(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePermitDiscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePermitDiscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePermitDiscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsoePrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsoePrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsoePrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWebSite() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWebSite());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWebSite(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeightUnit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeightUnit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeightUnit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getYahooProductFeed() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getYahooProductFeed());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getYahooProductFeed(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSearchRowBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assetAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "assetAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoLeadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "autoLeadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "autoPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoReorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "autoReorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "basePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billExchRateVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billExchRateVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPriceVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billPriceVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billQtyVarianceAcct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billQtyVarianceAcct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binOnHandAvail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binOnHandCount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "binOnHandCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buyItNowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "buyItNowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "copyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costingMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "costingMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createJob");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createJob"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredExpenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deferredExpenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("demandModifier");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "demandModifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departmentnohierarchy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "departmentnohierarchy"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayIneBayStore");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "displayIneBayStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eBayItemDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemSubtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eBayItemSubtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EBayItemTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "eBayItemTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ebayRelistingOption");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ebayRelistingOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endAuctionsWhenOutOfStock");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endAuctionsWhenOutOfStock"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "feedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feedName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "feedName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("froogleProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "froogleProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fxCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "fxCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gainLossAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "gainLossAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertAuthCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertAuthCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertExpirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertExpirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertOriginalAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertOriginalAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("giftCertRecipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "giftCertRecipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imageUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "imageUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDropShipItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isDropShipItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSpecialOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSpecialWorkOrderItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSpecialWorkOrderItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isVsoeBundle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isVsoeBundle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "itemUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastQuantityAvailableChange");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "lastQuantityAvailableChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadTime");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "leadTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listingDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "listingDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAverageCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationAverageCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBinQuantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationBinQuantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationDefaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationDefaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationPreferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationPreferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityInTransit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityInTransit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationQuantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationQuantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationReOrderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationReOrderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationTotalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "locationTotalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerAddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerAddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memberItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "memberQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextagCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nextagCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextagProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "nextagProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPriceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "noPriceMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numActiveListings");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "numActiveListings"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberAllowedDownloads");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "numberAllowedDownloads"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numCurrentlyListed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "numCurrentlyListed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlineCustomerPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onlineCustomerPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlinePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onlinePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherPrices");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "otherPrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherVendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "otherVendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "outOfStockMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "preferredStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "primaryCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderMultiple");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reorderMultiple"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reOrderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reOrderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reservePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "reservePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "safetyStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("safetyStockLevelDays");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "safetyStockLevelDays"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seasonalDemand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "seasonalDemand"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellOnEBay");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "sellOnEBay"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumberLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "serialNumberLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shoppingProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shopzillaProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startingPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "stockUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "storeDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thumbNailUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "thumbNailUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "totalValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackLandedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "trackLandedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "transferPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unbuildVarianceAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unbuildVarianceAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendorCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vendorSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "weightUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yahooProductFeed");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "yahooProductFeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
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
