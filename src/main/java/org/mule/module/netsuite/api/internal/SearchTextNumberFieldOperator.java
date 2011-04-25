/**
 * SearchTextNumberFieldOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchTextNumberFieldOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchTextNumberFieldOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _between = "between";
    public static final java.lang.String _empty = "empty";
    public static final java.lang.String _equalTo = "equalTo";
    public static final java.lang.String _greaterThan = "greaterThan";
    public static final java.lang.String _greaterThanOrEqualTo = "greaterThanOrEqualTo";
    public static final java.lang.String _lessThan = "lessThan";
    public static final java.lang.String _lessThanOrEqualTo = "lessThanOrEqualTo";
    public static final java.lang.String _notBetween = "notBetween";
    public static final java.lang.String _notEmpty = "notEmpty";
    public static final java.lang.String _notEqualTo = "notEqualTo";
    public static final java.lang.String _notGreaterThan = "notGreaterThan";
    public static final java.lang.String _notGreaterThanOrEqualTo = "notGreaterThanOrEqualTo";
    public static final java.lang.String _notLessThan = "notLessThan";
    public static final java.lang.String _notLessThanOrEqualTo = "notLessThanOrEqualTo";
    public static final SearchTextNumberFieldOperator between = new SearchTextNumberFieldOperator(_between);
    public static final SearchTextNumberFieldOperator empty = new SearchTextNumberFieldOperator(_empty);
    public static final SearchTextNumberFieldOperator equalTo = new SearchTextNumberFieldOperator(_equalTo);
    public static final SearchTextNumberFieldOperator greaterThan = new SearchTextNumberFieldOperator(_greaterThan);
    public static final SearchTextNumberFieldOperator greaterThanOrEqualTo = new SearchTextNumberFieldOperator(_greaterThanOrEqualTo);
    public static final SearchTextNumberFieldOperator lessThan = new SearchTextNumberFieldOperator(_lessThan);
    public static final SearchTextNumberFieldOperator lessThanOrEqualTo = new SearchTextNumberFieldOperator(_lessThanOrEqualTo);
    public static final SearchTextNumberFieldOperator notBetween = new SearchTextNumberFieldOperator(_notBetween);
    public static final SearchTextNumberFieldOperator notEmpty = new SearchTextNumberFieldOperator(_notEmpty);
    public static final SearchTextNumberFieldOperator notEqualTo = new SearchTextNumberFieldOperator(_notEqualTo);
    public static final SearchTextNumberFieldOperator notGreaterThan = new SearchTextNumberFieldOperator(_notGreaterThan);
    public static final SearchTextNumberFieldOperator notGreaterThanOrEqualTo = new SearchTextNumberFieldOperator(_notGreaterThanOrEqualTo);
    public static final SearchTextNumberFieldOperator notLessThan = new SearchTextNumberFieldOperator(_notLessThan);
    public static final SearchTextNumberFieldOperator notLessThanOrEqualTo = new SearchTextNumberFieldOperator(_notLessThanOrEqualTo);
    public java.lang.String getValue() { return _value_;}
    public static SearchTextNumberFieldOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchTextNumberFieldOperator enumeration = (SearchTextNumberFieldOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchTextNumberFieldOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchTextNumberFieldOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchTextNumberFieldOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
