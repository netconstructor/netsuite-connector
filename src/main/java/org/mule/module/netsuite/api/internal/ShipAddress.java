/**
 * ShipAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ShipAddress  implements java.io.Serializable {
    private java.lang.String shipAttention;

    private java.lang.String shipAddressee;

    private java.lang.String shipPhone;

    private java.lang.String shipAddr1;

    private java.lang.String shipAddr2;

    private java.lang.String shipCity;

    private java.lang.String shipState;

    private java.lang.String shipZip;

    private org.mule.module.netsuite.api.internal.Country shipCountry;

    private java.lang.Boolean shipIsResidential;

    public ShipAddress() {
    }

    public ShipAddress(
           java.lang.String shipAttention,
           java.lang.String shipAddressee,
           java.lang.String shipPhone,
           java.lang.String shipAddr1,
           java.lang.String shipAddr2,
           java.lang.String shipCity,
           java.lang.String shipState,
           java.lang.String shipZip,
           org.mule.module.netsuite.api.internal.Country shipCountry,
           java.lang.Boolean shipIsResidential) {
           this.shipAttention = shipAttention;
           this.shipAddressee = shipAddressee;
           this.shipPhone = shipPhone;
           this.shipAddr1 = shipAddr1;
           this.shipAddr2 = shipAddr2;
           this.shipCity = shipCity;
           this.shipState = shipState;
           this.shipZip = shipZip;
           this.shipCountry = shipCountry;
           this.shipIsResidential = shipIsResidential;
    }


    /**
     * Gets the shipAttention value for this ShipAddress.
     * 
     * @return shipAttention
     */
    public java.lang.String getShipAttention() {
        return shipAttention;
    }


    /**
     * Sets the shipAttention value for this ShipAddress.
     * 
     * @param shipAttention
     */
    public void setShipAttention(java.lang.String shipAttention) {
        this.shipAttention = shipAttention;
    }


    /**
     * Gets the shipAddressee value for this ShipAddress.
     * 
     * @return shipAddressee
     */
    public java.lang.String getShipAddressee() {
        return shipAddressee;
    }


    /**
     * Sets the shipAddressee value for this ShipAddress.
     * 
     * @param shipAddressee
     */
    public void setShipAddressee(java.lang.String shipAddressee) {
        this.shipAddressee = shipAddressee;
    }


    /**
     * Gets the shipPhone value for this ShipAddress.
     * 
     * @return shipPhone
     */
    public java.lang.String getShipPhone() {
        return shipPhone;
    }


    /**
     * Sets the shipPhone value for this ShipAddress.
     * 
     * @param shipPhone
     */
    public void setShipPhone(java.lang.String shipPhone) {
        this.shipPhone = shipPhone;
    }


    /**
     * Gets the shipAddr1 value for this ShipAddress.
     * 
     * @return shipAddr1
     */
    public java.lang.String getShipAddr1() {
        return shipAddr1;
    }


    /**
     * Sets the shipAddr1 value for this ShipAddress.
     * 
     * @param shipAddr1
     */
    public void setShipAddr1(java.lang.String shipAddr1) {
        this.shipAddr1 = shipAddr1;
    }


    /**
     * Gets the shipAddr2 value for this ShipAddress.
     * 
     * @return shipAddr2
     */
    public java.lang.String getShipAddr2() {
        return shipAddr2;
    }


    /**
     * Sets the shipAddr2 value for this ShipAddress.
     * 
     * @param shipAddr2
     */
    public void setShipAddr2(java.lang.String shipAddr2) {
        this.shipAddr2 = shipAddr2;
    }


    /**
     * Gets the shipCity value for this ShipAddress.
     * 
     * @return shipCity
     */
    public java.lang.String getShipCity() {
        return shipCity;
    }


    /**
     * Sets the shipCity value for this ShipAddress.
     * 
     * @param shipCity
     */
    public void setShipCity(java.lang.String shipCity) {
        this.shipCity = shipCity;
    }


    /**
     * Gets the shipState value for this ShipAddress.
     * 
     * @return shipState
     */
    public java.lang.String getShipState() {
        return shipState;
    }


    /**
     * Sets the shipState value for this ShipAddress.
     * 
     * @param shipState
     */
    public void setShipState(java.lang.String shipState) {
        this.shipState = shipState;
    }


    /**
     * Gets the shipZip value for this ShipAddress.
     * 
     * @return shipZip
     */
    public java.lang.String getShipZip() {
        return shipZip;
    }


    /**
     * Sets the shipZip value for this ShipAddress.
     * 
     * @param shipZip
     */
    public void setShipZip(java.lang.String shipZip) {
        this.shipZip = shipZip;
    }


    /**
     * Gets the shipCountry value for this ShipAddress.
     * 
     * @return shipCountry
     */
    public org.mule.module.netsuite.api.internal.Country getShipCountry() {
        return shipCountry;
    }


    /**
     * Sets the shipCountry value for this ShipAddress.
     * 
     * @param shipCountry
     */
    public void setShipCountry(org.mule.module.netsuite.api.internal.Country shipCountry) {
        this.shipCountry = shipCountry;
    }


    /**
     * Gets the shipIsResidential value for this ShipAddress.
     * 
     * @return shipIsResidential
     */
    public java.lang.Boolean getShipIsResidential() {
        return shipIsResidential;
    }


    /**
     * Sets the shipIsResidential value for this ShipAddress.
     * 
     * @param shipIsResidential
     */
    public void setShipIsResidential(java.lang.Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ShipAddress)) return false;
        ShipAddress other = (ShipAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipAttention==null && other.getShipAttention()==null) || 
             (this.shipAttention!=null &&
              this.shipAttention.equals(other.getShipAttention()))) &&
            ((this.shipAddressee==null && other.getShipAddressee()==null) || 
             (this.shipAddressee!=null &&
              this.shipAddressee.equals(other.getShipAddressee()))) &&
            ((this.shipPhone==null && other.getShipPhone()==null) || 
             (this.shipPhone!=null &&
              this.shipPhone.equals(other.getShipPhone()))) &&
            ((this.shipAddr1==null && other.getShipAddr1()==null) || 
             (this.shipAddr1!=null &&
              this.shipAddr1.equals(other.getShipAddr1()))) &&
            ((this.shipAddr2==null && other.getShipAddr2()==null) || 
             (this.shipAddr2!=null &&
              this.shipAddr2.equals(other.getShipAddr2()))) &&
            ((this.shipCity==null && other.getShipCity()==null) || 
             (this.shipCity!=null &&
              this.shipCity.equals(other.getShipCity()))) &&
            ((this.shipState==null && other.getShipState()==null) || 
             (this.shipState!=null &&
              this.shipState.equals(other.getShipState()))) &&
            ((this.shipZip==null && other.getShipZip()==null) || 
             (this.shipZip!=null &&
              this.shipZip.equals(other.getShipZip()))) &&
            ((this.shipCountry==null && other.getShipCountry()==null) || 
             (this.shipCountry!=null &&
              this.shipCountry.equals(other.getShipCountry()))) &&
            ((this.shipIsResidential==null && other.getShipIsResidential()==null) || 
             (this.shipIsResidential!=null &&
              this.shipIsResidential.equals(other.getShipIsResidential())));
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
        if (getShipAttention() != null) {
            _hashCode += getShipAttention().hashCode();
        }
        if (getShipAddressee() != null) {
            _hashCode += getShipAddressee().hashCode();
        }
        if (getShipPhone() != null) {
            _hashCode += getShipPhone().hashCode();
        }
        if (getShipAddr1() != null) {
            _hashCode += getShipAddr1().hashCode();
        }
        if (getShipAddr2() != null) {
            _hashCode += getShipAddr2().hashCode();
        }
        if (getShipCity() != null) {
            _hashCode += getShipCity().hashCode();
        }
        if (getShipState() != null) {
            _hashCode += getShipState().hashCode();
        }
        if (getShipZip() != null) {
            _hashCode += getShipZip().hashCode();
        }
        if (getShipCountry() != null) {
            _hashCode += getShipCountry().hashCode();
        }
        if (getShipIsResidential() != null) {
            _hashCode += getShipIsResidential().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ShipAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ShipAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipAddr2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipAddr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "shipIsResidential"));
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
