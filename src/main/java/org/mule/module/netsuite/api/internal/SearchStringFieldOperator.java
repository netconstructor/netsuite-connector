/**
 * SearchStringFieldOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchStringFieldOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchStringFieldOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _contains = "contains";
    public static final java.lang.String _doesNotContain = "doesNotContain";
    public static final java.lang.String _doesNotStartWith = "doesNotStartWith";
    public static final java.lang.String _empty = "empty";
    public static final java.lang.String _hasKeywords = "hasKeywords";
    public static final java.lang.String _is = "is";
    public static final java.lang.String _isNot = "isNot";
    public static final java.lang.String _notEmpty = "notEmpty";
    public static final java.lang.String _startsWith = "startsWith";
    public static final SearchStringFieldOperator contains = new SearchStringFieldOperator(_contains);
    public static final SearchStringFieldOperator doesNotContain = new SearchStringFieldOperator(_doesNotContain);
    public static final SearchStringFieldOperator doesNotStartWith = new SearchStringFieldOperator(_doesNotStartWith);
    public static final SearchStringFieldOperator empty = new SearchStringFieldOperator(_empty);
    public static final SearchStringFieldOperator hasKeywords = new SearchStringFieldOperator(_hasKeywords);
    public static final SearchStringFieldOperator is = new SearchStringFieldOperator(_is);
    public static final SearchStringFieldOperator isNot = new SearchStringFieldOperator(_isNot);
    public static final SearchStringFieldOperator notEmpty = new SearchStringFieldOperator(_notEmpty);
    public static final SearchStringFieldOperator startsWith = new SearchStringFieldOperator(_startsWith);
    public java.lang.String getValue() { return _value_;}
    public static SearchStringFieldOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchStringFieldOperator enumeration = (SearchStringFieldOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchStringFieldOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchStringFieldOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchStringFieldOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
