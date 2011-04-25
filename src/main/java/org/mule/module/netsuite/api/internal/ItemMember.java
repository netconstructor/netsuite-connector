/**
 * ItemMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemMember  implements java.io.Serializable {
    private java.lang.String memberDescr;

    private java.lang.Double quantity;

    private java.lang.String memberUnit;

    private org.mule.module.netsuite.api.internal.RecordRef taxSchedule;

    private java.lang.String taxcode;

    private org.mule.module.netsuite.api.internal.RecordRef item;

    private java.lang.Double taxrate;

    public ItemMember() {
    }

    public ItemMember(
           java.lang.String memberDescr,
           java.lang.Double quantity,
           java.lang.String memberUnit,
           org.mule.module.netsuite.api.internal.RecordRef taxSchedule,
           java.lang.String taxcode,
           org.mule.module.netsuite.api.internal.RecordRef item,
           java.lang.Double taxrate) {
           this.memberDescr = memberDescr;
           this.quantity = quantity;
           this.memberUnit = memberUnit;
           this.taxSchedule = taxSchedule;
           this.taxcode = taxcode;
           this.item = item;
           this.taxrate = taxrate;
    }


    /**
     * Gets the memberDescr value for this ItemMember.
     * 
     * @return memberDescr
     */
    public java.lang.String getMemberDescr() {
        return memberDescr;
    }


    /**
     * Sets the memberDescr value for this ItemMember.
     * 
     * @param memberDescr
     */
    public void setMemberDescr(java.lang.String memberDescr) {
        this.memberDescr = memberDescr;
    }


    /**
     * Gets the quantity value for this ItemMember.
     * 
     * @return quantity
     */
    public java.lang.Double getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this ItemMember.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Double quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the memberUnit value for this ItemMember.
     * 
     * @return memberUnit
     */
    public java.lang.String getMemberUnit() {
        return memberUnit;
    }


    /**
     * Sets the memberUnit value for this ItemMember.
     * 
     * @param memberUnit
     */
    public void setMemberUnit(java.lang.String memberUnit) {
        this.memberUnit = memberUnit;
    }


    /**
     * Gets the taxSchedule value for this ItemMember.
     * 
     * @return taxSchedule
     */
    public org.mule.module.netsuite.api.internal.RecordRef getTaxSchedule() {
        return taxSchedule;
    }


    /**
     * Sets the taxSchedule value for this ItemMember.
     * 
     * @param taxSchedule
     */
    public void setTaxSchedule(org.mule.module.netsuite.api.internal.RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }


    /**
     * Gets the taxcode value for this ItemMember.
     * 
     * @return taxcode
     */
    public java.lang.String getTaxcode() {
        return taxcode;
    }


    /**
     * Sets the taxcode value for this ItemMember.
     * 
     * @param taxcode
     */
    public void setTaxcode(java.lang.String taxcode) {
        this.taxcode = taxcode;
    }


    /**
     * Gets the item value for this ItemMember.
     * 
     * @return item
     */
    public org.mule.module.netsuite.api.internal.RecordRef getItem() {
        return item;
    }


    /**
     * Sets the item value for this ItemMember.
     * 
     * @param item
     */
    public void setItem(org.mule.module.netsuite.api.internal.RecordRef item) {
        this.item = item;
    }


    /**
     * Gets the taxrate value for this ItemMember.
     * 
     * @return taxrate
     */
    public java.lang.Double getTaxrate() {
        return taxrate;
    }


    /**
     * Sets the taxrate value for this ItemMember.
     * 
     * @param taxrate
     */
    public void setTaxrate(java.lang.Double taxrate) {
        this.taxrate = taxrate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemMember)) return false;
        ItemMember other = (ItemMember) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memberDescr==null && other.getMemberDescr()==null) || 
             (this.memberDescr!=null &&
              this.memberDescr.equals(other.getMemberDescr()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.memberUnit==null && other.getMemberUnit()==null) || 
             (this.memberUnit!=null &&
              this.memberUnit.equals(other.getMemberUnit()))) &&
            ((this.taxSchedule==null && other.getTaxSchedule()==null) || 
             (this.taxSchedule!=null &&
              this.taxSchedule.equals(other.getTaxSchedule()))) &&
            ((this.taxcode==null && other.getTaxcode()==null) || 
             (this.taxcode!=null &&
              this.taxcode.equals(other.getTaxcode()))) &&
            ((this.item==null && other.getItem()==null) || 
             (this.item!=null &&
              this.item.equals(other.getItem()))) &&
            ((this.taxrate==null && other.getTaxrate()==null) || 
             (this.taxrate!=null &&
              this.taxrate.equals(other.getTaxrate())));
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
        if (getMemberDescr() != null) {
            _hashCode += getMemberDescr().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getMemberUnit() != null) {
            _hashCode += getMemberUnit().hashCode();
        }
        if (getTaxSchedule() != null) {
            _hashCode += getTaxSchedule().hashCode();
        }
        if (getTaxcode() != null) {
            _hashCode += getTaxcode().hashCode();
        }
        if (getItem() != null) {
            _hashCode += getItem().hashCode();
        }
        if (getTaxrate() != null) {
            _hashCode += getTaxrate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberDescr");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "memberDescr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "memberUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxcode");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxrate");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "taxrate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
