/**
 * SearchDoubleFieldOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchDoubleFieldOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchDoubleFieldOperator(java.lang.String value) {
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
    public static final SearchDoubleFieldOperator between = new SearchDoubleFieldOperator(_between);
    public static final SearchDoubleFieldOperator empty = new SearchDoubleFieldOperator(_empty);
    public static final SearchDoubleFieldOperator equalTo = new SearchDoubleFieldOperator(_equalTo);
    public static final SearchDoubleFieldOperator greaterThan = new SearchDoubleFieldOperator(_greaterThan);
    public static final SearchDoubleFieldOperator greaterThanOrEqualTo = new SearchDoubleFieldOperator(_greaterThanOrEqualTo);
    public static final SearchDoubleFieldOperator lessThan = new SearchDoubleFieldOperator(_lessThan);
    public static final SearchDoubleFieldOperator lessThanOrEqualTo = new SearchDoubleFieldOperator(_lessThanOrEqualTo);
    public static final SearchDoubleFieldOperator notBetween = new SearchDoubleFieldOperator(_notBetween);
    public static final SearchDoubleFieldOperator notEmpty = new SearchDoubleFieldOperator(_notEmpty);
    public static final SearchDoubleFieldOperator notEqualTo = new SearchDoubleFieldOperator(_notEqualTo);
    public static final SearchDoubleFieldOperator notGreaterThan = new SearchDoubleFieldOperator(_notGreaterThan);
    public static final SearchDoubleFieldOperator notGreaterThanOrEqualTo = new SearchDoubleFieldOperator(_notGreaterThanOrEqualTo);
    public static final SearchDoubleFieldOperator notLessThan = new SearchDoubleFieldOperator(_notLessThan);
    public static final SearchDoubleFieldOperator notLessThanOrEqualTo = new SearchDoubleFieldOperator(_notLessThanOrEqualTo);
    public java.lang.String getValue() { return _value_;}
    public static SearchDoubleFieldOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchDoubleFieldOperator enumeration = (SearchDoubleFieldOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchDoubleFieldOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchDoubleFieldOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchDoubleFieldOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
