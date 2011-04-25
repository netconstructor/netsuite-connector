/**
 * ScheduleBCode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ScheduleBCode implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ScheduleBCode(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __1000 = "_1000";
    public static final java.lang.String __1000cubicMeters = "_1000cubicMeters";
    public static final java.lang.String __barrels = "_barrels";
    public static final java.lang.String __carat = "_carat";
    public static final java.lang.String __cleanYieldKilogram = "_cleanYieldKilogram";
    public static final java.lang.String __contentKilogram = "_contentKilogram";
    public static final java.lang.String __contentTon = "_contentTon";
    public static final java.lang.String __cubicMeters = "_cubicMeters";
    public static final java.lang.String __curie = "_curie";
    public static final java.lang.String __dozen = "_dozen";
    public static final java.lang.String __dozenPairs = "_dozenPairs";
    public static final java.lang.String __dozenPieces = "_dozenPieces";
    public static final java.lang.String __fiberMeter = "_fiberMeter";
    public static final java.lang.String __gram = "_gram";
    public static final java.lang.String __gross = "_gross";
    public static final java.lang.String __grossContainers = "_grossContainers";
    public static final java.lang.String __hundred = "_hundred";
    public static final java.lang.String __kilogram = "_kilogram";
    public static final java.lang.String __kilogramTotalSugars = "_kilogramTotalSugars";
    public static final java.lang.String __liter = "_liter";
    public static final java.lang.String __meter = "_meter";
    public static final java.lang.String __millicurie = "_millicurie";
    public static final java.lang.String __noQuantityReq = "_noQuantityReq";
    public static final java.lang.String __number = "_number";
    public static final java.lang.String __pack = "_pack";
    public static final java.lang.String __pairs = "_pairs";
    public static final java.lang.String __pieces = "_pieces";
    public static final java.lang.String __proofLiter = "_proofLiter";
    public static final java.lang.String __runningBales = "_runningBales";
    public static final java.lang.String __square = "_square";
    public static final java.lang.String __squareCentimeters = "_squareCentimeters";
    public static final java.lang.String __squareMeters = "_squareMeters";
    public static final java.lang.String __ton = "_ton";
    public static final ScheduleBCode _1000 = new ScheduleBCode(__1000);
    public static final ScheduleBCode _1000cubicMeters = new ScheduleBCode(__1000cubicMeters);
    public static final ScheduleBCode _barrels = new ScheduleBCode(__barrels);
    public static final ScheduleBCode _carat = new ScheduleBCode(__carat);
    public static final ScheduleBCode _cleanYieldKilogram = new ScheduleBCode(__cleanYieldKilogram);
    public static final ScheduleBCode _contentKilogram = new ScheduleBCode(__contentKilogram);
    public static final ScheduleBCode _contentTon = new ScheduleBCode(__contentTon);
    public static final ScheduleBCode _cubicMeters = new ScheduleBCode(__cubicMeters);
    public static final ScheduleBCode _curie = new ScheduleBCode(__curie);
    public static final ScheduleBCode _dozen = new ScheduleBCode(__dozen);
    public static final ScheduleBCode _dozenPairs = new ScheduleBCode(__dozenPairs);
    public static final ScheduleBCode _dozenPieces = new ScheduleBCode(__dozenPieces);
    public static final ScheduleBCode _fiberMeter = new ScheduleBCode(__fiberMeter);
    public static final ScheduleBCode _gram = new ScheduleBCode(__gram);
    public static final ScheduleBCode _gross = new ScheduleBCode(__gross);
    public static final ScheduleBCode _grossContainers = new ScheduleBCode(__grossContainers);
    public static final ScheduleBCode _hundred = new ScheduleBCode(__hundred);
    public static final ScheduleBCode _kilogram = new ScheduleBCode(__kilogram);
    public static final ScheduleBCode _kilogramTotalSugars = new ScheduleBCode(__kilogramTotalSugars);
    public static final ScheduleBCode _liter = new ScheduleBCode(__liter);
    public static final ScheduleBCode _meter = new ScheduleBCode(__meter);
    public static final ScheduleBCode _millicurie = new ScheduleBCode(__millicurie);
    public static final ScheduleBCode _noQuantityReq = new ScheduleBCode(__noQuantityReq);
    public static final ScheduleBCode _number = new ScheduleBCode(__number);
    public static final ScheduleBCode _pack = new ScheduleBCode(__pack);
    public static final ScheduleBCode _pairs = new ScheduleBCode(__pairs);
    public static final ScheduleBCode _pieces = new ScheduleBCode(__pieces);
    public static final ScheduleBCode _proofLiter = new ScheduleBCode(__proofLiter);
    public static final ScheduleBCode _runningBales = new ScheduleBCode(__runningBales);
    public static final ScheduleBCode _square = new ScheduleBCode(__square);
    public static final ScheduleBCode _squareCentimeters = new ScheduleBCode(__squareCentimeters);
    public static final ScheduleBCode _squareMeters = new ScheduleBCode(__squareMeters);
    public static final ScheduleBCode _ton = new ScheduleBCode(__ton);
    public java.lang.String getValue() { return _value_;}
    public static ScheduleBCode fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ScheduleBCode enumeration = (ScheduleBCode)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ScheduleBCode fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ScheduleBCode.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.accounting_2010_2.lists.webservices.netsuite.com", "ScheduleBCode"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
