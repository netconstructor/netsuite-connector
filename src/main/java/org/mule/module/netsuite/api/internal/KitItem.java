/**
 * KitItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class KitItem  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.String itemId;

    private java.lang.String upcCode;

    private java.lang.String displayName;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private java.lang.Boolean printItems;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isGcoCompliant;

    private java.lang.Boolean offerSupport;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean availableToPartners;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private java.lang.Boolean includeChildren;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private java.lang.String description;

    private org.mule.module.netsuite.api.internal.RecordRef incomeAccount;

    private org.mule.module.netsuite.api.internal.RecordRef taxSchedule;

    private java.lang.Double shippingCost;

    private java.lang.Double handlingCost;

    private java.lang.Boolean isTaxable;

    private org.mule.module.netsuite.api.internal.RecordRef salesTaxCode;

    private java.lang.Double weight;

    private org.mule.module.netsuite.api.internal.RecordRef weightUnit;

    private java.lang.Double rate;

    private org.mule.module.netsuite.api.internal.RecordRef billingSchedule;

    private org.mule.module.netsuite.api.internal.RecordRef deferredRevenueAccount;

    private org.mule.module.netsuite.api.internal.RecordRef revRecSchedule;

    private java.lang.String stockDescription;

    private java.lang.Boolean producer;

    private java.lang.String manufacturer;

    private java.lang.String mpn;

    private java.lang.Boolean multManufactureAddr;

    private java.lang.String manufactureraddr1;

    private java.lang.String manufacturerCity;

    private java.lang.String manufacturerState;

    private java.lang.String manufacturerZip;

    private org.mule.module.netsuite.api.internal.Country countryOfManufacture;

    private java.lang.String manufacturerTaxId;

    private java.lang.String scheduleBNumber;

    private java.lang.Long scheduleBQuantity;

    private org.mule.module.netsuite.api.internal.RecordRef scheduleBCode;

    private java.lang.String manufacturerTariff;

    private org.mule.module.netsuite.api.internal.ItemPreferenceCriterion preferenceCriterion;

    private org.mule.module.netsuite.api.internal.RecordRef issueProduct;

    private java.lang.Long minimumQuantity;

    private java.lang.Boolean enforceMinQtyInternally;

    private org.mule.module.netsuite.api.internal.RecordRef softDescriptor;

    private java.lang.Boolean isFulfillable;

    private java.lang.Boolean pricesIncludeTax;

    private org.mule.module.netsuite.api.internal.RecordRef quantityPricingSchedule;

    private java.lang.Boolean useMarginalRates;

    private org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType;

    private java.lang.Double costEstimate;

    private org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType overallQuantityPricingType;

    private org.mule.module.netsuite.api.internal.RecordRef pricingGroup;

    private java.lang.Double vsoePrice;

    private org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral;

    private org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount;

    private java.lang.Boolean vsoeDelivered;

    private java.lang.Boolean shipIndividually;

    private org.mule.module.netsuite.api.internal.RecordRef shipPackage;

    private java.lang.String storeDisplayName;

    private org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail;

    private java.lang.String outOfStockMessage;

    private org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage;

    private java.lang.String storeDescription;

    private java.lang.String storeDetailedDescription;

    private org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate;

    private java.lang.String pageTitle;

    private java.lang.String urlComponent;

    private java.lang.String metaTagHtml;

    private java.lang.Boolean excludeFromSitemap;

    private org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority;

    private java.lang.String searchKeywords;

    private org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList;

    private java.lang.Boolean isDonationItem;

    private java.lang.Boolean showDefaultDonationAmount;

    private java.lang.Double maxDonationAmount;

    private java.lang.Boolean dontShowPrice;

    private java.lang.String noPriceMessage;

    private java.lang.String shoppingDotComCategory;

    private java.lang.Long shopzillaCategoryId;

    private org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior;

    private java.lang.String nexTagCategory;

    private org.mule.module.netsuite.api.internal.ProductFeedList productFeedList;

    private java.lang.String relatedItemsDescription;

    private java.lang.Boolean onSpecial;

    private java.lang.String specialsDescription;

    private java.lang.String featuredDescription;

    private org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix;

    private org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList;

    private org.mule.module.netsuite.api.internal.ItemMemberList memberList;

    private org.mule.module.netsuite.api.internal.TranslationList translationsList;

    private org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public KitItem() {
    }

    public KitItem(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.String itemId,
           java.lang.String upcCode,
           java.lang.String displayName,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           java.lang.Boolean printItems,
           java.lang.Boolean isOnline,
           java.lang.Boolean isGcoCompliant,
           java.lang.Boolean offerSupport,
           java.lang.Boolean isInactive,
           java.lang.Boolean availableToPartners,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           java.lang.Boolean includeChildren,
           org.mule.module.netsuite.api.internal.RecordRef location,
           java.lang.String description,
           org.mule.module.netsuite.api.internal.RecordRef incomeAccount,
           org.mule.module.netsuite.api.internal.RecordRef taxSchedule,
           java.lang.Double shippingCost,
           java.lang.Double handlingCost,
           java.lang.Boolean isTaxable,
           org.mule.module.netsuite.api.internal.RecordRef salesTaxCode,
           java.lang.Double weight,
           org.mule.module.netsuite.api.internal.RecordRef weightUnit,
           java.lang.Double rate,
           org.mule.module.netsuite.api.internal.RecordRef billingSchedule,
           org.mule.module.netsuite.api.internal.RecordRef deferredRevenueAccount,
           org.mule.module.netsuite.api.internal.RecordRef revRecSchedule,
           java.lang.String stockDescription,
           java.lang.Boolean producer,
           java.lang.String manufacturer,
           java.lang.String mpn,
           java.lang.Boolean multManufactureAddr,
           java.lang.String manufactureraddr1,
           java.lang.String manufacturerCity,
           java.lang.String manufacturerState,
           java.lang.String manufacturerZip,
           org.mule.module.netsuite.api.internal.Country countryOfManufacture,
           java.lang.String manufacturerTaxId,
           java.lang.String scheduleBNumber,
           java.lang.Long scheduleBQuantity,
           org.mule.module.netsuite.api.internal.RecordRef scheduleBCode,
           java.lang.String manufacturerTariff,
           org.mule.module.netsuite.api.internal.ItemPreferenceCriterion preferenceCriterion,
           org.mule.module.netsuite.api.internal.RecordRef issueProduct,
           java.lang.Long minimumQuantity,
           java.lang.Boolean enforceMinQtyInternally,
           org.mule.module.netsuite.api.internal.RecordRef softDescriptor,
           java.lang.Boolean isFulfillable,
           java.lang.Boolean pricesIncludeTax,
           org.mule.module.netsuite.api.internal.RecordRef quantityPricingSchedule,
           java.lang.Boolean useMarginalRates,
           org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType,
           java.lang.Double costEstimate,
           org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType overallQuantityPricingType,
           org.mule.module.netsuite.api.internal.RecordRef pricingGroup,
           java.lang.Double vsoePrice,
           org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral,
           org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount,
           java.lang.Boolean vsoeDelivered,
           java.lang.Boolean shipIndividually,
           org.mule.module.netsuite.api.internal.RecordRef shipPackage,
           java.lang.String storeDisplayName,
           org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail,
           java.lang.String outOfStockMessage,
           org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage,
           java.lang.String storeDescription,
           java.lang.String storeDetailedDescription,
           org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate,
           java.lang.String pageTitle,
           java.lang.String urlComponent,
           java.lang.String metaTagHtml,
           java.lang.Boolean excludeFromSitemap,
           org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority,
           java.lang.String searchKeywords,
           org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList,
           java.lang.Boolean isDonationItem,
           java.lang.Boolean showDefaultDonationAmount,
           java.lang.Double maxDonationAmount,
           java.lang.Boolean dontShowPrice,
           java.lang.String noPriceMessage,
           java.lang.String shoppingDotComCategory,
           java.lang.Long shopzillaCategoryId,
           org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior,
           java.lang.String nexTagCategory,
           org.mule.module.netsuite.api.internal.ProductFeedList productFeedList,
           java.lang.String relatedItemsDescription,
           java.lang.Boolean onSpecial,
           java.lang.String specialsDescription,
           java.lang.String featuredDescription,
           org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix,
           org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList,
           org.mule.module.netsuite.api.internal.ItemMemberList memberList,
           org.mule.module.netsuite.api.internal.TranslationList translationsList,
           org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.parent = parent;
        this.printItems = printItems;
        this.isOnline = isOnline;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this.subsidiaryList = subsidiaryList;
        this._class = _class;
        this.includeChildren = includeChildren;
        this.location = location;
        this.description = description;
        this.incomeAccount = incomeAccount;
        this.taxSchedule = taxSchedule;
        this.shippingCost = shippingCost;
        this.handlingCost = handlingCost;
        this.isTaxable = isTaxable;
        this.salesTaxCode = salesTaxCode;
        this.weight = weight;
        this.weightUnit = weightUnit;
        this.rate = rate;
        this.billingSchedule = billingSchedule;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.revRecSchedule = revRecSchedule;
        this.stockDescription = stockDescription;
        this.producer = producer;
        this.manufacturer = manufacturer;
        this.mpn = mpn;
        this.multManufactureAddr = multManufactureAddr;
        this.manufactureraddr1 = manufactureraddr1;
        this.manufacturerCity = manufacturerCity;
        this.manufacturerState = manufacturerState;
        this.manufacturerZip = manufacturerZip;
        this.countryOfManufacture = countryOfManufacture;
        this.manufacturerTaxId = manufacturerTaxId;
        this.scheduleBNumber = scheduleBNumber;
        this.scheduleBQuantity = scheduleBQuantity;
        this.scheduleBCode = scheduleBCode;
        this.manufacturerTariff = manufacturerTariff;
        this.preferenceCriterion = preferenceCriterion;
        this.issueProduct = issueProduct;
        this.minimumQuantity = minimumQuantity;
        this.enforceMinQtyInternally = enforceMinQtyInternally;
        this.softDescriptor = softDescriptor;
        this.isFulfillable = isFulfillable;
        this.pricesIncludeTax = pricesIncludeTax;
        this.quantityPricingSchedule = quantityPricingSchedule;
        this.useMarginalRates = useMarginalRates;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.overallQuantityPricingType = overallQuantityPricingType;
        this.pricingGroup = pricingGroup;
        this.vsoePrice = vsoePrice;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.shipIndividually = shipIndividually;
        this.shipPackage = shipPackage;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.outOfStockMessage = outOfStockMessage;
        this.storeDisplayImage = storeDisplayImage;
        this.storeDescription = storeDescription;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeItemTemplate = storeItemTemplate;
        this.pageTitle = pageTitle;
        this.urlComponent = urlComponent;
        this.metaTagHtml = metaTagHtml;
        this.excludeFromSitemap = excludeFromSitemap;
        this.sitemapPriority = sitemapPriority;
        this.searchKeywords = searchKeywords;
        this.itemOptionsList = itemOptionsList;
        this.isDonationItem = isDonationItem;
        this.showDefaultDonationAmount = showDefaultDonationAmount;
        this.maxDonationAmount = maxDonationAmount;
        this.dontShowPrice = dontShowPrice;
        this.noPriceMessage = noPriceMessage;
        this.shoppingDotComCategory = shoppingDotComCategory;
        this.shopzillaCategoryId = shopzillaCategoryId;
        this.outOfStockBehavior = outOfStockBehavior;
        this.nexTagCategory = nexTagCategory;
        this.productFeedList = productFeedList;
        this.relatedItemsDescription = relatedItemsDescription;
        this.onSpecial = onSpecial;
        this.specialsDescription = specialsDescription;
        this.featuredDescription = featuredDescription;
        this.pricingMatrix = pricingMatrix;
        this.siteCategoryList = siteCategoryList;
        this.memberList = memberList;
        this.translationsList = translationsList;
        this.presentationItemList = presentationItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this KitItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this KitItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this KitItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this KitItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this KitItem.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this KitItem.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the itemId value for this KitItem.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this KitItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the upcCode value for this KitItem.
     * 
     * @return upcCode
     */
    public java.lang.String getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this KitItem.
     * 
     * @param upcCode
     */
    public void setUpcCode(java.lang.String upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the displayName value for this KitItem.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this KitItem.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the parent value for this KitItem.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this KitItem.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the printItems value for this KitItem.
     * 
     * @return printItems
     */
    public java.lang.Boolean getPrintItems() {
        return printItems;
    }


    /**
     * Sets the printItems value for this KitItem.
     * 
     * @param printItems
     */
    public void setPrintItems(java.lang.Boolean printItems) {
        this.printItems = printItems;
    }


    /**
     * Gets the isOnline value for this KitItem.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this KitItem.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isGcoCompliant value for this KitItem.
     * 
     * @return isGcoCompliant
     */
    public java.lang.Boolean getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this KitItem.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(java.lang.Boolean isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }


    /**
     * Gets the offerSupport value for this KitItem.
     * 
     * @return offerSupport
     */
    public java.lang.Boolean getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this KitItem.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(java.lang.Boolean offerSupport) {
        this.offerSupport = offerSupport;
    }


    /**
     * Gets the isInactive value for this KitItem.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this KitItem.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the availableToPartners value for this KitItem.
     * 
     * @return availableToPartners
     */
    public java.lang.Boolean getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this KitItem.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(java.lang.Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the department value for this KitItem.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this KitItem.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the subsidiaryList value for this KitItem.
     * 
     * @return subsidiaryList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this KitItem.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the _class value for this KitItem.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this KitItem.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the includeChildren value for this KitItem.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this KitItem.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the location value for this KitItem.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this KitItem.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the description value for this KitItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this KitItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the incomeAccount value for this KitItem.
     * 
     * @return incomeAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this KitItem.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(org.mule.module.netsuite.api.internal.RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }


    /**
     * Gets the taxSchedule value for this KitItem.
     * 
     * @return taxSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this KitItem.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(org.mule.module.netsuite.api.internal.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the shippingCost value for this KitItem.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this KitItem.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the handlingCost value for this KitItem.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this KitItem.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the isTaxable value for this KitItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this KitItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the salesTaxCode value for this KitItem.
     * 
     * @return salesTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this KitItem.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(org.mule.module.netsuite.api.internal.RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }


    /**
     * Gets the weight value for this KitItem.
     * 
     * @return weight
     */
    public java.lang.Double getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this KitItem.
     * 
     * @param weight
     */
    public void setWeight(java.lang.Double weight) {
        this.weight = weight;
    }


    /**
     * Gets the weightUnit value for this KitItem.
     * 
     * @return weightUnit
     */
    public org.mule.module.netsuite.api.internal.RecordRef getWeightUnit() {
        return weightUnit;
    }


    /**
     * Sets the weightUnit value for this KitItem.
     * 
     * @param weightUnit
     */
    public void setWeightUnit(org.mule.module.netsuite.api.internal.RecordRef weightUnit) {
        this.weightUnit = weightUnit;
    }


    /**
     * Gets the rate value for this KitItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this KitItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the billingSchedule value for this KitItem.
     * 
     * @return billingSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this KitItem.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(org.mule.module.netsuite.api.internal.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the deferredRevenueAccount value for this KitItem.
     * 
     * @return deferredRevenueAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDeferredRevenueAccount() {
        return deferredRevenueAccount;
    }


    /**
     * Sets the deferredRevenueAccount value for this KitItem.
     * 
     * @param deferredRevenueAccount
     */
    public void setDeferredRevenueAccount(org.mule.module.netsuite.api.internal.RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }


    /**
     * Gets the revRecSchedule value for this KitItem.
     * 
     * @return revRecSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getRevRecSchedule() {
        return revRecSchedule;
    }


    /**
     * Sets the revRecSchedule value for this KitItem.
     * 
     * @param revRecSchedule
     */
    public void setRevRecSchedule(org.mule.module.netsuite.api.internal.RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }


    /**
     * Gets the stockDescription value for this KitItem.
     * 
     * @return stockDescription
     */
    public java.lang.String getStockDescription() {
        return stockDescription;
    }


    /**
     * Sets the stockDescription value for this KitItem.
     * 
     * @param stockDescription
     */
    public void setStockDescription(java.lang.String stockDescription) {
        this.stockDescription = stockDescription;
    }


    /**
     * Gets the producer value for this KitItem.
     * 
     * @return producer
     */
    public java.lang.Boolean getProducer() {
        return producer;
    }


    /**
     * Sets the producer value for this KitItem.
     * 
     * @param producer
     */
    public void setProducer(java.lang.Boolean producer) {
        this.producer = producer;
    }


    /**
     * Gets the manufacturer value for this KitItem.
     * 
     * @return manufacturer
     */
    public java.lang.String getManufacturer() {
        return manufacturer;
    }


    /**
     * Sets the manufacturer value for this KitItem.
     * 
     * @param manufacturer
     */
    public void setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
    }


    /**
     * Gets the mpn value for this KitItem.
     * 
     * @return mpn
     */
    public java.lang.String getMpn() {
        return mpn;
    }


    /**
     * Sets the mpn value for this KitItem.
     * 
     * @param mpn
     */
    public void setMpn(java.lang.String mpn) {
        this.mpn = mpn;
    }


    /**
     * Gets the multManufactureAddr value for this KitItem.
     * 
     * @return multManufactureAddr
     */
    public java.lang.Boolean getMultManufactureAddr() {
        return multManufactureAddr;
    }


    /**
     * Sets the multManufactureAddr value for this KitItem.
     * 
     * @param multManufactureAddr
     */
    public void setMultManufactureAddr(java.lang.Boolean multManufactureAddr) {
        this.multManufactureAddr = multManufactureAddr;
    }


    /**
     * Gets the manufactureraddr1 value for this KitItem.
     * 
     * @return manufactureraddr1
     */
    public java.lang.String getManufactureraddr1() {
        return manufactureraddr1;
    }


    /**
     * Sets the manufactureraddr1 value for this KitItem.
     * 
     * @param manufactureraddr1
     */
    public void setManufactureraddr1(java.lang.String manufactureraddr1) {
        this.manufactureraddr1 = manufactureraddr1;
    }


    /**
     * Gets the manufacturerCity value for this KitItem.
     * 
     * @return manufacturerCity
     */
    public java.lang.String getManufacturerCity() {
        return manufacturerCity;
    }


    /**
     * Sets the manufacturerCity value for this KitItem.
     * 
     * @param manufacturerCity
     */
    public void setManufacturerCity(java.lang.String manufacturerCity) {
        this.manufacturerCity = manufacturerCity;
    }


    /**
     * Gets the manufacturerState value for this KitItem.
     * 
     * @return manufacturerState
     */
    public java.lang.String getManufacturerState() {
        return manufacturerState;
    }


    /**
     * Sets the manufacturerState value for this KitItem.
     * 
     * @param manufacturerState
     */
    public void setManufacturerState(java.lang.String manufacturerState) {
        this.manufacturerState = manufacturerState;
    }


    /**
     * Gets the manufacturerZip value for this KitItem.
     * 
     * @return manufacturerZip
     */
    public java.lang.String getManufacturerZip() {
        return manufacturerZip;
    }


    /**
     * Sets the manufacturerZip value for this KitItem.
     * 
     * @param manufacturerZip
     */
    public void setManufacturerZip(java.lang.String manufacturerZip) {
        this.manufacturerZip = manufacturerZip;
    }


    /**
     * Gets the countryOfManufacture value for this KitItem.
     * 
     * @return countryOfManufacture
     */
    public org.mule.module.netsuite.api.internal.Country getCountryOfManufacture() {
        return countryOfManufacture;
    }


    /**
     * Sets the countryOfManufacture value for this KitItem.
     * 
     * @param countryOfManufacture
     */
    public void setCountryOfManufacture(org.mule.module.netsuite.api.internal.Country countryOfManufacture) {
        this.countryOfManufacture = countryOfManufacture;
    }


    /**
     * Gets the manufacturerTaxId value for this KitItem.
     * 
     * @return manufacturerTaxId
     */
    public java.lang.String getManufacturerTaxId() {
        return manufacturerTaxId;
    }


    /**
     * Sets the manufacturerTaxId value for this KitItem.
     * 
     * @param manufacturerTaxId
     */
    public void setManufacturerTaxId(java.lang.String manufacturerTaxId) {
        this.manufacturerTaxId = manufacturerTaxId;
    }


    /**
     * Gets the scheduleBNumber value for this KitItem.
     * 
     * @return scheduleBNumber
     */
    public java.lang.String getScheduleBNumber() {
        return scheduleBNumber;
    }


    /**
     * Sets the scheduleBNumber value for this KitItem.
     * 
     * @param scheduleBNumber
     */
    public void setScheduleBNumber(java.lang.String scheduleBNumber) {
        this.scheduleBNumber = scheduleBNumber;
    }


    /**
     * Gets the scheduleBQuantity value for this KitItem.
     * 
     * @return scheduleBQuantity
     */
    public java.lang.Long getScheduleBQuantity() {
        return scheduleBQuantity;
    }


    /**
     * Sets the scheduleBQuantity value for this KitItem.
     * 
     * @param scheduleBQuantity
     */
    public void setScheduleBQuantity(java.lang.Long scheduleBQuantity) {
        this.scheduleBQuantity = scheduleBQuantity;
    }


    /**
     * Gets the scheduleBCode value for this KitItem.
     * 
     * @return scheduleBCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getScheduleBCode() {
        return scheduleBCode;
    }


    /**
     * Sets the scheduleBCode value for this KitItem.
     * 
     * @param scheduleBCode
     */
    public void setScheduleBCode(org.mule.module.netsuite.api.internal.RecordRef scheduleBCode) {
        this.scheduleBCode = scheduleBCode;
    }


    /**
     * Gets the manufacturerTariff value for this KitItem.
     * 
     * @return manufacturerTariff
     */
    public java.lang.String getManufacturerTariff() {
        return manufacturerTariff;
    }


    /**
     * Sets the manufacturerTariff value for this KitItem.
     * 
     * @param manufacturerTariff
     */
    public void setManufacturerTariff(java.lang.String manufacturerTariff) {
        this.manufacturerTariff = manufacturerTariff;
    }


    /**
     * Gets the preferenceCriterion value for this KitItem.
     * 
     * @return preferenceCriterion
     */
    public org.mule.module.netsuite.api.internal.ItemPreferenceCriterion getPreferenceCriterion() {
        return preferenceCriterion;
    }


    /**
     * Sets the preferenceCriterion value for this KitItem.
     * 
     * @param preferenceCriterion
     */
    public void setPreferenceCriterion(org.mule.module.netsuite.api.internal.ItemPreferenceCriterion preferenceCriterion) {
        this.preferenceCriterion = preferenceCriterion;
    }


    /**
     * Gets the issueProduct value for this KitItem.
     * 
     * @return issueProduct
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this KitItem.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(org.mule.module.netsuite.api.internal.RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the minimumQuantity value for this KitItem.
     * 
     * @return minimumQuantity
     */
    public java.lang.Long getMinimumQuantity() {
        return minimumQuantity;
    }


    /**
     * Sets the minimumQuantity value for this KitItem.
     * 
     * @param minimumQuantity
     */
    public void setMinimumQuantity(java.lang.Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }


    /**
     * Gets the enforceMinQtyInternally value for this KitItem.
     * 
     * @return enforceMinQtyInternally
     */
    public java.lang.Boolean getEnforceMinQtyInternally() {
        return enforceMinQtyInternally;
    }


    /**
     * Sets the enforceMinQtyInternally value for this KitItem.
     * 
     * @param enforceMinQtyInternally
     */
    public void setEnforceMinQtyInternally(java.lang.Boolean enforceMinQtyInternally) {
        this.enforceMinQtyInternally = enforceMinQtyInternally;
    }


    /**
     * Gets the softDescriptor value for this KitItem.
     * 
     * @return softDescriptor
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSoftDescriptor() {
        return softDescriptor;
    }


    /**
     * Sets the softDescriptor value for this KitItem.
     * 
     * @param softDescriptor
     */
    public void setSoftDescriptor(org.mule.module.netsuite.api.internal.RecordRef softDescriptor) {
        this.softDescriptor = softDescriptor;
    }


    /**
     * Gets the isFulfillable value for this KitItem.
     * 
     * @return isFulfillable
     */
    public java.lang.Boolean getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this KitItem.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(java.lang.Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the pricesIncludeTax value for this KitItem.
     * 
     * @return pricesIncludeTax
     */
    public java.lang.Boolean getPricesIncludeTax() {
        return pricesIncludeTax;
    }


    /**
     * Sets the pricesIncludeTax value for this KitItem.
     * 
     * @param pricesIncludeTax
     */
    public void setPricesIncludeTax(java.lang.Boolean pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }


    /**
     * Gets the quantityPricingSchedule value for this KitItem.
     * 
     * @return quantityPricingSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getQuantityPricingSchedule() {
        return quantityPricingSchedule;
    }


    /**
     * Sets the quantityPricingSchedule value for this KitItem.
     * 
     * @param quantityPricingSchedule
     */
    public void setQuantityPricingSchedule(org.mule.module.netsuite.api.internal.RecordRef quantityPricingSchedule) {
        this.quantityPricingSchedule = quantityPricingSchedule;
    }


    /**
     * Gets the useMarginalRates value for this KitItem.
     * 
     * @return useMarginalRates
     */
    public java.lang.Boolean getUseMarginalRates() {
        return useMarginalRates;
    }


    /**
     * Sets the useMarginalRates value for this KitItem.
     * 
     * @param useMarginalRates
     */
    public void setUseMarginalRates(java.lang.Boolean useMarginalRates) {
        this.useMarginalRates = useMarginalRates;
    }


    /**
     * Gets the costEstimateType value for this KitItem.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this KitItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the costEstimate value for this KitItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this KitItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the overallQuantityPricingType value for this KitItem.
     * 
     * @return overallQuantityPricingType
     */
    public org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType getOverallQuantityPricingType() {
        return overallQuantityPricingType;
    }


    /**
     * Sets the overallQuantityPricingType value for this KitItem.
     * 
     * @param overallQuantityPricingType
     */
    public void setOverallQuantityPricingType(org.mule.module.netsuite.api.internal.ItemOverallQuantityPricingType overallQuantityPricingType) {
        this.overallQuantityPricingType = overallQuantityPricingType;
    }


    /**
     * Gets the pricingGroup value for this KitItem.
     * 
     * @return pricingGroup
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPricingGroup() {
        return pricingGroup;
    }


    /**
     * Sets the pricingGroup value for this KitItem.
     * 
     * @param pricingGroup
     */
    public void setPricingGroup(org.mule.module.netsuite.api.internal.RecordRef pricingGroup) {
        this.pricingGroup = pricingGroup;
    }


    /**
     * Gets the vsoePrice value for this KitItem.
     * 
     * @return vsoePrice
     */
    public java.lang.Double getVsoePrice() {
        return vsoePrice;
    }


    /**
     * Sets the vsoePrice value for this KitItem.
     * 
     * @param vsoePrice
     */
    public void setVsoePrice(java.lang.Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }


    /**
     * Gets the vsoeDeferral value for this KitItem.
     * 
     * @return vsoeDeferral
     */
    public org.mule.module.netsuite.api.internal.VsoeDeferral getVsoeDeferral() {
        return vsoeDeferral;
    }


    /**
     * Sets the vsoeDeferral value for this KitItem.
     * 
     * @param vsoeDeferral
     */
    public void setVsoeDeferral(org.mule.module.netsuite.api.internal.VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }


    /**
     * Gets the vsoePermitDiscount value for this KitItem.
     * 
     * @return vsoePermitDiscount
     */
    public org.mule.module.netsuite.api.internal.VsoePermitDiscount getVsoePermitDiscount() {
        return vsoePermitDiscount;
    }


    /**
     * Sets the vsoePermitDiscount value for this KitItem.
     * 
     * @param vsoePermitDiscount
     */
    public void setVsoePermitDiscount(org.mule.module.netsuite.api.internal.VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }


    /**
     * Gets the vsoeDelivered value for this KitItem.
     * 
     * @return vsoeDelivered
     */
    public java.lang.Boolean getVsoeDelivered() {
        return vsoeDelivered;
    }


    /**
     * Sets the vsoeDelivered value for this KitItem.
     * 
     * @param vsoeDelivered
     */
    public void setVsoeDelivered(java.lang.Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }


    /**
     * Gets the shipIndividually value for this KitItem.
     * 
     * @return shipIndividually
     */
    public java.lang.Boolean getShipIndividually() {
        return shipIndividually;
    }


    /**
     * Sets the shipIndividually value for this KitItem.
     * 
     * @param shipIndividually
     */
    public void setShipIndividually(java.lang.Boolean shipIndividually) {
        this.shipIndividually = shipIndividually;
    }


    /**
     * Gets the shipPackage value for this KitItem.
     * 
     * @return shipPackage
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipPackage() {
        return shipPackage;
    }


    /**
     * Sets the shipPackage value for this KitItem.
     * 
     * @param shipPackage
     */
    public void setShipPackage(org.mule.module.netsuite.api.internal.RecordRef shipPackage) {
        this.shipPackage = shipPackage;
    }


    /**
     * Gets the storeDisplayName value for this KitItem.
     * 
     * @return storeDisplayName
     */
    public java.lang.String getStoreDisplayName() {
        return storeDisplayName;
    }


    /**
     * Sets the storeDisplayName value for this KitItem.
     * 
     * @param storeDisplayName
     */
    public void setStoreDisplayName(java.lang.String storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }


    /**
     * Gets the storeDisplayThumbnail value for this KitItem.
     * 
     * @return storeDisplayThumbnail
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this KitItem.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }


    /**
     * Gets the outOfStockMessage value for this KitItem.
     * 
     * @return outOfStockMessage
     */
    public java.lang.String getOutOfStockMessage() {
        return outOfStockMessage;
    }


    /**
     * Sets the outOfStockMessage value for this KitItem.
     * 
     * @param outOfStockMessage
     */
    public void setOutOfStockMessage(java.lang.String outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }


    /**
     * Gets the storeDisplayImage value for this KitItem.
     * 
     * @return storeDisplayImage
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this KitItem.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }


    /**
     * Gets the storeDescription value for this KitItem.
     * 
     * @return storeDescription
     */
    public java.lang.String getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this KitItem.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(java.lang.String storeDescription) {
        this.storeDescription = storeDescription;
    }


    /**
     * Gets the storeDetailedDescription value for this KitItem.
     * 
     * @return storeDetailedDescription
     */
    public java.lang.String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this KitItem.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(java.lang.String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }


    /**
     * Gets the storeItemTemplate value for this KitItem.
     * 
     * @return storeItemTemplate
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreItemTemplate() {
        return storeItemTemplate;
    }


    /**
     * Sets the storeItemTemplate value for this KitItem.
     * 
     * @param storeItemTemplate
     */
    public void setStoreItemTemplate(org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate) {
        this.storeItemTemplate = storeItemTemplate;
    }


    /**
     * Gets the pageTitle value for this KitItem.
     * 
     * @return pageTitle
     */
    public java.lang.String getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this KitItem.
     * 
     * @param pageTitle
     */
    public void setPageTitle(java.lang.String pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the urlComponent value for this KitItem.
     * 
     * @return urlComponent
     */
    public java.lang.String getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this KitItem.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(java.lang.String urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the metaTagHtml value for this KitItem.
     * 
     * @return metaTagHtml
     */
    public java.lang.String getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this KitItem.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(java.lang.String metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the excludeFromSitemap value for this KitItem.
     * 
     * @return excludeFromSitemap
     */
    public java.lang.Boolean getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this KitItem.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(java.lang.Boolean excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the sitemapPriority value for this KitItem.
     * 
     * @return sitemapPriority
     */
    public org.mule.module.netsuite.api.internal.SitemapPriority getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this KitItem.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the searchKeywords value for this KitItem.
     * 
     * @return searchKeywords
     */
    public java.lang.String getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this KitItem.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(java.lang.String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the itemOptionsList value for this KitItem.
     * 
     * @return itemOptionsList
     */
    public org.mule.module.netsuite.api.internal.ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }


    /**
     * Sets the itemOptionsList value for this KitItem.
     * 
     * @param itemOptionsList
     */
    public void setItemOptionsList(org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }


    /**
     * Gets the isDonationItem value for this KitItem.
     * 
     * @return isDonationItem
     */
    public java.lang.Boolean getIsDonationItem() {
        return isDonationItem;
    }


    /**
     * Sets the isDonationItem value for this KitItem.
     * 
     * @param isDonationItem
     */
    public void setIsDonationItem(java.lang.Boolean isDonationItem) {
        this.isDonationItem = isDonationItem;
    }


    /**
     * Gets the showDefaultDonationAmount value for this KitItem.
     * 
     * @return showDefaultDonationAmount
     */
    public java.lang.Boolean getShowDefaultDonationAmount() {
        return showDefaultDonationAmount;
    }


    /**
     * Sets the showDefaultDonationAmount value for this KitItem.
     * 
     * @param showDefaultDonationAmount
     */
    public void setShowDefaultDonationAmount(java.lang.Boolean showDefaultDonationAmount) {
        this.showDefaultDonationAmount = showDefaultDonationAmount;
    }


    /**
     * Gets the maxDonationAmount value for this KitItem.
     * 
     * @return maxDonationAmount
     */
    public java.lang.Double getMaxDonationAmount() {
        return maxDonationAmount;
    }


    /**
     * Sets the maxDonationAmount value for this KitItem.
     * 
     * @param maxDonationAmount
     */
    public void setMaxDonationAmount(java.lang.Double maxDonationAmount) {
        this.maxDonationAmount = maxDonationAmount;
    }


    /**
     * Gets the dontShowPrice value for this KitItem.
     * 
     * @return dontShowPrice
     */
    public java.lang.Boolean getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this KitItem.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(java.lang.Boolean dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }


    /**
     * Gets the noPriceMessage value for this KitItem.
     * 
     * @return noPriceMessage
     */
    public java.lang.String getNoPriceMessage() {
        return noPriceMessage;
    }


    /**
     * Sets the noPriceMessage value for this KitItem.
     * 
     * @param noPriceMessage
     */
    public void setNoPriceMessage(java.lang.String noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }


    /**
     * Gets the shoppingDotComCategory value for this KitItem.
     * 
     * @return shoppingDotComCategory
     */
    public java.lang.String getShoppingDotComCategory() {
        return shoppingDotComCategory;
    }


    /**
     * Sets the shoppingDotComCategory value for this KitItem.
     * 
     * @param shoppingDotComCategory
     */
    public void setShoppingDotComCategory(java.lang.String shoppingDotComCategory) {
        this.shoppingDotComCategory = shoppingDotComCategory;
    }


    /**
     * Gets the shopzillaCategoryId value for this KitItem.
     * 
     * @return shopzillaCategoryId
     */
    public java.lang.Long getShopzillaCategoryId() {
        return shopzillaCategoryId;
    }


    /**
     * Sets the shopzillaCategoryId value for this KitItem.
     * 
     * @param shopzillaCategoryId
     */
    public void setShopzillaCategoryId(java.lang.Long shopzillaCategoryId) {
        this.shopzillaCategoryId = shopzillaCategoryId;
    }


    /**
     * Gets the outOfStockBehavior value for this KitItem.
     * 
     * @return outOfStockBehavior
     */
    public org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this KitItem.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }


    /**
     * Gets the nexTagCategory value for this KitItem.
     * 
     * @return nexTagCategory
     */
    public java.lang.String getNexTagCategory() {
        return nexTagCategory;
    }


    /**
     * Sets the nexTagCategory value for this KitItem.
     * 
     * @param nexTagCategory
     */
    public void setNexTagCategory(java.lang.String nexTagCategory) {
        this.nexTagCategory = nexTagCategory;
    }


    /**
     * Gets the productFeedList value for this KitItem.
     * 
     * @return productFeedList
     */
    public org.mule.module.netsuite.api.internal.ProductFeedList getProductFeedList() {
        return productFeedList;
    }


    /**
     * Sets the productFeedList value for this KitItem.
     * 
     * @param productFeedList
     */
    public void setProductFeedList(org.mule.module.netsuite.api.internal.ProductFeedList productFeedList) {
        this.productFeedList = productFeedList;
    }


    /**
     * Gets the relatedItemsDescription value for this KitItem.
     * 
     * @return relatedItemsDescription
     */
    public java.lang.String getRelatedItemsDescription() {
        return relatedItemsDescription;
    }


    /**
     * Sets the relatedItemsDescription value for this KitItem.
     * 
     * @param relatedItemsDescription
     */
    public void setRelatedItemsDescription(java.lang.String relatedItemsDescription) {
        this.relatedItemsDescription = relatedItemsDescription;
    }


    /**
     * Gets the onSpecial value for this KitItem.
     * 
     * @return onSpecial
     */
    public java.lang.Boolean getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this KitItem.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(java.lang.Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }


    /**
     * Gets the specialsDescription value for this KitItem.
     * 
     * @return specialsDescription
     */
    public java.lang.String getSpecialsDescription() {
        return specialsDescription;
    }


    /**
     * Sets the specialsDescription value for this KitItem.
     * 
     * @param specialsDescription
     */
    public void setSpecialsDescription(java.lang.String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }


    /**
     * Gets the featuredDescription value for this KitItem.
     * 
     * @return featuredDescription
     */
    public java.lang.String getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this KitItem.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(java.lang.String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the pricingMatrix value for this KitItem.
     * 
     * @return pricingMatrix
     */
    public org.mule.module.netsuite.api.internal.PricingMatrix getPricingMatrix() {
        return pricingMatrix;
    }


    /**
     * Sets the pricingMatrix value for this KitItem.
     * 
     * @param pricingMatrix
     */
    public void setPricingMatrix(org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }


    /**
     * Gets the siteCategoryList value for this KitItem.
     * 
     * @return siteCategoryList
     */
    public org.mule.module.netsuite.api.internal.SiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }


    /**
     * Sets the siteCategoryList value for this KitItem.
     * 
     * @param siteCategoryList
     */
    public void setSiteCategoryList(org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }


    /**
     * Gets the memberList value for this KitItem.
     * 
     * @return memberList
     */
    public org.mule.module.netsuite.api.internal.ItemMemberList getMemberList() {
        return memberList;
    }


    /**
     * Sets the memberList value for this KitItem.
     * 
     * @param memberList
     */
    public void setMemberList(org.mule.module.netsuite.api.internal.ItemMemberList memberList) {
        this.memberList = memberList;
    }


    /**
     * Gets the translationsList value for this KitItem.
     * 
     * @return translationsList
     */
    public org.mule.module.netsuite.api.internal.TranslationList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this KitItem.
     * 
     * @param translationsList
     */
    public void setTranslationsList(org.mule.module.netsuite.api.internal.TranslationList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the presentationItemList value for this KitItem.
     * 
     * @return presentationItemList
     */
    public org.mule.module.netsuite.api.internal.PresentationItemList getPresentationItemList() {
        return presentationItemList;
    }


    /**
     * Sets the presentationItemList value for this KitItem.
     * 
     * @param presentationItemList
     */
    public void setPresentationItemList(org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
    }


    /**
     * Gets the customFieldList value for this KitItem.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this KitItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this KitItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this KitItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this KitItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this KitItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof KitItem)) return false;
        KitItem other = (KitItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.itemId==null && other.getItemId()==null) || 
             (this.itemId!=null &&
              this.itemId.equals(other.getItemId()))) &&
            ((this.upcCode==null && other.getUpcCode()==null) || 
             (this.upcCode!=null &&
              this.upcCode.equals(other.getUpcCode()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
            ((this.printItems==null && other.getPrintItems()==null) || 
             (this.printItems!=null &&
              this.printItems.equals(other.getPrintItems()))) &&
            ((this.isOnline==null && other.getIsOnline()==null) || 
             (this.isOnline!=null &&
              this.isOnline.equals(other.getIsOnline()))) &&
            ((this.isGcoCompliant==null && other.getIsGcoCompliant()==null) || 
             (this.isGcoCompliant!=null &&
              this.isGcoCompliant.equals(other.getIsGcoCompliant()))) &&
            ((this.offerSupport==null && other.getOfferSupport()==null) || 
             (this.offerSupport!=null &&
              this.offerSupport.equals(other.getOfferSupport()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.availableToPartners==null && other.getAvailableToPartners()==null) || 
             (this.availableToPartners!=null &&
              this.availableToPartners.equals(other.getAvailableToPartners()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              this.incomeAccount.equals(other.getIncomeAccount()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.salesTaxCode==null && other.getSalesTaxCode()==null) || 
             (this.salesTaxCode!=null &&
              this.salesTaxCode.equals(other.getSalesTaxCode()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.weightUnit==null && other.getWeightUnit()==null) || 
             (this.weightUnit!=null &&
              this.weightUnit.equals(other.getWeightUnit()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.deferredRevenueAccount==null && other.getDeferredRevenueAccount()==null) || 
             (this.deferredRevenueAccount!=null &&
              this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount()))) &&
            ((this.revRecSchedule==null && other.getRevRecSchedule()==null) || 
             (this.revRecSchedule!=null &&
              this.revRecSchedule.equals(other.getRevRecSchedule()))) &&
            ((this.stockDescription==null && other.getStockDescription()==null) || 
             (this.stockDescription!=null &&
              this.stockDescription.equals(other.getStockDescription()))) &&
            ((this.producer==null && other.getProducer()==null) || 
             (this.producer!=null &&
              this.producer.equals(other.getProducer()))) &&
            ((this.manufacturer==null && other.getManufacturer()==null) || 
             (this.manufacturer!=null &&
              this.manufacturer.equals(other.getManufacturer()))) &&
            ((this.mpn==null && other.getMpn()==null) || 
             (this.mpn!=null &&
              this.mpn.equals(other.getMpn()))) &&
            ((this.multManufactureAddr==null && other.getMultManufactureAddr()==null) || 
             (this.multManufactureAddr!=null &&
              this.multManufactureAddr.equals(other.getMultManufactureAddr()))) &&
            ((this.manufactureraddr1==null && other.getManufactureraddr1()==null) || 
             (this.manufactureraddr1!=null &&
              this.manufactureraddr1.equals(other.getManufactureraddr1()))) &&
            ((this.manufacturerCity==null && other.getManufacturerCity()==null) || 
             (this.manufacturerCity!=null &&
              this.manufacturerCity.equals(other.getManufacturerCity()))) &&
            ((this.manufacturerState==null && other.getManufacturerState()==null) || 
             (this.manufacturerState!=null &&
              this.manufacturerState.equals(other.getManufacturerState()))) &&
            ((this.manufacturerZip==null && other.getManufacturerZip()==null) || 
             (this.manufacturerZip!=null &&
              this.manufacturerZip.equals(other.getManufacturerZip()))) &&
            ((this.countryOfManufacture==null && other.getCountryOfManufacture()==null) || 
             (this.countryOfManufacture!=null &&
              this.countryOfManufacture.equals(other.getCountryOfManufacture()))) &&
            ((this.manufacturerTaxId==null && other.getManufacturerTaxId()==null) || 
             (this.manufacturerTaxId!=null &&
              this.manufacturerTaxId.equals(other.getManufacturerTaxId()))) &&
            ((this.scheduleBNumber==null && other.getScheduleBNumber()==null) || 
             (this.scheduleBNumber!=null &&
              this.scheduleBNumber.equals(other.getScheduleBNumber()))) &&
            ((this.scheduleBQuantity==null && other.getScheduleBQuantity()==null) || 
             (this.scheduleBQuantity!=null &&
              this.scheduleBQuantity.equals(other.getScheduleBQuantity()))) &&
            ((this.scheduleBCode==null && other.getScheduleBCode()==null) || 
             (this.scheduleBCode!=null &&
              this.scheduleBCode.equals(other.getScheduleBCode()))) &&
            ((this.manufacturerTariff==null && other.getManufacturerTariff()==null) || 
             (this.manufacturerTariff!=null &&
              this.manufacturerTariff.equals(other.getManufacturerTariff()))) &&
            ((this.preferenceCriterion==null && other.getPreferenceCriterion()==null) || 
             (this.preferenceCriterion!=null &&
              this.preferenceCriterion.equals(other.getPreferenceCriterion()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.minimumQuantity==null && other.getMinimumQuantity()==null) || 
             (this.minimumQuantity!=null &&
              this.minimumQuantity.equals(other.getMinimumQuantity()))) &&
            ((this.enforceMinQtyInternally==null && other.getEnforceMinQtyInternally()==null) || 
             (this.enforceMinQtyInternally!=null &&
              this.enforceMinQtyInternally.equals(other.getEnforceMinQtyInternally()))) &&
            ((this.softDescriptor==null && other.getSoftDescriptor()==null) || 
             (this.softDescriptor!=null &&
              this.softDescriptor.equals(other.getSoftDescriptor()))) &&
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              this.isFulfillable.equals(other.getIsFulfillable()))) &&
            ((this.pricesIncludeTax==null && other.getPricesIncludeTax()==null) || 
             (this.pricesIncludeTax!=null &&
              this.pricesIncludeTax.equals(other.getPricesIncludeTax()))) &&
            ((this.quantityPricingSchedule==null && other.getQuantityPricingSchedule()==null) || 
             (this.quantityPricingSchedule!=null &&
              this.quantityPricingSchedule.equals(other.getQuantityPricingSchedule()))) &&
            ((this.useMarginalRates==null && other.getUseMarginalRates()==null) || 
             (this.useMarginalRates!=null &&
              this.useMarginalRates.equals(other.getUseMarginalRates()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.overallQuantityPricingType==null && other.getOverallQuantityPricingType()==null) || 
             (this.overallQuantityPricingType!=null &&
              this.overallQuantityPricingType.equals(other.getOverallQuantityPricingType()))) &&
            ((this.pricingGroup==null && other.getPricingGroup()==null) || 
             (this.pricingGroup!=null &&
              this.pricingGroup.equals(other.getPricingGroup()))) &&
            ((this.vsoePrice==null && other.getVsoePrice()==null) || 
             (this.vsoePrice!=null &&
              this.vsoePrice.equals(other.getVsoePrice()))) &&
            ((this.vsoeDeferral==null && other.getVsoeDeferral()==null) || 
             (this.vsoeDeferral!=null &&
              this.vsoeDeferral.equals(other.getVsoeDeferral()))) &&
            ((this.vsoePermitDiscount==null && other.getVsoePermitDiscount()==null) || 
             (this.vsoePermitDiscount!=null &&
              this.vsoePermitDiscount.equals(other.getVsoePermitDiscount()))) &&
            ((this.vsoeDelivered==null && other.getVsoeDelivered()==null) || 
             (this.vsoeDelivered!=null &&
              this.vsoeDelivered.equals(other.getVsoeDelivered()))) &&
            ((this.shipIndividually==null && other.getShipIndividually()==null) || 
             (this.shipIndividually!=null &&
              this.shipIndividually.equals(other.getShipIndividually()))) &&
            ((this.shipPackage==null && other.getShipPackage()==null) || 
             (this.shipPackage!=null &&
              this.shipPackage.equals(other.getShipPackage()))) &&
            ((this.storeDisplayName==null && other.getStoreDisplayName()==null) || 
             (this.storeDisplayName!=null &&
              this.storeDisplayName.equals(other.getStoreDisplayName()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail()))) &&
            ((this.outOfStockMessage==null && other.getOutOfStockMessage()==null) || 
             (this.outOfStockMessage!=null &&
              this.outOfStockMessage.equals(other.getOutOfStockMessage()))) &&
            ((this.storeDisplayImage==null && other.getStoreDisplayImage()==null) || 
             (this.storeDisplayImage!=null &&
              this.storeDisplayImage.equals(other.getStoreDisplayImage()))) &&
            ((this.storeDescription==null && other.getStoreDescription()==null) || 
             (this.storeDescription!=null &&
              this.storeDescription.equals(other.getStoreDescription()))) &&
            ((this.storeDetailedDescription==null && other.getStoreDetailedDescription()==null) || 
             (this.storeDetailedDescription!=null &&
              this.storeDetailedDescription.equals(other.getStoreDetailedDescription()))) &&
            ((this.storeItemTemplate==null && other.getStoreItemTemplate()==null) || 
             (this.storeItemTemplate!=null &&
              this.storeItemTemplate.equals(other.getStoreItemTemplate()))) &&
            ((this.pageTitle==null && other.getPageTitle()==null) || 
             (this.pageTitle!=null &&
              this.pageTitle.equals(other.getPageTitle()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
            ((this.metaTagHtml==null && other.getMetaTagHtml()==null) || 
             (this.metaTagHtml!=null &&
              this.metaTagHtml.equals(other.getMetaTagHtml()))) &&
            ((this.excludeFromSitemap==null && other.getExcludeFromSitemap()==null) || 
             (this.excludeFromSitemap!=null &&
              this.excludeFromSitemap.equals(other.getExcludeFromSitemap()))) &&
            ((this.sitemapPriority==null && other.getSitemapPriority()==null) || 
             (this.sitemapPriority!=null &&
              this.sitemapPriority.equals(other.getSitemapPriority()))) &&
            ((this.searchKeywords==null && other.getSearchKeywords()==null) || 
             (this.searchKeywords!=null &&
              this.searchKeywords.equals(other.getSearchKeywords()))) &&
            ((this.itemOptionsList==null && other.getItemOptionsList()==null) || 
             (this.itemOptionsList!=null &&
              this.itemOptionsList.equals(other.getItemOptionsList()))) &&
            ((this.isDonationItem==null && other.getIsDonationItem()==null) || 
             (this.isDonationItem!=null &&
              this.isDonationItem.equals(other.getIsDonationItem()))) &&
            ((this.showDefaultDonationAmount==null && other.getShowDefaultDonationAmount()==null) || 
             (this.showDefaultDonationAmount!=null &&
              this.showDefaultDonationAmount.equals(other.getShowDefaultDonationAmount()))) &&
            ((this.maxDonationAmount==null && other.getMaxDonationAmount()==null) || 
             (this.maxDonationAmount!=null &&
              this.maxDonationAmount.equals(other.getMaxDonationAmount()))) &&
            ((this.dontShowPrice==null && other.getDontShowPrice()==null) || 
             (this.dontShowPrice!=null &&
              this.dontShowPrice.equals(other.getDontShowPrice()))) &&
            ((this.noPriceMessage==null && other.getNoPriceMessage()==null) || 
             (this.noPriceMessage!=null &&
              this.noPriceMessage.equals(other.getNoPriceMessage()))) &&
            ((this.shoppingDotComCategory==null && other.getShoppingDotComCategory()==null) || 
             (this.shoppingDotComCategory!=null &&
              this.shoppingDotComCategory.equals(other.getShoppingDotComCategory()))) &&
            ((this.shopzillaCategoryId==null && other.getShopzillaCategoryId()==null) || 
             (this.shopzillaCategoryId!=null &&
              this.shopzillaCategoryId.equals(other.getShopzillaCategoryId()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              this.outOfStockBehavior.equals(other.getOutOfStockBehavior()))) &&
            ((this.nexTagCategory==null && other.getNexTagCategory()==null) || 
             (this.nexTagCategory!=null &&
              this.nexTagCategory.equals(other.getNexTagCategory()))) &&
            ((this.productFeedList==null && other.getProductFeedList()==null) || 
             (this.productFeedList!=null &&
              this.productFeedList.equals(other.getProductFeedList()))) &&
            ((this.relatedItemsDescription==null && other.getRelatedItemsDescription()==null) || 
             (this.relatedItemsDescription!=null &&
              this.relatedItemsDescription.equals(other.getRelatedItemsDescription()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              this.onSpecial.equals(other.getOnSpecial()))) &&
            ((this.specialsDescription==null && other.getSpecialsDescription()==null) || 
             (this.specialsDescription!=null &&
              this.specialsDescription.equals(other.getSpecialsDescription()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
            ((this.pricingMatrix==null && other.getPricingMatrix()==null) || 
             (this.pricingMatrix!=null &&
              this.pricingMatrix.equals(other.getPricingMatrix()))) &&
            ((this.siteCategoryList==null && other.getSiteCategoryList()==null) || 
             (this.siteCategoryList!=null &&
              this.siteCategoryList.equals(other.getSiteCategoryList()))) &&
            ((this.memberList==null && other.getMemberList()==null) || 
             (this.memberList!=null &&
              this.memberList.equals(other.getMemberList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.presentationItemList==null && other.getPresentationItemList()==null) || 
             (this.presentationItemList!=null &&
              this.presentationItemList.equals(other.getPresentationItemList()))) &&
            ((this.customFieldList==null && other.getCustomFieldList()==null) || 
             (this.customFieldList!=null &&
              this.customFieldList.equals(other.getCustomFieldList()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.externalId==null && other.getExternalId()==null) || 
             (this.externalId!=null &&
              this.externalId.equals(other.getExternalId())));
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getItemId() != null) {
            _hashCode += getItemId().hashCode();
        }
        if (getUpcCode() != null) {
            _hashCode += getUpcCode().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
        }
        if (getPrintItems() != null) {
            _hashCode += getPrintItems().hashCode();
        }
        if (getIsOnline() != null) {
            _hashCode += getIsOnline().hashCode();
        }
        if (getIsGcoCompliant() != null) {
            _hashCode += getIsGcoCompliant().hashCode();
        }
        if (getOfferSupport() != null) {
            _hashCode += getOfferSupport().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getAvailableToPartners() != null) {
            _hashCode += getAvailableToPartners().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIncomeAccount() != null) {
            _hashCode += getIncomeAccount().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getSalesTaxCode() != null) {
            _hashCode += getSalesTaxCode().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getWeightUnit() != null) {
            _hashCode += getWeightUnit().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getDeferredRevenueAccount() != null) {
            _hashCode += getDeferredRevenueAccount().hashCode();
        }
        if (getRevRecSchedule() != null) {
            _hashCode += getRevRecSchedule().hashCode();
        }
        if (getStockDescription() != null) {
            _hashCode += getStockDescription().hashCode();
        }
        if (getProducer() != null) {
            _hashCode += getProducer().hashCode();
        }
        if (getManufacturer() != null) {
            _hashCode += getManufacturer().hashCode();
        }
        if (getMpn() != null) {
            _hashCode += getMpn().hashCode();
        }
        if (getMultManufactureAddr() != null) {
            _hashCode += getMultManufactureAddr().hashCode();
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
        if (getManufacturerZip() != null) {
            _hashCode += getManufacturerZip().hashCode();
        }
        if (getCountryOfManufacture() != null) {
            _hashCode += getCountryOfManufacture().hashCode();
        }
        if (getManufacturerTaxId() != null) {
            _hashCode += getManufacturerTaxId().hashCode();
        }
        if (getScheduleBNumber() != null) {
            _hashCode += getScheduleBNumber().hashCode();
        }
        if (getScheduleBQuantity() != null) {
            _hashCode += getScheduleBQuantity().hashCode();
        }
        if (getScheduleBCode() != null) {
            _hashCode += getScheduleBCode().hashCode();
        }
        if (getManufacturerTariff() != null) {
            _hashCode += getManufacturerTariff().hashCode();
        }
        if (getPreferenceCriterion() != null) {
            _hashCode += getPreferenceCriterion().hashCode();
        }
        if (getIssueProduct() != null) {
            _hashCode += getIssueProduct().hashCode();
        }
        if (getMinimumQuantity() != null) {
            _hashCode += getMinimumQuantity().hashCode();
        }
        if (getEnforceMinQtyInternally() != null) {
            _hashCode += getEnforceMinQtyInternally().hashCode();
        }
        if (getSoftDescriptor() != null) {
            _hashCode += getSoftDescriptor().hashCode();
        }
        if (getIsFulfillable() != null) {
            _hashCode += getIsFulfillable().hashCode();
        }
        if (getPricesIncludeTax() != null) {
            _hashCode += getPricesIncludeTax().hashCode();
        }
        if (getQuantityPricingSchedule() != null) {
            _hashCode += getQuantityPricingSchedule().hashCode();
        }
        if (getUseMarginalRates() != null) {
            _hashCode += getUseMarginalRates().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getOverallQuantityPricingType() != null) {
            _hashCode += getOverallQuantityPricingType().hashCode();
        }
        if (getPricingGroup() != null) {
            _hashCode += getPricingGroup().hashCode();
        }
        if (getVsoePrice() != null) {
            _hashCode += getVsoePrice().hashCode();
        }
        if (getVsoeDeferral() != null) {
            _hashCode += getVsoeDeferral().hashCode();
        }
        if (getVsoePermitDiscount() != null) {
            _hashCode += getVsoePermitDiscount().hashCode();
        }
        if (getVsoeDelivered() != null) {
            _hashCode += getVsoeDelivered().hashCode();
        }
        if (getShipIndividually() != null) {
            _hashCode += getShipIndividually().hashCode();
        }
        if (getShipPackage() != null) {
            _hashCode += getShipPackage().hashCode();
        }
        if (getStoreDisplayName() != null) {
            _hashCode += getStoreDisplayName().hashCode();
        }
        if (getStoreDisplayThumbnail() != null) {
            _hashCode += getStoreDisplayThumbnail().hashCode();
        }
        if (getOutOfStockMessage() != null) {
            _hashCode += getOutOfStockMessage().hashCode();
        }
        if (getStoreDisplayImage() != null) {
            _hashCode += getStoreDisplayImage().hashCode();
        }
        if (getStoreDescription() != null) {
            _hashCode += getStoreDescription().hashCode();
        }
        if (getStoreDetailedDescription() != null) {
            _hashCode += getStoreDetailedDescription().hashCode();
        }
        if (getStoreItemTemplate() != null) {
            _hashCode += getStoreItemTemplate().hashCode();
        }
        if (getPageTitle() != null) {
            _hashCode += getPageTitle().hashCode();
        }
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
        }
        if (getMetaTagHtml() != null) {
            _hashCode += getMetaTagHtml().hashCode();
        }
        if (getExcludeFromSitemap() != null) {
            _hashCode += getExcludeFromSitemap().hashCode();
        }
        if (getSitemapPriority() != null) {
            _hashCode += getSitemapPriority().hashCode();
        }
        if (getSearchKeywords() != null) {
            _hashCode += getSearchKeywords().hashCode();
        }
        if (getItemOptionsList() != null) {
            _hashCode += getItemOptionsList().hashCode();
        }
        if (getIsDonationItem() != null) {
            _hashCode += getIsDonationItem().hashCode();
        }
        if (getShowDefaultDonationAmount() != null) {
            _hashCode += getShowDefaultDonationAmount().hashCode();
        }
        if (getMaxDonationAmount() != null) {
            _hashCode += getMaxDonationAmount().hashCode();
        }
        if (getDontShowPrice() != null) {
            _hashCode += getDontShowPrice().hashCode();
        }
        if (getNoPriceMessage() != null) {
            _hashCode += getNoPriceMessage().hashCode();
        }
        if (getShoppingDotComCategory() != null) {
            _hashCode += getShoppingDotComCategory().hashCode();
        }
        if (getShopzillaCategoryId() != null) {
            _hashCode += getShopzillaCategoryId().hashCode();
        }
        if (getOutOfStockBehavior() != null) {
            _hashCode += getOutOfStockBehavior().hashCode();
        }
        if (getNexTagCategory() != null) {
            _hashCode += getNexTagCategory().hashCode();
        }
        if (getProductFeedList() != null) {
            _hashCode += getProductFeedList().hashCode();
        }
        if (getRelatedItemsDescription() != null) {
            _hashCode += getRelatedItemsDescription().hashCode();
        }
        if (getOnSpecial() != null) {
            _hashCode += getOnSpecial().hashCode();
        }
        if (getSpecialsDescription() != null) {
            _hashCode += getSpecialsDescription().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
        }
        if (getPricingMatrix() != null) {
            _hashCode += getPricingMatrix().hashCode();
        }
        if (getSiteCategoryList() != null) {
            _hashCode += getSiteCategoryList().hashCode();
        }
        if (getMemberList() != null) {
            _hashCode += getMemberList().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getPresentationItemList() != null) {
            _hashCode += getPresentationItemList().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getExternalId() != null) {
            _hashCode += getExternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(KitItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "KitItem"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "internalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new javax.xml.namespace.QName("", "externalId"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("printItems");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "printItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGcoCompliant");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isGcoCompliant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offerSupport");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "offerSupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weightUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "weightUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "stockDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "producer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mpn");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "mpn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multManufactureAddr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "multManufactureAddr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufactureraddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufactureraddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryOfManufacture");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "countryOfManufacture"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTaxId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerTaxId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "scheduleBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "scheduleBQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleBCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "scheduleBCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturerTariff");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "manufacturerTariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferenceCriterion");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferenceCriterion"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemPreferenceCriterion"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enforceMinQtyInternally");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "enforceMinQtyInternally"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricesIncludeTax");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pricesIncludeTax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityPricingSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityPricingSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarginalRates");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "useMarginalRates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overallQuantityPricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "overallQuantityPricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemOverallQuantityPricingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIndividually");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipIndividually"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPackage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shipPackage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayName");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDisplayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "outOfStockMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDisplayImage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDisplayImage"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeDetailedDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeDetailedDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeItemTemplate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "storeItemTemplate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pageTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pageTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaTagHtml");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "metaTagHtml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeFromSitemap");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "excludeFromSitemap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitemapPriority");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "sitemapPriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "SitemapPriority"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKeywords");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "searchKeywords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemOptionsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "itemOptionsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemOptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isDonationItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "isDonationItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showDefaultDonationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "showDefaultDonationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxDonationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "maxDonationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dontShowPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "dontShowPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noPriceMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "noPriceMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shoppingDotComCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shoppingDotComCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopzillaCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shopzillaCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexTagCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "nexTagCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productFeedList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "productFeedList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ProductFeedList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedItemsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "relatedItemsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onSpecial");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "onSpecial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "specialsDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingMatrix");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "pricingMatrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PricingMatrix"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteCategoryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "siteCategoryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SiteCategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "memberList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemMemberList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("presentationItemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "presentationItemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "PresentationItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "CustomFieldList"));
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
