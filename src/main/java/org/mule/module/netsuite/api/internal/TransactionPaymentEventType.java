/**
 * TransactionPaymentEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionPaymentEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionPaymentEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __authorizationRequest = "_authorizationRequest";
    public static final java.lang.String __captureRequest = "_captureRequest";
    public static final java.lang.String __creditRequest = "_creditRequest";
    public static final java.lang.String __overrideHold = "_overrideHold";
    public static final java.lang.String __refundRequest = "_refundRequest";
    public static final java.lang.String __saleRequest = "_saleRequest";
    public static final TransactionPaymentEventType _authorizationRequest = new TransactionPaymentEventType(__authorizationRequest);
    public static final TransactionPaymentEventType _captureRequest = new TransactionPaymentEventType(__captureRequest);
    public static final TransactionPaymentEventType _creditRequest = new TransactionPaymentEventType(__creditRequest);
    public static final TransactionPaymentEventType _overrideHold = new TransactionPaymentEventType(__overrideHold);
    public static final TransactionPaymentEventType _refundRequest = new TransactionPaymentEventType(__refundRequest);
    public static final TransactionPaymentEventType _saleRequest = new TransactionPaymentEventType(__saleRequest);
    public java.lang.String getValue() { return _value_;}
    public static TransactionPaymentEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionPaymentEventType enumeration = (TransactionPaymentEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionPaymentEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionPaymentEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "TransactionPaymentEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
