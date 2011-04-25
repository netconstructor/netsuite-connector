/**
 * CampaignSearchBasic.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignSearchBasic  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SearchMultiSelectField audience;

    private org.mule.module.netsuite.api.internal.SearchDoubleField baseCost;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField campaignEventType;

    private org.mule.module.netsuite.api.internal.SearchStringField campaignId;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField category;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField channel;

    private org.mule.module.netsuite.api.internal.SearchDoubleField cost;

    private org.mule.module.netsuite.api.internal.SearchDateField createdDate;

    private org.mule.module.netsuite.api.internal.SearchDateField endDate;

    private org.mule.module.netsuite.api.internal.SearchStringField event;

    private org.mule.module.netsuite.api.internal.SearchDoubleField expectedRevenue;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField family;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField group;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId;

    private org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isInactive;

    private org.mule.module.netsuite.api.internal.SearchBooleanField isSalesCampaign;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField item;

    private org.mule.module.netsuite.api.internal.SearchStringField keyword;

    private org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField manager;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField managerRole;

    private org.mule.module.netsuite.api.internal.SearchLongField number;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField offer;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField recipient;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField response;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField responseCategory;

    private org.mule.module.netsuite.api.internal.SearchLongField responseCode;

    private org.mule.module.netsuite.api.internal.SearchStringField responseComments;

    private org.mule.module.netsuite.api.internal.SearchDateField responseDate;

    private org.mule.module.netsuite.api.internal.SearchDateField scheduleDate;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField searchEngine;

    private org.mule.module.netsuite.api.internal.SearchDateField startDate;

    private org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField subscription;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField template;

    private org.mule.module.netsuite.api.internal.SearchStringField title;

    private org.mule.module.netsuite.api.internal.SearchMultiSelectField vertical;

    private org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList;

    public CampaignSearchBasic() {
    }

    public CampaignSearchBasic(
           org.mule.module.netsuite.api.internal.SearchMultiSelectField audience,
           org.mule.module.netsuite.api.internal.SearchDoubleField baseCost,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField campaignEventType,
           org.mule.module.netsuite.api.internal.SearchStringField campaignId,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField category,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField channel,
           org.mule.module.netsuite.api.internal.SearchDoubleField cost,
           org.mule.module.netsuite.api.internal.SearchDateField createdDate,
           org.mule.module.netsuite.api.internal.SearchDateField endDate,
           org.mule.module.netsuite.api.internal.SearchStringField event,
           org.mule.module.netsuite.api.internal.SearchDoubleField expectedRevenue,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField family,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField group,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId,
           org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber,
           org.mule.module.netsuite.api.internal.SearchBooleanField isInactive,
           org.mule.module.netsuite.api.internal.SearchBooleanField isSalesCampaign,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField item,
           org.mule.module.netsuite.api.internal.SearchStringField keyword,
           org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField manager,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField managerRole,
           org.mule.module.netsuite.api.internal.SearchLongField number,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField offer,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField recipient,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField response,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField responseCategory,
           org.mule.module.netsuite.api.internal.SearchLongField responseCode,
           org.mule.module.netsuite.api.internal.SearchStringField responseComments,
           org.mule.module.netsuite.api.internal.SearchDateField responseDate,
           org.mule.module.netsuite.api.internal.SearchDateField scheduleDate,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField searchEngine,
           org.mule.module.netsuite.api.internal.SearchDateField startDate,
           org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField subscription,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField template,
           org.mule.module.netsuite.api.internal.SearchStringField title,
           org.mule.module.netsuite.api.internal.SearchMultiSelectField vertical,
           org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.audience = audience;
        this.baseCost = baseCost;
        this.campaignEventType = campaignEventType;
        this.campaignId = campaignId;
        this.category = category;
        this.channel = channel;
        this.cost = cost;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.event = event;
        this.expectedRevenue = expectedRevenue;
        this.family = family;
        this.group = group;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isSalesCampaign = isSalesCampaign;
        this.item = item;
        this.keyword = keyword;
        this.lastModifiedDate = lastModifiedDate;
        this.manager = manager;
        this.managerRole = managerRole;
        this.number = number;
        this.offer = offer;
        this.promoCode = promoCode;
        this.recipient = recipient;
        this.response = response;
        this.responseCategory = responseCategory;
        this.responseCode = responseCode;
        this.responseComments = responseComments;
        this.responseDate = responseDate;
        this.scheduleDate = scheduleDate;
        this.searchEngine = searchEngine;
        this.startDate = startDate;
        this.status = status;
        this.subscription = subscription;
        this.template = template;
        this.title = title;
        this.vertical = vertical;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the audience value for this CampaignSearchBasic.
     * 
     * @return audience
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getAudience() {
        return audience;
    }


    /**
     * Sets the audience value for this CampaignSearchBasic.
     * 
     * @param audience
     */
    public void setAudience(org.mule.module.netsuite.api.internal.SearchMultiSelectField audience) {
        this.audience = audience;
    }


    /**
     * Gets the baseCost value for this CampaignSearchBasic.
     * 
     * @return baseCost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getBaseCost() {
        return baseCost;
    }


    /**
     * Sets the baseCost value for this CampaignSearchBasic.
     * 
     * @param baseCost
     */
    public void setBaseCost(org.mule.module.netsuite.api.internal.SearchDoubleField baseCost) {
        this.baseCost = baseCost;
    }


    /**
     * Gets the campaignEventType value for this CampaignSearchBasic.
     * 
     * @return campaignEventType
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getCampaignEventType() {
        return campaignEventType;
    }


    /**
     * Sets the campaignEventType value for this CampaignSearchBasic.
     * 
     * @param campaignEventType
     */
    public void setCampaignEventType(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField campaignEventType) {
        this.campaignEventType = campaignEventType;
    }


    /**
     * Gets the campaignId value for this CampaignSearchBasic.
     * 
     * @return campaignId
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getCampaignId() {
        return campaignId;
    }


    /**
     * Sets the campaignId value for this CampaignSearchBasic.
     * 
     * @param campaignId
     */
    public void setCampaignId(org.mule.module.netsuite.api.internal.SearchStringField campaignId) {
        this.campaignId = campaignId;
    }


    /**
     * Gets the category value for this CampaignSearchBasic.
     * 
     * @return category
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getCategory() {
        return category;
    }


    /**
     * Sets the category value for this CampaignSearchBasic.
     * 
     * @param category
     */
    public void setCategory(org.mule.module.netsuite.api.internal.SearchMultiSelectField category) {
        this.category = category;
    }


    /**
     * Gets the channel value for this CampaignSearchBasic.
     * 
     * @return channel
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this CampaignSearchBasic.
     * 
     * @param channel
     */
    public void setChannel(org.mule.module.netsuite.api.internal.SearchMultiSelectField channel) {
        this.channel = channel;
    }


    /**
     * Gets the cost value for this CampaignSearchBasic.
     * 
     * @return cost
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this CampaignSearchBasic.
     * 
     * @param cost
     */
    public void setCost(org.mule.module.netsuite.api.internal.SearchDoubleField cost) {
        this.cost = cost;
    }


    /**
     * Gets the createdDate value for this CampaignSearchBasic.
     * 
     * @return createdDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this CampaignSearchBasic.
     * 
     * @param createdDate
     */
    public void setCreatedDate(org.mule.module.netsuite.api.internal.SearchDateField createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the endDate value for this CampaignSearchBasic.
     * 
     * @return endDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this CampaignSearchBasic.
     * 
     * @param endDate
     */
    public void setEndDate(org.mule.module.netsuite.api.internal.SearchDateField endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the event value for this CampaignSearchBasic.
     * 
     * @return event
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getEvent() {
        return event;
    }


    /**
     * Sets the event value for this CampaignSearchBasic.
     * 
     * @param event
     */
    public void setEvent(org.mule.module.netsuite.api.internal.SearchStringField event) {
        this.event = event;
    }


    /**
     * Gets the expectedRevenue value for this CampaignSearchBasic.
     * 
     * @return expectedRevenue
     */
    public org.mule.module.netsuite.api.internal.SearchDoubleField getExpectedRevenue() {
        return expectedRevenue;
    }


    /**
     * Sets the expectedRevenue value for this CampaignSearchBasic.
     * 
     * @param expectedRevenue
     */
    public void setExpectedRevenue(org.mule.module.netsuite.api.internal.SearchDoubleField expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }


    /**
     * Gets the family value for this CampaignSearchBasic.
     * 
     * @return family
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getFamily() {
        return family;
    }


    /**
     * Sets the family value for this CampaignSearchBasic.
     * 
     * @param family
     */
    public void setFamily(org.mule.module.netsuite.api.internal.SearchMultiSelectField family) {
        this.family = family;
    }


    /**
     * Gets the group value for this CampaignSearchBasic.
     * 
     * @return group
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getGroup() {
        return group;
    }


    /**
     * Sets the group value for this CampaignSearchBasic.
     * 
     * @param group
     */
    public void setGroup(org.mule.module.netsuite.api.internal.SearchMultiSelectField group) {
        this.group = group;
    }


    /**
     * Gets the internalId value for this CampaignSearchBasic.
     * 
     * @return internalId
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this CampaignSearchBasic.
     * 
     * @param internalId
     */
    public void setInternalId(org.mule.module.netsuite.api.internal.SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the internalIdNumber value for this CampaignSearchBasic.
     * 
     * @return internalIdNumber
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getInternalIdNumber() {
        return internalIdNumber;
    }


    /**
     * Sets the internalIdNumber value for this CampaignSearchBasic.
     * 
     * @param internalIdNumber
     */
    public void setInternalIdNumber(org.mule.module.netsuite.api.internal.SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }


    /**
     * Gets the isInactive value for this CampaignSearchBasic.
     * 
     * @return isInactive
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsInactive() {
        return isInactive;
    }


    /**
     * Sets the isInactive value for this CampaignSearchBasic.
     * 
     * @param isInactive
     */
    public void setIsInactive(org.mule.module.netsuite.api.internal.SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }


    /**
     * Gets the isSalesCampaign value for this CampaignSearchBasic.
     * 
     * @return isSalesCampaign
     */
    public org.mule.module.netsuite.api.internal.SearchBooleanField getIsSalesCampaign() {
        return isSalesCampaign;
    }


    /**
     * Sets the isSalesCampaign value for this CampaignSearchBasic.
     * 
     * @param isSalesCampaign
     */
    public void setIsSalesCampaign(org.mule.module.netsuite.api.internal.SearchBooleanField isSalesCampaign) {
        this.isSalesCampaign = isSalesCampaign;
    }


    /**
     * Gets the item value for this CampaignSearchBasic.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getItem() {
        return item;
    }


    /**
     * Sets the item value for this CampaignSearchBasic.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.SearchMultiSelectField item) {
        this.item = item;
    }


    /**
     * Gets the keyword value for this CampaignSearchBasic.
     * 
     * @return keyword
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getKeyword() {
        return keyword;
    }


    /**
     * Sets the keyword value for this CampaignSearchBasic.
     * 
     * @param keyword
     */
    public void setKeyword(org.mule.module.netsuite.api.internal.SearchStringField keyword) {
        this.keyword = keyword;
    }


    /**
     * Gets the lastModifiedDate value for this CampaignSearchBasic.
     * 
     * @return lastModifiedDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this CampaignSearchBasic.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(org.mule.module.netsuite.api.internal.SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the manager value for this CampaignSearchBasic.
     * 
     * @return manager
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getManager() {
        return manager;
    }


    /**
     * Sets the manager value for this CampaignSearchBasic.
     * 
     * @param manager
     */
    public void setManager(org.mule.module.netsuite.api.internal.SearchMultiSelectField manager) {
        this.manager = manager;
    }


    /**
     * Gets the managerRole value for this CampaignSearchBasic.
     * 
     * @return managerRole
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getManagerRole() {
        return managerRole;
    }


    /**
     * Sets the managerRole value for this CampaignSearchBasic.
     * 
     * @param managerRole
     */
    public void setManagerRole(org.mule.module.netsuite.api.internal.SearchMultiSelectField managerRole) {
        this.managerRole = managerRole;
    }


    /**
     * Gets the number value for this CampaignSearchBasic.
     * 
     * @return number
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CampaignSearchBasic.
     * 
     * @param number
     */
    public void setNumber(org.mule.module.netsuite.api.internal.SearchLongField number) {
        this.number = number;
    }


    /**
     * Gets the offer value for this CampaignSearchBasic.
     * 
     * @return offer
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getOffer() {
        return offer;
    }


    /**
     * Sets the offer value for this CampaignSearchBasic.
     * 
     * @param offer
     */
    public void setOffer(org.mule.module.netsuite.api.internal.SearchMultiSelectField offer) {
        this.offer = offer;
    }


    /**
     * Gets the promoCode value for this CampaignSearchBasic.
     * 
     * @return promoCode
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this CampaignSearchBasic.
     * 
     * @param promoCode
     */
    public void setPromoCode(org.mule.module.netsuite.api.internal.SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the recipient value for this CampaignSearchBasic.
     * 
     * @return recipient
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getRecipient() {
        return recipient;
    }


    /**
     * Sets the recipient value for this CampaignSearchBasic.
     * 
     * @param recipient
     */
    public void setRecipient(org.mule.module.netsuite.api.internal.SearchMultiSelectField recipient) {
        this.recipient = recipient;
    }


    /**
     * Gets the response value for this CampaignSearchBasic.
     * 
     * @return response
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CampaignSearchBasic.
     * 
     * @param response
     */
    public void setResponse(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField response) {
        this.response = response;
    }


    /**
     * Gets the responseCategory value for this CampaignSearchBasic.
     * 
     * @return responseCategory
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getResponseCategory() {
        return responseCategory;
    }


    /**
     * Sets the responseCategory value for this CampaignSearchBasic.
     * 
     * @param responseCategory
     */
    public void setResponseCategory(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField responseCategory) {
        this.responseCategory = responseCategory;
    }


    /**
     * Gets the responseCode value for this CampaignSearchBasic.
     * 
     * @return responseCode
     */
    public org.mule.module.netsuite.api.internal.SearchLongField getResponseCode() {
        return responseCode;
    }


    /**
     * Sets the responseCode value for this CampaignSearchBasic.
     * 
     * @param responseCode
     */
    public void setResponseCode(org.mule.module.netsuite.api.internal.SearchLongField responseCode) {
        this.responseCode = responseCode;
    }


    /**
     * Gets the responseComments value for this CampaignSearchBasic.
     * 
     * @return responseComments
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getResponseComments() {
        return responseComments;
    }


    /**
     * Sets the responseComments value for this CampaignSearchBasic.
     * 
     * @param responseComments
     */
    public void setResponseComments(org.mule.module.netsuite.api.internal.SearchStringField responseComments) {
        this.responseComments = responseComments;
    }


    /**
     * Gets the responseDate value for this CampaignSearchBasic.
     * 
     * @return responseDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getResponseDate() {
        return responseDate;
    }


    /**
     * Sets the responseDate value for this CampaignSearchBasic.
     * 
     * @param responseDate
     */
    public void setResponseDate(org.mule.module.netsuite.api.internal.SearchDateField responseDate) {
        this.responseDate = responseDate;
    }


    /**
     * Gets the scheduleDate value for this CampaignSearchBasic.
     * 
     * @return scheduleDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getScheduleDate() {
        return scheduleDate;
    }


    /**
     * Sets the scheduleDate value for this CampaignSearchBasic.
     * 
     * @param scheduleDate
     */
    public void setScheduleDate(org.mule.module.netsuite.api.internal.SearchDateField scheduleDate) {
        this.scheduleDate = scheduleDate;
    }


    /**
     * Gets the searchEngine value for this CampaignSearchBasic.
     * 
     * @return searchEngine
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSearchEngine() {
        return searchEngine;
    }


    /**
     * Sets the searchEngine value for this CampaignSearchBasic.
     * 
     * @param searchEngine
     */
    public void setSearchEngine(org.mule.module.netsuite.api.internal.SearchMultiSelectField searchEngine) {
        this.searchEngine = searchEngine;
    }


    /**
     * Gets the startDate value for this CampaignSearchBasic.
     * 
     * @return startDate
     */
    public org.mule.module.netsuite.api.internal.SearchDateField getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this CampaignSearchBasic.
     * 
     * @param startDate
     */
    public void setStartDate(org.mule.module.netsuite.api.internal.SearchDateField startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this CampaignSearchBasic.
     * 
     * @return status
     */
    public org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField getStatus() {
        return status;
    }


    /**
     * Sets the status value for this CampaignSearchBasic.
     * 
     * @param status
     */
    public void setStatus(org.mule.module.netsuite.api.internal.SearchEnumMultiSelectField status) {
        this.status = status;
    }


    /**
     * Gets the subscription value for this CampaignSearchBasic.
     * 
     * @return subscription
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getSubscription() {
        return subscription;
    }


    /**
     * Sets the subscription value for this CampaignSearchBasic.
     * 
     * @param subscription
     */
    public void setSubscription(org.mule.module.netsuite.api.internal.SearchMultiSelectField subscription) {
        this.subscription = subscription;
    }


    /**
     * Gets the template value for this CampaignSearchBasic.
     * 
     * @return template
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getTemplate() {
        return template;
    }


    /**
     * Sets the template value for this CampaignSearchBasic.
     * 
     * @param template
     */
    public void setTemplate(org.mule.module.netsuite.api.internal.SearchMultiSelectField template) {
        this.template = template;
    }


    /**
     * Gets the title value for this CampaignSearchBasic.
     * 
     * @return title
     */
    public org.mule.module.netsuite.api.internal.SearchStringField getTitle() {
        return title;
    }


    /**
     * Sets the title value for this CampaignSearchBasic.
     * 
     * @param title
     */
    public void setTitle(org.mule.module.netsuite.api.internal.SearchStringField title) {
        this.title = title;
    }


    /**
     * Gets the vertical value for this CampaignSearchBasic.
     * 
     * @return vertical
     */
    public org.mule.module.netsuite.api.internal.SearchMultiSelectField getVertical() {
        return vertical;
    }


    /**
     * Sets the vertical value for this CampaignSearchBasic.
     * 
     * @param vertical
     */
    public void setVertical(org.mule.module.netsuite.api.internal.SearchMultiSelectField vertical) {
        this.vertical = vertical;
    }


    /**
     * Gets the customFieldList value for this CampaignSearchBasic.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.SearchCustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this CampaignSearchBasic.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CampaignSearchBasic)) return false;
        CampaignSearchBasic other = (CampaignSearchBasic) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.audience==null && other.getAudience()==null) || 
             (this.audience!=null &&
              this.audience.equals(other.getAudience()))) &&
            ((this.baseCost==null && other.getBaseCost()==null) || 
             (this.baseCost!=null &&
              this.baseCost.equals(other.getBaseCost()))) &&
            ((this.campaignEventType==null && other.getCampaignEventType()==null) || 
             (this.campaignEventType!=null &&
              this.campaignEventType.equals(other.getCampaignEventType()))) &&
            ((this.campaignId==null && other.getCampaignId()==null) || 
             (this.campaignId!=null &&
              this.campaignId.equals(other.getCampaignId()))) &&
            ((this.category==null && other.getCategory()==null) || 
             (this.category!=null &&
              this.category.equals(other.getCategory()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.event==null && other.getEvent()==null) || 
             (this.event!=null &&
              this.event.equals(other.getEvent()))) &&
            ((this.expectedRevenue==null && other.getExpectedRevenue()==null) || 
             (this.expectedRevenue!=null &&
              this.expectedRevenue.equals(other.getExpectedRevenue()))) &&
            ((this.family==null && other.getFamily()==null) || 
             (this.family!=null &&
              this.family.equals(other.getFamily()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId()))) &&
            ((this.internalIdNumber==null && other.getInternalIdNumber()==null) || 
             (this.internalIdNumber!=null &&
              this.internalIdNumber.equals(other.getInternalIdNumber()))) &&
            ((this.isInactive==null && other.getIsInactive()==null) || 
             (this.isInactive!=null &&
              this.isInactive.equals(other.getIsInactive()))) &&
            ((this.isSalesCampaign==null && other.getIsSalesCampaign()==null) || 
             (this.isSalesCampaign!=null &&
              this.isSalesCampaign.equals(other.getIsSalesCampaign()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.keyword==null && other.getKeyword()==null) || 
             (this.keyword!=null &&
              this.keyword.equals(other.getKeyword()))) &&
            ((this.lastModifiedDate==null && other.getLastModifiedDate()==null) || 
             (this.lastModifiedDate!=null &&
              this.lastModifiedDate.equals(other.getLastModifiedDate()))) &&
            ((this.manager==null && other.getManager()==null) || 
             (this.manager!=null &&
              this.manager.equals(other.getManager()))) &&
            ((this.managerRole==null && other.getManagerRole()==null) || 
             (this.managerRole!=null &&
              this.managerRole.equals(other.getManagerRole()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              this.number.equals(other.getNumber()))) &&
            ((this.offer==null && other.getOffer()==null) || 
             (this.offer!=null &&
              this.offer.equals(other.getOffer()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.recipient==null && other.getRecipient()==null) || 
             (this.recipient!=null &&
              this.recipient.equals(other.getRecipient()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.responseCategory==null && other.getResponseCategory()==null) || 
             (this.responseCategory!=null &&
              this.responseCategory.equals(other.getResponseCategory()))) &&
            ((this.responseCode==null && other.getResponseCode()==null) || 
             (this.responseCode!=null &&
              this.responseCode.equals(other.getResponseCode()))) &&
            ((this.responseComments==null && other.getResponseComments()==null) || 
             (this.responseComments!=null &&
              this.responseComments.equals(other.getResponseComments()))) &&
            ((this.responseDate==null && other.getResponseDate()==null) || 
             (this.responseDate!=null &&
              this.responseDate.equals(other.getResponseDate()))) &&
            ((this.scheduleDate==null && other.getScheduleDate()==null) || 
             (this.scheduleDate!=null &&
              this.scheduleDate.equals(other.getScheduleDate()))) &&
            ((this.searchEngine==null && other.getSearchEngine()==null) || 
             (this.searchEngine!=null &&
              this.searchEngine.equals(other.getSearchEngine()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.subscription==null && other.getSubscription()==null) || 
             (this.subscription!=null &&
              this.subscription.equals(other.getSubscription()))) &&
            ((this.template==null && other.getTemplate()==null) || 
             (this.template!=null &&
              this.template.equals(other.getTemplate()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.vertical==null && other.getVertical()==null) || 
             (this.vertical!=null &&
              this.vertical.equals(other.getVertical()))) &&
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
        if (getAudience() != null) {
            _hashCode += getAudience().hashCode();
        }
        if (getBaseCost() != null) {
            _hashCode += getBaseCost().hashCode();
        }
        if (getCampaignEventType() != null) {
            _hashCode += getCampaignEventType().hashCode();
        }
        if (getCampaignId() != null) {
            _hashCode += getCampaignId().hashCode();
        }
        if (getCategory() != null) {
            _hashCode += getCategory().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getEvent() != null) {
            _hashCode += getEvent().hashCode();
        }
        if (getExpectedRevenue() != null) {
            _hashCode += getExpectedRevenue().hashCode();
        }
        if (getFamily() != null) {
            _hashCode += getFamily().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        if (getInternalIdNumber() != null) {
            _hashCode += getInternalIdNumber().hashCode();
        }
        if (getIsInactive() != null) {
            _hashCode += getIsInactive().hashCode();
        }
        if (getIsSalesCampaign() != null) {
            _hashCode += getIsSalesCampaign().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getKeyword() != null) {
            _hashCode += getKeyword().hashCode();
        }
        if (getLastModifiedDate() != null) {
            _hashCode += getLastModifiedDate().hashCode();
        }
        if (getManager() != null) {
            _hashCode += getManager().hashCode();
        }
        if (getManagerRole() != null) {
            _hashCode += getManagerRole().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        if (getOffer() != null) {
            _hashCode += getOffer().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getRecipient() != null) {
            _hashCode += getRecipient().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getResponseCategory() != null) {
            _hashCode += getResponseCategory().hashCode();
        }
        if (getResponseCode() != null) {
            _hashCode += getResponseCode().hashCode();
        }
        if (getResponseComments() != null) {
            _hashCode += getResponseComments().hashCode();
        }
        if (getResponseDate() != null) {
            _hashCode += getResponseDate().hashCode();
        }
        if (getScheduleDate() != null) {
            _hashCode += getScheduleDate().hashCode();
        }
        if (getSearchEngine() != null) {
            _hashCode += getSearchEngine().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSubscription() != null) {
            _hashCode += getSubscription().hashCode();
        }
        if (getTemplate() != null) {
            _hashCode += getTemplate().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getVertical() != null) {
            _hashCode += getVertical().hashCode();
        }
        if (getCustomFieldList() != null) {
            _hashCode += getCustomFieldList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CampaignSearchBasic.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "campaignEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "campaignId"));
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
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("event");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "event"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "expectedRevenue"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "family"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSalesCampaign");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "isSalesCampaign"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "keyword"));
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
        elemField.setFieldName("manager");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "manager"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managerRole");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "managerRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "offer"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "responseCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseComments");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "responseComments"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "responseDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "scheduleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "template"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vertical");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "vertical"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
