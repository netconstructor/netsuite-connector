Mule NetSuite Cloud Connector
=============================

Mule Cloud connector to NetSuite

Installation
------------

The connector can either be installed for all applications running within the Mule instance or can be setup to be used
for a single application.

*All Applications*

Download the connector from the link above and place the resulting jar file in
/lib/user directory of the Mule installation folder.

*Single Application*

To make the connector available only to single application then place it in the
lib directory of the application otherwise if using Maven to compile and deploy
your application the following can be done:

Add the connector's maven repo to your pom.xml:

    <repositories>
        <repository>
            <id>muleforge-releases</id>
            <name>MuleForge Snapshot Repository</name>
            <url>https://repository.muleforge.org/release/</url>
            <layout>default</layout>
        </repsitory>
    </repositories>

Add the connector as a dependency to your project. This can be done by adding
the following under the dependencies element in the pom.xml file of the
application:

    <dependency>
        <groupId>org.mule.modules</groupId>
        <artifactId>mule-module-netsuite</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

Configuration
-------------

You can configure the connector as follows:

    <netsuite:config client="value" roleId="value" email="value" password="value" account="value"/>

Here is detailed list of all the configuration attributes:

| attribute | description | optional | default value |
|:-----------|:-----------|:---------|:--------------|
|name|Give a name to this configuration so it can be later referenced by config-ref.|yes||
|client||yes|
|roleId|The id of the role used to login in SuiteTalk, which determines the operation privileges|no|
|email|The login email of both NetSuite UI and SuiteTalk|no|
|password|The login password of both the NetSuite UI and SuiteTalk|no|
|account|SuiteTalk -NetSuite WebService - account id. It looks like TSTDRVXXXXXX|no|


Attach Record
-------------

Attaches a source record - that is, the attachment - to another destination one, 
optionally specifying a contact for the
attachment. Not all record type are supported as source, destination or
contact. Please consult NetSuite documentation.
Example:



     <netsuite:attach-record  sourceRecordType="FILE" sourceId="16" destinationRecordType="EMPLOYEE" destinationId="96"  />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|sourceRecordType|the type of the target record to be attached|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|sourceId|the id of the target record to be attached|no||
|sourceIdType|the id type of the record to be attached|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|destinationRecordType|the type of the record to be attached to|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|destinationId|the id of the record to be attached to|no||
|destinationIdType|the id type of the record to be attached to|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|contanctRecordType|the record type of the optional contact record|yes||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|contanctId|the id of the optional contact record|yes||
|contanctIdType|the id type of the optional contact record|yes|INTERNAL|*INTERNAL*, *EXTERNAL*



Delete Record
-------------

Deletes a record. Not all records can be deleted. Please consult NetSuite documentation

Example:



     <netsuite:delete-record recordType="CONTACT" id="986" idType="EXTERNAL"/> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the type of the record to delete|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|id|the id of the record to delete|no||
|idType|the type of id of the record to delete|yes|INTERNAL|*INTERNAL*, *EXTERNAL*



Detach Record
-------------

Detaches a source record - that is, the attachment - from a destination record.
Example:



     <netsuite:detach-record sourceRecordType="FILE" sourceId="16" destinationRecordType="EMPLOYEE" destinationId="96" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|sourceRecordType|the type of the target record to be detached|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|sourceId|the id of the target record to be detached|no||
|sourceIdType|the id type of the record to be detached|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|destinationRecordType|the type of the record to be detached to|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|destinationId|the id of the record to be detached to|no||
|destinationIdType|the id type of the record to be detached to|yes|INTERNAL|*INTERNAL*, *EXTERNAL*



Get Budget Exchange Rates
-------------------------

Answers the list of budget exchange rates
Example:



     <netsuite:get-budget-exchange-rate periodId="986" fromSubsidiaryId="62" fromSubsidiaryIdType="EXTERNAL"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|periodId|the id of the period|no||
|periodIdType|the period id type|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|fromSubsidiaryId|the id of the staring  subsidiary|no||
|fromSubsidiaryIdType|the starting subsidiary id type|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|toSubsidiaryId|the  the id of the optional ending subsidiary|yes||
|toSubsidiaryIdType|the id type of the optional ending subsidiary|yes|INTERNAL|*INTERNAL*, *EXTERNAL*

Returns list of BudgetExchangeRate's



Get Consolidated Exchange Rates
-------------------------------

Answers the list of consolidated exchange rates
Example:



    
    <netsuite:get-consolidated-exchange-rate
          periodId="106" 
          periodIdType="EXTERNAL" 
          fromSubsidiaryId="5689"
          toSubsidiaryId="4898" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|periodId|the id of the period|no||
|periodIdType|the period id type|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|fromSubsidiaryId|the id of the staring  subsidiary|no||
|fromSubsidiaryIdType|the starting subsidiary id type|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|toSubsidiaryId|the  the id of the optional ending subsidiary|yes||
|toSubsidiaryIdType|the id type of the optional ending subsidiary|yes|INTERNAL|*INTERNAL*, *EXTERNAL*

Returns list of ConsolidatedExchangeRate's



Get Customization Ids
---------------------

Answers the ids of available customizations for a given record type.

 Example: 

     <netsuite:get-customization-ids type="ACCOUNT"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|type|the target record type|no||*CRM_CUSTOM_FIELD*, *CUSTOM_LIST*, *CUSTOM_RECORD_TYPE*, *ENTITY_CUSTOM_FIELD*, *ITEM_CUSTOM_FIELD*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *OTHER_CUSTOM_FIELD*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*
|includeInactives|if inactive customizations should also be returned|yes|false|

Returns list of CustomizationRef's



Get Deleted Records
-------------------

Answers a list of deleted records of a given record type that match a given date expression.
This operations accepts two different date expression passing styles: string oriented, 
and object oriented. If whenExpression is specified, it is parsed and used as date expression. 
Otherwise, a date expression is build from date1, date2 and operator parameters. 

The first style is more appropriate when the date expression can be harcdoded, while the second style 
is better when client code already has date objects. However, predefined search values like 
thisWeek, tomorrow or today can only be used with the first, string oriented, style.

String oriented date expressions are in the form operation( searchValue, arguments...), where operation is any of the NetSuite 
supported date operations, arguments are one or two operands for the given operator, and
searchValue is some of the supported predefined search value as defined by NetSuite or any 
of the following expressions:
isoDate( anIsoDate ), isoDateRante( anIsoDate, anotherIsoDate ) , 
dateTime( aQuotedDateTime, aQuoatedJavaDateFormat ), 
dateTimeRange( aQuotedDateTime, anotherQuotedDateTime, aQuoatedJavaDateFormat ).       
Supported predefined search values are: today, thisWeek, thisBusinessWeek, thisMonth,thisYear, yesterday, 
twoDaysAgo, lastWeek, lastMonth, threeMonthAgo,tomorrow, nextMonth , nextWeek    

Examples using both string and object oriented styles:



     
           <netsuite:get-deleted-record type="CUSTOMER_PAYMENT" whenExpression="within(thisWeek)"/>
           <netsuite:get-deleted-record type="BIN" whenExpression="after(yesterday)"/>
           <netsuite:get-deleted-record type="EMPLOYEE" whenExpression="on(today)"/>
           <netsuite:get-deleted-record type="CUSTOMER" whenExpression="before(isoDate(2005-11-14))"/>
           <netsuite:get-deleted-record type="CUSTOMER" date1="#[payload]" operator="BEFORE"/>
           <netsuite:get-deleted-record type="TASK" whenExpression="notWithin(dateTimeRange('15:14:10', '19:14:10', 'HH:mm:ss'))" />
           <netsuite:get-deleted-record type="TASK" date1="#[map-payload:date1]" date2="#[map-payload:date2]" operator="WITHIN" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|type|the type of the target deleted record to retrieve|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|whenExpression|a predicate-style date filtering expression|yes||
|date1||yes||
|date2||yes||
|operator||yes||*AFTER*, *BEFORE*, *EMPTY*, *NOT_AFTER*, *NOT_BEFORE*, *NOT_EMPTY*, *NOT_ON*, *NOT_ON_OR_AFTER*, *NOT_ON_OR_BEFORE*, *NOT_WITHIN*, *ON*, *ON_OR_AFTER*, *ON_OR_BEFORE*, *WITHIN*

Returns list of DeletedRecord's that match the given date filtering expression



Get Records
-----------

Answers all the record of a given type
Example:



     <netsuite:get-records type="ENTITY_CUSTOM_FIELD"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|type|the target record type|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*

Returns list of Record's



Get Record
----------

Answers a record given its id
Example:


     <netsuite:get-record recordType="CREDIT_MEMO" id="982"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the target record type|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|id|the target record id|no||
|idType|the id type of the given record id|yes|INTERNAL|*INTERNAL*, *EXTERNAL*

Returns Record



Get Item Availabilities
-----------------------

Answers the availability for a given record reference.
If the Multi-Location Inventory feature is enabled, this operation returns results for all locations. 
For locations that do not have any items available, only location IDs and names are listed in results. 
Example:



     <netsuite:get-item-availability recordType="ACCOUNT" id="#[map-payload:recordId]"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the target record type|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|id|the target record id|no||
|idType|the id type of the given record id|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|ifModifiedSince|an optional modified since date. If set, only items with quantity available changes recorded as of the specified date are returned.|yes||

Returns list of ItemAvailability's



Get Saved Search
----------------

Retrieves a list of existing saved searches for the given record type.
Example:



     <netsuite:get-saved-search type="ACCOUNT"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|type|the target record type|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*

Returns list of RecordRedf's



Get Server Time
---------------

Answers the server time, resulting in more accurate and reliable sync'ing of data than using
using local client time. Example:



     <netsuite:get-server-time />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||

Returns server time, as a Date



Update Invitee Status
---------------------

Sets a new invitation status for a given event. Example:
Example:



     <netsuite:update-invitee-status eventId="#[map-payload:eventId]" status="TENTATIVE"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|eventId|the target event id|no||
|eventIdType|the id type of the given eventId|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|status|the new status to set|no||*ACCEPTED*, *DECLINED*, *NO_RESPONSE*, *TENTATIVE*



Add Record
----------

Creates a new record. Example:



     
     <netsuite:add-record recordType="EMPLOYEE">
          <netsuite:attributes>
              <netsuite:attribute key="firstName" value="#[variable:firstName]" />
              <netsuite:attribute key="lastName" value="#[variable:lastName]" />
              <netsuite:attribute key="email" value="#[variable:email]" />
          </netsuite:attributes>
      </netsuite:add-record>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the type of record to add|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|attributes|the record attributes, as a string-object map|no||

Returns RecordRef of the new record



Add File
--------

Creates a new file record. This operation is similar to addRecord, but is
customized for simplifying local content passing.



     <netsuite:add-file  content="#[payload]" fileName="#[header:filename]" folderId="#[header:folderId]"  />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|attributes|the additional file attributes|yes||
|content|the content of the file record to add. It can be of type String, byte array, File or InputStream. If it is an input stream, this operations also closes it.|no||
|fileName|the name of the remote file|no||
|folderId|the id of the folder record where to add this file|no||
|folderIdType|the id type of the folder record|yes|INTERNAL|*INTERNAL*, *EXTERNAL*

Returns RecordRef of the new record



Update Record
-------------

Updates an existing record.
Example:



     
     <netsuite:update-record recordType="EMPLOYEE" id="#[map-payload:recordId]">
          <netsuite:attributes>
              <netsuite:attribute key="mobilePhone" value="#[map-payload:mobilePhone]" />
              <netsuite:attribute key="homePhone" value="#[map-payload:homePhone]" />
          </netsuite:attributes>
      </netsuite:update-record>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the target record type to update|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|id|the target record id|no||
|idType|the id type of the given record id|yes|INTERNAL|*INTERNAL*, *EXTERNAL*
|attributes|the record attributes, as a string-object map|no||



Check Async Status
------------------

Answers the status of an asynchronous Web services submission. When a jobId is
submitted, the status, percent complete, and estimated remaining duration are
returned.

Example:



     <netsuite:get-budget-exchange-rate periodId="986" fromSubsidiaryId="62" fromSubsidiaryIdType="EXTERNAL"/>

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|jobId||no||

Returns AsyncStatusResult for the given job



Find Records
------------

Answers all records that match the given filtering expression.
If no expression is specified, the empty expression is used, 
which retrieves all records of the given type. 

Filtering expressions support both basic and joined syntax, that is, using in the filters
attributes of both the target entity and the target entity associations. Advanced search is not supported.

Search expressions are  in the form operator(attribute, arguments...) for basic search, 
and operator(join.attribute, arguments...) for joined search, where operator is 
any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported -
plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. 


 
Examples:

 <netsuite:find-records recordType="BIN"" expression="isTrue(user.isInactive)" />

     
     <netsuite:find-records recordType="BIN" />
     <netsuite:find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]')" />
     <netsuite:find-records recordType="EMPLOYEE" expression='is(email, "#[map-payload:email]")' />
     <netsuite:find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]'), contains(address, '#[map-payload:address]')" />
     <netsuite:find-records recordType="EMPLOYEE" expression="empty(title), isNot(file.url, '#[map-payload:fileUrl]')" /> 
     <netsuite:find-records recordType="EMPLOYEE" expression="anyOf(globalSubscriptionStatus, [_confirmedOptOut, _softOptIn])" /> 
     <netsuite:find-records recordType="EMPLOYEE" expression="greaterThanOrEqualTo(file.documentSize, #[map-payload:documentSize])" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the type of record to search|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *BIN*, *BUDGET*, *CALENDAR_EVENT*, *CAMPAIGN*, *CLASSIFICATION*, *CONTACT*, *CUSTOMER*, *CUSTOM_RECORD*, *DEPARTMENT*, *EMPLOYEE*, *ENTITY_GROUP*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GROUP_MEMBER*, *ITEM*, *ISSUE*, *JOB*, *LOCATION*, *MESSAGE*, *NOTE*, *OPPORTUNITY*, *PARTNER*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *SALES_ROLE*, *SOLUTION*, *SITE_CATEGORY*, *SUBSIDIARY*, *SUPPORT_CASE*, *TASK*, *TIME_BILL*, *TOPIC*, *TRANSACTION*, *VENDOR*, *searchClass*, *advancedSearchClass*
|expression|the filtering expression Multiple filters can be combined using multiple predicates separated by commas.|yes||

Returns list of Record's



Find First Record
-----------------

Answers the first records that match the given filtering expression. 
If no expression is specified, the empty expression is used, 
which retrieves all records of the given type.  
Throws a NoSuchElementException if no record can be retrieved.

Filtering expressions support both basic and joined syntax, that is, using in the filters
attributes of both the target entity and the target entity associations. Advanced search is not supported.

Search expressions are  in the form operator(attribute, arguments...) for basic search, 
and operator(join.attribute, arguments...) for joined search, where operator is 
any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported -
plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. 

Examples:


     
     <netsuite:find-first-record recordType="BIN")" />
     <netsuite:find-first-record recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]')" />
     <netsuite:find-first-record recordType="EMPLOYEE" expression='is(email, "#[map-payload:email]")' />
     <netsuite:find-first-record recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]'), contains(address, '#[map-payload:address]')" />
     <netsuite:find-first-record recordType="EMPLOYEE" expression="empty(title), isNot(file.url, '#[map-payload:fileUrl]')" /> 
     <netsuite:find-first-record recordType="BIN"" expression="isTrue(user.isInactive)" />
     <netsuite:find-first-record recordType="EMPLOYEE" expression="anyOf(globalSubscriptionStatus, [_confirmedOptOut, _softOptIn])" />
     <netsuite:find-first-record recordType="EMPLOYEE" expression="greaterThanOrEqualTo(file.documentSize, #[map-payload:documentSize])" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the type of record to search|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *BIN*, *BUDGET*, *CALENDAR_EVENT*, *CAMPAIGN*, *CLASSIFICATION*, *CONTACT*, *CUSTOMER*, *CUSTOM_RECORD*, *DEPARTMENT*, *EMPLOYEE*, *ENTITY_GROUP*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GROUP_MEMBER*, *ITEM*, *ISSUE*, *JOB*, *LOCATION*, *MESSAGE*, *NOTE*, *OPPORTUNITY*, *PARTNER*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *SALES_ROLE*, *SOLUTION*, *SITE_CATEGORY*, *SUBSIDIARY*, *SUPPORT_CASE*, *TASK*, *TIME_BILL*, *TOPIC*, *TRANSACTION*, *VENDOR*, *searchClass*, *advancedSearchClass*
|expression|the filtering expression Multiple filters can be combined using multiple predicates separated by commas.|yes||

Returns first record that match the given filtering expression



Saved Find Records
------------------

Answers all records of a given type for a saved search, given its search id.

Examples:


      <netsuite:find-saved-records recordType="BIN" searchId="#[header:searchId]" /> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the type of record to search|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *BIN*, *BUDGET*, *CALENDAR_EVENT*, *CAMPAIGN*, *CLASSIFICATION*, *CONTACT*, *CUSTOMER*, *CUSTOM_RECORD*, *DEPARTMENT*, *EMPLOYEE*, *ENTITY_GROUP*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GROUP_MEMBER*, *ITEM*, *ISSUE*, *JOB*, *LOCATION*, *MESSAGE*, *NOTE*, *OPPORTUNITY*, *PARTNER*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *SALES_ROLE*, *SOLUTION*, *SITE_CATEGORY*, *SUBSIDIARY*, *SUPPORT_CASE*, *TASK*, *TIME_BILL*, *TOPIC*, *TRANSACTION*, *VENDOR*, *searchClass*, *advancedSearchClass*
|searchId|the id of the save search|no||

Returns list of Record's



Async Find Records
------------------

Searches for all records that match the given filtering expression, asynchronously.
If no expression is specified, all records of the given type are retrieved  

Filtering expressions support both basic and joined syntax, that is, using in the filters
attributes of both the target entity and the target entity associations. Advanced search is not supported.

Search expressions are  in the form operator(attribute, arguments...) for basic search, 
and operator(join.attribute, arguments...) for joined search, where operator is 
any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported -
plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. 

Examples:


     
     <netsuite:async-find-records recordType="BIN" />
     <netsuite:async-find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]')" />
     <netsuite:async-find-first-record recordType="EMPLOYEE" expression='is(email, "#[map-payload:email]")' />
     <netsuite:async-find-records recordType="EMPLOYEE" expression="is(email, '#[map-payload:email]'), contains(address, '#[map-payload:address]')" />
     <netsuite:async-find-records recordType="EMPLOYEE" expression="empty(title), isNot(file.url, '#[map-payload:fileUrl]')" /> 
     <netsuite:async-find-records recordType="BIN"" expression="isTrue(user.isInactive)" />
     <netsuite:async-find-records recordType="EMPLOYEE" expression="anyOf(globalSubscriptionStatus, [_confirmedOptOut, _softOptIn])" />
     <netsuite:async-find-records recordType="EMPLOYEE" expression="greaterThanOrEqualTo(file.documentSize, #[map-payload:documentSize])" />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|recordType|the type of record to search|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *BIN*, *BUDGET*, *CALENDAR_EVENT*, *CAMPAIGN*, *CLASSIFICATION*, *CONTACT*, *CUSTOMER*, *CUSTOM_RECORD*, *DEPARTMENT*, *EMPLOYEE*, *ENTITY_GROUP*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GROUP_MEMBER*, *ITEM*, *ISSUE*, *JOB*, *LOCATION*, *MESSAGE*, *NOTE*, *OPPORTUNITY*, *PARTNER*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *SALES_ROLE*, *SOLUTION*, *SITE_CATEGORY*, *SUBSIDIARY*, *SUPPORT_CASE*, *TASK*, *TIME_BILL*, *TOPIC*, *TRANSACTION*, *VENDOR*, *searchClass*, *advancedSearchClass*
|expression|the filtering expression, in the form operator(attribute, arguments...) for basic search, and operator(join.attribute, arguments...) for joined search, where operator is any of the string, long, double, and text operators supported by SuiteTalk - MultiSelect operators are not supported - plus the isTrue/isFalse boolean operators, and arguments are zero up to three operands that depend on the operator used. Multiple filters can be combined using multiple predicates separated by commas.|yes||

Returns AsyncStatusResult of the query



Get Async Find Result
---------------------

Answers the results of an asynchronous web services submission. This operation
can be executed operation up to 20 times within a 30 day time period to
retrieve the results of an asynchronous job.
Example:


     <netsuite:get-async-find-result jobId="#[map-payload:jobId]"  />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|jobId|the id of the job|no||

Returns Record's list



Get Async Find First Result
---------------------------

Answers the the first result of an asynchronous asyncFind.
Throws a NoSuchElement exception if there are no results.
This operation can be executed operation up to 20 times within a 30 day time period to
retrieve the results of an asynchronous job.

Example:


     <netsuite:get-async-find-first-result jobId="#[map-payload:jobId]"  />

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|jobId|the id of the job|no||

Returns first Record



Initialize
----------

Populates fields on transaction line items with values from a related record,
in a similar way empty text boxes are prepopulated within the Netsuite UI
Example:



     <netsuite:initialize type="INVOICE" id="#[map-payload:recordId]" recordType="SALES_ORDER" /> 

| attribute | description | optional | default value | possible values |
|:-----------|:-----------|:---------|:--------------|:----------------|
|config-ref|Specify which configuration to use for this invocation|yes||
|type|the type of record whose defaults values are used to populate the target record|no||*ASSEMBLY_UNBUILD*, *CASH_REFUND*, *CASH_SALE*, *CREDIT_MEMO*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *DEPOSIT_APPLICATION*, *ESTIMATE*, *INVOICE*, *ITEM_FULFILLMENT*, *ITEM_RECEIPT*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *VENDOR_BILL*, *VENDOR_PAYMENT*
|recordType|the target record type|no||*ACCOUNT*, *ACCOUNTING_PERIOD*, *ASSEMBLY_BUILD*, *ASSEMBLY_UNBUILD*, *ASSEMBLY_ITEM*, *BIN*, *BUDGET*, *BUDGET_CATEGORY*, *CALENDAR_EVENT*, *CAMPAIGN*, *CAMPAIGN_AUDIENCE*, *CAMPAIGN_CATEGORY*, *CAMPAIGN_CHANNEL*, *CAMPAIGN_FAMILY*, *CAMPAIGN_OFFER*, *CAMPAIGN_RESPONSE*, *CAMPAIGN_SEARCH_ENGINE*, *CAMPAIGN_SUBSCRIPTION*, *CAMPAIGN_VERTICAL*, *CASH_REFUND*, *CASH_SALE*, *CHECK*, *CLASSIFICATION*, *CONTACT*, *CONTACT_CATEGORY*, *CONTACT_ROLE*, *CREDIT_MEMO*, *CRM_CUSTOM_FIELD*, *CURRENCY*, *CUSTOM_LIST*, *CUSTOM_RECORD*, *CUSTOM_RECORD_CUSTOM_FIELD*, *CUSTOM_RECORD_TYPE*, *CUSTOMER*, *CUSTOMER_CATEGORY*, *CUSTOMER_DEPOSIT*, *CUSTOMER_PAYMENT*, *CUSTOMER_REFUND*, *CUSTOMER_STATUS*, *DEPOSIT_APPLICATION*, *DEPARTMENT*, *DESCRIPTION_ITEM*, *DISCOUNT_ITEM*, *DOWNLOAD_ITEM*, *EMPLOYEE*, *ENTITY_CUSTOM_FIELD*, *ENTITY_GROUP*, *ESTIMATE*, *EXPENSE_CATEGORY*, *EXPENSE_REPORT*, *FILE*, *FOLDER*, *GIFT_CERTIFICATE*, *GIFT_CERTIFICATE_ITEM*, *INTER_COMPANY_JOURNAL_ENTRY*, *INTER_COMPANY_TRANSFER_ORDER*, *INVENTORY_ADJUSTMENT*, *INVENTORY_ITEM*, *INVOICE*, *ITEM_CUSTOM_FIELD*, *ITEM_FULFILLMENT*, *ITEM_NUMBER_CUSTOM_FIELD*, *ITEM_OPTION_CUSTOM_FIELD*, *ISSUE*, *JOB*, *JOB_STATUS*, *JOB_TYPE*, *ITEM_RECEIPT*, *JOURNAL_ENTRY*, *KIT_ITEM*, *LEAD_SOURCE*, *LOCATION*, *LOT_NUMBERED_INVENTORY_ITEM*, *LOT_NUMBERED_ASSEMBLY_ITEM*, *MARKUP_ITEM*, *MESSAGE*, *NON_INVENTORY_PURCHASE_ITEM*, *NON_INVENTORY_RESALE_ITEM*, *NON_INVENTORY_SALE_ITEM*, *NOTE*, *NOTE_TYPE*, *OPPORTUNITY*, *OTHER_CHARGE_PURCHASE_ITEM*, *OTHER_CHARGE_RESALE_ITEM*, *OTHER_CHARGE_SALE_ITEM*, *OTHER_CUSTOM_FIELD*, *PARTNER*, *PARTNER_CATEGORY*, *PAYMENT_ITEM*, *PAYMENT_METHOD*, *PHONE_CALL*, *PRICE_LEVEL*, *PROJECT_TASK*, *PROMOTION_CODE*, *PURCHASE_ORDER*, *RETURN_AUTHORIZATION*, *SALES_ORDER*, *SALES_ROLE*, *SALES_TAX_ITEM*, *SERIALIZED_INVENTORY_ITEM*, *SERIALIZED_ASSEMBLY_ITEM*, *SERVICE_PURCHASE_ITEM*, *SERVICE_RESALE_ITEM*, *SERVICE_SALE_ITEM*, *SOLUTION*, *SITE_CATEGORY*, *STATE*, *SUBSIDIARY*, *SUBTOTAL_ITEM*, *SUPPORT_CASE*, *SUPPORT_CASE_ISSUE*, *SUPPORT_CASE_ORIGIN*, *SUPPORT_CASE_PRIORITY*, *SUPPORT_CASE_STATUS*, *SUPPORT_CASE_TYPE*, *TASK*, *TAX_GROUP*, *TAX_TYPE*, *TERM*, *TIME_BILL*, *TOPIC*, *TRANSFER_ORDER*, *TRANSACTION_BODY_CUSTOM_FIELD*, *TRANSACTION_COLUMN_CUSTOM_FIELD*, *UNITS_TYPE*, *VENDOR*, *VENDOR_CATEGORY*, *VENDOR_BILL*, *VENDOR_PAYMENT*, *WIN_LOSS_REASON*, *recordClass*
|id|the target record id|no||
|idType|the id type of the given record id|yes|INTERNAL|*INTERNAL*, *EXTERNAL*

Returns initialized Record

















































