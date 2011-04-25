/**
 * FileSearch.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class FileSearch  extends org.mule.module.netsuite.api.internal.SearchRecord  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.FileSearchBasic basic;

    private org.mule.module.netsuite.api.internal.CustomerSearchBasic shopperJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin;

    public FileSearch() {
    }

    public FileSearch(
           org.mule.module.netsuite.api.internal.FileSearchBasic basic,
           org.mule.module.netsuite.api.internal.CustomerSearchBasic shopperJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin) {
        this.basic = basic;
        this.shopperJoin = shopperJoin;
        this.userJoin = userJoin;
    }


    /**
     * Gets the basic value for this FileSearch.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.FileSearchBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this FileSearch.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.FileSearchBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the shopperJoin value for this FileSearch.
     * 
     * @return shopperJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchBasic getShopperJoin() {
        return shopperJoin;
    }


    /**
     * Sets the shopperJoin value for this FileSearch.
     * 
     * @param shopperJoin
     */
    public void setShopperJoin(org.mule.module.netsuite.api.internal.CustomerSearchBasic shopperJoin) {
        this.shopperJoin = shopperJoin;
    }


    /**
     * Gets the userJoin value for this FileSearch.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this FileSearch.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FileSearch)) return false;
        FileSearch other = (FileSearch) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.basic==null && other.getBasic()==null) || 
             (this.basic!=null &&
              this.basic.equals(other.getBasic()))) &&
            ((this.shopperJoin==null && other.getShopperJoin()==null) || 
             (this.shopperJoin!=null &&
              this.shopperJoin.equals(other.getShopperJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBasic() != null) {
            _hashCode += getBasic().hashCode();
        }
        if (getShopperJoin() != null) {
            _hashCode += getShopperJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FileSearch.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "FileSearch"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "shopperJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:filecabinet_2010_2.documents.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
