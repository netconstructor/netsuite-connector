
package com.netsuite.webservices.lists.accounting_2010_2;

import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.LocationSearchRowBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRow;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}LocationSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="userJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EmployeeSearchRowBasic" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationSearchRow", propOrder = {
    "basic",
    "userJoin"
})
public class LocationSearchRow
    extends SearchRow
{

    protected LocationSearchRowBasic basic;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public LocationSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationSearchRowBasic }
     *     
     */
    public void setBasic(LocationSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the userJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public EmployeeSearchRowBasic getUserJoin() {
        return userJoin;
    }

    /**
     * Sets the value of the userJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSearchRowBasic }
     *     
     */
    public void setUserJoin(EmployeeSearchRowBasic value) {
        this.userJoin = value;
    }

}
