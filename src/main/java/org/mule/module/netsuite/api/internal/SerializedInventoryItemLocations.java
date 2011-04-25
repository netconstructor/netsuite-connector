/**
 * SerializedInventoryItemLocations.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SerializedInventoryItemLocations  implements java.io.Serializable {
    private java.lang.String location;

    private java.lang.Double quantityOnHand;

    private java.lang.Double onHandValueMli;

    private java.lang.String serialNumbers;

    private java.lang.Double averageCostMli;

    private java.lang.Double lastPurchasePriceMli;

    private java.lang.Double reorderPoint;

    private java.lang.Double preferredStockLevel;

    private java.lang.Double defaultReturnCost;

    private java.lang.Double quantityOnOrder;

    private java.lang.Double quantityCommitted;

    private java.lang.Double quantityAvailable;

    private java.lang.Double quantityBackOrdered;

    private org.mule.module.netsuite.api.internal.RecordRef locationId;

    public SerializedInventoryItemLocations() {
    }

    public SerializedInventoryItemLocations(
           java.lang.String location,
           java.lang.Double quantityOnHand,
           java.lang.Double onHandValueMli,
           java.lang.String serialNumbers,
           java.lang.Double averageCostMli,
           java.lang.Double lastPurchasePriceMli,
           java.lang.Double reorderPoint,
           java.lang.Double preferredStockLevel,
           java.lang.Double defaultReturnCost,
           java.lang.Double quantityOnOrder,
           java.lang.Double quantityCommitted,
           java.lang.Double quantityAvailable,
           java.lang.Double quantityBackOrdered,
           org.mule.module.netsuite.api.internal.RecordRef locationId) {
           this.location = location;
           this.quantityOnHand = quantityOnHand;
           this.onHandValueMli = onHandValueMli;
           this.serialNumbers = serialNumbers;
           this.averageCostMli = averageCostMli;
           this.lastPurchasePriceMli = lastPurchasePriceMli;
           this.reorderPoint = reorderPoint;
           this.preferredStockLevel = preferredStockLevel;
           this.defaultReturnCost = defaultReturnCost;
           this.quantityOnOrder = quantityOnOrder;
           this.quantityCommitted = quantityCommitted;
           this.quantityAvailable = quantityAvailable;
           this.quantityBackOrdered = quantityBackOrdered;
           this.locationId = locationId;
    }


    /**
     * Gets the location value for this SerializedInventoryItemLocations.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this SerializedInventoryItemLocations.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the quantityOnHand value for this SerializedInventoryItemLocations.
     * 
     * @return quantityOnHand
     */
    public java.lang.Double getQuantityOnHand() {
        return quantityOnHand;
    }


    /**
     * Sets the quantityOnHand value for this SerializedInventoryItemLocations.
     * 
     * @param quantityOnHand
     */
    public void setQuantityOnHand(java.lang.Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }


    /**
     * Gets the onHandValueMli value for this SerializedInventoryItemLocations.
     * 
     * @return onHandValueMli
     */
    public java.lang.Double getOnHandValueMli() {
        return onHandValueMli;
    }


    /**
     * Sets the onHandValueMli value for this SerializedInventoryItemLocations.
     * 
     * @param onHandValueMli
     */
    public void setOnHandValueMli(java.lang.Double onHandValueMli) {
        this.onHandValueMli = onHandValueMli;
    }


    /**
     * Gets the serialNumbers value for this SerializedInventoryItemLocations.
     * 
     * @return serialNumbers
     */
    public java.lang.String getSerialNumbers() {
        return serialNumbers;
    }


    /**
     * Sets the serialNumbers value for this SerializedInventoryItemLocations.
     * 
     * @param serialNumbers
     */
    public void setSerialNumbers(java.lang.String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }


    /**
     * Gets the averageCostMli value for this SerializedInventoryItemLocations.
     * 
     * @return averageCostMli
     */
    public java.lang.Double getAverageCostMli() {
        return averageCostMli;
    }


    /**
     * Sets the averageCostMli value for this SerializedInventoryItemLocations.
     * 
     * @param averageCostMli
     */
    public void setAverageCostMli(java.lang.Double averageCostMli) {
        this.averageCostMli = averageCostMli;
    }


    /**
     * Gets the lastPurchasePriceMli value for this SerializedInventoryItemLocations.
     * 
     * @return lastPurchasePriceMli
     */
    public java.lang.Double getLastPurchasePriceMli() {
        return lastPurchasePriceMli;
    }


    /**
     * Sets the lastPurchasePriceMli value for this SerializedInventoryItemLocations.
     * 
     * @param lastPurchasePriceMli
     */
    public void setLastPurchasePriceMli(java.lang.Double lastPurchasePriceMli) {
        this.lastPurchasePriceMli = lastPurchasePriceMli;
    }


    /**
     * Gets the reorderPoint value for this SerializedInventoryItemLocations.
     * 
     * @return reorderPoint
     */
    public java.lang.Double getReorderPoint() {
        return reorderPoint;
    }


    /**
     * Sets the reorderPoint value for this SerializedInventoryItemLocations.
     * 
     * @param reorderPoint
     */
    public void setReorderPoint(java.lang.Double reorderPoint) {
        this.reorderPoint = reorderPoint;
    }


    /**
     * Gets the preferredStockLevel value for this SerializedInventoryItemLocations.
     * 
     * @return preferredStockLevel
     */
    public java.lang.Double getPreferredStockLevel() {
        return preferredStockLevel;
    }


    /**
     * Sets the preferredStockLevel value for this SerializedInventoryItemLocations.
     * 
     * @param preferredStockLevel
     */
    public void setPreferredStockLevel(java.lang.Double preferredStockLevel) {
        this.preferredStockLevel = preferredStockLevel;
    }


    /**
     * Gets the defaultReturnCost value for this SerializedInventoryItemLocations.
     * 
     * @return defaultReturnCost
     */
    public java.lang.Double getDefaultReturnCost() {
        return defaultReturnCost;
    }


    /**
     * Sets the defaultReturnCost value for this SerializedInventoryItemLocations.
     * 
     * @param defaultReturnCost
     */
    public void setDefaultReturnCost(java.lang.Double defaultReturnCost) {
        this.defaultReturnCost = defaultReturnCost;
    }


    /**
     * Gets the quantityOnOrder value for this SerializedInventoryItemLocations.
     * 
     * @return quantityOnOrder
     */
    public java.lang.Double getQuantityOnOrder() {
        return quantityOnOrder;
    }


    /**
     * Sets the quantityOnOrder value for this SerializedInventoryItemLocations.
     * 
     * @param quantityOnOrder
     */
    public void setQuantityOnOrder(java.lang.Double quantityOnOrder) {
        this.quantityOnOrder = quantityOnOrder;
    }


    /**
     * Gets the quantityCommitted value for this SerializedInventoryItemLocations.
     * 
     * @return quantityCommitted
     */
    public java.lang.Double getQuantityCommitted() {
        return quantityCommitted;
    }


    /**
     * Sets the quantityCommitted value for this SerializedInventoryItemLocations.
     * 
     * @param quantityCommitted
     */
    public void setQuantityCommitted(java.lang.Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }


    /**
     * Gets the quantityAvailable value for this SerializedInventoryItemLocations.
     * 
     * @return quantityAvailable
     */
    public java.lang.Double getQuantityAvailable() {
        return quantityAvailable;
    }


    /**
     * Sets the quantityAvailable value for this SerializedInventoryItemLocations.
     * 
     * @param quantityAvailable
     */
    public void setQuantityAvailable(java.lang.Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }


    /**
     * Gets the quantityBackOrdered value for this SerializedInventoryItemLocations.
     * 
     * @return quantityBackOrdered
     */
    public java.lang.Double getQuantityBackOrdered() {
        return quantityBackOrdered;
    }


    /**
     * Sets the quantityBackOrdered value for this SerializedInventoryItemLocations.
     * 
     * @param quantityBackOrdered
     */
    public void setQuantityBackOrdered(java.lang.Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }


    /**
     * Gets the locationId value for this SerializedInventoryItemLocations.
     * 
     * @return locationId
     */
    public org.mule.module.netsuite.api.internal.RecordRef getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this SerializedInventoryItemLocations.
     * 
     * @param locationId
     */
    public void setLocationId(org.mule.module.netsuite.api.internal.RecordRef locationId) {
        this.locationId = locationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SerializedInventoryItemLocations)) return false;
        SerializedInventoryItemLocations other = (SerializedInventoryItemLocations) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.quantityOnHand==null && other.getQuantityOnHand()==null) || 
             (this.quantityOnHand!=null &&
              this.quantityOnHand.equals(other.getQuantityOnHand()))) &&
            ((this.onHandValueMli==null && other.getOnHandValueMli()==null) || 
             (this.onHandValueMli!=null &&
              this.onHandValueMli.equals(other.getOnHandValueMli()))) &&
            ((this.serialNumbers==null && other.getSerialNumbers()==null) || 
             (this.serialNumbers!=null &&
              this.serialNumbers.equals(other.getSerialNumbers()))) &&
            ((this.averageCostMli==null && other.getAverageCostMli()==null) || 
             (this.averageCostMli!=null &&
              this.averageCostMli.equals(other.getAverageCostMli()))) &&
            ((this.lastPurchasePriceMli==null && other.getLastPurchasePriceMli()==null) || 
             (this.lastPurchasePriceMli!=null &&
              this.lastPurchasePriceMli.equals(other.getLastPurchasePriceMli()))) &&
            ((this.reorderPoint==null && other.getReorderPoint()==null) || 
             (this.reorderPoint!=null &&
              this.reorderPoint.equals(other.getReorderPoint()))) &&
            ((this.preferredStockLevel==null && other.getPreferredStockLevel()==null) || 
             (this.preferredStockLevel!=null &&
              this.preferredStockLevel.equals(other.getPreferredStockLevel()))) &&
            ((this.defaultReturnCost==null && other.getDefaultReturnCost()==null) || 
             (this.defaultReturnCost!=null &&
              this.defaultReturnCost.equals(other.getDefaultReturnCost()))) &&
            ((this.quantityOnOrder==null && other.getQuantityOnOrder()==null) || 
             (this.quantityOnOrder!=null &&
              this.quantityOnOrder.equals(other.getQuantityOnOrder()))) &&
            ((this.quantityCommitted==null && other.getQuantityCommitted()==null) || 
             (this.quantityCommitted!=null &&
              this.quantityCommitted.equals(other.getQuantityCommitted()))) &&
            ((this.quantityAvailable==null && other.getQuantityAvailable()==null) || 
             (this.quantityAvailable!=null &&
              this.quantityAvailable.equals(other.getQuantityAvailable()))) &&
            ((this.quantityBackOrdered==null && other.getQuantityBackOrdered()==null) || 
             (this.quantityBackOrdered!=null &&
              this.quantityBackOrdered.equals(other.getQuantityBackOrdered()))) &&
            ((this.locationId==null && other.getLocationId()==null) || 
             (this.locationId!=null &&
              this.locationId.equals(other.getLocationId())));
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
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getQuantityOnHand() != null) {
            _hashCode += getQuantityOnHand().hashCode();
        }
        if (getOnHandValueMli() != null) {
            _hashCode += getOnHandValueMli().hashCode();
        }
        if (getSerialNumbers() != null) {
            _hashCode += getSerialNumbers().hashCode();
        }
        if (getAverageCostMli() != null) {
            _hashCode += getAverageCostMli().hashCode();
        }
        if (getLastPurchasePriceMli() != null) {
            _hashCode += getLastPurchasePriceMli().hashCode();
        }
        if (getReorderPoint() != null) {
            _hashCode += getReorderPoint().hashCode();
        }
        if (getPreferredStockLevel() != null) {
            _hashCode += getPreferredStockLevel().hashCode();
        }
        if (getDefaultReturnCost() != null) {
            _hashCode += getDefaultReturnCost().hashCode();
        }
        if (getQuantityOnOrder() != null) {
            _hashCode += getQuantityOnOrder().hashCode();
        }
        if (getQuantityCommitted() != null) {
            _hashCode += getQuantityCommitted().hashCode();
        }
        if (getQuantityAvailable() != null) {
            _hashCode += getQuantityAvailable().hashCode();
        }
        if (getQuantityBackOrdered() != null) {
            _hashCode += getQuantityBackOrdered().hashCode();
        }
        if (getLocationId() != null) {
            _hashCode += getLocationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SerializedInventoryItemLocations.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "SerializedInventoryItemLocations"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onHandValueMli");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "onHandValueMli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("averageCostMli");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "averageCostMli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastPurchasePriceMli");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "lastPurchasePriceMli"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reorderPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "reorderPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredStockLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "preferredStockLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultReturnCost");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "defaultReturnCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityOnOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityOnOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:accounting_2010_2.lists.webservices.netsuite.com", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
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
