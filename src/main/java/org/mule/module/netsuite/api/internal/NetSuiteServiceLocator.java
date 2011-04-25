/**
 * NetSuiteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public class NetSuiteServiceLocator extends org.apache.axis.client.Service implements org.mule.module.netsuite.api.internal.NetSuiteService {

    public NetSuiteServiceLocator() {
    }


    public NetSuiteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetSuiteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetSuitePort
    private java.lang.String NetSuitePort_address = "https://webservices.netsuite.com/services/NetSuitePort_2010_2";

    public java.lang.String getNetSuitePortAddress() {
        return NetSuitePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetSuitePortWSDDServiceName = "NetSuitePort";

    public java.lang.String getNetSuitePortWSDDServiceName() {
        return NetSuitePortWSDDServiceName;
    }

    public void setNetSuitePortWSDDServiceName(java.lang.String name) {
        NetSuitePortWSDDServiceName = name;
    }

    public org.mule.module.netsuite.api.internal.NetSuitePortType getNetSuitePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetSuitePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetSuitePort(endpoint);
    }

    public org.mule.module.netsuite.api.internal.NetSuitePortType getNetSuitePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.mule.module.netsuite.api.internal.NetSuiteBindingStub _stub = new org.mule.module.netsuite.api.internal.NetSuiteBindingStub(portAddress, this);
            _stub.setPortName(getNetSuitePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetSuitePortEndpointAddress(java.lang.String address) {
        NetSuitePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.mule.module.netsuite.api.internal.NetSuitePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.mule.module.netsuite.api.internal.NetSuiteBindingStub _stub = new org.mule.module.netsuite.api.internal.NetSuiteBindingStub(new java.net.URL(NetSuitePort_address), this);
                _stub.setPortName(getNetSuitePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NetSuitePort".equals(inputPortName)) {
            return getNetSuitePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:platform_2010_2.webservices.netsuite.com", "NetSuiteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:platform_2010_2.webservices.netsuite.com", "NetSuitePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NetSuitePort".equals(portName)) {
            setNetSuitePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
