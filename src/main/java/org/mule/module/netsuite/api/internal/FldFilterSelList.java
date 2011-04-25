/**
 * FldFilterSelList.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class FldFilterSelList  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef[] fldFilterSel;

    public FldFilterSelList() {
    }

    public FldFilterSelList(
           org.mule.module.netsuite.api.internal.RecordRef[] fldFilterSel) {
           this.fldFilterSel = fldFilterSel;
    }


    /**
     * Gets the fldFilterSel value for this FldFilterSelList.
     * 
     * @return fldFilterSel
     */
    public org.mule.module.netsuite.api.internal.RecordRef[] getFldFilterSel() {
        return fldFilterSel;
    }


    /**
     * Sets the fldFilterSel value for this FldFilterSelList.
     * 
     * @param fldFilterSel
     */
    public void setFldFilterSel(org.mule.module.netsuite.api.internal.RecordRef[] fldFilterSel) {
        this.fldFilterSel = fldFilterSel;
    }

    public org.mule.module.netsuite.api.internal.RecordRef getFldFilterSel(int i) {
        return this.fldFilterSel[i];
    }

    public void setFldFilterSel(int i, org.mule.module.netsuite.api.internal.RecordRef _value) {
        this.fldFilterSel[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FldFilterSelList)) return false;
        FldFilterSelList other = (FldFilterSelList) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fldFilterSel==null && other.getFldFilterSel()==null) || 
             (this.fldFilterSel!=null &&
              java.util.Arrays.equals(this.fldFilterSel, other.getFldFilterSel())));
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
        if (getFldFilterSel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFldFilterSel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFldFilterSel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FldFilterSelList.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "FldFilterSelList"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fldFilterSel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:customization_2010_2.setup.webservices.netsuite.com", "fldFilterSel"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
