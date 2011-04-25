/**
 * ItemFulfillmentPackageList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackageList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ItemFulfillmentPackage[] _package;

    private boolean replaceAll;  // attribute

    public ItemFulfillmentPackageList() {
    }

    public ItemFulfillmentPackageList(
           org.mule.module.netsuite.api.internal.ItemFulfillmentPackage[] _package,
           boolean replaceAll) {
           this._package = _package;
           this.replaceAll = replaceAll;
    }


    /**
     * Gets the _package value for this ItemFulfillmentPackageList.
     * 
     * @return _package
     */
    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackage[] get_package() {
        return _package;
    }


    /**
     * Sets the _package value for this ItemFulfillmentPackageList.
     * 
     * @param _package
     */
    public void set_package(org.mule.module.netsuite.api.internal.ItemFulfillmentPackage[] _package) {
        this._package = _package;
    }

    public org.mule.module.netsuite.api.internal.ItemFulfillmentPackage get_package(int i) {
        return this._package[i];
    }

    public void set_package(int i, org.mule.module.netsuite.api.internal.ItemFulfillmentPackage _value) {
        this._package[i] = _value;
    }


    /**
     * Gets the replaceAll value for this ItemFulfillmentPackageList.
     * 
     * @return replaceAll
     */
    public boolean isReplaceAll() {
        return replaceAll;
    }


    /**
     * Sets the replaceAll value for this ItemFulfillmentPackageList.
     * 
     * @param replaceAll
     */
    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageList)) return false;
        ItemFulfillmentPackageList other = (ItemFulfillmentPackageList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._package==null && other.get_package()==null) || 
             (this._package!=null &&
              java.util.Arrays.equals(this._package, other.get_package()))) &&
            this.replaceAll == other.isReplaceAll();
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
        if (get_package() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(get_package());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(get_package(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isReplaceAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackageList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackageList"));
        org.apache.axis.description.AttributeDesc attrField = new org.apache.axis.description.AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new javax.xml.namespace.QName("", "replaceAll"));
        attrField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc(attrField);
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_package");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "package"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
