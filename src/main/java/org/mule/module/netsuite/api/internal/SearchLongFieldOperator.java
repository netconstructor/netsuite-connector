/**
 * SearchLongFieldOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchLongFieldOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchLongFieldOperator(java.lang.String value) {
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
    public static final SearchLongFieldOperator between = new SearchLongFieldOperator(_between);
    public static final SearchLongFieldOperator empty = new SearchLongFieldOperator(_empty);
    public static final SearchLongFieldOperator equalTo = new SearchLongFieldOperator(_equalTo);
    public static final SearchLongFieldOperator greaterThan = new SearchLongFieldOperator(_greaterThan);
    public static final SearchLongFieldOperator greaterThanOrEqualTo = new SearchLongFieldOperator(_greaterThanOrEqualTo);
    public static final SearchLongFieldOperator lessThan = new SearchLongFieldOperator(_lessThan);
    public static final SearchLongFieldOperator lessThanOrEqualTo = new SearchLongFieldOperator(_lessThanOrEqualTo);
    public static final SearchLongFieldOperator notBetween = new SearchLongFieldOperator(_notBetween);
    public static final SearchLongFieldOperator notEmpty = new SearchLongFieldOperator(_notEmpty);
    public static final SearchLongFieldOperator notEqualTo = new SearchLongFieldOperator(_notEqualTo);
    public static final SearchLongFieldOperator notGreaterThan = new SearchLongFieldOperator(_notGreaterThan);
    public static final SearchLongFieldOperator notGreaterThanOrEqualTo = new SearchLongFieldOperator(_notGreaterThanOrEqualTo);
    public static final SearchLongFieldOperator notLessThan = new SearchLongFieldOperator(_notLessThan);
    public static final SearchLongFieldOperator notLessThanOrEqualTo = new SearchLongFieldOperator(_notLessThanOrEqualTo);
    public java.lang.String getValue() { return _value_;}
    public static SearchLongFieldOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchLongFieldOperator enumeration = (SearchLongFieldOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchLongFieldOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchLongFieldOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchLongFieldOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
