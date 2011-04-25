/**
 * GetAllRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class GetAllRecordType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GetAllRecordType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _budgetCategory = "budgetCategory";
    public static final java.lang.String _campaignAudience = "campaignAudience";
    public static final java.lang.String _campaignCategory = "campaignCategory";
    public static final java.lang.String _campaignChannel = "campaignChannel";
    public static final java.lang.String _campaignFamily = "campaignFamily";
    public static final java.lang.String _campaignOffer = "campaignOffer";
    public static final java.lang.String _campaignSearchEngine = "campaignSearchEngine";
    public static final java.lang.String _campaignSubscription = "campaignSubscription";
    public static final java.lang.String _campaignVertical = "campaignVertical";
    public static final java.lang.String _currency = "currency";
    public static final java.lang.String _leadSource = "leadSource";
    public static final java.lang.String _salesTaxItem = "salesTaxItem";
    public static final java.lang.String _state = "state";
    public static final java.lang.String _supportCaseIssue = "supportCaseIssue";
    public static final java.lang.String _supportCaseOrigin = "supportCaseOrigin";
    public static final java.lang.String _supportCasePriority = "supportCasePriority";
    public static final java.lang.String _supportCaseStatus = "supportCaseStatus";
    public static final java.lang.String _supportCaseType = "supportCaseType";
    public static final java.lang.String _taxGroup = "taxGroup";
    public static final java.lang.String _taxType = "taxType";
    public static final GetAllRecordType budgetCategory = new GetAllRecordType(_budgetCategory);
    public static final GetAllRecordType campaignAudience = new GetAllRecordType(_campaignAudience);
    public static final GetAllRecordType campaignCategory = new GetAllRecordType(_campaignCategory);
    public static final GetAllRecordType campaignChannel = new GetAllRecordType(_campaignChannel);
    public static final GetAllRecordType campaignFamily = new GetAllRecordType(_campaignFamily);
    public static final GetAllRecordType campaignOffer = new GetAllRecordType(_campaignOffer);
    public static final GetAllRecordType campaignSearchEngine = new GetAllRecordType(_campaignSearchEngine);
    public static final GetAllRecordType campaignSubscription = new GetAllRecordType(_campaignSubscription);
    public static final GetAllRecordType campaignVertical = new GetAllRecordType(_campaignVertical);
    public static final GetAllRecordType currency = new GetAllRecordType(_currency);
    public static final GetAllRecordType leadSource = new GetAllRecordType(_leadSource);
    public static final GetAllRecordType salesTaxItem = new GetAllRecordType(_salesTaxItem);
    public static final GetAllRecordType state = new GetAllRecordType(_state);
    public static final GetAllRecordType supportCaseIssue = new GetAllRecordType(_supportCaseIssue);
    public static final GetAllRecordType supportCaseOrigin = new GetAllRecordType(_supportCaseOrigin);
    public static final GetAllRecordType supportCasePriority = new GetAllRecordType(_supportCasePriority);
    public static final GetAllRecordType supportCaseStatus = new GetAllRecordType(_supportCaseStatus);
    public static final GetAllRecordType supportCaseType = new GetAllRecordType(_supportCaseType);
    public static final GetAllRecordType taxGroup = new GetAllRecordType(_taxGroup);
    public static final GetAllRecordType taxType = new GetAllRecordType(_taxType);
    public java.lang.String getValue() { return _value_;}
    public static GetAllRecordType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GetAllRecordType enumeration = (GetAllRecordType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GetAllRecordType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GetAllRecordType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "GetAllRecordType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
