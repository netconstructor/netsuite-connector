/**
 * ItemSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ItemSearchRow  extends org.mule.module.netsuite.api.internal.SearchRow  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.ItemSearchRowBasic basic;

    private org.mule.module.netsuite.api.internal.BinSearchRowBasic binNumberJoin;

    private org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin;

    private org.mule.module.netsuite.api.internal.LocationSearchRowBasic inventoryLocationJoin;

    private org.mule.module.netsuite.api.internal.ItemSearchRowBasic memberItemJoin;

    private org.mule.module.netsuite.api.internal.ItemSearchRowBasic parentJoin;

    private org.mule.module.netsuite.api.internal.LocationSearchRowBasic preferredLocationJoin;

    private org.mule.module.netsuite.api.internal.VendorSearchRowBasic preferredVendorJoin;

    private org.mule.module.netsuite.api.internal.CustomerSearchRowBasic shopperJoin;

    private org.mule.module.netsuite.api.internal.TransactionSearchRowBasic transactionJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin;

    private org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin;

    private org.mule.module.netsuite.api.internal.VendorSearchRowBasic vendorJoin;

    public ItemSearchRow() {
    }

    public ItemSearchRow(
           org.mule.module.netsuite.api.internal.ItemSearchRowBasic basic,
           org.mule.module.netsuite.api.internal.BinSearchRowBasic binNumberJoin,
           org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin,
           org.mule.module.netsuite.api.internal.LocationSearchRowBasic inventoryLocationJoin,
           org.mule.module.netsuite.api.internal.ItemSearchRowBasic memberItemJoin,
           org.mule.module.netsuite.api.internal.ItemSearchRowBasic parentJoin,
           org.mule.module.netsuite.api.internal.LocationSearchRowBasic preferredLocationJoin,
           org.mule.module.netsuite.api.internal.VendorSearchRowBasic preferredVendorJoin,
           org.mule.module.netsuite.api.internal.CustomerSearchRowBasic shopperJoin,
           org.mule.module.netsuite.api.internal.TransactionSearchRowBasic transactionJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin,
           org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin,
           org.mule.module.netsuite.api.internal.VendorSearchRowBasic vendorJoin) {
        this.basic = basic;
        this.binNumberJoin = binNumberJoin;
        this.fileJoin = fileJoin;
        this.inventoryLocationJoin = inventoryLocationJoin;
        this.memberItemJoin = memberItemJoin;
        this.parentJoin = parentJoin;
        this.preferredLocationJoin = preferredLocationJoin;
        this.preferredVendorJoin = preferredVendorJoin;
        this.shopperJoin = shopperJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
    }


    /**
     * Gets the basic value for this ItemSearchRow.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.ItemSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this ItemSearchRow.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.ItemSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the binNumberJoin value for this ItemSearchRow.
     * 
     * @return binNumberJoin
     */
    public org.mule.module.netsuite.api.internal.BinSearchRowBasic getBinNumberJoin() {
        return binNumberJoin;
    }


    /**
     * Sets the binNumberJoin value for this ItemSearchRow.
     * 
     * @param binNumberJoin
     */
    public void setBinNumberJoin(org.mule.module.netsuite.api.internal.BinSearchRowBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }


    /**
     * Gets the fileJoin value for this ItemSearchRow.
     * 
     * @return fileJoin
     */
    public org.mule.module.netsuite.api.internal.FileSearchRowBasic getFileJoin() {
        return fileJoin;
    }


    /**
     * Sets the fileJoin value for this ItemSearchRow.
     * 
     * @param fileJoin
     */
    public void setFileJoin(org.mule.module.netsuite.api.internal.FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }


    /**
     * Gets the inventoryLocationJoin value for this ItemSearchRow.
     * 
     * @return inventoryLocationJoin
     */
    public org.mule.module.netsuite.api.internal.LocationSearchRowBasic getInventoryLocationJoin() {
        return inventoryLocationJoin;
    }


    /**
     * Sets the inventoryLocationJoin value for this ItemSearchRow.
     * 
     * @param inventoryLocationJoin
     */
    public void setInventoryLocationJoin(org.mule.module.netsuite.api.internal.LocationSearchRowBasic inventoryLocationJoin) {
        this.inventoryLocationJoin = inventoryLocationJoin;
    }


    /**
     * Gets the memberItemJoin value for this ItemSearchRow.
     * 
     * @return memberItemJoin
     */
    public org.mule.module.netsuite.api.internal.ItemSearchRowBasic getMemberItemJoin() {
        return memberItemJoin;
    }


    /**
     * Sets the memberItemJoin value for this ItemSearchRow.
     * 
     * @param memberItemJoin
     */
    public void setMemberItemJoin(org.mule.module.netsuite.api.internal.ItemSearchRowBasic memberItemJoin) {
        this.memberItemJoin = memberItemJoin;
    }


    /**
     * Gets the parentJoin value for this ItemSearchRow.
     * 
     * @return parentJoin
     */
    public org.mule.module.netsuite.api.internal.ItemSearchRowBasic getParentJoin() {
        return parentJoin;
    }


    /**
     * Sets the parentJoin value for this ItemSearchRow.
     * 
     * @param parentJoin
     */
    public void setParentJoin(org.mule.module.netsuite.api.internal.ItemSearchRowBasic parentJoin) {
        this.parentJoin = parentJoin;
    }


    /**
     * Gets the preferredLocationJoin value for this ItemSearchRow.
     * 
     * @return preferredLocationJoin
     */
    public org.mule.module.netsuite.api.internal.LocationSearchRowBasic getPreferredLocationJoin() {
        return preferredLocationJoin;
    }


    /**
     * Sets the preferredLocationJoin value for this ItemSearchRow.
     * 
     * @param preferredLocationJoin
     */
    public void setPreferredLocationJoin(org.mule.module.netsuite.api.internal.LocationSearchRowBasic preferredLocationJoin) {
        this.preferredLocationJoin = preferredLocationJoin;
    }


    /**
     * Gets the preferredVendorJoin value for this ItemSearchRow.
     * 
     * @return preferredVendorJoin
     */
    public org.mule.module.netsuite.api.internal.VendorSearchRowBasic getPreferredVendorJoin() {
        return preferredVendorJoin;
    }


    /**
     * Sets the preferredVendorJoin value for this ItemSearchRow.
     * 
     * @param preferredVendorJoin
     */
    public void setPreferredVendorJoin(org.mule.module.netsuite.api.internal.VendorSearchRowBasic preferredVendorJoin) {
        this.preferredVendorJoin = preferredVendorJoin;
    }


    /**
     * Gets the shopperJoin value for this ItemSearchRow.
     * 
     * @return shopperJoin
     */
    public org.mule.module.netsuite.api.internal.CustomerSearchRowBasic getShopperJoin() {
        return shopperJoin;
    }


    /**
     * Sets the shopperJoin value for this ItemSearchRow.
     * 
     * @param shopperJoin
     */
    public void setShopperJoin(org.mule.module.netsuite.api.internal.CustomerSearchRowBasic shopperJoin) {
        this.shopperJoin = shopperJoin;
    }


    /**
     * Gets the transactionJoin value for this ItemSearchRow.
     * 
     * @return transactionJoin
     */
    public org.mule.module.netsuite.api.internal.TransactionSearchRowBasic getTransactionJoin() {
        return transactionJoin;
    }


    /**
     * Sets the transactionJoin value for this ItemSearchRow.
     * 
     * @param transactionJoin
     */
    public void setTransactionJoin(org.mule.module.netsuite.api.internal.TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }


    /**
     * Gets the userJoin value for this ItemSearchRow.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this ItemSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this ItemSearchRow.
     * 
     * @return userNotesJoin
     */
    public org.mule.module.netsuite.api.internal.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this ItemSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the vendorJoin value for this ItemSearchRow.
     * 
     * @return vendorJoin
     */
    public org.mule.module.netsuite.api.internal.VendorSearchRowBasic getVendorJoin() {
        return vendorJoin;
    }


    /**
     * Sets the vendorJoin value for this ItemSearchRow.
     * 
     * @param vendorJoin
     */
    public void setVendorJoin(org.mule.module.netsuite.api.internal.VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemSearchRow)) return false;
        ItemSearchRow other = (ItemSearchRow) obj;
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
            ((this.binNumberJoin==null && other.getBinNumberJoin()==null) || 
             (this.binNumberJoin!=null &&
              this.binNumberJoin.equals(other.getBinNumberJoin()))) &&
            ((this.fileJoin==null && other.getFileJoin()==null) || 
             (this.fileJoin!=null &&
              this.fileJoin.equals(other.getFileJoin()))) &&
            ((this.inventoryLocationJoin==null && other.getInventoryLocationJoin()==null) || 
             (this.inventoryLocationJoin!=null &&
              this.inventoryLocationJoin.equals(other.getInventoryLocationJoin()))) &&
            ((this.memberItemJoin==null && other.getMemberItemJoin()==null) || 
             (this.memberItemJoin!=null &&
              this.memberItemJoin.equals(other.getMemberItemJoin()))) &&
            ((this.parentJoin==null && other.getParentJoin()==null) || 
             (this.parentJoin!=null &&
              this.parentJoin.equals(other.getParentJoin()))) &&
            ((this.preferredLocationJoin==null && other.getPreferredLocationJoin()==null) || 
             (this.preferredLocationJoin!=null &&
              this.preferredLocationJoin.equals(other.getPreferredLocationJoin()))) &&
            ((this.preferredVendorJoin==null && other.getPreferredVendorJoin()==null) || 
             (this.preferredVendorJoin!=null &&
              this.preferredVendorJoin.equals(other.getPreferredVendorJoin()))) &&
            ((this.shopperJoin==null && other.getShopperJoin()==null) || 
             (this.shopperJoin!=null &&
              this.shopperJoin.equals(other.getShopperJoin()))) &&
            ((this.transactionJoin==null && other.getTransactionJoin()==null) || 
             (this.transactionJoin!=null &&
              this.transactionJoin.equals(other.getTransactionJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin()))) &&
            ((this.vendorJoin==null && other.getVendorJoin()==null) || 
             (this.vendorJoin!=null &&
              this.vendorJoin.equals(other.getVendorJoin())));
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
        if (getBinNumberJoin() != null) {
            _hashCode += getBinNumberJoin().hashCode();
        }
        if (getFileJoin() != null) {
            _hashCode += getFileJoin().hashCode();
        }
        if (getInventoryLocationJoin() != null) {
            _hashCode += getInventoryLocationJoin().hashCode();
        }
        if (getMemberItemJoin() != null) {
            _hashCode += getMemberItemJoin().hashCode();
        }
        if (getParentJoin() != null) {
            _hashCode += getParentJoin().hashCode();
        }
        if (getPreferredLocationJoin() != null) {
            _hashCode += getPreferredLocationJoin().hashCode();
        }
        if (getPreferredVendorJoin() != null) {
            _hashCode += getPreferredVendorJoin().hashCode();
        }
        if (getShopperJoin() != null) {
            _hashCode += getShopperJoin().hashCode();
        }
        if (getTransactionJoin() != null) {
            _hashCode += getTransactionJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
        }
        if (getVendorJoin() != null) {
            _hashCode += getVendorJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "ItemSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventoryLocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "inventoryLocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberItemJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "memberItemJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "parentJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredLocationJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredLocationJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredVendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredVendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shopperJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "shopperJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
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
