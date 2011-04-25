/**
 * CustomRecordTypeChildren.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class CustomRecordTypeChildren  implements java.io.Serializable {
    private java.lang.String childDescr;

    private org.mule.module.netsuite.api.internal.RecordRef childTab;

    public CustomRecordTypeChildren() {
    }

    public CustomRecordTypeChildren(
           java.lang.String childDescr,
           org.mule.module.netsuite.api.internal.RecordRef childTab) {
           this.childDescr = childDescr;
           this.childTab = childTab;
    }


    /**
     * Gets the childDescr value for this CustomRecordTypeChildren.
     * 
     * @return childDescr
     */
    public java.lang.String getChildDescr() {
        return childDescr;
    }


    /**
     * Sets the childDescr value for this CustomRecordTypeChildren.
     * 
     * @param childDescr
     */
    public void setChildDescr(java.lang.String childDescr) {
        this.childDescr = childDescr;
    }


    /**
     * Gets the childTab value for this CustomRecordTypeChildren.
     * 
     * @return childTab
     */
    public org.mule.module.netsuite.api.internal.RecordRef getChildTab() {
        return childTab;
    }


    /**
     * Sets the childTab value for this CustomRecordTypeChildren.
     * 
     * @param childTab
     */
    public void setChildTab(org.mule.module.netsuite.api.internal.RecordRef childTab) {
        this.childTab = childTab;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomRecordTypeChildren)) return false;
        CustomRecordTypeChildren other = (CustomRecordTypeChildren) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.childDescr==null && other.getChildDescr()==null) || 
             (this.childDescr!=null &&
              this.childDescr.equals(other.getChildDescr()))) &&
            ((this.childTab==null && other.getChildTab()==null) || 
             (this.childTab!=null &&
              this.childTab.equals(other.getChildTab())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getChildDescr() != null) {
            _hashCode += getChildDescr().hashCode();
        }
        if (getChildTab() != null) {
            _hashCode += getChildTab().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomRecordTypeChildren.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "CustomRecordTypeChildren"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "childDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("childTab");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "childTab"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
