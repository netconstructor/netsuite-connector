/**
 * EmployeePayFrequency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeePayFrequency implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EmployeePayFrequency(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __annually = "_annually";
    public static final java.lang.String __custom = "_custom";
    public static final java.lang.String __daily = "_daily";
    public static final java.lang.String __endOfPeriod = "_endOfPeriod";
    public static final java.lang.String __everyFourWeeks = "_everyFourWeeks";
    public static final java.lang.String __everyThreeYears = "_everyThreeYears";
    public static final java.lang.String __everyTwoMonths = "_everyTwoMonths";
    public static final java.lang.String __everyTwoWeeks = "_everyTwoWeeks";
    public static final java.lang.String __everyTwoYears = "_everyTwoYears";
    public static final java.lang.String __monthly = "_monthly";
    public static final java.lang.String __never = "_never";
    public static final java.lang.String __oneTime = "_oneTime";
    public static final java.lang.String __quarterly = "_quarterly";
    public static final java.lang.String __startOfPeriod = "_startOfPeriod";
    public static final java.lang.String __twiceAMonth = "_twiceAMonth";
    public static final java.lang.String __twiceAYear = "_twiceAYear";
    public static final java.lang.String __weekly = "_weekly";
    public static final EmployeePayFrequency _annually = new EmployeePayFrequency(__annually);
    public static final EmployeePayFrequency _custom = new EmployeePayFrequency(__custom);
    public static final EmployeePayFrequency _daily = new EmployeePayFrequency(__daily);
    public static final EmployeePayFrequency _endOfPeriod = new EmployeePayFrequency(__endOfPeriod);
    public static final EmployeePayFrequency _everyFourWeeks = new EmployeePayFrequency(__everyFourWeeks);
    public static final EmployeePayFrequency _everyThreeYears = new EmployeePayFrequency(__everyThreeYears);
    public static final EmployeePayFrequency _everyTwoMonths = new EmployeePayFrequency(__everyTwoMonths);
    public static final EmployeePayFrequency _everyTwoWeeks = new EmployeePayFrequency(__everyTwoWeeks);
    public static final EmployeePayFrequency _everyTwoYears = new EmployeePayFrequency(__everyTwoYears);
    public static final EmployeePayFrequency _monthly = new EmployeePayFrequency(__monthly);
    public static final EmployeePayFrequency _never = new EmployeePayFrequency(__never);
    public static final EmployeePayFrequency _oneTime = new EmployeePayFrequency(__oneTime);
    public static final EmployeePayFrequency _quarterly = new EmployeePayFrequency(__quarterly);
    public static final EmployeePayFrequency _startOfPeriod = new EmployeePayFrequency(__startOfPeriod);
    public static final EmployeePayFrequency _twiceAMonth = new EmployeePayFrequency(__twiceAMonth);
    public static final EmployeePayFrequency _twiceAYear = new EmployeePayFrequency(__twiceAYear);
    public static final EmployeePayFrequency _weekly = new EmployeePayFrequency(__weekly);
    public java.lang.String getValue() { return _value_;}
    public static EmployeePayFrequency fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EmployeePayFrequency enumeration = (EmployeePayFrequency)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EmployeePayFrequency fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EmployeePayFrequency.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.employees_2010_2.lists.webservices.netsuite.com", "EmployeePayFrequency"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
