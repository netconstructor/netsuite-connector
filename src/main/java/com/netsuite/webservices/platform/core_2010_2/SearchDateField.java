
package com.netsuite.webservices.platform.core_2010_2;

import com.netsuite.webservices.platform.core_2010_2.types.SearchDate;
import com.netsuite.webservices.platform.core_2010_2.types.SearchDateFieldOperator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SearchDateField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SearchDateField">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedSearchValue" type="{urn:types.core_2010_2.platform.webservices.netsuite.com}SearchDate" minOccurs="0"/>
 *         &lt;element name="searchValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="searchValue2" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="operator" type="{urn:types.core_2010_2.platform.webservices.netsuite.com}SearchDateFieldOperator" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchDateField", propOrder = {
    "predefinedSearchValue",
    "searchValue",
    "searchValue2"
})
public class SearchDateField {

    protected SearchDate predefinedSearchValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchValue;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar searchValue2;
    @XmlAttribute(name = "operator")
    protected SearchDateFieldOperator operator;

    /**
     * Gets the value of the predefinedSearchValue property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDate }
     *     
     */
    public SearchDate getPredefinedSearchValue() {
        return predefinedSearchValue;
    }

    /**
     * Sets the value of the predefinedSearchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDate }
     *     
     */
    public void setPredefinedSearchValue(SearchDate value) {
        this.predefinedSearchValue = value;
    }

    /**
     * Gets the value of the searchValue property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchValue() {
        return searchValue;
    }

    /**
     * Sets the value of the searchValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchValue(XMLGregorianCalendar value) {
        this.searchValue = value;
    }

    /**
     * Gets the value of the searchValue2 property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSearchValue2() {
        return searchValue2;
    }

    /**
     * Sets the value of the searchValue2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSearchValue2(XMLGregorianCalendar value) {
        this.searchValue2 = value;
    }

    /**
     * Gets the value of the operator property.
     * 
     * @return
     *     possible object is
     *     {@link SearchDateFieldOperator }
     *     
     */
    public SearchDateFieldOperator getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchDateFieldOperator }
     *     
     */
    public void setOperator(SearchDateFieldOperator value) {
        this.operator = value;
    }

}
