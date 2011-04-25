/**
 * RecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class RecordType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RecordType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _account = "account";
    public static final java.lang.String _accountingPeriod = "accountingPeriod";
    public static final java.lang.String _assemblyBuild = "assemblyBuild";
    public static final java.lang.String _assemblyUnbuild = "assemblyUnbuild";
    public static final java.lang.String _assemblyItem = "assemblyItem";
    public static final java.lang.String _bin = "bin";
    public static final java.lang.String _budget = "budget";
    public static final java.lang.String _budgetCategory = "budgetCategory";
    public static final java.lang.String _calendarEvent = "calendarEvent";
    public static final java.lang.String _campaign = "campaign";
    public static final java.lang.String _campaignAudience = "campaignAudience";
    public static final java.lang.String _campaignCategory = "campaignCategory";
    public static final java.lang.String _campaignChannel = "campaignChannel";
    public static final java.lang.String _campaignFamily = "campaignFamily";
    public static final java.lang.String _campaignOffer = "campaignOffer";
    public static final java.lang.String _campaignResponse = "campaignResponse";
    public static final java.lang.String _campaignSearchEngine = "campaignSearchEngine";
    public static final java.lang.String _campaignSubscription = "campaignSubscription";
    public static final java.lang.String _campaignVertical = "campaignVertical";
    public static final java.lang.String _cashRefund = "cashRefund";
    public static final java.lang.String _cashSale = "cashSale";
    public static final java.lang.String _check = "check";
    public static final java.lang.String _classification = "classification";
    public static final java.lang.String _contact = "contact";
    public static final java.lang.String _contactCategory = "contactCategory";
    public static final java.lang.String _contactRole = "contactRole";
    public static final java.lang.String _creditMemo = "creditMemo";
    public static final java.lang.String _crmCustomField = "crmCustomField";
    public static final java.lang.String _currency = "currency";
    public static final java.lang.String _customList = "customList";
    public static final java.lang.String _customRecord = "customRecord";
    public static final java.lang.String _customRecordCustomField = "customRecordCustomField";
    public static final java.lang.String _customRecordType = "customRecordType";
    public static final java.lang.String _customer = "customer";
    public static final java.lang.String _customerCategory = "customerCategory";
    public static final java.lang.String _customerDeposit = "customerDeposit";
    public static final java.lang.String _customerPayment = "customerPayment";
    public static final java.lang.String _customerRefund = "customerRefund";
    public static final java.lang.String _customerStatus = "customerStatus";
    public static final java.lang.String _depositApplication = "depositApplication";
    public static final java.lang.String _department = "department";
    public static final java.lang.String _descriptionItem = "descriptionItem";
    public static final java.lang.String _discountItem = "discountItem";
    public static final java.lang.String _downloadItem = "downloadItem";
    public static final java.lang.String _employee = "employee";
    public static final java.lang.String _entityCustomField = "entityCustomField";
    public static final java.lang.String _entityGroup = "entityGroup";
    public static final java.lang.String _estimate = "estimate";
    public static final java.lang.String _expenseCategory = "expenseCategory";
    public static final java.lang.String _expenseReport = "expenseReport";
    public static final java.lang.String _file = "file";
    public static final java.lang.String _folder = "folder";
    public static final java.lang.String _giftCertificate = "giftCertificate";
    public static final java.lang.String _giftCertificateItem = "giftCertificateItem";
    public static final java.lang.String _interCompanyJournalEntry = "interCompanyJournalEntry";
    public static final java.lang.String _interCompanyTransferOrder = "interCompanyTransferOrder";
    public static final java.lang.String _inventoryAdjustment = "inventoryAdjustment";
    public static final java.lang.String _inventoryItem = "inventoryItem";
    public static final java.lang.String _invoice = "invoice";
    public static final java.lang.String _itemCustomField = "itemCustomField";
    public static final java.lang.String _itemFulfillment = "itemFulfillment";
    public static final java.lang.String _itemNumberCustomField = "itemNumberCustomField";
    public static final java.lang.String _itemOptionCustomField = "itemOptionCustomField";
    public static final java.lang.String _issue = "issue";
    public static final java.lang.String _job = "job";
    public static final java.lang.String _jobStatus = "jobStatus";
    public static final java.lang.String _jobType = "jobType";
    public static final java.lang.String _itemReceipt = "itemReceipt";
    public static final java.lang.String _journalEntry = "journalEntry";
    public static final java.lang.String _kitItem = "kitItem";
    public static final java.lang.String _leadSource = "leadSource";
    public static final java.lang.String _location = "location";
    public static final java.lang.String _lotNumberedInventoryItem = "lotNumberedInventoryItem";
    public static final java.lang.String _lotNumberedAssemblyItem = "lotNumberedAssemblyItem";
    public static final java.lang.String _markupItem = "markupItem";
    public static final java.lang.String _message = "message";
    public static final java.lang.String _nonInventoryPurchaseItem = "nonInventoryPurchaseItem";
    public static final java.lang.String _nonInventoryResaleItem = "nonInventoryResaleItem";
    public static final java.lang.String _nonInventorySaleItem = "nonInventorySaleItem";
    public static final java.lang.String _note = "note";
    public static final java.lang.String _noteType = "noteType";
    public static final java.lang.String _opportunity = "opportunity";
    public static final java.lang.String _otherChargePurchaseItem = "otherChargePurchaseItem";
    public static final java.lang.String _otherChargeResaleItem = "otherChargeResaleItem";
    public static final java.lang.String _otherChargeSaleItem = "otherChargeSaleItem";
    public static final java.lang.String _otherCustomField = "otherCustomField";
    public static final java.lang.String _partner = "partner";
    public static final java.lang.String _partnerCategory = "partnerCategory";
    public static final java.lang.String _paymentItem = "paymentItem";
    public static final java.lang.String _paymentMethod = "paymentMethod";
    public static final java.lang.String _phoneCall = "phoneCall";
    public static final java.lang.String _priceLevel = "priceLevel";
    public static final java.lang.String _projectTask = "projectTask";
    public static final java.lang.String _promotionCode = "promotionCode";
    public static final java.lang.String _purchaseOrder = "purchaseOrder";
    public static final java.lang.String _returnAuthorization = "returnAuthorization";
    public static final java.lang.String _salesOrder = "salesOrder";
    public static final java.lang.String _salesRole = "salesRole";
    public static final java.lang.String _salesTaxItem = "salesTaxItem";
    public static final java.lang.String _serializedInventoryItem = "serializedInventoryItem";
    public static final java.lang.String _serializedAssemblyItem = "serializedAssemblyItem";
    public static final java.lang.String _servicePurchaseItem = "servicePurchaseItem";
    public static final java.lang.String _serviceResaleItem = "serviceResaleItem";
    public static final java.lang.String _serviceSaleItem = "serviceSaleItem";
    public static final java.lang.String _solution = "solution";
    public static final java.lang.String _siteCategory = "siteCategory";
    public static final java.lang.String _state = "state";
    public static final java.lang.String _subsidiary = "subsidiary";
    public static final java.lang.String _subtotalItem = "subtotalItem";
    public static final java.lang.String _supportCase = "supportCase";
    public static final java.lang.String _supportCaseIssue = "supportCaseIssue";
    public static final java.lang.String _supportCaseOrigin = "supportCaseOrigin";
    public static final java.lang.String _supportCasePriority = "supportCasePriority";
    public static final java.lang.String _supportCaseStatus = "supportCaseStatus";
    public static final java.lang.String _supportCaseType = "supportCaseType";
    public static final java.lang.String _task = "task";
    public static final java.lang.String _taxGroup = "taxGroup";
    public static final java.lang.String _taxType = "taxType";
    public static final java.lang.String _term = "term";
    public static final java.lang.String _timeBill = "timeBill";
    public static final java.lang.String _topic = "topic";
    public static final java.lang.String _transferOrder = "transferOrder";
    public static final java.lang.String _transactionBodyCustomField = "transactionBodyCustomField";
    public static final java.lang.String _transactionColumnCustomField = "transactionColumnCustomField";
    public static final java.lang.String _unitsType = "unitsType";
    public static final java.lang.String _vendor = "vendor";
    public static final java.lang.String _vendorCategory = "vendorCategory";
    public static final java.lang.String _vendorBill = "vendorBill";
    public static final java.lang.String _vendorPayment = "vendorPayment";
    public static final java.lang.String _winLossReason = "winLossReason";
    public static final RecordType account = new RecordType(_account);
    public static final RecordType accountingPeriod = new RecordType(_accountingPeriod);
    public static final RecordType assemblyBuild = new RecordType(_assemblyBuild);
    public static final RecordType assemblyUnbuild = new RecordType(_assemblyUnbuild);
    public static final RecordType assemblyItem = new RecordType(_assemblyItem);
    public static final RecordType bin = new RecordType(_bin);
    public static final RecordType budget = new RecordType(_budget);
    public static final RecordType budgetCategory = new RecordType(_budgetCategory);
    public static final RecordType calendarEvent = new RecordType(_calendarEvent);
    public static final RecordType campaign = new RecordType(_campaign);
    public static final RecordType campaignAudience = new RecordType(_campaignAudience);
    public static final RecordType campaignCategory = new RecordType(_campaignCategory);
    public static final RecordType campaignChannel = new RecordType(_campaignChannel);
    public static final RecordType campaignFamily = new RecordType(_campaignFamily);
    public static final RecordType campaignOffer = new RecordType(_campaignOffer);
    public static final RecordType campaignResponse = new RecordType(_campaignResponse);
    public static final RecordType campaignSearchEngine = new RecordType(_campaignSearchEngine);
    public static final RecordType campaignSubscription = new RecordType(_campaignSubscription);
    public static final RecordType campaignVertical = new RecordType(_campaignVertical);
    public static final RecordType cashRefund = new RecordType(_cashRefund);
    public static final RecordType cashSale = new RecordType(_cashSale);
    public static final RecordType check = new RecordType(_check);
    public static final RecordType classification = new RecordType(_classification);
    public static final RecordType contact = new RecordType(_contact);
    public static final RecordType contactCategory = new RecordType(_contactCategory);
    public static final RecordType contactRole = new RecordType(_contactRole);
    public static final RecordType creditMemo = new RecordType(_creditMemo);
    public static final RecordType crmCustomField = new RecordType(_crmCustomField);
    public static final RecordType currency = new RecordType(_currency);
    public static final RecordType customList = new RecordType(_customList);
    public static final RecordType customRecord = new RecordType(_customRecord);
    public static final RecordType customRecordCustomField = new RecordType(_customRecordCustomField);
    public static final RecordType customRecordType = new RecordType(_customRecordType);
    public static final RecordType customer = new RecordType(_customer);
    public static final RecordType customerCategory = new RecordType(_customerCategory);
    public static final RecordType customerDeposit = new RecordType(_customerDeposit);
    public static final RecordType customerPayment = new RecordType(_customerPayment);
    public static final RecordType customerRefund = new RecordType(_customerRefund);
    public static final RecordType customerStatus = new RecordType(_customerStatus);
    public static final RecordType depositApplication = new RecordType(_depositApplication);
    public static final RecordType department = new RecordType(_department);
    public static final RecordType descriptionItem = new RecordType(_descriptionItem);
    public static final RecordType discountItem = new RecordType(_discountItem);
    public static final RecordType downloadItem = new RecordType(_downloadItem);
    public static final RecordType employee = new RecordType(_employee);
    public static final RecordType entityCustomField = new RecordType(_entityCustomField);
    public static final RecordType entityGroup = new RecordType(_entityGroup);
    public static final RecordType estimate = new RecordType(_estimate);
    public static final RecordType expenseCategory = new RecordType(_expenseCategory);
    public static final RecordType expenseReport = new RecordType(_expenseReport);
    public static final RecordType file = new RecordType(_file);
    public static final RecordType folder = new RecordType(_folder);
    public static final RecordType giftCertificate = new RecordType(_giftCertificate);
    public static final RecordType giftCertificateItem = new RecordType(_giftCertificateItem);
    public static final RecordType interCompanyJournalEntry = new RecordType(_interCompanyJournalEntry);
    public static final RecordType interCompanyTransferOrder = new RecordType(_interCompanyTransferOrder);
    public static final RecordType inventoryAdjustment = new RecordType(_inventoryAdjustment);
    public static final RecordType inventoryItem = new RecordType(_inventoryItem);
    public static final RecordType invoice = new RecordType(_invoice);
    public static final RecordType itemCustomField = new RecordType(_itemCustomField);
    public static final RecordType itemFulfillment = new RecordType(_itemFulfillment);
    public static final RecordType itemNumberCustomField = new RecordType(_itemNumberCustomField);
    public static final RecordType itemOptionCustomField = new RecordType(_itemOptionCustomField);
    public static final RecordType issue = new RecordType(_issue);
    public static final RecordType job = new RecordType(_job);
    public static final RecordType jobStatus = new RecordType(_jobStatus);
    public static final RecordType jobType = new RecordType(_jobType);
    public static final RecordType itemReceipt = new RecordType(_itemReceipt);
    public static final RecordType journalEntry = new RecordType(_journalEntry);
    public static final RecordType kitItem = new RecordType(_kitItem);
    public static final RecordType leadSource = new RecordType(_leadSource);
    public static final RecordType location = new RecordType(_location);
    public static final RecordType lotNumberedInventoryItem = new RecordType(_lotNumberedInventoryItem);
    public static final RecordType lotNumberedAssemblyItem = new RecordType(_lotNumberedAssemblyItem);
    public static final RecordType markupItem = new RecordType(_markupItem);
    public static final RecordType message = new RecordType(_message);
    public static final RecordType nonInventoryPurchaseItem = new RecordType(_nonInventoryPurchaseItem);
    public static final RecordType nonInventoryResaleItem = new RecordType(_nonInventoryResaleItem);
    public static final RecordType nonInventorySaleItem = new RecordType(_nonInventorySaleItem);
    public static final RecordType note = new RecordType(_note);
    public static final RecordType noteType = new RecordType(_noteType);
    public static final RecordType opportunity = new RecordType(_opportunity);
    public static final RecordType otherChargePurchaseItem = new RecordType(_otherChargePurchaseItem);
    public static final RecordType otherChargeResaleItem = new RecordType(_otherChargeResaleItem);
    public static final RecordType otherChargeSaleItem = new RecordType(_otherChargeSaleItem);
    public static final RecordType otherCustomField = new RecordType(_otherCustomField);
    public static final RecordType partner = new RecordType(_partner);
    public static final RecordType partnerCategory = new RecordType(_partnerCategory);
    public static final RecordType paymentItem = new RecordType(_paymentItem);
    public static final RecordType paymentMethod = new RecordType(_paymentMethod);
    public static final RecordType phoneCall = new RecordType(_phoneCall);
    public static final RecordType priceLevel = new RecordType(_priceLevel);
    public static final RecordType projectTask = new RecordType(_projectTask);
    public static final RecordType promotionCode = new RecordType(_promotionCode);
    public static final RecordType purchaseOrder = new RecordType(_purchaseOrder);
    public static final RecordType returnAuthorization = new RecordType(_returnAuthorization);
    public static final RecordType salesOrder = new RecordType(_salesOrder);
    public static final RecordType salesRole = new RecordType(_salesRole);
    public static final RecordType salesTaxItem = new RecordType(_salesTaxItem);
    public static final RecordType serializedInventoryItem = new RecordType(_serializedInventoryItem);
    public static final RecordType serializedAssemblyItem = new RecordType(_serializedAssemblyItem);
    public static final RecordType servicePurchaseItem = new RecordType(_servicePurchaseItem);
    public static final RecordType serviceResaleItem = new RecordType(_serviceResaleItem);
    public static final RecordType serviceSaleItem = new RecordType(_serviceSaleItem);
    public static final RecordType solution = new RecordType(_solution);
    public static final RecordType siteCategory = new RecordType(_siteCategory);
    public static final RecordType state = new RecordType(_state);
    public static final RecordType subsidiary = new RecordType(_subsidiary);
    public static final RecordType subtotalItem = new RecordType(_subtotalItem);
    public static final RecordType supportCase = new RecordType(_supportCase);
    public static final RecordType supportCaseIssue = new RecordType(_supportCaseIssue);
    public static final RecordType supportCaseOrigin = new RecordType(_supportCaseOrigin);
    public static final RecordType supportCasePriority = new RecordType(_supportCasePriority);
    public static final RecordType supportCaseStatus = new RecordType(_supportCaseStatus);
    public static final RecordType supportCaseType = new RecordType(_supportCaseType);
    public static final RecordType task = new RecordType(_task);
    public static final RecordType taxGroup = new RecordType(_taxGroup);
    public static final RecordType taxType = new RecordType(_taxType);
    public static final RecordType term = new RecordType(_term);
    public static final RecordType timeBill = new RecordType(_timeBill);
    public static final RecordType topic = new RecordType(_topic);
    public static final RecordType transferOrder = new RecordType(_transferOrder);
    public static final RecordType transactionBodyCustomField = new RecordType(_transactionBodyCustomField);
    public static final RecordType transactionColumnCustomField = new RecordType(_transactionColumnCustomField);
    public static final RecordType unitsType = new RecordType(_unitsType);
    public static final RecordType vendor = new RecordType(_vendor);
    public static final RecordType vendorCategory = new RecordType(_vendorCategory);
    public static final RecordType vendorBill = new RecordType(_vendorBill);
    public static final RecordType vendorPayment = new RecordType(_vendorPayment);
    public static final RecordType winLossReason = new RecordType(_winLossReason);
    public java.lang.String getValue() { return _value_;}
    public static RecordType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RecordType enumeration = (RecordType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RecordType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "RecordType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
