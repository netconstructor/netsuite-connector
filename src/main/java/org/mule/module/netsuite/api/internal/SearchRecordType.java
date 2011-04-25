/**
 * SearchRecordType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchRecordType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchRecordType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _account = "account";
    public static final java.lang.String _accountingPeriod = "accountingPeriod";
    public static final java.lang.String _bin = "bin";
    public static final java.lang.String _budget = "budget";
    public static final java.lang.String _calendarEvent = "calendarEvent";
    public static final java.lang.String _campaign = "campaign";
    public static final java.lang.String _classification = "classification";
    public static final java.lang.String _contact = "contact";
    public static final java.lang.String _customer = "customer";
    public static final java.lang.String _customRecord = "customRecord";
    public static final java.lang.String _department = "department";
    public static final java.lang.String _employee = "employee";
    public static final java.lang.String _entityGroup = "entityGroup";
    public static final java.lang.String _file = "file";
    public static final java.lang.String _folder = "folder";
    public static final java.lang.String _giftCertificate = "giftCertificate";
    public static final java.lang.String _groupMember = "groupMember";
    public static final java.lang.String _item = "item";
    public static final java.lang.String _issue = "issue";
    public static final java.lang.String _job = "job";
    public static final java.lang.String _location = "location";
    public static final java.lang.String _message = "message";
    public static final java.lang.String _note = "note";
    public static final java.lang.String _opportunity = "opportunity";
    public static final java.lang.String _partner = "partner";
    public static final java.lang.String _phoneCall = "phoneCall";
    public static final java.lang.String _priceLevel = "priceLevel";
    public static final java.lang.String _projectTask = "projectTask";
    public static final java.lang.String _promotionCode = "promotionCode";
    public static final java.lang.String _salesRole = "salesRole";
    public static final java.lang.String _solution = "solution";
    public static final java.lang.String _siteCategory = "siteCategory";
    public static final java.lang.String _subsidiary = "subsidiary";
    public static final java.lang.String _supportCase = "supportCase";
    public static final java.lang.String _task = "task";
    public static final java.lang.String _timeBill = "timeBill";
    public static final java.lang.String _topic = "topic";
    public static final java.lang.String _transaction = "transaction";
    public static final java.lang.String _vendor = "vendor";
    public static final SearchRecordType account = new SearchRecordType(_account);
    public static final SearchRecordType accountingPeriod = new SearchRecordType(_accountingPeriod);
    public static final SearchRecordType bin = new SearchRecordType(_bin);
    public static final SearchRecordType budget = new SearchRecordType(_budget);
    public static final SearchRecordType calendarEvent = new SearchRecordType(_calendarEvent);
    public static final SearchRecordType campaign = new SearchRecordType(_campaign);
    public static final SearchRecordType classification = new SearchRecordType(_classification);
    public static final SearchRecordType contact = new SearchRecordType(_contact);
    public static final SearchRecordType customer = new SearchRecordType(_customer);
    public static final SearchRecordType customRecord = new SearchRecordType(_customRecord);
    public static final SearchRecordType department = new SearchRecordType(_department);
    public static final SearchRecordType employee = new SearchRecordType(_employee);
    public static final SearchRecordType entityGroup = new SearchRecordType(_entityGroup);
    public static final SearchRecordType file = new SearchRecordType(_file);
    public static final SearchRecordType folder = new SearchRecordType(_folder);
    public static final SearchRecordType giftCertificate = new SearchRecordType(_giftCertificate);
    public static final SearchRecordType groupMember = new SearchRecordType(_groupMember);
    public static final SearchRecordType item = new SearchRecordType(_item);
    public static final SearchRecordType issue = new SearchRecordType(_issue);
    public static final SearchRecordType job = new SearchRecordType(_job);
    public static final SearchRecordType location = new SearchRecordType(_location);
    public static final SearchRecordType message = new SearchRecordType(_message);
    public static final SearchRecordType note = new SearchRecordType(_note);
    public static final SearchRecordType opportunity = new SearchRecordType(_opportunity);
    public static final SearchRecordType partner = new SearchRecordType(_partner);
    public static final SearchRecordType phoneCall = new SearchRecordType(_phoneCall);
    public static final SearchRecordType priceLevel = new SearchRecordType(_priceLevel);
    public static final SearchRecordType projectTask = new SearchRecordType(_projectTask);
    public static final SearchRecordType promotionCode = new SearchRecordType(_promotionCode);
    public static final SearchRecordType salesRole = new SearchRecordType(_salesRole);
    public static final SearchRecordType solution = new SearchRecordType(_solution);
    public static final SearchRecordType siteCategory = new SearchRecordType(_siteCategory);
    public static final SearchRecordType subsidiary = new SearchRecordType(_subsidiary);
    public static final SearchRecordType supportCase = new SearchRecordType(_supportCase);
    public static final SearchRecordType task = new SearchRecordType(_task);
    public static final SearchRecordType timeBill = new SearchRecordType(_timeBill);
    public static final SearchRecordType topic = new SearchRecordType(_topic);
    public static final SearchRecordType transaction = new SearchRecordType(_transaction);
    public static final SearchRecordType vendor = new SearchRecordType(_vendor);
    public java.lang.String getValue() { return _value_;}
    public static SearchRecordType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchRecordType enumeration = (SearchRecordType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchRecordType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchRecordType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchRecordType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
