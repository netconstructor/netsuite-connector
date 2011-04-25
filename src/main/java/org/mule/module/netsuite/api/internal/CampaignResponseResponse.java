/**
 * CampaignResponseResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignResponseResponse implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignResponseResponse(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __bounced = "_bounced";
    public static final java.lang.String __clickedThru = "_clickedThru";
    public static final java.lang.String __purchased = "_purchased";
    public static final java.lang.String __received = "_received";
    public static final java.lang.String __responded = "_responded";
    public static final java.lang.String __sent = "_sent";
    public static final java.lang.String __subscribed = "_subscribed";
    public static final java.lang.String __unsubscribed = "_unsubscribed";
    public static final CampaignResponseResponse _bounced = new CampaignResponseResponse(__bounced);
    public static final CampaignResponseResponse _clickedThru = new CampaignResponseResponse(__clickedThru);
    public static final CampaignResponseResponse _purchased = new CampaignResponseResponse(__purchased);
    public static final CampaignResponseResponse _received = new CampaignResponseResponse(__received);
    public static final CampaignResponseResponse _responded = new CampaignResponseResponse(__responded);
    public static final CampaignResponseResponse _sent = new CampaignResponseResponse(__sent);
    public static final CampaignResponseResponse _subscribed = new CampaignResponseResponse(__subscribed);
    public static final CampaignResponseResponse _unsubscribed = new CampaignResponseResponse(__unsubscribed);
    public java.lang.String getValue() { return _value_;}
    public static CampaignResponseResponse fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignResponseResponse enumeration = (CampaignResponseResponse)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignResponseResponse fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignResponseResponse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignResponseResponse"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
