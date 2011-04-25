/**
 * ItemFulfillmentMethodOfTransportUps.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentMethodOfTransportUps implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ItemFulfillmentMethodOfTransportUps(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __air = "_air";
    public static final java.lang.String __airContainerized = "_airContainerized";
    public static final java.lang.String __auto = "_auto";
    public static final java.lang.String __fixedTransportInstallations = "_fixedTransportInstallations";
    public static final java.lang.String __mail = "_mail";
    public static final java.lang.String __passengerHandcarried = "_passengerHandcarried";
    public static final java.lang.String __pedestrian = "_pedestrian";
    public static final java.lang.String __rail = "_rail";
    public static final java.lang.String __railContainerized = "_railContainerized";
    public static final java.lang.String __roadOther = "_roadOther";
    public static final java.lang.String __seaBarge = "_seaBarge";
    public static final java.lang.String __seaContainerized = "_seaContainerized";
    public static final java.lang.String __seaNoncontainerized = "_seaNoncontainerized";
    public static final java.lang.String __truck = "_truck";
    public static final java.lang.String __truckContainerized = "_truckContainerized";
    public static final ItemFulfillmentMethodOfTransportUps _air = new ItemFulfillmentMethodOfTransportUps(__air);
    public static final ItemFulfillmentMethodOfTransportUps _airContainerized = new ItemFulfillmentMethodOfTransportUps(__airContainerized);
    public static final ItemFulfillmentMethodOfTransportUps _auto = new ItemFulfillmentMethodOfTransportUps(__auto);
    public static final ItemFulfillmentMethodOfTransportUps _fixedTransportInstallations = new ItemFulfillmentMethodOfTransportUps(__fixedTransportInstallations);
    public static final ItemFulfillmentMethodOfTransportUps _mail = new ItemFulfillmentMethodOfTransportUps(__mail);
    public static final ItemFulfillmentMethodOfTransportUps _passengerHandcarried = new ItemFulfillmentMethodOfTransportUps(__passengerHandcarried);
    public static final ItemFulfillmentMethodOfTransportUps _pedestrian = new ItemFulfillmentMethodOfTransportUps(__pedestrian);
    public static final ItemFulfillmentMethodOfTransportUps _rail = new ItemFulfillmentMethodOfTransportUps(__rail);
    public static final ItemFulfillmentMethodOfTransportUps _railContainerized = new ItemFulfillmentMethodOfTransportUps(__railContainerized);
    public static final ItemFulfillmentMethodOfTransportUps _roadOther = new ItemFulfillmentMethodOfTransportUps(__roadOther);
    public static final ItemFulfillmentMethodOfTransportUps _seaBarge = new ItemFulfillmentMethodOfTransportUps(__seaBarge);
    public static final ItemFulfillmentMethodOfTransportUps _seaContainerized = new ItemFulfillmentMethodOfTransportUps(__seaContainerized);
    public static final ItemFulfillmentMethodOfTransportUps _seaNoncontainerized = new ItemFulfillmentMethodOfTransportUps(__seaNoncontainerized);
    public static final ItemFulfillmentMethodOfTransportUps _truck = new ItemFulfillmentMethodOfTransportUps(__truck);
    public static final ItemFulfillmentMethodOfTransportUps _truckContainerized = new ItemFulfillmentMethodOfTransportUps(__truckContainerized);
    public java.lang.String getValue() { return _value_;}
    public static ItemFulfillmentMethodOfTransportUps fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ItemFulfillmentMethodOfTransportUps enumeration = (ItemFulfillmentMethodOfTransportUps)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ItemFulfillmentMethodOfTransportUps fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ItemFulfillmentMethodOfTransportUps.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentMethodOfTransportUps"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
