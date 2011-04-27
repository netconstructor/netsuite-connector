
package com.netsuite.webservices.lists.employees_2010_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.netsuite.webservices.lists.employees_2010_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EmployeeSearch_QNAME = new QName("urn:employees_2010_2.lists.webservices.netsuite.com", "employeeSearch");
    private final static QName _Employee_QNAME = new QName("urn:employees_2010_2.lists.webservices.netsuite.com", "Employee");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.netsuite.webservices.lists.employees_2010_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmployeeAddressbook }
     * 
     */
    public EmployeeAddressbook createEmployeeAddressbook() {
        return new EmployeeAddressbook();
    }

    /**
     * Create an instance of {@link EmployeeSearchAdvanced }
     * 
     */
    public EmployeeSearchAdvanced createEmployeeSearchAdvanced() {
        return new EmployeeSearchAdvanced();
    }

    /**
     * Create an instance of {@link EmployeeAddressbookList }
     * 
     */
    public EmployeeAddressbookList createEmployeeAddressbookList() {
        return new EmployeeAddressbookList();
    }

    /**
     * Create an instance of {@link EmployeeRoles }
     * 
     */
    public EmployeeRoles createEmployeeRoles() {
        return new EmployeeRoles();
    }

    /**
     * Create an instance of {@link EmployeeRolesList }
     * 
     */
    public EmployeeRolesList createEmployeeRolesList() {
        return new EmployeeRolesList();
    }

    /**
     * Create an instance of {@link EmployeeSubscriptions }
     * 
     */
    public EmployeeSubscriptions createEmployeeSubscriptions() {
        return new EmployeeSubscriptions();
    }

    /**
     * Create an instance of {@link EmployeeHrEducationList }
     * 
     */
    public EmployeeHrEducationList createEmployeeHrEducationList() {
        return new EmployeeHrEducationList();
    }

    /**
     * Create an instance of {@link EmployeeHrEducation }
     * 
     */
    public EmployeeHrEducation createEmployeeHrEducation() {
        return new EmployeeHrEducation();
    }

    /**
     * Create an instance of {@link EmployeeSearchRow }
     * 
     */
    public EmployeeSearchRow createEmployeeSearchRow() {
        return new EmployeeSearchRow();
    }

    /**
     * Create an instance of {@link Employee }
     * 
     */
    public Employee createEmployee() {
        return new Employee();
    }

    /**
     * Create an instance of {@link EmployeeSubscriptionsList }
     * 
     */
    public EmployeeSubscriptionsList createEmployeeSubscriptionsList() {
        return new EmployeeSubscriptionsList();
    }

    /**
     * Create an instance of {@link EmployeeEmergencyContact }
     * 
     */
    public EmployeeEmergencyContact createEmployeeEmergencyContact() {
        return new EmployeeEmergencyContact();
    }

    /**
     * Create an instance of {@link EmployeeSearch }
     * 
     */
    public EmployeeSearch createEmployeeSearch() {
        return new EmployeeSearch();
    }

    /**
     * Create an instance of {@link EmployeeEmergencyContactList }
     * 
     */
    public EmployeeEmergencyContactList createEmployeeEmergencyContactList() {
        return new EmployeeEmergencyContactList();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeSearch }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2010_2.lists.webservices.netsuite.com", name = "employeeSearch")
    public JAXBElement<EmployeeSearch> createEmployeeSearch(EmployeeSearch value) {
        return new JAXBElement<EmployeeSearch>(_EmployeeSearch_QNAME, EmployeeSearch.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Employee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:employees_2010_2.lists.webservices.netsuite.com", name = "Employee")
    public JAXBElement<Employee> createEmployee(Employee value) {
        return new JAXBElement<Employee>(_Employee_QNAME, Employee.class, null, value);
    }

}
