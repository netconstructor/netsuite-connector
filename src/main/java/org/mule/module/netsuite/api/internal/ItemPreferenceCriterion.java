/**
 * ItemPreferenceCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemPreferenceCriterion implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemPreferenceCriterion(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __A = "_A";
    public static final java.lang.String __B = "_B";
    public static final java.lang.String __C = "_C";
    public static final java.lang.String __D = "_D";
    public static final java.lang.String __E = "_E";
    public static final java.lang.String __F = "_F";
    public static final ItemPreferenceCriterion _A = new ItemPreferenceCriterion(__A);
    public static final ItemPreferenceCriterion _B = new ItemPreferenceCriterion(__B);
    public static final ItemPreferenceCriterion _C = new ItemPreferenceCriterion(__C);
    public static final ItemPreferenceCriterion _D = new ItemPreferenceCriterion(__D);
    public static final ItemPreferenceCriterion _E = new ItemPreferenceCriterion(__E);
    public static final ItemPreferenceCriterion _F = new ItemPreferenceCriterion(__F);
    public java.lang.String getValue() { return _value_;}
    public static ItemPreferenceCriterion fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemPreferenceCriterion enumeration = (ItemPreferenceCriterion)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemPreferenceCriterion fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemPreferenceCriterion.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ItemPreferenceCriterion"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
