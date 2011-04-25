/**
 * InitializeRefType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InitializeRefType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected InitializeRefType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _assemblyBuild = "assemblyBuild";
    public static final java.lang.String _cashSale = "cashSale";
    public static final java.lang.String _creditMemo = "creditMemo";
    public static final java.lang.String _customer = "customer";
    public static final java.lang.String _customerDeposit = "customerDeposit";
    public static final java.lang.String _employee = "employee";
    public static final java.lang.String _estimate = "estimate";
    public static final java.lang.String _interCompanyTransferOrder = "interCompanyTransferOrder";
    public static final java.lang.String _invoice = "invoice";
    public static final java.lang.String _opportunity = "opportunity";
    public static final java.lang.String _purchaseOrder = "purchaseOrder";
    public static final java.lang.String _returnAuthorization = "returnAuthorization";
    public static final java.lang.String _salesOrder = "salesOrder";
    public static final java.lang.String _transferOrder = "transferOrder";
    public static final java.lang.String _vendor = "vendor";
    public static final java.lang.String _vendorBill = "vendorBill";
    public static final InitializeRefType assemblyBuild = new InitializeRefType(_assemblyBuild);
    public static final InitializeRefType cashSale = new InitializeRefType(_cashSale);
    public static final InitializeRefType creditMemo = new InitializeRefType(_creditMemo);
    public static final InitializeRefType customer = new InitializeRefType(_customer);
    public static final InitializeRefType customerDeposit = new InitializeRefType(_customerDeposit);
    public static final InitializeRefType employee = new InitializeRefType(_employee);
    public static final InitializeRefType estimate = new InitializeRefType(_estimate);
    public static final InitializeRefType interCompanyTransferOrder = new InitializeRefType(_interCompanyTransferOrder);
    public static final InitializeRefType invoice = new InitializeRefType(_invoice);
    public static final InitializeRefType opportunity = new InitializeRefType(_opportunity);
    public static final InitializeRefType purchaseOrder = new InitializeRefType(_purchaseOrder);
    public static final InitializeRefType returnAuthorization = new InitializeRefType(_returnAuthorization);
    public static final InitializeRefType salesOrder = new InitializeRefType(_salesOrder);
    public static final InitializeRefType transferOrder = new InitializeRefType(_transferOrder);
    public static final InitializeRefType vendor = new InitializeRefType(_vendor);
    public static final InitializeRefType vendorBill = new InitializeRefType(_vendorBill);
    public java.lang.String getValue() { return _value_;}
    public static InitializeRefType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        InitializeRefType enumeration = (InitializeRefType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static InitializeRefType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(InitializeRefType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.core_2010_2.platform.webservices.netsuite.com", "InitializeRefType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
