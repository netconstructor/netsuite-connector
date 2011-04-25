/**
 * TaskReminderMinutes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TaskReminderMinutes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TaskReminderMinutes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __0minutes = "_0minutes";
    public static final java.lang.String __10minutes = "_10minutes";
    public static final java.lang.String __12hours = "_12hours";
    public static final java.lang.String __15minutes = "_15minutes";
    public static final java.lang.String __1day = "_1day";
    public static final java.lang.String __1hour = "_1hour";
    public static final java.lang.String __1week = "_1week";
    public static final java.lang.String __2days = "_2days";
    public static final java.lang.String __2hours = "_2hours";
    public static final java.lang.String __30minutes = "_30minutes";
    public static final java.lang.String __3days = "_3days";
    public static final java.lang.String __3hours = "_3hours";
    public static final java.lang.String __4hours = "_4hours";
    public static final java.lang.String __5hours = "_5hours";
    public static final java.lang.String __5minutes = "_5minutes";
    public static final java.lang.String __8hours = "_8hours";
    public static final TaskReminderMinutes _0minutes = new TaskReminderMinutes(__0minutes);
    public static final TaskReminderMinutes _10minutes = new TaskReminderMinutes(__10minutes);
    public static final TaskReminderMinutes _12hours = new TaskReminderMinutes(__12hours);
    public static final TaskReminderMinutes _15minutes = new TaskReminderMinutes(__15minutes);
    public static final TaskReminderMinutes _1day = new TaskReminderMinutes(__1day);
    public static final TaskReminderMinutes _1hour = new TaskReminderMinutes(__1hour);
    public static final TaskReminderMinutes _1week = new TaskReminderMinutes(__1week);
    public static final TaskReminderMinutes _2days = new TaskReminderMinutes(__2days);
    public static final TaskReminderMinutes _2hours = new TaskReminderMinutes(__2hours);
    public static final TaskReminderMinutes _30minutes = new TaskReminderMinutes(__30minutes);
    public static final TaskReminderMinutes _3days = new TaskReminderMinutes(__3days);
    public static final TaskReminderMinutes _3hours = new TaskReminderMinutes(__3hours);
    public static final TaskReminderMinutes _4hours = new TaskReminderMinutes(__4hours);
    public static final TaskReminderMinutes _5hours = new TaskReminderMinutes(__5hours);
    public static final TaskReminderMinutes _5minutes = new TaskReminderMinutes(__5minutes);
    public static final TaskReminderMinutes _8hours = new TaskReminderMinutes(__8hours);
    public java.lang.String getValue() { return _value_;}
    public static TaskReminderMinutes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TaskReminderMinutes enumeration = (TaskReminderMinutes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TaskReminderMinutes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TaskReminderMinutes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.scheduling_2010_2.activities.webservices.netsuite.com", "TaskReminderMinutes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
