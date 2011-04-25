/**
 * NetSuiteService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.mule.module.netsuite.api.internal;

public interface NetSuiteService extends javax.xml.rpc.Service {
    public java.lang.String getNetSuitePortAddress();

    public org.mule.module.netsuite.api.internal.NetSuitePortType getNetSuitePort() throws javax.xml.rpc.ServiceException;

    public org.mule.module.netsuite.api.internal.NetSuitePortType getNetSuitePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
