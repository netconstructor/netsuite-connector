/**
 * SolutionSearchRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class SolutionSearchRow  extends org.mule.module.netsuite.api.internal.SearchRow  implements java.io.Serializable {
    private org.mule.module.netsuite.api.internal.SolutionSearchRowBasic basic;

    private org.mule.module.netsuite.api.internal.SupportCaseSearchRowBasic caseJoin;

    private org.mule.module.netsuite.api.internal.SolutionSearchRowBasic relatedSolutionJoin;

    private org.mule.module.netsuite.api.internal.TopicSearchRowBasic topicJoin;

    private org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin;

    private org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin;

    public SolutionSearchRow() {
    }

    public SolutionSearchRow(
           org.mule.module.netsuite.api.internal.SolutionSearchRowBasic basic,
           org.mule.module.netsuite.api.internal.SupportCaseSearchRowBasic caseJoin,
           org.mule.module.netsuite.api.internal.SolutionSearchRowBasic relatedSolutionJoin,
           org.mule.module.netsuite.api.internal.TopicSearchRowBasic topicJoin,
           org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin,
           org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.basic = basic;
        this.caseJoin = caseJoin;
        this.relatedSolutionJoin = relatedSolutionJoin;
        this.topicJoin = topicJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
    }


    /**
     * Gets the basic value for this SolutionSearchRow.
     * 
     * @return basic
     */
    public org.mule.module.netsuite.api.internal.SolutionSearchRowBasic getBasic() {
        return basic;
    }


    /**
     * Sets the basic value for this SolutionSearchRow.
     * 
     * @param basic
     */
    public void setBasic(org.mule.module.netsuite.api.internal.SolutionSearchRowBasic basic) {
        this.basic = basic;
    }


    /**
     * Gets the caseJoin value for this SolutionSearchRow.
     * 
     * @return caseJoin
     */
    public org.mule.module.netsuite.api.internal.SupportCaseSearchRowBasic getCaseJoin() {
        return caseJoin;
    }


    /**
     * Sets the caseJoin value for this SolutionSearchRow.
     * 
     * @param caseJoin
     */
    public void setCaseJoin(org.mule.module.netsuite.api.internal.SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }


    /**
     * Gets the relatedSolutionJoin value for this SolutionSearchRow.
     * 
     * @return relatedSolutionJoin
     */
    public org.mule.module.netsuite.api.internal.SolutionSearchRowBasic getRelatedSolutionJoin() {
        return relatedSolutionJoin;
    }


    /**
     * Sets the relatedSolutionJoin value for this SolutionSearchRow.
     * 
     * @param relatedSolutionJoin
     */
    public void setRelatedSolutionJoin(org.mule.module.netsuite.api.internal.SolutionSearchRowBasic relatedSolutionJoin) {
        this.relatedSolutionJoin = relatedSolutionJoin;
    }


    /**
     * Gets the topicJoin value for this SolutionSearchRow.
     * 
     * @return topicJoin
     */
    public org.mule.module.netsuite.api.internal.TopicSearchRowBasic getTopicJoin() {
        return topicJoin;
    }


    /**
     * Sets the topicJoin value for this SolutionSearchRow.
     * 
     * @param topicJoin
     */
    public void setTopicJoin(org.mule.module.netsuite.api.internal.TopicSearchRowBasic topicJoin) {
        this.topicJoin = topicJoin;
    }


    /**
     * Gets the userJoin value for this SolutionSearchRow.
     * 
     * @return userJoin
     */
    public org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }


    /**
     * Sets the userJoin value for this SolutionSearchRow.
     * 
     * @param userJoin
     */
    public void setUserJoin(org.mule.module.netsuite.api.internal.EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }


    /**
     * Gets the userNotesJoin value for this SolutionSearchRow.
     * 
     * @return userNotesJoin
     */
    public org.mule.module.netsuite.api.internal.NoteSearchRowBasic getUserNotesJoin() {
        return userNotesJoin;
    }


    /**
     * Sets the userNotesJoin value for this SolutionSearchRow.
     * 
     * @param userNotesJoin
     */
    public void setUserNotesJoin(org.mule.module.netsuite.api.internal.NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SolutionSearchRow)) return false;
        SolutionSearchRow other = (SolutionSearchRow) obj;
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
            ((this.caseJoin==null && other.getCaseJoin()==null) || 
             (this.caseJoin!=null &&
              this.caseJoin.equals(other.getCaseJoin()))) &&
            ((this.relatedSolutionJoin==null && other.getRelatedSolutionJoin()==null) || 
             (this.relatedSolutionJoin!=null &&
              this.relatedSolutionJoin.equals(other.getRelatedSolutionJoin()))) &&
            ((this.topicJoin==null && other.getTopicJoin()==null) || 
             (this.topicJoin!=null &&
              this.topicJoin.equals(other.getTopicJoin()))) &&
            ((this.userJoin==null && other.getUserJoin()==null) || 
             (this.userJoin!=null &&
              this.userJoin.equals(other.getUserJoin()))) &&
            ((this.userNotesJoin==null && other.getUserNotesJoin()==null) || 
             (this.userNotesJoin!=null &&
              this.userNotesJoin.equals(other.getUserNotesJoin())));
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
        if (getCaseJoin() != null) {
            _hashCode += getCaseJoin().hashCode();
        }
        if (getRelatedSolutionJoin() != null) {
            _hashCode += getRelatedSolutionJoin().hashCode();
        }
        if (getTopicJoin() != null) {
            _hashCode += getTopicJoin().hashCode();
        }
        if (getUserJoin() != null) {
            _hashCode += getUserJoin().hashCode();
        }
        if (getUserNotesJoin() != null) {
            _hashCode += getUserNotesJoin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SolutionSearchRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "SolutionSearchRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SolutionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relatedSolutionJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "relatedSolutionJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "SolutionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topicJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "topicJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "TopicSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new javax.xml.namespace.QName("urn:support_2010_2.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:common_2010_2.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
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
