/**
 * OpportunityCompetitors.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class OpportunityCompetitors  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.RecordRef competitor;

    private java.lang.String url;

    private java.lang.String notes;

    private java.lang.String strategy;

    private java.lang.Boolean winner;

    public OpportunityCompetitors() {
    }

    public OpportunityCompetitors(
           org.mule.module.netsuite.api.internal.RecordRef competitor,
           java.lang.String url,
           java.lang.String notes,
           java.lang.String strategy,
           java.lang.Boolean winner) {
           this.competitor = competitor;
           this.url = url;
           this.notes = notes;
           this.strategy = strategy;
           this.winner = winner;
    }


    /**
     * Gets the competitor value for this OpportunityCompetitors.
     * 
     * @return competitor
     */
    public org.mule.module.netsuite.api.internal.RecordRef getCompetitor() {
        return competitor;
    }


    /**
     * Sets the competitor value for this OpportunityCompetitors.
     * 
     * @param competitor
     */
    public void setCompetitor(org.mule.module.netsuite.api.internal.RecordRef competitor) {
        this.competitor = competitor;
    }


    /**
     * Gets the url value for this OpportunityCompetitors.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this OpportunityCompetitors.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the notes value for this OpportunityCompetitors.
     * 
     * @return notes
     */
    public java.lang.String getNotes() {
        return notes;
    }


    /**
     * Sets the notes value for this OpportunityCompetitors.
     * 
     * @param notes
     */
    public void setNotes(java.lang.String notes) {
        this.notes = notes;
    }


    /**
     * Gets the strategy value for this OpportunityCompetitors.
     * 
     * @return strategy
     */
    public java.lang.String getStrategy() {
        return strategy;
    }


    /**
     * Sets the strategy value for this OpportunityCompetitors.
     * 
     * @param strategy
     */
    public void setStrategy(java.lang.String strategy) {
        this.strategy = strategy;
    }


    /**
     * Gets the winner value for this OpportunityCompetitors.
     * 
     * @return winner
     */
    public java.lang.Boolean getWinner() {
        return winner;
    }


    /**
     * Sets the winner value for this OpportunityCompetitors.
     * 
     * @param winner
     */
    public void setWinner(java.lang.Boolean winner) {
        this.winner = winner;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OpportunityCompetitors)) return false;
        OpportunityCompetitors other = (OpportunityCompetitors) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.competitor==null && other.getCompetitor()==null) || 
             (this.competitor!=null &&
              this.competitor.equals(other.getCompetitor()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.notes==null && other.getNotes()==null) || 
             (this.notes!=null &&
              this.notes.equals(other.getNotes()))) &&
            ((this.strategy==null && other.getStrategy()==null) || 
             (this.strategy!=null &&
              this.strategy.equals(other.getStrategy()))) &&
            ((this.winner==null && other.getWinner()==null) || 
             (this.winner!=null &&
              this.winner.equals(other.getWinner())));
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
        if (getCompetitor() != null) {
            _hashCode += getCompetitor().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getNotes() != null) {
            _hashCode += getNotes().hashCode();
        }
        if (getStrategy() != null) {
            _hashCode += getStrategy().hashCode();
        }
        if (getWinner() != null) {
            _hashCode += getWinner().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OpportunityCompetitors.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "OpportunityCompetitors"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("competitor");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "competitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:core_2010_2.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "notes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strategy");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "strategy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winner");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:sales_2010_2.transactions.webservices.netsuite.com", "winner"));
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
