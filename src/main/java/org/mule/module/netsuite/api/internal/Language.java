/**
 * Language.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class Language implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Language(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __arabic = "_arabic";
    public static final java.lang.String __australian = "_australian";
    public static final java.lang.String __bengali = "_bengali";
    public static final java.lang.String __bulgarian = "_bulgarian";
    public static final java.lang.String __catalan = "_catalan";
    public static final java.lang.String __chineseSimplified = "_chineseSimplified";
    public static final java.lang.String __chineseTraditional = "_chineseTraditional";
    public static final java.lang.String __croatian = "_croatian";
    public static final java.lang.String __czech = "_czech";
    public static final java.lang.String __danish = "_danish";
    public static final java.lang.String __dutch = "_dutch";
    public static final java.lang.String __english = "_english";
    public static final java.lang.String __estonian = "_estonian";
    public static final java.lang.String __finnish = "_finnish";
    public static final java.lang.String __frenchCanada = "_frenchCanada";
    public static final java.lang.String __frenchFrance = "_frenchFrance";
    public static final java.lang.String __german = "_german";
    public static final java.lang.String __greek = "_greek";
    public static final java.lang.String __haitian = "_haitian";
    public static final java.lang.String __hebrew = "_hebrew";
    public static final java.lang.String __hungarian = "_hungarian";
    public static final java.lang.String __icelandic = "_icelandic";
    public static final java.lang.String __indonesian = "_indonesian";
    public static final java.lang.String __italian = "_italian";
    public static final java.lang.String __japanese = "_japanese";
    public static final java.lang.String __korean = "_korean";
    public static final java.lang.String __latvian = "_latvian";
    public static final java.lang.String __lithuanian = "_lithuanian";
    public static final java.lang.String __norwegian = "_norwegian";
    public static final java.lang.String __polish = "_polish";
    public static final java.lang.String __portugueseBrazil = "_portugueseBrazil";
    public static final java.lang.String __portuguesePortugal = "_portuguesePortugal";
    public static final java.lang.String __romanian = "_romanian";
    public static final java.lang.String __russian = "_russian";
    public static final java.lang.String __slovak = "_slovak";
    public static final java.lang.String __slovenian = "_slovenian";
    public static final java.lang.String __spanish = "_spanish";
    public static final java.lang.String __swedish = "_swedish";
    public static final java.lang.String __thai = "_thai";
    public static final java.lang.String __turkish = "_turkish";
    public static final java.lang.String __usEnglish = "_usEnglish";
    public static final java.lang.String __vietnamese = "_vietnamese";
    public static final Language _arabic = new Language(__arabic);
    public static final Language _australian = new Language(__australian);
    public static final Language _bengali = new Language(__bengali);
    public static final Language _bulgarian = new Language(__bulgarian);
    public static final Language _catalan = new Language(__catalan);
    public static final Language _chineseSimplified = new Language(__chineseSimplified);
    public static final Language _chineseTraditional = new Language(__chineseTraditional);
    public static final Language _croatian = new Language(__croatian);
    public static final Language _czech = new Language(__czech);
    public static final Language _danish = new Language(__danish);
    public static final Language _dutch = new Language(__dutch);
    public static final Language _english = new Language(__english);
    public static final Language _estonian = new Language(__estonian);
    public static final Language _finnish = new Language(__finnish);
    public static final Language _frenchCanada = new Language(__frenchCanada);
    public static final Language _frenchFrance = new Language(__frenchFrance);
    public static final Language _german = new Language(__german);
    public static final Language _greek = new Language(__greek);
    public static final Language _haitian = new Language(__haitian);
    public static final Language _hebrew = new Language(__hebrew);
    public static final Language _hungarian = new Language(__hungarian);
    public static final Language _icelandic = new Language(__icelandic);
    public static final Language _indonesian = new Language(__indonesian);
    public static final Language _italian = new Language(__italian);
    public static final Language _japanese = new Language(__japanese);
    public static final Language _korean = new Language(__korean);
    public static final Language _latvian = new Language(__latvian);
    public static final Language _lithuanian = new Language(__lithuanian);
    public static final Language _norwegian = new Language(__norwegian);
    public static final Language _polish = new Language(__polish);
    public static final Language _portugueseBrazil = new Language(__portugueseBrazil);
    public static final Language _portuguesePortugal = new Language(__portuguesePortugal);
    public static final Language _romanian = new Language(__romanian);
    public static final Language _russian = new Language(__russian);
    public static final Language _slovak = new Language(__slovak);
    public static final Language _slovenian = new Language(__slovenian);
    public static final Language _spanish = new Language(__spanish);
    public static final Language _swedish = new Language(__swedish);
    public static final Language _thai = new Language(__thai);
    public static final Language _turkish = new Language(__turkish);
    public static final Language _usEnglish = new Language(__usEnglish);
    public static final Language _vietnamese = new Language(__vietnamese);
    public java.lang.String getValue() { return _value_;}
    public static Language fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Language enumeration = (Language)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Language fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Language.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Language"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
