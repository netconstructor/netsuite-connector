/**
 * ItemFulfillment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillment  extends org.mule.module.netsuite.api.internal.Record  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private java.util.Calendar lastModifiedDate;

    private org.mule.module.netsuite.api.internal.RecordRef customForm;

    private org.mule.module.netsuite.api.internal.RecordRef postingPeriod;

    private org.mule.module.netsuite.api.internal.RecordRef entity;

    private org.mule.module.netsuite.api.internal.RecordRef createdFrom;

    private java.lang.Long createdFromShipGroup;

    private org.mule.module.netsuite.api.internal.RecordRef partner;

    private org.mule.module.netsuite.api.internal.ShipAddress transactionShipAddress;

    private org.mule.module.netsuite.api.internal.RecordRef shipAddressList;

    private java.lang.String shipAddress;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentShipStatus shipStatus;

    private java.lang.Boolean saturdayDeliveryUps;

    private java.lang.Boolean sendShipNotifyEmailUps;

    private java.lang.Boolean sendBackupEmailUps;

    private java.lang.String shipNotifyEmailAddressUps;

    private java.lang.String shipNotifyEmailAddress2Ups;

    private java.lang.String backupEmailAddressUps;

    private java.lang.String shipNotifyEmailMessageUps;

    private java.lang.String thirdPartyAcctUps;

    private java.lang.String thirdPartyZipcodeUps;

    private org.mule.module.netsuite.api.internal.Country thirdPartyCountryUps;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps;

    private java.lang.Boolean partiesToTransactionUps;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentExportTypeUps exportTypeUps;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentMethodOfTransportUps methodOfTransportUps;

    private java.lang.String carrierIdUps;

    private java.lang.String entryNumberUps;

    private java.lang.String inbondCodeUps;

    private java.lang.Boolean isRoutedExportTransactionUps;

    private java.lang.String licenseNumberUps;

    private java.util.Calendar licenseDateUps;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentLicenseExceptionUps licenseExceptionUps;

    private java.lang.String eccNumberUps;

    private java.lang.String recipientTaxIdUps;

    private java.util.Calendar blanketStartDateUps;

    private java.util.Calendar blanketEndDateUps;

    private java.lang.Double shipmentWeightUps;

    private java.lang.Boolean saturdayDeliveryFedEx;

    private java.lang.Boolean saturdayPickupFedex;

    private java.lang.Boolean sendShipNotifyEmailFedEx;

    private java.lang.Boolean sendBackupEmailFedEx;

    private java.lang.Boolean signatureHomeDeliveryFedEx;

    private java.lang.String shipNotifyEmailAddressFedEx;

    private java.lang.String backupEmailAddressFedEx;

    private java.util.Calendar shipDateFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx;

    private java.util.Calendar homeDeliveryDateFedEx;

    private java.lang.String bookingConfirmationNumFedEx;

    private java.lang.String intlExemptionNumFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx;

    private java.lang.String b13AStatementDataFedEx;

    private java.lang.String thirdPartyAcctFedEx;

    private org.mule.module.netsuite.api.internal.Country thirdPartyCountryFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx;

    private java.lang.Double shipmentWeightFedEx;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx;

    private java.lang.Double termsFreightChargeFedEx;

    private java.lang.Double termsInsuranceChargeFedEx;

    private java.util.Calendar tranDate;

    private java.lang.String tranId;

    private org.mule.module.netsuite.api.internal.RecordRef shipMethod;

    private java.lang.Boolean generateIntegratedShipperLabel;

    private java.lang.Double shippingCost;

    private java.lang.Double handlingCost;

    private java.lang.String memo;

    private org.mule.module.netsuite.api.internal.RecordRef transferLocation;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageList packageList;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsList packageUpsList;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUspsList packageUspsList;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExList packageFedExList;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentItemList itemList;

    private org.mule.module.netsuite.api.internal.ItemFulfillmentShipGroupList shipGroupList;

    private org.mule.module.netsuite.api.internal.CustomFieldList customFieldList;

    private java.lang.String internalId;  // attribute

    private java.lang.String externalId;  // attribute

    public ItemFulfillment() {
    }

    public ItemFulfillment(
           org.mule.module.netsuite.api.internal.NullField nullFieldList,
           java.lang.String internalId,
           java.lang.String externalId,
           java.util.Calendar createdDate,
           java.util.Calendar lastModifiedDate,
           org.mule.module.netsuite.api.internal.RecordRef customForm,
           org.mule.module.netsuite.api.internal.RecordRef postingPeriod,
           org.mule.module.netsuite.api.internal.RecordRef entity,
           org.mule.module.netsuite.api.internal.RecordRef createdFrom,
           java.lang.Long createdFromShipGroup,
           org.mule.module.netsuite.api.internal.RecordRef partner,
           org.mule.module.netsuite.api.internal.ShipAddress transactionShipAddress,
           org.mule.module.netsuite.api.internal.RecordRef shipAddressList,
           java.lang.String shipAddress,
           org.mule.module.netsuite.api.internal.ItemFulfillmentShipStatus shipStatus,
           java.lang.Boolean saturdayDeliveryUps,
           java.lang.Boolean sendShipNotifyEmailUps,
           java.lang.Boolean sendBackupEmailUps,
           java.lang.String shipNotifyEmailAddressUps,
           java.lang.String shipNotifyEmailAddress2Ups,
           java.lang.String backupEmailAddressUps,
           java.lang.String shipNotifyEmailMessageUps,
           java.lang.String thirdPartyAcctUps,
           java.lang.String thirdPartyZipcodeUps,
           org.mule.module.netsuite.api.internal.Country thirdPartyCountryUps,
           org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps,
           java.lang.Boolean partiesToTransactionUps,
           org.mule.module.netsuite.api.internal.ItemFulfillmentExportTypeUps exportTypeUps,
           org.mule.module.netsuite.api.internal.ItemFulfillmentMethodOfTransportUps methodOfTransportUps,
           java.lang.String carrierIdUps,
           java.lang.String entryNumberUps,
           java.lang.String inbondCodeUps,
           java.lang.Boolean isRoutedExportTransactionUps,
           java.lang.String licenseNumberUps,
           java.util.Calendar licenseDateUps,
           org.mule.module.netsuite.api.internal.ItemFulfillmentLicenseExceptionUps licenseExceptionUps,
           java.lang.String eccNumberUps,
           java.lang.String recipientTaxIdUps,
           java.util.Calendar blanketStartDateUps,
           java.util.Calendar blanketEndDateUps,
           java.lang.Double shipmentWeightUps,
           java.lang.Boolean saturdayDeliveryFedEx,
           java.lang.Boolean saturdayPickupFedex,
           java.lang.Boolean sendShipNotifyEmailFedEx,
           java.lang.Boolean sendBackupEmailFedEx,
           java.lang.Boolean signatureHomeDeliveryFedEx,
           java.lang.String shipNotifyEmailAddressFedEx,
           java.lang.String backupEmailAddressFedEx,
           java.util.Calendar shipDateFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx,
           java.util.Calendar homeDeliveryDateFedEx,
           java.lang.String bookingConfirmationNumFedEx,
           java.lang.String intlExemptionNumFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx,
           java.lang.String b13AStatementDataFedEx,
           java.lang.String thirdPartyAcctFedEx,
           org.mule.module.netsuite.api.internal.Country thirdPartyCountryFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx,
           java.lang.Double shipmentWeightFedEx,
           org.mule.module.netsuite.api.internal.ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx,
           java.lang.Double termsFreightChargeFedEx,
           java.lang.Double termsInsuranceChargeFedEx,
           java.util.Calendar tranDate,
           java.lang.String tranId,
           org.mule.module.netsuite.api.internal.RecordRef shipMethod,
           java.lang.Boolean generateIntegratedShipperLabel,
           java.lang.Double shippingCost,
           java.lang.Double handlingCost,
           java.lang.String memo,
           org.mule.module.netsuite.api.internal.RecordRef transferLocation,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageList packageList,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsList packageUpsList,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUspsList packageUspsList,
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExList packageFedExList,
           org.mule.module.netsuite.api.internal.ItemFulfillmentItemList itemList,
           org.mule.module.netsuite.api.internal.ItemFulfillmentShipGroupList shipGroupList,
           org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        super(
            nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.postingPeriod = postingPeriod;
        this.entity = entity;
        this.createdFrom = createdFrom;
        this.createdFromShipGroup = createdFromShipGroup;
        this.partner = partner;
        this.transactionShipAddress = transactionShipAddress;
        this.shipAddressList = shipAddressList;
        this.shipAddress = shipAddress;
        this.shipStatus = shipStatus;
        this.saturdayDeliveryUps = saturdayDeliveryUps;
        this.sendShipNotifyEmailUps = sendShipNotifyEmailUps;
        this.sendBackupEmailUps = sendBackupEmailUps;
        this.shipNotifyEmailAddressUps = shipNotifyEmailAddressUps;
        this.shipNotifyEmailAddress2Ups = shipNotifyEmailAddress2Ups;
        this.backupEmailAddressUps = backupEmailAddressUps;
        this.shipNotifyEmailMessageUps = shipNotifyEmailMessageUps;
        this.thirdPartyAcctUps = thirdPartyAcctUps;
        this.thirdPartyZipcodeUps = thirdPartyZipcodeUps;
        this.thirdPartyCountryUps = thirdPartyCountryUps;
        this.thirdPartyTypeUps = thirdPartyTypeUps;
        this.partiesToTransactionUps = partiesToTransactionUps;
        this.exportTypeUps = exportTypeUps;
        this.methodOfTransportUps = methodOfTransportUps;
        this.carrierIdUps = carrierIdUps;
        this.entryNumberUps = entryNumberUps;
        this.inbondCodeUps = inbondCodeUps;
        this.isRoutedExportTransactionUps = isRoutedExportTransactionUps;
        this.licenseNumberUps = licenseNumberUps;
        this.licenseDateUps = licenseDateUps;
        this.licenseExceptionUps = licenseExceptionUps;
        this.eccNumberUps = eccNumberUps;
        this.recipientTaxIdUps = recipientTaxIdUps;
        this.blanketStartDateUps = blanketStartDateUps;
        this.blanketEndDateUps = blanketEndDateUps;
        this.shipmentWeightUps = shipmentWeightUps;
        this.saturdayDeliveryFedEx = saturdayDeliveryFedEx;
        this.saturdayPickupFedex = saturdayPickupFedex;
        this.sendShipNotifyEmailFedEx = sendShipNotifyEmailFedEx;
        this.sendBackupEmailFedEx = sendBackupEmailFedEx;
        this.signatureHomeDeliveryFedEx = signatureHomeDeliveryFedEx;
        this.shipNotifyEmailAddressFedEx = shipNotifyEmailAddressFedEx;
        this.backupEmailAddressFedEx = backupEmailAddressFedEx;
        this.shipDateFedEx = shipDateFedEx;
        this.homeDeliveryTypeFedEx = homeDeliveryTypeFedEx;
        this.homeDeliveryDateFedEx = homeDeliveryDateFedEx;
        this.bookingConfirmationNumFedEx = bookingConfirmationNumFedEx;
        this.intlExemptionNumFedEx = intlExemptionNumFedEx;
        this.b13AFilingOptionFedEx = b13AFilingOptionFedEx;
        this.b13AStatementDataFedEx = b13AStatementDataFedEx;
        this.thirdPartyAcctFedEx = thirdPartyAcctFedEx;
        this.thirdPartyCountryFedEx = thirdPartyCountryFedEx;
        this.thirdPartyTypeFedEx = thirdPartyTypeFedEx;
        this.shipmentWeightFedEx = shipmentWeightFedEx;
        this.termsOfSaleFedEx = termsOfSaleFedEx;
        this.termsFreightChargeFedEx = termsFreightChargeFedEx;
        this.termsInsuranceChargeFedEx = termsInsuranceChargeFedEx;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.shipMethod = shipMethod;
        this.generateIntegratedShipperLabel = generateIntegratedShipperLabel;
        this.shippingCost = shippingCost;
        this.handlingCost = handlingCost;
        this.memo = memo;
        this.transferLocation = transferLocation;
        this.packageList = packageList;
        this.packageUpsList = packageUpsList;
        this.packageUspsList = packageUspsList;
        this.packageFedExList = packageFedExList;
        this.itemList = itemList;
        this.shipGroupList = shipGroupList;
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the createdDate value for this ItemFulfillment.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this ItemFulfillment.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the lastModifiedDate value for this ItemFulfillment.
     * 
     * @return lastModifiedDate
     */
    public java.util.Calendar getLastModifiedDate() {
        return lastModifiedDate;
    }


    /**
     * Sets the lastModifiedDate value for this ItemFulfillment.
     * 
     * @param lastModifiedDate
     */
    public void setLastModifiedDate(java.util.Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }


    /**
     * Gets the customForm value for this ItemFulfillment.
     * 
     * @return customForm
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCustomForm() {
        return customForm;
    }


    /**
     * Sets the customForm value for this ItemFulfillment.
     * 
     * @param customForm
     */
    public void setCustomForm(org.mule.module.netsuite.api.internal.RecordRef customForm) {
        this.customForm = customForm;
    }


    /**
     * Gets the postingPeriod value for this ItemFulfillment.
     * 
     * @return postingPeriod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPostingPeriod() {
        return postingPeriod;
    }


    /**
     * Sets the postingPeriod value for this ItemFulfillment.
     * 
     * @param postingPeriod
     */
    public void setPostingPeriod(org.mule.module.netsuite.api.internal.RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }


    /**
     * Gets the entity value for this ItemFulfillment.
     * 
     * @return entity
     */
    public org.mule.module.netsuite.api.internal.RecordRef getEntity() {
        return entity;
    }


    /**
     * Sets the entity value for this ItemFulfillment.
     * 
     * @param entity
     */
    public void setEntity(org.mule.module.netsuite.api.internal.RecordRef entity) {
        this.entity = entity;
    }


    /**
     * Gets the createdFrom value for this ItemFulfillment.
     * 
     * @return createdFrom
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCreatedFrom() {
        return createdFrom;
    }


    /**
     * Sets the createdFrom value for this ItemFulfillment.
     * 
     * @param createdFrom
     */
    public void setCreatedFrom(org.mule.module.netsuite.api.internal.RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }


    /**
     * Gets the createdFromShipGroup value for this ItemFulfillment.
     * 
     * @return createdFromShipGroup
     */
    public java.lang.Long getCreatedFromShipGroup() {
        return createdFromShipGroup;
    }


    /**
     * Sets the createdFromShipGroup value for this ItemFulfillment.
     * 
     * @param createdFromShipGroup
     */
    public void setCreatedFromShipGroup(java.lang.Long createdFromShipGroup) {
        this.createdFromShipGroup = createdFromShipGroup;
    }


    /**
     * Gets the partner value for this ItemFulfillment.
     * 
     * @return partner
     */
    public org.mule.module.netsuite.api.internal.RecordRef getPartner() {
        return partner;
    }


    /**
     * Sets the partner value for this ItemFulfillment.
     * 
     * @param partner
     */
    public void setPartner(org.mule.module.netsuite.api.internal.RecordRef partner) {
        this.partner = partner;
    }


    /**
     * Gets the transactionShipAddress value for this ItemFulfillment.
     * 
     * @return transactionShipAddress
     */
    public org.mule.module.netsuite.api.internal.ShipAddress getTransactionShipAddress() {
        return transactionShipAddress;
    }


    /**
     * Sets the transactionShipAddress value for this ItemFulfillment.
     * 
     * @param transactionShipAddress
     */
    public void setTransactionShipAddress(org.mule.module.netsuite.api.internal.ShipAddress transactionShipAddress) {
        this.transactionShipAddress = transactionShipAddress;
    }


    /**
     * Gets the shipAddressList value for this ItemFulfillment.
     * 
     * @return shipAddressList
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipAddressList() {
        return shipAddressList;
    }


    /**
     * Sets the shipAddressList value for this ItemFulfillment.
     * 
     * @param shipAddressList
     */
    public void setShipAddressList(org.mule.module.netsuite.api.internal.RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }


    /**
     * Gets the shipAddress value for this ItemFulfillment.
     * 
     * @return shipAddress
     */
    public java.lang.String getShipAddress() {
        return shipAddress;
    }


    /**
     * Sets the shipAddress value for this ItemFulfillment.
     * 
     * @param shipAddress
     */
    public void setShipAddress(java.lang.String shipAddress) {
        this.shipAddress = shipAddress;
    }


    /**
     * Gets the shipStatus value for this ItemFulfillment.
     * 
     * @return shipStatus
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentShipStatus getShipStatus() {
        return shipStatus;
    }


    /**
     * Sets the shipStatus value for this ItemFulfillment.
     * 
     * @param shipStatus
     */
    public void setShipStatus(org.mule.module.netsuite.api.internal.ItemFulfillmentShipStatus shipStatus) {
        this.shipStatus = shipStatus;
    }


    /**
     * Gets the saturdayDeliveryUps value for this ItemFulfillment.
     * 
     * @return saturdayDeliveryUps
     */
    public java.lang.Boolean getSaturdayDeliveryUps() {
        return saturdayDeliveryUps;
    }


    /**
     * Sets the saturdayDeliveryUps value for this ItemFulfillment.
     * 
     * @param saturdayDeliveryUps
     */
    public void setSaturdayDeliveryUps(java.lang.Boolean saturdayDeliveryUps) {
        this.saturdayDeliveryUps = saturdayDeliveryUps;
    }


    /**
     * Gets the sendShipNotifyEmailUps value for this ItemFulfillment.
     * 
     * @return sendShipNotifyEmailUps
     */
    public java.lang.Boolean getSendShipNotifyEmailUps() {
        return sendShipNotifyEmailUps;
    }


    /**
     * Sets the sendShipNotifyEmailUps value for this ItemFulfillment.
     * 
     * @param sendShipNotifyEmailUps
     */
    public void setSendShipNotifyEmailUps(java.lang.Boolean sendShipNotifyEmailUps) {
        this.sendShipNotifyEmailUps = sendShipNotifyEmailUps;
    }


    /**
     * Gets the sendBackupEmailUps value for this ItemFulfillment.
     * 
     * @return sendBackupEmailUps
     */
    public java.lang.Boolean getSendBackupEmailUps() {
        return sendBackupEmailUps;
    }


    /**
     * Sets the sendBackupEmailUps value for this ItemFulfillment.
     * 
     * @param sendBackupEmailUps
     */
    public void setSendBackupEmailUps(java.lang.Boolean sendBackupEmailUps) {
        this.sendBackupEmailUps = sendBackupEmailUps;
    }


    /**
     * Gets the shipNotifyEmailAddressUps value for this ItemFulfillment.
     * 
     * @return shipNotifyEmailAddressUps
     */
    public java.lang.String getShipNotifyEmailAddressUps() {
        return shipNotifyEmailAddressUps;
    }


    /**
     * Sets the shipNotifyEmailAddressUps value for this ItemFulfillment.
     * 
     * @param shipNotifyEmailAddressUps
     */
    public void setShipNotifyEmailAddressUps(java.lang.String shipNotifyEmailAddressUps) {
        this.shipNotifyEmailAddressUps = shipNotifyEmailAddressUps;
    }


    /**
     * Gets the shipNotifyEmailAddress2Ups value for this ItemFulfillment.
     * 
     * @return shipNotifyEmailAddress2Ups
     */
    public java.lang.String getShipNotifyEmailAddress2Ups() {
        return shipNotifyEmailAddress2Ups;
    }


    /**
     * Sets the shipNotifyEmailAddress2Ups value for this ItemFulfillment.
     * 
     * @param shipNotifyEmailAddress2Ups
     */
    public void setShipNotifyEmailAddress2Ups(java.lang.String shipNotifyEmailAddress2Ups) {
        this.shipNotifyEmailAddress2Ups = shipNotifyEmailAddress2Ups;
    }


    /**
     * Gets the backupEmailAddressUps value for this ItemFulfillment.
     * 
     * @return backupEmailAddressUps
     */
    public java.lang.String getBackupEmailAddressUps() {
        return backupEmailAddressUps;
    }


    /**
     * Sets the backupEmailAddressUps value for this ItemFulfillment.
     * 
     * @param backupEmailAddressUps
     */
    public void setBackupEmailAddressUps(java.lang.String backupEmailAddressUps) {
        this.backupEmailAddressUps = backupEmailAddressUps;
    }


    /**
     * Gets the shipNotifyEmailMessageUps value for this ItemFulfillment.
     * 
     * @return shipNotifyEmailMessageUps
     */
    public java.lang.String getShipNotifyEmailMessageUps() {
        return shipNotifyEmailMessageUps;
    }


    /**
     * Sets the shipNotifyEmailMessageUps value for this ItemFulfillment.
     * 
     * @param shipNotifyEmailMessageUps
     */
    public void setShipNotifyEmailMessageUps(java.lang.String shipNotifyEmailMessageUps) {
        this.shipNotifyEmailMessageUps = shipNotifyEmailMessageUps;
    }


    /**
     * Gets the thirdPartyAcctUps value for this ItemFulfillment.
     * 
     * @return thirdPartyAcctUps
     */
    public java.lang.String getThirdPartyAcctUps() {
        return thirdPartyAcctUps;
    }


    /**
     * Sets the thirdPartyAcctUps value for this ItemFulfillment.
     * 
     * @param thirdPartyAcctUps
     */
    public void setThirdPartyAcctUps(java.lang.String thirdPartyAcctUps) {
        this.thirdPartyAcctUps = thirdPartyAcctUps;
    }


    /**
     * Gets the thirdPartyZipcodeUps value for this ItemFulfillment.
     * 
     * @return thirdPartyZipcodeUps
     */
    public java.lang.String getThirdPartyZipcodeUps() {
        return thirdPartyZipcodeUps;
    }


    /**
     * Sets the thirdPartyZipcodeUps value for this ItemFulfillment.
     * 
     * @param thirdPartyZipcodeUps
     */
    public void setThirdPartyZipcodeUps(java.lang.String thirdPartyZipcodeUps) {
        this.thirdPartyZipcodeUps = thirdPartyZipcodeUps;
    }


    /**
     * Gets the thirdPartyCountryUps value for this ItemFulfillment.
     * 
     * @return thirdPartyCountryUps
     */
    public org.mule.module.netsuite.api.internal.Country getThirdPartyCountryUps() {
        return thirdPartyCountryUps;
    }


    /**
     * Sets the thirdPartyCountryUps value for this ItemFulfillment.
     * 
     * @param thirdPartyCountryUps
     */
    public void setThirdPartyCountryUps(org.mule.module.netsuite.api.internal.Country thirdPartyCountryUps) {
        this.thirdPartyCountryUps = thirdPartyCountryUps;
    }


    /**
     * Gets the thirdPartyTypeUps value for this ItemFulfillment.
     * 
     * @return thirdPartyTypeUps
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeUps getThirdPartyTypeUps() {
        return thirdPartyTypeUps;
    }


    /**
     * Sets the thirdPartyTypeUps value for this ItemFulfillment.
     * 
     * @param thirdPartyTypeUps
     */
    public void setThirdPartyTypeUps(org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeUps thirdPartyTypeUps) {
        this.thirdPartyTypeUps = thirdPartyTypeUps;
    }


    /**
     * Gets the partiesToTransactionUps value for this ItemFulfillment.
     * 
     * @return partiesToTransactionUps
     */
    public java.lang.Boolean getPartiesToTransactionUps() {
        return partiesToTransactionUps;
    }


    /**
     * Sets the partiesToTransactionUps value for this ItemFulfillment.
     * 
     * @param partiesToTransactionUps
     */
    public void setPartiesToTransactionUps(java.lang.Boolean partiesToTransactionUps) {
        this.partiesToTransactionUps = partiesToTransactionUps;
    }


    /**
     * Gets the exportTypeUps value for this ItemFulfillment.
     * 
     * @return exportTypeUps
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentExportTypeUps getExportTypeUps() {
        return exportTypeUps;
    }


    /**
     * Sets the exportTypeUps value for this ItemFulfillment.
     * 
     * @param exportTypeUps
     */
    public void setExportTypeUps(org.mule.module.netsuite.api.internal.ItemFulfillmentExportTypeUps exportTypeUps) {
        this.exportTypeUps = exportTypeUps;
    }


    /**
     * Gets the methodOfTransportUps value for this ItemFulfillment.
     * 
     * @return methodOfTransportUps
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentMethodOfTransportUps getMethodOfTransportUps() {
        return methodOfTransportUps;
    }


    /**
     * Sets the methodOfTransportUps value for this ItemFulfillment.
     * 
     * @param methodOfTransportUps
     */
    public void setMethodOfTransportUps(org.mule.module.netsuite.api.internal.ItemFulfillmentMethodOfTransportUps methodOfTransportUps) {
        this.methodOfTransportUps = methodOfTransportUps;
    }


    /**
     * Gets the carrierIdUps value for this ItemFulfillment.
     * 
     * @return carrierIdUps
     */
    public java.lang.String getCarrierIdUps() {
        return carrierIdUps;
    }


    /**
     * Sets the carrierIdUps value for this ItemFulfillment.
     * 
     * @param carrierIdUps
     */
    public void setCarrierIdUps(java.lang.String carrierIdUps) {
        this.carrierIdUps = carrierIdUps;
    }


    /**
     * Gets the entryNumberUps value for this ItemFulfillment.
     * 
     * @return entryNumberUps
     */
    public java.lang.String getEntryNumberUps() {
        return entryNumberUps;
    }


    /**
     * Sets the entryNumberUps value for this ItemFulfillment.
     * 
     * @param entryNumberUps
     */
    public void setEntryNumberUps(java.lang.String entryNumberUps) {
        this.entryNumberUps = entryNumberUps;
    }


    /**
     * Gets the inbondCodeUps value for this ItemFulfillment.
     * 
     * @return inbondCodeUps
     */
    public java.lang.String getInbondCodeUps() {
        return inbondCodeUps;
    }


    /**
     * Sets the inbondCodeUps value for this ItemFulfillment.
     * 
     * @param inbondCodeUps
     */
    public void setInbondCodeUps(java.lang.String inbondCodeUps) {
        this.inbondCodeUps = inbondCodeUps;
    }


    /**
     * Gets the isRoutedExportTransactionUps value for this ItemFulfillment.
     * 
     * @return isRoutedExportTransactionUps
     */
    public java.lang.Boolean getIsRoutedExportTransactionUps() {
        return isRoutedExportTransactionUps;
    }


    /**
     * Sets the isRoutedExportTransactionUps value for this ItemFulfillment.
     * 
     * @param isRoutedExportTransactionUps
     */
    public void setIsRoutedExportTransactionUps(java.lang.Boolean isRoutedExportTransactionUps) {
        this.isRoutedExportTransactionUps = isRoutedExportTransactionUps;
    }


    /**
     * Gets the licenseNumberUps value for this ItemFulfillment.
     * 
     * @return licenseNumberUps
     */
    public java.lang.String getLicenseNumberUps() {
        return licenseNumberUps;
    }


    /**
     * Sets the licenseNumberUps value for this ItemFulfillment.
     * 
     * @param licenseNumberUps
     */
    public void setLicenseNumberUps(java.lang.String licenseNumberUps) {
        this.licenseNumberUps = licenseNumberUps;
    }


    /**
     * Gets the licenseDateUps value for this ItemFulfillment.
     * 
     * @return licenseDateUps
     */
    public java.util.Calendar getLicenseDateUps() {
        return licenseDateUps;
    }


    /**
     * Sets the licenseDateUps value for this ItemFulfillment.
     * 
     * @param licenseDateUps
     */
    public void setLicenseDateUps(java.util.Calendar licenseDateUps) {
        this.licenseDateUps = licenseDateUps;
    }


    /**
     * Gets the licenseExceptionUps value for this ItemFulfillment.
     * 
     * @return licenseExceptionUps
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentLicenseExceptionUps getLicenseExceptionUps() {
        return licenseExceptionUps;
    }


    /**
     * Sets the licenseExceptionUps value for this ItemFulfillment.
     * 
     * @param licenseExceptionUps
     */
    public void setLicenseExceptionUps(org.mule.module.netsuite.api.internal.ItemFulfillmentLicenseExceptionUps licenseExceptionUps) {
        this.licenseExceptionUps = licenseExceptionUps;
    }


    /**
     * Gets the eccNumberUps value for this ItemFulfillment.
     * 
     * @return eccNumberUps
     */
    public java.lang.String getEccNumberUps() {
        return eccNumberUps;
    }


    /**
     * Sets the eccNumberUps value for this ItemFulfillment.
     * 
     * @param eccNumberUps
     */
    public void setEccNumberUps(java.lang.String eccNumberUps) {
        this.eccNumberUps = eccNumberUps;
    }


    /**
     * Gets the recipientTaxIdUps value for this ItemFulfillment.
     * 
     * @return recipientTaxIdUps
     */
    public java.lang.String getRecipientTaxIdUps() {
        return recipientTaxIdUps;
    }


    /**
     * Sets the recipientTaxIdUps value for this ItemFulfillment.
     * 
     * @param recipientTaxIdUps
     */
    public void setRecipientTaxIdUps(java.lang.String recipientTaxIdUps) {
        this.recipientTaxIdUps = recipientTaxIdUps;
    }


    /**
     * Gets the blanketStartDateUps value for this ItemFulfillment.
     * 
     * @return blanketStartDateUps
     */
    public java.util.Calendar getBlanketStartDateUps() {
        return blanketStartDateUps;
    }


    /**
     * Sets the blanketStartDateUps value for this ItemFulfillment.
     * 
     * @param blanketStartDateUps
     */
    public void setBlanketStartDateUps(java.util.Calendar blanketStartDateUps) {
        this.blanketStartDateUps = blanketStartDateUps;
    }


    /**
     * Gets the blanketEndDateUps value for this ItemFulfillment.
     * 
     * @return blanketEndDateUps
     */
    public java.util.Calendar getBlanketEndDateUps() {
        return blanketEndDateUps;
    }


    /**
     * Sets the blanketEndDateUps value for this ItemFulfillment.
     * 
     * @param blanketEndDateUps
     */
    public void setBlanketEndDateUps(java.util.Calendar blanketEndDateUps) {
        this.blanketEndDateUps = blanketEndDateUps;
    }


    /**
     * Gets the shipmentWeightUps value for this ItemFulfillment.
     * 
     * @return shipmentWeightUps
     */
    public java.lang.Double getShipmentWeightUps() {
        return shipmentWeightUps;
    }


    /**
     * Sets the shipmentWeightUps value for this ItemFulfillment.
     * 
     * @param shipmentWeightUps
     */
    public void setShipmentWeightUps(java.lang.Double shipmentWeightUps) {
        this.shipmentWeightUps = shipmentWeightUps;
    }


    /**
     * Gets the saturdayDeliveryFedEx value for this ItemFulfillment.
     * 
     * @return saturdayDeliveryFedEx
     */
    public java.lang.Boolean getSaturdayDeliveryFedEx() {
        return saturdayDeliveryFedEx;
    }


    /**
     * Sets the saturdayDeliveryFedEx value for this ItemFulfillment.
     * 
     * @param saturdayDeliveryFedEx
     */
    public void setSaturdayDeliveryFedEx(java.lang.Boolean saturdayDeliveryFedEx) {
        this.saturdayDeliveryFedEx = saturdayDeliveryFedEx;
    }


    /**
     * Gets the saturdayPickupFedex value for this ItemFulfillment.
     * 
     * @return saturdayPickupFedex
     */
    public java.lang.Boolean getSaturdayPickupFedex() {
        return saturdayPickupFedex;
    }


    /**
     * Sets the saturdayPickupFedex value for this ItemFulfillment.
     * 
     * @param saturdayPickupFedex
     */
    public void setSaturdayPickupFedex(java.lang.Boolean saturdayPickupFedex) {
        this.saturdayPickupFedex = saturdayPickupFedex;
    }


    /**
     * Gets the sendShipNotifyEmailFedEx value for this ItemFulfillment.
     * 
     * @return sendShipNotifyEmailFedEx
     */
    public java.lang.Boolean getSendShipNotifyEmailFedEx() {
        return sendShipNotifyEmailFedEx;
    }


    /**
     * Sets the sendShipNotifyEmailFedEx value for this ItemFulfillment.
     * 
     * @param sendShipNotifyEmailFedEx
     */
    public void setSendShipNotifyEmailFedEx(java.lang.Boolean sendShipNotifyEmailFedEx) {
        this.sendShipNotifyEmailFedEx = sendShipNotifyEmailFedEx;
    }


    /**
     * Gets the sendBackupEmailFedEx value for this ItemFulfillment.
     * 
     * @return sendBackupEmailFedEx
     */
    public java.lang.Boolean getSendBackupEmailFedEx() {
        return sendBackupEmailFedEx;
    }


    /**
     * Sets the sendBackupEmailFedEx value for this ItemFulfillment.
     * 
     * @param sendBackupEmailFedEx
     */
    public void setSendBackupEmailFedEx(java.lang.Boolean sendBackupEmailFedEx) {
        this.sendBackupEmailFedEx = sendBackupEmailFedEx;
    }


    /**
     * Gets the signatureHomeDeliveryFedEx value for this ItemFulfillment.
     * 
     * @return signatureHomeDeliveryFedEx
     */
    public java.lang.Boolean getSignatureHomeDeliveryFedEx() {
        return signatureHomeDeliveryFedEx;
    }


    /**
     * Sets the signatureHomeDeliveryFedEx value for this ItemFulfillment.
     * 
     * @param signatureHomeDeliveryFedEx
     */
    public void setSignatureHomeDeliveryFedEx(java.lang.Boolean signatureHomeDeliveryFedEx) {
        this.signatureHomeDeliveryFedEx = signatureHomeDeliveryFedEx;
    }


    /**
     * Gets the shipNotifyEmailAddressFedEx value for this ItemFulfillment.
     * 
     * @return shipNotifyEmailAddressFedEx
     */
    public java.lang.String getShipNotifyEmailAddressFedEx() {
        return shipNotifyEmailAddressFedEx;
    }


    /**
     * Sets the shipNotifyEmailAddressFedEx value for this ItemFulfillment.
     * 
     * @param shipNotifyEmailAddressFedEx
     */
    public void setShipNotifyEmailAddressFedEx(java.lang.String shipNotifyEmailAddressFedEx) {
        this.shipNotifyEmailAddressFedEx = shipNotifyEmailAddressFedEx;
    }


    /**
     * Gets the backupEmailAddressFedEx value for this ItemFulfillment.
     * 
     * @return backupEmailAddressFedEx
     */
    public java.lang.String getBackupEmailAddressFedEx() {
        return backupEmailAddressFedEx;
    }


    /**
     * Sets the backupEmailAddressFedEx value for this ItemFulfillment.
     * 
     * @param backupEmailAddressFedEx
     */
    public void setBackupEmailAddressFedEx(java.lang.String backupEmailAddressFedEx) {
        this.backupEmailAddressFedEx = backupEmailAddressFedEx;
    }


    /**
     * Gets the shipDateFedEx value for this ItemFulfillment.
     * 
     * @return shipDateFedEx
     */
    public java.util.Calendar getShipDateFedEx() {
        return shipDateFedEx;
    }


    /**
     * Sets the shipDateFedEx value for this ItemFulfillment.
     * 
     * @param shipDateFedEx
     */
    public void setShipDateFedEx(java.util.Calendar shipDateFedEx) {
        this.shipDateFedEx = shipDateFedEx;
    }


    /**
     * Gets the homeDeliveryTypeFedEx value for this ItemFulfillment.
     * 
     * @return homeDeliveryTypeFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentHomeDeliveryTypeFedEx getHomeDeliveryTypeFedEx() {
        return homeDeliveryTypeFedEx;
    }


    /**
     * Sets the homeDeliveryTypeFedEx value for this ItemFulfillment.
     * 
     * @param homeDeliveryTypeFedEx
     */
    public void setHomeDeliveryTypeFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentHomeDeliveryTypeFedEx homeDeliveryTypeFedEx) {
        this.homeDeliveryTypeFedEx = homeDeliveryTypeFedEx;
    }


    /**
     * Gets the homeDeliveryDateFedEx value for this ItemFulfillment.
     * 
     * @return homeDeliveryDateFedEx
     */
    public java.util.Calendar getHomeDeliveryDateFedEx() {
        return homeDeliveryDateFedEx;
    }


    /**
     * Sets the homeDeliveryDateFedEx value for this ItemFulfillment.
     * 
     * @param homeDeliveryDateFedEx
     */
    public void setHomeDeliveryDateFedEx(java.util.Calendar homeDeliveryDateFedEx) {
        this.homeDeliveryDateFedEx = homeDeliveryDateFedEx;
    }


    /**
     * Gets the bookingConfirmationNumFedEx value for this ItemFulfillment.
     * 
     * @return bookingConfirmationNumFedEx
     */
    public java.lang.String getBookingConfirmationNumFedEx() {
        return bookingConfirmationNumFedEx;
    }


    /**
     * Sets the bookingConfirmationNumFedEx value for this ItemFulfillment.
     * 
     * @param bookingConfirmationNumFedEx
     */
    public void setBookingConfirmationNumFedEx(java.lang.String bookingConfirmationNumFedEx) {
        this.bookingConfirmationNumFedEx = bookingConfirmationNumFedEx;
    }


    /**
     * Gets the intlExemptionNumFedEx value for this ItemFulfillment.
     * 
     * @return intlExemptionNumFedEx
     */
    public java.lang.String getIntlExemptionNumFedEx() {
        return intlExemptionNumFedEx;
    }


    /**
     * Sets the intlExemptionNumFedEx value for this ItemFulfillment.
     * 
     * @param intlExemptionNumFedEx
     */
    public void setIntlExemptionNumFedEx(java.lang.String intlExemptionNumFedEx) {
        this.intlExemptionNumFedEx = intlExemptionNumFedEx;
    }


    /**
     * Gets the b13AFilingOptionFedEx value for this ItemFulfillment.
     * 
     * @return b13AFilingOptionFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentB13AFilingOptionFedEx getB13AFilingOptionFedEx() {
        return b13AFilingOptionFedEx;
    }


    /**
     * Sets the b13AFilingOptionFedEx value for this ItemFulfillment.
     * 
     * @param b13AFilingOptionFedEx
     */
    public void setB13AFilingOptionFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentB13AFilingOptionFedEx b13AFilingOptionFedEx) {
        this.b13AFilingOptionFedEx = b13AFilingOptionFedEx;
    }


    /**
     * Gets the b13AStatementDataFedEx value for this ItemFulfillment.
     * 
     * @return b13AStatementDataFedEx
     */
    public java.lang.String getB13AStatementDataFedEx() {
        return b13AStatementDataFedEx;
    }


    /**
     * Sets the b13AStatementDataFedEx value for this ItemFulfillment.
     * 
     * @param b13AStatementDataFedEx
     */
    public void setB13AStatementDataFedEx(java.lang.String b13AStatementDataFedEx) {
        this.b13AStatementDataFedEx = b13AStatementDataFedEx;
    }


    /**
     * Gets the thirdPartyAcctFedEx value for this ItemFulfillment.
     * 
     * @return thirdPartyAcctFedEx
     */
    public java.lang.String getThirdPartyAcctFedEx() {
        return thirdPartyAcctFedEx;
    }


    /**
     * Sets the thirdPartyAcctFedEx value for this ItemFulfillment.
     * 
     * @param thirdPartyAcctFedEx
     */
    public void setThirdPartyAcctFedEx(java.lang.String thirdPartyAcctFedEx) {
        this.thirdPartyAcctFedEx = thirdPartyAcctFedEx;
    }


    /**
     * Gets the thirdPartyCountryFedEx value for this ItemFulfillment.
     * 
     * @return thirdPartyCountryFedEx
     */
    public org.mule.module.netsuite.api.internal.Country getThirdPartyCountryFedEx() {
        return thirdPartyCountryFedEx;
    }


    /**
     * Sets the thirdPartyCountryFedEx value for this ItemFulfillment.
     * 
     * @param thirdPartyCountryFedEx
     */
    public void setThirdPartyCountryFedEx(org.mule.module.netsuite.api.internal.Country thirdPartyCountryFedEx) {
        this.thirdPartyCountryFedEx = thirdPartyCountryFedEx;
    }


    /**
     * Gets the thirdPartyTypeFedEx value for this ItemFulfillment.
     * 
     * @return thirdPartyTypeFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeFedEx getThirdPartyTypeFedEx() {
        return thirdPartyTypeFedEx;
    }


    /**
     * Sets the thirdPartyTypeFedEx value for this ItemFulfillment.
     * 
     * @param thirdPartyTypeFedEx
     */
    public void setThirdPartyTypeFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentThirdPartyTypeFedEx thirdPartyTypeFedEx) {
        this.thirdPartyTypeFedEx = thirdPartyTypeFedEx;
    }


    /**
     * Gets the shipmentWeightFedEx value for this ItemFulfillment.
     * 
     * @return shipmentWeightFedEx
     */
    public java.lang.Double getShipmentWeightFedEx() {
        return shipmentWeightFedEx;
    }


    /**
     * Sets the shipmentWeightFedEx value for this ItemFulfillment.
     * 
     * @param shipmentWeightFedEx
     */
    public void setShipmentWeightFedEx(java.lang.Double shipmentWeightFedEx) {
        this.shipmentWeightFedEx = shipmentWeightFedEx;
    }


    /**
     * Gets the termsOfSaleFedEx value for this ItemFulfillment.
     * 
     * @return termsOfSaleFedEx
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentTermsOfSaleFedEx getTermsOfSaleFedEx() {
        return termsOfSaleFedEx;
    }


    /**
     * Sets the termsOfSaleFedEx value for this ItemFulfillment.
     * 
     * @param termsOfSaleFedEx
     */
    public void setTermsOfSaleFedEx(org.mule.module.netsuite.api.internal.ItemFulfillmentTermsOfSaleFedEx termsOfSaleFedEx) {
        this.termsOfSaleFedEx = termsOfSaleFedEx;
    }


    /**
     * Gets the termsFreightChargeFedEx value for this ItemFulfillment.
     * 
     * @return termsFreightChargeFedEx
     */
    public java.lang.Double getTermsFreightChargeFedEx() {
        return termsFreightChargeFedEx;
    }


    /**
     * Sets the termsFreightChargeFedEx value for this ItemFulfillment.
     * 
     * @param termsFreightChargeFedEx
     */
    public void setTermsFreightChargeFedEx(java.lang.Double termsFreightChargeFedEx) {
        this.termsFreightChargeFedEx = termsFreightChargeFedEx;
    }


    /**
     * Gets the termsInsuranceChargeFedEx value for this ItemFulfillment.
     * 
     * @return termsInsuranceChargeFedEx
     */
    public java.lang.Double getTermsInsuranceChargeFedEx() {
        return termsInsuranceChargeFedEx;
    }


    /**
     * Sets the termsInsuranceChargeFedEx value for this ItemFulfillment.
     * 
     * @param termsInsuranceChargeFedEx
     */
    public void setTermsInsuranceChargeFedEx(java.lang.Double termsInsuranceChargeFedEx) {
        this.termsInsuranceChargeFedEx = termsInsuranceChargeFedEx;
    }


    /**
     * Gets the tranDate value for this ItemFulfillment.
     * 
     * @return tranDate
     */
    public java.util.Calendar getTranDate() {
        return tranDate;
    }


    /**
     * Sets the tranDate value for this ItemFulfillment.
     * 
     * @param tranDate
     */
    public void setTranDate(java.util.Calendar tranDate) {
        this.tranDate = tranDate;
    }


    /**
     * Gets the tranId value for this ItemFulfillment.
     * 
     * @return tranId
     */
    public java.lang.String getTranId() {
        return tranId;
    }


    /**
     * Sets the tranId value for this ItemFulfillment.
     * 
     * @param tranId
     */
    public void setTranId(java.lang.String tranId) {
        this.tranId = tranId;
    }


    /**
     * Gets the shipMethod value for this ItemFulfillment.
     * 
     * @return shipMethod
     */
    public org.mule.module.netsuite.api.internal.RecordRef getShipMethod() {
        return shipMethod;
    }


    /**
     * Sets the shipMethod value for this ItemFulfillment.
     * 
     * @param shipMethod
     */
    public void setShipMethod(org.mule.module.netsuite.api.internal.RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }


    /**
     * Gets the generateIntegratedShipperLabel value for this ItemFulfillment.
     * 
     * @return generateIntegratedShipperLabel
     */
    public java.lang.Boolean getGenerateIntegratedShipperLabel() {
        return generateIntegratedShipperLabel;
    }


    /**
     * Sets the generateIntegratedShipperLabel value for this ItemFulfillment.
     * 
     * @param generateIntegratedShipperLabel
     */
    public void setGenerateIntegratedShipperLabel(java.lang.Boolean generateIntegratedShipperLabel) {
        this.generateIntegratedShipperLabel = generateIntegratedShipperLabel;
    }


    /**
     * Gets the shippingCost value for this ItemFulfillment.
     * 
     * @return shippingCost
     */
    public java.lang.Double getShippingCost() {
        return shippingCost;
    }


    /**
     * Sets the shippingCost value for this ItemFulfillment.
     * 
     * @param shippingCost
     */
    public void setShippingCost(java.lang.Double shippingCost) {
        this.shippingCost = shippingCost;
    }


    /**
     * Gets the handlingCost value for this ItemFulfillment.
     * 
     * @return handlingCost
     */
    public java.lang.Double getHandlingCost() {
        return handlingCost;
    }


    /**
     * Sets the handlingCost value for this ItemFulfillment.
     * 
     * @param handlingCost
     */
    public void setHandlingCost(java.lang.Double handlingCost) {
        this.handlingCost = handlingCost;
    }


    /**
     * Gets the memo value for this ItemFulfillment.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this ItemFulfillment.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the transferLocation value for this ItemFulfillment.
     * 
     * @return transferLocation
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTransferLocation() {
        return transferLocation;
    }


    /**
     * Sets the transferLocation value for this ItemFulfillment.
     * 
     * @param transferLocation
     */
    public void setTransferLocation(org.mule.module.netsuite.api.internal.RecordRef transferLocation) {
        this.transferLocation = transferLocation;
    }


    /**
     * Gets the packageList value for this ItemFulfillment.
     * 
     * @return packageList
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageList getPackageList() {
        return packageList;
    }


    /**
     * Sets the packageList value for this ItemFulfillment.
     * 
     * @param packageList
     */
    public void setPackageList(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageList packageList) {
        this.packageList = packageList;
    }


    /**
     * Gets the packageUpsList value for this ItemFulfillment.
     * 
     * @return packageUpsList
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsList getPackageUpsList() {
        return packageUpsList;
    }


    /**
     * Sets the packageUpsList value for this ItemFulfillment.
     * 
     * @param packageUpsList
     */
    public void setPackageUpsList(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUpsList packageUpsList) {
        this.packageUpsList = packageUpsList;
    }


    /**
     * Gets the packageUspsList value for this ItemFulfillment.
     * 
     * @return packageUspsList
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUspsList getPackageUspsList() {
        return packageUspsList;
    }


    /**
     * Sets the packageUspsList value for this ItemFulfillment.
     * 
     * @param packageUspsList
     */
    public void setPackageUspsList(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageUspsList packageUspsList) {
        this.packageUspsList = packageUspsList;
    }


    /**
     * Gets the packageFedExList value for this ItemFulfillment.
     * 
     * @return packageFedExList
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExList getPackageFedExList() {
        return packageFedExList;
    }


    /**
     * Sets the packageFedExList value for this ItemFulfillment.
     * 
     * @param packageFedExList
     */
    public void setPackageFedExList(org.mule.module.netsuite.api.internal.ItemFulfillmentPackageFedExList packageFedExList) {
        this.packageFedExList = packageFedExList;
    }


    /**
     * Gets the itemList value for this ItemFulfillment.
     * 
     * @return itemList
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentItemList getItemList() {
        return itemList;
    }


    /**
     * Sets the itemList value for this ItemFulfillment.
     * 
     * @param itemList
     */
    public void setItemList(org.mule.module.netsuite.api.internal.ItemFulfillmentItemList itemList) {
        this.itemList = itemList;
    }


    /**
     * Gets the shipGroupList value for this ItemFulfillment.
     * 
     * @return shipGroupList
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentShipGroupList getShipGroupList() {
        return shipGroupList;
    }


    /**
     * Sets the shipGroupList value for this ItemFulfillment.
     * 
     * @param shipGroupList
     */
    public void setShipGroupList(org.mule.module.netsuite.api.internal.ItemFulfillmentShipGroupList shipGroupList) {
        this.shipGroupList = shipGroupList;
    }


    /**
     * Gets the customFieldList value for this ItemFulfillment.
     * 
     * @return customFieldList
     */
    public org.mule.module.netsuite.api.internal.CustomFieldList getCustomFieldList() {
        return customFieldList;
    }


    /**
     * Sets the customFieldList value for this ItemFulfillment.
     * 
     * @param customFieldList
     */
    public void setCustomFieldList(org.mule.module.netsuite.api.internal.CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }


    /**
     * Gets the internalId value for this ItemFulfillment.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this ItemFulfillment.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }


    /**
     * Gets the externalId value for this ItemFulfillment.
     * 
     * @return externalId
     */
    public java.lang.String getExternalId() {
        return externalId;
    }


    /**
     * Sets the externalId value for this ItemFulfillment.
     * 
     * @param externalId
     */
    public void setExternalId(java.lang.String externalId) {
        this.externalId = externalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillment)) return false;
        ItemFulfillment other = (ItemFulfillment) obj;
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
            ((this.postingPeriod==null && other.getPostingPeriod()==null) || 
             (this.postingPeriod!=null &&
              this.postingPeriod.equals(other.getPostingPeriod()))) &&
            ((this.entity==null && other.getEntity()==null) || 
             (this.entity!=null &&
              this.entity.equals(other.getEntity()))) &&
            ((this.createdFrom==null && other.getCreatedFrom()==null) || 
             (this.createdFrom!=null &&
              this.createdFrom.equals(other.getCreatedFrom()))) &&
            ((this.createdFromShipGroup==null && other.getCreatedFromShipGroup()==null) || 
             (this.createdFromShipGroup!=null &&
              this.createdFromShipGroup.equals(other.getCreatedFromShipGroup()))) &&
            ((this.partner==null && other.getPartner()==null) || 
             (this.partner!=null &&
              this.partner.equals(other.getPartner()))) &&
            ((this.transactionShipAddress==null && other.getTransactionShipAddress()==null) || 
             (this.transactionShipAddress!=null &&
              this.transactionShipAddress.equals(other.getTransactionShipAddress()))) &&
            ((this.shipAddressList==null && other.getShipAddressList()==null) || 
             (this.shipAddressList!=null &&
              this.shipAddressList.equals(other.getShipAddressList()))) &&
            ((this.shipAddress==null && other.getShipAddress()==null) || 
             (this.shipAddress!=null &&
              this.shipAddress.equals(other.getShipAddress()))) &&
            ((this.shipStatus==null && other.getShipStatus()==null) || 
             (this.shipStatus!=null &&
              this.shipStatus.equals(other.getShipStatus()))) &&
            ((this.saturdayDeliveryUps==null && other.getSaturdayDeliveryUps()==null) || 
             (this.saturdayDeliveryUps!=null &&
              this.saturdayDeliveryUps.equals(other.getSaturdayDeliveryUps()))) &&
            ((this.sendShipNotifyEmailUps==null && other.getSendShipNotifyEmailUps()==null) || 
             (this.sendShipNotifyEmailUps!=null &&
              this.sendShipNotifyEmailUps.equals(other.getSendShipNotifyEmailUps()))) &&
            ((this.sendBackupEmailUps==null && other.getSendBackupEmailUps()==null) || 
             (this.sendBackupEmailUps!=null &&
              this.sendBackupEmailUps.equals(other.getSendBackupEmailUps()))) &&
            ((this.shipNotifyEmailAddressUps==null && other.getShipNotifyEmailAddressUps()==null) || 
             (this.shipNotifyEmailAddressUps!=null &&
              this.shipNotifyEmailAddressUps.equals(other.getShipNotifyEmailAddressUps()))) &&
            ((this.shipNotifyEmailAddress2Ups==null && other.getShipNotifyEmailAddress2Ups()==null) || 
             (this.shipNotifyEmailAddress2Ups!=null &&
              this.shipNotifyEmailAddress2Ups.equals(other.getShipNotifyEmailAddress2Ups()))) &&
            ((this.backupEmailAddressUps==null && other.getBackupEmailAddressUps()==null) || 
             (this.backupEmailAddressUps!=null &&
              this.backupEmailAddressUps.equals(other.getBackupEmailAddressUps()))) &&
            ((this.shipNotifyEmailMessageUps==null && other.getShipNotifyEmailMessageUps()==null) || 
             (this.shipNotifyEmailMessageUps!=null &&
              this.shipNotifyEmailMessageUps.equals(other.getShipNotifyEmailMessageUps()))) &&
            ((this.thirdPartyAcctUps==null && other.getThirdPartyAcctUps()==null) || 
             (this.thirdPartyAcctUps!=null &&
              this.thirdPartyAcctUps.equals(other.getThirdPartyAcctUps()))) &&
            ((this.thirdPartyZipcodeUps==null && other.getThirdPartyZipcodeUps()==null) || 
             (this.thirdPartyZipcodeUps!=null &&
              this.thirdPartyZipcodeUps.equals(other.getThirdPartyZipcodeUps()))) &&
            ((this.thirdPartyCountryUps==null && other.getThirdPartyCountryUps()==null) || 
             (this.thirdPartyCountryUps!=null &&
              this.thirdPartyCountryUps.equals(other.getThirdPartyCountryUps()))) &&
            ((this.thirdPartyTypeUps==null && other.getThirdPartyTypeUps()==null) || 
             (this.thirdPartyTypeUps!=null &&
              this.thirdPartyTypeUps.equals(other.getThirdPartyTypeUps()))) &&
            ((this.partiesToTransactionUps==null && other.getPartiesToTransactionUps()==null) || 
             (this.partiesToTransactionUps!=null &&
              this.partiesToTransactionUps.equals(other.getPartiesToTransactionUps()))) &&
            ((this.exportTypeUps==null && other.getExportTypeUps()==null) || 
             (this.exportTypeUps!=null &&
              this.exportTypeUps.equals(other.getExportTypeUps()))) &&
            ((this.methodOfTransportUps==null && other.getMethodOfTransportUps()==null) || 
             (this.methodOfTransportUps!=null &&
              this.methodOfTransportUps.equals(other.getMethodOfTransportUps()))) &&
            ((this.carrierIdUps==null && other.getCarrierIdUps()==null) || 
             (this.carrierIdUps!=null &&
              this.carrierIdUps.equals(other.getCarrierIdUps()))) &&
            ((this.entryNumberUps==null && other.getEntryNumberUps()==null) || 
             (this.entryNumberUps!=null &&
              this.entryNumberUps.equals(other.getEntryNumberUps()))) &&
            ((this.inbondCodeUps==null && other.getInbondCodeUps()==null) || 
             (this.inbondCodeUps!=null &&
              this.inbondCodeUps.equals(other.getInbondCodeUps()))) &&
            ((this.isRoutedExportTransactionUps==null && other.getIsRoutedExportTransactionUps()==null) || 
             (this.isRoutedExportTransactionUps!=null &&
              this.isRoutedExportTransactionUps.equals(other.getIsRoutedExportTransactionUps()))) &&
            ((this.licenseNumberUps==null && other.getLicenseNumberUps()==null) || 
             (this.licenseNumberUps!=null &&
              this.licenseNumberUps.equals(other.getLicenseNumberUps()))) &&
            ((this.licenseDateUps==null && other.getLicenseDateUps()==null) || 
             (this.licenseDateUps!=null &&
              this.licenseDateUps.equals(other.getLicenseDateUps()))) &&
            ((this.licenseExceptionUps==null && other.getLicenseExceptionUps()==null) || 
             (this.licenseExceptionUps!=null &&
              this.licenseExceptionUps.equals(other.getLicenseExceptionUps()))) &&
            ((this.eccNumberUps==null && other.getEccNumberUps()==null) || 
             (this.eccNumberUps!=null &&
              this.eccNumberUps.equals(other.getEccNumberUps()))) &&
            ((this.recipientTaxIdUps==null && other.getRecipientTaxIdUps()==null) || 
             (this.recipientTaxIdUps!=null &&
              this.recipientTaxIdUps.equals(other.getRecipientTaxIdUps()))) &&
            ((this.blanketStartDateUps==null && other.getBlanketStartDateUps()==null) || 
             (this.blanketStartDateUps!=null &&
              this.blanketStartDateUps.equals(other.getBlanketStartDateUps()))) &&
            ((this.blanketEndDateUps==null && other.getBlanketEndDateUps()==null) || 
             (this.blanketEndDateUps!=null &&
              this.blanketEndDateUps.equals(other.getBlanketEndDateUps()))) &&
            ((this.shipmentWeightUps==null && other.getShipmentWeightUps()==null) || 
             (this.shipmentWeightUps!=null &&
              this.shipmentWeightUps.equals(other.getShipmentWeightUps()))) &&
            ((this.saturdayDeliveryFedEx==null && other.getSaturdayDeliveryFedEx()==null) || 
             (this.saturdayDeliveryFedEx!=null &&
              this.saturdayDeliveryFedEx.equals(other.getSaturdayDeliveryFedEx()))) &&
            ((this.saturdayPickupFedex==null && other.getSaturdayPickupFedex()==null) || 
             (this.saturdayPickupFedex!=null &&
              this.saturdayPickupFedex.equals(other.getSaturdayPickupFedex()))) &&
            ((this.sendShipNotifyEmailFedEx==null && other.getSendShipNotifyEmailFedEx()==null) || 
             (this.sendShipNotifyEmailFedEx!=null &&
              this.sendShipNotifyEmailFedEx.equals(other.getSendShipNotifyEmailFedEx()))) &&
            ((this.sendBackupEmailFedEx==null && other.getSendBackupEmailFedEx()==null) || 
             (this.sendBackupEmailFedEx!=null &&
              this.sendBackupEmailFedEx.equals(other.getSendBackupEmailFedEx()))) &&
            ((this.signatureHomeDeliveryFedEx==null && other.getSignatureHomeDeliveryFedEx()==null) || 
             (this.signatureHomeDeliveryFedEx!=null &&
              this.signatureHomeDeliveryFedEx.equals(other.getSignatureHomeDeliveryFedEx()))) &&
            ((this.shipNotifyEmailAddressFedEx==null && other.getShipNotifyEmailAddressFedEx()==null) || 
             (this.shipNotifyEmailAddressFedEx!=null &&
              this.shipNotifyEmailAddressFedEx.equals(other.getShipNotifyEmailAddressFedEx()))) &&
            ((this.backupEmailAddressFedEx==null && other.getBackupEmailAddressFedEx()==null) || 
             (this.backupEmailAddressFedEx!=null &&
              this.backupEmailAddressFedEx.equals(other.getBackupEmailAddressFedEx()))) &&
            ((this.shipDateFedEx==null && other.getShipDateFedEx()==null) || 
             (this.shipDateFedEx!=null &&
              this.shipDateFedEx.equals(other.getShipDateFedEx()))) &&
            ((this.homeDeliveryTypeFedEx==null && other.getHomeDeliveryTypeFedEx()==null) || 
             (this.homeDeliveryTypeFedEx!=null &&
              this.homeDeliveryTypeFedEx.equals(other.getHomeDeliveryTypeFedEx()))) &&
            ((this.homeDeliveryDateFedEx==null && other.getHomeDeliveryDateFedEx()==null) || 
             (this.homeDeliveryDateFedEx!=null &&
              this.homeDeliveryDateFedEx.equals(other.getHomeDeliveryDateFedEx()))) &&
            ((this.bookingConfirmationNumFedEx==null && other.getBookingConfirmationNumFedEx()==null) || 
             (this.bookingConfirmationNumFedEx!=null &&
              this.bookingConfirmationNumFedEx.equals(other.getBookingConfirmationNumFedEx()))) &&
            ((this.intlExemptionNumFedEx==null && other.getIntlExemptionNumFedEx()==null) || 
             (this.intlExemptionNumFedEx!=null &&
              this.intlExemptionNumFedEx.equals(other.getIntlExemptionNumFedEx()))) &&
            ((this.b13AFilingOptionFedEx==null && other.getB13AFilingOptionFedEx()==null) || 
             (this.b13AFilingOptionFedEx!=null &&
              this.b13AFilingOptionFedEx.equals(other.getB13AFilingOptionFedEx()))) &&
            ((this.b13AStatementDataFedEx==null && other.getB13AStatementDataFedEx()==null) || 
             (this.b13AStatementDataFedEx!=null &&
              this.b13AStatementDataFedEx.equals(other.getB13AStatementDataFedEx()))) &&
            ((this.thirdPartyAcctFedEx==null && other.getThirdPartyAcctFedEx()==null) || 
             (this.thirdPartyAcctFedEx!=null &&
              this.thirdPartyAcctFedEx.equals(other.getThirdPartyAcctFedEx()))) &&
            ((this.thirdPartyCountryFedEx==null && other.getThirdPartyCountryFedEx()==null) || 
             (this.thirdPartyCountryFedEx!=null &&
              this.thirdPartyCountryFedEx.equals(other.getThirdPartyCountryFedEx()))) &&
            ((this.thirdPartyTypeFedEx==null && other.getThirdPartyTypeFedEx()==null) || 
             (this.thirdPartyTypeFedEx!=null &&
              this.thirdPartyTypeFedEx.equals(other.getThirdPartyTypeFedEx()))) &&
            ((this.shipmentWeightFedEx==null && other.getShipmentWeightFedEx()==null) || 
             (this.shipmentWeightFedEx!=null &&
              this.shipmentWeightFedEx.equals(other.getShipmentWeightFedEx()))) &&
            ((this.termsOfSaleFedEx==null && other.getTermsOfSaleFedEx()==null) || 
             (this.termsOfSaleFedEx!=null &&
              this.termsOfSaleFedEx.equals(other.getTermsOfSaleFedEx()))) &&
            ((this.termsFreightChargeFedEx==null && other.getTermsFreightChargeFedEx()==null) || 
             (this.termsFreightChargeFedEx!=null &&
              this.termsFreightChargeFedEx.equals(other.getTermsFreightChargeFedEx()))) &&
            ((this.termsInsuranceChargeFedEx==null && other.getTermsInsuranceChargeFedEx()==null) || 
             (this.termsInsuranceChargeFedEx!=null &&
              this.termsInsuranceChargeFedEx.equals(other.getTermsInsuranceChargeFedEx()))) &&
            ((this.tranDate==null && other.getTranDate()==null) || 
             (this.tranDate!=null &&
              this.tranDate.equals(other.getTranDate()))) &&
            ((this.tranId==null && other.getTranId()==null) || 
             (this.tranId!=null &&
              this.tranId.equals(other.getTranId()))) &&
            ((this.shipMethod==null && other.getShipMethod()==null) || 
             (this.shipMethod!=null &&
              this.shipMethod.equals(other.getShipMethod()))) &&
            ((this.generateIntegratedShipperLabel==null && other.getGenerateIntegratedShipperLabel()==null) || 
             (this.generateIntegratedShipperLabel!=null &&
              this.generateIntegratedShipperLabel.equals(other.getGenerateIntegratedShipperLabel()))) &&
            ((this.shippingCost==null && other.getShippingCost()==null) || 
             (this.shippingCost!=null &&
              this.shippingCost.equals(other.getShippingCost()))) &&
            ((this.handlingCost==null && other.getHandlingCost()==null) || 
             (this.handlingCost!=null &&
              this.handlingCost.equals(other.getHandlingCost()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.transferLocation==null && other.getTransferLocation()==null) || 
             (this.transferLocation!=null &&
              this.transferLocation.equals(other.getTransferLocation()))) &&
            ((this.packageList==null && other.getPackageList()==null) || 
             (this.packageList!=null &&
              this.packageList.equals(other.getPackageList()))) &&
            ((this.packageUpsList==null && other.getPackageUpsList()==null) || 
             (this.packageUpsList!=null &&
              this.packageUpsList.equals(other.getPackageUpsList()))) &&
            ((this.packageUspsList==null && other.getPackageUspsList()==null) || 
             (this.packageUspsList!=null &&
              this.packageUspsList.equals(other.getPackageUspsList()))) &&
            ((this.packageFedExList==null && other.getPackageFedExList()==null) || 
             (this.packageFedExList!=null &&
              this.packageFedExList.equals(other.getPackageFedExList()))) &&
            ((this.itemList==null && other.getItemList()==null) || 
             (this.itemList!=null &&
              this.itemList.equals(other.getItemList()))) &&
            ((this.shipGroupList==null && other.getShipGroupList()==null) || 
             (this.shipGroupList!=null &&
              this.shipGroupList.equals(other.getShipGroupList()))) &&
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
        if (getPostingPeriod() != null) {
            _hashCode += getPostingPeriod().hashCode();
        }
        if (getEntity() != null) {
            _hashCode += getEntity().hashCode();
        }
        if (getCreatedFrom() != null) {
            _hashCode += getCreatedFrom().hashCode();
        }
        if (getCreatedFromShipGroup() != null) {
            _hashCode += getCreatedFromShipGroup().hashCode();
        }
        if (getPartner() != null) {
            _hashCode += getPartner().hashCode();
        }
        if (getTransactionShipAddress() != null) {
            _hashCode += getTransactionShipAddress().hashCode();
        }
        if (getShipAddressList() != null) {
            _hashCode += getShipAddressList().hashCode();
        }
        if (getShipAddress() != null) {
            _hashCode += getShipAddress().hashCode();
        }
        if (getShipStatus() != null) {
            _hashCode += getShipStatus().hashCode();
        }
        if (getSaturdayDeliveryUps() != null) {
            _hashCode += getSaturdayDeliveryUps().hashCode();
        }
        if (getSendShipNotifyEmailUps() != null) {
            _hashCode += getSendShipNotifyEmailUps().hashCode();
        }
        if (getSendBackupEmailUps() != null) {
            _hashCode += getSendBackupEmailUps().hashCode();
        }
        if (getShipNotifyEmailAddressUps() != null) {
            _hashCode += getShipNotifyEmailAddressUps().hashCode();
        }
        if (getShipNotifyEmailAddress2Ups() != null) {
            _hashCode += getShipNotifyEmailAddress2Ups().hashCode();
        }
        if (getBackupEmailAddressUps() != null) {
            _hashCode += getBackupEmailAddressUps().hashCode();
        }
        if (getShipNotifyEmailMessageUps() != null) {
            _hashCode += getShipNotifyEmailMessageUps().hashCode();
        }
        if (getThirdPartyAcctUps() != null) {
            _hashCode += getThirdPartyAcctUps().hashCode();
        }
        if (getThirdPartyZipcodeUps() != null) {
            _hashCode += getThirdPartyZipcodeUps().hashCode();
        }
        if (getThirdPartyCountryUps() != null) {
            _hashCode += getThirdPartyCountryUps().hashCode();
        }
        if (getThirdPartyTypeUps() != null) {
            _hashCode += getThirdPartyTypeUps().hashCode();
        }
        if (getPartiesToTransactionUps() != null) {
            _hashCode += getPartiesToTransactionUps().hashCode();
        }
        if (getExportTypeUps() != null) {
            _hashCode += getExportTypeUps().hashCode();
        }
        if (getMethodOfTransportUps() != null) {
            _hashCode += getMethodOfTransportUps().hashCode();
        }
        if (getCarrierIdUps() != null) {
            _hashCode += getCarrierIdUps().hashCode();
        }
        if (getEntryNumberUps() != null) {
            _hashCode += getEntryNumberUps().hashCode();
        }
        if (getInbondCodeUps() != null) {
            _hashCode += getInbondCodeUps().hashCode();
        }
        if (getIsRoutedExportTransactionUps() != null) {
            _hashCode += getIsRoutedExportTransactionUps().hashCode();
        }
        if (getLicenseNumberUps() != null) {
            _hashCode += getLicenseNumberUps().hashCode();
        }
        if (getLicenseDateUps() != null) {
            _hashCode += getLicenseDateUps().hashCode();
        }
        if (getLicenseExceptionUps() != null) {
            _hashCode += getLicenseExceptionUps().hashCode();
        }
        if (getEccNumberUps() != null) {
            _hashCode += getEccNumberUps().hashCode();
        }
        if (getRecipientTaxIdUps() != null) {
            _hashCode += getRecipientTaxIdUps().hashCode();
        }
        if (getBlanketStartDateUps() != null) {
            _hashCode += getBlanketStartDateUps().hashCode();
        }
        if (getBlanketEndDateUps() != null) {
            _hashCode += getBlanketEndDateUps().hashCode();
        }
        if (getShipmentWeightUps() != null) {
            _hashCode += getShipmentWeightUps().hashCode();
        }
        if (getSaturdayDeliveryFedEx() != null) {
            _hashCode += getSaturdayDeliveryFedEx().hashCode();
        }
        if (getSaturdayPickupFedex() != null) {
            _hashCode += getSaturdayPickupFedex().hashCode();
        }
        if (getSendShipNotifyEmailFedEx() != null) {
            _hashCode += getSendShipNotifyEmailFedEx().hashCode();
        }
        if (getSendBackupEmailFedEx() != null) {
            _hashCode += getSendBackupEmailFedEx().hashCode();
        }
        if (getSignatureHomeDeliveryFedEx() != null) {
            _hashCode += getSignatureHomeDeliveryFedEx().hashCode();
        }
        if (getShipNotifyEmailAddressFedEx() != null) {
            _hashCode += getShipNotifyEmailAddressFedEx().hashCode();
        }
        if (getBackupEmailAddressFedEx() != null) {
            _hashCode += getBackupEmailAddressFedEx().hashCode();
        }
        if (getShipDateFedEx() != null) {
            _hashCode += getShipDateFedEx().hashCode();
        }
        if (getHomeDeliveryTypeFedEx() != null) {
            _hashCode += getHomeDeliveryTypeFedEx().hashCode();
        }
        if (getHomeDeliveryDateFedEx() != null) {
            _hashCode += getHomeDeliveryDateFedEx().hashCode();
        }
        if (getBookingConfirmationNumFedEx() != null) {
            _hashCode += getBookingConfirmationNumFedEx().hashCode();
        }
        if (getIntlExemptionNumFedEx() != null) {
            _hashCode += getIntlExemptionNumFedEx().hashCode();
        }
        if (getB13AFilingOptionFedEx() != null) {
            _hashCode += getB13AFilingOptionFedEx().hashCode();
        }
        if (getB13AStatementDataFedEx() != null) {
            _hashCode += getB13AStatementDataFedEx().hashCode();
        }
        if (getThirdPartyAcctFedEx() != null) {
            _hashCode += getThirdPartyAcctFedEx().hashCode();
        }
        if (getThirdPartyCountryFedEx() != null) {
            _hashCode += getThirdPartyCountryFedEx().hashCode();
        }
        if (getThirdPartyTypeFedEx() != null) {
            _hashCode += getThirdPartyTypeFedEx().hashCode();
        }
        if (getShipmentWeightFedEx() != null) {
            _hashCode += getShipmentWeightFedEx().hashCode();
        }
        if (getTermsOfSaleFedEx() != null) {
            _hashCode += getTermsOfSaleFedEx().hashCode();
        }
        if (getTermsFreightChargeFedEx() != null) {
            _hashCode += getTermsFreightChargeFedEx().hashCode();
        }
        if (getTermsInsuranceChargeFedEx() != null) {
            _hashCode += getTermsInsuranceChargeFedEx().hashCode();
        }
        if (getTranDate() != null) {
            _hashCode += getTranDate().hashCode();
        }
        if (getTranId() != null) {
            _hashCode += getTranId().hashCode();
        }
        if (getShipMethod() != null) {
            _hashCode += getShipMethod().hashCode();
        }
        if (getGenerateIntegratedShipperLabel() != null) {
            _hashCode += getGenerateIntegratedShipperLabel().hashCode();
        }
        if (getShippingCost() != null) {
            _hashCode += getShippingCost().hashCode();
        }
        if (getHandlingCost() != null) {
            _hashCode += getHandlingCost().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getTransferLocation() != null) {
            _hashCode += getTransferLocation().hashCode();
        }
        if (getPackageList() != null) {
            _hashCode += getPackageList().hashCode();
        }
        if (getPackageUpsList() != null) {
            _hashCode += getPackageUpsList().hashCode();
        }
        if (getPackageUspsList() != null) {
            _hashCode += getPackageUspsList().hashCode();
        }
        if (getPackageFedExList() != null) {
            _hashCode += getPackageFedExList().hashCode();
        }
        if (getItemList() != null) {
            _hashCode += getItemList().hashCode();
        }
        if (getShipGroupList() != null) {
            _hashCode += getShipGroupList().hashCode();
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
        new org.apache.axis.description.TypeDesc(ItemFulfillment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillment"));
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
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdFromShipGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "createdFromShipGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionShipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "transactionShipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ShipAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentShipStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayDeliveryUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "saturdayDeliveryUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendShipNotifyEmailUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "sendShipNotifyEmailUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendBackupEmailUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "sendBackupEmailUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipNotifyEmailAddressUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipNotifyEmailAddressUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipNotifyEmailAddress2Ups");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipNotifyEmailAddress2Ups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupEmailAddressUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "backupEmailAddressUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipNotifyEmailMessageUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipNotifyEmailMessageUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAcctUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "thirdPartyAcctUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyZipcodeUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "thirdPartyZipcodeUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCountryUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "thirdPartyCountryUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyTypeUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "thirdPartyTypeUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partiesToTransactionUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "partiesToTransactionUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportTypeUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "exportTypeUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentExportTypeUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodOfTransportUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "methodOfTransportUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentMethodOfTransportUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierIdUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "carrierIdUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryNumberUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "entryNumberUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inbondCodeUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "inbondCodeUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRoutedExportTransactionUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "isRoutedExportTransactionUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNumberUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "licenseNumberUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseDateUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "licenseDateUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseExceptionUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "licenseExceptionUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentLicenseExceptionUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eccNumberUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "eccNumberUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientTaxIdUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "recipientTaxIdUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blanketStartDateUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "blanketStartDateUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blanketEndDateUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "blanketEndDateUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentWeightUps");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipmentWeightUps"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayDeliveryFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "saturdayDeliveryFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saturdayPickupFedex");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "saturdayPickupFedex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendShipNotifyEmailFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "sendShipNotifyEmailFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendBackupEmailFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "sendBackupEmailFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureHomeDeliveryFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "signatureHomeDeliveryFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipNotifyEmailAddressFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipNotifyEmailAddressFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupEmailAddressFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "backupEmailAddressFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipDateFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipDateFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDeliveryTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "homeDeliveryTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentHomeDeliveryTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeDeliveryDateFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "homeDeliveryDateFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingConfirmationNumFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "bookingConfirmationNumFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intlExemptionNumFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "intlExemptionNumFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b13AFilingOptionFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "b13aFilingOptionFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentB13AFilingOptionFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("b13AStatementDataFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "b13aStatementDataFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyAcctFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "thirdPartyAcctFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyCountryFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "thirdPartyCountryFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thirdPartyTypeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "thirdPartyTypeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentWeightFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipmentWeightFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsOfSaleFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "termsOfSaleFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentTermsOfSaleFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsFreightChargeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "termsFreightChargeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("termsInsuranceChargeFedEx");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "termsInsuranceChargeFedEx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("generateIntegratedShipperLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "generateIntegratedShipperLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageUpsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageUpsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageUspsList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageUspsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageFedExList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageFedExList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipGroupList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "shipGroupList"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentShipGroupList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "customFieldList"));
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
