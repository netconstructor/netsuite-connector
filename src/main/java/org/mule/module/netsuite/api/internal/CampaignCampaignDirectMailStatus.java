/**
 * CampaignCampaignDirectMailStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CampaignCampaignDirectMailStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CampaignCampaignDirectMailStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __completed = "_completed";
    public static final java.lang.String __execute = "_execute";
    public static final java.lang.String __inProgress = "_inProgress";
    public static final java.lang.String __notStarted = "_notStarted";
    public static final CampaignCampaignDirectMailStatus _completed = new CampaignCampaignDirectMailStatus(__completed);
    public static final CampaignCampaignDirectMailStatus _execute = new CampaignCampaignDirectMailStatus(__execute);
    public static final CampaignCampaignDirectMailStatus _inProgress = new CampaignCampaignDirectMailStatus(__inProgress);
    public static final CampaignCampaignDirectMailStatus _notStarted = new CampaignCampaignDirectMailStatus(__notStarted);
    public java.lang.String getValue() { return _value_;}
    public static CampaignCampaignDirectMailStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CampaignCampaignDirectMailStatus enumeration = (CampaignCampaignDirectMailStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CampaignCampaignDirectMailStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CampaignCampaignDirectMailStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.marketing_2010_2.lists.webservices.netsuite.com", "CampaignCampaignDirectMailStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
