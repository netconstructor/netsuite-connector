/**
 * InitializeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InitializeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InitializeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _assemblyUnbuild = "assemblyUnbuild";
    public static final java.lang.String _cashRefund = "cashRefund";
    public static final java.lang.String _cashSale = "cashSale";
    public static final java.lang.String _creditMemo = "creditMemo";
    public static final java.lang.String _customerPayment = "customerPayment";
    public static final java.lang.String _customerRefund = "customerRefund";
    public static final java.lang.String _depositApplication = "depositApplication";
    public static final java.lang.String _estimate = "estimate";
    public static final java.lang.String _invoice = "invoice";
    public static final java.lang.String _itemFulfillment = "itemFulfillment";
    public static final java.lang.String _itemReceipt = "itemReceipt";
    public static final java.lang.String _returnAuthorization = "returnAuthorization";
    public static final java.lang.String _salesOrder = "salesOrder";
    public static final java.lang.String _vendorBill = "vendorBill";
    public static final java.lang.String _vendorPayment = "vendorPayment";
    public static final InitializeType assemblyUnbuild = new InitializeType(_assemblyUnbuild);
    public static final InitializeType cashRefund = new InitializeType(_cashRefund);
    public static final InitializeType cashSale = new InitializeType(_cashSale);
    public static final InitializeType creditMemo = new InitializeType(_creditMemo);
    public static final InitializeType customerPayment = new InitializeType(_customerPayment);
    public static final InitializeType customerRefund = new InitializeType(_customerRefund);
    public static final InitializeType depositApplication = new InitializeType(_depositApplication);
    public static final InitializeType estimate = new InitializeType(_estimate);
    public static final InitializeType invoice = new InitializeType(_invoice);
    public static final InitializeType itemFulfillment = new InitializeType(_itemFulfillment);
    public static final InitializeType itemReceipt = new InitializeType(_itemReceipt);
    public static final InitializeType returnAuthorization = new InitializeType(_returnAuthorization);
    public static final InitializeType salesOrder = new InitializeType(_salesOrder);
    public static final InitializeType vendorBill = new InitializeType(_vendorBill);
    public static final InitializeType vendorPayment = new InitializeType(_vendorPayment);
    public java.lang.String getValue() { return _value_;}
    public static InitializeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InitializeType enumeration = (InitializeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InitializeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InitializeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "InitializeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
