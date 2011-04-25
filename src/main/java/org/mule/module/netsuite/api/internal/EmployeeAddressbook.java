/**
 * EmployeeAddressbook.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class EmployeeAddressbook  implements java.io.Serializable {
    private java.lang.Boolean defaultShipping;

    private java.lang.Boolean defaultBilling;

    private java.lang.String label;

    private java.lang.String attention;

    private java.lang.String addressee;

    private java.lang.String phone;

    private java.lang.String addr1;

    private java.lang.String addr2;

    private java.lang.String addr3;

    private java.lang.String city;

    private java.lang.String state;

    private java.lang.String zip;

    private org.mule.module.netsuite.api.internal.Country country;

    private java.lang.String addrText;

    private java.lang.Boolean override;

    private java.lang.String internalId;

    public EmployeeAddressbook() {
    }

    public EmployeeAddressbook(
           java.lang.Boolean defaultShipping,
           java.lang.Boolean defaultBilling,
           java.lang.String label,
           java.lang.String attention,
           java.lang.String addressee,
           java.lang.String phone,
           java.lang.String addr1,
           java.lang.String addr2,
           java.lang.String addr3,
           java.lang.String city,
           java.lang.String state,
           java.lang.String zip,
           org.mule.module.netsuite.api.internal.Country country,
           java.lang.String addrText,
           java.lang.Boolean override,
           java.lang.String internalId) {
           this.defaultShipping = defaultShipping;
           this.defaultBilling = defaultBilling;
           this.label = label;
           this.attention = attention;
           this.addressee = addressee;
           this.phone = phone;
           this.addr1 = addr1;
           this.addr2 = addr2;
           this.addr3 = addr3;
           this.city = city;
           this.state = state;
           this.zip = zip;
           this.country = country;
           this.addrText = addrText;
           this.override = override;
           this.internalId = internalId;
    }


    /**
     * Gets the defaultShipping value for this EmployeeAddressbook.
     * 
     * @return defaultShipping
     */
    public java.lang.Boolean getDefaultShipping() {
        return defaultShipping;
    }


    /**
     * Sets the defaultShipping value for this EmployeeAddressbook.
     * 
     * @param defaultShipping
     */
    public void setDefaultShipping(java.lang.Boolean defaultShipping) {
        this.defaultShipping = defaultShipping;
    }


    /**
     * Gets the defaultBilling value for this EmployeeAddressbook.
     * 
     * @return defaultBilling
     */
    public java.lang.Boolean getDefaultBilling() {
        return defaultBilling;
    }


    /**
     * Sets the defaultBilling value for this EmployeeAddressbook.
     * 
     * @param defaultBilling
     */
    public void setDefaultBilling(java.lang.Boolean defaultBilling) {
        this.defaultBilling = defaultBilling;
    }


    /**
     * Gets the label value for this EmployeeAddressbook.
     * 
     * @return label
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this EmployeeAddressbook.
     * 
     * @param label
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the attention value for this EmployeeAddressbook.
     * 
     * @return attention
     */
    public java.lang.String getAttention() {
        return attention;
    }


    /**
     * Sets the attention value for this EmployeeAddressbook.
     * 
     * @param attention
     */
    public void setAttention(java.lang.String attention) {
        this.attention = attention;
    }


    /**
     * Gets the addressee value for this EmployeeAddressbook.
     * 
     * @return addressee
     */
    public java.lang.String getAddressee() {
        return addressee;
    }


    /**
     * Sets the addressee value for this EmployeeAddressbook.
     * 
     * @param addressee
     */
    public void setAddressee(java.lang.String addressee) {
        this.addressee = addressee;
    }


    /**
     * Gets the phone value for this EmployeeAddressbook.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this EmployeeAddressbook.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the addr1 value for this EmployeeAddressbook.
     * 
     * @return addr1
     */
    public java.lang.String getAddr1() {
        return addr1;
    }


    /**
     * Sets the addr1 value for this EmployeeAddressbook.
     * 
     * @param addr1
     */
    public void setAddr1(java.lang.String addr1) {
        this.addr1 = addr1;
    }


    /**
     * Gets the addr2 value for this EmployeeAddressbook.
     * 
     * @return addr2
     */
    public java.lang.String getAddr2() {
        return addr2;
    }


    /**
     * Sets the addr2 value for this EmployeeAddressbook.
     * 
     * @param addr2
     */
    public void setAddr2(java.lang.String addr2) {
        this.addr2 = addr2;
    }


    /**
     * Gets the addr3 value for this EmployeeAddressbook.
     * 
     * @return addr3
     */
    public java.lang.String getAddr3() {
        return addr3;
    }


    /**
     * Sets the addr3 value for this EmployeeAddressbook.
     * 
     * @param addr3
     */
    public void setAddr3(java.lang.String addr3) {
        this.addr3 = addr3;
    }


    /**
     * Gets the city value for this EmployeeAddressbook.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this EmployeeAddressbook.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the state value for this EmployeeAddressbook.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this EmployeeAddressbook.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip value for this EmployeeAddressbook.
     * 
     * @return zip
     */
    public java.lang.String getZip() {
        return zip;
    }


    /**
     * Sets the zip value for this EmployeeAddressbook.
     * 
     * @param zip
     */
    public void setZip(java.lang.String zip) {
        this.zip = zip;
    }


    /**
     * Gets the country value for this EmployeeAddressbook.
     * 
     * @return country
     */
    public org.mule.module.netsuite.api.internal.Country getCountry() {
        return country;
    }


    /**
     * Sets the country value for this EmployeeAddressbook.
     * 
     * @param country
     */
    public void setCountry(org.mule.module.netsuite.api.internal.Country country) {
        this.country = country;
    }


    /**
     * Gets the addrText value for this EmployeeAddressbook.
     * 
     * @return addrText
     */
    public java.lang.String getAddrText() {
        return addrText;
    }


    /**
     * Sets the addrText value for this EmployeeAddressbook.
     * 
     * @param addrText
     */
    public void setAddrText(java.lang.String addrText) {
        this.addrText = addrText;
    }


    /**
     * Gets the override value for this EmployeeAddressbook.
     * 
     * @return override
     */
    public java.lang.Boolean getOverride() {
        return override;
    }


    /**
     * Sets the override value for this EmployeeAddressbook.
     * 
     * @param override
     */
    public void setOverride(java.lang.Boolean override) {
        this.override = override;
    }


    /**
     * Gets the internalId value for this EmployeeAddressbook.
     * 
     * @return internalId
     */
    public java.lang.String getInternalId() {
        return internalId;
    }


    /**
     * Sets the internalId value for this EmployeeAddressbook.
     * 
     * @param internalId
     */
    public void setInternalId(java.lang.String internalId) {
        this.internalId = internalId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmployeeAddressbook)) return false;
        EmployeeAddressbook other = (EmployeeAddressbook) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultShipping==null && other.getDefaultShipping()==null) || 
             (this.defaultShipping!=null &&
              this.defaultShipping.equals(other.getDefaultShipping()))) &&
            ((this.defaultBilling==null && other.getDefaultBilling()==null) || 
             (this.defaultBilling!=null &&
              this.defaultBilling.equals(other.getDefaultBilling()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.attention==null && other.getAttention()==null) || 
             (this.attention!=null &&
              this.attention.equals(other.getAttention()))) &&
            ((this.addressee==null && other.getAddressee()==null) || 
             (this.addressee!=null &&
              this.addressee.equals(other.getAddressee()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.addr1==null && other.getAddr1()==null) || 
             (this.addr1!=null &&
              this.addr1.equals(other.getAddr1()))) &&
            ((this.addr2==null && other.getAddr2()==null) || 
             (this.addr2!=null &&
              this.addr2.equals(other.getAddr2()))) &&
            ((this.addr3==null && other.getAddr3()==null) || 
             (this.addr3!=null &&
              this.addr3.equals(other.getAddr3()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip==null && other.getZip()==null) || 
             (this.zip!=null &&
              this.zip.equals(other.getZip()))) &&
            ((this.country==null && other.getCountry()==null) || 
             (this.country!=null &&
              this.country.equals(other.getCountry()))) &&
            ((this.addrText==null && other.getAddrText()==null) || 
             (this.addrText!=null &&
              this.addrText.equals(other.getAddrText()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              this.override.equals(other.getOverride()))) &&
            ((this.internalId==null && other.getInternalId()==null) || 
             (this.internalId!=null &&
              this.internalId.equals(other.getInternalId())));
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
        if (getDefaultShipping() != null) {
            _hashCode += getDefaultShipping().hashCode();
        }
        if (getDefaultBilling() != null) {
            _hashCode += getDefaultBilling().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getAttention() != null) {
            _hashCode += getAttention().hashCode();
        }
        if (getAddressee() != null) {
            _hashCode += getAddressee().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getAddr1() != null) {
            _hashCode += getAddr1().hashCode();
        }
        if (getAddr2() != null) {
            _hashCode += getAddr2().hashCode();
        }
        if (getAddr3() != null) {
            _hashCode += getAddr3().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip() != null) {
            _hashCode += getZip().hashCode();
        }
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        if (getAddrText() != null) {
            _hashCode += getAddrText().hashCode();
        }
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        if (getInternalId() != null) {
            _hashCode += getInternalId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmployeeAddressbook.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "EmployeeAddressbook"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultShipping");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "defaultShipping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultBilling");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "defaultBilling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr1");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "addr1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr2");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "addr2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addr3");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "addr3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:types.common_2010_2.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrText");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "addrText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:employees_2010_2.lists.webservices.netsuite.com", "internalId"));
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
