/**
 * TransactionPaymentEventResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionPaymentEventResult implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionPaymentEventResult(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __accept = "_accept";
    public static final java.lang.String __holdOverride = "_holdOverride";
    public static final java.lang.String __paymentHold = "_paymentHold";
    public static final java.lang.String __reject = "_reject";
    public static final TransactionPaymentEventResult _accept = new TransactionPaymentEventResult(__accept);
    public static final TransactionPaymentEventResult _holdOverride = new TransactionPaymentEventResult(__holdOverride);
    public static final TransactionPaymentEventResult _paymentHold = new TransactionPaymentEventResult(__paymentHold);
    public static final TransactionPaymentEventResult _reject = new TransactionPaymentEventResult(__reject);
    public java.lang.String getValue() { return _value_;}
    public static TransactionPaymentEventResult fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionPaymentEventResult enumeration = (TransactionPaymentEventResult)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionPaymentEventResult fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionPaymentEventResult.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "TransactionPaymentEventResult"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
