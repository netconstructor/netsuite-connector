
package com.netsuite.webservices.lists.relationships_2010_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.netsuite.webservices.platform.common_2010_2.EmployeeSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.EntityGroupSearchRowBasic;
import com.netsuite.webservices.platform.common_2010_2.EntitySearchRowBasic;
import com.netsuite.webservices.platform.core_2010_2.SearchRow;


/**
 * <p>Java class for EntityGroupSearchRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityGroupSearchRow">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:core_2010_2.platform.webservices.netsuite.com}SearchRow">
 *       &lt;sequence>
 *         &lt;element name="basic" type="{urn:common_2010_2.platform.webservices.netsuite.com}EntityGroupSearchRowBasic" minOccurs="0"/>
 *         &lt;element name="groupMemberJoin" type="{urn:common_2010_2.platform.webservices.netsuite.com}EntitySearchRowBasic" minOccurs="0"/>
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
@XmlType(name = "EntityGroupSearchRow", propOrder = {
    "basic",
    "groupMemberJoin",
    "userJoin"
})
public class EntityGroupSearchRow
    extends SearchRow
{

    protected EntityGroupSearchRowBasic basic;
    protected EntitySearchRowBasic groupMemberJoin;
    protected EmployeeSearchRowBasic userJoin;

    /**
     * Gets the value of the basic property.
     * 
     * @return
     *     possible object is
     *     {@link EntityGroupSearchRowBasic }
     *     
     */
    public EntityGroupSearchRowBasic getBasic() {
        return basic;
    }

    /**
     * Sets the value of the basic property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityGroupSearchRowBasic }
     *     
     */
    public void setBasic(EntityGroupSearchRowBasic value) {
        this.basic = value;
    }

    /**
     * Gets the value of the groupMemberJoin property.
     * 
     * @return
     *     possible object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public EntitySearchRowBasic getGroupMemberJoin() {
        return groupMemberJoin;
    }

    /**
     * Sets the value of the groupMemberJoin property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitySearchRowBasic }
     *     
     */
    public void setGroupMemberJoin(EntitySearchRowBasic value) {
        this.groupMemberJoin = value;
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
