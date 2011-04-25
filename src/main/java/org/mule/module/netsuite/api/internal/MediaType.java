/**
 * MediaType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class MediaType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MediaType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __AUTOCAD = "_AUTOCAD";
    public static final java.lang.String __BMPIMAGE = "_BMPIMAGE";
    public static final java.lang.String __CSV = "_CSV";
    public static final java.lang.String __EXCEL = "_EXCEL";
    public static final java.lang.String __FLASH = "_FLASH";
    public static final java.lang.String __GIFIMAGE = "_GIFIMAGE";
    public static final java.lang.String __GZIP = "_GZIP";
    public static final java.lang.String __HTMLDOC = "_HTMLDOC";
    public static final java.lang.String __ICON = "_ICON";
    public static final java.lang.String __IMAGE = "_IMAGE";
    public static final java.lang.String __JAVASCRIPT = "_JAVASCRIPT";
    public static final java.lang.String __JPGIMAGE = "_JPGIMAGE";
    public static final java.lang.String __MESSAGERFC = "_MESSAGERFC";
    public static final java.lang.String __MISCBINARY = "_MISCBINARY";
    public static final java.lang.String __MISCTEXT = "_MISCTEXT";
    public static final java.lang.String __MP3 = "_MP3";
    public static final java.lang.String __MPEGMOVIE = "_MPEGMOVIE";
    public static final java.lang.String __MSPROJECT = "_MSPROJECT";
    public static final java.lang.String __PDF = "_PDF";
    public static final java.lang.String __PJPGIMAGE = "_PJPGIMAGE";
    public static final java.lang.String __PLAINTEXT = "_PLAINTEXT";
    public static final java.lang.String __PNGIMAGE = "_PNGIMAGE";
    public static final java.lang.String __POSTSCRIPT = "_POSTSCRIPT";
    public static final java.lang.String __POWERPOINT = "_POWERPOINT";
    public static final java.lang.String __QUICKTIME = "_QUICKTIME";
    public static final java.lang.String __RTF = "_RTF";
    public static final java.lang.String __SMS = "_SMS";
    public static final java.lang.String __STYLESHEET = "_STYLESHEET";
    public static final java.lang.String __TIFFIMAGE = "_TIFFIMAGE";
    public static final java.lang.String __VISIO = "_VISIO";
    public static final java.lang.String __WORD = "_WORD";
    public static final java.lang.String __XMLDOC = "_XMLDOC";
    public static final java.lang.String __ZIP = "_ZIP";
    public static final MediaType _AUTOCAD = new MediaType(__AUTOCAD);
    public static final MediaType _BMPIMAGE = new MediaType(__BMPIMAGE);
    public static final MediaType _CSV = new MediaType(__CSV);
    public static final MediaType _EXCEL = new MediaType(__EXCEL);
    public static final MediaType _FLASH = new MediaType(__FLASH);
    public static final MediaType _GIFIMAGE = new MediaType(__GIFIMAGE);
    public static final MediaType _GZIP = new MediaType(__GZIP);
    public static final MediaType _HTMLDOC = new MediaType(__HTMLDOC);
    public static final MediaType _ICON = new MediaType(__ICON);
    public static final MediaType _IMAGE = new MediaType(__IMAGE);
    public static final MediaType _JAVASCRIPT = new MediaType(__JAVASCRIPT);
    public static final MediaType _JPGIMAGE = new MediaType(__JPGIMAGE);
    public static final MediaType _MESSAGERFC = new MediaType(__MESSAGERFC);
    public static final MediaType _MISCBINARY = new MediaType(__MISCBINARY);
    public static final MediaType _MISCTEXT = new MediaType(__MISCTEXT);
    public static final MediaType _MP3 = new MediaType(__MP3);
    public static final MediaType _MPEGMOVIE = new MediaType(__MPEGMOVIE);
    public static final MediaType _MSPROJECT = new MediaType(__MSPROJECT);
    public static final MediaType _PDF = new MediaType(__PDF);
    public static final MediaType _PJPGIMAGE = new MediaType(__PJPGIMAGE);
    public static final MediaType _PLAINTEXT = new MediaType(__PLAINTEXT);
    public static final MediaType _PNGIMAGE = new MediaType(__PNGIMAGE);
    public static final MediaType _POSTSCRIPT = new MediaType(__POSTSCRIPT);
    public static final MediaType _POWERPOINT = new MediaType(__POWERPOINT);
    public static final MediaType _QUICKTIME = new MediaType(__QUICKTIME);
    public static final MediaType _RTF = new MediaType(__RTF);
    public static final MediaType _SMS = new MediaType(__SMS);
    public static final MediaType _STYLESHEET = new MediaType(__STYLESHEET);
    public static final MediaType _TIFFIMAGE = new MediaType(__TIFFIMAGE);
    public static final MediaType _VISIO = new MediaType(__VISIO);
    public static final MediaType _WORD = new MediaType(__WORD);
    public static final MediaType _XMLDOC = new MediaType(__XMLDOC);
    public static final MediaType _ZIP = new MediaType(__ZIP);
    public java.lang.String getValue() { return _value_;}
    public static MediaType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MediaType enumeration = (MediaType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MediaType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MediaType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.filecabinet_2010_2.documents.webservices.netsuite.com", "MediaType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
