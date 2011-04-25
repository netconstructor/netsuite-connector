/**
 * GiftCertificateItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GiftCertificateItem  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.String itemId;

    private java.lang.String upcCode;

    private java.lang.String displayName;

    private java.lang.Boolean includeChildren;

    private org.mule.module.netsuite.api.internal.RecordRef parent;

    private java.lang.Boolean isOnline;

    private java.lang.Boolean isGcoCompliant;

    private java.lang.Boolean offerSupport;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean availableToPartners;

    private org.mule.module.netsuite.api.internal.RecordRef department;

    private org.mule.module.netsuite.api.internal.RecordRef _class;

    private org.mule.module.netsuite.api.internal.RecordRef location;

    private org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList;

    private java.lang.String salesDescription;

    private org.mule.module.netsuite.api.internal.RecordRef incomeAccount;

    private org.mule.module.netsuite.api.internal.RecordRef liabilityAccount;

    private java.lang.Long daysBeforeExpiration;

    private java.lang.Boolean isTaxable;

    private java.lang.Double rate;

    private java.lang.String urlComponent;

    private org.mule.module.netsuite.api.internal.RecordRef salesTaxCode;

    private java.lang.Boolean pricesIncludeTax;

    private org.mule.module.netsuite.api.internal.RecordRef taxSchedule;

    private java.lang.Double costEstimate;

    private org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType;

    private org.mule.module.netsuite.api.internal.RecordRef billingSchedule;

    private org.mule.module.netsuite.api.internal.RecordRef issueProduct;

    private java.lang.Boolean isFulfillable;

    private java.lang.String storeDisplayName;

    private org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail;

    private org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage;

    private java.lang.String storeDescription;

    private java.lang.String storeDetailedDescription;

    private org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate;

    private java.lang.String pageTitle;

    private java.lang.String metaTagHtml;

    private java.lang.Boolean excludeFromSitemap;

    private org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority;

    private java.lang.String searchKeywords;

    private java.lang.Boolean isDonationItem;

    private java.lang.Boolean showDefaultDonationAmount;

    private java.lang.Double maxDonationAmount;

    private java.lang.Boolean dontShowPrice;

    private java.lang.String noPriceMessage;

    private java.lang.String outOfStockMessage;

    private java.lang.Boolean onSpecial;

    private org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior;

    private java.lang.String specialsDescription;

    private java.lang.String featuredDescription;

    private java.lang.String relatedItemsDescription;

    private org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix;

    private org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodesList authCodesList;

    private org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList;

    private org.mule.module.netsuite.api.internal.TranslationList translationsList;

    private org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList;

    private org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public GiftCertificateItem() {
    }

    public GiftCertificateItem(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.String itemId,
           java.lang.String upcCode,
           java.lang.String displayName,
           java.lang.Boolean includeChildren,
           org.mule.module.netsuite.api.internal.RecordRef parent,
           java.lang.Boolean isOnline,
           java.lang.Boolean isGcoCompliant,
           java.lang.Boolean offerSupport,
           java.lang.Boolean isInactive,
           java.lang.Boolean availableToPartners,
           org.mule.module.netsuite.api.internal.RecordRef department,
           org.mule.module.netsuite.api.internal.RecordRef _class,
           org.mule.module.netsuite.api.internal.RecordRef location,
           org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList,
           java.lang.String salesDescription,
           org.mule.module.netsuite.api.internal.RecordRef incomeAccount,
           org.mule.module.netsuite.api.internal.RecordRef liabilityAccount,
           java.lang.Long daysBeforeExpiration,
           java.lang.Boolean isTaxable,
           java.lang.Double rate,
           java.lang.String urlComponent,
           org.mule.module.netsuite.api.internal.RecordRef salesTaxCode,
           java.lang.Boolean pricesIncludeTax,
           org.mule.module.netsuite.api.internal.RecordRef taxSchedule,
           java.lang.Double costEstimate,
           org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType,
           org.mule.module.netsuite.api.internal.RecordRef billingSchedule,
           org.mule.module.netsuite.api.internal.RecordRef issueProduct,
           java.lang.Boolean isFulfillable,
           java.lang.String storeDisplayName,
           org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail,
           org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage,
           java.lang.String storeDescription,
           java.lang.String storeDetailedDescription,
           org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate,
           java.lang.String pageTitle,
           java.lang.String metaTagHtml,
           java.lang.Boolean excludeFromSitemap,
           org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority,
           java.lang.String searchKeywords,
           java.lang.Boolean isDonationItem,
           java.lang.Boolean showDefaultDonationAmount,
           java.lang.Double maxDonationAmount,
           java.lang.Boolean dontShowPrice,
           java.lang.String noPriceMessage,
           java.lang.String outOfStockMessage,
           java.lang.Boolean onSpecial,
           org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior,
           java.lang.String specialsDescription,
           java.lang.String featuredDescription,
           java.lang.String relatedItemsDescription,
           org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix,
           org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodesList authCodesList,
           org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList,
           org.mule.module.netsuite.api.internal.TranslationList translationsList,
           org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList,
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
        this.includeChildren = includeChildren;
        this.parent = parent;
        this.isOnline = isOnline;
        this.isGcoCompliant = isGcoCompliant;
        this.offerSupport = offerSupport;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiaryList = subsidiaryList;
        this.salesDescription = salesDescription;
        this.incomeAccount = incomeAccount;
        this.liabilityAccount = liabilityAccount;
        this.daysBeforeExpiration = daysBeforeExpiration;
        this.isTaxable = isTaxable;
        this.rate = rate;
        this.urlComponent = urlComponent;
        this.salesTaxCode = salesTaxCode;
        this.pricesIncludeTax = pricesIncludeTax;
        this.taxSchedule = taxSchedule;
        this.costEstimate = costEstimate;
        this.costEstimateType = costEstimateType;
        this.billingSchedule = billingSchedule;
        this.issueProduct = issueProduct;
        this.isFulfillable = isFulfillable;
        this.storeDisplayName = storeDisplayName;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.storeDisplayImage = storeDisplayImage;
        this.storeDescription = storeDescription;
        this.storeDetailedDescription = storeDetailedDescription;
        this.storeItemTemplate = storeItemTemplate;
        this.pageTitle = pageTitle;
        this.metaTagHtml = metaTagHtml;
        this.excludeFromSitemap = excludeFromSitemap;
        this.sitemapPriority = sitemapPriority;
        this.searchKeywords = searchKeywords;
        this.isDonationItem = isDonationItem;
        this.showDefaultDonationAmount = showDefaultDonationAmount;
        this.maxDonationAmount = maxDonationAmount;
        this.dontShowPrice = dontShowPrice;
        this.noPriceMessage = noPriceMessage;
        this.outOfStockMessage = outOfStockMessage;
        this.onSpecial = onSpecial;
        this.outOfStockBehavior = outOfStockBehavior;
        this.specialsDescription = specialsDescription;
        this.featuredDescription = featuredDescription;
        this.relatedItemsDescription = relatedItemsDescription;
        this.pricingMatrix = pricingMatrix;
        this.authCodesList = authCodesList;
        this.siteCategoryList = siteCategoryList;
        this.translationsList = translationsList;
        this.itemOptionsList = itemOptionsList;
        this.presentationItemList = presentationItemList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this GiftCertificateItem.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this GiftCertificateItem.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this GiftCertificateItem.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this GiftCertificateItem.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this GiftCertificateItem.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this GiftCertificateItem.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the itemId value for this GiftCertificateItem.
     * 
     * @return itemId
     */
    public java.lang.String getItemId() {
        return itemId;
    }


    /**
     * Sets the itemId value for this GiftCertificateItem.
     * 
     * @param itemId
     */
    public void setItemId(java.lang.String itemId) {
        this.itemId = itemId;
    }


    /**
     * Gets the upcCode value for this GiftCertificateItem.
     * 
     * @return upcCode
     */
    public java.lang.String getUpcCode() {
        return upcCode;
    }


    /**
     * Sets the upcCode value for this GiftCertificateItem.
     * 
     * @param upcCode
     */
    public void setUpcCode(java.lang.String upcCode) {
        this.upcCode = upcCode;
    }


    /**
     * Gets the displayName value for this GiftCertificateItem.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this GiftCertificateItem.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the includeChildren value for this GiftCertificateItem.
     * 
     * @return includeChildren
     */
    public java.lang.Boolean getIncludeChildren() {
        return includeChildren;
    }


    /**
     * Sets the includeChildren value for this GiftCertificateItem.
     * 
     * @param includeChildren
     */
    public void setIncludeChildren(java.lang.Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }


    /**
     * Gets the parent value for this GiftCertificateItem.
     * 
     * @return parent
     */
    public org.mule.module.netsuite.api.internal.RecordRef getParent() {
        return parent;
    }


    /**
     * Sets the parent value for this GiftCertificateItem.
     * 
     * @param parent
     */
    public void setParent(org.mule.module.netsuite.api.internal.RecordRef parent) {
        this.parent = parent;
    }


    /**
     * Gets the isOnline value for this GiftCertificateItem.
     * 
     * @return isOnline
     */
    public java.lang.Boolean getIsOnline() {
        return isOnline;
    }


    /**
     * Sets the isOnline value for this GiftCertificateItem.
     * 
     * @param isOnline
     */
    public void setIsOnline(java.lang.Boolean isOnline) {
        this.isOnline = isOnline;
    }


    /**
     * Gets the isGcoCompliant value for this GiftCertificateItem.
     * 
     * @return isGcoCompliant
     */
    public java.lang.Boolean getIsGcoCompliant() {
        return isGcoCompliant;
    }


    /**
     * Sets the isGcoCompliant value for this GiftCertificateItem.
     * 
     * @param isGcoCompliant
     */
    public void setIsGcoCompliant(java.lang.Boolean isGcoCompliant) {
        this.isGcoCompliant = isGcoCompliant;
    }


    /**
     * Gets the offerSupport value for this GiftCertificateItem.
     * 
     * @return offerSupport
     */
    public java.lang.Boolean getOfferSupport() {
        return offerSupport;
    }


    /**
     * Sets the offerSupport value for this GiftCertificateItem.
     * 
     * @param offerSupport
     */
    public void setOfferSupport(java.lang.Boolean offerSupport) {
        this.offerSupport = offerSupport;
    }


    /**
     * Gets the isInactive value for this GiftCertificateItem.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this GiftCertificateItem.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the availableToPartners value for this GiftCertificateItem.
     * 
     * @return availableToPartners
     */
    public java.lang.Boolean getAvailableToPartners() {
        return availableToPartners;
    }


    /**
     * Sets the availableToPartners value for this GiftCertificateItem.
     * 
     * @param availableToPartners
     */
    public void setAvailableToPartners(java.lang.Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }


    /**
     * Gets the department value for this GiftCertificateItem.
     * 
     * @return department
     */
    public org.mule.module.netsuite.api.internal.RecordRef getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this GiftCertificateItem.
     * 
     * @param department
     */
    public void setDepartment(org.mule.module.netsuite.api.internal.RecordRef department) {
        this.department = department;
    }


    /**
     * Gets the _class value for this GiftCertificateItem.
     * 
     * @return _class
     */
    public org.mule.module.netsuite.api.internal.RecordRef get_class() {
        return _class;
    }


    /**
     * Sets the _class value for this GiftCertificateItem.
     * 
     * @param _class
     */
    public void set_class(org.mule.module.netsuite.api.internal.RecordRef _class) {
        this._class = _class;
    }


    /**
     * Gets the location value for this GiftCertificateItem.
     * 
     * @return location
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocation() {
        return location;
    }


    /**
     * Sets the location value for this GiftCertificateItem.
     * 
     * @param location
     */
    public void setLocation(org.mule.module.netsuite.api.internal.RecordRef location) {
        this.location = location;
    }


    /**
     * Gets the subsidiaryList value for this GiftCertificateItem.
     * 
     * @return subsidiaryList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getSubsidiaryList() {
        return subsidiaryList;
    }


    /**
     * Sets the subsidiaryList value for this GiftCertificateItem.
     * 
     * @param subsidiaryList
     */
    public void setSubsidiaryList(org.mule.module.netsuite.api.internal.RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }


    /**
     * Gets the salesDescription value for this GiftCertificateItem.
     * 
     * @return salesDescription
     */
    public java.lang.String getSalesDescription() {
        return salesDescription;
    }


    /**
     * Sets the salesDescription value for this GiftCertificateItem.
     * 
     * @param salesDescription
     */
    public void setSalesDescription(java.lang.String salesDescription) {
        this.salesDescription = salesDescription;
    }


    /**
     * Gets the incomeAccount value for this GiftCertificateItem.
     * 
     * @return incomeAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIncomeAccount() {
        return incomeAccount;
    }


    /**
     * Sets the incomeAccount value for this GiftCertificateItem.
     * 
     * @param incomeAccount
     */
    public void setIncomeAccount(org.mule.module.netsuite.api.internal.RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }


    /**
     * Gets the liabilityAccount value for this GiftCertificateItem.
     * 
     * @return liabilityAccount
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLiabilityAccount() {
        return liabilityAccount;
    }


    /**
     * Sets the liabilityAccount value for this GiftCertificateItem.
     * 
     * @param liabilityAccount
     */
    public void setLiabilityAccount(org.mule.module.netsuite.api.internal.RecordRef liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }


    /**
     * Gets the daysBeforeExpiration value for this GiftCertificateItem.
     * 
     * @return daysBeforeExpiration
     */
    public java.lang.Long getDaysBeforeExpiration() {
        return daysBeforeExpiration;
    }


    /**
     * Sets the daysBeforeExpiration value for this GiftCertificateItem.
     * 
     * @param daysBeforeExpiration
     */
    public void setDaysBeforeExpiration(java.lang.Long daysBeforeExpiration) {
        this.daysBeforeExpiration = daysBeforeExpiration;
    }


    /**
     * Gets the isTaxable value for this GiftCertificateItem.
     * 
     * @return isTaxable
     */
    public java.lang.Boolean getIsTaxable() {
        return isTaxable;
    }


    /**
     * Sets the isTaxable value for this GiftCertificateItem.
     * 
     * @param isTaxable
     */
    public void setIsTaxable(java.lang.Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }


    /**
     * Gets the rate value for this GiftCertificateItem.
     * 
     * @return rate
     */
    public java.lang.Double getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this GiftCertificateItem.
     * 
     * @param rate
     */
    public void setRate(java.lang.Double rate) {
        this.rate = rate;
    }


    /**
     * Gets the urlComponent value for this GiftCertificateItem.
     * 
     * @return urlComponent
     */
    public java.lang.String getUrlComponent() {
        return urlComponent;
    }


    /**
     * Sets the urlComponent value for this GiftCertificateItem.
     * 
     * @param urlComponent
     */
    public void setUrlComponent(java.lang.String urlComponent) {
        this.urlComponent = urlComponent;
    }


    /**
     * Gets the salesTaxCode value for this GiftCertificateItem.
     * 
     * @return salesTaxCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSalesTaxCode() {
        return salesTaxCode;
    }


    /**
     * Sets the salesTaxCode value for this GiftCertificateItem.
     * 
     * @param salesTaxCode
     */
    public void setSalesTaxCode(org.mule.module.netsuite.api.internal.RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }


    /**
     * Gets the pricesIncludeTax value for this GiftCertificateItem.
     * 
     * @return pricesIncludeTax
     */
    public java.lang.Boolean getPricesIncludeTax() {
        return pricesIncludeTax;
    }


    /**
     * Sets the pricesIncludeTax value for this GiftCertificateItem.
     * 
     * @param pricesIncludeTax
     */
    public void setPricesIncludeTax(java.lang.Boolean pricesIncludeTax) {
        this.pricesIncludeTax = pricesIncludeTax;
    }


    /**
     * Gets the taxSchedule value for this GiftCertificateItem.
     * 
     * @return taxSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this GiftCertificateItem.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(org.mule.module.netsuite.api.internal.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the costEstimate value for this GiftCertificateItem.
     * 
     * @return costEstimate
     */
    public java.lang.Double getCostEstimate() {
        return costEstimate;
    }


    /**
     * Sets the costEstimate value for this GiftCertificateItem.
     * 
     * @param costEstimate
     */
    public void setCostEstimate(java.lang.Double costEstimate) {
        this.costEstimate = costEstimate;
    }


    /**
     * Gets the costEstimateType value for this GiftCertificateItem.
     * 
     * @return costEstimateType
     */
    public org.mule.module.netsuite.api.internal.ItemCostEstimateType getCostEstimateType() {
        return costEstimateType;
    }


    /**
     * Sets the costEstimateType value for this GiftCertificateItem.
     * 
     * @param costEstimateType
     */
    public void setCostEstimateType(org.mule.module.netsuite.api.internal.ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }


    /**
     * Gets the billingSchedule value for this GiftCertificateItem.
     * 
     * @return billingSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBillingSchedule() {
        return billingSchedule;
    }


    /**
     * Sets the billingSchedule value for this GiftCertificateItem.
     * 
     * @param billingSchedule
     */
    public void setBillingSchedule(org.mule.module.netsuite.api.internal.RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }


    /**
     * Gets the issueProduct value for this GiftCertificateItem.
     * 
     * @return issueProduct
     */
    public org.mule.module.netsuite.api.internal.RecordRef getIssueProduct() {
        return issueProduct;
    }


    /**
     * Sets the issueProduct value for this GiftCertificateItem.
     * 
     * @param issueProduct
     */
    public void setIssueProduct(org.mule.module.netsuite.api.internal.RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }


    /**
     * Gets the isFulfillable value for this GiftCertificateItem.
     * 
     * @return isFulfillable
     */
    public java.lang.Boolean getIsFulfillable() {
        return isFulfillable;
    }


    /**
     * Sets the isFulfillable value for this GiftCertificateItem.
     * 
     * @param isFulfillable
     */
    public void setIsFulfillable(java.lang.Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }


    /**
     * Gets the storeDisplayName value for this GiftCertificateItem.
     * 
     * @return storeDisplayName
     */
    public java.lang.String getStoreDisplayName() {
        return storeDisplayName;
    }


    /**
     * Sets the storeDisplayName value for this GiftCertificateItem.
     * 
     * @param storeDisplayName
     */
    public void setStoreDisplayName(java.lang.String storeDisplayName) {
        this.storeDisplayName = storeDisplayName;
    }


    /**
     * Gets the storeDisplayThumbnail value for this GiftCertificateItem.
     * 
     * @return storeDisplayThumbnail
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreDisplayThumbnail() {
        return storeDisplayThumbnail;
    }


    /**
     * Sets the storeDisplayThumbnail value for this GiftCertificateItem.
     * 
     * @param storeDisplayThumbnail
     */
    public void setStoreDisplayThumbnail(org.mule.module.netsuite.api.internal.RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }


    /**
     * Gets the storeDisplayImage value for this GiftCertificateItem.
     * 
     * @return storeDisplayImage
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreDisplayImage() {
        return storeDisplayImage;
    }


    /**
     * Sets the storeDisplayImage value for this GiftCertificateItem.
     * 
     * @param storeDisplayImage
     */
    public void setStoreDisplayImage(org.mule.module.netsuite.api.internal.RecordRef storeDisplayImage) {
        this.storeDisplayImage = storeDisplayImage;
    }


    /**
     * Gets the storeDescription value for this GiftCertificateItem.
     * 
     * @return storeDescription
     */
    public java.lang.String getStoreDescription() {
        return storeDescription;
    }


    /**
     * Sets the storeDescription value for this GiftCertificateItem.
     * 
     * @param storeDescription
     */
    public void setStoreDescription(java.lang.String storeDescription) {
        this.storeDescription = storeDescription;
    }


    /**
     * Gets the storeDetailedDescription value for this GiftCertificateItem.
     * 
     * @return storeDetailedDescription
     */
    public java.lang.String getStoreDetailedDescription() {
        return storeDetailedDescription;
    }


    /**
     * Sets the storeDetailedDescription value for this GiftCertificateItem.
     * 
     * @param storeDetailedDescription
     */
    public void setStoreDetailedDescription(java.lang.String storeDetailedDescription) {
        this.storeDetailedDescription = storeDetailedDescription;
    }


    /**
     * Gets the storeItemTemplate value for this GiftCertificateItem.
     * 
     * @return storeItemTemplate
     */
    public org.mule.module.netsuite.api.internal.RecordRef getStoreItemTemplate() {
        return storeItemTemplate;
    }


    /**
     * Sets the storeItemTemplate value for this GiftCertificateItem.
     * 
     * @param storeItemTemplate
     */
    public void setStoreItemTemplate(org.mule.module.netsuite.api.internal.RecordRef storeItemTemplate) {
        this.storeItemTemplate = storeItemTemplate;
    }


    /**
     * Gets the pageTitle value for this GiftCertificateItem.
     * 
     * @return pageTitle
     */
    public java.lang.String getPageTitle() {
        return pageTitle;
    }


    /**
     * Sets the pageTitle value for this GiftCertificateItem.
     * 
     * @param pageTitle
     */
    public void setPageTitle(java.lang.String pageTitle) {
        this.pageTitle = pageTitle;
    }


    /**
     * Gets the metaTagHtml value for this GiftCertificateItem.
     * 
     * @return metaTagHtml
     */
    public java.lang.String getMetaTagHtml() {
        return metaTagHtml;
    }


    /**
     * Sets the metaTagHtml value for this GiftCertificateItem.
     * 
     * @param metaTagHtml
     */
    public void setMetaTagHtml(java.lang.String metaTagHtml) {
        this.metaTagHtml = metaTagHtml;
    }


    /**
     * Gets the excludeFromSitemap value for this GiftCertificateItem.
     * 
     * @return excludeFromSitemap
     */
    public java.lang.Boolean getExcludeFromSitemap() {
        return excludeFromSitemap;
    }


    /**
     * Sets the excludeFromSitemap value for this GiftCertificateItem.
     * 
     * @param excludeFromSitemap
     */
    public void setExcludeFromSitemap(java.lang.Boolean excludeFromSitemap) {
        this.excludeFromSitemap = excludeFromSitemap;
    }


    /**
     * Gets the sitemapPriority value for this GiftCertificateItem.
     * 
     * @return sitemapPriority
     */
    public org.mule.module.netsuite.api.internal.SitemapPriority getSitemapPriority() {
        return sitemapPriority;
    }


    /**
     * Sets the sitemapPriority value for this GiftCertificateItem.
     * 
     * @param sitemapPriority
     */
    public void setSitemapPriority(org.mule.module.netsuite.api.internal.SitemapPriority sitemapPriority) {
        this.sitemapPriority = sitemapPriority;
    }


    /**
     * Gets the searchKeywords value for this GiftCertificateItem.
     * 
     * @return searchKeywords
     */
    public java.lang.String getSearchKeywords() {
        return searchKeywords;
    }


    /**
     * Sets the searchKeywords value for this GiftCertificateItem.
     * 
     * @param searchKeywords
     */
    public void setSearchKeywords(java.lang.String searchKeywords) {
        this.searchKeywords = searchKeywords;
    }


    /**
     * Gets the isDonationItem value for this GiftCertificateItem.
     * 
     * @return isDonationItem
     */
    public java.lang.Boolean getIsDonationItem() {
        return isDonationItem;
    }


    /**
     * Sets the isDonationItem value for this GiftCertificateItem.
     * 
     * @param isDonationItem
     */
    public void setIsDonationItem(java.lang.Boolean isDonationItem) {
        this.isDonationItem = isDonationItem;
    }


    /**
     * Gets the showDefaultDonationAmount value for this GiftCertificateItem.
     * 
     * @return showDefaultDonationAmount
     */
    public java.lang.Boolean getShowDefaultDonationAmount() {
        return showDefaultDonationAmount;
    }


    /**
     * Sets the showDefaultDonationAmount value for this GiftCertificateItem.
     * 
     * @param showDefaultDonationAmount
     */
    public void setShowDefaultDonationAmount(java.lang.Boolean showDefaultDonationAmount) {
        this.showDefaultDonationAmount = showDefaultDonationAmount;
    }


    /**
     * Gets the maxDonationAmount value for this GiftCertificateItem.
     * 
     * @return maxDonationAmount
     */
    public java.lang.Double getMaxDonationAmount() {
        return maxDonationAmount;
    }


    /**
     * Sets the maxDonationAmount value for this GiftCertificateItem.
     * 
     * @param maxDonationAmount
     */
    public void setMaxDonationAmount(java.lang.Double maxDonationAmount) {
        this.maxDonationAmount = maxDonationAmount;
    }


    /**
     * Gets the dontShowPrice value for this GiftCertificateItem.
     * 
     * @return dontShowPrice
     */
    public java.lang.Boolean getDontShowPrice() {
        return dontShowPrice;
    }


    /**
     * Sets the dontShowPrice value for this GiftCertificateItem.
     * 
     * @param dontShowPrice
     */
    public void setDontShowPrice(java.lang.Boolean dontShowPrice) {
        this.dontShowPrice = dontShowPrice;
    }


    /**
     * Gets the noPriceMessage value for this GiftCertificateItem.
     * 
     * @return noPriceMessage
     */
    public java.lang.String getNoPriceMessage() {
        return noPriceMessage;
    }


    /**
     * Sets the noPriceMessage value for this GiftCertificateItem.
     * 
     * @param noPriceMessage
     */
    public void setNoPriceMessage(java.lang.String noPriceMessage) {
        this.noPriceMessage = noPriceMessage;
    }


    /**
     * Gets the outOfStockMessage value for this GiftCertificateItem.
     * 
     * @return outOfStockMessage
     */
    public java.lang.String getOutOfStockMessage() {
        return outOfStockMessage;
    }


    /**
     * Sets the outOfStockMessage value for this GiftCertificateItem.
     * 
     * @param outOfStockMessage
     */
    public void setOutOfStockMessage(java.lang.String outOfStockMessage) {
        this.outOfStockMessage = outOfStockMessage;
    }


    /**
     * Gets the onSpecial value for this GiftCertificateItem.
     * 
     * @return onSpecial
     */
    public java.lang.Boolean getOnSpecial() {
        return onSpecial;
    }


    /**
     * Sets the onSpecial value for this GiftCertificateItem.
     * 
     * @param onSpecial
     */
    public void setOnSpecial(java.lang.Boolean onSpecial) {
        this.onSpecial = onSpecial;
    }


    /**
     * Gets the outOfStockBehavior value for this GiftCertificateItem.
     * 
     * @return outOfStockBehavior
     */
    public org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior getOutOfStockBehavior() {
        return outOfStockBehavior;
    }


    /**
     * Sets the outOfStockBehavior value for this GiftCertificateItem.
     * 
     * @param outOfStockBehavior
     */
    public void setOutOfStockBehavior(org.mule.module.netsuite.api.internal.ItemOutOfStockBehavior outOfStockBehavior) {
        this.outOfStockBehavior = outOfStockBehavior;
    }


    /**
     * Gets the specialsDescription value for this GiftCertificateItem.
     * 
     * @return specialsDescription
     */
    public java.lang.String getSpecialsDescription() {
        return specialsDescription;
    }


    /**
     * Sets the specialsDescription value for this GiftCertificateItem.
     * 
     * @param specialsDescription
     */
    public void setSpecialsDescription(java.lang.String specialsDescription) {
        this.specialsDescription = specialsDescription;
    }


    /**
     * Gets the featuredDescription value for this GiftCertificateItem.
     * 
     * @return featuredDescription
     */
    public java.lang.String getFeaturedDescription() {
        return featuredDescription;
    }


    /**
     * Sets the featuredDescription value for this GiftCertificateItem.
     * 
     * @param featuredDescription
     */
    public void setFeaturedDescription(java.lang.String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }


    /**
     * Gets the relatedItemsDescription value for this GiftCertificateItem.
     * 
     * @return relatedItemsDescription
     */
    public java.lang.String getRelatedItemsDescription() {
        return relatedItemsDescription;
    }


    /**
     * Sets the relatedItemsDescription value for this GiftCertificateItem.
     * 
     * @param relatedItemsDescription
     */
    public void setRelatedItemsDescription(java.lang.String relatedItemsDescription) {
        this.relatedItemsDescription = relatedItemsDescription;
    }


    /**
     * Gets the pricingMatrix value for this GiftCertificateItem.
     * 
     * @return pricingMatrix
     */
    public org.mule.module.netsuite.api.internal.PricingMatrix getPricingMatrix() {
        return pricingMatrix;
    }


    /**
     * Sets the pricingMatrix value for this GiftCertificateItem.
     * 
     * @param pricingMatrix
     */
    public void setPricingMatrix(org.mule.module.netsuite.api.internal.PricingMatrix pricingMatrix) {
        this.pricingMatrix = pricingMatrix;
    }


    /**
     * Gets the authCodesList value for this GiftCertificateItem.
     * 
     * @return authCodesList
     */
    public org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodesList getAuthCodesList() {
        return authCodesList;
    }


    /**
     * Sets the authCodesList value for this GiftCertificateItem.
     * 
     * @param authCodesList
     */
    public void setAuthCodesList(org.mule.module.netsuite.api.internal.GiftCertificateItemAuthCodesList authCodesList) {
        this.authCodesList = authCodesList;
    }


    /**
     * Gets the siteCategoryList value for this GiftCertificateItem.
     * 
     * @return siteCategoryList
     */
    public org.mule.module.netsuite.api.internal.SiteCategoryList getSiteCategoryList() {
        return siteCategoryList;
    }


    /**
     * Sets the siteCategoryList value for this GiftCertificateItem.
     * 
     * @param siteCategoryList
     */
    public void setSiteCategoryList(org.mule.module.netsuite.api.internal.SiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
    }


    /**
     * Gets the translationsList value for this GiftCertificateItem.
     * 
     * @return translationsList
     */
    public org.mule.module.netsuite.api.internal.TranslationList getTranslationsList() {
        return translationsList;
    }


    /**
     * Sets the translationsList value for this GiftCertificateItem.
     * 
     * @param translationsList
     */
    public void setTranslationsList(org.mule.module.netsuite.api.internal.TranslationList translationsList) {
        this.translationsList = translationsList;
    }


    /**
     * Gets the itemOptionsList value for this GiftCertificateItem.
     * 
     * @return itemOptionsList
     */
    public org.mule.module.netsuite.api.internal.ItemOptionsList getItemOptionsList() {
        return itemOptionsList;
    }


    /**
     * Sets the itemOptionsList value for this GiftCertificateItem.
     * 
     * @param itemOptionsList
     */
    public void setItemOptionsList(org.mule.module.netsuite.api.internal.ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }


    /**
     * Gets the presentationItemList value for this GiftCertificateItem.
     * 
     * @return presentationItemList
     */
    public org.mule.module.netsuite.api.internal.PresentationItemList getPresentationItemList() {
        return presentationItemList;
    }


    /**
     * Sets the presentationItemList value for this GiftCertificateItem.
     * 
     * @param presentationItemList
     */
    public void setPresentationItemList(org.mule.module.netsuite.api.internal.PresentationItemList presentationItemList) {
        this.presentationItemList = presentationItemList;
    }


    /**
     * Gets the customFieldList value for this GiftCertificateItem.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this GiftCertificateItem.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this GiftCertificateItem.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this GiftCertificateItem.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this GiftCertificateItem.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this GiftCertificateItem.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GiftCertificateItem)) return false;
        GiftCertificateItem other = (GiftCertificateItem) obj;
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
            ((this.includeChildren==null && other.getIncludeChildren()==null) || 
             (this.includeChildren!=null &&
              this.includeChildren.equals(other.getIncludeChildren()))) &&
            ((this.parent==null && other.getParent()==null) || 
             (this.parent!=null &&
              this.parent.equals(other.getParent()))) &&
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
            ((this._class==null && other.get_class()==null) || 
             (this._class!=null &&
              this._class.equals(other.get_class()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.subsidiaryList==null && other.getSubsidiaryList()==null) || 
             (this.subsidiaryList!=null &&
              this.subsidiaryList.equals(other.getSubsidiaryList()))) &&
            ((this.salesDescription==null && other.getSalesDescription()==null) || 
             (this.salesDescription!=null &&
              this.salesDescription.equals(other.getSalesDescription()))) &&
            ((this.incomeAccount==null && other.getIncomeAccount()==null) || 
             (this.incomeAccount!=null &&
              this.incomeAccount.equals(other.getIncomeAccount()))) &&
            ((this.liabilityAccount==null && other.getLiabilityAccount()==null) || 
             (this.liabilityAccount!=null &&
              this.liabilityAccount.equals(other.getLiabilityAccount()))) &&
            ((this.daysBeforeExpiration==null && other.getDaysBeforeExpiration()==null) || 
             (this.daysBeforeExpiration!=null &&
              this.daysBeforeExpiration.equals(other.getDaysBeforeExpiration()))) &&
            ((this.isTaxable==null && other.getIsTaxable()==null) || 
             (this.isTaxable!=null &&
              this.isTaxable.equals(other.getIsTaxable()))) &&
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.urlComponent==null && other.getUrlComponent()==null) || 
             (this.urlComponent!=null &&
              this.urlComponent.equals(other.getUrlComponent()))) &&
            ((this.salesTaxCode==null && other.getSalesTaxCode()==null) || 
             (this.salesTaxCode!=null &&
              this.salesTaxCode.equals(other.getSalesTaxCode()))) &&
            ((this.pricesIncludeTax==null && other.getPricesIncludeTax()==null) || 
             (this.pricesIncludeTax!=null &&
              this.pricesIncludeTax.equals(other.getPricesIncludeTax()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.costEstimate==null && other.getCostEstimate()==null) || 
             (this.costEstimate!=null &&
              this.costEstimate.equals(other.getCostEstimate()))) &&
            ((this.costEstimateType==null && other.getCostEstimateType()==null) || 
             (this.costEstimateType!=null &&
              this.costEstimateType.equals(other.getCostEstimateType()))) &&
            ((this.billingSchedule==null && other.getBillingSchedule()==null) || 
             (this.billingSchedule!=null &&
              this.billingSchedule.equals(other.getBillingSchedule()))) &&
            ((this.issueProduct==null && other.getIssueProduct()==null) || 
             (this.issueProduct!=null &&
              this.issueProduct.equals(other.getIssueProduct()))) &&
            ((this.isFulfillable==null && other.getIsFulfillable()==null) || 
             (this.isFulfillable!=null &&
              this.isFulfillable.equals(other.getIsFulfillable()))) &&
            ((this.storeDisplayName==null && other.getStoreDisplayName()==null) || 
             (this.storeDisplayName!=null &&
              this.storeDisplayName.equals(other.getStoreDisplayName()))) &&
            ((this.storeDisplayThumbnail==null && other.getStoreDisplayThumbnail()==null) || 
             (this.storeDisplayThumbnail!=null &&
              this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail()))) &&
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
            ((this.outOfStockMessage==null && other.getOutOfStockMessage()==null) || 
             (this.outOfStockMessage!=null &&
              this.outOfStockMessage.equals(other.getOutOfStockMessage()))) &&
            ((this.onSpecial==null && other.getOnSpecial()==null) || 
             (this.onSpecial!=null &&
              this.onSpecial.equals(other.getOnSpecial()))) &&
            ((this.outOfStockBehavior==null && other.getOutOfStockBehavior()==null) || 
             (this.outOfStockBehavior!=null &&
              this.outOfStockBehavior.equals(other.getOutOfStockBehavior()))) &&
            ((this.specialsDescription==null && other.getSpecialsDescription()==null) || 
             (this.specialsDescription!=null &&
              this.specialsDescription.equals(other.getSpecialsDescription()))) &&
            ((this.featuredDescription==null && other.getFeaturedDescription()==null) || 
             (this.featuredDescription!=null &&
              this.featuredDescription.equals(other.getFeaturedDescription()))) &&
            ((this.relatedItemsDescription==null && other.getRelatedItemsDescription()==null) || 
             (this.relatedItemsDescription!=null &&
              this.relatedItemsDescription.equals(other.getRelatedItemsDescription()))) &&
            ((this.pricingMatrix==null && other.getPricingMatrix()==null) || 
             (this.pricingMatrix!=null &&
              this.pricingMatrix.equals(other.getPricingMatrix()))) &&
            ((this.authCodesList==null && other.getAuthCodesList()==null) || 
             (this.authCodesList!=null &&
              this.authCodesList.equals(other.getAuthCodesList()))) &&
            ((this.siteCategoryList==null && other.getSiteCategoryList()==null) || 
             (this.siteCategoryList!=null &&
              this.siteCategoryList.equals(other.getSiteCategoryList()))) &&
            ((this.translationsList==null && other.getTranslationsList()==null) || 
             (this.translationsList!=null &&
              this.translationsList.equals(other.getTranslationsList()))) &&
            ((this.itemOptionsList==null && other.getItemOptionsList()==null) || 
             (this.itemOptionsList!=null &&
              this.itemOptionsList.equals(other.getItemOptionsList()))) &&
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
        if (getIncludeChildren() != null) {
            _hashCode += getIncludeChildren().hashCode();
        }
        if (getParent() != null) {
            _hashCode += getParent().hashCode();
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
        if (get_class() != null) {
            _hashCode += get_class().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSubsidiaryList() != null) {
            _hashCode += getSubsidiaryList().hashCode();
        }
        if (getSalesDescription() != null) {
            _hashCode += getSalesDescription().hashCode();
        }
        if (getIncomeAccount() != null) {
            _hashCode += getIncomeAccount().hashCode();
        }
        if (getLiabilityAccount() != null) {
            _hashCode += getLiabilityAccount().hashCode();
        }
        if (getDaysBeforeExpiration() != null) {
            _hashCode += getDaysBeforeExpiration().hashCode();
        }
        if (getIsTaxable() != null) {
            _hashCode += getIsTaxable().hashCode();
        }
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getUrlComponent() != null) {
            _hashCode += getUrlComponent().hashCode();
        }
        if (getSalesTaxCode() != null) {
            _hashCode += getSalesTaxCode().hashCode();
        }
        if (getPricesIncludeTax() != null) {
            _hashCode += getPricesIncludeTax().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getCostEstimate() != null) {
            _hashCode += getCostEstimate().hashCode();
        }
        if (getCostEstimateType() != null) {
            _hashCode += getCostEstimateType().hashCode();
        }
        if (getBillingSchedule() != null) {
            _hashCode += getBillingSchedule().hashCode();
        }
        if (getIssueProduct() != null) {
            _hashCode += getIssueProduct().hashCode();
        }
        if (getIsFulfillable() != null) {
            _hashCode += getIsFulfillable().hashCode();
        }
        if (getStoreDisplayName() != null) {
            _hashCode += getStoreDisplayName().hashCode();
        }
        if (getStoreDisplayThumbnail() != null) {
            _hashCode += getStoreDisplayThumbnail().hashCode();
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
        if (getOutOfStockMessage() != null) {
            _hashCode += getOutOfStockMessage().hashCode();
        }
        if (getOnSpecial() != null) {
            _hashCode += getOnSpecial().hashCode();
        }
        if (getOutOfStockBehavior() != null) {
            _hashCode += getOutOfStockBehavior().hashCode();
        }
        if (getSpecialsDescription() != null) {
            _hashCode += getSpecialsDescription().hashCode();
        }
        if (getFeaturedDescription() != null) {
            _hashCode += getFeaturedDescription().hashCode();
        }
        if (getRelatedItemsDescription() != null) {
            _hashCode += getRelatedItemsDescription().hashCode();
        }
        if (getPricingMatrix() != null) {
            _hashCode += getPricingMatrix().hashCode();
        }
        if (getAuthCodesList() != null) {
            _hashCode += getAuthCodesList().hashCode();
        }
        if (getSiteCategoryList() != null) {
            _hashCode += getSiteCategoryList().hashCode();
        }
        if (getTranslationsList() != null) {
            _hashCode += getTranslationsList().hashCode();
        }
        if (getItemOptionsList() != null) {
            _hashCode += getItemOptionsList().hashCode();
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
        new org.apache.axis.description.TypeDesc(GiftCertificateItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateItem"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "salesDescription"));
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
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daysBeforeExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "daysBeforeExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "ItemCostEstimateType"));
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
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "issueProduct"));
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
        elemField.setFieldName("outOfStockMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "outOfStockMessage"));
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
        elemField.setFieldName("outOfStockBehavior");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "outOfStockBehavior"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
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
        elemField.setFieldName("relatedItemsDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "relatedItemsDescription"));
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
        elemField.setFieldName("authCodesList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "authCodesList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "GiftCertificateItemAuthCodesList"));
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
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "TranslationList"));
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
