/**
 * BillAddress.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class BillAddress  implements java.io.Serializable {
    private java.lang.String billAttention;

    private java.lang.String billAddressee;

    private java.lang.String billPhone;

    private java.lang.String billAddr1;

    private java.lang.String billAddr2;

    private java.lang.String billCity;

    private java.lang.String billState;

    private java.lang.String billZip;

    private org.mule.module.netsuite.api.internal.Country billCountry;

    public BillAddress() {
    }

    public BillAddress(
           java.lang.String billAttention,
           java.lang.String billAddressee,
           java.lang.String billPhone,
           java.lang.String billAddr1,
           java.lang.String billAddr2,
           java.lang.String billCity,
           java.lang.String billState,
           java.lang.String billZip,
           org.mule.module.netsuite.api.internal.Country billCountry) {
           this.billAttention = billAttention;
           this.billAddressee = billAddressee;
           this.billPhone = billPhone;
           this.billAddr1 = billAddr1;
           this.billAddr2 = billAddr2;
           this.billCity = billCity;
           this.billState = billState;
           this.billZip = billZip;
           this.billCountry = billCountry;
    }


    /**
     * Gets the billAttention value for this BillAddress.
     * 
     * @return billAttention
     */
    public java.lang.String getBillAttention() {
        return billAttention;
    }


    /**
     * Sets the billAttention value for this BillAddress.
     * 
     * @param billAttention
     */
    public void setBillAttention(java.lang.String billAttention) {
        this.billAttention = billAttention;
    }


    /**
     * Gets the billAddressee value for this BillAddress.
     * 
     * @return billAddressee
     */
    public java.lang.String getBillAddressee() {
        return billAddressee;
    }


    /**
     * Sets the billAddressee value for this BillAddress.
     * 
     * @param billAddressee
     */
    public void setBillAddressee(java.lang.String billAddressee) {
        this.billAddressee = billAddressee;
    }


    /**
     * Gets the billPhone value for this BillAddress.
     * 
     * @return billPhone
     */
    public java.lang.String getBillPhone() {
        return billPhone;
    }


    /**
     * Sets the billPhone value for this BillAddress.
     * 
     * @param billPhone
     */
    public void setBillPhone(java.lang.String billPhone) {
        this.billPhone = billPhone;
    }


    /**
     * Gets the billAddr1 value for this BillAddress.
     * 
     * @return billAddr1
     */
    public java.lang.String getBillAddr1() {
        return billAddr1;
    }


    /**
     * Sets the billAddr1 value for this BillAddress.
     * 
     * @param billAddr1
     */
    public void setBillAddr1(java.lang.String billAddr1) {
        this.billAddr1 = billAddr1;
    }


    /**
     * Gets the billAddr2 value for this BillAddress.
     * 
     * @return billAddr2
     */
    public java.lang.String getBillAddr2() {
        return billAddr2;
    }


    /**
     * Sets the billAddr2 value for this BillAddress.
     * 
     * @param billAddr2
     */
    public void setBillAddr2(java.lang.String billAddr2) {
        this.billAddr2 = billAddr2;
    }


    /**
     * Gets the billCity value for this BillAddress.
     * 
     * @return billCity
     */
    public java.lang.String getBillCity() {
        return billCity;
    }


    /**
     * Sets the billCity value for this BillAddress.
     * 
     * @param billCity
     */
    public void setBillCity(java.lang.String billCity) {
        this.billCity = billCity;
    }


    /**
     * Gets the billState value for this BillAddress.
     * 
     * @return billState
     */
    public java.lang.String getBillState() {
        return billState;
    }


    /**
     * Sets the billState value for this BillAddress.
     * 
     * @param billState
     */
    public void setBillState(java.lang.String billState) {
        this.billState = billState;
    }


    /**
     * Gets the billZip value for this BillAddress.
     * 
     * @return billZip
     */
    public java.lang.String getBillZip() {
        return billZip;
    }


    /**
     * Sets the billZip value for this BillAddress.
     * 
     * @param billZip
     */
    public void setBillZip(java.lang.String billZip) {
        this.billZip = billZip;
    }


    /**
     * Gets the billCountry value for this BillAddress.
     * 
     * @return billCountry
     */
    public org.mule.module.netsuite.api.internal.Country getBillCountry() {
        return billCountry;
    }


    /**
     * Sets the billCountry value for this BillAddress.
     * 
     * @param billCountry
     */
    public void setBillCountry(org.mule.module.netsuite.api.internal.Country billCountry) {
        this.billCountry = billCountry;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BillAddress)) return false;
        BillAddress other = (BillAddress) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billAttention==null && other.getBillAttention()==null) || 
             (this.billAttention!=null &&
              this.billAttention.equals(other.getBillAttention()))) &&
            ((this.billAddressee==null && other.getBillAddressee()==null) || 
             (this.billAddressee!=null &&
              this.billAddressee.equals(other.getBillAddressee()))) &&
            ((this.billPhone==null && other.getBillPhone()==null) || 
             (this.billPhone!=null &&
              this.billPhone.equals(other.getBillPhone()))) &&
            ((this.billAddr1==null && other.getBillAddr1()==null) || 
             (this.billAddr1!=null &&
              this.billAddr1.equals(other.getBillAddr1()))) &&
            ((this.billAddr2==null && other.getBillAddr2()==null) || 
             (this.billAddr2!=null &&
              this.billAddr2.equals(other.getBillAddr2()))) &&
            ((this.billCity==null && other.getBillCity()==null) || 
             (this.billCity!=null &&
              this.billCity.equals(other.getBillCity()))) &&
            ((this.billState==null && other.getBillState()==null) || 
             (this.billState!=null &&
              this.billState.equals(other.getBillState()))) &&
            ((this.billZip==null && other.getBillZip()==null) || 
             (this.billZip!=null &&
              this.billZip.equals(other.getBillZip()))) &&
            ((this.billCountry==null && other.getBillCountry()==null) || 
             (this.billCountry!=null &&
              this.billCountry.equals(other.getBillCountry())));
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
        if (getBillAttention() != null) {
            _hashCode += getBillAttention().hashCode();
        }
        if (getBillAddressee() != null) {
            _hashCode += getBillAddressee().hashCode();
        }
        if (getBillPhone() != null) {
            _hashCode += getBillPhone().hashCode();
        }
        if (getBillAddr1() != null) {
            _hashCode += getBillAddr1().hashCode();
        }
        if (getBillAddr2() != null) {
            _hashCode += getBillAddr2().hashCode();
        }
        if (getBillCity() != null) {
            _hashCode += getBillCity().hashCode();
        }
        if (getBillState() != null) {
            _hashCode += getBillState().hashCode();
        }
        if (getBillZip() != null) {
            _hashCode += getBillZip().hashCode();
        }
        if (getBillCountry() != null) {
            _hashCode += getBillCountry().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BillAddress.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BillAddress"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billAddr2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billAddr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billZip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billZip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
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
