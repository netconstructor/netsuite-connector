/**
 * ProjectTaskPredecessorPredecessorType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTaskPredecessorPredecessorType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProjectTaskPredecessorPredecessorType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __finishToStart = "_finishToStart";
    public static final java.lang.String __startToStart = "_startToStart";
    public static final ProjectTaskPredecessorPredecessorType _finishToStart = new ProjectTaskPredecessorPredecessorType(__finishToStart);
    public static final ProjectTaskPredecessorPredecessorType _startToStart = new ProjectTaskPredecessorPredecessorType(__startToStart);
    public java.lang.String getValue() { return _value_;}
    public static ProjectTaskPredecessorPredecessorType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProjectTaskPredecessorPredecessorType enumeration = (ProjectTaskPredecessorPredecessorType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProjectTaskPredecessorPredecessorType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProjectTaskPredecessorPredecessorType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskPredecessorPredecessorType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
