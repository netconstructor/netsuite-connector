/**
 * ItemFulfillmentPackage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemFulfillmentPackage  implements java.io.Serializable {
    private java.lang.Double packageWeight;

    private java.lang.String packageDescr;

    private java.lang.String packageTrackingNumber;

    public ItemFulfillmentPackage() {
    }

    public ItemFulfillmentPackage(
           java.lang.Double packageWeight,
           java.lang.String packageDescr,
           java.lang.String packageTrackingNumber) {
           this.packageWeight = packageWeight;
           this.packageDescr = packageDescr;
           this.packageTrackingNumber = packageTrackingNumber;
    }


    /**
     * Gets the packageWeight value for this ItemFulfillmentPackage.
     * 
     * @return packageWeight
     */
    public java.lang.Double getPackageWeight() {
        return packageWeight;
    }


    /**
     * Sets the packageWeight value for this ItemFulfillmentPackage.
     * 
     * @param packageWeight
     */
    public void setPackageWeight(java.lang.Double packageWeight) {
        this.packageWeight = packageWeight;
    }


    /**
     * Gets the packageDescr value for this ItemFulfillmentPackage.
     * 
     * @return packageDescr
     */
    public java.lang.String getPackageDescr() {
        return packageDescr;
    }


    /**
     * Sets the packageDescr value for this ItemFulfillmentPackage.
     * 
     * @param packageDescr
     */
    public void setPackageDescr(java.lang.String packageDescr) {
        this.packageDescr = packageDescr;
    }


    /**
     * Gets the packageTrackingNumber value for this ItemFulfillmentPackage.
     * 
     * @return packageTrackingNumber
     */
    public java.lang.String getPackageTrackingNumber() {
        return packageTrackingNumber;
    }


    /**
     * Sets the packageTrackingNumber value for this ItemFulfillmentPackage.
     * 
     * @param packageTrackingNumber
     */
    public void setPackageTrackingNumber(java.lang.String packageTrackingNumber) {
        this.packageTrackingNumber = packageTrackingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemFulfillmentPackage)) return false;
        ItemFulfillmentPackage other = (ItemFulfillmentPackage) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.packageWeight==null && other.getPackageWeight()==null) || 
             (this.packageWeight!=null &&
              this.packageWeight.equals(other.getPackageWeight()))) &&
            ((this.packageDescr==null && other.getPackageDescr()==null) || 
             (this.packageDescr!=null &&
              this.packageDescr.equals(other.getPackageDescr()))) &&
            ((this.packageTrackingNumber==null && other.getPackageTrackingNumber()==null) || 
             (this.packageTrackingNumber!=null &&
              this.packageTrackingNumber.equals(other.getPackageTrackingNumber())));
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
        if (getPackageWeight() != null) {
            _hashCode += getPackageWeight().hashCode();
        }
        if (getPackageDescr() != null) {
            _hashCode += getPackageDescr().hashCode();
        }
        if (getPackageTrackingNumber() != null) {
            _hashCode += getPackageTrackingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemFulfillmentPackage.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "ItemFulfillmentPackage"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packageTrackingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "packageTrackingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
