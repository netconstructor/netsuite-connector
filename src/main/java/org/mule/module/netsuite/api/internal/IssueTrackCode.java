/**
 * IssueTrackCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class IssueTrackCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IssueTrackCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __never = "_never";
    public static final java.lang.String __onAnyChange = "_onAnyChange";
    public static final java.lang.String __whenBaseStatusIsClosed = "_whenBaseStatusIsClosed";
    public static final java.lang.String __whenBaseStatusIsOnHold = "_whenBaseStatusIsOnHold";
    public static final java.lang.String __whenBaseStatusIsOpen = "_whenBaseStatusIsOpen";
    public static final java.lang.String __whenBaseStatusIsResolved = "_whenBaseStatusIsResolved";
    public static final IssueTrackCode _never = new IssueTrackCode(__never);
    public static final IssueTrackCode _onAnyChange = new IssueTrackCode(__onAnyChange);
    public static final IssueTrackCode _whenBaseStatusIsClosed = new IssueTrackCode(__whenBaseStatusIsClosed);
    public static final IssueTrackCode _whenBaseStatusIsOnHold = new IssueTrackCode(__whenBaseStatusIsOnHold);
    public static final IssueTrackCode _whenBaseStatusIsOpen = new IssueTrackCode(__whenBaseStatusIsOpen);
    public static final IssueTrackCode _whenBaseStatusIsResolved = new IssueTrackCode(__whenBaseStatusIsResolved);
    public java.lang.String getValue() { return _value_;}
    public static IssueTrackCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IssueTrackCode enumeration = (IssueTrackCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IssueTrackCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IssueTrackCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.support_2010_2.lists.webservices.netsuite.com", "IssueTrackCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
