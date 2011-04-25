/**
 * TextFileEncoding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class TextFileEncoding implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TextFileEncoding(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __big5 = "_big5";
    public static final java.lang.String __gb2312 = "_gb2312";
    public static final java.lang.String __gb18030 = "_gb18030";
    public static final java.lang.String __iso88591 = "_iso88591";
    public static final java.lang.String __macRoman = "_macRoman";
    public static final java.lang.String __shiftJis = "_shiftJis";
    public static final java.lang.String __utf8 = "_utf8";
    public static final java.lang.String __windows1252 = "_windows1252";
    public static final TextFileEncoding _big5 = new TextFileEncoding(__big5);
    public static final TextFileEncoding _gb2312 = new TextFileEncoding(__gb2312);
    public static final TextFileEncoding _gb18030 = new TextFileEncoding(__gb18030);
    public static final TextFileEncoding _iso88591 = new TextFileEncoding(__iso88591);
    public static final TextFileEncoding _macRoman = new TextFileEncoding(__macRoman);
    public static final TextFileEncoding _shiftJis = new TextFileEncoding(__shiftJis);
    public static final TextFileEncoding _utf8 = new TextFileEncoding(__utf8);
    public static final TextFileEncoding _windows1252 = new TextFileEncoding(__windows1252);
    public java.lang.String getValue() { return _value_;}
    public static TextFileEncoding fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TextFileEncoding enumeration = (TextFileEncoding)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TextFileEncoding fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TextFileEncoding.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "TextFileEncoding"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
