/**
 * ProjectTaskAssignee.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class ProjectTaskAssignee  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef resource;

    private java.lang.Double units;

    private org.mule.module.netsuite.api.internal.RecordRef serviceItem;

    private java.lang.Double estimatedWork;

    private java.lang.Double unitCost;

    private java.lang.Double unitPrice;

    private java.lang.Double cost;

    private java.lang.Double price;

    public ProjectTaskAssignee() {
    }

    public ProjectTaskAssignee(
           org.mule.module.netsuite.api.internal.RecordRef resource,
           java.lang.Double units,
           org.mule.module.netsuite.api.internal.RecordRef serviceItem,
           java.lang.Double estimatedWork,
           java.lang.Double unitCost,
           java.lang.Double unitPrice,
           java.lang.Double cost,
           java.lang.Double price) {
           this.resource = resource;
           this.units = units;
           this.serviceItem = serviceItem;
           this.estimatedWork = estimatedWork;
           this.unitCost = unitCost;
           this.unitPrice = unitPrice;
           this.cost = cost;
           this.price = price;
    }


    /**
     * Gets the resource value for this ProjectTaskAssignee.
     * 
     * @return resource
     */
    public org.mule.module.netsuite.api.internal.RecordRef getResource() {
        return resource;
    }


    /**
     * Sets the resource value for this ProjectTaskAssignee.
     * 
     * @param resource
     */
    public void setResource(org.mule.module.netsuite.api.internal.RecordRef resource) {
        this.resource = resource;
    }


    /**
     * Gets the units value for this ProjectTaskAssignee.
     * 
     * @return units
     */
    public java.lang.Double getUnits() {
        return units;
    }


    /**
     * Sets the units value for this ProjectTaskAssignee.
     * 
     * @param units
     */
    public void setUnits(java.lang.Double units) {
        this.units = units;
    }


    /**
     * Gets the serviceItem value for this ProjectTaskAssignee.
     * 
     * @return serviceItem
     */
    public org.mule.module.netsuite.api.internal.RecordRef getServiceItem() {
        return serviceItem;
    }


    /**
     * Sets the serviceItem value for this ProjectTaskAssignee.
     * 
     * @param serviceItem
     */
    public void setServiceItem(org.mule.module.netsuite.api.internal.RecordRef serviceItem) {
        this.serviceItem = serviceItem;
    }


    /**
     * Gets the estimatedWork value for this ProjectTaskAssignee.
     * 
     * @return estimatedWork
     */
    public java.lang.Double getEstimatedWork() {
        return estimatedWork;
    }


    /**
     * Sets the estimatedWork value for this ProjectTaskAssignee.
     * 
     * @param estimatedWork
     */
    public void setEstimatedWork(java.lang.Double estimatedWork) {
        this.estimatedWork = estimatedWork;
    }


    /**
     * Gets the unitCost value for this ProjectTaskAssignee.
     * 
     * @return unitCost
     */
    public java.lang.Double getUnitCost() {
        return unitCost;
    }


    /**
     * Sets the unitCost value for this ProjectTaskAssignee.
     * 
     * @param unitCost
     */
    public void setUnitCost(java.lang.Double unitCost) {
        this.unitCost = unitCost;
    }


    /**
     * Gets the unitPrice value for this ProjectTaskAssignee.
     * 
     * @return unitPrice
     */
    public java.lang.Double getUnitPrice() {
        return unitPrice;
    }


    /**
     * Sets the unitPrice value for this ProjectTaskAssignee.
     * 
     * @param unitPrice
     */
    public void setUnitPrice(java.lang.Double unitPrice) {
        this.unitPrice = unitPrice;
    }


    /**
     * Gets the cost value for this ProjectTaskAssignee.
     * 
     * @return cost
     */
    public java.lang.Double getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this ProjectTaskAssignee.
     * 
     * @param cost
     */
    public void setCost(java.lang.Double cost) {
        this.cost = cost;
    }


    /**
     * Gets the price value for this ProjectTaskAssignee.
     * 
     * @return price
     */
    public java.lang.Double getPrice() {
        return price;
    }


    /**
     * Sets the price value for this ProjectTaskAssignee.
     * 
     * @param price
     */
    public void setPrice(java.lang.Double price) {
        this.price = price;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectTaskAssignee)) return false;
        ProjectTaskAssignee other = (ProjectTaskAssignee) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resource==null && other.getResource()==null) || 
             (this.resource!=null &&
              this.resource.equals(other.getResource()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.serviceItem==null && other.getServiceItem()==null) || 
             (this.serviceItem!=null &&
              this.serviceItem.equals(other.getServiceItem()))) &&
            ((this.estimatedWork==null && other.getEstimatedWork()==null) || 
             (this.estimatedWork!=null &&
              this.estimatedWork.equals(other.getEstimatedWork()))) &&
            ((this.unitCost==null && other.getUnitCost()==null) || 
             (this.unitCost!=null &&
              this.unitCost.equals(other.getUnitCost()))) &&
            ((this.unitPrice==null && other.getUnitPrice()==null) || 
             (this.unitPrice!=null &&
              this.unitPrice.equals(other.getUnitPrice()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice())));
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
        if (getResource() != null) {
            _hashCode += getResource().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getServiceItem() != null) {
            _hashCode += getServiceItem().hashCode();
        }
        if (getEstimatedWork() != null) {
            _hashCode += getEstimatedWork().hashCode();
        }
        if (getUnitCost() != null) {
            _hashCode += getUnitCost().hashCode();
        }
        if (getUnitPrice() != null) {
            _hashCode += getUnitPrice().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectTaskAssignee.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "ProjectTaskAssignee"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:scheduling_2010_2.activities.webservices.netsuite.com", "price"));
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
