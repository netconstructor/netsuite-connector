/**
 * PostingPeriodDate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class PostingPeriodDate implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PostingPeriodDate(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __firstQtrOfLastFy = "_firstQtrOfLastFy";
    public static final java.lang.String __firstQtrOfThisFy = "_firstQtrOfThisFy";
    public static final java.lang.String __fiscalYearBeforeLast = "_fiscalYearBeforeLast";
    public static final java.lang.String __fourthQtrOfLastFy = "_fourthQtrOfLastFy";
    public static final java.lang.String __fourthQtrOfThisFy = "_fourthQtrOfThisFy";
    public static final java.lang.String __lastFiscalYear = "_lastFiscalYear";
    public static final java.lang.String __lastPeriod = "_lastPeriod";
    public static final java.lang.String __lastPeriodOneQtrAgo = "_lastPeriodOneQtrAgo";
    public static final java.lang.String __lastPeriodOneYearAgo = "_lastPeriodOneYearAgo";
    public static final java.lang.String __lastQtrOfOneYearAgo = "_lastQtrOfOneYearAgo";
    public static final java.lang.String __lastQuarter = "_lastQuarter";
    public static final java.lang.String __periodBeforeLast = "_periodBeforeLast";
    public static final java.lang.String __quarterBeforeLast = "_quarterBeforeLast";
    public static final java.lang.String __samePeriodOfLastFy = "_samePeriodOfLastFy";
    public static final java.lang.String __samePeriodOfLastQtr = "_samePeriodOfLastQtr";
    public static final java.lang.String __sameQtrOfLastFy = "_sameQtrOfLastFy";
    public static final java.lang.String __secondQtrOfLastFy = "_secondQtrOfLastFy";
    public static final java.lang.String __secondQtrOfThisFy = "_secondQtrOfThisFy";
    public static final java.lang.String __thirdQtrOfLastFy = "_thirdQtrOfLastFy";
    public static final java.lang.String __thirdQtrOfThisFy = "_thirdQtrOfThisFy";
    public static final java.lang.String __thisFiscalYear = "_thisFiscalYear";
    public static final java.lang.String __thisPeriod = "_thisPeriod";
    public static final java.lang.String __thisQuarter = "_thisQuarter";
    public static final PostingPeriodDate _firstQtrOfLastFy = new PostingPeriodDate(__firstQtrOfLastFy);
    public static final PostingPeriodDate _firstQtrOfThisFy = new PostingPeriodDate(__firstQtrOfThisFy);
    public static final PostingPeriodDate _fiscalYearBeforeLast = new PostingPeriodDate(__fiscalYearBeforeLast);
    public static final PostingPeriodDate _fourthQtrOfLastFy = new PostingPeriodDate(__fourthQtrOfLastFy);
    public static final PostingPeriodDate _fourthQtrOfThisFy = new PostingPeriodDate(__fourthQtrOfThisFy);
    public static final PostingPeriodDate _lastFiscalYear = new PostingPeriodDate(__lastFiscalYear);
    public static final PostingPeriodDate _lastPeriod = new PostingPeriodDate(__lastPeriod);
    public static final PostingPeriodDate _lastPeriodOneQtrAgo = new PostingPeriodDate(__lastPeriodOneQtrAgo);
    public static final PostingPeriodDate _lastPeriodOneYearAgo = new PostingPeriodDate(__lastPeriodOneYearAgo);
    public static final PostingPeriodDate _lastQtrOfOneYearAgo = new PostingPeriodDate(__lastQtrOfOneYearAgo);
    public static final PostingPeriodDate _lastQuarter = new PostingPeriodDate(__lastQuarter);
    public static final PostingPeriodDate _periodBeforeLast = new PostingPeriodDate(__periodBeforeLast);
    public static final PostingPeriodDate _quarterBeforeLast = new PostingPeriodDate(__quarterBeforeLast);
    public static final PostingPeriodDate _samePeriodOfLastFy = new PostingPeriodDate(__samePeriodOfLastFy);
    public static final PostingPeriodDate _samePeriodOfLastQtr = new PostingPeriodDate(__samePeriodOfLastQtr);
    public static final PostingPeriodDate _sameQtrOfLastFy = new PostingPeriodDate(__sameQtrOfLastFy);
    public static final PostingPeriodDate _secondQtrOfLastFy = new PostingPeriodDate(__secondQtrOfLastFy);
    public static final PostingPeriodDate _secondQtrOfThisFy = new PostingPeriodDate(__secondQtrOfThisFy);
    public static final PostingPeriodDate _thirdQtrOfLastFy = new PostingPeriodDate(__thirdQtrOfLastFy);
    public static final PostingPeriodDate _thirdQtrOfThisFy = new PostingPeriodDate(__thirdQtrOfThisFy);
    public static final PostingPeriodDate _thisFiscalYear = new PostingPeriodDate(__thisFiscalYear);
    public static final PostingPeriodDate _thisPeriod = new PostingPeriodDate(__thisPeriod);
    public static final PostingPeriodDate _thisQuarter = new PostingPeriodDate(__thisQuarter);
    public java.lang.String getValue() { return _value_;}
    public static PostingPeriodDate fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PostingPeriodDate enumeration = (PostingPeriodDate)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PostingPeriodDate fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PostingPeriodDate.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "PostingPeriodDate"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
