/**
 * SearchDateFieldOperator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SearchDateFieldOperator implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SearchDateFieldOperator(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _after = "after";
    public static final java.lang.String _before = "before";
    public static final java.lang.String _empty = "empty";
    public static final java.lang.String _notAfter = "notAfter";
    public static final java.lang.String _notBefore = "notBefore";
    public static final java.lang.String _notEmpty = "notEmpty";
    public static final java.lang.String _notOn = "notOn";
    public static final java.lang.String _notOnOrAfter = "notOnOrAfter";
    public static final java.lang.String _notOnOrBefore = "notOnOrBefore";
    public static final java.lang.String _notWithin = "notWithin";
    public static final java.lang.String _on = "on";
    public static final java.lang.String _onOrAfter = "onOrAfter";
    public static final java.lang.String _onOrBefore = "onOrBefore";
    public static final java.lang.String _within = "within";
    public static final SearchDateFieldOperator after = new SearchDateFieldOperator(_after);
    public static final SearchDateFieldOperator before = new SearchDateFieldOperator(_before);
    public static final SearchDateFieldOperator empty = new SearchDateFieldOperator(_empty);
    public static final SearchDateFieldOperator notAfter = new SearchDateFieldOperator(_notAfter);
    public static final SearchDateFieldOperator notBefore = new SearchDateFieldOperator(_notBefore);
    public static final SearchDateFieldOperator notEmpty = new SearchDateFieldOperator(_notEmpty);
    public static final SearchDateFieldOperator notOn = new SearchDateFieldOperator(_notOn);
    public static final SearchDateFieldOperator notOnOrAfter = new SearchDateFieldOperator(_notOnOrAfter);
    public static final SearchDateFieldOperator notOnOrBefore = new SearchDateFieldOperator(_notOnOrBefore);
    public static final SearchDateFieldOperator notWithin = new SearchDateFieldOperator(_notWithin);
    public static final SearchDateFieldOperator on = new SearchDateFieldOperator(_on);
    public static final SearchDateFieldOperator onOrAfter = new SearchDateFieldOperator(_onOrAfter);
    public static final SearchDateFieldOperator onOrBefore = new SearchDateFieldOperator(_onOrBefore);
    public static final SearchDateFieldOperator within = new SearchDateFieldOperator(_within);
    public java.lang.String getValue() { return _value_;}
    public static SearchDateFieldOperator fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SearchDateFieldOperator enumeration = (SearchDateFieldOperator)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SearchDateFieldOperator fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SearchDateFieldOperator.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "SearchDateFieldOperator"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
