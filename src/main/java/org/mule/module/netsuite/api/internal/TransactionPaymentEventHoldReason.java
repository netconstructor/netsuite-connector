/**
 * TransactionPaymentEventHoldReason.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TransactionPaymentEventHoldReason implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TransactionPaymentEventHoldReason(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __authorizationDecline = "_authorizationDecline";
    public static final java.lang.String __decisionManagerRejection = "_decisionManagerRejection";
    public static final java.lang.String __decisionManagerReview = "_decisionManagerReview";
    public static final java.lang.String __gatewayError = "_gatewayError";
    public static final java.lang.String __overridenBy = "_overridenBy";
    public static final java.lang.String __systemError = "_systemError";
    public static final java.lang.String __unexpectedResponse = "_unexpectedResponse";
    public static final java.lang.String __verificationRejection = "_verificationRejection";
    public static final java.lang.String __verificationRequired = "_verificationRequired";
    public static final TransactionPaymentEventHoldReason _authorizationDecline = new TransactionPaymentEventHoldReason(__authorizationDecline);
    public static final TransactionPaymentEventHoldReason _decisionManagerRejection = new TransactionPaymentEventHoldReason(__decisionManagerRejection);
    public static final TransactionPaymentEventHoldReason _decisionManagerReview = new TransactionPaymentEventHoldReason(__decisionManagerReview);
    public static final TransactionPaymentEventHoldReason _gatewayError = new TransactionPaymentEventHoldReason(__gatewayError);
    public static final TransactionPaymentEventHoldReason _overridenBy = new TransactionPaymentEventHoldReason(__overridenBy);
    public static final TransactionPaymentEventHoldReason _systemError = new TransactionPaymentEventHoldReason(__systemError);
    public static final TransactionPaymentEventHoldReason _unexpectedResponse = new TransactionPaymentEventHoldReason(__unexpectedResponse);
    public static final TransactionPaymentEventHoldReason _verificationRejection = new TransactionPaymentEventHoldReason(__verificationRejection);
    public static final TransactionPaymentEventHoldReason _verificationRequired = new TransactionPaymentEventHoldReason(__verificationRequired);
    public java.lang.String getValue() { return _value_;}
    public static TransactionPaymentEventHoldReason fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TransactionPaymentEventHoldReason enumeration = (TransactionPaymentEventHoldReason)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TransactionPaymentEventHoldReason fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TransactionPaymentEventHoldReason.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "TransactionPaymentEventHoldReason"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
