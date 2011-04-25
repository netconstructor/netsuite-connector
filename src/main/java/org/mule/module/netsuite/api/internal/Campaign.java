/**
 * Campaign.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Campaign  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private java.lang.String campaignId;

    private java.lang.String title;

    private org.mule.module.netsuite.api.internal.RecordRef category;

    private org.mule.module.netsuite.api.internal.RecordRef owner;

    private java.util.Calendar startDate;

    private java.util.Calendar endDate;

    private java.lang.String url;

    private java.lang.Double baseCost;

    private java.lang.Double cost;

    private java.lang.Double expectedRevenue;

    private java.lang.String message;

    private java.lang.Boolean isInactive;

    private java.lang.Boolean local;

    private java.lang.Double totalRevenue;

    private java.lang.Double roi;

    private java.lang.Double profit;

    private java.lang.Double costPerCustomer;

    private java.lang.Double convCostPerCustomer;

    private java.lang.Long conversions;

    private java.lang.Long leadsGenerated;

    private java.lang.Long uniqueVisitors;

    private org.mule.module.netsuite.api.internal.RecordRef vertical;

    private org.mule.module.netsuite.api.internal.RecordRef audience;

    private org.mule.module.netsuite.api.internal.RecordRef offer;

    private org.mule.module.netsuite.api.internal.RecordRef promotionCode;

    private org.mule.module.netsuite.api.internal.RecordRefList itemList;

    private org.mule.module.netsuite.api.internal.RecordRef family;

    private org.mule.module.netsuite.api.internal.RecordRef searchEngine;

    private java.lang.String keyword;

    private org.mule.module.netsuite.api.internal.CampaignEmailList campaignEmailList;

    private org.mule.module.netsuite.api.internal.CampaignDirectMailList campaignDirectMailList;

    private org.mule.module.netsuite.api.internal.CampaignEventList campaignEventList;

    private org.mule.module.netsuite.api.internal.CampaignEventResponseList eventResponseList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public Campaign() {
    }

    public Campaign(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           java.lang.String campaignId,
           java.lang.String title,
           org.mule.module.netsuite.api.internal.RecordRef category,
           org.mule.module.netsuite.api.internal.RecordRef owner,
           java.util.Calendar startDate,
           java.util.Calendar endDate,
           java.lang.String url,
           java.lang.Double baseCost,
           java.lang.Double cost,
           java.lang.Double expectedRevenue,
           java.lang.String message,
           java.lang.Boolean isInactive,
           java.lang.Boolean local,
           java.lang.Double totalRevenue,
           java.lang.Double roi,
           java.lang.Double profit,
           java.lang.Double costPerCustomer,
           java.lang.Double convCostPerCustomer,
           java.lang.Long conversions,
           java.lang.Long leadsGenerated,
           java.lang.Long uniqueVisitors,
           org.mule.module.netsuite.api.internal.RecordRef vertical,
           org.mule.module.netsuite.api.internal.RecordRef audience,
           org.mule.module.netsuite.api.internal.RecordRef offer,
           org.mule.module.netsuite.api.internal.RecordRef promotionCode,
           org.mule.module.netsuite.api.internal.RecordRefList itemList,
           org.mule.module.netsuite.api.internal.RecordRef family,
           org.mule.module.netsuite.api.internal.RecordRef searchEngine,
           java.lang.String keyword,
           org.mule.module.netsuite.api.internal.CampaignEmailList campaignEmailList,
           org.mule.module.netsuite.api.internal.CampaignDirectMailList campaignDirectMailList,
           org.mule.module.netsuite.api.internal.CampaignEventList campaignEventList,
           org.mule.module.netsuite.api.internal.CampaignEventResponseList eventResponseList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.campaignId = campaignId;
        this.title = title;
        this.category = category;
        this.owner = owner;
        this.startDate = startDate;
        this.endDate = endDate;
        this.url = url;
        this.baseCost = baseCost;
        this.cost = cost;
        this.expectedRevenue = expectedRevenue;
        this.message = message;
        this.isInactive = isInactive;
        this.local = local;
        this.totalRevenue = totalRevenue;
        this.roi = roi;
        this.profit = profit;
        this.costPerCustomer = costPerCustomer;
        this.convCostPerCustomer = convCostPerCustomer;
        this.conversions = conversions;
        this.leadsGenerated = leadsGenerated;
        this.uniqueVisitors = uniqueVisitors;
        this.vertical = vertical;
        this.audience = audience;
        this.offer = offer;
        this.promotionCode = promotionCode;
        this.itemList = itemList;
        this.family = family;
        this.searchEngine = searchEngine;
        this.keyword = keyword;
        this.campaignEmailList = campaignEmailList;
        this.campaignDirectMailList = campaignDirectMailList;
        this.campaignEventList = campaignEventList;
        this.eventResponseList = eventResponseList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the customForm value for this Campaign.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this Campaign.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the campaignId value for this Campaign.
     * 
     * @return campaignId
     */
    public java.lang.String getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this Campaign.
     * 
     * @param campaignId
     */
    public void setCampaignId(java.lang.String campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the title value for this Campaign.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Campaign.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the category value for this Campaign.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCategory() {
        return category;
    }


    /**
     * Sets the category value for this Campaign.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.RecordRef category) {
        this.category = category;
    }


    /**
     * Gets the owner value for this Campaign.
     * 
     * @return owner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOwner() {
        return owner;
    }


    /**
     * Sets the owner value for this Campaign.
     * 
     * @param owner
     */
    public void setOwner(org.mule.module.netsuite.api.internal.RecordRef owner) {
        this.owner = owner;
    }


    /**
     * Gets the startDate value for this Campaign.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Campaign.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the endDate value for this Campaign.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Campaign.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the url value for this Campaign.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Campaign.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the baseCost value for this Campaign.
     * 
     * @return baseCost
     */
    public java.lang.Double getBaseCost() {
        return baseCost;
    }


    /**
     * Sets the baseCost value for this Campaign.
     * 
     * @param baseCost
     */
    public void setBaseCost(java.lang.Double baseCost) {
        this.baseCost = baseCost;
    }


    /**
     * Gets the cost value for this Campaign.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this Campaign.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the expectedRevenue value for this Campaign.
     * 
     * @return expectedRevenue
     */
    public java.lang.Double getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this Campaign.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(java.lang.Double expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the message value for this Campaign.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this Campaign.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the isInactive value for this Campaign.
     * 
     * @return isInactive
     */
    public java.lang.Boolean getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this Campaign.
     * 
     * @param isInactive
     */
    public void setIsInactive(java.lang.Boolean isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the local value for this Campaign.
     * 
     * @return local
     */
    public java.lang.Boolean getLocal() {
        return local;
    }


    /**
     * Sets the local value for this Campaign.
     * 
     * @param local
     */
    public void setLocal(java.lang.Boolean local) {
        this.local = local;
    }


    /**
     * Gets the totalRevenue value for this Campaign.
     * 
     * @return totalRevenue
     */
    public java.lang.Double getTotalRevenue() {
        return totalRevenue;
    }


    /**
     * Sets the totalRevenue value for this Campaign.
     * 
     * @param totalRevenue
     */
    public void setTotalRevenue(java.lang.Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }


    /**
     * Gets the roi value for this Campaign.
     * 
     * @return roi
     */
    public java.lang.Double getRoi() {
        return roi;
    }


    /**
     * Sets the roi value for this Campaign.
     * 
     * @param roi
     */
    public void setRoi(java.lang.Double roi) {
        this.roi = roi;
    }


    /**
     * Gets the profit value for this Campaign.
     * 
     * @return profit
     */
    public java.lang.Double getProfit() {
        return profit;
    }


    /**
     * Sets the profit value for this Campaign.
     * 
     * @param profit
     */
    public void setProfit(java.lang.Double profit) {
        this.profit = profit;
    }


    /**
     * Gets the costPerCustomer value for this Campaign.
     * 
     * @return costPerCustomer
     */
    public java.lang.Double getCostPerCustomer() {
        return costPerCustomer;
    }


    /**
     * Sets the costPerCustomer value for this Campaign.
     * 
     * @param costPerCustomer
     */
    public void setCostPerCustomer(java.lang.Double costPerCustomer) {
        this.costPerCustomer = costPerCustomer;
    }


    /**
     * Gets the convCostPerCustomer value for this Campaign.
     * 
     * @return convCostPerCustomer
     */
    public java.lang.Double getConvCostPerCustomer() {
        return convCostPerCustomer;
    }


    /**
     * Sets the convCostPerCustomer value for this Campaign.
     * 
     * @param convCostPerCustomer
     */
    public void setConvCostPerCustomer(java.lang.Double convCostPerCustomer) {
        this.convCostPerCustomer = convCostPerCustomer;
    }


    /**
     * Gets the conversions value for this Campaign.
     * 
     * @return conversions
     */
    public java.lang.Long getConversions() {
        return conversions;
    }


    /**
     * Sets the conversions value for this Campaign.
     * 
     * @param conversions
     */
    public void setConversions(java.lang.Long conversions) {
        this.conversions = conversions;
    }


    /**
     * Gets the leadsGenerated value for this Campaign.
     * 
     * @return leadsGenerated
     */
    public java.lang.Long getLeadsGenerated() {
        return leadsGenerated;
    }


    /**
     * Sets the leadsGenerated value for this Campaign.
     * 
     * @param leadsGenerated
     */
    public void setLeadsGenerated(java.lang.Long leadsGenerated) {
        this.leadsGenerated = leadsGenerated;
    }


    /**
     * Gets the uniqueVisitors value for this Campaign.
     * 
     * @return uniqueVisitors
     */
    public java.lang.Long getUniqueVisitors() {
        return uniqueVisitors;
    }


    /**
     * Sets the uniqueVisitors value for this Campaign.
     * 
     * @param uniqueVisitors
     */
    public void setUniqueVisitors(java.lang.Long uniqueVisitors) {
        this.uniqueVisitors = uniqueVisitors;
    }


    /**
     * Gets the vertical value for this Campaign.
     * 
     * @return vertical
     */
    public org.mule.module.netsuite.api.internal.RecordRef getVertical() {
        return vertical;
    }


    /**
     * Sets the vertical value for this Campaign.
     * 
     * @param vertical
     */
    public void setVertical(org.mule.module.netsuite.api.internal.RecordRef vertical) {
        this.vertical = vertical;
    }


    /**
     * Gets the audience value for this Campaign.
     * 
     * @return audience
     */
    public org.mule.module.netsuite.api.internal.RecordRef getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this Campaign.
     * 
     * @param audience
     */
    public void setAudience(org.mule.module.netsuite.api.internal.RecordRef audience) {
        this.audience = audience;
    }


    /**
     * Gets the offer value for this Campaign.
     * 
     * @return offer
     */
    public org.mule.module.netsuite.api.internal.RecordRef getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this Campaign.
     * 
     * @param offer
     */
    public void setOffer(org.mule.module.netsuite.api.internal.RecordRef offer) {
        this.offer = offer;
    }


    /**
     * Gets the promotionCode value for this Campaign.
     * 
     * @return promotionCode
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPromotionCode() {
        return promotionCode;
    }


    /**
     * Sets the promotionCode value for this Campaign.
     * 
     * @param promotionCode
     */
    public void setPromotionCode(org.mule.module.netsuite.api.internal.RecordRef promotionCode) {
        this.promotionCode = promotionCode;
    }


    /**
     * Gets the itemList value for this Campaign.
     * 
     * @return itemList
     */
    public org.mule.module.netsuite.api.internal.RecordRefList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this Campaign.
     * 
     * @param itemList
     */
    public void setItemList(org.mule.module.netsuite.api.internal.RecordRefList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the family value for this Campaign.
     * 
     * @return family
     */
    public org.mule.module.netsuite.api.internal.RecordRef getFamily() {
        return family;
    }


    /**
     * Sets the family value for this Campaign.
     * 
     * @param family
     */
    public void setFamily(org.mule.module.netsuite.api.internal.RecordRef family) {
        this.family = family;
    }


    /**
     * Gets the searchEngine value for this Campaign.
     * 
     * @return searchEngine
     */
    public org.mule.module.netsuite.api.internal.RecordRef getSearchEngine() {
        return searchEngine;
    }


    /**
     * Sets the searchEngine value for this Campaign.
     * 
     * @param searchEngine
     */
    public void setSearchEngine(org.mule.module.netsuite.api.internal.RecordRef searchEngine) {
        this.searchEngine = searchEngine;
    }


    /**
     * Gets the keyword value for this Campaign.
     * 
     * @return keyword
     */
    public java.lang.String getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this Campaign.
     * 
     * @param keyword
     */
    public void setKeyword(java.lang.String keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the campaignEmailList value for this Campaign.
     * 
     * @return campaignEmailList
     */
    public org.mule.module.netsuite.api.internal.CampaignEmailList getCampaignEmailList() {
        return campaignEmailList;
    }


    /**
     * Sets the campaignEmailList value for this Campaign.
     * 
     * @param campaignEmailList
     */
    public void setCampaignEmailList(org.mule.module.netsuite.api.internal.CampaignEmailList campaignEmailList) {
        this.campaignEmailList = campaignEmailList;
    }


    /**
     * Gets the campaignDirectMailList value for this Campaign.
     * 
     * @return campaignDirectMailList
     */
    public org.mule.module.netsuite.api.internal.CampaignDirectMailList getCampaignDirectMailList() {
        return campaignDirectMailList;
    }


    /**
     * Sets the campaignDirectMailList value for this Campaign.
     * 
     * @param campaignDirectMailList
     */
    public void setCampaignDirectMailList(org.mule.module.netsuite.api.internal.CampaignDirectMailList campaignDirectMailList) {
        this.campaignDirectMailList = campaignDirectMailList;
    }


    /**
     * Gets the campaignEventList value for this Campaign.
     * 
     * @return campaignEventList
     */
    public org.mule.module.netsuite.api.internal.CampaignEventList getCampaignEventList() {
        return campaignEventList;
    }


    /**
     * Sets the campaignEventList value for this Campaign.
     * 
     * @param campaignEventList
     */
    public void setCampaignEventList(org.mule.module.netsuite.api.internal.CampaignEventList campaignEventList) {
        this.campaignEventList = campaignEventList;
    }


    /**
     * Gets the eventResponseList value for this Campaign.
     * 
     * @return eventResponseList
     */
    public org.mule.module.netsuite.api.internal.CampaignEventResponseList getEventResponseList() {
        return eventResponseList;
    }


    /**
     * Sets the eventResponseList value for this Campaign.
     * 
     * @param eventResponseList
     */
    public void setEventResponseList(org.mule.module.netsuite.api.internal.CampaignEventResponseList eventResponseList) {
        this.eventResponseList = eventResponseList;
    }


    /**
     * Gets the customFieldList value for this Campaign.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this Campaign.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this Campaign.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this Campaign.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this Campaign.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this Campaign.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Campaign)) return false;
        Campaign other = (Campaign) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customForm==null && other.getCustomForm()==null) || 
             (this.customForm!=null &&
              this.customForm.equals(other.getCustomForm()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.owner==null && other.getOwner()==null) || 
             (this.owner!=null &&
              this.owner.equals(other.getOwner()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.baseCost==null && other.getBaseCost()==null) || 
             (this.baseCost!=null &&
              this.baseCost.equals(other.getBaseCost()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.totalRevenue==null && other.getTotalRevenue()==null) || 
             (this.totalRevenue!=null &&
              this.totalRevenue.equals(other.getTotalRevenue()))) &&
            ((this.roi==null && other.getRoi()==null) || 
             (this.roi!=null &&
              this.roi.equals(other.getRoi()))) &&
            ((this.profit==null && other.getProfit()==null) || 
             (this.profit!=null &&
              this.profit.equals(other.getProfit()))) &&
            ((this.costPerCustomer==null && other.getCostPerCustomer()==null) || 
             (this.costPerCustomer!=null &&
              this.costPerCustomer.equals(other.getCostPerCustomer()))) &&
            ((this.convCostPerCustomer==null && other.getConvCostPerCustomer()==null) || 
             (this.convCostPerCustomer!=null &&
              this.convCostPerCustomer.equals(other.getConvCostPerCustomer()))) &&
            ((this.conversions==null && other.getConversions()==null) || 
             (this.conversions!=null &&
              this.conversions.equals(other.getConversions()))) &&
            ((this.leadsGenerated==null && other.getLeadsGenerated()==null) || 
             (this.leadsGenerated!=null &&
              this.leadsGenerated.equals(other.getLeadsGenerated()))) &&
            ((this.uniqueVisitors==null && other.getUniqueVisitors()==null) || 
             (this.uniqueVisitors!=null &&
              this.uniqueVisitors.equals(other.getUniqueVisitors()))) &&
            ((this.vertical==null && other.getVertical()==null) || 
             (this.vertical!=null &&
              this.vertical.equals(other.getVertical()))) &&
            ((this.audience==null && other.getAudience()==null) || 
             (this.audience!=null &&
              this.audience.equals(other.getAudience()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.promotionCode==null && other.getPromotionCode()==null) || 
             (this.promotionCode!=null &&
              this.promotionCode.equals(other.getPromotionCode()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              this.family.equals(other.getFamily()))) &&
            ((this.searchEngine==null && other.getSearchEngine()==null) || 
             (this.searchEngine!=null &&
              this.searchEngine.equals(other.getSearchEngine()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.campaignEmailList==null && other.getCampaignEmailList()==null) || 
             (this.campaignEmailList!=null &&
              this.campaignEmailList.equals(other.getCampaignEmailList()))) &&
            ((this.campaignDirectMailList==null && other.getCampaignDirectMailList()==null) || 
             (this.campaignDirectMailList!=null &&
              this.campaignDirectMailList.equals(other.getCampaignDirectMailList()))) &&
            ((this.campaignEventList==null && other.getCampaignEventList()==null) || 
             (this.campaignEventList!=null &&
              this.campaignEventList.equals(other.getCampaignEventList()))) &&
            ((this.eventResponseList==null && other.getEventResponseList()==null) || 
             (this.eventResponseList!=null &&
              this.eventResponseList.equals(other.getEventResponseList()))) &&
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
        if (getCustomForm() != null) {
            _hashCode += getCustomForm().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getOwner() != null) {
            _hashCode += getOwner().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getBaseCost() != null) {
            _hashCode += getBaseCost().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getExpectedRevenue() != null) {
            _hashCode += getExpectedRevenue().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getTotalRevenue() != null) {
            _hashCode += getTotalRevenue().hashCode();
        }
        if (getRoi() != null) {
            _hashCode += getRoi().hashCode();
        }
        if (getProfit() != null) {
            _hashCode += getProfit().hashCode();
        }
        if (getCostPerCustomer() != null) {
            _hashCode += getCostPerCustomer().hashCode();
        }
        if (getConvCostPerCustomer() != null) {
            _hashCode += getConvCostPerCustomer().hashCode();
        }
        if (getConversions() != null) {
            _hashCode += getConversions().hashCode();
        }
        if (getLeadsGenerated() != null) {
            _hashCode += getLeadsGenerated().hashCode();
        }
        if (getUniqueVisitors() != null) {
            _hashCode += getUniqueVisitors().hashCode();
        }
        if (getVertical() != null) {
            _hashCode += getVertical().hashCode();
        }
        if (getAudience() != null) {
            _hashCode += getAudience().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getPromotionCode() != null) {
            _hashCode += getPromotionCode().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getFamily() != null) {
            _hashCode += getFamily().hashCode();
        }
        if (getSearchEngine() != null) {
            _hashCode += getSearchEngine().hashCode();
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getCampaignEmailList() != null) {
            _hashCode += getCampaignEmailList().hashCode();
        }
        if (getCampaignDirectMailList() != null) {
            _hashCode += getCampaignDirectMailList().hashCode();
        }
        if (getCampaignEventList() != null) {
            _hashCode += getCampaignEventList().hashCode();
        }
        if (getEventResponseList() != null) {
            _hashCode += getEventResponseList().hashCode();
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
        new org.apache.axis.description.TypeDesc(Campaign.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "Campaign"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "campaignId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "expectedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "totalRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roi");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "roi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "profit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costPerCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "costPerCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convCostPerCustomer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "convCostPerCustomer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversions");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "conversions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("leadsGenerated");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "leadsGenerated"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueVisitors");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "uniqueVisitors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vertical");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "vertical"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promotionCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "promotionCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "keyword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEmailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "campaignEmailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEmailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignDirectMailList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "campaignDirectMailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignDirectMailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEventList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "campaignEventList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEventList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventResponseList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "eventResponseList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "CampaignEventResponseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:marketing_2010_2.lists.webservices.netsuite.com", "customFieldList"));
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
