/**
 * InventoryItemBinNumber.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class InventoryItemBinNumber  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef binNumber;

    private java.lang.String onHand;

    private java.lang.String onHandAvail;

    private java.lang.String location;

    private java.lang.Boolean preferredBin;

    public InventoryItemBinNumber() {
    }

    public InventoryItemBinNumber(
           org.mule.module.netsuite.api.internal.RecordRef binNumber,
           java.lang.String onHand,
           java.lang.String onHandAvail,
           java.lang.String location,
           java.lang.Boolean preferredBin) {
           this.binNumber = binNumber;
           this.onHand = onHand;
           this.onHandAvail = onHandAvail;
           this.location = location;
           this.preferredBin = preferredBin;
    }


    /**
     * Gets the binNumber value for this InventoryItemBinNumber.
     * 
     * @return binNumber
     */
    public org.mule.module.netsuite.api.internal.RecordRef getBinNumber() {
        return binNumber;
    }


    /**
     * Sets the binNumber value for this InventoryItemBinNumber.
     * 
     * @param binNumber
     */
    public void setBinNumber(org.mule.module.netsuite.api.internal.RecordRef binNumber) {
        this.binNumber = binNumber;
    }


    /**
     * Gets the onHand value for this InventoryItemBinNumber.
     * 
     * @return onHand
     */
    public java.lang.String getOnHand() {
        return onHand;
    }


    /**
     * Sets the onHand value for this InventoryItemBinNumber.
     * 
     * @param onHand
     */
    public void setOnHand(java.lang.String onHand) {
        this.onHand = onHand;
    }


    /**
     * Gets the onHandAvail value for this InventoryItemBinNumber.
     * 
     * @return onHandAvail
     */
    public java.lang.String getOnHandAvail() {
        return onHandAvail;
    }


    /**
     * Sets the onHandAvail value for this InventoryItemBinNumber.
     * 
     * @param onHandAvail
     */
    public void setOnHandAvail(java.lang.String onHandAvail) {
        this.onHandAvail = onHandAvail;
    }


    /**
     * Gets the location value for this InventoryItemBinNumber.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this InventoryItemBinNumber.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the preferredBin value for this InventoryItemBinNumber.
     * 
     * @return preferredBin
     */
    public java.lang.Boolean getPreferredBin() {
        return preferredBin;
    }


    /**
     * Sets the preferredBin value for this InventoryItemBinNumber.
     * 
     * @param preferredBin
     */
    public void setPreferredBin(java.lang.Boolean preferredBin) {
        this.preferredBin = preferredBin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InventoryItemBinNumber)) return false;
        InventoryItemBinNumber other = (InventoryItemBinNumber) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.binNumber==null && other.getBinNumber()==null) || 
             (this.binNumber!=null &&
              this.binNumber.equals(other.getBinNumber()))) &&
            ((this.onHand==null && other.getOnHand()==null) || 
             (this.onHand!=null &&
              this.onHand.equals(other.getOnHand()))) &&
            ((this.onHandAvail==null && other.getOnHandAvail()==null) || 
             (this.onHandAvail!=null &&
              this.onHandAvail.equals(other.getOnHandAvail()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.preferredBin==null && other.getPreferredBin()==null) || 
             (this.preferredBin!=null &&
              this.preferredBin.equals(other.getPreferredBin())));
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
        if (getBinNumber() != null) {
            _hashCode += getBinNumber().hashCode();
        }
        if (getOnHand() != null) {
            _hashCode += getOnHand().hashCode();
        }
        if (getOnHandAvail() != null) {
            _hashCode += getOnHandAvail().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getPreferredBin() != null) {
            _hashCode += getPreferredBin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InventoryItemBinNumber.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "InventoryItemBinNumber"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "onHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHandAvail");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "onHandAvail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
