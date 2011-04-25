/**
 * FaultCodeType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class FaultCodeType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FaultCodeType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ACCT_TEMP_UNAVAILABLE = "ACCT_TEMP_UNAVAILABLE";
    public static final java.lang.String _EMAIL_ADDRS_REQD = "EMAIL_ADDRS_REQD";
    public static final java.lang.String _INVALID_ACCT = "INVALID_ACCT";
    public static final java.lang.String _INVALID_JOB_ID = "INVALID_JOB_ID";
    public static final java.lang.String _INVALID_LOGIN_CREDENTIALS = "INVALID_LOGIN_CREDENTIALS";
    public static final java.lang.String _INVALID_PAGE_INDEX = "INVALID_PAGE_INDEX";
    public static final java.lang.String _INVALID_ROLE = "INVALID_ROLE";
    public static final java.lang.String _INVALID_WS_VERSION = "INVALID_WS_VERSION";
    public static final java.lang.String _JOB_NOT_COMPLETE = "JOB_NOT_COMPLETE";
    public static final java.lang.String _LOGIN_DISABLED = "LOGIN_DISABLED";
    public static final java.lang.String _MAX_RCRDS_EXCEEDED = "MAX_RCRDS_EXCEEDED";
    public static final java.lang.String _OI_FEATURE_REQD = "OI_FEATURE_REQD";
    public static final java.lang.String _OI_PERMISSION_REQD = "OI_PERMISSION_REQD";
    public static final java.lang.String _PSWD_REQD = "PSWD_REQD";
    public static final java.lang.String _ROLE_REQUIRED = "ROLE_REQUIRED";
    public static final java.lang.String _SESSION_TIMED_OUT = "SESSION_TIMED_OUT";
    public static final java.lang.String _UNEXPECTED_ERROR = "UNEXPECTED_ERROR";
    public static final java.lang.String _UNSUPPORTED_WS_VERSION = "UNSUPPORTED_WS_VERSION";
    public static final java.lang.String _USER_ERROR = "USER_ERROR";
    public static final java.lang.String _WS_CONCUR_SESSION_DISALLWD = "WS_CONCUR_SESSION_DISALLWD";
    public static final java.lang.String _WS_FEATURE_REQD = "WS_FEATURE_REQD";
    public static final java.lang.String _WS_PERMISSION_REQD = "WS_PERMISSION_REQD";
    public static final java.lang.String _WS_LOG_IN_REQD = "WS_LOG_IN_REQD";
    public static final FaultCodeType ACCT_TEMP_UNAVAILABLE = new FaultCodeType(_ACCT_TEMP_UNAVAILABLE);
    public static final FaultCodeType EMAIL_ADDRS_REQD = new FaultCodeType(_EMAIL_ADDRS_REQD);
    public static final FaultCodeType INVALID_ACCT = new FaultCodeType(_INVALID_ACCT);
    public static final FaultCodeType INVALID_JOB_ID = new FaultCodeType(_INVALID_JOB_ID);
    public static final FaultCodeType INVALID_LOGIN_CREDENTIALS = new FaultCodeType(_INVALID_LOGIN_CREDENTIALS);
    public static final FaultCodeType INVALID_PAGE_INDEX = new FaultCodeType(_INVALID_PAGE_INDEX);
    public static final FaultCodeType INVALID_ROLE = new FaultCodeType(_INVALID_ROLE);
    public static final FaultCodeType INVALID_WS_VERSION = new FaultCodeType(_INVALID_WS_VERSION);
    public static final FaultCodeType JOB_NOT_COMPLETE = new FaultCodeType(_JOB_NOT_COMPLETE);
    public static final FaultCodeType LOGIN_DISABLED = new FaultCodeType(_LOGIN_DISABLED);
    public static final FaultCodeType MAX_RCRDS_EXCEEDED = new FaultCodeType(_MAX_RCRDS_EXCEEDED);
    public static final FaultCodeType OI_FEATURE_REQD = new FaultCodeType(_OI_FEATURE_REQD);
    public static final FaultCodeType OI_PERMISSION_REQD = new FaultCodeType(_OI_PERMISSION_REQD);
    public static final FaultCodeType PSWD_REQD = new FaultCodeType(_PSWD_REQD);
    public static final FaultCodeType ROLE_REQUIRED = new FaultCodeType(_ROLE_REQUIRED);
    public static final FaultCodeType SESSION_TIMED_OUT = new FaultCodeType(_SESSION_TIMED_OUT);
    public static final FaultCodeType UNEXPECTED_ERROR = new FaultCodeType(_UNEXPECTED_ERROR);
    public static final FaultCodeType UNSUPPORTED_WS_VERSION = new FaultCodeType(_UNSUPPORTED_WS_VERSION);
    public static final FaultCodeType USER_ERROR = new FaultCodeType(_USER_ERROR);
    public static final FaultCodeType WS_CONCUR_SESSION_DISALLWD = new FaultCodeType(_WS_CONCUR_SESSION_DISALLWD);
    public static final FaultCodeType WS_FEATURE_REQD = new FaultCodeType(_WS_FEATURE_REQD);
    public static final FaultCodeType WS_PERMISSION_REQD = new FaultCodeType(_WS_PERMISSION_REQD);
    public static final FaultCodeType WS_LOG_IN_REQD = new FaultCodeType(_WS_LOG_IN_REQD);
    public java.lang.String getValue() { return _value_;}
    public static FaultCodeType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FaultCodeType enumeration = (FaultCodeType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FaultCodeType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FaultCodeType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:types.faults_2010_2.platform.webservices.netsuite.com", "FaultCodeType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
